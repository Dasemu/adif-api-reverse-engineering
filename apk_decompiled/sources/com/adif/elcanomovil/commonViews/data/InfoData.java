package com.adif.elcanomovil.commonViews.data;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;

@Parcelize
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\tJ2\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0017J\t\u0010\u0018\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0006HÖ\u0001R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010¨\u0006$"}, d2 = {"Lcom/adif/elcanomovil/commonViews/data/InfoData;", "Landroid/os/Parcelable;", "title", "", "msg", "image", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getImage", "()Ljava/lang/Integer;", "setImage", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getMsg", "()Ljava/lang/String;", "setMsg", "(Ljava/lang/String;)V", "getTitle", "setTitle", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/adif/elcanomovil/commonViews/data/InfoData;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "common-views_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class InfoData implements Parcelable {
    public static final Parcelable.Creator<InfoData> CREATOR = new Creator();
    private Integer image;
    private String msg;
    private String title;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<InfoData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InfoData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InfoData(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InfoData[] newArray(int i) {
            return new InfoData[i];
        }
    }

    public InfoData() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ InfoData copy$default(InfoData infoData, String str, String str2, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = infoData.title;
        }
        if ((i & 2) != 0) {
            str2 = infoData.msg;
        }
        if ((i & 4) != 0) {
            num = infoData.image;
        }
        return infoData.copy(str, str2, num);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMsg() {
        return this.msg;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getImage() {
        return this.image;
    }

    public final InfoData copy(String title, String msg, Integer image) {
        return new InfoData(title, msg, image);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InfoData)) {
            return false;
        }
        InfoData infoData = (InfoData) other;
        return Intrinsics.areEqual(this.title, infoData.title) && Intrinsics.areEqual(this.msg, infoData.msg) && Intrinsics.areEqual(this.image, infoData.image);
    }

    public final Integer getImage() {
        return this.image;
    }

    public final String getMsg() {
        return this.msg;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.msg;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.image;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final void setImage(Integer num) {
        this.image = num;
    }

    public final void setMsg(String str) {
        this.msg = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public String toString() {
        return "InfoData(title=" + this.title + ", msg=" + this.msg + ", image=" + this.image + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        int intValue;
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.title);
        parcel.writeString(this.msg);
        Integer num = this.image;
        if (num == null) {
            intValue = 0;
        } else {
            parcel.writeInt(1);
            intValue = num.intValue();
        }
        parcel.writeInt(intValue);
    }

    public InfoData(String str, String str2, Integer num) {
        this.title = str;
        this.msg = str2;
        this.image = num;
    }

    public /* synthetic */ InfoData(String str, String str2, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : num);
    }
}
