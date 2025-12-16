package com.adif.elcanomovil.serviceNetworking.di;

import com.google.firebase.ktx.Firebase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.ktx.StorageKt;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import e3.E;
import e3.F;
import f3.c;
import java.util.concurrent.TimeUnit;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/adif/elcanomovil/serviceNetworking/di/FirebaseStorageModule;", "", "<init>", "()V", "Lcom/google/firebase/storage/FirebaseStorage;", "provideFirebaseStorage", "()Lcom/google/firebase/storage/FirebaseStorage;", "Le3/F;", "providePinningOkHttpClient", "()Le3/F;", "service-networking_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Module
@InstallIn({SingletonComponent.class})
/* loaded from: classes.dex */
public final class FirebaseStorageModule {
    public static final FirebaseStorageModule INSTANCE = new FirebaseStorageModule();

    private FirebaseStorageModule() {
    }

    @Provides
    @Singleton
    public final FirebaseStorage provideFirebaseStorage() {
        return StorageKt.getStorage(Firebase.INSTANCE);
    }

    @Provides
    @Singleton
    @PinningHttpClient
    public final F providePinningOkHttpClient() {
        E e4 = new E();
        TimeUnit unit = TimeUnit.SECONDS;
        Intrinsics.checkNotNullParameter(unit, "unit");
        e4.f6228r = c.b(30L);
        Intrinsics.checkNotNullParameter(unit, "unit");
        e4.f6229s = c.b(30L);
        return new F(e4);
    }
}
