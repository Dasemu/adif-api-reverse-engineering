package e3;

/* loaded from: classes3.dex */
public enum G {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");


    /* renamed from: a, reason: collision with root package name */
    public final String f6261a;

    G(String str) {
        this.f6261a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f6261a;
    }
}
