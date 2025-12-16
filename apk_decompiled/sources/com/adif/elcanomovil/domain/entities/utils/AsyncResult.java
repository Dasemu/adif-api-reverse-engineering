package com.adif.elcanomovil.domain.entities.utils;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u001c*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0001\u001cB!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0010\u001a\u00020\u0004HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00018\u0000HÆ\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J6\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0015\u0010\u0005\u001a\u0004\u0018\u00018\u0000¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001d"}, d2 = {"Lcom/adif/elcanomovil/domain/entities/utils/AsyncResult;", "T", "", "status", "Lcom/adif/elcanomovil/domain/entities/utils/Status;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "throwable", "", "(Lcom/adif/elcanomovil/domain/entities/utils/Status;Ljava/lang/Object;Ljava/lang/Throwable;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getStatus", "()Lcom/adif/elcanomovil/domain/entities/utils/Status;", "getThrowable", "()Ljava/lang/Throwable;", "component1", "component2", "component3", "copy", "(Lcom/adif/elcanomovil/domain/entities/utils/Status;Ljava/lang/Object;Ljava/lang/Throwable;)Lcom/adif/elcanomovil/domain/entities/utils/AsyncResult;", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class AsyncResult<T> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final T data;
    private final Status status;
    private final Throwable throwable;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J)\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u0001H\u0005¢\u0006\u0002\u0010\tJ!\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\b\u0010\b\u001a\u0004\u0018\u0001H\u0005¢\u0006\u0002\u0010\u000bJ!\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\b\u0010\b\u001a\u0004\u0018\u0001H\u0005¢\u0006\u0002\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/adif/elcanomovil/domain/entities/utils/AsyncResult$Companion;", "", "()V", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Lcom/adif/elcanomovil/domain/entities/utils/AsyncResult;", "T", "throwable", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Ljava/lang/Throwable;Ljava/lang/Object;)Lcom/adif/elcanomovil/domain/entities/utils/AsyncResult;", "loading", "(Ljava/lang/Object;)Lcom/adif/elcanomovil/domain/entities/utils/AsyncResult;", FirebaseAnalytics.Param.SUCCESS, "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final <T> AsyncResult<T> error(Throwable throwable, T data) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            return new AsyncResult<>(Status.ERROR, data, throwable);
        }

        public final <T> AsyncResult<T> loading(T data) {
            return new AsyncResult<>(Status.LOADING, data, null);
        }

        public final <T> AsyncResult<T> success(T data) {
            return new AsyncResult<>(Status.SUCCESS, data, null);
        }

        private Companion() {
        }
    }

    public AsyncResult(Status status, T t2, Throwable th) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.status = status;
        this.data = t2;
        this.throwable = th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AsyncResult copy$default(AsyncResult asyncResult, Status status, Object obj, Throwable th, int i, Object obj2) {
        if ((i & 1) != 0) {
            status = asyncResult.status;
        }
        if ((i & 2) != 0) {
            obj = asyncResult.data;
        }
        if ((i & 4) != 0) {
            th = asyncResult.throwable;
        }
        return asyncResult.copy(status, obj, th);
    }

    /* renamed from: component1, reason: from getter */
    public final Status getStatus() {
        return this.status;
    }

    public final T component2() {
        return this.data;
    }

    /* renamed from: component3, reason: from getter */
    public final Throwable getThrowable() {
        return this.throwable;
    }

    public final AsyncResult<T> copy(Status status, T data, Throwable throwable) {
        Intrinsics.checkNotNullParameter(status, "status");
        return new AsyncResult<>(status, data, throwable);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AsyncResult)) {
            return false;
        }
        AsyncResult asyncResult = (AsyncResult) other;
        return this.status == asyncResult.status && Intrinsics.areEqual(this.data, asyncResult.data) && Intrinsics.areEqual(this.throwable, asyncResult.throwable);
    }

    public final T getData() {
        return this.data;
    }

    public final Status getStatus() {
        return this.status;
    }

    public final Throwable getThrowable() {
        return this.throwable;
    }

    public int hashCode() {
        int hashCode = this.status.hashCode() * 31;
        T t2 = this.data;
        int hashCode2 = (hashCode + (t2 == null ? 0 : t2.hashCode())) * 31;
        Throwable th = this.throwable;
        return hashCode2 + (th != null ? th.hashCode() : 0);
    }

    public String toString() {
        return "AsyncResult(status=" + this.status + ", data=" + this.data + ", throwable=" + this.throwable + ')';
    }
}
