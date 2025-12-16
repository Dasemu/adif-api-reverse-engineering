package c2;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import e2.InterfaceC0313b;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final /* synthetic */ class j implements InterfaceC0313b, Continuation, d2.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f4260a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4261b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4262c;

    public /* synthetic */ j(ConfigFetchHandler configFetchHandler, long j4, HashMap hashMap) {
        this.f4261b = configFetchHandler;
        this.f4260a = j4;
        this.f4262c = hashMap;
    }

    @Override // d2.f
    public Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        int i = ((Z1.c) this.f4262c).f2180a;
        String num = Integer.toString(i);
        String str = (String) this.f4261b;
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, num});
        try {
            boolean z3 = rawQuery.getCount() > 0;
            rawQuery.close();
            long j4 = this.f4260a;
            if (z3) {
                sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j4 + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i)});
                return null;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(i));
            contentValues.put("events_dropped_count", Long.valueOf(j4));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
            return null;
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }

    @Override // e2.InterfaceC0313b
    public Object execute() {
        l lVar = (l) this.f4261b;
        long q4 = lVar.f4273g.q() + this.f4260a;
        d2.h hVar = (d2.h) lVar.f4269c;
        W1.j jVar = (W1.j) this.f4262c;
        hVar.getClass();
        hVar.s(new d2.e(q4, jVar));
        return null;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        Task lambda$fetch$0;
        lambda$fetch$0 = ((ConfigFetchHandler) this.f4261b).lambda$fetch$0(this.f4260a, (HashMap) this.f4262c, task);
        return lambda$fetch$0;
    }

    public /* synthetic */ j(Object obj, long j4, Object obj2) {
        this.f4261b = obj;
        this.f4262c = obj2;
        this.f4260a = j4;
    }
}
