package kotlin.comparisons;

import java.util.Comparator;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7113a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7114b;

    public /* synthetic */ a(Object obj, int i) {
        this.f7113a = i;
        this.f7114b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int nullsLast$lambda$4$ComparisonsKt__ComparisonsKt;
        int nullsFirst$lambda$3$ComparisonsKt__ComparisonsKt;
        int compareBy$lambda$0$ComparisonsKt__ComparisonsKt;
        int i = this.f7113a;
        Object obj3 = this.f7114b;
        switch (i) {
            case 0:
                nullsLast$lambda$4$ComparisonsKt__ComparisonsKt = ComparisonsKt__ComparisonsKt.nullsLast$lambda$4$ComparisonsKt__ComparisonsKt((Comparator) obj3, obj, obj2);
                return nullsLast$lambda$4$ComparisonsKt__ComparisonsKt;
            case 1:
                nullsFirst$lambda$3$ComparisonsKt__ComparisonsKt = ComparisonsKt__ComparisonsKt.nullsFirst$lambda$3$ComparisonsKt__ComparisonsKt((Comparator) obj3, obj, obj2);
                return nullsFirst$lambda$3$ComparisonsKt__ComparisonsKt;
            default:
                compareBy$lambda$0$ComparisonsKt__ComparisonsKt = ComparisonsKt__ComparisonsKt.compareBy$lambda$0$ComparisonsKt__ComparisonsKt((Function1[]) obj3, obj, obj2);
                return compareBy$lambda$0$ComparisonsKt__ComparisonsKt;
        }
    }
}
