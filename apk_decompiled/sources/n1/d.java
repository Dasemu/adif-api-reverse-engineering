package n1;

import com.adif.elcanomovil.domain.entities.StorableTrain;
import com.adif.elcanomovil.domain.repositories.searches.SearchesRepository;
import com.adif.elcanomovil.domain.usecases.recentSearch.SaveRecentTrainSearchUseCase;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public final class d extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f7854a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SaveRecentTrainSearchUseCase f7855b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f7856c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f7857d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f7858e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f7859f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f7860g;
    public final /* synthetic */ long h;
    public final /* synthetic */ long i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f7861j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(SaveRecentTrainSearchUseCase saveRecentTrainSearchUseCase, String str, String str2, String str3, String str4, String str5, long j4, long j5, String str6, Continuation continuation) {
        super(2, continuation);
        this.f7855b = saveRecentTrainSearchUseCase;
        this.f7856c = str;
        this.f7857d = str2;
        this.f7858e = str3;
        this.f7859f = str4;
        this.f7860g = str5;
        this.h = j4;
        this.i = j5;
        this.f7861j = str6;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new d(this.f7855b, this.f7856c, this.f7857d, this.f7858e, this.f7859f, this.f7860g, this.h, this.i, this.f7861j, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SearchesRepository searchesRepository;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f7854a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            searchesRepository = this.f7855b.searchesRepository;
            StorableTrain storableTrain = new StorableTrain(this.f7856c, this.f7857d, this.f7858e, this.f7859f, this.f7860g, this.h, this.i, this.f7861j);
            this.f7854a = 1;
            if (searchesRepository.saveTrainSelected(storableTrain, this) == coroutine_suspended) {
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
