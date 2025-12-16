package com.google.firebase.crashlytics.internal.model;

import C.w;
import com.google.android.gms.measurement.internal.a;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.List;

/* loaded from: classes3.dex */
final class AutoValue_CrashlyticsReport_Session_Event_Application extends CrashlyticsReport.Session.Event.Application {
    private final List<CrashlyticsReport.Session.Event.Application.ProcessDetails> appProcessDetails;
    private final Boolean background;
    private final CrashlyticsReport.Session.Event.Application.ProcessDetails currentProcessDetails;
    private final List<CrashlyticsReport.CustomAttribute> customAttributes;
    private final CrashlyticsReport.Session.Event.Application.Execution execution;
    private final List<CrashlyticsReport.CustomAttribute> internalKeys;
    private final int uiOrientation;

    /* loaded from: classes3.dex */
    public static final class Builder extends CrashlyticsReport.Session.Event.Application.Builder {
        private List<CrashlyticsReport.Session.Event.Application.ProcessDetails> appProcessDetails;
        private Boolean background;
        private CrashlyticsReport.Session.Event.Application.ProcessDetails currentProcessDetails;
        private List<CrashlyticsReport.CustomAttribute> customAttributes;
        private CrashlyticsReport.Session.Event.Application.Execution execution;
        private List<CrashlyticsReport.CustomAttribute> internalKeys;
        private Integer uiOrientation;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder
        public CrashlyticsReport.Session.Event.Application build() {
            String str = this.execution == null ? " execution" : "";
            if (this.uiOrientation == null) {
                str = w.n(str, " uiOrientation");
            }
            if (str.isEmpty()) {
                return new AutoValue_CrashlyticsReport_Session_Event_Application(this.execution, this.customAttributes, this.internalKeys, this.background, this.currentProcessDetails, this.appProcessDetails, this.uiOrientation.intValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder
        public CrashlyticsReport.Session.Event.Application.Builder setAppProcessDetails(List<CrashlyticsReport.Session.Event.Application.ProcessDetails> list) {
            this.appProcessDetails = list;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder
        public CrashlyticsReport.Session.Event.Application.Builder setBackground(Boolean bool) {
            this.background = bool;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder
        public CrashlyticsReport.Session.Event.Application.Builder setCurrentProcessDetails(CrashlyticsReport.Session.Event.Application.ProcessDetails processDetails) {
            this.currentProcessDetails = processDetails;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder
        public CrashlyticsReport.Session.Event.Application.Builder setCustomAttributes(List<CrashlyticsReport.CustomAttribute> list) {
            this.customAttributes = list;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder
        public CrashlyticsReport.Session.Event.Application.Builder setExecution(CrashlyticsReport.Session.Event.Application.Execution execution) {
            if (execution == null) {
                throw new NullPointerException("Null execution");
            }
            this.execution = execution;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder
        public CrashlyticsReport.Session.Event.Application.Builder setInternalKeys(List<CrashlyticsReport.CustomAttribute> list) {
            this.internalKeys = list;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder
        public CrashlyticsReport.Session.Event.Application.Builder setUiOrientation(int i) {
            this.uiOrientation = Integer.valueOf(i);
            return this;
        }

        public Builder() {
        }

        private Builder(CrashlyticsReport.Session.Event.Application application) {
            this.execution = application.getExecution();
            this.customAttributes = application.getCustomAttributes();
            this.internalKeys = application.getInternalKeys();
            this.background = application.getBackground();
            this.currentProcessDetails = application.getCurrentProcessDetails();
            this.appProcessDetails = application.getAppProcessDetails();
            this.uiOrientation = Integer.valueOf(application.getUiOrientation());
        }
    }

    public boolean equals(Object obj) {
        List<CrashlyticsReport.CustomAttribute> list;
        List<CrashlyticsReport.CustomAttribute> list2;
        Boolean bool;
        CrashlyticsReport.Session.Event.Application.ProcessDetails processDetails;
        List<CrashlyticsReport.Session.Event.Application.ProcessDetails> list3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.Session.Event.Application) {
            CrashlyticsReport.Session.Event.Application application = (CrashlyticsReport.Session.Event.Application) obj;
            if (this.execution.equals(application.getExecution()) && ((list = this.customAttributes) != null ? list.equals(application.getCustomAttributes()) : application.getCustomAttributes() == null) && ((list2 = this.internalKeys) != null ? list2.equals(application.getInternalKeys()) : application.getInternalKeys() == null) && ((bool = this.background) != null ? bool.equals(application.getBackground()) : application.getBackground() == null) && ((processDetails = this.currentProcessDetails) != null ? processDetails.equals(application.getCurrentProcessDetails()) : application.getCurrentProcessDetails() == null) && ((list3 = this.appProcessDetails) != null ? list3.equals(application.getAppProcessDetails()) : application.getAppProcessDetails() == null) && this.uiOrientation == application.getUiOrientation()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application
    public List<CrashlyticsReport.Session.Event.Application.ProcessDetails> getAppProcessDetails() {
        return this.appProcessDetails;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application
    public Boolean getBackground() {
        return this.background;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application
    public CrashlyticsReport.Session.Event.Application.ProcessDetails getCurrentProcessDetails() {
        return this.currentProcessDetails;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application
    public List<CrashlyticsReport.CustomAttribute> getCustomAttributes() {
        return this.customAttributes;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application
    public CrashlyticsReport.Session.Event.Application.Execution getExecution() {
        return this.execution;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application
    public List<CrashlyticsReport.CustomAttribute> getInternalKeys() {
        return this.internalKeys;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application
    public int getUiOrientation() {
        return this.uiOrientation;
    }

    public int hashCode() {
        int hashCode = (this.execution.hashCode() ^ 1000003) * 1000003;
        List<CrashlyticsReport.CustomAttribute> list = this.customAttributes;
        int hashCode2 = (hashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List<CrashlyticsReport.CustomAttribute> list2 = this.internalKeys;
        int hashCode3 = (hashCode2 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        Boolean bool = this.background;
        int hashCode4 = (hashCode3 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        CrashlyticsReport.Session.Event.Application.ProcessDetails processDetails = this.currentProcessDetails;
        int hashCode5 = (hashCode4 ^ (processDetails == null ? 0 : processDetails.hashCode())) * 1000003;
        List<CrashlyticsReport.Session.Event.Application.ProcessDetails> list3 = this.appProcessDetails;
        return this.uiOrientation ^ ((hashCode5 ^ (list3 != null ? list3.hashCode() : 0)) * 1000003);
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application
    public CrashlyticsReport.Session.Event.Application.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Application{execution=");
        sb.append(this.execution);
        sb.append(", customAttributes=");
        sb.append(this.customAttributes);
        sb.append(", internalKeys=");
        sb.append(this.internalKeys);
        sb.append(", background=");
        sb.append(this.background);
        sb.append(", currentProcessDetails=");
        sb.append(this.currentProcessDetails);
        sb.append(", appProcessDetails=");
        sb.append(this.appProcessDetails);
        sb.append(", uiOrientation=");
        return a.m(sb, this.uiOrientation, "}");
    }

    private AutoValue_CrashlyticsReport_Session_Event_Application(CrashlyticsReport.Session.Event.Application.Execution execution, List<CrashlyticsReport.CustomAttribute> list, List<CrashlyticsReport.CustomAttribute> list2, Boolean bool, CrashlyticsReport.Session.Event.Application.ProcessDetails processDetails, List<CrashlyticsReport.Session.Event.Application.ProcessDetails> list3, int i) {
        this.execution = execution;
        this.customAttributes = list;
        this.internalKeys = list2;
        this.background = bool;
        this.currentProcessDetails = processDetails;
        this.appProcessDetails = list3;
        this.uiOrientation = i;
    }
}
