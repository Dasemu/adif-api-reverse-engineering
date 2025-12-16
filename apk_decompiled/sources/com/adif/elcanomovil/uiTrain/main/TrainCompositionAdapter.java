package com.adif.elcanomovil.uiTrain.main;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.AbstractC0220h0;
import androidx.recyclerview.widget.AbstractC0238q0;
import androidx.recyclerview.widget.I0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.v0;
import com.adif.elcanomovil.domain.entities.compositions.Wagon;
import com.adif.elcanomovil.uiTrain.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0019\u001a\u00020\b2\b\b\u0001\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/adif/elcanomovil/uiTrain/main/TrainCompositionAdapter;", "Landroidx/recyclerview/widget/h0;", "Landroidx/recyclerview/widget/I0;", "<init>", "()V", "", "Lcom/adif/elcanomovil/domain/entities/compositions/Wagon;", FirebaseAnalytics.Param.ITEMS, "", "update", "(Ljava/util/List;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/I0;", "getItemCount", "()I", "holder", "position", "onBindViewHolder", "(Landroidx/recyclerview/widget/I0;I)V", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "onAttachedToRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "Ljava/util/List;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "linearLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "ui-train_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TrainCompositionAdapter extends AbstractC0220h0 {
    private List<? extends Wagon> items = new ArrayList();
    private LinearLayoutManager linearLayoutManager;

    @Override // androidx.recyclerview.widget.AbstractC0220h0
    public int getItemCount() {
        return this.items.size();
    }

    @Override // androidx.recyclerview.widget.AbstractC0220h0
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        final AbstractC0238q0 layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            this.linearLayoutManager = (LinearLayoutManager) layoutManager;
            recyclerView.k(new v0() { // from class: com.adif.elcanomovil.uiTrain.main.TrainCompositionAdapter$onAttachedToRecyclerView$1
                @Override // androidx.recyclerview.widget.v0
                public void onScrollStateChanged(RecyclerView recyclerView2, int newState) {
                    Intrinsics.checkNotNullParameter(recyclerView2, "recyclerView");
                }

                @Override // androidx.recyclerview.widget.v0
                public void onScrolled(RecyclerView recyclerView2, int dx, int dy) {
                    Intrinsics.checkNotNullParameter(recyclerView2, "recyclerView");
                    LinearLayoutManager linearLayoutManager = (LinearLayoutManager) AbstractC0238q0.this;
                    View V02 = linearLayoutManager.V0(0, linearLayoutManager.v(), true, false);
                    int L3 = V02 == null ? -1 : AbstractC0238q0.L(V02);
                    LinearLayoutManager linearLayoutManager2 = (LinearLayoutManager) AbstractC0238q0.this;
                    View V03 = linearLayoutManager2.V0(linearLayoutManager2.v() - 1, -1, true, false);
                    int L4 = V03 != null ? AbstractC0238q0.L(V03) : -1;
                    if (L3 > L4) {
                        return;
                    }
                    while (true) {
                        View q4 = ((LinearLayoutManager) AbstractC0238q0.this).q(L3);
                        if (q4 != null) {
                            q4.setAlpha(1.0f);
                        }
                        if (L3 == L4) {
                            return;
                        } else {
                            L3++;
                        }
                    }
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC0220h0
    public void onBindViewHolder(I0 holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ((WagonHolder) holder).bind(this.items.get(position), this.items, position);
    }

    @Override // androidx.recyclerview.widget.AbstractC0220h0
    public I0 onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_train_wagon, parent, false);
        Intrinsics.checkNotNull(inflate);
        return new WagonHolder(inflate);
    }

    public final void update(List<? extends Wagon> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.items = items;
        notifyDataSetChanged();
    }
}
