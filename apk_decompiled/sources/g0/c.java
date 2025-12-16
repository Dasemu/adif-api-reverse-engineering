package g0;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f6688a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6689b;

    /* renamed from: c, reason: collision with root package name */
    public final long f6690c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f6691d;

    public c(int i, int i4, byte[] bArr) {
        this(-1L, bArr, i, i4);
    }

    public static c a(long j4, ByteOrder byteOrder) {
        long[] jArr = {j4};
        ByteBuffer wrap = ByteBuffer.wrap(new byte[g.f6702E[4]]);
        wrap.order(byteOrder);
        wrap.putInt((int) jArr[0]);
        return new c(4, 1, wrap.array());
    }

    public static c b(e eVar, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[g.f6702E[5]]);
        wrap.order(byteOrder);
        e eVar2 = new e[]{eVar}[0];
        wrap.putInt((int) eVar2.f6696a);
        wrap.putInt((int) eVar2.f6697b);
        return new c(5, 1, wrap.array());
    }

    public static c c(int i, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[g.f6702E[3]]);
        wrap.order(byteOrder);
        wrap.putShort((short) new int[]{i}[0]);
        return new c(3, 1, wrap.array());
    }

    public final double d(ByteOrder byteOrder) {
        Object g4 = g(byteOrder);
        if (g4 == null) {
            throw new NumberFormatException("NULL can't be converted to a double value");
        }
        if (g4 instanceof String) {
            return Double.parseDouble((String) g4);
        }
        if (g4 instanceof long[]) {
            if (((long[]) g4).length == 1) {
                return r3[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (g4 instanceof int[]) {
            if (((int[]) g4).length == 1) {
                return r3[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (g4 instanceof double[]) {
            double[] dArr = (double[]) g4;
            if (dArr.length == 1) {
                return dArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(g4 instanceof e[])) {
            throw new NumberFormatException("Couldn't find a double value");
        }
        e[] eVarArr = (e[]) g4;
        if (eVarArr.length != 1) {
            throw new NumberFormatException("There are more than one component");
        }
        e eVar = eVarArr[0];
        return eVar.f6696a / eVar.f6697b;
    }

    public final int e(ByteOrder byteOrder) {
        Object g4 = g(byteOrder);
        if (g4 == null) {
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }
        if (g4 instanceof String) {
            return Integer.parseInt((String) g4);
        }
        if (g4 instanceof long[]) {
            long[] jArr = (long[]) g4;
            if (jArr.length == 1) {
                return (int) jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(g4 instanceof int[])) {
            throw new NumberFormatException("Couldn't find a integer value");
        }
        int[] iArr = (int[]) g4;
        if (iArr.length == 1) {
            return iArr[0];
        }
        throw new NumberFormatException("There are more than one component");
    }

    public final String f(ByteOrder byteOrder) {
        Object g4 = g(byteOrder);
        if (g4 == null) {
            return null;
        }
        if (g4 instanceof String) {
            return (String) g4;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        if (g4 instanceof long[]) {
            long[] jArr = (long[]) g4;
            while (i < jArr.length) {
                sb.append(jArr[i]);
                i++;
                if (i != jArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (g4 instanceof int[]) {
            int[] iArr = (int[]) g4;
            while (i < iArr.length) {
                sb.append(iArr[i]);
                i++;
                if (i != iArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (g4 instanceof double[]) {
            double[] dArr = (double[]) g4;
            while (i < dArr.length) {
                sb.append(dArr[i]);
                i++;
                if (i != dArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (!(g4 instanceof e[])) {
            return null;
        }
        e[] eVarArr = (e[]) g4;
        while (i < eVarArr.length) {
            sb.append(eVarArr[i].f6696a);
            sb.append('/');
            sb.append(eVarArr[i].f6697b);
            i++;
            if (i != eVarArr.length) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0033: MOVE (r5 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]), block:B:162:0x0033 */
    /* JADX WARN: Removed duplicated region for block: B:165:0x016d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r14v14, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r14v15, types: [long[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r14v16, types: [g0.e[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r14v17, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r14v18, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r14v19, types: [g0.e[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r14v20, types: [double[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r14v21, types: [double[], java.io.Serializable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable g(java.nio.ByteOrder r14) {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.c.g(java.nio.ByteOrder):java.io.Serializable");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(g.f6701D[this.f6688a]);
        sb.append(", data length:");
        return com.google.android.gms.measurement.internal.a.m(sb, this.f6691d.length, ")");
    }

    public c(long j4, byte[] bArr, int i, int i4) {
        this.f6688a = i;
        this.f6689b = i4;
        this.f6690c = j4;
        this.f6691d = bArr;
    }
}
