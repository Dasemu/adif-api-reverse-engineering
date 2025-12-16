package com.adif.elcanomovil.uiSubscriptions.home;

import android.content.Context;
import androidx.recyclerview.widget.I0;
import com.adif.elcanomovil.uiSubscriptions.adapters.SubscriptionAdapter;
import com.adif.elcanomovil.uiSubscriptions.utils.SwipeToDeleteCallback;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/adif/elcanomovil/uiSubscriptions/home/SubscriptionHomeFragment$prepareRecycler$swipeHandler$1", "Lcom/adif/elcanomovil/uiSubscriptions/utils/SwipeToDeleteCallback;", "Landroidx/recyclerview/widget/I0;", "viewHolder", "", "direction", "", "onSwiped", "(Landroidx/recyclerview/widget/I0;I)V", "ui-subscriptions_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SubscriptionHomeFragment$prepareRecycler$swipeHandler$1 extends SwipeToDeleteCallback {
    final /* synthetic */ SubscriptionHomeFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriptionHomeFragment$prepareRecycler$swipeHandler$1(SubscriptionHomeFragment subscriptionHomeFragment, Context context) {
        super(context);
        this.this$0 = subscriptionHomeFragment;
        Intrinsics.checkNotNull(context);
    }

    @Override // androidx.recyclerview.widget.K
    public void onSwiped(I0 viewHolder, int direction) {
        SubscriptionAdapter subscriptionAdapter;
        int i;
        SubscriptionHomeViewModel viewModel;
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        this.this$0.position = viewHolder.getAdapterPosition();
        subscriptionAdapter = this.this$0.adapter;
        if (subscriptionAdapter != null) {
            i = this.this$0.position;
            int itemIdAt = subscriptionAdapter.itemIdAt(i);
            viewModel = this.this$0.getViewModel();
            viewModel.deleteSubscription(itemIdAt);
        }
    }
}
