package com.adif.elcanomovil.repositories.linecolours;

import Z2.D;
import Z2.G;
import Z2.L;
import android.content.Context;
import com.adif.elcanomovil.domain.entities.LineColor;
import com.adif.elcanomovil.domain.entities.LineColoursForNetwork;
import com.adif.elcanomovil.domain.repositories.linecolours.LineColoursRepository;
import com.adif.elcanomovil.domain.repositories.stations.StationsRepository;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

@Singleton
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0012\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\tH\u0002J\u001e\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/adif/elcanomovil/repositories/linecolours/DefaultLineColoursRepository;", "Lcom/adif/elcanomovil/domain/repositories/linecolours/LineColoursRepository;", "context", "Landroid/content/Context;", "stationsRepository", "Lcom/adif/elcanomovil/domain/repositories/stations/StationsRepository;", "(Landroid/content/Context;Lcom/adif/elcanomovil/domain/repositories/stations/StationsRepository;)V", "lineColoursMap", "", "", "getJsonFromAssets", "fileName", "getLineColorRGB", "lineName", "stationStepCode", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "repositories_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDefaultLineColoursRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultLineColoursRepository.kt\ncom/adif/elcanomovil/repositories/linecolours/DefaultLineColoursRepository\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,60:1\n1179#2,2:61\n1253#2,2:63\n1179#2,2:65\n1253#2,4:67\n1256#2:71\n1#3:72\n*S KotlinDebug\n*F\n+ 1 DefaultLineColoursRepository.kt\ncom/adif/elcanomovil/repositories/linecolours/DefaultLineColoursRepository\n*L\n31#1:61,2\n31#1:63,2\n32#1:65,2\n32#1:67,4\n31#1:71\n*E\n"})
/* loaded from: classes.dex */
public final class DefaultLineColoursRepository implements LineColoursRepository {
    private final Context context;
    private final Map<String, Map<String, String>> lineColoursMap;
    private final StationsRepository stationsRepository;

    @Inject
    public DefaultLineColoursRepository(Context context, StationsRepository stationsRepository) {
        int collectionSizeOrDefault;
        int collectionSizeOrDefault2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(stationsRepository, "stationsRepository");
        this.context = context;
        this.stationsRepository = stationsRepository;
        Object fromJson = new G(new D()).b(L.f(List.class, LineColoursForNetwork.class)).fromJson(getJsonFromAssets$default(this, null, 1, null));
        Intrinsics.checkNotNull(fromJson);
        List<LineColoursForNetwork> list = (List) fromJson;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(collectionSizeOrDefault), 16));
        for (LineColoursForNetwork lineColoursForNetwork : list) {
            String commuterNetwork = lineColoursForNetwork.getCommuterNetwork();
            List<LineColor> lines = lineColoursForNetwork.getLines();
            collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(lines, 10);
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(collectionSizeOrDefault2), 16));
            for (LineColor lineColor : lines) {
                String lowerCase = lineColor.getLine().toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                Pair pair = TuplesKt.to(lowerCase, lineColor.getColourRGB());
                linkedHashMap2.put(pair.getFirst(), pair.getSecond());
            }
            Pair pair2 = TuplesKt.to(commuterNetwork, linkedHashMap2);
            linkedHashMap.put(pair2.getFirst(), pair2.getSecond());
        }
        this.lineColoursMap = linkedHashMap;
    }

    private final String getJsonFromAssets(String fileName) {
        InputStream open = this.context.getAssets().open(fileName);
        Intrinsics.checkNotNullExpressionValue(open, "open(...)");
        byte[] bArr = new byte[open.available()];
        open.read(bArr);
        open.close();
        Charset forName = Charset.forName("UTF-8");
        Intrinsics.checkNotNullExpressionValue(forName, "forName(...)");
        return new String(bArr, forName);
    }

    public static /* synthetic */ String getJsonFromAssets$default(DefaultLineColoursRepository defaultLineColoursRepository, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "line_colours.json";
        }
        return defaultLineColoursRepository.getJsonFromAssets(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0076 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.adif.elcanomovil.domain.repositories.linecolours.LineColoursRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object getLineColorRGB(java.lang.String r5, java.lang.String r6, kotlin.coroutines.Continuation<? super java.lang.String> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof u1.C0633a
            if (r0 == 0) goto L13
            r0 = r7
            u1.a r0 = (u1.C0633a) r0
            int r1 = r0.f8622e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8622e = r1
            goto L18
        L13:
            u1.a r0 = new u1.a
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f8620c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f8622e
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.String r5 = r0.f8619b
            com.adif.elcanomovil.repositories.linecolours.DefaultLineColoursRepository r4 = r0.f8618a
            kotlin.ResultKt.throwOnFailure(r7)
            goto L47
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.ResultKt.throwOnFailure(r7)
            com.adif.elcanomovil.domain.repositories.stations.StationsRepository r7 = r4.stationsRepository
            r0.f8618a = r4
            r0.f8619b = r5
            r0.f8622e = r3
            java.lang.Object r7 = r7.fetchStation(r6, r0)
            if (r7 != r1) goto L47
            return r1
        L47:
            com.adif.elcanomovil.domain.entities.station.Station r7 = (com.adif.elcanomovil.domain.entities.station.Station) r7
            if (r7 == 0) goto L76
            java.lang.String r6 = r7.getCommuterNetwork()
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> r4 = r4.lineColoursMap
            java.lang.Object r4 = r4.get(r6)
            java.util.Map r4 = (java.util.Map) r4
            if (r4 == 0) goto L76
            java.util.Locale r6 = java.util.Locale.ROOT
            java.lang.String r5 = r5.toLowerCase(r6)
            java.lang.String r6 = "toLowerCase(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
            java.lang.Object r4 = r4.get(r5)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L76
            java.lang.String r5 = "#"
            java.lang.String r4 = r5.concat(r4)
            if (r4 != 0) goto L75
            goto L76
        L75:
            return r4
        L76:
            java.lang.String r4 = "#000000"
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.repositories.linecolours.DefaultLineColoursRepository.getLineColorRGB(java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
