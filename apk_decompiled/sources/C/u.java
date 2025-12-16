package C;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final Context f248a;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f252e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f253f;

    /* renamed from: g, reason: collision with root package name */
    public PendingIntent f254g;
    public IconCompat h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f255j;

    /* renamed from: l, reason: collision with root package name */
    public v f257l;

    /* renamed from: m, reason: collision with root package name */
    public String f258m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f259n;
    public Bundle p;

    /* renamed from: s, reason: collision with root package name */
    public String f263s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f264t;

    /* renamed from: u, reason: collision with root package name */
    public final Notification f265u;

    /* renamed from: v, reason: collision with root package name */
    public final ArrayList f266v;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f249b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f250c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f251d = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public boolean f256k = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f260o = false;

    /* renamed from: q, reason: collision with root package name */
    public int f261q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f262r = 0;

    public u(Context context, String str) {
        Notification notification = new Notification();
        this.f265u = notification;
        this.f248a = context;
        this.f263s = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.f255j = 0;
        this.f266v = new ArrayList();
        this.f264t = true;
    }

    public static CharSequence b(String str) {
        return (str != null && str.length() > 5120) ? str.subSequence(0, 5120) : str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, A.j] */
    public final Notification a() {
        Bundle bundle;
        int i;
        int i4;
        ?? obj = new Object();
        new ArrayList();
        obj.f30d = new Bundle();
        obj.f29c = this;
        Context context = this.f248a;
        obj.f27a = context;
        Notification.Builder a2 = B.a(context, this.f263s);
        obj.f28b = a2;
        Notification notification = this.f265u;
        a2.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(this.f252e).setContentText(this.f253f).setContentInfo(null).setContentIntent(this.f254g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setNumber(this.i).setProgress(0, 0, false);
        IconCompat iconCompat = this.h;
        z.b(a2, iconCompat == null ? null : H.c.c(iconCompat, context));
        a2.setSubText(null).setUsesChronometer(false).setPriority(this.f255j);
        Iterator it = this.f249b.iterator();
        while (it.hasNext()) {
            o oVar = (o) it.next();
            if (oVar.f238b == null && (i4 = oVar.f241e) != 0) {
                oVar.f238b = IconCompat.a(i4);
            }
            IconCompat iconCompat2 = oVar.f238b;
            Notification.Action.Builder a4 = z.a(iconCompat2 != null ? H.c.c(iconCompat2, null) : null, oVar.f242f, oVar.f243g);
            Bundle bundle2 = oVar.f237a;
            Bundle bundle3 = bundle2 != null ? new Bundle(bundle2) : new Bundle();
            boolean z3 = oVar.f239c;
            bundle3.putBoolean("android.support.allowGeneratedReplies", z3);
            int i5 = Build.VERSION.SDK_INT;
            A.a(a4, z3);
            bundle3.putInt("android.support.action.semanticAction", 0);
            C.b(a4, 0);
            D.c(a4, false);
            if (i5 >= 31) {
                E.a(a4, false);
            }
            bundle3.putBoolean("android.support.action.showsUserInterface", oVar.f240d);
            x.b(a4, bundle3);
            x.a((Notification.Builder) obj.f28b, x.d(a4));
        }
        Bundle bundle4 = this.p;
        if (bundle4 != null) {
            ((Bundle) obj.f30d).putAll(bundle4);
        }
        ((Notification.Builder) obj.f28b).setShowWhen(this.f256k);
        x.i((Notification.Builder) obj.f28b, this.f260o);
        x.g((Notification.Builder) obj.f28b, this.f258m);
        x.j((Notification.Builder) obj.f28b, null);
        x.h((Notification.Builder) obj.f28b, this.f259n);
        y.b((Notification.Builder) obj.f28b, null);
        y.c((Notification.Builder) obj.f28b, this.f261q);
        y.f((Notification.Builder) obj.f28b, this.f262r);
        y.d((Notification.Builder) obj.f28b, null);
        y.e((Notification.Builder) obj.f28b, notification.sound, notification.audioAttributes);
        ArrayList arrayList = this.f266v;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                y.a((Notification.Builder) obj.f28b, (String) it2.next());
            }
        }
        ArrayList arrayList2 = this.f251d;
        if (arrayList2.size() > 0) {
            if (this.p == null) {
                this.p = new Bundle();
            }
            Bundle bundle5 = this.p.getBundle("android.car.EXTENSIONS");
            if (bundle5 == null) {
                bundle5 = new Bundle();
            }
            Bundle bundle6 = new Bundle(bundle5);
            Bundle bundle7 = new Bundle();
            for (int i6 = 0; i6 < arrayList2.size(); i6++) {
                String num = Integer.toString(i6);
                o oVar2 = (o) arrayList2.get(i6);
                Bundle bundle8 = new Bundle();
                if (oVar2.f238b == null && (i = oVar2.f241e) != 0) {
                    oVar2.f238b = IconCompat.a(i);
                }
                IconCompat iconCompat3 = oVar2.f238b;
                bundle8.putInt("icon", iconCompat3 != null ? iconCompat3.b() : 0);
                bundle8.putCharSequence("title", oVar2.f242f);
                bundle8.putParcelable("actionIntent", oVar2.f243g);
                Bundle bundle9 = oVar2.f237a;
                Bundle bundle10 = bundle9 != null ? new Bundle(bundle9) : new Bundle();
                bundle10.putBoolean("android.support.allowGeneratedReplies", oVar2.f239c);
                bundle8.putBundle("extras", bundle10);
                bundle8.putParcelableArray("remoteInputs", null);
                bundle8.putBoolean("showsUserInterface", oVar2.f240d);
                bundle8.putInt("semanticAction", 0);
                bundle7.putBundle(num, bundle8);
            }
            bundle5.putBundle("invisible_actions", bundle7);
            bundle6.putBundle("invisible_actions", bundle7);
            if (this.p == null) {
                this.p = new Bundle();
            }
            this.p.putBundle("android.car.EXTENSIONS", bundle5);
            ((Bundle) obj.f30d).putBundle("android.car.EXTENSIONS", bundle6);
        }
        ((Notification.Builder) obj.f28b).setExtras(this.p);
        A.e((Notification.Builder) obj.f28b, null);
        B.b((Notification.Builder) obj.f28b, 0);
        B.e((Notification.Builder) obj.f28b, null);
        B.f((Notification.Builder) obj.f28b, null);
        B.g((Notification.Builder) obj.f28b, 0L);
        B.d((Notification.Builder) obj.f28b, 0);
        if (!TextUtils.isEmpty(this.f263s)) {
            ((Notification.Builder) obj.f28b).setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
        }
        Iterator it3 = this.f250c.iterator();
        if (it3.hasNext()) {
            throw w.g(it3);
        }
        D.a((Notification.Builder) obj.f28b, this.f264t);
        D.b((Notification.Builder) obj.f28b, null);
        u uVar = (u) obj.f29c;
        v vVar = uVar.f257l;
        if (vVar != 0) {
            vVar.a(obj);
        }
        Notification build = ((Notification.Builder) obj.f28b).build();
        if (vVar != 0) {
            uVar.f257l.getClass();
        }
        if (vVar != 0 && (bundle = build.extras) != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", vVar.d());
        }
        return build;
    }

    public final void c(boolean z3) {
        Notification notification = this.f265u;
        if (z3) {
            notification.flags |= 16;
        } else {
            notification.flags &= -17;
        }
    }

    public final void d(int i) {
        Notification notification = this.f265u;
        notification.defaults = i;
        if ((i & 4) != 0) {
            notification.flags |= 1;
        }
    }

    public final void e(v vVar) {
        if (this.f257l != vVar) {
            this.f257l = vVar;
            if (((u) vVar.f267a) != this) {
                vVar.f267a = this;
                e(vVar);
            }
        }
    }
}
