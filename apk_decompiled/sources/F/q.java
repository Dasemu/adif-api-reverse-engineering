package F;

import android.content.Context;
import android.graphics.Typeface;
import android.util.TypedValue;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f503a = new ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    public static final WeakHashMap f504b = new WeakHashMap(0);

    /* renamed from: c, reason: collision with root package name */
    public static final Object f505c = new Object();

    public static Typeface a(Context context, int i) {
        if (context.isRestricted()) {
            return null;
        }
        return b(context, i, new TypedValue(), 0, null, false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00bf A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Typeface b(android.content.Context r12, int r13, android.util.TypedValue r14, int r15, F.b r16, boolean r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: F.q.b(android.content.Context, int, android.util.TypedValue, int, F.b, boolean, boolean):android.graphics.Typeface");
    }
}
