package W1;

import C.w;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* loaded from: classes3.dex */
public final class c implements ObjectEncoder {

    /* renamed from: a, reason: collision with root package name */
    public static final c f1913a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final FieldDescriptor f1914b = w.e(1, FieldDescriptor.builder("eventsDroppedCount"));

    /* renamed from: c, reason: collision with root package name */
    public static final FieldDescriptor f1915c = w.e(3, FieldDescriptor.builder("reason"));

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        Z1.d dVar = (Z1.d) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(f1914b, dVar.f2181a);
        objectEncoderContext2.add(f1915c, dVar.f2182b);
    }
}
