package com.adif.elcanomovil.uiHome.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.adif.elcanomovil.commonNavGraph.arguments.NavArguments;
import com.adif.elcanomovil.commonViews.data.StationViewEntity;
import com.adif.elcanomovil.domain.entities.DataType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;

@Parcelize
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010'\u001a\u00020\nHÆ\u0003J\t\u0010(\u001a\u00020\fHÆ\u0003JS\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\t\u0010*\u001a\u00020+HÖ\u0001J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/HÖ\u0003J\t\u00100\u001a\u00020+HÖ\u0001J\t\u00101\u001a\u00020\u0003HÖ\u0001J\u0019\u00102\u001a\u0002032\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u00020+HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u0017R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u00067"}, d2 = {"Lcom/adif/elcanomovil/uiHome/data/UserFavoriteVO;", "Landroid/os/Parcelable;", NavArguments.ARG_TYPE_NOTIFICATION_JSON_MESSAGE_TRAIN, "", "title", "", "identifierStation", "subtitle", "identifierToStation", "type", "Lcom/adif/elcanomovil/domain/entities/DataType;", NavArguments.ARG_DYNAMIC_LINKS_STATION_TRAFFIC, "Lcom/adif/elcanomovil/commonViews/data/StationViewEntity$TypeTraffic;", "(Ljava/lang/String;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/CharSequence;Ljava/lang/String;Lcom/adif/elcanomovil/domain/entities/DataType;Lcom/adif/elcanomovil/commonViews/data/StationViewEntity$TypeTraffic;)V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getIdentifierStation", "getIdentifierToStation", "getSubtitle", "()Ljava/lang/CharSequence;", "setSubtitle", "(Ljava/lang/CharSequence;)V", "getTitle", "setTitle", "getTrafficType", "()Lcom/adif/elcanomovil/commonViews/data/StationViewEntity$TypeTraffic;", "setTrafficType", "(Lcom/adif/elcanomovil/commonViews/data/StationViewEntity$TypeTraffic;)V", "getType", "()Lcom/adif/elcanomovil/domain/entities/DataType;", "setType", "(Lcom/adif/elcanomovil/domain/entities/DataType;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "ui-home_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class UserFavoriteVO implements Parcelable {
    public static final Parcelable.Creator<UserFavoriteVO> CREATOR = new Creator();
    private String id;
    private final String identifierStation;
    private final String identifierToStation;
    private CharSequence subtitle;
    private CharSequence title;
    private StationViewEntity.TypeTraffic trafficType;
    private DataType type;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Creator implements Parcelable.Creator<UserFavoriteVO> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UserFavoriteVO createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
            return new UserFavoriteVO(readString, (CharSequence) creator.createFromParcel(parcel), parcel.readString(), (CharSequence) creator.createFromParcel(parcel), parcel.readString(), (DataType) parcel.readParcelable(UserFavoriteVO.class.getClassLoader()), (StationViewEntity.TypeTraffic) parcel.readParcelable(UserFavoriteVO.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UserFavoriteVO[] newArray(int i) {
            return new UserFavoriteVO[i];
        }
    }

    public UserFavoriteVO(String id, CharSequence title, String str, CharSequence subtitle, String str2, DataType type, StationViewEntity.TypeTraffic trafficType) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(trafficType, "trafficType");
        this.id = id;
        this.title = title;
        this.identifierStation = str;
        this.subtitle = subtitle;
        this.identifierToStation = str2;
        this.type = type;
        this.trafficType = trafficType;
    }

    public static /* synthetic */ UserFavoriteVO copy$default(UserFavoriteVO userFavoriteVO, String str, CharSequence charSequence, String str2, CharSequence charSequence2, String str3, DataType dataType, StationViewEntity.TypeTraffic typeTraffic, int i, Object obj) {
        if ((i & 1) != 0) {
            str = userFavoriteVO.id;
        }
        if ((i & 2) != 0) {
            charSequence = userFavoriteVO.title;
        }
        if ((i & 4) != 0) {
            str2 = userFavoriteVO.identifierStation;
        }
        if ((i & 8) != 0) {
            charSequence2 = userFavoriteVO.subtitle;
        }
        if ((i & 16) != 0) {
            str3 = userFavoriteVO.identifierToStation;
        }
        if ((i & 32) != 0) {
            dataType = userFavoriteVO.type;
        }
        if ((i & 64) != 0) {
            typeTraffic = userFavoriteVO.trafficType;
        }
        DataType dataType2 = dataType;
        StationViewEntity.TypeTraffic typeTraffic2 = typeTraffic;
        String str4 = str3;
        String str5 = str2;
        return userFavoriteVO.copy(str, charSequence, str5, charSequence2, str4, dataType2, typeTraffic2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final CharSequence getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getIdentifierStation() {
        return this.identifierStation;
    }

    /* renamed from: component4, reason: from getter */
    public final CharSequence getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component5, reason: from getter */
    public final String getIdentifierToStation() {
        return this.identifierToStation;
    }

    /* renamed from: component6, reason: from getter */
    public final DataType getType() {
        return this.type;
    }

    /* renamed from: component7, reason: from getter */
    public final StationViewEntity.TypeTraffic getTrafficType() {
        return this.trafficType;
    }

    public final UserFavoriteVO copy(String id, CharSequence title, String identifierStation, CharSequence subtitle, String identifierToStation, DataType type, StationViewEntity.TypeTraffic trafficType) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(trafficType, "trafficType");
        return new UserFavoriteVO(id, title, identifierStation, subtitle, identifierToStation, type, trafficType);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserFavoriteVO)) {
            return false;
        }
        UserFavoriteVO userFavoriteVO = (UserFavoriteVO) other;
        return Intrinsics.areEqual(this.id, userFavoriteVO.id) && Intrinsics.areEqual(this.title, userFavoriteVO.title) && Intrinsics.areEqual(this.identifierStation, userFavoriteVO.identifierStation) && Intrinsics.areEqual(this.subtitle, userFavoriteVO.subtitle) && Intrinsics.areEqual(this.identifierToStation, userFavoriteVO.identifierToStation) && this.type == userFavoriteVO.type && this.trafficType == userFavoriteVO.trafficType;
    }

    public final String getId() {
        return this.id;
    }

    public final String getIdentifierStation() {
        return this.identifierStation;
    }

    public final String getIdentifierToStation() {
        return this.identifierToStation;
    }

    public final CharSequence getSubtitle() {
        return this.subtitle;
    }

    public final CharSequence getTitle() {
        return this.title;
    }

    public final StationViewEntity.TypeTraffic getTrafficType() {
        return this.trafficType;
    }

    public final DataType getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = (this.title.hashCode() + (this.id.hashCode() * 31)) * 31;
        String str = this.identifierStation;
        int hashCode2 = (this.subtitle.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        String str2 = this.identifierToStation;
        int hashCode3 = str2 != null ? str2.hashCode() : 0;
        return this.trafficType.hashCode() + ((this.type.hashCode() + ((hashCode2 + hashCode3) * 31)) * 31);
    }

    public final void setId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.id = str;
    }

    public final void setSubtitle(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<set-?>");
        this.subtitle = charSequence;
    }

    public final void setTitle(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<set-?>");
        this.title = charSequence;
    }

    public final void setTrafficType(StationViewEntity.TypeTraffic typeTraffic) {
        Intrinsics.checkNotNullParameter(typeTraffic, "<set-?>");
        this.trafficType = typeTraffic;
    }

    public final void setType(DataType dataType) {
        Intrinsics.checkNotNullParameter(dataType, "<set-?>");
        this.type = dataType;
    }

    public String toString() {
        return "UserFavoriteVO(id=" + this.id + ", title=" + ((Object) this.title) + ", identifierStation=" + this.identifierStation + ", subtitle=" + ((Object) this.subtitle) + ", identifierToStation=" + this.identifierToStation + ", type=" + this.type + ", trafficType=" + this.trafficType + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.id);
        TextUtils.writeToParcel(this.title, parcel, flags);
        parcel.writeString(this.identifierStation);
        TextUtils.writeToParcel(this.subtitle, parcel, flags);
        parcel.writeString(this.identifierToStation);
        parcel.writeParcelable(this.type, flags);
        parcel.writeParcelable(this.trafficType, flags);
    }
}
