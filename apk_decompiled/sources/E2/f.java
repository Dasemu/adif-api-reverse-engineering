package E2;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.KotlinVersion;
import w2.C0651a;

/* loaded from: classes3.dex */
public class f extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public k f386a;

    /* renamed from: b, reason: collision with root package name */
    public C0651a f387b;

    /* renamed from: c, reason: collision with root package name */
    public ColorStateList f388c;

    /* renamed from: d, reason: collision with root package name */
    public ColorStateList f389d;

    /* renamed from: e, reason: collision with root package name */
    public ColorStateList f390e;

    /* renamed from: f, reason: collision with root package name */
    public PorterDuff.Mode f391f;

    /* renamed from: g, reason: collision with root package name */
    public Rect f392g;
    public final float h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f393j;

    /* renamed from: k, reason: collision with root package name */
    public int f394k;

    /* renamed from: l, reason: collision with root package name */
    public float f395l;

    /* renamed from: m, reason: collision with root package name */
    public float f396m;

    /* renamed from: n, reason: collision with root package name */
    public int f397n;

    /* renamed from: o, reason: collision with root package name */
    public int f398o;
    public final Paint.Style p;

    public f(k kVar) {
        this.f388c = null;
        this.f389d = null;
        this.f390e = null;
        this.f391f = PorterDuff.Mode.SRC_IN;
        this.f392g = null;
        this.h = 1.0f;
        this.i = 1.0f;
        this.f394k = KotlinVersion.MAX_COMPONENT_VALUE;
        this.f395l = BitmapDescriptorFactory.HUE_RED;
        this.f396m = BitmapDescriptorFactory.HUE_RED;
        this.f397n = 0;
        this.f398o = 0;
        this.p = Paint.Style.FILL_AND_STROKE;
        this.f386a = kVar;
        this.f387b = null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        g gVar = new g(this);
        gVar.f404e = true;
        return gVar;
    }

    public f(f fVar) {
        this.f388c = null;
        this.f389d = null;
        this.f390e = null;
        this.f391f = PorterDuff.Mode.SRC_IN;
        this.f392g = null;
        this.h = 1.0f;
        this.i = 1.0f;
        this.f394k = KotlinVersion.MAX_COMPONENT_VALUE;
        this.f395l = BitmapDescriptorFactory.HUE_RED;
        this.f396m = BitmapDescriptorFactory.HUE_RED;
        this.f397n = 0;
        this.f398o = 0;
        this.p = Paint.Style.FILL_AND_STROKE;
        this.f386a = fVar.f386a;
        this.f387b = fVar.f387b;
        this.f393j = fVar.f393j;
        this.f388c = fVar.f388c;
        this.f389d = fVar.f389d;
        this.f391f = fVar.f391f;
        this.f390e = fVar.f390e;
        this.f394k = fVar.f394k;
        this.h = fVar.h;
        this.f398o = fVar.f398o;
        this.i = fVar.i;
        this.f395l = fVar.f395l;
        this.f396m = fVar.f396m;
        this.f397n = fVar.f397n;
        this.p = fVar.p;
        if (fVar.f392g != null) {
            this.f392g = new Rect(fVar.f392g);
        }
    }
}
