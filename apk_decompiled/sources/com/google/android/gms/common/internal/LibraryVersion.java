package com.google.android.gms.common.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.concurrent.ConcurrentHashMap;

@KeepForSdk
@Deprecated
/* loaded from: classes3.dex */
public class LibraryVersion {
    private static final GmsLogger zza = new GmsLogger("LibraryVersion", "");
    private static LibraryVersion zzb = new LibraryVersion();
    private ConcurrentHashMap zzc = new ConcurrentHashMap();

    @VisibleForTesting
    public LibraryVersion() {
    }

    @KeepForSdk
    public static LibraryVersion getInstance() {
        return zzb;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x009d  */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @com.google.android.gms.common.annotation.KeepForSdk
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String getVersion(java.lang.String r9) {
        /*
            r8 = this;
            java.lang.String r0 = "LibraryVersion"
            java.lang.String r1 = "Failed to get app version for libraryName: "
            java.lang.String r2 = "/"
            java.lang.String r3 = "Please provide a valid libraryName"
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r9, r3)
            java.util.concurrent.ConcurrentHashMap r3 = r8.zzc
            boolean r3 = r3.containsKey(r9)
            if (r3 == 0) goto L1c
            java.util.concurrent.ConcurrentHashMap r8 = r8.zzc
            java.lang.Object r8 = r8.get(r9)
            java.lang.String r8 = (java.lang.String) r8
            return r8
        L1c:
            java.util.Properties r3 = new java.util.Properties
            r3.<init>()
            r4 = 0
            java.lang.Class<com.google.android.gms.common.internal.LibraryVersion> r5 = com.google.android.gms.common.internal.LibraryVersion.class
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L7e java.lang.Throwable -> L81
            r6.<init>(r2)     // Catch: java.io.IOException -> L7e java.lang.Throwable -> L81
            r6.append(r9)     // Catch: java.io.IOException -> L7e java.lang.Throwable -> L81
            java.lang.String r2 = ".properties"
            r6.append(r2)     // Catch: java.io.IOException -> L7e java.lang.Throwable -> L81
            java.lang.String r2 = r6.toString()     // Catch: java.io.IOException -> L7e java.lang.Throwable -> L81
            java.io.InputStream r2 = r5.getResourceAsStream(r2)     // Catch: java.io.IOException -> L7e java.lang.Throwable -> L81
            if (r2 == 0) goto L65
            r3.load(r2)     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L60
            java.lang.String r5 = "version"
            java.lang.String r4 = r3.getProperty(r5, r4)     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L60
            com.google.android.gms.common.internal.GmsLogger r3 = com.google.android.gms.common.internal.LibraryVersion.zza     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L60
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L60
            r5.<init>()     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L60
            r5.append(r9)     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L60
            java.lang.String r6 = " version is "
            r5.append(r6)     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L60
            r5.append(r4)     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L60
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L60
            r3.v(r0, r5)     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L60
            goto L76
        L5e:
            r8 = move-exception
            goto L7c
        L60:
            r3 = move-exception
            r7 = r4
            r4 = r2
            r2 = r7
            goto L84
        L65:
            com.google.android.gms.common.internal.GmsLogger r3 = com.google.android.gms.common.internal.LibraryVersion.zza     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L60
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L60
            r5.<init>(r1)     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L60
            r5.append(r9)     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L60
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L60
            r3.w(r0, r5)     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L60
        L76:
            if (r2 == 0) goto L9b
            com.google.android.gms.common.util.IOUtils.closeQuietly(r2)
            goto L9b
        L7c:
            r4 = r2
            goto Lac
        L7e:
            r2 = move-exception
            r3 = r2
            goto L83
        L81:
            r8 = move-exception
            goto Lac
        L83:
            r2 = r4
        L84:
            com.google.android.gms.common.internal.GmsLogger r5 = com.google.android.gms.common.internal.LibraryVersion.zza     // Catch: java.lang.Throwable -> L81
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L81
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L81
            r6.append(r9)     // Catch: java.lang.Throwable -> L81
            java.lang.String r1 = r6.toString()     // Catch: java.lang.Throwable -> L81
            r5.e(r0, r1, r3)     // Catch: java.lang.Throwable -> L81
            if (r4 == 0) goto L9a
            com.google.android.gms.common.util.IOUtils.closeQuietly(r4)
        L9a:
            r4 = r2
        L9b:
            if (r4 != 0) goto La6
            com.google.android.gms.common.internal.GmsLogger r1 = com.google.android.gms.common.internal.LibraryVersion.zza
            java.lang.String r2 = ".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used"
            r1.d(r0, r2)
            java.lang.String r4 = "UNKNOWN"
        La6:
            java.util.concurrent.ConcurrentHashMap r8 = r8.zzc
            r8.put(r9, r4)
            return r4
        Lac:
            if (r4 == 0) goto Lb1
            com.google.android.gms.common.util.IOUtils.closeQuietly(r4)
        Lb1:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.LibraryVersion.getVersion(java.lang.String):java.lang.String");
    }
}
