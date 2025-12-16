package com.adif.elcanomovil.uiAvisa.utils.ui;

import D.h;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.PopupWindow;
import com.adif.elcanomovil.uiAvisa.R;
import com.adif.elcanomovil.uiAvisa.databinding.PopupFullscreenPictureBinding;
import com.adif.elcanomovil.uiAvisa.utils.ui.FullScreenPicturePopupWindow;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0011BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/adif/elcanomovil/uiAvisa/utils/ui/FullScreenPicturePopupWindow;", "Landroid/widget/PopupWindow;", "context", "Landroid/content/Context;", "bitmap", "Landroid/graphics/Bitmap;", "position", "", "allowDeletion", "", "binding", "Lcom/adif/elcanomovil/uiAvisa/databinding/PopupFullscreenPictureBinding;", "width", "height", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/adif/elcanomovil/uiAvisa/utils/ui/FullScreenPicturePopupWindow$OnFullScreenPicturePopupListener;", "(Landroid/content/Context;Landroid/graphics/Bitmap;IZLcom/adif/elcanomovil/uiAvisa/databinding/PopupFullscreenPictureBinding;IILcom/adif/elcanomovil/uiAvisa/utils/ui/FullScreenPicturePopupWindow$OnFullScreenPicturePopupListener;)V", "OnFullScreenPicturePopupListener", "ui-avisa_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FullScreenPicturePopupWindow extends PopupWindow {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/adif/elcanomovil/uiAvisa/utils/ui/FullScreenPicturePopupWindow$OnFullScreenPicturePopupListener;", "", "onDeleteEvent", "", "position", "", "ui-avisa_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public interface OnFullScreenPicturePopupListener {
        void onDeleteEvent(int position);
    }

    public /* synthetic */ FullScreenPicturePopupWindow(Context context, Bitmap bitmap, int i, boolean z3, PopupFullscreenPictureBinding popupFullscreenPictureBinding, int i4, int i5, OnFullScreenPicturePopupListener onFullScreenPicturePopupListener, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, bitmap, i, (i6 & 8) != 0 ? false : z3, popupFullscreenPictureBinding, i4, i5, (i6 & 128) != 0 ? null : onFullScreenPicturePopupListener);
    }

    public static final void _init_$lambda$0(FullScreenPicturePopupWindow this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dismiss();
    }

    public static final void _init_$lambda$1(OnFullScreenPicturePopupListener onFullScreenPicturePopupListener, int i, FullScreenPicturePopupWindow this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (onFullScreenPicturePopupListener != null) {
            onFullScreenPicturePopupListener.onDeleteEvent(i);
        }
        this$0.dismiss();
    }

    public static final void _init_$lambda$2(PopupFullscreenPictureBinding binding, View view) {
        Intrinsics.checkNotNullParameter(binding, "$binding");
        if (binding.actionButtons.getVisibility() == 8) {
            binding.actionButtons.setVisibility(0);
        } else {
            binding.actionButtons.setVisibility(8);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullScreenPicturePopupWindow(Context context, Bitmap bitmap, final int i, boolean z3, PopupFullscreenPictureBinding binding, int i4, int i5, final OnFullScreenPicturePopupListener onFullScreenPicturePopupListener) {
        super(binding.getRoot(), i4, i5);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(binding, "binding");
        setElevation(5.0f);
        setOutsideTouchable(false);
        setFocusable(true);
        binding.ibClose.setOnClickListener(new D1.a(this, 0));
        if (z3) {
            binding.ibRemove.setVisibility(0);
            binding.ibRemove.setOnClickListener(new View.OnClickListener() { // from class: D1.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FullScreenPicturePopupWindow._init_$lambda$1(FullScreenPicturePopupWindow.OnFullScreenPicturePopupListener.this, i, this, view);
                }
            });
        }
        binding.image.setOnClickListener(new D1.a(binding, 1));
        ViewParent parent = binding.image.getParent();
        Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        ((ViewGroup) parent).setBackgroundColor(h.getColor(context, R.color.colour_background_transparent));
        binding.image.setImageBitmap(bitmap);
    }
}
