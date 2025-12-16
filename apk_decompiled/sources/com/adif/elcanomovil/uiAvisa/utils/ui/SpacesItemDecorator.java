package com.adif.elcanomovil.uiAvisa.utils.ui;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.AbstractC0232n0;
import androidx.recyclerview.widget.E0;
import androidx.recyclerview.widget.I0;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u0012\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/adif/elcanomovil/uiAvisa/utils/ui/SpacesItemDecorator;", "Landroidx/recyclerview/widget/n0;", "", "spanCount", "spacing", "", "includeEdge", "<init>", "(IIZ)V", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/E0;", RemoteConfigConstants.ResponseFieldKey.STATE, "", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/E0;)V", "I", "Z", "ui-avisa_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SpacesItemDecorator extends AbstractC0232n0 {
    private final boolean includeEdge;
    private final int spacing;
    private final int spanCount;

    public SpacesItemDecorator(int i, int i4, boolean z3) {
        this.spanCount = i;
        this.spacing = i4;
        this.includeEdge = z3;
    }

    @Override // androidx.recyclerview.widget.AbstractC0232n0
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, E0 state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        parent.getClass();
        I0 N3 = RecyclerView.N(view);
        int absoluteAdapterPosition = N3 != null ? N3.getAbsoluteAdapterPosition() : -1;
        int i = this.spanCount;
        int i4 = absoluteAdapterPosition % i;
        if (this.includeEdge) {
            int i5 = this.spacing;
            outRect.left = i5 - ((i4 * i5) / i);
            outRect.right = ((i4 + 1) * i5) / i;
            if (absoluteAdapterPosition < i) {
                outRect.top = i5;
            }
            outRect.bottom = i5;
            return;
        }
        int i6 = this.spacing;
        outRect.left = (i4 * i6) / i;
        outRect.right = i6 - (((i4 + 1) * i6) / i);
        if (absoluteAdapterPosition >= i) {
            outRect.top = i6;
        }
    }
}
