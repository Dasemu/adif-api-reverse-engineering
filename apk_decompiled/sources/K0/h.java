package K0;

import java.io.IOException;
import r3.C0576h;
import r3.G;
import r3.o;

/* loaded from: classes.dex */
public final class h extends o {

    /* renamed from: b, reason: collision with root package name */
    public final I1.b f1010b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1011c;

    public h(G g4, I1.b bVar) {
        super(g4);
        this.f1010b = bVar;
    }

    @Override // r3.o, r3.G, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            super.close();
        } catch (IOException e4) {
            this.f1011c = true;
            this.f1010b.invoke(e4);
        }
    }

    @Override // r3.o, r3.G, java.io.Flushable
    public final void flush() {
        try {
            super.flush();
        } catch (IOException e4) {
            this.f1011c = true;
            this.f1010b.invoke(e4);
        }
    }

    @Override // r3.o, r3.G
    public final void z(C0576h c0576h, long j4) {
        if (this.f1011c) {
            c0576h.l(j4);
            return;
        }
        try {
            super.z(c0576h, j4);
        } catch (IOException e4) {
            this.f1011c = true;
            this.f1010b.invoke(e4);
        }
    }
}
