package com.adif.elcanomovil.domain.usecases.circulation;

import com.adif.elcanomovil.commonNavGraph.arguments.NavArguments;
import com.adif.elcanomovil.domain.entities.CirculationType;
import com.adif.elcanomovil.domain.entities.TrainType;
import com.adif.elcanomovil.domain.entities.circulation.Circulation;
import com.adif.elcanomovil.domain.entities.circulation.DateHeaderCirculation;
import com.adif.elcanomovil.domain.entities.circulation.TrainCirculation;
import com.adif.elcanomovil.domain.entities.circulation.mappers.AvldmdCirculationMapper;
import com.adif.elcanomovil.domain.entities.circulation.mappers.CercaniasCirculationMapper;
import com.adif.elcanomovil.domain.entities.circulation.mappers.OthersCirculationMapper;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010JV\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020#H\u0086B¢\u0006\u0002\u0010%J2\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\f\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\u00122\u0006\u0010)\u001a\u00020#2\u0006\u0010\u001e\u001a\u00020\u001fH\u0082@¢\u0006\u0002\u0010*R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012*\b\u0012\u0004\u0012\u00020\u00140\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006+"}, d2 = {"Lcom/adif/elcanomovil/domain/usecases/circulation/GetDepartureCirculationsUseCase;", "", "getStationArrivalsUseCase", "Lcom/adif/elcanomovil/domain/usecases/circulation/GetStationArrivalsUseCase;", "getStationDeparturesUseCase", "Lcom/adif/elcanomovil/domain/usecases/circulation/GetStationDeparturesUseCase;", "getBetweenStationsUseCase", "Lcom/adif/elcanomovil/domain/usecases/circulation/GetBetweenStationsUseCase;", "cercaniasCirculationMapper", "Lcom/adif/elcanomovil/domain/entities/circulation/mappers/CercaniasCirculationMapper;", "avldmdCirculationMapper", "Lcom/adif/elcanomovil/domain/entities/circulation/mappers/AvldmdCirculationMapper;", "othersCirculationMapper", "Lcom/adif/elcanomovil/domain/entities/circulation/mappers/OthersCirculationMapper;", "formatter", "Ljava/text/DateFormat;", "(Lcom/adif/elcanomovil/domain/usecases/circulation/GetStationArrivalsUseCase;Lcom/adif/elcanomovil/domain/usecases/circulation/GetStationDeparturesUseCase;Lcom/adif/elcanomovil/domain/usecases/circulation/GetBetweenStationsUseCase;Lcom/adif/elcanomovil/domain/entities/circulation/mappers/CercaniasCirculationMapper;Lcom/adif/elcanomovil/domain/entities/circulation/mappers/AvldmdCirculationMapper;Lcom/adif/elcanomovil/domain/entities/circulation/mappers/OthersCirculationMapper;Ljava/text/DateFormat;)V", "grouped", "", "Lcom/adif/elcanomovil/domain/entities/circulation/Circulation;", "Lcom/adif/elcanomovil/domain/entities/circulation/TrainCirculation;", "getGrouped", "(Ljava/util/List;)Ljava/util/List;", "invoke", "Lcom/adif/elcanomovil/domain/entities/utils/SyncResult;", NavArguments.ARG_DYNAMIC_LINKS_STATION_CODE, "", NavArguments.ARG_DYNAMIC_LINKS_STATION_TO_CODE, "circulationType", "Lcom/adif/elcanomovil/domain/entities/CirculationType;", "isCercanias", "Lcom/adif/elcanomovil/domain/entities/TrainType;", "currentPage", "", "shouldRefreshAllPages", "", "showOnlyCommercialStopType", "(Ljava/lang/String;Ljava/lang/String;Lcom/adif/elcanomovil/domain/entities/CirculationType;Lcom/adif/elcanomovil/domain/entities/TrainType;IZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "mapToCirculation", "circulations", "Lcom/adif/elcanomovil/domain/entities/circulation/CommercialCirculation;", "isDeparture", "(Ljava/util/List;ZLcom/adif/elcanomovil/domain/entities/TrainType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nGetDepartureCirculationsUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GetDepartureCirculationsUseCase.kt\ncom/adif/elcanomovil/domain/usecases/circulation/GetDepartureCirculationsUseCase\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 5 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,125:1\n800#2,11:126\n1549#2:137\n1620#2,3:138\n1603#2,9:141\n1855#2:150\n1856#2:152\n1612#2:153\n819#2:154\n847#2,2:155\n1045#2:157\n1477#2:158\n1502#2,3:159\n1505#2,3:169\n1789#2,3:176\n1#3:151\n372#4,7:162\n125#5:172\n152#5,3:173\n*S KotlinDebug\n*F\n+ 1 GetDepartureCirculationsUseCase.kt\ncom/adif/elcanomovil/domain/usecases/circulation/GetDepartureCirculationsUseCase\n*L\n68#1:126,11\n74#1:137\n74#1:138,3\n83#1:141,9\n83#1:150\n83#1:152\n83#1:153\n85#1:154\n85#1:155,2\n121#1:157\n121#1:158\n121#1:159,3\n121#1:169,3\n123#1:176,3\n83#1:151\n121#1:162,7\n122#1:172\n122#1:173,3\n*E\n"})
/* loaded from: classes.dex */
public final class GetDepartureCirculationsUseCase {
    private final AvldmdCirculationMapper avldmdCirculationMapper;
    private final CercaniasCirculationMapper cercaniasCirculationMapper;
    private final DateFormat formatter;
    private final GetBetweenStationsUseCase getBetweenStationsUseCase;
    private final GetStationArrivalsUseCase getStationArrivalsUseCase;
    private final GetStationDeparturesUseCase getStationDeparturesUseCase;
    private final OthersCirculationMapper othersCirculationMapper;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CirculationType.values().length];
            try {
                iArr[CirculationType.DEPARTURE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CirculationType.ARRIVAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CirculationType.BETWEEN_STATIONS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[TrainType.values().length];
            try {
                iArr2[TrainType.CERCANIAS.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[TrainType.AVELDMD.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[TrainType.CORPORATE_OTHERS.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public GetDepartureCirculationsUseCase(GetStationArrivalsUseCase getStationArrivalsUseCase, GetStationDeparturesUseCase getStationDeparturesUseCase, GetBetweenStationsUseCase getBetweenStationsUseCase, CercaniasCirculationMapper cercaniasCirculationMapper, AvldmdCirculationMapper avldmdCirculationMapper, OthersCirculationMapper othersCirculationMapper, DateFormat formatter) {
        Intrinsics.checkNotNullParameter(getStationArrivalsUseCase, "getStationArrivalsUseCase");
        Intrinsics.checkNotNullParameter(getStationDeparturesUseCase, "getStationDeparturesUseCase");
        Intrinsics.checkNotNullParameter(getBetweenStationsUseCase, "getBetweenStationsUseCase");
        Intrinsics.checkNotNullParameter(cercaniasCirculationMapper, "cercaniasCirculationMapper");
        Intrinsics.checkNotNullParameter(avldmdCirculationMapper, "avldmdCirculationMapper");
        Intrinsics.checkNotNullParameter(othersCirculationMapper, "othersCirculationMapper");
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        this.getStationArrivalsUseCase = getStationArrivalsUseCase;
        this.getStationDeparturesUseCase = getStationDeparturesUseCase;
        this.getBetweenStationsUseCase = getBetweenStationsUseCase;
        this.cercaniasCirculationMapper = cercaniasCirculationMapper;
        this.avldmdCirculationMapper = avldmdCirculationMapper;
        this.othersCirculationMapper = othersCirculationMapper;
        this.formatter = formatter;
    }

    private final List<Circulation> getGrouped(List<? extends TrainCirculation> list) {
        List sortedWith = CollectionsKt.sortedWith(list, new Comparator() { // from class: com.adif.elcanomovil.domain.usecases.circulation.GetDepartureCirculationsUseCase$special$$inlined$sortedBy$1
            @Override // java.util.Comparator
            public final int compare(T t2, T t4) {
                return ComparisonsKt.compareValues(((TrainCirculation) t2).getDate(), ((TrainCirculation) t4).getDate());
            }
        });
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : sortedWith) {
            String format = this.formatter.format(((TrainCirculation) obj).getDate());
            Object obj2 = linkedHashMap.get(format);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(format, obj2);
            }
            ((List) obj2).add(obj);
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            Intrinsics.checkNotNullExpressionValue(key, "<get-key>(...)");
            arrayList.add(CollectionsKt.plus((Collection) CollectionsKt.listOf(new DateHeaderCirculation((String) key, false, 2, null)), (Iterable) entry.getValue()));
        }
        List<Circulation> emptyList = CollectionsKt.emptyList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            emptyList = CollectionsKt.plus((Collection) emptyList, (Iterable) it.next());
        }
        return emptyList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mapToCirculation(java.util.List<? extends com.adif.elcanomovil.domain.entities.circulation.CommercialCirculation> r5, boolean r6, com.adif.elcanomovil.domain.entities.TrainType r7, kotlin.coroutines.Continuation<? super java.util.List<? extends com.adif.elcanomovil.domain.entities.circulation.Circulation>> r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof k1.e
            if (r0 == 0) goto L13
            r0 = r8
            k1.e r0 = (k1.e) r0
            int r1 = r0.f7045d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7045d = r1
            goto L18
        L13:
            k1.e r0 = new k1.e
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.f7043b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f7045d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            com.adif.elcanomovil.domain.usecases.circulation.GetDepartureCirculationsUseCase r4 = r0.f7042a
            kotlin.ResultKt.throwOnFailure(r8)
            goto L6f
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            kotlin.ResultKt.throwOnFailure(r8)
            int[] r8 = com.adif.elcanomovil.domain.usecases.circulation.GetDepartureCirculationsUseCase.WhenMappings.$EnumSwitchMapping$1
            int r7 = r7.ordinal()
            r7 = r8[r7]
            if (r7 == r3) goto L62
            r8 = 2
            if (r7 == r8) goto L57
            r8 = 3
            if (r7 != r8) goto L51
            com.adif.elcanomovil.domain.entities.circulation.mappers.OthersCirculationMapper r7 = r4.othersCirculationMapper
            java.util.List r5 = r7.map(r5, r6)
            java.util.List r4 = r4.getGrouped(r5)
            return r4
        L51:
            kotlin.NoWhenBranchMatchedException r4 = new kotlin.NoWhenBranchMatchedException
            r4.<init>()
            throw r4
        L57:
            com.adif.elcanomovil.domain.entities.circulation.mappers.AvldmdCirculationMapper r7 = r4.avldmdCirculationMapper
            java.util.List r5 = r7.map(r5, r6)
            java.util.List r4 = r4.getGrouped(r5)
            return r4
        L62:
            com.adif.elcanomovil.domain.entities.circulation.mappers.CercaniasCirculationMapper r7 = r4.cercaniasCirculationMapper
            r0.f7042a = r4
            r0.f7045d = r3
            java.lang.Object r8 = r7.map(r5, r6, r0)
            if (r8 != r1) goto L6f
            return r1
        L6f:
            java.util.List r8 = (java.util.List) r8
            java.util.List r4 = r4.getGrouped(r8)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.domain.usecases.circulation.GetDepartureCirculationsUseCase.mapToCirculation(java.util.List, boolean, com.adif.elcanomovil.domain.entities.TrainType, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00cb  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0267 -> B:13:0x0269). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x0134 -> B:40:0x013d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.String r19, java.lang.String r20, com.adif.elcanomovil.domain.entities.CirculationType r21, com.adif.elcanomovil.domain.entities.TrainType r22, int r23, boolean r24, boolean r25, kotlin.coroutines.Continuation<? super com.adif.elcanomovil.domain.entities.utils.SyncResult<? extends java.util.List<? extends com.adif.elcanomovil.domain.entities.circulation.Circulation>>> r26) {
        /*
            Method dump skipped, instructions count: 738
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.domain.usecases.circulation.GetDepartureCirculationsUseCase.invoke(java.lang.String, java.lang.String, com.adif.elcanomovil.domain.entities.CirculationType, com.adif.elcanomovil.domain.entities.TrainType, int, boolean, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
