package I1;

import F.n;
import K0.g;
import O.L;
import O.X;
import Y.C0092h;
import Y.F;
import android.view.View;
import androidx.lifecycle.C0189j;
import com.adif.elcanomovil.commonViews.ButtonsEvents;
import com.adif.elcanomovil.domain.entities.CirculationType;
import com.adif.elcanomovil.domain.entities.StationServiceType;
import com.adif.elcanomovil.domain.entities.notifications.NotificationPayload;
import com.adif.elcanomovil.main.MainActivity;
import com.adif.elcanomovil.serviceStorage.model.OperatorLogoValidityEntity;
import com.adif.elcanomovil.uiAvisa.components.details.IssueDetailsFragment;
import com.adif.elcanomovil.uiAvisa.components.home.AvisaHomeFragment;
import com.adif.elcanomovil.uiDepartures.databinding.FragmentDeparturesBinding;
import com.adif.elcanomovil.uiHome.data.UserFavoriteVO;
import com.adif.elcanomovil.uiMoreAdif.MoreActions;
import com.adif.elcanomovil.uiMoreAdif.contact.ContactFragment;
import com.adif.elcanomovil.uiMoreAdif.main.MoreAdifFragment;
import com.adif.elcanomovil.uiSelectTrain.entities.TrainInfo;
import com.adif.elcanomovil.uiSelectTrain.main.SelectTrainFragment;
import com.adif.elcanomovil.uiStations.databinding.FragmentStationsBinding;
import com.adif.elcanomovil.uiStations.entities.Activity;
import com.adif.elcanomovil.uiStations.entities.Services;
import com.adif.elcanomovil.uiStations.main.StationsPageActivitiesFragment;
import com.adif.elcanomovil.uiStations.main.StationsPageCommercialFragment;
import com.adif.elcanomovil.uiStations.main.StationsPageServicesFragment;
import com.adif.elcanomovil.uiSubscriptions.home.SubscriptionHomeFragment;
import java.util.Collection;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class b extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f792a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f793b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj, int i) {
        super(1);
        this.f792a = i;
        this.f793b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f792a) {
            case 0:
                Intrinsics.checkNotNullParameter((ButtonsEvents) obj, "it");
                ((ContactFragment) this.f793b).requireActivity().onBackPressed();
                return Unit.INSTANCE;
            case 1:
                ((g) this.f793b).f1005k = true;
                return Unit.INSTANCE;
            case 2:
                Throwable th = (Throwable) obj;
                if (th != null) {
                    ((F) this.f793b).f2061g.setValue(new C0092h(th));
                }
                Object obj2 = F.f2054k;
                F f2 = (F) this.f793b;
                synchronized (obj2) {
                    F.f2053j.remove(f2.d().getAbsolutePath());
                }
                return Unit.INSTANCE;
            case 3:
                Map.Entry entry = (Map.Entry) obj;
                Intrinsics.checkNotNullParameter(entry, "entry");
                Collection collection = (Collection) this.f793b;
                View view = (View) entry.getValue();
                WeakHashMap weakHashMap = X.f1226a;
                return Boolean.valueOf(CollectionsKt.contains(collection, L.k(view)));
            case 4:
                ((C0189j) this.f793b).j(obj);
                return Unit.INSTANCE;
            case 5:
                NotificationPayload it = (NotificationPayload) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                MainActivity.access$showSnackBar((MainActivity) this.f793b, it);
                return Unit.INSTANCE;
            case 6:
                Intrinsics.checkNotNullParameter((ButtonsEvents) obj, "it");
                ((IssueDetailsFragment) this.f793b).requireActivity().onBackPressed();
                return Unit.INSTANCE;
            case 7:
                Intrinsics.checkNotNullParameter((ButtonsEvents) obj, "it");
                ((AvisaHomeFragment) this.f793b).requireActivity().onBackPressed();
                return Unit.INSTANCE;
            case 8:
                CirculationType it2 = (CirculationType) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                FragmentDeparturesBinding fragmentDeparturesBinding = (FragmentDeparturesBinding) this.f793b;
                fragmentDeparturesBinding.pager.post(new n(5, fragmentDeparturesBinding, it2));
                return Unit.INSTANCE;
            case 9:
                Boolean bool = (Boolean) obj;
                Intrinsics.checkNotNull(bool);
                ((View) this.f793b).setVisibility(bool.booleanValue() ? 0 : 8);
                return Unit.INSTANCE;
            case 10:
                UserFavoriteVO it3 = (UserFavoriteVO) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                return Boolean.valueOf(Intrinsics.areEqual(it3.getId(), ((UserFavoriteVO) this.f793b).getId()));
            case 11:
                MoreActions it4 = (MoreActions) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                MoreAdifFragment.access$getViewModel((MoreAdifFragment) this.f793b).optionItemTapped(it4);
                return Unit.INSTANCE;
            case 12:
                TrainInfo it5 = (TrainInfo) obj;
                Intrinsics.checkNotNullParameter(it5, "it");
                ((SelectTrainFragment) this.f793b).onTapTrain(it5.getOperator(), it5.getCommercialProduct(), it5.getCommercialNumber(), it5.getOriginStation().getStationCode(), it5.getDestinationStation().getStationCode(), it5.getDate(), it5.getLaunchingDate(), it5.getObservation());
                return Unit.INSTANCE;
            case 13:
                StationServiceType it6 = (StationServiceType) obj;
                Intrinsics.checkNotNullParameter(it6, "it");
                FragmentStationsBinding fragmentStationsBinding = (FragmentStationsBinding) this.f793b;
                fragmentStationsBinding.pager.post(new n(6, fragmentStationsBinding, it6));
                return Unit.INSTANCE;
            case 14:
                Activity it7 = (Activity) obj;
                Intrinsics.checkNotNullParameter(it7, "it");
                StationsPageActivitiesFragment.access$getViewModel((StationsPageActivitiesFragment) this.f793b).onActivityTapped(it7);
                return Unit.INSTANCE;
            case 15:
                Services it8 = (Services) obj;
                Intrinsics.checkNotNullParameter(it8, "it");
                StationsPageCommercialFragment.access$getViewModel((StationsPageCommercialFragment) this.f793b).onCommercialTapped(it8);
                return Unit.INSTANCE;
            case 16:
                Services it9 = (Services) obj;
                Intrinsics.checkNotNullParameter(it9, "it");
                ((StationsPageServicesFragment) this.f793b).onServiceTap(it9);
                return Unit.INSTANCE;
            case 17:
                Intrinsics.checkNotNullParameter((ButtonsEvents) obj, "it");
                ((SubscriptionHomeFragment) this.f793b).requireActivity().onBackPressed();
                return Unit.INSTANCE;
            case 18:
                return Boolean.valueOf(Intrinsics.areEqual((String) obj, (String) this.f793b));
            default:
                OperatorLogoValidityEntity it10 = (OperatorLogoValidityEntity) obj;
                Intrinsics.checkNotNullParameter(it10, "it");
                return Boolean.valueOf(Intrinsics.areEqual(it10.getKey(), ((OperatorLogoValidityEntity) this.f793b).getKey()));
        }
    }
}
