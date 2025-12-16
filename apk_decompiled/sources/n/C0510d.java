package n;

import android.os.Handler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: n.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0510d extends m3.d {

    /* renamed from: a, reason: collision with root package name */
    public final Object f7836a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f7837b = Executors.newFixedThreadPool(4, new ThreadFactoryC0509c());

    /* renamed from: c, reason: collision with root package name */
    public volatile Handler f7838c;
}
