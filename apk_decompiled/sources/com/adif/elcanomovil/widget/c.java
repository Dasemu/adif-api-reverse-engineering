package com.adif.elcanomovil.widget;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes3.dex */
public final class c extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public CoroutineScope f5479a;

    /* renamed from: b, reason: collision with root package name */
    public int f5480b;

    /* renamed from: c, reason: collision with root package name */
    public int f5481c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f5482d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ DeparturesWidgetViewModel f5483e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f5484f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ WidgetPayload f5485g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(DeparturesWidgetViewModel departuresWidgetViewModel, int i, WidgetPayload widgetPayload, Continuation continuation) {
        super(2, continuation);
        this.f5483e = departuresWidgetViewModel;
        this.f5484f = i;
        this.f5485g = widgetPayload;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        c cVar = new c(this.f5483e, this.f5484f, this.f5485g, continuation);
        cVar.f5482d = obj;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0094, code lost:
    
        if (r10 == r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0096, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007e, code lost:
    
        if (r11 == r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0055, code lost:
    
        if (r11 == r0) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x009b  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r10.f5481c
            com.adif.elcanomovil.widget.DeparturesWidgetViewModel r2 = r10.f5483e
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            int r7 = r10.f5484f
            if (r1 == 0) goto L3f
            if (r1 == r5) goto L37
            if (r1 == r4) goto L2b
            if (r1 != r3) goto L23
            int r0 = r10.f5480b
            java.lang.Object r10 = r10.f5482d
            com.adif.elcanomovil.widget.DeparturesWidgetViewModel r10 = (com.adif.elcanomovil.widget.DeparturesWidgetViewModel) r10
            kotlin.ResultKt.throwOnFailure(r11)
            r2 = r10
            r7 = r0
            goto L97
        L23:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L2b:
            int r7 = r10.f5480b
            kotlinx.coroutines.CoroutineScope r1 = r10.f5479a
            java.lang.Object r2 = r10.f5482d
            com.adif.elcanomovil.widget.DeparturesWidgetViewModel r2 = (com.adif.elcanomovil.widget.DeparturesWidgetViewModel) r2
            kotlin.ResultKt.throwOnFailure(r11)
            goto L81
        L37:
            java.lang.Object r1 = r10.f5482d
            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
            kotlin.ResultKt.throwOnFailure(r11)
            goto L58
        L3f:
            kotlin.ResultKt.throwOnFailure(r11)
            java.lang.Object r11 = r10.f5482d
            r1 = r11
            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
            com.adif.elcanomovil.serviceStorage.model.FavouriteEntity r11 = com.adif.elcanomovil.widget.DeparturesWidgetViewModel.access$retrieveWidgetInfo(r2, r7)
            if (r11 == 0) goto L5b
            r10.f5482d = r1
            r10.f5481c = r5
            java.lang.Object r11 = com.adif.elcanomovil.widget.DeparturesWidgetViewModel.access$update(r2, r7, r11, r10)
            if (r11 != r0) goto L58
            goto L96
        L58:
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            goto L5c
        L5b:
            r11 = r6
        L5c:
            if (r11 != 0) goto La2
            com.adif.elcanomovil.widget.WidgetPayload r11 = r10.f5485g
            if (r11 == 0) goto L99
            com.adif.elcanomovil.widget.domain.usecases.GetWidgetInfoUseCase r5 = com.adif.elcanomovil.widget.DeparturesWidgetViewModel.access$getGetWidgetInfoUseCase$p(r2)
            java.lang.String r8 = r11.getOrigin()
            java.lang.String r9 = r11.getDestination()
            boolean r11 = r11.getIsCercanias()
            r10.f5482d = r2
            r10.f5479a = r1
            r10.f5480b = r7
            r10.f5481c = r4
            java.lang.Object r11 = r5.invoke(r8, r9, r11, r10)
            if (r11 != r0) goto L81
            goto L96
        L81:
            com.adif.elcanomovil.serviceStorage.model.FavouriteEntity r11 = (com.adif.elcanomovil.serviceStorage.model.FavouriteEntity) r11
            if (r11 == 0) goto L99
            com.adif.elcanomovil.widget.DeparturesWidgetViewModel.access$storeWidgetInfo(r2, r7, r11)
            r10.f5482d = r2
            r10.f5479a = r1
            r10.f5480b = r7
            r10.f5481c = r3
            java.lang.Object r10 = com.adif.elcanomovil.widget.DeparturesWidgetViewModel.access$update(r2, r7, r11, r10)
            if (r10 != r0) goto L97
        L96:
            return r0
        L97:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
        L99:
            if (r6 != 0) goto La2
            com.adif.elcanomovil.widget.DeparturesWidgetView r10 = com.adif.elcanomovil.widget.DeparturesWidgetViewModel.access$getView$p(r2)
            r10.missingInformationError(r7)
        La2:
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.widget.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
