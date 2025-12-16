package I2;

import B0.C0031i;
import a.AbstractC0105a;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import android.util.Log;
import c1.C0283c;
import com.adif.elcanomovil.uiAvisa.components.create.NewIssueFragment;
import com.adif.elcanomovil.uiHome.HomeFragment;
import com.adif.elcanomovil.uiStations.main.MyCustomMapFragment;
import com.adif.elcanomovil.uiStations.main.StationsPageServicesFragment;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponentDeferredProxy;
import com.google.firebase.crashlytics.internal.CrashlyticsRemoteConfigListener;
import com.google.firebase.crashlytics.internal.RemoteConfigDeferredProxy;
import com.google.firebase.crashlytics.internal.common.SessionReportingCoordinator;
import com.google.firebase.crashlytics.internal.common.Utils;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigInfo;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import com.google.firebase.sessions.EventGDTLogger;
import com.google.firebase.sessions.SessionEvent;
import d.InterfaceC0293b;
import e2.InterfaceC0313b;
import g2.AbstractC0377a;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import kotlin.jvm.internal.Intrinsics;
import z2.InterfaceC0678h;
import z2.InterfaceC0679i;

/* loaded from: classes3.dex */
public final /* synthetic */ class k implements InterfaceC0293b, InterfaceC0313b, InterfaceC0678h, U.j, MyCustomMapFragment.OnTouchListener, Deferred.DeferredHandler, Continuation, SuccessContinuation, T1.e, InterfaceC0679i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f822a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f823b;

    public /* synthetic */ k(Object obj, int i) {
        this.f822a = i;
        this.f823b = obj;
    }

    @Override // d.InterfaceC0293b
    public void a(Object obj) {
        switch (this.f822a) {
            case 3:
                Boolean bool = (Boolean) obj;
                C0283c this$0 = (C0283c) this.f823b;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNull(bool);
                boolean booleanValue = bool.booleanValue();
                com.adif.elcanomovil.uiAvisa.components.create.y yVar = this$0.f4233c;
                this$0.f4233c = null;
                this$0.f4234d.post(new com.google.firebase.installations.a(booleanValue, 2, yVar));
                return;
            case 9:
                NewIssueFragment.requestCameraPermissions$lambda$0((NewIssueFragment) this.f823b, (Map) obj);
                return;
            default:
                HomeFragment.g((HomeFragment) this.f823b, (Map) obj);
                return;
        }
    }

    @Override // T1.e
    public Object apply(Object obj) {
        return EventGDTLogger.a((EventGDTLogger) this.f823b, (SessionEvent) obj);
    }

    public U1.b b(R0.h hVar) {
        U1.c cVar = (U1.c) this.f823b;
        String concat = "TRuntime.".concat("CctTransportBackend");
        boolean isLoggable = Log.isLoggable(concat, 4);
        URL url = (URL) hVar.f1413a;
        if (isLoggable) {
            Log.i(concat, String.format("Making request to: %s", url));
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(cVar.f1790g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.1.9 android/");
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = (String) hVar.f1415c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    cVar.f1784a.encode((V1.j) hVar.f1414b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    Integer valueOf = Integer.valueOf(responseCode);
                    String concat2 = "TRuntime.".concat("CctTransportBackend");
                    if (Log.isLoggable(concat2, 4)) {
                        Log.i(concat2, String.format("Status Code: %d", valueOf));
                    }
                    AbstractC0105a.p("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                    AbstractC0105a.p("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new U1.b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new U1.b(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                        try {
                            U1.b bVar = new U1.b(responseCode, null, V1.o.a(new BufferedReader(new InputStreamReader(gZIPInputStream))).f1863a);
                            if (gZIPInputStream != null) {
                                gZIPInputStream.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return bVar;
                        } finally {
                        }
                    } catch (Throwable th) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } finally {
                }
            } catch (Throwable th3) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        } catch (EncodingException | IOException e4) {
            AbstractC0105a.s("CctTransportBackend", "Couldn't encode request, returning with 400", e4);
            return new U1.b(400, null, 0L);
        } catch (ConnectException | UnknownHostException e5) {
            AbstractC0105a.s("CctTransportBackend", "Couldn't open connection, returning with 500", e5);
            return new U1.b(ServiceStarter.ERROR_UNKNOWN, null, 0L);
        }
    }

    /* JADX WARN: Type inference failed for: r9v9, types: [java.lang.Object, A.j] */
    @Override // e2.InterfaceC0313b
    public Object execute() {
        SQLiteDatabase d4;
        Cursor rawQuery;
        Object obj = this.f823b;
        switch (this.f822a) {
            case 4:
                d2.h hVar = (d2.h) ((c2.l) obj).i;
                d4 = hVar.d();
                d4.beginTransaction();
                try {
                    d4.compileStatement("DELETE FROM log_event_dropped").execute();
                    d4.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + hVar.f6186b.q()).execute();
                    d4.setTransactionSuccessful();
                    return null;
                } finally {
                }
            case 5:
                d2.h hVar2 = (d2.h) ((d2.c) obj);
                hVar2.getClass();
                int i = Z1.a.f2168e;
                ?? obj2 = new Object();
                obj2.f27a = null;
                obj2.f29c = new ArrayList();
                obj2.f28b = null;
                obj2.f30d = "";
                HashMap hashMap = new HashMap();
                d4 = hVar2.d();
                d4.beginTransaction();
                try {
                    Z1.a aVar = (Z1.a) d2.h.a0(d4.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new C0031i(hVar2, hashMap, obj2, 6));
                    d4.setTransactionSuccessful();
                    return aVar;
                } finally {
                }
            case 6:
                d2.h hVar3 = (d2.h) ((d2.d) obj);
                long q4 = hVar3.f6186b.q() - hVar3.f6188d.f6175d;
                d4 = hVar3.d();
                d4.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(q4)};
                    rawQuery = d4.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
                    while (rawQuery.moveToNext()) {
                        try {
                            hVar3.O(rawQuery.getInt(0), Z1.c.MESSAGE_TOO_OLD, rawQuery.getString(1));
                        } finally {
                        }
                    }
                    rawQuery.close();
                    int delete = d4.delete("events", "timestamp_ms < ?", strArr);
                    d4.setTransactionSuccessful();
                    d4.endTransaction();
                    return Integer.valueOf(delete);
                } finally {
                }
            default:
                c2.n nVar = (c2.n) obj;
                d4 = ((d2.h) nVar.f4282b).d();
                d4.beginTransaction();
                try {
                    rawQuery = d4.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
                    try {
                        ArrayList arrayList = new ArrayList();
                        while (rawQuery.moveToNext()) {
                            R0.h a2 = W1.j.a();
                            a2.o(rawQuery.getString(1));
                            a2.f1415c = AbstractC0377a.b(rawQuery.getInt(2));
                            String string = rawQuery.getString(3);
                            a2.f1414b = string == null ? null : Base64.decode(string, 0);
                            arrayList.add(a2.b());
                        }
                        rawQuery.close();
                        d4.setTransactionSuccessful();
                        d4.endTransaction();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            nVar.f4283c.a((W1.j) it.next(), 1, false);
                        }
                        return null;
                    } finally {
                    }
                } finally {
                }
        }
    }

    @Override // com.google.firebase.inject.Deferred.DeferredHandler
    public void handle(Provider provider) {
        int i = this.f822a;
        Object obj = this.f823b;
        switch (i) {
            case 15:
                CrashlyticsNativeComponentDeferredProxy.b((CrashlyticsNativeComponentDeferredProxy) obj, provider);
                return;
            default:
                RemoteConfigDeferredProxy.a((CrashlyticsRemoteConfigListener) obj, provider);
                return;
        }
    }

    @Override // com.adif.elcanomovil.uiStations.main.MyCustomMapFragment.OnTouchListener
    public void onTouch() {
        StationsPageServicesFragment.configureMap$lambda$6$lambda$5((StationsPageServicesFragment) this.f823b);
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        Task forResult;
        forResult = Tasks.forResult((ConfigFetchHandler.FetchResponse) this.f823b);
        return forResult;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        FirebaseRemoteConfigInfo lambda$ensureInitialized$0;
        int i = this.f822a;
        Object obj = this.f823b;
        switch (i) {
            case 17:
                return Boolean.valueOf(SessionReportingCoordinator.b((SessionReportingCoordinator) obj, task));
            case 18:
                return Utils.b((CountDownLatch) obj, task);
            default:
                lambda$ensureInitialized$0 = FirebaseRemoteConfig.lambda$ensureInitialized$0((Task) obj, task);
                return lambda$ensureInitialized$0;
        }
    }
}
