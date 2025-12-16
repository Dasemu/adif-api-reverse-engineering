package B0;

import O.D0;
import O.InterfaceC0080v;
import android.content.Context;
import android.view.View;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.send.DataTransportCrashlyticsReportSender;
import com.google.firebase.messaging.FcmBroadcastProcessor;
import com.google.firebase.messaging.reporting.MessagingClientEventExtension;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class w implements I2.C, T1.h, LibraryVersionComponent.VersionExtractor, T1.e, Continuation, SuccessContinuation, InterfaceC0080v {

    /* renamed from: b, reason: collision with root package name */
    public static final w f173b = new w(0);

    /* renamed from: c, reason: collision with root package name */
    public static final w f174c = new w(1);

    /* renamed from: d, reason: collision with root package name */
    public static final w f175d = new w(2);

    /* renamed from: e, reason: collision with root package name */
    public static final w f176e = new w(3);

    /* renamed from: f, reason: collision with root package name */
    public static final w f177f = new w(4);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f178a;

    public /* synthetic */ w(int i) {
        this.f178a = i;
    }

    @Override // T1.h
    public void a(Exception exc) {
    }

    @Override // T1.e
    public Object apply(Object obj) {
        switch (this.f178a) {
            case 13:
                return DataTransportCrashlyticsReportSender.a((CrashlyticsReport) obj);
            default:
                return ((MessagingClientEventExtension) obj).toByteArray();
        }
    }

    @Override // com.google.firebase.platforminfo.LibraryVersionComponent.VersionExtractor
    public String extract(Object obj) {
        Context context = (Context) obj;
        switch (this.f178a) {
            case 9:
                return FirebaseCommonRegistrar.c(context);
            case 10:
                return FirebaseCommonRegistrar.b(context);
            case 11:
                return FirebaseCommonRegistrar.d(context);
            default:
                return FirebaseCommonRegistrar.a(context);
        }
    }

    @Override // O.InterfaceC0080v
    public D0 g(View view, D0 windowInsets) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(windowInsets, "windowInsets");
        G.c f2 = windowInsets.f1207a.f(7);
        Intrinsics.checkNotNullExpressionValue(f2, "getInsets(...)");
        view.setPadding(view.getPaddingLeft(), f2.f559b, view.getPaddingRight(), f2.f561d);
        return D0.f1206b;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        Task lambda$setDefaultsWithStringsMapAsync$7;
        Task lambda$fetch$4;
        Task lambda$fetch$3;
        switch (this.f178a) {
            case 17:
                lambda$setDefaultsWithStringsMapAsync$7 = FirebaseRemoteConfig.lambda$setDefaultsWithStringsMapAsync$7((ConfigContainer) obj);
                return lambda$setDefaultsWithStringsMapAsync$7;
            case 18:
                lambda$fetch$4 = FirebaseRemoteConfig.lambda$fetch$4((ConfigFetchHandler.FetchResponse) obj);
                return lambda$fetch$4;
            default:
                lambda$fetch$3 = FirebaseRemoteConfig.lambda$fetch$3((ConfigFetchHandler.FetchResponse) obj);
                return lambda$fetch$3;
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        switch (this.f178a) {
            case 14:
                return FcmBroadcastProcessor.d(task);
            default:
                return FcmBroadcastProcessor.c(task);
        }
    }
}
