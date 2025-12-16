package com.adif.elcanomovil.widget.domain.usecases;

import com.adif.elcanomovil.commonNavGraph.arguments.NavArguments;
import com.adif.elcanomovil.domain.usecases.stations.GetStationByIdUseCase;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J(\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0086B¢\u0006\u0002\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/adif/elcanomovil/widget/domain/usecases/GetWidgetInfoUseCase;", "", "getStationByIdUseCase", "Lcom/adif/elcanomovil/domain/usecases/stations/GetStationByIdUseCase;", "(Lcom/adif/elcanomovil/domain/usecases/stations/GetStationByIdUseCase;)V", "invoke", "Lcom/adif/elcanomovil/serviceStorage/model/FavouriteEntity;", NavArguments.ARG_DYNAMIC_LINKS_STATION_CODE, "", NavArguments.ARG_DYNAMIC_LINKS_STATION_TO_CODE, "isCercanias", "", "(Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "widget_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GetWidgetInfoUseCase {
    private static final String rodaliesCommuterNetwork = "RODALIES_CATALUNYA";
    private final GetStationByIdUseCase getStationByIdUseCase;

    @Inject
    public GetWidgetInfoUseCase(GetStationByIdUseCase getStationByIdUseCase) {
        Intrinsics.checkNotNullParameter(getStationByIdUseCase, "getStationByIdUseCase");
        this.getStationByIdUseCase = getStationByIdUseCase;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0079, code lost:
    
        if (r2 == r4) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x009d A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.String r21, java.lang.String r22, boolean r23, kotlin.coroutines.Continuation<? super com.adif.elcanomovil.serviceStorage.model.FavouriteEntity> r24) {
        /*
            Method dump skipped, instructions count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.widget.domain.usecases.GetWidgetInfoUseCase.invoke(java.lang.String, java.lang.String, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
