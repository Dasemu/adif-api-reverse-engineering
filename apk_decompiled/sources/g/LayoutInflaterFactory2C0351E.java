package g;

import C.AbstractC0044h;
import O.X;
import O.h0;
import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.ContentFrameLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.firebase.analytics.FirebaseAnalytics;
import f.AbstractC0336a;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import k.AbstractC0405b;
import k.C0407d;
import k.C0412i;
import l.InterfaceC0433k;
import m.C0462g;
import m.C0472l;
import m.C0487t;
import m.InterfaceC0457d0;
import m.V0;

/* renamed from: g.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class LayoutInflaterFactory2C0351E extends r implements InterfaceC0433k, LayoutInflater.Factory2 {

    /* renamed from: h0, reason: collision with root package name */
    public static final s.j f6492h0 = new s.j(0);

    /* renamed from: i0, reason: collision with root package name */
    public static final int[] f6493i0 = {R.attr.windowBackground};

    /* renamed from: j0, reason: collision with root package name */
    public static final boolean f6494j0 = !"robolectric".equals(Build.FINGERPRINT);

    /* renamed from: A, reason: collision with root package name */
    public ViewGroup f6495A;

    /* renamed from: B, reason: collision with root package name */
    public TextView f6496B;

    /* renamed from: C, reason: collision with root package name */
    public View f6497C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f6498D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f6499E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f6500F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f6501G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f6502H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f6503I;
    public boolean J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f6504K;

    /* renamed from: L, reason: collision with root package name */
    public C0350D[] f6505L;

    /* renamed from: M, reason: collision with root package name */
    public C0350D f6506M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f6507N;

    /* renamed from: O, reason: collision with root package name */
    public boolean f6508O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f6509P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f6510Q;

    /* renamed from: R, reason: collision with root package name */
    public Configuration f6511R;

    /* renamed from: S, reason: collision with root package name */
    public final int f6512S;

    /* renamed from: T, reason: collision with root package name */
    public int f6513T;

    /* renamed from: U, reason: collision with root package name */
    public int f6514U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f6515V;

    /* renamed from: W, reason: collision with root package name */
    public z f6516W;

    /* renamed from: X, reason: collision with root package name */
    public z f6517X;

    /* renamed from: Y, reason: collision with root package name */
    public boolean f6518Y;
    public int Z;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f6520b0;

    /* renamed from: c0, reason: collision with root package name */
    public Rect f6521c0;

    /* renamed from: d0, reason: collision with root package name */
    public Rect f6522d0;

    /* renamed from: e0, reason: collision with root package name */
    public J f6523e0;

    /* renamed from: f0, reason: collision with root package name */
    public OnBackInvokedDispatcher f6524f0;

    /* renamed from: g0, reason: collision with root package name */
    public OnBackInvokedCallback f6525g0;

    /* renamed from: j, reason: collision with root package name */
    public final Object f6526j;

    /* renamed from: k, reason: collision with root package name */
    public final Context f6527k;

    /* renamed from: l, reason: collision with root package name */
    public Window f6528l;

    /* renamed from: m, reason: collision with root package name */
    public y f6529m;

    /* renamed from: n, reason: collision with root package name */
    public final Object f6530n;

    /* renamed from: o, reason: collision with root package name */
    public AbstractC0354a f6531o;
    public C0412i p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f6532q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC0457d0 f6533r;

    /* renamed from: s, reason: collision with root package name */
    public C0372t f6534s;

    /* renamed from: t, reason: collision with root package name */
    public C0372t f6535t;

    /* renamed from: u, reason: collision with root package name */
    public AbstractC0405b f6536u;

    /* renamed from: v, reason: collision with root package name */
    public ActionBarContextView f6537v;

    /* renamed from: w, reason: collision with root package name */
    public PopupWindow f6538w;

    /* renamed from: x, reason: collision with root package name */
    public RunnableC0371s f6539x;

    /* renamed from: z, reason: collision with root package name */
    public boolean f6541z;

    /* renamed from: y, reason: collision with root package name */
    public h0 f6540y = null;

    /* renamed from: a0, reason: collision with root package name */
    public final RunnableC0371s f6519a0 = new RunnableC0371s(this, 0);

    public LayoutInflaterFactory2C0351E(Context context, Window window, InterfaceC0365l interfaceC0365l, Object obj) {
        AbstractActivityC0364k abstractActivityC0364k = null;
        this.f6512S = -100;
        this.f6527k = context;
        this.f6530n = interfaceC0365l;
        this.f6526j = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (!(context instanceof AbstractActivityC0364k)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        } else {
                            context = ((ContextWrapper) context).getBaseContext();
                        }
                    } else {
                        abstractActivityC0364k = (AbstractActivityC0364k) context;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (abstractActivityC0364k != null) {
                this.f6512S = ((LayoutInflaterFactory2C0351E) abstractActivityC0364k.getDelegate()).f6512S;
            }
        }
        if (this.f6512S == -100) {
            s.j jVar = f6492h0;
            Integer num = (Integer) jVar.get(this.f6526j.getClass().getName());
            if (num != null) {
                this.f6512S = num.intValue();
                jVar.remove(this.f6526j.getClass().getName());
            }
        }
        if (window != null) {
            p(window);
        }
        C0487t.d();
    }

    public static K.i q(Context context) {
        K.i iVar;
        K.i iVar2;
        if (Build.VERSION.SDK_INT >= 33 || (iVar = r.f6660c) == null) {
            return null;
        }
        K.i b4 = w.b(context.getApplicationContext().getResources().getConfiguration());
        K.j jVar = iVar.f972a;
        if (jVar.f973a.isEmpty()) {
            iVar2 = K.i.f971b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i = 0;
            while (i < b4.f972a.f973a.size() + jVar.f973a.size()) {
                Locale locale = i < jVar.f973a.size() ? jVar.f973a.get(i) : b4.f972a.f973a.get(i - jVar.f973a.size());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i++;
            }
            iVar2 = new K.i(new K.j(K.h.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]))));
        }
        return iVar2.f972a.f973a.isEmpty() ? b4 : iVar2;
    }

    public static Configuration u(Context context, int i, K.i iVar, Configuration configuration, boolean z3) {
        int i4 = i != 1 ? i != 2 ? z3 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = BitmapDescriptorFactory.HUE_RED;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i4 | (configuration2.uiMode & (-49));
        if (iVar != null) {
            w.d(configuration2, iVar);
        }
        return configuration2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0006, code lost:
    
        if (r2 <= r5) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, g.D] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final g.C0350D A(int r5) {
        /*
            r4 = this;
            g.D[] r0 = r4.f6505L
            r1 = 0
            if (r0 == 0) goto L8
            int r2 = r0.length
            if (r2 > r5) goto L15
        L8:
            int r2 = r5 + 1
            g.D[] r2 = new g.C0350D[r2]
            if (r0 == 0) goto L12
            int r3 = r0.length
            java.lang.System.arraycopy(r0, r1, r2, r1, r3)
        L12:
            r4.f6505L = r2
            r0 = r2
        L15:
            r4 = r0[r5]
            if (r4 != 0) goto L24
            g.D r4 = new g.D
            r4.<init>()
            r4.f6479a = r5
            r4.f6490n = r1
            r0[r5] = r4
        L24:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: g.LayoutInflaterFactory2C0351E.A(int):g.D");
    }

    public final void B() {
        x();
        if (this.f6500F && this.f6531o == null) {
            Object obj = this.f6526j;
            if (obj instanceof Activity) {
                this.f6531o = new T((Activity) obj, this.f6501G);
            } else if (obj instanceof Dialog) {
                this.f6531o = new T((Dialog) obj);
            }
            AbstractC0354a abstractC0354a = this.f6531o;
            if (abstractC0354a != null) {
                abstractC0354a.l(this.f6520b0);
            }
        }
    }

    public final void C(int i) {
        this.Z = (1 << i) | this.Z;
        if (this.f6518Y) {
            return;
        }
        View decorView = this.f6528l.getDecorView();
        RunnableC0371s runnableC0371s = this.f6519a0;
        WeakHashMap weakHashMap = X.f1226a;
        decorView.postOnAnimation(runnableC0371s);
        this.f6518Y = true;
    }

    public final int D(Context context, int i) {
        if (i != -100) {
            if (i != -1) {
                if (i != 0) {
                    if (i != 1 && i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                        }
                        if (this.f6517X == null) {
                            this.f6517X = new z(this, context);
                        }
                        return this.f6517X.e();
                    }
                } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    return z(context).e();
                }
            }
            return i;
        }
        return -1;
    }

    public final boolean E() {
        boolean z3 = this.f6507N;
        this.f6507N = false;
        C0350D A3 = A(0);
        if (!A3.f6489m) {
            AbstractC0405b abstractC0405b = this.f6536u;
            if (abstractC0405b != null) {
                abstractC0405b.a();
                return true;
            }
            B();
            AbstractC0354a abstractC0354a = this.f6531o;
            if (abstractC0354a == null || !abstractC0354a.b()) {
                return false;
            }
        } else if (!z3) {
            t(A3, true);
            return true;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0176, code lost:
    
        if (r3.f7233f.getCount() > 0) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0156, code lost:
    
        if (r3 != null) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void F(g.C0350D r18, android.view.KeyEvent r19) {
        /*
            Method dump skipped, instructions count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g.LayoutInflaterFactory2C0351E.F(g.D, android.view.KeyEvent):void");
    }

    public final boolean G(C0350D c0350d, int i, KeyEvent keyEvent) {
        l.m mVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((c0350d.f6487k || H(c0350d, keyEvent)) && (mVar = c0350d.h) != null) {
            return mVar.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00d5, code lost:
    
        if (r13.h == null) goto L81;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean H(g.C0350D r13, android.view.KeyEvent r14) {
        /*
            Method dump skipped, instructions count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g.LayoutInflaterFactory2C0351E.H(g.D, android.view.KeyEvent):boolean");
    }

    public final void I() {
        if (this.f6541z) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void J() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z3 = false;
            if (this.f6524f0 != null && (A(0).f6489m || this.f6536u != null)) {
                z3 = true;
            }
            if (z3 && this.f6525g0 == null) {
                this.f6525g0 = x.b(this.f6524f0, this);
            } else {
                if (z3 || (onBackInvokedCallback = this.f6525g0) == null) {
                    return;
                }
                x.c(this.f6524f0, onBackInvokedCallback);
                this.f6525g0 = null;
            }
        }
    }

    @Override // g.r
    public final void a() {
        LayoutInflater from = LayoutInflater.from(this.f6527k);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else {
            if (from.getFactory2() instanceof LayoutInflaterFactory2C0351E) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // g.r
    public final void b() {
        if (this.f6531o != null) {
            B();
            if (this.f6531o.f()) {
                return;
            }
            C(0);
        }
    }

    @Override // l.InterfaceC0433k
    public final boolean c(l.m mVar, MenuItem menuItem) {
        C0350D c0350d;
        Window.Callback callback = this.f6528l.getCallback();
        if (callback != null && !this.f6510Q) {
            l.m k4 = mVar.k();
            C0350D[] c0350dArr = this.f6505L;
            int length = c0350dArr != null ? c0350dArr.length : 0;
            int i = 0;
            while (true) {
                if (i < length) {
                    c0350d = c0350dArr[i];
                    if (c0350d != null && c0350d.h == k4) {
                        break;
                    }
                    i++;
                } else {
                    c0350d = null;
                    break;
                }
            }
            if (c0350d != null) {
                return callback.onMenuItemSelected(c0350d.f6479a, menuItem);
            }
        }
        return false;
    }

    @Override // g.r
    public final void e() {
        String str;
        this.f6508O = true;
        o(false, true);
        y();
        Object obj = this.f6526j;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    str = AbstractC0044h.c(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e4) {
                    throw new IllegalArgumentException(e4);
                }
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                AbstractC0354a abstractC0354a = this.f6531o;
                if (abstractC0354a == null) {
                    this.f6520b0 = true;
                } else {
                    abstractC0354a.l(true);
                }
            }
            synchronized (r.h) {
                r.g(this);
                r.f6664g.add(new WeakReference(this));
            }
        }
        this.f6511R = new Configuration(this.f6527k.getResources().getConfiguration());
        this.f6509P = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // g.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f6526j
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L11
            java.lang.Object r0 = g.r.h
            monitor-enter(r0)
            g.r.g(r3)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            goto L11
        Le:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r3
        L11:
            boolean r0 = r3.f6518Y
            if (r0 == 0) goto L20
            android.view.Window r0 = r3.f6528l
            android.view.View r0 = r0.getDecorView()
            g.s r1 = r3.f6519a0
            r0.removeCallbacks(r1)
        L20:
            r0 = 1
            r3.f6510Q = r0
            int r0 = r3.f6512S
            r1 = -100
            if (r0 == r1) goto L4d
            java.lang.Object r0 = r3.f6526j
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L4d
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L4d
            s.j r0 = g.LayoutInflaterFactory2C0351E.f6492h0
            java.lang.Object r1 = r3.f6526j
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.f6512S
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L5c
        L4d:
            s.j r0 = g.LayoutInflaterFactory2C0351E.f6492h0
            java.lang.Object r1 = r3.f6526j
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L5c:
            g.a r0 = r3.f6531o
            if (r0 == 0) goto L63
            r0.h()
        L63:
            g.z r0 = r3.f6516W
            if (r0 == 0) goto L6a
            r0.c()
        L6a:
            g.z r3 = r3.f6517X
            if (r3 == 0) goto L71
            r3.c()
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g.LayoutInflaterFactory2C0351E.f():void");
    }

    @Override // g.r
    public final boolean h(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i = 108;
        } else if (i == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i = 109;
        }
        if (this.J && i == 108) {
            return false;
        }
        if (this.f6500F && i == 1) {
            this.f6500F = false;
        }
        if (i == 1) {
            I();
            this.J = true;
            return true;
        }
        if (i == 2) {
            I();
            this.f6498D = true;
            return true;
        }
        if (i == 5) {
            I();
            this.f6499E = true;
            return true;
        }
        if (i == 10) {
            I();
            this.f6502H = true;
            return true;
        }
        if (i == 108) {
            I();
            this.f6500F = true;
            return true;
        }
        if (i != 109) {
            return this.f6528l.requestFeature(i);
        }
        I();
        this.f6501G = true;
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        if (r6.f() != false) goto L20;
     */
    @Override // l.InterfaceC0433k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(l.m r6) {
        /*
            r5 = this;
            m.d0 r6 = r5.f6533r
            r0 = 1
            r1 = 0
            if (r6 == 0) goto Ld3
            androidx.appcompat.widget.ActionBarOverlayLayout r6 = (androidx.appcompat.widget.ActionBarOverlayLayout) r6
            r6.k()
            m.e0 r6 = r6.f2393e
            m.V0 r6 = (m.V0) r6
            androidx.appcompat.widget.Toolbar r6 = r6.f7624a
            int r2 = r6.getVisibility()
            if (r2 != 0) goto Ld3
            androidx.appcompat.widget.ActionMenuView r6 = r6.f2480a
            if (r6 == 0) goto Ld3
            boolean r6 = r6.f2415s
            if (r6 == 0) goto Ld3
            android.content.Context r6 = r5.f6527k
            android.view.ViewConfiguration r6 = android.view.ViewConfiguration.get(r6)
            boolean r6 = r6.hasPermanentMenuKey()
            if (r6 == 0) goto L4a
            m.d0 r6 = r5.f6533r
            androidx.appcompat.widget.ActionBarOverlayLayout r6 = (androidx.appcompat.widget.ActionBarOverlayLayout) r6
            r6.k()
            m.e0 r6 = r6.f2393e
            m.V0 r6 = (m.V0) r6
            androidx.appcompat.widget.Toolbar r6 = r6.f7624a
            androidx.appcompat.widget.ActionMenuView r6 = r6.f2480a
            if (r6 == 0) goto Ld3
            m.l r6 = r6.f2416t
            if (r6 == 0) goto Ld3
            m.i r2 = r6.f7694v
            if (r2 != 0) goto L4a
            boolean r6 = r6.f()
            if (r6 == 0) goto Ld3
        L4a:
            android.view.Window r6 = r5.f6528l
            android.view.Window$Callback r6 = r6.getCallback()
            m.d0 r2 = r5.f6533r
            androidx.appcompat.widget.ActionBarOverlayLayout r2 = (androidx.appcompat.widget.ActionBarOverlayLayout) r2
            r2.k()
            m.e0 r2 = r2.f2393e
            m.V0 r2 = (m.V0) r2
            androidx.appcompat.widget.Toolbar r2 = r2.f7624a
            boolean r2 = r2.p()
            r3 = 108(0x6c, float:1.51E-43)
            if (r2 == 0) goto L8c
            m.d0 r0 = r5.f6533r
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = (androidx.appcompat.widget.ActionBarOverlayLayout) r0
            r0.k()
            m.e0 r0 = r0.f2393e
            m.V0 r0 = (m.V0) r0
            androidx.appcompat.widget.Toolbar r0 = r0.f7624a
            androidx.appcompat.widget.ActionMenuView r0 = r0.f2480a
            if (r0 == 0) goto L7e
            m.l r0 = r0.f2416t
            if (r0 == 0) goto L7e
            boolean r0 = r0.c()
        L7e:
            boolean r0 = r5.f6510Q
            if (r0 != 0) goto Ld2
            g.D r5 = r5.A(r1)
            l.m r5 = r5.h
            r6.onPanelClosed(r3, r5)
            return
        L8c:
            if (r6 == 0) goto Ld2
            boolean r2 = r5.f6510Q
            if (r2 != 0) goto Ld2
            boolean r2 = r5.f6518Y
            if (r2 == 0) goto La9
            int r2 = r5.Z
            r0 = r0 & r2
            if (r0 == 0) goto La9
            android.view.Window r0 = r5.f6528l
            android.view.View r0 = r0.getDecorView()
            g.s r2 = r5.f6519a0
            r0.removeCallbacks(r2)
            r2.run()
        La9:
            g.D r0 = r5.A(r1)
            l.m r2 = r0.h
            if (r2 == 0) goto Ld2
            boolean r4 = r0.f6491o
            if (r4 != 0) goto Ld2
            android.view.View r4 = r0.f6485g
            boolean r1 = r6.onPreparePanel(r1, r4, r2)
            if (r1 == 0) goto Ld2
            l.m r0 = r0.h
            r6.onMenuOpened(r3, r0)
            m.d0 r5 = r5.f6533r
            androidx.appcompat.widget.ActionBarOverlayLayout r5 = (androidx.appcompat.widget.ActionBarOverlayLayout) r5
            r5.k()
            m.e0 r5 = r5.f2393e
            m.V0 r5 = (m.V0) r5
            androidx.appcompat.widget.Toolbar r5 = r5.f7624a
            r5.v()
        Ld2:
            return
        Ld3:
            g.D r6 = r5.A(r1)
            r6.f6490n = r0
            r5.t(r6, r1)
            r0 = 0
            r5.F(r6, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g.LayoutInflaterFactory2C0351E.i(l.m):void");
    }

    @Override // g.r
    public final void j(int i) {
        x();
        ViewGroup viewGroup = (ViewGroup) this.f6495A.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f6527k).inflate(i, viewGroup);
        this.f6529m.a(this.f6528l.getCallback());
    }

    @Override // g.r
    public final void k(View view) {
        x();
        ViewGroup viewGroup = (ViewGroup) this.f6495A.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f6529m.a(this.f6528l.getCallback());
    }

    @Override // g.r
    public final void l(View view, ViewGroup.LayoutParams layoutParams) {
        x();
        ViewGroup viewGroup = (ViewGroup) this.f6495A.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f6529m.a(this.f6528l.getCallback());
    }

    @Override // g.r
    public final void m(CharSequence charSequence) {
        this.f6532q = charSequence;
        InterfaceC0457d0 interfaceC0457d0 = this.f6533r;
        if (interfaceC0457d0 != null) {
            interfaceC0457d0.setWindowTitle(charSequence);
            return;
        }
        AbstractC0354a abstractC0354a = this.f6531o;
        if (abstractC0354a != null) {
            abstractC0354a.n(charSequence);
            return;
        }
        TextView textView = this.f6496B;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0046  */
    /* JADX WARN: Type inference failed for: r2v0, types: [g.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v13, types: [k.e, l.k, java.lang.Object, k.b] */
    @Override // g.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final k.AbstractC0405b n(k.InterfaceC0404a r9) {
        /*
            Method dump skipped, instructions count: 447
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g.LayoutInflaterFactory2C0351E.n(k.a):k.b");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x017f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean o(boolean r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g.LayoutInflaterFactory2C0351E.o(boolean, boolean):boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0111, code lost:
    
        if (r10.equals("ImageButton") == false) goto L24;
     */
    @Override // android.view.LayoutInflater.Factory2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.View r9, java.lang.String r10, android.content.Context r11, android.util.AttributeSet r12) {
        /*
            Method dump skipped, instructions count: 620
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g.LayoutInflaterFactory2C0351E.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    public final void p(Window window) {
        Drawable drawable;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        if (this.f6528l != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof y) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        y yVar = new y(this, callback);
        this.f6529m = yVar;
        window.setCallback(yVar);
        int[] iArr = f6493i0;
        Context context = this.f6527k;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) {
            drawable = null;
        } else {
            C0487t a2 = C0487t.a();
            synchronized (a2) {
                drawable = a2.f7745a.d(context, resourceId, true);
            }
        }
        if (drawable != null) {
            window.setBackgroundDrawable(drawable);
        }
        obtainStyledAttributes.recycle();
        this.f6528l = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.f6524f0) != null) {
            return;
        }
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.f6525g0) != null) {
            x.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f6525g0 = null;
        }
        Object obj = this.f6526j;
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getWindow() != null) {
                this.f6524f0 = x.a(activity);
                J();
            }
        }
        this.f6524f0 = null;
        J();
    }

    public final void r(int i, C0350D c0350d, l.m mVar) {
        if (mVar == null) {
            if (c0350d == null && i >= 0) {
                C0350D[] c0350dArr = this.f6505L;
                if (i < c0350dArr.length) {
                    c0350d = c0350dArr[i];
                }
            }
            if (c0350d != null) {
                mVar = c0350d.h;
            }
        }
        if ((c0350d == null || c0350d.f6489m) && !this.f6510Q) {
            y yVar = this.f6529m;
            Window.Callback callback = this.f6528l.getCallback();
            yVar.getClass();
            try {
                yVar.f6675e = true;
                callback.onPanelClosed(i, mVar);
            } finally {
                yVar.f6675e = false;
            }
        }
    }

    public final void s(l.m mVar) {
        C0472l c0472l;
        if (this.f6504K) {
            return;
        }
        this.f6504K = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f6533r;
        actionBarOverlayLayout.k();
        ActionMenuView actionMenuView = ((V0) actionBarOverlayLayout.f2393e).f7624a.f2480a;
        if (actionMenuView != null && (c0472l = actionMenuView.f2416t) != null) {
            c0472l.c();
            C0462g c0462g = c0472l.f7693u;
            if (c0462g != null && c0462g.b()) {
                c0462g.i.dismiss();
            }
        }
        Window.Callback callback = this.f6528l.getCallback();
        if (callback != null && !this.f6510Q) {
            callback.onPanelClosed(108, mVar);
        }
        this.f6504K = false;
    }

    public final void t(C0350D c0350d, boolean z3) {
        C0349C c0349c;
        InterfaceC0457d0 interfaceC0457d0;
        if (z3 && c0350d.f6479a == 0 && (interfaceC0457d0 = this.f6533r) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0457d0;
            actionBarOverlayLayout.k();
            if (((V0) actionBarOverlayLayout.f2393e).f7624a.p()) {
                s(c0350d.h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.f6527k.getSystemService("window");
        if (windowManager != null && c0350d.f6489m && (c0349c = c0350d.f6483e) != null) {
            windowManager.removeView(c0349c);
            if (z3) {
                r(c0350d.f6479a, c0350d, null);
            }
        }
        c0350d.f6487k = false;
        c0350d.f6488l = false;
        c0350d.f6489m = false;
        c0350d.f6484f = null;
        c0350d.f6490n = true;
        if (this.f6506M == c0350d) {
            this.f6506M = null;
        }
        if (c0350d.f6479a == 0) {
            J();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0031, code lost:
    
        if (r4.dispatchKeyEvent(r7) != false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00ea, code lost:
    
        if (r6.c() != false) goto L79;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean v(android.view.KeyEvent r7) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g.LayoutInflaterFactory2C0351E.v(android.view.KeyEvent):boolean");
    }

    public final void w(int i) {
        C0350D A3 = A(i);
        if (A3.h != null) {
            Bundle bundle = new Bundle();
            A3.h.t(bundle);
            if (bundle.size() > 0) {
                A3.p = bundle;
            }
            A3.h.w();
            A3.h.clear();
        }
        A3.f6491o = true;
        A3.f6490n = true;
        if ((i == 108 || i == 0) && this.f6533r != null) {
            C0350D A4 = A(0);
            A4.f6487k = false;
            H(A4, null);
        }
    }

    public final void x() {
        ViewGroup viewGroup;
        int i = 1;
        int i4 = 0;
        if (this.f6541z) {
            return;
        }
        int[] iArr = AbstractC0336a.f6429j;
        Context context = this.f6527k;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!obtainStyledAttributes.hasValue(117)) {
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (obtainStyledAttributes.getBoolean(126, false)) {
            h(1);
        } else if (obtainStyledAttributes.getBoolean(117, false)) {
            h(108);
        }
        if (obtainStyledAttributes.getBoolean(118, false)) {
            h(109);
        }
        if (obtainStyledAttributes.getBoolean(119, false)) {
            h(10);
        }
        this.f6503I = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        y();
        this.f6528l.getDecorView();
        LayoutInflater from = LayoutInflater.from(context);
        if (this.J) {
            viewGroup = this.f6502H ? (ViewGroup) from.inflate(com.adif.elcanomovil.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(com.adif.elcanomovil.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.f6503I) {
            viewGroup = (ViewGroup) from.inflate(com.adif.elcanomovil.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.f6501G = false;
            this.f6500F = false;
        } else if (this.f6500F) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(com.adif.elcanomovil.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new C0407d(context, typedValue.resourceId) : context).inflate(com.adif.elcanomovil.R.layout.abc_screen_toolbar, (ViewGroup) null);
            InterfaceC0457d0 interfaceC0457d0 = (InterfaceC0457d0) viewGroup.findViewById(com.adif.elcanomovil.R.id.decor_content_parent);
            this.f6533r = interfaceC0457d0;
            interfaceC0457d0.setWindowCallback(this.f6528l.getCallback());
            if (this.f6501G) {
                ((ActionBarOverlayLayout) this.f6533r).j(109);
            }
            if (this.f6498D) {
                ((ActionBarOverlayLayout) this.f6533r).j(2);
            }
            if (this.f6499E) {
                ((ActionBarOverlayLayout) this.f6533r).j(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f6500F + ", windowActionBarOverlay: " + this.f6501G + ", android:windowIsFloating: " + this.f6503I + ", windowActionModeOverlay: " + this.f6502H + ", windowNoTitle: " + this.J + " }");
        }
        C0372t c0372t = new C0372t(this, i4);
        WeakHashMap weakHashMap = X.f1226a;
        O.L.u(viewGroup, c0372t);
        if (this.f6533r == null) {
            this.f6496B = (TextView) viewGroup.findViewById(com.adif.elcanomovil.R.id.title);
        }
        try {
            Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(viewGroup, new Object[0]);
        } catch (IllegalAccessException e4) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e4);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e5) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e5);
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(com.adif.elcanomovil.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.f6528l.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f6528l.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new C0372t(this, i));
        this.f6495A = viewGroup;
        Object obj = this.f6526j;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.f6532q;
        if (!TextUtils.isEmpty(title)) {
            InterfaceC0457d0 interfaceC0457d02 = this.f6533r;
            if (interfaceC0457d02 != null) {
                interfaceC0457d02.setWindowTitle(title);
            } else {
                AbstractC0354a abstractC0354a = this.f6531o;
                if (abstractC0354a != null) {
                    abstractC0354a.n(title);
                } else {
                    TextView textView = this.f6496B;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.f6495A.findViewById(R.id.content);
        View decorView = this.f6528l.getDecorView();
        contentFrameLayout2.f2444g.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        if (contentFrameLayout2.isLaidOut()) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(iArr);
        obtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
        obtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
        if (obtainStyledAttributes2.hasValue(122)) {
            obtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
        }
        if (obtainStyledAttributes2.hasValue(123)) {
            obtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
        }
        if (obtainStyledAttributes2.hasValue(120)) {
            obtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
        }
        if (obtainStyledAttributes2.hasValue(121)) {
            obtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
        }
        obtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.f6541z = true;
        C0350D A3 = A(0);
        if (this.f6510Q || A3.h != null) {
            return;
        }
        C(108);
    }

    public final void y() {
        if (this.f6528l == null) {
            Object obj = this.f6526j;
            if (obj instanceof Activity) {
                p(((Activity) obj).getWindow());
            }
        }
        if (this.f6528l == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, R0.h] */
    public final AbstractC0348B z(Context context) {
        if (this.f6516W == null) {
            if (R0.h.f1412d == null) {
                Context applicationContext = context.getApplicationContext();
                LocationManager locationManager = (LocationManager) applicationContext.getSystemService(FirebaseAnalytics.Param.LOCATION);
                ?? obj = new Object();
                obj.f1415c = new Object();
                obj.f1413a = applicationContext;
                obj.f1414b = locationManager;
                R0.h.f1412d = obj;
            }
            this.f6516W = new z(this, R0.h.f1412d);
        }
        return this.f6516W;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
