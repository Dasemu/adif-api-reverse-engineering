package t1;

import com.adif.elcanomovil.repositories.favourites.DefaultFavoritesRepository;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowKt;

/* renamed from: t1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0620e extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f8526a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DefaultFavoritesRepository f8527b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0620e(DefaultFavoritesRepository defaultFavoritesRepository, Continuation continuation) {
        super(2, continuation);
        this.f8527b = defaultFavoritesRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C0620e c0620e = new C0620e(this.f8527b, continuation);
        c0620e.f8526a = obj;
        return c0620e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0620e) create((List) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        return FlowKt.flow(new C0619d((List) this.f8526a, this.f8527b, null));
    }
}
