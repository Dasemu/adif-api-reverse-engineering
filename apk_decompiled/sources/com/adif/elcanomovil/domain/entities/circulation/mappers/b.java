package com.adif.elcanomovil.domain.entities.circulation.mappers;

import java.util.Collection;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: classes.dex */
public final class b extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public CercaniasCirculationMapper f4466a;

    /* renamed from: b, reason: collision with root package name */
    public Collection f4467b;

    /* renamed from: c, reason: collision with root package name */
    public Iterator f4468c;

    /* renamed from: d, reason: collision with root package name */
    public Collection f4469d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4470e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f4471f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ CercaniasCirculationMapper f4472g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(CercaniasCirculationMapper cercaniasCirculationMapper, Continuation continuation) {
        super(continuation);
        this.f4472g = cercaniasCirculationMapper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object makeOneWayCirculations;
        this.f4471f = obj;
        this.h |= IntCompanionObject.MIN_VALUE;
        makeOneWayCirculations = this.f4472g.makeOneWayCirculations(null, false, this);
        return makeOneWayCirculations;
    }
}
