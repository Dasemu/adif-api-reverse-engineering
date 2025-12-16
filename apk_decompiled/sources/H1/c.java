package H1;

import com.adif.elcanomovil.uiHome.mappers.UserFavoriteVOMapper;
import java.io.Serializable;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: classes2.dex */
public final class c extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public Object f672a;

    /* renamed from: b, reason: collision with root package name */
    public Object f673b;

    /* renamed from: c, reason: collision with root package name */
    public Serializable f674c;

    /* renamed from: d, reason: collision with root package name */
    public Object[] f675d;

    /* renamed from: e, reason: collision with root package name */
    public Object[] f676e;

    /* renamed from: f, reason: collision with root package name */
    public int f677f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f678g;
    public final /* synthetic */ UserFavoriteVOMapper h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(UserFavoriteVOMapper userFavoriteVOMapper, Continuation continuation) {
        super(continuation);
        this.h = userFavoriteVOMapper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object trainSubTitle;
        this.f678g = obj;
        this.i |= IntCompanionObject.MIN_VALUE;
        trainSubTitle = this.h.getTrainSubTitle(null, this);
        return trainSubTitle;
    }
}
