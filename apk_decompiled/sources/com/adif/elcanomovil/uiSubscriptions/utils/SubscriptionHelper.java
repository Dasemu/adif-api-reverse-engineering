package com.adif.elcanomovil.uiSubscriptions.utils;

import L.b;
import com.adif.elcanomovil.domain.entities.subscription.Destination;
import com.adif.elcanomovil.domain.entities.subscription.Subscription;
import com.adif.elcanomovil.domain.entities.subscription.SubscriptionType;
import com.adif.elcanomovil.uiSubscriptions.create.views.data.SubscriptionCreateViewData;
import com.google.firebase.messaging.Constants;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/adif/elcanomovil/uiSubscriptions/utils/SubscriptionHelper;", "", "()V", "Companion", "ui-subscriptions_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SubscriptionHelper {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final SimpleDateFormat format = new SimpleDateFormat("HH:mm", Locale.FRANCE);

    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bJ.\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0011\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\bH\u0002J$\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\rJ\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bJ\u000e\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u001d\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u001e"}, d2 = {"Lcom/adif/elcanomovil/uiSubscriptions/utils/SubscriptionHelper$Companion;", "", "()V", "format", "Ljava/text/SimpleDateFormat;", "getFormat", "()Ljava/text/SimpleDateFormat;", "addOrRemoveDay", "", "dayToAddOrRemove", "", "currentDays", "calculateAnticipationTime", "Lcom/adif/elcanomovil/uiSubscriptions/utils/AnticipationType;", "isCercanias", "", "timeStart", "timeCenter", "timeEnd", "calculateInfoDate", "Lkotlin/Pair;", "initialDate", "Ljava/util/Date;", "anticipationTime", "createSubscriptionViewData", "Lcom/adif/elcanomovil/uiSubscriptions/create/views/data/SubscriptionCreateViewData;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/adif/elcanomovil/domain/entities/subscription/Subscription;", "getMeDayString", "getTrainType", "ui-subscriptions_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nSubscriptionHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubscriptionHelper.kt\ncom/adif/elcanomovil/uiSubscriptions/utils/SubscriptionHelper$Companion\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,122:1\n429#2:123\n502#2,5:124\n*S KotlinDebug\n*F\n+ 1 SubscriptionHelper.kt\ncom/adif/elcanomovil/uiSubscriptions/utils/SubscriptionHelper$Companion\n*L\n33#1:123\n33#1:124,5\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final int addOrRemoveDay$lambda$1(String orderedDays, Character ch, Character ch2) {
            int indexOf$default;
            int indexOf$default2;
            Intrinsics.checkNotNullParameter(orderedDays, "$orderedDays");
            Intrinsics.checkNotNull(ch);
            indexOf$default = StringsKt__StringsKt.indexOf$default(orderedDays, ch.charValue(), 0, false, 6, (Object) null);
            Intrinsics.checkNotNull(ch2);
            indexOf$default2 = StringsKt__StringsKt.indexOf$default(orderedDays, ch2.charValue(), 0, false, 6, (Object) null);
            return Intrinsics.compare(indexOf$default, indexOf$default2);
        }

        private final AnticipationType calculateAnticipationTime(boolean isCercanias, String timeStart, String timeCenter, String timeEnd) {
            if (timeEnd == null || StringsKt.isBlank(timeEnd)) {
                return null;
            }
            return AnticipationType.INSTANCE.invoke((int) (((getFormat().parse(timeEnd).getTime() - getFormat().parse(timeCenter).getTime()) / 1000) / 60));
        }

        public final String addOrRemoveDay(char dayToAddOrRemove, String currentDays) {
            boolean contains$default;
            String str;
            List sortedWith;
            String joinToString$default;
            Intrinsics.checkNotNullParameter(currentDays, "currentDays");
            contains$default = StringsKt__StringsKt.contains$default(currentDays, dayToAddOrRemove, false, 2, (Object) null);
            if (contains$default) {
                StringBuilder sb = new StringBuilder();
                int length = currentDays.length();
                for (int i = 0; i < length; i++) {
                    char charAt = currentDays.charAt(i);
                    if (charAt != dayToAddOrRemove) {
                        sb.append(charAt);
                    }
                }
                str = sb.toString();
                Intrinsics.checkNotNullExpressionValue(str, "toString(...)");
            } else {
                str = currentDays + dayToAddOrRemove;
            }
            char[] charArray = str.toCharArray();
            Intrinsics.checkNotNullExpressionValue(charArray, "toCharArray(...)");
            sortedWith = ArraysKt___ArraysKt.sortedWith(charArray, (Comparator<? super Character>) new b(1));
            joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(sortedWith, "", null, null, 0, null, null, 62, null);
            return joinToString$default;
        }

        public final Pair<String, String> calculateInfoDate(Date initialDate, AnticipationType anticipationTime) {
            String str;
            Intrinsics.checkNotNullParameter(initialDate, "initialDate");
            String format = getFormat().format(initialDate);
            if (anticipationTime != null) {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm", Locale.FRANCE);
                Date parse = simpleDateFormat.parse(format);
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(parse);
                calendar.add(12, anticipationTime.getValue());
                simpleDateFormat.format(calendar.getTime());
                str = SubscriptionHelper.INSTANCE.getFormat().format(calendar.getTime());
            } else {
                str = format;
            }
            return new Pair<>(format, str);
        }

        public final SubscriptionCreateViewData createSubscriptionViewData(Subscription r23) {
            if (r23 == null) {
                return null;
            }
            boolean areEqual = Intrinsics.areEqual(r23.getSubscriptionType(), "cercanias");
            String subscriptionType = r23.getTypeSubscription() == SubscriptionType.TRAIN ? r23.getSubscriptionType() : "";
            String shortName = r23.getOrigin().getShortName();
            String valueOf = String.valueOf(r23.getOrigin().getId());
            String shortName2 = r23.getOrigin().getShortName();
            String valueOf2 = String.valueOf(r23.getOrigin().getId());
            Destination destination = r23.getDestination();
            String shortName3 = destination != null ? destination.getShortName() : null;
            Destination destination2 = r23.getDestination();
            return new SubscriptionCreateViewData(areEqual, shortName, valueOf, shortName2, valueOf2, shortName3, String.valueOf(destination2 != null ? Integer.valueOf(destination2.getId()) : null), r23.getRepeats(), subscriptionType, r23.getOperator(), r23.getCommercialProduct(), SubscriptionHelper.INSTANCE.calculateAnticipationTime(areEqual, r23.getTimeStart(), r23.getTimeCenter(), r23.getTimeEnd()), r23.getTypeSubscription(), r23.getTimeCenter(), null, null, 49152, null);
        }

        public final SimpleDateFormat getFormat() {
            return SubscriptionHelper.format;
        }

        public final String getMeDayString(Date initialDate) {
            Intrinsics.checkNotNullParameter(initialDate, "initialDate");
            String format = new SimpleDateFormat("dd/MM/yyyy", Locale.FRANCE).format(initialDate);
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            return format;
        }

        public final String getTrainType(boolean isCercanias) {
            return isCercanias ? "cercanias" : SubscriptionHelperKt.LONG_DISTANCE_TRAIN;
        }

        private Companion() {
        }
    }
}
