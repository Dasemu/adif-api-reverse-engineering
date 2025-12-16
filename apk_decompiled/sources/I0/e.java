package I0;

import android.content.Context;
import android.graphics.Bitmap;
import f0.C0338b;
import java.io.File;
import kotlin.io.FilesKt__UtilsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import r3.z;

/* loaded from: classes.dex */
public final class e extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f750a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f751b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(g gVar, int i) {
        super(0);
        this.f750a = i;
        this.f751b = gVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        K0.j jVar;
        File resolve;
        switch (this.f750a) {
            case 0:
                return new Q0.a((Context) this.f751b.f753a).a();
            default:
                W0.i iVar = W0.i.f1897a;
                Context context = (Context) this.f751b.f753a;
                synchronized (iVar) {
                    try {
                        jVar = W0.i.f1898b;
                        if (jVar == null) {
                            K0.a aVar = new K0.a();
                            Bitmap.Config[] configArr = W0.f.f1887a;
                            File cacheDir = context.getCacheDir();
                            if (cacheDir == null) {
                                throw new IllegalStateException("cacheDir == null");
                            }
                            cacheDir.mkdirs();
                            resolve = FilesKt__UtilsKt.resolve(cacheDir, "image_cache");
                            String str = z.f8321b;
                            aVar.f974a = C0338b.p(resolve);
                            jVar = aVar.a();
                            W0.i.f1898b = jVar;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return jVar;
        }
    }
}
