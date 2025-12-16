package G2;

import android.view.View;
import com.adif.elcanomovil.domain.entities.avisa.incidence.IncidenceStation;
import com.adif.elcanomovil.domain.entities.station.Station;
import com.adif.elcanomovil.domain.entities.subscription.Subscription;
import com.adif.elcanomovil.uiAvisa.components.details.PicturesAdapter;
import com.adif.elcanomovil.uiAvisa.components.home.IssuesAdapter;
import com.adif.elcanomovil.uiDialog.StationsDialogFragment;
import com.adif.elcanomovil.uiMoreAdif.MoreItem;
import com.adif.elcanomovil.uiSelectStation.main.StationViewHolder;
import com.adif.elcanomovil.uiSelectTrain.entities.TrainInfo;
import com.adif.elcanomovil.uiSelectTrain.main.TrainViewHolder;
import com.adif.elcanomovil.uiStations.adapters.ActivityViewHolder;
import com.adif.elcanomovil.uiStations.entities.Activity;
import com.adif.elcanomovil.uiStations.entities.ServicesTabViewData;
import com.adif.elcanomovil.uiStations.main.StationsPageServicesFragment;
import com.adif.elcanomovil.uiSubscriptions.viewholder.SubscriptionViewHolder;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class l implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f620a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f621b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f622c;

    public /* synthetic */ l(int i, Object obj, Object obj2) {
        this.f620a = i;
        this.f621b = obj;
        this.f622c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f620a) {
            case 0:
                m mVar = (m) this.f621b;
                ((D1.a) this.f622c).onClick(view);
                mVar.a(1);
                return;
            case 1:
                ActivityViewHolder.a((Function1) this.f621b, (Activity) this.f622c, view);
                return;
            case 2:
                SubscriptionViewHolder.bind$lambda$0((SubscriptionViewHolder) this.f621b, (Subscription) this.f622c, view);
                return;
            case 3:
                PicturesAdapter.a((PicturesAdapter) this.f621b, (PicturesAdapter.PictureViewHolder) this.f622c, view);
                return;
            case 4:
                IssuesAdapter.IssueViewHolder.a((IssuesAdapter.OnIssueListFragmentInteractionListener) this.f621b, (IncidenceStation) this.f622c, view);
                return;
            case 5:
                StationsDialogFragment.configureView$lambda$8$lambda$7$lambda$6((List) this.f621b, (StationsDialogFragment) this.f622c, view);
                return;
            case 6:
                Function1 listener = (Function1) this.f621b;
                Intrinsics.checkNotNullParameter(listener, "$listener");
                MoreItem item = (MoreItem) this.f622c;
                Intrinsics.checkNotNullParameter(item, "$item");
                listener.invoke(item.getType());
                return;
            case 7:
                StationViewHolder.a((StationViewHolder) this.f621b, (Station) this.f622c, view);
                return;
            case 8:
                TrainViewHolder.bind$lambda$0((TrainViewHolder) this.f621b, (TrainInfo) this.f622c, view);
                return;
            default:
                StationsPageServicesFragment.updateResults$lambda$10((StationsPageServicesFragment) this.f621b, (ServicesTabViewData) this.f622c, view);
                return;
        }
    }
}
