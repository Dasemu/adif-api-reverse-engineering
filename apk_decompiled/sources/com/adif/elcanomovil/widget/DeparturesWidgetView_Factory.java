package com.adif.elcanomovil.widget;

import android.content.Context;
import com.adif.elcanomovil.commonNavGraph.navigation.NavigationIntents;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata({"dagger.hilt.android.qualifiers.ApplicationContext"})
/* loaded from: classes3.dex */
public final class DeparturesWidgetView_Factory implements Factory<DeparturesWidgetView> {
    private final Provider<Context> contextProvider;
    private final Provider<NavigationIntents> navigationIntentsProvider;

    public DeparturesWidgetView_Factory(Provider<Context> provider, Provider<NavigationIntents> provider2) {
        this.contextProvider = provider;
        this.navigationIntentsProvider = provider2;
    }

    public static DeparturesWidgetView_Factory create(Provider<Context> provider, Provider<NavigationIntents> provider2) {
        return new DeparturesWidgetView_Factory(provider, provider2);
    }

    public static DeparturesWidgetView newInstance(Context context, NavigationIntents navigationIntents) {
        return new DeparturesWidgetView(context, navigationIntents);
    }

    @Override // javax.inject.Provider
    public DeparturesWidgetView get() {
        return newInstance(this.contextProvider.get(), this.navigationIntentsProvider.get());
    }
}
