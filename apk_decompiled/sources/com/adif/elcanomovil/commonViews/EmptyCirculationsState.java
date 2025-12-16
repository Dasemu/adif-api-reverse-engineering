package com.adif.elcanomovil.commonViews;

import C.w;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/adif/elcanomovil/commonViews/EmptyCirculationsState;", "", "Custom", "EmptyDefault", "GenericError", "Loading", "NoResults", "Lcom/adif/elcanomovil/commonViews/EmptyCirculationsState$Custom;", "Lcom/adif/elcanomovil/commonViews/EmptyCirculationsState$EmptyDefault;", "Lcom/adif/elcanomovil/commonViews/EmptyCirculationsState$GenericError;", "Lcom/adif/elcanomovil/commonViews/EmptyCirculationsState$Loading;", "Lcom/adif/elcanomovil/commonViews/EmptyCirculationsState$NoResults;", "common-views_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface EmptyCirculationsState {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/adif/elcanomovil/commonViews/EmptyCirculationsState$Custom;", "Lcom/adif/elcanomovil/commonViews/EmptyCirculationsState;", "title", "", "message", "icon", "(III)V", "getIcon", "()I", "getMessage", "getTitle", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "", "common-views_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final /* data */ class Custom implements EmptyCirculationsState {
        private final int icon;
        private final int message;
        private final int title;

        public Custom(int i, int i4, int i5) {
            this.title = i;
            this.message = i4;
            this.icon = i5;
        }

        public static /* synthetic */ Custom copy$default(Custom custom, int i, int i4, int i5, int i6, Object obj) {
            if ((i6 & 1) != 0) {
                i = custom.title;
            }
            if ((i6 & 2) != 0) {
                i4 = custom.message;
            }
            if ((i6 & 4) != 0) {
                i5 = custom.icon;
            }
            return custom.copy(i, i4, i5);
        }

        /* renamed from: component1, reason: from getter */
        public final int getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final int getMessage() {
            return this.message;
        }

        /* renamed from: component3, reason: from getter */
        public final int getIcon() {
            return this.icon;
        }

        public final Custom copy(int title, int message, int icon) {
            return new Custom(title, message, icon);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Custom)) {
                return false;
            }
            Custom custom = (Custom) other;
            return this.title == custom.title && this.message == custom.message && this.icon == custom.icon;
        }

        public final int getIcon() {
            return this.icon;
        }

        public final int getMessage() {
            return this.message;
        }

        public final int getTitle() {
            return this.title;
        }

        public int hashCode() {
            return Integer.hashCode(this.icon) + w.x(this.message, Integer.hashCode(this.title) * 31, 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Custom(title=");
            sb.append(this.title);
            sb.append(", message=");
            sb.append(this.message);
            sb.append(", icon=");
            return w.p(sb, this.icon, ')');
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/adif/elcanomovil/commonViews/EmptyCirculationsState$EmptyDefault;", "Lcom/adif/elcanomovil/commonViews/EmptyCirculationsState;", "()V", "common-views_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class EmptyDefault implements EmptyCirculationsState {
        public static final EmptyDefault INSTANCE = new EmptyDefault();

        private EmptyDefault() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/adif/elcanomovil/commonViews/EmptyCirculationsState$GenericError;", "Lcom/adif/elcanomovil/commonViews/EmptyCirculationsState;", "()V", "common-views_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class GenericError implements EmptyCirculationsState {
        public static final GenericError INSTANCE = new GenericError();

        private GenericError() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/adif/elcanomovil/commonViews/EmptyCirculationsState$Loading;", "Lcom/adif/elcanomovil/commonViews/EmptyCirculationsState;", "()V", "common-views_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Loading implements EmptyCirculationsState {
        public static final Loading INSTANCE = new Loading();

        private Loading() {
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/adif/elcanomovil/commonViews/EmptyCirculationsState$NoResults;", "Lcom/adif/elcanomovil/commonViews/EmptyCirculationsState;", "title", "", "message", "(II)V", "getMessage", "()I", "getTitle", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "common-views_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final /* data */ class NoResults implements EmptyCirculationsState {
        private final int message;
        private final int title;

        public NoResults(int i, int i4) {
            this.title = i;
            this.message = i4;
        }

        public static /* synthetic */ NoResults copy$default(NoResults noResults, int i, int i4, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                i = noResults.title;
            }
            if ((i5 & 2) != 0) {
                i4 = noResults.message;
            }
            return noResults.copy(i, i4);
        }

        /* renamed from: component1, reason: from getter */
        public final int getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final int getMessage() {
            return this.message;
        }

        public final NoResults copy(int title, int message) {
            return new NoResults(title, message);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NoResults)) {
                return false;
            }
            NoResults noResults = (NoResults) other;
            return this.title == noResults.title && this.message == noResults.message;
        }

        public final int getMessage() {
            return this.message;
        }

        public final int getTitle() {
            return this.title;
        }

        public int hashCode() {
            return Integer.hashCode(this.message) + (Integer.hashCode(this.title) * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("NoResults(title=");
            sb.append(this.title);
            sb.append(", message=");
            return w.p(sb, this.message, ')');
        }

        public /* synthetic */ NoResults(int i, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
            this((i5 & 1) != 0 ? R.string.no_results_title : i, i4);
        }
    }
}
