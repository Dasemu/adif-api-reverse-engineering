package androidx.constraintlayout.widget;

import C.w;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import com.adif.elcanomovil.commonNavGraph.arguments.NavArguments;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
import u.AbstractC0629f;
import v.AbstractC0635a;
import y.AbstractC0659a;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f2742d = {0, 4, 8};

    /* renamed from: e, reason: collision with root package name */
    public static final SparseIntArray f2743e;

    /* renamed from: f, reason: collision with root package name */
    public static final SparseIntArray f2744f;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f2745a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2746b = true;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f2747c = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f2743e = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f2744f = sparseIntArray2;
        sparseIntArray.append(82, 25);
        sparseIntArray.append(83, 26);
        sparseIntArray.append(85, 29);
        sparseIntArray.append(86, 30);
        sparseIntArray.append(92, 36);
        sparseIntArray.append(91, 35);
        sparseIntArray.append(63, 4);
        sparseIntArray.append(62, 3);
        sparseIntArray.append(58, 1);
        sparseIntArray.append(60, 91);
        sparseIntArray.append(59, 92);
        sparseIntArray.append(101, 6);
        sparseIntArray.append(102, 7);
        sparseIntArray.append(70, 17);
        sparseIntArray.append(71, 18);
        sparseIntArray.append(72, 19);
        sparseIntArray.append(54, 99);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(87, 32);
        sparseIntArray.append(88, 33);
        sparseIntArray.append(69, 10);
        sparseIntArray.append(68, 9);
        sparseIntArray.append(106, 13);
        sparseIntArray.append(109, 16);
        sparseIntArray.append(107, 14);
        sparseIntArray.append(104, 11);
        sparseIntArray.append(108, 15);
        sparseIntArray.append(105, 12);
        sparseIntArray.append(95, 40);
        sparseIntArray.append(80, 39);
        sparseIntArray.append(79, 41);
        sparseIntArray.append(94, 42);
        sparseIntArray.append(78, 20);
        sparseIntArray.append(93, 37);
        sparseIntArray.append(67, 5);
        sparseIntArray.append(81, 87);
        sparseIntArray.append(90, 87);
        sparseIntArray.append(84, 87);
        sparseIntArray.append(61, 87);
        sparseIntArray.append(57, 87);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(96, 95);
        sparseIntArray.append(73, 96);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(97, 54);
        sparseIntArray.append(74, 55);
        sparseIntArray.append(98, 56);
        sparseIntArray.append(75, 57);
        sparseIntArray.append(99, 58);
        sparseIntArray.append(76, 59);
        sparseIntArray.append(64, 61);
        sparseIntArray.append(66, 62);
        sparseIntArray.append(65, 63);
        sparseIntArray.append(28, 64);
        sparseIntArray.append(121, 65);
        sparseIntArray.append(35, 66);
        sparseIntArray.append(122, 67);
        sparseIntArray.append(113, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(112, 68);
        sparseIntArray.append(100, 69);
        sparseIntArray.append(77, 70);
        sparseIntArray.append(111, 97);
        sparseIntArray.append(32, 71);
        sparseIntArray.append(30, 72);
        sparseIntArray.append(31, 73);
        sparseIntArray.append(33, 74);
        sparseIntArray.append(29, 75);
        sparseIntArray.append(114, 76);
        sparseIntArray.append(89, 77);
        sparseIntArray.append(123, 78);
        sparseIntArray.append(56, 80);
        sparseIntArray.append(55, 81);
        sparseIntArray.append(116, 82);
        sparseIntArray.append(120, 83);
        sparseIntArray.append(119, 84);
        sparseIntArray.append(118, 85);
        sparseIntArray.append(117, 86);
        sparseIntArray2.append(85, 6);
        sparseIntArray2.append(85, 7);
        sparseIntArray2.append(0, 27);
        sparseIntArray2.append(89, 13);
        sparseIntArray2.append(92, 16);
        sparseIntArray2.append(90, 14);
        sparseIntArray2.append(87, 11);
        sparseIntArray2.append(91, 15);
        sparseIntArray2.append(88, 12);
        sparseIntArray2.append(78, 40);
        sparseIntArray2.append(71, 39);
        sparseIntArray2.append(70, 41);
        sparseIntArray2.append(77, 42);
        sparseIntArray2.append(69, 20);
        sparseIntArray2.append(76, 37);
        sparseIntArray2.append(60, 5);
        sparseIntArray2.append(72, 87);
        sparseIntArray2.append(75, 87);
        sparseIntArray2.append(73, 87);
        sparseIntArray2.append(57, 87);
        sparseIntArray2.append(56, 87);
        sparseIntArray2.append(5, 24);
        sparseIntArray2.append(7, 28);
        sparseIntArray2.append(23, 31);
        sparseIntArray2.append(24, 8);
        sparseIntArray2.append(6, 34);
        sparseIntArray2.append(8, 2);
        sparseIntArray2.append(3, 23);
        sparseIntArray2.append(4, 21);
        sparseIntArray2.append(79, 95);
        sparseIntArray2.append(64, 96);
        sparseIntArray2.append(2, 22);
        sparseIntArray2.append(13, 43);
        sparseIntArray2.append(26, 44);
        sparseIntArray2.append(21, 45);
        sparseIntArray2.append(22, 46);
        sparseIntArray2.append(20, 60);
        sparseIntArray2.append(18, 47);
        sparseIntArray2.append(19, 48);
        sparseIntArray2.append(14, 49);
        sparseIntArray2.append(15, 50);
        sparseIntArray2.append(16, 51);
        sparseIntArray2.append(17, 52);
        sparseIntArray2.append(25, 53);
        sparseIntArray2.append(80, 54);
        sparseIntArray2.append(65, 55);
        sparseIntArray2.append(81, 56);
        sparseIntArray2.append(66, 57);
        sparseIntArray2.append(82, 58);
        sparseIntArray2.append(67, 59);
        sparseIntArray2.append(59, 62);
        sparseIntArray2.append(58, 63);
        sparseIntArray2.append(28, 64);
        sparseIntArray2.append(105, 65);
        sparseIntArray2.append(34, 66);
        sparseIntArray2.append(106, 67);
        sparseIntArray2.append(96, 79);
        sparseIntArray2.append(1, 38);
        sparseIntArray2.append(97, 98);
        sparseIntArray2.append(95, 68);
        sparseIntArray2.append(83, 69);
        sparseIntArray2.append(68, 70);
        sparseIntArray2.append(32, 71);
        sparseIntArray2.append(30, 72);
        sparseIntArray2.append(31, 73);
        sparseIntArray2.append(33, 74);
        sparseIntArray2.append(29, 75);
        sparseIntArray2.append(98, 76);
        sparseIntArray2.append(74, 77);
        sparseIntArray2.append(107, 78);
        sparseIntArray2.append(55, 80);
        sparseIntArray2.append(54, 81);
        sparseIntArray2.append(100, 82);
        sparseIntArray2.append(104, 83);
        sparseIntArray2.append(103, 84);
        sparseIntArray2.append(102, 85);
        sparseIntArray2.append(101, 86);
        sparseIntArray2.append(94, 97);
    }

    public static int[] c(a aVar, String str) {
        int i;
        Object designInformation;
        String[] split = str.split(",");
        Context context = aVar.getContext();
        int[] iArr = new int[split.length];
        int i4 = 0;
        int i5 = 0;
        while (i4 < split.length) {
            String trim = split[i4].trim();
            try {
                i = r.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = context.getResources().getIdentifier(trim, NavArguments.ARG_TYPE_NOTIFICATION_JSON_MESSAGE_TRAIN, context.getPackageName());
            }
            if (i == 0 && aVar.isInEditMode() && (aVar.getParent() instanceof ConstraintLayout) && (designInformation = ((ConstraintLayout) aVar.getParent()).getDesignInformation(0, trim)) != null && (designInformation instanceof Integer)) {
                i = ((Integer) designInformation).intValue();
            }
            iArr[i5] = i;
            i4++;
            i5++;
        }
        return i5 != split.length ? Arrays.copyOf(iArr, i5) : iArr;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0088. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:129:0x05fc. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r3v133, types: [java.lang.Object, androidx.constraintlayout.widget.j] */
    public static k d(Context context, AttributeSet attributeSet, boolean z3) {
        int i;
        String str;
        String str2;
        int i4;
        int i5;
        k kVar = new k();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z3 ? s.f2750c : s.f2748a);
        int[] iArr = f2742d;
        String[] strArr = AbstractC0635a.f8626a;
        SparseIntArray sparseIntArray = f2743e;
        n nVar = kVar.f2650b;
        o oVar = kVar.f2653e;
        m mVar = kVar.f2651c;
        l lVar = kVar.f2652d;
        String str3 = "ConstraintSet";
        if (z3) {
            ?? obj = new Object();
            obj.f2639a = new int[10];
            obj.f2640b = new int[10];
            obj.f2641c = 0;
            obj.f2642d = new int[10];
            obj.f2643e = new float[10];
            obj.f2644f = 0;
            obj.f2645g = new int[5];
            obj.h = new String[5];
            obj.i = 0;
            obj.f2646j = new int[4];
            obj.f2647k = new boolean[4];
            obj.f2648l = 0;
            mVar.getClass();
            lVar.getClass();
            oVar.getClass();
            int i6 = 0;
            for (int indexCount = obtainStyledAttributes.getIndexCount(); i6 < indexCount; indexCount = i5) {
                int index = obtainStyledAttributes.getIndex(i6);
                int i7 = i6;
                switch (f2744f.get(index)) {
                    case 2:
                        i5 = indexCount;
                        obj.b(2, obtainStyledAttributes.getDimensionPixelSize(index, lVar.f2664I));
                        break;
                    case 3:
                    case 4:
                    case 9:
                    case 10:
                    case 25:
                    case 26:
                    case 29:
                    case 30:
                    case 32:
                    case 33:
                    case 35:
                    case 36:
                    case 61:
                    case 88:
                    case 89:
                    case 90:
                    case 91:
                    case 92:
                    default:
                        StringBuilder sb = new StringBuilder("Unknown attribute 0x");
                        i5 = indexCount;
                        sb.append(Integer.toHexString(index));
                        sb.append("   ");
                        sb.append(sparseIntArray.get(index));
                        Log.w("ConstraintSet", sb.toString());
                        break;
                    case 5:
                        i5 = indexCount;
                        obj.c(5, obtainStyledAttributes.getString(index));
                        break;
                    case 6:
                        i5 = indexCount;
                        obj.b(6, obtainStyledAttributes.getDimensionPixelOffset(index, lVar.f2658C));
                        break;
                    case 7:
                        i5 = indexCount;
                        obj.b(7, obtainStyledAttributes.getDimensionPixelOffset(index, lVar.f2659D));
                        break;
                    case 8:
                        i5 = indexCount;
                        obj.b(8, obtainStyledAttributes.getDimensionPixelSize(index, lVar.J));
                        break;
                    case 11:
                        i5 = indexCount;
                        obj.b(11, obtainStyledAttributes.getDimensionPixelSize(index, lVar.f2670P));
                        break;
                    case 12:
                        i5 = indexCount;
                        obj.b(12, obtainStyledAttributes.getDimensionPixelSize(index, lVar.f2671Q));
                        break;
                    case 13:
                        i5 = indexCount;
                        obj.b(13, obtainStyledAttributes.getDimensionPixelSize(index, lVar.f2667M));
                        break;
                    case 14:
                        i5 = indexCount;
                        obj.b(14, obtainStyledAttributes.getDimensionPixelSize(index, lVar.f2669O));
                        break;
                    case 15:
                        i5 = indexCount;
                        obj.b(15, obtainStyledAttributes.getDimensionPixelSize(index, lVar.f2672R));
                        break;
                    case 16:
                        i5 = indexCount;
                        obj.b(16, obtainStyledAttributes.getDimensionPixelSize(index, lVar.f2668N));
                        break;
                    case 17:
                        i5 = indexCount;
                        obj.b(17, obtainStyledAttributes.getDimensionPixelOffset(index, lVar.f2686d));
                        break;
                    case 18:
                        i5 = indexCount;
                        obj.b(18, obtainStyledAttributes.getDimensionPixelOffset(index, lVar.f2688e));
                        break;
                    case 19:
                        i5 = indexCount;
                        obj.a(19, obtainStyledAttributes.getFloat(index, lVar.f2690f));
                        break;
                    case 20:
                        i5 = indexCount;
                        obj.a(20, obtainStyledAttributes.getFloat(index, lVar.f2714w));
                        break;
                    case 21:
                        i5 = indexCount;
                        obj.b(21, obtainStyledAttributes.getLayoutDimension(index, lVar.f2684c));
                        break;
                    case 22:
                        i5 = indexCount;
                        obj.b(22, iArr[obtainStyledAttributes.getInt(index, nVar.f2726a)]);
                        break;
                    case 23:
                        i5 = indexCount;
                        obj.b(23, obtainStyledAttributes.getLayoutDimension(index, lVar.f2682b));
                        break;
                    case 24:
                        i5 = indexCount;
                        obj.b(24, obtainStyledAttributes.getDimensionPixelSize(index, lVar.f2661F));
                        break;
                    case 27:
                        i5 = indexCount;
                        obj.b(27, obtainStyledAttributes.getInt(index, lVar.f2660E));
                        break;
                    case 28:
                        i5 = indexCount;
                        obj.b(28, obtainStyledAttributes.getDimensionPixelSize(index, lVar.f2662G));
                        break;
                    case 31:
                        i5 = indexCount;
                        obj.b(31, obtainStyledAttributes.getDimensionPixelSize(index, lVar.f2665K));
                        break;
                    case 34:
                        i5 = indexCount;
                        obj.b(34, obtainStyledAttributes.getDimensionPixelSize(index, lVar.f2663H));
                        break;
                    case 37:
                        i5 = indexCount;
                        obj.a(37, obtainStyledAttributes.getFloat(index, lVar.f2715x));
                        break;
                    case 38:
                        i5 = indexCount;
                        int resourceId = obtainStyledAttributes.getResourceId(index, kVar.f2649a);
                        kVar.f2649a = resourceId;
                        obj.b(38, resourceId);
                        break;
                    case 39:
                        i5 = indexCount;
                        obj.a(39, obtainStyledAttributes.getFloat(index, lVar.f2675U));
                        break;
                    case 40:
                        i5 = indexCount;
                        obj.a(40, obtainStyledAttributes.getFloat(index, lVar.f2674T));
                        break;
                    case 41:
                        i5 = indexCount;
                        obj.b(41, obtainStyledAttributes.getInt(index, lVar.f2676V));
                        break;
                    case 42:
                        i5 = indexCount;
                        obj.b(42, obtainStyledAttributes.getInt(index, lVar.f2677W));
                        break;
                    case 43:
                        i5 = indexCount;
                        obj.a(43, obtainStyledAttributes.getFloat(index, nVar.f2728c));
                        break;
                    case 44:
                        i5 = indexCount;
                        obj.d(44, true);
                        obj.a(44, obtainStyledAttributes.getDimension(index, oVar.f2741m));
                        break;
                    case 45:
                        i5 = indexCount;
                        obj.a(45, obtainStyledAttributes.getFloat(index, oVar.f2732b));
                        break;
                    case 46:
                        i5 = indexCount;
                        obj.a(46, obtainStyledAttributes.getFloat(index, oVar.f2733c));
                        break;
                    case 47:
                        i5 = indexCount;
                        obj.a(47, obtainStyledAttributes.getFloat(index, oVar.f2734d));
                        break;
                    case 48:
                        i5 = indexCount;
                        obj.a(48, obtainStyledAttributes.getFloat(index, oVar.f2735e));
                        break;
                    case 49:
                        i5 = indexCount;
                        obj.a(49, obtainStyledAttributes.getDimension(index, oVar.f2736f));
                        break;
                    case 50:
                        i5 = indexCount;
                        obj.a(50, obtainStyledAttributes.getDimension(index, oVar.f2737g));
                        break;
                    case 51:
                        i5 = indexCount;
                        obj.a(51, obtainStyledAttributes.getDimension(index, oVar.i));
                        break;
                    case 52:
                        i5 = indexCount;
                        obj.a(52, obtainStyledAttributes.getDimension(index, oVar.f2738j));
                        break;
                    case 53:
                        i5 = indexCount;
                        obj.a(53, obtainStyledAttributes.getDimension(index, oVar.f2739k));
                        break;
                    case 54:
                        i5 = indexCount;
                        obj.b(54, obtainStyledAttributes.getInt(index, lVar.f2678X));
                        break;
                    case 55:
                        i5 = indexCount;
                        obj.b(55, obtainStyledAttributes.getInt(index, lVar.f2679Y));
                        break;
                    case 56:
                        i5 = indexCount;
                        obj.b(56, obtainStyledAttributes.getDimensionPixelSize(index, lVar.Z));
                        break;
                    case 57:
                        i5 = indexCount;
                        obj.b(57, obtainStyledAttributes.getDimensionPixelSize(index, lVar.f2681a0));
                        break;
                    case 58:
                        i5 = indexCount;
                        obj.b(58, obtainStyledAttributes.getDimensionPixelSize(index, lVar.f2683b0));
                        break;
                    case 59:
                        i5 = indexCount;
                        obj.b(59, obtainStyledAttributes.getDimensionPixelSize(index, lVar.f2685c0));
                        break;
                    case 60:
                        i5 = indexCount;
                        obj.a(60, obtainStyledAttributes.getFloat(index, oVar.f2731a));
                        break;
                    case 62:
                        i5 = indexCount;
                        obj.b(62, obtainStyledAttributes.getDimensionPixelSize(index, lVar.f2656A));
                        break;
                    case 63:
                        i5 = indexCount;
                        obj.a(63, obtainStyledAttributes.getFloat(index, lVar.f2657B));
                        break;
                    case 64:
                        i5 = indexCount;
                        obj.b(64, f(obtainStyledAttributes, index, mVar.f2719a));
                        break;
                    case 65:
                        i5 = indexCount;
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            obj.c(65, obtainStyledAttributes.getString(index));
                        } else {
                            obj.c(65, strArr[obtainStyledAttributes.getInteger(index, 0)]);
                        }
                        break;
                    case 66:
                        i5 = indexCount;
                        obj.b(66, obtainStyledAttributes.getInt(index, 0));
                        break;
                    case 67:
                        i5 = indexCount;
                        obj.a(67, obtainStyledAttributes.getFloat(index, mVar.f2723e));
                        break;
                    case 68:
                        i5 = indexCount;
                        obj.a(68, obtainStyledAttributes.getFloat(index, nVar.f2729d));
                        break;
                    case 69:
                        i5 = indexCount;
                        obj.a(69, obtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case 70:
                        i5 = indexCount;
                        obj.a(70, obtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case 71:
                        i5 = indexCount;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        i5 = indexCount;
                        obj.b(72, obtainStyledAttributes.getInt(index, lVar.f2691f0));
                        break;
                    case 73:
                        i5 = indexCount;
                        obj.b(73, obtainStyledAttributes.getDimensionPixelSize(index, lVar.f2693g0));
                        break;
                    case 74:
                        i5 = indexCount;
                        obj.c(74, obtainStyledAttributes.getString(index));
                        break;
                    case 75:
                        i5 = indexCount;
                        obj.d(75, obtainStyledAttributes.getBoolean(index, lVar.f2705n0));
                        break;
                    case 76:
                        i5 = indexCount;
                        obj.b(76, obtainStyledAttributes.getInt(index, mVar.f2721c));
                        break;
                    case 77:
                        i5 = indexCount;
                        obj.c(77, obtainStyledAttributes.getString(index));
                        break;
                    case 78:
                        i5 = indexCount;
                        obj.b(78, obtainStyledAttributes.getInt(index, nVar.f2727b));
                        break;
                    case 79:
                        i5 = indexCount;
                        obj.a(79, obtainStyledAttributes.getFloat(index, mVar.f2722d));
                        break;
                    case 80:
                        i5 = indexCount;
                        obj.d(80, obtainStyledAttributes.getBoolean(index, lVar.f2701l0));
                        break;
                    case 81:
                        i5 = indexCount;
                        obj.d(81, obtainStyledAttributes.getBoolean(index, lVar.f2703m0));
                        break;
                    case 82:
                        i5 = indexCount;
                        obj.b(82, obtainStyledAttributes.getInteger(index, mVar.f2720b));
                        break;
                    case 83:
                        i5 = indexCount;
                        obj.b(83, f(obtainStyledAttributes, index, oVar.h));
                        break;
                    case 84:
                        i5 = indexCount;
                        obj.b(84, obtainStyledAttributes.getInteger(index, mVar.f2725g));
                        break;
                    case 85:
                        i5 = indexCount;
                        obj.a(85, obtainStyledAttributes.getFloat(index, mVar.f2724f));
                        break;
                    case 86:
                        i5 = indexCount;
                        int i8 = obtainStyledAttributes.peekValue(index).type;
                        if (i8 == 1) {
                            int resourceId2 = obtainStyledAttributes.getResourceId(index, -1);
                            mVar.i = resourceId2;
                            obj.b(89, resourceId2);
                            if (mVar.i != -1) {
                                obj.b(88, -2);
                            }
                        } else if (i8 == 3) {
                            String string = obtainStyledAttributes.getString(index);
                            mVar.h = string;
                            obj.c(90, string);
                            if (mVar.h.indexOf(RemoteSettings.FORWARD_SLASH_STRING) > 0) {
                                int resourceId3 = obtainStyledAttributes.getResourceId(index, -1);
                                mVar.i = resourceId3;
                                obj.b(89, resourceId3);
                                obj.b(88, -2);
                            } else {
                                obj.b(88, -1);
                            }
                        } else {
                            obj.b(88, obtainStyledAttributes.getInteger(index, mVar.i));
                        }
                        break;
                    case 87:
                        i5 = indexCount;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                        break;
                    case 93:
                        i5 = indexCount;
                        obj.b(93, obtainStyledAttributes.getDimensionPixelSize(index, lVar.f2666L));
                        break;
                    case 94:
                        i5 = indexCount;
                        obj.b(94, obtainStyledAttributes.getDimensionPixelSize(index, lVar.f2673S));
                        break;
                    case 95:
                        i5 = indexCount;
                        g(obj, obtainStyledAttributes, index, 0);
                        break;
                    case 96:
                        i5 = indexCount;
                        g(obj, obtainStyledAttributes, index, 1);
                        break;
                    case 97:
                        i5 = indexCount;
                        obj.b(97, obtainStyledAttributes.getInt(index, lVar.f2707o0));
                        break;
                    case 98:
                        i5 = indexCount;
                        int i9 = AbstractC0659a.f8973a;
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            obtainStyledAttributes.getString(index);
                        } else {
                            kVar.f2649a = obtainStyledAttributes.getResourceId(index, kVar.f2649a);
                        }
                        break;
                    case 99:
                        i5 = indexCount;
                        obj.d(99, obtainStyledAttributes.getBoolean(index, lVar.f2692g));
                        break;
                }
                i6 = i7 + 1;
            }
        } else {
            String str4 = "CURRENTLY UNSUPPORTED";
            int i10 = 1;
            int i11 = 0;
            for (int indexCount2 = obtainStyledAttributes.getIndexCount(); i11 < indexCount2; indexCount2 = i) {
                int index2 = obtainStyledAttributes.getIndex(i11);
                if (index2 != i10 && 23 != index2) {
                    if (24 != index2) {
                        mVar.getClass();
                        lVar.getClass();
                        oVar.getClass();
                    }
                }
                switch (sparseIntArray.get(index2)) {
                    case 1:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        lVar.p = f(obtainStyledAttributes, index2, lVar.p);
                        i4 = 1;
                        break;
                    case 2:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        lVar.f2664I = obtainStyledAttributes.getDimensionPixelSize(index2, lVar.f2664I);
                        i4 = 1;
                        break;
                    case 3:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        lVar.f2706o = f(obtainStyledAttributes, index2, lVar.f2706o);
                        i4 = 1;
                        break;
                    case 4:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        lVar.f2704n = f(obtainStyledAttributes, index2, lVar.f2704n);
                        i4 = 1;
                        break;
                    case 5:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        lVar.f2716y = obtainStyledAttributes.getString(index2);
                        i4 = 1;
                        break;
                    case 6:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        lVar.f2658C = obtainStyledAttributes.getDimensionPixelOffset(index2, lVar.f2658C);
                        i4 = 1;
                        break;
                    case 7:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        lVar.f2659D = obtainStyledAttributes.getDimensionPixelOffset(index2, lVar.f2659D);
                        i4 = 1;
                        break;
                    case 8:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        lVar.J = obtainStyledAttributes.getDimensionPixelSize(index2, lVar.J);
                        i4 = 1;
                        break;
                    case 9:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        lVar.f2713v = f(obtainStyledAttributes, index2, lVar.f2713v);
                        i4 = 1;
                        break;
                    case 10:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        lVar.f2712u = f(obtainStyledAttributes, index2, lVar.f2712u);
                        i4 = 1;
                        break;
                    case 11:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        lVar.f2670P = obtainStyledAttributes.getDimensionPixelSize(index2, lVar.f2670P);
                        i4 = 1;
                        break;
                    case 12:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        lVar.f2671Q = obtainStyledAttributes.getDimensionPixelSize(index2, lVar.f2671Q);
                        i4 = 1;
                        break;
                    case 13:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        lVar.f2667M = obtainStyledAttributes.getDimensionPixelSize(index2, lVar.f2667M);
                        i4 = 1;
                        break;
                    case 14:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        lVar.f2669O = obtainStyledAttributes.getDimensionPixelSize(index2, lVar.f2669O);
                        i4 = 1;
                        break;
                    case 15:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        lVar.f2672R = obtainStyledAttributes.getDimensionPixelSize(index2, lVar.f2672R);
                        i4 = 1;
                        break;
                    case 16:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        lVar.f2668N = obtainStyledAttributes.getDimensionPixelSize(index2, lVar.f2668N);
                        i4 = 1;
                        break;
                    case 17:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        lVar.f2686d = obtainStyledAttributes.getDimensionPixelOffset(index2, lVar.f2686d);
                        i4 = 1;
                        break;
                    case 18:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        lVar.f2688e = obtainStyledAttributes.getDimensionPixelOffset(index2, lVar.f2688e);
                        i4 = 1;
                        break;
                    case 19:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        lVar.f2690f = obtainStyledAttributes.getFloat(index2, lVar.f2690f);
                        i4 = 1;
                        break;
                    case 20:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        lVar.f2714w = obtainStyledAttributes.getFloat(index2, lVar.f2714w);
                        i4 = 1;
                        break;
                    case 21:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        lVar.f2684c = obtainStyledAttributes.getLayoutDimension(index2, lVar.f2684c);
                        i4 = 1;
                        break;
                    case 22:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        int i12 = obtainStyledAttributes.getInt(index2, nVar.f2726a);
                        nVar.f2726a = i12;
                        nVar.f2726a = iArr[i12];
                        i4 = 1;
                        break;
                    case 23:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        lVar.f2682b = obtainStyledAttributes.getLayoutDimension(index2, lVar.f2682b);
                        i4 = 1;
                        break;
                    case 24:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        lVar.f2661F = obtainStyledAttributes.getDimensionPixelSize(index2, lVar.f2661F);
                        i4 = 1;
                        break;
                    case 25:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        lVar.h = f(obtainStyledAttributes, index2, lVar.h);
                        i4 = 1;
                        break;
                    case 26:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        lVar.i = f(obtainStyledAttributes, index2, lVar.i);
                        i4 = 1;
                        break;
                    case 27:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        lVar.f2660E = obtainStyledAttributes.getInt(index2, lVar.f2660E);
                        i4 = 1;
                        break;
                    case 28:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        lVar.f2662G = obtainStyledAttributes.getDimensionPixelSize(index2, lVar.f2662G);
                        i4 = 1;
                        break;
                    case 29:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        lVar.f2696j = f(obtainStyledAttributes, index2, lVar.f2696j);
                        i4 = 1;
                        break;
                    case 30:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        lVar.f2698k = f(obtainStyledAttributes, index2, lVar.f2698k);
                        i4 = 1;
                        break;
                    case 31:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        lVar.f2665K = obtainStyledAttributes.getDimensionPixelSize(index2, lVar.f2665K);
                        i4 = 1;
                        break;
                    case 32:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        lVar.f2710s = f(obtainStyledAttributes, index2, lVar.f2710s);
                        i4 = 1;
                        break;
                    case 33:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        lVar.f2711t = f(obtainStyledAttributes, index2, lVar.f2711t);
                        i4 = 1;
                        break;
                    case 34:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        lVar.f2663H = obtainStyledAttributes.getDimensionPixelSize(index2, lVar.f2663H);
                        i4 = 1;
                        break;
                    case 35:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        lVar.f2702m = f(obtainStyledAttributes, index2, lVar.f2702m);
                        i4 = 1;
                        break;
                    case 36:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        lVar.f2700l = f(obtainStyledAttributes, index2, lVar.f2700l);
                        i4 = 1;
                        break;
                    case 37:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        lVar.f2715x = obtainStyledAttributes.getFloat(index2, lVar.f2715x);
                        i4 = 1;
                        break;
                    case 38:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        kVar.f2649a = obtainStyledAttributes.getResourceId(index2, kVar.f2649a);
                        i4 = 1;
                        break;
                    case 39:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        lVar.f2675U = obtainStyledAttributes.getFloat(index2, lVar.f2675U);
                        i4 = 1;
                        break;
                    case 40:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        lVar.f2674T = obtainStyledAttributes.getFloat(index2, lVar.f2674T);
                        i4 = 1;
                        break;
                    case 41:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        lVar.f2676V = obtainStyledAttributes.getInt(index2, lVar.f2676V);
                        i4 = 1;
                        break;
                    case 42:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        lVar.f2677W = obtainStyledAttributes.getInt(index2, lVar.f2677W);
                        i4 = 1;
                        break;
                    case 43:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        nVar.f2728c = obtainStyledAttributes.getFloat(index2, nVar.f2728c);
                        i4 = 1;
                        break;
                    case 44:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        oVar.f2740l = true;
                        oVar.f2741m = obtainStyledAttributes.getDimension(index2, oVar.f2741m);
                        i4 = 1;
                        break;
                    case 45:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        oVar.f2732b = obtainStyledAttributes.getFloat(index2, oVar.f2732b);
                        i4 = 1;
                        break;
                    case 46:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        oVar.f2733c = obtainStyledAttributes.getFloat(index2, oVar.f2733c);
                        i4 = 1;
                        break;
                    case 47:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        oVar.f2734d = obtainStyledAttributes.getFloat(index2, oVar.f2734d);
                        i4 = 1;
                        break;
                    case 48:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        oVar.f2735e = obtainStyledAttributes.getFloat(index2, oVar.f2735e);
                        i4 = 1;
                        break;
                    case 49:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        oVar.f2736f = obtainStyledAttributes.getDimension(index2, oVar.f2736f);
                        i4 = 1;
                        break;
                    case 50:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        oVar.f2737g = obtainStyledAttributes.getDimension(index2, oVar.f2737g);
                        i4 = 1;
                        break;
                    case 51:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        oVar.i = obtainStyledAttributes.getDimension(index2, oVar.i);
                        i4 = 1;
                        break;
                    case 52:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        oVar.f2738j = obtainStyledAttributes.getDimension(index2, oVar.f2738j);
                        i4 = 1;
                        break;
                    case 53:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        oVar.f2739k = obtainStyledAttributes.getDimension(index2, oVar.f2739k);
                        i4 = 1;
                        break;
                    case 54:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        lVar.f2678X = obtainStyledAttributes.getInt(index2, lVar.f2678X);
                        i4 = 1;
                        break;
                    case 55:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        lVar.f2679Y = obtainStyledAttributes.getInt(index2, lVar.f2679Y);
                        i4 = 1;
                        break;
                    case 56:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        lVar.Z = obtainStyledAttributes.getDimensionPixelSize(index2, lVar.Z);
                        i4 = 1;
                        break;
                    case 57:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        lVar.f2681a0 = obtainStyledAttributes.getDimensionPixelSize(index2, lVar.f2681a0);
                        i4 = 1;
                        break;
                    case 58:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        lVar.f2683b0 = obtainStyledAttributes.getDimensionPixelSize(index2, lVar.f2683b0);
                        i4 = 1;
                        break;
                    case 59:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        lVar.f2685c0 = obtainStyledAttributes.getDimensionPixelSize(index2, lVar.f2685c0);
                        i4 = 1;
                        break;
                    case 60:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        oVar.f2731a = obtainStyledAttributes.getFloat(index2, oVar.f2731a);
                        i4 = 1;
                        break;
                    case 61:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        lVar.f2717z = f(obtainStyledAttributes, index2, lVar.f2717z);
                        i4 = 1;
                        break;
                    case 62:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        lVar.f2656A = obtainStyledAttributes.getDimensionPixelSize(index2, lVar.f2656A);
                        i4 = 1;
                        break;
                    case 63:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        lVar.f2657B = obtainStyledAttributes.getFloat(index2, lVar.f2657B);
                        i4 = 1;
                        break;
                    case 64:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        mVar.f2719a = f(obtainStyledAttributes, index2, mVar.f2719a);
                        i4 = 1;
                        break;
                    case 65:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        if (obtainStyledAttributes.peekValue(index2).type == 3) {
                            obtainStyledAttributes.getString(index2);
                            mVar.getClass();
                            i4 = 1;
                            break;
                        } else {
                            String str5 = strArr[obtainStyledAttributes.getInteger(index2, 0)];
                            mVar.getClass();
                            i4 = 1;
                        }
                    case 66:
                        i = indexCount2;
                        str = str4;
                        obtainStyledAttributes.getInt(index2, 0);
                        mVar.getClass();
                        str2 = str3;
                        i4 = 1;
                        break;
                    case 67:
                        i = indexCount2;
                        str = str4;
                        mVar.f2723e = obtainStyledAttributes.getFloat(index2, mVar.f2723e);
                        str2 = str3;
                        i4 = 1;
                        break;
                    case 68:
                        i = indexCount2;
                        str = str4;
                        nVar.f2729d = obtainStyledAttributes.getFloat(index2, nVar.f2729d);
                        str2 = str3;
                        i4 = 1;
                        break;
                    case 69:
                        i = indexCount2;
                        str = str4;
                        lVar.f2687d0 = obtainStyledAttributes.getFloat(index2, 1.0f);
                        str2 = str3;
                        i4 = 1;
                        break;
                    case 70:
                        i = indexCount2;
                        str = str4;
                        lVar.f2689e0 = obtainStyledAttributes.getFloat(index2, 1.0f);
                        str2 = str3;
                        i4 = 1;
                        break;
                    case 71:
                        i = indexCount2;
                        str = str4;
                        Log.e(str3, str);
                        str2 = str3;
                        i4 = 1;
                        break;
                    case 72:
                        i = indexCount2;
                        lVar.f2691f0 = obtainStyledAttributes.getInt(index2, lVar.f2691f0);
                        str = str4;
                        i4 = 1;
                        str2 = str3;
                        break;
                    case 73:
                        i = indexCount2;
                        lVar.f2693g0 = obtainStyledAttributes.getDimensionPixelSize(index2, lVar.f2693g0);
                        str = str4;
                        i4 = 1;
                        str2 = str3;
                        break;
                    case 74:
                        i = indexCount2;
                        lVar.f2697j0 = obtainStyledAttributes.getString(index2);
                        str = str4;
                        i4 = 1;
                        str2 = str3;
                        break;
                    case 75:
                        i = indexCount2;
                        lVar.f2705n0 = obtainStyledAttributes.getBoolean(index2, lVar.f2705n0);
                        str = str4;
                        i4 = 1;
                        str2 = str3;
                        break;
                    case 76:
                        i = indexCount2;
                        mVar.f2721c = obtainStyledAttributes.getInt(index2, mVar.f2721c);
                        str = str4;
                        i4 = 1;
                        str2 = str3;
                        break;
                    case 77:
                        i = indexCount2;
                        lVar.f2699k0 = obtainStyledAttributes.getString(index2);
                        str = str4;
                        i4 = 1;
                        str2 = str3;
                        break;
                    case 78:
                        i = indexCount2;
                        nVar.f2727b = obtainStyledAttributes.getInt(index2, nVar.f2727b);
                        str = str4;
                        i4 = 1;
                        str2 = str3;
                        break;
                    case 79:
                        i = indexCount2;
                        mVar.f2722d = obtainStyledAttributes.getFloat(index2, mVar.f2722d);
                        str = str4;
                        i4 = 1;
                        str2 = str3;
                        break;
                    case 80:
                        i = indexCount2;
                        lVar.f2701l0 = obtainStyledAttributes.getBoolean(index2, lVar.f2701l0);
                        str = str4;
                        i4 = 1;
                        str2 = str3;
                        break;
                    case 81:
                        i = indexCount2;
                        lVar.f2703m0 = obtainStyledAttributes.getBoolean(index2, lVar.f2703m0);
                        str = str4;
                        i4 = 1;
                        str2 = str3;
                        break;
                    case 82:
                        i = indexCount2;
                        mVar.f2720b = obtainStyledAttributes.getInteger(index2, mVar.f2720b);
                        str = str4;
                        i4 = 1;
                        str2 = str3;
                        break;
                    case 83:
                        i = indexCount2;
                        oVar.h = f(obtainStyledAttributes, index2, oVar.h);
                        str = str4;
                        i4 = 1;
                        str2 = str3;
                        break;
                    case 84:
                        i = indexCount2;
                        mVar.f2725g = obtainStyledAttributes.getInteger(index2, mVar.f2725g);
                        str = str4;
                        i4 = 1;
                        str2 = str3;
                        break;
                    case 85:
                        i = indexCount2;
                        mVar.f2724f = obtainStyledAttributes.getFloat(index2, mVar.f2724f);
                        str = str4;
                        i4 = 1;
                        str2 = str3;
                        break;
                    case 86:
                        i = indexCount2;
                        int i13 = obtainStyledAttributes.peekValue(index2).type;
                        if (i13 == 1) {
                            mVar.i = obtainStyledAttributes.getResourceId(index2, -1);
                        } else if (i13 == 3) {
                            String string2 = obtainStyledAttributes.getString(index2);
                            mVar.h = string2;
                            if (string2.indexOf(RemoteSettings.FORWARD_SLASH_STRING) > 0) {
                                mVar.i = obtainStyledAttributes.getResourceId(index2, -1);
                            }
                        } else {
                            obtainStyledAttributes.getInteger(index2, mVar.i);
                        }
                        str = str4;
                        i4 = 1;
                        str2 = str3;
                        break;
                    case 87:
                        i = indexCount2;
                        Log.w(str3, "unused attribute 0x" + Integer.toHexString(index2) + "   " + sparseIntArray.get(index2));
                        str = str4;
                        i4 = 1;
                        str2 = str3;
                        break;
                    case 88:
                    case 89:
                    case 90:
                    default:
                        StringBuilder sb2 = new StringBuilder("Unknown attribute 0x");
                        i = indexCount2;
                        sb2.append(Integer.toHexString(index2));
                        sb2.append("   ");
                        sb2.append(sparseIntArray.get(index2));
                        Log.w(str3, sb2.toString());
                        str = str4;
                        i4 = 1;
                        str2 = str3;
                        break;
                    case 91:
                        i = indexCount2;
                        lVar.f2708q = f(obtainStyledAttributes, index2, lVar.f2708q);
                        str = str4;
                        i4 = 1;
                        str2 = str3;
                        break;
                    case 92:
                        i = indexCount2;
                        lVar.f2709r = f(obtainStyledAttributes, index2, lVar.f2709r);
                        str = str4;
                        i4 = 1;
                        str2 = str3;
                        break;
                    case 93:
                        i = indexCount2;
                        lVar.f2666L = obtainStyledAttributes.getDimensionPixelSize(index2, lVar.f2666L);
                        str = str4;
                        i4 = 1;
                        str2 = str3;
                        break;
                    case 94:
                        i = indexCount2;
                        lVar.f2673S = obtainStyledAttributes.getDimensionPixelSize(index2, lVar.f2673S);
                        str = str4;
                        i4 = 1;
                        str2 = str3;
                        break;
                    case 95:
                        i = indexCount2;
                        g(lVar, obtainStyledAttributes, index2, 0);
                        str = str4;
                        i4 = 1;
                        str2 = str3;
                        break;
                    case 96:
                        i = indexCount2;
                        g(lVar, obtainStyledAttributes, index2, 1);
                        i4 = 1;
                        str = str4;
                        str2 = str3;
                        break;
                    case 97:
                        i = indexCount2;
                        lVar.f2707o0 = obtainStyledAttributes.getInt(index2, lVar.f2707o0);
                        str = str4;
                        i4 = 1;
                        str2 = str3;
                        break;
                }
                i11++;
                i10 = i4;
                str3 = str2;
                str4 = str;
            }
            if (lVar.f2697j0 != null) {
                lVar.f2695i0 = null;
            }
        }
        obtainStyledAttributes.recycle();
        return kVar;
    }

    public static int f(TypedArray typedArray, int i, int i4) {
        int resourceId = typedArray.getResourceId(i, i4);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void g(java.lang.Object r7, android.content.res.TypedArray r8, int r9, int r10) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.p.g(java.lang.Object, android.content.res.TypedArray, int, int):void");
    }

    public static void h(e eVar, String str) {
        if (str != null) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            int i = -1;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                i = substring.equalsIgnoreCase("W") ? 0 : substring.equalsIgnoreCase("H") ? 1 : -1;
                r2 = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            try {
                if (indexOf2 < 0 || indexOf2 >= length - 1) {
                    String substring2 = str.substring(r2);
                    if (substring2.length() > 0) {
                        Float.parseFloat(substring2);
                    }
                } else {
                    String substring3 = str.substring(r2, indexOf2);
                    String substring4 = str.substring(indexOf2 + 1);
                    if (substring3.length() > 0 && substring4.length() > 0) {
                        float parseFloat = Float.parseFloat(substring3);
                        float parseFloat2 = Float.parseFloat(substring4);
                        if (parseFloat > BitmapDescriptorFactory.HUE_RED && parseFloat2 > BitmapDescriptorFactory.HUE_RED) {
                            if (i == 1) {
                                Math.abs(parseFloat2 / parseFloat);
                            } else {
                                Math.abs(parseFloat / parseFloat2);
                            }
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        eVar.f2560G = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:45:0x0105. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [androidx.constraintlayout.widget.c, androidx.constraintlayout.widget.a, android.view.View] */
    /* JADX WARN: Type inference failed for: r9v1, types: [w.i, w.a] */
    public final void a(ConstraintLayout constraintLayout) {
        HashSet hashSet;
        int i;
        int i4;
        String str;
        p pVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap = pVar.f2747c;
        HashSet hashSet2 = new HashSet(hashMap.keySet());
        int i5 = 0;
        while (i5 < childCount) {
            View childAt = constraintLayout.getChildAt(i5);
            int id = childAt.getId();
            if (!hashMap.containsKey(Integer.valueOf(id))) {
                StringBuilder sb = new StringBuilder("id unknown ");
                try {
                    str = childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (Exception unused) {
                    str = "UNKNOWN";
                }
                sb.append(str);
                Log.w("ConstraintSet", sb.toString());
            } else {
                if (pVar.f2746b && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (hashMap.containsKey(Integer.valueOf(id))) {
                        hashSet2.remove(Integer.valueOf(id));
                        k kVar = (k) hashMap.get(Integer.valueOf(id));
                        if (kVar != null) {
                            if (childAt instanceof a) {
                                l lVar = kVar.f2652d;
                                lVar.f2694h0 = 1;
                                a aVar = (a) childAt;
                                aVar.setId(id);
                                aVar.setType(lVar.f2691f0);
                                aVar.setMargin(lVar.f2693g0);
                                aVar.setAllowsGoneWidget(lVar.f2705n0);
                                int[] iArr = lVar.f2695i0;
                                if (iArr != null) {
                                    aVar.setReferencedIds(iArr);
                                } else {
                                    String str2 = lVar.f2697j0;
                                    if (str2 != null) {
                                        int[] c4 = c(aVar, str2);
                                        lVar.f2695i0 = c4;
                                        aVar.setReferencedIds(c4);
                                    }
                                }
                            }
                            e eVar = (e) childAt.getLayoutParams();
                            eVar.a();
                            kVar.a(eVar);
                            HashMap hashMap2 = kVar.f2654f;
                            Class<?> cls = childAt.getClass();
                            for (String str3 : hashMap2.keySet()) {
                                b bVar = (b) hashMap2.get(str3);
                                String z3 = !bVar.f2539a ? w.z("set", str3) : str3;
                                HashSet hashSet3 = hashSet2;
                                try {
                                    int b4 = AbstractC0629f.b(bVar.f2540b);
                                    Class cls2 = Float.TYPE;
                                    Class cls3 = Integer.TYPE;
                                    switch (b4) {
                                        case 0:
                                            i4 = i5;
                                            cls.getMethod(z3, cls3).invoke(childAt, Integer.valueOf(bVar.f2541c));
                                            break;
                                        case 1:
                                            i4 = i5;
                                            cls.getMethod(z3, cls2).invoke(childAt, Float.valueOf(bVar.f2542d));
                                            break;
                                        case 2:
                                            i4 = i5;
                                            cls.getMethod(z3, cls3).invoke(childAt, Integer.valueOf(bVar.f2545g));
                                            break;
                                        case 3:
                                            Method method = cls.getMethod(z3, Drawable.class);
                                            i4 = i5;
                                            try {
                                                ColorDrawable colorDrawable = new ColorDrawable();
                                                colorDrawable.setColor(bVar.f2545g);
                                                method.invoke(childAt, colorDrawable);
                                            } catch (IllegalAccessException e4) {
                                                e = e4;
                                                StringBuilder p = com.google.android.gms.measurement.internal.a.p(" Custom Attribute \"", str3, "\" not found on ");
                                                p.append(cls.getName());
                                                Log.e("TransitionLayout", p.toString());
                                                e.printStackTrace();
                                                hashSet2 = hashSet3;
                                                i5 = i4;
                                            } catch (NoSuchMethodException e5) {
                                                e = e5;
                                                Log.e("TransitionLayout", e.getMessage());
                                                Log.e("TransitionLayout", " Custom Attribute \"" + str3 + "\" not found on " + cls.getName());
                                                Log.e("TransitionLayout", cls.getName() + " must have a method " + z3);
                                                hashSet2 = hashSet3;
                                                i5 = i4;
                                            } catch (InvocationTargetException e6) {
                                                e = e6;
                                                StringBuilder p3 = com.google.android.gms.measurement.internal.a.p(" Custom Attribute \"", str3, "\" not found on ");
                                                p3.append(cls.getName());
                                                Log.e("TransitionLayout", p3.toString());
                                                e.printStackTrace();
                                                hashSet2 = hashSet3;
                                                i5 = i4;
                                            }
                                        case 4:
                                            cls.getMethod(z3, CharSequence.class).invoke(childAt, bVar.f2543e);
                                            i4 = i5;
                                            break;
                                        case 5:
                                            cls.getMethod(z3, Boolean.TYPE).invoke(childAt, Boolean.valueOf(bVar.f2544f));
                                            i4 = i5;
                                            break;
                                        case 6:
                                            cls.getMethod(z3, cls2).invoke(childAt, Float.valueOf(bVar.f2542d));
                                            i4 = i5;
                                            break;
                                        case 7:
                                            cls.getMethod(z3, cls3).invoke(childAt, Integer.valueOf(bVar.f2541c));
                                            i4 = i5;
                                            break;
                                        default:
                                            i4 = i5;
                                            break;
                                    }
                                } catch (IllegalAccessException e7) {
                                    e = e7;
                                    i4 = i5;
                                } catch (NoSuchMethodException e8) {
                                    e = e8;
                                    i4 = i5;
                                } catch (InvocationTargetException e9) {
                                    e = e9;
                                    i4 = i5;
                                }
                                hashSet2 = hashSet3;
                                i5 = i4;
                            }
                            hashSet = hashSet2;
                            i = i5;
                            childAt.setLayoutParams(eVar);
                            n nVar = kVar.f2650b;
                            if (nVar.f2727b == 0) {
                                childAt.setVisibility(nVar.f2726a);
                            }
                            childAt.setAlpha(nVar.f2728c);
                            o oVar = kVar.f2653e;
                            childAt.setRotation(oVar.f2731a);
                            childAt.setRotationX(oVar.f2732b);
                            childAt.setRotationY(oVar.f2733c);
                            childAt.setScaleX(oVar.f2734d);
                            childAt.setScaleY(oVar.f2735e);
                            if (oVar.h != -1) {
                                if (((View) childAt.getParent()).findViewById(oVar.h) != null) {
                                    float bottom = (r1.getBottom() + r1.getTop()) / 2.0f;
                                    float right = (r1.getRight() + r1.getLeft()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        childAt.setPivotX(right - childAt.getLeft());
                                        childAt.setPivotY(bottom - childAt.getTop());
                                    }
                                }
                            } else {
                                if (!Float.isNaN(oVar.f2736f)) {
                                    childAt.setPivotX(oVar.f2736f);
                                }
                                if (!Float.isNaN(oVar.f2737g)) {
                                    childAt.setPivotY(oVar.f2737g);
                                }
                            }
                            childAt.setTranslationX(oVar.i);
                            childAt.setTranslationY(oVar.f2738j);
                            childAt.setTranslationZ(oVar.f2739k);
                            if (oVar.f2740l) {
                                childAt.setElevation(oVar.f2741m);
                            }
                        }
                    } else {
                        hashSet = hashSet2;
                        i = i5;
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                    i5 = i + 1;
                    pVar = this;
                    hashSet2 = hashSet;
                }
            }
            hashSet = hashSet2;
            i = i5;
            i5 = i + 1;
            pVar = this;
            hashSet2 = hashSet;
        }
        Iterator it = hashSet2.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            k kVar2 = (k) hashMap.get(num);
            if (kVar2 != null) {
                l lVar2 = kVar2.f2652d;
                if (lVar2.f2694h0 == 1) {
                    Context context = constraintLayout.getContext();
                    ?? view = new View(context);
                    view.f2546a = new int[32];
                    view.f2552g = new HashMap();
                    view.f2548c = context;
                    ?? iVar = new w.i();
                    iVar.f8638s0 = 0;
                    iVar.f8639t0 = true;
                    iVar.f8640u0 = 0;
                    iVar.f8641v0 = false;
                    view.f2538j = iVar;
                    view.f2549d = iVar;
                    view.i();
                    view.setVisibility(8);
                    view.setId(num.intValue());
                    int[] iArr2 = lVar2.f2695i0;
                    if (iArr2 != null) {
                        view.setReferencedIds(iArr2);
                    } else {
                        String str4 = lVar2.f2697j0;
                        if (str4 != null) {
                            int[] c5 = c(view, str4);
                            lVar2.f2695i0 = c5;
                            view.setReferencedIds(c5);
                        }
                    }
                    view.setType(lVar2.f2691f0);
                    view.setMargin(lVar2.f2693g0);
                    e generateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                    view.i();
                    kVar2.a(generateDefaultLayoutParams);
                    constraintLayout.addView((View) view, generateDefaultLayoutParams);
                }
                if (lVar2.f2680a) {
                    Guideline guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    e generateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                    kVar2.a(generateDefaultLayoutParams2);
                    constraintLayout.addView(guideline, generateDefaultLayoutParams2);
                }
            }
        }
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt2 = constraintLayout.getChildAt(i6);
            if (childAt2 instanceof c) {
                ((c) childAt2).e(constraintLayout);
            }
        }
    }

    public final void b(ConstraintLayout constraintLayout) {
        int i;
        int i4;
        p pVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap = pVar.f2747c;
        hashMap.clear();
        int i5 = 0;
        while (i5 < childCount) {
            View childAt = constraintLayout.getChildAt(i5);
            e eVar = (e) childAt.getLayoutParams();
            int id = childAt.getId();
            if (pVar.f2746b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!hashMap.containsKey(Integer.valueOf(id))) {
                hashMap.put(Integer.valueOf(id), new k());
            }
            k kVar = (k) hashMap.get(Integer.valueOf(id));
            if (kVar == null) {
                i = childCount;
            } else {
                HashMap hashMap2 = pVar.f2745a;
                HashMap hashMap3 = new HashMap();
                Class<?> cls = childAt.getClass();
                for (String str : hashMap2.keySet()) {
                    b bVar = (b) hashMap2.get(str);
                    try {
                        if (str.equals("BackgroundColor")) {
                            hashMap3.put(str, new b(bVar, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                            i4 = childCount;
                        } else {
                            i4 = childCount;
                            try {
                                hashMap3.put(str, new b(bVar, cls.getMethod("getMap" + str, new Class[0]).invoke(childAt, new Object[0])));
                            } catch (IllegalAccessException e4) {
                                e = e4;
                                e.printStackTrace();
                                childCount = i4;
                            } catch (NoSuchMethodException e5) {
                                e = e5;
                                e.printStackTrace();
                                childCount = i4;
                            } catch (InvocationTargetException e6) {
                                e = e6;
                                e.printStackTrace();
                                childCount = i4;
                            }
                        }
                    } catch (IllegalAccessException e7) {
                        e = e7;
                        i4 = childCount;
                    } catch (NoSuchMethodException e8) {
                        e = e8;
                        i4 = childCount;
                    } catch (InvocationTargetException e9) {
                        e = e9;
                        i4 = childCount;
                    }
                    childCount = i4;
                }
                i = childCount;
                kVar.f2654f = hashMap3;
                kVar.f2649a = id;
                int i6 = eVar.f2586e;
                l lVar = kVar.f2652d;
                lVar.h = i6;
                lVar.i = eVar.f2588f;
                lVar.f2696j = eVar.f2590g;
                lVar.f2698k = eVar.h;
                lVar.f2700l = eVar.i;
                lVar.f2702m = eVar.f2594j;
                lVar.f2704n = eVar.f2596k;
                lVar.f2706o = eVar.f2598l;
                lVar.p = eVar.f2600m;
                lVar.f2708q = eVar.f2602n;
                lVar.f2709r = eVar.f2604o;
                lVar.f2710s = eVar.f2609s;
                lVar.f2711t = eVar.f2610t;
                lVar.f2712u = eVar.f2611u;
                lVar.f2713v = eVar.f2612v;
                lVar.f2714w = eVar.f2558E;
                lVar.f2715x = eVar.f2559F;
                lVar.f2716y = eVar.f2560G;
                lVar.f2717z = eVar.p;
                lVar.f2656A = eVar.f2607q;
                lVar.f2657B = eVar.f2608r;
                lVar.f2658C = eVar.f2572T;
                lVar.f2659D = eVar.f2573U;
                lVar.f2660E = eVar.f2574V;
                lVar.f2690f = eVar.f2582c;
                lVar.f2686d = eVar.f2578a;
                lVar.f2688e = eVar.f2580b;
                lVar.f2682b = ((ViewGroup.MarginLayoutParams) eVar).width;
                lVar.f2684c = ((ViewGroup.MarginLayoutParams) eVar).height;
                lVar.f2661F = ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
                lVar.f2662G = ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
                lVar.f2663H = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
                lVar.f2664I = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
                lVar.f2666L = eVar.f2557D;
                lVar.f2674T = eVar.f2562I;
                lVar.f2675U = eVar.f2561H;
                lVar.f2677W = eVar.f2563K;
                lVar.f2676V = eVar.J;
                lVar.f2701l0 = eVar.f2575W;
                lVar.f2703m0 = eVar.f2576X;
                lVar.f2678X = eVar.f2564L;
                lVar.f2679Y = eVar.f2565M;
                lVar.Z = eVar.f2568P;
                lVar.f2681a0 = eVar.f2569Q;
                lVar.f2683b0 = eVar.f2566N;
                lVar.f2685c0 = eVar.f2567O;
                lVar.f2687d0 = eVar.f2570R;
                lVar.f2689e0 = eVar.f2571S;
                lVar.f2699k0 = eVar.f2577Y;
                lVar.f2668N = eVar.f2614x;
                lVar.f2670P = eVar.f2616z;
                lVar.f2667M = eVar.f2613w;
                lVar.f2669O = eVar.f2615y;
                lVar.f2672R = eVar.f2554A;
                lVar.f2671Q = eVar.f2555B;
                lVar.f2673S = eVar.f2556C;
                lVar.f2707o0 = eVar.Z;
                lVar.J = eVar.getMarginEnd();
                lVar.f2665K = eVar.getMarginStart();
                int visibility = childAt.getVisibility();
                n nVar = kVar.f2650b;
                nVar.f2726a = visibility;
                nVar.f2728c = childAt.getAlpha();
                float rotation = childAt.getRotation();
                o oVar = kVar.f2653e;
                oVar.f2731a = rotation;
                oVar.f2732b = childAt.getRotationX();
                oVar.f2733c = childAt.getRotationY();
                oVar.f2734d = childAt.getScaleX();
                oVar.f2735e = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE || pivotY != FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                    oVar.f2736f = pivotX;
                    oVar.f2737g = pivotY;
                }
                oVar.i = childAt.getTranslationX();
                oVar.f2738j = childAt.getTranslationY();
                oVar.f2739k = childAt.getTranslationZ();
                if (oVar.f2740l) {
                    oVar.f2741m = childAt.getElevation();
                }
                if (childAt instanceof a) {
                    a aVar = (a) childAt;
                    lVar.f2705n0 = aVar.getAllowsGoneWidget();
                    lVar.f2695i0 = aVar.getReferencedIds();
                    lVar.f2691f0 = aVar.getType();
                    lVar.f2693g0 = aVar.getMargin();
                }
            }
            i5++;
            pVar = this;
            childCount = i;
        }
    }

    public final void e(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    k d4 = d(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        d4.f2652d.f2680a = true;
                    }
                    this.f2747c.put(Integer.valueOf(d4.f2649a), d4);
                }
            }
        } catch (IOException e4) {
            e4.printStackTrace();
        } catch (XmlPullParserException e5) {
            e5.printStackTrace();
        }
    }
}
