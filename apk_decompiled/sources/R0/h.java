package R0;

import F.q;
import I0.p;
import W0.j;
import a.AbstractC0106b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.Choreographer;
import android.view.KeyEvent;
import androidx.lifecycle.A0;
import androidx.lifecycle.C0;
import androidx.lifecycle.w0;
import androidx.lifecycle.y0;
import c0.ChoreographerFrameCallbackC0275a;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import d0.C0305c;
import d0.m;
import d0.n;
import d0.t;
import d0.u;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import l0.C0435a;
import m.C0487t;
import m.O;
import m0.C0503c;
import x.C0653b;

/* loaded from: classes.dex */
public final class h implements f {

    /* renamed from: d, reason: collision with root package name */
    public static h f1412d;

    /* renamed from: a, reason: collision with root package name */
    public Object f1413a;

    /* renamed from: b, reason: collision with root package name */
    public Object f1414b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1415c;

    public /* synthetic */ h(Object obj, Object obj2, Object obj3) {
        this.f1413a = obj;
        this.f1414b = obj2;
        this.f1415c = obj3;
    }

    public static final void a(h hVar, Network network, boolean z3) {
        Unit unit;
        boolean z4;
        Network[] allNetworks = ((ConnectivityManager) hVar.f1413a).getAllNetworks();
        int length = allNetworks.length;
        boolean z5 = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            Network network2 = allNetworks[i];
            if (Intrinsics.areEqual(network2, network)) {
                z4 = z3;
            } else {
                NetworkCapabilities networkCapabilities = ((ConnectivityManager) hVar.f1413a).getNetworkCapabilities(network2);
                z4 = networkCapabilities != null && networkCapabilities.hasCapability(12);
            }
            if (z4) {
                z5 = true;
                break;
            }
            i++;
        }
        j jVar = (j) hVar.f1414b;
        if (((p) jVar.f1900b.get()) != null) {
            jVar.f1902d = z5;
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            jVar.a();
        }
    }

    public static boolean c(Editable editable, KeyEvent keyEvent, boolean z3) {
        u[] uVarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (uVarArr = (u[]) editable.getSpans(selectionStart, selectionEnd, u.class)) != null && uVarArr.length > 0) {
                for (u uVar : uVarArr) {
                    int spanStart = editable.getSpanStart(uVar);
                    int spanEnd = editable.getSpanEnd(uVar);
                    if ((z3 && spanStart == selectionStart) || ((!z3 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static h l(Context context, AttributeSet attributeSet, int[] iArr, int i) {
        return new h(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
    }

    public W1.j b() {
        String str = ((String) this.f1413a) == null ? " backendName" : "";
        if (((T1.d) this.f1415c) == null) {
            str = str.concat(" priority");
        }
        if (str.isEmpty()) {
            return new W1.j((String) this.f1413a, (byte[]) this.f1414b, (T1.d) this.f1415c);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    @Override // R0.f
    public boolean d() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f1413a;
        for (Network network : connectivityManager.getAllNetworks()) {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
            if (networkCapabilities != null && networkCapabilities.hasCapability(12)) {
                return true;
            }
        }
        return false;
    }

    public ColorStateList e(int i) {
        int resourceId;
        ColorStateList colorStateList;
        TypedArray typedArray = (TypedArray) this.f1414b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateList = D.h.getColorStateList((Context) this.f1413a, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateList;
    }

    public Drawable f(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f1414b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : AbstractC0106b.m((Context) this.f1413a, resourceId);
    }

    public Drawable g(int i) {
        int resourceId;
        Drawable d4;
        if (!((TypedArray) this.f1414b).hasValue(i) || (resourceId = ((TypedArray) this.f1414b).getResourceId(i, 0)) == 0) {
            return null;
        }
        C0487t a2 = C0487t.a();
        Context context = (Context) this.f1413a;
        synchronized (a2) {
            d4 = a2.f7745a.d(context, resourceId, true);
        }
        return d4;
    }

    public Typeface h(int i, int i4, O o4) {
        int resourceId = ((TypedArray) this.f1414b).getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.f1415c) == null) {
            this.f1415c = new TypedValue();
        }
        TypedValue typedValue = (TypedValue) this.f1415c;
        ThreadLocal threadLocal = q.f503a;
        Context context = (Context) this.f1413a;
        if (context.isRestricted()) {
            return null;
        }
        return q.b(context, resourceId, typedValue, i4, o4, true, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public w0 i(KClass modelClass, String key) {
        w0 viewModel;
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(key, "key");
        C0 c02 = (C0) this.f1413a;
        c02.getClass();
        Intrinsics.checkNotNullParameter(key, "key");
        LinkedHashMap linkedHashMap = c02.f3288a;
        w0 w0Var = (w0) linkedHashMap.get(key);
        boolean isInstance = modelClass.isInstance(w0Var);
        y0 y0Var = (y0) this.f1414b;
        if (isInstance) {
            if (y0Var instanceof A0) {
                Intrinsics.checkNotNull(w0Var);
                ((A0) y0Var).a(w0Var);
            }
            Intrinsics.checkNotNull(w0Var, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.ViewModelProviderImpl.getViewModel");
            return w0Var;
        }
        l0.d dVar = new l0.d((l0.c) this.f1415c);
        dVar.b(C0503c.f7792a, key);
        try {
            viewModel = y0Var.create(modelClass, dVar);
        } catch (Error unused) {
            viewModel = y0Var.create(modelClass, C0435a.f7312b);
        }
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        w0 w0Var2 = (w0) linkedHashMap.put(key, viewModel);
        if (w0Var2 != null) {
            w0Var2.clear$lifecycle_viewmodel_release();
        }
        return viewModel;
    }

    public boolean j(CharSequence charSequence, int i, int i4, t tVar) {
        if ((tVar.f6157c & 3) == 0) {
            C0305c c0305c = (C0305c) this.f1415c;
            e0.a b4 = tVar.b();
            int a2 = b4.a(8);
            if (a2 != 0) {
                ((ByteBuffer) b4.f1221d).getShort(a2 + b4.f1218a);
            }
            c0305c.getClass();
            ThreadLocal threadLocal = C0305c.f6116b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i4) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            TextPaint textPaint = c0305c.f6117a;
            String sb2 = sb.toString();
            int i5 = G.e.f562a;
            boolean a4 = G.d.a(textPaint, sb2);
            int i6 = tVar.f6157c & 4;
            tVar.f6157c = a4 ? i6 | 2 : i6 | 1;
        }
        return (tVar.f6157c & 3) == 2;
    }

    public boolean k(int i, androidx.constraintlayout.widget.f fVar, w.d dVar) {
        int[] iArr = dVar.f8715p0;
        int i4 = iArr[0];
        C0653b c0653b = (C0653b) this.f1414b;
        c0653b.f8811a = i4;
        c0653b.f8812b = iArr[1];
        c0653b.f8813c = dVar.q();
        c0653b.f8814d = dVar.k();
        c0653b.i = false;
        c0653b.f8818j = i;
        boolean z3 = c0653b.f8811a == 3;
        boolean z4 = c0653b.f8812b == 3;
        boolean z5 = z3 && dVar.f8684W > BitmapDescriptorFactory.HUE_RED;
        boolean z6 = z4 && dVar.f8684W > BitmapDescriptorFactory.HUE_RED;
        int[] iArr2 = dVar.f8719t;
        if (z5 && iArr2[0] == 4) {
            c0653b.f8811a = 1;
        }
        if (z6 && iArr2[1] == 4) {
            c0653b.f8812b = 1;
        }
        fVar.b(dVar, c0653b);
        dVar.O(c0653b.f8815e);
        dVar.L(c0653b.f8816f);
        dVar.f8667E = c0653b.h;
        dVar.I(c0653b.f8817g);
        c0653b.f8818j = 0;
        return c0653b.i;
    }

    public Object m(CharSequence charSequence, int i, int i4, int i5, boolean z3, m mVar) {
        int i6;
        char c4;
        n nVar = new n((d0.q) ((A.j) this.f1414b).f29c);
        int codePointAt = Character.codePointAt(charSequence, i);
        boolean z4 = true;
        int i7 = 0;
        int i8 = i;
        loop0: while (true) {
            i6 = i8;
            while (i8 < i4 && i7 < i5 && z4) {
                SparseArray sparseArray = nVar.f6136c.f6148a;
                d0.q qVar = sparseArray == null ? null : (d0.q) sparseArray.get(codePointAt);
                if (nVar.f6134a == 2) {
                    if (qVar != null) {
                        nVar.f6136c = qVar;
                        nVar.f6139f++;
                    } else {
                        if (codePointAt == 65038) {
                            nVar.a();
                        } else if (codePointAt != 65039) {
                            d0.q qVar2 = nVar.f6136c;
                            if (qVar2.f6149b != null) {
                                if (nVar.f6139f != 1) {
                                    nVar.f6137d = qVar2;
                                    nVar.a();
                                } else if (nVar.b()) {
                                    nVar.f6137d = nVar.f6136c;
                                    nVar.a();
                                } else {
                                    nVar.a();
                                }
                                c4 = 3;
                            } else {
                                nVar.a();
                            }
                        }
                        c4 = 1;
                    }
                    c4 = 2;
                } else if (qVar == null) {
                    nVar.a();
                    c4 = 1;
                } else {
                    nVar.f6134a = 2;
                    nVar.f6136c = qVar;
                    nVar.f6139f = 1;
                    c4 = 2;
                }
                nVar.f6138e = codePointAt;
                if (c4 == 1) {
                    i8 = Character.charCount(Character.codePointAt(charSequence, i6)) + i6;
                    if (i8 < i4) {
                        codePointAt = Character.codePointAt(charSequence, i8);
                    }
                } else if (c4 == 2) {
                    int charCount = Character.charCount(codePointAt) + i8;
                    if (charCount < i4) {
                        codePointAt = Character.codePointAt(charSequence, charCount);
                    }
                    i8 = charCount;
                } else if (c4 == 3) {
                    if (z3 || !j(charSequence, i6, i8, nVar.f6137d.f6149b)) {
                        z4 = mVar.k(charSequence, i6, i8, nVar.f6137d.f6149b);
                        i7++;
                    }
                }
            }
        }
        if (nVar.f6134a == 2 && nVar.f6136c.f6149b != null && ((nVar.f6139f > 1 || nVar.b()) && i7 < i5 && z4 && (z3 || !j(charSequence, i6, i8, nVar.f6136c.f6149b)))) {
            mVar.k(charSequence, i6, i8, nVar.f6136c.f6149b);
        }
        return mVar.d();
    }

    public void n() {
        ((TypedArray) this.f1414b).recycle();
    }

    public void o(String str) {
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f1413a = str;
    }

    public void p(w.e eVar, int i, int i4, int i5) {
        int i6 = eVar.f8690b0;
        int i7 = eVar.f8692c0;
        eVar.f8690b0 = 0;
        eVar.f8692c0 = 0;
        eVar.O(i4);
        eVar.L(i5);
        if (i6 < 0) {
            eVar.f8690b0 = 0;
        } else {
            eVar.f8690b0 = i6;
        }
        if (i7 < 0) {
            eVar.f8692c0 = 0;
        } else {
            eVar.f8692c0 = i7;
        }
        w.e eVar2 = (w.e) this.f1415c;
        eVar2.f8739t0 = i;
        eVar2.U();
    }

    public void q(w.e eVar) {
        ArrayList arrayList = (ArrayList) this.f1413a;
        arrayList.clear();
        int size = eVar.f8736q0.size();
        for (int i = 0; i < size; i++) {
            w.d dVar = (w.d) eVar.f8736q0.get(i);
            int[] iArr = dVar.f8715p0;
            if (iArr[0] == 3 || iArr[1] == 3) {
                arrayList.add(dVar);
            }
        }
        eVar.f8738s0.f8293b = true;
    }

    @Override // R0.f
    public void shutdown() {
        ((ConnectivityManager) this.f1413a).unregisterNetworkCallback((g) this.f1415c);
    }

    public h(C0 store, y0 factory, l0.c extras) {
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(extras, "extras");
        this.f1413a = store;
        this.f1414b = factory;
        this.f1415c = extras;
    }

    public h(Context context, TypedArray typedArray) {
        this.f1413a = context;
        this.f1414b = typedArray;
    }

    public h(A.a aVar) {
        this.f1413a = aVar;
        this.f1414b = Choreographer.getInstance();
        this.f1415c = new ChoreographerFrameCallbackC0275a(this);
    }
}
