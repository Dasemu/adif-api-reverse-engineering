package T2;

import C.w;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import u.AbstractC0629f;

/* loaded from: classes3.dex */
public final class h extends Q2.l {

    /* renamed from: b, reason: collision with root package name */
    public static final g f1677b = new g(new h(0), 0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1678a;

    public /* synthetic */ h(int i) {
        this.f1678a = i;
    }

    public static Q2.f c(Y2.a aVar, int i) {
        int b4 = AbstractC0629f.b(i);
        if (b4 == 5) {
            return new Q2.k(aVar.m0());
        }
        if (b4 == 6) {
            return new Q2.k(new S2.j(aVar.m0()));
        }
        if (b4 == 7) {
            return new Q2.k(Boolean.valueOf(aVar.e0()));
        }
        if (b4 != 8) {
            throw new IllegalStateException("Unexpected token: ".concat(w.C(i)));
        }
        aVar.k0();
        return Q2.h.f1388a;
    }

    public static void d(Y2.b bVar, Q2.f fVar) {
        if (fVar == null || (fVar instanceof Q2.h)) {
            bVar.b0();
            return;
        }
        boolean z3 = fVar instanceof Q2.k;
        if (z3) {
            if (!z3) {
                throw new IllegalStateException("Not a JSON Primitive: " + fVar);
            }
            Q2.k kVar = (Q2.k) fVar;
            Serializable serializable = kVar.f1390a;
            if (serializable instanceof Number) {
                bVar.g0(kVar.a());
                return;
            } else if (serializable instanceof Boolean) {
                bVar.i0(serializable instanceof Boolean ? ((Boolean) serializable).booleanValue() : Boolean.parseBoolean(kVar.b()));
                return;
            } else {
                bVar.h0(kVar.b());
                return;
            }
        }
        boolean z4 = fVar instanceof Q2.e;
        if (z4) {
            bVar.e();
            if (!z4) {
                throw new IllegalStateException("Not a JSON Array: " + fVar);
            }
            Iterator it = ((Q2.e) fVar).f1387a.iterator();
            while (it.hasNext()) {
                d(bVar, (Q2.f) it.next());
            }
            bVar.O();
            return;
        }
        boolean z5 = fVar instanceof Q2.i;
        if (!z5) {
            throw new IllegalArgumentException("Couldn't write " + fVar.getClass());
        }
        bVar.s();
        if (!z5) {
            throw new IllegalStateException("Not a JSON Object: " + fVar);
        }
        Iterator it2 = ((S2.l) ((Q2.i) fVar).f1389a.entrySet()).iterator();
        while (((S2.m) it2).hasNext()) {
            S2.n a2 = ((S2.k) it2).a();
            bVar.Z((String) a2.getKey());
            d(bVar, (Q2.f) a2.getValue());
        }
        bVar.Y();
    }

    @Override // Q2.l
    public final Object a(Y2.a aVar) {
        Q2.f eVar;
        Q2.f eVar2;
        boolean z3;
        switch (this.f1678a) {
            case 0:
                int o02 = aVar.o0();
                int b4 = AbstractC0629f.b(o02);
                if (b4 == 5 || b4 == 6) {
                    return new S2.j(aVar.m0());
                }
                if (b4 == 8) {
                    aVar.k0();
                    return null;
                }
                throw new RuntimeException("Expecting number, got: " + w.C(o02) + "; at path " + aVar.a0(false));
            case 1:
                ArrayList arrayList = new ArrayList();
                aVar.d();
                while (aVar.b0()) {
                    try {
                        arrayList.add(Integer.valueOf(aVar.g0()));
                    } catch (NumberFormatException e4) {
                        throw new RuntimeException(e4);
                    }
                }
                aVar.O();
                int size = arrayList.size();
                AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
                for (int i = 0; i < size; i++) {
                    atomicIntegerArray.set(i, ((Integer) arrayList.get(i)).intValue());
                }
                return atomicIntegerArray;
            case 2:
                if (aVar.o0() == 9) {
                    aVar.k0();
                    return null;
                }
                try {
                    return Long.valueOf(aVar.h0());
                } catch (NumberFormatException e5) {
                    throw new RuntimeException(e5);
                }
            case 3:
                if (aVar.o0() != 9) {
                    return Float.valueOf((float) aVar.f0());
                }
                aVar.k0();
                return null;
            case 4:
                if (aVar.o0() != 9) {
                    return Double.valueOf(aVar.f0());
                }
                aVar.k0();
                return null;
            case 5:
                if (aVar.o0() == 9) {
                    aVar.k0();
                    return null;
                }
                String m02 = aVar.m0();
                if (m02.length() == 1) {
                    return Character.valueOf(m02.charAt(0));
                }
                StringBuilder p = com.google.android.gms.measurement.internal.a.p("Expecting character, got: ", m02, "; at ");
                p.append(aVar.a0(true));
                throw new RuntimeException(p.toString());
            case 6:
                int o03 = aVar.o0();
                if (o03 != 9) {
                    return o03 == 8 ? Boolean.toString(aVar.e0()) : aVar.m0();
                }
                aVar.k0();
                return null;
            case 7:
                if (aVar.o0() == 9) {
                    aVar.k0();
                    return null;
                }
                String m03 = aVar.m0();
                try {
                    return new BigDecimal(m03);
                } catch (NumberFormatException e6) {
                    StringBuilder p3 = com.google.android.gms.measurement.internal.a.p("Failed parsing '", m03, "' as BigDecimal; at path ");
                    p3.append(aVar.a0(true));
                    throw new RuntimeException(p3.toString(), e6);
                }
            case 8:
                if (aVar.o0() == 9) {
                    aVar.k0();
                    return null;
                }
                String m04 = aVar.m0();
                try {
                    return new BigInteger(m04);
                } catch (NumberFormatException e7) {
                    StringBuilder p4 = com.google.android.gms.measurement.internal.a.p("Failed parsing '", m04, "' as BigInteger; at path ");
                    p4.append(aVar.a0(true));
                    throw new RuntimeException(p4.toString(), e7);
                }
            case 9:
                if (aVar.o0() != 9) {
                    return new S2.j(aVar.m0());
                }
                aVar.k0();
                return null;
            case 10:
                if (aVar.o0() != 9) {
                    return new StringBuilder(aVar.m0());
                }
                aVar.k0();
                return null;
            case 11:
                throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
            case 12:
                if (aVar.o0() != 9) {
                    return new StringBuffer(aVar.m0());
                }
                aVar.k0();
                return null;
            case 13:
                if (aVar.o0() == 9) {
                    aVar.k0();
                    return null;
                }
                String m05 = aVar.m0();
                if ("null".equals(m05)) {
                    return null;
                }
                return new URL(m05);
            case 14:
                if (aVar.o0() == 9) {
                    aVar.k0();
                    return null;
                }
                try {
                    String m06 = aVar.m0();
                    if ("null".equals(m06)) {
                        return null;
                    }
                    return new URI(m06);
                } catch (URISyntaxException e8) {
                    throw new RuntimeException(e8);
                }
            case 15:
                if (aVar.o0() != 9) {
                    return InetAddress.getByName(aVar.m0());
                }
                aVar.k0();
                return null;
            case 16:
                if (aVar.o0() == 9) {
                    aVar.k0();
                    return null;
                }
                String m07 = aVar.m0();
                try {
                    return UUID.fromString(m07);
                } catch (IllegalArgumentException e9) {
                    StringBuilder p5 = com.google.android.gms.measurement.internal.a.p("Failed parsing '", m07, "' as UUID; at path ");
                    p5.append(aVar.a0(true));
                    throw new RuntimeException(p5.toString(), e9);
                }
            case 17:
                String m08 = aVar.m0();
                try {
                    return Currency.getInstance(m08);
                } catch (IllegalArgumentException e10) {
                    StringBuilder p6 = com.google.android.gms.measurement.internal.a.p("Failed parsing '", m08, "' as Currency; at path ");
                    p6.append(aVar.a0(true));
                    throw new RuntimeException(p6.toString(), e10);
                }
            case 18:
                if (aVar.o0() == 9) {
                    aVar.k0();
                    return null;
                }
                aVar.e();
                int i4 = 0;
                int i5 = 0;
                int i6 = 0;
                int i7 = 0;
                int i8 = 0;
                int i9 = 0;
                while (aVar.o0() != 4) {
                    String i02 = aVar.i0();
                    int g02 = aVar.g0();
                    if ("year".equals(i02)) {
                        i4 = g02;
                    } else if ("month".equals(i02)) {
                        i5 = g02;
                    } else if ("dayOfMonth".equals(i02)) {
                        i6 = g02;
                    } else if ("hourOfDay".equals(i02)) {
                        i7 = g02;
                    } else if ("minute".equals(i02)) {
                        i8 = g02;
                    } else if ("second".equals(i02)) {
                        i9 = g02;
                    }
                }
                aVar.Y();
                return new GregorianCalendar(i4, i5, i6, i7, i8, i9);
            case 19:
                if (aVar.o0() == 9) {
                    aVar.k0();
                    return null;
                }
                StringTokenizer stringTokenizer = new StringTokenizer(aVar.m0(), "_");
                String nextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String nextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String nextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                return (nextToken2 == null && nextToken3 == null) ? new Locale(nextToken) : nextToken3 == null ? new Locale(nextToken, nextToken2) : new Locale(nextToken, nextToken2, nextToken3);
            case 20:
                int o04 = aVar.o0();
                int b5 = AbstractC0629f.b(o04);
                if (b5 == 0) {
                    aVar.d();
                    eVar = new Q2.e();
                } else if (b5 != 2) {
                    eVar = null;
                } else {
                    aVar.e();
                    eVar = new Q2.i();
                }
                if (eVar == null) {
                    return c(aVar, o04);
                }
                ArrayDeque arrayDeque = new ArrayDeque();
                while (true) {
                    if (aVar.b0()) {
                        String i03 = eVar instanceof Q2.i ? aVar.i0() : null;
                        int o05 = aVar.o0();
                        int b6 = AbstractC0629f.b(o05);
                        if (b6 == 0) {
                            aVar.d();
                            eVar2 = new Q2.e();
                        } else if (b6 != 2) {
                            eVar2 = null;
                        } else {
                            aVar.e();
                            eVar2 = new Q2.i();
                        }
                        boolean z4 = eVar2 != null;
                        if (eVar2 == null) {
                            eVar2 = c(aVar, o05);
                        }
                        if (eVar instanceof Q2.e) {
                            ((Q2.e) eVar).f1387a.add(eVar2);
                        } else {
                            ((Q2.i) eVar).f1389a.put(i03, eVar2);
                        }
                        if (z4) {
                            arrayDeque.addLast(eVar);
                            eVar = eVar2;
                        }
                    } else {
                        if (eVar instanceof Q2.e) {
                            aVar.O();
                        } else {
                            aVar.Y();
                        }
                        if (arrayDeque.isEmpty()) {
                            return eVar;
                        }
                        eVar = (Q2.f) arrayDeque.removeLast();
                    }
                }
            case 21:
                BitSet bitSet = new BitSet();
                aVar.d();
                int o06 = aVar.o0();
                int i10 = 0;
                while (o06 != 2) {
                    int b7 = AbstractC0629f.b(o06);
                    if (b7 == 5 || b7 == 6) {
                        int g03 = aVar.g0();
                        if (g03 == 0) {
                            z3 = false;
                        } else {
                            if (g03 != 1) {
                                StringBuilder t2 = w.t(g03, "Invalid bitset value ", ", expected 0 or 1; at path ");
                                t2.append(aVar.a0(true));
                                throw new RuntimeException(t2.toString());
                            }
                            z3 = true;
                        }
                    } else {
                        if (b7 != 7) {
                            throw new RuntimeException("Invalid bitset value type: " + w.C(o06) + "; at path " + aVar.a0(false));
                        }
                        z3 = aVar.e0();
                    }
                    if (z3) {
                        bitSet.set(i10);
                    }
                    i10++;
                    o06 = aVar.o0();
                }
                aVar.O();
                return bitSet;
            case 22:
                int o07 = aVar.o0();
                if (o07 != 9) {
                    return o07 == 6 ? Boolean.valueOf(Boolean.parseBoolean(aVar.m0())) : Boolean.valueOf(aVar.e0());
                }
                aVar.k0();
                return null;
            case 23:
                if (aVar.o0() != 9) {
                    return Boolean.valueOf(aVar.m0());
                }
                aVar.k0();
                return null;
            case 24:
                if (aVar.o0() == 9) {
                    aVar.k0();
                    return null;
                }
                try {
                    int g04 = aVar.g0();
                    if (g04 <= 255 && g04 >= -128) {
                        return Byte.valueOf((byte) g04);
                    }
                    StringBuilder t4 = w.t(g04, "Lossy conversion from ", " to byte; at path ");
                    t4.append(aVar.a0(true));
                    throw new RuntimeException(t4.toString());
                } catch (NumberFormatException e11) {
                    throw new RuntimeException(e11);
                }
            case 25:
                if (aVar.o0() == 9) {
                    aVar.k0();
                    return null;
                }
                try {
                    int g05 = aVar.g0();
                    if (g05 <= 65535 && g05 >= -32768) {
                        return Short.valueOf((short) g05);
                    }
                    StringBuilder t5 = w.t(g05, "Lossy conversion from ", " to short; at path ");
                    t5.append(aVar.a0(true));
                    throw new RuntimeException(t5.toString());
                } catch (NumberFormatException e12) {
                    throw new RuntimeException(e12);
                }
            case 26:
                if (aVar.o0() == 9) {
                    aVar.k0();
                    return null;
                }
                try {
                    return Integer.valueOf(aVar.g0());
                } catch (NumberFormatException e13) {
                    throw new RuntimeException(e13);
                }
            case 27:
                try {
                    return new AtomicInteger(aVar.g0());
                } catch (NumberFormatException e14) {
                    throw new RuntimeException(e14);
                }
            default:
                return new AtomicBoolean(aVar.e0());
        }
    }

    @Override // Q2.l
    public final void b(Y2.b bVar, Object obj) {
        switch (this.f1678a) {
            case 0:
                bVar.g0((Number) obj);
                return;
            case 1:
                bVar.e();
                int length = ((AtomicIntegerArray) obj).length();
                for (int i = 0; i < length; i++) {
                    bVar.f0(r5.get(i));
                }
                bVar.O();
                return;
            case 2:
                Number number = (Number) obj;
                if (number == null) {
                    bVar.b0();
                    return;
                } else {
                    bVar.f0(number.longValue());
                    return;
                }
            case 3:
                Number number2 = (Number) obj;
                if (number2 == null) {
                    bVar.b0();
                    return;
                }
                if (!(number2 instanceof Float)) {
                    number2 = Float.valueOf(number2.floatValue());
                }
                bVar.g0(number2);
                return;
            case 4:
                Number number3 = (Number) obj;
                if (number3 == null) {
                    bVar.b0();
                    return;
                } else {
                    bVar.e0(number3.doubleValue());
                    return;
                }
            case 5:
                Character ch = (Character) obj;
                bVar.h0(ch == null ? null : String.valueOf(ch));
                return;
            case 6:
                bVar.h0((String) obj);
                return;
            case 7:
                bVar.g0((BigDecimal) obj);
                return;
            case 8:
                bVar.g0((BigInteger) obj);
                return;
            case 9:
                bVar.g0((S2.j) obj);
                return;
            case 10:
                StringBuilder sb = (StringBuilder) obj;
                bVar.h0(sb == null ? null : sb.toString());
                return;
            case 11:
                throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + ((Class) obj).getName() + ". Forgot to register a type adapter?");
            case 12:
                StringBuffer stringBuffer = (StringBuffer) obj;
                bVar.h0(stringBuffer == null ? null : stringBuffer.toString());
                return;
            case 13:
                URL url = (URL) obj;
                bVar.h0(url == null ? null : url.toExternalForm());
                return;
            case 14:
                URI uri = (URI) obj;
                bVar.h0(uri == null ? null : uri.toASCIIString());
                return;
            case 15:
                InetAddress inetAddress = (InetAddress) obj;
                bVar.h0(inetAddress == null ? null : inetAddress.getHostAddress());
                return;
            case 16:
                UUID uuid = (UUID) obj;
                bVar.h0(uuid == null ? null : uuid.toString());
                return;
            case 17:
                bVar.h0(((Currency) obj).getCurrencyCode());
                return;
            case 18:
                if (((Calendar) obj) == null) {
                    bVar.b0();
                    return;
                }
                bVar.s();
                bVar.Z("year");
                bVar.f0(r5.get(1));
                bVar.Z("month");
                bVar.f0(r5.get(2));
                bVar.Z("dayOfMonth");
                bVar.f0(r5.get(5));
                bVar.Z("hourOfDay");
                bVar.f0(r5.get(11));
                bVar.Z("minute");
                bVar.f0(r5.get(12));
                bVar.Z("second");
                bVar.f0(r5.get(13));
                bVar.Y();
                return;
            case 19:
                Locale locale = (Locale) obj;
                bVar.h0(locale == null ? null : locale.toString());
                return;
            case 20:
                d(bVar, (Q2.f) obj);
                return;
            case 21:
                BitSet bitSet = (BitSet) obj;
                bVar.e();
                int length2 = bitSet.length();
                for (int i4 = 0; i4 < length2; i4++) {
                    bVar.f0(bitSet.get(i4) ? 1L : 0L);
                }
                bVar.O();
                return;
            case 22:
                Boolean bool = (Boolean) obj;
                if (bool == null) {
                    bVar.b0();
                    return;
                }
                bVar.j0();
                bVar.d();
                bVar.f2153a.write(bool.booleanValue() ? "true" : "false");
                return;
            case 23:
                Boolean bool2 = (Boolean) obj;
                bVar.h0(bool2 == null ? "null" : bool2.toString());
                return;
            case 24:
                if (((Number) obj) == null) {
                    bVar.b0();
                    return;
                } else {
                    bVar.f0(r5.byteValue());
                    return;
                }
            case 25:
                if (((Number) obj) == null) {
                    bVar.b0();
                    return;
                } else {
                    bVar.f0(r5.shortValue());
                    return;
                }
            case 26:
                if (((Number) obj) == null) {
                    bVar.b0();
                    return;
                } else {
                    bVar.f0(r5.intValue());
                    return;
                }
            case 27:
                bVar.f0(((AtomicInteger) obj).get());
                return;
            default:
                bVar.i0(((AtomicBoolean) obj).get());
                return;
        }
    }
}
