package com.adif.elcanomovil.repositories.compositions;

import com.adif.elcanomovil.domain.entities.compositions.Cafeteria;
import com.adif.elcanomovil.domain.entities.compositions.Coach;
import com.adif.elcanomovil.domain.entities.compositions.Composition;
import com.adif.elcanomovil.domain.entities.compositions.Head;
import com.adif.elcanomovil.domain.entities.compositions.Tail;
import com.adif.elcanomovil.domain.entities.compositions.Wagon;
import com.adif.elcanomovil.serviceNetworking.compositions.CoachType;
import com.adif.elcanomovil.serviceNetworking.compositions.Coaches;
import com.adif.elcanomovil.serviceNetworking.compositions.CompositionResponse;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u000b¨\u0006\f"}, d2 = {"Lcom/adif/elcanomovil/repositories/compositions/CompositionsMapper;", "", "()V", "getWagons", "", "Lcom/adif/elcanomovil/domain/entities/compositions/Wagon;", "coaches", "Lcom/adif/elcanomovil/serviceNetworking/compositions/Coaches;", "responseToDomain", "Lcom/adif/elcanomovil/domain/entities/compositions/Composition;", "source", "Lcom/adif/elcanomovil/serviceNetworking/compositions/CompositionResponse;", "repositories_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCompositionsMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompositionsMapper.kt\ncom/adif/elcanomovil/repositories/compositions/CompositionsMapper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,72:1\n1045#2:73\n1855#2,2:74\n1045#2:76\n1549#2:77\n1620#2,3:78\n*S KotlinDebug\n*F\n+ 1 CompositionsMapper.kt\ncom/adif/elcanomovil/repositories/compositions/CompositionsMapper\n*L\n13#1:73\n15#1:74,2\n39#1:76\n39#1:77\n39#1:78,3\n*E\n"})
/* loaded from: classes.dex */
public final class CompositionsMapper {
    public final List<Wagon> getWagons(List<Coaches> coaches) {
        Wagon wagon;
        Wagon wagon2;
        Intrinsics.checkNotNullParameter(coaches, "coaches");
        List<Coaches> sortedWith = CollectionsKt.sortedWith(coaches.size() > 1 ? CollectionsKt.h(coaches) : coaches, new Comparator() { // from class: com.adif.elcanomovil.repositories.compositions.CompositionsMapper$getWagons$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t2, T t4) {
                return ComparisonsKt.compareValues(Integer.valueOf(((Coaches) t2).getSequential()), Integer.valueOf(((Coaches) t4).getSequential()));
            }
        });
        ArrayList arrayList = new ArrayList(CollectionsKt.g(sortedWith));
        int i = 0;
        for (Coaches coaches2 : sortedWith) {
            if (coaches2.getCafeteria()) {
                wagon2 = new Cafeteria();
            } else {
                if (coaches2.getSequential() != 1) {
                    CoachType coachType = coaches2.getCoachType();
                    CoachType coachType2 = CoachType.TRACTOR;
                    if (coachType != coachType2 || i % 2 != 0) {
                        if (coaches2.getCoachType() == coachType2 && i % 2 == 1) {
                            i++;
                            wagon = new Tail(coaches2.getCoachNumber());
                        } else {
                            String coachNumber = coaches2.getCoachNumber();
                            Intrinsics.checkNotNull(coachNumber);
                            wagon = new Coach(coachNumber);
                        }
                        wagon2 = wagon;
                    }
                }
                i++;
                wagon = new Head(coaches2.getCoachNumber());
                wagon2 = wagon;
            }
            arrayList.add(wagon2);
        }
        List mutableList = CollectionsKt.toMutableList((Collection) arrayList);
        if (coaches.size() > 1) {
            mutableList.add(new Tail(((Coaches) CollectionsKt.last((List) coaches)).getCoachNumber()));
            int size = mutableList.size() - 1;
            for (int i4 = 0; i4 < size; i4++) {
                if (i4 == 0 && (mutableList.get(i4) instanceof Head)) {
                    int i5 = i4 + 1;
                    if (mutableList.get(i5) instanceof Tail) {
                        mutableList.remove(i5);
                        mutableList.add(i5, new Coach(""));
                    }
                }
                if ((mutableList.get(i4) instanceof Head) && (mutableList.get(i4 + 1) instanceof Tail)) {
                    mutableList.remove(i4);
                    mutableList.add(i4, new Coach(""));
                }
            }
        }
        return CollectionsKt.toList(mutableList);
    }

    public final List<Composition> responseToDomain(CompositionResponse source) {
        List<com.adif.elcanomovil.serviceNetworking.compositions.Composition> sortedWith;
        if (source == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        List<com.adif.elcanomovil.serviceNetworking.compositions.Composition> compositions = source.getCompositions();
        if (compositions != null && (sortedWith = CollectionsKt.sortedWith(compositions, new Comparator() { // from class: com.adif.elcanomovil.repositories.compositions.CompositionsMapper$responseToDomain$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t2, T t4) {
                return ComparisonsKt.compareValues(Long.valueOf(((com.adif.elcanomovil.serviceNetworking.compositions.Composition) t2).getPlannedTime()), Long.valueOf(((com.adif.elcanomovil.serviceNetworking.compositions.Composition) t4).getPlannedTime()));
            }
        })) != null) {
            for (com.adif.elcanomovil.serviceNetworking.compositions.Composition composition : sortedWith) {
                arrayList.add(new Composition(composition.getStationCode(), composition.getPlannedTime(), getWagons(composition.getCoaches())));
            }
        }
        for (int size = arrayList.size() - 1; size > 0; size--) {
            if (((Composition) arrayList.get(size)).getCoachs().equals(((Composition) arrayList.get(size - 1)).getCoachs())) {
                arrayList.remove(size);
            }
        }
        return arrayList;
    }
}
