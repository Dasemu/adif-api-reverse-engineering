package x;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class e implements InterfaceC0655d {

    /* renamed from: d, reason: collision with root package name */
    public final n f8824d;

    /* renamed from: f, reason: collision with root package name */
    public int f8826f;

    /* renamed from: g, reason: collision with root package name */
    public int f8827g;

    /* renamed from: a, reason: collision with root package name */
    public n f8821a = null;

    /* renamed from: b, reason: collision with root package name */
    public boolean f8822b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f8823c = false;

    /* renamed from: e, reason: collision with root package name */
    public int f8825e = 1;
    public int h = 1;
    public f i = null;

    /* renamed from: j, reason: collision with root package name */
    public boolean f8828j = false;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f8829k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f8830l = new ArrayList();

    public e(n nVar) {
        this.f8824d = nVar;
    }

    @Override // x.InterfaceC0655d
    public final void a(InterfaceC0655d interfaceC0655d) {
        ArrayList arrayList = this.f8830l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((e) it.next()).f8828j) {
                return;
            }
        }
        this.f8823c = true;
        n nVar = this.f8821a;
        if (nVar != null) {
            nVar.a(this);
        }
        if (this.f8822b) {
            this.f8824d.a(this);
            return;
        }
        Iterator it2 = arrayList.iterator();
        e eVar = null;
        int i = 0;
        while (it2.hasNext()) {
            e eVar2 = (e) it2.next();
            if (!(eVar2 instanceof f)) {
                i++;
                eVar = eVar2;
            }
        }
        if (eVar != null && i == 1 && eVar.f8828j) {
            f fVar = this.i;
            if (fVar != null) {
                if (!fVar.f8828j) {
                    return;
                } else {
                    this.f8826f = this.h * fVar.f8827g;
                }
            }
            d(eVar.f8827g + this.f8826f);
        }
        n nVar2 = this.f8821a;
        if (nVar2 != null) {
            nVar2.a(this);
        }
    }

    public final void b(n nVar) {
        this.f8829k.add(nVar);
        if (this.f8828j) {
            nVar.a(nVar);
        }
    }

    public final void c() {
        this.f8830l.clear();
        this.f8829k.clear();
        this.f8828j = false;
        this.f8827g = 0;
        this.f8823c = false;
        this.f8822b = false;
    }

    public void d(int i) {
        if (this.f8828j) {
            return;
        }
        this.f8828j = true;
        this.f8827g = i;
        Iterator it = this.f8829k.iterator();
        while (it.hasNext()) {
            InterfaceC0655d interfaceC0655d = (InterfaceC0655d) it.next();
            interfaceC0655d.a(interfaceC0655d);
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f8824d.f8845b.f8701h0);
        sb.append(":");
        switch (this.f8825e) {
            case 1:
                str = "UNKNOWN";
                break;
            case 2:
                str = "HORIZONTAL_DIMENSION";
                break;
            case 3:
                str = "VERTICAL_DIMENSION";
                break;
            case 4:
                str = "LEFT";
                break;
            case 5:
                str = "RIGHT";
                break;
            case 6:
                str = "TOP";
                break;
            case 7:
                str = "BOTTOM";
                break;
            case 8:
                str = "BASELINE";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        sb.append("(");
        sb.append(this.f8828j ? Integer.valueOf(this.f8827g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f8830l.size());
        sb.append(":d=");
        sb.append(this.f8829k.size());
        sb.append(">");
        return sb.toString();
    }
}
