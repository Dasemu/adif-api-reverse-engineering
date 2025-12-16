package m;

import android.content.Context;
import android.graphics.RectF;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: m.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0451a0 {

    /* renamed from: a, reason: collision with root package name */
    public int f7647a = 0;

    /* renamed from: b, reason: collision with root package name */
    public float f7648b = -1.0f;

    /* renamed from: c, reason: collision with root package name */
    public float f7649c = -1.0f;

    /* renamed from: d, reason: collision with root package name */
    public float f7650d = -1.0f;

    /* renamed from: e, reason: collision with root package name */
    public int[] f7651e = new int[0];

    /* renamed from: f, reason: collision with root package name */
    public boolean f7652f = false;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f7653g;
    public final Context h;

    static {
        new RectF();
        new ConcurrentHashMap();
    }

    public C0451a0(TextView textView) {
        this.f7653g = textView;
        this.h = textView.getContext();
        new Y();
    }

    public static int[] a(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i : iArr) {
                if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                    arrayList.add(Integer.valueOf(i));
                }
            }
            if (length != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i4 = 0; i4 < size; i4++) {
                    iArr2[i4] = ((Integer) arrayList.get(i4)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    public final boolean b() {
        return !(this.f7653g instanceof AppCompatEditText);
    }
}
