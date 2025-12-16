package F0;

import android.database.Cursor;
import androidx.room.p;
import androidx.room.u;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.io.CloseableKt;
import w0.InterfaceC0649e;

/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f516a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f517b;

    public /* synthetic */ c(Object obj, int i) {
        this.f516a = i;
        this.f517b = obj;
    }

    public Set a() {
        p pVar = (p) this.f517b;
        Set createSetBuilder = SetsKt.createSetBuilder();
        Cursor query$default = u.query$default(pVar.f3992a, new F.i("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"), null, 2, null);
        while (query$default.moveToNext()) {
            try {
                createSetBuilder.add(Integer.valueOf(query$default.getInt(0)));
            } finally {
            }
        }
        Unit unit = Unit.INSTANCE;
        CloseableKt.closeFinally(query$default, null);
        Set build = SetsKt.build(createSetBuilder);
        if (build.isEmpty()) {
            return build;
        }
        if (((p) this.f517b).h == null) {
            throw new IllegalStateException("Required value was null.");
        }
        InterfaceC0649e interfaceC0649e = ((p) this.f517b).h;
        if (interfaceC0649e == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        interfaceC0649e.o();
        return build;
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 730
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: F0.c.run():void");
    }
}
