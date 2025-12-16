package com.adif.elcanomovil.uiSubscriptions.create.views.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.adif.elcanomovil.commonNavGraph.arguments.NavArguments;
import com.adif.elcanomovil.domain.entities.subscription.SubscriptionType;
import com.adif.elcanomovil.uiSubscriptions.utils.AnticipationType;
import java.util.Date;
import kotlin.Metadata;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\bB\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000 c2\u00020\u0001:\u0001cB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004BÁ\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\u0002\u0010\u001bJ\t\u0010H\u001a\u00020\u0006HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\u0010\u0010O\u001a\u0004\u0018\u00010\u001aHÆ\u0003¢\u0006\u0002\u0010)J\u000b\u0010P\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\bHÆ\u0003JÌ\u0001\u0010X\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÆ\u0001¢\u0006\u0002\u0010YJ\b\u0010Z\u001a\u00020\u001aH\u0016J\u0013\u0010[\u001a\u00020\u00062\b\u0010\\\u001a\u0004\u0018\u00010]HÖ\u0003J\t\u0010^\u001a\u00020\u001aHÖ\u0001J\t\u0010_\u001a\u00020\bHÖ\u0001J\u0018\u0010`\u001a\u00020a2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010b\u001a\u00020\u001aH\u0016R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010!\"\u0004\b%\u0010#R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010!\"\u0004\b'\u0010#R\u001e\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0086\u000e¢\u0006\u0010\n\u0002\u0010,\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u00101\"\u0004\b2\u00103R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010!\"\u0004\b5\u0010#R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010!\"\u0004\b7\u0010#R\u001c\u0010\t\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010!\"\u0004\b9\u0010#R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010!\"\u0004\b;\u0010#R\u001c\u0010\n\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010!\"\u0004\b=\u0010#R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010!\"\u0004\b?\u0010#R\u001c\u0010\r\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010!\"\u0004\bA\u0010#R\u001c\u0010\f\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010!\"\u0004\bC\u0010#R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010E\"\u0004\bF\u0010G¨\u0006d"}, d2 = {"Lcom/adif/elcanomovil/uiSubscriptions/create/views/data/SubscriptionCreateViewData;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "isCercanias", "", "stationName", "", "stationCode", "stationFromName", "stationFromCode", "stationToName", "stationToCode", "repetitionDays", "codeTrain", NavArguments.ARG_DYNAMIC_LINKS_OPERATOR, NavArguments.ARG_DYNAMIC_LINKS_COMMERCIAL_PRODUCT, "anticipationTime", "Lcom/adif/elcanomovil/uiSubscriptions/utils/AnticipationType;", "typeSubscription", "Lcom/adif/elcanomovil/domain/entities/subscription/SubscriptionType;", "centerTime", "initialTime", "Ljava/util/Date;", NavArguments.ARG_TYPE_NOTIFICATION_JSON_MESSAGE_TRAIN, "", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/adif/elcanomovil/uiSubscriptions/utils/AnticipationType;Lcom/adif/elcanomovil/domain/entities/subscription/SubscriptionType;Ljava/lang/String;Ljava/util/Date;Ljava/lang/Integer;)V", "getAnticipationTime", "()Lcom/adif/elcanomovil/uiSubscriptions/utils/AnticipationType;", "setAnticipationTime", "(Lcom/adif/elcanomovil/uiSubscriptions/utils/AnticipationType;)V", "getCenterTime", "()Ljava/lang/String;", "setCenterTime", "(Ljava/lang/String;)V", "getCodeTrain", "setCodeTrain", "getCommercialProduct", "setCommercialProduct", "getId", "()Ljava/lang/Integer;", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getInitialTime", "()Ljava/util/Date;", "setInitialTime", "(Ljava/util/Date;)V", "()Z", "setCercanias", "(Z)V", "getOperator", "setOperator", "getRepetitionDays", "setRepetitionDays", "getStationCode", "setStationCode", "getStationFromCode", "setStationFromCode", "getStationFromName", "setStationFromName", "getStationName", "setStationName", "getStationToCode", "setStationToCode", "getStationToName", "setStationToName", "getTypeSubscription", "()Lcom/adif/elcanomovil/domain/entities/subscription/SubscriptionType;", "setTypeSubscription", "(Lcom/adif/elcanomovil/domain/entities/subscription/SubscriptionType;)V", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/adif/elcanomovil/uiSubscriptions/utils/AnticipationType;Lcom/adif/elcanomovil/domain/entities/subscription/SubscriptionType;Ljava/lang/String;Ljava/util/Date;Ljava/lang/Integer;)Lcom/adif/elcanomovil/uiSubscriptions/create/views/data/SubscriptionCreateViewData;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "flags", "CREATOR", "ui-subscriptions_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSubscriptionCreateViewData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubscriptionCreateViewData.kt\ncom/adif/elcanomovil/uiSubscriptions/create/views/data/SubscriptionCreateViewData\n+ 2 SubscriptionCreateViewData.kt\ncom/adif/elcanomovil/uiSubscriptions/create/views/data/SubscriptionCreateViewDataKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,94:1\n93#2:95\n93#2:97\n1#3:96\n1#3:98\n*S KotlinDebug\n*F\n+ 1 SubscriptionCreateViewData.kt\ncom/adif/elcanomovil/uiSubscriptions/create/views/data/SubscriptionCreateViewData\n*L\n40#1:95\n41#1:97\n40#1:96\n41#1:98\n*E\n"})
/* loaded from: classes3.dex */
public final /* data */ class SubscriptionCreateViewData implements Parcelable {

    /* renamed from: CREATOR, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private AnticipationType anticipationTime;
    private String centerTime;
    private String codeTrain;
    private String commercialProduct;
    private Integer id;
    private Date initialTime;
    private boolean isCercanias;
    private String operator;
    private String repetitionDays;
    private String stationCode;
    private String stationFromCode;
    private String stationFromName;
    private String stationName;
    private String stationToCode;
    private String stationToName;
    private SubscriptionType typeSubscription;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/adif/elcanomovil/uiSubscriptions/create/views/data/SubscriptionCreateViewData$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/adif/elcanomovil/uiSubscriptions/create/views/data/SubscriptionCreateViewData;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/adif/elcanomovil/uiSubscriptions/create/views/data/SubscriptionCreateViewData;", "ui-subscriptions_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.adif.elcanomovil.uiSubscriptions.create.views.data.SubscriptionCreateViewData$CREATOR, reason: from kotlin metadata */
    /* loaded from: classes3.dex */
    public static final class Companion implements Parcelable.Creator<SubscriptionCreateViewData> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SubscriptionCreateViewData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SubscriptionCreateViewData(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SubscriptionCreateViewData[] newArray(int size) {
            return new SubscriptionCreateViewData[size];
        }
    }

    public SubscriptionCreateViewData(boolean z3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, AnticipationType anticipationType, SubscriptionType subscriptionType, String str11, Date date, Integer num) {
        this.isCercanias = z3;
        this.stationName = str;
        this.stationCode = str2;
        this.stationFromName = str3;
        this.stationFromCode = str4;
        this.stationToName = str5;
        this.stationToCode = str6;
        this.repetitionDays = str7;
        this.codeTrain = str8;
        this.operator = str9;
        this.commercialProduct = str10;
        this.anticipationTime = anticipationType;
        this.typeSubscription = subscriptionType;
        this.centerTime = str11;
        this.initialTime = date;
        this.id = num;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsCercanias() {
        return this.isCercanias;
    }

    /* renamed from: component10, reason: from getter */
    public final String getOperator() {
        return this.operator;
    }

    /* renamed from: component11, reason: from getter */
    public final String getCommercialProduct() {
        return this.commercialProduct;
    }

    /* renamed from: component12, reason: from getter */
    public final AnticipationType getAnticipationTime() {
        return this.anticipationTime;
    }

    /* renamed from: component13, reason: from getter */
    public final SubscriptionType getTypeSubscription() {
        return this.typeSubscription;
    }

    /* renamed from: component14, reason: from getter */
    public final String getCenterTime() {
        return this.centerTime;
    }

    /* renamed from: component15, reason: from getter */
    public final Date getInitialTime() {
        return this.initialTime;
    }

    /* renamed from: component16, reason: from getter */
    public final Integer getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getStationName() {
        return this.stationName;
    }

    /* renamed from: component3, reason: from getter */
    public final String getStationCode() {
        return this.stationCode;
    }

    /* renamed from: component4, reason: from getter */
    public final String getStationFromName() {
        return this.stationFromName;
    }

    /* renamed from: component5, reason: from getter */
    public final String getStationFromCode() {
        return this.stationFromCode;
    }

    /* renamed from: component6, reason: from getter */
    public final String getStationToName() {
        return this.stationToName;
    }

    /* renamed from: component7, reason: from getter */
    public final String getStationToCode() {
        return this.stationToCode;
    }

    /* renamed from: component8, reason: from getter */
    public final String getRepetitionDays() {
        return this.repetitionDays;
    }

    /* renamed from: component9, reason: from getter */
    public final String getCodeTrain() {
        return this.codeTrain;
    }

    public final SubscriptionCreateViewData copy(boolean isCercanias, String stationName, String stationCode, String stationFromName, String stationFromCode, String stationToName, String stationToCode, String repetitionDays, String codeTrain, String operator, String commercialProduct, AnticipationType anticipationTime, SubscriptionType typeSubscription, String centerTime, Date initialTime, Integer id) {
        return new SubscriptionCreateViewData(isCercanias, stationName, stationCode, stationFromName, stationFromCode, stationToName, stationToCode, repetitionDays, codeTrain, operator, commercialProduct, anticipationTime, typeSubscription, centerTime, initialTime, id);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubscriptionCreateViewData)) {
            return false;
        }
        SubscriptionCreateViewData subscriptionCreateViewData = (SubscriptionCreateViewData) other;
        return this.isCercanias == subscriptionCreateViewData.isCercanias && Intrinsics.areEqual(this.stationName, subscriptionCreateViewData.stationName) && Intrinsics.areEqual(this.stationCode, subscriptionCreateViewData.stationCode) && Intrinsics.areEqual(this.stationFromName, subscriptionCreateViewData.stationFromName) && Intrinsics.areEqual(this.stationFromCode, subscriptionCreateViewData.stationFromCode) && Intrinsics.areEqual(this.stationToName, subscriptionCreateViewData.stationToName) && Intrinsics.areEqual(this.stationToCode, subscriptionCreateViewData.stationToCode) && Intrinsics.areEqual(this.repetitionDays, subscriptionCreateViewData.repetitionDays) && Intrinsics.areEqual(this.codeTrain, subscriptionCreateViewData.codeTrain) && Intrinsics.areEqual(this.operator, subscriptionCreateViewData.operator) && Intrinsics.areEqual(this.commercialProduct, subscriptionCreateViewData.commercialProduct) && this.anticipationTime == subscriptionCreateViewData.anticipationTime && this.typeSubscription == subscriptionCreateViewData.typeSubscription && Intrinsics.areEqual(this.centerTime, subscriptionCreateViewData.centerTime) && Intrinsics.areEqual(this.initialTime, subscriptionCreateViewData.initialTime) && Intrinsics.areEqual(this.id, subscriptionCreateViewData.id);
    }

    public final AnticipationType getAnticipationTime() {
        return this.anticipationTime;
    }

    public final String getCenterTime() {
        return this.centerTime;
    }

    public final String getCodeTrain() {
        return this.codeTrain;
    }

    public final String getCommercialProduct() {
        return this.commercialProduct;
    }

    public final Integer getId() {
        return this.id;
    }

    public final Date getInitialTime() {
        return this.initialTime;
    }

    public final String getOperator() {
        return this.operator;
    }

    public final String getRepetitionDays() {
        return this.repetitionDays;
    }

    public final String getStationCode() {
        return this.stationCode;
    }

    public final String getStationFromCode() {
        return this.stationFromCode;
    }

    public final String getStationFromName() {
        return this.stationFromName;
    }

    public final String getStationName() {
        return this.stationName;
    }

    public final String getStationToCode() {
        return this.stationToCode;
    }

    public final String getStationToName() {
        return this.stationToName;
    }

    public final SubscriptionType getTypeSubscription() {
        return this.typeSubscription;
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.isCercanias) * 31;
        String str = this.stationName;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.stationCode;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.stationFromName;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.stationFromCode;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.stationToName;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.stationToCode;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.repetitionDays;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.codeTrain;
        int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.operator;
        int hashCode10 = (hashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.commercialProduct;
        int hashCode11 = (hashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        AnticipationType anticipationType = this.anticipationTime;
        int hashCode12 = (hashCode11 + (anticipationType == null ? 0 : anticipationType.hashCode())) * 31;
        SubscriptionType subscriptionType = this.typeSubscription;
        int hashCode13 = (hashCode12 + (subscriptionType == null ? 0 : subscriptionType.hashCode())) * 31;
        String str11 = this.centerTime;
        int hashCode14 = (hashCode13 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Date date = this.initialTime;
        int hashCode15 = (hashCode14 + (date == null ? 0 : date.hashCode())) * 31;
        Integer num = this.id;
        return hashCode15 + (num != null ? num.hashCode() : 0);
    }

    public final boolean isCercanias() {
        return this.isCercanias;
    }

    public final void setAnticipationTime(AnticipationType anticipationType) {
        this.anticipationTime = anticipationType;
    }

    public final void setCenterTime(String str) {
        this.centerTime = str;
    }

    public final void setCercanias(boolean z3) {
        this.isCercanias = z3;
    }

    public final void setCodeTrain(String str) {
        this.codeTrain = str;
    }

    public final void setCommercialProduct(String str) {
        this.commercialProduct = str;
    }

    public final void setId(Integer num) {
        this.id = num;
    }

    public final void setInitialTime(Date date) {
        this.initialTime = date;
    }

    public final void setOperator(String str) {
        this.operator = str;
    }

    public final void setRepetitionDays(String str) {
        this.repetitionDays = str;
    }

    public final void setStationCode(String str) {
        this.stationCode = str;
    }

    public final void setStationFromCode(String str) {
        this.stationFromCode = str;
    }

    public final void setStationFromName(String str) {
        this.stationFromName = str;
    }

    public final void setStationName(String str) {
        this.stationName = str;
    }

    public final void setStationToCode(String str) {
        this.stationToCode = str;
    }

    public final void setStationToName(String str) {
        this.stationToName = str;
    }

    public final void setTypeSubscription(SubscriptionType subscriptionType) {
        this.typeSubscription = subscriptionType;
    }

    public String toString() {
        return "SubscriptionCreateViewData(isCercanias=" + this.isCercanias + ", stationName=" + this.stationName + ", stationCode=" + this.stationCode + ", stationFromName=" + this.stationFromName + ", stationFromCode=" + this.stationFromCode + ", stationToName=" + this.stationToName + ", stationToCode=" + this.stationToCode + ", repetitionDays=" + this.repetitionDays + ", codeTrain=" + this.codeTrain + ", operator=" + this.operator + ", commercialProduct=" + this.commercialProduct + ", anticipationTime=" + this.anticipationTime + ", typeSubscription=" + this.typeSubscription + ", centerTime=" + this.centerTime + ", initialTime=" + this.initialTime + ", id=" + this.id + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeByte(this.isCercanias ? (byte) 1 : (byte) 0);
        parcel.writeString(this.stationName);
        parcel.writeString(this.stationCode);
        parcel.writeString(this.stationFromName);
        parcel.writeString(this.stationFromCode);
        parcel.writeString(this.stationToName);
        parcel.writeString(this.stationToCode);
        parcel.writeString(this.repetitionDays);
        parcel.writeString(this.codeTrain);
        parcel.writeString(this.operator);
        parcel.writeString(this.commercialProduct);
        parcel.writeString(this.centerTime);
        SubscriptionCreateViewDataKt.writeEnum(parcel, this.anticipationTime);
        SubscriptionCreateViewDataKt.writeEnum(parcel, this.typeSubscription);
        SubscriptionCreateViewDataKt.writeDate(parcel, this.initialTime);
    }

    public /* synthetic */ SubscriptionCreateViewData(boolean z3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, AnticipationType anticipationType, SubscriptionType subscriptionType, String str11, Date date, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z3, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : str8, (i & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? null : str9, (i & 1024) != 0 ? null : str10, (i & 2048) != 0 ? null : anticipationType, (i & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? null : subscriptionType, (i & 8192) != 0 ? null : str11, (i & 16384) != 0 ? null : date, (i & 32768) != 0 ? null : num);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SubscriptionCreateViewData(android.os.Parcel r21) {
        /*
            r20 = this;
            java.lang.String r0 = "parcel"
            r1 = r21
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            byte r0 = r1.readByte()
            if (r0 == 0) goto L10
            r0 = 1
        Le:
            r2 = r0
            goto L12
        L10:
            r0 = 0
            goto Le
        L12:
            java.lang.String r3 = r1.readString()
            java.lang.String r4 = r1.readString()
            java.lang.String r5 = r1.readString()
            java.lang.String r6 = r1.readString()
            java.lang.String r7 = r1.readString()
            java.lang.String r8 = r1.readString()
            java.lang.String r9 = r1.readString()
            java.lang.String r10 = r1.readString()
            java.lang.String r11 = r1.readString()
            java.lang.String r12 = r1.readString()
            int r0 = r1.readInt()
            r13 = 0
            if (r0 < 0) goto L48
            com.adif.elcanomovil.uiSubscriptions.utils.AnticipationType[] r14 = com.adif.elcanomovil.uiSubscriptions.utils.AnticipationType.values()
            r0 = r14[r0]
            goto L49
        L48:
            r0 = r13
        L49:
            int r14 = r1.readInt()
            if (r14 < 0) goto L55
            com.adif.elcanomovil.domain.entities.subscription.SubscriptionType[] r13 = com.adif.elcanomovil.domain.entities.subscription.SubscriptionType.values()
            r13 = r13[r14]
        L55:
            r14 = r13
            java.lang.String r15 = r1.readString()
            java.util.Date r16 = com.adif.elcanomovil.uiSubscriptions.create.views.data.SubscriptionCreateViewDataKt.readDate(r1)
            r18 = 32768(0x8000, float:4.5918E-41)
            r19 = 0
            r17 = 0
            r1 = r20
            r13 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.uiSubscriptions.create.views.data.SubscriptionCreateViewData.<init>(android.os.Parcel):void");
    }
}
