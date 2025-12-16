package A1;

import com.adif.elcanomovil.serviceStorage.database.AvisaStationDao_Impl;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class d implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f39b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AvisaStationDao_Impl f40c;

    public /* synthetic */ d(AvisaStationDao_Impl avisaStationDao_Impl, List list, int i) {
        this.f38a = i;
        this.f40c = avisaStationDao_Impl;
        this.f39b = list;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        AvisaStationDao_Impl avisaStationDao_Impl;
        switch (this.f38a) {
            case 0:
                avisaStationDao_Impl = this.f40c;
                AvisaStationDao_Impl.access$000(avisaStationDao_Impl).beginTransaction();
                try {
                    AvisaStationDao_Impl.access$100(avisaStationDao_Impl).e(this.f39b);
                    AvisaStationDao_Impl.access$000(avisaStationDao_Impl).setTransactionSuccessful();
                    return Unit.INSTANCE;
                } finally {
                }
            default:
                avisaStationDao_Impl = this.f40c;
                AvisaStationDao_Impl.access$000(avisaStationDao_Impl).beginTransaction();
                try {
                    AvisaStationDao_Impl.access$200(avisaStationDao_Impl).e(this.f39b);
                    AvisaStationDao_Impl.access$000(avisaStationDao_Impl).setTransactionSuccessful();
                    return Unit.INSTANCE;
                } finally {
                }
        }
    }
}
