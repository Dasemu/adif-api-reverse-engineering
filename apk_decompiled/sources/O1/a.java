package O1;

import android.widget.CompoundButton;
import com.adif.elcanomovil.uiAvisa.components.create.NewIssueFragment;
import com.adif.elcanomovil.uiSubscriptions.viewholder.SubscriptionViewHolder;
import com.google.android.material.chip.Chip;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1317a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1318b;

    public /* synthetic */ a(Object obj, int i) {
        this.f1317a = i;
        this.f1318b = obj;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z3) {
        switch (this.f1317a) {
            case 0:
                SubscriptionViewHolder.b((SubscriptionViewHolder) this.f1318b, compoundButton, z3);
                return;
            case 1:
                NewIssueFragment.m((NewIssueFragment) this.f1318b, compoundButton, z3);
                return;
            default:
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = ((Chip) this.f1318b).i;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z3);
                    return;
                }
                return;
        }
    }
}
