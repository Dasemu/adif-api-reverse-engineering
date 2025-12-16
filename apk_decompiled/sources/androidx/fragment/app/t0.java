package androidx.fragment.app;

import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.adif.elcanomovil.R;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import i0.AbstractC0383d;
import i0.AbstractC0392m;
import i0.C0382c;
import i0.C0393n;
import i0.C0394o;
import i0.EnumC0381b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class t0 {

    /* renamed from: a, reason: collision with root package name */
    public final Q f3238a;

    /* renamed from: b, reason: collision with root package name */
    public final u0 f3239b;

    /* renamed from: c, reason: collision with root package name */
    public final K f3240c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3241d = false;

    /* renamed from: e, reason: collision with root package name */
    public int f3242e = -1;

    public t0(Q q4, u0 u0Var, K k4) {
        this.f3238a = q4;
        this.f3239b = u0Var;
        this.f3240c = k4;
    }

    public final void a() {
        boolean M3 = AbstractC0158l0.M(3);
        K k4 = this.f3240c;
        if (M3) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + k4);
        }
        Bundle bundle = k4.mSavedFragmentState;
        k4.performActivityCreated(bundle != null ? bundle.getBundle("savedInstanceState") : null);
        this.f3238a.a(k4, false);
    }

    public final void b() {
        K expectedParentFragment;
        View view;
        View view2;
        int i = -1;
        K fragment = this.f3240c;
        View view3 = fragment.mContainer;
        while (true) {
            expectedParentFragment = null;
            if (view3 == null) {
                break;
            }
            Object tag = view3.getTag(R.id.fragment_container_view_tag);
            K k4 = tag instanceof K ? (K) tag : null;
            if (k4 != null) {
                expectedParentFragment = k4;
                break;
            } else {
                Object parent = view3.getParent();
                view3 = parent instanceof View ? (View) parent : null;
            }
        }
        K parentFragment = fragment.getParentFragment();
        if (expectedParentFragment != null && !expectedParentFragment.equals(parentFragment)) {
            int i4 = fragment.mContainerId;
            C0382c c0382c = AbstractC0383d.f6811a;
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            Intrinsics.checkNotNullParameter(expectedParentFragment, "expectedParentFragment");
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            Intrinsics.checkNotNullParameter(expectedParentFragment, "expectedParentFragment");
            StringBuilder sb = new StringBuilder("Attempting to nest fragment ");
            sb.append(fragment);
            sb.append(" within the view of parent fragment ");
            sb.append(expectedParentFragment);
            sb.append(" via container with ID ");
            AbstractC0392m abstractC0392m = new AbstractC0392m(fragment, com.google.android.gms.measurement.internal.a.m(sb, i4, " without using parent's childFragmentManager"));
            AbstractC0383d.c(abstractC0392m);
            C0382c a2 = AbstractC0383d.a(fragment);
            if (a2.f6809a.contains(EnumC0381b.f6804e) && AbstractC0383d.e(a2, fragment.getClass(), C0394o.class)) {
                AbstractC0383d.b(a2, abstractC0392m);
            }
        }
        u0 u0Var = this.f3239b;
        u0Var.getClass();
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            ArrayList arrayList = u0Var.f3244a;
            int indexOf = arrayList.indexOf(fragment);
            int i5 = indexOf - 1;
            while (true) {
                if (i5 < 0) {
                    while (true) {
                        indexOf++;
                        if (indexOf >= arrayList.size()) {
                            break;
                        }
                        K k5 = (K) arrayList.get(indexOf);
                        if (k5.mContainer == viewGroup && (view = k5.mView) != null) {
                            i = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    K k6 = (K) arrayList.get(i5);
                    if (k6.mContainer == viewGroup && (view2 = k6.mView) != null) {
                        i = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i5--;
                }
            }
        }
        fragment.mContainer.addView(fragment.mView, i);
    }

    public final void c() {
        boolean M3 = AbstractC0158l0.M(3);
        K k4 = this.f3240c;
        if (M3) {
            Log.d("FragmentManager", "moveto ATTACHED: " + k4);
        }
        K k5 = k4.mTarget;
        t0 t0Var = null;
        u0 u0Var = this.f3239b;
        if (k5 != null) {
            t0 t0Var2 = (t0) u0Var.f3245b.get(k5.mWho);
            if (t0Var2 == null) {
                throw new IllegalStateException("Fragment " + k4 + " declared target fragment " + k4.mTarget + " that does not belong to this FragmentManager!");
            }
            k4.mTargetWho = k4.mTarget.mWho;
            k4.mTarget = null;
            t0Var = t0Var2;
        } else {
            String str = k4.mTargetWho;
            if (str != null && (t0Var = (t0) u0Var.f3245b.get(str)) == null) {
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(k4);
                sb.append(" declared target fragment ");
                throw new IllegalStateException(C.w.r(sb, k4.mTargetWho, " that does not belong to this FragmentManager!"));
            }
        }
        if (t0Var != null) {
            t0Var.k();
        }
        AbstractC0158l0 abstractC0158l0 = k4.mFragmentManager;
        k4.mHost = abstractC0158l0.f3177w;
        k4.mParentFragment = abstractC0158l0.f3179y;
        Q q4 = this.f3238a;
        q4.g(k4, false);
        k4.performAttach();
        q4.b(k4, false);
    }

    public final int d() {
        K k4 = this.f3240c;
        if (k4.mFragmentManager == null) {
            return k4.mState;
        }
        int i = this.f3242e;
        int ordinal = k4.mMaxState.ordinal();
        if (ordinal == 1) {
            i = Math.min(i, 0);
        } else if (ordinal == 2) {
            i = Math.min(i, 1);
        } else if (ordinal == 3) {
            i = Math.min(i, 5);
        } else if (ordinal != 4) {
            i = Math.min(i, -1);
        }
        if (k4.mFromLayout) {
            if (k4.mInLayout) {
                i = Math.max(this.f3242e, 2);
                View view = k4.mView;
                if (view != null && view.getParent() == null) {
                    i = Math.min(i, 2);
                }
            } else {
                i = this.f3242e < 4 ? Math.min(i, k4.mState) : Math.min(i, 1);
            }
        }
        if (!k4.mAdded) {
            i = Math.min(i, 1);
        }
        ViewGroup viewGroup = k4.mContainer;
        if (viewGroup != null) {
            O0 m4 = O0.m(viewGroup, k4.getParentFragmentManager());
            m4.getClass();
            Intrinsics.checkNotNullParameter(this, "fragmentStateManager");
            Intrinsics.checkNotNullExpressionValue(k4, "fragmentStateManager.fragment");
            J0 j4 = m4.j(k4);
            K0 k02 = j4 != null ? j4.f3037b : null;
            J0 k5 = m4.k(k4);
            r9 = k5 != null ? k5.f3037b : null;
            int i4 = k02 == null ? -1 : N0.$EnumSwitchMapping$0[k02.ordinal()];
            if (i4 != -1 && i4 != 1) {
                r9 = k02;
            }
        }
        if (r9 == K0.f3047b) {
            i = Math.min(i, 6);
        } else if (r9 == K0.f3048c) {
            i = Math.max(i, 3);
        } else if (k4.mRemoving) {
            i = k4.isInBackStack() ? Math.min(i, 1) : Math.min(i, -1);
        }
        if (k4.mDeferStart && k4.mState < 5) {
            i = Math.min(i, 4);
        }
        if (k4.mTransitioning && k4.mContainer != null) {
            i = Math.max(i, 3);
        }
        if (AbstractC0158l0.M(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i + " for " + k4);
        }
        return i;
    }

    public final void e() {
        boolean M3 = AbstractC0158l0.M(3);
        K k4 = this.f3240c;
        if (M3) {
            Log.d("FragmentManager", "moveto CREATED: " + k4);
        }
        Bundle bundle = k4.mSavedFragmentState;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        if (k4.mIsCreated) {
            k4.mState = 1;
            k4.restoreChildFragmentState();
        } else {
            Q q4 = this.f3238a;
            q4.h(k4, false);
            k4.performCreate(bundle2);
            q4.c(k4, false);
        }
    }

    public final void f() {
        String str;
        K fragment = this.f3240c;
        if (fragment.mFromLayout) {
            return;
        }
        if (AbstractC0158l0.M(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + fragment);
        }
        Bundle bundle = fragment.mSavedFragmentState;
        ViewGroup container = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater performGetLayoutInflater = fragment.performGetLayoutInflater(bundle2);
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            container = viewGroup;
        } else {
            int i = fragment.mContainerId;
            if (i != 0) {
                if (i == -1) {
                    throw new IllegalArgumentException(C.w.m("Cannot create fragment ", fragment, " for a container view with no id"));
                }
                container = (ViewGroup) fragment.mFragmentManager.f3178x.b(i);
                if (container == null) {
                    if (!fragment.mRestored) {
                        try {
                            str = fragment.getResources().getResourceName(fragment.mContainerId);
                        } catch (Resources.NotFoundException unused) {
                            str = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(fragment.mContainerId) + " (" + str + ") for fragment " + fragment);
                    }
                } else if (!(container instanceof FragmentContainerView)) {
                    C0382c c0382c = AbstractC0383d.f6811a;
                    Intrinsics.checkNotNullParameter(fragment, "fragment");
                    Intrinsics.checkNotNullParameter(container, "container");
                    Intrinsics.checkNotNullParameter(fragment, "fragment");
                    Intrinsics.checkNotNullParameter(container, "container");
                    AbstractC0392m abstractC0392m = new AbstractC0392m(fragment, "Attempting to add fragment " + fragment + " to container " + container + " which is not a FragmentContainerView");
                    AbstractC0383d.c(abstractC0392m);
                    C0382c a2 = AbstractC0383d.a(fragment);
                    if (a2.f6809a.contains(EnumC0381b.i) && AbstractC0383d.e(a2, fragment.getClass(), C0393n.class)) {
                        AbstractC0383d.b(a2, abstractC0392m);
                    }
                }
            }
        }
        fragment.mContainer = container;
        fragment.performCreateView(performGetLayoutInflater, container, bundle2);
        if (fragment.mView != null) {
            if (AbstractC0158l0.M(3)) {
                Log.d("FragmentManager", "moveto VIEW_CREATED: " + fragment);
            }
            fragment.mView.setSaveFromParentEnabled(false);
            fragment.mView.setTag(R.id.fragment_container_view_tag, fragment);
            if (container != null) {
                b();
            }
            if (fragment.mHidden) {
                fragment.mView.setVisibility(8);
            }
            if (fragment.mView.isAttachedToWindow()) {
                View view = fragment.mView;
                WeakHashMap weakHashMap = O.X.f1226a;
                O.J.c(view);
            } else {
                View view2 = fragment.mView;
                view2.addOnAttachStateChangeListener(new s0(view2));
            }
            fragment.performViewCreated();
            this.f3238a.m(fragment, fragment.mView, false);
            int visibility = fragment.mView.getVisibility();
            fragment.setPostOnViewCreatedAlpha(fragment.mView.getAlpha());
            if (fragment.mContainer != null && visibility == 0) {
                View findFocus = fragment.mView.findFocus();
                if (findFocus != null) {
                    fragment.setFocusedView(findFocus);
                    if (AbstractC0158l0.M(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + fragment);
                    }
                }
                fragment.mView.setAlpha(BitmapDescriptorFactory.HUE_RED);
            }
        }
        fragment.mState = 2;
    }

    public final void g() {
        K b4;
        boolean M3 = AbstractC0158l0.M(3);
        K k4 = this.f3240c;
        if (M3) {
            Log.d("FragmentManager", "movefrom CREATED: " + k4);
        }
        boolean z3 = true;
        boolean z4 = k4.mRemoving && !k4.isInBackStack();
        u0 u0Var = this.f3239b;
        if (z4 && !k4.mBeingSaved) {
            u0Var.i(null, k4.mWho);
        }
        if (!z4) {
            C0166p0 c0166p0 = u0Var.f3247d;
            if (!((c0166p0.f3202a.containsKey(k4.mWho) && c0166p0.f3205d) ? c0166p0.f3206e : true)) {
                String str = k4.mTargetWho;
                if (str != null && (b4 = u0Var.b(str)) != null && b4.mRetainInstance) {
                    k4.mTarget = b4;
                }
                k4.mState = 0;
                return;
            }
        }
        V v3 = k4.mHost;
        if (v3 instanceof androidx.lifecycle.D0) {
            z3 = u0Var.f3247d.f3206e;
        } else {
            P p = v3.f3075b;
            if (p != null) {
                z3 = true ^ p.isChangingConfigurations();
            }
        }
        if ((z4 && !k4.mBeingSaved) || z3) {
            u0Var.f3247d.b(k4, false);
        }
        k4.performDestroy();
        this.f3238a.d(k4, false);
        Iterator it = u0Var.d().iterator();
        while (it.hasNext()) {
            t0 t0Var = (t0) it.next();
            if (t0Var != null) {
                String str2 = k4.mWho;
                K k5 = t0Var.f3240c;
                if (str2.equals(k5.mTargetWho)) {
                    k5.mTarget = k4;
                    k5.mTargetWho = null;
                }
            }
        }
        String str3 = k4.mTargetWho;
        if (str3 != null) {
            k4.mTarget = u0Var.b(str3);
        }
        u0Var.h(this);
    }

    public final void h() {
        View view;
        boolean M3 = AbstractC0158l0.M(3);
        K k4 = this.f3240c;
        if (M3) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + k4);
        }
        ViewGroup viewGroup = k4.mContainer;
        if (viewGroup != null && (view = k4.mView) != null) {
            viewGroup.removeView(view);
        }
        k4.performDestroyView();
        this.f3238a.n(k4, false);
        k4.mContainer = null;
        k4.mView = null;
        k4.mViewLifecycleOwner = null;
        k4.mViewLifecycleOwnerLiveData.j(null);
        k4.mInLayout = false;
    }

    public final void i() {
        boolean M3 = AbstractC0158l0.M(3);
        K k4 = this.f3240c;
        if (M3) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + k4);
        }
        k4.performDetach();
        this.f3238a.e(k4, false);
        k4.mState = -1;
        k4.mHost = null;
        k4.mParentFragment = null;
        k4.mFragmentManager = null;
        if (!k4.mRemoving || k4.isInBackStack()) {
            C0166p0 c0166p0 = this.f3239b.f3247d;
            if (!((c0166p0.f3202a.containsKey(k4.mWho) && c0166p0.f3205d) ? c0166p0.f3206e : true)) {
                return;
            }
        }
        if (AbstractC0158l0.M(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + k4);
        }
        k4.initState();
    }

    public final void j() {
        K k4 = this.f3240c;
        if (k4.mFromLayout && k4.mInLayout && !k4.mPerformedCreateView) {
            if (AbstractC0158l0.M(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + k4);
            }
            Bundle bundle = k4.mSavedFragmentState;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            k4.performCreateView(k4.performGetLayoutInflater(bundle2), null, bundle2);
            View view = k4.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                k4.mView.setTag(R.id.fragment_container_view_tag, k4);
                if (k4.mHidden) {
                    k4.mView.setVisibility(8);
                }
                k4.performViewCreated();
                this.f3238a.m(k4, k4.mView, false);
                k4.mState = 2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x017f, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k() {
        /*
            Method dump skipped, instructions count: 574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.t0.k():void");
    }

    public final void l(ClassLoader classLoader) {
        K k4 = this.f3240c;
        Bundle bundle = k4.mSavedFragmentState;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (k4.mSavedFragmentState.getBundle("savedInstanceState") == null) {
            k4.mSavedFragmentState.putBundle("savedInstanceState", new Bundle());
        }
        try {
            k4.mSavedViewState = k4.mSavedFragmentState.getSparseParcelableArray("viewState");
            k4.mSavedViewRegistryState = k4.mSavedFragmentState.getBundle("viewRegistryState");
            r0 r0Var = (r0) k4.mSavedFragmentState.getParcelable(RemoteConfigConstants.ResponseFieldKey.STATE);
            if (r0Var != null) {
                k4.mTargetWho = r0Var.f3232l;
                k4.mTargetRequestCode = r0Var.f3233m;
                Boolean bool = k4.mSavedUserVisibleHint;
                if (bool != null) {
                    k4.mUserVisibleHint = bool.booleanValue();
                    k4.mSavedUserVisibleHint = null;
                } else {
                    k4.mUserVisibleHint = r0Var.f3234n;
                }
            }
            if (k4.mUserVisibleHint) {
                return;
            }
            k4.mDeferStart = true;
        } catch (BadParcelableException e4) {
            throw new IllegalStateException("Failed to restore view hierarchy state for fragment " + k4, e4);
        }
    }

    public final void m() {
        boolean M3 = AbstractC0158l0.M(3);
        K k4 = this.f3240c;
        if (M3) {
            Log.d("FragmentManager", "moveto RESUMED: " + k4);
        }
        View focusedView = k4.getFocusedView();
        if (focusedView != null) {
            if (focusedView != k4.mView) {
                for (ViewParent parent = focusedView.getParent(); parent != null; parent = parent.getParent()) {
                    if (parent != k4.mView) {
                    }
                }
            }
            boolean requestFocus = focusedView.requestFocus();
            if (AbstractC0158l0.M(2)) {
                StringBuilder sb = new StringBuilder("requestFocus: Restoring focused view ");
                sb.append(focusedView);
                sb.append(" ");
                sb.append(requestFocus ? "succeeded" : "failed");
                sb.append(" on Fragment ");
                sb.append(k4);
                sb.append(" resulting in focused view ");
                sb.append(k4.mView.findFocus());
                Log.v("FragmentManager", sb.toString());
            }
        }
        k4.setFocusedView(null);
        k4.performResume();
        this.f3238a.i(k4, false);
        this.f3239b.i(null, k4.mWho);
        k4.mSavedFragmentState = null;
        k4.mSavedViewState = null;
        k4.mSavedViewRegistryState = null;
    }

    public final Bundle n() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        K k4 = this.f3240c;
        if (k4.mState == -1 && (bundle = k4.mSavedFragmentState) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable(RemoteConfigConstants.ResponseFieldKey.STATE, new r0(k4));
        if (k4.mState > -1) {
            Bundle bundle3 = new Bundle();
            k4.performSaveInstanceState(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.f3238a.j(k4, bundle3, false);
            Bundle bundle4 = new Bundle();
            k4.mSavedStateRegistryController.c(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle a02 = k4.mChildFragmentManager.a0();
            if (!a02.isEmpty()) {
                bundle2.putBundle("childFragmentManager", a02);
            }
            if (k4.mView != null) {
                o();
            }
            SparseArray<Parcelable> sparseArray = k4.mSavedViewState;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = k4.mSavedViewRegistryState;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = k4.mArguments;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    public final void o() {
        K k4 = this.f3240c;
        if (k4.mView == null) {
            return;
        }
        if (AbstractC0158l0.M(2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + k4 + " with view " + k4.mView);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        k4.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            k4.mSavedViewState = sparseArray;
        }
        Bundle bundle = new Bundle();
        k4.mViewLifecycleOwner.f3002f.c(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        k4.mSavedViewRegistryState = bundle;
    }

    public t0(Q q4, u0 u0Var, ClassLoader classLoader, C0142d0 c0142d0, Bundle bundle) {
        this.f3238a = q4;
        this.f3239b = u0Var;
        K a2 = ((r0) bundle.getParcelable(RemoteConfigConstants.ResponseFieldKey.STATE)).a(c0142d0);
        this.f3240c = a2;
        a2.mSavedFragmentState = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        a2.setArguments(bundle2);
        if (AbstractC0158l0.M(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a2);
        }
    }

    public t0(Q q4, u0 u0Var, K k4, Bundle bundle) {
        this.f3238a = q4;
        this.f3239b = u0Var;
        this.f3240c = k4;
        k4.mSavedViewState = null;
        k4.mSavedViewRegistryState = null;
        k4.mBackStackNesting = 0;
        k4.mInLayout = false;
        k4.mAdded = false;
        K k5 = k4.mTarget;
        k4.mTargetWho = k5 != null ? k5.mWho : null;
        k4.mTarget = null;
        k4.mSavedFragmentState = bundle;
        k4.mArguments = bundle.getBundle("arguments");
    }
}
