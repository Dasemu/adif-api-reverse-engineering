package s2;

import P.f;
import P.k;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import com.adif.elcanomovil.R;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;

/* renamed from: s2.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0610c extends X.b {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Chip f8413q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0610c(Chip chip, Chip chip2) {
        super(chip2);
        this.f8413q = chip;
    }

    @Override // X.b
    public final void l(ArrayList arrayList) {
        C0612e c0612e;
        arrayList.add(0);
        Rect rect = Chip.f5613w;
        Chip chip = this.f8413q;
        if (!chip.c() || (c0612e = chip.f5616e) == null || !c0612e.f8425I || chip.h == null) {
            return;
        }
        arrayList.add(1);
    }

    @Override // X.b
    public final void o(int i, k kVar) {
        Rect closeIconTouchBoundsInt;
        AccessibilityNodeInfo accessibilityNodeInfo = kVar.f1341a;
        if (i != 1) {
            accessibilityNodeInfo.setContentDescription("");
            accessibilityNodeInfo.setBoundsInParent(Chip.f5613w);
            return;
        }
        Chip chip = this.f8413q;
        CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
        if (closeIconContentDescription != null) {
            accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
        } else {
            CharSequence text = chip.getText();
            accessibilityNodeInfo.setContentDescription(chip.getContext().getString(R.string.mtrl_chip_close_icon_content_description, TextUtils.isEmpty(text) ? "" : text).trim());
        }
        closeIconTouchBoundsInt = chip.getCloseIconTouchBoundsInt();
        accessibilityNodeInfo.setBoundsInParent(closeIconTouchBoundsInt);
        kVar.b(f.f1330e);
        accessibilityNodeInfo.setEnabled(chip.isEnabled());
    }
}
