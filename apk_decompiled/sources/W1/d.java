package W1;

import C.w;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* loaded from: classes3.dex */
public final class d implements ObjectEncoder {

    /* renamed from: a, reason: collision with root package name */
    public static final d f1916a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final FieldDescriptor f1917b = w.e(1, FieldDescriptor.builder("logSource"));

    /* renamed from: c, reason: collision with root package name */
    public static final FieldDescriptor f1918c = w.e(2, FieldDescriptor.builder("logEventDropped"));

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        Z1.e eVar = (Z1.e) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(f1917b, eVar.f2184a);
        objectEncoderContext2.add(f1918c, eVar.f2185b);
    }
}
