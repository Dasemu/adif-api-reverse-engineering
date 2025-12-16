package com.adif.elcanomovil.uiMoreAdif.help;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.AbstractC0220h0;
import androidx.recyclerview.widget.I0;
import com.adif.elcanomovil.uiMoreAdif.HelpItem;
import com.adif.elcanomovil.uiMoreAdif.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/adif/elcanomovil/uiMoreAdif/help/HelpAdapter;", "Landroidx/recyclerview/widget/h0;", "Landroidx/recyclerview/widget/I0;", "", "Lcom/adif/elcanomovil/uiMoreAdif/HelpItem;", FirebaseAnalytics.Param.ITEMS, "<init>", "(Ljava/util/List;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/I0;", "getItemCount", "()I", "holder", "position", "", "onBindViewHolder", "(Landroidx/recyclerview/widget/I0;I)V", "Ljava/util/List;", "com/adif/elcanomovil/uiMoreAdif/help/a", "ui-more-adif_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class HelpAdapter extends AbstractC0220h0 {
    private final List<HelpItem> items;

    public HelpAdapter(List<HelpItem> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.items = items;
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
            HelpItem item = this.items.get(position);
            aVar.getClass();
            Intrinsics.checkNotNullParameter(item, "item");
            ((TextView) aVar.itemView.findViewById(R.id.title)).setText(aVar.itemView.getContext().getString(item.getType().getTitle()));
            ((ImageView) aVar.itemView.findViewById(R.id.icon)).setImageResource(item.getIcon());
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC0220h0
    public I0 onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_explanations, parent, false);
        Intrinsics.checkNotNull(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        return new I0(itemView);
    }
}
