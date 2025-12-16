package com.adif.elcanomovil.uiSelectStation.di;

import K1.a;
import android.icu.text.Collator;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes2.dex */
public final class SelectedStationModule_ProvidesCollatorFactory implements Factory<Collator> {
    public static SelectedStationModule_ProvidesCollatorFactory create() {
        return a.f1015a;
    }

    public static Collator providesCollator() {
        return (Collator) Preconditions.checkNotNullFromProvides(SelectedStationModule.INSTANCE.providesCollator());
    }

    @Override // javax.inject.Provider
    public Collator get() {
        return providesCollator();
    }
}
