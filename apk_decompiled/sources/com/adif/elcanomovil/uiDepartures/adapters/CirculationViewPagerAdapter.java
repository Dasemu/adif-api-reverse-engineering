package com.adif.elcanomovil.uiDepartures.adapters;

import android.os.Bundle;
import androidx.fragment.app.K;
import androidx.viewpager2.adapter.f;
import com.adif.elcanomovil.uiDepartures.main.oneway.CirculationsFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/adif/elcanomovil/uiDepartures/adapters/CirculationViewPagerAdapter;", "Landroidx/viewpager2/adapter/f;", "Landroidx/fragment/app/K;", "fragment", "<init>", "(Landroidx/fragment/app/K;)V", "", "getItemCount", "()I", "position", "createFragment", "(I)Landroidx/fragment/app/K;", "ui-departures_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CirculationViewPagerAdapter extends f {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CirculationViewPagerAdapter(K fragment) {
        super(fragment);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
    }

    @Override // androidx.viewpager2.adapter.f
    public K createFragment(int position) {
        CirculationsFragment circulationsFragment = new CirculationsFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("arg_tabPosition", position);
        circulationsFragment.setArguments(bundle);
        return circulationsFragment;
    }

    @Override // androidx.recyclerview.widget.AbstractC0220h0
    public int getItemCount() {
        return 3;
    }
}
