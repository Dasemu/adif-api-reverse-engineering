package androidx.room;

import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.Log;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmSuppressWildcards;
import kotlin.jvm.internal.Intrinsics;
import n.C0508b;
import w0.InterfaceC0645a;
import w0.InterfaceC0646b;
import w0.InterfaceC0648d;
import w0.InterfaceC0649e;

/* loaded from: classes.dex */
public abstract class u {
    public static final s Companion = new Object();
    public static final int MAX_BIND_PARAMETER_CNT = 999;
    private boolean allowMainThreadQueries;
    private AbstractC0249a autoCloser;
    private final Map<String, Object> backingFieldMap;
    private InterfaceC0646b internalOpenHelper;
    private Executor internalQueryExecutor;
    private Executor internalTransactionExecutor;

    @JvmField
    protected List<Object> mCallbacks;

    @JvmField
    protected volatile InterfaceC0645a mDatabase;
    private final Map<Class<?>, Object> typeConverters;
    private boolean writeAheadLoggingEnabled;
    private final p invalidationTracker = createInvalidationTracker();
    private Map<Class<Object>, Object> autoMigrationSpecs = new LinkedHashMap();
    private final ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();
    private final ThreadLocal<Integer> suspendingTransactionId = new ThreadLocal<>();

    public u() {
        Map<String, Object> synchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        Intrinsics.checkNotNullExpressionValue(synchronizedMap, "synchronizedMap(mutableMapOf())");
        this.backingFieldMap = synchronizedMap;
        this.typeConverters = new LinkedHashMap();
    }

    public static final void access$internalBeginTransaction(u uVar) {
        uVar.assertNotMainThread();
        InterfaceC0645a S3 = uVar.getOpenHelper().S();
        uVar.getInvalidationTracker().d(S3);
        if (S3.G()) {
            S3.K();
        } else {
            S3.c();
        }
    }

    public static Object b(Class cls, InterfaceC0646b interfaceC0646b) {
        if (cls.isInstance(interfaceC0646b)) {
            return interfaceC0646b;
        }
        if (!(interfaceC0646b instanceof h)) {
            return null;
        }
        ((h) interfaceC0646b).getClass();
        return b(cls, null);
    }

    @Deprecated(message = "Will be hidden in a future release.")
    public static /* synthetic */ void getMCallbacks$annotations() {
    }

    @Deprecated(message = "Will be hidden in the next release.")
    public static /* synthetic */ void getMDatabase$annotations() {
    }

    public static /* synthetic */ void isOpen$annotations() {
    }

    public static /* synthetic */ void isOpenInternal$annotations() {
    }

    public static /* synthetic */ Cursor query$default(u uVar, InterfaceC0648d interfaceC0648d, CancellationSignal cancellationSignal, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: query");
        }
        if ((i & 2) != 0) {
            cancellationSignal = null;
        }
        return uVar.query(interfaceC0648d, cancellationSignal);
    }

    public final void a() {
        getOpenHelper().S().b();
        if (inTransaction()) {
            return;
        }
        p invalidationTracker = getInvalidationTracker();
        if (invalidationTracker.f3997f.compareAndSet(false, true)) {
            invalidationTracker.f3992a.getQueryExecutor().execute(invalidationTracker.f4002m);
        }
    }

    public void assertNotMainThread() {
        if (!this.allowMainThreadQueries && isMainThread$room_runtime_release()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public void assertNotSuspendingTransaction() {
        if (!inTransaction() && this.suspendingTransactionId.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    @Deprecated(message = "beginTransaction() is deprecated", replaceWith = @ReplaceWith(expression = "runInTransaction(Runnable)", imports = {}))
    public void beginTransaction() {
        assertNotMainThread();
        assertNotMainThread();
        InterfaceC0645a S3 = getOpenHelper().S();
        getInvalidationTracker().d(S3);
        if (S3.G()) {
            S3.K();
        } else {
            S3.c();
        }
    }

    public abstract void clearAllTables();

    public void close() {
        if (isOpen()) {
            ReentrantReadWriteLock.WriteLock writeLock = this.readWriteLock.writeLock();
            Intrinsics.checkNotNullExpressionValue(writeLock, "readWriteLock.writeLock()");
            writeLock.lock();
            try {
                getInvalidationTracker().getClass();
                getOpenHelper().close();
            } finally {
                writeLock.unlock();
            }
        }
    }

    public InterfaceC0649e compileStatement(String sql) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        assertNotMainThread();
        assertNotSuspendingTransaction();
        return getOpenHelper().S().q(sql);
    }

    public abstract p createInvalidationTracker();

    public abstract InterfaceC0646b createOpenHelper(g gVar);

    @Deprecated(message = "endTransaction() is deprecated", replaceWith = @ReplaceWith(expression = "runInTransaction(Runnable)", imports = {}))
    public void endTransaction() {
        a();
    }

    public final Map<Class<Object>, Object> getAutoMigrationSpecs() {
        return this.autoMigrationSpecs;
    }

    @JvmSuppressWildcards
    public List<Object> getAutoMigrations(Map<Class<Object>, Object> autoMigrationSpecs) {
        Intrinsics.checkNotNullParameter(autoMigrationSpecs, "autoMigrationSpecs");
        return CollectionsKt.emptyList();
    }

    public final Map<String, Object> getBackingFieldMap() {
        return this.backingFieldMap;
    }

    public final Lock getCloseLock$room_runtime_release() {
        ReentrantReadWriteLock.ReadLock readLock = this.readWriteLock.readLock();
        Intrinsics.checkNotNullExpressionValue(readLock, "readWriteLock.readLock()");
        return readLock;
    }

    public p getInvalidationTracker() {
        return this.invalidationTracker;
    }

    public InterfaceC0646b getOpenHelper() {
        InterfaceC0646b interfaceC0646b = this.internalOpenHelper;
        if (interfaceC0646b != null) {
            return interfaceC0646b;
        }
        Intrinsics.throwUninitializedPropertyAccessException("internalOpenHelper");
        return null;
    }

    public Executor getQueryExecutor() {
        Executor executor = this.internalQueryExecutor;
        if (executor != null) {
            return executor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("internalQueryExecutor");
        return null;
    }

    public Set<Class<Object>> getRequiredAutoMigrationSpecs() {
        return SetsKt.emptySet();
    }

    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        return MapsKt.emptyMap();
    }

    public final ThreadLocal<Integer> getSuspendingTransactionId() {
        return this.suspendingTransactionId;
    }

    public Executor getTransactionExecutor() {
        Executor executor = this.internalTransactionExecutor;
        if (executor != null) {
            return executor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("internalTransactionExecutor");
        return null;
    }

    public <T> T getTypeConverter(Class<T> klass) {
        Intrinsics.checkNotNullParameter(klass, "klass");
        return (T) this.typeConverters.get(klass);
    }

    public boolean inTransaction() {
        return getOpenHelper().S().B();
    }

    public void init(g configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.internalOpenHelper = createOpenHelper(configuration);
        Set<Class<Object>> requiredAutoMigrationSpecs = getRequiredAutoMigrationSpecs();
        BitSet bitSet = new BitSet();
        Iterator<Class<Object>> it = requiredAutoMigrationSpecs.iterator();
        while (true) {
            int i = -1;
            if (it.hasNext()) {
                Class<Object> next = it.next();
                int size = configuration.f3979g.size() - 1;
                ArrayList arrayList = configuration.f3979g;
                if (size >= 0) {
                    while (true) {
                        int i4 = size - 1;
                        if (next.isAssignableFrom(arrayList.get(size).getClass())) {
                            bitSet.set(size);
                            i = size;
                            break;
                        } else if (i4 < 0) {
                            break;
                        } else {
                            size = i4;
                        }
                    }
                }
                if (i < 0) {
                    throw new IllegalArgumentException(("A required auto migration spec (" + next.getCanonicalName() + ") is missing in the database configuration.").toString());
                }
                this.autoMigrationSpecs.put(next, arrayList.get(i));
            } else {
                int size2 = configuration.f3979g.size() - 1;
                if (size2 >= 0) {
                    while (true) {
                        int i5 = size2 - 1;
                        if (!bitSet.get(size2)) {
                            throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                        }
                        if (i5 < 0) {
                            break;
                        } else {
                            size2 = i5;
                        }
                    }
                }
                Iterator<Object> it2 = getAutoMigrations(this.autoMigrationSpecs).iterator();
                if (it2.hasNext()) {
                    throw C.w.g(it2);
                }
                if (b(AbstractC0250b.class, getOpenHelper()) != null) {
                    throw new ClassCastException();
                }
                boolean z3 = configuration.f3976d == t.f4006b;
                getOpenHelper().setWriteAheadLoggingEnabled(z3);
                this.mCallbacks = configuration.f3975c;
                this.internalQueryExecutor = C0508b.f7833c;
                this.internalTransactionExecutor = new B();
                this.allowMainThreadQueries = false;
                this.writeAheadLoggingEnabled = z3;
                Map<Class<?>, List<Class<?>>> requiredTypeConverters = getRequiredTypeConverters();
                BitSet bitSet2 = new BitSet();
                Iterator<Map.Entry<Class<?>, List<Class<?>>>> it3 = requiredTypeConverters.entrySet().iterator();
                while (true) {
                    boolean hasNext = it3.hasNext();
                    ArrayList arrayList2 = configuration.f3978f;
                    if (hasNext) {
                        Map.Entry<Class<?>, List<Class<?>>> next2 = it3.next();
                        Class<?> key = next2.getKey();
                        for (Class<?> cls : next2.getValue()) {
                            int size3 = arrayList2.size() - 1;
                            if (size3 >= 0) {
                                while (true) {
                                    int i6 = size3 - 1;
                                    if (cls.isAssignableFrom(arrayList2.get(size3).getClass())) {
                                        bitSet2.set(size3);
                                        break;
                                    } else if (i6 < 0) {
                                        break;
                                    } else {
                                        size3 = i6;
                                    }
                                }
                            }
                            size3 = -1;
                            if (size3 < 0) {
                                throw new IllegalArgumentException(("A required type converter (" + cls + ") for " + key.getCanonicalName() + " is missing in the database configuration.").toString());
                            }
                            this.typeConverters.put(cls, arrayList2.get(size3));
                        }
                    } else {
                        int size4 = arrayList2.size() - 1;
                        if (size4 < 0) {
                            return;
                        }
                        while (true) {
                            int i7 = size4 - 1;
                            if (!bitSet2.get(size4)) {
                                throw new IllegalArgumentException("Unexpected type converter " + arrayList2.get(size4) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                            }
                            if (i7 < 0) {
                                return;
                            } else {
                                size4 = i7;
                            }
                        }
                    }
                }
            }
        }
    }

    public void internalInitInvalidationTracker(InterfaceC0645a database) {
        Intrinsics.checkNotNullParameter(database, "db");
        p invalidationTracker = getInvalidationTracker();
        invalidationTracker.getClass();
        Intrinsics.checkNotNullParameter(database, "database");
        synchronized (invalidationTracker.f4001l) {
            if (invalidationTracker.f3998g) {
                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                return;
            }
            database.i("PRAGMA temp_store = MEMORY;");
            database.i("PRAGMA recursive_triggers='ON';");
            database.i("CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            invalidationTracker.d(database);
            invalidationTracker.h = database.q("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1");
            invalidationTracker.f3998g = true;
            Unit unit = Unit.INSTANCE;
        }
    }

    public final boolean isMainThread$room_runtime_release() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public boolean isOpen() {
        InterfaceC0645a interfaceC0645a = this.mDatabase;
        return Intrinsics.areEqual(interfaceC0645a != null ? Boolean.valueOf(interfaceC0645a.isOpen()) : null, Boolean.TRUE);
    }

    public final boolean isOpenInternal() {
        InterfaceC0645a interfaceC0645a = this.mDatabase;
        return interfaceC0645a != null && interfaceC0645a.isOpen();
    }

    @JvmOverloads
    public final Cursor query(InterfaceC0648d query) {
        Intrinsics.checkNotNullParameter(query, "query");
        return query$default(this, query, null, 2, null);
    }

    public void runInTransaction(Runnable body) {
        Intrinsics.checkNotNullParameter(body, "body");
        beginTransaction();
        try {
            body.run();
            setTransactionSuccessful();
        } finally {
            endTransaction();
        }
    }

    public final void setAutoMigrationSpecs(Map<Class<Object>, Object> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.autoMigrationSpecs = map;
    }

    @Deprecated(message = "setTransactionSuccessful() is deprecated", replaceWith = @ReplaceWith(expression = "runInTransaction(Runnable)", imports = {}))
    public void setTransactionSuccessful() {
        getOpenHelper().S().J();
    }

    public Cursor query(String query, Object[] objArr) {
        Intrinsics.checkNotNullParameter(query, "query");
        return getOpenHelper().S().p(new F.i(query, objArr));
    }

    @JvmOverloads
    public Cursor query(InterfaceC0648d query, CancellationSignal cancellationSignal) {
        Intrinsics.checkNotNullParameter(query, "query");
        assertNotMainThread();
        assertNotSuspendingTransaction();
        if (cancellationSignal != null) {
            return getOpenHelper().S().j(query, cancellationSignal);
        }
        return getOpenHelper().S().p(query);
    }

    public <V> V runInTransaction(Callable<V> body) {
        Intrinsics.checkNotNullParameter(body, "body");
        beginTransaction();
        try {
            V call = body.call();
            setTransactionSuccessful();
            return call;
        } finally {
            endTransaction();
        }
    }
}
