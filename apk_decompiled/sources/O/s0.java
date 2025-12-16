package O;

import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public abstract class s0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Field f1293a;

    /* renamed from: b, reason: collision with root package name */
    public static final Field f1294b;

    /* renamed from: c, reason: collision with root package name */
    public static final Field f1295c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f1296d;

    static {
        try {
            Field declaredField = View.class.getDeclaredField("mAttachInfo");
            f1293a = declaredField;
            declaredField.setAccessible(true);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            Field declaredField2 = cls.getDeclaredField("mStableInsets");
            f1294b = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = cls.getDeclaredField("mContentInsets");
            f1295c = declaredField3;
            declaredField3.setAccessible(true);
            f1296d = true;
        } catch (ReflectiveOperationException e4) {
            Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e4.getMessage(), e4);
        }
    }
}
