package W1;

import C.w;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* loaded from: classes3.dex */
public final class g implements ObjectEncoder {

    /* renamed from: a, reason: collision with root package name */
    public static final g f1923a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final FieldDescriptor f1924b = w.e(1, FieldDescriptor.builder("startMs"));

    /* renamed from: c, reason: collision with root package name */
    public static final FieldDescriptor f1925c = w.e(2, FieldDescriptor.builder("endMs"));

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        Z1.g gVar = (Z1.g) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(f1924b, gVar.f2188a);
        objectEncoderContext2.add(f1925c, gVar.f2189b);
    }
}
