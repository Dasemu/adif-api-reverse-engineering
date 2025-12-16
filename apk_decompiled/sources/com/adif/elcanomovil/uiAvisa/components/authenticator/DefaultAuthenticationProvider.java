package com.adif.elcanomovil.uiAvisa.components.authenticator;

import C1.e;
import com.adif.elcanomovil.domain.usecases.avisa.user.LoginAvisaUserUseCase;
import com.adif.elcanomovil.domain.usecases.avisa.user.RefreshAvisaUserUseCase;
import com.adif.elcanomovil.domain.usecases.avisa.user.RegisterAvisaUserUseCase;
import com.adif.elcanomovil.serviceStorage.preferences.PreferenceStorage;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u001c\u0010\r\u001a\u00020\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0010j\u0002`\u0011H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/adif/elcanomovil/uiAvisa/components/authenticator/DefaultAuthenticationProvider;", "Lcom/adif/elcanomovil/uiAvisa/components/authenticator/AuthenticationProvider;", "registerAvisaUserUseCase", "Lcom/adif/elcanomovil/domain/usecases/avisa/user/RegisterAvisaUserUseCase;", "loginAvisaUserUseCase", "Lcom/adif/elcanomovil/domain/usecases/avisa/user/LoginAvisaUserUseCase;", "preferenceStorage", "Lcom/adif/elcanomovil/serviceStorage/preferences/PreferenceStorage;", "refreshAvisaUserUseCase", "Lcom/adif/elcanomovil/domain/usecases/avisa/user/RefreshAvisaUserUseCase;", "(Lcom/adif/elcanomovil/domain/usecases/avisa/user/RegisterAvisaUserUseCase;Lcom/adif/elcanomovil/domain/usecases/avisa/user/LoginAvisaUserUseCase;Lcom/adif/elcanomovil/serviceStorage/preferences/PreferenceStorage;Lcom/adif/elcanomovil/domain/usecases/avisa/user/RefreshAvisaUserUseCase;)V", "oneTry", "", "handleAuthentication", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Function0;", "Lcom/adif/elcanomovil/uiAvisa/components/authenticator/AuthenticationListener;", "ui-avisa_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DefaultAuthenticationProvider implements AuthenticationProvider {
    private final LoginAvisaUserUseCase loginAvisaUserUseCase;
    private boolean oneTry;
    private final PreferenceStorage preferenceStorage;
    private final RefreshAvisaUserUseCase refreshAvisaUserUseCase;
    private final RegisterAvisaUserUseCase registerAvisaUserUseCase;

    public DefaultAuthenticationProvider(RegisterAvisaUserUseCase registerAvisaUserUseCase, LoginAvisaUserUseCase loginAvisaUserUseCase, PreferenceStorage preferenceStorage, RefreshAvisaUserUseCase refreshAvisaUserUseCase) {
        Intrinsics.checkNotNullParameter(registerAvisaUserUseCase, "registerAvisaUserUseCase");
        Intrinsics.checkNotNullParameter(loginAvisaUserUseCase, "loginAvisaUserUseCase");
        Intrinsics.checkNotNullParameter(preferenceStorage, "preferenceStorage");
        Intrinsics.checkNotNullParameter(refreshAvisaUserUseCase, "refreshAvisaUserUseCase");
        this.registerAvisaUserUseCase = registerAvisaUserUseCase;
        this.loginAvisaUserUseCase = loginAvisaUserUseCase;
        this.preferenceStorage = preferenceStorage;
        this.refreshAvisaUserUseCase = refreshAvisaUserUseCase;
    }

    @Override // com.adif.elcanomovil.uiAvisa.components.authenticator.AuthenticationProvider
    public void handleAuthentication(Function0<Unit> listener) {
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new e(this, listener, null), 2, null);
    }
}
