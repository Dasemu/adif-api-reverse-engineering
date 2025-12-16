package com.adif.commonHelpers.di;

import d1.InterfaceC0307a;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import javax.inject.Singleton;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/adif/commonHelpers/di/CommonHelpersModule;", "", "<init>", "()V", "Ld1/a;", "provideAppDispatcher", "()Ld1/a;", "common-helpers_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Module
@InstallIn({SingletonComponent.class})
/* loaded from: classes.dex */
public final class CommonHelpersModule {
    public static final CommonHelpersModule INSTANCE = new CommonHelpersModule();

    private CommonHelpersModule() {
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, d1.a] */
    @Provides
    @Singleton
    public final InterfaceC0307a provideAppDispatcher() {
        return new Object();
    }
}
