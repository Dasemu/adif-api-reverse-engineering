package a0;

import Y.C0087c;
import Y.F;
import android.content.Context;
import b0.C0259d;
import b0.C0265j;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public final class c implements ReadOnlyProperty {

    /* renamed from: a, reason: collision with root package name */
    public final String f2323a;

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f2324b;

    /* renamed from: c, reason: collision with root package name */
    public final CoroutineScope f2325c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f2326d;

    /* renamed from: e, reason: collision with root package name */
    public volatile C0259d f2327e;

    public c(String name, Function1 produceMigrations, CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(produceMigrations, "produceMigrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f2323a = name;
        this.f2324b = produceMigrations;
        this.f2325c = scope;
        this.f2326d = new Object();
    }

    @Override // kotlin.properties.ReadOnlyProperty
    public final Object getValue(Object obj, KProperty property) {
        C0259d c0259d;
        Context thisRef = (Context) obj;
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        C0259d c0259d2 = this.f2327e;
        if (c0259d2 != null) {
            return c0259d2;
        }
        synchronized (this.f2326d) {
            try {
                if (this.f2327e == null) {
                    Context applicationContext = thisRef.getApplicationContext();
                    Function1 function1 = this.f2324b;
                    Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
                    List migrations = (List) function1.invoke(applicationContext);
                    CoroutineScope scope = this.f2325c;
                    b produceFile = new b(0, applicationContext, this);
                    Intrinsics.checkNotNullParameter(migrations, "migrations");
                    Intrinsics.checkNotNullParameter(scope, "scope");
                    Intrinsics.checkNotNullParameter(produceFile, "produceFile");
                    C0265j serializer = C0265j.f4163a;
                    J0.e produceFile2 = new J0.e(produceFile, 5);
                    Intrinsics.checkNotNullParameter(serializer, "serializer");
                    Intrinsics.checkNotNullParameter(migrations, "migrations");
                    Intrinsics.checkNotNullParameter(scope, "scope");
                    Intrinsics.checkNotNullParameter(produceFile2, "produceFile");
                    E2.e eVar = new E2.e(20);
                    Intrinsics.checkNotNullParameter(migrations, "migrations");
                    this.f2327e = new C0259d(new F(produceFile2, CollectionsKt.listOf(new C0087c(migrations, null)), eVar, scope));
                }
                c0259d = this.f2327e;
                Intrinsics.checkNotNull(c0259d);
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0259d;
    }
}
