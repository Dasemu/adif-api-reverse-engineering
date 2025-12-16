package K0;

import java.io.Closeable;
import kotlin.Unit;
import kotlin.text.Regex;

/* loaded from: classes.dex */
public final class d implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final c f991a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f992b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f993c;

    public d(g gVar, c cVar) {
        this.f993c = gVar;
        this.f991a = cVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f992b) {
            return;
        }
        this.f992b = true;
        g gVar = this.f993c;
        synchronized (gVar) {
            c cVar = this.f991a;
            int i = cVar.h - 1;
            cVar.h = i;
            if (i == 0 && cVar.f989f) {
                Regex regex = g.f996q;
                gVar.d0(cVar);
            }
            Unit unit = Unit.INSTANCE;
        }
    }
}
