package A1;

import androidx.room.u;
import androidx.room.y;
import com.adif.elcanomovil.serviceStorage.database.FavouritesDao_Impl;
import java.util.concurrent.Callable;
import kotlin.Unit;
import w0.InterfaceC0649e;

/* loaded from: classes.dex */
public final class i implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f53a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f54b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f55c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ FavouritesDao_Impl f56d;

    public i(FavouritesDao_Impl favouritesDao_Impl, String str, String str2, String str3) {
        this.f56d = favouritesDao_Impl;
        this.f53a = str;
        this.f54b = str2;
        this.f55c = str3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        y yVar;
        y yVar2;
        u uVar;
        u uVar2;
        u uVar3;
        FavouritesDao_Impl favouritesDao_Impl = this.f56d;
        yVar = favouritesDao_Impl.__preparedStmtOfDeleteFavouriteTrain;
        InterfaceC0649e a2 = yVar.a();
        a2.k(1, this.f53a);
        a2.k(2, this.f54b);
        a2.k(3, this.f55c);
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
            yVar2 = favouritesDao_Impl.__preparedStmtOfDeleteFavouriteTrain;
            yVar2.c(a2);
        }
    }
}
