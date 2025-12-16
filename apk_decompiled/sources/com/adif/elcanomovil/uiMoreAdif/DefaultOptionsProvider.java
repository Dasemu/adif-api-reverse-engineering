package com.adif.elcanomovil.uiMoreAdif;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/adif/elcanomovil/uiMoreAdif/DefaultOptionsProvider;", "Lcom/adif/elcanomovil/uiMoreAdif/OptionsProvider;", "()V", FirebaseAnalytics.Param.ITEMS, "", "Lcom/adif/elcanomovil/uiMoreAdif/MoreItem;", "getItems", "()Ljava/util/List;", "items$delegate", "Lkotlin/Lazy;", "ui-more-adif_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DefaultOptionsProvider implements OptionsProvider {

    /* renamed from: items$delegate, reason: from kotlin metadata */
    private final Lazy items = LazyKt.lazy(b.f5167a);

    @Override // com.adif.elcanomovil.uiMoreAdif.OptionsProvider
    public List<MoreItem> getItems() {
        return (List) this.items.getValue();
    }
}
