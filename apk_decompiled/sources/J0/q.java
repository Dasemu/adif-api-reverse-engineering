package J0;

import android.content.Context;
import android.graphics.Bitmap;
import com.adif.elcanomovil.serviceStorage.preferences.SharedPreferenceStorage;
import java.io.File;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class q extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f957a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f958b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(Context context, int i) {
        super(0);
        this.f957a = i;
        this.f958b = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Context context = this.f958b;
        switch (this.f957a) {
            case 0:
                Bitmap.Config[] configArr = W0.f.f1887a;
                File cacheDir = context.getCacheDir();
                if (cacheDir == null) {
                    throw new IllegalStateException("cacheDir == null");
                }
                cacheDir.mkdirs();
                return cacheDir;
            case 1:
                Bitmap.Config[] configArr2 = W0.f.f1887a;
                File cacheDir2 = context.getCacheDir();
                if (cacheDir2 == null) {
                    throw new IllegalStateException("cacheDir == null");
                }
                cacheDir2.mkdirs();
                return cacheDir2;
            default:
                return context.getApplicationContext().getSharedPreferences(SharedPreferenceStorage.PREFS_NAME, 0);
        }
    }
}
