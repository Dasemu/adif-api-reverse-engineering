package V1;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* loaded from: classes3.dex */
public final class e implements ObjectEncoder {

    /* renamed from: a, reason: collision with root package name */
    public static final e f1813a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final FieldDescriptor f1814b = FieldDescriptor.of("eventTimeMs");

    /* renamed from: c, reason: collision with root package name */
    public static final FieldDescriptor f1815c = FieldDescriptor.of("eventCode");

    /* renamed from: d, reason: collision with root package name */
    public static final FieldDescriptor f1816d = FieldDescriptor.of("eventUptimeMs");

    /* renamed from: e, reason: collision with root package name */
    public static final FieldDescriptor f1817e = FieldDescriptor.of("sourceExtension");

    /* renamed from: f, reason: collision with root package name */
    public static final FieldDescriptor f1818f = FieldDescriptor.of("sourceExtensionJsonProto3");

    /* renamed from: g, reason: collision with root package name */
    public static final FieldDescriptor f1819g = FieldDescriptor.of("timezoneOffsetSeconds");
    public static final FieldDescriptor h = FieldDescriptor.of("networkConnectionInfo");

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        m mVar = (m) ((t) obj);
        objectEncoderContext2.add(f1814b, mVar.f1850a);
        objectEncoderContext2.add(f1815c, mVar.f1851b);
        objectEncoderContext2.add(f1816d, mVar.f1852c);
        objectEncoderContext2.add(f1817e, mVar.f1853d);
        objectEncoderContext2.add(f1818f, mVar.f1854e);
        objectEncoderContext2.add(f1819g, mVar.f1855f);
        objectEncoderContext2.add(h, mVar.f1856g);
    }
}
