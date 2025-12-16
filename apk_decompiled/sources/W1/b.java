package W1;

import C.w;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* loaded from: classes3.dex */
public final class b implements ObjectEncoder {

    /* renamed from: a, reason: collision with root package name */
    public static final b f1911a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final FieldDescriptor f1912b = w.e(1, FieldDescriptor.builder("storageMetrics"));

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        objectEncoderContext.add(f1912b, ((Z1.b) obj).f2173a);
    }
}
