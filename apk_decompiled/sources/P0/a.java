package P0;

import S0.o;
import W0.f;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import e3.w;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1344a;

    public /* synthetic */ a(int i) {
        this.f1344a = i;
    }

    public final Object a(Object obj, o oVar) {
        String scheme;
        boolean startsWith$default;
        String authority;
        switch (this.f1344a) {
            case 0:
                return ByteBuffer.wrap((byte[]) obj);
            case 1:
                Uri uri = (Uri) obj;
                if (!f.d(uri) && ((scheme = uri.getScheme()) == null || Intrinsics.areEqual(scheme, "file"))) {
                    String path = uri.getPath();
                    if (path == null) {
                        path = "";
                    }
                    startsWith$default = StringsKt__StringsKt.startsWith$default((CharSequence) path, '/', false, 2, (Object) null);
                    if (startsWith$default && ((String) CollectionsKt.firstOrNull((List) uri.getPathSegments())) != null) {
                        if (!Intrinsics.areEqual(uri.getScheme(), "file")) {
                            return new File(uri.toString());
                        }
                        String path2 = uri.getPath();
                        if (path2 != null) {
                            return new File(path2);
                        }
                    }
                }
                return null;
            case 2:
                return ((w) obj).i;
            case 3:
                Context context = oVar.f1502a;
                int intValue = ((Number) obj).intValue();
                try {
                    if (context.getResources().getResourceEntryName(intValue) != null) {
                        return Uri.parse("android.resource://" + context.getPackageName() + '/' + intValue);
                    }
                } catch (Resources.NotFoundException unused) {
                }
                return null;
            case 4:
                Uri uri2 = (Uri) obj;
                if (!Intrinsics.areEqual(uri2.getScheme(), "android.resource") || (authority = uri2.getAuthority()) == null || StringsKt.isBlank(authority) || uri2.getPathSegments().size() != 2) {
                    return null;
                }
                String authority2 = uri2.getAuthority();
                if (authority2 == null) {
                    authority2 = "";
                }
                Resources resourcesForApplication = oVar.f1502a.getPackageManager().getResourcesForApplication(authority2);
                List<String> pathSegments = uri2.getPathSegments();
                int identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority2);
                if (identifier == 0) {
                    throw new IllegalStateException(("Invalid android.resource URI: " + uri2).toString());
                }
                return Uri.parse("android.resource://" + authority2 + '/' + identifier);
            default:
                return Uri.parse((String) obj);
        }
    }
}
