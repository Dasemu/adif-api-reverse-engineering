package com.adif.elcanomovil.domain.entities;

import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/adif/elcanomovil/domain/entities/VersionUpdateStatus;", "", "()V", "Forced", "Optional", "Valid", "Lcom/adif/elcanomovil/domain/entities/VersionUpdateStatus$Forced;", "Lcom/adif/elcanomovil/domain/entities/VersionUpdateStatus$Optional;", "Lcom/adif/elcanomovil/domain/entities/VersionUpdateStatus$Valid;", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class VersionUpdateStatus {

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/adif/elcanomovil/domain/entities/VersionUpdateStatus$Forced;", "Lcom/adif/elcanomovil/domain/entities/VersionUpdateStatus;", ImagesContract.URL, "", "(Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Forced extends VersionUpdateStatus {
        private final String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Forced(String url) {
            super(null);
            Intrinsics.checkNotNullParameter(url, "url");
            this.url = url;
        }

        public final String getUrl() {
            return this.url;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/adif/elcanomovil/domain/entities/VersionUpdateStatus$Optional;", "Lcom/adif/elcanomovil/domain/entities/VersionUpdateStatus;", ImagesContract.URL, "", "(Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Optional extends VersionUpdateStatus {
        private final String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Optional(String url) {
            super(null);
            Intrinsics.checkNotNullParameter(url, "url");
            this.url = url;
        }

        public final String getUrl() {
            return this.url;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/adif/elcanomovil/domain/entities/VersionUpdateStatus$Valid;", "Lcom/adif/elcanomovil/domain/entities/VersionUpdateStatus;", "()V", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Valid extends VersionUpdateStatus {
        public static final Valid INSTANCE = new Valid();

        private Valid() {
            super(null);
        }
    }

    public /* synthetic */ VersionUpdateStatus(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private VersionUpdateStatus() {
    }
}
