package A1;

import androidx.room.u;
import androidx.room.y;
import com.adif.elcanomovil.serviceStorage.database.SubscriptionsDao_Impl;
import java.util.concurrent.Callable;
import kotlin.Unit;
import w0.InterfaceC0649e;

/* loaded from: classes.dex */
public final class r implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f76a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SubscriptionsDao_Impl f77b;

    public r(SubscriptionsDao_Impl subscriptionsDao_Impl, int i) {
        this.f77b = subscriptionsDao_Impl;
        this.f76a = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        y yVar;
        y yVar2;
        u uVar;
        u uVar2;
        u uVar3;
        SubscriptionsDao_Impl subscriptionsDao_Impl = this.f77b;
        yVar = subscriptionsDao_Impl.__preparedStmtOfDelete;
        InterfaceC0649e a2 = yVar.a();
        a2.I(1, this.f76a);
        try {
            uVar = subscriptionsDao_Impl.__db;
            uVar.beginTransaction();
            try {
                a2.o();
                uVar3 = subscriptionsDao_Impl.__db;
                uVar3.setTransactionSuccessful();
                return Unit.INSTANCE;
            } finally {
                uVar2 = subscriptionsDao_Impl.__db;
                uVar2.endTransaction();
            }
        } finally {
            yVar2 = subscriptionsDao_Impl.__preparedStmtOfDelete;
            yVar2.c(a2);
        }
    }
}
