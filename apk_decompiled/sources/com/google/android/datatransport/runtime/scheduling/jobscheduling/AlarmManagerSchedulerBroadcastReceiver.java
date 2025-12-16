package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import R0.h;
import W1.j;
import W1.t;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import c2.k;
import c2.l;
import g2.AbstractC0377a;

/* loaded from: classes3.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f5509a = 0;

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.lang.Runnable] */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        t.b(context);
        h a2 = j.a();
        a2.o(queryParameter);
        a2.f1415c = AbstractC0377a.b(intValue);
        if (queryParameter2 != null) {
            a2.f1414b = Base64.decode(queryParameter2, 0);
        }
        l lVar = t.a().f1961d;
        j b4 = a2.b();
        ?? obj = new Object();
        lVar.getClass();
        lVar.f4271e.execute(new k(lVar, b4, i, obj));
    }
}
