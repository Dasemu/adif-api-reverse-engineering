package x;

import C.w;
import f0.C0338b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import u.C0626c;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: f, reason: collision with root package name */
    public static int f8838f;

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f8839a;

    /* renamed from: b, reason: collision with root package name */
    public int f8840b;

    /* renamed from: c, reason: collision with root package name */
    public int f8841c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f8842d;

    /* renamed from: e, reason: collision with root package name */
    public int f8843e;

    public final void a(ArrayList arrayList) {
        int size = this.f8839a.size();
        if (this.f8843e != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                m mVar = (m) arrayList.get(i);
                if (this.f8843e == mVar.f8840b) {
                    c(this.f8841c, mVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int b(C0626c c0626c, int i) {
        int n4;
        int n5;
        ArrayList arrayList = this.f8839a;
        if (arrayList.size() == 0) {
            return 0;
        }
        w.e eVar = (w.e) ((w.d) arrayList.get(0)).f8681T;
        c0626c.t();
        eVar.b(c0626c, false);
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            ((w.d) arrayList.get(i4)).b(c0626c, false);
        }
        if (i == 0 && eVar.f8745z0 > 0) {
            w.j.a(eVar, c0626c, arrayList, 0);
        }
        if (i == 1 && eVar.A0 > 0) {
            w.j.a(eVar, c0626c, arrayList, 1);
        }
        try {
            c0626c.p();
        } catch (Exception e4) {
            e4.printStackTrace();
        }
        this.f8842d = new ArrayList();
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            w.d dVar = (w.d) arrayList.get(i5);
            C0338b c0338b = new C0338b(20);
            new WeakReference(dVar);
            C0626c.n(dVar.f8671I);
            C0626c.n(dVar.J);
            C0626c.n(dVar.f8672K);
            C0626c.n(dVar.f8673L);
            C0626c.n(dVar.f8674M);
            this.f8842d.add(c0338b);
        }
        if (i == 0) {
            n4 = C0626c.n(eVar.f8671I);
            n5 = C0626c.n(eVar.f8672K);
            c0626c.t();
        } else {
            n4 = C0626c.n(eVar.J);
            n5 = C0626c.n(eVar.f8673L);
            c0626c.t();
        }
        return n5 - n4;
    }

    public final void c(int i, m mVar) {
        Iterator it = this.f8839a.iterator();
        while (it.hasNext()) {
            w.d dVar = (w.d) it.next();
            ArrayList arrayList = mVar.f8839a;
            if (!arrayList.contains(dVar)) {
                arrayList.add(dVar);
            }
            int i4 = mVar.f8840b;
            if (i == 0) {
                dVar.f8712n0 = i4;
            } else {
                dVar.f8714o0 = i4;
            }
        }
        this.f8843e = mVar.f8840b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.f8841c;
        sb.append(i == 0 ? "Horizontal" : i == 1 ? "Vertical" : i == 2 ? "Both" : "Unknown");
        sb.append(" [");
        String m4 = com.google.android.gms.measurement.internal.a.m(sb, this.f8840b, "] <");
        Iterator it = this.f8839a.iterator();
        while (it.hasNext()) {
            m4 = m4 + " " + ((w.d) it.next()).f8701h0;
        }
        return w.n(m4, " >");
    }
}
