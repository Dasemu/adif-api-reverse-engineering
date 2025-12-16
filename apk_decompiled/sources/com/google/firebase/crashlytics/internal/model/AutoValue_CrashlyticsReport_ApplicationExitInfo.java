package com.google.firebase.crashlytics.internal.model;

import C.w;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.List;

/* loaded from: classes3.dex */
final class AutoValue_CrashlyticsReport_ApplicationExitInfo extends CrashlyticsReport.ApplicationExitInfo {
    private final List<CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch> buildIdMappingForArch;
    private final int importance;
    private final int pid;
    private final String processName;
    private final long pss;
    private final int reasonCode;
    private final long rss;
    private final long timestamp;
    private final String traceFile;

    /* loaded from: classes3.dex */
    public static final class Builder extends CrashlyticsReport.ApplicationExitInfo.Builder {
        private List<CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch> buildIdMappingForArch;
        private Integer importance;
        private Integer pid;
        private String processName;
        private Long pss;
        private Integer reasonCode;
        private Long rss;
        private Long timestamp;
        private String traceFile;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public CrashlyticsReport.ApplicationExitInfo build() {
            String str = this.pid == null ? " pid" : "";
            if (this.processName == null) {
                str = w.n(str, " processName");
            }
            if (this.reasonCode == null) {
                str = w.n(str, " reasonCode");
            }
            if (this.importance == null) {
                str = w.n(str, " importance");
            }
            if (this.pss == null) {
                str = w.n(str, " pss");
            }
            if (this.rss == null) {
                str = w.n(str, " rss");
            }
            if (this.timestamp == null) {
                str = w.n(str, " timestamp");
            }
            if (str.isEmpty()) {
                return new AutoValue_CrashlyticsReport_ApplicationExitInfo(this.pid.intValue(), this.processName, this.reasonCode.intValue(), this.importance.intValue(), this.pss.longValue(), this.rss.longValue(), this.timestamp.longValue(), this.traceFile, this.buildIdMappingForArch);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public CrashlyticsReport.ApplicationExitInfo.Builder setBuildIdMappingForArch(List<CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch> list) {
            this.buildIdMappingForArch = list;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public CrashlyticsReport.ApplicationExitInfo.Builder setImportance(int i) {
            this.importance = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public CrashlyticsReport.ApplicationExitInfo.Builder setPid(int i) {
            this.pid = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public CrashlyticsReport.ApplicationExitInfo.Builder setProcessName(String str) {
            if (str == null) {
                throw new NullPointerException("Null processName");
            }
            this.processName = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public CrashlyticsReport.ApplicationExitInfo.Builder setPss(long j4) {
            this.pss = Long.valueOf(j4);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public CrashlyticsReport.ApplicationExitInfo.Builder setReasonCode(int i) {
            this.reasonCode = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public CrashlyticsReport.ApplicationExitInfo.Builder setRss(long j4) {
            this.rss = Long.valueOf(j4);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public CrashlyticsReport.ApplicationExitInfo.Builder setTimestamp(long j4) {
            this.timestamp = Long.valueOf(j4);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public CrashlyticsReport.ApplicationExitInfo.Builder setTraceFile(String str) {
            this.traceFile = str;
            return this;
        }
    }

    public boolean equals(Object obj) {
        String str;
        List<CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch> list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.ApplicationExitInfo) {
            CrashlyticsReport.ApplicationExitInfo applicationExitInfo = (CrashlyticsReport.ApplicationExitInfo) obj;
            if (this.pid == applicationExitInfo.getPid() && this.processName.equals(applicationExitInfo.getProcessName()) && this.reasonCode == applicationExitInfo.getReasonCode() && this.importance == applicationExitInfo.getImportance() && this.pss == applicationExitInfo.getPss() && this.rss == applicationExitInfo.getRss() && this.timestamp == applicationExitInfo.getTimestamp() && ((str = this.traceFile) != null ? str.equals(applicationExitInfo.getTraceFile()) : applicationExitInfo.getTraceFile() == null) && ((list = this.buildIdMappingForArch) != null ? list.equals(applicationExitInfo.getBuildIdMappingForArch()) : applicationExitInfo.getBuildIdMappingForArch() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    public List<CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch> getBuildIdMappingForArch() {
        return this.buildIdMappingForArch;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    public int getImportance() {
        return this.importance;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    public int getPid() {
        return this.pid;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    public String getProcessName() {
        return this.processName;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    public long getPss() {
        return this.pss;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    public int getReasonCode() {
        return this.reasonCode;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    public long getRss() {
        return this.rss;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    public long getTimestamp() {
        return this.timestamp;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    public String getTraceFile() {
        return this.traceFile;
    }

    public int hashCode() {
        int hashCode = (((((((this.pid ^ 1000003) * 1000003) ^ this.processName.hashCode()) * 1000003) ^ this.reasonCode) * 1000003) ^ this.importance) * 1000003;
        long j4 = this.pss;
        int i = (hashCode ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003;
        long j5 = this.rss;
        int i4 = (i ^ ((int) (j5 ^ (j5 >>> 32)))) * 1000003;
        long j6 = this.timestamp;
        int i5 = (i4 ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003;
        String str = this.traceFile;
        int hashCode2 = (i5 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch> list = this.buildIdMappingForArch;
        return hashCode2 ^ (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "ApplicationExitInfo{pid=" + this.pid + ", processName=" + this.processName + ", reasonCode=" + this.reasonCode + ", importance=" + this.importance + ", pss=" + this.pss + ", rss=" + this.rss + ", timestamp=" + this.timestamp + ", traceFile=" + this.traceFile + ", buildIdMappingForArch=" + this.buildIdMappingForArch + "}";
    }

    private AutoValue_CrashlyticsReport_ApplicationExitInfo(int i, String str, int i4, int i5, long j4, long j5, long j6, String str2, List<CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch> list) {
        this.pid = i;
        this.processName = str;
        this.reasonCode = i4;
        this.importance = i5;
        this.pss = j4;
        this.rss = j5;
        this.timestamp = j6;
        this.traceFile = str2;
        this.buildIdMappingForArch = list;
    }
}
