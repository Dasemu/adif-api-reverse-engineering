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

/* renamed from: t1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0618c extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f8520a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DefaultFavoritesRepository f8521b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0618c(DefaultFavoritesRepository defaultFavoritesRepository, Continuation continuation) {
        super(2, continuation);
        this.f8521b = defaultFavoritesRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C0618c c0618c = new C0618c(this.f8521b, continuation);
        c0618c.f8520a = obj;
        return c0618c;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0618c) create((List) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        return FlowKt.flow(new C0617b((List) this.f8520a, this.f8521b, null));
    }
}
