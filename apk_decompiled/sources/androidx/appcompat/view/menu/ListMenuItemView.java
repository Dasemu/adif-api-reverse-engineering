package androidx.appcompat.view.menu;

import R0.h;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.adif.elcanomovil.R;
import f.AbstractC0336a;
import l.o;
import l.z;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements z, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: a, reason: collision with root package name */
    public o f2346a;

    /* renamed from: b, reason: collision with root package name */
    public ImageView f2347b;

    /* renamed from: c, reason: collision with root package name */
    public RadioButton f2348c;

    /* renamed from: d, reason: collision with root package name */
    public TextView f2349d;

    /* renamed from: e, reason: collision with root package name */
    public CheckBox f2350e;

    /* renamed from: f, reason: collision with root package name */
    public TextView f2351f;

    /* renamed from: g, reason: collision with root package name */
    public ImageView f2352g;
    public ImageView h;
    public LinearLayout i;

    /* renamed from: j, reason: collision with root package name */
    public final Drawable f2353j;

    /* renamed from: k, reason: collision with root package name */
    public final int f2354k;

    /* renamed from: l, reason: collision with root package name */
    public final Context f2355l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2356m;

    /* renamed from: n, reason: collision with root package name */
    public final Drawable f2357n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f2358o;
    public LayoutInflater p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2359q;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        h l4 = h.l(getContext(), attributeSet, AbstractC0336a.f6436r, R.attr.listMenuViewStyle);
        this.f2353j = l4.f(5);
        TypedArray typedArray = (TypedArray) l4.f1414b;
        this.f2354k = typedArray.getResourceId(1, -1);
        this.f2356m = typedArray.getBoolean(7, false);
        this.f2355l = context;
        this.f2357n = l4.f(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.f2358o = obtainStyledAttributes.hasValue(0);
        l4.n();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.p == null) {
            this.p = LayoutInflater.from(getContext());
        }
        return this.p;
    }

    private void setSubMenuArrowVisible(boolean z3) {
        ImageView imageView = this.f2352g;
        if (imageView != null) {
            imageView.setVisibility(z3 ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.h;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.h.getLayoutParams();
        rect.top = this.h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
    
        if (r0 == false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0125  */
    @Override // l.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(l.o r11) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ListMenuItemView.b(l.o):void");
    }

    @Override // l.z
    public o getItemData() {
        return this.f2346a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f2353j);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f2349d = textView;
        int i = this.f2354k;
        if (i != -1) {
            textView.setTextAppearance(this.f2355l, i);
        }
        this.f2351f = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f2352g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f2357n);
        }
        this.h = (ImageView) findViewById(R.id.group_divider);
        this.i = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i4) {
        if (this.f2347b != null && this.f2356m) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f2347b.getLayoutParams();
            int i5 = layoutParams.height;
            if (i5 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i5;
            }
        }
        super.onMeasure(i, i4);
    }

    public void setCheckable(boolean z3) {
        CompoundButton compoundButton;
        View view;
        if (!z3 && this.f2348c == null && this.f2350e == null) {
            return;
        }
        if ((this.f2346a.f7288x & 4) != 0) {
            if (this.f2348c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f2348c = radioButton;
                LinearLayout linearLayout = this.i;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f2348c;
            view = this.f2350e;
        } else {
            if (this.f2350e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f2350e = checkBox;
                LinearLayout linearLayout2 = this.i;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f2350e;
            view = this.f2348c;
        }
        if (z3) {
            compoundButton.setChecked(this.f2346a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.f2350e;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f2348c;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z3) {
        CompoundButton compoundButton;
        if ((this.f2346a.f7288x & 4) != 0) {
            if (this.f2348c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f2348c = radioButton;
                LinearLayout linearLayout = this.i;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f2348c;
        } else {
            if (this.f2350e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f2350e = checkBox;
                LinearLayout linearLayout2 = this.i;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f2350e;
        }
        compoundButton.setChecked(z3);
    }

    public void setForceShowIcon(boolean z3) {
        this.f2359q = z3;
        this.f2356m = z3;
    }

    public void setGroupDividerEnabled(boolean z3) {
        ImageView imageView = this.h;
        if (imageView != null) {
            imageView.setVisibility((this.f2358o || !z3) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        this.f2346a.f7279n.getClass();
        boolean z3 = this.f2359q;
        if (z3 || this.f2356m) {
            ImageView imageView = this.f2347b;
            if (imageView == null && drawable == null && !this.f2356m) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f2347b = imageView2;
                LinearLayout linearLayout = this.i;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f2356m) {
                this.f2347b.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f2347b;
            if (!z3) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f2347b.getVisibility() != 0) {
                this.f2347b.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f2349d.getVisibility() != 8) {
                this.f2349d.setVisibility(8);
            }
        } else {
            this.f2349d.setText(charSequence);
            if (this.f2349d.getVisibility() != 0) {
                this.f2349d.setVisibility(0);
            }
        }
    }
}
