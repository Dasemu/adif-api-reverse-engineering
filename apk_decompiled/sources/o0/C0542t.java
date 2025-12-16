package o0;

import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* renamed from: o0.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0542t extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ref.BooleanRef f8033a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ref.BooleanRef f8034b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC0544v f8035c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f8036d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ArrayDeque f8037e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0542t(Ref.BooleanRef booleanRef, Ref.BooleanRef booleanRef2, AbstractC0544v abstractC0544v, boolean z3, ArrayDeque arrayDeque) {
        super(1);
        this.f8033a = booleanRef;
        this.f8034b = booleanRef2;
        this.f8035c = abstractC0544v;
        this.f8036d = z3;
        this.f8037e = arrayDeque;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C0537n entry = (C0537n) obj;
        Intrinsics.checkNotNullParameter(entry, "entry");
        this.f8033a.element = true;
        this.f8034b.element = true;
        this.f8035c.s(entry, this.f8036d, this.f8037e);
        return Unit.INSTANCE;
    }
}
