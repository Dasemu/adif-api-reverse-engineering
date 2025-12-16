package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.common.internal.ICancelToken;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.location.CurrentLocationRequest;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LastLocationRequest;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.measurement.internal.a;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnTokenCanceledListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.List;
import s.j;

/* loaded from: classes3.dex */
public final class zzda extends GmsClient {
    public static final /* synthetic */ int zze = 0;
    private final j zzf;
    private final j zzg;
    private final j zzh;

    public zzda(Context context, Looper looper, ClientSettings clientSettings, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 23, clientSettings, connectionCallbacks, onConnectionFailedListener);
        this.zzf = new j(0);
        this.zzg = new j(0);
        this.zzh = new j(0);
    }

    private final boolean zzE(Feature feature) {
        Feature feature2;
        Feature[] availableFeatures = getAvailableFeatures();
        if (availableFeatures == null) {
            return false;
        }
        int length = availableFeatures.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                feature2 = null;
                break;
            }
            feature2 = availableFeatures[i];
            if (feature.getName().equals(feature2.getName())) {
                break;
            }
            i++;
        }
        return feature2 != null && feature2.getVersion() >= feature.getVersion();
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return queryLocalInterface instanceof zzo ? (zzo) queryLocalInterface : new zzn(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Feature[] getApiFeatures() {
        return com.google.android.gms.location.zzm.zzl;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int getMinApkVersion() {
        return 11717000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String getServiceDescriptor() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String getStartServiceAction() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final void onConnectionSuspended(int i) {
        super.onConnectionSuspended(i);
        synchronized (this.zzf) {
            this.zzf.clear();
        }
        synchronized (this.zzg) {
            this.zzg.clear();
        }
        synchronized (this.zzh) {
            this.zzh.clear();
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean usesClientTelemetry() {
        return true;
    }

    public final void zzA(boolean z3, TaskCompletionSource taskCompletionSource) throws RemoteException {
        if (zzE(com.google.android.gms.location.zzm.zzg)) {
            ((zzo) getService()).zzx(z3, new zzcl(this, null, taskCompletionSource));
        } else {
            ((zzo) getService()).zzw(z3);
            taskCompletionSource.setResult(null);
        }
    }

    public final void zzB(ListenerHolder.ListenerKey listenerKey, boolean z3, TaskCompletionSource taskCompletionSource) throws RemoteException {
        synchronized (this.zzg) {
            try {
                zzcw zzcwVar = (zzcw) this.zzg.remove(listenerKey);
                if (zzcwVar == null) {
                    taskCompletionSource.setResult(Boolean.FALSE);
                    return;
                }
                zzcwVar.zzh();
                if (!z3) {
                    taskCompletionSource.setResult(Boolean.TRUE);
                } else if (zzE(com.google.android.gms.location.zzm.zzj)) {
                    ((zzo) getService()).zzy(zzdb.zzb(null, zzcwVar, null, null), new zzcl(this, Boolean.TRUE, taskCompletionSource));
                } else {
                    ((zzo) getService()).zzz(new zzdf(2, null, null, zzcwVar, null, new zzcn(Boolean.TRUE, taskCompletionSource), null));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzC(ListenerHolder.ListenerKey listenerKey, boolean z3, TaskCompletionSource taskCompletionSource) throws RemoteException {
        synchronized (this.zzf) {
            try {
                zzcz zzczVar = (zzcz) this.zzf.remove(listenerKey);
                if (zzczVar == null) {
                    taskCompletionSource.setResult(Boolean.FALSE);
                    return;
                }
                zzczVar.zzg();
                if (!z3) {
                    taskCompletionSource.setResult(Boolean.TRUE);
                } else if (zzE(com.google.android.gms.location.zzm.zzj)) {
                    ((zzo) getService()).zzy(zzdb.zzc(null, zzczVar, null, null), new zzcl(this, Boolean.TRUE, taskCompletionSource));
                } else {
                    ((zzo) getService()).zzz(new zzdf(2, null, zzczVar, null, null, new zzcn(Boolean.TRUE, taskCompletionSource), null));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzD(PendingIntent pendingIntent, TaskCompletionSource taskCompletionSource, Object obj) throws RemoteException {
        if (zzE(com.google.android.gms.location.zzm.zzj)) {
            ((zzo) getService()).zzy(zzdb.zza(pendingIntent, null, null), new zzcl(this, null, taskCompletionSource));
        } else {
            ((zzo) getService()).zzz(new zzdf(2, null, null, null, pendingIntent, new zzcn(null, taskCompletionSource), null));
        }
    }

    public final LocationAvailability zzp() throws RemoteException {
        return ((zzo) getService()).zzf(getContext().getPackageName());
    }

    public final void zzq(GeofencingRequest geofencingRequest, PendingIntent pendingIntent, TaskCompletionSource taskCompletionSource) throws RemoteException {
        Preconditions.checkNotNull(geofencingRequest, "geofencingRequest can't be null.");
        Preconditions.checkNotNull(pendingIntent, "PendingIntent must be specified.");
        ((zzo) getService()).zzg(geofencingRequest, pendingIntent, new zzci(taskCompletionSource));
    }

    public final void zzr(TaskCompletionSource taskCompletionSource) throws RemoteException {
        ((zzo) getService()).zzi(new zzcn(null, taskCompletionSource));
    }

    public final void zzs(CurrentLocationRequest currentLocationRequest, CancellationToken cancellationToken, final TaskCompletionSource taskCompletionSource) throws RemoteException {
        getContext();
        if (zzE(com.google.android.gms.location.zzm.zze)) {
            final ICancelToken zze2 = ((zzo) getService()).zze(currentLocationRequest, new zzcm(this, taskCompletionSource));
            if (cancellationToken != null) {
                cancellationToken.onCanceledRequested(new OnTokenCanceledListener() { // from class: com.google.android.gms.internal.location.zzcf
                    @Override // com.google.android.gms.tasks.OnTokenCanceledListener
                    public final void onCanceled() {
                        try {
                            ICancelToken.this.cancel();
                        } catch (RemoteException unused) {
                        }
                    }
                });
                return;
            }
            return;
        }
        ListenerHolder createListenerHolder = ListenerHolders.createListenerHolder(new zzcj(this, taskCompletionSource), zzdx.zza(), "GetCurrentLocation");
        final ListenerHolder.ListenerKey listenerKey = createListenerHolder.getListenerKey();
        listenerKey.getClass();
        zzck zzckVar = new zzck(this, createListenerHolder, taskCompletionSource);
        TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
        LocationRequest.Builder builder = new LocationRequest.Builder(currentLocationRequest.getPriority(), 0L);
        builder.setMinUpdateIntervalMillis(0L);
        builder.setDurationMillis(currentLocationRequest.getDurationMillis());
        builder.setGranularity(currentLocationRequest.getGranularity());
        builder.setMaxUpdateAgeMillis(currentLocationRequest.getMaxUpdateAgeMillis());
        builder.zza(currentLocationRequest.zze());
        builder.zzc(currentLocationRequest.zza());
        builder.setWaitForAccurateLocation(true);
        builder.zzb(currentLocationRequest.zzd());
        builder.zzd(currentLocationRequest.zzb());
        zzu(zzckVar, builder.build(), taskCompletionSource2);
        taskCompletionSource2.getTask().addOnCompleteListener(new OnCompleteListener() { // from class: com.google.android.gms.internal.location.zzcg
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                TaskCompletionSource taskCompletionSource3 = TaskCompletionSource.this;
                if (task.isSuccessful()) {
                    return;
                }
                Exception exception = task.getException();
                exception.getClass();
                taskCompletionSource3.trySetException(exception);
            }
        });
        if (cancellationToken != null) {
            cancellationToken.onCanceledRequested(new OnTokenCanceledListener() { // from class: com.google.android.gms.internal.location.zzch
                @Override // com.google.android.gms.tasks.OnTokenCanceledListener
                public final void onCanceled() {
                    try {
                        zzda.this.zzB(listenerKey, true, new TaskCompletionSource());
                    } catch (RemoteException unused) {
                    }
                }
            });
        }
    }

    public final void zzt(LastLocationRequest lastLocationRequest, TaskCompletionSource taskCompletionSource) throws RemoteException {
        getContext();
        if (zzE(com.google.android.gms.location.zzm.zzf)) {
            ((zzo) getService()).zzj(lastLocationRequest, new zzcm(this, taskCompletionSource));
        } else {
            taskCompletionSource.setResult(((zzo) getService()).zzd());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0046 A[Catch: all -> 0x002e, TryCatch #0 {all -> 0x002e, blocks: (B:4:0x001a, B:8:0x0028, B:9:0x003d, B:11:0x0046, B:12:0x0081, B:16:0x0059, B:17:0x0030), top: B:3:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0059 A[Catch: all -> 0x002e, TryCatch #0 {all -> 0x002e, blocks: (B:4:0x001a, B:8:0x0028, B:9:0x003d, B:11:0x0046, B:12:0x0081, B:16:0x0059, B:17:0x0030), top: B:3:0x001a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzu(com.google.android.gms.internal.location.zzcs r18, com.google.android.gms.location.LocationRequest r19, com.google.android.gms.tasks.TaskCompletionSource r20) throws android.os.RemoteException {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            r2 = r20
            com.google.android.gms.common.api.internal.ListenerHolder r3 = r18.zza()
            com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey r4 = r3.getListenerKey()
            r4.getClass()
            com.google.android.gms.common.Feature r5 = com.google.android.gms.location.zzm.zzj
            boolean r5 = r0.zzE(r5)
            s.j r6 = r0.zzg
            monitor-enter(r6)
            s.j r7 = r0.zzg     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r7 = r7.get(r4)     // Catch: java.lang.Throwable -> L2e
            com.google.android.gms.internal.location.zzcw r7 = (com.google.android.gms.internal.location.zzcw) r7     // Catch: java.lang.Throwable -> L2e
            r8 = 0
            if (r7 == 0) goto L30
            if (r5 == 0) goto L28
            goto L30
        L28:
            r7.zzg(r3)     // Catch: java.lang.Throwable -> L2e
            r13 = r7
            r7 = r8
            goto L3d
        L2e:
            r0 = move-exception
            goto L83
        L30:
            com.google.android.gms.internal.location.zzcw r3 = new com.google.android.gms.internal.location.zzcw     // Catch: java.lang.Throwable -> L2e
            r9 = r18
            r3.<init>(r9)     // Catch: java.lang.Throwable -> L2e
            s.j r9 = r0.zzg     // Catch: java.lang.Throwable -> L2e
            r9.put(r4, r3)     // Catch: java.lang.Throwable -> L2e
            r13 = r3
        L3d:
            r0.getContext()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r3 = r4.toIdString()     // Catch: java.lang.Throwable -> L2e
            if (r5 == 0) goto L59
            android.os.IInterface r4 = r0.getService()     // Catch: java.lang.Throwable -> L2e
            com.google.android.gms.internal.location.zzo r4 = (com.google.android.gms.internal.location.zzo) r4     // Catch: java.lang.Throwable -> L2e
            com.google.android.gms.internal.location.zzdb r3 = com.google.android.gms.internal.location.zzdb.zzb(r7, r13, r8, r3)     // Catch: java.lang.Throwable -> L2e
            com.google.android.gms.internal.location.zzcl r5 = new com.google.android.gms.internal.location.zzcl     // Catch: java.lang.Throwable -> L2e
            r5.<init>(r0, r8, r2)     // Catch: java.lang.Throwable -> L2e
            r4.zzk(r3, r1, r5)     // Catch: java.lang.Throwable -> L2e
            goto L81
        L59:
            android.os.IInterface r0 = r0.getService()     // Catch: java.lang.Throwable -> L2e
            com.google.android.gms.internal.location.zzo r0 = (com.google.android.gms.internal.location.zzo) r0     // Catch: java.lang.Throwable -> L2e
            com.google.android.gms.location.LocationRequest$Builder r4 = new com.google.android.gms.location.LocationRequest$Builder     // Catch: java.lang.Throwable -> L2e
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L2e
            r4.zzb(r8)     // Catch: java.lang.Throwable -> L2e
            com.google.android.gms.location.LocationRequest r1 = r4.build()     // Catch: java.lang.Throwable -> L2e
            com.google.android.gms.internal.location.zzdd r11 = com.google.android.gms.internal.location.zzdd.zza(r8, r1)     // Catch: java.lang.Throwable -> L2e
            com.google.android.gms.internal.location.zzcp r15 = new com.google.android.gms.internal.location.zzcp     // Catch: java.lang.Throwable -> L2e
            r15.<init>(r2, r13)     // Catch: java.lang.Throwable -> L2e
            com.google.android.gms.internal.location.zzdf r9 = new com.google.android.gms.internal.location.zzdf     // Catch: java.lang.Throwable -> L2e
            r12 = 0
            r14 = 0
            r10 = 1
            r16 = r3
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)     // Catch: java.lang.Throwable -> L2e
            r0.zzz(r9)     // Catch: java.lang.Throwable -> L2e
        L81:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L2e
            return
        L83:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L2e
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.location.zzda.zzu(com.google.android.gms.internal.location.zzcs, com.google.android.gms.location.LocationRequest, com.google.android.gms.tasks.TaskCompletionSource):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0046 A[Catch: all -> 0x002e, TryCatch #0 {all -> 0x002e, blocks: (B:4:0x001a, B:8:0x0028, B:9:0x003d, B:11:0x0046, B:12:0x0081, B:16:0x0059, B:17:0x0030), top: B:3:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0059 A[Catch: all -> 0x002e, TryCatch #0 {all -> 0x002e, blocks: (B:4:0x001a, B:8:0x0028, B:9:0x003d, B:11:0x0046, B:12:0x0081, B:16:0x0059, B:17:0x0030), top: B:3:0x001a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzv(com.google.android.gms.internal.location.zzcs r18, com.google.android.gms.location.LocationRequest r19, com.google.android.gms.tasks.TaskCompletionSource r20) throws android.os.RemoteException {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            r2 = r20
            com.google.android.gms.common.api.internal.ListenerHolder r3 = r18.zza()
            com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey r4 = r3.getListenerKey()
            r4.getClass()
            com.google.android.gms.common.Feature r5 = com.google.android.gms.location.zzm.zzj
            boolean r5 = r0.zzE(r5)
            s.j r6 = r0.zzf
            monitor-enter(r6)
            s.j r7 = r0.zzf     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r7 = r7.get(r4)     // Catch: java.lang.Throwable -> L2e
            com.google.android.gms.internal.location.zzcz r7 = (com.google.android.gms.internal.location.zzcz) r7     // Catch: java.lang.Throwable -> L2e
            r8 = 0
            if (r7 == 0) goto L30
            if (r5 == 0) goto L28
            goto L30
        L28:
            r7.zzf(r3)     // Catch: java.lang.Throwable -> L2e
            r12 = r7
            r7 = r8
            goto L3d
        L2e:
            r0 = move-exception
            goto L83
        L30:
            com.google.android.gms.internal.location.zzcz r3 = new com.google.android.gms.internal.location.zzcz     // Catch: java.lang.Throwable -> L2e
            r9 = r18
            r3.<init>(r9)     // Catch: java.lang.Throwable -> L2e
            s.j r9 = r0.zzf     // Catch: java.lang.Throwable -> L2e
            r9.put(r4, r3)     // Catch: java.lang.Throwable -> L2e
            r12 = r3
        L3d:
            r0.getContext()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r3 = r4.toIdString()     // Catch: java.lang.Throwable -> L2e
            if (r5 == 0) goto L59
            android.os.IInterface r4 = r0.getService()     // Catch: java.lang.Throwable -> L2e
            com.google.android.gms.internal.location.zzo r4 = (com.google.android.gms.internal.location.zzo) r4     // Catch: java.lang.Throwable -> L2e
            com.google.android.gms.internal.location.zzdb r3 = com.google.android.gms.internal.location.zzdb.zzc(r7, r12, r8, r3)     // Catch: java.lang.Throwable -> L2e
            com.google.android.gms.internal.location.zzcl r5 = new com.google.android.gms.internal.location.zzcl     // Catch: java.lang.Throwable -> L2e
            r5.<init>(r0, r8, r2)     // Catch: java.lang.Throwable -> L2e
            r4.zzk(r3, r1, r5)     // Catch: java.lang.Throwable -> L2e
            goto L81
        L59:
            android.os.IInterface r0 = r0.getService()     // Catch: java.lang.Throwable -> L2e
            com.google.android.gms.internal.location.zzo r0 = (com.google.android.gms.internal.location.zzo) r0     // Catch: java.lang.Throwable -> L2e
            com.google.android.gms.location.LocationRequest$Builder r4 = new com.google.android.gms.location.LocationRequest$Builder     // Catch: java.lang.Throwable -> L2e
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L2e
            r4.zzb(r8)     // Catch: java.lang.Throwable -> L2e
            com.google.android.gms.location.LocationRequest r1 = r4.build()     // Catch: java.lang.Throwable -> L2e
            com.google.android.gms.internal.location.zzdd r11 = com.google.android.gms.internal.location.zzdd.zza(r8, r1)     // Catch: java.lang.Throwable -> L2e
            com.google.android.gms.internal.location.zzco r15 = new com.google.android.gms.internal.location.zzco     // Catch: java.lang.Throwable -> L2e
            r15.<init>(r2, r12)     // Catch: java.lang.Throwable -> L2e
            com.google.android.gms.internal.location.zzdf r9 = new com.google.android.gms.internal.location.zzdf     // Catch: java.lang.Throwable -> L2e
            r13 = 0
            r14 = 0
            r10 = 1
            r16 = r3
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)     // Catch: java.lang.Throwable -> L2e
            r0.zzz(r9)     // Catch: java.lang.Throwable -> L2e
        L81:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L2e
            return
        L83:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L2e
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.location.zzda.zzv(com.google.android.gms.internal.location.zzcs, com.google.android.gms.location.LocationRequest, com.google.android.gms.tasks.TaskCompletionSource):void");
    }

    public final void zzw(PendingIntent pendingIntent, LocationRequest locationRequest, TaskCompletionSource taskCompletionSource) throws RemoteException {
        getContext();
        if (zzE(com.google.android.gms.location.zzm.zzj)) {
            ((zzo) getService()).zzk(zzdb.zza(pendingIntent, null, null), locationRequest, new zzcl(this, null, taskCompletionSource));
            return;
        }
        zzo zzoVar = (zzo) getService();
        LocationRequest.Builder builder = new LocationRequest.Builder(locationRequest);
        builder.zzb(null);
        zzoVar.zzz(new zzdf(1, zzdd.zza(null, builder.build()), null, null, pendingIntent, new zzcn(null, taskCompletionSource), a.l(pendingIntent.hashCode(), "PendingIntent@")));
    }

    public final void zzx(PendingIntent pendingIntent, TaskCompletionSource taskCompletionSource) throws RemoteException {
        Preconditions.checkNotNull(pendingIntent, "PendingIntent must be specified.");
        ((zzo) getService()).zzn(pendingIntent, new zzci(taskCompletionSource), getContext().getPackageName());
    }

    public final void zzy(List list, TaskCompletionSource taskCompletionSource) throws RemoteException {
        Preconditions.checkArgument((list == null || list.isEmpty()) ? false : true, "geofenceRequestIds can't be null nor empty.");
        ((zzo) getService()).zzo((String[]) list.toArray(new String[0]), new zzci(taskCompletionSource), getContext().getPackageName());
    }

    public final void zzz(Location location, TaskCompletionSource taskCompletionSource) throws RemoteException {
        if (zzE(com.google.android.gms.location.zzm.zzh)) {
            ((zzo) getService()).zzv(location, new zzcl(this, null, taskCompletionSource));
        } else {
            ((zzo) getService()).zzu(location);
            taskCompletionSource.setResult(null);
        }
    }
}
