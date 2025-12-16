package com.adif.elcanomovil.serviceStorage.database;

import A1.c;
import A1.m;
import A1.o;
import A1.q;
import A1.r;
import androidx.room.j;
import androidx.room.u;
import androidx.room.w;
import androidx.room.y;
import com.adif.elcanomovil.serviceStorage.model.subscriptions.SubscriptionEntity;
import com.adif.elcanomovil.serviceStorage.utils.DestinationTypeConverter;
import com.adif.elcanomovil.serviceStorage.utils.OriginTypeConverter;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import m3.l;

/* loaded from: classes.dex */
public final class SubscriptionsDao_Impl implements SubscriptionsDao {
    private final u __db;
    private final j __insertionAdapterOfSubscriptionEntity;
    private final y __preparedStmtOfDelete;
    private final y __preparedStmtOfDeleteAllStatus;
    private final DestinationTypeConverter __destinationTypeConverter = new DestinationTypeConverter();
    private final OriginTypeConverter __originTypeConverter = new OriginTypeConverter();

    public SubscriptionsDao_Impl(u uVar) {
        this.__db = uVar;
        this.__insertionAdapterOfSubscriptionEntity = new m(this, uVar, 1);
        this.__preparedStmtOfDeleteAllStatus = new c(uVar, 8);
        this.__preparedStmtOfDelete = new c(uVar, 9);
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    @Override // com.adif.elcanomovil.serviceStorage.database.SubscriptionsDao
    public Object delete(int i, Continuation<? super Unit> continuation) {
        return l.m(this.__db, new r(this, i), continuation);
    }

    @Override // com.adif.elcanomovil.serviceStorage.database.SubscriptionsDao
    public Object deleteAllStatus(boolean z3, Continuation<? super Unit> continuation) {
        return l.m(this.__db, new q(this, z3), continuation);
    }

    @Override // com.adif.elcanomovil.serviceStorage.database.SubscriptionsDao
    public Flow<List<SubscriptionEntity>> getAll() {
        return l.l(this.__db, false, new String[]{"SubscriptionEntity"}, new o(7, this, w.d(0, "SELECT * FROM SubscriptionEntity")));
    }

    @Override // com.adif.elcanomovil.serviceStorage.database.SubscriptionsDao
    public Object insert(SubscriptionEntity subscriptionEntity, Continuation<? super Unit> continuation) {
        return l.m(this.__db, new o(6, this, subscriptionEntity), continuation);
    }

    @Override // com.adif.elcanomovil.serviceStorage.database.SubscriptionsDao
    public Object insertAll(List<SubscriptionEntity> list, Continuation<? super Unit> continuation) {
        return l.m(this.__db, new o(5, this, list), continuation);
    }
}
