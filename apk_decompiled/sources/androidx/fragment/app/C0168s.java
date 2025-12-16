package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.fragment.app.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0168s extends O0 {
    public static void q(s.e eVar, View view) {
        WeakHashMap weakHashMap = O.X.f1226a;
        String k4 = O.L.k(view);
        if (k4 != null) {
            eVar.put(k4, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View child = viewGroup.getChildAt(i);
                if (child.getVisibility() == 0) {
                    Intrinsics.checkNotNullExpressionValue(child, "child");
                    q(eVar, child);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x04f6, code lost:
    
        if (r6.f3044k.isEmpty() != false) goto L225;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0519, code lost:
    
        r5 = r17;
        r8 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x051f, code lost:
    
        if (r6.f3036a != r8) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0521, code lost:
    
        r6.i = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0526, code lost:
    
        r7 = new androidx.fragment.app.C0153j(r4);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r15);
        r6.f3043j.add(r7);
        r17 = r5;
        r22 = r8;
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x04fc, code lost:
    
        if (androidx.fragment.app.AbstractC0158l0.M(r21) == false) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x04e1, code lost:
    
        r5 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0516, code lost:
    
        r17 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x04fe, code lost:
    
        r5 = r17;
        android.util.Log.v(r5, "Ignoring Animator set on " + r5 + " as this Fragment was involved in a Transition.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x04ea, code lost:
    
        r1.add(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x053a, code lost:
    
        r5 = r17;
        r0 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0544, code lost:
    
        if (r0.hasNext() == false) goto L233;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0546, code lost:
    
        r1 = (androidx.fragment.app.C0149h) r0.next();
        r3 = r1.f3181a;
        r4 = r3.f3038c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0552, code lost:
    
        if (r2 != false) goto L232;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x056f, code lost:
    
        if (r11 == false) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x058c, code lost:
    
        r4 = new androidx.fragment.app.C0147g(r1);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r15);
        r3.f3043j.add(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0575, code lost:
    
        if (androidx.fragment.app.AbstractC0158l0.M(r21) == false) goto L241;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0577, code lost:
    
        android.util.Log.v(r5, "Ignoring Animation set on " + r4 + " as Animations cannot run alongside Animators.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0558, code lost:
    
        if (androidx.fragment.app.AbstractC0158l0.M(r21) == false) goto L243;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x055a, code lost:
    
        android.util.Log.v(r5, "Ignoring Animation set on " + r4 + " as Animations cannot run alongside Transitions.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x059a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x01ee, code lost:
    
        r10 = new java.util.ArrayList();
        r11 = r8;
        r8 = new java.util.ArrayList();
        r9 = new s.j(0);
        r17 = new java.util.ArrayList<>();
        r19 = new java.util.ArrayList();
        r20 = r5;
        r12 = new s.j(0);
        r21 = 2;
        r15 = new s.j(0);
        r13 = r11.iterator();
        r22 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x021e, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x006b, code lost:
    
        r3 = (androidx.fragment.app.J0) r5;
        r4 = r29.listIterator(r29.size());
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0223, code lost:
    
        if (r13.hasNext() == false) goto L245;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0225, code lost:
    
        r29 = r1;
        r1 = ((androidx.fragment.app.r) r13.next()).f3222d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0231, code lost:
    
        if (r1 == null) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0233, code lost:
    
        if (r3 == null) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0235, code lost:
    
        if (r4 == null) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0237, code lost:
    
        r6 = r5.y(r5.h(r1));
        r1 = r4.f3038c;
        r23 = r5;
        r5 = r1.getSharedElementSourceNames();
        r24 = r8;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, "lastIn.fragment.sharedElementSourceNames");
        r8 = r3.f3038c;
        r25 = r10;
        r10 = r8.getSharedElementSourceNames();
        r26 = r11;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, "firstOut.fragment.sharedElementSourceNames");
        r11 = r8.getSharedElementTargetNames();
        r27 = r13;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, "firstOut.fragment.sharedElementTargetNames");
        r13 = r11.size();
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x026d, code lost:
    
        if (r14 >= r13) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x026f, code lost:
    
        r17 = r13;
        r13 = r5.indexOf(r11.get(r14));
        r19 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x027c, code lost:
    
        if (r13 == (-1)) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x027e, code lost:
    
        r5.set(r13, r10.get(r14));
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0285, code lost:
    
        r14 = r14 + 1;
        r13 = r17;
        r11 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x028c, code lost:
    
        r10 = r1.getSharedElementTargetNames();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, "lastIn.fragment.sharedElementTargetNames");
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0295, code lost:
    
        if (r30 != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0297, code lost:
    
        r8.getExitTransitionCallback();
        r1.getEnterTransitionCallback();
        r13 = kotlin.TuplesKt.to(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x02b2, code lost:
    
        if (r13.component1() != null) goto L246;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007a, code lost:
    
        if (r4.hasPrevious() == false) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x02b8, code lost:
    
        if (r13.component2() != null) goto L247;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x02ba, code lost:
    
        r13 = r5.size();
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x02bf, code lost:
    
        if (r14 >= r13) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x02c1, code lost:
    
        r11 = r5.get(r14);
        r17 = r13;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, "exitingNames[i]");
        r13 = r10.get(r14);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r13, "enteringNames[i]");
        r9.put((java.lang.String) r11, r13);
        r14 = r14 + 1;
        r13 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x02e8, code lost:
    
        if (androidx.fragment.app.AbstractC0158l0.M(2) == false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x02ea, code lost:
    
        android.util.Log.v("FragmentManager", ">>> entering view names <<<");
        r11 = r10.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x02f9, code lost:
    
        if (r11.hasNext() == false) goto L255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007c, code lost:
    
        r5 = r4.previous();
        r12 = (androidx.fragment.app.J0) r5;
        r15 = r12.f3038c.mView;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r15, "operation.fragment.mView");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, "<this>");
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x02fb, code lost:
    
        android.util.Log.v("FragmentManager", "Name: " + r11.next());
        r11 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0315, code lost:
    
        android.util.Log.v("FragmentManager", ">>> exiting view names <<<");
        r11 = r5.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0322, code lost:
    
        if (r11.hasNext() == false) goto L256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0324, code lost:
    
        android.util.Log.v("FragmentManager", "Name: " + ((java.lang.String) r11.next()));
        r11 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x033e, code lost:
    
        r8 = r8.mView;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, "firstOut.fragment.mView");
        q(r12, r8);
        r12.l(r5);
        r9.l(r12.keySet());
        r1 = r1.mView;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, "lastIn.fragment.mView");
        q(r15, r1);
        r15.l(r10);
        r15.l(r9.values());
        r1 = androidx.fragment.app.x0.f3272a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, "namedViews");
        r1 = r9.f8352c - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0375, code lost:
    
        if ((-1) >= r1) goto L257;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0093, code lost:
    
        if (r15.getAlpha() != com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x0381, code lost:
    
        if (r15.containsKey((java.lang.String) r9.i(r1)) != false) goto L259;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0383, code lost:
    
        r9.g(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x0386, code lost:
    
        r1 = r1 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x0388, code lost:
    
        r1 = r9.keySet();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, "sharedElementNameMapping.keys");
        r8 = r12.entrySet();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, "entries");
        r11 = 3;
        kotlin.collections.CollectionsKt__MutableCollectionsKt.retainAll((java.util.AbstractSet) r8, new I1.b(r1, r11));
        r1 = r9.values();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, "sharedElementNameMapping.values");
        r8 = r15.entrySet();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, "entries");
        kotlin.collections.CollectionsKt__MutableCollectionsKt.retainAll((java.util.AbstractSet) r8, new I1.b(r1, r11));
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x03c3, code lost:
    
        if (r9.isEmpty() == false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x0405, code lost:
    
        r1 = r29;
        r19 = r5;
        r17 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x040d, code lost:
    
        r5 = r23;
        r8 = r24;
        r10 = r25;
        r11 = r26;
        r13 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x03c5, code lost:
    
        android.util.Log.i("FragmentManager", "Ignoring shared elements transition " + r6 + " between " + r3 + " and " + r4 + " as there are no matching elements in both the entering and exiting fragment. In order to run a SharedElementTransition, both fragments involved must have the element.");
        r25.clear();
        r24.clear();
        r1 = r29;
        r19 = r5;
        r17 = r10;
        r5 = r23;
        r8 = r24;
        r10 = r25;
        r11 = r26;
        r13 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x041e, code lost:
    
        throw new java.lang.ClassCastException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x0424, code lost:
    
        throw new java.lang.ClassCastException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x02a3, code lost:
    
        r8.getEnterTransitionCallback();
        r1.getExitTransitionCallback();
        r13 = kotlin.TuplesKt.to(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0099, code lost:
    
        if (r15.getVisibility() != 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0425, code lost:
    
        r23 = r5;
        r24 = r8;
        r25 = r10;
        r26 = r11;
        r27 = r13;
        r1 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x0435, code lost:
    
        r29 = r1;
        r23 = r5;
        r24 = r8;
        r25 = r10;
        r26 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x043f, code lost:
    
        if (r6 != null) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x0445, code lost:
    
        if (r26.isEmpty() == false) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x0447, code lost:
    
        r15 = r29;
        r17 = "FragmentManager";
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x044c, code lost:
    
        r1 = r26.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x009b, code lost:
    
        r15 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x0454, code lost:
    
        if (r1.hasNext() == false) goto L260;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x045e, code lost:
    
        if (((androidx.fragment.app.r) r1.next()).f3220b != null) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x0461, code lost:
    
        r15 = r29;
        r17 = "FragmentManager";
        r1 = new androidx.fragment.app.C0167q(r26, r3, r4, r23, r6, r25, r24, r9, r17, r19, r12, r15, r30);
        r2 = r26.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x0481, code lost:
    
        if (r2.hasNext() == false) goto L263;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x0483, code lost:
    
        r3 = ((androidx.fragment.app.r) r2.next()).f3181a;
        r3.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r15);
        r3.f3043j.add(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b4, code lost:
    
        if (r15 == r7) goto L203;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x009d, code lost:
    
        r15 = r15.getVisibility();
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x00a1, code lost:
    
        if (r15 == 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x00a3, code lost:
    
        if (r15 == 4) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x00a5, code lost:
    
        if (r15 != 8) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x00a7, code lost:
    
        r15 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x00b2, code lost:
    
        throw new java.lang.IllegalArgumentException(com.google.android.gms.measurement.internal.a.l(r15, "Unknown visibility "));
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x00b3, code lost:
    
        r15 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x00bb, code lost:
    
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b8, code lost:
    
        if (r12.f3036a != r7) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00bc, code lost:
    
        r4 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c6, code lost:
    
        if (androidx.fragment.app.AbstractC0158l0.M(2) == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c8, code lost:
    
        android.util.Log.v("FragmentManager", "Executing operations from " + r3 + " to " + r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00e1, code lost:
    
        r5 = new java.util.ArrayList();
        r8 = new java.util.ArrayList();
        r9 = ((androidx.fragment.app.J0) kotlin.collections.CollectionsKt.last(r29)).f3038c;
        r10 = r29.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00fb, code lost:
    
        if (r10.hasNext() == false) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00fd, code lost:
    
        r11 = ((androidx.fragment.app.J0) r10.next()).f3038c.mAnimationInfo;
        r12 = r9.mAnimationInfo;
        r11.f3015b = r12.f3015b;
        r11.f3016c = r12.f3016c;
        r11.f3017d = r12.f3017d;
        r11.f3018e = r12.f3018e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x011a, code lost:
    
        r1 = r29.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0122, code lost:
    
        if (r1.hasNext() == false) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0124, code lost:
    
        r9 = (androidx.fragment.app.J0) r1.next();
        r5.add(new androidx.fragment.app.C0149h(r9, r30));
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0134, code lost:
    
        if (r30 == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0136, code lost:
    
        if (r9 != r3) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0138, code lost:
    
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0140, code lost:
    
        r8.add(new androidx.fragment.app.r(r9, r30, r11));
        r10 = new androidx.fragment.app.RunnableC0141d(0, r28, r9);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, "listener");
        r9.f3039d.add(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x013b, code lost:
    
        r11 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x013d, code lost:
    
        if (r9 != r4) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0157, code lost:
    
        r1 = new java.util.ArrayList();
        r8 = r8.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0164, code lost:
    
        if (r8.hasNext() == false) goto L210;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0166, code lost:
    
        r9 = r8.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0171, code lost:
    
        if (((androidx.fragment.app.r) r9).a() != false) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0173, code lost:
    
        r1.add(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0177, code lost:
    
        r8 = new java.util.ArrayList();
        r1 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0184, code lost:
    
        if (r1.hasNext() == false) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0186, code lost:
    
        r9 = r1.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0191, code lost:
    
        if (((androidx.fragment.app.r) r9).b() == null) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0193, code lost:
    
        r8.add(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0197, code lost:
    
        r1 = r8.iterator();
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01a1, code lost:
    
        if (r1.hasNext() == false) goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01a3, code lost:
    
        r10 = (androidx.fragment.app.r) r1.next();
        r11 = r10.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01ad, code lost:
    
        if (r5 == null) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01af, code lost:
    
        if (r11 != r5) goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01dc, code lost:
    
        throw new java.lang.IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + r10.f3181a.f3038c + " returned Transition " + r10.f3220b + " which uses a different Transition type than other Fragments.").toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01dd, code lost:
    
        r5 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01df, code lost:
    
        r1 = "effect";
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01e1, code lost:
    
        if (r5 != null) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01e3, code lost:
    
        r22 = r6;
        r17 = "FragmentManager";
        r20 = r5;
        r21 = 2;
        r15 = "effect";
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0497, code lost:
    
        r1 = new java.util.ArrayList();
        r2 = new java.util.ArrayList();
        r3 = r20.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x04a9, code lost:
    
        if (r3.hasNext() == false) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x04ab, code lost:
    
        kotlin.collections.CollectionsKt__MutableCollectionsKt.addAll(r2, ((androidx.fragment.app.C0149h) r3.next()).f3181a.f3044k);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x04b9, code lost:
    
        r2 = r2.isEmpty();
        r3 = r20.iterator();
        r11 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x04c6, code lost:
    
        if (r3.hasNext() == false) goto L224;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x04c8, code lost:
    
        r4 = (androidx.fragment.app.C0149h) r3.next();
        r5 = r28.f3061a.getContext();
        r6 = r4.f3181a;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, "context");
        r5 = r4.b(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x04df, code lost:
    
        if (r5 != null) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x04e8, code lost:
    
        if (((android.animation.AnimatorSet) r5.f3067b) != null) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x04ee, code lost:
    
        r5 = r6.f3038c;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1, types: [s.e, s.j] */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Object, s.e, s.j] */
    /* JADX WARN: Type inference failed for: r5v31, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.lang.Object, s.e, s.j] */
    @Override // androidx.fragment.app.O0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.util.List r29, boolean r30) {
        /*
            Method dump skipped, instructions count: 1435
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0168s.b(java.util.List, boolean):void");
    }
}
