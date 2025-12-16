package S1;

import android.widget.ImageView;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class l {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f1548a;

    static {
        int[] iArr = new int[ImageView.ScaleType.values().length];
        f1548a = iArr;
        try {
            iArr[ImageView.ScaleType.FIT_CENTER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f1548a[ImageView.ScaleType.FIT_START.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f1548a[ImageView.ScaleType.FIT_END.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f1548a[ImageView.ScaleType.FIT_XY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
