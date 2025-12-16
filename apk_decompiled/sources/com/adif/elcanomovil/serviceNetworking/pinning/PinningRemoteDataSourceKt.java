package com.adif.elcanomovil.serviceNetworking.pinning;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.json.JSONArray;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u0002¨\u0006\u0004"}, d2 = {"asList", "", "T", "Lorg/json/JSONArray;", "service-networking_proNon_corporateRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PinningRemoteDataSourceKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> List<T> asList(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            arrayList.add(jSONArray.get(i));
        }
        return arrayList;
    }
}
