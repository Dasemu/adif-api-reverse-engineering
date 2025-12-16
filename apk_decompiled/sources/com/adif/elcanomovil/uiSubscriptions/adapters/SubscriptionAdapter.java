package com.adif.elcanomovil.uiSubscriptions.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.AbstractC0220h0;
import androidx.recyclerview.widget.I0;
import com.adif.elcanomovil.domain.entities.subscription.Subscription;
import com.adif.elcanomovil.uiSubscriptions.R;
import com.adif.elcanomovil.uiSubscriptions.viewholder.SubscriptionViewHolder;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0011\n\u0002\u0010!\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u001e\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0005j\u0002`\t¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001c\u001a\u00020\b2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u0007¢\u0006\u0004\b\u001c\u0010\u001fJ\u0017\u0010 \u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u000fH\u0016¢\u0006\u0004\b \u0010!J\u0015\u0010\"\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u000f¢\u0006\u0004\b\"\u0010#J\u0015\u0010$\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u000f¢\u0006\u0004\b$\u0010!J\u0015\u0010&\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020\u0007¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010(R/\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0005j\u0002`\t8\u0006¢\u0006\f\n\u0004\b\n\u0010)\u001a\u0004\b*\u0010+R\u001c\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00070,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u001e\u001a\u00020\u000f8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001e\u0010/¨\u00060"}, d2 = {"Lcom/adif/elcanomovil/uiSubscriptions/adapters/SubscriptionAdapter;", "Landroidx/recyclerview/widget/h0;", "Landroidx/recyclerview/widget/I0;", "Landroid/content/Context;", "context", "Lkotlin/Function2;", "Lcom/adif/elcanomovil/uiSubscriptions/adapters/SubscriptionsEvents;", "Lcom/adif/elcanomovil/domain/entities/subscription/Subscription;", "", "Lcom/adif/elcanomovil/uiSubscriptions/adapters/SubscriptionListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Landroid/content/Context;Lkotlin/jvm/functions/Function2;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lcom/adif/elcanomovil/uiSubscriptions/viewholder/SubscriptionViewHolder;", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lcom/adif/elcanomovil/uiSubscriptions/viewholder/SubscriptionViewHolder;", "getItemCount", "()I", "holder", "position", "onBindViewHolder", "(Landroidx/recyclerview/widget/I0;I)V", "", FirebaseAnalytics.Param.ITEMS, "update", "(Ljava/util/List;)V", "item", "(Lcom/adif/elcanomovil/domain/entities/subscription/Subscription;)V", "getItemViewType", "(I)I", "removeAt", "(I)V", "itemIdAt", "subscription", "itemPosition", "(Lcom/adif/elcanomovil/domain/entities/subscription/Subscription;)I", "Landroid/content/Context;", "Lkotlin/jvm/functions/Function2;", "getListener", "()Lkotlin/jvm/functions/Function2;", "", "itemsList", "Ljava/util/List;", "I", "ui-subscriptions_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SubscriptionAdapter extends AbstractC0220h0 {
    private final Context context;
    private final int item;
    private List<Subscription> itemsList;
    private final Function2<SubscriptionsEvents, Subscription, Unit> listener;

    /* JADX WARN: Multi-variable type inference failed */
    public SubscriptionAdapter(Context context, Function2<? super SubscriptionsEvents, ? super Subscription, Unit> listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.context = context;
        this.listener = listener;
        this.itemsList = new ArrayList();
        this.item = 1;
    }

    @Override // androidx.recyclerview.widget.AbstractC0220h0
    public int getItemCount() {
        return this.itemsList.size();
    }

    @Override // androidx.recyclerview.widget.AbstractC0220h0
    public int getItemViewType(int position) {
        return this.item;
    }

    public final Function2<SubscriptionsEvents, Subscription, Unit> getListener() {
        return this.listener;
    }

    public final int itemIdAt(int position) {
        return this.itemsList.get(position).getId();
    }

    public final int itemPosition(Subscription subscription) {
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        return this.itemsList.indexOf(subscription);
    }

    @Override // androidx.recyclerview.widget.AbstractC0220h0
    public void onBindViewHolder(I0 holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (!(holder instanceof SubscriptionViewHolder) || this.itemsList.size() <= position) {
            return;
        }
        ((SubscriptionViewHolder) holder).bind(this.context, this.itemsList.get(position), this.listener);
    }

    public final void removeAt(int position) {
        this.itemsList.remove(position);
        notifyItemRemoved(position);
    }

    public final void update(List<Subscription> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.itemsList = CollectionsKt.toMutableList((Collection) items);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.AbstractC0220h0
    public SubscriptionViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View inflate = LayoutInflater.from(this.context).inflate(R.layout.item_subscription, parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return new SubscriptionViewHolder(inflate);
    }

    public final void update(Subscription item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.itemsList.add(item);
        notifyItemChanged(this.itemsList.size() - 1);
    }
}
