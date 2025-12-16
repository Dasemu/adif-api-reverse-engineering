package com.adif.elcanomovil.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import g1.f;
import java.text.DateFormat;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class ApplicationModule_Companion_ProvidesDateFormatFactory implements Factory<DateFormat> {
    public static ApplicationModule_Companion_ProvidesDateFormatFactory create() {
        return f.f6741a;
    }

    public static DateFormat providesDateFormat() {
        return (DateFormat) Preconditions.checkNotNullFromProvides(ApplicationModule.INSTANCE.providesDateFormat());
    }

    @Override // javax.inject.Provider
    public DateFormat get() {
        return providesDateFormat();
    }
}
