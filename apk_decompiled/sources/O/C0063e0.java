package O;

import android.view.ViewGroup;
import java.util.Iterator;
import kotlin.sequences.Sequence;

/* renamed from: O.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0063e0 implements Sequence {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f1243a;

    public C0063e0(ViewGroup viewGroup) {
        this.f1243a = viewGroup;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return new B(new C0061d0(this.f1243a), C0059c0.f1234a);
    }
}
