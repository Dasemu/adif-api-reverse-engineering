package com.adif.elcanomovil.uiSelectTrain.main;

import com.adif.elcanomovil.domain.entities.StorableData;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes2.dex */
public final class d extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public SelectTrainViewModel f5230a;

    /* renamed from: b, reason: collision with root package name */
    public Collection f5231b;

    /* renamed from: c, reason: collision with root package name */
    public Iterator f5232c;

    /* renamed from: d, reason: collision with root package name */
    public StorableData f5233d;

    /* renamed from: e, reason: collision with root package name */
    public Object f5234e;

    /* renamed from: f, reason: collision with root package name */
    public String f5235f;

    /* renamed from: g, reason: collision with root package name */
    public String f5236g;
    public String h;
    public String i;

    /* renamed from: j, reason: collision with root package name */
    public int f5237j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ SelectTrainViewModel f5238k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(SelectTrainViewModel selectTrainViewModel, Continuation continuation) {
        super(2, continuation);
        this.f5238k = selectTrainViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new d(this.f5238k, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0119, code lost:
    
        if (r2 != r1) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x007c, code lost:
    
        if (r2 == r1) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0151  */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r13v7, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0119 -> B:7:0x0034). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0147 -> B:13:0x0148). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.uiSelectTrain.main.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
