package B0;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import m.J0;

/* renamed from: B0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0024b extends Property {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f123a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0024b(int i, String str, Class cls) {
        super(cls, str);
        this.f123a = i;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.f123a) {
            case 0:
                return null;
            case 1:
                return null;
            case 2:
                return null;
            case 3:
                return null;
            case 4:
                return null;
            case 5:
                return Float.valueOf(((View) obj).getTransitionAlpha());
            case 6:
                return ((View) obj).getClipBounds();
            default:
                return Float.valueOf(((J0) obj).f7575z);
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.f123a) {
            case 0:
                C0027e c0027e = (C0027e) obj;
                PointF pointF = (PointF) obj2;
                c0027e.getClass();
                c0027e.f126a = Math.round(pointF.x);
                int round = Math.round(pointF.y);
                c0027e.f127b = round;
                int i = c0027e.f131f + 1;
                c0027e.f131f = i;
                if (i == c0027e.f132g) {
                    int i4 = c0027e.f126a;
                    int i5 = c0027e.f128c;
                    int i6 = c0027e.f129d;
                    C0024b c0024b = I.f105a;
                    c0027e.f130e.setLeftTopRightBottom(i4, round, i5, i6);
                    c0027e.f131f = 0;
                    c0027e.f132g = 0;
                    return;
                }
                return;
            case 1:
                C0027e c0027e2 = (C0027e) obj;
                PointF pointF2 = (PointF) obj2;
                c0027e2.getClass();
                c0027e2.f128c = Math.round(pointF2.x);
                int round2 = Math.round(pointF2.y);
                c0027e2.f129d = round2;
                int i7 = c0027e2.f132g + 1;
                c0027e2.f132g = i7;
                if (c0027e2.f131f == i7) {
                    int i8 = c0027e2.f126a;
                    int i9 = c0027e2.f127b;
                    int i10 = c0027e2.f128c;
                    C0024b c0024b2 = I.f105a;
                    c0027e2.f130e.setLeftTopRightBottom(i8, i9, i10, round2);
                    c0027e2.f131f = 0;
                    c0027e2.f132g = 0;
                    return;
                }
                return;
            case 2:
                View view = (View) obj;
                PointF pointF3 = (PointF) obj2;
                int left = view.getLeft();
                int top = view.getTop();
                int round3 = Math.round(pointF3.x);
                int round4 = Math.round(pointF3.y);
                C0024b c0024b3 = I.f105a;
                view.setLeftTopRightBottom(left, top, round3, round4);
                return;
            case 3:
                View view2 = (View) obj;
                PointF pointF4 = (PointF) obj2;
                int round5 = Math.round(pointF4.x);
                int round6 = Math.round(pointF4.y);
                int right = view2.getRight();
                int bottom = view2.getBottom();
                C0024b c0024b4 = I.f105a;
                view2.setLeftTopRightBottom(round5, round6, right, bottom);
                return;
            case 4:
                View view3 = (View) obj;
                PointF pointF5 = (PointF) obj2;
                int round7 = Math.round(pointF5.x);
                int round8 = Math.round(pointF5.y);
                int width = view3.getWidth() + round7;
                int height = view3.getHeight() + round8;
                C0024b c0024b5 = I.f105a;
                view3.setLeftTopRightBottom(round7, round8, width, height);
                return;
            case 5:
                ((View) obj).setTransitionAlpha(((Float) obj2).floatValue());
                return;
            case 6:
                ((View) obj).setClipBounds((Rect) obj2);
                return;
            default:
                ((J0) obj).setThumbPosition(((Float) obj2).floatValue());
                return;
        }
    }
}
