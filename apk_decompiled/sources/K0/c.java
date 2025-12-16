package K0;

import java.io.IOException;
import java.util.ArrayList;
import r3.z;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f984a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f985b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f986c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f987d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f988e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f989f;

    /* renamed from: g, reason: collision with root package name */
    public b f990g;
    public int h;
    public final /* synthetic */ g i;

    public c(g gVar, String str) {
        this.i = gVar;
        this.f984a = str;
        gVar.getClass();
        this.f985b = new long[2];
        gVar.getClass();
        this.f986c = new ArrayList(2);
        gVar.getClass();
        this.f987d = new ArrayList(2);
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        gVar.getClass();
        for (int i = 0; i < 2; i++) {
            sb.append(i);
            this.f986c.add(this.i.f997a.d(sb.toString()));
            sb.append(".tmp");
            this.f987d.add(this.i.f997a.d(sb.toString()));
            sb.setLength(length);
        }
    }

    public final d a() {
        if (this.f988e && this.f990g == null && !this.f989f) {
            ArrayList arrayList = this.f986c;
            int size = arrayList.size();
            int i = 0;
            while (true) {
                g gVar = this.i;
                if (i >= size) {
                    this.h++;
                    return new d(gVar, this);
                }
                if (gVar.p.c((z) arrayList.get(i))) {
                    i++;
                } else {
                    try {
                        gVar.d0(this);
                        return null;
                    } catch (IOException unused) {
                    }
                }
            }
        }
        return null;
    }
}
