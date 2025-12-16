package com.adif.elcanomovil.uiAvisa.components.authenticator;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005j\u0002`\u0006H&¨\u0006\u0007"}, d2 = {"Lcom/adif/elcanomovil/uiAvisa/components/authenticator/AuthenticationProvider;", "", "handleAuthentication", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Function0;", "Lcom/adif/elcanomovil/uiAvisa/components/authenticator/AuthenticationListener;", "ui-avisa_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface AuthenticationProvider {
    void handleAuthentication(Function0<Unit> listener);
}
