package V1;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* loaded from: classes3.dex */
public final class d implements ObjectEncoder {

    /* renamed from: a, reason: collision with root package name */
    public static final d f1810a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final FieldDescriptor f1811b = FieldDescriptor.of("clientType");

    /* renamed from: c, reason: collision with root package name */
    public static final FieldDescriptor f1812c = FieldDescriptor.of("androidClientInfo");

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        k kVar = (k) ((s) obj);
        kVar.getClass();
        objectEncoderContext2.add(f1811b, r.f1866a);
        objectEncoderContext2.add(f1812c, kVar.f1842a);
    }
}
