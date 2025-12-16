package D;

import android.net.Uri;
import androidx.core.content.FileProvider;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class k implements j {

    /* renamed from: a, reason: collision with root package name */
    public final String f358a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f359b = new HashMap();

    public k(String str) {
        this.f358a = str;
    }

    public static boolean a(String str, String str2) {
        String removeTrailingSlash;
        String removeTrailingSlash2;
        removeTrailingSlash = FileProvider.removeTrailingSlash(str);
        removeTrailingSlash2 = FileProvider.removeTrailingSlash(str2);
        if (removeTrailingSlash.equals(removeTrailingSlash2)) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(removeTrailingSlash2);
        sb.append('/');
        return removeTrailingSlash.startsWith(sb.toString());
    }

    public final File b(Uri uri) {
        String encodedPath = uri.getEncodedPath();
        int indexOf = encodedPath.indexOf(47, 1);
        String decode = Uri.decode(encodedPath.substring(1, indexOf));
        String decode2 = Uri.decode(encodedPath.substring(indexOf + 1));
        File file = (File) this.f359b.get(decode);
        if (file == null) {
            throw new IllegalArgumentException("Unable to find configured root for " + uri);
        }
        File file2 = new File(file, decode2);
        try {
            File canonicalFile = file2.getCanonicalFile();
            if (a(canonicalFile.getPath(), file.getPath())) {
                return canonicalFile;
            }
            throw new SecurityException("Resolved path jumped beyond configured root");
        } catch (IOException unused) {
            throw new IllegalArgumentException("Failed to resolve canonical path for " + file2);
        }
    }
}
