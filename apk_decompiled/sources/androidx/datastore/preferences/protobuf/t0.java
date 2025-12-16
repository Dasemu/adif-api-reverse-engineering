package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class t0 extends Q {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f2973c;

    public /* synthetic */ t0(int i) {
        this.f2973c = i;
    }

    public static int m(long j4, byte[] bArr, int i, int i4) {
        if (i4 == 0) {
            Q q4 = v0.f2974a;
            if (i > -12) {
                return -1;
            }
            return i;
        }
        if (i4 == 1) {
            return v0.c(i, s0.f(bArr, j4));
        }
        if (i4 == 2) {
            return v0.d(i, s0.f(bArr, j4), s0.f(bArr, j4 + 1));
        }
        throw new AssertionError();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f1  */
    @Override // androidx.datastore.preferences.protobuf.Q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String e(int r10, int r11, byte[] r12) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.t0.e(int, int, byte[]):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:?, code lost:
    
        return r26 + r3;
     */
    @Override // androidx.datastore.preferences.protobuf.Q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int f(java.lang.String r24, byte[] r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 606
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.t0.f(java.lang.String, byte[], int, int):int");
    }

    @Override // androidx.datastore.preferences.protobuf.Q
    public final int i(byte[] bArr, int i, int i4) {
        int i5;
        switch (this.f2973c) {
            case 0:
                break;
            default:
                if ((i | i4 | (bArr.length - i4)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i4)));
                }
                long j4 = i;
                int i6 = (int) (i4 - j4);
                if (i6 < 16) {
                    i5 = 0;
                } else {
                    i5 = 0;
                    long j5 = j4;
                    while (true) {
                        if (i5 < i6) {
                            long j6 = j5 + 1;
                            if (s0.f(bArr, j5) >= 0) {
                                i5++;
                                j5 = j6;
                            }
                        } else {
                            i5 = i6;
                        }
                    }
                }
                int i7 = i6 - i5;
                long j7 = j4 + i5;
                while (true) {
                    byte b4 = 0;
                    while (true) {
                        if (i7 > 0) {
                            long j8 = j7 + 1;
                            b4 = s0.f(bArr, j7);
                            if (b4 >= 0) {
                                i7--;
                                j7 = j8;
                            } else {
                                j7 = j8;
                            }
                        }
                    }
                    if (i7 == 0) {
                        return 0;
                    }
                    int i8 = i7 - 1;
                    if (b4 < -32) {
                        if (i8 == 0) {
                            return b4;
                        }
                        i7 -= 2;
                        if (b4 >= -62) {
                            long j9 = j7 + 1;
                            if (s0.f(bArr, j7) <= -65) {
                                j7 = j9;
                            }
                        }
                    } else if (b4 < -16) {
                        if (i8 < 2) {
                            return m(j7, bArr, b4, i8);
                        }
                        i7 -= 3;
                        long j10 = j7 + 1;
                        byte f2 = s0.f(bArr, j7);
                        if (f2 <= -65 && ((b4 != -32 || f2 >= -96) && (b4 != -19 || f2 < -96))) {
                            j7 += 2;
                            if (s0.f(bArr, j10) > -65) {
                            }
                        }
                    } else {
                        if (i8 < 3) {
                            return m(j7, bArr, b4, i8);
                        }
                        i7 -= 4;
                        long j11 = j7 + 1;
                        byte f4 = s0.f(bArr, j7);
                        if (f4 <= -65) {
                            if ((((f4 + 112) + (b4 << 28)) >> 30) == 0) {
                                long j12 = 2 + j7;
                                if (s0.f(bArr, j11) <= -65) {
                                    j7 += 3;
                                    if (s0.f(bArr, j12) > -65) {
                                    }
                                }
                            }
                        }
                    }
                }
                return -1;
        }
        while (i < i4 && bArr[i] >= 0) {
            i++;
        }
        if (i < i4) {
            while (i < i4) {
                int i9 = i + 1;
                byte b5 = bArr[i];
                if (b5 < 0) {
                    if (b5 < -32) {
                        if (i9 >= i4) {
                            return b5;
                        }
                        if (b5 >= -62) {
                            i += 2;
                            if (bArr[i9] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (b5 < -16) {
                        if (i9 >= i4 - 1) {
                            return v0.a(i9, i4, bArr);
                        }
                        int i10 = i + 2;
                        byte b6 = bArr[i9];
                        if (b6 <= -65 && ((b5 != -32 || b6 >= -96) && (b5 != -19 || b6 < -96))) {
                            i += 3;
                            if (bArr[i10] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (i9 >= i4 - 2) {
                        return v0.a(i9, i4, bArr);
                    }
                    int i11 = i + 2;
                    byte b7 = bArr[i9];
                    if (b7 <= -65) {
                        if ((((b7 + 112) + (b5 << 28)) >> 30) == 0) {
                            int i12 = i + 3;
                            if (bArr[i11] <= -65) {
                                i += 4;
                                if (bArr[i12] > -65) {
                                }
                            }
                        }
                    }
                    return -1;
                }
                i = i9;
            }
        }
        return 0;
    }
}
