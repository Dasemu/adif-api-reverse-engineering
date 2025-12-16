package com.google.firebase.encoders;

import java.io.IOException;

/* loaded from: classes3.dex */
public interface ObjectEncoderContext {
    ObjectEncoderContext add(FieldDescriptor fieldDescriptor, double d4) throws IOException;

    ObjectEncoderContext add(FieldDescriptor fieldDescriptor, float f2) throws IOException;

    ObjectEncoderContext add(FieldDescriptor fieldDescriptor, int i) throws IOException;

    ObjectEncoderContext add(FieldDescriptor fieldDescriptor, long j4) throws IOException;

    ObjectEncoderContext add(FieldDescriptor fieldDescriptor, Object obj) throws IOException;

    ObjectEncoderContext add(FieldDescriptor fieldDescriptor, boolean z3) throws IOException;

    @Deprecated
    ObjectEncoderContext add(String str, double d4) throws IOException;

    @Deprecated
    ObjectEncoderContext add(String str, int i) throws IOException;

    @Deprecated
    ObjectEncoderContext add(String str, long j4) throws IOException;

    @Deprecated
    ObjectEncoderContext add(String str, Object obj) throws IOException;

    @Deprecated
    ObjectEncoderContext add(String str, boolean z3) throws IOException;

    ObjectEncoderContext inline(Object obj) throws IOException;

    ObjectEncoderContext nested(FieldDescriptor fieldDescriptor) throws IOException;

    ObjectEncoderContext nested(String str) throws IOException;
}
