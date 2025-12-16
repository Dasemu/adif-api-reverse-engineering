package q0;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import kotlin.jvm.internal.Intrinsics;
import o0.E;
import o0.InterfaceC0528e;

/* renamed from: q0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0555b extends E implements InterfaceC0528e {

    /* renamed from: k, reason: collision with root package name */
    public String f8147k;

    @Override // o0.E
    public final boolean equals(Object obj) {
        return obj != null && (obj instanceof C0555b) && super.equals(obj) && Intrinsics.areEqual(this.f8147k, ((C0555b) obj).f8147k);
    }

    @Override // o0.E
    public final void h(Context context, AttributeSet attrs) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        super.h(context, attrs);
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attrs, AbstractC0557d.f8149a);
        Intrinsics.checkNotNullExpressionValue(obtainAttributes, "context.resources.obtain…ntNavigator\n            )");
        String className = obtainAttributes.getString(0);
        if (className != null) {
            Intrinsics.checkNotNullParameter(className, "className");
            this.f8147k = className;
        }
        obtainAttributes.recycle();
    }

    @Override // o0.E
    public final int hashCode() {
        int hashCode = super.hashCode() * 31;
        String str = this.f8147k;
        return hashCode + (str != null ? str.hashCode() : 0);
    }
}
