package q1;

import com.adif.elcanomovil.repositories.circulation.DefaultCirculationRepository;
import com.adif.elcanomovil.serviceStorage.preferences.PreferenceStorage;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public final class f extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DefaultCirculationRepository f8175a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f8176b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(DefaultCirculationRepository defaultCirculationRepository, String str, Continuation continuation) {
        super(2, continuation);
        this.f8175a = defaultCirculationRepository;
        this.f8176b = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new f(this.f8175a, this.f8176b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        PreferenceStorage preferenceStorage;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        preferenceStorage = this.f8175a.storage;
        preferenceStorage.setLastDeparturesArrivalsStationToCode(this.f8176b);
        return Unit.INSTANCE;
    }
}
