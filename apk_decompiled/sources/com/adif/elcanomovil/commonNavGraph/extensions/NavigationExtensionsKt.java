package com.adif.elcanomovil.commonNavGraph.extensions;

import T0.j;
import androidx.fragment.app.AbstractC0158l0;
import androidx.fragment.app.K;
import androidx.lifecycle.C0191l;
import androidx.lifecycle.J;
import androidx.lifecycle.Q;
import androidx.lifecycle.X;
import androidx.lifecycle.n0;
import androidx.navigation.fragment.NavHostFragment;
import com.adif.elcanomovil.commonNavGraph.R;
import g.AbstractActivityC0364k;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o0.AbstractC0544v;
import o0.C0537n;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0005\u001a?\u0010\u000f\u001a\u00020\r\"\b\b\u0000\u0010\u0007*\u00020\u0006*\u00020\u00012\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010\u001a'\u0010\u0012\u001a\u00020\r\"\u0004\b\u0000\u0010\u0007*\u00020\u00012\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00028\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a'\u0010\u0015\u001a\u00020\u0014\"\u0004\b\u0000\u0010\u0007*\u00020\u00012\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00028\u0000¢\u0006\u0004\b\u0015\u0010\u0016*\n\u0010\u0018\"\u00020\u00172\u00020\u0017*\n\u0010\u001a\"\u00020\u00192\u00020\u0019¨\u0006\u001b"}, d2 = {"Landroidx/fragment/app/K;", "Lo0/v;", "findRootNavController", "(Landroidx/fragment/app/K;)Lo0/v;", "Lg/k;", "(Lg/k;)Lo0/v;", "", "T", "", "key", "Landroidx/lifecycle/J;", "lifecycleOwner", "Lkotlin/Function1;", "", "callback", "onDestinationResult", "(Lo0/v;Ljava/lang/String;Landroidx/lifecycle/J;Lkotlin/jvm/functions/Function1;)V", "value", "setDestinationResult", "(Lo0/v;Ljava/lang/String;Ljava/lang/Object;)V", "", "popBackStackWithResult", "(Lo0/v;Ljava/lang/String;Ljava/lang/Object;)Z", "Lcom/adif/elcanomovil/main/BottomNavFragmentDirections;", "FromBottomNav", "Lcom/adif/elcanomovil/commonNavGraph/MainNavigationDirections;", "FromMainNav", "common-nav-graph_proNon_corporateRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NavigationExtensionsKt {
    public static final AbstractC0544v findRootNavController(K k4) {
        Intrinsics.checkNotNullParameter(k4, "<this>");
        AbstractC0158l0 supportFragmentManager = k4.requireActivity().getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        String string = k4.getString(R.string.rootNavHostFragment);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        K F3 = supportFragmentManager.F(string);
        Intrinsics.checkNotNull(F3, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
        return ((NavHostFragment) F3).f();
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [androidx.lifecycle.m0, androidx.lifecycle.Q] */
    /* JADX WARN: Type inference failed for: r4v2, types: [androidx.lifecycle.m0, androidx.lifecycle.Q] */
    public static final <T> void onDestinationResult(AbstractC0544v abstractC0544v, String key, J lifecycleOwner, Function1<? super T, Unit> callback) {
        n0 n0Var;
        Intrinsics.checkNotNullParameter(abstractC0544v, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(callback, "callback");
        C0537n c0537n = (C0537n) abstractC0544v.f8054g.lastOrNull();
        if (c0537n == null || (n0Var = (n0) c0537n.f8014l.getValue()) == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(key, "key");
        LinkedHashMap linkedHashMap = n0Var.f3406c;
        Object obj = linkedHashMap.get(key);
        X x3 = obj instanceof X ? (X) obj : null;
        if (x3 == null) {
            LinkedHashMap linkedHashMap2 = n0Var.f3404a;
            if (linkedHashMap2.containsKey(key)) {
                Object obj2 = linkedHashMap2.get(key);
                Intrinsics.checkNotNullParameter(key, "key");
                ?? q4 = new Q(obj2);
                q4.f3401l = key;
                q4.f3402m = n0Var;
                x3 = q4;
            } else {
                Intrinsics.checkNotNullParameter(key, "key");
                ?? q5 = new Q();
                q5.f3401l = key;
                q5.f3402m = n0Var;
                x3 = q5;
            }
            linkedHashMap.put(key, x3);
        }
        Intrinsics.checkNotNull(x3, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<T of androidx.lifecycle.SavedStateHandle.getLiveData>");
        x3.e(lifecycleOwner, new C0191l(new j(callback, abstractC0544v, key, 3)));
    }

    public static final <T> boolean popBackStackWithResult(AbstractC0544v abstractC0544v, String key, T t2) {
        Intrinsics.checkNotNullParameter(abstractC0544v, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        setDestinationResult(abstractC0544v, key, t2);
        return abstractC0544v.q();
    }

    public static final <T> void setDestinationResult(AbstractC0544v abstractC0544v, String key, T t2) {
        n0 n0Var;
        Intrinsics.checkNotNullParameter(abstractC0544v, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        C0537n k4 = abstractC0544v.k();
        if (k4 == null || (n0Var = (n0) k4.f8014l.getValue()) == null) {
            return;
        }
        n0Var.d(t2, key);
    }

    public static final AbstractC0544v findRootNavController(AbstractActivityC0364k abstractActivityC0364k) {
        Intrinsics.checkNotNullParameter(abstractActivityC0364k, "<this>");
        String string = abstractActivityC0364k.getString(R.string.rootNavHostFragment);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        K F3 = abstractActivityC0364k.getSupportFragmentManager().F(string);
        Intrinsics.checkNotNull(F3, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
        return ((NavHostFragment) F3).f();
    }
}
