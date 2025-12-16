package com.google.android.gms.common;

import C.o;
import C.u;
import C.w;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import android.widget.ProgressBar;
import androidx.fragment.app.K;
import androidx.fragment.app.P;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.api.internal.LifecycleFragment;
import com.google.android.gms.common.api.internal.zabw;
import com.google.android.gms.common.api.internal.zabx;
import com.google.android.gms.common.api.internal.zacc;
import com.google.android.gms.common.internal.HideFirstParty;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.zag;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.InstantApps;
import com.google.android.gms.internal.base.zad;
import com.google.android.gms.internal.base.zae;
import com.google.android.gms.internal.base.zao;
import com.google.android.gms.internal.base.zap;
import com.google.android.gms.measurement.internal.a;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.errorprone.annotations.RestrictedInheritance;
import java.util.ArrayList;
import java.util.Arrays;

@RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms.*", allowlistAnnotations = {zad.class, zae.class}, explanation = "Sub classing of GMS Core's APIs are restricted to GMS Core client libs and testing fakes.", link = "go/gmscore-restrictedinheritance")
/* loaded from: classes3.dex */
public class GoogleApiAvailability extends GoogleApiAvailabilityLight {
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
    private String zac;
    private static final Object zaa = new Object();
    private static final GoogleApiAvailability zab = new GoogleApiAvailability();
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;

    public static GoogleApiAvailability getInstance() {
        return zab;
    }

    public static final Task zai(HasApiKey hasApiKey, HasApiKey... hasApiKeyArr) {
        Preconditions.checkNotNull(hasApiKey, "Requested API must not be null.");
        for (HasApiKey hasApiKey2 : hasApiKeyArr) {
            Preconditions.checkNotNull(hasApiKey2, "Requested API must not be null.");
        }
        ArrayList arrayList = new ArrayList(hasApiKeyArr.length + 1);
        arrayList.add(hasApiKey);
        arrayList.addAll(Arrays.asList(hasApiKeyArr));
        return GoogleApiManager.zal().zao(arrayList);
    }

    public Task<Void> checkApiAvailability(GoogleApi<?> googleApi, GoogleApi<?>... googleApiArr) {
        return zai(googleApi, googleApiArr).onSuccessTask(new SuccessContinuation() { // from class: com.google.android.gms.common.zab
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                int i = GoogleApiAvailability.GOOGLE_PLAY_SERVICES_VERSION_CODE;
                return Tasks.forResult(null);
            }
        });
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    @ShowFirstParty
    @KeepForSdk
    public int getClientVersion(Context context) {
        return super.getClientVersion(context);
    }

    public Dialog getErrorDialog(Activity activity, int i, int i4) {
        return getErrorDialog(activity, i, i4, (DialogInterface.OnCancelListener) null);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    @ShowFirstParty
    @KeepForSdk
    public Intent getErrorResolutionIntent(Context context, int i, String str) {
        return super.getErrorResolutionIntent(context, i, str);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    public PendingIntent getErrorResolutionPendingIntent(Context context, int i, int i4) {
        return super.getErrorResolutionPendingIntent(context, i, i4);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    public final String getErrorString(int i) {
        return super.getErrorString(i);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    @HideFirstParty
    public int isGooglePlayServicesAvailable(Context context) {
        return super.isGooglePlayServicesAvailable(context);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    public final boolean isUserResolvableError(int i) {
        return super.isUserResolvableError(i);
    }

    public Task<Void> makeGooglePlayServicesAvailable(Activity activity) {
        int i = GOOGLE_PLAY_SERVICES_VERSION_CODE;
        Preconditions.checkMainThread("makeGooglePlayServicesAvailable must be called from the main thread");
        int isGooglePlayServicesAvailable = isGooglePlayServicesAvailable(activity, i);
        if (isGooglePlayServicesAvailable == 0) {
            return Tasks.forResult(null);
        }
        zacc zaa2 = zacc.zaa(activity);
        zaa2.zah(new ConnectionResult(isGooglePlayServicesAvailable, null), 0);
        return zaa2.zad();
    }

    @TargetApi(26)
    public void setDefaultNotificationChannelId(Context context, String str) {
        if (PlatformVersion.isAtLeastO()) {
            Preconditions.checkNotNull(((NotificationManager) Preconditions.checkNotNull(context.getSystemService("notification"))).getNotificationChannel(str));
        }
        synchronized (zaa) {
            this.zac = str;
        }
    }

    public boolean showErrorDialogFragment(Activity activity, int i, int i4) {
        return showErrorDialogFragment(activity, i, i4, null);
    }

    public void showErrorNotification(Context context, int i) {
        zae(context, i, null, getErrorResolutionPendingIntent(context, i, 0, "n"));
    }

    public final Dialog zaa(Context context, int i, zag zagVar, DialogInterface.OnCancelListener onCancelListener) {
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(android.R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(context, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(com.google.android.gms.common.internal.zac.zad(context, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String zac = com.google.android.gms.common.internal.zac.zac(context, i);
        if (zac != null) {
            builder.setPositiveButton(zac, zagVar);
        }
        String zag = com.google.android.gms.common.internal.zac.zag(context, i);
        if (zag != null) {
            builder.setTitle(zag);
        }
        Log.w("GoogleApiAvailability", a.l(i, "Creating dialog for Google Play services availability issue. ConnectionResult="), new IllegalArgumentException());
        return builder.create();
    }

    public final Dialog zab(Activity activity, DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, null, android.R.attr.progressBarStyleLarge);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(com.google.android.gms.common.internal.zac.zad(activity, 18));
        builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
        AlertDialog create = builder.create();
        zad(activity, create, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return create;
    }

    public final zabx zac(Context context, zabw zabwVar) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        zabx zabxVar = new zabx(zabwVar);
        zao.zaa(context, zabxVar, intentFilter);
        zabxVar.zaa(context);
        if (isUninstalledAppPossiblyUpdating(context, "com.google.android.gms")) {
            return zabxVar;
        }
        zabwVar.zaa();
        zabxVar.zab();
        return null;
    }

    public final void zad(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof P) {
                SupportErrorDialogFragment.newInstance(dialog, onCancelListener).show(((P) activity).getSupportFragmentManager(), str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        ErrorDialogFragment.newInstance(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6, types: [C.s, java.lang.Object, C.v] */
    @TargetApi(20)
    public final void zae(Context context, int i, String str, PendingIntent pendingIntent) {
        int i4;
        String str2;
        Log.w("GoogleApiAvailability", w.i(i, "GMS core API Availability. ConnectionResult=", ", tag=null"), new IllegalArgumentException());
        if (i == 18) {
            zaf(context);
            return;
        }
        if (pendingIntent == null) {
            if (i == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String zaf = com.google.android.gms.common.internal.zac.zaf(context, i);
        String zae = com.google.android.gms.common.internal.zac.zae(context, i);
        Resources resources = context.getResources();
        NotificationManager notificationManager = (NotificationManager) Preconditions.checkNotNull(context.getSystemService("notification"));
        u uVar = new u(context, null);
        uVar.f260o = true;
        uVar.c(true);
        uVar.f252e = u.b(zaf);
        ?? obj = new Object();
        obj.f247b = u.b(zae);
        uVar.e(obj);
        if (DeviceProperties.isWearable(context)) {
            Preconditions.checkState(PlatformVersion.isAtLeastKitKatWatch());
            uVar.f265u.icon = context.getApplicationInfo().icon;
            uVar.f255j = 2;
            if (DeviceProperties.isWearableWithoutPlayStore(context)) {
                uVar.f249b.add(new o(com.google.android.gms.base.R.drawable.common_full_open_on_phone, resources.getString(com.google.android.gms.base.R.string.common_open_on_phone), pendingIntent));
            } else {
                uVar.f254g = pendingIntent;
            }
        } else {
            uVar.f265u.icon = android.R.drawable.stat_sys_warning;
            String string = resources.getString(com.google.android.gms.base.R.string.common_google_play_services_notification_ticker);
            uVar.f265u.tickerText = u.b(string);
            uVar.f265u.when = System.currentTimeMillis();
            uVar.f254g = pendingIntent;
            uVar.f253f = u.b(zae);
        }
        if (PlatformVersion.isAtLeastO()) {
            Preconditions.checkState(PlatformVersion.isAtLeastO());
            synchronized (zaa) {
                str2 = this.zac;
            }
            if (str2 == null) {
                str2 = "com.google.android.gms.availability";
                NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                String zab2 = com.google.android.gms.common.internal.zac.zab(context);
                if (notificationChannel == null) {
                    notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", zab2, 4));
                } else if (!zab2.contentEquals(notificationChannel.getName())) {
                    notificationChannel.setName(zab2);
                    notificationManager.createNotificationChannel(notificationChannel);
                }
            }
            uVar.f263s = str2;
        }
        Notification a2 = uVar.a();
        if (i == 1 || i == 2 || i == 3) {
            GooglePlayServicesUtilLight.sCanceledAvailabilityNotification.set(false);
            i4 = 10436;
        } else {
            i4 = 39789;
        }
        notificationManager.notify(i4, a2);
    }

    public final void zaf(Context context) {
        new zac(this, context).sendEmptyMessageDelayed(1, 120000L);
    }

    public final boolean zag(Activity activity, LifecycleFragment lifecycleFragment, int i, int i4, DialogInterface.OnCancelListener onCancelListener) {
        Dialog zaa2 = zaa(activity, i, zag.zad(lifecycleFragment, getErrorResolutionIntent(activity, i, "d"), 2), onCancelListener);
        if (zaa2 == null) {
            return false;
        }
        zad(activity, zaa2, GooglePlayServicesUtil.GMS_ERROR_DIALOG, onCancelListener);
        return true;
    }

    public final boolean zah(Context context, ConnectionResult connectionResult, int i) {
        PendingIntent errorResolutionPendingIntent;
        if (InstantApps.isInstantApp(context) || (errorResolutionPendingIntent = getErrorResolutionPendingIntent(context, connectionResult)) == null) {
            return false;
        }
        zae(context, connectionResult.getErrorCode(), null, PendingIntent.getActivity(context, 0, GoogleApiActivity.zaa(context, errorResolutionPendingIntent, i, true), zap.zaa | 134217728));
        return true;
    }

    public Dialog getErrorDialog(Activity activity, int i, int i4, DialogInterface.OnCancelListener onCancelListener) {
        return zaa(activity, i, zag.zab(activity, getErrorResolutionIntent(activity, i, "d"), i4), onCancelListener);
    }

    public PendingIntent getErrorResolutionPendingIntent(Context context, ConnectionResult connectionResult) {
        if (connectionResult.hasResolution()) {
            return connectionResult.getResolution();
        }
        return getErrorResolutionPendingIntent(context, connectionResult.getErrorCode(), 0);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    @ShowFirstParty
    @KeepForSdk
    public int isGooglePlayServicesAvailable(Context context, int i) {
        return super.isGooglePlayServicesAvailable(context, i);
    }

    public boolean showErrorDialogFragment(Activity activity, int i, int i4, DialogInterface.OnCancelListener onCancelListener) {
        Dialog errorDialog = getErrorDialog(activity, i, i4, onCancelListener);
        if (errorDialog == null) {
            return false;
        }
        zad(activity, errorDialog, GooglePlayServicesUtil.GMS_ERROR_DIALOG, onCancelListener);
        return true;
    }

    public Task<Void> checkApiAvailability(HasApiKey<?> hasApiKey, HasApiKey<?>... hasApiKeyArr) {
        return zai(hasApiKey, hasApiKeyArr).onSuccessTask(new SuccessContinuation() { // from class: com.google.android.gms.common.zaa
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                int i = GoogleApiAvailability.GOOGLE_PLAY_SERVICES_VERSION_CODE;
                return Tasks.forResult(null);
            }
        });
    }

    public void showErrorNotification(Context context, ConnectionResult connectionResult) {
        zae(context, connectionResult.getErrorCode(), null, getErrorResolutionPendingIntent(context, connectionResult));
    }

    public Dialog getErrorDialog(K k4, int i, int i4) {
        return getErrorDialog(k4, i, i4, (DialogInterface.OnCancelListener) null);
    }

    public Dialog getErrorDialog(K k4, int i, int i4, DialogInterface.OnCancelListener onCancelListener) {
        return zaa(k4.requireContext(), i, zag.zac(k4, getErrorResolutionIntent(k4.requireContext(), i, "d"), i4), onCancelListener);
    }
}
