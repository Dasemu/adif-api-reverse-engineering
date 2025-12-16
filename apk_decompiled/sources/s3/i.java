package s3;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import r3.z;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final z f8489a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f8490b;

    /* renamed from: c, reason: collision with root package name */
    public final long f8491c;

    /* renamed from: d, reason: collision with root package name */
    public final long f8492d;

    /* renamed from: e, reason: collision with root package name */
    public final int f8493e;

    /* renamed from: f, reason: collision with root package name */
    public final Long f8494f;

    /* renamed from: g, reason: collision with root package name */
    public final long f8495g;
    public final ArrayList h;

    public /* synthetic */ i(z zVar) {
        this(zVar, true, "", -1L, -1L, -1, null, -1L);
    }

    public i(z canonicalPath, boolean z3, String comment, long j4, long j5, int i, Long l4, long j6) {
        Intrinsics.checkNotNullParameter(canonicalPath, "canonicalPath");
        Intrinsics.checkNotNullParameter(comment, "comment");
        this.f8489a = canonicalPath;
        this.f8490b = z3;
        this.f8491c = j4;
        this.f8492d = j5;
        this.f8493e = i;
        this.f8494f = l4;
        this.f8495g = j6;
        this.h = new ArrayList();
    }
}
