package r3;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class E {

    /* renamed from: a, reason: collision with root package name */
    public static final D f8255a = new D(new byte[0], 0, 0, false);

    /* renamed from: b, reason: collision with root package name */
    public static final int f8256b;

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReference[] f8257c;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f8256b = highestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i = 0; i < highestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        f8257c = atomicReferenceArr;
    }

    public static final void a(D segment) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        if (segment.f8253f != null || segment.f8254g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (segment.f8251d) {
            return;
        }
        AtomicReference atomicReference = f8257c[(int) (Thread.currentThread().getId() & (f8256b - 1))];
        D d4 = f8255a;
        D d5 = (D) atomicReference.getAndSet(d4);
        if (d5 == d4) {
            return;
        }
        int i = d5 != null ? d5.f8250c : 0;
        if (i >= 65536) {
            atomicReference.set(d5);
            return;
        }
        segment.f8253f = d5;
        segment.f8249b = 0;
        segment.f8250c = i + 8192;
        atomicReference.set(segment);
    }

    public static final D b() {
        AtomicReference atomicReference = f8257c[(int) (Thread.currentThread().getId() & (f8256b - 1))];
        D d4 = f8255a;
        D d5 = (D) atomicReference.getAndSet(d4);
        if (d5 == d4) {
            return new D();
        }
        if (d5 == null) {
            atomicReference.set(null);
            return new D();
        }
        atomicReference.set(d5.f8253f);
        d5.f8253f = null;
        d5.f8250c = 0;
        return d5;
    }
}
