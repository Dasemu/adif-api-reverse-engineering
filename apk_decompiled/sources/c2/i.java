package c2;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import com.google.firebase.remoteconfig.internal.ConfigRealtimeHttpClient;
import e2.InterfaceC0313b;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public final /* synthetic */ class i implements InterfaceC0313b, Continuation, d2.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4257a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4258b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4259c;

    public /* synthetic */ i(int i, Object obj, Object obj2) {
        this.f4257a = i;
        this.f4258b = obj;
        this.f4259c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0091 A[Catch: all -> 0x0119, TryCatch #0 {all -> 0x0119, blocks: (B:25:0x008b, B:27:0x0091, B:29:0x00a1, B:31:0x00ad), top: B:24:0x008b }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cc  */
    @Override // d2.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object apply(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.i.apply(java.lang.Object):java.lang.Object");
    }

    @Override // e2.InterfaceC0313b
    public Object execute() {
        switch (this.f4257a) {
            case 0:
                d2.h hVar = (d2.h) ((l) this.f4258b).f4269c;
                hVar.getClass();
                Iterable iterable = (Iterable) this.f4259c;
                if (!iterable.iterator().hasNext()) {
                    return null;
                }
                hVar.d().compileStatement("DELETE FROM events WHERE _id in " + d2.h.Z(iterable)).execute();
                return null;
            default:
                l lVar = (l) this.f4258b;
                lVar.getClass();
                Iterator it = ((HashMap) this.f4259c).entrySet().iterator();
                while (it.hasNext()) {
                    ((d2.h) lVar.i).O(((Integer) r1.getValue()).intValue(), Z1.c.INVALID_PAYLOD, (String) ((Map.Entry) it.next()).getKey());
                }
                return null;
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        Task lambda$fetchIfCacheExpiredAndNotThrottled$3;
        Task lambda$fetchNowWithTypeAndAttemptNumber$1;
        switch (this.f4257a) {
            case 2:
                lambda$fetchIfCacheExpiredAndNotThrottled$3 = ((ConfigFetchHandler) this.f4258b).lambda$fetchIfCacheExpiredAndNotThrottled$3((Date) this.f4259c, task);
                return lambda$fetchIfCacheExpiredAndNotThrottled$3;
            case 3:
                lambda$fetchNowWithTypeAndAttemptNumber$1 = ((ConfigFetchHandler) this.f4258b).lambda$fetchNowWithTypeAndAttemptNumber$1((HashMap) this.f4259c, task);
                return lambda$fetchNowWithTypeAndAttemptNumber$1;
            default:
                return ConfigRealtimeHttpClient.a((ConfigRealtimeHttpClient) this.f4258b, (Task) this.f4259c, task);
        }
    }
}
