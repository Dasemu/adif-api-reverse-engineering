package A;

import C.M;
import G2.n;
import G2.o;
import O.X;
import a.AbstractC0105a;
import android.R;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.gms.common.ConnectionResult;
import d0.q;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import k.AbstractC0405b;
import k.C0409f;
import k.InterfaceC0404a;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import l.MenuC0419B;
import l.m;
import l.t;
import o0.AbstractC0544v;
import o0.C0522B;
import o0.E;
import o0.G;
import o0.H;

/* loaded from: classes.dex */
public final class j implements InterfaceC0404a {

    /* renamed from: e, reason: collision with root package name */
    public static j f26e;

    /* renamed from: a, reason: collision with root package name */
    public Object f27a;

    /* renamed from: b, reason: collision with root package name */
    public Object f28b;

    /* renamed from: c, reason: collision with root package name */
    public Object f29c;

    /* renamed from: d, reason: collision with root package name */
    public Object f30d;

    public j(AbstractC0544v navController) {
        Intent launchIntentForPackage;
        Intrinsics.checkNotNullParameter(navController, "navController");
        Context context = navController.f8048a;
        Intrinsics.checkNotNullParameter(context, "context");
        this.f27a = context;
        if (context instanceof Activity) {
            launchIntentForPackage = new Intent(context, context.getClass());
        } else {
            launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            if (launchIntentForPackage == null) {
                launchIntentForPackage = new Intent();
            }
        }
        launchIntentForPackage.addFlags(268468224);
        this.f28b = launchIntentForPackage;
        this.f29c = new ArrayList();
        this.f30d = navController.i();
    }

    public static j h() {
        if (f26e == null) {
            f26e = new j(3);
        }
        return f26e;
    }

    public boolean a(o oVar, int i) {
        G2.g gVar = (G2.g) oVar.f627a.get();
        if (gVar == null) {
            return false;
        }
        ((Handler) this.f28b).removeCallbacksAndMessages(oVar);
        Handler handler = G2.k.f600y;
        handler.sendMessage(handler.obtainMessage(1, i, 0, gVar.f584a));
        return true;
    }

    public M b() {
        H h = (H) this.f30d;
        if (h == null) {
            throw new IllegalStateException("You must call setGraph() before constructing the deep link");
        }
        ArrayList arrayList = (ArrayList) this.f29c;
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("You must call setDestination() or addDestination() before constructing the deep link");
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList<? extends Parcelable> arrayList3 = new ArrayList<>();
        Iterator it = arrayList.iterator();
        E e4 = null;
        while (true) {
            boolean hasNext = it.hasNext();
            Context context = (Context) this.f27a;
            int i = 0;
            if (!hasNext) {
                int[] s4 = CollectionsKt.s(arrayList2);
                Intent intent = (Intent) this.f28b;
                intent.putExtra("android-support-nav:controller:deepLinkIds", s4);
                intent.putParcelableArrayListExtra("android-support-nav:controller:deepLinkArgs", arrayList3);
                M m4 = new M(context);
                Intent intent2 = new Intent(intent);
                ComponentName component = intent2.getComponent();
                if (component == null) {
                    component = intent2.resolveActivity(m4.f234b.getPackageManager());
                }
                if (component != null) {
                    m4.a(component);
                }
                ArrayList arrayList4 = m4.f233a;
                arrayList4.add(intent2);
                Intrinsics.checkNotNullExpressionValue(m4, "create(context)\n        …rentStack(Intent(intent))");
                int size = arrayList4.size();
                while (i < size) {
                    Intent intent3 = (Intent) arrayList4.get(i);
                    if (intent3 != null) {
                        intent3.putExtra("android-support-nav:controller:deepLinkIntent", intent);
                    }
                    i++;
                }
                return m4;
            }
            C0522B c0522b = (C0522B) it.next();
            int i4 = c0522b.f7909a;
            E d4 = d(i4);
            if (d4 == null) {
                int i5 = E.f7919j;
                throw new IllegalArgumentException("Navigation destination " + AbstractC0105a.x(context, i4) + " cannot be found in the navigation graph " + h);
            }
            int[] c4 = d4.c(e4);
            int length = c4.length;
            while (i < length) {
                arrayList2.add(Integer.valueOf(c4[i]));
                arrayList3.add(c0522b.f7910b);
                i++;
            }
            e4 = d4;
        }
    }

    public void c(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((s.j) this.f28b).get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                c(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    public E d(int i) {
        ArrayDeque arrayDeque = new ArrayDeque();
        H h = (H) this.f30d;
        Intrinsics.checkNotNull(h);
        arrayDeque.add(h);
        while (!arrayDeque.isEmpty()) {
            E e4 = (E) arrayDeque.removeFirst();
            if (e4.h == i) {
                return e4;
            }
            if (e4 instanceof H) {
                G g4 = new G((H) e4);
                while (g4.hasNext()) {
                    arrayDeque.add((E) g4.next());
                }
            }
        }
        return null;
    }

    @Override // k.InterfaceC0404a
    public boolean e(AbstractC0405b abstractC0405b, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f27a).onActionItemClicked(g(abstractC0405b), new t((Context) this.f30d, (I.a) menuItem));
    }

    @Override // k.InterfaceC0404a
    public boolean f(AbstractC0405b abstractC0405b, m mVar) {
        C0409f g4 = g(abstractC0405b);
        s.j jVar = (s.j) this.f28b;
        Menu menu = (Menu) jVar.get(mVar);
        if (menu == null) {
            menu = new MenuC0419B((Context) this.f30d, mVar);
            jVar.put(mVar, menu);
        }
        return ((ActionMode.Callback) this.f27a).onPrepareActionMode(g4, menu);
    }

    public C0409f g(AbstractC0405b abstractC0405b) {
        ArrayList arrayList = (ArrayList) this.f29c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0409f c0409f = (C0409f) arrayList.get(i);
            if (c0409f != null && c0409f.f6969b == abstractC0405b) {
                return c0409f;
            }
        }
        C0409f c0409f2 = new C0409f((Context) this.f30d, abstractC0405b);
        arrayList.add(c0409f2);
        return c0409f2;
    }

    @Override // k.InterfaceC0404a
    public boolean i(AbstractC0405b abstractC0405b, m mVar) {
        C0409f g4 = g(abstractC0405b);
        s.j jVar = (s.j) this.f28b;
        Menu menu = (Menu) jVar.get(mVar);
        if (menu == null) {
            menu = new MenuC0419B((Context) this.f30d, mVar);
            jVar.put(mVar, menu);
        }
        return ((ActionMode.Callback) this.f27a).onCreateActionMode(g4, menu);
    }

    @Override // k.InterfaceC0404a
    public void j(AbstractC0405b abstractC0405b) {
        ((ActionMode.Callback) this.f27a).onDestroyActionMode(g(abstractC0405b));
    }

    public boolean k(G2.g gVar) {
        o oVar = (o) this.f29c;
        return (oVar == null || gVar == null || oVar.f627a.get() != gVar) ? false : true;
    }

    public void l(Y.m mVar) {
        Object mo1630trySendJP2dKIU = ((Channel) this.f29c).mo1630trySendJP2dKIU(mVar);
        if (mo1630trySendJP2dKIU instanceof ChannelResult.Closed) {
            Throwable m1644exceptionOrNullimpl = ChannelResult.m1644exceptionOrNullimpl(mo1630trySendJP2dKIU);
            if (m1644exceptionOrNullimpl != null) {
                throw m1644exceptionOrNullimpl;
            }
            throw new ClosedSendChannelException("Channel was closed normally");
        }
        if (!ChannelResult.m1650isSuccessimpl(mo1630trySendJP2dKIU)) {
            throw new IllegalStateException("Check failed.");
        }
        if (((AtomicInteger) this.f30d).getAndIncrement() == 0) {
            BuildersKt.launch$default((CoroutineScope) this.f27a, null, null, new Y.j(this, null), 3, null);
        }
    }

    public void m(G2.g gVar) {
        synchronized (this.f27a) {
            try {
                if (k(gVar)) {
                    o oVar = (o) this.f29c;
                    if (!oVar.f629c) {
                        oVar.f629c = true;
                        ((Handler) this.f28b).removeCallbacksAndMessages(oVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void n(G2.g gVar) {
        synchronized (this.f27a) {
            try {
                if (k(gVar)) {
                    o oVar = (o) this.f29c;
                    if (oVar.f629c) {
                        oVar.f629c = false;
                        o(oVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void o(o oVar) {
        int i = oVar.f628b;
        if (i == -2) {
            return;
        }
        if (i <= 0) {
            i = i == -1 ? ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED : 2750;
        }
        Handler handler = (Handler) this.f28b;
        handler.removeCallbacksAndMessages(oVar);
        handler.sendMessageDelayed(Message.obtain(handler, 0, oVar), i);
    }

    public void p() {
        o oVar = (o) this.f30d;
        if (oVar != null) {
            this.f29c = oVar;
            this.f30d = null;
            G2.g gVar = (G2.g) oVar.f627a.get();
            if (gVar == null) {
                this.f29c = null;
            } else {
                Handler handler = G2.k.f600y;
                handler.sendMessage(handler.obtainMessage(0, gVar.f584a));
            }
        }
    }

    public void q() {
        int itemCount;
        ViewPager2 viewPager2 = (ViewPager2) this.f30d;
        int i = R.id.accessibilityActionPageLeft;
        X.h(viewPager2, R.id.accessibilityActionPageLeft);
        X.e(viewPager2, 0);
        X.h(viewPager2, R.id.accessibilityActionPageRight);
        X.e(viewPager2, 0);
        X.h(viewPager2, R.id.accessibilityActionPageUp);
        X.e(viewPager2, 0);
        X.h(viewPager2, R.id.accessibilityActionPageDown);
        X.e(viewPager2, 0);
        if (viewPager2.getAdapter() == null || (itemCount = viewPager2.getAdapter().getItemCount()) == 0 || !viewPager2.f4092r) {
            return;
        }
        int orientation = viewPager2.getOrientation();
        H0.k kVar = (H0.k) this.f28b;
        H0.k kVar2 = (H0.k) this.f27a;
        if (orientation != 0) {
            if (viewPager2.f4081d < itemCount - 1) {
                X.i(viewPager2, new P.f(R.id.accessibilityActionPageDown), kVar2);
            }
            if (viewPager2.f4081d > 0) {
                X.i(viewPager2, new P.f(R.id.accessibilityActionPageUp), kVar);
                return;
            }
            return;
        }
        boolean z3 = viewPager2.f4084g.G() == 1;
        int i4 = z3 ? 16908360 : 16908361;
        if (z3) {
            i = 16908361;
        }
        if (viewPager2.f4081d < itemCount - 1) {
            X.i(viewPager2, new P.f(i4), kVar2);
        }
        if (viewPager2.f4081d > 0) {
            X.i(viewPager2, new P.f(i), kVar);
        }
    }

    public void r() {
        Iterator it = ((ArrayList) this.f29c).iterator();
        while (it.hasNext()) {
            int i = ((C0522B) it.next()).f7909a;
            if (d(i) == null) {
                int i4 = E.f7919j;
                StringBuilder p = com.google.android.gms.measurement.internal.a.p("Navigation destination ", AbstractC0105a.x((Context) this.f27a, i), " cannot be found in the navigation graph ");
                p.append((H) this.f30d);
                throw new IllegalArgumentException(p.toString());
            }
        }
    }

    public j(int i) {
        switch (i) {
            case 1:
                this.f27a = new s.j(0);
                this.f28b = new SparseArray();
                this.f29c = new s.g();
                this.f30d = new s.j(0);
                return;
            case 2:
            default:
                this.f27a = new N.c(10);
                this.f28b = new s.j(0);
                this.f29c = new ArrayList();
                this.f30d = new HashSet();
                return;
            case 3:
                this.f27a = new Object();
                this.f28b = new Handler(Looper.getMainLooper(), new n(this));
                return;
        }
    }

    public j(Typeface typeface, e0.b bVar) {
        int i;
        int i4;
        int i5;
        int i6;
        this.f30d = typeface;
        this.f27a = bVar;
        this.f29c = new q(1024);
        int a2 = bVar.a(6);
        if (a2 != 0) {
            int i7 = a2 + bVar.f1218a;
            i = ((ByteBuffer) bVar.f1221d).getInt(((ByteBuffer) bVar.f1221d).getInt(i7) + i7);
        } else {
            i = 0;
        }
        this.f28b = new char[i * 2];
        int a4 = bVar.a(6);
        if (a4 != 0) {
            int i8 = a4 + bVar.f1218a;
            i4 = ((ByteBuffer) bVar.f1221d).getInt(((ByteBuffer) bVar.f1221d).getInt(i8) + i8);
        } else {
            i4 = 0;
        }
        for (int i9 = 0; i9 < i4; i9++) {
            d0.t tVar = new d0.t(this, i9);
            e0.a b4 = tVar.b();
            int a5 = b4.a(4);
            Character.toChars(a5 != 0 ? ((ByteBuffer) b4.f1221d).getInt(a5 + b4.f1218a) : 0, (char[]) this.f28b, i9 * 2);
            e0.a b5 = tVar.b();
            int a6 = b5.a(16);
            if (a6 != 0) {
                int i10 = a6 + b5.f1218a;
                i5 = ((ByteBuffer) b5.f1221d).getInt(((ByteBuffer) b5.f1221d).getInt(i10) + i10);
            } else {
                i5 = 0;
            }
            m3.d.f(i5 > 0, "invalid metadata codepoint length");
            e0.a b6 = tVar.b();
            int a7 = b6.a(16);
            if (a7 != 0) {
                int i11 = a7 + b6.f1218a;
                i6 = ((ByteBuffer) b6.f1221d).getInt(((ByteBuffer) b6.f1221d).getInt(i11) + i11);
            } else {
                i6 = 0;
            }
            ((q) this.f29c).a(tVar, 0, i6 - 1);
        }
    }
}
