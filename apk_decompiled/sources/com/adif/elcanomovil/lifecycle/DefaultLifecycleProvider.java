package com.adif.elcanomovil.lifecycle;

import android.annotation.SuppressLint;
import androidx.lifecycle.A;
import androidx.lifecycle.I;
import androidx.lifecycle.Z;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\u0003J\u000f\u0010\b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\u0003R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/adif/elcanomovil/lifecycle/DefaultLifecycleProvider;", "Landroidx/lifecycle/I;", "<init>", "()V", "", "onStartCalled", "onStopCalled", "onResumeCalled", "onPauseCalled", "", "TAG", "Ljava/lang/String;", "Companion", "app_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DefaultLifecycleProvider implements I {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static StatusApp listener;
    private final String TAG = "TAG.DefaultLifecycleProvider";

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/adif/elcanomovil/lifecycle/DefaultLifecycleProvider$Companion;", "", "()V", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/adif/elcanomovil/lifecycle/StatusApp;", "getListener$app_proNon_corporateRelease", "()Lcom/adif/elcanomovil/lifecycle/StatusApp;", "setListener$app_proNon_corporateRelease", "(Lcom/adif/elcanomovil/lifecycle/StatusApp;)V", "app_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final StatusApp getListener$app_proNon_corporateRelease() {
            return DefaultLifecycleProvider.listener;
        }

        public final void setListener$app_proNon_corporateRelease(StatusApp statusApp) {
            DefaultLifecycleProvider.listener = statusApp;
        }

        private Companion() {
        }
    }

    @Z(A.ON_PAUSE)
    @SuppressLint({"LongLogTag"})
    public final void onPauseCalled() {
    }

    @Z(A.ON_RESUME)
    @SuppressLint({"LongLogTag"})
    public final void onResumeCalled() {
    }

    @Z(A.ON_START)
    @SuppressLint({"LongLogTag"})
    public final void onStartCalled() {
        StatusApp statusApp = listener;
        if (statusApp != null) {
            statusApp.statusApp(AppStatus.ON_START);
        }
    }

    @Z(A.ON_STOP)
    @SuppressLint({"LongLogTag"})
    public final void onStopCalled() {
        StatusApp statusApp = listener;
        if (statusApp != null) {
            statusApp.statusApp(AppStatus.ON_STOP);
        }
    }
}
