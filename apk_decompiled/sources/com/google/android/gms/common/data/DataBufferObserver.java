package com.google.android.gms.common.data;

/* loaded from: classes3.dex */
public interface DataBufferObserver {

    /* loaded from: classes3.dex */
    public interface Observable {
        void addObserver(DataBufferObserver dataBufferObserver);

        void removeObserver(DataBufferObserver dataBufferObserver);
    }

    void onDataChanged();

    void onDataRangeChanged(int i, int i4);

    void onDataRangeInserted(int i, int i4);

    void onDataRangeMoved(int i, int i4, int i5);

    void onDataRangeRemoved(int i, int i4);
}
