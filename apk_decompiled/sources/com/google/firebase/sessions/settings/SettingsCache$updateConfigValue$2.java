package com.google.firebase.sessions.settings;

import b0.C0257b;
import b0.C0260e;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lb0/b;", "preferences", "", "<anonymous>", "(Lb0/b;)V"}, k = 3, mv = {1, 7, 1})
@DebugMetadata(c = "com.google.firebase.sessions.settings.SettingsCache$updateConfigValue$2", f = "SettingsCache.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class SettingsCache$updateConfigValue$2 extends SuspendLambda implements Function2<C0257b, Continuation<? super Unit>, Object> {
    final /* synthetic */ C0260e $key;
    final /* synthetic */ T $value;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SettingsCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsCache$updateConfigValue$2(T t2, C0260e c0260e, SettingsCache settingsCache, Continuation<? super SettingsCache$updateConfigValue$2> continuation) {
        super(2, continuation);
        this.$value = t2;
        this.$key = c0260e;
        this.this$0 = settingsCache;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SettingsCache$updateConfigValue$2 settingsCache$updateConfigValue$2 = new SettingsCache$updateConfigValue$2(this.$value, this.$key, this.this$0, continuation);
        settingsCache$updateConfigValue$2.L$0 = obj;
        return settingsCache$updateConfigValue$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C0257b c0257b, Continuation<? super Unit> continuation) {
        return ((SettingsCache$updateConfigValue$2) create(c0257b, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        C0257b c0257b = (C0257b) this.L$0;
        Object obj2 = this.$value;
        if (obj2 != null) {
            C0260e key = this.$key;
            c0257b.getClass();
            Intrinsics.checkNotNullParameter(key, "key");
            c0257b.c(key, obj2);
        } else {
            C0260e key2 = this.$key;
            c0257b.getClass();
            Intrinsics.checkNotNullParameter(key2, "key");
            c0257b.b();
            c0257b.f4153a.remove(key2);
        }
        this.this$0.updateSessionConfigs(c0257b);
        return Unit.INSTANCE;
    }
}
