package Y;

import java.io.File;
import java.io.FileOutputStream;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: classes.dex */
public final class E extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public F f2046a;

    /* renamed from: b, reason: collision with root package name */
    public File f2047b;

    /* renamed from: c, reason: collision with root package name */
    public FileOutputStream f2048c;

    /* renamed from: d, reason: collision with root package name */
    public FileOutputStream f2049d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f2050e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ F f2051f;

    /* renamed from: g, reason: collision with root package name */
    public int f2052g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(F f2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f2051f = f2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f2050e = obj;
        this.f2052g |= IntCompanionObject.MIN_VALUE;
        return this.f2051f.k(null, this);
    }
}
