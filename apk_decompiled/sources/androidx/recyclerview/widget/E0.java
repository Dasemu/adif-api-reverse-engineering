package androidx.recyclerview.widget;

/* loaded from: classes.dex */
public final class E0 {

    /* renamed from: a, reason: collision with root package name */
    public int f3509a;

    /* renamed from: b, reason: collision with root package name */
    public int f3510b;

    /* renamed from: c, reason: collision with root package name */
    public int f3511c;

    /* renamed from: d, reason: collision with root package name */
    public int f3512d;

    /* renamed from: e, reason: collision with root package name */
    public int f3513e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3514f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3515g;
    public boolean h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3516j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3517k;

    /* renamed from: l, reason: collision with root package name */
    public int f3518l;

    /* renamed from: m, reason: collision with root package name */
    public long f3519m;

    /* renamed from: n, reason: collision with root package name */
    public int f3520n;

    public final void a(int i) {
        if ((this.f3512d & i) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.f3512d));
    }

    public final int b() {
        return this.f3515g ? this.f3510b - this.f3511c : this.f3513e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f3509a + ", mData=null, mItemCount=" + this.f3513e + ", mIsMeasuring=" + this.i + ", mPreviousLayoutItemCount=" + this.f3510b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f3511c + ", mStructureChanged=" + this.f3514f + ", mInPreLayout=" + this.f3515g + ", mRunSimpleAnimations=" + this.f3516j + ", mRunPredictiveAnimations=" + this.f3517k + '}';
    }
}
