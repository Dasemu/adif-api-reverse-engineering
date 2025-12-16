package w1;

import com.adif.elcanomovil.domain.entities.StorableData;
import com.adif.elcanomovil.domain.entities.StorableTrain;
import com.adif.elcanomovil.serviceStorage.model.StationStored;
import com.adif.elcanomovil.serviceStorage.model.TrainStored;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: w1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0650a extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8803a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StorableData f8804b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0650a(StorableData storableData, int i) {
        super(1);
        this.f8803a = i;
        this.f8804b = storableData;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z3;
        switch (this.f8803a) {
            case 0:
                StationStored it = (StationStored) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(Intrinsics.areEqual(it.getIdentifier(), this.f8804b.getIdentifier()));
            default:
                TrainStored it2 = (TrainStored) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                String commercialNumber = it2.getCommercialNumber();
                StorableData storableData = this.f8804b;
                if (Intrinsics.areEqual(commercialNumber, storableData.getIdentifier())) {
                    StorableTrain storableTrain = (StorableTrain) storableData;
                    if (Intrinsics.areEqual(it2.getOriginStationCode(), storableTrain.getOriginStationCode()) && Intrinsics.areEqual(it2.getDestinationStationCode(), storableTrain.getDestinationStationCode())) {
                        z3 = true;
                        return Boolean.valueOf(z3);
                    }
                }
                z3 = false;
                return Boolean.valueOf(z3);
        }
    }
}
