package com.adif.elcanomovil.uiDialog.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.AbstractC0220h0;
import androidx.recyclerview.widget.I0;
import com.adif.elcanomovil.uiDialog.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/adif/elcanomovil/uiDialog/adapters/SingleLogoAdapter;", "Landroidx/recyclerview/widget/h0;", "Landroidx/recyclerview/widget/I0;", "<init>", "()V", "", "", FirebaseAnalytics.Param.ITEMS, "", "update", "(Ljava/util/List;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/I0;", "getItemCount", "()I", "holder", "position", "onBindViewHolder", "(Landroidx/recyclerview/widget/I0;I)V", "Ljava/util/List;", "ui-dialog_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SingleLogoAdapter extends AbstractC0220h0 {
    private List<String> items = new ArrayList();

    @Override // androidx.recyclerview.widget.AbstractC0220h0
    public int getItemCount() {
        return this.items.size();
    }

    @Override // androidx.recyclerview.widget.AbstractC0220h0
    public void onBindViewHolder(I0 holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder instanceof SingleLogoViewHolder) {
            ((SingleLogoViewHolder) holder).bind(this.items.get(position));
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC0220h0
    public I0 onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_single_logo, parent, false);
        Intrinsics.checkNotNull(inflate);
        return new SingleLogoViewHolder(inflate);
    }

    public final void update(List<String> items) {
        if (items != null) {
            this.items = items;
            notifyDataSetChanged();
        }
    }
}
