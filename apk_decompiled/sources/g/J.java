package g;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import java.lang.reflect.Constructor;
import m.C0442A;
import m.C0480p;
import m.C0482q;
import m.W;

/* loaded from: classes.dex */
public class J {

    /* renamed from: b, reason: collision with root package name */
    public static final Class[] f6549b = {Context.class, AttributeSet.class};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f6550c = {R.attr.onClick};

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f6551d = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: e, reason: collision with root package name */
    public static final s.j f6552e = new s.j(0);

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f6553a = new Object[2];

    public C0480p a(Context context, AttributeSet attributeSet) {
        return new C0480p(context, attributeSet);
    }

    public AppCompatButton b(Context context, AttributeSet attributeSet) {
        return new AppCompatButton(context, attributeSet);
    }

    public C0482q c(Context context, AttributeSet attributeSet) {
        return new C0482q(context, attributeSet, com.adif.elcanomovil.R.attr.checkboxStyle);
    }

    public C0442A d(Context context, AttributeSet attributeSet) {
        return new C0442A(context, attributeSet);
    }

    public W e(Context context, AttributeSet attributeSet) {
        return new W(context, attributeSet);
    }

    public final View f(Context context, String str, String str2) {
        String concat;
        s.j jVar = f6552e;
        Constructor constructor = (Constructor) jVar.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    concat = str2.concat(str);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                concat = str;
            }
            constructor = Class.forName(concat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f6549b);
            jVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f6553a);
    }
}
