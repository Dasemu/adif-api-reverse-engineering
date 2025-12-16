package com.adif.elcanomovil.main;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o0.AbstractC0544v;
import o0.E;

/* loaded from: classes.dex */
public final class b extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4537a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC0544v f4538b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(AbstractC0544v abstractC0544v, int i) {
        super(1);
        this.f4537a = i;
        this.f4538b = abstractC0544v;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f4537a) {
            case 0:
                int intValue = ((Number) obj).intValue();
                AbstractC0544v abstractC0544v = this.f4538b;
                if (abstractC0544v.r(intValue, false, false)) {
                    abstractC0544v.c();
                }
                return Unit.INSTANCE;
            case 1:
                E destination = (E) obj;
                Intrinsics.checkNotNullParameter(destination, "destination");
                return Boolean.valueOf(!this.f4538b.f8057l.containsKey(Integer.valueOf(destination.h)));
            default:
                E destination2 = (E) obj;
                Intrinsics.checkNotNullParameter(destination2, "destination");
                return Boolean.valueOf(!this.f4538b.f8057l.containsKey(Integer.valueOf(destination2.h)));
        }
    }
}
