package com.adif.elcanomovil.uiSelectStation.main;

import android.icu.text.Collator;
import com.adif.elcanomovil.domain.entities.station.Station;
import com.adif.elcanomovil.domain.usecases.stations.GetStationByNameUseCase;
import com.adif.elcanomovil.repositories.utils.REGEX_UNACCENTKt;
import com.adif.elcanomovil.uiSelectStation.main.SelectStationViewState;
import java.util.Comparator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* loaded from: classes2.dex */
public final class g extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public SelectStationViewModel$fetchStationsBy$1$invokeSuspend$$inlined$thenBy$1 f5190a;

    /* renamed from: b, reason: collision with root package name */
    public int f5191b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SelectStationViewModel f5192c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List f5193d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(SelectStationViewModel selectStationViewModel, List list, Continuation continuation) {
        super(2, continuation);
        this.f5192c = selectStationViewModel;
        this.f5193d = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new g(this.f5192c, this.f5193d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [com.adif.elcanomovil.uiSelectStation.main.SelectStationViewModel$fetchStationsBy$1$invokeSuspend$$inlined$thenBy$1] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        final Collator collator;
        final Collator collator2;
        GetStationByNameUseCase getStationByNameUseCase;
        String joinToString$default;
        SelectStationViewModel$fetchStationsBy$1$invokeSuspend$$inlined$thenBy$1 selectStationViewModel$fetchStationsBy$1$invokeSuspend$$inlined$thenBy$1;
        MutableStateFlow mutableStateFlow;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f5191b;
        SelectStationViewModel selectStationViewModel = this.f5192c;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            collator = selectStationViewModel.collator;
            final List list = this.f5193d;
            final Comparator comparator = new Comparator() { // from class: com.adif.elcanomovil.uiSelectStation.main.SelectStationViewModel$fetchStationsBy$1$invokeSuspend$$inlined$compareBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t2, T t4) {
                    boolean contains;
                    boolean contains2;
                    Comparator comparator2 = collator;
                    contains = StringsKt__StringsKt.contains((CharSequence) REGEX_UNACCENTKt.unaccent(((Station) t2).getShortName()), (CharSequence) CollectionsKt.first(list), true);
                    String str = contains ? "0" : "1";
                    contains2 = StringsKt__StringsKt.contains((CharSequence) REGEX_UNACCENTKt.unaccent(((Station) t4).getShortName()), (CharSequence) CollectionsKt.first(list), true);
                    return comparator2.compare(str, contains2 ? "0" : "1");
                }
            };
            collator2 = selectStationViewModel.collator;
            ?? r5 = new Comparator() { // from class: com.adif.elcanomovil.uiSelectStation.main.SelectStationViewModel$fetchStationsBy$1$invokeSuspend$$inlined$thenBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t2, T t4) {
                    int compare = comparator.compare(t2, t4);
                    return compare != 0 ? compare : collator2.compare(((Station) t2).getShortName(), ((Station) t4).getShortName());
                }
            };
            getStationByNameUseCase = selectStationViewModel.getStationByNameUseCase;
            joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(list, " ", null, null, 0, null, null, 62, null);
            this.f5190a = r5;
            this.f5191b = 1;
            obj = getStationByNameUseCase.invoke(joinToString$default, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            selectStationViewModel$fetchStationsBy$1$invokeSuspend$$inlined$thenBy$1 = r5;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            selectStationViewModel$fetchStationsBy$1$invokeSuspend$$inlined$thenBy$1 = this.f5190a;
            ResultKt.throwOnFailure(obj);
        }
        List sortedWith = CollectionsKt.sortedWith((Iterable) obj, selectStationViewModel$fetchStationsBy$1$invokeSuspend$$inlined$thenBy$1);
        mutableStateFlow = selectStationViewModel._viewState;
        mutableStateFlow.tryEmit(sortedWith.isEmpty() ? SelectStationViewState.NoResults.INSTANCE : new SelectStationViewState.ShowSearchResults(sortedWith));
        return Unit.INSTANCE;
    }
}
