package com.google.android.gms.common.data;

import C.w;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.a;
import java.util.NoSuchElementException;

@KeepForSdk
/* loaded from: classes3.dex */
public class SingleRefDataBufferIterator<T> extends DataBufferIterator<T> {
    private Object zac;

    public SingleRefDataBufferIterator(DataBuffer dataBuffer) {
        super(dataBuffer);
    }

    @Override // com.google.android.gms.common.data.DataBufferIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException(a.l(this.zab, "Cannot advance the iterator beyond "));
        }
        int i = this.zab + 1;
        this.zab = i;
        if (i == 0) {
            Object checkNotNull = Preconditions.checkNotNull(this.zaa.get(0));
            this.zac = checkNotNull;
            if (!(checkNotNull instanceof DataBufferRef)) {
                throw new IllegalStateException(w.o("DataBuffer reference of type ", String.valueOf(checkNotNull.getClass()), " is not movable"));
            }
        } else {
            ((DataBufferRef) Preconditions.checkNotNull(this.zac)).zaa(this.zab);
        }
        return this.zac;
    }
}
