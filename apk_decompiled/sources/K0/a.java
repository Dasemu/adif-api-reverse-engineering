package K0;

import android.os.StatFs;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.io.File;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import r3.n;
import r3.u;
import r3.z;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public z f974a;

    /* renamed from: b, reason: collision with root package name */
    public final u f975b = n.f8299a;

    /* renamed from: c, reason: collision with root package name */
    public double f976c = 0.02d;

    /* renamed from: d, reason: collision with root package name */
    public final long f977d = 10485760;

    /* renamed from: e, reason: collision with root package name */
    public final long f978e = 262144000;

    /* renamed from: f, reason: collision with root package name */
    public final CoroutineDispatcher f979f = Dispatchers.getIO();

    public final j a() {
        long j4;
        z zVar = this.f974a;
        if (zVar == null) {
            throw new IllegalStateException("directory == null");
        }
        if (this.f976c > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            try {
                File e4 = zVar.e();
                e4.mkdir();
                StatFs statFs = new StatFs(e4.getAbsolutePath());
                j4 = RangesKt.coerceIn((long) (this.f976c * statFs.getBlockCountLong() * statFs.getBlockSizeLong()), this.f977d, this.f978e);
            } catch (Exception unused) {
                j4 = this.f977d;
            }
        } else {
            j4 = 0;
        }
        return new j(j4, this.f979f, this.f975b, zVar);
    }
}
