package com.adif.elcanomovil.widget;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes3.dex */
public final class a extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f5473a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DeparturesWidgetViewModel f5474b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f5475c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ WidgetPayload f5476d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(DeparturesWidgetViewModel departuresWidgetViewModel, int i, WidgetPayload widgetPayload, Continuation continuation) {
        super(2, continuation);
        this.f5474b = departuresWidgetViewModel;
        this.f5475c = i;
        this.f5476d = widgetPayload;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new a(this.f5474b, this.f5475c, this.f5476d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0041, code lost:
    
        if (r6 == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002d, code lost:
    
        if (r7 == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.f5473a
            com.adif.elcanomovil.widget.DeparturesWidgetViewModel r2 = r6.f5474b
            int r3 = r6.f5475c
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L22
            if (r1 == r5) goto L1e
            if (r1 != r4) goto L16
            kotlin.ResultKt.throwOnFailure(r7)
            goto L44
        L16:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L1e:
            kotlin.ResultKt.throwOnFailure(r7)
            goto L30
        L22:
            kotlin.ResultKt.throwOnFailure(r7)
            r6.f5473a = r5
            com.adif.elcanomovil.widget.WidgetPayload r7 = r6.f5476d
            java.lang.Object r7 = com.adif.elcanomovil.widget.DeparturesWidgetViewModel.access$getWidgetInfo(r2, r3, r7, r6)
            if (r7 != r0) goto L30
            goto L43
        L30:
            com.adif.elcanomovil.serviceStorage.model.FavouriteEntity r7 = (com.adif.elcanomovil.serviceStorage.model.FavouriteEntity) r7
            if (r7 == 0) goto L44
            com.adif.elcanomovil.serviceStorage.model.FavouriteEntity r7 = com.adif.elcanomovil.widget.DeparturesWidgetViewModel.access$invertWay(r2, r7)
            com.adif.elcanomovil.widget.DeparturesWidgetViewModel.access$storeWidgetInfo(r2, r3, r7)
            r6.f5473a = r4
            java.lang.Object r6 = com.adif.elcanomovil.widget.DeparturesWidgetViewModel.access$update(r2, r3, r7, r6)
            if (r6 != r0) goto L44
        L43:
            return r0
        L44:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.widget.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
