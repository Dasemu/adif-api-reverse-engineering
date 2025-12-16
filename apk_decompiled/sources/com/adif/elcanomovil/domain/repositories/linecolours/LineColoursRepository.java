package com.adif.elcanomovil.domain.repositories.linecolours;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H¦@¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/adif/elcanomovil/domain/repositories/linecolours/LineColoursRepository;", "", "getLineColorRGB", "", "lineName", "stationStepCode", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface LineColoursRepository {
    Object getLineColorRGB(String str, String str2, Continuation<? super String> continuation);
}
