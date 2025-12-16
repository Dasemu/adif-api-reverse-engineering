package A1;

import com.adif.elcanomovil.serviceStorage.database.FavouritesDao_Impl;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class k implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f60a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f61b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FavouritesDao_Impl f62c;

    public /* synthetic */ k(FavouritesDao_Impl favouritesDao_Impl, List list, int i) {
        this.f60a = i;
        this.f62c = favouritesDao_Impl;
        this.f61b = list;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        FavouritesDao_Impl favouritesDao_Impl;
        switch (this.f60a) {
            case 0:
                favouritesDao_Impl = this.f62c;
                FavouritesDao_Impl.access$000(favouritesDao_Impl).beginTransaction();
                try {
                    FavouritesDao_Impl.access$100(favouritesDao_Impl).e(this.f61b);
                    FavouritesDao_Impl.access$000(favouritesDao_Impl).setTransactionSuccessful();
                    return Unit.INSTANCE;
                } finally {
                }
            default:
                favouritesDao_Impl = this.f62c;
                FavouritesDao_Impl.access$000(favouritesDao_Impl).beginTransaction();
                try {
                    FavouritesDao_Impl.access$200(favouritesDao_Impl).e(this.f61b);
                    FavouritesDao_Impl.access$000(favouritesDao_Impl).setTransactionSuccessful();
                    return Unit.INSTANCE;
                } finally {
                }
        }
    }
}
