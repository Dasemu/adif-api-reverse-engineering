package m3;

import C.AbstractC0045i;
import C.AbstractC0046j;
import C.w;
import O.C0079u;
import O.i0;
import a.AbstractC0106b;
import android.app.AppOpsManager;
import android.app.Dialog;
import android.content.Context;
import android.content.res.ColorStateList;
import android.database.Cursor;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.ColorStateListDrawable;
import android.graphics.drawable.Drawable;
import android.os.Binder;
import android.os.Process;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.C0164o0;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0174y;
import androidx.lifecycle.C0;
import androidx.lifecycle.y0;
import androidx.navigation.fragment.NavHostFragment;
import androidx.room.A;
import androidx.room.u;
import e3.C0324j;
import e3.C0332s;
import e3.V;
import java.io.IOException;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlin.collections.ArraysKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.ExecutorsKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import l0.C0435a;
import o0.AbstractC0544v;
import o0.C0545w;
import o0.I;
import o0.K;
import o0.L;
import r3.C0573e;

/* loaded from: classes3.dex */
public abstract class l implements i0 {
    public static boolean E(EditText editText) {
        return editText.getInputType() != 0;
    }

    public static String J(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (str2.length() > i) {
                sb.append(str2.charAt(i));
            }
        }
        return sb.toString();
    }

    public static final K K(Function1 optionsBuilder) {
        Intrinsics.checkNotNullParameter(optionsBuilder, "optionsBuilder");
        L l4 = new L();
        optionsBuilder.invoke(l4);
        boolean z3 = l4.f7945b;
        C0079u c0079u = l4.f7944a;
        return new K(z3, false, l4.f7946c, false, l4.f7947d, c0079u.f1298a, c0079u.f1299b, -1, -1);
    }

    public static final boolean R(String method) {
        Intrinsics.checkNotNullParameter(method, "method");
        return (Intrinsics.areEqual(method, "GET") || Intrinsics.areEqual(method, "HEAD")) ? false : true;
    }

    public static a0.c S(String name) {
        CoroutineScope scope = CoroutineScopeKt.CoroutineScope(Dispatchers.getIO().plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)));
        Intrinsics.checkNotNullParameter(name, "name");
        a0.a produceMigrations = a0.a.f2319a;
        Intrinsics.checkNotNullParameter(produceMigrations, "produceMigrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        return new a0.c(name, produceMigrations, scope);
    }

    public static TypedValue T(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean U(Context context, int i, boolean z3) {
        TypedValue T3 = T(context, i);
        return (T3 == null || T3.type != 18) ? z3 : T3.data != 0;
    }

    public static TypedValue V(Context context, int i, String str) {
        TypedValue T3 = T(context, i);
        if (T3 != null) {
            return T3;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i)));
    }

    public static final List Z(List list) {
        int size = list.size();
        return size != 0 ? size != 1 ? Collections.unmodifiableList(new ArrayList(list)) : Collections.singletonList(CollectionsKt.first(list)) : CollectionsKt.emptyList();
    }

    public static final Map a0(Map map) {
        int size = map.size();
        if (size == 0) {
            return MapsKt.emptyMap();
        }
        if (size != 1) {
            return Collections.unmodifiableMap(new LinkedHashMap(map));
        }
        Map.Entry entry = (Map.Entry) CollectionsKt.i(map.entrySet());
        return Collections.singletonMap(entry.getKey(), entry.getValue());
    }

    public static C0573e d() {
        C0573e c0573e = C0573e.f8277l;
        Intrinsics.checkNotNull(c0573e);
        C0573e c0573e2 = c0573e.f8279f;
        if (c0573e2 == null) {
            long nanoTime = System.nanoTime();
            C0573e.i.await(C0573e.f8275j, TimeUnit.MILLISECONDS);
            C0573e c0573e3 = C0573e.f8277l;
            Intrinsics.checkNotNull(c0573e3);
            if (c0573e3.f8279f != null || System.nanoTime() - nanoTime < C0573e.f8276k) {
                return null;
            }
            return C0573e.f8277l;
        }
        long nanoTime2 = c0573e2.f8280g - System.nanoTime();
        if (nanoTime2 > 0) {
            C0573e.i.await(nanoTime2, TimeUnit.NANOSECONDS);
            return null;
        }
        C0573e c0573e4 = C0573e.f8277l;
        Intrinsics.checkNotNull(c0573e4);
        c0573e4.f8279f = c0573e2.f8279f;
        c0573e2.f8279f = null;
        return c0573e2;
    }

    public static void g(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "getStackTrace(...)");
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) ArraysKt.drop(stackTrace, 3).toArray(new StackTraceElement[0]);
        Throwable th = new Throwable(throwable.getClass() + ": " + throwable.getMessage(), throwable);
        th.setStackTrace(stackTraceElementArr);
        t3.c.f8551a.b(th);
    }

    public static int h(Context context, String str, String str2, int i, int i4) {
        int c4;
        if (context.checkPermission(str, i, i4) != -1) {
            String d4 = AbstractC0045i.d(str);
            if (d4 != null) {
                if (str2 == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(i4);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        str2 = packagesForUid[0];
                    }
                }
                int myUid = Process.myUid();
                String packageName = context.getPackageName();
                if (myUid == i4 && Objects.equals(packageName, str2)) {
                    AppOpsManager c5 = AbstractC0046j.c(context);
                    c4 = AbstractC0046j.a(c5, d4, Binder.getCallingUid(), str2);
                    if (c4 == 0) {
                        c4 = AbstractC0046j.a(c5, d4, i4, AbstractC0046j.b(context));
                    }
                } else {
                    c4 = AbstractC0045i.c((AppOpsManager) AbstractC0045i.a(context, AppOpsManager.class), d4, str2);
                }
                if (c4 != 0) {
                    return -2;
                }
            }
            return 0;
        }
        return -1;
    }

    public static int i(Context context, String str) {
        return h(context, str, context.getPackageName(), Process.myPid(), Process.myUid());
    }

    public static final Flow l(u uVar, boolean z3, String[] strArr, Callable callable) {
        return FlowKt.flow(new androidx.room.e(z3, uVar, strArr, callable, null));
    }

    public static final Object m(u uVar, Callable callable, Continuation continuation) {
        if (uVar.isOpenInternal() && uVar.inTransaction()) {
            return callable.call();
        }
        if (continuation.getContext().get(A.f3944a) != null) {
            throw new ClassCastException();
        }
        Map<String, Object> backingFieldMap = uVar.getBackingFieldMap();
        Object obj = backingFieldMap.get("TransactionDispatcher");
        if (obj == null) {
            obj = ExecutorsKt.from(uVar.getTransactionExecutor());
            backingFieldMap.put("TransactionDispatcher", obj);
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CoroutineDispatcher");
        return BuildersKt.withContext((CoroutineDispatcher) obj, new androidx.room.f(callable, null), continuation);
    }

    public static final AbstractC0544v n(androidx.fragment.app.K fragment) {
        Dialog dialog;
        Window window;
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        for (androidx.fragment.app.K k4 = fragment; k4 != null; k4 = k4.getParentFragment()) {
            if (k4 instanceof NavHostFragment) {
                I i = ((NavHostFragment) k4).f3454a;
                if (i != null) {
                    return i;
                }
                throw new NullPointerException("null cannot be cast to non-null type androidx.navigation.NavController");
            }
            androidx.fragment.app.K k5 = k4.getParentFragmentManager().f3180z;
            if (k5 instanceof NavHostFragment) {
                I i4 = ((NavHostFragment) k5).f3454a;
                if (i4 != null) {
                    return i4;
                }
                throw new NullPointerException("null cannot be cast to non-null type androidx.navigation.NavController");
            }
        }
        View view = fragment.getView();
        if (view != null) {
            return AbstractC0106b.g(view);
        }
        View view2 = null;
        DialogInterfaceOnCancelListenerC0174y dialogInterfaceOnCancelListenerC0174y = fragment instanceof DialogInterfaceOnCancelListenerC0174y ? (DialogInterfaceOnCancelListenerC0174y) fragment : null;
        if (dialogInterfaceOnCancelListenerC0174y != null && (dialog = dialogInterfaceOnCancelListenerC0174y.getDialog()) != null && (window = dialog.getWindow()) != null) {
            view2 = window.getDecorView();
        }
        if (view2 != null) {
            return AbstractC0106b.g(view2);
        }
        throw new IllegalStateException(w.m("Fragment ", fragment, " does not have a NavController set"));
    }

    public static C0332s o(SSLSession sSLSession) {
        List emptyList;
        Intrinsics.checkNotNullParameter(sSLSession, "<this>");
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        if (Intrinsics.areEqual(cipherSuite, "TLS_NULL_WITH_NULL_NULL") ? true : Intrinsics.areEqual(cipherSuite, "SSL_NULL_WITH_NULL_NULL")) {
            throw new IOException("cipherSuite == ".concat(cipherSuite));
        }
        C0324j c4 = C0324j.f6349b.c(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new IllegalStateException("tlsVersion == null");
        }
        if (Intrinsics.areEqual("NONE", protocol)) {
            throw new IOException("tlsVersion == NONE");
        }
        V p = d.p(protocol);
        try {
            Certificate[] peerCertificates = sSLSession.getPeerCertificates();
            emptyList = peerCertificates != null ? f3.c.k(Arrays.copyOf(peerCertificates, peerCertificates.length)) : CollectionsKt.emptyList();
        } catch (SSLPeerUnverifiedException unused) {
            emptyList = CollectionsKt.emptyList();
        }
        Certificate[] localCertificates = sSLSession.getLocalCertificates();
        return new C0332s(p, c4, localCertificates != null ? f3.c.k(Arrays.copyOf(localCertificates, localCertificates.length)) : CollectionsKt.emptyList(), new J0.e(emptyList, 8));
    }

    public static ColorStateList p(Drawable drawable) {
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (drawable instanceof ColorStateListDrawable) {
            return ((ColorStateListDrawable) drawable).getColorStateList();
        }
        return null;
    }

    public static final int q(Cursor c4, String name) {
        Intrinsics.checkNotNullParameter(c4, "c");
        Intrinsics.checkNotNullParameter(name, "name");
        int columnIndex = c4.getColumnIndex(name);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        int columnIndex2 = c4.getColumnIndex("`" + name + '`');
        if (columnIndex2 >= 0) {
            return columnIndex2;
        }
        return -1;
    }

    public static final int r(Cursor c4, String name) {
        String str;
        Intrinsics.checkNotNullParameter(c4, "c");
        Intrinsics.checkNotNullParameter(name, "name");
        int q4 = q(c4, name);
        if (q4 >= 0) {
            return q4;
        }
        try {
            String[] columnNames = c4.getColumnNames();
            Intrinsics.checkNotNullExpressionValue(columnNames, "c.columnNames");
            str = ArraysKt___ArraysKt.joinToString$default(columnNames, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 63, (Object) null);
        } catch (Exception e4) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", e4);
            str = "unknown";
        }
        throw new IllegalArgumentException("column '" + name + "' does not exist. Available columns: " + str);
    }

    public static C0545w w(C0 store) {
        Intrinsics.checkNotNullParameter(store, "viewModelStore");
        C0164o0 factory = C0545w.f8071b;
        C0435a defaultCreationExtras = C0435a.f7312b;
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        R0.h hVar = new R0.h(store, (y0) factory, (l0.c) defaultCreationExtras);
        Intrinsics.checkNotNullParameter(C0545w.class, "modelClass");
        KClass modelClass = JvmClassMappingKt.getKotlinClass(C0545w.class);
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(modelClass, "<this>");
        String qualifiedName = modelClass.getQualifiedName();
        if (qualifiedName != null) {
            return (C0545w) hVar.i(modelClass, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(qualifiedName));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public abstract int A(CoordinatorLayout coordinatorLayout);

    public abstract int B();

    public int C(View view) {
        return 0;
    }

    public int D() {
        return 0;
    }

    public abstract boolean F();

    public abstract boolean G(float f2);

    public abstract boolean H(View view);

    public abstract boolean I(float f2, float f4);

    public abstract void L(Throwable th);

    public abstract void M(A.j jVar);

    public void N(View view, int i) {
    }

    public abstract void O(int i);

    public abstract void P(View view, int i, int i4);

    public abstract void Q(View view, float f2, float f4);

    public abstract void W(boolean z3);

    public abstract void X(boolean z3);

    public abstract boolean Y(View view, float f2);

    @Override // O.i0
    public void b() {
    }

    public abstract boolean b0(View view, int i);

    @Override // O.i0
    public void c() {
    }

    public abstract void c0(ViewGroup.MarginLayoutParams marginLayoutParams, int i);

    public abstract void d0(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i4);

    public abstract int e(ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract TransformationMethod e0(TransformationMethod transformationMethod);

    public abstract float f(int i);

    public abstract int j(View view, int i);

    public abstract int k(View view, int i);

    public abstract int s(ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract int t();

    public abstract InputFilter[] u(InputFilter[] inputFilterArr);

    public abstract int v();

    public abstract int x();

    public abstract int y();

    public abstract int z(View view);
}
