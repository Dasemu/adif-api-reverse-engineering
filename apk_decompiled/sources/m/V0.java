package m;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import com.adif.elcanomovil.R;
import f.AbstractC0336a;

/* loaded from: classes.dex */
public final class V0 implements InterfaceC0459e0 {

    /* renamed from: a, reason: collision with root package name */
    public final Toolbar f7624a;

    /* renamed from: b, reason: collision with root package name */
    public int f7625b;

    /* renamed from: c, reason: collision with root package name */
    public final View f7626c;

    /* renamed from: d, reason: collision with root package name */
    public Drawable f7627d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f7628e;

    /* renamed from: f, reason: collision with root package name */
    public final Drawable f7629f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f7630g;
    public CharSequence h;
    public final CharSequence i;

    /* renamed from: j, reason: collision with root package name */
    public final CharSequence f7631j;

    /* renamed from: k, reason: collision with root package name */
    public Window.Callback f7632k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f7633l;

    /* renamed from: m, reason: collision with root package name */
    public C0472l f7634m;

    /* renamed from: n, reason: collision with root package name */
    public final int f7635n;

    /* renamed from: o, reason: collision with root package name */
    public final Drawable f7636o;

    public V0(Toolbar toolbar, boolean z3) {
        Drawable drawable;
        this.f7635n = 0;
        this.f7624a = toolbar;
        this.h = toolbar.getTitle();
        this.i = toolbar.getSubtitle();
        this.f7630g = this.h != null;
        this.f7629f = toolbar.getNavigationIcon();
        R0.h l4 = R0.h.l(toolbar.getContext(), null, AbstractC0336a.f6422a, R.attr.actionBarStyle);
        int i = 15;
        this.f7636o = l4.f(15);
        if (z3) {
            TypedArray typedArray = (TypedArray) l4.f1414b;
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                this.f7630g = true;
                this.h = text;
                if ((this.f7625b & 8) != 0) {
                    Toolbar toolbar2 = this.f7624a;
                    toolbar2.setTitle(text);
                    if (this.f7630g) {
                        O.X.k(toolbar2.getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                this.i = text2;
                if ((this.f7625b & 8) != 0) {
                    toolbar.setSubtitle(text2);
                }
            }
            Drawable f2 = l4.f(20);
            if (f2 != null) {
                this.f7628e = f2;
                c();
            }
            Drawable f4 = l4.f(17);
            if (f4 != null) {
                this.f7627d = f4;
                c();
            }
            if (this.f7629f == null && (drawable = this.f7636o) != null) {
                this.f7629f = drawable;
                int i4 = this.f7625b & 4;
                Toolbar toolbar3 = this.f7624a;
                if (i4 != 0) {
                    toolbar3.setNavigationIcon(drawable);
                } else {
                    toolbar3.setNavigationIcon((Drawable) null);
                }
            }
            a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View inflate = LayoutInflater.from(toolbar.getContext()).inflate(resourceId, (ViewGroup) toolbar, false);
                View view = this.f7626c;
                if (view != null && (this.f7625b & 16) != 0) {
                    toolbar.removeView(view);
                }
                this.f7626c = inflate;
                if (inflate != null && (this.f7625b & 16) != 0) {
                    toolbar.addView(inflate);
                }
                a(this.f7625b | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
                layoutParams.height = layoutDimension;
                toolbar.setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                int max = Math.max(dimensionPixelOffset, 0);
                int max2 = Math.max(dimensionPixelOffset2, 0);
                toolbar.d();
                toolbar.f2496t.a(max, max2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = toolbar.getContext();
                toolbar.f2489l = resourceId2;
                W w3 = toolbar.f2481b;
                if (w3 != null) {
                    w3.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = toolbar.getContext();
                toolbar.f2490m = resourceId3;
                W w4 = toolbar.f2482c;
                if (w4 != null) {
                    w4.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                toolbar.setPopupTheme(resourceId4);
            }
        } else {
            if (toolbar.getNavigationIcon() != null) {
                this.f7636o = toolbar.getNavigationIcon();
            } else {
                i = 11;
            }
            this.f7625b = i;
        }
        l4.n();
        if (R.string.abc_action_bar_up_description != this.f7635n) {
            this.f7635n = R.string.abc_action_bar_up_description;
            if (TextUtils.isEmpty(toolbar.getNavigationContentDescription())) {
                int i5 = this.f7635n;
                this.f7631j = i5 != 0 ? toolbar.getContext().getString(i5) : null;
                b();
            }
        }
        this.f7631j = toolbar.getNavigationContentDescription();
        toolbar.setNavigationOnClickListener(new U0(this));
    }

    public final void a(int i) {
        View view;
        int i4 = this.f7625b ^ i;
        this.f7625b = i;
        if (i4 != 0) {
            if ((i4 & 4) != 0) {
                if ((i & 4) != 0) {
                    b();
                }
                int i5 = this.f7625b & 4;
                Toolbar toolbar = this.f7624a;
                if (i5 != 0) {
                    Drawable drawable = this.f7629f;
                    if (drawable == null) {
                        drawable = this.f7636o;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i4 & 3) != 0) {
                c();
            }
            int i6 = i4 & 8;
            Toolbar toolbar2 = this.f7624a;
            if (i6 != 0) {
                if ((i & 8) != 0) {
                    toolbar2.setTitle(this.h);
                    toolbar2.setSubtitle(this.i);
                } else {
                    toolbar2.setTitle((CharSequence) null);
                    toolbar2.setSubtitle((CharSequence) null);
                }
            }
            if ((i4 & 16) == 0 || (view = this.f7626c) == null) {
                return;
            }
            if ((i & 16) != 0) {
                toolbar2.addView(view);
            } else {
                toolbar2.removeView(view);
            }
        }
    }

    public final void b() {
        if ((this.f7625b & 4) != 0) {
            boolean isEmpty = TextUtils.isEmpty(this.f7631j);
            Toolbar toolbar = this.f7624a;
            if (isEmpty) {
                toolbar.setNavigationContentDescription(this.f7635n);
            } else {
                toolbar.setNavigationContentDescription(this.f7631j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i = this.f7625b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) != 0) {
            drawable = this.f7628e;
            if (drawable == null) {
                drawable = this.f7627d;
            }
        } else {
            drawable = this.f7627d;
        }
        this.f7624a.setLogo(drawable);
    }
}
