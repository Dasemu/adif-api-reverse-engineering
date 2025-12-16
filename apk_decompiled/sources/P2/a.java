package P2;

import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import com.google.firebase.tracing.ComponentMonitor;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements ComponentFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1347a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f1348b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1349c;

    public /* synthetic */ a(Object obj, int i, String str) {
        this.f1347a = i;
        this.f1348b = str;
        this.f1349c = obj;
    }

    @Override // com.google.firebase.components.ComponentFactory
    public final Object create(ComponentContainer componentContainer) {
        switch (this.f1347a) {
            case 0:
                return ComponentMonitor.a(this.f1348b, (Component) this.f1349c, componentContainer);
            default:
                return LibraryVersionComponent.a(this.f1348b, (LibraryVersionComponent.VersionExtractor) this.f1349c, componentContainer);
        }
    }
}
