package com.adif.elcanomovil.domain.entities.station;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u0004\u0018\u00010\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\tR\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\tR\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u0015X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u001bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\t¨\u0006 "}, d2 = {"Lcom/adif/elcanomovil/domain/entities/station/StationServicesInterface;", "", "accessible", "Lcom/adif/elcanomovil/domain/entities/station/Accessible;", "getAccessible", "()Lcom/adif/elcanomovil/domain/entities/station/Accessible;", "description", "", "getDescription", "()Ljava/lang/String;", "identifier", "getIdentifier", "locator", "Lcom/adif/elcanomovil/domain/entities/station/Locator;", "getLocator", "()Lcom/adif/elcanomovil/domain/entities/station/Locator;", "logo", "getLogo", AppMeasurementSdk.ConditionalUserProperty.NAME, "getName", "openingHours", "Lcom/adif/elcanomovil/domain/entities/station/OpeningHours;", "getOpeningHours", "()Lcom/adif/elcanomovil/domain/entities/station/OpeningHours;", "phoneNumber", "getPhoneNumber", "pictures", "", "getPictures", "()Ljava/util/List;", "web", "getWeb", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface StationServicesInterface {
    Accessible getAccessible();

    String getDescription();

    String getIdentifier();

    Locator getLocator();

    String getLogo();

    String getName();

    OpeningHours getOpeningHours();

    String getPhoneNumber();

    List<String> getPictures();

    String getWeb();
}
