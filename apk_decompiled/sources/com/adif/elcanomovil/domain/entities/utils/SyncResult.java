package com.adif.elcanomovil.domain.entities.utils;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0002\r\u000eB\u0007\b\u0004¢\u0006\u0002\u0010\u0003J\u000e\u0010\b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\nJ\r\u0010\u000b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\fR\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0006\u0082\u0001\u0002\u000f\u0010¨\u0006\u0011"}, d2 = {"Lcom/adif/elcanomovil/domain/entities/utils/SyncResult;", "T", "", "()V", "isFailure", "", "()Z", "isSuccess", "exceptionOrNull", "Ljava/lang/Exception;", "Lkotlin/Exception;", "getOrNull", "()Ljava/lang/Object;", "Error", "Success", "Lcom/adif/elcanomovil/domain/entities/utils/SyncResult$Error;", "Lcom/adif/elcanomovil/domain/entities/utils/SyncResult$Success;", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class SyncResult<T> {

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0010\b\u0002\u0010\u0003\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005¢\u0006\u0002\u0010\u0006J\u0011\u0010\t\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005HÆ\u0003J\u001b\u0010\n\u001a\u00020\u00002\u0010\b\u0002\u0010\u0003\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0019\u0010\u0003\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/adif/elcanomovil/domain/entities/utils/SyncResult$Error;", "Lcom/adif/elcanomovil/domain/entities/utils/SyncResult;", "", "cause", "Ljava/lang/Exception;", "Lkotlin/Exception;", "(Ljava/lang/Exception;)V", "getCause", "()Ljava/lang/Exception;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final /* data */ class Error extends SyncResult {
        private final Exception cause;

        /* JADX WARN: Multi-variable type inference failed */
        public Error() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Error copy$default(Error error, Exception exc, int i, Object obj) {
            if ((i & 1) != 0) {
                exc = error.cause;
            }
            return error.copy(exc);
        }

        /* renamed from: component1, reason: from getter */
        public final Exception getCause() {
            return this.cause;
        }

        public final Error copy(Exception cause) {
            return new Error(cause);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && Intrinsics.areEqual(this.cause, ((Error) other).cause);
        }

        public final Exception getCause() {
            return this.cause;
        }

        public int hashCode() {
            Exception exc = this.cause;
            if (exc == null) {
                return 0;
            }
            return exc.hashCode();
        }

        public String toString() {
            return "Error(cause=" + this.cause + ')';
        }

        public Error(Exception exc) {
            super(null);
            this.cause = exc;
        }

        public /* synthetic */ Error(Exception exc, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : exc);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00028\u0001¢\u0006\u0002\u0010\u0004J\u000e\u0010\b\u001a\u00028\u0001HÆ\u0003¢\u0006\u0002\u0010\u0006J\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u0001HÆ\u0001¢\u0006\u0002\u0010\nJ\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0013\u0010\u0003\u001a\u00028\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0013"}, d2 = {"Lcom/adif/elcanomovil/domain/entities/utils/SyncResult$Success;", "T", "Lcom/adif/elcanomovil/domain/entities/utils/SyncResult;", "value", "(Ljava/lang/Object;)V", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Lcom/adif/elcanomovil/domain/entities/utils/SyncResult$Success;", "equals", "", "other", "", "hashCode", "", "toString", "", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final /* data */ class Success<T> extends SyncResult<T> {
        private final T value;

        public Success(T t2) {
            super(null);
            this.value = t2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Success copy$default(Success success, Object obj, int i, Object obj2) {
            if ((i & 1) != 0) {
                obj = success.value;
            }
            return success.copy(obj);
        }

        public final T component1() {
            return this.value;
        }

        public final Success<T> copy(T value) {
            return new Success<>(value);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Success) && Intrinsics.areEqual(this.value, ((Success) other).value);
        }

        public final T getValue() {
            return this.value;
        }

        public int hashCode() {
            T t2 = this.value;
            if (t2 == null) {
                return 0;
            }
            return t2.hashCode();
        }

        public String toString() {
            return "Success(value=" + this.value + ')';
        }
    }

    public /* synthetic */ SyncResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final Exception exceptionOrNull() {
        if (this instanceof Error) {
            return ((Error) this).getCause();
        }
        return null;
    }

    public final T getOrNull() {
        if (this instanceof Success) {
            return (T) ((Success) this).getValue();
        }
        return null;
    }

    public final boolean isFailure() {
        return this instanceof Error;
    }

    public final boolean isSuccess() {
        return this instanceof Success;
    }

    private SyncResult() {
    }
}
