package W1;

import C.w;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* loaded from: classes3.dex */
public final class f implements ObjectEncoder {

    /* renamed from: a, reason: collision with root package name */
    public static final f f1920a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final FieldDescriptor f1921b = w.e(1, FieldDescriptor.builder("currentCacheSizeBytes"));

    /* renamed from: c, reason: collision with root package name */
    public static final FieldDescriptor f1922c = w.e(2, FieldDescriptor.builder("maxCacheSizeBytes"));

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        Z1.f fVar = (Z1.f) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(f1921b, fVar.f2186a);
        objectEncoderContext2.add(f1922c, fVar.f2187b);
    }
}
