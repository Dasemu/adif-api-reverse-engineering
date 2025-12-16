package B0;

import O.S;
import O.X;
import a.AbstractC0106b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import e3.C0325k;
import f.AbstractC0336a;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;
import m.AbstractC0463g0;
import m.C0487t;

/* loaded from: classes.dex */
public final class G implements V0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f101a;

    /* renamed from: b, reason: collision with root package name */
    public int f102b;

    /* renamed from: c, reason: collision with root package name */
    public Object f103c;

    /* renamed from: d, reason: collision with root package name */
    public Object f104d;

    public /* synthetic */ G() {
        this.f101a = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x01df, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r3.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static B0.G c(android.content.res.Resources r29, int r30, android.content.res.Resources.Theme r31) {
        /*
            Method dump skipped, instructions count: 675
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: B0.G.c(android.content.res.Resources, int, android.content.res.Resources$Theme):B0.G");
    }

    @Override // V0.e
    public void a() {
        U0.a aVar = (U0.a) this.f103c;
        Drawable drawable = aVar.f1775b.getDrawable();
        S0.k kVar = (S0.k) this.f104d;
        boolean z3 = kVar instanceof S0.r;
        L0.a aVar2 = new L0.a(drawable, kVar.a(), kVar.b().f1498y, this.f102b, (z3 && ((S0.r) kVar).f1523g) ? false : true);
        if (z3) {
            aVar.b(aVar2);
        } else if (kVar instanceof S0.f) {
            aVar.b(aVar2);
        }
    }

    public void b() {
        C0325k c0325k;
        ImageView imageView = (ImageView) this.f103c;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            AbstractC0463g0.a(drawable);
        }
        if (drawable == null || (c0325k = (C0325k) this.f104d) == null) {
            return;
        }
        C0487t.e(drawable, c0325k, imageView.getDrawableState());
    }

    public boolean d() {
        ColorStateList colorStateList;
        return ((Shader) this.f103c) == null && (colorStateList = (ColorStateList) this.f104d) != null && colorStateList.isStateful();
    }

    public void e(AttributeSet attributeSet, int i) {
        int resourceId;
        ImageView imageView = (ImageView) this.f103c;
        Context context = imageView.getContext();
        int[] iArr = AbstractC0336a.f6427f;
        R0.h l4 = R0.h.l(context, attributeSet, iArr, i);
        Context context2 = imageView.getContext();
        WeakHashMap weakHashMap = X.f1226a;
        S.d(imageView, context2, iArr, attributeSet, (TypedArray) l4.f1414b, i, 0);
        try {
            Drawable drawable = imageView.getDrawable();
            TypedArray typedArray = (TypedArray) l4.f1414b;
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = AbstractC0106b.m(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                AbstractC0463g0.a(drawable);
            }
            if (typedArray.hasValue(2)) {
                U.f.c(imageView, l4.e(2));
            }
            if (typedArray.hasValue(3)) {
                U.f.d(imageView, AbstractC0463g0.c(typedArray.getInt(3, -1), null));
            }
            l4.n();
        } catch (Throwable th) {
            l4.n();
            throw th;
        }
    }

    public String toString() {
        switch (this.f101a) {
            case 3:
                StringBuilder sb = new StringBuilder();
                if (((e3.G) this.f103c) == e3.G.HTTP_1_0) {
                    sb.append("HTTP/1.0");
                } else {
                    sb.append("HTTP/1.1");
                }
                sb.append(' ');
                sb.append(this.f102b);
                sb.append(' ');
                sb.append((String) this.f104d);
                String sb2 = sb.toString();
                Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
                return sb2;
            default:
                return super.toString();
        }
    }

    public G(U0.a aVar, S0.k kVar, int i) {
        this.f101a = 2;
        this.f103c = aVar;
        this.f104d = kVar;
        this.f102b = i;
        if (i <= 0) {
            throw new IllegalArgumentException("durationMillis must be > 0.");
        }
    }

    public G(e3.G protocol, int i, String message) {
        this.f101a = 3;
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        Intrinsics.checkNotNullParameter(message, "message");
        this.f103c = protocol;
        this.f102b = i;
        this.f104d = message;
    }

    public G(ImageView imageView) {
        this.f101a = 4;
        this.f102b = 0;
        this.f103c = imageView;
    }

    public G(Shader shader, ColorStateList colorStateList, int i) {
        this.f101a = 1;
        this.f103c = shader;
        this.f104d = colorStateList;
        this.f102b = i;
    }
}
