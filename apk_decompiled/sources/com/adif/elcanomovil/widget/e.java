package com.adif.elcanomovil.widget;

import com.adif.elcanomovil.serviceStorage.model.FavouriteEntity;
import com.adif.elcanomovil.serviceStorage.preferences.PreferenceStorage;
import java.util.Iterator;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes3.dex */
public final class e extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public DeparturesWidgetViewModel f5493a;

    /* renamed from: b, reason: collision with root package name */
    public Iterator f5494b;

    /* renamed from: c, reason: collision with root package name */
    public int f5495c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ DeparturesWidgetViewModel f5496d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(DeparturesWidgetViewModel departuresWidgetViewModel, Continuation continuation) {
        super(2, continuation);
        this.f5496d = departuresWidgetViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new e(this.f5496d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        DeparturesWidgetViewModel departuresWidgetViewModel;
        PreferenceStorage preferenceStorage;
        Iterator<Map.Entry<Integer, FavouriteEntity>> it;
        Object update;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f5495c;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            departuresWidgetViewModel = this.f5496d;
            preferenceStorage = departuresWidgetViewModel.preferenceStorage;
            Map<Integer, FavouriteEntity> widgetInfo = preferenceStorage.getWidgetInfo();
            if (widgetInfo != null) {
                it = widgetInfo.entrySet().iterator();
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        it = this.f5494b;
        departuresWidgetViewModel = this.f5493a;
        ResultKt.throwOnFailure(obj);
        while (it.hasNext()) {
            Map.Entry<Integer, FavouriteEntity> next = it.next();
            int intValue = next.getKey().intValue();
            FavouriteEntity value = next.getValue();
            this.f5493a = departuresWidgetViewModel;
            this.f5494b = it;
            this.f5495c = 1;
            update = departuresWidgetViewModel.update(intValue, value, this);
            if (update == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
