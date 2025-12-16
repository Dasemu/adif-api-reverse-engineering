package com.google.android.material.timepicker;

import O.X;
import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.adif.elcanomovil.R;
import com.google.android.material.chip.Chip;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class ChipTextInputComboView extends FrameLayout implements Checkable {

    /* renamed from: a, reason: collision with root package name */
    public final Chip f5882a;

    /* renamed from: b, reason: collision with root package name */
    public final EditText f5883b;

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater from = LayoutInflater.from(context);
        Chip chip = (Chip) from.inflate(R.layout.material_time_chip, (ViewGroup) this, false);
        this.f5882a = chip;
        chip.setAccessibilityClassName("android.view.View");
        TextInputLayout textInputLayout = (TextInputLayout) from.inflate(R.layout.material_time_input, (ViewGroup) this, false);
        EditText editText = textInputLayout.getEditText();
        this.f5883b = editText;
        editText.setVisibility(4);
        editText.addTextChangedListener(new a(this));
        editText.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
        addView(chip);
        addView(textInputLayout);
        TextView textView = (TextView) findViewById(R.id.material_label);
        WeakHashMap weakHashMap = X.f1226a;
        editText.setId(View.generateViewId());
        textView.setLabelFor(editText.getId());
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }

    public static String a(ChipTextInputComboView chipTextInputComboView, CharSequence charSequence) {
        try {
            return String.format(chipTextInputComboView.getResources().getConfiguration().locale, "%02d", Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f5882a.isChecked();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f5883b.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z3) {
        Chip chip = this.f5882a;
        chip.setChecked(z3);
        int i = z3 ? 0 : 4;
        EditText editText = this.f5883b;
        editText.setVisibility(i);
        chip.setVisibility(z3 ? 8 : 0);
        if (chip.isChecked()) {
            editText.requestFocus();
            editText.post(new F2.f(editText, 12));
        }
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f5882a.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public final void setTag(int i, Object obj) {
        this.f5882a.setTag(i, obj);
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        this.f5882a.toggle();
    }
}
