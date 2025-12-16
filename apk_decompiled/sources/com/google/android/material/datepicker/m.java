package com.google.android.material.datepicker;

import O.E0;
import O.F0;
import O.L;
import O.X;
import a.AbstractC0105a;
import a.AbstractC0106b;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsetsController;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0174y;
import com.adif.elcanomovil.R;
import com.google.android.material.internal.CheckableImageButton;
import h2.AbstractC0379a;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import u2.ViewOnTouchListenerC0634a;

/* loaded from: classes3.dex */
public final class m<S> extends DialogInterfaceOnCancelListenerC0174y {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f5670a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f5671b;

    /* renamed from: c, reason: collision with root package name */
    public int f5672c;

    /* renamed from: d, reason: collision with root package name */
    public t f5673d;

    /* renamed from: e, reason: collision with root package name */
    public b f5674e;

    /* renamed from: f, reason: collision with root package name */
    public k f5675f;

    /* renamed from: g, reason: collision with root package name */
    public int f5676g;
    public CharSequence h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public int f5677j;

    /* renamed from: k, reason: collision with root package name */
    public int f5678k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f5679l;

    /* renamed from: m, reason: collision with root package name */
    public int f5680m;

    /* renamed from: n, reason: collision with root package name */
    public CharSequence f5681n;

    /* renamed from: o, reason: collision with root package name */
    public int f5682o;
    public CharSequence p;

    /* renamed from: q, reason: collision with root package name */
    public int f5683q;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f5684r;

    /* renamed from: s, reason: collision with root package name */
    public TextView f5685s;

    /* renamed from: t, reason: collision with root package name */
    public CheckableImageButton f5686t;

    /* renamed from: u, reason: collision with root package name */
    public E2.g f5687u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f5688v;

    /* renamed from: w, reason: collision with root package name */
    public CharSequence f5689w;

    /* renamed from: x, reason: collision with root package name */
    public CharSequence f5690x;

    public m() {
        new LinkedHashSet();
        new LinkedHashSet();
        this.f5670a = new LinkedHashSet();
        this.f5671b = new LinkedHashSet();
    }

    public static int h(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Calendar b4 = w.b();
        b4.set(5, 1);
        Calendar a2 = w.a(b4);
        a2.get(2);
        a2.get(1);
        int maximum = a2.getMaximum(7);
        a2.getActualMaximum(5);
        a2.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    public static boolean i(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(m3.l.V(context, R.attr.materialCalendarStyle, k.class.getCanonicalName()).data, new int[]{i});
        boolean z3 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z3;
    }

    public final void g() {
        if (getArguments().getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0174y, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f5670a.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0174y, androidx.fragment.app.K
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f5672c = bundle.getInt("OVERRIDE_THEME_RES_ID");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f5674e = (b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f5676g = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.h = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f5677j = bundle.getInt("INPUT_MODE_KEY");
        this.f5678k = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f5679l = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.f5680m = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f5681n = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.f5682o = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.p = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.f5683q = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f5684r = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence charSequence = this.h;
        if (charSequence == null) {
            charSequence = requireContext().getResources().getText(this.f5676g);
        }
        this.f5689w = charSequence;
        if (charSequence != null) {
            CharSequence[] split = TextUtils.split(String.valueOf(charSequence), "\n");
            if (split.length > 1) {
                charSequence = split[0];
            }
        } else {
            charSequence = null;
        }
        this.f5690x = charSequence;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0174y
    public final Dialog onCreateDialog(Bundle bundle) {
        Context requireContext = requireContext();
        requireContext();
        int i = this.f5672c;
        if (i == 0) {
            g();
            throw null;
        }
        Dialog dialog = new Dialog(requireContext, i);
        Context context = dialog.getContext();
        this.i = i(context, android.R.attr.windowFullscreen);
        this.f5687u = new E2.g(context, null, R.attr.materialCalendarStyle, 2132018319);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC0379a.f6766n, R.attr.materialCalendarStyle, 2132018319);
        int color = obtainStyledAttributes.getColor(1, 0);
        obtainStyledAttributes.recycle();
        this.f5687u.h(context);
        this.f5687u.j(ColorStateList.valueOf(color));
        E2.g gVar = this.f5687u;
        View decorView = dialog.getWindow().getDecorView();
        WeakHashMap weakHashMap = X.f1226a;
        gVar.i(L.i(decorView));
        return dialog;
    }

    @Override // androidx.fragment.app.K
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(this.i ? R.layout.mtrl_picker_fullscreen : R.layout.mtrl_picker_dialog, viewGroup);
        Context context = inflate.getContext();
        if (this.i) {
            inflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(h(context), -2));
        } else {
            inflate.findViewById(R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(h(context), -1));
        }
        TextView textView = (TextView) inflate.findViewById(R.id.mtrl_picker_header_selection_text);
        WeakHashMap weakHashMap = X.f1226a;
        textView.setAccessibilityLiveRegion(1);
        this.f5686t = (CheckableImageButton) inflate.findViewById(R.id.mtrl_picker_header_toggle);
        this.f5685s = (TextView) inflate.findViewById(R.id.mtrl_picker_title_text);
        this.f5686t.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.f5686t;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, AbstractC0106b.m(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], AbstractC0106b.m(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.f5686t.setChecked(this.f5677j != 0);
        X.j(this.f5686t, null);
        CheckableImageButton checkableImageButton2 = this.f5686t;
        this.f5686t.setContentDescription(this.f5677j == 1 ? checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode));
        this.f5686t.setOnClickListener(new D1.a(this, 19));
        g();
        throw null;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0174y, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f5671b.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, com.google.android.material.datepicker.a] */
    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0174y, androidx.fragment.app.K
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f5672c);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        b bVar = this.f5674e;
        ?? obj = new Object();
        int i = a.f5632b;
        int i4 = a.f5632b;
        long j4 = bVar.f5634a.f5698f;
        long j5 = bVar.f5635b.f5698f;
        obj.f5633a = Long.valueOf(bVar.f5637d.f5698f);
        k kVar = this.f5675f;
        o oVar = kVar == null ? null : kVar.f5660d;
        if (oVar != null) {
            obj.f5633a = Long.valueOf(oVar.f5698f);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", bVar.f5636c);
        o b4 = o.b(j4);
        o b5 = o.b(j5);
        d dVar = (d) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l4 = obj.f5633a;
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new b(b4, b5, dVar, l4 == null ? null : o.b(l4.longValue()), bVar.f5638e));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f5676g);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.h);
        bundle.putInt("INPUT_MODE_KEY", this.f5677j);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f5678k);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f5679l);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f5680m);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f5681n);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f5682o);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.p);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f5683q);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f5684r);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0174y, androidx.fragment.app.K
    public final void onStart() {
        E0 e02;
        E0 e03;
        WindowInsetsController insetsController;
        WindowInsetsController insetsController2;
        super.onStart();
        Window window = requireDialog().getWindow();
        if (this.i) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f5687u);
            if (!this.f5688v) {
                View findViewById = requireView().findViewById(R.id.fullscreen_header);
                ColorStateList p = m3.l.p(findViewById.getBackground());
                Integer valueOf = p != null ? Integer.valueOf(p.getDefaultColor()) : null;
                boolean z3 = valueOf == null || valueOf.intValue() == 0;
                int s4 = m3.d.s(window.getContext(), android.R.attr.colorBackground, -16777216);
                if (z3) {
                    valueOf = Integer.valueOf(s4);
                }
                AbstractC0105a.O(window, false);
                window.getContext();
                window.getContext();
                window.setStatusBarColor(0);
                window.setNavigationBarColor(0);
                boolean z4 = m3.d.x(0) || m3.d.x(valueOf.intValue());
                E2.e eVar = new E2.e(window.getDecorView(), 5);
                if (Build.VERSION.SDK_INT >= 30) {
                    insetsController2 = window.getInsetsController();
                    F0 f02 = new F0(insetsController2, eVar);
                    f02.f1215b = window;
                    e02 = f02;
                } else {
                    e02 = new E0(window, eVar);
                }
                e02.F(z4);
                boolean z5 = m3.d.x(0) || m3.d.x(s4);
                E2.e eVar2 = new E2.e(window.getDecorView(), 5);
                if (Build.VERSION.SDK_INT >= 30) {
                    insetsController = window.getInsetsController();
                    F0 f03 = new F0(insetsController, eVar2);
                    f03.f1215b = window;
                    e03 = f03;
                } else {
                    e03 = new E0(window, eVar2);
                }
                e03.E(z5);
                l lVar = new l(findViewById, findViewById.getLayoutParams().height, findViewById.getPaddingTop());
                WeakHashMap weakHashMap = X.f1226a;
                L.u(findViewById, lVar);
                this.f5688v = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f5687u, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new ViewOnTouchListenerC0634a(requireDialog(), rect));
        }
        requireContext();
        int i = this.f5672c;
        if (i == 0) {
            g();
            throw null;
        }
        g();
        b bVar = this.f5674e;
        k kVar = new k();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", bVar.f5637d);
        kVar.setArguments(bundle);
        this.f5675f = kVar;
        t tVar = kVar;
        if (this.f5677j == 1) {
            g();
            b bVar2 = this.f5674e;
            t nVar = new n();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", i);
            bundle2.putParcelable("DATE_SELECTOR_KEY", null);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar2);
            nVar.setArguments(bundle2);
            tVar = nVar;
        }
        this.f5673d = tVar;
        this.f5685s.setText((this.f5677j == 1 && getResources().getConfiguration().orientation == 2) ? this.f5690x : this.f5689w);
        g();
        getContext();
        throw null;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0174y, androidx.fragment.app.K
    public final void onStop() {
        this.f5673d.f5712a.clear();
        super.onStop();
    }
}
