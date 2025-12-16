package com.adif.elcanomovil.uiDepartures.main;

import com.adif.elcanomovil.commonViews.extensions.ViewKt;
import com.adif.elcanomovil.uiDepartures.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class b extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DeparturesFragment f4933a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(DeparturesFragment departuresFragment) {
        super(1);
        this.f4933a = departuresFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            int i = R.string.circulation_no_stations_message;
            DeparturesFragment departuresFragment = this.f4933a;
            String string = departuresFragment.getString(i);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            ViewKt.showSnackbar(departuresFragment, string, 0);
        }
        return Unit.INSTANCE;
    }
}
