package N2;

import com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence;
import java.io.File;
import java.io.FilenameFilter;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements FilenameFilter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1198a;

    public /* synthetic */ a(int i) {
        this.f1198a = i;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        switch (this.f1198a) {
            case 0:
                return CrashlyticsReportPersistence.a(file, str);
            default:
                return CrashlyticsReportPersistence.b(file, str);
        }
    }
}
