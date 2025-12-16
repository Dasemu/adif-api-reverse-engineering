package com.adif.elcanomovil.uiMoreAdif.di;

import com.adif.elcanomovil.uiMoreAdif.DefaultHelpItemsProvider;
import com.adif.elcanomovil.uiMoreAdif.DefaultOptionsProvider;
import com.adif.elcanomovil.uiMoreAdif.HelpItemsProvider;
import com.adif.elcanomovil.uiMoreAdif.OptionsProvider;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import javax.inject.Singleton;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/adif/elcanomovil/uiMoreAdif/di/MoreAdifModule;", "", "()V", "provideHelpItemsProvider", "Lcom/adif/elcanomovil/uiMoreAdif/HelpItemsProvider;", "provideOptionsProvider", "Lcom/adif/elcanomovil/uiMoreAdif/OptionsProvider;", "ui-more-adif_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Module
@InstallIn({SingletonComponent.class})
/* loaded from: classes2.dex */
public final class MoreAdifModule {
    public static final MoreAdifModule INSTANCE = new MoreAdifModule();

    private MoreAdifModule() {
    }

    @Provides
    @Singleton
    public final HelpItemsProvider provideHelpItemsProvider() {
        return new DefaultHelpItemsProvider();
    }

    @Provides
    @Singleton
    public final OptionsProvider provideOptionsProvider() {
        return new DefaultOptionsProvider();
    }
}
