package com.google.android.gms.measurement.internal;

import C.w;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.Thread;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzfy extends FutureTask implements Comparable {
    final boolean zza;
    final /* synthetic */ zzga zzb;
    private final long zzc;
    private final String zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfy(zzga zzgaVar, Runnable runnable, boolean z3, String str) {
        super(runnable, null);
        AtomicLong atomicLong;
        this.zzb = zzgaVar;
        Preconditions.checkNotNull(str);
        atomicLong = zzga.zza;
        long andIncrement = atomicLong.getAndIncrement();
        this.zzc = andIncrement;
        this.zzd = str;
        this.zza = z3;
        if (andIncrement == LongCompanionObject.MAX_VALUE) {
            w.v(zzgaVar.zzt, "Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        zzfy zzfyVar = (zzfy) obj;
        boolean z3 = this.zza;
        if (z3 != zzfyVar.zza) {
            return !z3 ? 1 : -1;
        }
        long j4 = this.zzc;
        long j5 = zzfyVar.zzc;
        if (j4 < j5) {
            return -1;
        }
        if (j4 > j5) {
            return 1;
        }
        this.zzb.zzt.zzaA().zzh().zzb("Two tasks share the same index. index", Long.valueOf(this.zzc));
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th) {
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler;
        this.zzb.zzt.zzaA().zzd().zzb(this.zzd, th);
        if ((th instanceof zzfw) && (defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler()) != null) {
            defaultUncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
        }
        super.setException(th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfy(zzga zzgaVar, Callable callable, boolean z3, String str) {
        super(callable);
        AtomicLong atomicLong;
        this.zzb = zzgaVar;
        Preconditions.checkNotNull("Task exception on worker thread");
        atomicLong = zzga.zza;
        long andIncrement = atomicLong.getAndIncrement();
        this.zzc = andIncrement;
        this.zzd = "Task exception on worker thread";
        this.zza = z3;
        if (andIncrement == LongCompanionObject.MAX_VALUE) {
            w.v(zzgaVar.zzt, "Tasks index overflow");
        }
    }
}
