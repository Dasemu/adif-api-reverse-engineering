package com.google.firebase.sessions.settings;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", "Lorg/json/JSONObject;"}, k = 3, mv = {1, 7, 1}, xi = 48)
@DebugMetadata(c = "com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$1", f = "RemoteSettings.kt", i = {0, 0, 0, 1, 1, 2}, l = {125, 128, 131, 133, 134, 136}, m = "invokeSuspend", n = {"sessionSamplingRate", "sessionTimeoutSeconds", "cacheDuration", "sessionSamplingRate", "cacheDuration", "cacheDuration"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$0"})
/* loaded from: classes3.dex */
public final class RemoteSettings$updateSettings$2$1 extends SuspendLambda implements Function2<JSONObject, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ RemoteSettings this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteSettings$updateSettings$2$1(RemoteSettings remoteSettings, Continuation<? super RemoteSettings$updateSettings$2$1> continuation) {
        super(2, continuation);
        this.this$0 = remoteSettings;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RemoteSettings$updateSettings$2$1 remoteSettings$updateSettings$2$1 = new RemoteSettings$updateSettings$2$1(this.this$0, continuation);
        remoteSettings$updateSettings$2$1.L$0 = obj;
        return remoteSettings$updateSettings$2$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0192, code lost:
    
        if (r13.updateSessionCacheUpdatedTime(r0, r12) == r4) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0174, code lost:
    
        if (r13.updateSessionCacheDuration(r0, r12) == r4) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0151, code lost:
    
        if (r13.updateSessionCacheDuration(r0, r12) == r4) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0131, code lost:
    
        if (r13.updateSamplingRate(r1, r12) == r4) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0110, code lost:
    
        if (r13.updateSessionRestartTimeout(r2, r12) == r4) goto L66;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000f. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f1  */
    /* JADX WARN: Type inference failed for: r13v12, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r1v5, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r2v4, types: [T, java.lang.Double] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(JSONObject jSONObject, Continuation<? super Unit> continuation) {
        return ((RemoteSettings$updateSettings$2$1) create(jSONObject, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
