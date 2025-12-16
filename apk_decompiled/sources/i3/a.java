package i3;

import e3.F;
import e3.O;
import e3.x;
import e3.y;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a implements y {

    /* renamed from: a, reason: collision with root package name */
    public static final a f6826a = new Object();

    @Override // e3.y
    public final O intercept(x chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        j3.g chain2 = (j3.g) chain;
        j jVar = chain2.f6948a;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(chain2, "chain");
        synchronized (jVar) {
            if (!jVar.f6870m) {
                throw new IllegalStateException("released");
            }
            if (jVar.f6869l) {
                throw new IllegalStateException("Check failed.");
            }
            if (jVar.f6868k) {
                throw new IllegalStateException("Check failed.");
            }
            Unit unit = Unit.INSTANCE;
        }
        f fVar = jVar.f6866g;
        Intrinsics.checkNotNull(fVar);
        F client = jVar.f6860a;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(chain2, "chain");
        try {
            int i = chain2.f6953f;
            int i4 = chain2.f6954g;
            int i5 = chain2.h;
            client.getClass();
            e eVar = new e(jVar, fVar, fVar.a(i, client.f6238f, !Intrinsics.areEqual(chain2.f6952e.f6268b, "GET"), i4, i5).j(client, chain2));
            jVar.f6867j = eVar;
            jVar.f6872o = eVar;
            synchronized (jVar) {
                jVar.f6868k = true;
                jVar.f6869l = true;
            }
            if (jVar.f6871n) {
                throw new IOException("Canceled");
            }
            return j3.g.a(chain2, 0, eVar, null, 61).b(chain2.f6952e);
        } catch (n e4) {
            fVar.c(e4.f6891b);
            throw e4;
        } catch (IOException e5) {
            fVar.c(e5);
            throw new n(e5);
        }
    }
}
