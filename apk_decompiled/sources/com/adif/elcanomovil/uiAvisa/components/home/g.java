package com.adif.elcanomovil.uiAvisa.components.home;

import androidx.lifecycle.W;
import androidx.lifecycle.X;
import com.adif.elcanomovil.domain.entities.utils.AsyncResult;
import com.adif.elcanomovil.domain.entities.utils.Status;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes.dex */
public final class g implements FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4907a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AvisaHomeViewModel f4908b;

    public /* synthetic */ g(AvisaHomeViewModel avisaHomeViewModel, int i) {
        this.f4907a = i;
        this.f4908b = avisaHomeViewModel;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        W w3;
        W w4;
        X x3;
        W w5;
        X x4;
        switch (this.f4907a) {
            case 0:
                w3 = this.f4908b._userListIncidences;
                w3.k((AsyncResult) obj);
                return Unit.INSTANCE;
            default:
                AsyncResult asyncResult = (AsyncResult) obj;
                Status status = asyncResult.getStatus();
                Status status2 = Status.SUCCESS;
                AvisaHomeViewModel avisaHomeViewModel = this.f4908b;
                if (status == status2) {
                    w5 = avisaHomeViewModel._stationsList;
                    List list = (List) asyncResult.getData();
                    if (list == null) {
                        list = CollectionsKt.emptyList();
                    }
                    w5.k(list);
                    x4 = avisaHomeViewModel.canContinue;
                    x4.k(Boxing.boxBoolean(true));
                } else if (asyncResult.getStatus() == Status.ERROR) {
                    w4 = avisaHomeViewModel._stationsList;
                    w4.k(CollectionsKt.emptyList());
                    x3 = avisaHomeViewModel.canContinue;
                    x3.k(Boxing.boxBoolean(false));
                }
                return Unit.INSTANCE;
        }
    }
}
