package com.adif.elcanomovil.commonViews.databinding;

import a.AbstractC0105a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.adif.elcanomovil.commonViews.R;

/* loaded from: classes.dex */
public final class ViewRadiogroupTraintypeBinding {
    public final RadioButton cercanias;
    public final RadioGroup group;
    private final View rootView;
    public final RadioButton trains;

    private ViewRadiogroupTraintypeBinding(View view, RadioButton radioButton, RadioGroup radioGroup, RadioButton radioButton2) {
        this.rootView = view;
        this.cercanias = radioButton;
        this.group = radioGroup;
        this.trains = radioButton2;
    }

    public static ViewRadiogroupTraintypeBinding bind(View view) {
        int i = R.id.cercanias;
        RadioButton radioButton = (RadioButton) AbstractC0105a.t(view, i);
        if (radioButton != null) {
            i = R.id.group;
            RadioGroup radioGroup = (RadioGroup) AbstractC0105a.t(view, i);
            if (radioGroup != null) {
                i = R.id.trains;
                RadioButton radioButton2 = (RadioButton) AbstractC0105a.t(view, i);
                if (radioButton2 != null) {
                    return new ViewRadiogroupTraintypeBinding(view, radioButton, radioGroup, radioButton2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ViewRadiogroupTraintypeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.view_radiogroup_traintype, viewGroup);
        return bind(viewGroup);
    }

    public View getRoot() {
        return this.rootView;
    }
}
