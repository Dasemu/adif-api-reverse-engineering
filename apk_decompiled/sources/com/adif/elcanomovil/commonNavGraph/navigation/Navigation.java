package com.adif.elcanomovil.commonNavGraph.navigation;

import com.adif.elcanomovil.commonNavGraph.arguments.BottomNavInitialTab;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o0.F;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\bB\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0006\t\n\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/adif/elcanomovil/commonNavGraph/navigation/Navigation;", "", "()V", "Back", "BackWithResult", "Direction", "Intent", "RootDirection", "TabDirection", "Lcom/adif/elcanomovil/commonNavGraph/navigation/Navigation$Back;", "Lcom/adif/elcanomovil/commonNavGraph/navigation/Navigation$BackWithResult;", "Lcom/adif/elcanomovil/commonNavGraph/navigation/Navigation$Direction;", "Lcom/adif/elcanomovil/commonNavGraph/navigation/Navigation$Intent;", "Lcom/adif/elcanomovil/commonNavGraph/navigation/Navigation$RootDirection;", "Lcom/adif/elcanomovil/commonNavGraph/navigation/Navigation$TabDirection;", "common-nav-graph_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class Navigation {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/adif/elcanomovil/commonNavGraph/navigation/Navigation$Back;", "Lcom/adif/elcanomovil/commonNavGraph/navigation/Navigation;", "()V", "common-nav-graph_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Back extends Navigation {
        public static final Back INSTANCE = new Back();

        private Back() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0005\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/adif/elcanomovil/commonNavGraph/navigation/Navigation$BackWithResult;", "T", "Lcom/adif/elcanomovil/commonNavGraph/navigation/Navigation;", "key", "", "value", "(Ljava/lang/String;Ljava/lang/Object;)V", "getKey", "()Ljava/lang/String;", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "common-nav-graph_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class BackWithResult<T> extends Navigation {
        private final String key;
        private final T value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BackWithResult(String key, T t2) {
            super(null);
            Intrinsics.checkNotNullParameter(key, "key");
            this.key = key;
            this.value = t2;
        }

        public final String getKey() {
            return this.key;
        }

        public final T getValue() {
            return this.value;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/adif/elcanomovil/commonNavGraph/navigation/Navigation$Direction;", "Lcom/adif/elcanomovil/commonNavGraph/navigation/Navigation;", "Lo0/F;", "navDirections", "", "currentFragmentId", "<init>", "(Lo0/F;Ljava/lang/Integer;)V", "Lo0/F;", "getNavDirections", "()Lo0/F;", "Ljava/lang/Integer;", "getCurrentFragmentId", "()Ljava/lang/Integer;", "common-nav-graph_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Direction extends Navigation {
        private final Integer currentFragmentId;
        private final F navDirections;

        public /* synthetic */ Direction(F f2, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(f2, (i & 2) != 0 ? null : num);
        }

        public final Integer getCurrentFragmentId() {
            return this.currentFragmentId;
        }

        public final F getNavDirections() {
            return this.navDirections;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Direction(F navDirections, Integer num) {
            super(null);
            Intrinsics.checkNotNullParameter(navDirections, "navDirections");
            this.navDirections = navDirections;
            this.currentFragmentId = num;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/adif/elcanomovil/commonNavGraph/navigation/Navigation$Intent;", "Lcom/adif/elcanomovil/commonNavGraph/navigation/Navigation;", "action", "Lcom/adif/elcanomovil/commonNavGraph/navigation/IntentAction;", "(Lcom/adif/elcanomovil/commonNavGraph/navigation/IntentAction;)V", "getAction", "()Lcom/adif/elcanomovil/commonNavGraph/navigation/IntentAction;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "common-nav-graph_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final /* data */ class Intent extends Navigation {
        private final IntentAction action;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Intent(IntentAction action) {
            super(null);
            Intrinsics.checkNotNullParameter(action, "action");
            this.action = action;
        }

        public static /* synthetic */ Intent copy$default(Intent intent, IntentAction intentAction, int i, Object obj) {
            if ((i & 1) != 0) {
                intentAction = intent.action;
            }
            return intent.copy(intentAction);
        }

        /* renamed from: component1, reason: from getter */
        public final IntentAction getAction() {
            return this.action;
        }

        public final Intent copy(IntentAction action) {
            Intrinsics.checkNotNullParameter(action, "action");
            return new Intent(action);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Intent) && Intrinsics.areEqual(this.action, ((Intent) other).action);
        }

        public final IntentAction getAction() {
            return this.action;
        }

        public int hashCode() {
            return this.action.hashCode();
        }

        public String toString() {
            return "Intent(action=" + this.action + ')';
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/adif/elcanomovil/commonNavGraph/navigation/Navigation$RootDirection;", "Lcom/adif/elcanomovil/commonNavGraph/navigation/Navigation;", "Lo0/F;", "navDirections", "", "currentFragmentId", "<init>", "(Lo0/F;Ljava/lang/Integer;)V", "component1", "()Lo0/F;", "component2", "()Ljava/lang/Integer;", "copy", "(Lo0/F;Ljava/lang/Integer;)Lcom/adif/elcanomovil/commonNavGraph/navigation/Navigation$RootDirection;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lo0/F;", "getNavDirections", "Ljava/lang/Integer;", "getCurrentFragmentId", "common-nav-graph_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final /* data */ class RootDirection extends Navigation {
        private final Integer currentFragmentId;
        private final F navDirections;

        public /* synthetic */ RootDirection(F f2, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(f2, (i & 2) != 0 ? null : num);
        }

        public static /* synthetic */ RootDirection copy$default(RootDirection rootDirection, F f2, Integer num, int i, Object obj) {
            if ((i & 1) != 0) {
                f2 = rootDirection.navDirections;
            }
            if ((i & 2) != 0) {
                num = rootDirection.currentFragmentId;
            }
            return rootDirection.copy(f2, num);
        }

        /* renamed from: component1, reason: from getter */
        public final F getNavDirections() {
            return this.navDirections;
        }

        /* renamed from: component2, reason: from getter */
        public final Integer getCurrentFragmentId() {
            return this.currentFragmentId;
        }

        public final RootDirection copy(F navDirections, Integer currentFragmentId) {
            Intrinsics.checkNotNullParameter(navDirections, "navDirections");
            return new RootDirection(navDirections, currentFragmentId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RootDirection)) {
                return false;
            }
            RootDirection rootDirection = (RootDirection) other;
            return Intrinsics.areEqual(this.navDirections, rootDirection.navDirections) && Intrinsics.areEqual(this.currentFragmentId, rootDirection.currentFragmentId);
        }

        public final Integer getCurrentFragmentId() {
            return this.currentFragmentId;
        }

        public final F getNavDirections() {
            return this.navDirections;
        }

        public int hashCode() {
            int hashCode = this.navDirections.hashCode() * 31;
            Integer num = this.currentFragmentId;
            return hashCode + (num == null ? 0 : num.hashCode());
        }

        public String toString() {
            return "RootDirection(navDirections=" + this.navDirections + ", currentFragmentId=" + this.currentFragmentId + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RootDirection(F navDirections, Integer num) {
            super(null);
            Intrinsics.checkNotNullParameter(navDirections, "navDirections");
            this.navDirections = navDirections;
            this.currentFragmentId = num;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/adif/elcanomovil/commonNavGraph/navigation/Navigation$TabDirection;", "Lcom/adif/elcanomovil/commonNavGraph/navigation/Navigation;", "initialTab", "Lcom/adif/elcanomovil/commonNavGraph/arguments/BottomNavInitialTab;", "(Lcom/adif/elcanomovil/commonNavGraph/arguments/BottomNavInitialTab;)V", "getInitialTab", "()Lcom/adif/elcanomovil/commonNavGraph/arguments/BottomNavInitialTab;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "common-nav-graph_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final /* data */ class TabDirection extends Navigation {
        private final BottomNavInitialTab initialTab;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TabDirection(BottomNavInitialTab initialTab) {
            super(null);
            Intrinsics.checkNotNullParameter(initialTab, "initialTab");
            this.initialTab = initialTab;
        }

        public static /* synthetic */ TabDirection copy$default(TabDirection tabDirection, BottomNavInitialTab bottomNavInitialTab, int i, Object obj) {
            if ((i & 1) != 0) {
                bottomNavInitialTab = tabDirection.initialTab;
            }
            return tabDirection.copy(bottomNavInitialTab);
        }

        /* renamed from: component1, reason: from getter */
        public final BottomNavInitialTab getInitialTab() {
            return this.initialTab;
        }

        public final TabDirection copy(BottomNavInitialTab initialTab) {
            Intrinsics.checkNotNullParameter(initialTab, "initialTab");
            return new TabDirection(initialTab);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof TabDirection) && Intrinsics.areEqual(this.initialTab, ((TabDirection) other).initialTab);
        }

        public final BottomNavInitialTab getInitialTab() {
            return this.initialTab;
        }

        public int hashCode() {
            return this.initialTab.hashCode();
        }

        public String toString() {
            return "TabDirection(initialTab=" + this.initialTab + ')';
        }
    }

    public /* synthetic */ Navigation(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private Navigation() {
    }
}
