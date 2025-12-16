package g0;

import com.google.firebase.sessions.settings.RemoteSettings;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final long f6696a;

    /* renamed from: b, reason: collision with root package name */
    public final long f6697b;

    public e(long j4, long j5) {
        if (j5 == 0) {
            this.f6696a = 0L;
            this.f6697b = 1L;
        } else {
            this.f6696a = j4;
            this.f6697b = j5;
        }
    }

    public final String toString() {
        return this.f6696a + RemoteSettings.FORWARD_SLASH_STRING + this.f6697b;
    }
}
