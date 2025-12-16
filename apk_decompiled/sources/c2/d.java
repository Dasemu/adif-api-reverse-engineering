package c2;

import a.AbstractC0105a;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.PersistableBundle;
import android.util.Base64;
import android.util.Log;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import g2.AbstractC0377a;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Set;
import java.util.zip.Adler32;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4240a;

    /* renamed from: b, reason: collision with root package name */
    public final d2.d f4241b;

    /* renamed from: c, reason: collision with root package name */
    public final b f4242c;

    public d(Context context, d2.d dVar, b bVar) {
        this.f4240a = context;
        this.f4241b = dVar;
        this.f4242c = bVar;
    }

    public final void a(W1.j jVar, int i, boolean z3) {
        Context context = this.f4240a;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(jVar.f1933a.getBytes(Charset.forName("UTF-8")));
        ByteBuffer allocate = ByteBuffer.allocate(4);
        T1.d dVar = jVar.f1935c;
        adler32.update(allocate.putInt(AbstractC0377a.a(dVar)).array());
        byte[] bArr = jVar.f1934b;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z3) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int i4 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i4 >= i) {
                        AbstractC0105a.p("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", jVar);
                        return;
                    }
                }
            }
        }
        SQLiteDatabase d4 = ((d2.h) this.f4241b).d();
        String valueOf = String.valueOf(AbstractC0377a.a(dVar));
        String str = jVar.f1933a;
        Cursor rawQuery = d4.rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str, valueOf});
        try {
            Long valueOf2 = rawQuery.moveToNext() ? Long.valueOf(rawQuery.getLong(0)) : 0L;
            rawQuery.close();
            long longValue = valueOf2.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            b bVar = this.f4242c;
            builder.setMinimumLatency(bVar.a(dVar, longValue, i));
            Set set = ((c) bVar.f4236b.get(dVar)).f4239c;
            if (set.contains(e.f4243a)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(e.f4245c)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(e.f4244b)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i);
            persistableBundle.putString("backendName", str);
            persistableBundle.putInt("priority", AbstractC0377a.a(dVar));
            if (bArr != null) {
                persistableBundle.putString("extras", Base64.encodeToString(bArr, 0));
            }
            builder.setExtras(persistableBundle);
            Object[] objArr = {jVar, Integer.valueOf(value), Long.valueOf(bVar.a(dVar, longValue, i)), valueOf2, Integer.valueOf(i)};
            String concat = "TRuntime.".concat("JobInfoScheduler");
            if (Log.isLoggable(concat, 3)) {
                Log.d(concat, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }
}
