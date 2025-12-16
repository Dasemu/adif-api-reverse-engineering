package com.adif.elcanomovil.uiMoreAdif.main;

import G2.l;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.AbstractC0220h0;
import androidx.recyclerview.widget.I0;
import com.adif.elcanomovil.uiMoreAdif.MoreActions;
import com.adif.elcanomovil.uiMoreAdif.MoreItem;
import com.adif.elcanomovil.uiMoreAdif.R;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB)\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/adif/elcanomovil/uiMoreAdif/main/MoreAdifAdapter;", "Landroidx/recyclerview/widget/h0;", "Landroidx/recyclerview/widget/I0;", "", "Lcom/adif/elcanomovil/uiMoreAdif/MoreItem;", FirebaseAnalytics.Param.ITEMS, "Lkotlin/Function1;", "Lcom/adif/elcanomovil/uiMoreAdif/MoreActions;", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/I0;", "getItemCount", "()I", "holder", "position", "onBindViewHolder", "(Landroidx/recyclerview/widget/I0;I)V", "Ljava/util/List;", "Lkotlin/jvm/functions/Function1;", "com/adif/elcanomovil/uiMoreAdif/main/a", "ui-more-adif_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MoreAdifAdapter extends AbstractC0220h0 {
    private final List<MoreItem> items;
    private final Function1<MoreActions, Unit> listener;

    /* JADX WARN: Multi-variable type inference failed */
    public MoreAdifAdapter(List<MoreItem> items, Function1<? super MoreActions, Unit> listener) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.items = items;
        this.listener = listener;
    }

    @Override // androidx.recyclerview.widget.AbstractC0220h0
    public int getItemCount() {
        return this.items.size();
    }

    @Override // androidx.recyclerview.widget.AbstractC0220h0
    public void onBindViewHolder(I0 holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder instanceof a) {
            a aVar = (a) holder;
            MoreItem item = this.items.get(position);
            Function1<MoreActions, Unit> listener = this.listener;
            aVar.getClass();
            Intrinsics.checkNotNullParameter(item, "item");
            Intrinsics.checkNotNullParameter(listener, "listener");
            ((TextView) aVar.itemView.findViewById(R.id.title)).setText(aVar.itemView.getContext().getString(item.getType().getTitle()));
            ((ImageView) aVar.itemView.findViewById(R.id.icon)).setImageResource(item.getIcon());
            aVar.itemView.setOnClickListener(new l(6, listener, item));
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC0220h0
    public I0 onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_option, parent, false);
        Intrinsics.checkNotNull(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        return new I0(itemView);
    }
}
