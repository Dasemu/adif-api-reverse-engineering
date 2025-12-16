package androidx.room;

import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelIterator;

/* loaded from: classes.dex */
public final class c extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public ChannelIterator f3952a;

    /* renamed from: b, reason: collision with root package name */
    public int f3953b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u f3954c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ F.i f3955d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Channel f3956e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Callable f3957f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Channel f3958g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(u uVar, F.i iVar, Channel channel, Callable callable, Channel channel2, Continuation continuation) {
        super(2, continuation);
        this.f3954c = uVar;
        this.f3955d = iVar;
        this.f3956e = channel;
        this.f3957f = callable;
        this.f3958g = channel2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new c(this.f3954c, this.f3955d, this.f3956e, this.f3957f, this.f3958g, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0166, code lost:
    
        if (r6.send(r3, r17) == r2) goto L63;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0152 A[Catch: all -> 0x001e, TRY_LEAVE, TryCatch #2 {all -> 0x001e, blocks: (B:7:0x0016, B:9:0x013e, B:14:0x014a, B:16:0x0152, B:24:0x002b, B:74:0x0138), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0169  */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [int] */
    /* JADX WARN: Type inference failed for: r9v5, types: [boolean] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0166 -> B:9:0x013e). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
