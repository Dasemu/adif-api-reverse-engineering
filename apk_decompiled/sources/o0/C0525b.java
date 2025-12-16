package o0;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.net.Uri;
import android.util.AttributeSet;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;

/* renamed from: o0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0525b extends E {

    /* renamed from: k, reason: collision with root package name */
    public Intent f7974k;

    /* renamed from: l, reason: collision with root package name */
    public String f7975l;

    @Override // o0.E
    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C0525b) && super.equals(obj)) {
            Intent intent = this.f7974k;
            if ((intent != null ? intent.filterEquals(((C0525b) obj).f7974k) : ((C0525b) obj).f7974k == null) && Intrinsics.areEqual(this.f7975l, ((C0525b) obj).f7975l)) {
                return true;
            }
        }
        return false;
    }

    @Override // o0.E
    public final void h(Context context, AttributeSet attrs) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        super.h(context, attrs);
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attrs, Y.f7969a);
        Intrinsics.checkNotNullExpressionValue(obtainAttributes, "context.resources.obtain…tyNavigator\n            )");
        String string = obtainAttributes.getString(4);
        if (string != null) {
            String packageName = context.getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "context.packageName");
            string = StringsKt__StringsJVMKt.replace$default(string, "${applicationId}", packageName, false, 4, (Object) null);
        }
        if (this.f7974k == null) {
            this.f7974k = new Intent();
        }
        Intent intent = this.f7974k;
        Intrinsics.checkNotNull(intent);
        intent.setPackage(string);
        String string2 = obtainAttributes.getString(0);
        if (string2 != null) {
            if (string2.charAt(0) == '.') {
                string2 = context.getPackageName() + string2;
            }
            ComponentName componentName = new ComponentName(context, string2);
            if (this.f7974k == null) {
                this.f7974k = new Intent();
            }
            Intent intent2 = this.f7974k;
            Intrinsics.checkNotNull(intent2);
            intent2.setComponent(componentName);
        }
        String string3 = obtainAttributes.getString(1);
        if (this.f7974k == null) {
            this.f7974k = new Intent();
        }
        Intent intent3 = this.f7974k;
        Intrinsics.checkNotNull(intent3);
        intent3.setAction(string3);
        String string4 = obtainAttributes.getString(2);
        if (string4 != null) {
            Uri parse = Uri.parse(string4);
            if (this.f7974k == null) {
                this.f7974k = new Intent();
            }
            Intent intent4 = this.f7974k;
            Intrinsics.checkNotNull(intent4);
            intent4.setData(parse);
        }
        this.f7975l = obtainAttributes.getString(3);
        obtainAttributes.recycle();
    }

    @Override // o0.E
    public final int hashCode() {
        int hashCode = super.hashCode() * 31;
        Intent intent = this.f7974k;
        int filterHashCode = (hashCode + (intent != null ? intent.filterHashCode() : 0)) * 31;
        String str = this.f7975l;
        return filterHashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // o0.E
    public final String toString() {
        Intent intent = this.f7974k;
        ComponentName component = intent != null ? intent.getComponent() : null;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        if (component != null) {
            sb.append(" class=");
            sb.append(component.getClassName());
        } else {
            Intent intent2 = this.f7974k;
            String action = intent2 != null ? intent2.getAction() : null;
            if (action != null) {
                sb.append(" action=");
                sb.append(action);
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "sb.toString()");
        return sb2;
    }
}
