package com.adif.elcanomovil.uiDepartures.di;

import E1.a;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import java.text.DateFormat;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata({"javax.inject.Named"})
/* loaded from: classes2.dex */
public final class DepartureModule_DateFormatterFactory implements Factory<DateFormat> {
    public static DepartureModule_DateFormatterFactory create() {
        return a.f379a;
    }

    public static DateFormat dateFormatter() {
        return (DateFormat) Preconditions.checkNotNullFromProvides(DepartureModule.INSTANCE.dateFormatter());
    }

    @Override // javax.inject.Provider
    public DateFormat get() {
        return dateFormatter();
    }
}
