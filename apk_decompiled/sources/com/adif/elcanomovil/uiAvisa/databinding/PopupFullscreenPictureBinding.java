package com.adif.elcanomovil.uiAvisa.databinding;

import a.AbstractC0105a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import com.adif.elcanomovil.uiAvisa.R;
import com.github.chrisbanes.photoview.PhotoView;

/* loaded from: classes.dex */
public final class PopupFullscreenPictureBinding {
    public final RelativeLayout actionButtons;
    public final ImageButton ibClose;
    public final ImageButton ibRemove;
    public final PhotoView image;
    private final RelativeLayout rootView;

    private PopupFullscreenPictureBinding(RelativeLayout relativeLayout, RelativeLayout relativeLayout2, ImageButton imageButton, ImageButton imageButton2, PhotoView photoView) {
        this.rootView = relativeLayout;
        this.actionButtons = relativeLayout2;
        this.ibClose = imageButton;
        this.ibRemove = imageButton2;
        this.image = photoView;
    }

    public static PopupFullscreenPictureBinding bind(View view) {
        int i = R.id.action_buttons;
        RelativeLayout relativeLayout = (RelativeLayout) AbstractC0105a.t(view, i);
        if (relativeLayout != null) {
            i = R.id.ib_close;
            ImageButton imageButton = (ImageButton) AbstractC0105a.t(view, i);
            if (imageButton != null) {
                i = R.id.ib_remove;
                ImageButton imageButton2 = (ImageButton) AbstractC0105a.t(view, i);
                if (imageButton2 != null) {
                    i = R.id.image;
                    PhotoView photoView = (PhotoView) AbstractC0105a.t(view, i);
                    if (photoView != null) {
                        return new PopupFullscreenPictureBinding((RelativeLayout) view, relativeLayout, imageButton, imageButton2, photoView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static PopupFullscreenPictureBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static PopupFullscreenPictureBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(R.layout.popup_fullscreen_picture, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
