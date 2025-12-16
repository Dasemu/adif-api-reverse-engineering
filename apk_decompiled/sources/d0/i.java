package d0;

import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.lifecycle.C;
import androidx.lifecycle.InterfaceC0192m;
import androidx.lifecycle.J;

/* loaded from: classes.dex */
public final class i implements InterfaceC0192m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C f6131a;

    public i(EmojiCompatInitializer emojiCompatInitializer, C c4) {
        this.f6131a = c4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.lang.Runnable] */
    @Override // androidx.lifecycle.InterfaceC0192m
    public final void d(J j4) {
        AbstractC0304b.a(Looper.getMainLooper()).postDelayed(new Object(), 500L);
        this.f6131a.c(this);
    }
}
