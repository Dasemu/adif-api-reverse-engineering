package com.adif.elcanomovil.domain.providers;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/adif/elcanomovil/domain/providers/Check24hProvider;", "", "checkfetchInfo", "", "shouldFetch", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface Check24hProvider {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ boolean checkfetchInfo$default(Check24hProvider check24hProvider, boolean z3, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: checkfetchInfo");
            }
            if ((i & 1) != 0) {
                z3 = false;
            }
            return check24hProvider.checkfetchInfo(z3);
        }
    }

    boolean checkfetchInfo(boolean shouldFetch);
}
