package j3;

import java.text.SimpleDateFormat;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class c extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
        simpleDateFormat.setLenient(false);
        simpleDateFormat.setTimeZone(f3.c.f6473e);
        return simpleDateFormat;
    }
}
