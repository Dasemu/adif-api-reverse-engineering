package A;

import O.L;
import O.X;
import android.view.View;
import java.util.Comparator;
import java.util.WeakHashMap;
import kotlin.comparisons.ComparisonsKt;
import u.C0630g;

/* loaded from: classes.dex */
public final class i implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25a;

    public /* synthetic */ i(int i) {
        this.f25a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f25a) {
            case 0:
                WeakHashMap weakHashMap = X.f1226a;
                float m4 = L.m((View) obj);
                float m5 = L.m((View) obj2);
                if (m4 > m5) {
                    return -1;
                }
                return m4 < m5 ? 1 : 0;
            case 1:
                return ((F0.e) obj).f519b - ((F0.e) obj2).f519b;
            case 2:
                return ((int[]) obj)[0] - ((int[]) obj2)[0];
            case 3:
                return ((Comparable) obj).compareTo((Comparable) obj2);
            case 4:
                return ((Comparable) obj).compareTo((Comparable) obj2);
            case 5:
                return ComparisonsKt.compareValues(((s3.i) obj).f8489a, ((s3.i) obj2).f8489a);
            case 6:
                return ((C0630g) obj).f8585b - ((C0630g) obj2).f8585b;
            default:
                return ((View) obj).getTop() - ((View) obj2).getTop();
        }
    }
}
