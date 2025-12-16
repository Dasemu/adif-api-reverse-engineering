package y0;

import C.w;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final HashMap f8974e = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f8975a;

    /* renamed from: b, reason: collision with root package name */
    public final File f8976b;

    /* renamed from: c, reason: collision with root package name */
    public final Lock f8977c;

    /* renamed from: d, reason: collision with root package name */
    public FileChannel f8978d;

    public a(String name, File file, boolean z3) {
        Lock lock;
        Intrinsics.checkNotNullParameter(name, "name");
        this.f8975a = z3;
        this.f8976b = file != null ? new File(file, w.n(name, ".lck")) : null;
        HashMap hashMap = f8974e;
        synchronized (hashMap) {
            try {
                Object obj = hashMap.get(name);
                if (obj == null) {
                    obj = new ReentrantLock();
                    hashMap.put(name, obj);
                }
                lock = (Lock) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f8977c = lock;
    }

    public final void a(boolean z3) {
        this.f8977c.lock();
        if (z3) {
            File file = this.f8976b;
            try {
                if (file == null) {
                    throw new IOException("No lock directory was provided.");
                }
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = new FileOutputStream(file).getChannel();
                channel.lock();
                this.f8978d = channel;
            } catch (IOException e4) {
                this.f8978d = null;
                Log.w("SupportSQLiteLock", "Unable to grab file lock.", e4);
            }
        }
    }

    public final void b() {
        try {
            FileChannel fileChannel = this.f8978d;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.f8977c.unlock();
    }
}
