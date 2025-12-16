package V1;

import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;

/* loaded from: classes3.dex */
public final class h implements Configurator {

    /* renamed from: a, reason: collision with root package name */
    public static final h f1830a = new Object();

    @Override // com.google.firebase.encoders.config.Configurator
    public final void configure(EncoderConfig encoderConfig) {
        c cVar = c.f1808a;
        encoderConfig.registerEncoder(q.class, cVar);
        encoderConfig.registerEncoder(j.class, cVar);
        f fVar = f.f1820a;
        encoderConfig.registerEncoder(u.class, fVar);
        encoderConfig.registerEncoder(n.class, fVar);
        d dVar = d.f1810a;
        encoderConfig.registerEncoder(s.class, dVar);
        encoderConfig.registerEncoder(k.class, dVar);
        b bVar = b.f1797a;
        encoderConfig.registerEncoder(a.class, bVar);
        encoderConfig.registerEncoder(i.class, bVar);
        e eVar = e.f1813a;
        encoderConfig.registerEncoder(t.class, eVar);
        encoderConfig.registerEncoder(m.class, eVar);
        g gVar = g.f1827a;
        encoderConfig.registerEncoder(x.class, gVar);
        encoderConfig.registerEncoder(p.class, gVar);
    }
}
