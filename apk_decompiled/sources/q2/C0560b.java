package q2;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import androidx.recyclerview.widget.AbstractC0232n0;
import androidx.recyclerview.widget.E0;
import androidx.recyclerview.widget.RecyclerView;
import com.adif.elcanomovil.R;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.carousel.CarouselLayoutManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: q2.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0560b extends AbstractC0232n0 {

    /* renamed from: a, reason: collision with root package name */
    public final Paint f8185a;

    /* renamed from: b, reason: collision with root package name */
    public final List f8186b;

    public C0560b() {
        Paint paint = new Paint();
        this.f8185a = paint;
        this.f8186b = Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    @Override // androidx.recyclerview.widget.AbstractC0232n0
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, E0 e02) {
        Canvas canvas2;
        super.onDrawOver(canvas, recyclerView, e02);
        Paint paint = this.f8185a;
        paint.setStrokeWidth(recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width));
        Iterator it = this.f8186b.iterator();
        while (it.hasNext()) {
            ((AbstractC0563e) it.next()).getClass();
            ThreadLocal threadLocal = G.a.f556a;
            float f2 = 1.0f - BitmapDescriptorFactory.HUE_RED;
            paint.setColor(Color.argb((int) ((Color.alpha(-16776961) * BitmapDescriptorFactory.HUE_RED) + (Color.alpha(-65281) * f2)), (int) ((Color.red(-16776961) * BitmapDescriptorFactory.HUE_RED) + (Color.red(-65281) * f2)), (int) ((Color.green(-16776961) * BitmapDescriptorFactory.HUE_RED) + (Color.green(-65281) * f2)), (int) ((Color.blue(-16776961) * BitmapDescriptorFactory.HUE_RED) + (Color.blue(-65281) * f2))));
            if (((CarouselLayoutManager) recyclerView.getLayoutManager()).I0()) {
                canvas2 = canvas;
                canvas2.drawLine(BitmapDescriptorFactory.HUE_RED, ((CarouselLayoutManager) recyclerView.getLayoutManager()).f5611q.f(), BitmapDescriptorFactory.HUE_RED, ((CarouselLayoutManager) recyclerView.getLayoutManager()).f5611q.b(), paint);
            } else {
                canvas2 = canvas;
                canvas2.drawLine(((CarouselLayoutManager) recyclerView.getLayoutManager()).f5611q.c(), BitmapDescriptorFactory.HUE_RED, ((CarouselLayoutManager) recyclerView.getLayoutManager()).f5611q.d(), BitmapDescriptorFactory.HUE_RED, paint);
            }
            canvas = canvas2;
        }
    }
}
