package com.google.android.material.datepicker;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class o implements Comparable, Parcelable {
    public static final Parcelable.Creator<o> CREATOR = new D0.a(10);

    /* renamed from: a, reason: collision with root package name */
    public final Calendar f5693a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5694b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5695c;

    /* renamed from: d, reason: collision with root package name */
    public final int f5696d;

    /* renamed from: e, reason: collision with root package name */
    public final int f5697e;

    /* renamed from: f, reason: collision with root package name */
    public final long f5698f;

    /* renamed from: g, reason: collision with root package name */
    public String f5699g;

    public o(Calendar calendar) {
        calendar.set(5, 1);
        Calendar a2 = w.a(calendar);
        this.f5693a = a2;
        this.f5694b = a2.get(2);
        this.f5695c = a2.get(1);
        this.f5696d = a2.getMaximum(7);
        this.f5697e = a2.getActualMaximum(5);
        this.f5698f = a2.getTimeInMillis();
    }

    public static o a(int i, int i4) {
        Calendar c4 = w.c(null);
        c4.set(1, i);
        c4.set(2, i4);
        return new o(c4);
    }

    public static o b(long j4) {
        Calendar c4 = w.c(null);
        c4.setTimeInMillis(j4);
        return new o(c4);
    }

    public final String c() {
        if (this.f5699g == null) {
            long timeInMillis = this.f5693a.getTimeInMillis();
            Locale locale = Locale.getDefault();
            AtomicReference atomicReference = w.f5713a;
            DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMM", locale);
            instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
            instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
            this.f5699g = instanceForSkeleton.format(new Date(timeInMillis));
        }
        return this.f5699g;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f5693a.compareTo(((o) obj).f5693a);
    }

    public final int d(o oVar) {
        if (!(this.f5693a instanceof GregorianCalendar)) {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        return (oVar.f5694b - this.f5694b) + ((oVar.f5695c - this.f5695c) * 12);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f5694b == oVar.f5694b && this.f5695c == oVar.f5695c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f5694b), Integer.valueOf(this.f5695c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f5695c);
        parcel.writeInt(this.f5694b);
    }
}
