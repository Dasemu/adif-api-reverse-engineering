package com.google.firebase.encoders.proto;

import C.w;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.ValueEncoder;
import com.google.firebase.encoders.proto.Protobuf;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class ProtobufDataEncoderContext implements ObjectEncoderContext {
    private final ObjectEncoder<Object> fallbackEncoder;
    private final Map<Class<?>, ObjectEncoder<?>> objectEncoders;
    private OutputStream output;
    private final ProtobufValueEncoderContext valueEncoderContext = new ProtobufValueEncoderContext(this);
    private final Map<Class<?>, ValueEncoder<?>> valueEncoders;
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private static final FieldDescriptor MAP_KEY_DESC = w.e(1, FieldDescriptor.builder("key"));
    private static final FieldDescriptor MAP_VALUE_DESC = w.e(2, FieldDescriptor.builder("value"));
    private static final ObjectEncoder<Map.Entry<Object, Object>> DEFAULT_MAP_ENCODER = new a(0);

    /* renamed from: com.google.firebase.encoders.proto.ProtobufDataEncoderContext$1 */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$firebase$encoders$proto$Protobuf$IntEncoding;

        static {
            int[] iArr = new int[Protobuf.IntEncoding.values().length];
            $SwitchMap$com$google$firebase$encoders$proto$Protobuf$IntEncoding = iArr;
            try {
                iArr[Protobuf.IntEncoding.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$firebase$encoders$proto$Protobuf$IntEncoding[Protobuf.IntEncoding.SIGNED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$firebase$encoders$proto$Protobuf$IntEncoding[Protobuf.IntEncoding.FIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public ProtobufDataEncoderContext(OutputStream outputStream, Map<Class<?>, ObjectEncoder<?>> map, Map<Class<?>, ValueEncoder<?>> map2, ObjectEncoder<Object> objectEncoder) {
        this.output = outputStream;
        this.objectEncoders = map;
        this.valueEncoders = map2;
        this.fallbackEncoder = objectEncoder;
    }

    private static ByteBuffer allocateBuffer(int i) {
        return ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
    }

    private <T> long determineSize(ObjectEncoder<T> objectEncoder, T t2) throws IOException {
        LengthCountingOutputStream lengthCountingOutputStream = new LengthCountingOutputStream();
        try {
            OutputStream outputStream = this.output;
            this.output = lengthCountingOutputStream;
            try {
                objectEncoder.encode(t2, this);
                this.output = outputStream;
                long length = lengthCountingOutputStream.getLength();
                lengthCountingOutputStream.close();
                return length;
            } catch (Throwable th) {
                this.output = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                lengthCountingOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    private <T> ProtobufDataEncoderContext doEncode(ObjectEncoder<T> objectEncoder, FieldDescriptor fieldDescriptor, T t2, boolean z3) throws IOException {
        long determineSize = determineSize(objectEncoder, t2);
        if (z3 && determineSize == 0) {
            return this;
        }
        writeVarInt32((getTag(fieldDescriptor) << 3) | 2);
        writeVarInt64(determineSize);
        objectEncoder.encode(t2, this);
        return this;
    }

    private static Protobuf getProtobuf(FieldDescriptor fieldDescriptor) {
        Protobuf protobuf = (Protobuf) fieldDescriptor.getProperty(Protobuf.class);
        if (protobuf != null) {
            return protobuf;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    private static int getTag(FieldDescriptor fieldDescriptor) {
        Protobuf protobuf = (Protobuf) fieldDescriptor.getProperty(Protobuf.class);
        if (protobuf != null) {
            return protobuf.tag();
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    public static /* synthetic */ void lambda$static$0(Map.Entry entry, ObjectEncoderContext objectEncoderContext) throws IOException {
        objectEncoderContext.add(MAP_KEY_DESC, entry.getKey());
        objectEncoderContext.add(MAP_VALUE_DESC, entry.getValue());
    }

    private void writeVarInt32(int i) throws IOException {
        while ((i & (-128)) != 0) {
            this.output.write((i & WorkQueueKt.MASK) | 128);
            i >>>= 7;
        }
        this.output.write(i & WorkQueueKt.MASK);
    }

    private void writeVarInt64(long j4) throws IOException {
        while (((-128) & j4) != 0) {
            this.output.write((((int) j4) & WorkQueueKt.MASK) | 128);
            j4 >>>= 7;
        }
        this.output.write(((int) j4) & WorkQueueKt.MASK);
    }

    public ProtobufDataEncoderContext encode(Object obj) throws IOException {
        if (obj == null) {
            return this;
        }
        ObjectEncoder<?> objectEncoder = this.objectEncoders.get(obj.getClass());
        if (objectEncoder != null) {
            objectEncoder.encode(obj, this);
            return this;
        }
        throw new EncodingException("No encoder for " + obj.getClass());
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public ObjectEncoderContext inline(Object obj) throws IOException {
        return encode(obj);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public ObjectEncoderContext nested(String str) throws IOException {
        return nested(FieldDescriptor.of(str));
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public ObjectEncoderContext nested(FieldDescriptor fieldDescriptor) throws IOException {
        throw new EncodingException("nested() is not implemented for protobuf encoding.");
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public ObjectEncoderContext add(String str, Object obj) throws IOException {
        return add(FieldDescriptor.of(str), obj);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public ObjectEncoderContext add(String str, double d4) throws IOException {
        return add(FieldDescriptor.of(str), d4);
    }

    private <T> ProtobufDataEncoderContext doEncode(ValueEncoder<T> valueEncoder, FieldDescriptor fieldDescriptor, T t2, boolean z3) throws IOException {
        this.valueEncoderContext.resetContext(fieldDescriptor, z3);
        valueEncoder.encode(t2, this.valueEncoderContext);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public ObjectEncoderContext add(String str, int i) throws IOException {
        return add(FieldDescriptor.of(str), i);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public ObjectEncoderContext add(String str, long j4) throws IOException {
        return add(FieldDescriptor.of(str), j4);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public ObjectEncoderContext add(String str, boolean z3) throws IOException {
        return add(FieldDescriptor.of(str), z3);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public ObjectEncoderContext add(FieldDescriptor fieldDescriptor, Object obj) throws IOException {
        return add(fieldDescriptor, obj, true);
    }

    public ObjectEncoderContext add(FieldDescriptor fieldDescriptor, Object obj, boolean z3) throws IOException {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (!z3 || charSequence.length() != 0) {
                    writeVarInt32((getTag(fieldDescriptor) << 3) | 2);
                    byte[] bytes = charSequence.toString().getBytes(UTF_8);
                    writeVarInt32(bytes.length);
                    this.output.write(bytes);
                    return this;
                }
            } else if (obj instanceof Collection) {
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    add(fieldDescriptor, it.next(), false);
                }
            } else if (obj instanceof Map) {
                Iterator it2 = ((Map) obj).entrySet().iterator();
                while (it2.hasNext()) {
                    doEncode((ObjectEncoder<FieldDescriptor>) DEFAULT_MAP_ENCODER, fieldDescriptor, (FieldDescriptor) it2.next(), false);
                }
            } else {
                if (obj instanceof Double) {
                    return add(fieldDescriptor, ((Double) obj).doubleValue(), z3);
                }
                if (obj instanceof Float) {
                    return add(fieldDescriptor, ((Float) obj).floatValue(), z3);
                }
                if (obj instanceof Number) {
                    return add(fieldDescriptor, ((Number) obj).longValue(), z3);
                }
                if (obj instanceof Boolean) {
                    return add(fieldDescriptor, ((Boolean) obj).booleanValue(), z3);
                }
                if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    if (!z3 || bArr.length != 0) {
                        writeVarInt32((getTag(fieldDescriptor) << 3) | 2);
                        writeVarInt32(bArr.length);
                        this.output.write(bArr);
                        return this;
                    }
                } else {
                    ObjectEncoder<?> objectEncoder = this.objectEncoders.get(obj.getClass());
                    if (objectEncoder != null) {
                        return doEncode((ObjectEncoder<FieldDescriptor>) objectEncoder, fieldDescriptor, (FieldDescriptor) obj, z3);
                    }
                    ValueEncoder<?> valueEncoder = this.valueEncoders.get(obj.getClass());
                    if (valueEncoder != null) {
                        return doEncode((ValueEncoder<FieldDescriptor>) valueEncoder, fieldDescriptor, (FieldDescriptor) obj, z3);
                    }
                    if (obj instanceof ProtoEnum) {
                        return add(fieldDescriptor, ((ProtoEnum) obj).getNumber());
                    }
                    if (obj instanceof Enum) {
                        return add(fieldDescriptor, ((Enum) obj).ordinal());
                    }
                    return doEncode((ObjectEncoder<FieldDescriptor>) this.fallbackEncoder, fieldDescriptor, (FieldDescriptor) obj, z3);
                }
            }
        }
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public ObjectEncoderContext add(FieldDescriptor fieldDescriptor, double d4) throws IOException {
        return add(fieldDescriptor, d4, true);
    }

    public ObjectEncoderContext add(FieldDescriptor fieldDescriptor, double d4, boolean z3) throws IOException {
        if (z3 && d4 == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            return this;
        }
        writeVarInt32((getTag(fieldDescriptor) << 3) | 1);
        this.output.write(allocateBuffer(8).putDouble(d4).array());
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public ObjectEncoderContext add(FieldDescriptor fieldDescriptor, float f2) throws IOException {
        return add(fieldDescriptor, f2, true);
    }

    public ObjectEncoderContext add(FieldDescriptor fieldDescriptor, float f2, boolean z3) throws IOException {
        if (z3 && f2 == BitmapDescriptorFactory.HUE_RED) {
            return this;
        }
        writeVarInt32((getTag(fieldDescriptor) << 3) | 5);
        this.output.write(allocateBuffer(4).putFloat(f2).array());
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public ProtobufDataEncoderContext add(FieldDescriptor fieldDescriptor, int i) throws IOException {
        return add(fieldDescriptor, i, true);
    }

    public ProtobufDataEncoderContext add(FieldDescriptor fieldDescriptor, int i, boolean z3) throws IOException {
        if (!z3 || i != 0) {
            Protobuf protobuf = getProtobuf(fieldDescriptor);
            int i4 = AnonymousClass1.$SwitchMap$com$google$firebase$encoders$proto$Protobuf$IntEncoding[protobuf.intEncoding().ordinal()];
            if (i4 == 1) {
                writeVarInt32(protobuf.tag() << 3);
                writeVarInt32(i);
                return this;
            }
            if (i4 == 2) {
                writeVarInt32(protobuf.tag() << 3);
                writeVarInt32((i << 1) ^ (i >> 31));
                return this;
            }
            if (i4 == 3) {
                writeVarInt32((protobuf.tag() << 3) | 5);
                this.output.write(allocateBuffer(4).putInt(i).array());
                return this;
            }
        }
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public ProtobufDataEncoderContext add(FieldDescriptor fieldDescriptor, long j4) throws IOException {
        return add(fieldDescriptor, j4, true);
    }

    public ProtobufDataEncoderContext add(FieldDescriptor fieldDescriptor, long j4, boolean z3) throws IOException {
        if (!z3 || j4 != 0) {
            Protobuf protobuf = getProtobuf(fieldDescriptor);
            int i = AnonymousClass1.$SwitchMap$com$google$firebase$encoders$proto$Protobuf$IntEncoding[protobuf.intEncoding().ordinal()];
            if (i == 1) {
                writeVarInt32(protobuf.tag() << 3);
                writeVarInt64(j4);
                return this;
            }
            if (i == 2) {
                writeVarInt32(protobuf.tag() << 3);
                writeVarInt64((j4 >> 63) ^ (j4 << 1));
                return this;
            }
            if (i == 3) {
                writeVarInt32((protobuf.tag() << 3) | 1);
                this.output.write(allocateBuffer(8).putLong(j4).array());
                return this;
            }
        }
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public ProtobufDataEncoderContext add(FieldDescriptor fieldDescriptor, boolean z3) throws IOException {
        return add(fieldDescriptor, z3, true);
    }

    public ProtobufDataEncoderContext add(FieldDescriptor fieldDescriptor, boolean z3, boolean z4) throws IOException {
        return add(fieldDescriptor, z3 ? 1 : 0, z4);
    }
}
