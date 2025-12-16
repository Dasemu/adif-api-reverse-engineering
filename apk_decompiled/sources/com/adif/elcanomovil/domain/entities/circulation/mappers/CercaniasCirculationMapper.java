package com.adif.elcanomovil.domain.entities.circulation.mappers;

import com.adif.elcanomovil.domain.entities.circulation.CercaniasCirculation;
import com.adif.elcanomovil.domain.entities.circulation.CommercialCirculation;
import com.adif.elcanomovil.domain.entities.circulation.CommercialPathStepSideInfo;
import com.adif.elcanomovil.domain.entities.circulation.CommercialRouteInfo;
import com.adif.elcanomovil.domain.repositories.linecolours.LineColoursRepository;
import com.google.firebase.messaging.Constants;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\"\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bH\u0082@¢\u0006\u0002\u0010\fJ*\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000e0\b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0082@¢\u0006\u0002\u0010\u0011J*\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0086@¢\u0006\u0002\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\t*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0082@¢\u0006\u0002\u0010\u0016J\u0012\u0010\u0015\u001a\u00020\t*\u00020\u000bH\u0082@¢\u0006\u0002\u0010\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/adif/elcanomovil/domain/entities/circulation/mappers/CercaniasCirculationMapper;", "", "formatter", "Ljava/text/DateFormat;", "lineColoursRepository", "Lcom/adif/elcanomovil/domain/repositories/linecolours/LineColoursRepository;", "(Ljava/text/DateFormat;Lcom/adif/elcanomovil/domain/repositories/linecolours/LineColoursRepository;)V", "makeJourneyCirculations", "", "Lcom/adif/elcanomovil/domain/entities/circulation/CercaniasCirculation;", "list", "Lcom/adif/elcanomovil/domain/entities/circulation/CommercialRouteInfo;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "makeOneWayCirculations", "Lcom/adif/elcanomovil/domain/entities/circulation/CommercialPathStepSideInfo;", "isDeparture", "", "(Ljava/util/List;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "map", Constants.MessagePayloadKeys.FROM, "Lcom/adif/elcanomovil/domain/entities/circulation/CommercialCirculation;", "mapToCirculation", "(Lcom/adif/elcanomovil/domain/entities/circulation/CommercialPathStepSideInfo;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lcom/adif/elcanomovil/domain/entities/circulation/CommercialRouteInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCercaniasCirculationMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CercaniasCirculationMapper.kt\ncom/adif/elcanomovil/domain/entities/circulation/mappers/CercaniasCirculationMapper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,234:1\n800#2,11:235\n800#2,11:246\n766#2:257\n857#2,2:258\n1045#2:260\n1549#2:261\n1620#2,3:262\n766#2:265\n857#2,2:266\n1549#2:268\n1620#2,3:269\n*S KotlinDebug\n*F\n+ 1 CercaniasCirculationMapper.kt\ncom/adif/elcanomovil/domain/entities/circulation/mappers/CercaniasCirculationMapper\n*L\n25#1:235,11\n31#1:246,11\n45#1:257\n45#1:258,2\n61#1:260\n62#1:261\n62#1:262,3\n71#1:265\n71#1:266,2\n82#1:268\n82#1:269,3\n*E\n"})
/* loaded from: classes.dex */
public final class CercaniasCirculationMapper {
    private final DateFormat formatter;
    private final LineColoursRepository lineColoursRepository;

    public CercaniasCirculationMapper(DateFormat formatter, LineColoursRepository lineColoursRepository) {
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        Intrinsics.checkNotNullParameter(lineColoursRepository, "lineColoursRepository");
        this.formatter = formatter;
        this.lineColoursRepository = lineColoursRepository;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x00d2 -> B:10:0x00d6). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object makeJourneyCirculations(java.util.List<com.adif.elcanomovil.domain.entities.circulation.CommercialRouteInfo> r10, kotlin.coroutines.Continuation<? super java.util.List<com.adif.elcanomovil.domain.entities.circulation.CercaniasCirculation>> r11) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.domain.entities.circulation.mappers.CercaniasCirculationMapper.makeJourneyCirculations(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x00f1 -> B:10:0x00f5). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object makeOneWayCirculations(java.util.List<com.adif.elcanomovil.domain.entities.circulation.CommercialPathStepSideInfo> r11, final boolean r12, kotlin.coroutines.Continuation<? super java.util.List<com.adif.elcanomovil.domain.entities.circulation.CercaniasCirculation>> r13) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.domain.entities.circulation.mappers.CercaniasCirculationMapper.makeOneWayCirculations(java.util.List, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mapToCirculation(com.adif.elcanomovil.domain.entities.circulation.CommercialPathStepSideInfo r38, boolean r39, kotlin.coroutines.Continuation<? super com.adif.elcanomovil.domain.entities.circulation.CercaniasCirculation> r40) {
        /*
            Method dump skipped, instructions count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.domain.entities.circulation.mappers.CercaniasCirculationMapper.mapToCirculation(com.adif.elcanomovil.domain.entities.circulation.CommercialPathStepSideInfo, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object map(List<? extends CommercialCirculation> list, boolean z3, Continuation<? super List<CercaniasCirculation>> continuation) {
        List<? extends CommercialCirculation> list2 = list;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            if (obj instanceof CommercialPathStepSideInfo) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            return makeOneWayCirculations(arrayList, z3, continuation);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list2) {
            if (obj2 instanceof CommercialRouteInfo) {
                arrayList2.add(obj2);
            }
        }
        return !arrayList2.isEmpty() ? makeJourneyCirculations(arrayList2, continuation) : CollectionsKt.emptyList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mapToCirculation(com.adif.elcanomovil.domain.entities.circulation.CommercialRouteInfo r30, kotlin.coroutines.Continuation<? super com.adif.elcanomovil.domain.entities.circulation.CercaniasCirculation> r31) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.domain.entities.circulation.mappers.CercaniasCirculationMapper.mapToCirculation(com.adif.elcanomovil.domain.entities.circulation.CommercialRouteInfo, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
