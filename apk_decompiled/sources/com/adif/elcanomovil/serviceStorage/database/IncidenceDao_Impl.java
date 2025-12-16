package com.adif.elcanomovil.serviceStorage.database;

import A1.c;
import A1.m;
import A1.n;
import A1.o;
import A1.p;
import androidx.room.i;
import androidx.room.j;
import androidx.room.u;
import androidx.room.w;
import androidx.room.y;
import com.adif.elcanomovil.serviceStorage.model.avisa.IncidenceEntity;
import com.adif.elcanomovil.serviceStorage.model.avisa.IncidenceStationEntity;
import com.adif.elcanomovil.serviceStorage.utils.CommentTypeConverter;
import com.adif.elcanomovil.serviceStorage.utils.PictureTypeConverter;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import m3.l;

/* loaded from: classes.dex */
public final class IncidenceDao_Impl implements IncidenceDao {
    private final u __db;
    private final j __insertionAdapterOfIncidenceEntity;
    private final y __preparedStmtOfDeleteAll;
    private final i __updateAdapterOfIncidenceEntity;
    private final PictureTypeConverter __pictureTypeConverter = new PictureTypeConverter();
    private final CommentTypeConverter __commentTypeConverter = new CommentTypeConverter();

    public IncidenceDao_Impl(u uVar) {
        this.__db = uVar;
        this.__insertionAdapterOfIncidenceEntity = new m(this, uVar, 0);
        this.__updateAdapterOfIncidenceEntity = new n(this, uVar);
        this.__preparedStmtOfDeleteAll = new c(uVar, 6);
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    @Override // com.adif.elcanomovil.serviceStorage.database.IncidenceDao
    public Object deleteAll(Continuation<? super Unit> continuation) {
        return l.m(this.__db, new A1.l(this, 1), continuation);
    }

    @Override // com.adif.elcanomovil.serviceStorage.database.IncidenceDao
    public Flow<List<IncidenceStationEntity>> getAll() {
        return l.l(this.__db, false, new String[]{"incidenceentity", "avisastation", "avisastationcategory"}, new p(this, w.d(0, "SELECT * FROM incidenceentity INNER JOIN avisastation ON incidenceentity.stationId = avisastation.stId INNER JOIN avisastationcategory ON incidenceentity.categoryId = avisastationcategory.catId"), 0));
    }

    @Override // com.adif.elcanomovil.serviceStorage.database.IncidenceDao
    public Flow<IncidenceStationEntity> getIncidence(int i) {
        w d4 = w.d(1, "SELECT * FROM incidenceentity INNER JOIN avisastation ON incidenceentity.stationId = avisastation.stId INNER JOIN avisastationcategory ON incidenceentity.categoryId = avisastationcategory.catId WHERE incidenceentity.id = ? LIMIT 1");
        d4.I(1, i);
        return l.l(this.__db, false, new String[]{"incidenceentity", "avisastation", "avisastationcategory"}, new p(this, d4, 1));
    }

    @Override // com.adif.elcanomovil.serviceStorage.database.IncidenceDao
    public Object insertAll(List<IncidenceEntity> list, Continuation<? super Unit> continuation) {
        return l.m(this.__db, new o(0, this, list), continuation);
    }

    @Override // com.adif.elcanomovil.serviceStorage.database.IncidenceDao
    public Object updateIncidence(IncidenceEntity incidenceEntity, Continuation<? super Unit> continuation) {
        return l.m(this.__db, new o(1, this, incidenceEntity), continuation);
    }
}
