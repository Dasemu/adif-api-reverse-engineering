package d0;

import android.os.Trace;

/* loaded from: classes.dex */
public final class k implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        try {
            Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
            if (h.f6123k != null) {
                h.a().c();
            }
        } finally {
            Trace.endSection();
        }
    }
}
