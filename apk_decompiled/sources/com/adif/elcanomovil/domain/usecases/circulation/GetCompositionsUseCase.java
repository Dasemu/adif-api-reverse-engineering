package com.adif.elcanomovil.domain.usecases.circulation;

import com.adif.elcanomovil.commonNavGraph.arguments.NavArguments;
import com.adif.elcanomovil.domain.entities.compositions.Composition;
import com.adif.elcanomovil.domain.entities.utils.AsyncResult;
import com.adif.elcanomovil.domain.repositories.compositions.CompositionsRepository;
import java.util.List;
import k1.b;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004JH\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0086B¢\u0006\u0002\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/adif/elcanomovil/domain/usecases/circulation/GetCompositionsUseCase;", "", "compositionsRepository", "Lcom/adif/elcanomovil/domain/repositories/compositions/CompositionsRepository;", "(Lcom/adif/elcanomovil/domain/repositories/compositions/CompositionsRepository;)V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "Lcom/adif/elcanomovil/domain/entities/utils/AsyncResult;", "", "Lcom/adif/elcanomovil/domain/entities/compositions/Composition;", NavArguments.ARG_DYNAMIC_LINKS_COMMERCIAL_NUMBER, "", NavArguments.ARG_DYNAMIC_LINKS_STATION_TO_CODE, NavArguments.ARG_DYNAMIC_LINKS_LAUNCHDATE, "", NavArguments.ARG_DYNAMIC_LINKS_STATION_CODE, "shouldBeFetch", "", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class GetCompositionsUseCase {
    private final CompositionsRepository compositionsRepository;

    public GetCompositionsUseCase(CompositionsRepository compositionsRepository) {
        Intrinsics.checkNotNullParameter(compositionsRepository, "compositionsRepository");
        this.compositionsRepository = compositionsRepository;
    }

    public final Object invoke(String str, String str2, long j4, String str3, boolean z3, Continuation<? super Flow<? extends AsyncResult<? extends List<Composition>>>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new b(z3, this, str, str2, j4, str3, null), continuation);
    }
}
