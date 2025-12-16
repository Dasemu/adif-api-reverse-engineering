package com.google.firebase.sessions;

import B0.w;
import I2.k;
import T1.c;
import T1.d;
import T1.g;
import W1.r;
import android.util.Log;
import com.google.firebase.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/google/firebase/sessions/EventGDTLogger;", "Lcom/google/firebase/sessions/EventGDTLoggerInterface;", "Lcom/google/firebase/inject/Provider;", "LT1/g;", "transportFactoryProvider", "<init>", "(Lcom/google/firebase/inject/Provider;)V", "Lcom/google/firebase/sessions/SessionEvent;", "value", "", "encode", "(Lcom/google/firebase/sessions/SessionEvent;)[B", "sessionEvent", "", "log", "(Lcom/google/firebase/sessions/SessionEvent;)V", "Lcom/google/firebase/inject/Provider;", "Companion", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class EventGDTLogger implements EventGDTLoggerInterface {
    private static final String AQS_LOG_SOURCE = "FIREBASE_APPQUALITY_SESSION";
    private static final String TAG = "EventGDTLogger";
    private final Provider<g> transportFactoryProvider;

    public EventGDTLogger(Provider<g> transportFactoryProvider) {
        Intrinsics.checkNotNullParameter(transportFactoryProvider, "transportFactoryProvider");
        this.transportFactoryProvider = transportFactoryProvider;
    }

    public final byte[] encode(SessionEvent value) {
        String encode = SessionEvents.INSTANCE.getSESSION_EVENT_ENCODER$com_google_firebase_firebase_sessions().encode(value);
        Intrinsics.checkNotNullExpressionValue(encode, "SessionEvents.SESSION_EVENT_ENCODER.encode(value)");
        Log.d(TAG, "Session Event: " + encode);
        byte[] bytes = encode.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    @Override // com.google.firebase.sessions.EventGDTLoggerInterface
    public void log(SessionEvent sessionEvent) {
        Intrinsics.checkNotNullParameter(sessionEvent, "sessionEvent");
        ((r) this.transportFactoryProvider.get()).a(AQS_LOG_SOURCE, new c("json"), new k(this, 21)).a(new T1.a(sessionEvent, d.f1658a, null), new w(8));
    }
}
