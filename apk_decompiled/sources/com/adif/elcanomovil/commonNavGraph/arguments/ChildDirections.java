package com.adif.elcanomovil.commonNavGraph.arguments;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import o0.C0523C;

@Parcelize
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0014\u0012\u000b\u0010\u0004\u001a\u00070\u0002¢\u0006\u0002\b\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001a\u00070\u0002¢\u0006\u0002\b\u0003HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\t\u001a\u00020\u00002\r\b\u0002\u0010\u0004\u001a\u00070\u0002¢\u0006\u0002\b\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0010J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0004\u001a\u00070\u0002¢\u0006\u0002\b\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\b¨\u0006 "}, d2 = {"Lcom/adif/elcanomovil/commonNavGraph/arguments/ChildDirections;", "Landroid/os/Parcelable;", "Lo0/C;", "Lkotlinx/parcelize/RawValue;", "deeplinkRequest", "<init>", "(Lo0/C;)V", "component1", "()Lo0/C;", "copy", "(Lo0/C;)Lcom/adif/elcanomovil/commonNavGraph/arguments/ChildDirections;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lo0/C;", "getDeeplinkRequest", "Companion", "common-nav-graph_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ChildDirections implements Parcelable {
    private final C0523C deeplinkRequest;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<ChildDirections> CREATOR = new Creator();

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/adif/elcanomovil/commonNavGraph/arguments/ChildDirections$Companion;", "", "()V", "fromRoutes", "Lcom/adif/elcanomovil/commonNavGraph/arguments/ChildDirections;", "route", "Landroid/net/Uri;", "common-nav-graph_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ChildDirections fromRoutes(Uri route) {
            Intrinsics.checkNotNullParameter(route, "route");
            Intrinsics.checkNotNullParameter(route, "uri");
            Intrinsics.checkNotNullParameter(route, "uri");
            return new ChildDirections(new C0523C(route, null, null));
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<ChildDirections> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChildDirections createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ChildDirections((C0523C) parcel.readValue(ChildDirections.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChildDirections[] newArray(int i) {
            return new ChildDirections[i];
        }
    }

    public ChildDirections(C0523C deeplinkRequest) {
        Intrinsics.checkNotNullParameter(deeplinkRequest, "deeplinkRequest");
        this.deeplinkRequest = deeplinkRequest;
    }

    public static /* synthetic */ ChildDirections copy$default(ChildDirections childDirections, C0523C c0523c, int i, Object obj) {
        if ((i & 1) != 0) {
            c0523c = childDirections.deeplinkRequest;
        }
        return childDirections.copy(c0523c);
    }

    /* renamed from: component1, reason: from getter */
    public final C0523C getDeeplinkRequest() {
        return this.deeplinkRequest;
    }

    public final ChildDirections copy(C0523C deeplinkRequest) {
        Intrinsics.checkNotNullParameter(deeplinkRequest, "deeplinkRequest");
        return new ChildDirections(deeplinkRequest);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ChildDirections) && Intrinsics.areEqual(this.deeplinkRequest, ((ChildDirections) other).deeplinkRequest);
    }

    public final C0523C getDeeplinkRequest() {
        return this.deeplinkRequest;
    }

    public int hashCode() {
        return this.deeplinkRequest.hashCode();
    }

    public String toString() {
        return "ChildDirections(deeplinkRequest=" + this.deeplinkRequest + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeValue(this.deeplinkRequest);
    }
}
