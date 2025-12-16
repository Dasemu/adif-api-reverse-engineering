package p2;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import java.util.Comparator;

/* loaded from: classes3.dex */
public final class d implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MaterialButtonToggleGroup f8139a;

    public d(MaterialButtonToggleGroup materialButtonToggleGroup) {
        this.f8139a = materialButtonToggleGroup;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        MaterialButton materialButton = (MaterialButton) obj;
        MaterialButton materialButton2 = (MaterialButton) obj2;
        int compareTo = Boolean.valueOf(materialButton.f5600o).compareTo(Boolean.valueOf(materialButton2.f5600o));
        if (compareTo != 0) {
            return compareTo;
        }
        int compareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        MaterialButtonToggleGroup materialButtonToggleGroup = this.f8139a;
        return Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton)).compareTo(Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton2)));
    }
}
