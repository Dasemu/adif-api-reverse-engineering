package a;

import B0.G;
import G.f;
import K.d;
import O.C0065f0;
import O.X;
import O.j0;
import R0.h;
import U.e;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Parcelable;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EdgeEffect;
import android.widget.ImageView;
import androidx.room.u;
import com.adif.elcanomovil.R;
import com.adif.elcanomovil.uiTrain.entities.TrainInfoMapperKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import d.C0292a;
import e3.C0333t;
import e3.C0334u;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.ProtocolException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.logging.Logger;
import kotlin.collections.CollectionsKt;
import kotlin.internal.ProgressionUtilKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import o0.M;
import o0.N;
import o0.O;
import o0.P;
import o0.Q;
import o0.S;
import o0.T;
import r3.B;
import r3.C;
import r3.C0571c;
import r3.C0572d;
import r3.H;
import r3.I;
import r3.K;
import r3.n;
import r3.w;
import r3.y;
import r3.z;
import w0.InterfaceC0648d;
import x0.c;

/* renamed from: a.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0105a {

    /* renamed from: a, reason: collision with root package name */
    public static long f2317a;

    /* renamed from: b, reason: collision with root package name */
    public static Method f2318b;

    public static Set A() {
        try {
            Object invoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", new Class[0]).invoke(null, new Object[0]);
            if (invoke == null) {
                return Collections.EMPTY_SET;
            }
            Set set = (Set) invoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }

    public static Object B(Bundle bundle, String str) {
        if (Build.VERSION.SDK_INT >= 34) {
            return d.a(bundle, str, C0292a.class);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (C0292a.class.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }

    public static String C(String tableName, String triggerType) {
        Intrinsics.checkNotNullParameter(tableName, "tableName");
        Intrinsics.checkNotNullParameter(triggerType, "triggerType");
        return "`room_table_modification_trigger_" + tableName + '_' + triggerType + '`';
    }

    public static c D(x0.d refHolder, SQLiteDatabase sqLiteDatabase) {
        Intrinsics.checkNotNullParameter(refHolder, "refHolder");
        Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
        c cVar = refHolder.f8857a;
        if (cVar != null) {
            Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
            if (Intrinsics.areEqual(cVar.f8856a, sqLiteDatabase)) {
                return cVar;
            }
        }
        c cVar2 = new c(sqLiteDatabase);
        refHolder.f8857a = cVar2;
        return cVar2;
    }

    public static final boolean E(AssertionError assertionError) {
        Logger logger = w.f8315a;
        Intrinsics.checkNotNullParameter(assertionError, "<this>");
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message != null ? StringsKt.e(message, "getsockname failed") : false) {
                return true;
            }
        }
        return false;
    }

    public static boolean F() {
        try {
            if (f2318b == null) {
                return Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        try {
            if (f2318b == null) {
                f2317a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f2318b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f2318b.invoke(null, Long.valueOf(f2317a))).booleanValue();
        } catch (Exception e4) {
            if (!(e4 instanceof InvocationTargetException)) {
                Log.v("Trace", "Unable to call isTagEnabled via reflection", e4);
                return false;
            }
            Throwable cause = e4.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public static boolean G(String str) {
        return (StringsKt.j("Connection", str) || StringsKt.j("Keep-Alive", str) || StringsKt.j("Proxy-Authenticate", str) || StringsKt.j("Proxy-Authorization", str) || StringsKt.j("TE", str) || StringsKt.j("Trailers", str) || StringsKt.j("Transfer-Encoding", str) || StringsKt.j("Upgrade", str)) ? false : true;
    }

    public static boolean H(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static C0334u I(String... namesAndValues) {
        Intrinsics.checkNotNullParameter(namesAndValues, "namesAndValues");
        if (namesAndValues.length % 2 != 0) {
            throw new IllegalArgumentException("Expected alternating header names and values");
        }
        String[] strArr = (String[]) namesAndValues.clone();
        int length = strArr.length;
        int i = 0;
        for (int i4 = 0; i4 < length; i4++) {
            String str = strArr[i4];
            if (str == null) {
                throw new IllegalArgumentException("Headers cannot be null");
            }
            strArr[i4] = StringsKt.P(str).toString();
        }
        int progressionLastElement = ProgressionUtilKt.getProgressionLastElement(0, strArr.length - 1, 2);
        if (progressionLastElement >= 0) {
            while (true) {
                String str2 = strArr[i];
                String str3 = strArr[i + 1];
                g(str2);
                h(str3, str2);
                if (i == progressionLastElement) {
                    break;
                }
                i += 2;
            }
        }
        return new C0334u(strArr);
    }

    public static float J(EdgeEffect edgeEffect, float f2, float f4) {
        if (Build.VERSION.SDK_INT >= 31) {
            return e.c(edgeEffect, f2, f4);
        }
        U.d.a(edgeEffect, f2, f4);
        return f2;
    }

    public static String K(Context context, String str) {
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != 2091) {
                if (hashCode != 2157) {
                    if (hashCode != 2241) {
                        if (hashCode != 2339) {
                            if (hashCode != 2612) {
                                if (hashCode != 2615) {
                                    if (hashCode == 2256383 && str.equals("IRYO")) {
                                        if (context != null) {
                                            return context.getString(R.string.operator_iryo);
                                        }
                                        return null;
                                    }
                                } else if (str.equals("RI")) {
                                    return "";
                                }
                            } else if (str.equals("RF")) {
                                if (context != null) {
                                    return context.getString(R.string.operator_renfe);
                                }
                                return null;
                            }
                        } else if (str.equals("IL")) {
                            return "";
                        }
                    } else if (str.equals("FG")) {
                        if (context != null) {
                            return context.getString(R.string.operator_fgc);
                        }
                        return null;
                    }
                } else if (str.equals("CP")) {
                    return "";
                }
            } else if (str.equals("AL")) {
                if (context != null) {
                    return context.getString(R.string.operator_alsa);
                }
                return null;
            }
        }
        return str;
    }

    public static G L(String statusLine) {
        int i;
        String str;
        Intrinsics.checkNotNullParameter(statusLine, "statusLine");
        boolean D3 = StringsKt.D(statusLine, "HTTP/1.");
        e3.G g4 = e3.G.HTTP_1_0;
        if (D3) {
            i = 9;
            if (statusLine.length() < 9 || statusLine.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(statusLine));
            }
            int charAt = statusLine.charAt(7) - '0';
            if (charAt != 0) {
                if (charAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(statusLine));
                }
                g4 = e3.G.HTTP_1_1;
            }
        } else {
            if (!StringsKt.D(statusLine, "ICY ")) {
                throw new ProtocolException(C.w.z("Unexpected status line: ", statusLine));
            }
            i = 4;
        }
        int i4 = i + 3;
        if (statusLine.length() < i4) {
            throw new ProtocolException("Unexpected status line: ".concat(statusLine));
        }
        try {
            String substring = statusLine.substring(i, i4);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            int parseInt = Integer.parseInt(substring);
            if (statusLine.length() <= i4) {
                str = "";
            } else {
                if (statusLine.charAt(i4) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(statusLine));
                }
                str = statusLine.substring(i + 4);
                Intrinsics.checkNotNullExpressionValue(str, "this as java.lang.String).substring(startIndex)");
            }
            return new G(g4, parseInt, str);
        } catch (NumberFormatException unused) {
            throw new ProtocolException("Unexpected status line: ".concat(statusLine));
        }
    }

    public static final Cursor M(u db, InterfaceC0648d sqLiteQuery, boolean z3) {
        Intrinsics.checkNotNullParameter(db, "db");
        Intrinsics.checkNotNullParameter(sqLiteQuery, "sqLiteQuery");
        Cursor c4 = db.query(sqLiteQuery, (CancellationSignal) null);
        if (z3 && (c4 instanceof AbstractWindowedCursor)) {
            AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) c4;
            int count = abstractWindowedCursor.getCount();
            if ((abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count) {
                Intrinsics.checkNotNullParameter(c4, "c");
                try {
                    MatrixCursor matrixCursor = new MatrixCursor(c4.getColumnNames(), c4.getCount());
                    while (c4.moveToNext()) {
                        Object[] objArr = new Object[c4.getColumnCount()];
                        int columnCount = c4.getColumnCount();
                        for (int i = 0; i < columnCount; i++) {
                            int type = c4.getType(i);
                            if (type == 0) {
                                objArr[i] = null;
                            } else if (type == 1) {
                                objArr[i] = Long.valueOf(c4.getLong(i));
                            } else if (type == 2) {
                                objArr[i] = Double.valueOf(c4.getDouble(i));
                            } else if (type == 3) {
                                objArr[i] = c4.getString(i);
                            } else {
                                if (type != 4) {
                                    throw new IllegalStateException();
                                }
                                objArr[i] = c4.getBlob(i);
                            }
                        }
                        matrixCursor.addRow(objArr);
                    }
                    CloseableKt.closeFinally(c4, null);
                    return matrixCursor;
                } finally {
                }
            }
        }
        return c4;
    }

    public static void N(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
        int colorForState = colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor());
        Drawable mutate = drawable.mutate();
        H.a.h(mutate, ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(mutate);
    }

    public static void O(Window window, boolean z3) {
        if (Build.VERSION.SDK_INT >= 30) {
            j0.a(window, z3);
            return;
        }
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z3 ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
    }

    public static void P(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        WeakHashMap weakHashMap = X.f1226a;
        boolean hasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z3 = onLongClickListener != null;
        boolean z4 = hasOnClickListeners || z3;
        checkableImageButton.setFocusable(z4);
        checkableImageButton.setClickable(hasOnClickListeners);
        checkableImageButton.setPressable(hasOnClickListeners);
        checkableImageButton.setLongClickable(z3);
        checkableImageButton.setImportantForAccessibility(z4 ? 1 : 2);
    }

    public static final C0571c Q(Socket socket) {
        Logger logger = w.f8315a;
        Intrinsics.checkNotNullParameter(socket, "<this>");
        H h = new H(socket);
        OutputStream outputStream = socket.getOutputStream();
        Intrinsics.checkNotNullExpressionValue(outputStream, "getOutputStream(...)");
        y sink = new y(outputStream, h);
        Intrinsics.checkNotNullParameter(sink, "sink");
        return new C0571c(h, sink);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, r3.K] */
    public static final C0572d R(InputStream inputStream) {
        Logger logger = w.f8315a;
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        return new C0572d(inputStream, (K) new Object());
    }

    public static final C0572d S(Socket socket) {
        Logger logger = w.f8315a;
        Intrinsics.checkNotNullParameter(socket, "<this>");
        H h = new H(socket);
        InputStream inputStream = socket.getInputStream();
        Intrinsics.checkNotNullExpressionValue(inputStream, "getInputStream(...)");
        C0572d source = new C0572d(inputStream, h);
        Intrinsics.checkNotNullParameter(source, "source");
        return new C0572d(h, source);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Throwable, T] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0086 -> B:13:0x0069). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0089 -> B:13:0x0069). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(java.util.List r6, Y.x r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            boolean r0 = r8 instanceof Y.C0088d
            if (r0 == 0) goto L13
            r0 = r8
            Y.d r0 = (Y.C0088d) r0
            int r1 = r0.f2071d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2071d = r1
            goto L18
        L13:
            Y.d r0 = new Y.d
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f2070c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f2071d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L44
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.util.Iterator r6 = r0.f2069b
            java.io.Serializable r7 = r0.f2068a
            kotlin.jvm.internal.Ref$ObjectRef r7 = (kotlin.jvm.internal.Ref.ObjectRef) r7
            kotlin.ResultKt.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L32
            goto L69
        L32:
            r8 = move-exception
            goto L82
        L34:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3c:
            java.io.Serializable r6 = r0.f2068a
            java.util.List r6 = (java.util.List) r6
            kotlin.ResultKt.throwOnFailure(r8)
            goto L5e
        L44:
            kotlin.ResultKt.throwOnFailure(r8)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            Y.f r2 = new Y.f
            r5 = 0
            r2.<init>(r6, r8, r5)
            r0.f2068a = r8
            r0.f2071d = r4
            java.lang.Object r6 = r7.a(r2, r0)
            if (r6 != r1) goto L5d
            goto L9c
        L5d:
            r6 = r8
        L5e:
            kotlin.jvm.internal.Ref$ObjectRef r7 = new kotlin.jvm.internal.Ref$ObjectRef
            r7.<init>()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        L69:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L94
            java.lang.Object r8 = r6.next()
            kotlin.jvm.functions.Function1 r8 = (kotlin.jvm.functions.Function1) r8
            r0.f2068a = r7     // Catch: java.lang.Throwable -> L32
            r0.f2069b = r6     // Catch: java.lang.Throwable -> L32
            r0.f2071d = r3     // Catch: java.lang.Throwable -> L32
            java.lang.Object r8 = r8.invoke(r0)     // Catch: java.lang.Throwable -> L32
            if (r8 != r1) goto L69
            goto L9c
        L82:
            T r2 = r7.element
            if (r2 != 0) goto L89
            r7.element = r8
            goto L69
        L89:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            T r2 = r7.element
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            kotlin.ExceptionsKt.addSuppressed(r2, r8)
            goto L69
        L94:
            T r6 = r7.element
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            if (r6 != 0) goto L9d
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
        L9c:
            return r1
        L9d:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a.AbstractC0105a.a(java.util.List, Y.x, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static void b(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                H.a.h(drawable, colorStateList);
            } else {
                int[] drawableState = textInputLayout.getDrawableState();
                int[] drawableState2 = checkableImageButton.getDrawableState();
                int length = drawableState.length;
                int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
                System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
                H.a.h(drawable, ColorStateList.valueOf(colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                H.a.i(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public static final B c(r3.G g4) {
        Intrinsics.checkNotNullParameter(g4, "<this>");
        return new B(g4);
    }

    public static final C d(I i) {
        Intrinsics.checkNotNullParameter(i, "<this>");
        return new C(i);
    }

    public static String e(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b4 : bArr) {
            sb.append(String.format("%02x", Byte.valueOf(b4)));
        }
        return sb.toString();
    }

    public static final void f(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        for (View view2 : SequencesKt.sequence(new C0065f0(view, null))) {
            V.a aVar = (V.a) view2.getTag(R.id.pooling_container_listener_holder_tag);
            if (aVar == null) {
                aVar = new V.a();
                view2.setTag(R.id.pooling_container_listener_holder_tag, aVar);
            }
            ArrayList arrayList = aVar.f1792a;
            int lastIndex = CollectionsKt.getLastIndex(arrayList);
            if (-1 < lastIndex) {
                arrayList.get(lastIndex).getClass();
                throw new ClassCastException();
            }
        }
    }

    public static void g(String str) {
        if (str.length() <= 0) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if ('!' > charAt || charAt >= 127) {
                throw new IllegalArgumentException(f3.c.h("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i), str).toString());
            }
        }
    }

    public static void h(String str, String str2) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt != '\t' && (' ' > charAt || charAt >= 127)) {
                StringBuilder sb = new StringBuilder();
                sb.append(f3.c.h("Unexpected char %#04x at %d in %s value", Integer.valueOf(charAt), Integer.valueOf(i), str2));
                sb.append(f3.c.p(str2) ? "" : ": ".concat(str));
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }

    public static C0334u j(C0334u c0334u, C0334u c0334u2) {
        C0333t c0333t = new C0333t();
        int size = c0334u.size();
        for (int i = 0; i < size; i++) {
            String b4 = c0334u.b(i);
            String f2 = c0334u.f(i);
            if ((!StringsKt.j("Warning", b4) || !StringsKt.D(f2, "1")) && (StringsKt.j("Content-Length", b4) || StringsKt.j("Content-Encoding", b4) || StringsKt.j("Content-Type", b4) || !G(b4) || c0334u2.a(b4) == null)) {
                c0333t.c(b4, f2);
            }
        }
        int size2 = c0334u2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            String b5 = c0334u2.b(i4);
            if (!StringsKt.j("Content-Length", b5) && !StringsKt.j("Content-Encoding", b5) && !StringsKt.j("Content-Type", b5) && G(b5)) {
                c0333t.c(b5, c0334u2.f(i4));
            }
        }
        return c0333t.d();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static String k(Context context, String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -1475732674:
                    if (str.equals("VIAJEROS OTROS")) {
                        return "";
                    }
                    break;
                case -842210705:
                    if (str.equals("AVE INTERNACIONAL")) {
                        if (context != null) {
                            return context.getString(R.string.comercial_renfe_product_ave);
                        }
                        return null;
                    }
                    break;
                case -187348199:
                    if (str.equals("CERCANIAS RAM")) {
                        if (context != null) {
                            return context.getString(R.string.comercial_renfe_product_cercanias);
                        }
                        return null;
                    }
                    break;
                case -172035452:
                    if (str.equals("REGIONAL EXPRES")) {
                        if (context != null) {
                            return context.getString(R.string.comercial_renfe_product_regional_expres);
                        }
                        return null;
                    }
                    break;
                case 2455:
                    if (str.equals("MD")) {
                        if (context != null) {
                            return context.getString(R.string.comercial_renfe_product_md);
                        }
                        return null;
                    }
                    break;
                case 65200:
                    if (str.equals("AVE")) {
                        if (context != null) {
                            return context.getString(R.string.comercial_renfe_product_ave);
                        }
                        return null;
                    }
                    break;
                case 82825:
                    if (str.equals("TAV")) {
                        if (context != null) {
                            return context.getString(R.string.comercial_ouigo_product_tav);
                        }
                        return null;
                    }
                    break;
                case 83334:
                    if (str.equals("TRD")) {
                        if (context != null) {
                            return context.getString(R.string.comercial_renfe_product_regional_expres);
                        }
                        return null;
                    }
                    break;
                case 75562827:
                    if (str.equals("OUIGO")) {
                        if (context != null) {
                            return context.getString(R.string.comercial_ouigo_product_tav);
                        }
                        return null;
                    }
                    break;
                case 77122073:
                    if (str.equals("R-598")) {
                        if (context != null) {
                            return context.getString(R.string.comercial_renfe_product_md);
                        }
                        return null;
                    }
                    break;
                case 79587495:
                    if (str.equals("TALGO")) {
                        if (context != null) {
                            return context.getString(R.string.comercial_renfe_product_talgo);
                        }
                        return null;
                    }
                    break;
                case 92288543:
                    if (str.equals("REGIONAL")) {
                        if (context != null) {
                            return context.getString(R.string.comercial_renfe_product_regional);
                        }
                        return null;
                    }
                    break;
                case 118803444:
                    if (str.equals("TAV OUIGO")) {
                        if (context != null) {
                            return context.getString(R.string.comercial_ouigo_product_tav);
                        }
                        return null;
                    }
                    break;
                case 284021093:
                    if (str.equals("RODALIES")) {
                        if (context != null) {
                            return context.getString(R.string.comercial_renfe_product_rodalies);
                        }
                        return null;
                    }
                    break;
                case 287990297:
                    if (str.equals("INTERURBANO")) {
                        return "";
                    }
                    break;
                case 334807605:
                    if (str.equals("LANZADERA-AVANT")) {
                        if (context != null) {
                            return context.getString(R.string.comercial_renfe_product_avant);
                        }
                        return null;
                    }
                    break;
                case 345524844:
                    if (str.equals("LANZADERA-MIXTA")) {
                        if (context != null) {
                            return context.getString(R.string.comercial_renfe_product_md);
                        }
                        return null;
                    }
                    break;
                case 895899835:
                    if (str.equals(TrainInfoMapperKt.CERCANIAS)) {
                        if (context != null) {
                            return context.getString(R.string.comercial_renfe_product_cercanias);
                        }
                        return null;
                    }
                    break;
                case 1077532285:
                    if (str.equals("REGIONAL RAM")) {
                        if (context != null) {
                            return context.getString(R.string.comercial_renfe_product_regional);
                        }
                        return null;
                    }
                    break;
                case 1781704907:
                    if (str.equals("VIAJEROS RAM")) {
                        return "";
                    }
                    break;
                case 1852465005:
                    if (str.equals("VIAJEROS")) {
                        return "";
                    }
                    break;
                case 1979987393:
                    if (str.equals("TGV INOUI")) {
                        if (context != null) {
                            return context.getString(R.string.comercial_ouigo_product_inoui);
                        }
                        return null;
                    }
                    break;
            }
        }
        return str;
    }

    public static ImageView.ScaleType l(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 5 ? i != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE : ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.FIT_END : ImageView.ScaleType.FIT_CENTER : ImageView.ScaleType.FIT_START : ImageView.ScaleType.FIT_XY;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long[] m(Serializable serializable) {
        if (!(serializable instanceof int[])) {
            if (serializable instanceof long[]) {
                return (long[]) serializable;
            }
            return null;
        }
        int[] iArr = (int[]) serializable;
        long[] jArr = new long[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            jArr[i] = iArr[i];
        }
        return jArr;
    }

    public static float[] n(float[] fArr, int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int min = Math.min(i, length);
        float[] fArr2 = new float[i];
        System.arraycopy(fArr, 0, fArr2, 0, min);
        return fArr2;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x007a. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0096 A[Catch: NumberFormatException -> 0x00aa, LOOP:3: B:25:0x0068->B:35:0x0096, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:35:0x0096, B:39:0x009c, B:44:0x00b1, B:56:0x00b4), top: B:21:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0095 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009c A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:35:0x0096, B:39:0x009c, B:44:0x00b1, B:56:0x00b4), top: B:21:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b1 A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:35:0x0096, B:39:0x009c, B:44:0x00b1, B:56:0x00b4), top: B:21:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d7 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static G.f[] o(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.AbstractC0105a.o(java.lang.String):G.f[]");
    }

    public static void p(String str, String str2, Object obj) {
        String concat = "TRuntime.".concat(str);
        if (Log.isLoggable(concat, 3)) {
            Log.d(concat, String.format(str2, obj));
        }
    }

    public static f[] q(f[] fVarArr) {
        f[] fVarArr2 = new f[fVarArr.length];
        for (int i = 0; i < fVarArr.length; i++) {
            fVarArr2[i] = new f(fVarArr[i]);
        }
        return fVarArr2;
    }

    public static final void r(n nVar, z zVar) {
        try {
            IOException iOException = null;
            for (z path : nVar.d(zVar)) {
                try {
                    if (nVar.e(path).f8294c) {
                        r(nVar, path);
                    }
                    Intrinsics.checkNotNullParameter(path, "path");
                    nVar.a(path);
                } catch (IOException e4) {
                    if (iOException == null) {
                        iOException = e4;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }

    public static void s(String str, String str2, Exception exc) {
        String concat = "TRuntime.".concat(str);
        if (Log.isLoggable(concat, 6)) {
            Log.e(concat, str2, exc);
        }
    }

    public static View t(View view, int i) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View findViewById = viewGroup.getChildAt(i4).findViewById(i);
            if (findViewById != null) {
                return findViewById;
            }
        }
        return null;
    }

    public static T u(String str, String str2) {
        if (Intrinsics.areEqual("integer", str)) {
            return T.f7954b;
        }
        if (Intrinsics.areEqual("integer[]", str)) {
            return T.f7956d;
        }
        if (Intrinsics.areEqual("long", str)) {
            return T.f7957e;
        }
        if (Intrinsics.areEqual("long[]", str)) {
            return T.f7958f;
        }
        if (Intrinsics.areEqual("boolean", str)) {
            return T.i;
        }
        if (Intrinsics.areEqual("boolean[]", str)) {
            return T.f7960j;
        }
        boolean areEqual = Intrinsics.areEqual("string", str);
        M m4 = T.f7961k;
        if (!areEqual) {
            if (Intrinsics.areEqual("string[]", str)) {
                return T.f7962l;
            }
            if (Intrinsics.areEqual("float", str)) {
                return T.f7959g;
            }
            if (Intrinsics.areEqual("float[]", str)) {
                return T.h;
            }
            if (Intrinsics.areEqual("reference", str)) {
                return T.f7955c;
            }
            if (str != null && str.length() != 0) {
                try {
                    String concat = (!StringsKt.D(str, ".") || str2 == null) ? str : str2.concat(str);
                    if (StringsKt.i(str, "[]")) {
                        concat = concat.substring(0, concat.length() - 2);
                        Intrinsics.checkNotNullExpressionValue(concat, "this as java.lang.String…ing(startIndex, endIndex)");
                        Class<?> cls = Class.forName(concat);
                        if (Parcelable.class.isAssignableFrom(cls)) {
                            return new O(cls);
                        }
                        if (Serializable.class.isAssignableFrom(cls)) {
                            return new Q(cls);
                        }
                    } else {
                        Class<?> cls2 = Class.forName(concat);
                        if (Parcelable.class.isAssignableFrom(cls2)) {
                            return new P(cls2);
                        }
                        if (Enum.class.isAssignableFrom(cls2)) {
                            return new N(cls2);
                        }
                        if (Serializable.class.isAssignableFrom(cls2)) {
                            return new S(cls2);
                        }
                    }
                    throw new IllegalArgumentException(concat + " is not Serializable or Parcelable.");
                } catch (ClassNotFoundException e4) {
                    throw new RuntimeException(e4);
                }
            }
        }
        return m4;
    }

    public static ColorStateList v(Context context, h hVar, int i) {
        int resourceId;
        ColorStateList colorStateList;
        TypedArray typedArray = (TypedArray) hVar.f1414b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateList = D.h.getColorStateList(context, resourceId)) == null) ? hVar.e(i) : colorStateList;
    }

    public static ColorStateList w(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList colorStateList;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateList = D.h.getColorStateList(context, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateList;
    }

    public static String x(Context context, int i) {
        String valueOf;
        Intrinsics.checkNotNullParameter(context, "context");
        if (i <= 16777215) {
            return String.valueOf(i);
        }
        try {
            valueOf = context.getResources().getResourceName(i);
        } catch (Resources.NotFoundException unused) {
            valueOf = String.valueOf(i);
        }
        Intrinsics.checkNotNullExpressionValue(valueOf, "try {\n                co….toString()\n            }");
        return valueOf;
    }

    public static float y(EdgeEffect edgeEffect) {
        return Build.VERSION.SDK_INT >= 31 ? e.b(edgeEffect) : BitmapDescriptorFactory.HUE_RED;
    }

    public static Drawable z(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable m4;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (m4 = AbstractC0106b.m(context, resourceId)) == null) ? typedArray.getDrawable(i) : m4;
    }

    public abstract List i(String str, List list);
}
