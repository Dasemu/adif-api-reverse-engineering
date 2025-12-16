package com.adif.elcanomovil.uiMoreAdif.main;

import com.adif.elcanomovil.commonNavGraph.R;
import com.adif.elcanomovil.commonNavGraph.arguments.NavArguments;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o0.C0524a;
import o0.F;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/adif/elcanomovil/uiMoreAdif/main/MoreAdifFragmentDirections;", "", "<init>", "()V", "Companion", "com/adif/elcanomovil/uiMoreAdif/main/b", "common-nav-graph_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MoreAdifFragmentDirections {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0006J\r\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\u0006J\r\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u0006J\r\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u0006J\r\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\u0006Jk\u0010\u0016\u001a\u00020\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/adif/elcanomovil/uiMoreAdif/main/MoreAdifFragmentDirections$Companion;", "", "<init>", "()V", "Lo0/F;", "toHelpFragment", "()Lo0/F;", "toAccessibilityFragment", "toContactFragment", "toAboutFragment", "toAvisaHomeFragment", "toSubscriptionHomeFragment", "", NavArguments.ARG_DYNAMIC_LINKS_COMMERCIAL_NUMBER, NavArguments.ARG_DYNAMIC_LINKS_STATION_CODE, NavArguments.ARG_DYNAMIC_LINKS_STATION_TO_CODE, "", NavArguments.ARG_DYNAMIC_LINKS_LAUNCHDATE, "observation", NavArguments.ARG_DYNAMIC_LINKS_OPERATOR, NavArguments.ARG_DYNAMIC_LINKS_COMMERCIAL_PRODUCT, NavArguments.ARG_DYNAMIC_LINKS_FRAGMENT_FROM, "toTrainSituationFragment", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lo0/F;", "common-nav-graph_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ F toTrainSituationFragment$default(Companion companion, String str, String str2, String str3, long j4, String str4, String str5, String str6, String str7, int i, Object obj) {
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            if ((i & 4) != 0) {
                str3 = null;
            }
            if ((i & 8) != 0) {
                j4 = 0;
            }
            if ((i & 16) != 0) {
                str4 = null;
            }
            if ((i & 32) != 0) {
                str5 = "";
            }
            if ((i & 64) != 0) {
                str6 = "";
            }
            if ((i & 128) != 0) {
                str7 = null;
            }
            return companion.toTrainSituationFragment(str, str2, str3, j4, str4, str5, str6, str7);
        }

        public final F toAboutFragment() {
            return new C0524a(R.id.to_aboutFragment);
        }

        public final F toAccessibilityFragment() {
            return new C0524a(R.id.to_accessibilityFragment);
        }

        public final F toAvisaHomeFragment() {
            return new C0524a(R.id.to_avisaHomeFragment);
        }

        public final F toContactFragment() {
            return new C0524a(R.id.to_contactFragment);
        }

        public final F toHelpFragment() {
            return new C0524a(R.id.to_helpFragment);
        }

        public final F toSubscriptionHomeFragment() {
            return new C0524a(R.id.to_subscriptionHomeFragment);
        }

        public final F toTrainSituationFragment(String commercialNumber, String originStationCode, String destinationStationCode, long launchingDate, String observation, String operator, String commercialProduct, String fragmentFrom) {
            return new b(commercialNumber, originStationCode, destinationStationCode, launchingDate, observation, operator, commercialProduct, fragmentFrom);
        }

        private Companion() {
        }
    }

    private MoreAdifFragmentDirections() {
    }
}
