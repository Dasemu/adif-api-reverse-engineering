package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.encoders.annotations.Encodable;
import java.util.List;

/* loaded from: classes3.dex */
final class AutoValue_CrashlyticsReport_Session_Event_RolloutsState extends CrashlyticsReport.Session.Event.RolloutsState {
    private final List<CrashlyticsReport.Session.Event.RolloutAssignment> rolloutAssignments;

    /* loaded from: classes3.dex */
    public static final class Builder extends CrashlyticsReport.Session.Event.RolloutsState.Builder {
        private List<CrashlyticsReport.Session.Event.RolloutAssignment> rolloutAssignments;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutsState.Builder
        public CrashlyticsReport.Session.Event.RolloutsState build() {
            String str = this.rolloutAssignments == null ? " rolloutAssignments" : "";
            if (str.isEmpty()) {
                return new AutoValue_CrashlyticsReport_Session_Event_RolloutsState(this.rolloutAssignments);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutsState.Builder
        public CrashlyticsReport.Session.Event.RolloutsState.Builder setRolloutAssignments(List<CrashlyticsReport.Session.Event.RolloutAssignment> list) {
            if (list == null) {
                throw new NullPointerException("Null rolloutAssignments");
            }
            this.rolloutAssignments = list;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.Session.Event.RolloutsState) {
            return this.rolloutAssignments.equals(((CrashlyticsReport.Session.Event.RolloutsState) obj).getRolloutAssignments());
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutsState
    @Encodable.Field(name = "assignments")
    public List<CrashlyticsReport.Session.Event.RolloutAssignment> getRolloutAssignments() {
        return this.rolloutAssignments;
    }

    public int hashCode() {
        return this.rolloutAssignments.hashCode() ^ 1000003;
    }

    public String toString() {
        return "RolloutsState{rolloutAssignments=" + this.rolloutAssignments + "}";
    }

    private AutoValue_CrashlyticsReport_Session_Event_RolloutsState(List<CrashlyticsReport.Session.Event.RolloutAssignment> list) {
        this.rolloutAssignments = list;
    }
}
