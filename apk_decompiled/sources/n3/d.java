package n3;

import android.util.Log;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;

/* loaded from: classes3.dex */
public final class d extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public static final d f7871a = new Handler();

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }

    @Override // java.util.logging.Handler
    public final void publish(LogRecord record) {
        int indexOf$default;
        int min;
        Intrinsics.checkNotNullParameter(record, "record");
        CopyOnWriteArraySet copyOnWriteArraySet = c.f7869a;
        String loggerName = record.getLoggerName();
        Intrinsics.checkNotNullExpressionValue(loggerName, "record.loggerName");
        int intValue = record.getLevel().intValue();
        Level level = Level.INFO;
        int i = intValue > level.intValue() ? 5 : record.getLevel().intValue() == level.intValue() ? 4 : 3;
        String message = record.getMessage();
        Intrinsics.checkNotNullExpressionValue(message, "record.message");
        Throwable thrown = record.getThrown();
        Intrinsics.checkNotNullParameter(loggerName, "loggerName");
        Intrinsics.checkNotNullParameter(message, "message");
        String str = (String) c.f7870b.get(loggerName);
        if (str == null) {
            str = StringsKt.take(loggerName, 23);
        }
        if (Log.isLoggable(str, i)) {
            if (thrown != null) {
                message = message + '\n' + Log.getStackTraceString(thrown);
            }
            int length = message.length();
            int i4 = 0;
            while (i4 < length) {
                indexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) message, '\n', i4, false, 4, (Object) null);
                if (indexOf$default == -1) {
                    indexOf$default = length;
                }
                while (true) {
                    min = Math.min(indexOf$default, i4 + 4000);
                    String substring = message.substring(i4, min);
                    Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    Log.println(i, str, substring);
                    if (min >= indexOf$default) {
                        break;
                    } else {
                        i4 = min;
                    }
                }
                i4 = min + 1;
            }
        }
    }
}
