package t1;

import com.adif.elcanomovil.repositories.favourites.DefaultFavoritesRepository;
import com.adif.elcanomovil.repositories.favourites.FavouritesTrainsMapper;
import com.adif.elcanomovil.serviceStorage.model.FavouriteTrainEntity;
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

/* renamed from: t1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0621f extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f8528a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f8529b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f8530c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ DefaultFavoritesRepository f8531d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0621f(List list, DefaultFavoritesRepository defaultFavoritesRepository, Continuation continuation) {
        super(2, continuation);
        this.f8530c = list;
        this.f8531d = defaultFavoritesRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C0621f c0621f = new C0621f(this.f8530c, this.f8531d, continuation);
        c0621f.f8529b = obj;
        return c0621f;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0621f) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int collectionSizeOrDefault;
        FavouritesTrainsMapper favouritesTrainsMapper;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f8528a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.f8529b;
            List<FavouriteTrainEntity> list = this.f8530c;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (FavouriteTrainEntity favouriteTrainEntity : list) {
                favouritesTrainsMapper = this.f8531d.favouritesTrainMapper;
                arrayList.add(favouritesTrainsMapper.entityToDomain(favouriteTrainEntity));
            }
            this.f8528a = 1;
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
