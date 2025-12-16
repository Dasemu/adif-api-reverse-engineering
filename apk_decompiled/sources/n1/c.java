package n1;

import com.adif.elcanomovil.domain.entities.StorableStation;
import com.adif.elcanomovil.domain.repositories.searches.SearchesRepository;
import com.adif.elcanomovil.domain.usecases.recentSearch.SaveRecentSearchUseCase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public final class c extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f7851a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SaveRecentSearchUseCase f7852b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f7853c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(SaveRecentSearchUseCase saveRecentSearchUseCase, List list, Continuation continuation) {
        super(2, continuation);
        this.f7852b = saveRecentSearchUseCase;
        this.f7853c = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new c(this.f7852b, this.f7853c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SearchesRepository searchesRepository;
        int collectionSizeOrDefault;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f7851a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            searchesRepository = this.f7852b.searchesRepository;
            List list = this.f7853c;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new StorableStation((String) it.next()));
            }
            this.f7851a = 1;
            if (searchesRepository.saveSearch(arrayList, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
