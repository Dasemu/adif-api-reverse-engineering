package com.adif.elcanomovil.uiAvisa.components.create;

import android.net.Uri;
import com.adif.elcanomovil.commonNavGraph.navigation.Navigation;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\u0003\u0004\u0005\u0006\u0007\b\tB\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0007\n\u000b\f\r\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lcom/adif/elcanomovil/uiAvisa/components/create/NavigateTo;", "", "()V", "AskForCameraPermission", "EditPicture", "NavigateUp", "PickImageFromCamera", "PickImageFromGallery", "PickPicture", "RegularNavigation", "Lcom/adif/elcanomovil/uiAvisa/components/create/NavigateTo$AskForCameraPermission;", "Lcom/adif/elcanomovil/uiAvisa/components/create/NavigateTo$EditPicture;", "Lcom/adif/elcanomovil/uiAvisa/components/create/NavigateTo$NavigateUp;", "Lcom/adif/elcanomovil/uiAvisa/components/create/NavigateTo$PickImageFromCamera;", "Lcom/adif/elcanomovil/uiAvisa/components/create/NavigateTo$PickImageFromGallery;", "Lcom/adif/elcanomovil/uiAvisa/components/create/NavigateTo$PickPicture;", "Lcom/adif/elcanomovil/uiAvisa/components/create/NavigateTo$RegularNavigation;", "ui-avisa_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class NavigateTo {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/adif/elcanomovil/uiAvisa/components/create/NavigateTo$AskForCameraPermission;", "Lcom/adif/elcanomovil/uiAvisa/components/create/NavigateTo;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ui-avisa_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final /* data */ class AskForCameraPermission extends NavigateTo {
        public static final AskForCameraPermission INSTANCE = new AskForCameraPermission();

        private AskForCameraPermission() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof AskForCameraPermission);
        }

        public int hashCode() {
            return -72677138;
        }

        public String toString() {
            return "AskForCameraPermission";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/adif/elcanomovil/uiAvisa/components/create/NavigateTo$EditPicture;", "Lcom/adif/elcanomovil/uiAvisa/components/create/NavigateTo;", "position", "", "pictureContent", "", "(ILjava/lang/String;)V", "getPictureContent", "()Ljava/lang/String;", "getPosition", "()I", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "ui-avisa_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final /* data */ class EditPicture extends NavigateTo {
        private final String pictureContent;
        private final int position;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EditPicture(int i, String pictureContent) {
            super(null);
            Intrinsics.checkNotNullParameter(pictureContent, "pictureContent");
            this.position = i;
            this.pictureContent = pictureContent;
        }

        public static /* synthetic */ EditPicture copy$default(EditPicture editPicture, int i, String str, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                i = editPicture.position;
            }
            if ((i4 & 2) != 0) {
                str = editPicture.pictureContent;
            }
            return editPicture.copy(i, str);
        }

        /* renamed from: component1, reason: from getter */
        public final int getPosition() {
            return this.position;
        }

        /* renamed from: component2, reason: from getter */
        public final String getPictureContent() {
            return this.pictureContent;
        }

        public final EditPicture copy(int position, String pictureContent) {
            Intrinsics.checkNotNullParameter(pictureContent, "pictureContent");
            return new EditPicture(position, pictureContent);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EditPicture)) {
                return false;
            }
            EditPicture editPicture = (EditPicture) other;
            return this.position == editPicture.position && Intrinsics.areEqual(this.pictureContent, editPicture.pictureContent);
        }

        public final String getPictureContent() {
            return this.pictureContent;
        }

        public final int getPosition() {
            return this.position;
        }

        public int hashCode() {
            return this.pictureContent.hashCode() + (Integer.hashCode(this.position) * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("EditPicture(position=");
            sb.append(this.position);
            sb.append(", pictureContent=");
            return com.google.android.gms.measurement.internal.a.n(sb, this.pictureContent, ')');
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/adif/elcanomovil/uiAvisa/components/create/NavigateTo$NavigateUp;", "Lcom/adif/elcanomovil/uiAvisa/components/create/NavigateTo;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ui-avisa_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final /* data */ class NavigateUp extends NavigateTo {
        public static final NavigateUp INSTANCE = new NavigateUp();

        private NavigateUp() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof NavigateUp);
        }

        public int hashCode() {
            return 1764021590;
        }

        public String toString() {
            return "NavigateUp";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/adif/elcanomovil/uiAvisa/components/create/NavigateTo$PickImageFromCamera;", "Lcom/adif/elcanomovil/uiAvisa/components/create/NavigateTo;", "imageUri", "Landroid/net/Uri;", "(Landroid/net/Uri;)V", "getImageUri", "()Landroid/net/Uri;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ui-avisa_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final /* data */ class PickImageFromCamera extends NavigateTo {
        private final Uri imageUri;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PickImageFromCamera(Uri imageUri) {
            super(null);
            Intrinsics.checkNotNullParameter(imageUri, "imageUri");
            this.imageUri = imageUri;
        }

        public static /* synthetic */ PickImageFromCamera copy$default(PickImageFromCamera pickImageFromCamera, Uri uri, int i, Object obj) {
            if ((i & 1) != 0) {
                uri = pickImageFromCamera.imageUri;
            }
            return pickImageFromCamera.copy(uri);
        }

        /* renamed from: component1, reason: from getter */
        public final Uri getImageUri() {
            return this.imageUri;
        }

        public final PickImageFromCamera copy(Uri imageUri) {
            Intrinsics.checkNotNullParameter(imageUri, "imageUri");
            return new PickImageFromCamera(imageUri);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PickImageFromCamera) && Intrinsics.areEqual(this.imageUri, ((PickImageFromCamera) other).imageUri);
        }

        public final Uri getImageUri() {
            return this.imageUri;
        }

        public int hashCode() {
            return this.imageUri.hashCode();
        }

        public String toString() {
            return "PickImageFromCamera(imageUri=" + this.imageUri + ')';
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/adif/elcanomovil/uiAvisa/components/create/NavigateTo$PickImageFromGallery;", "Lcom/adif/elcanomovil/uiAvisa/components/create/NavigateTo;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ui-avisa_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final /* data */ class PickImageFromGallery extends NavigateTo {
        public static final PickImageFromGallery INSTANCE = new PickImageFromGallery();

        private PickImageFromGallery() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof PickImageFromGallery);
        }

        public int hashCode() {
            return 1944391448;
        }

        public String toString() {
            return "PickImageFromGallery";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/adif/elcanomovil/uiAvisa/components/create/NavigateTo$PickPicture;", "Lcom/adif/elcanomovil/uiAvisa/components/create/NavigateTo;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ui-avisa_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final /* data */ class PickPicture extends NavigateTo {
        public static final PickPicture INSTANCE = new PickPicture();

        private PickPicture() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof PickPicture);
        }

        public int hashCode() {
            return -1572336269;
        }

        public String toString() {
            return "PickPicture";
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/adif/elcanomovil/uiAvisa/components/create/NavigateTo$RegularNavigation;", "Lcom/adif/elcanomovil/uiAvisa/components/create/NavigateTo;", "navigation", "Lcom/adif/elcanomovil/commonNavGraph/navigation/Navigation;", "(Lcom/adif/elcanomovil/commonNavGraph/navigation/Navigation;)V", "getNavigation", "()Lcom/adif/elcanomovil/commonNavGraph/navigation/Navigation;", "ui-avisa_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class RegularNavigation extends NavigateTo {
        private final Navigation navigation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RegularNavigation(Navigation navigation) {
            super(null);
            Intrinsics.checkNotNullParameter(navigation, "navigation");
            this.navigation = navigation;
        }

        public final Navigation getNavigation() {
            return this.navigation;
        }
    }

    public /* synthetic */ NavigateTo(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private NavigateTo() {
    }
}
