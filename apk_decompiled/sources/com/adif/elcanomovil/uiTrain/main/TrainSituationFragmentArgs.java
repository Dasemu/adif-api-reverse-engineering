package com.adif.elcanomovil.uiTrain.main;

import android.os.Bundle;
import androidx.lifecycle.n0;
import com.adif.elcanomovil.commonNavGraph.arguments.NavArguments;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o0.InterfaceC0530g;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u0000 32\u00020\u0001:\u00013Be\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0015J\u0010\u0010\u0018\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0015J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0015J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0015J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0015Jn\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0015J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0015R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b,\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b.\u0010\u0019R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b/\u0010\u0015R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b0\u0010\u0015R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010)\u001a\u0004\b1\u0010\u0015R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b2\u0010\u0015¨\u00064"}, d2 = {"Lcom/adif/elcanomovil/uiTrain/main/TrainSituationFragmentArgs;", "Lo0/g;", "", NavArguments.ARG_DYNAMIC_LINKS_COMMERCIAL_NUMBER, NavArguments.ARG_DYNAMIC_LINKS_STATION_CODE, NavArguments.ARG_DYNAMIC_LINKS_STATION_TO_CODE, "", NavArguments.ARG_DYNAMIC_LINKS_LAUNCHDATE, NavArguments.ARG_DYNAMIC_LINKS_OPERATOR, NavArguments.ARG_DYNAMIC_LINKS_COMMERCIAL_PRODUCT, "observation", NavArguments.ARG_DYNAMIC_LINKS_FRAGMENT_FROM, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Bundle;", "toBundle", "()Landroid/os/Bundle;", "Landroidx/lifecycle/n0;", "toSavedStateHandle", "()Landroidx/lifecycle/n0;", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()J", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/adif/elcanomovil/uiTrain/main/TrainSituationFragmentArgs;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCommercialNumber", "getOriginStationCode", "getDestinationStationCode", "J", "getLaunchingDate", "getOperator", "getCommercialProduct", "getObservation", "getFragmentFrom", "Companion", "common-nav-graph_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TrainSituationFragmentArgs implements InterfaceC0530g {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String commercialNumber;
    private final String commercialProduct;
    private final String destinationStationCode;
    private final String fragmentFrom;
    private final long launchingDate;
    private final String observation;
    private final String operator;
    private final String originStationCode;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/adif/elcanomovil/uiTrain/main/TrainSituationFragmentArgs$Companion;", "", "<init>", "()V", "Landroid/os/Bundle;", "bundle", "Lcom/adif/elcanomovil/uiTrain/main/TrainSituationFragmentArgs;", "fromBundle", "(Landroid/os/Bundle;)Lcom/adif/elcanomovil/uiTrain/main/TrainSituationFragmentArgs;", "Landroidx/lifecycle/n0;", "savedStateHandle", "fromSavedStateHandle", "(Landroidx/lifecycle/n0;)Lcom/adif/elcanomovil/uiTrain/main/TrainSituationFragmentArgs;", "common-nav-graph_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final TrainSituationFragmentArgs fromBundle(Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.setClassLoader(TrainSituationFragmentArgs.class.getClassLoader());
            return new TrainSituationFragmentArgs(bundle.containsKey(NavArguments.ARG_DYNAMIC_LINKS_COMMERCIAL_NUMBER) ? bundle.getString(NavArguments.ARG_DYNAMIC_LINKS_COMMERCIAL_NUMBER) : null, bundle.containsKey(NavArguments.ARG_DYNAMIC_LINKS_STATION_CODE) ? bundle.getString(NavArguments.ARG_DYNAMIC_LINKS_STATION_CODE) : null, bundle.containsKey(NavArguments.ARG_DYNAMIC_LINKS_STATION_TO_CODE) ? bundle.getString(NavArguments.ARG_DYNAMIC_LINKS_STATION_TO_CODE) : null, bundle.containsKey(NavArguments.ARG_DYNAMIC_LINKS_LAUNCHDATE) ? bundle.getLong(NavArguments.ARG_DYNAMIC_LINKS_LAUNCHDATE) : 0L, bundle.containsKey(NavArguments.ARG_DYNAMIC_LINKS_OPERATOR) ? bundle.getString(NavArguments.ARG_DYNAMIC_LINKS_OPERATOR) : "", bundle.containsKey(NavArguments.ARG_DYNAMIC_LINKS_COMMERCIAL_PRODUCT) ? bundle.getString(NavArguments.ARG_DYNAMIC_LINKS_COMMERCIAL_PRODUCT) : "", bundle.containsKey("observation") ? bundle.getString("observation") : null, bundle.containsKey(NavArguments.ARG_DYNAMIC_LINKS_FRAGMENT_FROM) ? bundle.getString(NavArguments.ARG_DYNAMIC_LINKS_FRAGMENT_FROM) : null);
        }

        @JvmStatic
        public final TrainSituationFragmentArgs fromSavedStateHandle(n0 savedStateHandle) {
            Long l4;
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            String str = savedStateHandle.b(NavArguments.ARG_DYNAMIC_LINKS_COMMERCIAL_NUMBER) ? (String) savedStateHandle.c(NavArguments.ARG_DYNAMIC_LINKS_COMMERCIAL_NUMBER) : null;
            String str2 = savedStateHandle.b(NavArguments.ARG_DYNAMIC_LINKS_STATION_CODE) ? (String) savedStateHandle.c(NavArguments.ARG_DYNAMIC_LINKS_STATION_CODE) : null;
            String str3 = savedStateHandle.b(NavArguments.ARG_DYNAMIC_LINKS_STATION_TO_CODE) ? (String) savedStateHandle.c(NavArguments.ARG_DYNAMIC_LINKS_STATION_TO_CODE) : null;
            if (savedStateHandle.b(NavArguments.ARG_DYNAMIC_LINKS_LAUNCHDATE)) {
                l4 = (Long) savedStateHandle.c(NavArguments.ARG_DYNAMIC_LINKS_LAUNCHDATE);
                if (l4 == null) {
                    throw new IllegalArgumentException("Argument \"launchingDate\" of type long does not support null values");
                }
            } else {
                l4 = 0L;
            }
            return new TrainSituationFragmentArgs(str, str2, str3, l4.longValue(), savedStateHandle.b(NavArguments.ARG_DYNAMIC_LINKS_OPERATOR) ? (String) savedStateHandle.c(NavArguments.ARG_DYNAMIC_LINKS_OPERATOR) : "", savedStateHandle.b(NavArguments.ARG_DYNAMIC_LINKS_COMMERCIAL_PRODUCT) ? (String) savedStateHandle.c(NavArguments.ARG_DYNAMIC_LINKS_COMMERCIAL_PRODUCT) : "", savedStateHandle.b("observation") ? (String) savedStateHandle.c("observation") : null, savedStateHandle.b(NavArguments.ARG_DYNAMIC_LINKS_FRAGMENT_FROM) ? (String) savedStateHandle.c(NavArguments.ARG_DYNAMIC_LINKS_FRAGMENT_FROM) : null);
        }

        private Companion() {
        }
    }

    public TrainSituationFragmentArgs() {
        this(null, null, null, 0L, null, null, null, null, KotlinVersion.MAX_COMPONENT_VALUE, null);
    }

    public static /* synthetic */ TrainSituationFragmentArgs copy$default(TrainSituationFragmentArgs trainSituationFragmentArgs, String str, String str2, String str3, long j4, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = trainSituationFragmentArgs.commercialNumber;
        }
        if ((i & 2) != 0) {
            str2 = trainSituationFragmentArgs.originStationCode;
        }
        if ((i & 4) != 0) {
            str3 = trainSituationFragmentArgs.destinationStationCode;
        }
        if ((i & 8) != 0) {
            j4 = trainSituationFragmentArgs.launchingDate;
        }
        if ((i & 16) != 0) {
            str4 = trainSituationFragmentArgs.operator;
        }
        if ((i & 32) != 0) {
            str5 = trainSituationFragmentArgs.commercialProduct;
        }
        if ((i & 64) != 0) {
            str6 = trainSituationFragmentArgs.observation;
        }
        if ((i & 128) != 0) {
            str7 = trainSituationFragmentArgs.fragmentFrom;
        }
        long j5 = j4;
        String str8 = str3;
        return trainSituationFragmentArgs.copy(str, str2, str8, j5, str4, str5, str6, str7);
    }

    @JvmStatic
    public static final TrainSituationFragmentArgs fromBundle(Bundle bundle) {
        return INSTANCE.fromBundle(bundle);
    }

    @JvmStatic
    public static final TrainSituationFragmentArgs fromSavedStateHandle(n0 n0Var) {
        return INSTANCE.fromSavedStateHandle(n0Var);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCommercialNumber() {
        return this.commercialNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final String getOriginStationCode() {
        return this.originStationCode;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDestinationStationCode() {
        return this.destinationStationCode;
    }

    /* renamed from: component4, reason: from getter */
    public final long getLaunchingDate() {
        return this.launchingDate;
    }

    /* renamed from: component5, reason: from getter */
    public final String getOperator() {
        return this.operator;
    }

    /* renamed from: component6, reason: from getter */
    public final String getCommercialProduct() {
        return this.commercialProduct;
    }

    /* renamed from: component7, reason: from getter */
    public final String getObservation() {
        return this.observation;
    }

    /* renamed from: component8, reason: from getter */
    public final String getFragmentFrom() {
        return this.fragmentFrom;
    }

    public final TrainSituationFragmentArgs copy(String commercialNumber, String originStationCode, String destinationStationCode, long launchingDate, String operator, String commercialProduct, String observation, String fragmentFrom) {
        return new TrainSituationFragmentArgs(commercialNumber, originStationCode, destinationStationCode, launchingDate, operator, commercialProduct, observation, fragmentFrom);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrainSituationFragmentArgs)) {
            return false;
        }
        TrainSituationFragmentArgs trainSituationFragmentArgs = (TrainSituationFragmentArgs) other;
        return Intrinsics.areEqual(this.commercialNumber, trainSituationFragmentArgs.commercialNumber) && Intrinsics.areEqual(this.originStationCode, trainSituationFragmentArgs.originStationCode) && Intrinsics.areEqual(this.destinationStationCode, trainSituationFragmentArgs.destinationStationCode) && this.launchingDate == trainSituationFragmentArgs.launchingDate && Intrinsics.areEqual(this.operator, trainSituationFragmentArgs.operator) && Intrinsics.areEqual(this.commercialProduct, trainSituationFragmentArgs.commercialProduct) && Intrinsics.areEqual(this.observation, trainSituationFragmentArgs.observation) && Intrinsics.areEqual(this.fragmentFrom, trainSituationFragmentArgs.fragmentFrom);
    }

    public final String getCommercialNumber() {
        return this.commercialNumber;
    }

    public final String getCommercialProduct() {
        return this.commercialProduct;
    }

    public final String getDestinationStationCode() {
        return this.destinationStationCode;
    }

    public final String getFragmentFrom() {
        return this.fragmentFrom;
    }

    public final long getLaunchingDate() {
        return this.launchingDate;
    }

    public final String getObservation() {
        return this.observation;
    }

    public final String getOperator() {
        return this.operator;
    }

    public final String getOriginStationCode() {
        return this.originStationCode;
    }

    public int hashCode() {
        String str = this.commercialNumber;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.originStationCode;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.destinationStationCode;
        int b4 = com.google.android.gms.measurement.internal.a.b(this.launchingDate, (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31);
        String str4 = this.operator;
        int hashCode3 = (b4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.commercialProduct;
        int hashCode4 = (hashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.observation;
        int hashCode5 = (hashCode4 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.fragmentFrom;
        return hashCode5 + (str7 != null ? str7.hashCode() : 0);
    }

    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putString(NavArguments.ARG_DYNAMIC_LINKS_COMMERCIAL_NUMBER, this.commercialNumber);
        bundle.putString(NavArguments.ARG_DYNAMIC_LINKS_STATION_CODE, this.originStationCode);
        bundle.putString(NavArguments.ARG_DYNAMIC_LINKS_STATION_TO_CODE, this.destinationStationCode);
        bundle.putLong(NavArguments.ARG_DYNAMIC_LINKS_LAUNCHDATE, this.launchingDate);
        bundle.putString(NavArguments.ARG_DYNAMIC_LINKS_OPERATOR, this.operator);
        bundle.putString(NavArguments.ARG_DYNAMIC_LINKS_COMMERCIAL_PRODUCT, this.commercialProduct);
        bundle.putString("observation", this.observation);
        bundle.putString(NavArguments.ARG_DYNAMIC_LINKS_FRAGMENT_FROM, this.fragmentFrom);
        return bundle;
    }

    public final n0 toSavedStateHandle() {
        n0 n0Var = new n0();
        n0Var.d(this.commercialNumber, NavArguments.ARG_DYNAMIC_LINKS_COMMERCIAL_NUMBER);
        n0Var.d(this.originStationCode, NavArguments.ARG_DYNAMIC_LINKS_STATION_CODE);
        n0Var.d(this.destinationStationCode, NavArguments.ARG_DYNAMIC_LINKS_STATION_TO_CODE);
        n0Var.d(Long.valueOf(this.launchingDate), NavArguments.ARG_DYNAMIC_LINKS_LAUNCHDATE);
        n0Var.d(this.operator, NavArguments.ARG_DYNAMIC_LINKS_OPERATOR);
        n0Var.d(this.commercialProduct, NavArguments.ARG_DYNAMIC_LINKS_COMMERCIAL_PRODUCT);
        n0Var.d(this.observation, "observation");
        n0Var.d(this.fragmentFrom, NavArguments.ARG_DYNAMIC_LINKS_FRAGMENT_FROM);
        return n0Var;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TrainSituationFragmentArgs(commercialNumber=");
        sb.append(this.commercialNumber);
        sb.append(", originStationCode=");
        sb.append(this.originStationCode);
        sb.append(", destinationStationCode=");
        sb.append(this.destinationStationCode);
        sb.append(", launchingDate=");
        sb.append(this.launchingDate);
        sb.append(", operator=");
        sb.append(this.operator);
        sb.append(", commercialProduct=");
        sb.append(this.commercialProduct);
        sb.append(", observation=");
        sb.append(this.observation);
        sb.append(", fragmentFrom=");
        return com.google.android.gms.measurement.internal.a.n(sb, this.fragmentFrom, ')');
    }

    public TrainSituationFragmentArgs(String str, String str2, String str3, long j4, String str4, String str5, String str6, String str7) {
        this.commercialNumber = str;
        this.originStationCode = str2;
        this.destinationStationCode = str3;
        this.launchingDate = j4;
        this.operator = str4;
        this.commercialProduct = str5;
        this.observation = str6;
        this.fragmentFrom = str7;
    }

    public /* synthetic */ TrainSituationFragmentArgs(String str, String str2, String str3, long j4, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? 0L : j4, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7);
    }
}
