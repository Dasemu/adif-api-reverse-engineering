package V1;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* loaded from: classes3.dex */
public final class g implements ObjectEncoder {

    /* renamed from: a, reason: collision with root package name */
    public static final g f1827a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final FieldDescriptor f1828b = FieldDescriptor.of("networkType");

    /* renamed from: c, reason: collision with root package name */
    public static final FieldDescriptor f1829c = FieldDescriptor.of("mobileSubtype");

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        p pVar = (p) ((x) obj);
        objectEncoderContext2.add(f1828b, pVar.f1864a);
        objectEncoderContext2.add(f1829c, pVar.f1865b);
    }
}
