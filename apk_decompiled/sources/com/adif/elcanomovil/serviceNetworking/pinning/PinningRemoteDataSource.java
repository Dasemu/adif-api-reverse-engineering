package com.adif.elcanomovil.serviceNetworking.pinning;

import com.google.firebase.storage.FirebaseStorage;
import d1.InterfaceC0307a;
import d1.d;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import z1.C0669c;

@Singleton
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0082@¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0086@¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/adif/elcanomovil/serviceNetworking/pinning/PinningRemoteDataSource;", "", "Lcom/google/firebase/storage/FirebaseStorage;", "firebaseStorage", "Ld1/a;", "appDispatcher", "<init>", "(Lcom/google/firebase/storage/FirebaseStorage;Ld1/a;)V", "", "fetchJsonWithFirebaseStorage", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "timeout", "Lcom/adif/elcanomovil/serviceNetworking/pinning/PinningPublicKeys;", "getPublicKeys", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/google/firebase/storage/FirebaseStorage;", "Ld1/a;", "Companion", "service-networking_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PinningRemoteDataSource {
    private static final String CIRCULATION_KEY = "estaciones_circulacion_key";
    private static final String ELCANO_KEY = "elcanoweb_avisa_key";
    private static final long MAX_DOWNLOAD_SIZE = 1048576;
    private static final String PUBLIC_KEYS_URL = "https://firebasestorage.googleapis.com/v0/b/elcanopro.appspot.com/o/keys%2Fpublic_Keys_v2.json?alt=media&token=b5d3724d-f648-4574-b93e-85a5d7ef81ff";
    private static final long REQUEST_TIMEOUT = 5000;
    private final InterfaceC0307a appDispatcher;
    private final FirebaseStorage firebaseStorage;

    @Inject
    public PinningRemoteDataSource(FirebaseStorage firebaseStorage, InterfaceC0307a appDispatcher) {
        Intrinsics.checkNotNullParameter(firebaseStorage, "firebaseStorage");
        Intrinsics.checkNotNullParameter(appDispatcher, "appDispatcher");
        this.firebaseStorage = firebaseStorage;
        this.appDispatcher = appDispatcher;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchJsonWithFirebaseStorage(kotlin.coroutines.Continuation<? super java.lang.String> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof z1.C0667a
            if (r0 == 0) goto L13
            r0 = r7
            z1.a r0 = (z1.C0667a) r0
            int r1 = r0.f9006c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9006c = r1
            goto L18
        L13:
            z1.a r0 = new z1.a
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f9004a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f9006c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.ResultKt.throwOnFailure(r7)
            goto L56
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            kotlin.ResultKt.throwOnFailure(r7)
            com.google.firebase.storage.FirebaseStorage r6 = r6.firebaseStorage
            java.lang.String r7 = "https://firebasestorage.googleapis.com/v0/b/elcanopro.appspot.com/o/keys%2Fpublic_Keys_v2.json?alt=media&token=b5d3724d-f648-4574-b93e-85a5d7ef81ff"
            com.google.firebase.storage.StorageReference r6 = r6.getReferenceFromUrl(r7)
            java.lang.String r7 = "getReferenceFromUrl(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)
            r4 = 1048576(0x100000, double:5.180654E-318)
            com.google.android.gms.tasks.Task r6 = r6.getBytes(r4)
            java.lang.String r7 = "getBytes(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)
            r0.f9006c = r3
            java.lang.Object r7 = kotlinx.coroutines.tasks.TasksKt.await(r6, r0)
            if (r7 != r1) goto L56
            return r1
        L56:
            byte[] r7 = (byte[]) r7
            java.lang.String r6 = new java.lang.String
            kotlin.jvm.internal.Intrinsics.checkNotNull(r7)
            java.nio.charset.Charset r0 = kotlin.text.Charsets.UTF_8
            r6.<init>(r7, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.serviceNetworking.pinning.PinningRemoteDataSource.fetchJsonWithFirebaseStorage(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ Object getPublicKeys$default(PinningRemoteDataSource pinningRemoteDataSource, long j4, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            j4 = REQUEST_TIMEOUT;
        }
        return pinningRemoteDataSource.getPublicKeys(j4, continuation);
    }

    public final Object getPublicKeys(long j4, Continuation<? super PinningPublicKeys> continuation) {
        ((d) this.appDispatcher).getClass();
        return BuildersKt.withContext(Dispatchers.getIO(), new C0669c(j4, this, null), continuation);
    }
}
