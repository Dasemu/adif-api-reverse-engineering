package androidx.room;

import android.database.Cursor;
import com.adif.elcanomovil.serviceStorage.database.StationDatabase_Impl;
import java.util.Iterator;
import java.util.List;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import q2.AbstractC0562d;

/* loaded from: classes.dex */
public final class v extends AbstractC0562d {

    /* renamed from: b, reason: collision with root package name */
    public g f4008b;

    /* renamed from: c, reason: collision with root package name */
    public final A.a f4009c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(g configuration, A.a delegate) {
        super(1);
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter("43f5c312adc2ca1d1a2a64bd71784e25", "identityHash");
        Intrinsics.checkNotNullParameter("d72e1d9f03dab3a33bea51ff82bf41a2", "legacyHash");
        this.f4008b = configuration;
        this.f4009c = delegate;
    }

    public static void l(x0.c cVar) {
        cVar.i("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        Intrinsics.checkNotNullParameter("43f5c312adc2ca1d1a2a64bd71784e25", "hash");
        cVar.i("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '43f5c312adc2ca1d1a2a64bd71784e25')");
    }

    @Override // q2.AbstractC0562d
    public final void g(x0.c db) {
        Intrinsics.checkNotNullParameter(db, "db");
        super.g(db);
    }

    @Override // q2.AbstractC0562d
    public final void h(x0.c db) {
        List list;
        Intrinsics.checkNotNullParameter(db, "db");
        Intrinsics.checkNotNullParameter(db, "db");
        Cursor V3 = db.V("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z3 = false;
            if (V3.moveToFirst()) {
                if (V3.getInt(0) == 0) {
                    z3 = true;
                }
            }
            CloseableKt.closeFinally(V3, null);
            A.a aVar = this.f4009c;
            A.a.n(db);
            if (!z3) {
                M.g u3 = A.a.u(db);
                if (!u3.f1075a) {
                    throw new IllegalStateException("Pre-packaged database has an invalid schema: " + ((String) u3.f1076b));
                }
            }
            l(db);
            list = ((StationDatabase_Impl) aVar.f7b).mCallbacks;
            if (list != null) {
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    throw C.w.g(it);
                }
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(V3, th);
                throw th2;
            }
        }
    }

    @Override // q2.AbstractC0562d
    public final void i(x0.c db, int i, int i4) {
        Intrinsics.checkNotNullParameter(db, "db");
        k(db, i, i4);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006b  */
    @Override // q2.AbstractC0562d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(x0.c r6) {
        /*
            r5 = this;
            java.lang.String r0 = "db"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'"
            android.database.Cursor r0 = r6.V(r0)
            boolean r1 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L20
            r2 = 0
            if (r1 == 0) goto L23
            int r1 = r0.getInt(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L23
            r1 = 1
            goto L24
        L20:
            r5 = move-exception
            goto Lb6
        L23:
            r1 = r2
        L24:
            r3 = 0
            kotlin.io.CloseableKt.closeFinally(r0, r3)
            A.a r0 = r5.f4009c
            if (r1 == 0) goto L6b
            F.i r1 = new F.i
            java.lang.String r4 = "SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"
            r1.<init>(r4)
            android.database.Cursor r1 = r6.p(r1)
            boolean r4 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L42
            if (r4 == 0) goto L44
            java.lang.String r2 = r1.getString(r2)     // Catch: java.lang.Throwable -> L42
            goto L45
        L42:
            r5 = move-exception
            goto L65
        L44:
            r2 = r3
        L45:
            kotlin.io.CloseableKt.closeFinally(r1, r3)
            java.lang.String r1 = "43f5c312adc2ca1d1a2a64bd71784e25"
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 != 0) goto L76
            java.lang.String r1 = "d72e1d9f03dab3a33bea51ff82bf41a2"
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 == 0) goto L59
            goto L76
        L59:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: 43f5c312adc2ca1d1a2a64bd71784e25, found: "
            java.lang.String r6 = C.w.z(r6, r2)
            r5.<init>(r6)
            throw r5
        L65:
            throw r5     // Catch: java.lang.Throwable -> L66
        L66:
            r6 = move-exception
            kotlin.io.CloseableKt.closeFinally(r1, r5)
            throw r6
        L6b:
            M.g r1 = A.a.u(r6)
            boolean r2 = r1.f1075a
            if (r2 == 0) goto L9e
            l(r6)
        L76:
            java.lang.Object r0 = r0.f7b
            com.adif.elcanomovil.serviceStorage.database.StationDatabase_Impl r0 = (com.adif.elcanomovil.serviceStorage.database.StationDatabase_Impl) r0
            com.adif.elcanomovil.serviceStorage.database.StationDatabase_Impl.access$202(r0, r6)
            java.lang.String r1 = "PRAGMA foreign_keys = ON"
            r6.i(r1)
            com.adif.elcanomovil.serviceStorage.database.StationDatabase_Impl.access$300(r0, r6)
            java.util.List r6 = com.adif.elcanomovil.serviceStorage.database.StationDatabase_Impl.access$400(r0)
            if (r6 == 0) goto L9b
            java.util.Iterator r6 = r6.iterator()
            boolean r0 = r6.hasNext()
            if (r0 != 0) goto L96
            goto L9b
        L96:
            java.lang.ClassCastException r5 = C.w.g(r6)
            throw r5
        L9b:
            r5.f4008b = r3
            return
        L9e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "Pre-packaged database has an invalid schema: "
            r6.<init>(r0)
            java.lang.Object r0 = r1.f1076b
            java.lang.String r0 = (java.lang.String) r0
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        Lb6:
            throw r5     // Catch: java.lang.Throwable -> Lb7
        Lb7:
            r6 = move-exception
            kotlin.io.CloseableKt.closeFinally(r0, r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.v.j(x0.c):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0094 A[EDGE_INSN: B:86:0x0094->B:69:0x0094 BREAK  A[LOOP:2: B:48:0x002c->B:70:?], SYNTHETIC] */
    @Override // q2.AbstractC0562d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(x0.c r18, int r19, int r20) {
        /*
            Method dump skipped, instructions count: 435
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.v.k(x0.c, int, int):void");
    }
}
