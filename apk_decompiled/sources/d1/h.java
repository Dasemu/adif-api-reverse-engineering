package d1;

import android.content.Context;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class h implements g {

    /* renamed from: a, reason: collision with root package name */
    public final Context f6170a;

    public h(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f6170a = context;
    }

    public final String a(int i) {
        String string = this.f6170a.getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    public final String b(int i, Object... args) {
        Intrinsics.checkNotNullParameter(args, "args");
        String string = this.f6170a.getString(i, Arrays.copyOf(args, args.length));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }
}
