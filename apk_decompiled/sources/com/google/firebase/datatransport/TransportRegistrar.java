package com.google.firebase.datatransport;

import T1.g;
import U1.a;
import W1.t;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import java.util.Arrays;
import java.util.List;

@Keep
/* loaded from: classes3.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    public static /* synthetic */ g a(ComponentContainer componentContainer) {
        return lambda$getComponents$0(componentContainer);
    }

    public static /* synthetic */ g lambda$getComponents$0(ComponentContainer componentContainer) {
        t.b((Context) componentContainer.get(Context.class));
        return t.a().c(a.f1778e);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<Component<?>> getComponents() {
        return Arrays.asList(Component.builder(g.class).name(LIBRARY_NAME).add(Dependency.required((Class<?>) Context.class)).factory(new M2.a(1)).build(), LibraryVersionComponent.create(LIBRARY_NAME, BuildConfig.VERSION_NAME));
    }
}
