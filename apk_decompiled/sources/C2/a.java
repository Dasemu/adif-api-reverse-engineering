package C2;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.StateSet;
import kotlin.KotlinVersion;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f354a = {R.attr.state_pressed};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f355b = {R.attr.state_focused};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f356c = {R.attr.state_selected, R.attr.state_pressed};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f357d = {R.attr.state_selected};

    public static ColorStateList a(ColorStateList colorStateList) {
        int[] iArr = f355b;
        return new ColorStateList(new int[][]{f357d, iArr, StateSet.NOTHING}, new int[]{b(colorStateList, f356c), b(colorStateList, iArr), b(colorStateList, f354a)});
    }

    public static int b(ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return G.a.d(colorForState, Math.min(Color.alpha(colorForState) * 2, KotlinVersion.MAX_COMPONENT_VALUE));
    }

    public static ColorStateList c(ColorStateList colorStateList) {
        return colorStateList != null ? colorStateList : ColorStateList.valueOf(0);
    }
}
