package androidx.room;

import android.content.Context;
import f0.C0338b;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;
import n.C0508b;
import n.ExecutorC0507a;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3973a;

    /* renamed from: b, reason: collision with root package name */
    public final A.a f3974b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f3975c;

    /* renamed from: d, reason: collision with root package name */
    public final t f3976d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f3977e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f3978f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f3979g;

    public g(Context context, C0338b sqliteOpenHelperFactory, A.a migrationContainer, ArrayList arrayList, t journalMode, LinkedHashSet linkedHashSet, ArrayList typeConverters, ArrayList autoMigrationSpecs) {
        ExecutorC0507a transactionExecutor = C0508b.f7833c;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        Intrinsics.checkNotNullParameter(migrationContainer, "migrationContainer");
        Intrinsics.checkNotNullParameter(journalMode, "journalMode");
        Intrinsics.checkNotNullParameter(transactionExecutor, "queryExecutor");
        Intrinsics.checkNotNullParameter(transactionExecutor, "transactionExecutor");
        Intrinsics.checkNotNullParameter(typeConverters, "typeConverters");
        Intrinsics.checkNotNullParameter(autoMigrationSpecs, "autoMigrationSpecs");
        this.f3973a = context;
        this.f3974b = migrationContainer;
        this.f3975c = arrayList;
        this.f3976d = journalMode;
        this.f3977e = linkedHashSet;
        this.f3978f = typeConverters;
        this.f3979g = autoMigrationSpecs;
    }
}
