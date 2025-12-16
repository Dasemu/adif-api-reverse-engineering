package com.adif.elcanomovil.domain.usecases.recentSearch;

import com.adif.elcanomovil.domain.repositories.searches.SearchesRepository;
import com.adif.elcanomovil.domain.usecases.stations.GetStationByIdUseCase;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0086B¢\u0006\u0002\u0010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/adif/elcanomovil/domain/usecases/recentSearch/GetRecentSearchesUseCase;", "", "searchesRepository", "Lcom/adif/elcanomovil/domain/repositories/searches/SearchesRepository;", "getStationByIdUseCase", "Lcom/adif/elcanomovil/domain/usecases/stations/GetStationByIdUseCase;", "(Lcom/adif/elcanomovil/domain/repositories/searches/SearchesRepository;Lcom/adif/elcanomovil/domain/usecases/stations/GetStationByIdUseCase;)V", "invoke", "", "Lcom/adif/elcanomovil/domain/entities/station/Station;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nGetRecentSearchesUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GetRecentSearchesUseCase.kt\ncom/adif/elcanomovil/domain/usecases/recentSearch/GetRecentSearchesUseCase\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,21:1\n1603#2,9:22\n1855#2:31\n1856#2:33\n1612#2:34\n1#3:32\n*S KotlinDebug\n*F\n+ 1 GetRecentSearchesUseCase.kt\ncom/adif/elcanomovil/domain/usecases/recentSearch/GetRecentSearchesUseCase\n*L\n13#1:22,9\n13#1:31\n13#1:33\n13#1:34\n13#1:32\n*E\n"})
/* loaded from: classes.dex */
public final class GetRecentSearchesUseCase {
    private final GetStationByIdUseCase getStationByIdUseCase;
    private final SearchesRepository searchesRepository;

    public GetRecentSearchesUseCase(SearchesRepository searchesRepository, GetStationByIdUseCase getStationByIdUseCase) {
        Intrinsics.checkNotNullParameter(searchesRepository, "searchesRepository");
        Intrinsics.checkNotNullParameter(getStationByIdUseCase, "getStationByIdUseCase");
        this.searchesRepository = searchesRepository;
        this.getStationByIdUseCase = getStationByIdUseCase;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0086, code lost:
    
        if (r8 == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0088, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004f, code lost:
    
        if (r8 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0086 -> B:11:0x0089). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x008c -> B:12:0x008d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(kotlin.coroutines.Continuation<? super java.util.List<com.adif.elcanomovil.domain.entities.station.Station>> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof n1.a
            if (r0 == 0) goto L13
            r0 = r8
            n1.a r0 = (n1.a) r0
            int r1 = r0.f7848f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7848f = r1
            goto L18
        L13:
            n1.a r0 = new n1.a
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f7846d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f7848f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.util.Iterator r7 = r0.f7845c
            java.util.Collection r2 = r0.f7844b
            java.util.Collection r2 = (java.util.Collection) r2
            com.adif.elcanomovil.domain.usecases.recentSearch.GetRecentSearchesUseCase r4 = r0.f7843a
            kotlin.ResultKt.throwOnFailure(r8)
            goto L89
        L34:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3c:
            com.adif.elcanomovil.domain.usecases.recentSearch.GetRecentSearchesUseCase r7 = r0.f7843a
            kotlin.ResultKt.throwOnFailure(r8)
            goto L52
        L42:
            kotlin.ResultKt.throwOnFailure(r8)
            com.adif.elcanomovil.domain.repositories.searches.SearchesRepository r8 = r7.searchesRepository
            r0.f7843a = r7
            r0.f7848f = r4
            java.lang.Object r8 = r8.fetchStations(r0)
            if (r8 != r1) goto L52
            goto L88
        L52:
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r8 = r8.iterator()
            r4 = r7
            r7 = r8
        L5f:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L93
            java.lang.Object r8 = r7.next()
            com.adif.elcanomovil.domain.entities.StorableData r8 = (com.adif.elcanomovil.domain.entities.StorableData) r8
            boolean r5 = r8 instanceof com.adif.elcanomovil.domain.entities.StorableStation
            if (r5 == 0) goto L8c
            com.adif.elcanomovil.domain.usecases.stations.GetStationByIdUseCase r5 = r4.getStationByIdUseCase
            com.adif.elcanomovil.domain.entities.StorableStation r8 = (com.adif.elcanomovil.domain.entities.StorableStation) r8
            java.lang.String r8 = r8.getStationCode()
            r0.f7843a = r4
            r6 = r2
            java.util.Collection r6 = (java.util.Collection) r6
            r0.f7844b = r6
            r0.f7845c = r7
            r0.f7848f = r3
            java.lang.Object r8 = r5.invoke(r8, r0)
            if (r8 != r1) goto L89
        L88:
            return r1
        L89:
            com.adif.elcanomovil.domain.entities.station.Station r8 = (com.adif.elcanomovil.domain.entities.station.Station) r8
            goto L8d
        L8c:
            r8 = 0
        L8d:
            if (r8 == 0) goto L5f
            r2.add(r8)
            goto L5f
        L93:
            java.util.List r2 = (java.util.List) r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.domain.usecases.recentSearch.GetRecentSearchesUseCase.invoke(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
