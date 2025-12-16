package kotlin.reflect.jvm.internal.impl.builtins;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;

/* loaded from: classes3.dex */
public final class DefaultBuiltIns extends KotlinBuiltIns {
    public static final Companion Companion = new Companion(null);
    private static final Lazy<DefaultBuiltIns> Instance$delegate = LazyKt.lazy(new Function0<DefaultBuiltIns>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.DefaultBuiltIns$Companion$Instance$2
        @Override // kotlin.jvm.functions.Function0
        public final DefaultBuiltIns invoke() {
            return new DefaultBuiltIns(false, 1, null);
        }
    });

    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final DefaultBuiltIns getInstance() {
            return (DefaultBuiltIns) DefaultBuiltIns.Instance$delegate.getValue();
        }

        private Companion() {
        }
    }

    public DefaultBuiltIns() {
        this(false, 1, null);
    }

    public DefaultBuiltIns(boolean z3) {
        super(new LockBasedStorageManager("DefaultBuiltIns"));
        if (z3) {
            createBuiltInsModule(false);
        }
    }

    public /* synthetic */ DefaultBuiltIns(boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z3);
    }
}
