package o0;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* renamed from: o0.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0543u extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ref.BooleanRef f8038a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f8039b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Ref.IntRef f8040c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractC0544v f8041d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Bundle f8042e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0543u(Ref.BooleanRef booleanRef, ArrayList arrayList, Ref.IntRef intRef, AbstractC0544v abstractC0544v, Bundle bundle) {
        super(1);
        this.f8038a = booleanRef;
        this.f8039b = arrayList;
        this.f8040c = intRef;
        this.f8041d = abstractC0544v;
        this.f8042e = bundle;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List emptyList;
        C0537n entry = (C0537n) obj;
        Intrinsics.checkNotNullParameter(entry, "entry");
        this.f8038a.element = true;
        ArrayList arrayList = this.f8039b;
        int indexOf = arrayList.indexOf(entry);
        if (indexOf != -1) {
            Ref.IntRef intRef = this.f8040c;
            int i = indexOf + 1;
            emptyList = arrayList.subList(intRef.element, i);
            intRef.element = i;
        } else {
            emptyList = CollectionsKt.emptyList();
        }
        this.f8041d.a(entry.f8006b, this.f8042e, entry, emptyList);
        return Unit.INSTANCE;
    }
}
