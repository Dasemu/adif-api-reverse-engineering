package com.adif.elcanomovil.serviceStorage.database;

import A1.a;
import A1.b;
import A1.c;
import A1.d;
import A1.e;
import androidx.room.j;
import androidx.room.u;
import androidx.room.w;
import androidx.room.y;
import com.adif.elcanomovil.serviceStorage.model.avisa.AvisaStationCategoryEntity;
import com.adif.elcanomovil.serviceStorage.model.avisa.AvisaStationEntity;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import m3.l;

/* loaded from: classes.dex */
public final class AvisaStationDao_Impl implements AvisaStationDao {
    private final u __db;
    private final j __insertionAdapterOfAvisaStationCategoryEntity;
    private final j __insertionAdapterOfAvisaStationEntity;
    private final y __preparedStmtOfDeleteAll;
    private final y __preparedStmtOfDeleteCategories;

    public AvisaStationDao_Impl(u uVar) {
        this.__db = uVar;
        this.__insertionAdapterOfAvisaStationEntity = new b(uVar, 0);
        this.__insertionAdapterOfAvisaStationCategoryEntity = new b(uVar, 1);
        this.__preparedStmtOfDeleteAll = new c(uVar, 0);
        this.__preparedStmtOfDeleteCategories = new c(uVar, 1);
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    @Override // com.adif.elcanomovil.serviceStorage.database.AvisaStationDao
    public Object deleteAll(Continuation<? super Unit> continuation) {
        return l.m(this.__db, new e(this, 0), continuation);
    }

    @Override // com.adif.elcanomovil.serviceStorage.database.AvisaStationDao
    public Object deleteCategories(Continuation<? super Unit> continuation) {
        return l.m(this.__db, new e(this, 1), continuation);
    }

    @Override // com.adif.elcanomovil.serviceStorage.database.AvisaStationDao
    public Flow<List<AvisaStationEntity>> getAll() {
        return l.l(this.__db, false, new String[]{"AvisaStation"}, new a(this, w.d(0, "SELECT * FROM AvisaStation"), 1));
    }

    @Override // com.adif.elcanomovil.serviceStorage.database.AvisaStationDao
    public Flow<List<AvisaStationCategoryEntity>> getAllCategories() {
        return l.l(this.__db, false, new String[]{"AvisaStationCategory"}, new a(this, w.d(0, "SELECT * FROM AvisaStationCategory"), 0));
    }

    @Override // com.adif.elcanomovil.serviceStorage.database.AvisaStationDao
    public Object insertAll(List<AvisaStationEntity> list, Continuation<? super Unit> continuation) {
        return l.m(this.__db, new d(this, list, 0), continuation);
    }

    @Override // com.adif.elcanomovil.serviceStorage.database.AvisaStationDao
    public Object insertCategories(List<AvisaStationCategoryEntity> list, Continuation<? super Unit> continuation) {
        return l.m(this.__db, new d(this, list, 1), continuation);
    }
}
