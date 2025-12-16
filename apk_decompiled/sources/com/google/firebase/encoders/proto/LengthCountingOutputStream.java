package com.google.firebase.encoders.proto;

import java.io.OutputStream;

/* loaded from: classes3.dex */
final class LengthCountingOutputStream extends OutputStream {
    private long length = 0;

    public long getLength() {
        return this.length;
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        this.length++;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        this.length += bArr.length;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i4) {
        int i5;
        if (i >= 0 && i <= bArr.length && i4 >= 0 && (i5 = i + i4) <= bArr.length && i5 >= 0) {
            this.length += i4;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
