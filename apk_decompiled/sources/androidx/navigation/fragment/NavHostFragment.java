package androidx.navigation.fragment;

import C.w;
import a.AbstractC0106b;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC0158l0;
import androidx.fragment.app.C0135a;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.K;
import androidx.lifecycle.C;
import androidx.lifecycle.C0;
import b.B;
import b.D;
import com.adif.elcanomovil.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import m3.l;
import o0.AbstractC0544v;
import o0.C0537n;
import o0.C0538o;
import o0.C0539p;
import o0.I;
import o0.J;
import o0.V;
import o0.W;
import o0.Y;
import q0.AbstractC0557d;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/navigation/fragment/NavHostFragment;", "Landroidx/fragment/app/K;", "", "<init>", "()V", "navigation-fragment_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public class NavHostFragment extends K {

    /* renamed from: a, reason: collision with root package name */
    public I f3454a;

    /* renamed from: b, reason: collision with root package name */
    public Boolean f3455b;

    /* renamed from: c, reason: collision with root package name */
    public View f3456c;

    /* renamed from: d, reason: collision with root package name */
    public int f3457d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3458e;

    public final I f() {
        I i = this.f3454a;
        if (i != null) {
            return i;
        }
        throw new IllegalStateException("NavController is not available before onCreate()");
    }

    @Override // androidx.fragment.app.K
    public final void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        if (this.f3458e) {
            AbstractC0158l0 parentFragmentManager = getParentFragmentManager();
            parentFragmentManager.getClass();
            C0135a c0135a = new C0135a(parentFragmentManager);
            c0135a.i(this);
            c0135a.e(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.content.Context, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v11, types: [android.content.Context, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [o0.v, java.lang.Object, o0.I] */
    @Override // androidx.fragment.app.K
    public final void onCreate(Bundle bundle) {
        Bundle bundle2;
        C lifecycle;
        ?? context = requireContext();
        Intrinsics.checkNotNullExpressionValue(context, "requireContext()");
        Intrinsics.checkNotNullParameter(context, "context");
        ?? abstractC0544v = new AbstractC0544v(context);
        this.f3454a = abstractC0544v;
        Intrinsics.checkNotNull(abstractC0544v);
        Intrinsics.checkNotNullParameter(this, "owner");
        Intrinsics.checkNotNullParameter(this, "owner");
        if (!Intrinsics.areEqual(this, abstractC0544v.f8059n)) {
            NavHostFragment navHostFragment = abstractC0544v.f8059n;
            C0539p c0539p = abstractC0544v.f8063s;
            if (navHostFragment != null && (lifecycle = navHostFragment.getLifecycle()) != null) {
                lifecycle.c(c0539p);
            }
            abstractC0544v.f8059n = this;
            getLifecycle().a(c0539p);
        }
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                break;
            }
            if (context instanceof D) {
                I i = this.f3454a;
                Intrinsics.checkNotNull(i);
                B dispatcher = ((D) context).getOnBackPressedDispatcher();
                Intrinsics.checkNotNullExpressionValue(dispatcher, "context as OnBackPressed…).onBackPressedDispatcher");
                i.getClass();
                Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
                Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
                if (!Intrinsics.areEqual(dispatcher, i.f8060o)) {
                    NavHostFragment navHostFragment2 = i.f8059n;
                    if (navHostFragment2 == null) {
                        throw new IllegalStateException("You must call setLifecycleOwner() before calling setOnBackPressedDispatcher()");
                    }
                    b.C c4 = i.f8064t;
                    c4.remove();
                    i.f8060o = dispatcher;
                    dispatcher.a(navHostFragment2, c4);
                    C lifecycle2 = navHostFragment2.getLifecycle();
                    C0539p c0539p2 = i.f8063s;
                    lifecycle2.c(c0539p2);
                    lifecycle2.a(c0539p2);
                }
            } else {
                context = ((ContextWrapper) context).getBaseContext();
                Intrinsics.checkNotNullExpressionValue(context, "context.baseContext");
            }
        }
        I i4 = this.f3454a;
        Intrinsics.checkNotNull(i4);
        Boolean bool = this.f3455b;
        i4.f8065u = bool != null && bool.booleanValue();
        i4.z();
        this.f3455b = null;
        I i5 = this.f3454a;
        Intrinsics.checkNotNull(i5);
        C0 viewModelStore = getViewModelStore();
        Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
        i5.getClass();
        Intrinsics.checkNotNullParameter(viewModelStore, "viewModelStore");
        Intrinsics.checkNotNullParameter(viewModelStore, "viewModelStore");
        if (!Intrinsics.areEqual(i5.p, l.w(viewModelStore))) {
            if (!i5.f8054g.isEmpty()) {
                throw new IllegalStateException("ViewModelStore should be set before setGraph call");
            }
            i5.p = l.w(viewModelStore);
        }
        I navController = this.f3454a;
        Intrinsics.checkNotNull(navController);
        Intrinsics.checkNotNullParameter(navController, "navHostController");
        Intrinsics.checkNotNullParameter(navController, "navController");
        W w3 = navController.f8066v;
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
        AbstractC0158l0 childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "childFragmentManager");
        w3.a(new DialogFragmentNavigator(requireContext, childFragmentManager));
        Context requireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext()");
        AbstractC0158l0 childFragmentManager2 = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "childFragmentManager");
        int id = getId();
        if (id == 0 || id == -1) {
            id = R.id.nav_host_fragment_container;
        }
        navController.f8066v.a(new FragmentNavigator(requireContext2, childFragmentManager2, id));
        if (bundle != null) {
            bundle2 = bundle.getBundle("android-support-nav:fragment:navControllerState");
            if (bundle.getBoolean("android-support-nav:fragment:defaultHost", false)) {
                this.f3458e = true;
                AbstractC0158l0 parentFragmentManager = getParentFragmentManager();
                parentFragmentManager.getClass();
                C0135a c0135a = new C0135a(parentFragmentManager);
                c0135a.i(this);
                c0135a.e(false);
            }
            this.f3457d = bundle.getInt("android-support-nav:fragment:graphId");
        } else {
            bundle2 = null;
        }
        if (bundle2 != null) {
            I i6 = this.f3454a;
            Intrinsics.checkNotNull(i6);
            bundle2.setClassLoader(i6.f8048a.getClassLoader());
            i6.f8051d = bundle2.getBundle("android-support-nav:controller:navigatorState");
            i6.f8052e = bundle2.getParcelableArray("android-support-nav:controller:backStack");
            LinkedHashMap linkedHashMap = i6.f8058m;
            linkedHashMap.clear();
            int[] intArray = bundle2.getIntArray("android-support-nav:controller:backStackDestIds");
            ArrayList<String> stringArrayList = bundle2.getStringArrayList("android-support-nav:controller:backStackIds");
            if (intArray != null && stringArrayList != null) {
                int length = intArray.length;
                int i7 = 0;
                int i8 = 0;
                while (i7 < length) {
                    i6.f8057l.put(Integer.valueOf(intArray[i7]), stringArrayList.get(i8));
                    i7++;
                    i8++;
                }
            }
            ArrayList<String> stringArrayList2 = bundle2.getStringArrayList("android-support-nav:controller:backStackStates");
            if (stringArrayList2 != null) {
                for (String id2 : stringArrayList2) {
                    Parcelable[] parcelableArray = bundle2.getParcelableArray("android-support-nav:controller:backStackStates:" + id2);
                    if (parcelableArray != null) {
                        Intrinsics.checkNotNullExpressionValue(id2, "id");
                        ArrayDeque arrayDeque = new ArrayDeque(parcelableArray.length);
                        Iterator it = ArrayIteratorKt.iterator(parcelableArray);
                        while (it.hasNext()) {
                            Parcelable parcelable = (Parcelable) it.next();
                            if (parcelable == null) {
                                throw new NullPointerException("null cannot be cast to non-null type androidx.navigation.NavBackStackEntryState");
                            }
                            arrayDeque.add((C0538o) parcelable);
                        }
                        linkedHashMap.put(id2, arrayDeque);
                    }
                }
            }
            i6.f8053f = bundle2.getBoolean("android-support-nav:controller:deepLinkHandled");
        }
        if (this.f3457d != 0) {
            I i9 = this.f3454a;
            Intrinsics.checkNotNull(i9);
            i9.w(((J) i9.f8045C.getValue()).b(this.f3457d), null);
        } else {
            Bundle arguments = getArguments();
            int i10 = arguments != null ? arguments.getInt("android-support-nav:fragment:graphId") : 0;
            Bundle bundle3 = arguments != null ? arguments.getBundle("android-support-nav:fragment:startDestinationArgs") : null;
            if (i10 != 0) {
                I i11 = this.f3454a;
                Intrinsics.checkNotNull(i11);
                i11.w(((J) i11.f8045C.getValue()).b(i10), bundle3);
            }
        }
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.K
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Context context = inflater.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "inflater.context");
        FragmentContainerView fragmentContainerView = new FragmentContainerView(context);
        int id = getId();
        if (id == 0 || id == -1) {
            id = R.id.nav_host_fragment_container;
        }
        fragmentContainerView.setId(id);
        return fragmentContainerView;
    }

    @Override // androidx.fragment.app.K
    public final void onDestroyView() {
        super.onDestroyView();
        View view = this.f3456c;
        if (view != null && AbstractC0106b.g(view) == this.f3454a) {
            Intrinsics.checkNotNullParameter(view, "view");
            view.setTag(R.id.nav_controller_view_tag, null);
        }
        this.f3456c = null;
    }

    @Override // androidx.fragment.app.K
    public final void onInflate(Context context, AttributeSet attrs, Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        super.onInflate(context, attrs, bundle);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, Y.f7970b);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.obtainStyledAttr…yleable.NavHost\n        )");
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            this.f3457d = resourceId;
        }
        Unit unit = Unit.INSTANCE;
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attrs, AbstractC0557d.f8151c);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes2, "context.obtainStyledAttr…tyleable.NavHostFragment)");
        if (obtainStyledAttributes2.getBoolean(0, false)) {
            this.f3458e = true;
        }
        obtainStyledAttributes2.recycle();
    }

    @Override // androidx.fragment.app.K
    public final void onPrimaryNavigationFragmentChanged(boolean z3) {
        I i = this.f3454a;
        if (i == null) {
            this.f3455b = Boolean.valueOf(z3);
        } else {
            i.f8065u = z3;
            i.z();
        }
    }

    @Override // androidx.fragment.app.K
    public final void onSaveInstanceState(Bundle outState) {
        Bundle bundle;
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        I i = this.f3454a;
        Intrinsics.checkNotNull(i);
        i.getClass();
        ArrayList<String> arrayList = new ArrayList<>();
        Bundle bundle2 = new Bundle();
        for (Map.Entry entry : MapsKt.toMap(i.f8066v.f7967a).entrySet()) {
            String str = (String) entry.getKey();
            Bundle h = ((V) entry.getValue()).h();
            if (h != null) {
                arrayList.add(str);
                bundle2.putBundle(str, h);
            }
        }
        if (arrayList.isEmpty()) {
            bundle = null;
        } else {
            bundle = new Bundle();
            bundle2.putStringArrayList("android-support-nav:controller:navigatorState:names", arrayList);
            bundle.putBundle("android-support-nav:controller:navigatorState", bundle2);
        }
        ArrayDeque arrayDeque = i.f8054g;
        if (!arrayDeque.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            Parcelable[] parcelableArr = new Parcelable[arrayDeque.size()];
            Iterator<E> it = arrayDeque.iterator();
            int i4 = 0;
            while (it.hasNext()) {
                parcelableArr[i4] = new C0538o((C0537n) it.next());
                i4++;
            }
            bundle.putParcelableArray("android-support-nav:controller:backStack", parcelableArr);
        }
        LinkedHashMap linkedHashMap = i.f8057l;
        if (!linkedHashMap.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            int[] iArr = new int[linkedHashMap.size()];
            ArrayList<String> arrayList2 = new ArrayList<>();
            int i5 = 0;
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                int intValue = ((Number) entry2.getKey()).intValue();
                String str2 = (String) entry2.getValue();
                iArr[i5] = intValue;
                arrayList2.add(str2);
                i5++;
            }
            bundle.putIntArray("android-support-nav:controller:backStackDestIds", iArr);
            bundle.putStringArrayList("android-support-nav:controller:backStackIds", arrayList2);
        }
        LinkedHashMap linkedHashMap2 = i.f8058m;
        if (!linkedHashMap2.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            ArrayList<String> arrayList3 = new ArrayList<>();
            for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                String str3 = (String) entry3.getKey();
                ArrayDeque arrayDeque2 = (ArrayDeque) entry3.getValue();
                arrayList3.add(str3);
                Parcelable[] parcelableArr2 = new Parcelable[arrayDeque2.size()];
                Iterator<E> it2 = arrayDeque2.iterator();
                int i6 = 0;
                while (it2.hasNext()) {
                    Object next = it2.next();
                    int i7 = i6 + 1;
                    if (i6 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    parcelableArr2[i6] = (C0538o) next;
                    i6 = i7;
                }
                bundle.putParcelableArray(w.z("android-support-nav:controller:backStackStates:", str3), parcelableArr2);
            }
            bundle.putStringArrayList("android-support-nav:controller:backStackStates", arrayList3);
        }
        if (i.f8053f) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android-support-nav:controller:deepLinkHandled", i.f8053f);
        }
        if (bundle != null) {
            outState.putBundle("android-support-nav:fragment:navControllerState", bundle);
        }
        if (this.f3458e) {
            outState.putBoolean("android-support-nav:fragment:defaultHost", true);
        }
        int i8 = this.f3457d;
        if (i8 != 0) {
            outState.putInt("android-support-nav:fragment:graphId", i8);
        }
    }

    @Override // androidx.fragment.app.K
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        if (!(view instanceof ViewGroup)) {
            throw new IllegalStateException(("created host view " + view + " is not a ViewGroup").toString());
        }
        I i = this.f3454a;
        Intrinsics.checkNotNullParameter(view, "view");
        view.setTag(R.id.nav_controller_view_tag, i);
        if (view.getParent() != null) {
            Object parent = view.getParent();
            if (parent == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.View");
            }
            View view2 = (View) parent;
            this.f3456c = view2;
            Intrinsics.checkNotNull(view2);
            if (view2.getId() == getId()) {
                View view3 = this.f3456c;
                Intrinsics.checkNotNull(view3);
                I i4 = this.f3454a;
                Intrinsics.checkNotNullParameter(view3, "view");
                view3.setTag(R.id.nav_controller_view_tag, i4);
            }
        }
    }
}
