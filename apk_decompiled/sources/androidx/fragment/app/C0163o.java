package androidx.fragment.app;

import a.AbstractC0105a;
import android.view.ViewGroup;
import e3.C0315a;
import e3.C0322h;
import e3.C0332s;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: androidx.fragment.app.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0163o extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3192a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3193b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3194c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f3195d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0163o(Object obj, Object obj2, Object obj3, int i) {
        super(0);
        this.f3192a = i;
        this.f3193b = obj;
        this.f3194c = obj2;
        this.f3195d = obj3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int collectionSizeOrDefault;
        List i;
        switch (this.f3192a) {
            case 0:
                ((C0167q) this.f3193b).f3211f.e((ViewGroup) this.f3194c, this.f3195d);
                return Unit.INSTANCE;
            case 1:
                AbstractC0105a abstractC0105a = ((C0322h) this.f3193b).f6348b;
                List list = (List) this.f3194c;
                if (abstractC0105a != null && (i = abstractC0105a.i((String) this.f3195d, list)) != null) {
                    list = i;
                }
                List<Certificate> list2 = list;
                collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
                ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
                for (Certificate certificate : list2) {
                    Intrinsics.checkNotNull(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    arrayList.add((X509Certificate) certificate);
                }
                return arrayList;
            default:
                AbstractC0105a abstractC0105a2 = ((C0322h) this.f3193b).f6348b;
                Intrinsics.checkNotNull(abstractC0105a2);
                return abstractC0105a2.i(((C0315a) this.f3195d).h.f6416d, ((C0332s) this.f3194c).a());
        }
    }
}
