package androidx.recyclerview.widget;

import android.view.MotionEvent;

/* loaded from: classes.dex */
public interface u0 {
    boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent);

    void onRequestDisallowInterceptTouchEvent(boolean z3);

    void onTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent);
}
