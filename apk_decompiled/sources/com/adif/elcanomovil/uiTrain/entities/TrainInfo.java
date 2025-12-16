package com.adif.elcanomovil.uiTrain.entities;

import com.adif.elcanomovil.commonNavGraph.arguments.NavArguments;
import com.adif.elcanomovil.domain.entities.compositions.Wagon;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u000e\u0012\u0006\u0010\u0013\u001a\u00020\f¢\u0006\u0002\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0013\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010!R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0016\"\u0004\b%\u0010&R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001fR \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0019\"\u0004\b*\u0010\u001b¨\u0006+"}, d2 = {"Lcom/adif/elcanomovil/uiTrain/entities/TrainInfo;", "", NavArguments.ARG_DYNAMIC_LINKS_OPERATOR, "", NavArguments.ARG_DYNAMIC_LINKS_COMMERCIAL_PRODUCT, NavArguments.ARG_DYNAMIC_LINKS_COMMERCIAL_NUMBER, "originStation", "Lcom/adif/elcanomovil/uiTrain/entities/TrainInfoStation;", "destinationStation", "date", "Ljava/util/Date;", "isCercanias", "", "steps", "", "Lcom/adif/elcanomovil/uiTrain/entities/StepItems;", "observations", "composition", "Lcom/adif/elcanomovil/domain/entities/compositions/Wagon;", "extended", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/adif/elcanomovil/uiTrain/entities/TrainInfoStation;Lcom/adif/elcanomovil/uiTrain/entities/TrainInfoStation;Ljava/util/Date;ZLjava/util/List;Ljava/lang/String;Ljava/util/List;Z)V", "getCommercialNumber", "()Ljava/lang/String;", "getCommercialProduct", "getComposition", "()Ljava/util/List;", "setComposition", "(Ljava/util/List;)V", "getDate", "()Ljava/util/Date;", "getDestinationStation", "()Lcom/adif/elcanomovil/uiTrain/entities/TrainInfoStation;", "getExtended", "()Z", "setExtended", "(Z)V", "getObservations", "setObservations", "(Ljava/lang/String;)V", "getOperator", "getOriginStation", "getSteps", "setSteps", "ui-train_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TrainInfo {
    private final String commercialNumber;
    private final String commercialProduct;
    private List<? extends Wagon> composition;
    private final Date date;
    private final TrainInfoStation destinationStation;
    private boolean extended;
    private final boolean isCercanias;
    private String observations;
    private final String operator;
    private final TrainInfoStation originStation;
    private List<? extends StepItems> steps;

    public TrainInfo(String operator, String commercialProduct, String commercialNumber, TrainInfoStation originStation, TrainInfoStation destinationStation, Date date, boolean z3, List<? extends StepItems> steps, String str, List<? extends Wagon> composition, boolean z4) {
        Intrinsics.checkNotNullParameter(operator, "operator");
        Intrinsics.checkNotNullParameter(commercialProduct, "commercialProduct");
        Intrinsics.checkNotNullParameter(commercialNumber, "commercialNumber");
        Intrinsics.checkNotNullParameter(originStation, "originStation");
        Intrinsics.checkNotNullParameter(destinationStation, "destinationStation");
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(steps, "steps");
        Intrinsics.checkNotNullParameter(composition, "composition");
        this.operator = operator;
        this.commercialProduct = commercialProduct;
        this.commercialNumber = commercialNumber;
        this.originStation = originStation;
        this.destinationStation = destinationStation;
        this.date = date;
        this.isCercanias = z3;
        this.steps = steps;
        this.observations = str;
        this.composition = composition;
        this.extended = z4;
    }

    public final String getCommercialNumber() {
        return this.commercialNumber;
    }

    public final String getCommercialProduct() {
        return this.commercialProduct;
    }

    public final List<Wagon> getComposition() {
        return this.composition;
    }

    public final Date getDate() {
        return this.date;
    }

    public final TrainInfoStation getDestinationStation() {
        return this.destinationStation;
    }

    public final boolean getExtended() {
        return this.extended;
    }

    public final String getObservations() {
        return this.observations;
    }

    public final String getOperator() {
        return this.operator;
    }

    public final TrainInfoStation getOriginStation() {
        return this.originStation;
    }

    public final List<StepItems> getSteps() {
        return this.steps;
    }

    /* renamed from: isCercanias, reason: from getter */
    public final boolean getIsCercanias() {
        return this.isCercanias;
    }

    public final void setComposition(List<? extends Wagon> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.composition = list;
    }

    public final void setExtended(boolean z3) {
        this.extended = z3;
    }

    public final void setObservations(String str) {
        this.observations = str;
    }

    public final void setSteps(List<? extends StepItems> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.steps = list;
    }
}
