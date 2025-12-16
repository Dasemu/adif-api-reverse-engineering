package com.adif.elcanomovil.commonNavGraph.navigation;

import android.net.Uri;
import com.google.android.gms.measurement.internal.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/adif/elcanomovil/commonNavGraph/navigation/IntentAction;", "", "()V", "Send", "View", "Lcom/adif/elcanomovil/commonNavGraph/navigation/IntentAction$Send;", "Lcom/adif/elcanomovil/commonNavGraph/navigation/IntentAction$View;", "common-nav-graph_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class IntentAction {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/adif/elcanomovil/commonNavGraph/navigation/IntentAction$Send;", "Lcom/adif/elcanomovil/commonNavGraph/navigation/IntentAction;", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "common-nav-graph_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final /* data */ class Send extends IntentAction {
        private final String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Send(String message) {
            super(null);
            Intrinsics.checkNotNullParameter(message, "message");
            this.message = message;
        }

        public static /* synthetic */ Send copy$default(Send send, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = send.message;
            }
            return send.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        public final Send copy(String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new Send(message);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Send) && Intrinsics.areEqual(this.message, ((Send) other).message);
        }

        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        public String toString() {
            return a.n(new StringBuilder("Send(message="), this.message, ')');
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/adif/elcanomovil/commonNavGraph/navigation/IntentAction$View;", "Lcom/adif/elcanomovil/commonNavGraph/navigation/IntentAction;", "uri", "Landroid/net/Uri;", "(Landroid/net/Uri;)V", "getUri", "()Landroid/net/Uri;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "common-nav-graph_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final /* data */ class View extends IntentAction {
        private final Uri uri;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public View(Uri uri) {
            super(null);
            Intrinsics.checkNotNullParameter(uri, "uri");
            this.uri = uri;
        }

        public static /* synthetic */ View copy$default(View view, Uri uri, int i, Object obj) {
            if ((i & 1) != 0) {
                uri = view.uri;
            }
            return view.copy(uri);
        }

        /* renamed from: component1, reason: from getter */
        public final Uri getUri() {
            return this.uri;
        }

        public final View copy(Uri uri) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            return new View(uri);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof View) && Intrinsics.areEqual(this.uri, ((View) other).uri);
        }

        public final Uri getUri() {
            return this.uri;
        }

        public int hashCode() {
            return this.uri.hashCode();
        }

        public String toString() {
            return "View(uri=" + this.uri + ')';
        }
    }

    public /* synthetic */ IntentAction(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private IntentAction() {
    }
}
