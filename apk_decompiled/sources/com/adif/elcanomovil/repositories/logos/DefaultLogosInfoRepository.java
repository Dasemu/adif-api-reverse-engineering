package com.adif.elcanomovil.repositories.logos;

import I1.b;
import com.adif.elcanomovil.domain.repositories.logos.LogosInfoRepository;
import com.adif.elcanomovil.serviceStorage.model.OperatorLogoValidityEntity;
import com.adif.elcanomovil.serviceStorage.preferences.PreferenceStorage;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@¢\u0006\u0002\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u001e\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0006H\u0096@¢\u0006\u0002\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/adif/elcanomovil/repositories/logos/DefaultLogosInfoRepository;", "Lcom/adif/elcanomovil/domain/repositories/logos/LogosInfoRepository;", "storage", "Lcom/adif/elcanomovil/serviceStorage/preferences/PreferenceStorage;", "(Lcom/adif/elcanomovil/serviceStorage/preferences/PreferenceStorage;)V", "getLogo", "", "key", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insert", "", "operatorLogoValidityEntity", "Lcom/adif/elcanomovil/serviceStorage/model/OperatorLogoValidityEntity;", "setLogo", "epoch", "(Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "repositories_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDefaultLogosRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultLogosRepository.kt\ncom/adif/elcanomovil/repositories/logos/DefaultLogosInfoRepository\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,28:1\n288#2,2:29\n*S KotlinDebug\n*F\n+ 1 DefaultLogosRepository.kt\ncom/adif/elcanomovil/repositories/logos/DefaultLogosInfoRepository\n*L\n16#1:29,2\n*E\n"})
/* loaded from: classes.dex */
public final class DefaultLogosInfoRepository implements LogosInfoRepository {
    private final PreferenceStorage storage;

    public DefaultLogosInfoRepository(PreferenceStorage storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.storage = storage;
    }

    private final void insert(OperatorLogoValidityEntity operatorLogoValidityEntity) {
        List<OperatorLogoValidityEntity> mutableList;
        List<OperatorLogoValidityEntity> logosFetchDate = this.storage.getLogosFetchDate();
        if (logosFetchDate == null || (mutableList = CollectionsKt.toMutableList((Collection) logosFetchDate)) == null) {
            return;
        }
        CollectionsKt__MutableCollectionsKt.removeAll((List) mutableList, (Function1) new b(operatorLogoValidityEntity, 19));
        mutableList.add(operatorLogoValidityEntity);
        this.storage.setLogosFetchDate(mutableList);
    }

    @Override // com.adif.elcanomovil.domain.repositories.logos.LogosInfoRepository
    public Object getLogo(String str, Continuation<? super Long> continuation) {
        List mutableList;
        Object obj;
        List<OperatorLogoValidityEntity> logosFetchDate = this.storage.getLogosFetchDate();
        if (logosFetchDate != null && (mutableList = CollectionsKt.toMutableList((Collection) logosFetchDate)) != null) {
            Iterator it = mutableList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.areEqual(((OperatorLogoValidityEntity) obj).getKey(), str)) {
                    break;
                }
            }
            OperatorLogoValidityEntity operatorLogoValidityEntity = (OperatorLogoValidityEntity) obj;
            if (operatorLogoValidityEntity != null) {
                return Boxing.boxLong(operatorLogoValidityEntity.getEpoch());
            }
        }
        return null;
    }

    @Override // com.adif.elcanomovil.domain.repositories.logos.LogosInfoRepository
    public Object setLogo(String str, long j4, Continuation<? super Unit> continuation) {
        insert(new OperatorLogoValidityEntity(str, j4));
        return Unit.INSTANCE;
    }
}
