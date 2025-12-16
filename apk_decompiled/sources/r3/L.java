package r3;

import a.AbstractC0105a;
import com.google.firebase.sessions.settings.RemoteSettings;
import f0.C0338b;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.zip.Inflater;
import kotlin.ExceptionsKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class L extends n {

    /* renamed from: e, reason: collision with root package name */
    public static final z f8265e;

    /* renamed from: b, reason: collision with root package name */
    public final z f8266b;

    /* renamed from: c, reason: collision with root package name */
    public final u f8267c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f8268d;

    static {
        String str = z.f8321b;
        f8265e = C0338b.o(RemoteSettings.FORWARD_SLASH_STRING);
    }

    public L(z zipPath, u fileSystem, Map entries) {
        Intrinsics.checkNotNullParameter(zipPath, "zipPath");
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        Intrinsics.checkNotNullParameter(entries, "entries");
        this.f8266b = zipPath;
        this.f8267c = fileSystem;
        this.f8268d = entries;
    }

    @Override // r3.n
    public final void a(z path) {
        Intrinsics.checkNotNullParameter(path, "path");
        throw new IOException("zip file systems are read-only");
    }

    @Override // r3.n
    public final List d(z child) {
        Intrinsics.checkNotNullParameter(child, "dir");
        z zVar = f8265e;
        zVar.getClass();
        Intrinsics.checkNotNullParameter(child, "child");
        s3.i iVar = (s3.i) this.f8268d.get(s3.c.b(zVar, child, true));
        if (iVar != null) {
            List list = CollectionsKt.toList(iVar.h);
            Intrinsics.checkNotNull(list);
            return list;
        }
        throw new IOException("not a directory: " + child);
    }

    @Override // r3.n
    public final m f(z child) {
        m mVar;
        Throwable th;
        Intrinsics.checkNotNullParameter(child, "path");
        z zVar = f8265e;
        zVar.getClass();
        Intrinsics.checkNotNullParameter(child, "child");
        s3.i iVar = (s3.i) this.f8268d.get(s3.c.b(zVar, child, true));
        Throwable th2 = null;
        if (iVar == null) {
            return null;
        }
        boolean z3 = iVar.f8490b;
        m basicMetadata = new m(!z3, z3, null, z3 ? null : Long.valueOf(iVar.f8492d), null, iVar.f8494f, null);
        long j4 = iVar.f8495g;
        if (j4 == -1) {
            return basicMetadata;
        }
        t j5 = this.f8267c.j(this.f8266b);
        try {
            C d4 = AbstractC0105a.d(j5.e(j4));
            try {
                Intrinsics.checkNotNullParameter(d4, "<this>");
                Intrinsics.checkNotNullParameter(basicMetadata, "basicMetadata");
                mVar = s3.l.e(d4, basicMetadata);
                Intrinsics.checkNotNull(mVar);
                try {
                    d4.close();
                    th = null;
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                try {
                    d4.close();
                } catch (Throwable th5) {
                    ExceptionsKt.addSuppressed(th4, th5);
                }
                th = th4;
                mVar = null;
            }
        } catch (Throwable th6) {
            try {
                j5.close();
            } catch (Throwable th7) {
                ExceptionsKt.addSuppressed(th6, th7);
            }
            mVar = null;
            th2 = th6;
        }
        if (th != null) {
            throw th;
        }
        Intrinsics.checkNotNull(mVar);
        try {
            j5.close();
        } catch (Throwable th8) {
            th2 = th8;
        }
        if (th2 != null) {
            throw th2;
        }
        Intrinsics.checkNotNull(mVar);
        return mVar;
    }

    @Override // r3.n
    public final G g(z file) {
        Intrinsics.checkNotNullParameter(file, "file");
        throw new IOException("zip file systems are read-only");
    }

    @Override // r3.n
    public final I h(z child) {
        Throwable th;
        C c4;
        Intrinsics.checkNotNullParameter(child, "file");
        z zVar = f8265e;
        zVar.getClass();
        Intrinsics.checkNotNullParameter(child, "child");
        s3.i iVar = (s3.i) this.f8268d.get(s3.c.b(zVar, child, true));
        if (iVar == null) {
            throw new FileNotFoundException("no such file: " + child);
        }
        t j4 = this.f8267c.j(this.f8266b);
        try {
            c4 = AbstractC0105a.d(j4.e(iVar.f8495g));
            try {
                j4.close();
                th = null;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            try {
                j4.close();
            } catch (Throwable th4) {
                ExceptionsKt.addSuppressed(th3, th4);
            }
            th = th3;
            c4 = null;
        }
        if (th != null) {
            throw th;
        }
        Intrinsics.checkNotNull(c4);
        Intrinsics.checkNotNullParameter(c4, "<this>");
        s3.l.e(c4, null);
        int i = iVar.f8493e;
        long j5 = iVar.f8492d;
        if (i == 0) {
            return new s3.f(c4, j5, true);
        }
        s3.f source = new s3.f(c4, iVar.f8491c, true);
        Inflater inflater = new Inflater(true);
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return new s3.f(new s(AbstractC0105a.d(source), inflater), j5, false);
    }
}
