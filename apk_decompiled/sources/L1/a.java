package L1;

import android.view.View;
import com.adif.elcanomovil.uiStations.adapters.CommercialViewHolder;
import com.adif.elcanomovil.uiStations.adapters.OfferViewHolder;
import com.adif.elcanomovil.uiStations.adapters.OneStationViewHolder;
import com.adif.elcanomovil.uiStations.entities.Services;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1057a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f1058b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Services f1059c;

    public /* synthetic */ a(Services services, Function1 function1, int i) {
        this.f1057a = i;
        this.f1058b = function1;
        this.f1059c = services;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f1057a) {
            case 0:
                CommercialViewHolder.a(this.f1058b, this.f1059c, view);
                return;
            case 1:
                OfferViewHolder.a(this.f1058b, this.f1059c, view);
                return;
            default:
                OneStationViewHolder.a(this.f1058b, this.f1059c, view);
                return;
        }
    }
}
