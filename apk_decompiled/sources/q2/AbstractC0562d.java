package q2;

import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;

/* renamed from: q2.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0562d {

    /* renamed from: a, reason: collision with root package name */
    public final int f8189a;

    public static void a(String str) {
        boolean equals;
        equals = StringsKt__StringsJVMKt.equals(str, ":memory:", true);
        if (equals) {
            return;
        }
        int length = str.length() - 1;
        int i = 0;
        boolean z3 = false;
        while (i <= length) {
            boolean z4 = Intrinsics.compare((int) str.charAt(!z3 ? i : length), 32) <= 0;
            if (z3) {
                if (!z4) {
                    break;
                } else {
                    length--;
                }
            } else if (z4) {
                i++;
            } else {
                z3 = true;
            }
        }
        if (str.subSequence(i, length + 1).toString().length() == 0) {
            return;
        }
        Log.w("SupportSQLite", "deleting the database file: ".concat(str));
        try {
            File file = new File(str);
            Intrinsics.checkNotNullParameter(file, "file");
            SQLiteDatabase.deleteDatabase(file);
        } catch (Exception e4) {
            Log.w("SupportSQLite", "delete failed: ", e4);
        }
    }

    public abstract int b();

    public abstract int c();

    public abstract int d();

    public abstract int e();

    public abstract int f();

    public void g(x0.c db) {
        Intrinsics.checkNotNullParameter(db, "db");
    }

    public abstract void h(x0.c cVar);

    public abstract void i(x0.c cVar, int i, int i4);

    public abstract void j(x0.c cVar);

    public abstract void k(x0.c cVar, int i, int i4);
}
