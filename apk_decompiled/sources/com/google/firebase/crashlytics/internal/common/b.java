package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.io.File;
import java.util.Comparator;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5968a;

    public /* synthetic */ b(int i) {
        this.f5968a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int lambda$static$1;
        switch (this.f5968a) {
            case 0:
                lambda$static$1 = CrashlyticsAppQualitySessionsStore.lambda$static$1((File) obj, (File) obj2);
                return lambda$static$1;
            default:
                return SessionReportingCoordinator.a((CrashlyticsReport.CustomAttribute) obj, (CrashlyticsReport.CustomAttribute) obj2);
        }
    }
}
