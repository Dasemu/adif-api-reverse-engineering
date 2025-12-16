package com.adif.elcanomovil.di;

import com.adif.elcanomovil.widget.WidgetPayloadHandler;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import g1.e;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class ApplicationModule_Companion_ProvideWidgetPayloadHandlerFactory implements Factory<WidgetPayloadHandler> {
    public static ApplicationModule_Companion_ProvideWidgetPayloadHandlerFactory create() {
        return e.f6740a;
    }

    public static WidgetPayloadHandler provideWidgetPayloadHandler() {
        return (WidgetPayloadHandler) Preconditions.checkNotNullFromProvides(ApplicationModule.INSTANCE.provideWidgetPayloadHandler());
    }

    @Override // javax.inject.Provider
    public WidgetPayloadHandler get() {
        return provideWidgetPayloadHandler();
    }
}
