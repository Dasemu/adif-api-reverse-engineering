package com.google.firebase.encoders.proto;

import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ValueEncoderContext;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class ProtobufValueEncoderContext implements ValueEncoderContext {
    private FieldDescriptor field;
    private final ProtobufDataEncoderContext objEncoderCtx;
    private boolean encoded = false;
    private boolean skipDefault = false;

    public ProtobufValueEncoderContext(ProtobufDataEncoderContext protobufDataEncoderContext) {
        this.objEncoderCtx = protobufDataEncoderContext;
    }

    private void checkNotUsed() {
        if (this.encoded) {
            throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
        }
        this.encoded = true;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public ValueEncoderContext add(String str) throws IOException {
        checkNotUsed();
        this.objEncoderCtx.add(this.field, str, this.skipDefault);
        return this;
    }

    public void resetContext(FieldDescriptor fieldDescriptor, boolean z3) {
        this.encoded = false;
        this.field = fieldDescriptor;
        this.skipDefault = z3;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public ValueEncoderContext add(float f2) throws IOException {
        checkNotUsed();
        this.objEncoderCtx.add(this.field, f2, this.skipDefault);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public ValueEncoderContext add(double d4) throws IOException {
        checkNotUsed();
        this.objEncoderCtx.add(this.field, d4, this.skipDefault);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public ValueEncoderContext add(int i) throws IOException {
        checkNotUsed();
        this.objEncoderCtx.add(this.field, i, this.skipDefault);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public ValueEncoderContext add(long j4) throws IOException {
        checkNotUsed();
        this.objEncoderCtx.add(this.field, j4, this.skipDefault);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public ValueEncoderContext add(boolean z3) throws IOException {
        checkNotUsed();
        this.objEncoderCtx.add(this.field, z3, this.skipDefault);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public ValueEncoderContext add(byte[] bArr) throws IOException {
        checkNotUsed();
        this.objEncoderCtx.add(this.field, bArr, this.skipDefault);
        return this;
    }
}
