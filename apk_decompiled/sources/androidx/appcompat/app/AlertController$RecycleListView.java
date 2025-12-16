package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import f.AbstractC0336a;

/* loaded from: classes.dex */
public class AlertController$RecycleListView extends ListView {

    /* renamed from: a, reason: collision with root package name */
    public final int f2334a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2335b;

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0336a.f6438t);
        this.f2335b = obtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.f2334a = obtainStyledAttributes.getDimensionPixelOffset(1, -1);
    }
}
