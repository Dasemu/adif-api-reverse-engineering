package com.adif.elcanomovil.uiDialog;

import com.adif.elcanomovil.commonNavGraph.arguments.AlertAction;
import com.adif.elcanomovil.commonNavGraph.extensions.NavigationExtensionsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import m3.l;
import o0.AbstractC0544v;

/* loaded from: classes2.dex */
public final class e extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdifDialogFragment f5047a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AlertAction f5048b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(AdifDialogFragment adifDialogFragment, AlertAction alertAction) {
        super(0);
        this.f5047a = adifDialogFragment;
        this.f5048b = alertAction;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        AdifDialogFragmentArgs args;
        AdifDialogFragment adifDialogFragment = this.f5047a;
        adifDialogFragment.dismiss();
        AbstractC0544v n4 = l.n(adifDialogFragment);
        args = adifDialogFragment.getArgs();
        NavigationExtensionsKt.setDestinationResult(n4, args.getActions().getKey(), this.f5048b.getStyle());
        return Unit.INSTANCE;
    }
}
