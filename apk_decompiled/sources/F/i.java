package F;

import O.C0079u;
import O.D0;
import O.InterfaceC0080v;
import O.J;
import O.X;
import O.h0;
import O.t0;
import O.u0;
import O.v0;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.text.Editable;
import android.text.Spannable;
import android.text.SpannableString;
import android.util.SparseIntArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.C0234o0;
import androidx.recyclerview.widget.I0;
import androidx.recyclerview.widget.O0;
import androidx.recyclerview.widget.R0;
import androidx.recyclerview.widget.S0;
import androidx.viewpager.widget.ViewPager;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import d0.t;
import d0.v;
import f0.C0337a;
import f0.C0346j;
import g.LayoutInflaterFactory2C0351E;
import g.u;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.WeakHashMap;
import k.AbstractC0405b;
import k.InterfaceC0404a;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.Channel;
import u.AbstractC0629f;
import u.C0630g;
import w0.InterfaceC0647c;
import w0.InterfaceC0648d;

/* loaded from: classes.dex */
public final class i implements InterfaceC0080v, Q0.h, d0.m, InterfaceC0404a, InterfaceC0648d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f489a;

    /* renamed from: b, reason: collision with root package name */
    public Object f490b;

    /* renamed from: c, reason: collision with root package name */
    public Object f491c;

    public /* synthetic */ i(int i, Object obj, Object obj2) {
        this.f489a = i;
        this.f490b = obj;
        this.f491c = obj2;
    }

    public static String m(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
        }
        if (Modifier.isAbstract(modifiers)) {
            return "Abstract classes can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Class name: ".concat(cls.getName());
        }
        return null;
    }

    public static S0.f p(S0.j jVar, Throwable th) {
        if (th instanceof S0.m) {
            jVar.f1476B.getClass();
            S0.c cVar = W0.d.f1886a;
            jVar.f1476B.getClass();
        } else {
            jVar.f1476B.getClass();
            S0.c cVar2 = W0.d.f1886a;
        }
        return new S0.f(null, jVar, th);
    }

    public static int u(int i, int i4) {
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < i; i7++) {
            i5++;
            if (i5 == i4) {
                i6++;
                i5 = 0;
            } else if (i5 > i4) {
                i6++;
                i5 = 1;
            }
        }
        return i5 + 1 > i4 ? i6 + 1 : i6;
    }

    public static boolean w(S0.j jVar, Bitmap.Config config) {
        if (config == Bitmap.Config.HARDWARE) {
            if (jVar.f1487m) {
                U0.b bVar = jVar.f1479c;
                if (bVar instanceof U0.a) {
                    ImageView imageView = ((U0.a) bVar).f1775b;
                    if (!imageView.isAttachedToWindow() || imageView.isHardwareAccelerated()) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public void A(int i, int i4) {
        int[] iArr = (int[]) this.f490b;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i5 = i + i4;
        o(i5);
        int[] iArr2 = (int[]) this.f490b;
        System.arraycopy(iArr2, i5, iArr2, i, (iArr2.length - i) - i4);
        int[] iArr3 = (int[]) this.f490b;
        Arrays.fill(iArr3, iArr3.length - i4, iArr3.length, -1);
        ArrayList arrayList = (ArrayList) this.f491c;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            O0 o02 = (O0) ((ArrayList) this.f491c).get(size);
            int i6 = o02.f3611a;
            if (i6 >= i) {
                if (i6 < i5) {
                    ((ArrayList) this.f491c).remove(size);
                } else {
                    o02.f3611a = i6 - i4;
                }
            }
        }
    }

    public void B(L.f fVar) {
        int i = fVar.f1031b;
        Handler handler = (Handler) this.f491c;
        A.a aVar = (A.a) this.f490b;
        if (i != 0) {
            handler.post(new H0.p(i, 1, aVar));
        } else {
            handler.post(new L.a(0, aVar, fVar.f1030a));
        }
    }

    public S0.o C(S0.j jVar, T0.h hVar) {
        Bitmap.Config config;
        Bitmap.Config config2 = ((jVar.h.isEmpty() || ArraysKt.contains(W0.f.f1887a, jVar.f1482f)) && ((config = jVar.f1482f) != Bitmap.Config.HARDWARE || w(jVar, config))) ? jVar.f1482f : Bitmap.Config.ARGB_8888;
        S0.b bVar = ((W0.j) this.f491c).f1902d ? jVar.f1491r : S0.b.f1444d;
        m3.l lVar = hVar.f1643a;
        T0.b bVar2 = T0.b.f1632a;
        return new S0.o(jVar.f1477a, config2, null, hVar, (Intrinsics.areEqual(lVar, bVar2) || Intrinsics.areEqual(hVar.f1644b, bVar2)) ? T0.g.f1639b : jVar.f1498y, W0.d.a(jVar), jVar.f1488n && jVar.h.isEmpty() && config2 != Bitmap.Config.ALPHA_8, jVar.f1489o, jVar.f1481e, jVar.f1484j, jVar.f1485k, jVar.f1499z, jVar.p, jVar.f1490q, bVar);
    }

    public C0079u D(I0 i02, int i) {
        S0 s02;
        C0079u c0079u;
        s.j jVar = (s.j) this.f490b;
        int d4 = jVar.d(i02);
        if (d4 >= 0 && (s02 = (S0) jVar.i(d4)) != null) {
            int i4 = s02.f3727a;
            if ((i4 & i) != 0) {
                int i5 = i4 & (~i);
                s02.f3727a = i5;
                if (i == 4) {
                    c0079u = s02.f3728b;
                } else {
                    if (i != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    c0079u = s02.f3729c;
                }
                if ((i5 & 12) == 0) {
                    jVar.g(d4);
                    s02.f3727a = 0;
                    s02.f3728b = null;
                    s02.f3729c = null;
                    S0.f3726d.c(s02);
                }
                return c0079u;
            }
        }
        return null;
    }

    public void E(I0 i02) {
        S0 s02 = (S0) ((s.j) this.f490b).get(i02);
        if (s02 == null) {
            return;
        }
        s02.f3727a &= -2;
    }

    public void F(I0 i02) {
        s.g gVar = (s.g) this.f491c;
        int g4 = gVar.g() - 1;
        while (true) {
            if (g4 < 0) {
                break;
            }
            if (i02 == gVar.h(g4)) {
                Object[] objArr = gVar.f8346c;
                Object obj = objArr[g4];
                Object obj2 = s.h.f8348a;
                if (obj != obj2) {
                    objArr[g4] = obj2;
                    gVar.f8344a = true;
                }
            } else {
                g4--;
            }
        }
        S0 s02 = (S0) ((s.j) this.f490b).remove(i02);
        if (s02 != null) {
            s02.f3727a = 0;
            s02.f3728b = null;
            s02.f3729c = null;
            S0.f3726d.c(s02);
        }
    }

    public void G(int i, int i4, int i5, int i6) {
        CardView cardView = (CardView) this.f491c;
        cardView.f2512d.set(i, i4, i5, i6);
        Rect rect = cardView.f2511c;
        CardView.a(cardView, i + rect.left, i4 + rect.top, i5 + rect.right, i6 + rect.bottom);
    }

    @Override // Q0.h
    public boolean a(Q0.b bVar) {
        return ((Q0.f) this.f491c).remove(bVar) != null;
    }

    @Override // Q0.h
    public Q0.c b(Q0.b bVar) {
        Q0.e eVar = (Q0.e) ((Q0.f) this.f491c).get(bVar);
        if (eVar != null) {
            return new Q0.c(eVar.f1360a, eVar.f1361b);
        }
        return null;
    }

    @Override // Q0.h
    public void c(int i) {
        Q0.f fVar = (Q0.f) this.f491c;
        if (i >= 40) {
            fVar.evictAll();
        } else {
            if (10 > i || i >= 20) {
                return;
            }
            fVar.trimToSize(fVar.size() / 2);
        }
    }

    @Override // d0.m
    public Object d() {
        return (v) this.f490b;
    }

    @Override // k.InterfaceC0404a
    public boolean e(AbstractC0405b abstractC0405b, MenuItem menuItem) {
        return ((InterfaceC0404a) this.f490b).e(abstractC0405b, menuItem);
    }

    @Override // k.InterfaceC0404a
    public boolean f(AbstractC0405b abstractC0405b, l.m mVar) {
        ViewGroup viewGroup = ((LayoutInflaterFactory2C0351E) this.f491c).f6495A;
        WeakHashMap weakHashMap = X.f1226a;
        J.c(viewGroup);
        return ((InterfaceC0404a) this.f490b).f(abstractC0405b, mVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, x2.p] */
    @Override // O.InterfaceC0080v
    public D0 g(View view, D0 d02) {
        switch (this.f489a) {
            case 1:
                D0 f2 = X.f(view, d02);
                if (f2.f1207a.m()) {
                    return f2;
                }
                int b4 = f2.b();
                Rect rect = (Rect) this.f490b;
                rect.left = b4;
                rect.top = f2.d();
                rect.right = f2.c();
                rect.bottom = f2.a();
                ViewPager viewPager = (ViewPager) this.f491c;
                int childCount = viewPager.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    D0 b5 = X.b(viewPager.getChildAt(i), f2);
                    rect.left = Math.min(b5.b(), rect.left);
                    rect.top = Math.min(b5.d(), rect.top);
                    rect.right = Math.min(b5.c(), rect.right);
                    rect.bottom = Math.min(b5.a(), rect.bottom);
                }
                int i4 = rect.left;
                int i5 = rect.top;
                int i6 = rect.right;
                int i7 = rect.bottom;
                v0 u0Var = Build.VERSION.SDK_INT >= 30 ? new u0(f2) : new t0(f2);
                u0Var.f(G.c.b(i4, i5, i6, i7));
                return u0Var.b();
            default:
                ?? obj = new Object();
                x2.p pVar = (x2.p) this.f491c;
                obj.f8969a = pVar.f8969a;
                obj.f8970b = pVar.f8970b;
                obj.f8971c = pVar.f8971c;
                obj.f8972d = pVar.f8972d;
                return ((x2.o) this.f490b).c(view, d02, obj);
        }
    }

    @Override // Q0.h
    public void h(Q0.b bVar, Bitmap bitmap, Map map) {
        int r4 = m3.d.r(bitmap);
        Q0.f fVar = (Q0.f) this.f491c;
        if (r4 <= fVar.maxSize()) {
            fVar.put(bVar, new Q0.e(bitmap, map, r4));
        } else {
            fVar.remove(bVar);
            ((Q0.i) this.f490b).e(bVar, bitmap, map, r4);
        }
    }

    @Override // k.InterfaceC0404a
    public boolean i(AbstractC0405b abstractC0405b, l.m mVar) {
        return ((InterfaceC0404a) this.f490b).i(abstractC0405b, mVar);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [g.l, java.lang.Object] */
    @Override // k.InterfaceC0404a
    public void j(AbstractC0405b abstractC0405b) {
        ((InterfaceC0404a) this.f490b).j(abstractC0405b);
        LayoutInflaterFactory2C0351E layoutInflaterFactory2C0351E = (LayoutInflaterFactory2C0351E) this.f491c;
        if (layoutInflaterFactory2C0351E.f6538w != null) {
            layoutInflaterFactory2C0351E.f6528l.getDecorView().removeCallbacks(layoutInflaterFactory2C0351E.f6539x);
        }
        if (layoutInflaterFactory2C0351E.f6537v != null) {
            h0 h0Var = layoutInflaterFactory2C0351E.f6540y;
            if (h0Var != null) {
                h0Var.b();
            }
            h0 a2 = X.a(layoutInflaterFactory2C0351E.f6537v);
            a2.a(BitmapDescriptorFactory.HUE_RED);
            layoutInflaterFactory2C0351E.f6540y = a2;
            a2.d(new u(this, 2));
        }
        layoutInflaterFactory2C0351E.f6530n.onSupportActionModeFinished(layoutInflaterFactory2C0351E.f6536u);
        layoutInflaterFactory2C0351E.f6536u = null;
        ViewGroup viewGroup = layoutInflaterFactory2C0351E.f6495A;
        WeakHashMap weakHashMap = X.f1226a;
        J.c(viewGroup);
        layoutInflaterFactory2C0351E.J();
    }

    @Override // d0.m
    public boolean k(CharSequence charSequence, int i, int i4, t tVar) {
        if ((tVar.f6157c & 4) > 0) {
            return true;
        }
        if (((v) this.f490b) == null) {
            this.f490b = new v(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((E2.e) this.f491c).getClass();
        ((v) this.f490b).setSpan(new d0.u(tVar), i, i4, 33);
        return true;
    }

    public void l(I0 i02, C0079u c0079u) {
        s.j jVar = (s.j) this.f490b;
        S0 s02 = (S0) jVar.get(i02);
        if (s02 == null) {
            s02 = S0.a();
            jVar.put(i02, s02);
        }
        s02.f3729c = c0079u;
        s02.f3727a |= 8;
    }

    public void n() {
        int[] iArr = (int[]) this.f490b;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.f491c = null;
    }

    public void o(int i) {
        int[] iArr = (int[]) this.f490b;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i, 10) + 1];
            this.f490b = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i >= iArr.length) {
            int length = iArr.length;
            while (length <= i) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.f490b = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = (int[]) this.f490b;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    public View q(int i, int i4, int i5, int i6) {
        View u3;
        C0234o0 c0234o0 = (C0234o0) this.f490b;
        int d4 = c0234o0.d();
        int c4 = c0234o0.c();
        int i7 = i4 > i ? 1 : -1;
        View view = null;
        while (i != i4) {
            switch (c0234o0.f3862a) {
                case 0:
                    u3 = c0234o0.f3863b.u(i);
                    break;
                default:
                    u3 = c0234o0.f3863b.u(i);
                    break;
            }
            int b4 = c0234o0.b(u3);
            int a2 = c0234o0.a(u3);
            R0 r02 = (R0) this.f491c;
            r02.f3638b = d4;
            r02.f3639c = c4;
            r02.f3640d = b4;
            r02.f3641e = a2;
            if (i5 != 0) {
                r02.f3637a = i5;
                if (r02.a()) {
                    return u3;
                }
            }
            if (i6 != 0) {
                r02.f3637a = i6;
                if (r02.a()) {
                    view = u3;
                }
            }
            i += i7;
        }
        return view;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x008a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public S2.p r(X2.a r9) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: F.i.r(X2.a):S2.p");
    }

    @Override // w0.InterfaceC0648d
    public void s(InterfaceC0647c statement) {
        Intrinsics.checkNotNullParameter(statement, "statement");
        Intrinsics.checkNotNullParameter(statement, "statement");
        Object[] objArr = (Object[]) this.f491c;
        if (objArr == null) {
            return;
        }
        int length = objArr.length;
        int i = 0;
        while (i < length) {
            Object obj = objArr[i];
            i++;
            if (obj == null) {
                statement.t(i);
            } else if (obj instanceof byte[]) {
                statement.N(i, (byte[]) obj);
            } else if (obj instanceof Float) {
                statement.v(i, ((Number) obj).floatValue());
            } else if (obj instanceof Double) {
                statement.v(i, ((Number) obj).doubleValue());
            } else if (obj instanceof Long) {
                statement.I(i, ((Number) obj).longValue());
            } else if (obj instanceof Integer) {
                statement.I(i, ((Number) obj).intValue());
            } else if (obj instanceof Short) {
                statement.I(i, ((Number) obj).shortValue());
            } else if (obj instanceof Byte) {
                statement.I(i, ((Number) obj).byteValue());
            } else if (obj instanceof String) {
                statement.k(i, (String) obj);
            } else {
                if (!(obj instanceof Boolean)) {
                    throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
                }
                statement.I(i, ((Boolean) obj).booleanValue() ? 1L : 0L);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.android.datatransport.cct.CctBackendFactory t(java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: F.i.t(java.lang.String):com.google.android.datatransport.cct.CctBackendFactory");
    }

    public String toString() {
        switch (this.f489a) {
            case 3:
                return "Bounds{lower=" + ((G.c) this.f490b) + " upper=" + ((G.c) this.f491c) + "}";
            case 6:
                return ((Map) this.f490b).toString();
            case 19:
                String str = "[ ";
                if (((C0630g) this.f490b) != null) {
                    for (int i = 0; i < 9; i++) {
                        StringBuilder a2 = AbstractC0629f.a(str);
                        a2.append(((C0630g) this.f490b).h[i]);
                        a2.append(" ");
                        str = a2.toString();
                    }
                }
                return str + "] " + ((C0630g) this.f490b);
            default:
                return super.toString();
        }
    }

    public void v() {
        ((SparseIntArray) this.f490b).clear();
    }

    @Override // w0.InterfaceC0648d
    public String x() {
        return (String) this.f490b;
    }

    public boolean y(View view) {
        C0234o0 c0234o0 = (C0234o0) this.f490b;
        int d4 = c0234o0.d();
        int c4 = c0234o0.c();
        int b4 = c0234o0.b(view);
        int a2 = c0234o0.a(view);
        R0 r02 = (R0) this.f491c;
        r02.f3638b = d4;
        r02.f3639c = c4;
        r02.f3640d = b4;
        r02.f3641e = a2;
        r02.f3637a = 24579;
        return r02.a();
    }

    public void z(int i, int i4) {
        int[] iArr = (int[]) this.f490b;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i5 = i + i4;
        o(i5);
        int[] iArr2 = (int[]) this.f490b;
        System.arraycopy(iArr2, i, iArr2, i5, (iArr2.length - i) - i4);
        Arrays.fill((int[]) this.f490b, i, i5, -1);
        ArrayList arrayList = (ArrayList) this.f491c;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            O0 o02 = (O0) ((ArrayList) this.f491c).get(size);
            int i6 = o02.f3611a;
            if (i6 >= i) {
                o02.f3611a = i6 + i4;
            }
        }
    }

    public /* synthetic */ i(Object obj, int i) {
        this.f489a = i;
        this.f491c = obj;
    }

    public i(String query, Object[] objArr) {
        this.f489a = 20;
        Intrinsics.checkNotNullParameter(query, "query");
        this.f490b = query;
        this.f491c = objArr;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(String query) {
        this(query, (Object[]) null);
        this.f489a = 20;
        Intrinsics.checkNotNullParameter(query, "query");
    }

    public i(int i, Q0.i iVar) {
        this.f489a = 4;
        this.f490b = iVar;
        this.f491c = new Q0.f(i, this);
    }

    public i(Context context) {
        this.f489a = 7;
        this.f491c = null;
        this.f490b = context;
    }

    public i(String[] tables, Channel channel) {
        this.f489a = 13;
        this.f491c = channel;
        this.f489a = 13;
        Intrinsics.checkNotNullParameter(tables, "tables");
        this.f490b = tables;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, androidx.recyclerview.widget.R0] */
    public i(C0234o0 c0234o0) {
        this.f489a = 11;
        this.f490b = c0234o0;
        ?? obj = new Object();
        obj.f3637a = 0;
        this.f491c = obj;
    }

    public i(ArrayList arrayList, ArrayList arrayList2) {
        this.f489a = 0;
        int size = arrayList.size();
        this.f490b = new int[size];
        this.f491c = new float[size];
        for (int i = 0; i < size; i++) {
            ((int[]) this.f490b)[i] = ((Integer) arrayList.get(i)).intValue();
            ((float[]) this.f491c)[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    public i(int i, int i4) {
        this.f489a = 0;
        this.f490b = new int[]{i, i4};
        this.f491c = new float[]{BitmapDescriptorFactory.HUE_RED, 1.0f};
    }

    public i(int i, int i4, int i5) {
        this.f489a = 0;
        this.f490b = new int[]{i, i4, i5};
        this.f491c = new float[]{BitmapDescriptorFactory.HUE_RED, 0.5f, 1.0f};
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [android.text.Editable$Factory, f0.a] */
    public i(EditText editText) {
        this.f489a = 15;
        this.f490b = editText;
        C0346j c0346j = new C0346j(editText);
        this.f491c = c0346j;
        editText.addTextChangedListener(c0346j);
        if (C0337a.f6446b == null) {
            synchronized (C0337a.f6445a) {
                try {
                    if (C0337a.f6446b == null) {
                        ?? factory = new Editable.Factory();
                        try {
                            C0337a.f6447c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, C0337a.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        C0337a.f6446b = factory;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(C0337a.f6446b);
    }

    public i(ViewPager viewPager) {
        this.f489a = 1;
        this.f491c = viewPager;
        this.f490b = new Rect();
    }

    public i(int i) {
        this.f489a = i;
        switch (i) {
            case 10:
                return;
            case 11:
            default:
                this.f490b = new SparseIntArray();
                this.f491c = new SparseIntArray();
                return;
            case 12:
                this.f490b = new s.j(0);
                this.f491c = new s.g();
                return;
        }
    }

    public i(LayoutInflaterFactory2C0351E layoutInflaterFactory2C0351E, InterfaceC0404a interfaceC0404a) {
        this.f489a = 16;
        this.f491c = layoutInflaterFactory2C0351E;
        this.f490b = interfaceC0404a;
    }
}
