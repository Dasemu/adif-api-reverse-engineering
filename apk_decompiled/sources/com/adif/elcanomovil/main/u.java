package com.adif.elcanomovil.main;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* loaded from: classes.dex */
public final /* synthetic */ class u implements OnCompleteListener {
    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        MainViewModel.requestFirebaseMessagingToken$lambda$0(task);
    }
}
