package androidx.recyclerview.widget;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;

/* renamed from: androidx.recyclerview.widget.n0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0232n0 {
    @Deprecated
    public void getItemOffsets(Rect rect, int i, RecyclerView recyclerView) {
        rect.set(0, 0, 0, 0);
    }

    @Deprecated
    public void onDraw(Canvas canvas, RecyclerView recyclerView) {
    }

    @Deprecated
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView) {
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, E0 e02) {
        getItemOffsets(rect, ((C0239r0) view.getLayoutParams()).f3897a.getLayoutPosition(), recyclerView);
    }

    public void onDraw(Canvas canvas, RecyclerView recyclerView, E0 e02) {
        onDraw(canvas, recyclerView);
    }

    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, E0 e02) {
        onDrawOver(canvas, recyclerView);
    }
}
