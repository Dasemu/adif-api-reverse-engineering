package t1;

import com.adif.elcanomovil.repositories.favourites.DefaultFavoritesRepository;
import com.adif.elcanomovil.repositories.favourites.FavouritesStationsMapper;
import com.adif.elcanomovil.serviceStorage.model.StationFavouritesEntity;
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

/* renamed from: t1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0619d extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f8522a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f8523b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f8524c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ DefaultFavoritesRepository f8525d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0619d(List list, DefaultFavoritesRepository defaultFavoritesRepository, Continuation continuation) {
        super(2, continuation);
        this.f8524c = list;
        this.f8525d = defaultFavoritesRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C0619d c0619d = new C0619d(this.f8524c, this.f8525d, continuation);
        c0619d.f8523b = obj;
        return c0619d;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0619d) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int collectionSizeOrDefault;
        FavouritesStationsMapper favouritesStationsMapper;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f8522a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.f8523b;
            List<StationFavouritesEntity> list = this.f8524c;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (StationFavouritesEntity stationFavouritesEntity : list) {
                favouritesStationsMapper = this.f8525d.favouritesMapper;
                arrayList.add(favouritesStationsMapper.entityToDomain(stationFavouritesEntity));
            }
            this.f8522a = 1;
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
