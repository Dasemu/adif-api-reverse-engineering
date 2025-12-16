package com.adif.elcanomovil.uiHome.views;

import com.google.android.gms.maps.model.LatLngBounds;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes2.dex */
public final class d extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public Object f5116a;

    /* renamed from: b, reason: collision with root package name */
    public Object f5117b;

    /* renamed from: c, reason: collision with root package name */
    public Object f5118c;

    /* renamed from: d, reason: collision with root package name */
    public Object f5119d;

    /* renamed from: e, reason: collision with root package name */
    public int f5120e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f5121f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ HomeMapViewModel f5122g;
    public final /* synthetic */ LatLngBounds h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(HomeMapViewModel homeMapViewModel, LatLngBounds latLngBounds, Continuation continuation) {
        super(2, continuation);
        this.f5122g = homeMapViewModel;
        this.h = latLngBounds;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        d dVar = new d(this.f5122g, this.h, continuation);
        dVar.f5121f = obj;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00db  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.uiHome.views.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
