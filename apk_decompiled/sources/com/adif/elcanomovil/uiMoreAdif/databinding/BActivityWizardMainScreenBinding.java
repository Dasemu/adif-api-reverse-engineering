package com.adif.elcanomovil.uiMoreAdif.databinding;

import a.AbstractC0105a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.adif.elcanomovil.uiMoreAdif.R;

/* loaded from: classes2.dex */
public final class BActivityWizardMainScreenBinding {
    public final LinearLayout WizardLayout;
    public final ImageView circleScreen1;
    public final ImageView circleScreen2;
    public final ImageView circleScreen3;
    public final ImageView circleScreen4;
    public final ImageView circleScreen5;
    public final ViewPager pager;
    private final LinearLayout rootView;
    public final TextView wizardReadyText;

    private BActivityWizardMainScreenBinding(LinearLayout linearLayout, LinearLayout linearLayout2, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, ViewPager viewPager, TextView textView) {
        this.rootView = linearLayout;
        this.WizardLayout = linearLayout2;
        this.circleScreen1 = imageView;
        this.circleScreen2 = imageView2;
        this.circleScreen3 = imageView3;
        this.circleScreen4 = imageView4;
        this.circleScreen5 = imageView5;
        this.pager = viewPager;
        this.wizardReadyText = textView;
    }

    public static BActivityWizardMainScreenBinding bind(View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i = R.id.circle_screen1;
        ImageView imageView = (ImageView) AbstractC0105a.t(view, i);
        if (imageView != null) {
            i = R.id.circle_screen2;
            ImageView imageView2 = (ImageView) AbstractC0105a.t(view, i);
            if (imageView2 != null) {
                i = R.id.circle_screen3;
                ImageView imageView3 = (ImageView) AbstractC0105a.t(view, i);
                if (imageView3 != null) {
                    i = R.id.circle_screen4;
                    ImageView imageView4 = (ImageView) AbstractC0105a.t(view, i);
                    if (imageView4 != null) {
                        i = R.id.circle_screen5;
                        ImageView imageView5 = (ImageView) AbstractC0105a.t(view, i);
                        if (imageView5 != null) {
                            i = R.id.pager;
                            ViewPager viewPager = (ViewPager) AbstractC0105a.t(view, i);
                            if (viewPager != null) {
                                i = R.id.wizard_ready_text;
                                TextView textView = (TextView) AbstractC0105a.t(view, i);
                                if (textView != null) {
                                    return new BActivityWizardMainScreenBinding(linearLayout, linearLayout, imageView, imageView2, imageView3, imageView4, imageView5, viewPager, textView);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static BActivityWizardMainScreenBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static BActivityWizardMainScreenBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(R.layout.b_activity_wizard_main_screen, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}
