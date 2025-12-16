package com.adif.elcanomovil.uiDepartures.main;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class d extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4935a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DeparturesFragment f4936b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(DeparturesFragment departuresFragment, int i) {
        super(1);
        this.f4935a = i;
        this.f4936b = departuresFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f4935a) {
            case 0:
                DeparturesFragment.access$getViewModel(this.f4936b).onStationInfoPressed();
                return Unit.INSTANCE;
            default:
                DeparturesFragment.access$getViewModel(this.f4936b).onStationCommercialPressed();
                return Unit.INSTANCE;
        }
    }
}
