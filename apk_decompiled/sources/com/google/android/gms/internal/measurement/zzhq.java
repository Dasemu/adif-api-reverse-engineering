package com.google.android.gms.internal.measurement;

import android.net.Uri;
import s.e;
import s.j;

/* loaded from: classes3.dex */
public final class zzhq {
    private static final e zza = new j(0);

    public static synchronized Uri zza(String str) {
        synchronized (zzhq.class) {
            e eVar = zza;
            Uri uri = (Uri) eVar.get("com.google.android.gms.measurement");
            if (uri != null) {
                return uri;
            }
            Uri parse = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.measurement"))));
            eVar.put("com.google.android.gms.measurement", parse);
            return parse;
        }
    }
}
