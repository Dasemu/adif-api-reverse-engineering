package A1;

import a.AbstractC0105a;
import android.database.Cursor;
import androidx.room.u;
import androidx.room.w;
import com.adif.elcanomovil.serviceStorage.database.AvisaStationDao_Impl;
import com.adif.elcanomovil.serviceStorage.model.avisa.AvisaStationCategoryEntity;
import com.adif.elcanomovil.serviceStorage.model.avisa.AvisaStationEntity;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class a implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f34b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AvisaStationDao_Impl f35c;

    public /* synthetic */ a(AvisaStationDao_Impl avisaStationDao_Impl, w wVar, int i) {
        this.f33a = i;
        this.f35c = avisaStationDao_Impl;
        this.f34b = wVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        u uVar;
        Cursor M3;
        u uVar2;
        switch (this.f33a) {
            case 0:
                uVar = this.f35c.__db;
                M3 = AbstractC0105a.M(uVar, this.f34b, false);
                try {
                    int r4 = m3.l.r(M3, "catId");
                    int r5 = m3.l.r(M3, "title");
                    ArrayList arrayList = new ArrayList(M3.getCount());
                    while (M3.moveToNext()) {
                        arrayList.add(new AvisaStationCategoryEntity(M3.getString(r4), M3.getString(r5)));
                    }
                    return arrayList;
                } finally {
                }
            default:
                uVar2 = this.f35c.__db;
                M3 = AbstractC0105a.M(uVar2, this.f34b, false);
                try {
                    int r6 = m3.l.r(M3, "stId");
                    int r7 = m3.l.r(M3, AppMeasurementSdk.ConditionalUserProperty.NAME);
                    int r8 = m3.l.r(M3, "code");
                    int r9 = m3.l.r(M3, "latitude");
                    int r10 = m3.l.r(M3, "longitude");
                    ArrayList arrayList2 = new ArrayList(M3.getCount());
                    while (M3.moveToNext()) {
                        arrayList2.add(new AvisaStationEntity(M3.getString(r6), M3.getString(r7), M3.getString(r8), M3.isNull(r9) ? null : Double.valueOf(M3.getDouble(r9)), M3.isNull(r10) ? null : Double.valueOf(M3.getDouble(r10))));
                    }
                    return arrayList2;
                } finally {
                }
        }
    }

    public final void finalize() {
        switch (this.f33a) {
            case 0:
                this.f34b.release();
                return;
            default:
                this.f34b.release();
                return;
        }
    }
}
