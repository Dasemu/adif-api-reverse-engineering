package com.adif.elcanomovil.domain.entities.circulation.mappers;

import com.adif.elcanomovil.domain.entities.circulation.CommercialRouteInfo;
import java.util.Date;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: classes.dex */
public final class d extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public CommercialRouteInfo f4481a;

    /* renamed from: b, reason: collision with root package name */
    public Date f4482b;

    /* renamed from: c, reason: collision with root package name */
    public String f4483c;

    /* renamed from: d, reason: collision with root package name */
    public String f4484d;

    /* renamed from: e, reason: collision with root package name */
    public String f4485e;

    /* renamed from: f, reason: collision with root package name */
    public String f4486f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f4487g;
    public final /* synthetic */ CercaniasCirculationMapper h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(CercaniasCirculationMapper cercaniasCirculationMapper, Continuation continuation) {
        super(continuation);
        this.h = cercaniasCirculationMapper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object mapToCirculation;
        this.f4487g = obj;
        this.i |= IntCompanionObject.MIN_VALUE;
        mapToCirculation = this.h.mapToCirculation(null, this);
        return mapToCirculation;
    }
}
