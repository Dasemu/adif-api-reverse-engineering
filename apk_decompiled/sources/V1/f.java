package V1;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* loaded from: classes3.dex */
public final class f implements ObjectEncoder {

    /* renamed from: a, reason: collision with root package name */
    public static final f f1820a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final FieldDescriptor f1821b = FieldDescriptor.of("requestTimeMs");

    /* renamed from: c, reason: collision with root package name */
    public static final FieldDescriptor f1822c = FieldDescriptor.of("requestUptimeMs");

    /* renamed from: d, reason: collision with root package name */
    public static final FieldDescriptor f1823d = FieldDescriptor.of("clientInfo");

    /* renamed from: e, reason: collision with root package name */
    public static final FieldDescriptor f1824e = FieldDescriptor.of("logSource");

    /* renamed from: f, reason: collision with root package name */
    public static final FieldDescriptor f1825f = FieldDescriptor.of("logSourceName");

    /* renamed from: g, reason: collision with root package name */
    public static final FieldDescriptor f1826g = FieldDescriptor.of("logEvent");
    public static final FieldDescriptor h = FieldDescriptor.of("qosTier");

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        n nVar = (n) ((u) obj);
        objectEncoderContext2.add(f1821b, nVar.f1857a);
        objectEncoderContext2.add(f1822c, nVar.f1858b);
        objectEncoderContext2.add(f1823d, nVar.f1859c);
        objectEncoderContext2.add(f1824e, nVar.f1860d);
        objectEncoderContext2.add(f1825f, nVar.f1861e);
        objectEncoderContext2.add(f1826g, nVar.f1862f);
        objectEncoderContext2.add(h, y.f1872a);
    }
}
