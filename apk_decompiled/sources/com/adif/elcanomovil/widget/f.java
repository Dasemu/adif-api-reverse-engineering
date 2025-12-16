package com.adif.elcanomovil.widget;

import com.adif.elcanomovil.domain.entities.circulation.TrainCirculation;
import java.util.Collection;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: classes3.dex */
public final class f extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public DeparturesWidgetViewModel f5497a;

    /* renamed from: b, reason: collision with root package name */
    public Collection f5498b;

    /* renamed from: c, reason: collision with root package name */
    public Iterator f5499c;

    /* renamed from: d, reason: collision with root package name */
    public TrainCirculation f5500d;

    /* renamed from: e, reason: collision with root package name */
    public Collection f5501e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f5502f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ DeparturesWidgetViewModel f5503g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(DeparturesWidgetViewModel departuresWidgetViewModel, Continuation continuation) {
        super(continuation);
        this.f5503g = departuresWidgetViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object updateCirculationsStationsDetails;
        this.f5502f = obj;
        this.h |= IntCompanionObject.MIN_VALUE;
        updateCirculationsStationsDetails = this.f5503g.updateCirculationsStationsDetails(null, this);
        return updateCirculationsStationsDetails;
    }
}
