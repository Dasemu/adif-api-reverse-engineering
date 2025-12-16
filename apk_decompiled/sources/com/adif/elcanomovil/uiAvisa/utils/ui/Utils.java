package com.adif.elcanomovil.uiAvisa.utils.ui;

import android.content.Context;
import com.adif.elcanomovil.commonNavGraph.arguments.NavArguments;
import com.adif.elcanomovil.domain.entities.avisa.incidence.IncidenceStatus;
import com.adif.elcanomovil.uiAvisa.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/adif/elcanomovil/uiAvisa/utils/ui/Utils;", "", "()V", "Companion", "ui-avisa_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Utils {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b¨\u0006\u000b"}, d2 = {"Lcom/adif/elcanomovil/uiAvisa/utils/ui/Utils$Companion;", "", "()V", "getStringResource", "", "context", "Landroid/content/Context;", NavArguments.ARG_TYPE_NOTIFICATION_JSON_MESSAGE_TRAIN, "", "pxFromDp", "dp", "ui-avisa_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[IncidenceStatus.values().length];
                try {
                    iArr[IncidenceStatus.STATUS_TYPE_IN_PROGRESS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[IncidenceStatus.STATUS_TYPE_SOLVED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[IncidenceStatus.STATUS_TYPE_CLOSED.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getStringResource(Context context, int id) {
            Intrinsics.checkNotNullParameter(context, "context");
            IncidenceStatus invoke = IncidenceStatus.INSTANCE.invoke(id);
            int i = invoke == null ? -1 : WhenMappings.$EnumSwitchMapping$0[invoke.ordinal()];
            if (i == 1) {
                String string = context.getString(R.string.avisa_issue_status_in_progress);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                return string;
            }
            if (i == 2) {
                String string2 = context.getString(R.string.avisa_issue_status_solved);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                return string2;
            }
            if (i != 3) {
                String string3 = context.getString(R.string.avisa_issue_status_not_used);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                return string3;
            }
            String string4 = context.getString(R.string.avisa_issue_status_closed);
            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
            return string4;
        }

        public final int pxFromDp(Context context, int dp) {
            Intrinsics.checkNotNullParameter(context, "context");
            return (int) (dp * context.getResources().getDisplayMetrics().density);
        }

        private Companion() {
        }
    }
}
