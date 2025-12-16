package M0;

import C0.p;
import J0.q;
import J0.s;
import S0.o;
import a.AbstractC0106b;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import java.nio.ByteBuffer;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class c implements g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1085a;

    /* renamed from: b, reason: collision with root package name */
    public final o f1086b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1087c;

    public /* synthetic */ c(Object obj, o oVar, int i) {
        this.f1085a = i;
        this.f1087c = obj;
        this.f1086b = oVar;
    }

    /* JADX WARN: Type inference failed for: r6v4, types: [r3.j, java.lang.Object, r3.h] */
    @Override // M0.g
    public final Object a(Continuation continuation) {
        o oVar = this.f1086b;
        Object obj = this.f1087c;
        switch (this.f1085a) {
            case 0:
                return new d(new BitmapDrawable(oVar.f1502a.getResources(), (Bitmap) obj), false, J0.g.f934b);
            case 1:
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                try {
                    ?? obj2 = new Object();
                    obj2.write(byteBuffer);
                    byteBuffer.position(0);
                    return new m(new s(obj2, new q(oVar.f1502a, 0), null), null, J0.g.f934b);
                } catch (Throwable th) {
                    byteBuffer.position(0);
                    throw th;
                }
            default:
                Drawable drawable = (Drawable) obj;
                Bitmap.Config[] configArr = W0.f.f1887a;
                boolean z3 = (drawable instanceof VectorDrawable) || (drawable instanceof p);
                if (z3) {
                    drawable = new BitmapDrawable(oVar.f1502a.getResources(), AbstractC0106b.e(drawable, oVar.f1503b, oVar.f1505d, oVar.f1506e, oVar.f1507f));
                }
                return new d(drawable, z3, J0.g.f934b);
        }
    }
}
