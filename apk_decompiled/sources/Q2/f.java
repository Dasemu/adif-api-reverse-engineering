package Q2;

import T2.p;
import T2.r;
import java.io.IOException;
import java.io.StringWriter;

/* loaded from: classes3.dex */
public abstract class f {
    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            Y2.b bVar = new Y2.b(stringWriter);
            bVar.f2157e = true;
            p pVar = r.f1710a;
            T2.h.d(bVar, this);
            return stringWriter.toString();
        } catch (IOException e4) {
            throw new AssertionError(e4);
        }
    }
}
