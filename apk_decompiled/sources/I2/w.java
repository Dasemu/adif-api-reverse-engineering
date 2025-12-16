package I2;

import O.X;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public final class w extends ArrayAdapter {

    /* renamed from: a, reason: collision with root package name */
    public ColorStateList f899a;

    /* renamed from: b, reason: collision with root package name */
    public ColorStateList f900b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x f901c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(x xVar, Context context, int i, String[] strArr) {
        super(context, i, strArr);
        this.f901c = xVar;
        a();
    }

    public final void a() {
        ColorStateList colorStateList;
        x xVar = this.f901c;
        ColorStateList colorStateList2 = xVar.f907l;
        ColorStateList colorStateList3 = null;
        if (colorStateList2 != null) {
            int[] iArr = {R.attr.state_pressed};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
        } else {
            colorStateList = null;
        }
        this.f900b = colorStateList;
        if (xVar.f906k != 0 && xVar.f907l != null) {
            int[] iArr2 = {R.attr.state_hovered, -16842919};
            int[] iArr3 = {R.attr.state_selected, -16842919};
            colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{G.a.b(xVar.f907l.getColorForState(iArr3, 0), xVar.f906k), G.a.b(xVar.f907l.getColorForState(iArr2, 0), xVar.f906k), xVar.f906k});
        }
        this.f899a = colorStateList3;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            x xVar = this.f901c;
            Drawable drawable = null;
            if (xVar.getText().toString().contentEquals(textView.getText()) && xVar.f906k != 0) {
                ColorDrawable colorDrawable = new ColorDrawable(xVar.f906k);
                if (this.f900b != null) {
                    H.a.h(colorDrawable, this.f899a);
                    drawable = new RippleDrawable(this.f900b, colorDrawable, null);
                } else {
                    drawable = colorDrawable;
                }
            }
            WeakHashMap weakHashMap = X.f1226a;
            textView.setBackground(drawable);
        }
        return view2;
    }
}
