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

/* renamed from: t1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0622g extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f8532a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DefaultFavoritesRepository f8533b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0622g(DefaultFavoritesRepository defaultFavoritesRepository, Continuation continuation) {
        super(2, continuation);
        this.f8533b = defaultFavoritesRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C0622g c0622g = new C0622g(this.f8533b, continuation);
        c0622g.f8532a = obj;
        return c0622g;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0622g) create((List) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        return FlowKt.flow(new C0621f((List) this.f8532a, this.f8533b, null));
    }
}
