package com.adif.elcanomovil.widget;

import com.adif.elcanomovil.domain.entities.utils.SyncResult;
import com.adif.elcanomovil.serviceStorage.model.FavouriteEntity;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: classes3.dex */
public final class d extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public DeparturesWidgetViewModel f5486a;

    /* renamed from: b, reason: collision with root package name */
    public FavouriteEntity f5487b;

    /* renamed from: c, reason: collision with root package name */
    public SyncResult.Success f5488c;

    /* renamed from: d, reason: collision with root package name */
    public int f5489d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f5490e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ DeparturesWidgetViewModel f5491f;

    /* renamed from: g, reason: collision with root package name */
    public int f5492g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(DeparturesWidgetViewModel departuresWidgetViewModel, Continuation continuation) {
        super(continuation);
        this.f5491f = departuresWidgetViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object update;
        this.f5490e = obj;
        this.f5492g |= IntCompanionObject.MIN_VALUE;
        update = this.f5491f.update(0, null, this);
        return update;
    }
}
