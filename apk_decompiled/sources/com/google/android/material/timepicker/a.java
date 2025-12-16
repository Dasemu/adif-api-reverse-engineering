package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;
import com.google.android.material.chip.Chip;
import x2.l;

/* loaded from: classes3.dex */
public final class a extends l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ChipTextInputComboView f5909a;

    public a(ChipTextInputComboView chipTextInputComboView) {
        this.f5909a = chipTextInputComboView;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean isEmpty = TextUtils.isEmpty(editable);
        ChipTextInputComboView chipTextInputComboView = this.f5909a;
        if (isEmpty) {
            chipTextInputComboView.f5882a.setText(ChipTextInputComboView.a(chipTextInputComboView, "00"));
            return;
        }
        String a2 = ChipTextInputComboView.a(chipTextInputComboView, editable);
        Chip chip = chipTextInputComboView.f5882a;
        if (TextUtils.isEmpty(a2)) {
            a2 = ChipTextInputComboView.a(chipTextInputComboView, "00");
        }
        chip.setText(a2);
    }
}
