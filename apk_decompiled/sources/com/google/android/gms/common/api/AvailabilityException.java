package com.google.android.gms.common.api;

import android.text.TextUtils;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.ApiKey;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.Iterator;
import s.C0581a;
import s.b;
import s.e;

/* loaded from: classes3.dex */
public class AvailabilityException extends Exception {
    private final e zaa;

    public AvailabilityException(e eVar) {
        this.zaa = eVar;
    }

    public ConnectionResult getConnectionResult(GoogleApi<? extends Api.ApiOptions> googleApi) {
        ApiKey<? extends Api.ApiOptions> apiKey = googleApi.getApiKey();
        boolean z3 = this.zaa.get(apiKey) != null;
        Preconditions.checkArgument(z3, "The given API (" + apiKey.zaa() + ") was not part of the availability request.");
        return (ConnectionResult) Preconditions.checkNotNull((ConnectionResult) this.zaa.get(apiKey));
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((b) this.zaa.keySet()).iterator();
        boolean z3 = true;
        while (true) {
            C0581a c0581a = (C0581a) it;
            if (!c0581a.hasNext()) {
                break;
            }
            ApiKey apiKey = (ApiKey) c0581a.next();
            ConnectionResult connectionResult = (ConnectionResult) Preconditions.checkNotNull((ConnectionResult) this.zaa.get(apiKey));
            z3 &= !connectionResult.isSuccess();
            arrayList.add(apiKey.zaa() + ": " + String.valueOf(connectionResult));
        }
        StringBuilder sb = new StringBuilder();
        if (z3) {
            sb.append("None of the queried APIs are available. ");
        } else {
            sb.append("Some of the queried APIs are unavailable. ");
        }
        sb.append(TextUtils.join("; ", arrayList));
        return sb.toString();
    }

    public ConnectionResult getConnectionResult(HasApiKey<? extends Api.ApiOptions> hasApiKey) {
        ApiKey<? extends Api.ApiOptions> apiKey = hasApiKey.getApiKey();
        boolean z3 = this.zaa.get(apiKey) != null;
        Preconditions.checkArgument(z3, "The given API (" + apiKey.zaa() + ") was not part of the availability request.");
        return (ConnectionResult) Preconditions.checkNotNull((ConnectionResult) this.zaa.get(apiKey));
    }
}
