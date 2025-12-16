package com.google.android.gms.common.internal;

import android.content.Intent;
import androidx.fragment.app.K;

/* loaded from: classes3.dex */
final class zae extends zag {
    final /* synthetic */ Intent zaa;
    final /* synthetic */ K zab;
    final /* synthetic */ int zac;

    public zae(Intent intent, K k4, int i) {
        this.zaa = intent;
        this.zab = k4;
        this.zac = i;
    }

    @Override // com.google.android.gms.common.internal.zag
    public final void zaa() {
        Intent intent = this.zaa;
        if (intent != null) {
            this.zab.startActivityForResult(intent, this.zac);
        }
    }
}
