package s3;

import com.google.firebase.sessions.settings.RemoteSettings;
import f0.C0338b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.UShort;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import r3.C;
import r3.C0576h;
import r3.m;
import r3.z;

/* loaded from: classes3.dex */
public abstract class l {
    public static final Map a(ArrayList arrayList) {
        String str = z.f8321b;
        z o4 = C0338b.o(RemoteSettings.FORWARD_SLASH_STRING);
        Map mutableMapOf = MapsKt.mutableMapOf(TuplesKt.to(o4, new i(o4)));
        for (i iVar : CollectionsKt.sortedWith(arrayList, new A.i(5))) {
            if (((i) mutableMapOf.put(iVar.f8489a, iVar)) == null) {
                while (true) {
                    z zVar = iVar.f8489a;
                    z b4 = zVar.b();
                    if (b4 != null) {
                        i iVar2 = (i) mutableMapOf.get(b4);
                        if (iVar2 != null) {
                            iVar2.h.add(zVar);
                            break;
                        }
                        i iVar3 = new i(b4);
                        mutableMapOf.put(b4, iVar3);
                        iVar3.h.add(zVar);
                        iVar = iVar3;
                    }
                }
            }
        }
        return mutableMapOf;
    }

    public static final String b(int i) {
        StringBuilder sb = new StringBuilder("0x");
        String num = Integer.toString(i, CharsKt.checkRadix(16));
        Intrinsics.checkNotNullExpressionValue(num, "toString(this, checkRadix(radix))");
        sb.append(num);
        return sb.toString();
    }

    public static final i c(C c4) {
        Long valueOf;
        boolean contains$default;
        boolean endsWith$default;
        Intrinsics.checkNotNullParameter(c4, "<this>");
        int x3 = c4.x();
        if (x3 != 33639248) {
            throw new IOException("bad zip: expected " + b(33639248) + " but was " + b(x3));
        }
        c4.l(4L);
        short Y3 = c4.Y();
        int i = Y3 & UShort.MAX_VALUE;
        if ((Y3 & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + b(i));
        }
        int Y4 = c4.Y() & UShort.MAX_VALUE;
        short Y5 = c4.Y();
        int i4 = Y5 & UShort.MAX_VALUE;
        short Y6 = c4.Y();
        int i5 = Y6 & UShort.MAX_VALUE;
        if (i4 == -1) {
            valueOf = null;
        } else {
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.set(14, 0);
            gregorianCalendar.set(((i5 >> 9) & WorkQueueKt.MASK) + 1980, ((i5 >> 5) & 15) - 1, Y6 & 31, (i4 >> 11) & 31, (i4 >> 5) & 63, (Y5 & 31) << 1);
            valueOf = Long.valueOf(gregorianCalendar.getTime().getTime());
        }
        Long l4 = valueOf;
        c4.x();
        Ref.LongRef longRef = new Ref.LongRef();
        longRef.element = c4.x() & 4294967295L;
        Ref.LongRef longRef2 = new Ref.LongRef();
        longRef2.element = c4.x() & 4294967295L;
        int Y7 = c4.Y() & UShort.MAX_VALUE;
        int Y8 = c4.Y() & UShort.MAX_VALUE;
        int Y9 = c4.Y() & UShort.MAX_VALUE;
        c4.l(8L);
        Ref.LongRef longRef3 = new Ref.LongRef();
        longRef3.element = c4.x() & 4294967295L;
        String Z = c4.Z(Y7);
        contains$default = StringsKt__StringsKt.contains$default((CharSequence) Z, (char) 0, false, 2, (Object) null);
        if (contains$default) {
            throw new IOException("bad zip: filename contains 0x00");
        }
        long j4 = longRef2.element == 4294967295L ? 8 : 0L;
        if (longRef.element == 4294967295L) {
            j4 += 8;
        }
        if (longRef3.element == 4294967295L) {
            j4 += 8;
        }
        long j5 = j4;
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        d(c4, Y8, new j(booleanRef, j5, longRef2, c4, longRef, longRef3));
        if (j5 > 0 && !booleanRef.element) {
            throw new IOException("bad zip: zip64 extra required but absent");
        }
        String Z3 = c4.Z(Y9);
        String str = z.f8321b;
        z d4 = C0338b.o(RemoteSettings.FORWARD_SLASH_STRING).d(Z);
        endsWith$default = StringsKt__StringsJVMKt.endsWith$default(Z, RemoteSettings.FORWARD_SLASH_STRING, false, 2, null);
        return new i(d4, endsWith$default, Z3, longRef.element, longRef2.element, Y4, l4, longRef3.element);
    }

    public static final void d(C c4, int i, Function2 function2) {
        long j4 = i;
        while (j4 != 0) {
            if (j4 < 4) {
                throw new IOException("bad zip: truncated header in extra field");
            }
            int Y3 = c4.Y() & UShort.MAX_VALUE;
            long Y4 = c4.Y() & 65535;
            long j5 = j4 - 4;
            if (j5 < Y4) {
                throw new IOException("bad zip: truncated value in extra field");
            }
            c4.P(Y4);
            C0576h c0576h = c4.f8246b;
            long j6 = c0576h.f8284b;
            function2.invoke(Integer.valueOf(Y3), Long.valueOf(Y4));
            long j7 = (c0576h.f8284b + Y4) - j6;
            if (j7 < 0) {
                throw new IOException(com.google.android.gms.measurement.internal.a.l(Y3, "unsupported zip: too many bytes processed for "));
            }
            if (j7 > 0) {
                c0576h.l(j7);
            }
            j4 = j5 - Y4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final m e(C c4, m mVar) {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = mVar != null ? (Long) mVar.f8298g : 0;
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
        int x3 = c4.x();
        if (x3 != 67324752) {
            throw new IOException("bad zip: expected " + b(67324752) + " but was " + b(x3));
        }
        c4.l(2L);
        short Y3 = c4.Y();
        int i = Y3 & UShort.MAX_VALUE;
        if ((Y3 & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + b(i));
        }
        c4.l(18L);
        int Y4 = c4.Y() & UShort.MAX_VALUE;
        c4.l(c4.Y() & 65535);
        if (mVar == null) {
            c4.l(Y4);
            return null;
        }
        d(c4, Y4, new k(c4, objectRef, objectRef2, objectRef3));
        return new m(mVar.f8293b, mVar.f8294c, null, (Long) mVar.f8296e, (Long) objectRef3.element, (Long) objectRef.element, (Long) objectRef2.element);
    }
}
