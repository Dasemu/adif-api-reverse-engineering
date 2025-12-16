package b0;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: b0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0256a extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final C0256a f4152a = new Lambda(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Intrinsics.checkNotNullParameter(entry, "entry");
        return "  " + ((C0260e) entry.getKey()).f4159a + " = " + entry.getValue();
    }
}
