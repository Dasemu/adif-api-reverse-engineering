package q0;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o0.E;

/* renamed from: q0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0556c extends E {

    /* renamed from: k, reason: collision with root package name */
    public String f8148k;

    @Override // o0.E
    public final boolean equals(Object obj) {
        return obj != null && (obj instanceof C0556c) && super.equals(obj) && Intrinsics.areEqual(this.f8148k, ((C0556c) obj).f8148k);
    }

    @Override // o0.E
    public final void h(Context context, AttributeSet attrs) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        super.h(context, attrs);
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attrs, AbstractC0557d.f8150b);
        Intrinsics.checkNotNullExpressionValue(obtainAttributes, "context.resources.obtain…leable.FragmentNavigator)");
        String className = obtainAttributes.getString(0);
        if (className != null) {
            Intrinsics.checkNotNullParameter(className, "className");
            this.f8148k = className;
        }
        Unit unit = Unit.INSTANCE;
        obtainAttributes.recycle();
    }

    @Override // o0.E
    public final int hashCode() {
        int hashCode = super.hashCode() * 31;
        String str = this.f8148k;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // o0.E
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" class=");
        String str = this.f8148k;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "sb.toString()");
        return sb2;
    }
}
