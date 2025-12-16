package com.adif.elcanomovil.uiDepartures.databinding;

import a.AbstractC0105a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.adif.elcanomovil.uiDepartures.R;

/* loaded from: classes2.dex */
public final class ViewRadiogroupTraintypeBinding {
    public final RadioButton cercanias;
    public final RadioGroup group;
    public final RadioButton others;
    private final View rootView;
    public final RadioButton trains;

    private ViewRadiogroupTraintypeBinding(View view, RadioButton radioButton, RadioGroup radioGroup, RadioButton radioButton2, RadioButton radioButton3) {
        this.rootView = view;
        this.cercanias = radioButton;
        this.group = radioGroup;
        this.others = radioButton2;
        this.trains = radioButton3;
    }

    public static ViewRadiogroupTraintypeBinding bind(View view) {
        int i = R.id.cercanias;
        RadioButton radioButton = (RadioButton) AbstractC0105a.t(view, i);
        if (radioButton != null) {
            i = R.id.group;
            RadioGroup radioGroup = (RadioGroup) AbstractC0105a.t(view, i);
            if (radioGroup != null) {
                i = R.id.others;
                RadioButton radioButton2 = (RadioButton) AbstractC0105a.t(view, i);
                if (radioButton2 != null) {
                    i = R.id.trains;
                    RadioButton radioButton3 = (RadioButton) AbstractC0105a.t(view, i);
                    if (radioButton3 != null) {
                        return new ViewRadiogroupTraintypeBinding(view, radioButton, radioGroup, radioButton2, radioButton3);
                    }
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
