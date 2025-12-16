package com.adif.elcanomovil.domain.entities;

import com.google.android.gms.measurement.internal.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/adif/elcanomovil/domain/entities/RemoteConfiguration;", "", "latestReleasedVersion", "", "latestPermittedVersion", "urlStore", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getLatestPermittedVersion", "()Ljava/lang/String;", "getLatestReleasedVersion", "getUrlStore", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class RemoteConfiguration {
    private final String latestPermittedVersion;
    private final String latestReleasedVersion;
    private final String urlStore;

    public RemoteConfiguration() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ RemoteConfiguration copy$default(RemoteConfiguration remoteConfiguration, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = remoteConfiguration.latestReleasedVersion;
        }
        if ((i & 2) != 0) {
            str2 = remoteConfiguration.latestPermittedVersion;
        }
        if ((i & 4) != 0) {
            str3 = remoteConfiguration.urlStore;
        }
        return remoteConfiguration.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getLatestReleasedVersion() {
        return this.latestReleasedVersion;
    }

    /* renamed from: component2, reason: from getter */
    public final String getLatestPermittedVersion() {
        return this.latestPermittedVersion;
    }

    /* renamed from: component3, reason: from getter */
    public final String getUrlStore() {
        return this.urlStore;
    }

    public final RemoteConfiguration copy(String latestReleasedVersion, String latestPermittedVersion, String urlStore) {
        Intrinsics.checkNotNullParameter(latestReleasedVersion, "latestReleasedVersion");
        Intrinsics.checkNotNullParameter(latestPermittedVersion, "latestPermittedVersion");
        Intrinsics.checkNotNullParameter(urlStore, "urlStore");
        return new RemoteConfiguration(latestReleasedVersion, latestPermittedVersion, urlStore);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RemoteConfiguration)) {
            return false;
        }
        RemoteConfiguration remoteConfiguration = (RemoteConfiguration) other;
        return Intrinsics.areEqual(this.latestReleasedVersion, remoteConfiguration.latestReleasedVersion) && Intrinsics.areEqual(this.latestPermittedVersion, remoteConfiguration.latestPermittedVersion) && Intrinsics.areEqual(this.urlStore, remoteConfiguration.urlStore);
    }

    public final String getLatestPermittedVersion() {
        return this.latestPermittedVersion;
    }

    public final String getLatestReleasedVersion() {
        return this.latestReleasedVersion;
    }

    public final String getUrlStore() {
        return this.urlStore;
    }

    public int hashCode() {
        return this.urlStore.hashCode() + a.d(this.latestPermittedVersion, this.latestReleasedVersion.hashCode() * 31, 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("RemoteConfiguration(latestReleasedVersion=");
        sb.append(this.latestReleasedVersion);
        sb.append(", latestPermittedVersion=");
        sb.append(this.latestPermittedVersion);
        sb.append(", urlStore=");
        return a.n(sb, this.urlStore, ')');
    }

    public RemoteConfiguration(String latestReleasedVersion, String latestPermittedVersion, String urlStore) {
        Intrinsics.checkNotNullParameter(latestReleasedVersion, "latestReleasedVersion");
        Intrinsics.checkNotNullParameter(latestPermittedVersion, "latestPermittedVersion");
        Intrinsics.checkNotNullParameter(urlStore, "urlStore");
        this.latestReleasedVersion = latestReleasedVersion;
        this.latestPermittedVersion = latestPermittedVersion;
        this.urlStore = urlStore;
    }

    public /* synthetic */ RemoteConfiguration(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }
}
