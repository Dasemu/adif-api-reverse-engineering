package T2;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class d extends Q2.l {

    /* renamed from: b, reason: collision with root package name */
    public static final a f1669b = new a(1);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1670a;

    public d() {
        ArrayList arrayList = new ArrayList();
        this.f1670a = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (S2.i.f1600a >= 9) {
            arrayList.add(new SimpleDateFormat("MMM d, yyyy h:mm:ss a", locale));
        }
    }

    @Override // Q2.l
    public final Object a(Y2.a aVar) {
        if (aVar.o0() == 9) {
            aVar.k0();
            return null;
        }
        String m02 = aVar.m0();
        synchronized (this.f1670a) {
            try {
                Iterator it = this.f1670a.iterator();
                while (it.hasNext()) {
                    try {
                        return ((DateFormat) it.next()).parse(m02);
                    } catch (ParseException unused) {
                    }
                }
                try {
                    return U2.a.b(m02, new ParsePosition(0));
                } catch (ParseException e4) {
                    StringBuilder p = com.google.android.gms.measurement.internal.a.p("Failed parsing '", m02, "' as Date; at path ");
                    p.append(aVar.a0(true));
                    throw new RuntimeException(p.toString(), e4);
                }
            } finally {
            }
        }
    }

    @Override // Q2.l
    public final void b(Y2.b bVar, Object obj) {
        String format;
        Date date = (Date) obj;
        if (date == null) {
            bVar.b0();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.f1670a.get(0);
        synchronized (this.f1670a) {
            format = dateFormat.format(date);
        }
        bVar.h0(format);
    }
}
