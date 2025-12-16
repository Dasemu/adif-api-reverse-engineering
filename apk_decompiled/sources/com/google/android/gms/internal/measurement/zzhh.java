package com.google.android.gms.internal.measurement;

import android.net.Uri;
import s.j;

/* loaded from: classes3.dex */
public final class zzhh {
    private final j zza;

    public zzhh(j jVar) {
        this.zza = jVar;
    }

    public final String zza(Uri uri, String str, String str2, String str3) {
        j jVar;
        if (uri != null) {
            jVar = (j) this.zza.get(uri.toString());
        } else {
            jVar = null;
        }
        if (jVar == null) {
            return null;
        }
        return (String) jVar.get("".concat(str3));
    }
}
