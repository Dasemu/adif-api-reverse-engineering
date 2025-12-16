package com.adif.elcanomovil.uiDepartures.adapters;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.adif.elcanomovil.commonNavGraph.arguments.Observation;
import com.adif.elcanomovil.commonNavGraph.arguments.ObservationType;
import com.adif.elcanomovil.uiDepartures.R;
import com.adif.elcanomovil.uiDepartures.databinding.ItemBottomSheetObservationsBinding;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b¢\u0006\u0002\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0006H\u0002J$\u0010\r\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\"\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/adif/elcanomovil/uiDepartures/adapters/ObservationAdapter;", "Landroid/widget/ArrayAdapter;", "Lcom/adif/elcanomovil/commonNavGraph/arguments/Observation;", "context", "Landroid/content/Context;", "layoutResource", "", FirebaseAnalytics.Param.ITEMS, "", "(Landroid/content/Context;ILjava/util/List;)V", "createViewFromResource", "Landroid/view/View;", "position", "getDropDownView", "convertView", "parent", "Landroid/view/ViewGroup;", "getView", "ui-departures_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ObservationAdapter extends ArrayAdapter<Observation> {
    private final List<Observation> items;
    private final int layoutResource;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ObservationType.values().length];
            try {
                iArr[ObservationType.IS_WARNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ObservationType.IS_INFO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ObservationAdapter(Context context, int i, List<Observation> items) {
        super(context, i, items);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(items, "items");
        this.layoutResource = i;
        this.items = items;
    }

    private final View createViewFromResource(int position) {
        int i;
        ItemBottomSheetObservationsBinding inflate = ItemBottomSheetObservationsBinding.inflate(LayoutInflater.from(getContext()));
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        Observation observation = this.items.get(position);
        Context context = getContext();
        int i4 = WhenMappings.$EnumSwitchMapping$0[observation.isWarning().ordinal()];
        if (i4 == 1) {
            i = R.color.colorPrimary;
        } else {
            if (i4 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = R.color.white;
        }
        int color = context.getColor(i);
        TextView textView = inflate.observationsBottomsheetItemText;
        TextView textView2 = inflate.observationsBottomsheetItemStation;
        textView2.setText(observation.getStationName());
        textView2.setTextColor(color);
        TextView textView3 = inflate.observationsBottomsheetItemText;
        textView3.setText(observation.getMessage());
        textView3.setTextColor(color);
        inflate.observationsIconType.setImageTintList(ColorStateList.valueOf(color));
        ConstraintLayout root = inflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        return createViewFromResource(position);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return createViewFromResource(position);
    }
}
