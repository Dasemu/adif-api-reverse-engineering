package com.google.firebase.crashlytics.internal.common;

import C.w;
import com.google.firebase.crashlytics.internal.common.InstallIdProvider;

/* loaded from: classes3.dex */
final class AutoValue_InstallIdProvider_InstallIds extends InstallIdProvider.InstallIds {
    private final String crashlyticsInstallId;
    private final String firebaseInstallationId;

    public AutoValue_InstallIdProvider_InstallIds(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null crashlyticsInstallId");
        }
        this.crashlyticsInstallId = str;
        this.firebaseInstallationId = str2;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof InstallIdProvider.InstallIds) {
            InstallIdProvider.InstallIds installIds = (InstallIdProvider.InstallIds) obj;
            if (this.crashlyticsInstallId.equals(installIds.getCrashlyticsInstallId()) && ((str = this.firebaseInstallationId) != null ? str.equals(installIds.getFirebaseInstallationId()) : installIds.getFirebaseInstallationId() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.common.InstallIdProvider.InstallIds
    public String getCrashlyticsInstallId() {
        return this.crashlyticsInstallId;
    }

    @Override // com.google.firebase.crashlytics.internal.common.InstallIdProvider.InstallIds
    public String getFirebaseInstallationId() {
        return this.firebaseInstallationId;
    }

    public int hashCode() {
        int hashCode = (this.crashlyticsInstallId.hashCode() ^ 1000003) * 1000003;
        String str = this.firebaseInstallationId;
        return (str == null ? 0 : str.hashCode()) ^ hashCode;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("InstallIds{crashlyticsInstallId=");
        sb.append(this.crashlyticsInstallId);
        sb.append(", firebaseInstallationId=");
        return w.r(sb, this.firebaseInstallationId, "}");
    }
}
