package d0;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: j, reason: collision with root package name */
    public static final Object f6122j = new Object();

    /* renamed from: k, reason: collision with root package name */
    public static volatile h f6123k;

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantReadWriteLock f6124a;

    /* renamed from: b, reason: collision with root package name */
    public final s.f f6125b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f6126c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f6127d;

    /* renamed from: e, reason: collision with root package name */
    public final e f6128e;

    /* renamed from: f, reason: collision with root package name */
    public final g f6129f;

    /* renamed from: g, reason: collision with root package name */
    public final E2.e f6130g;
    public final int h;
    public final C0305c i;

    public h(p pVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f6124a = reentrantReadWriteLock;
        this.f6126c = 3;
        g gVar = (g) pVar.f3794b;
        this.f6129f = gVar;
        int i = pVar.f3793a;
        this.h = i;
        this.i = (C0305c) pVar.f3795c;
        this.f6127d = new Handler(Looper.getMainLooper());
        this.f6125b = new s.f(0);
        this.f6130g = new E2.e(27);
        e eVar = new e(this);
        this.f6128e = eVar;
        reentrantReadWriteLock.writeLock().lock();
        if (i == 0) {
            try {
                this.f6126c = 0;
            } catch (Throwable th) {
                this.f6124a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            try {
                gVar.a(new C0306d(eVar));
            } catch (Throwable th2) {
                d(th2);
            }
        }
    }

    public static h a() {
        h hVar;
        synchronized (f6122j) {
            try {
                hVar = f6123k;
                if (!(hVar != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } finally {
            }
        }
        return hVar;
    }

    public final int b() {
        this.f6124a.readLock().lock();
        try {
            return this.f6126c;
        } finally {
            this.f6124a.readLock().unlock();
        }
    }

    public final void c() {
        if (!(this.h == 1)) {
            throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        }
        if (b() == 1) {
            return;
        }
        this.f6124a.writeLock().lock();
        try {
            if (this.f6126c == 0) {
                return;
            }
            this.f6126c = 0;
            this.f6124a.writeLock().unlock();
            e eVar = this.f6128e;
            h hVar = eVar.f6119a;
            try {
                hVar.f6129f.a(new C0306d(eVar));
            } catch (Throwable th) {
                hVar.d(th);
            }
        } finally {
            this.f6124a.writeLock().unlock();
        }
    }

    public final void d(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f6124a.writeLock().lock();
        try {
            this.f6126c = 2;
            arrayList.addAll(this.f6125b);
            this.f6125b.clear();
            this.f6124a.writeLock().unlock();
            this.f6127d.post(new H0.p(arrayList, this.f6126c, th));
        } catch (Throwable th2) {
            this.f6124a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x009f A[Catch: all -> 0x0082, TryCatch #0 {all -> 0x0082, blocks: (B:28:0x005a, B:31:0x005f, B:33:0x0063, B:35:0x0070, B:37:0x008f, B:39:0x0099, B:41:0x009c, B:43:0x009f, B:45:0x00af, B:46:0x00b2), top: B:27:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, d0.v] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.CharSequence e(java.lang.CharSequence r10, int r11, int r12) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.h.e(java.lang.CharSequence, int, int):java.lang.CharSequence");
    }

    public final void f(f fVar) {
        m3.d.i(fVar, "initCallback cannot be null");
        this.f6124a.writeLock().lock();
        try {
            if (this.f6126c != 1 && this.f6126c != 2) {
                this.f6125b.add(fVar);
                this.f6124a.writeLock().unlock();
            }
            this.f6127d.post(new H0.p(Arrays.asList(fVar), this.f6126c, (Throwable) null));
            this.f6124a.writeLock().unlock();
        } catch (Throwable th) {
            this.f6124a.writeLock().unlock();
            throw th;
        }
    }
}
