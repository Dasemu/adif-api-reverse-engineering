package com.adif.elcanomovil.observers;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u00020\u0003H¦@¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/adif/elcanomovil/observers/ApplicationObserver;", "", "start", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface ApplicationObserver {
    Object start(Continuation<? super Unit> continuation);
}
