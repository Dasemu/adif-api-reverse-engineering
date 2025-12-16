package V1;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* loaded from: classes3.dex */
public final class c implements ObjectEncoder {

    /* renamed from: a, reason: collision with root package name */
    public static final c f1808a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final FieldDescriptor f1809b = FieldDescriptor.of("logRequest");

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        objectEncoderContext.add(f1809b, ((j) ((q) obj)).f1841a);
    }
}
