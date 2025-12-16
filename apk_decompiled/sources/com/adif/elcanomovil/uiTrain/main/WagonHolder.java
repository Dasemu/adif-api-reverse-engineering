package com.adif.elcanomovil.uiTrain.main;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.I0;
import com.adif.elcanomovil.domain.entities.compositions.Cafeteria;
import com.adif.elcanomovil.domain.entities.compositions.Coach;
import com.adif.elcanomovil.domain.entities.compositions.Empty;
import com.adif.elcanomovil.domain.entities.compositions.Head;
import com.adif.elcanomovil.domain.entities.compositions.Tail;
import com.adif.elcanomovil.domain.entities.compositions.Wagon;
import com.adif.elcanomovil.uiTrain.R;
import com.adif.elcanomovil.uiTrain.databinding.ItemTrainWagonBinding;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/adif/elcanomovil/uiTrain/main/WagonHolder;", "Landroidx/recyclerview/widget/I0;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "Lcom/adif/elcanomovil/domain/entities/compositions/Wagon;", "item", "", FirebaseAnalytics.Param.ITEMS, "", "position", "", "bind", "(Lcom/adif/elcanomovil/domain/entities/compositions/Wagon;Ljava/util/List;I)V", "Lcom/adif/elcanomovil/uiTrain/databinding/ItemTrainWagonBinding;", "itemBinding", "Lcom/adif/elcanomovil/uiTrain/databinding/ItemTrainWagonBinding;", "ui-train_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WagonHolder extends I0 {
    private final ItemTrainWagonBinding itemBinding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WagonHolder(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        ItemTrainWagonBinding bind = ItemTrainWagonBinding.bind(itemView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.itemBinding = bind;
    }

    public final void bind(Wagon item, List<? extends Wagon> items, int position) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(items, "items");
        this.itemBinding.getRoot().setAlpha(1.0f);
        this.itemBinding.wagonNumber.setVisibility(8);
        this.itemBinding.wagonCafeteria.setVisibility(8);
        if (item instanceof Head) {
            this.itemBinding.wagonCafeteria.setVisibility(8);
            String number = ((Head) item).getNumber();
            if (number != null) {
                TextView textView = this.itemBinding.wagonNumber;
                textView.setVisibility(0);
                textView.setText(number);
            }
            ImageView imageView = this.itemBinding.wagonSrc;
            imageView.setVisibility(0);
            imageView.setImageDrawable(D.h.getDrawable(imageView.getContext(), R.drawable.ic_composition_right));
            return;
        }
        if (item instanceof Tail) {
            this.itemBinding.wagonCafeteria.setVisibility(8);
            String number2 = ((Tail) item).getNumber();
            if (number2 != null) {
                TextView textView2 = this.itemBinding.wagonNumber;
                textView2.setVisibility(0);
                textView2.setText(number2);
            }
            ImageView imageView2 = this.itemBinding.wagonSrc;
            imageView2.setVisibility(0);
            imageView2.setImageDrawable(D.h.getDrawable(imageView2.getContext(), R.drawable.ic_composition_left));
            return;
        }
        if (item instanceof Coach) {
            this.itemBinding.wagonCafeteria.setVisibility(8);
            TextView textView3 = this.itemBinding.wagonNumber;
            textView3.setVisibility(0);
            textView3.setText(((Coach) item).getNumber());
            ImageView imageView3 = this.itemBinding.wagonSrc;
            imageView3.setVisibility(0);
            imageView3.setImageDrawable(D.h.getDrawable(imageView3.getContext(), R.drawable.ic_composition_coach));
            return;
        }
        if (item instanceof Cafeteria) {
            this.itemBinding.wagonCafeteria.setVisibility(0);
            this.itemBinding.wagonNumber.setVisibility(8);
            ImageView imageView4 = this.itemBinding.wagonSrc;
            imageView4.setVisibility(0);
            imageView4.setImageDrawable(D.h.getDrawable(imageView4.getContext(), R.drawable.ic_composition_coach));
            return;
        }
        if (item instanceof Empty) {
            this.itemBinding.wagonCafeteria.setVisibility(8);
            this.itemBinding.wagonNumber.setVisibility(8);
            this.itemBinding.wagonSrc.setVisibility(8);
        }
    }
}
