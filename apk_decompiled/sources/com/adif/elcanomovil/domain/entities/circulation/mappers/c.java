package com.adif.elcanomovil.domain.entities.circulation.mappers;

import com.adif.elcanomovil.domain.entities.circulation.CommercialPathStepSideInfo;
import java.util.Date;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: classes.dex */
public final class c extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public CommercialPathStepSideInfo f4473a;

    /* renamed from: b, reason: collision with root package name */
    public Date f4474b;

    /* renamed from: c, reason: collision with root package name */
    public String f4475c;

    /* renamed from: d, reason: collision with root package name */
    public String f4476d;

    /* renamed from: e, reason: collision with root package name */
    public String f4477e;

    /* renamed from: f, reason: collision with root package name */
    public String f4478f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4479g;
    public /* synthetic */ Object h;
    public final /* synthetic */ CercaniasCirculationMapper i;

    /* renamed from: j, reason: collision with root package name */
    public int f4480j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(CercaniasCirculationMapper cercaniasCirculationMapper, Continuation continuation) {
        super(continuation);
        this.i = cercaniasCirculationMapper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object mapToCirculation;
        this.h = obj;
        this.f4480j |= IntCompanionObject.MIN_VALUE;
        mapToCirculation = this.i.mapToCirculation(null, false, this);
        return mapToCirculation;
    }
}
