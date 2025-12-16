package j3;

import java.text.DateFormat;

/* loaded from: classes3.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final c f6945a = new ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f6946b;

    /* renamed from: c, reason: collision with root package name */
    public static final DateFormat[] f6947c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.ThreadLocal, j3.c] */
    static {
        String[] strArr = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};
        f6946b = strArr;
        f6947c = new DateFormat[strArr.length];
    }
}
