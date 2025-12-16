package com.adif.elcanomovil.splash;

import androidx.lifecycle.q0;
import androidx.lifecycle.w0;
import b1.InterfaceC0266a;
import b1.f;
import com.adif.elcanomovil.commonNavGraph.navigation.Navigation;
import com.adif.elcanomovil.splash.SplashFragmentDirections;
import com.adif.elcanomovil.uiAvisa.components.authenticator.AuthenticationProvider;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

@HiltViewModel
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/adif/elcanomovil/splash/SplashViewModel;", "Landroidx/lifecycle/w0;", "Lcom/adif/elcanomovil/uiAvisa/components/authenticator/AuthenticationProvider;", "authProvider", "<init>", "(Lcom/adif/elcanomovil/uiAvisa/components/authenticator/AuthenticationProvider;)V", "", "logicToken", "()V", "navigate", "fihishAnimation", "Lcom/adif/elcanomovil/uiAvisa/components/authenticator/AuthenticationProvider;", "Lb1/f;", "Lcom/adif/elcanomovil/commonNavGraph/navigation/Navigation;", "navigationFlow", "Lb1/f;", "Lb1/a;", "navigation", "Lb1/a;", "getNavigation", "()Lb1/a;", "app_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SplashViewModel extends w0 {
    private final AuthenticationProvider authProvider;
    private final InterfaceC0266a navigation;
    private final f navigationFlow;

    @Inject
    public SplashViewModel(AuthenticationProvider authProvider) {
        Intrinsics.checkNotNullParameter(authProvider, "authProvider");
        this.authProvider = authProvider;
        f fVar = new f();
        this.navigationFlow = fVar;
        this.navigation = fVar;
    }

    public static final /* synthetic */ void access$navigate(SplashViewModel splashViewModel) {
        splashViewModel.navigate();
    }

    private final void logicToken() {
        BuildersKt__Builders_commonKt.launch$default(q0.j(this), null, null, new c(this, null), 3, null);
    }

    public final void navigate() {
        this.navigationFlow.b(new Navigation.Direction(SplashFragmentDirections.Companion.toBottomNav$default(SplashFragmentDirections.INSTANCE, null, 1, null), null, 2, null));
    }

    public final void fihishAnimation() {
        logicToken();
    }

    public final InterfaceC0266a getNavigation() {
        return this.navigation;
    }
}
