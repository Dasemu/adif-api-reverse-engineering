package com.adif.elcanomovil.uiDialog;

import android.content.DialogInterface;
import com.adif.elcanomovil.commonNavGraph.arguments.AlertAction;
import com.adif.elcanomovil.commonNavGraph.extensions.NavigationExtensionsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import m3.l;

/* loaded from: classes2.dex */
public final class d extends Lambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdifDialogFragment f5044a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f5045b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AlertAction f5046c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(AdifDialogFragment adifDialogFragment, String str, AlertAction alertAction) {
        super(2);
        this.f5044a = adifDialogFragment;
        this.f5045b = str;
        this.f5046c = alertAction;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        DialogInterface dialog = (DialogInterface) obj;
        ((Number) obj2).intValue();
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        dialog.dismiss();
        NavigationExtensionsKt.setDestinationResult(l.n(this.f5044a), this.f5045b, this.f5046c.getStyle());
        return Unit.INSTANCE;
    }
}
