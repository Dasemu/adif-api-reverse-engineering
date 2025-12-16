package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final int f2624a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f2625b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final int f2626c;

    /* renamed from: d, reason: collision with root package name */
    public final p f2627d;

    public g(Context context, XmlResourceParser xmlResourceParser) {
        this.f2626c = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), s.h);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.f2624a = obtainStyledAttributes.getResourceId(index, this.f2624a);
            } else if (index == 1) {
                int resourceId = obtainStyledAttributes.getResourceId(index, this.f2626c);
                this.f2626c = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    p pVar = new p();
                    this.f2627d = pVar;
                    pVar.b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            }
        }
        obtainStyledAttributes.recycle();
    }
}
