package L;

import com.adif.elcanomovil.uiSubscriptions.utils.SubscriptionHelper;
import com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence;
import java.io.File;
import java.util.Comparator;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1021a;

    public /* synthetic */ b(int i) {
        this.f1021a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f1021a) {
            case 0:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i = 0; i < bArr.length; i++) {
                    byte b4 = bArr[i];
                    byte b5 = bArr2[i];
                    if (b4 != b5) {
                        return b4 - b5;
                    }
                }
                return 0;
            case 1:
                return SubscriptionHelper.Companion.a((Character) obj, (Character) obj2);
            case 2:
                return CrashlyticsReportPersistence.d((File) obj, (File) obj2);
            default:
                return CrashlyticsReportPersistence.c((File) obj, (File) obj2);
        }
    }
}
