package M1;

import android.view.View;
import com.adif.elcanomovil.uiSubscriptions.create.views.JourneyView;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1114a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ JourneyView f1115b;

    public /* synthetic */ a(JourneyView journeyView, int i) {
        this.f1114a = i;
        this.f1115b = journeyView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f1114a;
        JourneyView journeyView = this.f1115b;
        switch (i) {
            case 0:
                JourneyView.i(journeyView, view);
                return;
            case 1:
                JourneyView.k(journeyView, view);
                return;
            default:
                JourneyView.l(journeyView, view);
                return;
        }
    }
}
