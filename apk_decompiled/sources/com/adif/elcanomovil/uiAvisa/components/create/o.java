package com.adif.elcanomovil.uiAvisa.components.create;

import androidx.lifecycle.W;
import com.adif.elcanomovil.domain.entities.utils.AsyncResult;
import com.adif.elcanomovil.domain.entities.utils.Status;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes.dex */
public final class o implements FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4854a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NewIssueViewModel f4855b;

    public /* synthetic */ o(NewIssueViewModel newIssueViewModel, int i) {
        this.f4854a = i;
        this.f4855b = newIssueViewModel;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        W w3;
        W w4;
        W w5;
        switch (this.f4854a) {
            case 0:
                w3 = this.f4855b._resultCreateIncidence;
                w3.k((AsyncResult) obj);
                return Unit.INSTANCE;
            case 1:
                w4 = this.f4855b._listCategories;
                w4.k((AsyncResult) obj);
                return Unit.INSTANCE;
            default:
                AsyncResult asyncResult = (AsyncResult) obj;
                NewIssueViewModel newIssueViewModel = this.f4855b;
                w5 = newIssueViewModel._avisaStationList;
                w5.k(asyncResult);
                if (asyncResult.getStatus() == Status.SUCCESS) {
                    Object data = asyncResult.getData();
                    Intrinsics.checkNotNull(data, "null cannot be cast to non-null type kotlin.collections.MutableList<com.adif.elcanomovil.domain.entities.avisa.AvisaStation>");
                    newIssueViewModel.avistaStations = TypeIntrinsics.asMutableList(data);
                }
                return Unit.INSTANCE;
        }
    }
}
