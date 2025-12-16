package com.adif.elcanomovil.domain.usecases;

import android.net.Uri;
import com.adif.elcanomovil.domain.entities.circulation.TrainCirculationInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0014\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0018\u0010\u0015\u001a\u00020\u0001*\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"ANDROID_PACKAGE", "", "APP_STORE_ID", "ARG_DYNAMIC_PACKAGE", "FALLOUT_LINK", "IOS_BUNDLE_ID", "allControlPointsKey", "arrivalsKey", "commercialNumberKey", "commercialProductKey", "commercialServiceKey", "commercialStopTypeKey", "departuresKey", "destinationKey", "journeyKey", "launchingDateKey", "operatorKey", "originKey", "trafficTypeKey", "trainKey", DynamicLinkUseCaseKt.trainTypeKey, "asUrl", "Lcom/adif/elcanomovil/domain/entities/circulation/TrainCirculationInfo;", "getAsUrl", "(Lcom/adif/elcanomovil/domain/entities/circulation/TrainCirculationInfo;)Ljava/lang/String;", "domain_proNon_corporateRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DynamicLinkUseCaseKt {
    private static final String ANDROID_PACKAGE = "com.adif.elcanomovil";
    private static final String APP_STORE_ID = "960191892";
    private static final String ARG_DYNAMIC_PACKAGE = "elcanoweb.adif.es";
    private static final String FALLOUT_LINK = "http://adif.es/es_ES/adif_movil.shtml";
    private static final String IOS_BUNDLE_ID = "es.adif.adifentumovil";
    private static final String allControlPointsKey = "allControlPoints";
    private static final String arrivalsKey = "arrivals";
    private static final String commercialNumberKey = "commercialNumber";
    private static final String commercialProductKey = "commercialProduct";
    private static final String commercialServiceKey = "commercialService";
    private static final String commercialStopTypeKey = "commercialStopType";
    private static final String departuresKey = "departure";
    private static final String destinationKey = "destinationStationCode";
    private static final String journeyKey = "journey";
    private static final String launchingDateKey = "launchingDate";
    private static final String operatorKey = "operator";
    private static final String originKey = "originStationCode";
    private static final String trafficTypeKey = "trafficType";
    private static final String trainKey = "train";
    private static final String trainTypeKey = "trainTypeKey";

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getAsUrl(TrainCirculationInfo trainCirculationInfo) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https").authority("elcanoweb.adif.es").appendPath("train").appendQueryParameter("commercialNumber", trainCirculationInfo.getCommercialNumber());
        String origin = trainCirculationInfo.getOrigin();
        if (origin != null) {
            builder.appendQueryParameter("originStationCode", origin);
        }
        String destination = trainCirculationInfo.getDestination();
        if (destination != null) {
            builder.appendQueryParameter("destinationStationCode", destination);
        }
        Long launchingDate = trainCirculationInfo.getLaunchingDate();
        if (launchingDate != null) {
            builder.appendQueryParameter("launchingDate", String.valueOf(launchingDate.longValue()));
        }
        String uri = builder.build().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        return uri;
    }
}
