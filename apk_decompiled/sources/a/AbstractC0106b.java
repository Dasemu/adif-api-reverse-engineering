package a;

import E2.t;
import G.f;
import O.I;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Path;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.util.Log;
import android.util.Size;
import android.util.SizeF;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import b.D;
import com.adif.elcanomovil.R;
import com.adif.elcanomovil.commonNavGraph.arguments.NavArguments;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.messaging.Constants;
import e3.G;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import kotlin.Pair;
import kotlin.UByte;
import kotlin.UShort;
import kotlin.collections.CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;
import kotlin.text.Typography;
import m.E0;
import m3.l;
import o0.AbstractC0544v;
import o0.C0526c;
import o0.E;
import o0.H;
import r3.C0576h;
import r3.C0579k;
import u0.d;
import u0.e;
import x0.c;

/* renamed from: a.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0106b {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static e3.C0317c A(e3.C0334u r26) {
        /*
            Method dump skipped, instructions count: 470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.AbstractC0106b.A(e3.u):e3.c");
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [e0.b, O.I] */
    public static e0.b B(MappedByteBuffer mappedByteBuffer) {
        long j4;
        ByteBuffer duplicate = mappedByteBuffer.duplicate();
        duplicate.order(ByteOrder.BIG_ENDIAN);
        duplicate.position(duplicate.position() + 4);
        int i = duplicate.getShort() & UShort.MAX_VALUE;
        if (i > 100) {
            throw new IOException("Cannot read metadata.");
        }
        duplicate.position(duplicate.position() + 6);
        int i4 = 0;
        while (true) {
            if (i4 >= i) {
                j4 = -1;
                break;
            }
            int i5 = duplicate.getInt();
            duplicate.position(duplicate.position() + 4);
            j4 = duplicate.getInt() & 4294967295L;
            duplicate.position(duplicate.position() + 4);
            if (1835365473 == i5) {
                break;
            }
            i4++;
        }
        if (j4 != -1) {
            duplicate.position(duplicate.position() + ((int) (j4 - duplicate.position())));
            duplicate.position(duplicate.position() + 12);
            long j5 = duplicate.getInt() & 4294967295L;
            for (int i6 = 0; i6 < j5; i6++) {
                int i7 = duplicate.getInt();
                long j6 = duplicate.getInt() & 4294967295L;
                duplicate.getInt();
                if (1164798569 == i7 || 1701669481 == i7) {
                    duplicate.position((int) (j6 + j4));
                    ?? i8 = new I();
                    duplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int position = duplicate.position() + duplicate.getInt(duplicate.position());
                    i8.f1221d = duplicate;
                    i8.f1218a = position;
                    int i9 = position - duplicate.getInt(position);
                    i8.f1219b = i9;
                    i8.f1220c = ((ByteBuffer) i8.f1221d).getShort(i9);
                    return i8;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    public static final List C(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex(NavArguments.ARG_TYPE_NOTIFICATION_JSON_MESSAGE_TRAIN);
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex(Constants.MessagePayloadKeys.FROM);
        int columnIndex4 = cursor.getColumnIndex("to");
        List createListBuilder = CollectionsKt.createListBuilder();
        while (cursor.moveToNext()) {
            int i = cursor.getInt(columnIndex);
            int i4 = cursor.getInt(columnIndex2);
            String string = cursor.getString(columnIndex3);
            Intrinsics.checkNotNullExpressionValue(string, "cursor.getString(fromColumnIndex)");
            String string2 = cursor.getString(columnIndex4);
            Intrinsics.checkNotNullExpressionValue(string2, "cursor.getString(toColumnIndex)");
            createListBuilder.add(new d(string, i, i4, string2));
        }
        return CollectionsKt.sorted(CollectionsKt.build(createListBuilder));
    }

    public static final e D(c cVar, String str, boolean z3) {
        Cursor V3 = cVar.V("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = V3.getColumnIndex("seqno");
            int columnIndex2 = V3.getColumnIndex("cid");
            int columnIndex3 = V3.getColumnIndex(AppMeasurementSdk.ConditionalUserProperty.NAME);
            int columnIndex4 = V3.getColumnIndex("desc");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex4 != -1) {
                TreeMap treeMap = new TreeMap();
                TreeMap treeMap2 = new TreeMap();
                while (V3.moveToNext()) {
                    if (V3.getInt(columnIndex2) >= 0) {
                        int i = V3.getInt(columnIndex);
                        String columnName = V3.getString(columnIndex3);
                        String str2 = V3.getInt(columnIndex4) > 0 ? "DESC" : "ASC";
                        Integer valueOf = Integer.valueOf(i);
                        Intrinsics.checkNotNullExpressionValue(columnName, "columnName");
                        treeMap.put(valueOf, columnName);
                        treeMap2.put(Integer.valueOf(i), str2);
                    }
                }
                Collection values = treeMap.values();
                Intrinsics.checkNotNullExpressionValue(values, "columnsMap.values");
                List list = CollectionsKt.toList(values);
                Collection values2 = treeMap2.values();
                Intrinsics.checkNotNullExpressionValue(values2, "ordersMap.values");
                e eVar = new e(str, z3, list, CollectionsKt.toList(values2));
                CloseableKt.closeFinally(V3, null);
                return eVar;
            }
            CloseableKt.closeFinally(V3, null);
            return null;
        } finally {
        }
    }

    public static int E(Context context, int i, int i4) {
        TypedValue T3 = l.T(context, i);
        return (T3 == null || T3.type != 16) ? i4 : T3.data;
    }

    public static TimeInterpolator F(Context context, int i, Interpolator interpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return interpolator;
        }
        if (typedValue.type != 3) {
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
        String valueOf = String.valueOf(typedValue.string);
        if (!s(valueOf, "cubic-bezier") && !s(valueOf, NavArguments.ARG_DYNAMIC_LINKS_TAB)) {
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        if (s(valueOf, "cubic-bezier")) {
            String[] split = valueOf.substring(13, valueOf.length() - 1).split(",");
            if (split.length == 4) {
                return Q.a.b(n(split, 0), n(split, 1), n(split, 2), n(split, 3));
            }
            throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + split.length);
        }
        if (!s(valueOf, NavArguments.ARG_DYNAMIC_LINKS_TAB)) {
            throw new IllegalArgumentException("Invalid motion easing type: ".concat(valueOf));
        }
        String substring = valueOf.substring(5, valueOf.length() - 1);
        Path path = new Path();
        try {
            f.b(AbstractC0105a.o(substring), path);
            return Q.a.c(path);
        } catch (RuntimeException e4) {
            throw new RuntimeException("Error in parsing ".concat(substring), e4);
        }
    }

    public static byte[] G(Function2 parcelable) {
        Intrinsics.checkNotNullParameter(parcelable, "parcelable");
        Parcel obtain = Parcel.obtain();
        Intrinsics.checkNotNullExpressionValue(obtain, "obtain()");
        try {
            obtain.setDataPosition(0);
            parcelable.invoke(obtain, 0);
            byte[] marshall = obtain.marshall();
            Intrinsics.checkNotNullExpressionValue(marshall, "{\n                    pa…shall()\n                }");
            return marshall;
        } finally {
            obtain.recycle();
        }
    }

    public static final void H(View view, D onBackPressedDispatcherOwner) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(onBackPressedDispatcherOwner, "onBackPressedDispatcherOwner");
        view.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, onBackPressedDispatcherOwner);
    }

    public static int I(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(android.R.style.Animation.Activity, new int[]{i});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [r3.I, java.lang.Object, r3.h] */
    /* JADX WARN: Type inference failed for: r4v9, types: [r3.I, java.lang.Object, r3.h] */
    public static void a(long j4, C0576h c0576h, int i, List list, int i4, int i5, List list2) {
        int i6;
        int i7;
        List list3;
        long j5;
        int i8;
        int i9 = i;
        List list4 = list;
        List list5 = list2;
        if (i4 >= i5) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        for (int i10 = i4; i10 < i5; i10++) {
            if (((C0579k) list4.get(i10)).d() < i9) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }
        C0579k c0579k = (C0579k) list.get(i4);
        C0579k c0579k2 = (C0579k) list4.get(i5 - 1);
        if (i9 == c0579k.d()) {
            int intValue = ((Number) list5.get(i4)).intValue();
            int i11 = i4 + 1;
            C0579k c0579k3 = (C0579k) list4.get(i11);
            i6 = i11;
            i7 = intValue;
            c0579k = c0579k3;
        } else {
            i6 = i4;
            i7 = -1;
        }
        if (c0579k.i(i9) == c0579k2.i(i9)) {
            int min = Math.min(c0579k.d(), c0579k2.d());
            int i12 = 0;
            for (int i13 = i9; i13 < min && c0579k.i(i13) == c0579k2.i(i13); i13++) {
                i12++;
            }
            long j6 = 4;
            long j7 = (c0576h.f8284b / j6) + j4 + 2 + i12 + 1;
            c0576h.m0(-i12);
            c0576h.m0(i7);
            int i14 = i9 + i12;
            while (i9 < i14) {
                c0576h.m0(c0579k.i(i9) & UByte.MAX_VALUE);
                i9++;
            }
            if (i6 + 1 == i5) {
                if (i14 != ((C0579k) list4.get(i6)).d()) {
                    throw new IllegalStateException("Check failed.");
                }
                c0576h.m0(((Number) list5.get(i6)).intValue());
                return;
            } else {
                ?? obj = new Object();
                c0576h.m0(((int) ((obj.f8284b / j6) + j7)) * (-1));
                a(j7, obj, i14, list4, i6, i5, list5);
                c0576h.D(obj);
                return;
            }
        }
        int i15 = 1;
        for (int i16 = i6 + 1; i16 < i5; i16++) {
            if (((C0579k) list4.get(i16 - 1)).i(i9) != ((C0579k) list4.get(i16)).i(i9)) {
                i15++;
            }
        }
        long j8 = 4;
        long j9 = (c0576h.f8284b / j8) + j4 + 2 + (i15 * 2);
        c0576h.m0(i15);
        c0576h.m0(i7);
        for (int i17 = i6; i17 < i5; i17++) {
            byte i18 = ((C0579k) list4.get(i17)).i(i9);
            if (i17 == i6 || i18 != ((C0579k) list4.get(i17 - 1)).i(i9)) {
                c0576h.m0(i18 & UByte.MAX_VALUE);
            }
        }
        ?? obj2 = new Object();
        int i19 = i6;
        while (i19 < i5) {
            byte i20 = ((C0579k) list4.get(i19)).i(i9);
            int i21 = i19 + 1;
            int i22 = i21;
            while (true) {
                if (i22 >= i5) {
                    i22 = i5;
                    break;
                } else if (i20 != ((C0579k) list4.get(i22)).i(i9)) {
                    break;
                } else {
                    i22++;
                }
            }
            if (i21 == i22 && i9 + 1 == ((C0579k) list4.get(i19)).d()) {
                c0576h.m0(((Number) list5.get(i19)).intValue());
                list3 = list5;
                j5 = j9;
                i8 = i22;
            } else {
                c0576h.m0(((int) ((obj2.f8284b / j8) + j9)) * (-1));
                list3 = list5;
                j5 = j9;
                i8 = i22;
                a(j5, obj2, i9 + 1, list, i19, i8, list3);
                list4 = list;
            }
            j9 = j5;
            i19 = i8;
            list5 = list3;
        }
        c0576h.D(obj2);
    }

    public static final Bundle b(Pair... pairArr) {
        Bundle bundle = new Bundle(pairArr.length);
        for (Pair pair : pairArr) {
            String str = (String) pair.component1();
            Object component2 = pair.component2();
            if (component2 == null) {
                bundle.putString(str, null);
            } else if (component2 instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) component2).booleanValue());
            } else if (component2 instanceof Byte) {
                bundle.putByte(str, ((Number) component2).byteValue());
            } else if (component2 instanceof Character) {
                bundle.putChar(str, ((Character) component2).charValue());
            } else if (component2 instanceof Double) {
                bundle.putDouble(str, ((Number) component2).doubleValue());
            } else if (component2 instanceof Float) {
                bundle.putFloat(str, ((Number) component2).floatValue());
            } else if (component2 instanceof Integer) {
                bundle.putInt(str, ((Number) component2).intValue());
            } else if (component2 instanceof Long) {
                bundle.putLong(str, ((Number) component2).longValue());
            } else if (component2 instanceof Short) {
                bundle.putShort(str, ((Number) component2).shortValue());
            } else if (component2 instanceof Bundle) {
                bundle.putBundle(str, (Bundle) component2);
            } else if (component2 instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) component2);
            } else if (component2 instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) component2);
            } else if (component2 instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) component2);
            } else if (component2 instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) component2);
            } else if (component2 instanceof char[]) {
                bundle.putCharArray(str, (char[]) component2);
            } else if (component2 instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) component2);
            } else if (component2 instanceof float[]) {
                bundle.putFloatArray(str, (float[]) component2);
            } else if (component2 instanceof int[]) {
                bundle.putIntArray(str, (int[]) component2);
            } else if (component2 instanceof long[]) {
                bundle.putLongArray(str, (long[]) component2);
            } else if (component2 instanceof short[]) {
                bundle.putShortArray(str, (short[]) component2);
            } else if (component2 instanceof Object[]) {
                Class<?> componentType = component2.getClass().getComponentType();
                Intrinsics.checkNotNull(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    Intrinsics.checkNotNull(component2, "null cannot be cast to non-null type kotlin.Array<android.os.Parcelable>");
                    bundle.putParcelableArray(str, (Parcelable[]) component2);
                } else if (String.class.isAssignableFrom(componentType)) {
                    Intrinsics.checkNotNull(component2, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                    bundle.putStringArray(str, (String[]) component2);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    Intrinsics.checkNotNull(component2, "null cannot be cast to non-null type kotlin.Array<kotlin.CharSequence>");
                    bundle.putCharSequenceArray(str, (CharSequence[]) component2);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + Typography.quote);
                    }
                    bundle.putSerializable(str, (Serializable) component2);
                }
            } else if (component2 instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) component2);
            } else if (component2 instanceof IBinder) {
                bundle.putBinder(str, (IBinder) component2);
            } else if (component2 instanceof Size) {
                K.c.a(bundle, str, (Size) component2);
            } else {
                if (!(component2 instanceof SizeF)) {
                    throw new IllegalArgumentException("Illegal value type " + component2.getClass().getCanonicalName() + " for key \"" + str + Typography.quote);
                }
                K.c.b(bundle, str, (SizeF) component2);
            }
        }
        return bundle;
    }

    public static void c(float f2, float f4, float f5) {
        if (f2 >= f4) {
            throw new IllegalArgumentException("Minimum zoom has to be less than Medium zoom. Call setMinimumZoom() with a more appropriate value");
        }
        if (f4 >= f5) {
            throw new IllegalArgumentException("Medium zoom has to be less than Maximum zoom. Call setMaximumZoom() with a more appropriate value");
        }
    }

    public static int d(int i, int i4, int i5) {
        return i < i4 ? i4 : i > i5 ? i5 : i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0053, code lost:
    
        if (m3.d.k(r9, r1, kotlin.jvm.internal.Intrinsics.areEqual(r7, r2) ? r0.getWidth() : W0.f.e(r7.f1643a, r8), kotlin.jvm.internal.Intrinsics.areEqual(r7, r2) ? r0.getHeight() : W0.f.e(r7.f1644b, r8), r8) == 1.0d) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap e(android.graphics.drawable.Drawable r5, android.graphics.Bitmap.Config r6, T0.h r7, T0.g r8, boolean r9) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.AbstractC0106b.e(android.graphics.drawable.Drawable, android.graphics.Bitmap$Config, T0.h, T0.g, boolean):android.graphics.Bitmap");
    }

    public static Object f(byte[] bytes, Function1 creator) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        Intrinsics.checkNotNullParameter(creator, "creator");
        Parcel obtain = Parcel.obtain();
        Intrinsics.checkNotNullExpressionValue(obtain, "obtain()");
        try {
            obtain.unmarshall(bytes, 0, bytes.length);
            obtain.setDataPosition(0);
            return creator.invoke(obtain);
        } finally {
            obtain.recycle();
        }
    }

    public static final AbstractC0544v g(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        AbstractC0544v abstractC0544v = (AbstractC0544v) SequencesKt.firstOrNull(SequencesKt.mapNotNull(SequencesKt.generateSequence(view, C0526c.f7982j), C0526c.f7983k));
        if (abstractC0544v != null) {
            return abstractC0544v;
        }
        throw new IllegalStateException("View " + view + " does not have a NavController set");
    }

    public static E h(H h) {
        Intrinsics.checkNotNullParameter(h, "<this>");
        return (E) SequencesKt.last(SequencesKt.generateSequence(h.j(h.f7932l, true), C0526c.i));
    }

    public static G i(String protocol) {
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        if (Intrinsics.areEqual(protocol, "http/1.0")) {
            return G.HTTP_1_0;
        }
        if (Intrinsics.areEqual(protocol, "http/1.1")) {
            return G.HTTP_1_1;
        }
        if (Intrinsics.areEqual(protocol, "h2_prior_knowledge")) {
            return G.H2_PRIOR_KNOWLEDGE;
        }
        if (Intrinsics.areEqual(protocol, "h2")) {
            return G.HTTP_2;
        }
        if (Intrinsics.areEqual(protocol, "spdy/3.1")) {
            return G.SPDY_3;
        }
        if (Intrinsics.areEqual(protocol, "quic")) {
            return G.QUIC;
        }
        throw new IOException("Unexpected protocol: ".concat(protocol));
    }

    public static Drawable m(Context context, int i) {
        return E0.b().c(context, i);
    }

    public static float n(String[] strArr, int i) {
        float parseFloat = Float.parseFloat(strArr[i]);
        if (parseFloat >= BitmapDescriptorFactory.HUE_RED && parseFloat <= 1.0f) {
            return parseFloat;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + parseFloat);
    }

    public static Long p(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            return Long.valueOf(E.a.b(context.getPackageManager().getPackageInfo(context.getPackageName(), 0)));
        } catch (PackageManager.NameNotFoundException e4) {
            Log.e("RemoteViewsCompatServic", "Couldn't retrieve version code for " + context.getPackageManager(), e4);
            return null;
        }
    }

    public static int q(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 32) {
            return 5;
        }
        if (i == 64) {
            return 6;
        }
        if (i == 128) {
            return 7;
        }
        if (i == 256) {
            return 8;
        }
        throw new IllegalArgumentException(com.google.android.gms.measurement.internal.a.l(i, "type needs to be >= FIRST and <= LAST, type="));
    }

    public static final boolean r(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return context.getResources().getConfiguration().orientation == 2;
    }

    public static boolean s(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    public static final boolean u(E e4, int i) {
        Intrinsics.checkNotNullParameter(e4, "<this>");
        int i4 = E.f7919j;
        Intrinsics.checkNotNullParameter(e4, "<this>");
        Iterator it = SequencesKt.generateSequence(e4, C0526c.h).iterator();
        while (it.hasNext()) {
            if (((E) it.next()).h == i) {
                return true;
            }
        }
        return false;
    }

    public static MappedByteBuffer v(Context context, Uri uri) {
        ParcelFileDescriptor openFileDescriptor;
        try {
            openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
        } catch (IOException unused) {
        }
        if (openFileDescriptor == null) {
            if (openFileDescriptor != null) {
                openFileDescriptor.close();
                return null;
            }
            return null;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
            try {
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                fileInputStream.close();
                openFileDescriptor.close();
                return map;
            } finally {
            }
        } finally {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d8, code lost:
    
        continue;
     */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, r3.h] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static r3.x w(r3.C0579k... r11) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.AbstractC0106b.w(r3.k[]):r3.x");
    }

    public static void x(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    public abstract Method j(Class cls, Field field);

    public abstract Constructor k(Class cls);

    public abstract void l(t tVar, float f2, float f4);

    public abstract String[] o(Class cls);

    public abstract boolean t(Class cls);

    public abstract void y(int i);

    public abstract void z(Typeface typeface, boolean z3);
}
