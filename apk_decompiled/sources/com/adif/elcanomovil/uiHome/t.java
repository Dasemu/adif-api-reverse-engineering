package com.adif.elcanomovil.uiHome;

import com.adif.elcanomovil.uiHome.mappers.UserFavoriteVOMapper;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: classes2.dex */
public final class t extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public HomeViewModel f5097a;

    /* renamed from: b, reason: collision with root package name */
    public Object f5098b;

    /* renamed from: c, reason: collision with root package name */
    public UserFavoriteVOMapper f5099c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f5100d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ HomeViewModel f5101e;

    /* renamed from: f, reason: collision with root package name */
    public int f5102f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(HomeViewModel homeViewModel, Continuation continuation) {
        super(continuation);
        this.f5101e = homeViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object fetchFavorites;
        this.f5100d = obj;
        this.f5102f |= IntCompanionObject.MIN_VALUE;
        fetchFavorites = this.f5101e.fetchFavorites(this);
        return fetchFavorites;
    }
}
