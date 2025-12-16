package com.adif.elcanomovil.uiDepartures.main;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: classes2.dex */
public final class j extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public Object f4952a;

    /* renamed from: b, reason: collision with root package name */
    public String[] f4953b;

    /* renamed from: c, reason: collision with root package name */
    public String[] f4954c;

    /* renamed from: d, reason: collision with root package name */
    public int f4955d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f4956e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ DeparturesViewModel f4957f;

    /* renamed from: g, reason: collision with root package name */
    public int f4958g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(DeparturesViewModel departuresViewModel, Continuation continuation) {
        super(continuation);
        this.f4957f = departuresViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object readStations;
        this.f4956e = obj;
        this.f4958g |= IntCompanionObject.MIN_VALUE;
        readStations = this.f4957f.readStations(this);
        return readStations;
    }
}
