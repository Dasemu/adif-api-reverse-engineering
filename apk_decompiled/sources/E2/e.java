package E2;

import a.AbstractC0105a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.Build;
import android.view.View;
import com.google.android.material.tabs.TabLayout;
import h2.AbstractC0379a;
import i2.AbstractC0396a;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;

/* loaded from: classes3.dex */
public class e implements Q0.i, R0.f, S2.p, l0.b {

    /* renamed from: b, reason: collision with root package name */
    public static e f383b;

    /* renamed from: c, reason: collision with root package name */
    public static e f384c;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f385a;

    public /* synthetic */ e(int i) {
        this.f385a = i;
    }

    public static RectF f(TabLayout tabLayout, View view) {
        if (view == null) {
            return new RectF();
        }
        if (tabLayout.f5767D || !(view instanceof H2.k)) {
            return new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        H2.k kVar = (H2.k) view;
        int contentWidth = kVar.getContentWidth();
        int contentHeight = kVar.getContentHeight();
        int e4 = (int) x2.m.e(kVar.getContext(), 24);
        if (contentWidth < e4) {
            contentWidth = e4;
        }
        int right = (kVar.getRight() + kVar.getLeft()) / 2;
        int bottom = (kVar.getBottom() + kVar.getTop()) / 2;
        int i = contentWidth / 2;
        return new RectF(right - i, bottom - (contentHeight / 2), i + right, (right / 2) + bottom);
    }

    public static e g(Context context, int i) {
        m3.d.f(i != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, AbstractC0379a.f6767o);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(0, 0), obtainStyledAttributes.getDimensionPixelOffset(2, 0), obtainStyledAttributes.getDimensionPixelOffset(1, 0), obtainStyledAttributes.getDimensionPixelOffset(3, 0));
        AbstractC0105a.w(context, obtainStyledAttributes, 4);
        AbstractC0105a.w(context, obtainStyledAttributes, 9);
        AbstractC0105a.w(context, obtainStyledAttributes, 7);
        obtainStyledAttributes.getDimensionPixelSize(8, 0);
        k.a(context, obtainStyledAttributes.getResourceId(5, 0), obtainStyledAttributes.getResourceId(6, 0), new a(0)).a();
        obtainStyledAttributes.recycle();
        e eVar = new e(26);
        m3.d.g(rect.left);
        m3.d.g(rect.top);
        m3.d.g(rect.right);
        m3.d.g(rect.bottom);
        return eVar;
    }

    public static Font h(FontFamily fontFamily, int i) {
        FontStyle fontStyle = new FontStyle((i & 1) != 0 ? 700 : 400, (i & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int i4 = i(fontStyle, font.getStyle());
        for (int i5 = 1; i5 < fontFamily.getSize(); i5++) {
            Font font2 = fontFamily.getFont(i5);
            int i6 = i(fontStyle, font2.getStyle());
            if (i6 < i4) {
                font = font2;
                i4 = i6;
            }
        }
        return font;
    }

    public static int i(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    public static Path k(float f2, float f4, float f5, float f6) {
        Path path = new Path();
        path.moveTo(f2, f4);
        path.lineTo(f5, f6);
        return path;
    }

    @Override // Q0.i
    public boolean a(Q0.b bVar) {
        return false;
    }

    @Override // Q0.i
    public Q0.c b(Q0.b bVar) {
        return null;
    }

    @Override // Q0.i
    public void c(int i) {
    }

    @Override // R0.f
    public boolean d() {
        return true;
    }

    @Override // Q0.i
    public void e(Q0.b bVar, Bitmap bitmap, Map map, int i) {
    }

    @Override // S2.p
    public Object j() {
        switch (this.f385a) {
            case 8:
                return new TreeSet();
            case 9:
                return new LinkedHashSet();
            case 10:
                return new ArrayDeque();
            case 11:
                return new ArrayList();
            case 12:
                return new ConcurrentSkipListMap();
            case 13:
                return new ConcurrentHashMap();
            case 14:
                return new TreeMap();
            case 15:
                return new LinkedHashMap();
            default:
                return new S2.o(true);
        }
    }

    public void l(TabLayout tabLayout, View view, View view2, float f2, Drawable drawable) {
        RectF f4 = f(tabLayout, view);
        RectF f5 = f(tabLayout, view2);
        drawable.setBounds(AbstractC0396a.c(f2, (int) f4.left, (int) f5.left), drawable.getBounds().top, AbstractC0396a.c(f2, (int) f4.right, (int) f5.right), drawable.getBounds().bottom);
    }

    @Override // R0.f
    public void shutdown() {
    }

    public e() {
        this.f385a = 2;
        new ConcurrentHashMap();
    }

    public e(View view, int i) {
        this.f385a = i;
        switch (i) {
            case 5:
                if (Build.VERSION.SDK_INT >= 30) {
                    new e(view, 4);
                    return;
                } else {
                    new e(view, 4);
                    return;
                }
            default:
                return;
        }
    }
}
