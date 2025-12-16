package V1;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.remoteconfig.RemoteConfigConstants;

/* loaded from: classes3.dex */
public final class b implements ObjectEncoder {

    /* renamed from: a, reason: collision with root package name */
    public static final b f1797a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final FieldDescriptor f1798b = FieldDescriptor.of(RemoteConfigConstants.RequestFieldKey.SDK_VERSION);

    /* renamed from: c, reason: collision with root package name */
    public static final FieldDescriptor f1799c = FieldDescriptor.of("model");

    /* renamed from: d, reason: collision with root package name */
    public static final FieldDescriptor f1800d = FieldDescriptor.of("hardware");

    /* renamed from: e, reason: collision with root package name */
    public static final FieldDescriptor f1801e = FieldDescriptor.of("device");

    /* renamed from: f, reason: collision with root package name */
    public static final FieldDescriptor f1802f = FieldDescriptor.of("product");

    /* renamed from: g, reason: collision with root package name */
    public static final FieldDescriptor f1803g = FieldDescriptor.of("osBuild");
    public static final FieldDescriptor h = FieldDescriptor.of("manufacturer");
    public static final FieldDescriptor i = FieldDescriptor.of("fingerprint");

    /* renamed from: j, reason: collision with root package name */
    public static final FieldDescriptor f1804j = FieldDescriptor.of("locale");

    /* renamed from: k, reason: collision with root package name */
    public static final FieldDescriptor f1805k = FieldDescriptor.of("country");

    /* renamed from: l, reason: collision with root package name */
    public static final FieldDescriptor f1806l = FieldDescriptor.of("mccMnc");

    /* renamed from: m, reason: collision with root package name */
    public static final FieldDescriptor f1807m = FieldDescriptor.of("applicationBuild");

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        i iVar = (i) ((a) obj);
        objectEncoderContext2.add(f1798b, iVar.f1831a);
        objectEncoderContext2.add(f1799c, iVar.f1832b);
        objectEncoderContext2.add(f1800d, iVar.f1833c);
        objectEncoderContext2.add(f1801e, iVar.f1834d);
        objectEncoderContext2.add(f1802f, iVar.f1835e);
        objectEncoderContext2.add(f1803g, iVar.f1836f);
        objectEncoderContext2.add(h, iVar.f1837g);
        objectEncoderContext2.add(i, iVar.h);
        objectEncoderContext2.add(f1804j, iVar.i);
        objectEncoderContext2.add(f1805k, iVar.f1838j);
        objectEncoderContext2.add(f1806l, iVar.f1839k);
        objectEncoderContext2.add(f1807m, iVar.f1840l);
    }
}
