package com.adif.elcanomovil.widget;

import C.w;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/adif/elcanomovil/widget/DeparturesWidgetViewAction;", "", "()V", "ChangeWay", "Delete", "Update", "UpdateAll", "Lcom/adif/elcanomovil/widget/DeparturesWidgetViewAction$ChangeWay;", "Lcom/adif/elcanomovil/widget/DeparturesWidgetViewAction$Delete;", "Lcom/adif/elcanomovil/widget/DeparturesWidgetViewAction$Update;", "Lcom/adif/elcanomovil/widget/DeparturesWidgetViewAction$UpdateAll;", "widget_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class DeparturesWidgetViewAction {

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/adif/elcanomovil/widget/DeparturesWidgetViewAction$ChangeWay;", "Lcom/adif/elcanomovil/widget/DeparturesWidgetViewAction;", "widgetId", "", "widgetPayload", "Lcom/adif/elcanomovil/widget/WidgetPayload;", "(ILcom/adif/elcanomovil/widget/WidgetPayload;)V", "getWidgetId", "()I", "getWidgetPayload", "()Lcom/adif/elcanomovil/widget/WidgetPayload;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "widget_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class ChangeWay extends DeparturesWidgetViewAction {
        private final int widgetId;
        private final WidgetPayload widgetPayload;

        public ChangeWay(int i, WidgetPayload widgetPayload) {
            super(null);
            this.widgetId = i;
            this.widgetPayload = widgetPayload;
        }

        public static /* synthetic */ ChangeWay copy$default(ChangeWay changeWay, int i, WidgetPayload widgetPayload, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                i = changeWay.widgetId;
            }
            if ((i4 & 2) != 0) {
                widgetPayload = changeWay.widgetPayload;
            }
            return changeWay.copy(i, widgetPayload);
        }

        /* renamed from: component1, reason: from getter */
        public final int getWidgetId() {
            return this.widgetId;
        }

        /* renamed from: component2, reason: from getter */
        public final WidgetPayload getWidgetPayload() {
            return this.widgetPayload;
        }

        public final ChangeWay copy(int widgetId, WidgetPayload widgetPayload) {
            return new ChangeWay(widgetId, widgetPayload);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ChangeWay)) {
                return false;
            }
            ChangeWay changeWay = (ChangeWay) other;
            return this.widgetId == changeWay.widgetId && Intrinsics.areEqual(this.widgetPayload, changeWay.widgetPayload);
        }

        public final int getWidgetId() {
            return this.widgetId;
        }

        public final WidgetPayload getWidgetPayload() {
            return this.widgetPayload;
        }

        public int hashCode() {
            int hashCode = Integer.hashCode(this.widgetId) * 31;
            WidgetPayload widgetPayload = this.widgetPayload;
            return hashCode + (widgetPayload == null ? 0 : widgetPayload.hashCode());
        }

        public String toString() {
            return "ChangeWay(widgetId=" + this.widgetId + ", widgetPayload=" + this.widgetPayload + ')';
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/adif/elcanomovil/widget/DeparturesWidgetViewAction$Delete;", "Lcom/adif/elcanomovil/widget/DeparturesWidgetViewAction;", "widgetId", "", "(I)V", "getWidgetId", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "widget_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class Delete extends DeparturesWidgetViewAction {
        private final int widgetId;

        public Delete(int i) {
            super(null);
            this.widgetId = i;
        }

        public static /* synthetic */ Delete copy$default(Delete delete, int i, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                i = delete.widgetId;
            }
            return delete.copy(i);
        }

        /* renamed from: component1, reason: from getter */
        public final int getWidgetId() {
            return this.widgetId;
        }

        public final Delete copy(int widgetId) {
            return new Delete(widgetId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Delete) && this.widgetId == ((Delete) other).widgetId;
        }

        public final int getWidgetId() {
            return this.widgetId;
        }

        public int hashCode() {
            return Integer.hashCode(this.widgetId);
        }

        public String toString() {
            return w.p(new StringBuilder("Delete(widgetId="), this.widgetId, ')');
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/adif/elcanomovil/widget/DeparturesWidgetViewAction$Update;", "Lcom/adif/elcanomovil/widget/DeparturesWidgetViewAction;", "widgetId", "", "widgetPayload", "Lcom/adif/elcanomovil/widget/WidgetPayload;", "(ILcom/adif/elcanomovil/widget/WidgetPayload;)V", "getWidgetId", "()I", "getWidgetPayload", "()Lcom/adif/elcanomovil/widget/WidgetPayload;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "widget_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class Update extends DeparturesWidgetViewAction {
        private final int widgetId;
        private final WidgetPayload widgetPayload;

        public Update(int i, WidgetPayload widgetPayload) {
            super(null);
            this.widgetId = i;
            this.widgetPayload = widgetPayload;
        }

        public static /* synthetic */ Update copy$default(Update update, int i, WidgetPayload widgetPayload, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                i = update.widgetId;
            }
            if ((i4 & 2) != 0) {
                widgetPayload = update.widgetPayload;
            }
            return update.copy(i, widgetPayload);
        }

        /* renamed from: component1, reason: from getter */
        public final int getWidgetId() {
            return this.widgetId;
        }

        /* renamed from: component2, reason: from getter */
        public final WidgetPayload getWidgetPayload() {
            return this.widgetPayload;
        }

        public final Update copy(int widgetId, WidgetPayload widgetPayload) {
            return new Update(widgetId, widgetPayload);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Update)) {
                return false;
            }
            Update update = (Update) other;
            return this.widgetId == update.widgetId && Intrinsics.areEqual(this.widgetPayload, update.widgetPayload);
        }

        public final int getWidgetId() {
            return this.widgetId;
        }

        public final WidgetPayload getWidgetPayload() {
            return this.widgetPayload;
        }

        public int hashCode() {
            int hashCode = Integer.hashCode(this.widgetId) * 31;
            WidgetPayload widgetPayload = this.widgetPayload;
            return hashCode + (widgetPayload == null ? 0 : widgetPayload.hashCode());
        }

        public String toString() {
            return "Update(widgetId=" + this.widgetId + ", widgetPayload=" + this.widgetPayload + ')';
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/adif/elcanomovil/widget/DeparturesWidgetViewAction$UpdateAll;", "Lcom/adif/elcanomovil/widget/DeparturesWidgetViewAction;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "widget_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class UpdateAll extends DeparturesWidgetViewAction {
        public static final UpdateAll INSTANCE = new UpdateAll();

        private UpdateAll() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof UpdateAll);
        }

        public int hashCode() {
            return -474419980;
        }

        public String toString() {
            return "UpdateAll";
        }
    }

    public /* synthetic */ DeparturesWidgetViewAction(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private DeparturesWidgetViewAction() {
    }
}
