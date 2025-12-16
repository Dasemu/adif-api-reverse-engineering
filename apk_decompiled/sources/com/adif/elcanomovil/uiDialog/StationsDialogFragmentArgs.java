package com.adif.elcanomovil.uiDialog;

import C.w;
import android.os.Bundle;
import androidx.lifecycle.n0;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.io.ConstantsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o0.InterfaceC0530g;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0015\b\u0086\b\u0018\u0000 D2\u00020\u0001:\u0001DB\u0093\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0010\u0010\u001f\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001bJ\u0018\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b$\u0010\"J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001bJ\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u001bJ\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u001bJ\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\u001bJ\u0012\u0010)\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010\u001bJ¶\u0001\u0010*\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b,\u0010\u001bJ\u0010\u0010.\u001a\u00020-HÖ\u0001¢\u0006\u0004\b.\u0010/J\u001a\u00102\u001a\u00020\u00072\b\u00101\u001a\u0004\u0018\u000100HÖ\u0003¢\u0006\u0004\b2\u00103R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00104\u001a\u0004\b5\u0010\u001bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00104\u001a\u0004\b6\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00104\u001a\u0004\b7\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00104\u001a\u0004\b8\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00109\u001a\u0004\b:\u0010 R\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010;\u001a\u0004\b<\u0010\"R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u00104\u001a\u0004\b=\u0010\u001bR\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\f\u0010;\u001a\u0004\b>\u0010\"R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u00104\u001a\u0004\b?\u0010\u001bR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u00104\u001a\u0004\b@\u0010\u001bR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u00104\u001a\u0004\bA\u0010\u001bR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u00104\u001a\u0004\bB\u0010\u001bR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u00104\u001a\u0004\bC\u0010\u001b¨\u0006E"}, d2 = {"Lcom/adif/elcanomovil/uiDialog/StationsDialogFragmentArgs;", "Lo0/g;", "", "logo", AppMeasurementSdk.ConditionalUserProperty.NAME, "phone", "description", "", "accessible", "", "paymentWay", "offer", "correspondences", "web", FirebaseAnalytics.Param.LOCATION, "accessibleLabel", "openingHours", "playStore", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Bundle;", "toBundle", "()Landroid/os/Bundle;", "Landroidx/lifecycle/n0;", "toSavedStateHandle", "()Landroidx/lifecycle/n0;", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Z", "component6", "()[Ljava/lang/String;", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/adif/elcanomovil/uiDialog/StationsDialogFragmentArgs;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLogo", "getName", "getPhone", "getDescription", "Z", "getAccessible", "[Ljava/lang/String;", "getPaymentWay", "getOffer", "getCorrespondences", "getWeb", "getLocation", "getAccessibleLabel", "getOpeningHours", "getPlayStore", "Companion", "common-nav-graph_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class StationsDialogFragmentArgs implements InterfaceC0530g {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final boolean accessible;
    private final String accessibleLabel;
    private final String[] correspondences;
    private final String description;
    private final String location;
    private final String logo;
    private final String name;
    private final String offer;
    private final String openingHours;
    private final String[] paymentWay;
    private final String phone;
    private final String playStore;
    private final String web;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/adif/elcanomovil/uiDialog/StationsDialogFragmentArgs$Companion;", "", "<init>", "()V", "Landroid/os/Bundle;", "bundle", "Lcom/adif/elcanomovil/uiDialog/StationsDialogFragmentArgs;", "fromBundle", "(Landroid/os/Bundle;)Lcom/adif/elcanomovil/uiDialog/StationsDialogFragmentArgs;", "Landroidx/lifecycle/n0;", "savedStateHandle", "fromSavedStateHandle", "(Landroidx/lifecycle/n0;)Lcom/adif/elcanomovil/uiDialog/StationsDialogFragmentArgs;", "common-nav-graph_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final StationsDialogFragmentArgs fromBundle(Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.setClassLoader(StationsDialogFragmentArgs.class.getClassLoader());
            if (!bundle.containsKey("logo")) {
                throw new IllegalArgumentException("Required argument \"logo\" is missing and does not have an android:defaultValue");
            }
            String string = bundle.getString("logo");
            if (!bundle.containsKey(AppMeasurementSdk.ConditionalUserProperty.NAME)) {
                throw new IllegalArgumentException("Required argument \"name\" is missing and does not have an android:defaultValue");
            }
            String string2 = bundle.getString(AppMeasurementSdk.ConditionalUserProperty.NAME);
            if (!bundle.containsKey("phone")) {
                throw new IllegalArgumentException("Required argument \"phone\" is missing and does not have an android:defaultValue");
            }
            String string3 = bundle.getString("phone");
            if (!bundle.containsKey("description")) {
                throw new IllegalArgumentException("Required argument \"description\" is missing and does not have an android:defaultValue");
            }
            String string4 = bundle.getString("description");
            if (!bundle.containsKey("accessible")) {
                throw new IllegalArgumentException("Required argument \"accessible\" is missing and does not have an android:defaultValue");
            }
            boolean z3 = bundle.getBoolean("accessible");
            if (!bundle.containsKey("payment_way")) {
                throw new IllegalArgumentException("Required argument \"payment_way\" is missing and does not have an android:defaultValue");
            }
            String[] stringArray = bundle.getStringArray("payment_way");
            if (!bundle.containsKey("offer")) {
                throw new IllegalArgumentException("Required argument \"offer\" is missing and does not have an android:defaultValue");
            }
            String string5 = bundle.getString("offer");
            if (!bundle.containsKey("correspondences")) {
                throw new IllegalArgumentException("Required argument \"correspondences\" is missing and does not have an android:defaultValue");
            }
            String[] stringArray2 = bundle.getStringArray("correspondences");
            if (!bundle.containsKey("web")) {
                throw new IllegalArgumentException("Required argument \"web\" is missing and does not have an android:defaultValue");
            }
            String string6 = bundle.getString("web");
            if (!bundle.containsKey(FirebaseAnalytics.Param.LOCATION)) {
                throw new IllegalArgumentException("Required argument \"location\" is missing and does not have an android:defaultValue");
            }
            String string7 = bundle.getString(FirebaseAnalytics.Param.LOCATION);
            if (!bundle.containsKey("accessible_label")) {
                throw new IllegalArgumentException("Required argument \"accessible_label\" is missing and does not have an android:defaultValue");
            }
            String string8 = bundle.getString("accessible_label");
            if (!bundle.containsKey("opening_hours")) {
                throw new IllegalArgumentException("Required argument \"opening_hours\" is missing and does not have an android:defaultValue");
            }
            String string9 = bundle.getString("opening_hours");
            if (bundle.containsKey("play_store")) {
                return new StationsDialogFragmentArgs(string, string2, string3, string4, z3, stringArray, string5, stringArray2, string6, string7, string8, string9, bundle.getString("play_store"));
            }
            throw new IllegalArgumentException("Required argument \"play_store\" is missing and does not have an android:defaultValue");
        }

        @JvmStatic
        public final StationsDialogFragmentArgs fromSavedStateHandle(n0 savedStateHandle) {
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            if (!savedStateHandle.b("logo")) {
                throw new IllegalArgumentException("Required argument \"logo\" is missing and does not have an android:defaultValue");
            }
            String str = (String) savedStateHandle.c("logo");
            if (!savedStateHandle.b(AppMeasurementSdk.ConditionalUserProperty.NAME)) {
                throw new IllegalArgumentException("Required argument \"name\" is missing and does not have an android:defaultValue");
            }
            String str2 = (String) savedStateHandle.c(AppMeasurementSdk.ConditionalUserProperty.NAME);
            if (!savedStateHandle.b("phone")) {
                throw new IllegalArgumentException("Required argument \"phone\" is missing and does not have an android:defaultValue");
            }
            String str3 = (String) savedStateHandle.c("phone");
            if (!savedStateHandle.b("description")) {
                throw new IllegalArgumentException("Required argument \"description\" is missing and does not have an android:defaultValue");
            }
            String str4 = (String) savedStateHandle.c("description");
            if (!savedStateHandle.b("accessible")) {
                throw new IllegalArgumentException("Required argument \"accessible\" is missing and does not have an android:defaultValue");
            }
            Boolean bool = (Boolean) savedStateHandle.c("accessible");
            if (bool == null) {
                throw new IllegalArgumentException("Argument \"accessible\" of type boolean does not support null values");
            }
            if (!savedStateHandle.b("payment_way")) {
                throw new IllegalArgumentException("Required argument \"payment_way\" is missing and does not have an android:defaultValue");
            }
            String[] strArr = (String[]) savedStateHandle.c("payment_way");
            if (!savedStateHandle.b("offer")) {
                throw new IllegalArgumentException("Required argument \"offer\" is missing and does not have an android:defaultValue");
            }
            String str5 = (String) savedStateHandle.c("offer");
            if (!savedStateHandle.b("correspondences")) {
                throw new IllegalArgumentException("Required argument \"correspondences\" is missing and does not have an android:defaultValue");
            }
            String[] strArr2 = (String[]) savedStateHandle.c("correspondences");
            if (!savedStateHandle.b("web")) {
                throw new IllegalArgumentException("Required argument \"web\" is missing and does not have an android:defaultValue");
            }
            String str6 = (String) savedStateHandle.c("web");
            if (!savedStateHandle.b(FirebaseAnalytics.Param.LOCATION)) {
                throw new IllegalArgumentException("Required argument \"location\" is missing and does not have an android:defaultValue");
            }
            String str7 = (String) savedStateHandle.c(FirebaseAnalytics.Param.LOCATION);
            if (!savedStateHandle.b("accessible_label")) {
                throw new IllegalArgumentException("Required argument \"accessible_label\" is missing and does not have an android:defaultValue");
            }
            String str8 = (String) savedStateHandle.c("accessible_label");
            if (!savedStateHandle.b("opening_hours")) {
                throw new IllegalArgumentException("Required argument \"opening_hours\" is missing and does not have an android:defaultValue");
            }
            String str9 = (String) savedStateHandle.c("opening_hours");
            if (!savedStateHandle.b("play_store")) {
                throw new IllegalArgumentException("Required argument \"play_store\" is missing and does not have an android:defaultValue");
            }
            return new StationsDialogFragmentArgs(str, str2, str3, str4, bool.booleanValue(), strArr, str5, strArr2, str6, str7, str8, str9, (String) savedStateHandle.c("play_store"));
        }

        private Companion() {
        }
    }

    public StationsDialogFragmentArgs(String str, String str2, String str3, String str4, boolean z3, String[] strArr, String str5, String[] strArr2, String str6, String str7, String str8, String str9, String str10) {
        this.logo = str;
        this.name = str2;
        this.phone = str3;
        this.description = str4;
        this.accessible = z3;
        this.paymentWay = strArr;
        this.offer = str5;
        this.correspondences = strArr2;
        this.web = str6;
        this.location = str7;
        this.accessibleLabel = str8;
        this.openingHours = str9;
        this.playStore = str10;
    }

    public static /* synthetic */ StationsDialogFragmentArgs copy$default(StationsDialogFragmentArgs stationsDialogFragmentArgs, String str, String str2, String str3, String str4, boolean z3, String[] strArr, String str5, String[] strArr2, String str6, String str7, String str8, String str9, String str10, int i, Object obj) {
        if ((i & 1) != 0) {
            str = stationsDialogFragmentArgs.logo;
        }
        return stationsDialogFragmentArgs.copy(str, (i & 2) != 0 ? stationsDialogFragmentArgs.name : str2, (i & 4) != 0 ? stationsDialogFragmentArgs.phone : str3, (i & 8) != 0 ? stationsDialogFragmentArgs.description : str4, (i & 16) != 0 ? stationsDialogFragmentArgs.accessible : z3, (i & 32) != 0 ? stationsDialogFragmentArgs.paymentWay : strArr, (i & 64) != 0 ? stationsDialogFragmentArgs.offer : str5, (i & 128) != 0 ? stationsDialogFragmentArgs.correspondences : strArr2, (i & 256) != 0 ? stationsDialogFragmentArgs.web : str6, (i & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? stationsDialogFragmentArgs.location : str7, (i & 1024) != 0 ? stationsDialogFragmentArgs.accessibleLabel : str8, (i & 2048) != 0 ? stationsDialogFragmentArgs.openingHours : str9, (i & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? stationsDialogFragmentArgs.playStore : str10);
    }

    @JvmStatic
    public static final StationsDialogFragmentArgs fromBundle(Bundle bundle) {
        return INSTANCE.fromBundle(bundle);
    }

    @JvmStatic
    public static final StationsDialogFragmentArgs fromSavedStateHandle(n0 n0Var) {
        return INSTANCE.fromSavedStateHandle(n0Var);
    }

    /* renamed from: component1, reason: from getter */
    public final String getLogo() {
        return this.logo;
    }

    /* renamed from: component10, reason: from getter */
    public final String getLocation() {
        return this.location;
    }

    /* renamed from: component11, reason: from getter */
    public final String getAccessibleLabel() {
        return this.accessibleLabel;
    }

    /* renamed from: component12, reason: from getter */
    public final String getOpeningHours() {
        return this.openingHours;
    }

    /* renamed from: component13, reason: from getter */
    public final String getPlayStore() {
        return this.playStore;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getAccessible() {
        return this.accessible;
    }

    /* renamed from: component6, reason: from getter */
    public final String[] getPaymentWay() {
        return this.paymentWay;
    }

    /* renamed from: component7, reason: from getter */
    public final String getOffer() {
        return this.offer;
    }

    /* renamed from: component8, reason: from getter */
    public final String[] getCorrespondences() {
        return this.correspondences;
    }

    /* renamed from: component9, reason: from getter */
    public final String getWeb() {
        return this.web;
    }

    public final StationsDialogFragmentArgs copy(String logo, String name, String phone, String description, boolean accessible, String[] paymentWay, String offer, String[] correspondences, String web, String location, String accessibleLabel, String openingHours, String playStore) {
        return new StationsDialogFragmentArgs(logo, name, phone, description, accessible, paymentWay, offer, correspondences, web, location, accessibleLabel, openingHours, playStore);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StationsDialogFragmentArgs)) {
            return false;
        }
        StationsDialogFragmentArgs stationsDialogFragmentArgs = (StationsDialogFragmentArgs) other;
        return Intrinsics.areEqual(this.logo, stationsDialogFragmentArgs.logo) && Intrinsics.areEqual(this.name, stationsDialogFragmentArgs.name) && Intrinsics.areEqual(this.phone, stationsDialogFragmentArgs.phone) && Intrinsics.areEqual(this.description, stationsDialogFragmentArgs.description) && this.accessible == stationsDialogFragmentArgs.accessible && Intrinsics.areEqual(this.paymentWay, stationsDialogFragmentArgs.paymentWay) && Intrinsics.areEqual(this.offer, stationsDialogFragmentArgs.offer) && Intrinsics.areEqual(this.correspondences, stationsDialogFragmentArgs.correspondences) && Intrinsics.areEqual(this.web, stationsDialogFragmentArgs.web) && Intrinsics.areEqual(this.location, stationsDialogFragmentArgs.location) && Intrinsics.areEqual(this.accessibleLabel, stationsDialogFragmentArgs.accessibleLabel) && Intrinsics.areEqual(this.openingHours, stationsDialogFragmentArgs.openingHours) && Intrinsics.areEqual(this.playStore, stationsDialogFragmentArgs.playStore);
    }

    public final boolean getAccessible() {
        return this.accessible;
    }

    public final String getAccessibleLabel() {
        return this.accessibleLabel;
    }

    public final String[] getCorrespondences() {
        return this.correspondences;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getLocation() {
        return this.location;
    }

    public final String getLogo() {
        return this.logo;
    }

    public final String getName() {
        return this.name;
    }

    public final String getOffer() {
        return this.offer;
    }

    public final String getOpeningHours() {
        return this.openingHours;
    }

    public final String[] getPaymentWay() {
        return this.paymentWay;
    }

    public final String getPhone() {
        return this.phone;
    }

    public final String getPlayStore() {
        return this.playStore;
    }

    public final String getWeb() {
        return this.web;
    }

    public int hashCode() {
        String str = this.logo;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.phone;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.description;
        int c4 = w.c((hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.accessible);
        String[] strArr = this.paymentWay;
        int hashCode4 = (c4 + (strArr == null ? 0 : Arrays.hashCode(strArr))) * 31;
        String str5 = this.offer;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String[] strArr2 = this.correspondences;
        int hashCode6 = (hashCode5 + (strArr2 == null ? 0 : Arrays.hashCode(strArr2))) * 31;
        String str6 = this.web;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.location;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.accessibleLabel;
        int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.openingHours;
        int hashCode10 = (hashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.playStore;
        return hashCode10 + (str10 != null ? str10.hashCode() : 0);
    }

    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putString("logo", this.logo);
        bundle.putString(AppMeasurementSdk.ConditionalUserProperty.NAME, this.name);
        bundle.putString("phone", this.phone);
        bundle.putString("description", this.description);
        bundle.putBoolean("accessible", this.accessible);
        bundle.putStringArray("payment_way", this.paymentWay);
        bundle.putString("offer", this.offer);
        bundle.putStringArray("correspondences", this.correspondences);
        bundle.putString("web", this.web);
        bundle.putString(FirebaseAnalytics.Param.LOCATION, this.location);
        bundle.putString("accessible_label", this.accessibleLabel);
        bundle.putString("opening_hours", this.openingHours);
        bundle.putString("play_store", this.playStore);
        return bundle;
    }

    public final n0 toSavedStateHandle() {
        n0 n0Var = new n0();
        n0Var.d(this.logo, "logo");
        n0Var.d(this.name, AppMeasurementSdk.ConditionalUserProperty.NAME);
        n0Var.d(this.phone, "phone");
        n0Var.d(this.description, "description");
        n0Var.d(Boolean.valueOf(this.accessible), "accessible");
        n0Var.d(this.paymentWay, "payment_way");
        n0Var.d(this.offer, "offer");
        n0Var.d(this.correspondences, "correspondences");
        n0Var.d(this.web, "web");
        n0Var.d(this.location, FirebaseAnalytics.Param.LOCATION);
        n0Var.d(this.accessibleLabel, "accessible_label");
        n0Var.d(this.openingHours, "opening_hours");
        n0Var.d(this.playStore, "play_store");
        return n0Var;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("StationsDialogFragmentArgs(logo=");
        sb.append(this.logo);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", phone=");
        sb.append(this.phone);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", accessible=");
        sb.append(this.accessible);
        sb.append(", paymentWay=");
        sb.append(Arrays.toString(this.paymentWay));
        sb.append(", offer=");
        sb.append(this.offer);
        sb.append(", correspondences=");
        sb.append(Arrays.toString(this.correspondences));
        sb.append(", web=");
        sb.append(this.web);
        sb.append(", location=");
        sb.append(this.location);
        sb.append(", accessibleLabel=");
        sb.append(this.accessibleLabel);
        sb.append(", openingHours=");
        sb.append(this.openingHours);
        sb.append(", playStore=");
        return com.google.android.gms.measurement.internal.a.n(sb, this.playStore, ')');
    }
}
