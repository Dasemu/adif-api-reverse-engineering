package b;

import C.AbstractC0038b;
import C.InterfaceC0042f;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import d.AbstractC0300i;
import d.C0302k;
import e.AbstractC0311a;
import java.util.Arrays;
import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class m extends AbstractC0300i {
    public final /* synthetic */ o h;

    public m(o oVar) {
        this.h = oVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // d.AbstractC0300i
    public final void b(int i, AbstractC0311a contract, Object obj) {
        Bundle bundle;
        int i4;
        Intrinsics.checkNotNullParameter(contract, "contract");
        o oVar = this.h;
        A.a b4 = contract.b(oVar, obj);
        if (b4 != null) {
            new Handler(Looper.getMainLooper()).post(new l(this, i, 0, b4));
            return;
        }
        Intent a2 = contract.a(oVar, obj);
        if (a2.getExtras() != null) {
            Bundle extras = a2.getExtras();
            Intrinsics.checkNotNull(extras);
            if (extras.getClassLoader() == null) {
                a2.setExtrasClassLoader(oVar.getClassLoader());
            }
        }
        if (a2.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundle = a2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            a2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        } else {
            bundle = null;
        }
        Bundle bundle2 = bundle;
        if (Intrinsics.areEqual("androidx.activity.result.contract.action.REQUEST_PERMISSIONS", a2.getAction())) {
            String[] stringArrayExtra = a2.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            HashSet hashSet = new HashSet();
            for (int i5 = 0; i5 < stringArrayExtra.length; i5++) {
                if (TextUtils.isEmpty(stringArrayExtra[i5])) {
                    throw new IllegalArgumentException(C.w.r(new StringBuilder("Permission request for permissions "), Arrays.toString(stringArrayExtra), " must not contain null or empty values"));
                }
                if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(stringArrayExtra[i5], "android.permission.POST_NOTIFICATIONS")) {
                    hashSet.add(Integer.valueOf(i5));
                }
            }
            int size = hashSet.size();
            String[] strArr = size > 0 ? new String[stringArrayExtra.length - size] : stringArrayExtra;
            if (size > 0) {
                if (size == stringArrayExtra.length) {
                    return;
                }
                int i6 = 0;
                for (int i7 = 0; i7 < stringArrayExtra.length; i7++) {
                    if (!hashSet.contains(Integer.valueOf(i7))) {
                        strArr[i6] = stringArrayExtra[i7];
                        i6++;
                    }
                }
            }
            if (oVar instanceof InterfaceC0042f) {
                ((InterfaceC0042f) oVar).validateRequestPermissionsRequestCode(i);
            }
            AbstractC0038b.b(oVar, stringArrayExtra, i);
            return;
        }
        if (!Intrinsics.areEqual("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST", a2.getAction())) {
            oVar.startActivityForResult(a2, i, bundle2);
            return;
        }
        C0302k c0302k = (C0302k) a2.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
        try {
            Intrinsics.checkNotNull(c0302k);
            i4 = i;
            try {
                oVar.startIntentSenderForResult(c0302k.f6111a, i4, c0302k.f6112b, c0302k.f6113c, c0302k.f6114d, 0, bundle2);
            } catch (IntentSender.SendIntentException e4) {
                e = e4;
                new Handler(Looper.getMainLooper()).post(new l(this, i4, 1, e));
            }
        } catch (IntentSender.SendIntentException e5) {
            e = e5;
            i4 = i;
        }
    }
}
