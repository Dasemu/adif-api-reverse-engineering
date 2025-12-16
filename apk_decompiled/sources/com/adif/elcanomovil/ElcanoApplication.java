package com.adif.elcanomovil;

import I0.h;
import I0.i;
import android.content.Context;
import androidx.lifecycle.C0181c0;
import androidx.lifecycle.I;
import com.adif.elcanomovil.lifecycle.AppStatus;
import com.adif.elcanomovil.lifecycle.DefaultLifecycleProvider;
import com.adif.elcanomovil.lifecycle.StatusApp;
import com.adif.elcanomovil.observers.ApplicationObserver;
import dagger.hilt.android.HiltAndroidApp;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u000f\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\u0005J\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0011\u001a\u00020\u00108\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0018\u001a\u00020\u00178\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR(\u0010\u000e\u001a\u0004\u0018\u00010\f2\b\u0010\u001e\u001a\u0004\u0018\u00010\f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lcom/adif/elcanomovil/ElcanoApplication;", "Landroid/app/Application;", "Lcom/adif/elcanomovil/lifecycle/StatusApp;", "LI0/i;", "<init>", "()V", "", "startTasks", "onCreate", "LI0/h;", "newImageLoader", "()LI0/h;", "Lcom/adif/elcanomovil/lifecycle/AppStatus;", "status", "statusApp", "(Lcom/adif/elcanomovil/lifecycle/AppStatus;)V", "Lcom/adif/elcanomovil/observers/ApplicationObserver;", "applicationObserver", "Lcom/adif/elcanomovil/observers/ApplicationObserver;", "getApplicationObserver", "()Lcom/adif/elcanomovil/observers/ApplicationObserver;", "setApplicationObserver", "(Lcom/adif/elcanomovil/observers/ApplicationObserver;)V", "Landroidx/lifecycle/I;", "myLifecycleProvider", "Landroidx/lifecycle/I;", "getMyLifecycleProvider", "()Landroidx/lifecycle/I;", "setMyLifecycleProvider", "(Landroidx/lifecycle/I;)V", "<set-?>", "Lcom/adif/elcanomovil/lifecycle/AppStatus;", "getStatusApp", "()Lcom/adif/elcanomovil/lifecycle/AppStatus;", "app_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@HiltAndroidApp
/* loaded from: classes.dex */
public final class ElcanoApplication extends Hilt_ElcanoApplication implements StatusApp, i {

    @Inject
    public ApplicationObserver applicationObserver;

    @Inject
    public I myLifecycleProvider;
    private AppStatus statusApp;

    private final void startTasks() {
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new e(this, null), 2, null);
    }

    public final ApplicationObserver getApplicationObserver() {
        ApplicationObserver applicationObserver = this.applicationObserver;
        if (applicationObserver != null) {
            return applicationObserver;
        }
        Intrinsics.throwUninitializedPropertyAccessException("applicationObserver");
        return null;
    }

    public final I getMyLifecycleProvider() {
        I i = this.myLifecycleProvider;
        if (i != null) {
            return i;
        }
        Intrinsics.throwUninitializedPropertyAccessException("myLifecycleProvider");
        return null;
    }

    public final AppStatus getStatusApp() {
        return this.statusApp;
    }

    @Override // I0.i
    public h newImageLoader() {
        Context applicationContext = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        return CoilSetupKt.newImageLoader(applicationContext);
    }

    @Override // com.adif.elcanomovil.Hilt_ElcanoApplication, android.app.Application
    public void onCreate() {
        super.onCreate();
        startTasks();
        C0181c0 c0181c0 = C0181c0.h;
        C0181c0.h.f3342f.a(getMyLifecycleProvider());
        DefaultLifecycleProvider.INSTANCE.setListener$app_proNon_corporateRelease(this);
    }

    public final void setApplicationObserver(ApplicationObserver applicationObserver) {
        Intrinsics.checkNotNullParameter(applicationObserver, "<set-?>");
        this.applicationObserver = applicationObserver;
    }

    public final void setMyLifecycleProvider(I i) {
        Intrinsics.checkNotNullParameter(i, "<set-?>");
        this.myLifecycleProvider = i;
    }

    @Override // com.adif.elcanomovil.lifecycle.StatusApp
    public void statusApp(AppStatus status) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.statusApp = status;
    }
}
