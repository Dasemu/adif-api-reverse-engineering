package y2;

import a.AbstractC0106b;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.view.View;
import b.C0253b;
import com.adif.elcanomovil.R;
import com.adif.elcanomovil.repositories.circulation.CirculationMapper;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* renamed from: y2.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0662a {

    /* renamed from: a, reason: collision with root package name */
    public final TimeInterpolator f8983a;

    /* renamed from: b, reason: collision with root package name */
    public final View f8984b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8985c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8986d;

    /* renamed from: e, reason: collision with root package name */
    public final int f8987e;

    /* renamed from: f, reason: collision with root package name */
    public C0253b f8988f;

    public AbstractC0662a(View view) {
        this.f8984b = view;
        Context context = view.getContext();
        this.f8983a = AbstractC0106b.F(context, R.attr.motionEasingStandardDecelerateInterpolator, Q.a.b(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f));
        this.f8985c = AbstractC0106b.E(context, R.attr.motionDurationMedium2, CirculationMapper.TIME_TO_WARNING);
        this.f8986d = AbstractC0106b.E(context, R.attr.motionDurationShort3, 150);
        this.f8987e = AbstractC0106b.E(context, R.attr.motionDurationShort2, 100);
    }
}
