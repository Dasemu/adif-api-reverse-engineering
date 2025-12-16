package H1;

import com.adif.elcanomovil.uiHome.mappers.UserFavoriteVOMapper;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: classes2.dex */
public final class b extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public UserFavoriteVOMapper f667a;

    /* renamed from: b, reason: collision with root package name */
    public StringBuilder f668b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f669c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ UserFavoriteVOMapper f670d;

    /* renamed from: e, reason: collision with root package name */
    public int f671e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(UserFavoriteVOMapper userFavoriteVOMapper, Continuation continuation) {
        super(continuation);
        this.f670d = userFavoriteVOMapper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object subtitle;
        this.f669c = obj;
        this.f671e |= IntCompanionObject.MIN_VALUE;
        subtitle = this.f670d.getSubtitle(null, this);
        return subtitle;
    }
}
