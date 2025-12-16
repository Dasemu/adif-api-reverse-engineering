package O0;

import S0.o;
import java.io.File;

/* loaded from: classes.dex */
public final class a implements b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1316a;

    public a(boolean z3) {
        this.f1316a = z3;
    }

    @Override // O0.b
    public final String a(Object obj, o oVar) {
        File file = (File) obj;
        if (!this.f1316a) {
            return file.getPath();
        }
        return file.getPath() + ':' + file.lastModified();
    }
}
