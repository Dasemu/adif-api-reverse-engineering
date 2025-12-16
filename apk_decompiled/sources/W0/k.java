package W0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes.dex */
public final /* synthetic */ class k extends FunctionReferenceImpl implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final k f1904a = new FunctionReferenceImpl(0, System.class, "currentTimeMillis", "currentTimeMillis()J", 0);

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return Long.valueOf(System.currentTimeMillis());
    }
}
