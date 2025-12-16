package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import android.util.Xml;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.HashMap;
import u.AbstractC0629f;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2539a = false;

    /* renamed from: b, reason: collision with root package name */
    public int f2540b;

    /* renamed from: c, reason: collision with root package name */
    public int f2541c;

    /* renamed from: d, reason: collision with root package name */
    public float f2542d;

    /* renamed from: e, reason: collision with root package name */
    public String f2543e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2544f;

    /* renamed from: g, reason: collision with root package name */
    public int f2545g;

    public b(b bVar, Object obj) {
        bVar.getClass();
        this.f2540b = bVar.f2540b;
        b(obj);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [androidx.constraintlayout.widget.b, java.lang.Object] */
    public static void a(Context context, XmlResourceParser xmlResourceParser, HashMap hashMap) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), s.f2751d);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        int i = 0;
        boolean z3 = false;
        Object obj = null;
        for (int i4 = 0; i4 < indexCount; i4++) {
            int index = obtainStyledAttributes.getIndex(i4);
            int i5 = 1;
            if (index == 0) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == 10) {
                str = obtainStyledAttributes.getString(index);
                z3 = true;
            } else if (index == 1) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                i = 6;
            } else {
                int i6 = 3;
                if (index == 3) {
                    obj = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else {
                    i6 = 4;
                    if (index == 2) {
                        obj = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                    } else {
                        if (index == 7) {
                            obj = Float.valueOf(TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, BitmapDescriptorFactory.HUE_RED), context.getResources().getDisplayMetrics()));
                        } else if (index == 4) {
                            obj = Float.valueOf(obtainStyledAttributes.getDimension(index, BitmapDescriptorFactory.HUE_RED));
                        } else {
                            i6 = 5;
                            if (index == 5) {
                                obj = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                                i = 2;
                            } else {
                                if (index == 6) {
                                    obj = Integer.valueOf(obtainStyledAttributes.getInteger(index, -1));
                                } else if (index == 9) {
                                    obj = obtainStyledAttributes.getString(index);
                                } else {
                                    i5 = 8;
                                    if (index == 8) {
                                        int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                                        if (resourceId == -1) {
                                            resourceId = obtainStyledAttributes.getInt(index, -1);
                                        }
                                        obj = Integer.valueOf(resourceId);
                                    }
                                }
                                i = i5;
                            }
                        }
                        i = 7;
                    }
                }
                i = i6;
            }
        }
        if (str != null && obj != null) {
            ?? obj2 = new Object();
            obj2.f2540b = i;
            obj2.f2539a = z3;
            obj2.b(obj);
            hashMap.put(str, obj2);
        }
        obtainStyledAttributes.recycle();
    }

    public final void b(Object obj) {
        switch (AbstractC0629f.b(this.f2540b)) {
            case 0:
            case 7:
                this.f2541c = ((Integer) obj).intValue();
                return;
            case 1:
                this.f2542d = ((Float) obj).floatValue();
                return;
            case 2:
            case 3:
                this.f2545g = ((Integer) obj).intValue();
                return;
            case 4:
                this.f2543e = (String) obj;
                return;
            case 5:
                this.f2544f = ((Boolean) obj).booleanValue();
                return;
            case 6:
                this.f2542d = ((Float) obj).floatValue();
                return;
            default:
                return;
        }
    }
}
