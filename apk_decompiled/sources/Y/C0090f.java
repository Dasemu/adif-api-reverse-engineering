package Y;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: Y.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0090f extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public Iterator f2073a;

    /* renamed from: b, reason: collision with root package name */
    public Object f2074b;

    /* renamed from: c, reason: collision with root package name */
    public int f2075c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f2076d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List f2077e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ArrayList f2078f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0090f(List list, ArrayList arrayList, Continuation continuation) {
        super(2, continuation);
        this.f2077e = list;
        this.f2078f = arrayList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C0090f c0090f = new C0090f(this.f2077e, this.f2078f, continuation);
        c0090f.f2076d = obj;
        return c0090f;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0090f) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        List list;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f2075c;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            obj = this.f2076d;
            it = this.f2077e.iterator();
            list = this.f2078f;
        } else if (i == 1) {
            Object obj2 = this.f2074b;
            Iterator it2 = this.f2073a;
            List list2 = (List) this.f2076d;
            ResultKt.throwOnFailure(obj);
            if (((Boolean) obj).booleanValue()) {
                list2.add(new SuspendLambda(1, null));
                this.f2076d = list2;
                this.f2073a = it2;
                this.f2074b = null;
                this.f2075c = 2;
                throw null;
            }
            obj = obj2;
            it = it2;
            list = list2;
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = this.f2073a;
            list = (List) this.f2076d;
            ResultKt.throwOnFailure(obj);
        }
        if (!it.hasNext()) {
            return obj;
        }
        if (it.next() != null) {
            throw new ClassCastException();
        }
        this.f2076d = list;
        this.f2073a = it;
        this.f2074b = obj;
        this.f2075c = 1;
        throw null;
    }
}
