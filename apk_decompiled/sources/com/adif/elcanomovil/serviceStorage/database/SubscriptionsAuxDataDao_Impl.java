package com.adif.elcanomovil.serviceStorage.database;

import A1.b;
import A1.o;
import a.AbstractC0105a;
import android.database.Cursor;
import androidx.room.j;
import androidx.room.u;
import androidx.room.w;
import com.adif.elcanomovil.commonNavGraph.arguments.NavArguments;
import com.adif.elcanomovil.serviceStorage.model.subscriptions.SubscriptionAuxEntity;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import m3.l;

/* loaded from: classes.dex */
public final class SubscriptionsAuxDataDao_Impl implements SubscriptionsAuxDataDao {
    private final u __db;
    private final j __insertionAdapterOfSubscriptionAuxEntity;

    public SubscriptionsAuxDataDao_Impl(u uVar) {
        this.__db = uVar;
        this.__insertionAdapterOfSubscriptionAuxEntity = new b(uVar, 5);
    }

    public static /* synthetic */ u access$000(SubscriptionsAuxDataDao_Impl subscriptionsAuxDataDao_Impl) {
        return subscriptionsAuxDataDao_Impl.__db;
    }

    public static /* synthetic */ j access$100(SubscriptionsAuxDataDao_Impl subscriptionsAuxDataDao_Impl) {
        return subscriptionsAuxDataDao_Impl.__insertionAdapterOfSubscriptionAuxEntity;
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    @Override // com.adif.elcanomovil.serviceStorage.database.SubscriptionsAuxDataDao
    public SubscriptionAuxEntity get(String str) {
        w d4 = w.d(1, "SELECT * FROM SubscriptionAuxEntity WHERE subscriptionType = ? ");
        d4.k(1, str);
        this.__db.assertNotSuspendingTransaction();
        Cursor M3 = AbstractC0105a.M(this.__db, d4, false);
        try {
            int r4 = l.r(M3, "subcriptionAuxId");
            int r5 = l.r(M3, "subscriptionType");
            int r6 = l.r(M3, NavArguments.ARG_DYNAMIC_LINKS_OPERATOR);
            int r7 = l.r(M3, NavArguments.ARG_DYNAMIC_LINKS_COMMERCIAL_PRODUCT);
            SubscriptionAuxEntity subscriptionAuxEntity = null;
            String string = null;
            if (M3.moveToFirst()) {
                int i = M3.getInt(r4);
                String string2 = M3.getString(r5);
                String string3 = M3.isNull(r6) ? null : M3.getString(r6);
                if (!M3.isNull(r7)) {
                    string = M3.getString(r7);
                }
                subscriptionAuxEntity = new SubscriptionAuxEntity(i, string2, string3, string);
            }
            return subscriptionAuxEntity;
        } finally {
            M3.close();
            d4.release();
        }
    }

    @Override // com.adif.elcanomovil.serviceStorage.database.SubscriptionsAuxDataDao
    public Object insert(SubscriptionAuxEntity subscriptionAuxEntity, Continuation<? super Unit> continuation) {
        return l.m(this.__db, new o(4, this, subscriptionAuxEntity), continuation);
    }
}
