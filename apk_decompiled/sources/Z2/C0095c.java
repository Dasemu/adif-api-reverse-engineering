package Z2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Executable;
import java.lang.reflect.Method;

/* renamed from: Z2.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0095c extends L {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f2248k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Class f2249l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Executable f2250m;

    public /* synthetic */ C0095c(Executable executable, Class cls, int i) {
        this.f2248k = i;
        this.f2250m = executable;
        this.f2249l = cls;
    }

    @Override // Z2.L
    public final Object e() {
        switch (this.f2248k) {
            case 0:
                return ((Constructor) this.f2250m).newInstance(null);
            default:
                return ((Method) this.f2250m).invoke(null, this.f2249l, Object.class);
        }
    }

    public final String toString() {
        switch (this.f2248k) {
            case 0:
                return this.f2249l.getName();
            default:
                return this.f2249l.getName();
        }
    }
}
