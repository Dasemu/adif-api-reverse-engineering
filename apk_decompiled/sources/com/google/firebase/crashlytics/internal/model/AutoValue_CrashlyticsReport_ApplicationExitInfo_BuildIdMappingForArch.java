package com.google.firebase.crashlytics.internal.model;

import C.w;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* loaded from: classes3.dex */
final class AutoValue_CrashlyticsReport_ApplicationExitInfo_BuildIdMappingForArch extends CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch {
    private final String arch;
    private final String buildId;
    private final String libraryName;

    /* loaded from: classes3.dex */
    public static final class Builder extends CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder {
        private String arch;
        private String buildId;
        private String libraryName;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder
        public CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch build() {
            String str = this.arch == null ? " arch" : "";
            if (this.libraryName == null) {
                str = w.n(str, " libraryName");
            }
            if (this.buildId == null) {
                str = w.n(str, " buildId");
            }
            if (str.isEmpty()) {
                return new AutoValue_CrashlyticsReport_ApplicationExitInfo_BuildIdMappingForArch(this.arch, this.libraryName, this.buildId);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder
        public CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder setArch(String str) {
            if (str == null) {
                throw new NullPointerException("Null arch");
            }
            this.arch = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder
        public CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder setBuildId(String str) {
            if (str == null) {
                throw new NullPointerException("Null buildId");
            }
            this.buildId = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder
        public CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder setLibraryName(String str) {
            if (str == null) {
                throw new NullPointerException("Null libraryName");
            }
            this.libraryName = str;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch) {
            CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch buildIdMappingForArch = (CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch) obj;
            if (this.arch.equals(buildIdMappingForArch.getArch()) && this.libraryName.equals(buildIdMappingForArch.getLibraryName()) && this.buildId.equals(buildIdMappingForArch.getBuildId())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch
    public String getArch() {
        return this.arch;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch
    public String getBuildId() {
        return this.buildId;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch
    public String getLibraryName() {
        return this.libraryName;
    }

    public int hashCode() {
        return this.buildId.hashCode() ^ ((((this.arch.hashCode() ^ 1000003) * 1000003) ^ this.libraryName.hashCode()) * 1000003);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BuildIdMappingForArch{arch=");
        sb.append(this.arch);
        sb.append(", libraryName=");
        sb.append(this.libraryName);
        sb.append(", buildId=");
        return w.r(sb, this.buildId, "}");
    }

    private AutoValue_CrashlyticsReport_ApplicationExitInfo_BuildIdMappingForArch(String str, String str2, String str3) {
        this.arch = str;
        this.libraryName = str2;
        this.buildId = str3;
    }
}
