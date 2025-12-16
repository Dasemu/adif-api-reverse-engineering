package com.adif.elcanomovil.commonViews.extensions;

import D.h;
import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.C0246x;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"setDivider", "", "Landroidx/recyclerview/widget/RecyclerView;", "drawableRes", "", "common-views_proNon_corporateRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RecyclerViewKt {
    public static final void setDivider(RecyclerView recyclerView, int i) {
        Intrinsics.checkNotNullParameter(recyclerView, "<this>");
        C0246x c0246x = new C0246x(recyclerView.getContext());
        Drawable drawable = h.getDrawable(recyclerView.getContext(), i);
        if (drawable != null) {
            c0246x.f3928a = drawable;
            recyclerView.i(c0246x);
        }
    }
}
