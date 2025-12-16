package T2;

import java.util.Calendar;
import java.util.GregorianCalendar;

/* loaded from: classes3.dex */
public final class g implements Q2.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1675a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Q2.l f1676b;

    public /* synthetic */ g(Q2.l lVar, int i) {
        this.f1675a = i;
        this.f1676b = lVar;
    }

    @Override // Q2.m
    public final Q2.l a(Q2.d dVar, X2.a aVar) {
        switch (this.f1675a) {
            case 0:
                if (aVar.getRawType() == Number.class) {
                    return (h) this.f1676b;
                }
                return null;
            default:
                Class<Object> rawType = aVar.getRawType();
                if (rawType == Calendar.class || rawType == GregorianCalendar.class) {
                    return (h) this.f1676b;
                }
                return null;
        }
    }

    public String toString() {
        switch (this.f1675a) {
            case 1:
                return "Factory[type=" + Calendar.class.getName() + "+" + GregorianCalendar.class.getName() + ",adapter=" + ((h) this.f1676b) + "]";
            default:
                return super.toString();
        }
    }
}
