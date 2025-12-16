package z1;

import com.adif.elcanomovil.serviceNetworking.pinning.PinningRemoteDataSource;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: z1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0667a extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f9004a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PinningRemoteDataSource f9005b;

    /* renamed from: c, reason: collision with root package name */
    public int f9006c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0667a(PinningRemoteDataSource pinningRemoteDataSource, Continuation continuation) {
        super(continuation);
        this.f9005b = pinningRemoteDataSource;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object fetchJsonWithFirebaseStorage;
        this.f9004a = obj;
        this.f9006c |= IntCompanionObject.MIN_VALUE;
        fetchJsonWithFirebaseStorage = this.f9005b.fetchJsonWithFirebaseStorage(this);
        return fetchJsonWithFirebaseStorage;
    }
}
