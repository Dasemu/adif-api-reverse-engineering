package d;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.random.Random;

/* renamed from: d.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0298g extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C0298g f6099a = new Lambda(0);

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return Integer.valueOf(Random.INSTANCE.nextInt(2147418112) + 65536);
    }
}
