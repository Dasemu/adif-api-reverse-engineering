package g;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class I implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final View f6545a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6546b;

    /* renamed from: c, reason: collision with root package name */
    public Method f6547c;

    /* renamed from: d, reason: collision with root package name */
    public Context f6548d;

    public I(View view, String str) {
        this.f6545a = view;
        this.f6546b = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        Method method;
        if (this.f6547c == null) {
            View view2 = this.f6545a;
            Context context = view2.getContext();
            while (true) {
                String str2 = this.f6546b;
                if (context == null) {
                    int id = view2.getId();
                    if (id == -1) {
                        str = "";
                    } else {
                        str = " with id '" + view2.getContext().getResources().getResourceEntryName(id) + "'";
                    }
                    StringBuilder p = com.google.android.gms.measurement.internal.a.p("Could not find method ", str2, "(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                    p.append(view2.getClass());
                    p.append(str);
                    throw new IllegalStateException(p.toString());
                }
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                        this.f6547c = method;
                        this.f6548d = context;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
        }
        try {
            this.f6547c.invoke(this.f6548d, view);
        } catch (IllegalAccessException e4) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e4);
        } catch (InvocationTargetException e5) {
            throw new IllegalStateException("Could not execute method for android:onClick", e5);
        }
    }
}
