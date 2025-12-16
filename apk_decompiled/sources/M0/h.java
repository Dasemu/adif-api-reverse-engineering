package M0;

import J0.o;
import android.webkit.MimeTypeMap;
import f0.C0338b;
import java.io.File;
import kotlin.coroutines.Continuation;
import kotlin.io.FilesKt;
import r3.n;
import r3.z;

/* loaded from: classes.dex */
public final class h implements g {

    /* renamed from: a, reason: collision with root package name */
    public final File f1091a;

    public h(File file) {
        this.f1091a = file;
    }

    @Override // M0.g
    public final Object a(Continuation continuation) {
        String str = z.f8321b;
        File file = this.f1091a;
        return new m(new o(C0338b.p(file), n.f8299a, null, null), MimeTypeMap.getSingleton().getMimeTypeFromExtension(FilesKt.getExtension(file)), J0.g.f935c);
    }
}
