package d2;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import g2.AbstractC0377a;

/* loaded from: classes3.dex */
public final /* synthetic */ class e implements f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f6180a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ W1.j f6181b;

    public /* synthetic */ e(long j4, W1.j jVar) {
        this.f6180a = j4;
        this.f6181b = jVar;
    }

    @Override // d2.f
    public final Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.f6180a));
        W1.j jVar = this.f6181b;
        String str = jVar.f1933a;
        T1.d dVar = jVar.f1935c;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(AbstractC0377a.a(dVar))}) < 1) {
            contentValues.put("backend_name", jVar.f1933a);
            contentValues.put("priority", Integer.valueOf(AbstractC0377a.a(dVar)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }
}
