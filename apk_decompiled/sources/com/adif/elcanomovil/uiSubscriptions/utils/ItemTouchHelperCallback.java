package com.adif.elcanomovil.uiSubscriptions.utils;

import androidx.recyclerview.widget.I0;
import androidx.recyclerview.widget.K;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0011\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0017\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/adif/elcanomovil/uiSubscriptions/utils/ItemTouchHelperCallback;", "Landroidx/recyclerview/widget/K;", "Lcom/adif/elcanomovil/uiSubscriptions/utils/ItemTouchHelperListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Lcom/adif/elcanomovil/uiSubscriptions/utils/ItemTouchHelperListener;)V", "", "isLongPressDragEnabled", "()Z", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroidx/recyclerview/widget/I0;", "viewHolder", "", "getMovementFlags", "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/I0;)I", "target", "onMove", "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/I0;Landroidx/recyclerview/widget/I0;)Z", "direction", "", "onSwiped", "(Landroidx/recyclerview/widget/I0;I)V", "isItemViewSwipeEnabled", "Lcom/adif/elcanomovil/uiSubscriptions/utils/ItemTouchHelperListener;", "ui-subscriptions_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ItemTouchHelperCallback extends K {
    private final ItemTouchHelperListener listener;

    public ItemTouchHelperCallback(ItemTouchHelperListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.listener = listener;
    }

    @Override // androidx.recyclerview.widget.K
    public int getMovementFlags(RecyclerView recyclerView, I0 viewHolder) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        return K.makeMovementFlags(3, 48);
    }

    @Override // androidx.recyclerview.widget.K
    public boolean isItemViewSwipeEnabled() {
        return true;
    }

    @Override // androidx.recyclerview.widget.K
    public boolean isLongPressDragEnabled() {
        return false;
    }

    public boolean onMove(RecyclerView recyclerView, I0 viewHolder, I0 target) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(target, "target");
        return this.listener.onItemMove(recyclerView, viewHolder.getAdapterPosition(), target.getAdapterPosition());
    }

    @Override // androidx.recyclerview.widget.K
    public void onSwiped(I0 viewHolder, int direction) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        this.listener.onItemDismiss(viewHolder, viewHolder.getAdapterPosition());
    }
}
