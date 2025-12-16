package W2;

import Q2.l;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* loaded from: classes3.dex */
public final class a extends l {

    /* renamed from: c, reason: collision with root package name */
    public static final T2.a f1966c = new T2.a(4);

    /* renamed from: d, reason: collision with root package name */
    public static final T2.a f1967d = new T2.a(5);

    /* renamed from: e, reason: collision with root package name */
    public static final T2.a f1968e = new T2.a(6);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1969a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1970b;

    public a(int i) {
        this.f1969a = i;
        switch (i) {
            case 1:
                this.f1970b = new SimpleDateFormat("hh:mm:ss a");
                return;
            default:
                this.f1970b = new SimpleDateFormat("MMM d, yyyy");
                return;
        }
    }

    @Override // Q2.l
    public final Object a(Y2.a aVar) {
        Date parse;
        Time time;
        switch (this.f1969a) {
            case 0:
                if (aVar.o0() == 9) {
                    aVar.k0();
                    return null;
                }
                String m02 = aVar.m0();
                try {
                    synchronized (this) {
                        parse = ((SimpleDateFormat) this.f1970b).parse(m02);
                    }
                    return new java.sql.Date(parse.getTime());
                } catch (ParseException e4) {
                    StringBuilder p = com.google.android.gms.measurement.internal.a.p("Failed parsing '", m02, "' as SQL Date; at path ");
                    p.append(aVar.a0(true));
                    throw new RuntimeException(p.toString(), e4);
                }
            case 1:
                if (aVar.o0() == 9) {
                    aVar.k0();
                    return null;
                }
                String m03 = aVar.m0();
                try {
                    synchronized (this) {
                        time = new Time(((SimpleDateFormat) this.f1970b).parse(m03).getTime());
                    }
                    return time;
                } catch (ParseException e5) {
                    StringBuilder p3 = com.google.android.gms.measurement.internal.a.p("Failed parsing '", m03, "' as SQL Time; at path ");
                    p3.append(aVar.a0(true));
                    throw new RuntimeException(p3.toString(), e5);
                }
            default:
                Date date = (Date) ((l) this.f1970b).a(aVar);
                if (date != null) {
                    return new Timestamp(date.getTime());
                }
                return null;
        }
    }

    @Override // Q2.l
    public final void b(Y2.b bVar, Object obj) {
        String format;
        String format2;
        switch (this.f1969a) {
            case 0:
                java.sql.Date date = (java.sql.Date) obj;
                if (date == null) {
                    bVar.b0();
                    return;
                }
                synchronized (this) {
                    format = ((SimpleDateFormat) this.f1970b).format((Date) date);
                }
                bVar.h0(format);
                return;
            case 1:
                Time time = (Time) obj;
                if (time == null) {
                    bVar.b0();
                    return;
                }
                synchronized (this) {
                    format2 = ((SimpleDateFormat) this.f1970b).format((Date) time);
                }
                bVar.h0(format2);
                return;
            default:
                ((l) this.f1970b).b(bVar, (Timestamp) obj);
                return;
        }
    }

    public a(l lVar) {
        this.f1969a = 2;
        this.f1970b = lVar;
    }
}
