package z1;

import com.adif.elcanomovil.serviceNetworking.pinning.PinningRemoteDataSource;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* renamed from: z1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0668b extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f9007a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PinningRemoteDataSource f9008b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0668b(PinningRemoteDataSource pinningRemoteDataSource, Continuation continuation) {
        super(2, continuation);
        this.f9008b = pinningRemoteDataSource;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C0668b(this.f9008b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0668b) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object fetchJsonWithFirebaseStorage;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f9007a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        this.f9007a = 1;
        fetchJsonWithFirebaseStorage = this.f9008b.fetchJsonWithFirebaseStorage(this);
        return fetchJsonWithFirebaseStorage == coroutine_suspended ? coroutine_suspended : fetchJsonWithFirebaseStorage;
    }
}
