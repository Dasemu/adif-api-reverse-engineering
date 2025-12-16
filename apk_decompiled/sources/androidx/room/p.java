package androidx.room;

import a.AbstractC0105a;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import com.adif.elcanomovil.serviceStorage.database.StationDatabase_Impl;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import o.C0520f;
import w0.InterfaceC0645a;
import w0.InterfaceC0649e;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: n, reason: collision with root package name */
    public static final String[] f3991n = {"UPDATE", "DELETE", "INSERT"};

    /* renamed from: a, reason: collision with root package name */
    public final StationDatabase_Impl f3992a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f3993b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f3994c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f3995d;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f3996e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f3997f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f3998g;
    public volatile InterfaceC0649e h;
    public final n i;

    /* renamed from: j, reason: collision with root package name */
    public final C0520f f3999j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f4000k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f4001l;

    /* renamed from: m, reason: collision with root package name */
    public final F0.c f4002m;

    public p(StationDatabase_Impl database, HashMap shadowTablesMap, HashMap viewTables, String... tableNames) {
        String str;
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullParameter(shadowTablesMap, "shadowTablesMap");
        Intrinsics.checkNotNullParameter(viewTables, "viewTables");
        Intrinsics.checkNotNullParameter(tableNames, "tableNames");
        this.f3992a = database;
        this.f3993b = shadowTablesMap;
        this.f3994c = viewTables;
        this.f3997f = new AtomicBoolean(false);
        this.i = new n(tableNames.length);
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullExpressionValue(Collections.newSetFromMap(new IdentityHashMap()), "newSetFromMap(IdentityHashMap())");
        this.f3999j = new C0520f();
        this.f4000k = new Object();
        this.f4001l = new Object();
        this.f3995d = new LinkedHashMap();
        int length = tableNames.length;
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            String str2 = tableNames[i];
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase = str2.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            this.f3995d.put(lowerCase, Integer.valueOf(i));
            String str3 = (String) this.f3993b.get(tableNames[i]);
            if (str3 != null) {
                Intrinsics.checkNotNullExpressionValue(US, "US");
                str = str3.toLowerCase(US);
                Intrinsics.checkNotNullExpressionValue(str, "this as java.lang.String).toLowerCase(locale)");
            } else {
                str = null;
            }
            if (str != null) {
                lowerCase = str;
            }
            strArr[i] = lowerCase;
        }
        this.f3996e = strArr;
        for (Map.Entry entry : this.f3993b.entrySet()) {
            String str4 = (String) entry.getValue();
            Locale US2 = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US2, "US");
            String lowerCase2 = str4.toLowerCase(US2);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            if (this.f3995d.containsKey(lowerCase2)) {
                String str5 = (String) entry.getKey();
                Intrinsics.checkNotNullExpressionValue(US2, "US");
                String lowerCase3 = str5.toLowerCase(US2);
                Intrinsics.checkNotNullExpressionValue(lowerCase3, "this as java.lang.String).toLowerCase(locale)");
                LinkedHashMap linkedHashMap = this.f3995d;
                linkedHashMap.put(lowerCase3, MapsKt.a(linkedHashMap, lowerCase2));
            }
        }
        this.f4002m = new F0.c(this, 6);
    }

    public final boolean a() {
        if (!this.f3992a.isOpenInternal()) {
            return false;
        }
        if (!this.f3998g) {
            this.f3992a.getOpenHelper().S();
        }
        if (this.f3998g) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    public final void b(F.i observer) {
        o oVar;
        boolean z3;
        Intrinsics.checkNotNullParameter(observer, "observer");
        synchronized (this.f3999j) {
            oVar = (o) this.f3999j.c(observer);
        }
        if (oVar != null) {
            n nVar = this.i;
            int[] iArr = oVar.f3988b;
            int[] tableIds = Arrays.copyOf(iArr, iArr.length);
            nVar.getClass();
            Intrinsics.checkNotNullParameter(tableIds, "tableIds");
            synchronized (nVar) {
                try {
                    z3 = false;
                    for (int i : tableIds) {
                        long[] jArr = nVar.f3983a;
                        long j4 = jArr[i];
                        jArr[i] = j4 - 1;
                        if (j4 == 1) {
                            nVar.f3986d = true;
                            z3 = true;
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z3) {
                StationDatabase_Impl stationDatabase_Impl = this.f3992a;
                if (stationDatabase_Impl.isOpenInternal()) {
                    d(stationDatabase_Impl.getOpenHelper().S());
                }
            }
        }
    }

    public final void c(InterfaceC0645a interfaceC0645a, int i) {
        interfaceC0645a.i("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i + ", 0)");
        String str = this.f3996e[i];
        String[] strArr = f3991n;
        for (int i4 = 0; i4 < 3; i4++) {
            String str2 = strArr[i4];
            String str3 = "CREATE TEMP TRIGGER IF NOT EXISTS " + AbstractC0105a.C(str, str2) + " AFTER " + str2 + " ON `" + str + "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = " + i + " AND invalidated = 0; END";
            Intrinsics.checkNotNullExpressionValue(str3, "StringBuilder().apply(builderAction).toString()");
            interfaceC0645a.i(str3);
        }
    }

    public final void d(InterfaceC0645a database) {
        Intrinsics.checkNotNullParameter(database, "database");
        if (database.B()) {
            return;
        }
        try {
            Lock closeLock$room_runtime_release = this.f3992a.getCloseLock$room_runtime_release();
            closeLock$room_runtime_release.lock();
            try {
                synchronized (this.f4000k) {
                    int[] a2 = this.i.a();
                    if (a2 != null) {
                        Intrinsics.checkNotNullParameter(database, "database");
                        if (database.G()) {
                            database.K();
                        } else {
                            database.c();
                        }
                        try {
                            int length = a2.length;
                            int i = 0;
                            int i4 = 0;
                            while (i < length) {
                                int i5 = a2[i];
                                int i6 = i4 + 1;
                                if (i5 == 1) {
                                    c(database, i4);
                                } else if (i5 == 2) {
                                    String str = this.f3996e[i4];
                                    String[] strArr = f3991n;
                                    for (int i7 = 0; i7 < 3; i7++) {
                                        String str2 = "DROP TRIGGER IF EXISTS " + AbstractC0105a.C(str, strArr[i7]);
                                        Intrinsics.checkNotNullExpressionValue(str2, "StringBuilder().apply(builderAction).toString()");
                                        database.i(str2);
                                    }
                                }
                                i++;
                                i4 = i6;
                            }
                            database.J();
                            database.b();
                            Unit unit = Unit.INSTANCE;
                        } catch (Throwable th) {
                            database.b();
                            throw th;
                        }
                    }
                }
            } finally {
                closeLock$room_runtime_release.unlock();
            }
        } catch (SQLiteException e4) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e4);
        } catch (IllegalStateException e5) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e5);
        }
    }
}
