package H1;

import android.text.Spannable;
import com.adif.elcanomovil.uiHome.mappers.UserFavoriteVOMapper;
import java.util.Collection;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: classes2.dex */
public final class e extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public UserFavoriteVOMapper f685a;

    /* renamed from: b, reason: collision with root package name */
    public Collection f686b;

    /* renamed from: c, reason: collision with root package name */
    public Iterator f687c;

    /* renamed from: d, reason: collision with root package name */
    public String f688d;

    /* renamed from: e, reason: collision with root package name */
    public Spannable f689e;

    /* renamed from: f, reason: collision with root package name */
    public String f690f;

    /* renamed from: g, reason: collision with root package name */
    public Collection f691g;
    public /* synthetic */ Object h;
    public final /* synthetic */ UserFavoriteVOMapper i;

    /* renamed from: j, reason: collision with root package name */
    public int f692j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(UserFavoriteVOMapper userFavoriteVOMapper, Continuation continuation) {
        super(continuation);
        this.i = userFavoriteVOMapper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.f692j |= IntCompanionObject.MIN_VALUE;
        return this.i.mapTrainFavourites(null, this);
    }
}
