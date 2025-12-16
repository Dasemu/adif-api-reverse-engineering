package kotlinx.coroutines.future;

import java.util.function.BiFunction;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.Job;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements BiFunction {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7155a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7156b;

    public /* synthetic */ a(Object obj, int i) {
        this.f7155a = i;
        this.f7156b = obj;
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        int i = this.f7155a;
        Object obj3 = this.f7156b;
        switch (i) {
            case 0:
                return FutureKt.a((Function2) obj3, obj, (Throwable) obj2);
            default:
                return FutureKt.b((Job) obj3, obj, (Throwable) obj2);
        }
    }
}
