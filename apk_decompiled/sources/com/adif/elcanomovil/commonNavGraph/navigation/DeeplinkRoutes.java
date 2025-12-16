package com.adif.elcanomovil.commonNavGraph.navigation;

import android.net.Uri;
import com.adif.elcanomovil.commonNavGraph.arguments.NavArguments;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0004J\u000e\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/adif/elcanomovil/commonNavGraph/navigation/DeeplinkRoutes;", "", "()V", "authority", "", "avisa", "avisaIncidenceDetails", "base", NavArguments.ARG_DYNAMIC_DEPARTURES, "favourites", "home", "scheme", "selectTrainPath", "stations", DeeplinkRoutes.trainDetailsPath, "trainDetailsPath", "getSelectTrainLink", "Landroid/net/Uri;", NavArguments.ARG_DYNAMIC_LINKS_COMMERCIAL_NUMBER, "getTrainDetailsLink", "common-nav-graph_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DeeplinkRoutes {
    public static final DeeplinkRoutes INSTANCE = new DeeplinkRoutes();
    private static final String authority = "app";
    public static final String avisa = "adifmovil://app/avisa";
    public static final String avisaIncidenceDetails = "adifmovil://app/avisaIncidenceDetails";
    private static final String base = "adifmovil://app/";
    public static final String departures = "adifmovil://app/departures";
    public static final String favourites = "adifmovil://app/favourites";
    public static final String home = "adifmovil://app/home";
    private static final String scheme = "adifmovil";
    private static final String selectTrainPath = "selectTrain";
    public static final String stations = "adifmovil://app/station";
    public static final String trainDetails = "adifmovil://app/trainDetails";
    private static final String trainDetailsPath = "trainDetails";

    private DeeplinkRoutes() {
    }

    public final Uri getSelectTrainLink(String commercialNumber) {
        Intrinsics.checkNotNullParameter(commercialNumber, "commercialNumber");
        Uri build = new Uri.Builder().scheme(scheme).authority(authority).appendPath(selectTrainPath).appendQueryParameter(NavArguments.ARG_DYNAMIC_LINKS_COMMERCIAL_NUMBER, commercialNumber).appendQueryParameter("result_name", NavArguments.RESULT_TRAIN).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    public final Uri getTrainDetailsLink(String commercialNumber) {
        Intrinsics.checkNotNullParameter(commercialNumber, "commercialNumber");
        Uri build = new Uri.Builder().scheme(scheme).authority(authority).appendPath(trainDetailsPath).appendQueryParameter(NavArguments.ARG_DYNAMIC_LINKS_COMMERCIAL_NUMBER, commercialNumber).appendQueryParameter(NavArguments.ARG_DYNAMIC_LINKS_STATION_CODE, null).appendQueryParameter(NavArguments.ARG_DYNAMIC_LINKS_STATION_TO_CODE, null).appendQueryParameter(NavArguments.ARG_DYNAMIC_LINKS_LAUNCHDATE, null).appendQueryParameter("observation", null).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }
}
