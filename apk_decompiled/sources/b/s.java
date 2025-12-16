package b;

import java.util.ListIterator;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class s extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4134a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ B f4135b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(B b4, int i) {
        super(1);
        this.f4134a = i;
        this.f4135b = b4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object obj2;
        Object obj3;
        switch (this.f4134a) {
            case 0:
                C0253b backEvent = (C0253b) obj;
                Intrinsics.checkNotNullParameter(backEvent, "backEvent");
                B b4 = this.f4135b;
                ArrayDeque arrayDeque = b4.f4097b;
                ListIterator<E> listIterator = arrayDeque.listIterator(arrayDeque.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        obj2 = listIterator.previous();
                        if (((r) obj2).isEnabled()) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                r rVar = (r) obj2;
                if (b4.f4098c != null) {
                    b4.c();
                }
                b4.f4098c = rVar;
                if (rVar != null) {
                    rVar.handleOnBackStarted(backEvent);
                }
                return Unit.INSTANCE;
            default:
                C0253b backEvent2 = (C0253b) obj;
                Intrinsics.checkNotNullParameter(backEvent2, "backEvent");
                B b5 = this.f4135b;
                r rVar2 = b5.f4098c;
                if (rVar2 == null) {
                    ArrayDeque arrayDeque2 = b5.f4097b;
                    ListIterator<E> listIterator2 = arrayDeque2.listIterator(arrayDeque2.size());
                    while (true) {
                        if (listIterator2.hasPrevious()) {
                            obj3 = listIterator2.previous();
                            if (((r) obj3).isEnabled()) {
                            }
                        } else {
                            obj3 = null;
                        }
                    }
                    rVar2 = (r) obj3;
                }
                if (rVar2 != null) {
                    rVar2.handleOnBackProgressed(backEvent2);
                }
                return Unit.INSTANCE;
        }
    }
}
