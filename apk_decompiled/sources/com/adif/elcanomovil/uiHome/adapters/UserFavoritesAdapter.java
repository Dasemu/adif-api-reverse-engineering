package com.adif.elcanomovil.uiHome.adapters;

import F.j;
import F.q;
import G1.b;
import G1.c;
import a.AbstractC0105a;
import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.AbstractC0220h0;
import androidx.recyclerview.widget.I0;
import com.adif.elcanomovil.commonViews.databinding.ViewStationOptionBinding;
import com.adif.elcanomovil.commonViews.databinding.ViewTrainOptionBinding;
import com.adif.elcanomovil.domain.entities.DataType;
import com.adif.elcanomovil.uiHome.R;
import com.adif.elcanomovil.uiHome.data.UserFavoriteVO;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt__StringsKt;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\"#B7\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\u0002`\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001cR&\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\u0002`\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001dR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u00108\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u00108\u0002X\u0082D¢\u0006\u0006\n\u0004\b!\u0010 ¨\u0006$"}, d2 = {"Lcom/adif/elcanomovil/uiHome/adapters/UserFavoritesAdapter;", "Landroidx/recyclerview/widget/h0;", "Landroidx/recyclerview/widget/I0;", "", "Lcom/adif/elcanomovil/uiHome/data/UserFavoriteVO;", FirebaseAnalytics.Param.ITEMS, "Lkotlin/Function1;", "", "Lcom/adif/elcanomovil/uiHome/adapters/UserFavoriteListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Landroid/content/Context;", "context", "<init>", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroid/content/Context;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/I0;", "position", "getItemViewType", "(I)I", "getItemCount", "()I", "holder", "onBindViewHolder", "(Landroidx/recyclerview/widget/I0;I)V", "Ljava/util/List;", "Lkotlin/jvm/functions/Function1;", "Landroid/content/Context;", "TYPE_TRAIN", "I", "TYPE_OTHER", "G1/b", "G1/c", "ui-home_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UserFavoritesAdapter extends AbstractC0220h0 {
    private final int TYPE_OTHER;
    private final int TYPE_TRAIN;
    private final Context context;
    private final List<UserFavoriteVO> items;
    private final Function1<UserFavoriteVO, Unit> listener;

    /* JADX WARN: Multi-variable type inference failed */
    public UserFavoritesAdapter(List<UserFavoriteVO> items, Function1<? super UserFavoriteVO, Unit> function1, Context context) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(context, "context");
        this.items = items;
        this.listener = function1;
        this.context = context;
        this.TYPE_TRAIN = 1;
        this.TYPE_OTHER = 2;
    }

    @Override // androidx.recyclerview.widget.AbstractC0220h0
    public int getItemCount() {
        return this.items.size();
    }

    @Override // androidx.recyclerview.widget.AbstractC0220h0
    public int getItemViewType(int position) {
        return this.items.get(position).getType() == DataType.COMMERCIAL ? this.TYPE_TRAIN : this.TYPE_OTHER;
    }

    @Override // androidx.recyclerview.widget.AbstractC0220h0
    public void onBindViewHolder(I0 holder, int position) {
        List split$default;
        List split$default2;
        List split$default3;
        final int i = 0;
        final int i4 = 1;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Integer num = null;
        if (holder instanceof c) {
            c cVar = (c) holder;
            final UserFavoriteVO item = this.items.get(position);
            final Function1<UserFavoriteVO, Unit> function1 = this.listener;
            cVar.getClass();
            Intrinsics.checkNotNullParameter(item, "item");
            switch (UserFavoritesAdapter$UserFavoritesViewHolder$WhenMappings.$EnumSwitchMapping$0[item.getType().ordinal()]) {
                case 1:
                    num = Integer.valueOf(R.drawable.ic_station_option_departures);
                    break;
                case 2:
                    num = Integer.valueOf(R.drawable.ic_station_option_arrivals);
                    break;
                case 3:
                    num = Integer.valueOf(R.drawable.ic_train_between_stations);
                    break;
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    num = Integer.valueOf(R.drawable.ic_stations);
                    break;
            }
            ViewStationOptionBinding viewStationOptionBinding = cVar.f573a;
            if (num != null) {
                int intValue = num.intValue();
                ImageView imageView = viewStationOptionBinding.stationOptionIcon;
                imageView.setImageDrawable(imageView.getContext().getResources().getDrawable(intValue));
            }
            viewStationOptionBinding.stationOptionTitle.setText(item.getTitle());
            viewStationOptionBinding.stationOptionSubtitle.setText(item.getSubtitle());
            viewStationOptionBinding.getRoot().setOnClickListener(new View.OnClickListener() { // from class: G1.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i4) {
                        case 0:
                            UserFavoriteVO item2 = item;
                            Intrinsics.checkNotNullParameter(item2, "$item");
                            Function1 function12 = function1;
                            if (function12 != null) {
                                function12.invoke(item2);
                                return;
                            }
                            return;
                        default:
                            UserFavoriteVO item3 = item;
                            Intrinsics.checkNotNullParameter(item3, "$item");
                            Function1 function13 = function1;
                            if (function13 != null) {
                                function13.invoke(item3);
                                return;
                            }
                            return;
                    }
                }
            });
            return;
        }
        if (holder instanceof b) {
            b bVar = (b) holder;
            final UserFavoriteVO item2 = this.items.get(position);
            final Function1<UserFavoriteVO, Unit> function12 = this.listener;
            bVar.getClass();
            Intrinsics.checkNotNullParameter(item2, "item");
            ViewTrainOptionBinding viewTrainOptionBinding = bVar.f572b;
            ImageView imageView2 = viewTrainOptionBinding.trainOptionIcon;
            Resources resources = bVar.f571a.getResources();
            int i5 = R.drawable.ic_train;
            ThreadLocal threadLocal = q.f503a;
            imageView2.setImageDrawable(j.a(resources, i5, null));
            split$default = StringsKt__StringsKt.split$default(item2.getTitle(), new String[]{"#"}, false, 0, 6, (Object) null);
            split$default2 = StringsKt__StringsKt.split$default((CharSequence) split$default.get(0), new String[]{" "}, false, 2, 2, (Object) null);
            TextView textView = viewTrainOptionBinding.trainOptionTitle;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format("%s %s", Arrays.copyOf(new Object[]{AbstractC0105a.K(bVar.itemView.getContext(), (String) split$default2.get(0)), AbstractC0105a.k(bVar.itemView.getContext(), (String) split$default2.get(1))}, 2));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            textView.setText(format);
            split$default3 = StringsKt__StringsKt.split$default(item2.getSubtitle(), new String[]{"#"}, false, 0, 6, (Object) null);
            viewTrainOptionBinding.trainOptionFromStation.setText((CharSequence) split$default3.get(0));
            viewTrainOptionBinding.trainOptionToStation.setText((CharSequence) split$default3.get(1));
            viewTrainOptionBinding.trainOptionFromStationTime.setText((CharSequence) split$default3.get(2));
            viewTrainOptionBinding.trainOptionToStationTime.setText((CharSequence) split$default3.get(3));
            viewTrainOptionBinding.getRoot().setOnClickListener(new View.OnClickListener() { // from class: G1.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i) {
                        case 0:
                            UserFavoriteVO item22 = item2;
                            Intrinsics.checkNotNullParameter(item22, "$item");
                            Function1 function122 = function12;
                            if (function122 != null) {
                                function122.invoke(item22);
                                return;
                            }
                            return;
                        default:
                            UserFavoriteVO item3 = item2;
                            Intrinsics.checkNotNullParameter(item3, "$item");
                            Function1 function13 = function12;
                            if (function13 != null) {
                                function13.invoke(item3);
                                return;
                            }
                            return;
                    }
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC0220h0
    public I0 onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == this.TYPE_TRAIN) {
            View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_train_option, parent, false);
            Intrinsics.checkNotNull(inflate);
            return new b(inflate, this.context);
        }
        View inflate2 = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_station_option, parent, false);
        Intrinsics.checkNotNull(inflate2);
        return new c(inflate2);
    }
}
