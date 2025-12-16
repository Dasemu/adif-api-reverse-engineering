package com.adif.elcanomovil.uiTrain.main;

import com.adif.elcanomovil.domain.entities.utils.AsyncResult;
import com.adif.elcanomovil.domain.entities.utils.Status;
import com.adif.elcanomovil.uiTrain.entities.Step;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: classes3.dex */
public final class t extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public TrainSituationViewModel f5443a;

    /* renamed from: b, reason: collision with root package name */
    public AsyncResult f5444b;

    /* renamed from: c, reason: collision with root package name */
    public List f5445c;

    /* renamed from: d, reason: collision with root package name */
    public List f5446d;

    /* renamed from: e, reason: collision with root package name */
    public Collection f5447e;

    /* renamed from: f, reason: collision with root package name */
    public Iterator f5448f;

    /* renamed from: g, reason: collision with root package name */
    public Object f5449g;
    public Object h;
    public Object i;

    /* renamed from: j, reason: collision with root package name */
    public Object f5450j;

    /* renamed from: k, reason: collision with root package name */
    public Collection f5451k;

    /* renamed from: l, reason: collision with root package name */
    public Iterator f5452l;

    /* renamed from: m, reason: collision with root package name */
    public Step f5453m;

    /* renamed from: n, reason: collision with root package name */
    public Collection f5454n;

    /* renamed from: o, reason: collision with root package name */
    public Step f5455o;
    public Status p;

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f5456q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ TrainSituationViewModel f5457r;

    /* renamed from: s, reason: collision with root package name */
    public int f5458s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(TrainSituationViewModel trainSituationViewModel, Continuation continuation) {
        super(continuation);
        this.f5457r = trainSituationViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object mergeData;
        this.f5456q = obj;
        this.f5458s |= IntCompanionObject.MIN_VALUE;
        mergeData = this.f5457r.mergeData(null, null, this);
        return mergeData;
    }
}
