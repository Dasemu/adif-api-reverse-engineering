package W1;

import C.w;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* loaded from: classes3.dex */
public final class a implements ObjectEncoder {

    /* renamed from: a, reason: collision with root package name */
    public static final a f1906a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final FieldDescriptor f1907b = w.e(1, FieldDescriptor.builder("window"));

    /* renamed from: c, reason: collision with root package name */
    public static final FieldDescriptor f1908c = w.e(2, FieldDescriptor.builder("logSourceMetrics"));

    /* renamed from: d, reason: collision with root package name */
    public static final FieldDescriptor f1909d = w.e(3, FieldDescriptor.builder("globalMetrics"));

    /* renamed from: e, reason: collision with root package name */
    public static final FieldDescriptor f1910e = w.e(4, FieldDescriptor.builder("appNamespace"));

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        Z1.a aVar = (Z1.a) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(f1907b, aVar.f2169a);
        objectEncoderContext2.add(f1908c, aVar.f2170b);
        objectEncoderContext2.add(f1909d, aVar.f2171c);
        objectEncoderContext2.add(f1910e, aVar.f2172d);
    }
}
