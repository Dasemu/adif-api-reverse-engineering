package L;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class e implements N.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1028a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1029b;

    public /* synthetic */ e(Object obj, int i) {
        this.f1028a = i;
        this.f1029b = obj;
    }

    @Override // N.a
    public final void a(Object obj) {
        switch (this.f1028a) {
            case 0:
                f fVar = (f) obj;
                if (fVar == null) {
                    fVar = new f(-3);
                }
                ((F.i) this.f1029b).B(fVar);
                return;
            default:
                f fVar2 = (f) obj;
                synchronized (g.f1034c) {
                    try {
                        s.j jVar = g.f1035d;
                        ArrayList arrayList = (ArrayList) jVar.get((String) this.f1029b);
                        if (arrayList == null) {
                            return;
                        }
                        jVar.remove((String) this.f1029b);
                        for (int i = 0; i < arrayList.size(); i++) {
                            ((N.a) arrayList.get(i)).a(fVar2);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
