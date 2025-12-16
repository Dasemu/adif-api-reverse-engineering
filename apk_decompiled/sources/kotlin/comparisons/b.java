package kotlin.comparisons;

import java.util.Comparator;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7115a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Comparator f7116b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Comparator f7117c;

    public /* synthetic */ b(Comparator comparator, Comparator comparator2, int i) {
        this.f7115a = i;
        this.f7116b = comparator;
        this.f7117c = comparator2;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f7115a) {
            case 0:
                return ComparisonsKt__ComparisonsKt.b(this.f7116b, this.f7117c, obj, obj2);
            default:
                return ComparisonsKt__ComparisonsKt.d(this.f7116b, this.f7117c, obj, obj2);
        }
    }
}
