package A1;

import androidx.room.u;
import androidx.room.y;
import com.adif.elcanomovil.serviceStorage.database.FavouritesDao_Impl;
import com.adif.elcanomovil.serviceStorage.database.IncidenceDao_Impl;
import com.adif.elcanomovil.serviceStorage.database.StationsDao_Impl;
import java.util.concurrent.Callable;
import kotlin.Unit;
import w0.InterfaceC0649e;

/* loaded from: classes.dex */
public final class l implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f63a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f64b;

    public /* synthetic */ l(Object obj, int i) {
        this.f63a = i;
        this.f64b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        y yVar;
        y yVar2;
        u uVar;
        u uVar2;
        u uVar3;
        switch (this.f63a) {
            case 0:
                FavouritesDao_Impl favouritesDao_Impl = (FavouritesDao_Impl) this.f64b;
                yVar = favouritesDao_Impl.__preparedStmtOfDeleteAll;
                InterfaceC0649e a2 = yVar.a();
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
                    yVar2 = favouritesDao_Impl.__preparedStmtOfDeleteAll;
                    yVar2.c(a2);
                }
            case 1:
                IncidenceDao_Impl incidenceDao_Impl = (IncidenceDao_Impl) this.f64b;
                InterfaceC0649e a4 = IncidenceDao_Impl.access$500(incidenceDao_Impl).a();
                try {
                    IncidenceDao_Impl.access$200(incidenceDao_Impl).beginTransaction();
                    try {
                        a4.o();
                        IncidenceDao_Impl.access$200(incidenceDao_Impl).setTransactionSuccessful();
                        return Unit.INSTANCE;
                    } finally {
                        IncidenceDao_Impl.access$200(incidenceDao_Impl).endTransaction();
                    }
                } finally {
                    IncidenceDao_Impl.access$500(incidenceDao_Impl).c(a4);
                }
            default:
                StationsDao_Impl stationsDao_Impl = (StationsDao_Impl) this.f64b;
                InterfaceC0649e a5 = StationsDao_Impl.access$200(stationsDao_Impl).a();
                try {
                    StationsDao_Impl.access$000(stationsDao_Impl).beginTransaction();
                    try {
                        a5.o();
                        StationsDao_Impl.access$000(stationsDao_Impl).setTransactionSuccessful();
                        return Unit.INSTANCE;
                    } finally {
                        StationsDao_Impl.access$000(stationsDao_Impl).endTransaction();
                    }
                } finally {
                    StationsDao_Impl.access$200(stationsDao_Impl).c(a5);
                }
        }
    }
}
