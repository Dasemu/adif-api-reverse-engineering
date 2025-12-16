package m;

/* loaded from: classes.dex */
public final class G0 {

    /* renamed from: a, reason: collision with root package name */
    public int f7520a;

    /* renamed from: b, reason: collision with root package name */
    public int f7521b;

    /* renamed from: c, reason: collision with root package name */
    public int f7522c;

    /* renamed from: d, reason: collision with root package name */
    public int f7523d;

    /* renamed from: e, reason: collision with root package name */
    public int f7524e;

    /* renamed from: f, reason: collision with root package name */
    public int f7525f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f7526g;
    public boolean h;

    public final void a(int i, int i4) {
        this.f7522c = i;
        this.f7523d = i4;
        this.h = true;
        if (this.f7526g) {
            if (i4 != Integer.MIN_VALUE) {
                this.f7520a = i4;
            }
            if (i != Integer.MIN_VALUE) {
                this.f7521b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f7520a = i;
        }
        if (i4 != Integer.MIN_VALUE) {
            this.f7521b = i4;
        }
    }
}
