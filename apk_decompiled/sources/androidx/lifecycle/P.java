package androidx.lifecycle;

/* loaded from: classes.dex */
public abstract class P {

    /* renamed from: a, reason: collision with root package name */
    public final Y f3307a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3308b;

    /* renamed from: c, reason: collision with root package name */
    public int f3309c = -1;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Q f3310d;

    public P(Q q4, Y y3) {
        this.f3310d = q4;
        this.f3307a = y3;
    }

    public final void a(boolean z3) {
        if (z3 == this.f3308b) {
            return;
        }
        this.f3308b = z3;
        int i = z3 ? 1 : -1;
        Q q4 = this.f3310d;
        int i4 = q4.f3314c;
        q4.f3314c = i + i4;
        if (!q4.f3315d) {
            q4.f3315d = true;
            while (true) {
                try {
                    int i5 = q4.f3314c;
                    if (i4 == i5) {
                        break;
                    }
                    boolean z4 = i4 == 0 && i5 > 0;
                    boolean z5 = i4 > 0 && i5 == 0;
                    if (z4) {
                        q4.g();
                    } else if (z5) {
                        q4.h();
                    }
                    i4 = i5;
                } catch (Throwable th) {
                    q4.f3315d = false;
                    throw th;
                }
            }
            q4.f3315d = false;
        }
        if (this.f3308b) {
            q4.c(this);
        }
    }

    public void b() {
    }

    public boolean c(J j4) {
        return false;
    }

    public abstract boolean f();
}
