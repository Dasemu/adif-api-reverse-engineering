package com.adif.elcanomovil.uiSelectStation.di;

import android.icu.text.Collator;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import java.util.Locale;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"Lcom/adif/elcanomovil/uiSelectStation/di/SelectedStationModule;", "", "()V", "providesCollator", "Landroid/icu/text/Collator;", "ui-select-station_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Module
@InstallIn({SingletonComponent.class})
/* loaded from: classes2.dex */
public final class SelectedStationModule {
    public static final SelectedStationModule INSTANCE = new SelectedStationModule();

    private SelectedStationModule() {
    }

    @Provides
    @Singleton
    public final Collator providesCollator() {
        Collator collator = Collator.getInstance(new Locale("es", "ES"));
        Intrinsics.checkNotNullExpressionValue(collator, "getInstance(...)");
        return collator;
    }
}
