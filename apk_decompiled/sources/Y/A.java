package Y;

import java.io.FileInputStream;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: classes.dex */
public final class A extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public F f2027a;

    /* renamed from: b, reason: collision with root package name */
    public FileInputStream f2028b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f2029c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ F f2030d;

    /* renamed from: e, reason: collision with root package name */
    public int f2031e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(F f2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f2030d = f2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f2029c = obj;
        this.f2031e |= IntCompanionObject.MIN_VALUE;
        return this.f2030d.h(this);
    }
}
