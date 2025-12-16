package com.google.firebase.sessions.settings;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 7, 1}, xi = 48)
@DebugMetadata(c = "com.google.firebase.sessions.settings.RemoteSettingsFetcher$doConfigFetch$2", f = "RemoteSettingsFetcher.kt", i = {}, l = {68, 70, 73}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class RemoteSettingsFetcher$doConfigFetch$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Map<String, String> $headerOptions;
    final /* synthetic */ Function2<String, Continuation<? super Unit>, Object> $onFailure;
    final /* synthetic */ Function2<JSONObject, Continuation<? super Unit>, Object> $onSuccess;
    int label;
    final /* synthetic */ RemoteSettingsFetcher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RemoteSettingsFetcher$doConfigFetch$2(RemoteSettingsFetcher remoteSettingsFetcher, Map<String, String> map, Function2<? super JSONObject, ? super Continuation<? super Unit>, ? extends Object> function2, Function2<? super String, ? super Continuation<? super Unit>, ? extends Object> function22, Continuation<? super RemoteSettingsFetcher$doConfigFetch$2> continuation) {
        super(2, continuation);
        this.this$0 = remoteSettingsFetcher;
        this.$headerOptions = map;
        this.$onSuccess = function2;
        this.$onFailure = function22;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RemoteSettingsFetcher$doConfigFetch$2(this.this$0, this.$headerOptions, this.$onSuccess, this.$onFailure, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00cb, code lost:
    
        if (r8.invoke(r1, r7) == r0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e0, code lost:
    
        if (r1.invoke(r3, r7) != r0) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [T, java.lang.String] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r7.label
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L26
            if (r1 == r4) goto L1e
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            kotlin.ResultKt.throwOnFailure(r8)
            goto Le3
        L16:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L1e:
            kotlin.ResultKt.throwOnFailure(r8)     // Catch: java.lang.Exception -> L23
            goto Le3
        L23:
            r8 = move-exception
            goto Lce
        L26:
            kotlin.ResultKt.throwOnFailure(r8)
            com.google.firebase.sessions.settings.RemoteSettingsFetcher r8 = r7.this$0     // Catch: java.lang.Exception -> L23
            java.net.URL r8 = com.google.firebase.sessions.settings.RemoteSettingsFetcher.access$settingsUrl(r8)     // Catch: java.lang.Exception -> L23
            java.net.URLConnection r8 = r8.openConnection()     // Catch: java.lang.Exception -> L23
            java.lang.String r1 = "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r8, r1)     // Catch: java.lang.Exception -> L23
            javax.net.ssl.HttpsURLConnection r8 = (javax.net.ssl.HttpsURLConnection) r8     // Catch: java.lang.Exception -> L23
            java.lang.String r1 = "GET"
            r8.setRequestMethod(r1)     // Catch: java.lang.Exception -> L23
            java.lang.String r1 = "Accept"
            java.lang.String r5 = "application/json"
            r8.setRequestProperty(r1, r5)     // Catch: java.lang.Exception -> L23
            java.util.Map<java.lang.String, java.lang.String> r1 = r7.$headerOptions     // Catch: java.lang.Exception -> L23
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Exception -> L23
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Exception -> L23
        L50:
            boolean r5 = r1.hasNext()     // Catch: java.lang.Exception -> L23
            if (r5 == 0) goto L6c
            java.lang.Object r5 = r1.next()     // Catch: java.lang.Exception -> L23
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch: java.lang.Exception -> L23
            java.lang.Object r6 = r5.getKey()     // Catch: java.lang.Exception -> L23
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Exception -> L23
            java.lang.Object r5 = r5.getValue()     // Catch: java.lang.Exception -> L23
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Exception -> L23
            r8.setRequestProperty(r6, r5)     // Catch: java.lang.Exception -> L23
            goto L50
        L6c:
            int r1 = r8.getResponseCode()     // Catch: java.lang.Exception -> L23
            r5 = 200(0xc8, float:2.8E-43)
            if (r1 != r5) goto Lb2
            java.io.InputStream r8 = r8.getInputStream()     // Catch: java.lang.Exception -> L23
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Exception -> L23
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch: java.lang.Exception -> L23
            r3.<init>(r8)     // Catch: java.lang.Exception -> L23
            r1.<init>(r3)     // Catch: java.lang.Exception -> L23
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L23
            r3.<init>()     // Catch: java.lang.Exception -> L23
            kotlin.jvm.internal.Ref$ObjectRef r5 = new kotlin.jvm.internal.Ref$ObjectRef     // Catch: java.lang.Exception -> L23
            r5.<init>()     // Catch: java.lang.Exception -> L23
        L8c:
            java.lang.String r6 = r1.readLine()     // Catch: java.lang.Exception -> L23
            r5.element = r6     // Catch: java.lang.Exception -> L23
            if (r6 == 0) goto L98
            r3.append(r6)     // Catch: java.lang.Exception -> L23
            goto L8c
        L98:
            r1.close()     // Catch: java.lang.Exception -> L23
            r8.close()     // Catch: java.lang.Exception -> L23
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch: java.lang.Exception -> L23
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Exception -> L23
            r8.<init>(r1)     // Catch: java.lang.Exception -> L23
            kotlin.jvm.functions.Function2<org.json.JSONObject, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r1 = r7.$onSuccess     // Catch: java.lang.Exception -> L23
            r7.label = r4     // Catch: java.lang.Exception -> L23
            java.lang.Object r7 = r1.invoke(r8, r7)     // Catch: java.lang.Exception -> L23
            if (r7 != r0) goto Le3
            goto Le2
        Lb2:
            kotlin.jvm.functions.Function2<java.lang.String, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r8 = r7.$onFailure     // Catch: java.lang.Exception -> L23
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L23
            r4.<init>()     // Catch: java.lang.Exception -> L23
            java.lang.String r5 = "Bad response code: "
            r4.append(r5)     // Catch: java.lang.Exception -> L23
            r4.append(r1)     // Catch: java.lang.Exception -> L23
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Exception -> L23
            r7.label = r3     // Catch: java.lang.Exception -> L23
            java.lang.Object r7 = r8.invoke(r1, r7)     // Catch: java.lang.Exception -> L23
            if (r7 != r0) goto Le3
            goto Le2
        Lce:
            kotlin.jvm.functions.Function2<java.lang.String, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r1 = r7.$onFailure
            java.lang.String r3 = r8.getMessage()
            if (r3 != 0) goto Lda
            java.lang.String r3 = r8.toString()
        Lda:
            r7.label = r2
            java.lang.Object r7 = r1.invoke(r3, r7)
            if (r7 != r0) goto Le3
        Le2:
            return r0
        Le3:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.settings.RemoteSettingsFetcher$doConfigFetch$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RemoteSettingsFetcher$doConfigFetch$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
