package com.adif.elcanomovil.domain.entities.deeplink;

import com.google.android.gms.measurement.internal.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/adif/elcanomovil/domain/entities/deeplink/SocialMetaTag;", "", "title", "", "message", "imageUrl", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getImageUrl", "()Ljava/lang/String;", "getMessage", "getTitle", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class SocialMetaTag {
    private final String imageUrl;
    private final String message;
    private final String title;

    public SocialMetaTag(String title, String message, String imageUrl) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        this.title = title;
        this.message = message;
        this.imageUrl = imageUrl;
    }

    public static /* synthetic */ SocialMetaTag copy$default(SocialMetaTag socialMetaTag, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = socialMetaTag.title;
        }
        if ((i & 2) != 0) {
            str2 = socialMetaTag.message;
        }
        if ((i & 4) != 0) {
            str3 = socialMetaTag.imageUrl;
        }
        return socialMetaTag.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: component3, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final SocialMetaTag copy(String title, String message, String imageUrl) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        return new SocialMetaTag(title, message, imageUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SocialMetaTag)) {
            return false;
        }
        SocialMetaTag socialMetaTag = (SocialMetaTag) other;
        return Intrinsics.areEqual(this.title, socialMetaTag.title) && Intrinsics.areEqual(this.message, socialMetaTag.message) && Intrinsics.areEqual(this.imageUrl, socialMetaTag.imageUrl);
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.imageUrl.hashCode() + a.d(this.message, this.title.hashCode() * 31, 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SocialMetaTag(title=");
        sb.append(this.title);
        sb.append(", message=");
        sb.append(this.message);
        sb.append(", imageUrl=");
        return a.n(sb, this.imageUrl, ')');
    }
}
