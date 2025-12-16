package com.adif.elcanomovil.uiSubscriptions.create;

import C.w;
import android.os.Bundle;
import androidx.lifecycle.n0;
import com.adif.elcanomovil.commonNavGraph.arguments.NavArguments;
import kotlin.Metadata;
import kotlin.io.ConstantsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o0.InterfaceC0530g;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0086\b\u0018\u0000 92\u00020\u0001:\u00019Be\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001bJ\u0010\u0010 \u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\"\u0010\u001bJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b#\u0010\u001bJ\u0082\u0001\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b&\u0010\u001bJ\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u0018J\u001a\u0010*\u001a\u00020\u000b2\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b.\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b0\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b1\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b2\u0010\u001bR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b3\u0010\u001bR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\n\u0010/\u001a\u0004\b4\u0010\u001bR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00105\u001a\u0004\b6\u0010!R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010/\u001a\u0004\b7\u0010\u001bR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u000e\u0010/\u001a\u0004\b8\u0010\u001b¨\u0006:"}, d2 = {"Lcom/adif/elcanomovil/uiSubscriptions/create/SubscriptionCreationFragmentArgs;", "Lo0/g;", "", "argTypeScreen", "argTypeSubscription", "", "argDataSubscription", "argTrainCodeSubscription", "argTrainDateSubscription", "argStationCodeSubscription", "argStationToCodeSubscription", "", "argIsCercaniasSubscription", "argOperatorTrain", "argCommercialProductTrain", "<init>", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "Landroid/os/Bundle;", "toBundle", "()Landroid/os/Bundle;", "Landroidx/lifecycle/n0;", "toSavedStateHandle", "()Landroidx/lifecycle/n0;", "component1", "()I", "component2", "component3", "()Ljava/lang/String;", "component4", "component5", "component6", "component7", "component8", "()Z", "component9", "component10", "copy", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)Lcom/adif/elcanomovil/uiSubscriptions/create/SubscriptionCreationFragmentArgs;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getArgTypeScreen", "getArgTypeSubscription", "Ljava/lang/String;", "getArgDataSubscription", "getArgTrainCodeSubscription", "getArgTrainDateSubscription", "getArgStationCodeSubscription", "getArgStationToCodeSubscription", "Z", "getArgIsCercaniasSubscription", "getArgOperatorTrain", "getArgCommercialProductTrain", "Companion", "common-nav-graph_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SubscriptionCreationFragmentArgs implements InterfaceC0530g {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String argCommercialProductTrain;
    private final String argDataSubscription;
    private final boolean argIsCercaniasSubscription;
    private final String argOperatorTrain;
    private final String argStationCodeSubscription;
    private final String argStationToCodeSubscription;
    private final String argTrainCodeSubscription;
    private final String argTrainDateSubscription;
    private final int argTypeScreen;
    private final int argTypeSubscription;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/adif/elcanomovil/uiSubscriptions/create/SubscriptionCreationFragmentArgs$Companion;", "", "<init>", "()V", "Landroid/os/Bundle;", "bundle", "Lcom/adif/elcanomovil/uiSubscriptions/create/SubscriptionCreationFragmentArgs;", "fromBundle", "(Landroid/os/Bundle;)Lcom/adif/elcanomovil/uiSubscriptions/create/SubscriptionCreationFragmentArgs;", "Landroidx/lifecycle/n0;", "savedStateHandle", "fromSavedStateHandle", "(Landroidx/lifecycle/n0;)Lcom/adif/elcanomovil/uiSubscriptions/create/SubscriptionCreationFragmentArgs;", "common-nav-graph_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final SubscriptionCreationFragmentArgs fromBundle(Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.setClassLoader(SubscriptionCreationFragmentArgs.class.getClassLoader());
            if (!bundle.containsKey("arg_type_screen")) {
                throw new IllegalArgumentException("Required argument \"arg_type_screen\" is missing and does not have an android:defaultValue");
            }
            int i = bundle.getInt("arg_type_screen");
            if (!bundle.containsKey(NavArguments.ARG_TYPE_SUBSCRIPTION)) {
                throw new IllegalArgumentException("Required argument \"arg_type_subscription\" is missing and does not have an android:defaultValue");
            }
            int i4 = bundle.getInt(NavArguments.ARG_TYPE_SUBSCRIPTION);
            if (!bundle.containsKey(NavArguments.ARG_DATA_SUBSCRIPTION)) {
                throw new IllegalArgumentException("Required argument \"arg_data_subscription\" is missing and does not have an android:defaultValue");
            }
            String string = bundle.getString(NavArguments.ARG_DATA_SUBSCRIPTION);
            if (!bundle.containsKey(NavArguments.ARG_TRAIN_CODE_SUBSCRIPTION)) {
                throw new IllegalArgumentException("Required argument \"arg_trainCode_subscription\" is missing and does not have an android:defaultValue");
            }
            String string2 = bundle.getString(NavArguments.ARG_TRAIN_CODE_SUBSCRIPTION);
            if (!bundle.containsKey(NavArguments.ARG_TRAIN_DATE_SUBSCRIPTION)) {
                throw new IllegalArgumentException("Required argument \"arg_trainDate_subscription\" is missing and does not have an android:defaultValue");
            }
            String string3 = bundle.getString(NavArguments.ARG_TRAIN_DATE_SUBSCRIPTION);
            if (!bundle.containsKey(NavArguments.ARG_STATION_CODE_SUBSCRIPTION)) {
                throw new IllegalArgumentException("Required argument \"arg_stationCode_subscription\" is missing and does not have an android:defaultValue");
            }
            String string4 = bundle.getString(NavArguments.ARG_STATION_CODE_SUBSCRIPTION);
            if (!bundle.containsKey(NavArguments.ARG_STATION_TO_CODE_SUBSCRIPTION)) {
                throw new IllegalArgumentException("Required argument \"arg_stationToCode_subscription\" is missing and does not have an android:defaultValue");
            }
            String string5 = bundle.getString(NavArguments.ARG_STATION_TO_CODE_SUBSCRIPTION);
            if (!bundle.containsKey(NavArguments.ARG_IS_CERCANIAS_SUBSCRIPTION)) {
                throw new IllegalArgumentException("Required argument \"arg_isCercanias_subscription\" is missing and does not have an android:defaultValue");
            }
            boolean z3 = bundle.getBoolean(NavArguments.ARG_IS_CERCANIAS_SUBSCRIPTION);
            if (!bundle.containsKey("arg_operator_train")) {
                throw new IllegalArgumentException("Required argument \"arg_operator_train\" is missing and does not have an android:defaultValue");
            }
            String string6 = bundle.getString("arg_operator_train");
            if (bundle.containsKey("arg_commercial_product_train")) {
                return new SubscriptionCreationFragmentArgs(i, i4, string, string2, string3, string4, string5, z3, string6, bundle.getString("arg_commercial_product_train"));
            }
            throw new IllegalArgumentException("Required argument \"arg_commercial_product_train\" is missing and does not have an android:defaultValue");
        }

        @JvmStatic
        public final SubscriptionCreationFragmentArgs fromSavedStateHandle(n0 savedStateHandle) {
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            if (!savedStateHandle.b("arg_type_screen")) {
                throw new IllegalArgumentException("Required argument \"arg_type_screen\" is missing and does not have an android:defaultValue");
            }
            Integer num = (Integer) savedStateHandle.c("arg_type_screen");
            if (num == null) {
                throw new IllegalArgumentException("Argument \"arg_type_screen\" of type integer does not support null values");
            }
            if (!savedStateHandle.b(NavArguments.ARG_TYPE_SUBSCRIPTION)) {
                throw new IllegalArgumentException("Required argument \"arg_type_subscription\" is missing and does not have an android:defaultValue");
            }
            Integer num2 = (Integer) savedStateHandle.c(NavArguments.ARG_TYPE_SUBSCRIPTION);
            if (num2 == null) {
                throw new IllegalArgumentException("Argument \"arg_type_subscription\" of type integer does not support null values");
            }
            if (!savedStateHandle.b(NavArguments.ARG_DATA_SUBSCRIPTION)) {
                throw new IllegalArgumentException("Required argument \"arg_data_subscription\" is missing and does not have an android:defaultValue");
            }
            String str = (String) savedStateHandle.c(NavArguments.ARG_DATA_SUBSCRIPTION);
            if (!savedStateHandle.b(NavArguments.ARG_TRAIN_CODE_SUBSCRIPTION)) {
                throw new IllegalArgumentException("Required argument \"arg_trainCode_subscription\" is missing and does not have an android:defaultValue");
            }
            String str2 = (String) savedStateHandle.c(NavArguments.ARG_TRAIN_CODE_SUBSCRIPTION);
            if (!savedStateHandle.b(NavArguments.ARG_TRAIN_DATE_SUBSCRIPTION)) {
                throw new IllegalArgumentException("Required argument \"arg_trainDate_subscription\" is missing and does not have an android:defaultValue");
            }
            String str3 = (String) savedStateHandle.c(NavArguments.ARG_TRAIN_DATE_SUBSCRIPTION);
            if (!savedStateHandle.b(NavArguments.ARG_STATION_CODE_SUBSCRIPTION)) {
                throw new IllegalArgumentException("Required argument \"arg_stationCode_subscription\" is missing and does not have an android:defaultValue");
            }
            String str4 = (String) savedStateHandle.c(NavArguments.ARG_STATION_CODE_SUBSCRIPTION);
            if (!savedStateHandle.b(NavArguments.ARG_STATION_TO_CODE_SUBSCRIPTION)) {
                throw new IllegalArgumentException("Required argument \"arg_stationToCode_subscription\" is missing and does not have an android:defaultValue");
            }
            String str5 = (String) savedStateHandle.c(NavArguments.ARG_STATION_TO_CODE_SUBSCRIPTION);
            if (!savedStateHandle.b(NavArguments.ARG_IS_CERCANIAS_SUBSCRIPTION)) {
                throw new IllegalArgumentException("Required argument \"arg_isCercanias_subscription\" is missing and does not have an android:defaultValue");
            }
            Boolean bool = (Boolean) savedStateHandle.c(NavArguments.ARG_IS_CERCANIAS_SUBSCRIPTION);
            if (bool == null) {
                throw new IllegalArgumentException("Argument \"arg_isCercanias_subscription\" of type boolean does not support null values");
            }
            if (!savedStateHandle.b("arg_operator_train")) {
                throw new IllegalArgumentException("Required argument \"arg_operator_train\" is missing and does not have an android:defaultValue");
            }
            String str6 = (String) savedStateHandle.c("arg_operator_train");
            if (!savedStateHandle.b("arg_commercial_product_train")) {
                throw new IllegalArgumentException("Required argument \"arg_commercial_product_train\" is missing and does not have an android:defaultValue");
            }
            return new SubscriptionCreationFragmentArgs(num.intValue(), num2.intValue(), str, str2, str3, str4, str5, bool.booleanValue(), str6, (String) savedStateHandle.c("arg_commercial_product_train"));
        }

        private Companion() {
        }
    }

    public SubscriptionCreationFragmentArgs(int i, int i4, String str, String str2, String str3, String str4, String str5, boolean z3, String str6, String str7) {
        this.argTypeScreen = i;
        this.argTypeSubscription = i4;
        this.argDataSubscription = str;
        this.argTrainCodeSubscription = str2;
        this.argTrainDateSubscription = str3;
        this.argStationCodeSubscription = str4;
        this.argStationToCodeSubscription = str5;
        this.argIsCercaniasSubscription = z3;
        this.argOperatorTrain = str6;
        this.argCommercialProductTrain = str7;
    }

    public static /* synthetic */ SubscriptionCreationFragmentArgs copy$default(SubscriptionCreationFragmentArgs subscriptionCreationFragmentArgs, int i, int i4, String str, String str2, String str3, String str4, String str5, boolean z3, String str6, String str7, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = subscriptionCreationFragmentArgs.argTypeScreen;
        }
        if ((i5 & 2) != 0) {
            i4 = subscriptionCreationFragmentArgs.argTypeSubscription;
        }
        if ((i5 & 4) != 0) {
            str = subscriptionCreationFragmentArgs.argDataSubscription;
        }
        if ((i5 & 8) != 0) {
            str2 = subscriptionCreationFragmentArgs.argTrainCodeSubscription;
        }
        if ((i5 & 16) != 0) {
            str3 = subscriptionCreationFragmentArgs.argTrainDateSubscription;
        }
        if ((i5 & 32) != 0) {
            str4 = subscriptionCreationFragmentArgs.argStationCodeSubscription;
        }
        if ((i5 & 64) != 0) {
            str5 = subscriptionCreationFragmentArgs.argStationToCodeSubscription;
        }
        if ((i5 & 128) != 0) {
            z3 = subscriptionCreationFragmentArgs.argIsCercaniasSubscription;
        }
        if ((i5 & 256) != 0) {
            str6 = subscriptionCreationFragmentArgs.argOperatorTrain;
        }
        if ((i5 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
            str7 = subscriptionCreationFragmentArgs.argCommercialProductTrain;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str5;
        boolean z4 = z3;
        String str11 = str3;
        String str12 = str4;
        return subscriptionCreationFragmentArgs.copy(i, i4, str, str2, str11, str12, str10, z4, str8, str9);
    }

    @JvmStatic
    public static final SubscriptionCreationFragmentArgs fromBundle(Bundle bundle) {
        return INSTANCE.fromBundle(bundle);
    }

    @JvmStatic
    public static final SubscriptionCreationFragmentArgs fromSavedStateHandle(n0 n0Var) {
        return INSTANCE.fromSavedStateHandle(n0Var);
    }

    /* renamed from: component1, reason: from getter */
    public final int getArgTypeScreen() {
        return this.argTypeScreen;
    }

    /* renamed from: component10, reason: from getter */
    public final String getArgCommercialProductTrain() {
        return this.argCommercialProductTrain;
    }

    /* renamed from: component2, reason: from getter */
    public final int getArgTypeSubscription() {
        return this.argTypeSubscription;
    }

    /* renamed from: component3, reason: from getter */
    public final String getArgDataSubscription() {
        return this.argDataSubscription;
    }

    /* renamed from: component4, reason: from getter */
    public final String getArgTrainCodeSubscription() {
        return this.argTrainCodeSubscription;
    }

    /* renamed from: component5, reason: from getter */
    public final String getArgTrainDateSubscription() {
        return this.argTrainDateSubscription;
    }

    /* renamed from: component6, reason: from getter */
    public final String getArgStationCodeSubscription() {
        return this.argStationCodeSubscription;
    }

    /* renamed from: component7, reason: from getter */
    public final String getArgStationToCodeSubscription() {
        return this.argStationToCodeSubscription;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getArgIsCercaniasSubscription() {
        return this.argIsCercaniasSubscription;
    }

    /* renamed from: component9, reason: from getter */
    public final String getArgOperatorTrain() {
        return this.argOperatorTrain;
    }

    public final SubscriptionCreationFragmentArgs copy(int argTypeScreen, int argTypeSubscription, String argDataSubscription, String argTrainCodeSubscription, String argTrainDateSubscription, String argStationCodeSubscription, String argStationToCodeSubscription, boolean argIsCercaniasSubscription, String argOperatorTrain, String argCommercialProductTrain) {
        return new SubscriptionCreationFragmentArgs(argTypeScreen, argTypeSubscription, argDataSubscription, argTrainCodeSubscription, argTrainDateSubscription, argStationCodeSubscription, argStationToCodeSubscription, argIsCercaniasSubscription, argOperatorTrain, argCommercialProductTrain);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubscriptionCreationFragmentArgs)) {
            return false;
        }
        SubscriptionCreationFragmentArgs subscriptionCreationFragmentArgs = (SubscriptionCreationFragmentArgs) other;
        return this.argTypeScreen == subscriptionCreationFragmentArgs.argTypeScreen && this.argTypeSubscription == subscriptionCreationFragmentArgs.argTypeSubscription && Intrinsics.areEqual(this.argDataSubscription, subscriptionCreationFragmentArgs.argDataSubscription) && Intrinsics.areEqual(this.argTrainCodeSubscription, subscriptionCreationFragmentArgs.argTrainCodeSubscription) && Intrinsics.areEqual(this.argTrainDateSubscription, subscriptionCreationFragmentArgs.argTrainDateSubscription) && Intrinsics.areEqual(this.argStationCodeSubscription, subscriptionCreationFragmentArgs.argStationCodeSubscription) && Intrinsics.areEqual(this.argStationToCodeSubscription, subscriptionCreationFragmentArgs.argStationToCodeSubscription) && this.argIsCercaniasSubscription == subscriptionCreationFragmentArgs.argIsCercaniasSubscription && Intrinsics.areEqual(this.argOperatorTrain, subscriptionCreationFragmentArgs.argOperatorTrain) && Intrinsics.areEqual(this.argCommercialProductTrain, subscriptionCreationFragmentArgs.argCommercialProductTrain);
    }

    public final String getArgCommercialProductTrain() {
        return this.argCommercialProductTrain;
    }

    public final String getArgDataSubscription() {
        return this.argDataSubscription;
    }

    public final boolean getArgIsCercaniasSubscription() {
        return this.argIsCercaniasSubscription;
    }

    public final String getArgOperatorTrain() {
        return this.argOperatorTrain;
    }

    public final String getArgStationCodeSubscription() {
        return this.argStationCodeSubscription;
    }

    public final String getArgStationToCodeSubscription() {
        return this.argStationToCodeSubscription;
    }

    public final String getArgTrainCodeSubscription() {
        return this.argTrainCodeSubscription;
    }

    public final String getArgTrainDateSubscription() {
        return this.argTrainDateSubscription;
    }

    public final int getArgTypeScreen() {
        return this.argTypeScreen;
    }

    public final int getArgTypeSubscription() {
        return this.argTypeSubscription;
    }

    public int hashCode() {
        int x3 = w.x(this.argTypeSubscription, Integer.hashCode(this.argTypeScreen) * 31, 31);
        String str = this.argDataSubscription;
        int hashCode = (x3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.argTrainCodeSubscription;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.argTrainDateSubscription;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.argStationCodeSubscription;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.argStationToCodeSubscription;
        int c4 = w.c((hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.argIsCercaniasSubscription);
        String str6 = this.argOperatorTrain;
        int hashCode5 = (c4 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.argCommercialProductTrain;
        return hashCode5 + (str7 != null ? str7.hashCode() : 0);
    }

    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt("arg_type_screen", this.argTypeScreen);
        bundle.putInt(NavArguments.ARG_TYPE_SUBSCRIPTION, this.argTypeSubscription);
        bundle.putString(NavArguments.ARG_DATA_SUBSCRIPTION, this.argDataSubscription);
        bundle.putString(NavArguments.ARG_TRAIN_CODE_SUBSCRIPTION, this.argTrainCodeSubscription);
        bundle.putString(NavArguments.ARG_TRAIN_DATE_SUBSCRIPTION, this.argTrainDateSubscription);
        bundle.putString(NavArguments.ARG_STATION_CODE_SUBSCRIPTION, this.argStationCodeSubscription);
        bundle.putString(NavArguments.ARG_STATION_TO_CODE_SUBSCRIPTION, this.argStationToCodeSubscription);
        bundle.putBoolean(NavArguments.ARG_IS_CERCANIAS_SUBSCRIPTION, this.argIsCercaniasSubscription);
        bundle.putString("arg_operator_train", this.argOperatorTrain);
        bundle.putString("arg_commercial_product_train", this.argCommercialProductTrain);
        return bundle;
    }

    public final n0 toSavedStateHandle() {
        n0 n0Var = new n0();
        n0Var.d(Integer.valueOf(this.argTypeScreen), "arg_type_screen");
        n0Var.d(Integer.valueOf(this.argTypeSubscription), NavArguments.ARG_TYPE_SUBSCRIPTION);
        n0Var.d(this.argDataSubscription, NavArguments.ARG_DATA_SUBSCRIPTION);
        n0Var.d(this.argTrainCodeSubscription, NavArguments.ARG_TRAIN_CODE_SUBSCRIPTION);
        n0Var.d(this.argTrainDateSubscription, NavArguments.ARG_TRAIN_DATE_SUBSCRIPTION);
        n0Var.d(this.argStationCodeSubscription, NavArguments.ARG_STATION_CODE_SUBSCRIPTION);
        n0Var.d(this.argStationToCodeSubscription, NavArguments.ARG_STATION_TO_CODE_SUBSCRIPTION);
        n0Var.d(Boolean.valueOf(this.argIsCercaniasSubscription), NavArguments.ARG_IS_CERCANIAS_SUBSCRIPTION);
        n0Var.d(this.argOperatorTrain, "arg_operator_train");
        n0Var.d(this.argCommercialProductTrain, "arg_commercial_product_train");
        return n0Var;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SubscriptionCreationFragmentArgs(argTypeScreen=");
        sb.append(this.argTypeScreen);
        sb.append(", argTypeSubscription=");
        sb.append(this.argTypeSubscription);
        sb.append(", argDataSubscription=");
        sb.append(this.argDataSubscription);
        sb.append(", argTrainCodeSubscription=");
        sb.append(this.argTrainCodeSubscription);
        sb.append(", argTrainDateSubscription=");
        sb.append(this.argTrainDateSubscription);
        sb.append(", argStationCodeSubscription=");
        sb.append(this.argStationCodeSubscription);
        sb.append(", argStationToCodeSubscription=");
        sb.append(this.argStationToCodeSubscription);
        sb.append(", argIsCercaniasSubscription=");
        sb.append(this.argIsCercaniasSubscription);
        sb.append(", argOperatorTrain=");
        sb.append(this.argOperatorTrain);
        sb.append(", argCommercialProductTrain=");
        return com.google.android.gms.measurement.internal.a.n(sb, this.argCommercialProductTrain, ')');
    }
}
