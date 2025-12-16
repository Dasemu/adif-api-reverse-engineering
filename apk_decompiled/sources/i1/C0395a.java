package i1;

import com.adif.elcanomovil.domain.entities.utils.SyncResultKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: i1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0395a extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f6813a;

    /* renamed from: b, reason: collision with root package name */
    public int f6814b;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f6813a = obj;
        this.f6814b |= IntCompanionObject.MIN_VALUE;
        return SyncResultKt.mapResult(null, null, this);
    }
}
