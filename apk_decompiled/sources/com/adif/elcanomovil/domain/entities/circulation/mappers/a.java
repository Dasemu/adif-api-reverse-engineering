package com.adif.elcanomovil.domain.entities.circulation.mappers;

import java.util.Collection;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: classes.dex */
public final class a extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public CercaniasCirculationMapper f4459a;

    /* renamed from: b, reason: collision with root package name */
    public Collection f4460b;

    /* renamed from: c, reason: collision with root package name */
    public Iterator f4461c;

    /* renamed from: d, reason: collision with root package name */
    public Collection f4462d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f4463e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ CercaniasCirculationMapper f4464f;

    /* renamed from: g, reason: collision with root package name */
    public int f4465g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(CercaniasCirculationMapper cercaniasCirculationMapper, Continuation continuation) {
        super(continuation);
        this.f4464f = cercaniasCirculationMapper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object makeJourneyCirculations;
        this.f4463e = obj;
        this.f4465g |= IntCompanionObject.MIN_VALUE;
        makeJourneyCirculations = this.f4464f.makeJourneyCirculations(null, this);
        return makeJourneyCirculations;
    }
}
