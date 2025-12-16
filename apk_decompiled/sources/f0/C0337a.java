package f0;

import android.text.Editable;
import d0.s;

/* renamed from: f0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0337a extends Editable.Factory {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f6445a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static volatile C0337a f6446b;

    /* renamed from: c, reason: collision with root package name */
    public static Class f6447c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f6447c;
        return cls != null ? new s(cls, charSequence) : super.newEditable(charSequence);
    }
}
