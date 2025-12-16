package com.adif.elcanomovil.domain.entities.notifications;

import com.adif.elcanomovil.commonNavGraph.arguments.NavArguments;
import com.adif.elcanomovil.domain.entities.CirculationType;
import com.adif.elcanomovil.serviceNetworking.ServicePaths;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\t\n\u000bB\u0017\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u0082\u0001\u0003\f\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/adif/elcanomovil/domain/entities/notifications/NotificationPayload;", "Ljava/io/Serializable;", "title", "", "message", "(Ljava/lang/String;Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "getTitle", "Avisa", "Journey", "Train", "Lcom/adif/elcanomovil/domain/entities/notifications/NotificationPayload$Avisa;", "Lcom/adif/elcanomovil/domain/entities/notifications/NotificationPayload$Journey;", "Lcom/adif/elcanomovil/domain/entities/notifications/NotificationPayload$Train;", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class NotificationPayload implements Serializable {
    private final String message;
    private final String title;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/adif/elcanomovil/domain/entities/notifications/NotificationPayload$Avisa;", "Lcom/adif/elcanomovil/domain/entities/notifications/NotificationPayload;", ServicePaths.IncidenceService.pathIncidenceId, "", "title", "message", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getIncidenceId", "()Ljava/lang/String;", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Avisa extends NotificationPayload {
        private final String incidenceId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Avisa(String incidenceId, String title, String message) {
            super(title, message, null);
            Intrinsics.checkNotNullParameter(incidenceId, "incidenceId");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(message, "message");
            this.incidenceId = incidenceId;
        }

        public final String getIncidenceId() {
            return this.incidenceId;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003¢\u0006\u0002\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013¨\u0006\u001a"}, d2 = {"Lcom/adif/elcanomovil/domain/entities/notifications/NotificationPayload$Journey;", "Lcom/adif/elcanomovil/domain/entities/notifications/NotificationPayload;", "origin", "", FirebaseAnalytics.Param.DESTINATION, "circulationType", "Lcom/adif/elcanomovil/domain/entities/CirculationType;", "isCercanias", "", "type", "start", "end", "repeat", "title", "message", "(Ljava/lang/String;Ljava/lang/String;Lcom/adif/elcanomovil/domain/entities/CirculationType;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCirculationType", "()Lcom/adif/elcanomovil/domain/entities/CirculationType;", "getDestination", "()Ljava/lang/String;", "getEnd", "()Z", "getOrigin", "getRepeat", "getStart", "getType", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Journey extends NotificationPayload {
        private final CirculationType circulationType;
        private final String destination;
        private final String end;
        private final boolean isCercanias;
        private final String origin;
        private final String repeat;
        private final String start;
        private final String type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Journey(String origin, String destination, CirculationType circulationType, boolean z3, String type, String start, String end, String repeat, String title, String message) {
            super(title, message, null);
            Intrinsics.checkNotNullParameter(origin, "origin");
            Intrinsics.checkNotNullParameter(destination, "destination");
            Intrinsics.checkNotNullParameter(circulationType, "circulationType");
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(start, "start");
            Intrinsics.checkNotNullParameter(end, "end");
            Intrinsics.checkNotNullParameter(repeat, "repeat");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(message, "message");
            this.origin = origin;
            this.destination = destination;
            this.circulationType = circulationType;
            this.isCercanias = z3;
            this.type = type;
            this.start = start;
            this.end = end;
            this.repeat = repeat;
        }

        public final CirculationType getCirculationType() {
            return this.circulationType;
        }

        public final String getDestination() {
            return this.destination;
        }

        public final String getEnd() {
            return this.end;
        }

        public final String getOrigin() {
            return this.origin;
        }

        public final String getRepeat() {
            return this.repeat;
        }

        public final String getStart() {
            return this.start;
        }

        public final String getType() {
            return this.type;
        }

        /* renamed from: isCercanias, reason: from getter */
        public final boolean getIsCercanias() {
            return this.isCercanias;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/adif/elcanomovil/domain/entities/notifications/NotificationPayload$Train;", "Lcom/adif/elcanomovil/domain/entities/notifications/NotificationPayload;", NavArguments.ARG_DYNAMIC_LINKS_COMMERCIAL_NUMBER, "", "type", "start", "end", "repeat", "title", "message", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCommercialNumber", "()Ljava/lang/String;", "getEnd", "getRepeat", "getStart", "getType", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Train extends NotificationPayload {
        private final String commercialNumber;
        private final String end;
        private final String repeat;
        private final String start;
        private final String type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Train(String commercialNumber, String type, String start, String end, String repeat, String title, String message) {
            super(title, message, null);
            Intrinsics.checkNotNullParameter(commercialNumber, "commercialNumber");
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(start, "start");
            Intrinsics.checkNotNullParameter(end, "end");
            Intrinsics.checkNotNullParameter(repeat, "repeat");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(message, "message");
            this.commercialNumber = commercialNumber;
            this.type = type;
            this.start = start;
            this.end = end;
            this.repeat = repeat;
        }

        public final String getCommercialNumber() {
            return this.commercialNumber;
        }

        public final String getEnd() {
            return this.end;
        }

        public final String getRepeat() {
            return this.repeat;
        }

        public final String getStart() {
            return this.start;
        }

        public final String getType() {
            return this.type;
        }
    }

    public /* synthetic */ NotificationPayload(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2);
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getTitle() {
        return this.title;
    }

    private NotificationPayload(String str, String str2) {
        this.title = str;
        this.message = str2;
    }
}
