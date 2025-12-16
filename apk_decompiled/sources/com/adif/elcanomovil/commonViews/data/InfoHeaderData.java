package com.adif.elcanomovil.commonViews.data;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;

@Parcelize
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\tJ2\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0017J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0005HÖ\u0001R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006$"}, d2 = {"Lcom/adif/elcanomovil/commonViews/data/InfoHeaderData;", "Landroid/os/Parcelable;", "title", "", "imageLeft", "", "imageRight", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getImageLeft", "()Ljava/lang/Integer;", "setImageLeft", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getImageRight", "setImageRight", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/adif/elcanomovil/commonViews/data/InfoHeaderData;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "common-views_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class InfoHeaderData implements Parcelable {
    public static final Parcelable.Creator<InfoHeaderData> CREATOR = new Creator();
    private Integer imageLeft;
    private Integer imageRight;
    private String title;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<InfoHeaderData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InfoHeaderData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InfoHeaderData(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InfoHeaderData[] newArray(int i) {
            return new InfoHeaderData[i];
        }
    }

    public InfoHeaderData() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ InfoHeaderData copy$default(InfoHeaderData infoHeaderData, String str, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = infoHeaderData.title;
        }
        if ((i & 2) != 0) {
            num = infoHeaderData.imageLeft;
        }
        if ((i & 4) != 0) {
            num2 = infoHeaderData.imageRight;
        }
        return infoHeaderData.copy(str, num, num2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getImageLeft() {
        return this.imageLeft;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getImageRight() {
        return this.imageRight;
    }

    public final InfoHeaderData copy(String title, Integer imageLeft, Integer imageRight) {
        return new InfoHeaderData(title, imageLeft, imageRight);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InfoHeaderData)) {
            return false;
        }
        InfoHeaderData infoHeaderData = (InfoHeaderData) other;
        return Intrinsics.areEqual(this.title, infoHeaderData.title) && Intrinsics.areEqual(this.imageLeft, infoHeaderData.imageLeft) && Intrinsics.areEqual(this.imageRight, infoHeaderData.imageRight);
    }

    public final Integer getImageLeft() {
        return this.imageLeft;
    }

    public final Integer getImageRight() {
        return this.imageRight;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.imageLeft;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.imageRight;
        return hashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final void setImageLeft(Integer num) {
        this.imageLeft = num;
    }

    public final void setImageRight(Integer num) {
        this.imageRight = num;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public String toString() {
        return "InfoHeaderData(title=" + this.title + ", imageLeft=" + this.imageLeft + ", imageRight=" + this.imageRight + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.title);
        Integer num = this.imageLeft;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.imageRight;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
    }

    public InfoHeaderData(String str, Integer num, Integer num2) {
        this.title = str;
        this.imageLeft = num;
        this.imageRight = num2;
    }

    public /* synthetic */ InfoHeaderData(String str, Integer num, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2);
    }
}
