package L;

import C.w;
import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import android.util.Log;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final b f1022a = new b(0);

    public static h a(Context context, I0.b bVar) {
        Cursor cursor;
        PackageManager packageManager = context.getPackageManager();
        Resources resources = context.getResources();
        String str = (String) bVar.f740c;
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(str, 0);
        if (resolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException(w.z("No package found for authority: ", str));
        }
        String str2 = resolveContentProvider.packageName;
        String str3 = (String) bVar.f741d;
        if (!str2.equals(str3)) {
            throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + str3);
        }
        Signature[] signatureArr = packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures;
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        b bVar2 = f1022a;
        Collections.sort(arrayList, bVar2);
        List list = (List) bVar.f739b;
        if (list == null) {
            list = F.b.j(resources, 0);
        }
        int i = 0;
        loop1: while (true) {
            cursor = null;
            if (i >= list.size()) {
                resolveContentProvider = null;
                break;
            }
            ArrayList arrayList2 = new ArrayList((Collection) list.get(i));
            Collections.sort(arrayList2, bVar2);
            if (arrayList.size() == arrayList2.size()) {
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    if (!Arrays.equals((byte[]) arrayList.get(i4), (byte[]) arrayList2.get(i4))) {
                        break;
                    }
                }
                break loop1;
            }
            i++;
        }
        if (resolveContentProvider == null) {
            return new h(1, (i[]) null);
        }
        String str4 = resolveContentProvider.authority;
        ArrayList arrayList3 = new ArrayList();
        Uri build = new Uri.Builder().scheme(FirebaseAnalytics.Param.CONTENT).authority(str4).build();
        Uri build2 = new Uri.Builder().scheme(FirebaseAnalytics.Param.CONTENT).authority(str4).appendPath("file").build();
        ContentProviderClient acquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(build);
        try {
            String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
            String[] strArr2 = {(String) bVar.f742e};
            if (acquireUnstableContentProviderClient != null) {
                try {
                    cursor = acquireUnstableContentProviderClient.query(build, strArr, "query = ?", strArr2, null, null);
                } catch (RemoteException e4) {
                    Log.w("FontsProvider", "Unable to query the content provider", e4);
                }
            }
            if (cursor != null && cursor.getCount() > 0) {
                int columnIndex = cursor.getColumnIndex("result_code");
                arrayList3 = new ArrayList();
                int columnIndex2 = cursor.getColumnIndex("_id");
                int columnIndex3 = cursor.getColumnIndex("file_id");
                int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                int columnIndex5 = cursor.getColumnIndex("font_weight");
                int columnIndex6 = cursor.getColumnIndex("font_italic");
                while (cursor.moveToNext()) {
                    arrayList3.add(new i(columnIndex3 == -1 ? ContentUris.withAppendedId(build, cursor.getLong(columnIndex2)) : ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3)), columnIndex4 != -1 ? cursor.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursor.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursor.getInt(columnIndex6) == 1, columnIndex != -1 ? cursor.getInt(columnIndex) : 0));
                }
            }
            if (cursor != null) {
                cursor.close();
            }
            if (acquireUnstableContentProviderClient != null) {
                acquireUnstableContentProviderClient.close();
            }
            return new h(0, (i[]) arrayList3.toArray(new i[0]));
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            if (acquireUnstableContentProviderClient != null) {
                acquireUnstableContentProviderClient.close();
            }
            throw th;
        }
    }
}
