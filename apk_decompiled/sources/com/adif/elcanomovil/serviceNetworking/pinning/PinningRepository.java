package com.adif.elcanomovil.serviceNetworking.pinning;

import com.adif.elcanomovil.commonNavGraph.arguments.NavArguments;
import com.adif.elcanomovil.serviceStorage.preferences.PreferenceStorage;
import d1.C0309c;
import java.security.MessageDigest;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Singleton
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0086@¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/adif/elcanomovil/serviceNetworking/pinning/PinningRepository;", "", "Lcom/adif/elcanomovil/serviceNetworking/pinning/PinningRemoteDataSource;", "dataSource", "Lcom/adif/elcanomovil/serviceStorage/preferences/PreferenceStorage;", "preference", "Ld1/c;", "dateUtils", "<init>", "(Lcom/adif/elcanomovil/serviceNetworking/pinning/PinningRemoteDataSource;Lcom/adif/elcanomovil/serviceStorage/preferences/PreferenceStorage;Ld1/c;)V", "", "cachedPinsNotValid", "()Z", "", "key", "getSha256Hash", "(Ljava/lang/String;)Ljava/lang/String;", "", "Lcom/adif/elcanomovil/serviceNetworking/pinning/Pin;", "getPins", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/adif/elcanomovil/serviceNetworking/pinning/PinningRemoteDataSource;", "Lcom/adif/elcanomovil/serviceStorage/preferences/PreferenceStorage;", "Ld1/c;", "Companion", "service-networking_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPinningRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PinningRepository.kt\ncom/adif/elcanomovil/serviceNetworking/pinning/PinningRepository\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,67:1\n1549#2:68\n1620#2,3:69\n1549#2:72\n1620#2,3:73\n*S KotlinDebug\n*F\n+ 1 PinningRepository.kt\ncom/adif/elcanomovil/serviceNetworking/pinning/PinningRepository\n*L\n21#1:68\n21#1:69,3\n22#1:72\n22#1:73,3\n*E\n"})
/* loaded from: classes.dex */
public final class PinningRepository {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final long PINS_CACHE_TIMEOUT_SECONDS = 172800;
    private final PinningRemoteDataSource dataSource;
    private final C0309c dateUtils;
    private final PreferenceStorage preference;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/adif/elcanomovil/serviceNetworking/pinning/PinningRepository$Companion;", "", "()V", "PINS_CACHE_TIMEOUT_SECONDS", "", "collectPins", "", "Lcom/adif/elcanomovil/serviceNetworking/pinning/Pin;", "elCanoPinHashes", "", "", "circulationPinHashes", "service-networking_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nPinningRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PinningRepository.kt\ncom/adif/elcanomovil/serviceNetworking/pinning/PinningRepository$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,67:1\n1855#2,2:68\n1855#2,2:70\n*S KotlinDebug\n*F\n+ 1 PinningRepository.kt\ncom/adif/elcanomovil/serviceNetworking/pinning/PinningRepository$Companion\n*L\n50#1:68,2\n54#1:70,2\n*E\n"})
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<Pin> collectPins(List<String> elCanoPinHashes, List<String> circulationPinHashes) {
            ArrayList arrayList = new ArrayList();
            for (String str : elCanoPinHashes) {
                arrayList.add(new Pin("avisa.adif.es", str));
                arrayList.add(new Pin(NavArguments.ARG_DYNAMIC_PACKAGE, str));
            }
            for (String str2 : circulationPinHashes) {
                arrayList.add(new Pin("estaciones.api.adif.es", str2));
                arrayList.add(new Pin("circulacion.api.adif.es", str2));
            }
            return arrayList;
        }

        private Companion() {
        }
    }

    @Inject
    public PinningRepository(PinningRemoteDataSource dataSource, PreferenceStorage preference, C0309c dateUtils) {
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(dateUtils, "dateUtils");
        this.dataSource = dataSource;
        this.preference = preference;
        this.dateUtils = dateUtils;
    }

    private final boolean cachedPinsNotValid() {
        this.dateUtils.getClass();
        Instant now = Instant.now();
        Intrinsics.checkNotNullExpressionValue(now, "now(...)");
        return now.minusSeconds(PINS_CACHE_TIMEOUT_SECONDS).compareTo(this.preference.getLastPinningUpdate()) > 0;
    }

    private final String getSha256Hash(String key) {
        return "sha256/" + Base64.getEncoder().encodeToString(MessageDigest.getInstance("SHA-256").digest(Base64.getDecoder().decode(key)));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getPins(kotlin.coroutines.Continuation<? super java.lang.Iterable<com.adif.elcanomovil.serviceNetworking.pinning.Pin>> r8) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.serviceNetworking.pinning.PinningRepository.getPins(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
