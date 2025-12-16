package com.adif.elcanomovil.serviceNetworking.di;

import com.google.firebase.storage.FirebaseStorage;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import y1.AbstractC0660a;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class FirebaseStorageModule_ProvideFirebaseStorageFactory implements Factory<FirebaseStorage> {
    public static FirebaseStorageModule_ProvideFirebaseStorageFactory create() {
        return AbstractC0660a.f8979a;
    }

    public static FirebaseStorage provideFirebaseStorage() {
        return (FirebaseStorage) Preconditions.checkNotNullFromProvides(FirebaseStorageModule.INSTANCE.provideFirebaseStorage());
    }

    @Override // javax.inject.Provider
    public FirebaseStorage get() {
        return provideFirebaseStorage();
    }
}
