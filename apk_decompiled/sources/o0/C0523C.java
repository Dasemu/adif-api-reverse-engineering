package o0;

import android.content.Intent;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: o0.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0523C {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f7911a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7912b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7913c;

    public C0523C(Uri uri, String str, String str2) {
        this.f7911a = uri;
        this.f7912b = str;
        this.f7913c = str2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NavDeepLinkRequest{");
        Uri uri = this.f7911a;
        if (uri != null) {
            sb.append(" uri=");
            sb.append(String.valueOf(uri));
        }
        String str = this.f7912b;
        if (str != null) {
            sb.append(" action=");
            sb.append(str);
        }
        String str2 = this.f7913c;
        if (str2 != null) {
            sb.append(" mimetype=");
            sb.append(str2);
        }
        sb.append(" }");
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "sb.toString()");
        return sb2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0523C(Intent intent) {
        this(intent.getData(), intent.getAction(), intent.getType());
        Intrinsics.checkNotNullParameter(intent, "intent");
    }
}
