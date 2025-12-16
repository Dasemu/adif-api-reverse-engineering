package com.google.firebase.encoders;

import java.io.IOException;

/* loaded from: classes3.dex */
public interface ValueEncoderContext {
    ValueEncoderContext add(double d4) throws IOException;

    ValueEncoderContext add(float f2) throws IOException;

    ValueEncoderContext add(int i) throws IOException;

    ValueEncoderContext add(long j4) throws IOException;

    ValueEncoderContext add(String str) throws IOException;

    ValueEncoderContext add(boolean z3) throws IOException;

    ValueEncoderContext add(byte[] bArr) throws IOException;
}
