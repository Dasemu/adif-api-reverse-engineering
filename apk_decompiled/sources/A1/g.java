package A1;

import androidx.room.u;
import androidx.room.y;
import com.adif.elcanomovil.serviceStorage.database.FavouritesDao_Impl;
import java.util.concurrent.Callable;
import kotlin.Unit;
import w0.InterfaceC0649e;

/* loaded from: classes.dex */
public final class g implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f45b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f46c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ FavouritesDao_Impl f47d;

    public g(FavouritesDao_Impl favouritesDao_Impl, int i, boolean z3, String str) {
        this.f47d = favouritesDao_Impl;
        this.f44a = i;
        this.f45b = z3;
        this.f46c = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        y yVar;
        y yVar2;
        u uVar;
        u uVar2;
        u uVar3;
        FavouritesDao_Impl favouritesDao_Impl = this.f47d;
        yVar = favouritesDao_Impl.__preparedStmtOfDeleteFavouriteStationType;
        InterfaceC0649e a2 = yVar.a();
        a2.I(1, this.f44a);
        a2.I(2, this.f45b ? 1L : 0L);
        a2.k(3, this.f46c);
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
            yVar2 = favouritesDao_Impl.__preparedStmtOfDeleteFavouriteStationType;
            yVar2.c(a2);
        }
    }
}
