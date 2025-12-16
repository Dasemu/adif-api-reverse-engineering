package o0;

import android.os.Bundle;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* renamed from: o0.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0541s extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ref.BooleanRef f8029a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC0544v f8030b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ E f8031c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Bundle f8032d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0541s(Ref.BooleanRef booleanRef, AbstractC0544v abstractC0544v, E e4, Bundle bundle) {
        super(1);
        this.f8029a = booleanRef;
        this.f8030b = abstractC0544v;
        this.f8031c = e4;
        this.f8032d = bundle;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C0537n it = (C0537n) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        this.f8029a.element = true;
        List emptyList = CollectionsKt.emptyList();
        this.f8030b.a(this.f8031c, this.f8032d, it, emptyList);
        return Unit.INSTANCE;
    }
}
