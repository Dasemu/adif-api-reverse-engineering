package H1;

import android.text.Spannable;
import com.adif.elcanomovil.domain.entities.FavouriteStation;
import com.adif.elcanomovil.uiHome.mappers.UserFavoriteVOMapper;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: classes2.dex */
public final class a extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public UserFavoriteVOMapper f661a;

    /* renamed from: b, reason: collision with root package name */
    public FavouriteStation f662b;

    /* renamed from: c, reason: collision with root package name */
    public Spannable f663c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f664d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ UserFavoriteVOMapper f665e;

    /* renamed from: f, reason: collision with root package name */
    public int f666f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(UserFavoriteVOMapper userFavoriteVOMapper, Continuation continuation) {
        super(continuation);
        this.f665e = userFavoriteVOMapper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object favouriteStationToStationVO;
        this.f664d = obj;
        this.f666f |= IntCompanionObject.MIN_VALUE;
        favouriteStationToStationVO = this.f665e.favouriteStationToStationVO(null, this);
        return favouriteStationToStationVO;
    }
}
