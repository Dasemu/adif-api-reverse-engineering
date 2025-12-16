package com.adif.elcanomovil.commonViews;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.adif.elcanomovil.commonViews.data.InfoData;
import com.adif.elcanomovil.commonViews.databinding.ViewInfoBinding;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000fJ\u001a\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0002R\u000e\u0010\f\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/adif/elcanomovil/commonViews/InfoView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attr", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "attrs", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/adif/elcanomovil/commonViews/databinding/ViewInfoBinding;", "infoData", "Lcom/adif/elcanomovil/commonViews/data/InfoData;", "configureView", "", "info", "initView", "common-views_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class InfoView extends ConstraintLayout {
    private ViewInfoBinding binding;
    private InfoData infoData;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InfoView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        initView(context, null);
    }

    private final void initView(Context context, AttributeSet attrs) {
        View.inflate(context, R.layout.view_info, this);
        ViewInfoBinding bind = ViewInfoBinding.bind(this);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
    }

    public final void configureView(InfoData info) {
        Integer image;
        Intrinsics.checkNotNullParameter(info, "info");
        this.infoData = info;
        ViewInfoBinding viewInfoBinding = this.binding;
        ViewInfoBinding viewInfoBinding2 = null;
        if (viewInfoBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            viewInfoBinding = null;
        }
        TextView textView = viewInfoBinding.textViewTitle;
        InfoData infoData = this.infoData;
        textView.setText(infoData != null ? infoData.getTitle() : null);
        ViewInfoBinding viewInfoBinding3 = this.binding;
        if (viewInfoBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            viewInfoBinding3 = null;
        }
        TextView textView2 = viewInfoBinding3.textViewMsg;
        InfoData infoData2 = this.infoData;
        textView2.setText(infoData2 != null ? infoData2.getMsg() : null);
        ViewInfoBinding viewInfoBinding4 = this.binding;
        if (viewInfoBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            viewInfoBinding4 = null;
        }
        viewInfoBinding4.actionButtonRetry.setBackgroundColor(getResources().getColor(R.color.darkLight));
        InfoData infoData3 = this.infoData;
        if (infoData3 == null || (image = infoData3.getImage()) == null) {
            return;
        }
        int intValue = image.intValue();
        ViewInfoBinding viewInfoBinding5 = this.binding;
        if (viewInfoBinding5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            viewInfoBinding2 = viewInfoBinding5;
        }
        viewInfoBinding2.imageViewInfo.setImageDrawable(D.h.getDrawable(getContext(), intValue));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InfoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        initView(context, attributeSet);
    }

    public /* synthetic */ InfoView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InfoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        initView(context, attributeSet);
    }
}
