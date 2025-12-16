package com.google.firebase.crashlytics.internal.model.serialization;

import android.util.JsonReader;
import com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements CrashlyticsReportJsonTransform.ObjectParser {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5977a;

    public /* synthetic */ a(int i) {
        this.f5977a = i;
    }

    @Override // com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform.ObjectParser
    public final Object parse(JsonReader jsonReader) {
        switch (this.f5977a) {
            case 0:
                return CrashlyticsReportJsonTransform.c(jsonReader);
            case 1:
                return CrashlyticsReportJsonTransform.b(jsonReader);
            case 2:
                return CrashlyticsReportJsonTransform.d(jsonReader);
            case 3:
                return CrashlyticsReportJsonTransform.h(jsonReader);
            case 4:
                return CrashlyticsReportJsonTransform.i(jsonReader);
            case 5:
                return CrashlyticsReportJsonTransform.f(jsonReader);
            case 6:
                return CrashlyticsReportJsonTransform.e(jsonReader);
            case 7:
                return CrashlyticsReportJsonTransform.g(jsonReader);
            default:
                return CrashlyticsReportJsonTransform.a(jsonReader);
        }
    }
}
