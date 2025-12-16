package com.adif.elcanomovil.uiSelectTrain.main;

import com.adif.elcanomovil.domain.entities.utils.Status;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: classes2.dex */
public final class g extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public SelectTrainViewModel f5244a;

    /* renamed from: b, reason: collision with root package name */
    public List f5245b;

    /* renamed from: c, reason: collision with root package name */
    public Collection f5246c;

    /* renamed from: d, reason: collision with root package name */
    public Iterator f5247d;

    /* renamed from: e, reason: collision with root package name */
    public Object f5248e;

    /* renamed from: f, reason: collision with root package name */
    public Object f5249f;

    /* renamed from: g, reason: collision with root package name */
    public Object f5250g;
    public Status h;
    public /* synthetic */ Object i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ SelectTrainViewModel f5251j;

    /* renamed from: k, reason: collision with root package name */
    public int f5252k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(SelectTrainViewModel selectTrainViewModel, Continuation continuation) {
        super(continuation);
        this.f5251j = selectTrainViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object mapToTrainInfo;
        this.i = obj;
        this.f5252k |= IntCompanionObject.MIN_VALUE;
        mapToTrainInfo = this.f5251j.mapToTrainInfo(null, this);
        return mapToTrainInfo;
    }
}
