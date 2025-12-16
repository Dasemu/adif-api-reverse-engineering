package com.adif.elcanomovil.widget;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class b extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5477a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DeparturesWidgetViewModel f5478b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(DeparturesWidgetViewModel departuresWidgetViewModel, int i) {
        super(1);
        this.f5477a = i;
        this.f5478b = departuresWidgetViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f5477a) {
            case 0:
                Pair it = (Pair) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                this.f5478b.changeWay(((Number) it.getFirst()).intValue(), (WidgetPayload) it.getSecond());
                return Unit.INSTANCE;
            default:
                Pair it2 = (Pair) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                this.f5478b.update(((Number) it2.getFirst()).intValue(), (WidgetPayload) it2.getSecond());
                return Unit.INSTANCE;
        }
    }
}
