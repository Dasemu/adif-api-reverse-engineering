package com.adif.elcanomovil.uiMoreAdif.wizard;

import F0.h;
import android.widget.ImageView;
import com.adif.elcanomovil.uiMoreAdif.R;

/* loaded from: classes2.dex */
public final class a implements h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WizardActivity f5179a;

    public a(WizardActivity wizardActivity) {
        this.f5179a = wizardActivity;
    }

    @Override // F0.h
    public final void a(int i) {
    }

    @Override // F0.h
    public final void b(int i) {
        WizardActivity wizardActivity = this.f5179a;
        if (i == 0) {
            ((ImageView) wizardActivity.findViewById(R.id.circle_screen1)).setImageDrawable(wizardActivity.getResources().getDrawable(R.drawable.image_wizard_page_1));
            ((ImageView) wizardActivity.findViewById(R.id.circle_screen2)).setImageDrawable(wizardActivity.getResources().getDrawable(R.drawable.image_wizard_page_2_off));
            ((ImageView) wizardActivity.findViewById(R.id.circle_screen3)).setImageDrawable(wizardActivity.getResources().getDrawable(R.drawable.image_wizard_page_3_off));
            ((ImageView) wizardActivity.findViewById(R.id.circle_screen4)).setImageDrawable(wizardActivity.getResources().getDrawable(R.drawable.image_wizard_page_4_off));
            ((ImageView) wizardActivity.findViewById(R.id.circle_screen5)).setImageDrawable(wizardActivity.getResources().getDrawable(R.drawable.image_wizard_page_5_off));
            return;
        }
        if (i == 1) {
            ((ImageView) wizardActivity.findViewById(R.id.circle_screen1)).setImageDrawable(wizardActivity.getResources().getDrawable(R.drawable.image_wizard_page_1_off));
            ((ImageView) wizardActivity.findViewById(R.id.circle_screen2)).setImageDrawable(wizardActivity.getResources().getDrawable(R.drawable.image_wizard_page_2));
            ((ImageView) wizardActivity.findViewById(R.id.circle_screen3)).setImageDrawable(wizardActivity.getResources().getDrawable(R.drawable.image_wizard_page_3_off));
            ((ImageView) wizardActivity.findViewById(R.id.circle_screen4)).setImageDrawable(wizardActivity.getResources().getDrawable(R.drawable.image_wizard_page_4_off));
            ((ImageView) wizardActivity.findViewById(R.id.circle_screen5)).setImageDrawable(wizardActivity.getResources().getDrawable(R.drawable.image_wizard_page_5_off));
            return;
        }
        if (i == 2) {
            ((ImageView) wizardActivity.findViewById(R.id.circle_screen1)).setImageDrawable(wizardActivity.getResources().getDrawable(R.drawable.image_wizard_page_1_off));
            ((ImageView) wizardActivity.findViewById(R.id.circle_screen2)).setImageDrawable(wizardActivity.getResources().getDrawable(R.drawable.image_wizard_page_2_off));
            ((ImageView) wizardActivity.findViewById(R.id.circle_screen3)).setImageDrawable(wizardActivity.getResources().getDrawable(R.drawable.image_wizard_page_3));
            ((ImageView) wizardActivity.findViewById(R.id.circle_screen4)).setImageDrawable(wizardActivity.getResources().getDrawable(R.drawable.image_wizard_page_4_off));
            ((ImageView) wizardActivity.findViewById(R.id.circle_screen5)).setImageDrawable(wizardActivity.getResources().getDrawable(R.drawable.image_wizard_page_5_off));
            return;
        }
        if (i == 3) {
            ((ImageView) wizardActivity.findViewById(R.id.circle_screen1)).setImageDrawable(wizardActivity.getResources().getDrawable(R.drawable.image_wizard_page_1_off));
            ((ImageView) wizardActivity.findViewById(R.id.circle_screen2)).setImageDrawable(wizardActivity.getResources().getDrawable(R.drawable.image_wizard_page_2_off));
            ((ImageView) wizardActivity.findViewById(R.id.circle_screen3)).setImageDrawable(wizardActivity.getResources().getDrawable(R.drawable.image_wizard_page_3_off));
            ((ImageView) wizardActivity.findViewById(R.id.circle_screen4)).setImageDrawable(wizardActivity.getResources().getDrawable(R.drawable.image_wizard_page_4));
            ((ImageView) wizardActivity.findViewById(R.id.circle_screen5)).setImageDrawable(wizardActivity.getResources().getDrawable(R.drawable.image_wizard_page_5_off));
            return;
        }
        if (i != 4) {
            return;
        }
        ((ImageView) wizardActivity.findViewById(R.id.circle_screen1)).setImageDrawable(wizardActivity.getResources().getDrawable(R.drawable.image_wizard_page_1_off));
        ((ImageView) wizardActivity.findViewById(R.id.circle_screen2)).setImageDrawable(wizardActivity.getResources().getDrawable(R.drawable.image_wizard_page_2_off));
        ((ImageView) wizardActivity.findViewById(R.id.circle_screen3)).setImageDrawable(wizardActivity.getResources().getDrawable(R.drawable.image_wizard_page_3_off));
        ((ImageView) wizardActivity.findViewById(R.id.circle_screen4)).setImageDrawable(wizardActivity.getResources().getDrawable(R.drawable.image_wizard_page_4_off));
        ((ImageView) wizardActivity.findViewById(R.id.circle_screen5)).setImageDrawable(wizardActivity.getResources().getDrawable(R.drawable.image_wizard_page_5));
    }

    @Override // F0.h
    public final void c(int i, float f2) {
    }
}
