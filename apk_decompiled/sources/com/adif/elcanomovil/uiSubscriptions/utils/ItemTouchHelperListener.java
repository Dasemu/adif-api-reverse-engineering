package com.adif.elcanomovil.uiSubscriptions.utils;

import androidx.recyclerview.widget.I0;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H&¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004H&¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/adif/elcanomovil/uiSubscriptions/utils/ItemTouchHelperListener;", "", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "fromPosition", "toPosition", "", "onItemMove", "(Landroidx/recyclerview/widget/RecyclerView;II)Z", "Landroidx/recyclerview/widget/I0;", "viewHolder", "position", "", "onItemDismiss", "(Landroidx/recyclerview/widget/I0;I)V", "ui-subscriptions_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface ItemTouchHelperListener {
    void onItemDismiss(I0 viewHolder, int position);

    boolean onItemMove(RecyclerView recyclerView, int fromPosition, int toPosition);
}
