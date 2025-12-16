package q2;

import com.google.android.material.carousel.CarouselLayoutManager;

/* renamed from: q2.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0561c extends AbstractC0562d {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8187b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CarouselLayoutManager f8188c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0561c(CarouselLayoutManager carouselLayoutManager, int i) {
        super(1);
        this.f8187b = i;
        switch (i) {
            case 1:
                this.f8188c = carouselLayoutManager;
                super(0);
                return;
            default:
                this.f8188c = carouselLayoutManager;
                return;
        }
    }

    @Override // q2.AbstractC0562d
    public final int b() {
        switch (this.f8187b) {
            case 0:
                return this.f8188c.f3895o;
            default:
                CarouselLayoutManager carouselLayoutManager = this.f8188c;
                return carouselLayoutManager.f3895o - carouselLayoutManager.H();
        }
    }

    @Override // q2.AbstractC0562d
    public final int c() {
        switch (this.f8187b) {
            case 0:
                return this.f8188c.I();
            default:
                return 0;
        }
    }

    @Override // q2.AbstractC0562d
    public final int d() {
        switch (this.f8187b) {
            case 0:
                CarouselLayoutManager carouselLayoutManager = this.f8188c;
                return carouselLayoutManager.f3894n - carouselLayoutManager.J();
            default:
                return this.f8188c.f3894n;
        }
    }

    @Override // q2.AbstractC0562d
    public final int e() {
        switch (this.f8187b) {
            case 0:
                return 0;
            default:
                CarouselLayoutManager carouselLayoutManager = this.f8188c;
                if (carouselLayoutManager.J0()) {
                    return carouselLayoutManager.f3894n;
                }
                return 0;
        }
    }

    @Override // q2.AbstractC0562d
    public final int f() {
        switch (this.f8187b) {
            case 0:
                return 0;
            default:
                return this.f8188c.K();
        }
    }
}
