package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;
import com.adif.elcanomovil.R;
import e3.C0325k;

/* renamed from: m.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0487t {

    /* renamed from: b, reason: collision with root package name */
    public static final PorterDuff.Mode f7743b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c, reason: collision with root package name */
    public static C0487t f7744c;

    /* renamed from: a, reason: collision with root package name */
    public E0 f7745a;

    public static synchronized C0487t a() {
        C0487t c0487t;
        synchronized (C0487t.class) {
            try {
                if (f7744c == null) {
                    d();
                }
                c0487t = f7744c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0487t;
    }

    public static synchronized PorterDuffColorFilter c(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter e4;
        synchronized (C0487t.class) {
            e4 = E0.e(i, mode);
        }
        return e4;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [m.t, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [I0.g, java.lang.Object] */
    public static synchronized void d() {
        synchronized (C0487t.class) {
            if (f7744c == null) {
                ?? obj = new Object();
                f7744c = obj;
                obj.f7745a = E0.b();
                E0 e02 = f7744c.f7745a;
                ?? obj2 = new Object();
                obj2.f753a = new int[]{R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};
                obj2.f754b = new int[]{R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
                obj2.f755c = new int[]{R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};
                obj2.f756d = new int[]{R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};
                obj2.f757e = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
                obj2.f758f = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
                synchronized (e02) {
                    e02.f7517e = obj2;
                }
            }
        }
    }

    public static void e(Drawable drawable, C0325k c0325k, int[] iArr) {
        PorterDuff.Mode mode = E0.f7511f;
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z3 = c0325k.f6367b;
        if (!z3 && !c0325k.f6366a) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilter = null;
        ColorStateList colorStateList = z3 ? (ColorStateList) c0325k.f6368c : null;
        PorterDuff.Mode mode2 = c0325k.f6366a ? (PorterDuff.Mode) c0325k.f6369d : E0.f7511f;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilter = E0.e(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilter);
    }

    public final synchronized Drawable b(Context context, int i) {
        return this.f7745a.c(context, i);
    }
}
