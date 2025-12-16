package androidx.viewpager2.adapter;

/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f4068a;

    public a(f fVar) {
        this.f4068a = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f fVar = this.f4068a;
        fVar.mIsInGracePeriod = false;
        fVar.gcFragments();
    }
}
