package com.google.android.gms.common.api;

import C.w;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.cloudmessaging.CloudMessagingReceiver;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;

@KeepName
/* loaded from: classes3.dex */
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {

    @VisibleForTesting
    protected int zaa = 0;

    public static Intent zaa(Context context, PendingIntent pendingIntent, int i, boolean z3) {
        Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
        intent.putExtra(CloudMessagingReceiver.IntentKeys.PENDING_INTENT, pendingIntent);
        intent.putExtra("failing_client_id", i);
        intent.putExtra("notify_manager", z3);
        return intent;
    }

    private final void zab() {
        GoogleApiActivity googleApiActivity;
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            Log.e("GoogleApiActivity", "Activity started without extras");
            finish();
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) extras.get(CloudMessagingReceiver.IntentKeys.PENDING_INTENT);
        Integer num = (Integer) extras.get("error_code");
        if (pendingIntent == null && num == null) {
            Log.e("GoogleApiActivity", "Activity started without resolution");
            finish();
            return;
        }
        if (pendingIntent == null) {
            GoogleApiAvailability.getInstance().showErrorDialogFragment(this, ((Integer) Preconditions.checkNotNull(num)).intValue(), 2, this);
            this.zaa = 1;
            return;
        }
        try {
            googleApiActivity = this;
            try {
                googleApiActivity.startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
                googleApiActivity.zaa = 1;
            } catch (ActivityNotFoundException e4) {
                e = e4;
                ActivityNotFoundException activityNotFoundException = e;
                if (extras.getBoolean("notify_manager", true)) {
                    GoogleApiManager.zam(googleApiActivity).zaz(new ConnectionResult(22, null), googleApiActivity.getIntent().getIntExtra("failing_client_id", -1));
                } else {
                    String o4 = w.o("Activity not found while launching ", pendingIntent.toString(), ".");
                    if (Build.FINGERPRINT.contains("generic")) {
                        o4 = o4.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                    }
                    Log.e("GoogleApiActivity", o4, activityNotFoundException);
                }
                googleApiActivity.zaa = 1;
                googleApiActivity.finish();
            } catch (IntentSender.SendIntentException e5) {
                e = e5;
                Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e);
                googleApiActivity.finish();
            }
        } catch (ActivityNotFoundException e6) {
            e = e6;
            googleApiActivity = this;
        } catch (IntentSender.SendIntentException e7) {
            e = e7;
            googleApiActivity = this;
        }
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i4, Intent intent) {
        super.onActivityResult(i, i4, intent);
        if (i == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.zaa = 0;
            setResult(i4, intent);
            if (booleanExtra) {
                GoogleApiManager zam = GoogleApiManager.zam(this);
                if (i4 == -1) {
                    zam.zaA();
                } else if (i4 == 0) {
                    zam.zaz(new ConnectionResult(13, null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i == 2) {
            this.zaa = 0;
            setResult(i4, intent);
        }
        finish();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.zaa = 0;
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.zaa = bundle.getInt("resolution");
        }
        if (this.zaa != 1) {
            zab();
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.zaa);
        super.onSaveInstanceState(bundle);
    }
}
