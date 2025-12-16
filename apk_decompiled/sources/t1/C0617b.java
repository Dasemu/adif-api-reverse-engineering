package t1;

import com.adif.elcanomovil.repositories.favourites.DefaultFavoritesRepository;
import com.adif.elcanomovil.repositories.favourites.FavouritesStationsMapper;
import com.adif.elcanomovil.serviceStorage.model.FavouriteEntity;
import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* renamed from: t1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0617b extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f8516a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f8517b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f8518c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ DefaultFavoritesRepository f8519d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0617b(List list, DefaultFavoritesRepository defaultFavoritesRepository, Continuation continuation) {
        super(2, continuation);
        this.f8518c = list;
        this.f8519d = defaultFavoritesRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C0617b c0617b = new C0617b(this.f8518c, this.f8519d, continuation);
        c0617b.f8517b = obj;
        return c0617b;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0617b) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int collectionSizeOrDefault;
        FavouritesStationsMapper favouritesStationsMapper;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f8516a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.f8517b;
            List<FavouriteEntity> list = this.f8518c;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (FavouriteEntity favouriteEntity : list) {
                favouritesStationsMapper = this.f8519d.favouritesMapper;
                arrayList.add(favouritesStationsMapper.favouriteEntityToDomain(favouriteEntity));
            }
            this.f8516a = 1;
            if (flowCollector.emit(arrayList, this) == coroutine_suspended) {
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
