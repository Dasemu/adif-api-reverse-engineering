package androidx.room;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class r extends RemoteCallbackList {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MultiInstanceInvalidationService f4004a;

    public r(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f4004a = multiInstanceInvalidationService;
    }

    @Override // android.os.RemoteCallbackList
    public final void onCallbackDied(IInterface iInterface, Object cookie) {
        l callback = (l) iInterface;
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(cookie, "cookie");
        this.f4004a.f3949b.remove((Integer) cookie);
    }
}
