package m1;

import com.adif.elcanomovil.domain.usecases.logos.ManageLogosUseCase;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: m1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0505b extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public ManageLogosUseCase f7796a;

    /* renamed from: b, reason: collision with root package name */
    public String f7797b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f7798c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ManageLogosUseCase f7799d;

    /* renamed from: e, reason: collision with root package name */
    public int f7800e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0505b(ManageLogosUseCase manageLogosUseCase, Continuation continuation) {
        super(continuation);
        this.f7799d = manageLogosUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f7798c = obj;
        this.f7800e |= IntCompanionObject.MIN_VALUE;
        return this.f7799d.invoke(null, this);
    }
}
