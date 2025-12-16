package com.google.android.material.datepicker;

import java.util.Calendar;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReference f5713a = new AtomicReference();

    public static Calendar a(Calendar calendar) {
        Calendar c4 = c(calendar);
        Calendar c5 = c(null);
        c5.set(c4.get(1), c4.get(2), c4.get(5));
        return c5;
    }

    public static Calendar b() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.setTimeZone(TimeZone.getTimeZone("UTC"));
        return calendar;
    }

    public static Calendar c(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        if (calendar == null) {
            calendar2.clear();
            return calendar2;
        }
        calendar2.setTimeInMillis(calendar.getTimeInMillis());
        return calendar2;
    }
}
