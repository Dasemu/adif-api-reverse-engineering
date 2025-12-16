package M2;

import com.google.firebase.abt.component.AbtRegistrar;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.datatransport.TransportRegistrar;
import com.google.firebase.dynamiclinks.internal.FirebaseDynamicLinkRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import com.google.firebase.platforminfo.DefaultUserAgentPublisher;
import com.google.firebase.platforminfo.UserAgentPublisher;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements ComponentFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1118a;

    public /* synthetic */ a(int i) {
        this.f1118a = i;
    }

    @Override // com.google.firebase.components.ComponentFactory
    public final Object create(ComponentContainer componentContainer) {
        ScheduledExecutorService lambda$getComponents$4;
        ScheduledExecutorService lambda$getComponents$5;
        ScheduledExecutorService lambda$getComponents$6;
        Executor lambda$getComponents$7;
        UserAgentPublisher lambda$component$0;
        switch (this.f1118a) {
            case 0:
                return AbtRegistrar.a(componentContainer);
            case 1:
                return TransportRegistrar.a(componentContainer);
            case 2:
                lambda$getComponents$4 = ExecutorsRegistrar.lambda$getComponents$4(componentContainer);
                return lambda$getComponents$4;
            case 3:
                lambda$getComponents$5 = ExecutorsRegistrar.lambda$getComponents$5(componentContainer);
                return lambda$getComponents$5;
            case 4:
                lambda$getComponents$6 = ExecutorsRegistrar.lambda$getComponents$6(componentContainer);
                return lambda$getComponents$6;
            case 5:
                lambda$getComponents$7 = ExecutorsRegistrar.lambda$getComponents$7(componentContainer);
                return lambda$getComponents$7;
            case 6:
                return FirebaseDynamicLinkRegistrar.a(componentContainer);
            case 7:
                return FirebaseInstallationsRegistrar.a(componentContainer);
            case 8:
                return FirebaseMessagingRegistrar.a(componentContainer);
            default:
                lambda$component$0 = DefaultUserAgentPublisher.lambda$component$0(componentContainer);
                return lambda$component$0;
        }
    }
}
