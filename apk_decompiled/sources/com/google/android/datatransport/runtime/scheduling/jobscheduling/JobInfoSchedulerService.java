package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import F.n;
import R0.h;
import W1.j;
import W1.t;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import c2.k;
import c2.l;
import g2.AbstractC0377a;

/* loaded from: classes3.dex */
public class JobInfoSchedulerService extends JobService {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f5510a = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt("priority");
        int i4 = jobParameters.getExtras().getInt("attemptNumber");
        t.b(getApplicationContext());
        h a2 = j.a();
        a2.o(string);
        a2.f1415c = AbstractC0377a.b(i);
        if (string2 != null) {
            a2.f1414b = Base64.decode(string2, 0);
        }
        l lVar = t.a().f1961d;
        j b4 = a2.b();
        n nVar = new n(3, this, jobParameters);
        lVar.getClass();
        lVar.f4271e.execute(new k(lVar, b4, i4, nVar));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
