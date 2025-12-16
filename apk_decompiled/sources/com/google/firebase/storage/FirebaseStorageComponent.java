package com.google.firebase.storage;

import com.google.firebase.FirebaseApp;
import com.google.firebase.annotations.concurrent.Blocking;
import com.google.firebase.annotations.concurrent.UiThread;
import com.google.firebase.appcheck.interop.InteropAppCheckTokenProvider;
import com.google.firebase.auth.internal.InternalAuthProvider;
import com.google.firebase.inject.Provider;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class FirebaseStorageComponent {
    private final FirebaseApp app;
    private final Provider<InteropAppCheckTokenProvider> appCheckProvider;
    private final Provider<InternalAuthProvider> authProvider;
    private final Map<String, FirebaseStorage> instances = new HashMap();

    public FirebaseStorageComponent(FirebaseApp firebaseApp, Provider<InternalAuthProvider> provider, Provider<InteropAppCheckTokenProvider> provider2, @Blocking Executor executor, @UiThread Executor executor2) {
        this.app = firebaseApp;
        this.authProvider = provider;
        this.appCheckProvider = provider2;
        StorageTaskScheduler.initializeExecutors(executor, executor2);
    }

    public synchronized void clearInstancesForTesting() {
        this.instances.clear();
    }

    public synchronized FirebaseStorage get(String str) {
        FirebaseStorage firebaseStorage;
        firebaseStorage = this.instances.get(str);
        if (firebaseStorage == null) {
            firebaseStorage = new FirebaseStorage(str, this.app, this.authProvider, this.appCheckProvider);
            this.instances.put(str, firebaseStorage);
        }
        return firebaseStorage;
    }
}
