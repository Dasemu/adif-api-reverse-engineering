package com.adif.elcanomovil.uiAvisa.components.home;

import com.adif.elcanomovil.domain.entities.utils.AsyncResult;
import com.adif.elcanomovil.domain.entities.utils.Status;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes.dex */
public final class d implements FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public static final d f4902a = new Object();

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        AsyncResult asyncResult = (AsyncResult) obj;
        if (asyncResult.getStatus() != Status.SUCCESS && asyncResult.getStatus() == Status.ERROR) {
            Intrinsics.checkNotNullParameter("FAIL Load Categoories", "message");
            t3.c.f8551a.e("FAIL Load Categoories", new Object[0]);
        }
        return Unit.INSTANCE;
    }
}
