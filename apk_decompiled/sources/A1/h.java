package A1;

import androidx.room.u;
import androidx.room.y;
import com.adif.elcanomovil.serviceStorage.database.FavouritesDao_Impl;
import java.util.concurrent.Callable;
import kotlin.Unit;
import w0.InterfaceC0649e;

/* loaded from: classes.dex */
public final class h implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f48a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f49b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f50c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f51d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ FavouritesDao_Impl f52e;

    public h(FavouritesDao_Impl favouritesDao_Impl, int i, int i4, boolean z3, String str) {
        this.f52e = favouritesDao_Impl;
        this.f48a = i;
        this.f49b = i4;
        this.f50c = z3;
        this.f51d = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        y yVar;
        y yVar2;
        u uVar;
        u uVar2;
        u uVar3;
        FavouritesDao_Impl favouritesDao_Impl = this.f52e;
        yVar = favouritesDao_Impl.__preparedStmtOfDeleteFavouriteRouteType;
        InterfaceC0649e a2 = yVar.a();
        a2.I(1, this.f48a);
        a2.I(2, this.f49b);
        a2.I(3, this.f50c ? 1L : 0L);
        a2.k(4, this.f51d);
        try {
            uVar = favouritesDao_Impl.__db;
            uVar.beginTransaction();
            try {
                a2.o();
                uVar3 = favouritesDao_Impl.__db;
                uVar3.setTransactionSuccessful();
                return Unit.INSTANCE;
            } finally {
                uVar2 = favouritesDao_Impl.__db;
                uVar2.endTransaction();
            }
        } finally {
            yVar2 = favouritesDao_Impl.__preparedStmtOfDeleteFavouriteRouteType;
            yVar2.c(a2);
        }
    }
}
