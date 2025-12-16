package W1;

import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;

/* loaded from: classes3.dex */
public final class h implements Configurator {

    /* renamed from: a, reason: collision with root package name */
    public static final h f1926a = new Object();

    @Override // com.google.firebase.encoders.config.Configurator
    public final void configure(EncoderConfig encoderConfig) {
        encoderConfig.registerEncoder(p.class, e.f1919a);
        encoderConfig.registerEncoder(Z1.a.class, a.f1906a);
        encoderConfig.registerEncoder(Z1.g.class, g.f1923a);
        encoderConfig.registerEncoder(Z1.e.class, d.f1916a);
        encoderConfig.registerEncoder(Z1.d.class, c.f1913a);
        encoderConfig.registerEncoder(Z1.b.class, b.f1911a);
        encoderConfig.registerEncoder(Z1.f.class, f.f1920a);
    }
}
