package y1;

import com.adif.elcanomovil.serviceNetworking.pinning.Pin;
import com.adif.elcanomovil.serviceNetworking.pinning.PinningRepository;
import e3.C0321g;
import e3.C0322h;
import java.util.ArrayList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public final class c extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f8981a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PinningRepository f8982b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(PinningRepository pinningRepository, Continuation continuation) {
        super(2, continuation);
        this.f8982b = pinningRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new c(this.f8982b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f8981a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.f8981a = 1;
            obj = this.f8982b.getPins(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        ArrayList arrayList = new ArrayList();
        for (Pin pin : (Iterable) obj) {
            String pattern = pin.getPattern();
            String[] pins = {pin.getHash()};
            Intrinsics.checkNotNullParameter(pattern, "pattern");
            Intrinsics.checkNotNullParameter(pins, "pins");
            arrayList.add(new C0321g(pattern, pins[0]));
        }
        return new C0322h(CollectionsKt.toSet(arrayList), null);
    }
}
