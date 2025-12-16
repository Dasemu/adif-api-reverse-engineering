package F;

import O.C0072m;
import android.app.job.JobParameters;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Looper;
import android.util.Log;
import androidx.profileinstaller.ProfileInstallerInitializer;
import androidx.room.B;
import com.adif.elcanomovil.commonNavGraph.arguments.ChildDirections;
import com.adif.elcanomovil.domain.entities.CirculationType;
import com.adif.elcanomovil.domain.entities.StationServiceType;
import com.adif.elcanomovil.uiDepartures.databinding.FragmentDeparturesBinding;
import com.adif.elcanomovil.uiStations.databinding.FragmentStationsBinding;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import g.ExecutorC0369p;
import g.RunnableC0366m;
import i0.AbstractC0392m;
import java.util.Random;
import kotlin.jvm.internal.Intrinsics;
import o0.AbstractC0544v;
import s0.AbstractC0587f;

/* loaded from: classes.dex */
public final /* synthetic */ class n implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f497a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f498b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f499c;

    public /* synthetic */ n(int i, Object obj, Object obj2) {
        this.f497a = i;
        this.f498b = obj;
        this.f499c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = 1;
        Object obj = this.f499c;
        Object obj2 = this.f498b;
        switch (this.f497a) {
            case 0:
                ((b) obj2).h((Typeface) obj);
                return;
            case 1:
                Runnable command = (Runnable) obj2;
                Intrinsics.checkNotNullParameter(command, "$command");
                B this$0 = (B) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                try {
                    command.run();
                    return;
                } finally {
                    this$0.a();
                }
            case 2:
                b.o this$02 = (b.o) obj2;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                b.B dispatcher = (b.B) obj;
                Intrinsics.checkNotNullParameter(dispatcher, "$dispatcher");
                this$02.getLifecycle().a(new C0072m(1, dispatcher, this$02));
                return;
            case 3:
                int i4 = JobInfoSchedulerService.f5510a;
                ((JobInfoSchedulerService) obj2).jobFinished((JobParameters) obj, false);
                return;
            case 4:
                AbstractC0544v navController = (AbstractC0544v) obj2;
                Intrinsics.checkNotNullParameter(navController, "$navController");
                ChildDirections directions = (ChildDirections) obj;
                Intrinsics.checkNotNullParameter(directions, "$directions");
                navController.n(directions.getDeeplinkRequest());
                return;
            case 5:
                FragmentDeparturesBinding binding = (FragmentDeparturesBinding) obj2;
                Intrinsics.checkNotNullParameter(binding, "$binding");
                CirculationType it = (CirculationType) obj;
                Intrinsics.checkNotNullParameter(it, "$it");
                binding.pager.b(it.getTabPosition());
                return;
            case 6:
                FragmentStationsBinding binding2 = (FragmentStationsBinding) obj2;
                Intrinsics.checkNotNullParameter(binding2, "$binding");
                StationServiceType it2 = (StationServiceType) obj;
                Intrinsics.checkNotNullParameter(it2, "$it");
                binding2.pager.b(it2.getIndex());
                return;
            case 7:
                Runnable runnable = (Runnable) obj;
                ExecutorC0369p executorC0369p = (ExecutorC0369p) obj2;
                executorC0369p.getClass();
                try {
                    runnable.run();
                    return;
                } finally {
                    executorC0369p.a();
                }
            case 8:
                AbstractC0392m violation = (AbstractC0392m) obj;
                Intrinsics.checkNotNullParameter(violation, "$violation");
                Log.e("FragmentStrictMode", "Policy violation with PENALTY_DEATH in " + ((String) obj2), violation);
                throw violation;
            default:
                ((ProfileInstallerInitializer) obj2).getClass();
                AbstractC0587f.a(Looper.getMainLooper()).postDelayed(new RunnableC0366m((Context) obj, i), new Random().nextInt(Math.max(1000, 1)) + 5000);
                return;
        }
    }
}
