package s0;

import C.w;
import android.content.pm.PackageInfo;
import f0.C0338b;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import kotlin.UByte;
import u.AbstractC0629f;

/* renamed from: s0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0585d {

    /* renamed from: a, reason: collision with root package name */
    public static final C0338b f8373a = new C0338b(14);

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f8374b = {112, 114, 111, 0};

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f8375c = {112, 114, 109, 0};

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f8376d = {48, 49, 53, 0};

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f8377e = {48, 49, 48, 0};

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f8378f = {48, 48, 57, 0};

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f8379g = {48, 48, 53, 0};
    public static final byte[] h = {48, 48, 49, 0};
    public static final byte[] i = {48, 48, 49, 0};

    /* renamed from: j, reason: collision with root package name */
    public static final byte[] f8380j = {48, 48, 50, 0};

    public static byte[] a(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    public static byte[] b(C0583b[] c0583bArr, byte[] bArr) {
        int i4 = 0;
        for (C0583b c0583b : c0583bArr) {
            i4 += ((((c0583b.f8372g * 2) + 7) & (-8)) / 8) + (c0583b.f8370e * 2) + d(c0583b.f8366a, c0583b.f8367b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + c0583b.f8371f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i4);
        if (Arrays.equals(bArr, f8378f)) {
            for (C0583b c0583b2 : c0583bArr) {
                p(byteArrayOutputStream, c0583b2, d(c0583b2.f8366a, c0583b2.f8367b, bArr));
                r(byteArrayOutputStream, c0583b2);
                int[] iArr = c0583b2.h;
                int length = iArr.length;
                int i5 = 0;
                int i6 = 0;
                while (i5 < length) {
                    int i7 = iArr[i5];
                    u(byteArrayOutputStream, i7 - i6);
                    i5++;
                    i6 = i7;
                }
                q(byteArrayOutputStream, c0583b2);
            }
        } else {
            for (C0583b c0583b3 : c0583bArr) {
                p(byteArrayOutputStream, c0583b3, d(c0583b3.f8366a, c0583b3.f8367b, bArr));
            }
            for (C0583b c0583b4 : c0583bArr) {
                r(byteArrayOutputStream, c0583b4);
                int[] iArr2 = c0583b4.h;
                int length2 = iArr2.length;
                int i8 = 0;
                int i9 = 0;
                while (i8 < length2) {
                    int i10 = iArr2[i8];
                    u(byteArrayOutputStream, i10 - i9);
                    i8++;
                    i9 = i10;
                }
                q(byteArrayOutputStream, c0583b4);
            }
        }
        if (byteArrayOutputStream.size() == i4) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i4);
    }

    public static boolean c(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return false;
        }
        boolean z3 = true;
        for (File file2 : listFiles) {
            z3 = c(file2) && z3;
        }
        return z3;
    }

    public static String d(String str, String str2, byte[] bArr) {
        byte[] bArr2 = h;
        boolean equals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = f8379g;
        String str3 = (equals || Arrays.equals(bArr, bArr3)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(str3)) {
                return str2.replace(":", "!");
            }
            if (":".equals(str3)) {
                return str2.replace("!", ":");
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(":")) {
                if ("!".equals(str3)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(str3)) {
                    return str2.replace("!", ":");
                }
            } else if (!str2.endsWith(".apk")) {
                return w.r(AbstractC0629f.a(str), (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? ":" : "!", str2);
            }
        }
        return str2;
    }

    public static void e(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    public static byte[] f(InputStream inputStream, int i4) {
        byte[] bArr = new byte[i4];
        int i5 = 0;
        while (i5 < i4) {
            int read = inputStream.read(bArr, i5, i4 - i5);
            if (read < 0) {
                throw new IllegalStateException(com.google.android.gms.measurement.internal.a.l(i4, "Not enough bytes to read: "));
            }
            i5 += read;
        }
        return bArr;
    }

    public static int[] g(ByteArrayInputStream byteArrayInputStream, int i4) {
        int[] iArr = new int[i4];
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            i5 += (int) m(byteArrayInputStream, 2);
            iArr[i6] = i5;
        }
        return iArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        if (r0.finished() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0062, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
    
        throw new java.lang.IllegalStateException("Inflater did not finish");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] h(java.io.FileInputStream r8, int r9, int r10) {
        /*
            java.util.zip.Inflater r0 = new java.util.zip.Inflater
            r0.<init>()
            byte[] r1 = new byte[r10]     // Catch: java.lang.Throwable -> L2e
            r2 = 2048(0x800, float:2.87E-42)
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L2e
            r3 = 0
            r4 = r3
            r5 = r4
        Le:
            boolean r6 = r0.finished()     // Catch: java.lang.Throwable -> L2e
            if (r6 != 0) goto L57
            boolean r6 = r0.needsDictionary()     // Catch: java.lang.Throwable -> L2e
            if (r6 != 0) goto L57
            if (r4 >= r9) goto L57
            int r6 = r8.read(r2)     // Catch: java.lang.Throwable -> L2e
            if (r6 < 0) goto L3b
            r0.setInput(r2, r3, r6)     // Catch: java.lang.Throwable -> L2e
            int r7 = r10 - r5
            int r7 = r0.inflate(r1, r5, r7)     // Catch: java.lang.Throwable -> L2e java.util.zip.DataFormatException -> L30
            int r5 = r5 + r7
            int r4 = r4 + r6
            goto Le
        L2e:
            r8 = move-exception
            goto L8a
        L30:
            r8 = move-exception
            java.lang.String r8 = r8.getMessage()     // Catch: java.lang.Throwable -> L2e
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L3b:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r8.<init>()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r10 = "Invalid zip data. Stream ended after $totalBytesRead bytes. Expected "
            r8.append(r10)     // Catch: java.lang.Throwable -> L2e
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r9 = " bytes"
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L2e
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L57:
            if (r4 != r9) goto L6b
            boolean r8 = r0.finished()     // Catch: java.lang.Throwable -> L2e
            if (r8 == 0) goto L63
            r0.end()
            return r1
        L63:
            java.lang.String r8 = "Inflater did not finish"
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L6b:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r8.<init>()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r10 = "Didn't read enough bytes during decompression. expected="
            r8.append(r10)     // Catch: java.lang.Throwable -> L2e
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r9 = " actual="
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            r8.append(r4)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L2e
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L8a:
            r0.end()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.AbstractC0585d.h(java.io.FileInputStream, int, int):byte[]");
    }

    public static C0583b[] i(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, C0583b[] c0583bArr) {
        byte[] bArr3 = i;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, f8380j)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int m4 = (int) m(fileInputStream, 2);
            byte[] h4 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(h4);
            try {
                C0583b[] k4 = k(byteArrayInputStream, bArr2, m4, c0583bArr);
                byteArrayInputStream.close();
                return k4;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(f8376d, bArr2)) {
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!Arrays.equals(bArr, bArr3)) {
            throw new IllegalStateException("Unsupported meta version");
        }
        int m5 = (int) m(fileInputStream, 1);
        byte[] h5 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(h5);
        try {
            C0583b[] j4 = j(byteArrayInputStream2, m5, c0583bArr);
            byteArrayInputStream2.close();
            return j4;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static C0583b[] j(ByteArrayInputStream byteArrayInputStream, int i4, C0583b[] c0583bArr) {
        if (byteArrayInputStream.available() == 0) {
            return new C0583b[0];
        }
        if (i4 != c0583bArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i4];
        int[] iArr = new int[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            int m4 = (int) m(byteArrayInputStream, 2);
            iArr[i5] = (int) m(byteArrayInputStream, 2);
            strArr[i5] = new String(f(byteArrayInputStream, m4), StandardCharsets.UTF_8);
        }
        for (int i6 = 0; i6 < i4; i6++) {
            C0583b c0583b = c0583bArr[i6];
            if (!c0583b.f8367b.equals(strArr[i6])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i7 = iArr[i6];
            c0583b.f8370e = i7;
            c0583b.h = g(byteArrayInputStream, i7);
        }
        return c0583bArr;
    }

    public static C0583b[] k(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i4, C0583b[] c0583bArr) {
        if (byteArrayInputStream.available() == 0) {
            return new C0583b[0];
        }
        if (i4 != c0583bArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i5 = 0; i5 < i4; i5++) {
            m(byteArrayInputStream, 2);
            String str = new String(f(byteArrayInputStream, (int) m(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long m4 = m(byteArrayInputStream, 4);
            int m5 = (int) m(byteArrayInputStream, 2);
            C0583b c0583b = null;
            if (c0583bArr.length > 0) {
                int indexOf = str.indexOf("!");
                if (indexOf < 0) {
                    indexOf = str.indexOf(":");
                }
                String substring = indexOf > 0 ? str.substring(indexOf + 1) : str;
                int i6 = 0;
                while (true) {
                    if (i6 >= c0583bArr.length) {
                        break;
                    }
                    if (c0583bArr[i6].f8367b.equals(substring)) {
                        c0583b = c0583bArr[i6];
                        break;
                    }
                    i6++;
                }
            }
            if (c0583b == null) {
                throw new IllegalStateException("Missing profile key: ".concat(str));
            }
            c0583b.f8369d = m4;
            int[] g4 = g(byteArrayInputStream, m5);
            if (Arrays.equals(bArr, h)) {
                c0583b.f8370e = m5;
                c0583b.h = g4;
            }
        }
        return c0583bArr;
    }

    public static C0583b[] l(FileInputStream fileInputStream, byte[] bArr, String str) {
        if (!Arrays.equals(bArr, f8377e)) {
            throw new IllegalStateException("Unsupported version");
        }
        int m4 = (int) m(fileInputStream, 1);
        byte[] h4 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(h4);
        try {
            C0583b[] n4 = n(byteArrayInputStream, str, m4);
            byteArrayInputStream.close();
            return n4;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static long m(InputStream inputStream, int i4) {
        byte[] f2 = f(inputStream, i4);
        long j4 = 0;
        for (int i5 = 0; i5 < i4; i5++) {
            j4 += (f2[i5] & UByte.MAX_VALUE) << (i5 * 8);
        }
        return j4;
    }

    public static C0583b[] n(ByteArrayInputStream byteArrayInputStream, String str, int i4) {
        TreeMap treeMap;
        if (byteArrayInputStream.available() == 0) {
            return new C0583b[0];
        }
        C0583b[] c0583bArr = new C0583b[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            int m4 = (int) m(byteArrayInputStream, 2);
            int m5 = (int) m(byteArrayInputStream, 2);
            c0583bArr[i5] = new C0583b(str, new String(f(byteArrayInputStream, m4), StandardCharsets.UTF_8), m(byteArrayInputStream, 4), m5, (int) m(byteArrayInputStream, 4), (int) m(byteArrayInputStream, 4), new int[m5], new TreeMap());
        }
        for (int i6 = 0; i6 < i4; i6++) {
            C0583b c0583b = c0583bArr[i6];
            int available = byteArrayInputStream.available() - c0583b.f8371f;
            int i7 = 0;
            while (true) {
                int available2 = byteArrayInputStream.available();
                treeMap = c0583b.i;
                if (available2 <= available) {
                    break;
                }
                i7 += (int) m(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(i7), 1);
                for (int m6 = (int) m(byteArrayInputStream, 2); m6 > 0; m6--) {
                    m(byteArrayInputStream, 2);
                    int m7 = (int) m(byteArrayInputStream, 1);
                    if (m7 != 6 && m7 != 7) {
                        while (m7 > 0) {
                            m(byteArrayInputStream, 1);
                            for (int m8 = (int) m(byteArrayInputStream, 1); m8 > 0; m8--) {
                                m(byteArrayInputStream, 2);
                            }
                            m7--;
                        }
                    }
                }
            }
            if (byteArrayInputStream.available() != available) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            c0583b.h = g(byteArrayInputStream, c0583b.f8370e);
            int i8 = c0583b.f8372g;
            BitSet valueOf = BitSet.valueOf(f(byteArrayInputStream, (((i8 * 2) + 7) & (-8)) / 8));
            for (int i9 = 0; i9 < i8; i9++) {
                int i10 = valueOf.get(i9) ? 2 : 0;
                if (valueOf.get(i9 + i8)) {
                    i10 |= 4;
                }
                if (i10 != 0) {
                    Integer num = (Integer) treeMap.get(Integer.valueOf(i9));
                    if (num == null) {
                        num = 0;
                    }
                    treeMap.put(Integer.valueOf(i9), Integer.valueOf(i10 | num.intValue()));
                }
            }
        }
        return c0583bArr;
    }

    /* JADX WARN: Finally extract failed */
    public static boolean o(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, C0583b[] c0583bArr) {
        long j4;
        ArrayList arrayList;
        int length;
        byte[] bArr2 = f8376d;
        int i4 = 0;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = f8377e;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] b4 = b(c0583bArr, bArr3);
                t(byteArrayOutputStream, c0583bArr.length, 1);
                t(byteArrayOutputStream, b4.length, 4);
                byte[] a2 = a(b4);
                t(byteArrayOutputStream, a2.length, 4);
                byteArrayOutputStream.write(a2);
                return true;
            }
            byte[] bArr4 = f8379g;
            if (Arrays.equals(bArr, bArr4)) {
                t(byteArrayOutputStream, c0583bArr.length, 1);
                for (C0583b c0583b : c0583bArr) {
                    int size = c0583b.i.size() * 4;
                    String d4 = d(c0583b.f8366a, c0583b.f8367b, bArr4);
                    Charset charset = StandardCharsets.UTF_8;
                    u(byteArrayOutputStream, d4.getBytes(charset).length);
                    u(byteArrayOutputStream, c0583b.h.length);
                    t(byteArrayOutputStream, size, 4);
                    t(byteArrayOutputStream, c0583b.f8368c, 4);
                    byteArrayOutputStream.write(d4.getBytes(charset));
                    Iterator it = c0583b.i.keySet().iterator();
                    while (it.hasNext()) {
                        u(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        u(byteArrayOutputStream, 0);
                    }
                    for (int i5 : c0583b.h) {
                        u(byteArrayOutputStream, i5);
                    }
                }
                return true;
            }
            byte[] bArr5 = f8378f;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] b5 = b(c0583bArr, bArr5);
                t(byteArrayOutputStream, c0583bArr.length, 1);
                t(byteArrayOutputStream, b5.length, 4);
                byte[] a4 = a(b5);
                t(byteArrayOutputStream, a4.length, 4);
                byteArrayOutputStream.write(a4);
                return true;
            }
            byte[] bArr6 = h;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            u(byteArrayOutputStream, c0583bArr.length);
            for (C0583b c0583b2 : c0583bArr) {
                String d5 = d(c0583b2.f8366a, c0583b2.f8367b, bArr6);
                Charset charset2 = StandardCharsets.UTF_8;
                u(byteArrayOutputStream, d5.getBytes(charset2).length);
                TreeMap treeMap = c0583b2.i;
                u(byteArrayOutputStream, treeMap.size());
                u(byteArrayOutputStream, c0583b2.h.length);
                t(byteArrayOutputStream, c0583b2.f8368c, 4);
                byteArrayOutputStream.write(d5.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    u(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i6 : c0583b2.h) {
                    u(byteArrayOutputStream, i6);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            u(byteArrayOutputStream2, c0583bArr.length);
            int i7 = 2;
            int i8 = 2;
            for (C0583b c0583b3 : c0583bArr) {
                t(byteArrayOutputStream2, c0583b3.f8368c, 4);
                t(byteArrayOutputStream2, c0583b3.f8369d, 4);
                t(byteArrayOutputStream2, c0583b3.f8372g, 4);
                String d6 = d(c0583b3.f8366a, c0583b3.f8367b, bArr2);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = d6.getBytes(charset3).length;
                u(byteArrayOutputStream2, length2);
                i8 = i8 + 14 + length2;
                byteArrayOutputStream2.write(d6.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i8 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i8 + ", does not match actual size " + byteArray.length);
            }
            C0591j c0591j = new C0591j(1, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList2.add(c0591j);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i9 = 0;
            int i10 = 0;
            while (i9 < c0583bArr.length) {
                try {
                    C0583b c0583b4 = c0583bArr[i9];
                    u(byteArrayOutputStream3, i9);
                    u(byteArrayOutputStream3, c0583b4.f8370e);
                    i10 = i10 + 4 + (c0583b4.f8370e * i7);
                    int[] iArr = c0583b4.h;
                    int length3 = iArr.length;
                    int i11 = i4;
                    int i12 = i7;
                    int i13 = i11;
                    while (i13 < length3) {
                        int i14 = iArr[i13];
                        u(byteArrayOutputStream3, i14 - i11);
                        i13++;
                        i11 = i14;
                    }
                    i9++;
                    i7 = i12;
                    i4 = 0;
                } catch (Throwable th) {
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i10 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i10 + ", does not match actual size " + byteArray2.length);
            }
            C0591j c0591j2 = new C0591j(3, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList2.add(c0591j2);
            byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i15 = 0;
            int i16 = 0;
            while (i15 < c0583bArr.length) {
                try {
                    C0583b c0583b5 = c0583bArr[i15];
                    Iterator it3 = c0583b5.i.entrySet().iterator();
                    int i17 = 0;
                    while (it3.hasNext()) {
                        i17 |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        q(byteArrayOutputStream4, c0583b5);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byteArrayOutputStream4.close();
                        byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            r(byteArrayOutputStream4, c0583b5);
                            byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            u(byteArrayOutputStream3, i15);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i18 = i16 + 6;
                            ArrayList arrayList4 = arrayList3;
                            t(byteArrayOutputStream3, length4, 4);
                            u(byteArrayOutputStream3, i17);
                            byteArrayOutputStream3.write(byteArray3);
                            byteArrayOutputStream3.write(byteArray4);
                            i16 = i18 + length4;
                            i15++;
                            arrayList3 = arrayList4;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                    try {
                        byteArrayOutputStream3.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
            }
            ArrayList arrayList5 = arrayList3;
            byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
            if (i16 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i16 + ", does not match actual size " + byteArray5.length);
            }
            C0591j c0591j3 = new C0591j(4, byteArray5, true);
            byteArrayOutputStream3.close();
            arrayList2.add(c0591j3);
            long j5 = 4;
            long size2 = j5 + j5 + 4 + (arrayList2.size() * 16);
            t(byteArrayOutputStream, arrayList2.size(), 4);
            int i19 = 0;
            while (i19 < arrayList2.size()) {
                C0591j c0591j4 = (C0591j) arrayList2.get(i19);
                int i20 = c0591j4.f8388a;
                if (i20 == 1) {
                    j4 = 0;
                } else if (i20 == 2) {
                    j4 = 1;
                } else if (i20 == 3) {
                    j4 = 2;
                } else if (i20 == 4) {
                    j4 = 3;
                } else {
                    if (i20 != 5) {
                        throw null;
                    }
                    j4 = 4;
                }
                t(byteArrayOutputStream, j4, 4);
                t(byteArrayOutputStream, size2, 4);
                byte[] bArr7 = c0591j4.f8389b;
                if (c0591j4.f8390c) {
                    long length5 = bArr7.length;
                    byte[] a5 = a(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(a5);
                    t(byteArrayOutputStream, a5.length, 4);
                    t(byteArrayOutputStream, length5, 4);
                    length = a5.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(bArr7);
                    t(byteArrayOutputStream, bArr7.length, 4);
                    t(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += length;
                i19++;
                arrayList5 = arrayList;
            }
            ArrayList arrayList6 = arrayList5;
            for (int i21 = 0; i21 < arrayList6.size(); i21++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i21));
            }
            return true;
        } catch (Throwable th3) {
            try {
                byteArrayOutputStream2.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    public static void p(ByteArrayOutputStream byteArrayOutputStream, C0583b c0583b, String str) {
        Charset charset = StandardCharsets.UTF_8;
        u(byteArrayOutputStream, str.getBytes(charset).length);
        u(byteArrayOutputStream, c0583b.f8370e);
        t(byteArrayOutputStream, c0583b.f8371f, 4);
        t(byteArrayOutputStream, c0583b.f8368c, 4);
        t(byteArrayOutputStream, c0583b.f8372g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void q(ByteArrayOutputStream byteArrayOutputStream, C0583b c0583b) {
        byte[] bArr = new byte[(((c0583b.f8372g * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : c0583b.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                int i4 = intValue / 8;
                bArr[i4] = (byte) (bArr[i4] | (1 << (intValue % 8)));
            }
            if ((intValue2 & 4) != 0) {
                int i5 = intValue + c0583b.f8372g;
                int i6 = i5 / 8;
                bArr[i6] = (byte) ((1 << (i5 % 8)) | bArr[i6]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void r(ByteArrayOutputStream byteArrayOutputStream, C0583b c0583b) {
        int i4 = 0;
        for (Map.Entry entry : c0583b.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                u(byteArrayOutputStream, intValue - i4);
                u(byteArrayOutputStream, 0);
                i4 = intValue;
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:(3:53|54|55)|57|(3:194|195|(4:197|198|199|200)(2:204|205))|59|(1:63)|95|(3:97|99|(0)(0))|126|(0)(0)|(0)|131|(0)|45|43|44) */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x012e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x012f, code lost:
    
        r20.a(7, r0);
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:63:0x0151. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01ba A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x00fc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0287 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0155 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01a9 A[FALL_THROUGH, PHI: r2
      0x01a9: PHI (r2v3 s0.a) = (r2v2 s0.a), (r2v2 s0.a), (r2v2 s0.a), (r2v2 s0.a), (r2v4 s0.a) binds: [B:60:0x0148, B:62:0x014e, B:63:0x0151, B:70:0x01a6, B:71:0x01a8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01b1  */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v5, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void s(android.content.Context r18, java.util.concurrent.Executor r19, s0.InterfaceC0584c r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 678
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.AbstractC0585d.s(android.content.Context, java.util.concurrent.Executor, s0.c, boolean):void");
    }

    public static void t(ByteArrayOutputStream byteArrayOutputStream, long j4, int i4) {
        byte[] bArr = new byte[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            bArr[i5] = (byte) ((j4 >> (i5 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void u(ByteArrayOutputStream byteArrayOutputStream, int i4) {
        t(byteArrayOutputStream, i4, 2);
    }
}
