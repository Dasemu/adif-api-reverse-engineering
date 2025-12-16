package B0;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.util.Property;

/* loaded from: classes.dex */
public abstract class o {
    public static <T, V> ObjectAnimator a(T t2, Property<T, V> property, Path path) {
        return ObjectAnimator.ofObject(t2, property, (TypeConverter) null, path);
    }
}
