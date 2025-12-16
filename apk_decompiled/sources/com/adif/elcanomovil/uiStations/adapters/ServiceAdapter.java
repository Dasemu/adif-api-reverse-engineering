package com.adif.elcanomovil.uiStations.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.AbstractC0220h0;
import androidx.recyclerview.widget.I0;
import com.adif.elcanomovil.uiStations.R;
import com.adif.elcanomovil.uiStations.entities.Services;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B.\u0012%\u0010\n\u001a!\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003j\u0002`\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000f\u001a\u00020\b2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR3\u0010\n\u001a!\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003j\u0002`\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001dR\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/adif/elcanomovil/uiStations/adapters/ServiceAdapter;", "Landroidx/recyclerview/widget/h0;", "Landroidx/recyclerview/widget/I0;", "Lkotlin/Function1;", "Lcom/adif/elcanomovil/uiStations/entities/Services;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "service", "", "Lcom/adif/elcanomovil/uiStations/adapters/OnServiceTap;", "onServiceTap", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "", FirebaseAnalytics.Param.ITEMS, "update", "(Ljava/util/List;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/I0;", "getItemCount", "()I", "holder", "position", "onBindViewHolder", "(Landroidx/recyclerview/widget/I0;I)V", "Lkotlin/jvm/functions/Function1;", "Ljava/util/List;", "ui-stations_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ServiceAdapter extends AbstractC0220h0 {
    private List<Services> items;
    private final Function1<Services, Unit> onServiceTap;

    /* JADX WARN: Multi-variable type inference failed */
    public ServiceAdapter(Function1<? super Services, Unit> onServiceTap) {
        Intrinsics.checkNotNullParameter(onServiceTap, "onServiceTap");
        this.onServiceTap = onServiceTap;
        this.items = new ArrayList();
    }

    @Override // androidx.recyclerview.widget.AbstractC0220h0
    public int getItemCount() {
        return this.items.size();
    }

    @Override // androidx.recyclerview.widget.AbstractC0220h0
    public void onBindViewHolder(I0 holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder instanceof OneStationViewHolder) {
            ((OneStationViewHolder) holder).bind(this.items.get(position), this.onServiceTap);
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC0220h0
    public I0 onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_stations_page_services, parent, false);
        Intrinsics.checkNotNull(inflate);
        return new OneStationViewHolder(inflate);
    }

    public final void update(List<Services> items) {
        if (items != null) {
            this.items = items;
            notifyDataSetChanged();
        }
    }
}
