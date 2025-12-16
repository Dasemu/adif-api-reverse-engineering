package com.google.android.gms.internal.measurement;

import C.w;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzny extends IllegalArgumentException {
    public zzny(int i, int i4) {
        super(w.k("Unpaired surrogate at index ", i, i4, " of "));
    }
}
