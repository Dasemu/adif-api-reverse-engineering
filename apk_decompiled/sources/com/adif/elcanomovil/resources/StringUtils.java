package com.adif.elcanomovil.resources;

import F.q;
import android.content.Context;
import android.graphics.Typeface;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import com.adif.elcanomovil.commonResources.R;
import com.adif.elcanomovil.extensions.DoubleExtensionsKt;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0016\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/adif/elcanomovil/resources/StringUtils;", "", "()V", "Companion", "common-resources_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public class StringUtils {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bJ\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006J\u0015\u0010\r\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0010J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\f\u001a\u00020\u0006J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0006J\u0016\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0006J5\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001b\u001a\u00020\u0006¢\u0006\u0002\u0010\u001eJ0\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u00062\b\b\u0002\u0010\"\u001a\u00020\b2\u0006\u0010#\u001a\u00020\b¨\u0006$"}, d2 = {"Lcom/adif/elcanomovil/resources/StringUtils$Companion;", "", "()V", "colorMyText", "Landroid/text/Spannable;", "inputText", "", "startIndex", "", "endIndex", "textColor", "dateFormat", "date", "distanceToStringkKm", "distance", "", "(Ljava/lang/Double;)Ljava/lang/String;", "formatHeight", "height", "formatWight", "weight", "stringToDateShort", "Ljava/util/Date;", "textBold", "Landroid/text/SpannableString;", "context", "Landroid/content/Context;", "text", "textRegular", "textSemiBold", "(Landroid/content/Context;IILjava/lang/Integer;Ljava/lang/String;)Landroid/text/Spannable;", "textStyle", "textOne", "textTwo", "fontType", "color", "common-resources_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ SpannableString textStyle$default(Companion companion, Context context, String str, String str2, int i, int i4, int i5, Object obj) {
            if ((i5 & 8) != 0) {
                i = R.font.open_sans_bold;
            }
            return companion.textStyle(context, str, str2, i, i4);
        }

        public final Spannable colorMyText(String inputText, int startIndex, int endIndex, int textColor) {
            Intrinsics.checkNotNullParameter(inputText, "inputText");
            SpannableString spannableString = new SpannableString(inputText);
            spannableString.setSpan(new ForegroundColorSpan(textColor), startIndex, endIndex, 33);
            return spannableString;
        }

        public final String dateFormat(String date) {
            Intrinsics.checkNotNullParameter(date, "date");
            if (date.length() == 0) {
                return "";
            }
            String format = new SimpleDateFormat("dd/MM/yyyy").format(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss").parse(date));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            return format;
        }

        public final String distanceToStringkKm(Double distance) {
            if (distance == null) {
                return "";
            }
            String str = DoubleExtensionsKt.round$default(distance.doubleValue() / 1000, 0, 1, null) + " km";
            return str == null ? "" : str;
        }

        public final String formatHeight(Double height) {
            if (height == null) {
                return "";
            }
            String str = height.doubleValue() + " cm";
            return str == null ? "" : str;
        }

        public final String formatWight(Double weight) {
            if (weight == null) {
                return "";
            }
            String str = DoubleExtensionsKt.round$default(weight.doubleValue(), 0, 1, null) + " kg";
            return str == null ? "" : str;
        }

        public final Date stringToDateShort(String date) {
            Intrinsics.checkNotNullParameter(date, "date");
            if (date.length() == 0) {
                return null;
            }
            return new SimpleDateFormat("HH:mm", Locale.FRANCE).parse(date);
        }

        public final SpannableString textBold(Context context, String text) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(text, "text");
            q.a(context, R.font.open_sans_bold);
            SpannableString spannableString = new SpannableString(text);
            spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 18);
            return spannableString;
        }

        public final SpannableString textRegular(Context context, String text) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(text, "text");
            SpannableString spannableString = new SpannableString(text);
            spannableString.setSpan(new StyleSpan(0), 0, text.length(), 18);
            return spannableString;
        }

        public final Spannable textSemiBold(Context context, int startIndex, int endIndex, Integer textColor, String text) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(text, "text");
            Typeface a2 = q.a(context, R.font.open_sans_semi_bold);
            SpannableString spannableString = new SpannableString(text);
            if (textColor != null) {
                spannableString.setSpan(new ForegroundColorSpan(textColor.intValue()), startIndex, endIndex, 33);
            }
            spannableString.setSpan(a2, 0, spannableString.length(), 33);
            return spannableString;
        }

        public final SpannableString textStyle(Context context, String textOne, String textTwo, int fontType, int color) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(textOne, "textOne");
            Intrinsics.checkNotNullParameter(textTwo, "textTwo");
            SpannableString spannableString = new SpannableString(textOne + ' ' + textTwo);
            spannableString.setSpan(new ForegroundColorSpan(color), textOne.length() + 1, spannableString.length(), 33);
            spannableString.setSpan(q.a(context, fontType), textOne.length() + 1, spannableString.length(), 33);
            spannableString.setSpan(new StyleSpan(1), textOne.length() + 1, spannableString.length(), 33);
            return spannableString;
        }

        private Companion() {
        }
    }
}
