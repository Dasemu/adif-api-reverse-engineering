package com.adif.elcanomovil.commonViews.data;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.adif.elcanomovil.commonNavGraph.arguments.NavArguments;
import com.adif.elcanomovil.uiStations.mappers.RequestedStationInfoMapperKt;
import com.adif.elcanomovil.uiTrain.entities.TrainInfoMapperKt;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.a;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.parcelize.Parcelize;

@Parcelize
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0004_`abB\u0093\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0018\b\u0002\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u000ej\b\u0012\u0004\u0012\u00020\u000f`\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\u0018\b\u0002\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u000ej\b\u0012\u0004\u0012\u00020\u000f`\u0010¢\u0006\u0002\u0010\u0014J\t\u0010F\u001a\u00020\u0003HÆ\u0003J\t\u0010G\u001a\u00020\u0012HÆ\u0003J\u0019\u0010H\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u000ej\b\u0012\u0004\u0012\u00020\u000f`\u0010HÆ\u0003J\t\u0010I\u001a\u00020\u0003HÆ\u0003J\t\u0010J\u001a\u00020\u0003HÆ\u0003J\u0010\u0010K\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001eJ\u0010\u0010L\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001eJ\u000b\u0010M\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010O\u001a\u00020\u0003HÆ\u0003J\u0019\u0010P\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u000ej\b\u0012\u0004\u0012\u00020\u000f`\u0010HÆ\u0003J¤\u0001\u0010Q\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\u0018\b\u0002\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u000ej\b\u0012\u0004\u0012\u00020\u000f`\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\u0018\b\u0002\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u000ej\b\u0012\u0004\u0012\u00020\u000f`\u0010HÆ\u0001¢\u0006\u0002\u0010RJ\t\u0010S\u001a\u00020THÖ\u0001J\u0013\u0010U\u001a\u00020'2\b\u0010V\u001a\u0004\u0018\u00010WHÖ\u0003J\t\u0010X\u001a\u00020THÖ\u0001J\t\u0010Y\u001a\u00020\u0003HÖ\u0001J\u0019\u0010Z\u001a\u00020[2\u0006\u0010\\\u001a\u00020]2\u0006\u0010^\u001a\u00020THÖ\u0001R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u0018R\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0016\"\u0004\b\u001c\u0010\u0018R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010!\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001e\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010!\u001a\u0004\b\"\u0010\u001e\"\u0004\b#\u0010 R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0016\"\u0004\b%\u0010\u0018R\u0017\u0010&\u001a\u00020'8F¢\u0006\f\u0012\u0004\b(\u0010)\u001a\u0004\b&\u0010*R\u0017\u0010+\u001a\u00020'8F¢\u0006\f\u0012\u0004\b,\u0010)\u001a\u0004\b+\u0010*R\u0017\u0010-\u001a\u00020'8F¢\u0006\f\u0012\u0004\b.\u0010)\u001a\u0004\b-\u0010*R\u0017\u0010/\u001a\u00020'8F¢\u0006\f\u0012\u0004\b0\u0010)\u001a\u0004\b/\u0010*R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u0016\"\u0004\b6\u0010\u0018R*\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u000ej\b\u0012\u0004\u0012\u00020\u000f`\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R*\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u000ej\b\u0012\u0004\u0012\u00020\u000f`\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u00108\"\u0004\b<\u0010:R\u0017\u0010=\u001a\u00020>¢\u0006\u000e\n\u0000\u0012\u0004\b?\u0010)\u001a\u0004\b@\u0010AR\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010C\"\u0004\bD\u0010E¨\u0006c"}, d2 = {"Lcom/adif/elcanomovil/commonViews/data/StationViewEntity;", "Landroid/os/Parcelable;", NavArguments.ARG_TYPE_NOTIFICATION_JSON_MESSAGE_TRAIN, "", AppMeasurementSdk.ConditionalUserProperty.NAME, "alias", "distance", "", "duration", FirebaseAnalytics.Param.LOCATION, "Landroid/location/Location;", "city", "commercialZoneType", "services", "Ljava/util/ArrayList;", "Lcom/adif/elcanomovil/commonViews/data/StationViewEntity$Service;", "Lkotlin/collections/ArrayList;", "type", "Lcom/adif/elcanomovil/commonViews/data/StationViewEntity$Type;", NavArguments.ARG_DYNAMIC_LINKS_STATION_TRAFFIC, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Landroid/location/Location;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Lcom/adif/elcanomovil/commonViews/data/StationViewEntity$Type;Ljava/util/ArrayList;)V", "getAlias", "()Ljava/lang/String;", "setAlias", "(Ljava/lang/String;)V", "getCity", "setCity", "getCommercialZoneType", "setCommercialZoneType", "getDistance", "()Ljava/lang/Float;", "setDistance", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "getDuration", "setDuration", "getId", "setId", "isArrivalsAvailable", "", "isArrivalsAvailable$annotations", "()V", "()Z", "isCommercialAreaAvailable", "isCommercialAreaAvailable$annotations", "isDeparturesAvailable", "isDeparturesAvailable$annotations", "isInfoDetailAvailable", "isInfoDetailAvailable$annotations", "getLocation", "()Landroid/location/Location;", "setLocation", "(Landroid/location/Location;)V", "getName", "setName", "getServices", "()Ljava/util/ArrayList;", "setServices", "(Ljava/util/ArrayList;)V", "getTrafficType", "setTrafficType", "trafficTypeValue", "Lcom/adif/elcanomovil/commonViews/data/StationViewEntity$TypeTraffic;", "getTrafficTypeValue$annotations", "getTrafficTypeValue", "()Lcom/adif/elcanomovil/commonViews/data/StationViewEntity$TypeTraffic;", "getType", "()Lcom/adif/elcanomovil/commonViews/data/StationViewEntity$Type;", "setType", "(Lcom/adif/elcanomovil/commonViews/data/StationViewEntity$Type;)V", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Landroid/location/Location;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Lcom/adif/elcanomovil/commonViews/data/StationViewEntity$Type;Ljava/util/ArrayList;)Lcom/adif/elcanomovil/commonViews/data/StationViewEntity;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Service", "Type", "TypeComercialStation", "TypeTraffic", "common-views_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class StationViewEntity implements Parcelable {
    public static final Parcelable.Creator<StationViewEntity> CREATOR = new Creator();
    private String alias;
    private String city;
    private String commercialZoneType;
    private Float distance;
    private Float duration;
    private String id;
    private Location location;
    private String name;
    private ArrayList<Service> services;
    private ArrayList<Service> trafficType;
    private final TypeTraffic trafficTypeValue;
    private Type type;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<StationViewEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StationViewEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            Float valueOf = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            Float valueOf2 = parcel.readInt() != 0 ? Float.valueOf(parcel.readFloat()) : null;
            Location location = (Location) parcel.readParcelable(StationViewEntity.class.getClassLoader());
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(Service.CREATOR.createFromParcel(parcel));
            }
            Type createFromParcel = Type.CREATOR.createFromParcel(parcel);
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            for (int i4 = 0; i4 != readInt2; i4++) {
                arrayList2.add(Service.CREATOR.createFromParcel(parcel));
            }
            return new StationViewEntity(readString, readString2, readString3, valueOf, valueOf2, location, readString4, readString5, arrayList, createFromParcel, arrayList2);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StationViewEntity[] newArray(int i) {
            return new StationViewEntity[i];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Parcelize
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\t\u0010\u0004\u001a\u00020\u0005HÖ\u0001J\u0019\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005HÖ\u0001j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/adif/elcanomovil/commonViews/data/StationViewEntity$Service;", "", "Landroid/os/Parcelable;", "(Ljava/lang/String;I)V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "DEPARTURES", "ARRIVALS", "INFO", "COMMERCIAL", "common-views_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Service implements Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Service[] $VALUES;
        public static final Parcelable.Creator<Service> CREATOR;
        public static final Service DEPARTURES = new Service("DEPARTURES", 0);
        public static final Service ARRIVALS = new Service("ARRIVALS", 1);
        public static final Service INFO = new Service("INFO", 2);
        public static final Service COMMERCIAL = new Service("COMMERCIAL", 3);

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final class Creator implements Parcelable.Creator<Service> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Service createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return Service.valueOf(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Service[] newArray(int i) {
                return new Service[i];
            }
        }

        private static final /* synthetic */ Service[] $values() {
            return new Service[]{DEPARTURES, ARRIVALS, INFO, COMMERCIAL};
        }

        static {
            Service[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
            CREATOR = new Creator();
        }

        private Service(String str, int i) {
        }

        public static EnumEntries<Service> getEntries() {
            return $ENTRIES;
        }

        public static Service valueOf(String str) {
            return (Service) Enum.valueOf(Service.class, str);
        }

        public static Service[] values() {
            return (Service[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(name());
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Parcelize
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\t\u0010\u0004\u001a\u00020\u0005HÖ\u0001J\u0019\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005HÖ\u0001j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, d2 = {"Lcom/adif/elcanomovil/commonViews/data/StationViewEntity$Type;", "", "Landroid/os/Parcelable;", "(Ljava/lang/String;I)V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "STATION", "HOME", "WORK", "NEAR", "DEPARTURES", "ARRIVALS", "INFO", "COMMERCIAL", "FAVORITE", "ROUTE", "common-views_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Type implements Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Parcelable.Creator<Type> CREATOR;
        public static final Type STATION = new Type("STATION", 0);
        public static final Type HOME = new Type("HOME", 1);
        public static final Type WORK = new Type("WORK", 2);
        public static final Type NEAR = new Type("NEAR", 3);
        public static final Type DEPARTURES = new Type("DEPARTURES", 4);
        public static final Type ARRIVALS = new Type("ARRIVALS", 5);
        public static final Type INFO = new Type("INFO", 6);
        public static final Type COMMERCIAL = new Type("COMMERCIAL", 7);
        public static final Type FAVORITE = new Type("FAVORITE", 8);
        public static final Type ROUTE = new Type("ROUTE", 9);

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final class Creator implements Parcelable.Creator<Type> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Type createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return Type.valueOf(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Type[] newArray(int i) {
                return new Type[i];
            }
        }

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{STATION, HOME, WORK, NEAR, DEPARTURES, ARRIVALS, INFO, COMMERCIAL, FAVORITE, ROUTE};
        }

        static {
            Type[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
            CREATOR = new Creator();
        }

        private Type(String str, int i) {
        }

        public static EnumEntries<Type> getEntries() {
            return $ENTRIES;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(name());
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Parcelize
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u0014B\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\t\u0010\b\u001a\u00020\tHÖ\u0001J\u0019\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0015"}, d2 = {"Lcom/adif/elcanomovil/commonViews/data/StationViewEntity$TypeComercialStation;", "", "Landroid/os/Parcelable;", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "EXTERNAL_MANAGEMENT", "NOT", RequestedStationInfoMapperKt.OTHERS, "TIENDAS_ESTACION", "VIALIA", "Companion", "common-views_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class TypeComercialStation implements Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ TypeComercialStation[] $VALUES;
        public static final Parcelable.Creator<TypeComercialStation> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final TypeComercialStation EXTERNAL_MANAGEMENT = new TypeComercialStation("EXTERNAL_MANAGEMENT", 0, "EXTERNAL_MANAGEMENT");
        public static final TypeComercialStation NOT = new TypeComercialStation("NOT", 1, "NOT");
        public static final TypeComercialStation OTHERS = new TypeComercialStation(RequestedStationInfoMapperKt.OTHERS, 2, RequestedStationInfoMapperKt.OTHERS);
        public static final TypeComercialStation TIENDAS_ESTACION = new TypeComercialStation("TIENDAS_ESTACION", 3, "TIENDAS_ESTACION");
        public static final TypeComercialStation VIALIA = new TypeComercialStation("VIALIA", 4, "VIALIA");
        private final String value;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0086\u0002¨\u0006\u0007"}, d2 = {"Lcom/adif/elcanomovil/commonViews/data/StationViewEntity$TypeComercialStation$Companion;", "", "()V", "invoke", "Lcom/adif/elcanomovil/commonViews/data/StationViewEntity$TypeComercialStation;", "rawValue", "", "common-views_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @SourceDebugExtension({"SMAP\nStationViewEntity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StationViewEntity.kt\ncom/adif/elcanomovil/commonViews/data/StationViewEntity$TypeComercialStation$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,99:1\n1#2:100\n*E\n"})
        /* loaded from: classes.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final TypeComercialStation invoke(String rawValue) {
                Intrinsics.checkNotNullParameter(rawValue, "rawValue");
                for (TypeComercialStation typeComercialStation : TypeComercialStation.values()) {
                    if (Intrinsics.areEqual(typeComercialStation.getValue(), rawValue)) {
                        return typeComercialStation;
                    }
                }
                return null;
            }

            private Companion() {
            }
        }

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final class Creator implements Parcelable.Creator<TypeComercialStation> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TypeComercialStation createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return TypeComercialStation.valueOf(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TypeComercialStation[] newArray(int i) {
                return new TypeComercialStation[i];
            }
        }

        private static final /* synthetic */ TypeComercialStation[] $values() {
            return new TypeComercialStation[]{EXTERNAL_MANAGEMENT, NOT, OTHERS, TIENDAS_ESTACION, VIALIA};
        }

        static {
            TypeComercialStation[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
            INSTANCE = new Companion(null);
            CREATOR = new Creator();
        }

        private TypeComercialStation(String str, int i, String str2) {
            this.value = str2;
        }

        public static EnumEntries<TypeComercialStation> getEntries() {
            return $ENTRIES;
        }

        public static TypeComercialStation valueOf(String str) {
            return (TypeComercialStation) Enum.valueOf(TypeComercialStation.class, str);
        }

        public static TypeComercialStation[] values() {
            return (TypeComercialStation[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final String getValue() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(name());
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Parcelize
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u0011B\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\t\u0010\b\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0004HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0012"}, d2 = {"Lcom/adif/elcanomovil/commonViews/data/StationViewEntity$TypeTraffic;", "", "Landroid/os/Parcelable;", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "describeContents", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", TrainInfoMapperKt.CERCANIAS, "AVLDMD", "BOTH", "Companion", "common-views_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class TypeTraffic implements Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ TypeTraffic[] $VALUES;
        public static final Parcelable.Creator<TypeTraffic> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final int value;
        public static final TypeTraffic CERCANIAS = new TypeTraffic(TrainInfoMapperKt.CERCANIAS, 0, 0);
        public static final TypeTraffic AVLDMD = new TypeTraffic("AVLDMD", 1, 1);
        public static final TypeTraffic BOTH = new TypeTraffic("BOTH", 2, 2);

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0086\u0002¨\u0006\u0007"}, d2 = {"Lcom/adif/elcanomovil/commonViews/data/StationViewEntity$TypeTraffic$Companion;", "", "()V", "invoke", "Lcom/adif/elcanomovil/commonViews/data/StationViewEntity$TypeTraffic;", "rawValue", "", "common-views_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @SourceDebugExtension({"SMAP\nStationViewEntity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StationViewEntity.kt\ncom/adif/elcanomovil/commonViews/data/StationViewEntity$TypeTraffic$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,99:1\n1#2:100\n*E\n"})
        /* loaded from: classes.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final TypeTraffic invoke(int rawValue) {
                for (TypeTraffic typeTraffic : TypeTraffic.values()) {
                    if (typeTraffic.getValue() == rawValue) {
                        return typeTraffic;
                    }
                }
                return null;
            }

            private Companion() {
            }
        }

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final class Creator implements Parcelable.Creator<TypeTraffic> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TypeTraffic createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return TypeTraffic.valueOf(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TypeTraffic[] newArray(int i) {
                return new TypeTraffic[i];
            }
        }

        private static final /* synthetic */ TypeTraffic[] $values() {
            return new TypeTraffic[]{CERCANIAS, AVLDMD, BOTH};
        }

        static {
            TypeTraffic[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
            INSTANCE = new Companion(null);
            CREATOR = new Creator();
        }

        private TypeTraffic(String str, int i, int i4) {
            this.value = i4;
        }

        public static EnumEntries<TypeTraffic> getEntries() {
            return $ENTRIES;
        }

        public static TypeTraffic valueOf(String str) {
            return (TypeTraffic) Enum.valueOf(TypeTraffic.class, str);
        }

        public static TypeTraffic[] values() {
            return (TypeTraffic[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final int getValue() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(name());
        }
    }

    public StationViewEntity(String id, String name, String alias, Float f2, Float f4, Location location, String str, String commercialZoneType, ArrayList<Service> services, Type type, ArrayList<Service> trafficType) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(alias, "alias");
        Intrinsics.checkNotNullParameter(commercialZoneType, "commercialZoneType");
        Intrinsics.checkNotNullParameter(services, "services");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(trafficType, "trafficType");
        this.id = id;
        this.name = name;
        this.alias = alias;
        this.distance = f2;
        this.duration = f4;
        this.location = location;
        this.city = str;
        this.commercialZoneType = commercialZoneType;
        this.services = services;
        this.type = type;
        this.trafficType = trafficType;
        this.trafficTypeValue = TypeTraffic.CERCANIAS;
    }

    public static /* synthetic */ StationViewEntity copy$default(StationViewEntity stationViewEntity, String str, String str2, String str3, Float f2, Float f4, Location location, String str4, String str5, ArrayList arrayList, Type type, ArrayList arrayList2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = stationViewEntity.id;
        }
        if ((i & 2) != 0) {
            str2 = stationViewEntity.name;
        }
        if ((i & 4) != 0) {
            str3 = stationViewEntity.alias;
        }
        if ((i & 8) != 0) {
            f2 = stationViewEntity.distance;
        }
        if ((i & 16) != 0) {
            f4 = stationViewEntity.duration;
        }
        if ((i & 32) != 0) {
            location = stationViewEntity.location;
        }
        if ((i & 64) != 0) {
            str4 = stationViewEntity.city;
        }
        if ((i & 128) != 0) {
            str5 = stationViewEntity.commercialZoneType;
        }
        if ((i & 256) != 0) {
            arrayList = stationViewEntity.services;
        }
        if ((i & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
            type = stationViewEntity.type;
        }
        if ((i & 1024) != 0) {
            arrayList2 = stationViewEntity.trafficType;
        }
        Type type2 = type;
        ArrayList arrayList3 = arrayList2;
        String str6 = str5;
        ArrayList arrayList4 = arrayList;
        Location location2 = location;
        String str7 = str4;
        Float f5 = f4;
        String str8 = str3;
        return stationViewEntity.copy(str, str2, str8, f2, f5, location2, str7, str6, arrayList4, type2, arrayList3);
    }

    public static /* synthetic */ void getTrafficTypeValue$annotations() {
    }

    public static /* synthetic */ void isArrivalsAvailable$annotations() {
    }

    public static /* synthetic */ void isCommercialAreaAvailable$annotations() {
    }

    public static /* synthetic */ void isDeparturesAvailable$annotations() {
    }

    public static /* synthetic */ void isInfoDetailAvailable$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final Type getType() {
        return this.type;
    }

    public final ArrayList<Service> component11() {
        return this.trafficType;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAlias() {
        return this.alias;
    }

    /* renamed from: component4, reason: from getter */
    public final Float getDistance() {
        return this.distance;
    }

    /* renamed from: component5, reason: from getter */
    public final Float getDuration() {
        return this.duration;
    }

    /* renamed from: component6, reason: from getter */
    public final Location getLocation() {
        return this.location;
    }

    /* renamed from: component7, reason: from getter */
    public final String getCity() {
        return this.city;
    }

    /* renamed from: component8, reason: from getter */
    public final String getCommercialZoneType() {
        return this.commercialZoneType;
    }

    public final ArrayList<Service> component9() {
        return this.services;
    }

    public final StationViewEntity copy(String id, String name, String alias, Float distance, Float duration, Location location, String city, String commercialZoneType, ArrayList<Service> services, Type type, ArrayList<Service> trafficType) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(alias, "alias");
        Intrinsics.checkNotNullParameter(commercialZoneType, "commercialZoneType");
        Intrinsics.checkNotNullParameter(services, "services");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(trafficType, "trafficType");
        return new StationViewEntity(id, name, alias, distance, duration, location, city, commercialZoneType, services, type, trafficType);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StationViewEntity)) {
            return false;
        }
        StationViewEntity stationViewEntity = (StationViewEntity) other;
        return Intrinsics.areEqual(this.id, stationViewEntity.id) && Intrinsics.areEqual(this.name, stationViewEntity.name) && Intrinsics.areEqual(this.alias, stationViewEntity.alias) && Intrinsics.areEqual((Object) this.distance, (Object) stationViewEntity.distance) && Intrinsics.areEqual((Object) this.duration, (Object) stationViewEntity.duration) && Intrinsics.areEqual(this.location, stationViewEntity.location) && Intrinsics.areEqual(this.city, stationViewEntity.city) && Intrinsics.areEqual(this.commercialZoneType, stationViewEntity.commercialZoneType) && Intrinsics.areEqual(this.services, stationViewEntity.services) && this.type == stationViewEntity.type && Intrinsics.areEqual(this.trafficType, stationViewEntity.trafficType);
    }

    public final String getAlias() {
        return this.alias;
    }

    public final String getCity() {
        return this.city;
    }

    public final String getCommercialZoneType() {
        return this.commercialZoneType;
    }

    public final Float getDistance() {
        return this.distance;
    }

    public final Float getDuration() {
        return this.duration;
    }

    public final String getId() {
        return this.id;
    }

    public final Location getLocation() {
        return this.location;
    }

    public final String getName() {
        return this.name;
    }

    public final ArrayList<Service> getServices() {
        return this.services;
    }

    public final ArrayList<Service> getTrafficType() {
        return this.trafficType;
    }

    public final TypeTraffic getTrafficTypeValue() {
        return this.trafficTypeValue;
    }

    public final Type getType() {
        return this.type;
    }

    public int hashCode() {
        int d4 = a.d(this.alias, a.d(this.name, this.id.hashCode() * 31, 31), 31);
        Float f2 = this.distance;
        int hashCode = (d4 + (f2 == null ? 0 : f2.hashCode())) * 31;
        Float f4 = this.duration;
        int hashCode2 = (hashCode + (f4 == null ? 0 : f4.hashCode())) * 31;
        Location location = this.location;
        int hashCode3 = (hashCode2 + (location == null ? 0 : location.hashCode())) * 31;
        String str = this.city;
        return this.trafficType.hashCode() + ((this.type.hashCode() + ((this.services.hashCode() + a.d(this.commercialZoneType, (hashCode3 + (str != null ? str.hashCode() : 0)) * 31, 31)) * 31)) * 31);
    }

    public final boolean isArrivalsAvailable() {
        return this.services.contains(Service.ARRIVALS);
    }

    public final boolean isCommercialAreaAvailable() {
        return this.services.contains(Service.COMMERCIAL);
    }

    public final boolean isDeparturesAvailable() {
        return this.services.contains(Service.DEPARTURES);
    }

    public final boolean isInfoDetailAvailable() {
        return this.services.contains(Service.INFO);
    }

    public final void setAlias(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.alias = str;
    }

    public final void setCity(String str) {
        this.city = str;
    }

    public final void setCommercialZoneType(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.commercialZoneType = str;
    }

    public final void setDistance(Float f2) {
        this.distance = f2;
    }

    public final void setDuration(Float f2) {
        this.duration = f2;
    }

    public final void setId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.id = str;
    }

    public final void setLocation(Location location) {
        this.location = location;
    }

    public final void setName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    public final void setServices(ArrayList<Service> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.services = arrayList;
    }

    public final void setTrafficType(ArrayList<Service> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.trafficType = arrayList;
    }

    public final void setType(Type type) {
        Intrinsics.checkNotNullParameter(type, "<set-?>");
        this.type = type;
    }

    public String toString() {
        return "StationViewEntity(id=" + this.id + ", name=" + this.name + ", alias=" + this.alias + ", distance=" + this.distance + ", duration=" + this.duration + ", location=" + this.location + ", city=" + this.city + ", commercialZoneType=" + this.commercialZoneType + ", services=" + this.services + ", type=" + this.type + ", trafficType=" + this.trafficType + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.id);
        parcel.writeString(this.name);
        parcel.writeString(this.alias);
        Float f2 = this.distance;
        if (f2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f2.floatValue());
        }
        Float f4 = this.duration;
        if (f4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f4.floatValue());
        }
        parcel.writeParcelable(this.location, flags);
        parcel.writeString(this.city);
        parcel.writeString(this.commercialZoneType);
        ArrayList<Service> arrayList = this.services;
        parcel.writeInt(arrayList.size());
        Iterator<Service> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, flags);
        }
        this.type.writeToParcel(parcel, flags);
        ArrayList<Service> arrayList2 = this.trafficType;
        parcel.writeInt(arrayList2.size());
        Iterator<Service> it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, flags);
        }
    }

    public /* synthetic */ StationViewEntity(String str, String str2, String str3, Float f2, Float f4, Location location, String str4, String str5, ArrayList arrayList, Type type, ArrayList arrayList2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? null : f2, (i & 16) != 0 ? null : f4, (i & 32) != 0 ? null : location, (i & 64) != 0 ? null : str4, str5, (i & 256) != 0 ? new ArrayList() : arrayList, (i & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? Type.STATION : type, (i & 1024) != 0 ? new ArrayList() : arrayList2);
    }
}
