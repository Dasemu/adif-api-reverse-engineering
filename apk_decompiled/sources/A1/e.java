package A1;

import androidx.room.u;
import androidx.room.y;
import com.adif.elcanomovil.serviceStorage.database.AvisaStationDao_Impl;
import java.util.concurrent.Callable;
import kotlin.Unit;
import w0.InterfaceC0649e;

/* loaded from: classes.dex */
public final class e implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AvisaStationDao_Impl f42b;

    public /* synthetic */ e(AvisaStationDao_Impl avisaStationDao_Impl, int i) {
        this.f41a = i;
        this.f42b = avisaStationDao_Impl;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        AvisaStationDao_Impl avisaStationDao_Impl;
        y yVar;
        y yVar2;
        u uVar;
        u uVar2;
        y yVar3;
        y yVar4;
        u uVar3;
        u uVar4;
        switch (this.f41a) {
            case 0:
                avisaStationDao_Impl = this.f42b;
                yVar = avisaStationDao_Impl.__preparedStmtOfDeleteAll;
                InterfaceC0649e a2 = yVar.a();
                try {
                    uVar = avisaStationDao_Impl.__db;
                    uVar.beginTransaction();
                    try {
                        a2.o();
                        uVar2 = avisaStationDao_Impl.__db;
                        uVar2.setTransactionSuccessful();
                        return Unit.INSTANCE;
                    } finally {
                    }
                } finally {
                    yVar2 = avisaStationDao_Impl.__preparedStmtOfDeleteAll;
                    yVar2.c(a2);
                }
            default:
                avisaStationDao_Impl = this.f42b;
                yVar3 = avisaStationDao_Impl.__preparedStmtOfDeleteCategories;
                InterfaceC0649e a4 = yVar3.a();
                try {
                    uVar3 = avisaStationDao_Impl.__db;
                    uVar3.beginTransaction();
                    try {
                        a4.o();
                        uVar4 = avisaStationDao_Impl.__db;
                        uVar4.setTransactionSuccessful();
                        return Unit.INSTANCE;
                    } finally {
                    }
                } finally {
                    yVar4 = avisaStationDao_Impl.__preparedStmtOfDeleteCategories;
                    yVar4.c(a4);
                }
        }
    }
}
