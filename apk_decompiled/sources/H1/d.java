package H1;

import com.adif.elcanomovil.uiHome.mappers.UserFavoriteVOMapper;
import java.util.Collection;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: classes2.dex */
public final class d extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public UserFavoriteVOMapper f679a;

    /* renamed from: b, reason: collision with root package name */
    public Collection f680b;

    /* renamed from: c, reason: collision with root package name */
    public Iterator f681c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f682d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ UserFavoriteVOMapper f683e;

    /* renamed from: f, reason: collision with root package name */
    public int f684f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(UserFavoriteVOMapper userFavoriteVOMapper, Continuation continuation) {
        super(continuation);
        this.f683e = userFavoriteVOMapper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f682d = obj;
        this.f684f |= IntCompanionObject.MIN_VALUE;
        return this.f683e.mapFavourites(null, this);
    }
}
