package androidx.fragment.app;

import C.AbstractC0043g;
import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.lifecycle.InterfaceC0200v;
import com.adif.elcanomovil.R;
import d.AbstractC0294c;
import d.AbstractC0300i;
import d.C0302k;
import d.InterfaceC0293b;
import e.AbstractC0311a;
import g.AbstractActivityC0364k;
import i0.AbstractC0383d;
import i0.AbstractC0392m;
import i0.C0382c;
import i0.C0385f;
import i0.C0386g;
import i0.C0387h;
import i0.C0389j;
import i0.C0390k;
import i0.C0391l;
import i0.EnumC0381b;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;
import n0.AbstractC0511a;
import v0.C0639d;
import v0.C0640e;

/* loaded from: classes.dex */
public abstract class K implements ComponentCallbacks, View.OnCreateContextMenuListener, androidx.lifecycle.J, androidx.lifecycle.D0, InterfaceC0200v, v0.f {
    static final int ACTIVITY_CREATED = 4;
    static final int ATTACHED = 0;
    static final int AWAITING_ENTER_EFFECTS = 6;
    static final int AWAITING_EXIT_EFFECTS = 3;
    static final int CREATED = 1;
    static final int INITIALIZING = -1;
    static final int RESUMED = 7;
    static final int STARTED = 5;
    static final Object USE_DEFAULT_TRANSITION = new Object();
    static final int VIEW_CREATED = 2;
    boolean mAdded;
    H mAnimationInfo;
    Bundle mArguments;
    int mBackStackNesting;
    boolean mBeingSaved;
    private boolean mCalled;
    AbstractC0158l0 mChildFragmentManager;
    ViewGroup mContainer;
    int mContainerId;
    private int mContentLayoutId;
    androidx.lifecycle.y0 mDefaultFactory;
    boolean mDeferStart;
    boolean mDetached;
    int mFragmentId;
    AbstractC0158l0 mFragmentManager;
    boolean mFromLayout;
    boolean mHasMenu;
    boolean mHidden;
    boolean mHiddenChanged;
    V mHost;
    boolean mInLayout;
    boolean mIsCreated;
    private Boolean mIsPrimaryNavigationFragment;
    LayoutInflater mLayoutInflater;
    androidx.lifecycle.L mLifecycleRegistry;
    androidx.lifecycle.B mMaxState;
    boolean mMenuVisible;
    private final AtomicInteger mNextLocalRequestCode;
    private final ArrayList<I> mOnPreAttachedListeners;
    K mParentFragment;
    boolean mPerformedCreateView;
    Runnable mPostponedDurationRunnable;
    Handler mPostponedHandler;
    public String mPreviousWho;
    boolean mRemoving;
    boolean mRestored;
    boolean mRetainInstance;
    boolean mRetainInstanceChangedWhileDetached;
    Bundle mSavedFragmentState;
    private final I mSavedStateAttachListener;
    C0640e mSavedStateRegistryController;
    Boolean mSavedUserVisibleHint;
    Bundle mSavedViewRegistryState;
    SparseArray<Parcelable> mSavedViewState;
    int mState;
    String mTag;
    K mTarget;
    int mTargetRequestCode;
    String mTargetWho;
    boolean mTransitioning;
    boolean mUserVisibleHint;
    View mView;
    F0 mViewLifecycleOwner;
    androidx.lifecycle.X mViewLifecycleOwnerLiveData;
    String mWho;

    /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.X, androidx.lifecycle.Q] */
    public K() {
        this.mState = -1;
        this.mWho = UUID.randomUUID().toString();
        this.mTargetWho = null;
        this.mIsPrimaryNavigationFragment = null;
        this.mChildFragmentManager = new AbstractC0158l0();
        this.mMenuVisible = true;
        this.mUserVisibleHint = true;
        this.mPostponedDurationRunnable = new B(this, 0);
        this.mMaxState = androidx.lifecycle.B.f3284e;
        this.mViewLifecycleOwnerLiveData = new androidx.lifecycle.Q();
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mOnPreAttachedListeners = new ArrayList<>();
        this.mSavedStateAttachListener = new C(this);
        d();
    }

    @Deprecated
    public static K instantiate(Context context, String str) {
        return instantiate(context, str, null);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, androidx.fragment.app.H] */
    public final H a() {
        if (this.mAnimationInfo == null) {
            ?? obj = new Object();
            obj.i = null;
            Object obj2 = USE_DEFAULT_TRANSITION;
            obj.f3021j = obj2;
            obj.f3022k = null;
            obj.f3023l = obj2;
            obj.f3024m = null;
            obj.f3025n = obj2;
            obj.f3027q = 1.0f;
            obj.f3028r = null;
            this.mAnimationInfo = obj;
        }
        return this.mAnimationInfo;
    }

    public final int b() {
        androidx.lifecycle.B b4 = this.mMaxState;
        return (b4 == androidx.lifecycle.B.f3281b || this.mParentFragment == null) ? b4.ordinal() : Math.min(b4.ordinal(), this.mParentFragment.b());
    }

    public final K c(boolean z3) {
        String str;
        if (z3) {
            C0382c c0382c = AbstractC0383d.f6811a;
            Intrinsics.checkNotNullParameter(this, "fragment");
            Intrinsics.checkNotNullParameter(this, "fragment");
            Intrinsics.checkNotNullParameter(this, "fragment");
            AbstractC0392m abstractC0392m = new AbstractC0392m(this, "Attempting to get target fragment from fragment " + this);
            AbstractC0383d.c(abstractC0392m);
            C0382c a2 = AbstractC0383d.a(this);
            if (a2.f6809a.contains(EnumC0381b.h) && AbstractC0383d.e(a2, getClass(), C0387h.class)) {
                AbstractC0383d.b(a2, abstractC0392m);
            }
        }
        K k4 = this.mTarget;
        if (k4 != null) {
            return k4;
        }
        AbstractC0158l0 abstractC0158l0 = this.mFragmentManager;
        if (abstractC0158l0 == null || (str = this.mTargetWho) == null) {
            return null;
        }
        return abstractC0158l0.f3160c.b(str);
    }

    public void callStartTransitionListener(boolean z3) {
        ViewGroup viewGroup;
        AbstractC0158l0 abstractC0158l0;
        H h = this.mAnimationInfo;
        if (h != null) {
            h.f3029s = false;
        }
        if (this.mView == null || (viewGroup = this.mContainer) == null || (abstractC0158l0 = this.mFragmentManager) == null) {
            return;
        }
        O0 m4 = O0.m(viewGroup, abstractC0158l0);
        m4.n();
        if (z3) {
            this.mHost.f3076c.post(new RunnableC0169t(m4, 1));
        } else {
            m4.i();
        }
        Handler handler = this.mPostponedHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mPostponedDurationRunnable);
            this.mPostponedHandler = null;
        }
    }

    public T createFragmentContainer() {
        return new D(this);
    }

    public final void d() {
        this.mLifecycleRegistry = new androidx.lifecycle.L(this);
        Intrinsics.checkNotNullParameter(this, "owner");
        this.mSavedStateRegistryController = new C0640e(this);
        this.mDefaultFactory = null;
        if (this.mOnPreAttachedListeners.contains(this.mSavedStateAttachListener)) {
            return;
        }
        I i = this.mSavedStateAttachListener;
        if (this.mState >= 0) {
            i.a();
        } else {
            this.mOnPreAttachedListeners.add(i);
        }
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.mFragmentId));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.mContainerId));
        printWriter.print(" mTag=");
        printWriter.println(this.mTag);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.mState);
        printWriter.print(" mWho=");
        printWriter.print(this.mWho);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.mBackStackNesting);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.mAdded);
        printWriter.print(" mRemoving=");
        printWriter.print(this.mRemoving);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.mFromLayout);
        printWriter.print(" mInLayout=");
        printWriter.println(this.mInLayout);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.mHidden);
        printWriter.print(" mDetached=");
        printWriter.print(this.mDetached);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.mMenuVisible);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.mHasMenu);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.mRetainInstance);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.mSavedViewState);
        }
        if (this.mSavedViewRegistryState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.mSavedViewRegistryState);
        }
        K c4 = c(false);
        if (c4 != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(c4);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.mTargetRequestCode);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(getPopDirection());
        if (getEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(getEnterAnim());
        }
        if (getExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(getExitAnim());
        }
        if (getPopEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(getPopEnterAnim());
        }
        if (getPopExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(getPopExitAnim());
        }
        if (this.mContainer != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (getAnimatingAway() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(getAnimatingAway());
        }
        if (getContext() != null) {
            AbstractC0511a.a(this).b(str, printWriter);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.mChildFragmentManager + ":");
        this.mChildFragmentManager.w(C.w.n(str, "  "), fileDescriptor, printWriter, strArr);
    }

    public final A e(AbstractC0311a abstractC0311a, F f2, InterfaceC0293b interfaceC0293b) {
        if (this.mState > 1) {
            throw new IllegalStateException(C.w.m("Fragment ", this, " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate())."));
        }
        AtomicReference atomicReference = new AtomicReference();
        G g4 = new G(this, f2, atomicReference, abstractC0311a, interfaceC0293b);
        if (this.mState >= 0) {
            g4.a();
        } else {
            this.mOnPreAttachedListeners.add(g4);
        }
        return new A(atomicReference);
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public K findFragmentByWho(String str) {
        return str.equals(this.mWho) ? this : this.mChildFragmentManager.f3160c.c(str);
    }

    public String generateActivityResultKey() {
        return "fragment_" + this.mWho + "_rq#" + this.mNextLocalRequestCode.getAndIncrement();
    }

    public final P getActivity() {
        V v3 = this.mHost;
        if (v3 == null) {
            return null;
        }
        return v3.f3074a;
    }

    public boolean getAllowEnterTransitionOverlap() {
        Boolean bool;
        H h = this.mAnimationInfo;
        if (h == null || (bool = h.p) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public boolean getAllowReturnTransitionOverlap() {
        Boolean bool;
        H h = this.mAnimationInfo;
        if (h == null || (bool = h.f3026o) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public View getAnimatingAway() {
        H h = this.mAnimationInfo;
        if (h == null) {
            return null;
        }
        h.getClass();
        return null;
    }

    public final Bundle getArguments() {
        return this.mArguments;
    }

    public final AbstractC0158l0 getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        throw new IllegalStateException(C.w.m("Fragment ", this, " has not been attached yet."));
    }

    public Context getContext() {
        V v3 = this.mHost;
        if (v3 == null) {
            return null;
        }
        return v3.f3075b;
    }

    @Override // androidx.lifecycle.InterfaceC0200v
    public l0.c getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && AbstractC0158l0.M(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + requireContext().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        l0.d dVar = new l0.d(0);
        if (application != null) {
            dVar.b(androidx.lifecycle.x0.f3440d, application);
        }
        dVar.b(androidx.lifecycle.q0.f3417a, this);
        dVar.b(androidx.lifecycle.q0.f3418b, this);
        if (getArguments() != null) {
            dVar.b(androidx.lifecycle.q0.f3419c, getArguments());
        }
        return dVar;
    }

    @Override // androidx.lifecycle.InterfaceC0200v
    public androidx.lifecycle.y0 getDefaultViewModelProviderFactory() {
        Application application;
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.mDefaultFactory == null) {
            Context applicationContext = requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            if (application == null && AbstractC0158l0.M(3)) {
                Log.d("FragmentManager", "Could not find Application instance from Context " + requireContext().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
            }
            this.mDefaultFactory = new androidx.lifecycle.t0(application, this, getArguments());
        }
        return this.mDefaultFactory;
    }

    public int getEnterAnim() {
        H h = this.mAnimationInfo;
        if (h == null) {
            return 0;
        }
        return h.f3015b;
    }

    public Object getEnterTransition() {
        H h = this.mAnimationInfo;
        if (h == null) {
            return null;
        }
        return h.i;
    }

    public C.K getEnterTransitionCallback() {
        H h = this.mAnimationInfo;
        if (h == null) {
            return null;
        }
        h.getClass();
        return null;
    }

    public int getExitAnim() {
        H h = this.mAnimationInfo;
        if (h == null) {
            return 0;
        }
        return h.f3016c;
    }

    public Object getExitTransition() {
        H h = this.mAnimationInfo;
        if (h == null) {
            return null;
        }
        return h.f3022k;
    }

    public C.K getExitTransitionCallback() {
        H h = this.mAnimationInfo;
        if (h == null) {
            return null;
        }
        h.getClass();
        return null;
    }

    public View getFocusedView() {
        H h = this.mAnimationInfo;
        if (h == null) {
            return null;
        }
        return h.f3028r;
    }

    @Deprecated
    public final AbstractC0158l0 getFragmentManager() {
        return this.mFragmentManager;
    }

    public final Object getHost() {
        V v3 = this.mHost;
        if (v3 == null) {
            return null;
        }
        return ((O) v3).f3060e;
    }

    public final int getId() {
        return this.mFragmentId;
    }

    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        return layoutInflater == null ? performGetLayoutInflater(null) : layoutInflater;
    }

    @Override // androidx.lifecycle.J
    public androidx.lifecycle.C getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Deprecated
    public AbstractC0511a getLoaderManager() {
        return AbstractC0511a.a(this);
    }

    public int getNextTransition() {
        H h = this.mAnimationInfo;
        if (h == null) {
            return 0;
        }
        return h.f3019f;
    }

    public final K getParentFragment() {
        return this.mParentFragment;
    }

    public final AbstractC0158l0 getParentFragmentManager() {
        AbstractC0158l0 abstractC0158l0 = this.mFragmentManager;
        if (abstractC0158l0 != null) {
            return abstractC0158l0;
        }
        throw new IllegalStateException(C.w.m("Fragment ", this, " not associated with a fragment manager."));
    }

    public boolean getPopDirection() {
        H h = this.mAnimationInfo;
        if (h == null) {
            return false;
        }
        return h.f3014a;
    }

    public int getPopEnterAnim() {
        H h = this.mAnimationInfo;
        if (h == null) {
            return 0;
        }
        return h.f3017d;
    }

    public int getPopExitAnim() {
        H h = this.mAnimationInfo;
        if (h == null) {
            return 0;
        }
        return h.f3018e;
    }

    public float getPostOnViewCreatedAlpha() {
        H h = this.mAnimationInfo;
        if (h == null) {
            return 1.0f;
        }
        return h.f3027q;
    }

    public Object getReenterTransition() {
        H h = this.mAnimationInfo;
        if (h == null) {
            return null;
        }
        Object obj = h.f3023l;
        return obj == USE_DEFAULT_TRANSITION ? getExitTransition() : obj;
    }

    public final Resources getResources() {
        return requireContext().getResources();
    }

    @Deprecated
    public final boolean getRetainInstance() {
        C0382c c0382c = AbstractC0383d.f6811a;
        Intrinsics.checkNotNullParameter(this, "fragment");
        Intrinsics.checkNotNullParameter(this, "fragment");
        Intrinsics.checkNotNullParameter(this, "fragment");
        AbstractC0392m abstractC0392m = new AbstractC0392m(this, "Attempting to get retain instance for fragment " + this);
        AbstractC0383d.c(abstractC0392m);
        C0382c a2 = AbstractC0383d.a(this);
        if (a2.f6809a.contains(EnumC0381b.f6805f) && AbstractC0383d.e(a2, getClass(), C0385f.class)) {
            AbstractC0383d.b(a2, abstractC0392m);
        }
        return this.mRetainInstance;
    }

    public Object getReturnTransition() {
        H h = this.mAnimationInfo;
        if (h == null) {
            return null;
        }
        Object obj = h.f3021j;
        return obj == USE_DEFAULT_TRANSITION ? getEnterTransition() : obj;
    }

    @Override // v0.f
    public final C0639d getSavedStateRegistry() {
        return this.mSavedStateRegistryController.f8636b;
    }

    public Object getSharedElementEnterTransition() {
        H h = this.mAnimationInfo;
        if (h == null) {
            return null;
        }
        return h.f3024m;
    }

    public Object getSharedElementReturnTransition() {
        H h = this.mAnimationInfo;
        if (h == null) {
            return null;
        }
        Object obj = h.f3025n;
        return obj == USE_DEFAULT_TRANSITION ? getSharedElementEnterTransition() : obj;
    }

    public ArrayList<String> getSharedElementSourceNames() {
        ArrayList<String> arrayList;
        H h = this.mAnimationInfo;
        return (h == null || (arrayList = h.f3020g) == null) ? new ArrayList<>() : arrayList;
    }

    public ArrayList<String> getSharedElementTargetNames() {
        ArrayList<String> arrayList;
        H h = this.mAnimationInfo;
        return (h == null || (arrayList = h.h) == null) ? new ArrayList<>() : arrayList;
    }

    public final String getString(int i) {
        return getResources().getString(i);
    }

    public final String getTag() {
        return this.mTag;
    }

    @Deprecated
    public final K getTargetFragment() {
        return c(true);
    }

    @Deprecated
    public final int getTargetRequestCode() {
        C0382c c0382c = AbstractC0383d.f6811a;
        Intrinsics.checkNotNullParameter(this, "fragment");
        Intrinsics.checkNotNullParameter(this, "fragment");
        Intrinsics.checkNotNullParameter(this, "fragment");
        AbstractC0392m abstractC0392m = new AbstractC0392m(this, "Attempting to get target request code from fragment " + this);
        AbstractC0383d.c(abstractC0392m);
        C0382c a2 = AbstractC0383d.a(this);
        if (a2.f6809a.contains(EnumC0381b.h) && AbstractC0383d.e(a2, getClass(), C0386g.class)) {
            AbstractC0383d.b(a2, abstractC0392m);
        }
        return this.mTargetRequestCode;
    }

    public final CharSequence getText(int i) {
        return getResources().getText(i);
    }

    @Deprecated
    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    public View getView() {
        return this.mView;
    }

    public androidx.lifecycle.J getViewLifecycleOwner() {
        F0 f02 = this.mViewLifecycleOwner;
        if (f02 != null) {
            return f02;
        }
        throw new IllegalStateException(C.w.m("Can't access the Fragment View's LifecycleOwner for ", this, " when getView() is null i.e., before onCreateView() or after onDestroyView()"));
    }

    public androidx.lifecycle.Q getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    @Override // androidx.lifecycle.D0
    public androidx.lifecycle.C0 getViewModelStore() {
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (b() == 1) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        HashMap hashMap = this.mFragmentManager.f3156O.f3204c;
        androidx.lifecycle.C0 c02 = (androidx.lifecycle.C0) hashMap.get(this.mWho);
        if (c02 != null) {
            return c02;
        }
        androidx.lifecycle.C0 c03 = new androidx.lifecycle.C0();
        hashMap.put(this.mWho, c03);
        return c03;
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public void initState() {
        d();
        this.mPreviousWho = this.mWho;
        this.mWho = UUID.randomUUID().toString();
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new AbstractC0158l0();
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
    }

    public final boolean isAdded() {
        return this.mHost != null && this.mAdded;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public final boolean isHidden() {
        if (this.mHidden) {
            return true;
        }
        AbstractC0158l0 abstractC0158l0 = this.mFragmentManager;
        if (abstractC0158l0 != null) {
            K k4 = this.mParentFragment;
            abstractC0158l0.getClass();
            if (k4 == null ? false : k4.isHidden()) {
                return true;
            }
        }
        return false;
    }

    public final boolean isInBackStack() {
        return this.mBackStackNesting > 0;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    public final boolean isMenuVisible() {
        if (!this.mMenuVisible) {
            return false;
        }
        if (this.mFragmentManager != null) {
            K k4 = this.mParentFragment;
            if (!(k4 == null ? true : k4.isMenuVisible())) {
                return false;
            }
        }
        return true;
    }

    public boolean isPostponed() {
        H h = this.mAnimationInfo;
        if (h == null) {
            return false;
        }
        return h.f3029s;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public final boolean isResumed() {
        return this.mState >= 7;
    }

    public final boolean isStateSaved() {
        AbstractC0158l0 abstractC0158l0 = this.mFragmentManager;
        if (abstractC0158l0 == null) {
            return false;
        }
        return abstractC0158l0.Q();
    }

    public final boolean isVisible() {
        View view;
        return (!isAdded() || isHidden() || (view = this.mView) == null || view.getWindowToken() == null || this.mView.getVisibility() != 0) ? false : true;
    }

    public void noteStateNotSaved() {
        this.mChildFragmentManager.S();
    }

    @Deprecated
    public void onActivityCreated(Bundle bundle) {
        this.mCalled = true;
    }

    @Deprecated
    public void onActivityResult(int i, int i4, Intent intent) {
        if (AbstractC0158l0.M(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i4 + " data: " + intent);
        }
    }

    public void onAttach(Context context) {
        this.mCalled = true;
        V v3 = this.mHost;
        P p = v3 == null ? null : v3.f3074a;
        if (p != null) {
            this.mCalled = false;
            onAttach((Activity) p);
        }
    }

    @Deprecated
    public void onAttachFragment(K k4) {
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.mCalled = true;
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onCreate(Bundle bundle) {
        this.mCalled = true;
        restoreChildFragmentState();
        AbstractC0158l0 abstractC0158l0 = this.mChildFragmentManager;
        if (abstractC0158l0.f3176v >= 1) {
            return;
        }
        abstractC0158l0.f3150H = false;
        abstractC0158l0.f3151I = false;
        abstractC0158l0.f3156O.f3207f = false;
        abstractC0158l0.u(1);
    }

    public Animation onCreateAnimation(int i, boolean z3, int i4) {
        return null;
    }

    public Animator onCreateAnimator(int i, boolean z3, int i4) {
        return null;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Deprecated
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = this.mContentLayoutId;
        if (i != 0) {
            return layoutInflater.inflate(i, viewGroup, false);
        }
        return null;
    }

    public void onDestroy() {
        this.mCalled = true;
    }

    @Deprecated
    public void onDestroyOptionsMenu() {
    }

    public void onDestroyView() {
        this.mCalled = true;
    }

    public void onDetach() {
        this.mCalled = true;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    public void onHiddenChanged(boolean z3) {
    }

    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
        V v3 = this.mHost;
        P p = v3 == null ? null : v3.f3074a;
        if (p != null) {
            this.mCalled = false;
            onInflate((Activity) p, attributeSet, bundle);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.mCalled = true;
    }

    public void onMultiWindowModeChanged(boolean z3) {
    }

    @Deprecated
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    @Deprecated
    public void onOptionsMenuClosed(Menu menu) {
    }

    public void onPause() {
        this.mCalled = true;
    }

    public void onPictureInPictureModeChanged(boolean z3) {
    }

    @Deprecated
    public void onPrepareOptionsMenu(Menu menu) {
    }

    public void onPrimaryNavigationFragmentChanged(boolean z3) {
    }

    @Deprecated
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
    }

    public void onResume() {
        this.mCalled = true;
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onStart() {
        this.mCalled = true;
    }

    public void onStop() {
        this.mCalled = true;
    }

    public void onViewCreated(View view, Bundle bundle) {
    }

    public void onViewStateRestored(Bundle bundle) {
        this.mCalled = true;
    }

    public void performActivityCreated(Bundle bundle) {
        this.mChildFragmentManager.S();
        this.mState = 3;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (!this.mCalled) {
            throw new AndroidRuntimeException(C.w.m("Fragment ", this, " did not call through to super.onActivityCreated()"));
        }
        if (AbstractC0158l0.M(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + this);
        }
        if (this.mView != null) {
            Bundle bundle2 = this.mSavedFragmentState;
            restoreViewState(bundle2 != null ? bundle2.getBundle("savedInstanceState") : null);
        }
        this.mSavedFragmentState = null;
        AbstractC0158l0 abstractC0158l0 = this.mChildFragmentManager;
        abstractC0158l0.f3150H = false;
        abstractC0158l0.f3151I = false;
        abstractC0158l0.f3156O.f3207f = false;
        abstractC0158l0.u(4);
    }

    public void performAttach() {
        Iterator<I> it = this.mOnPreAttachedListeners.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.mOnPreAttachedListeners.clear();
        this.mChildFragmentManager.b(this.mHost, createFragmentContainer(), this);
        this.mState = 0;
        this.mCalled = false;
        onAttach((Context) this.mHost.f3075b);
        if (!this.mCalled) {
            throw new AndroidRuntimeException(C.w.m("Fragment ", this, " did not call through to super.onAttach()"));
        }
        AbstractC0158l0 abstractC0158l0 = this.mFragmentManager;
        Iterator it2 = abstractC0158l0.p.iterator();
        while (it2.hasNext()) {
            ((q0) it2.next()).a(abstractC0158l0, this);
        }
        AbstractC0158l0 abstractC0158l02 = this.mChildFragmentManager;
        abstractC0158l02.f3150H = false;
        abstractC0158l02.f3151I = false;
        abstractC0158l02.f3156O.f3207f = false;
        abstractC0158l02.u(0);
    }

    public void performConfigurationChanged(Configuration configuration) {
        onConfigurationChanged(configuration);
    }

    public boolean performContextItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (onContextItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.j(menuItem);
    }

    public void performCreate(Bundle bundle) {
        this.mChildFragmentManager.S();
        this.mState = 1;
        this.mCalled = false;
        this.mLifecycleRegistry.a(new E(this));
        onCreate(bundle);
        this.mIsCreated = true;
        if (!this.mCalled) {
            throw new AndroidRuntimeException(C.w.m("Fragment ", this, " did not call through to super.onCreate()"));
        }
        this.mLifecycleRegistry.f(androidx.lifecycle.A.ON_CREATE);
    }

    public boolean performCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        boolean z3 = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onCreateOptionsMenu(menu, menuInflater);
            z3 = true;
        }
        return this.mChildFragmentManager.k(menu, menuInflater) | z3;
    }

    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.mChildFragmentManager.S();
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new F0(this, getViewModelStore(), new RunnableC0175z(this, 0));
        View onCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.mView = onCreateView;
        if (onCreateView == null) {
            if (this.mViewLifecycleOwner.f3001e != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.mViewLifecycleOwner = null;
            return;
        }
        this.mViewLifecycleOwner.b();
        if (AbstractC0158l0.M(3)) {
            Log.d("FragmentManager", "Setting ViewLifecycleOwner on View " + this.mView + " for Fragment " + this);
        }
        androidx.lifecycle.q0.m(this.mView, this.mViewLifecycleOwner);
        View view = this.mView;
        F0 f02 = this.mViewLifecycleOwner;
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setTag(R.id.view_tree_view_model_store_owner, f02);
        m3.d.D(this.mView, this.mViewLifecycleOwner);
        this.mViewLifecycleOwnerLiveData.j(this.mViewLifecycleOwner);
    }

    public void performDestroy() {
        this.mChildFragmentManager.l();
        this.mLifecycleRegistry.f(androidx.lifecycle.A.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (!this.mCalled) {
            throw new AndroidRuntimeException(C.w.m("Fragment ", this, " did not call through to super.onDestroy()"));
        }
    }

    public void performDestroyView() {
        this.mChildFragmentManager.u(1);
        if (this.mView != null) {
            F0 f02 = this.mViewLifecycleOwner;
            f02.b();
            if (f02.f3001e.f3298d.a(androidx.lifecycle.B.f3282c)) {
                this.mViewLifecycleOwner.a(androidx.lifecycle.A.ON_DESTROY);
            }
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (!this.mCalled) {
            throw new AndroidRuntimeException(C.w.m("Fragment ", this, " did not call through to super.onDestroyView()"));
        }
        s.k kVar = AbstractC0511a.a(this).f7842b.f7840a;
        if (kVar.f() <= 0) {
            this.mPerformedCreateView = false;
        } else {
            kVar.g(0).getClass();
            throw new ClassCastException();
        }
    }

    public void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (!this.mCalled) {
            throw new AndroidRuntimeException(C.w.m("Fragment ", this, " did not call through to super.onDetach()"));
        }
        AbstractC0158l0 abstractC0158l0 = this.mChildFragmentManager;
        if (abstractC0158l0.J) {
            return;
        }
        abstractC0158l0.l();
        this.mChildFragmentManager = new AbstractC0158l0();
    }

    public LayoutInflater performGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = onGetLayoutInflater(bundle);
        this.mLayoutInflater = onGetLayoutInflater;
        return onGetLayoutInflater;
    }

    public void performLowMemory() {
        onLowMemory();
    }

    public void performMultiWindowModeChanged(boolean z3) {
        onMultiWindowModeChanged(z3);
    }

    public boolean performOptionsItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible && onOptionsItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.p(menuItem);
    }

    public void performOptionsMenuClosed(Menu menu) {
        if (this.mHidden) {
            return;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onOptionsMenuClosed(menu);
        }
        this.mChildFragmentManager.q(menu);
    }

    public void performPause() {
        this.mChildFragmentManager.u(5);
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(androidx.lifecycle.A.ON_PAUSE);
        }
        this.mLifecycleRegistry.f(androidx.lifecycle.A.ON_PAUSE);
        this.mState = 6;
        this.mCalled = false;
        onPause();
        if (!this.mCalled) {
            throw new AndroidRuntimeException(C.w.m("Fragment ", this, " did not call through to super.onPause()"));
        }
    }

    public void performPictureInPictureModeChanged(boolean z3) {
        onPictureInPictureModeChanged(z3);
    }

    public boolean performPrepareOptionsMenu(Menu menu) {
        boolean z3 = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onPrepareOptionsMenu(menu);
            z3 = true;
        }
        return this.mChildFragmentManager.t(menu) | z3;
    }

    public void performPrimaryNavigationFragmentChanged() {
        this.mFragmentManager.getClass();
        boolean P3 = AbstractC0158l0.P(this);
        Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool == null || bool.booleanValue() != P3) {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(P3);
            onPrimaryNavigationFragmentChanged(P3);
            AbstractC0158l0 abstractC0158l0 = this.mChildFragmentManager;
            abstractC0158l0.k0();
            abstractC0158l0.r(abstractC0158l0.f3180z);
        }
    }

    public void performResume() {
        this.mChildFragmentManager.S();
        this.mChildFragmentManager.A(true);
        this.mState = 7;
        this.mCalled = false;
        onResume();
        if (!this.mCalled) {
            throw new AndroidRuntimeException(C.w.m("Fragment ", this, " did not call through to super.onResume()"));
        }
        androidx.lifecycle.L l4 = this.mLifecycleRegistry;
        androidx.lifecycle.A a2 = androidx.lifecycle.A.ON_RESUME;
        l4.f(a2);
        if (this.mView != null) {
            this.mViewLifecycleOwner.f3001e.f(a2);
        }
        AbstractC0158l0 abstractC0158l0 = this.mChildFragmentManager;
        abstractC0158l0.f3150H = false;
        abstractC0158l0.f3151I = false;
        abstractC0158l0.f3156O.f3207f = false;
        abstractC0158l0.u(7);
    }

    public void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
    }

    public void performStart() {
        this.mChildFragmentManager.S();
        this.mChildFragmentManager.A(true);
        this.mState = 5;
        this.mCalled = false;
        onStart();
        if (!this.mCalled) {
            throw new AndroidRuntimeException(C.w.m("Fragment ", this, " did not call through to super.onStart()"));
        }
        androidx.lifecycle.L l4 = this.mLifecycleRegistry;
        androidx.lifecycle.A a2 = androidx.lifecycle.A.ON_START;
        l4.f(a2);
        if (this.mView != null) {
            this.mViewLifecycleOwner.f3001e.f(a2);
        }
        AbstractC0158l0 abstractC0158l0 = this.mChildFragmentManager;
        abstractC0158l0.f3150H = false;
        abstractC0158l0.f3151I = false;
        abstractC0158l0.f3156O.f3207f = false;
        abstractC0158l0.u(5);
    }

    public void performStop() {
        AbstractC0158l0 abstractC0158l0 = this.mChildFragmentManager;
        abstractC0158l0.f3151I = true;
        abstractC0158l0.f3156O.f3207f = true;
        abstractC0158l0.u(4);
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(androidx.lifecycle.A.ON_STOP);
        }
        this.mLifecycleRegistry.f(androidx.lifecycle.A.ON_STOP);
        this.mState = 4;
        this.mCalled = false;
        onStop();
        if (!this.mCalled) {
            throw new AndroidRuntimeException(C.w.m("Fragment ", this, " did not call through to super.onStop()"));
        }
    }

    public void performViewCreated() {
        Bundle bundle = this.mSavedFragmentState;
        onViewCreated(this.mView, bundle != null ? bundle.getBundle("savedInstanceState") : null);
        this.mChildFragmentManager.u(2);
    }

    public void postponeEnterTransition() {
        a().f3029s = true;
    }

    public final <I, O> AbstractC0294c registerForActivityResult(AbstractC0311a abstractC0311a, InterfaceC0293b interfaceC0293b) {
        return e(abstractC0311a, new F(this, 0), interfaceC0293b);
    }

    public void registerForContextMenu(View view) {
        view.setOnCreateContextMenuListener(this);
    }

    @Deprecated
    public final void requestPermissions(String[] permissions, int i) {
        if (this.mHost == null) {
            throw new IllegalStateException(C.w.m("Fragment ", this, " not attached to Activity"));
        }
        AbstractC0158l0 parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.f3147E != null) {
            parentFragmentManager.f3148F.addLast(new C0148g0(this.mWho, i));
            parentFragmentManager.f3147E.a(permissions);
        } else {
            parentFragmentManager.f3177w.getClass();
            Intrinsics.checkNotNullParameter(this, "fragment");
            Intrinsics.checkNotNullParameter(permissions, "permissions");
        }
    }

    public final P requireActivity() {
        P activity = getActivity();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException(C.w.m("Fragment ", this, " not attached to an activity."));
    }

    public final Bundle requireArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        throw new IllegalStateException(C.w.m("Fragment ", this, " does not have any arguments."));
    }

    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException(C.w.m("Fragment ", this, " not attached to a context."));
    }

    @Deprecated
    public final AbstractC0158l0 requireFragmentManager() {
        return getParentFragmentManager();
    }

    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        throw new IllegalStateException(C.w.m("Fragment ", this, " not attached to a host."));
    }

    public final K requireParentFragment() {
        K parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        if (getContext() == null) {
            throw new IllegalStateException(C.w.m("Fragment ", this, " is not attached to any Fragment or host"));
        }
        throw new IllegalStateException("Fragment " + this + " is not a child Fragment, it is directly attached to " + getContext());
    }

    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        throw new IllegalStateException(C.w.m("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
    }

    public void restoreChildFragmentState() {
        Bundle bundle;
        Bundle bundle2 = this.mSavedFragmentState;
        if (bundle2 == null || (bundle = bundle2.getBundle("childFragmentManager")) == null) {
            return;
        }
        this.mChildFragmentManager.Z(bundle);
        AbstractC0158l0 abstractC0158l0 = this.mChildFragmentManager;
        abstractC0158l0.f3150H = false;
        abstractC0158l0.f3151I = false;
        abstractC0158l0.f3156O.f3207f = false;
        abstractC0158l0.u(1);
    }

    public final void restoreViewState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (!this.mCalled) {
            throw new AndroidRuntimeException(C.w.m("Fragment ", this, " did not call through to super.onViewStateRestored()"));
        }
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(androidx.lifecycle.A.ON_CREATE);
        }
    }

    public void setAllowEnterTransitionOverlap(boolean z3) {
        a().p = Boolean.valueOf(z3);
    }

    public void setAllowReturnTransitionOverlap(boolean z3) {
        a().f3026o = Boolean.valueOf(z3);
    }

    public void setAnimations(int i, int i4, int i5, int i6) {
        if (this.mAnimationInfo == null && i == 0 && i4 == 0 && i5 == 0 && i6 == 0) {
            return;
        }
        a().f3015b = i;
        a().f3016c = i4;
        a().f3017d = i5;
        a().f3018e = i6;
    }

    public void setArguments(Bundle bundle) {
        if (this.mFragmentManager != null && isStateSaved()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.mArguments = bundle;
    }

    public void setEnterSharedElementCallback(C.K k4) {
        a().getClass();
    }

    public void setEnterTransition(Object obj) {
        a().i = obj;
    }

    public void setExitSharedElementCallback(C.K k4) {
        a().getClass();
    }

    public void setExitTransition(Object obj) {
        a().f3022k = obj;
    }

    public void setFocusedView(View view) {
        a().f3028r = view;
    }

    @Deprecated
    public void setHasOptionsMenu(boolean z3) {
        if (this.mHasMenu != z3) {
            this.mHasMenu = z3;
            if (!isAdded() || isHidden()) {
                return;
            }
            ((O) this.mHost).f3060e.invalidateMenu();
        }
    }

    public void setInitialSavedState(J j4) {
        Bundle bundle;
        if (this.mFragmentManager != null) {
            throw new IllegalStateException("Fragment already added");
        }
        if (j4 == null || (bundle = j4.f3035a) == null) {
            bundle = null;
        }
        this.mSavedFragmentState = bundle;
    }

    public void setMenuVisibility(boolean z3) {
        if (this.mMenuVisible != z3) {
            this.mMenuVisible = z3;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                ((O) this.mHost).f3060e.invalidateMenu();
            }
        }
    }

    public void setNextTransition(int i) {
        if (this.mAnimationInfo == null && i == 0) {
            return;
        }
        a();
        this.mAnimationInfo.f3019f = i;
    }

    public void setPopDirection(boolean z3) {
        if (this.mAnimationInfo == null) {
            return;
        }
        a().f3014a = z3;
    }

    public void setPostOnViewCreatedAlpha(float f2) {
        a().f3027q = f2;
    }

    public void setReenterTransition(Object obj) {
        a().f3023l = obj;
    }

    @Deprecated
    public void setRetainInstance(boolean z3) {
        C0382c c0382c = AbstractC0383d.f6811a;
        Intrinsics.checkNotNullParameter(this, "fragment");
        Intrinsics.checkNotNullParameter(this, "fragment");
        Intrinsics.checkNotNullParameter(this, "fragment");
        AbstractC0392m abstractC0392m = new AbstractC0392m(this, "Attempting to set retain instance for fragment " + this);
        AbstractC0383d.c(abstractC0392m);
        C0382c a2 = AbstractC0383d.a(this);
        if (a2.f6809a.contains(EnumC0381b.f6805f) && AbstractC0383d.e(a2, getClass(), C0389j.class)) {
            AbstractC0383d.b(a2, abstractC0392m);
        }
        this.mRetainInstance = z3;
        AbstractC0158l0 abstractC0158l0 = this.mFragmentManager;
        if (abstractC0158l0 == null) {
            this.mRetainInstanceChangedWhileDetached = true;
        } else if (z3) {
            abstractC0158l0.f3156O.a(this);
        } else {
            abstractC0158l0.f3156O.g(this);
        }
    }

    public void setReturnTransition(Object obj) {
        a().f3021j = obj;
    }

    public void setSharedElementEnterTransition(Object obj) {
        a().f3024m = obj;
    }

    public void setSharedElementNames(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        a();
        H h = this.mAnimationInfo;
        h.f3020g = arrayList;
        h.h = arrayList2;
    }

    public void setSharedElementReturnTransition(Object obj) {
        a().f3025n = obj;
    }

    @Deprecated
    public void setTargetFragment(K targetFragment, int i) {
        if (targetFragment != null) {
            C0382c c0382c = AbstractC0383d.f6811a;
            Intrinsics.checkNotNullParameter(this, "violatingFragment");
            Intrinsics.checkNotNullParameter(targetFragment, "targetFragment");
            Intrinsics.checkNotNullParameter(this, "fragment");
            Intrinsics.checkNotNullParameter(targetFragment, "targetFragment");
            Intrinsics.checkNotNullParameter(this, "fragment");
            AbstractC0392m abstractC0392m = new AbstractC0392m(this, "Attempting to set target fragment " + targetFragment + " with request code " + i + " for fragment " + this);
            AbstractC0383d.c(abstractC0392m);
            C0382c a2 = AbstractC0383d.a(this);
            if (a2.f6809a.contains(EnumC0381b.h) && AbstractC0383d.e(a2, getClass(), C0390k.class)) {
                AbstractC0383d.b(a2, abstractC0392m);
            }
        }
        AbstractC0158l0 abstractC0158l0 = this.mFragmentManager;
        AbstractC0158l0 abstractC0158l02 = targetFragment != null ? targetFragment.mFragmentManager : null;
        if (abstractC0158l0 != null && abstractC0158l02 != null && abstractC0158l0 != abstractC0158l02) {
            throw new IllegalArgumentException(C.w.m("Fragment ", targetFragment, " must share the same FragmentManager to be set as a target fragment"));
        }
        for (K k4 = targetFragment; k4 != null; k4 = k4.c(false)) {
            if (k4.equals(this)) {
                throw new IllegalArgumentException("Setting " + targetFragment + " as the target of " + this + " would create a target cycle");
            }
        }
        if (targetFragment == null) {
            this.mTargetWho = null;
            this.mTarget = null;
        } else if (this.mFragmentManager == null || targetFragment.mFragmentManager == null) {
            this.mTargetWho = null;
            this.mTarget = targetFragment;
        } else {
            this.mTargetWho = targetFragment.mWho;
            this.mTarget = null;
        }
        this.mTargetRequestCode = i;
    }

    @Deprecated
    public void setUserVisibleHint(boolean z3) {
        C0382c c0382c = AbstractC0383d.f6811a;
        Intrinsics.checkNotNullParameter(this, "fragment");
        Intrinsics.checkNotNullParameter(this, "fragment");
        AbstractC0392m abstractC0392m = new AbstractC0392m(this, "Attempting to set user visible hint to " + z3 + " for fragment " + this);
        AbstractC0383d.c(abstractC0392m);
        C0382c a2 = AbstractC0383d.a(this);
        if (a2.f6809a.contains(EnumC0381b.f6806g) && AbstractC0383d.e(a2, getClass(), C0391l.class)) {
            AbstractC0383d.b(a2, abstractC0392m);
        }
        boolean z4 = false;
        if (!this.mUserVisibleHint && z3 && this.mState < 5 && this.mFragmentManager != null && isAdded() && this.mIsCreated) {
            AbstractC0158l0 abstractC0158l0 = this.mFragmentManager;
            t0 g4 = abstractC0158l0.g(this);
            K k4 = g4.f3240c;
            if (k4.mDeferStart) {
                if (abstractC0158l0.f3159b) {
                    abstractC0158l0.f3152K = true;
                } else {
                    k4.mDeferStart = false;
                    g4.k();
                }
            }
        }
        this.mUserVisibleHint = z3;
        if (this.mState < 5 && !z3) {
            z4 = true;
        }
        this.mDeferStart = z4;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(z3);
        }
    }

    public boolean shouldShowRequestPermissionRationale(String str) {
        V v3 = this.mHost;
        if (v3 != null) {
            return AbstractC0043g.a(((O) v3).f3060e, str);
        }
        return false;
    }

    public void startActivity(Intent intent) {
        startActivity(intent, null);
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i) {
        startActivityForResult(intent, i, null);
    }

    @Deprecated
    public void startIntentSenderForResult(IntentSender intent, int i, Intent intent2, int i4, int i5, int i6, Bundle bundle) throws IntentSender.SendIntentException {
        if (this.mHost == null) {
            throw new IllegalStateException(C.w.m("Fragment ", this, " not attached to Activity"));
        }
        if (AbstractC0158l0.M(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in startIntentSenderForResult() requestCode: " + i + " IntentSender: " + intent + " fillInIntent: " + intent2 + " options: " + bundle);
        }
        AbstractC0158l0 parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.f3146D == null) {
            V v3 = parentFragmentManager.f3177w;
            v3.getClass();
            Intrinsics.checkNotNullParameter(this, "fragment");
            Intrinsics.checkNotNullParameter(intent, "intent");
            if (i != -1) {
                throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
            }
            P p = v3.f3074a;
            if (p == null) {
                throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
            }
            p.startIntentSenderForResult(intent, i, intent2, i4, i5, i6, bundle);
            return;
        }
        if (bundle != null) {
            if (intent2 == null) {
                intent2 = new Intent();
                intent2.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
            }
            if (AbstractC0158l0.M(2)) {
                Log.v("FragmentManager", "ActivityOptions " + bundle + " were added to fillInIntent " + intent2 + " for fragment " + this);
            }
            intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        Intrinsics.checkNotNullParameter(intent, "intentSender");
        C0302k c0302k = new C0302k(intent, intent2, i4, i5);
        parentFragmentManager.f3148F.addLast(new C0148g0(this.mWho, i));
        if (AbstractC0158l0.M(2)) {
            Log.v("FragmentManager", "Fragment " + this + "is launching an IntentSender for result ");
        }
        parentFragmentManager.f3146D.a(c0302k);
    }

    public void startPostponedEnterTransition() {
        if (this.mAnimationInfo == null || !a().f3029s) {
            return;
        }
        if (this.mHost == null) {
            a().f3029s = false;
        } else if (Looper.myLooper() != this.mHost.f3076c.getLooper()) {
            this.mHost.f3076c.postAtFrontOfQueue(new B(this, 1));
        } else {
            callStartTransitionListener(true);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.mWho);
        if (this.mFragmentId != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb.append(" tag=");
            sb.append(this.mTag);
        }
        sb.append(")");
        return sb.toString();
    }

    public void unregisterForContextMenu(View view) {
        view.setOnCreateContextMenuListener(null);
    }

    @Deprecated
    public static K instantiate(Context context, String str, Bundle bundle) {
        try {
            K k4 = (K) C0142d0.c(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle == null) {
                return k4;
            }
            bundle.setClassLoader(k4.getClass().getClassLoader());
            k4.setArguments(bundle);
            return k4;
        } catch (IllegalAccessException e4) {
            throw new RuntimeException(C.w.o("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e4);
        } catch (InstantiationException e5) {
            throw new RuntimeException(C.w.o("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e5);
        } catch (NoSuchMethodException e6) {
            throw new RuntimeException(C.w.o("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e6);
        } catch (InvocationTargetException e7) {
            throw new RuntimeException(C.w.o("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e7);
        }
    }

    public final String getString(int i, Object... objArr) {
        return getResources().getString(i, objArr);
    }

    public final void postponeEnterTransition(long j4, TimeUnit timeUnit) {
        a().f3029s = true;
        Handler handler = this.mPostponedHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mPostponedDurationRunnable);
        }
        AbstractC0158l0 abstractC0158l0 = this.mFragmentManager;
        if (abstractC0158l0 != null) {
            this.mPostponedHandler = abstractC0158l0.f3177w.f3076c;
        } else {
            this.mPostponedHandler = new Handler(Looper.getMainLooper());
        }
        this.mPostponedHandler.removeCallbacks(this.mPostponedDurationRunnable);
        this.mPostponedHandler.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(j4));
    }

    public final <I, O> AbstractC0294c registerForActivityResult(AbstractC0311a abstractC0311a, AbstractC0300i abstractC0300i, InterfaceC0293b interfaceC0293b) {
        return e(abstractC0311a, new F(abstractC0300i, 1), interfaceC0293b);
    }

    public void startActivity(Intent intent, Bundle bundle) {
        V v3 = this.mHost;
        if (v3 != null) {
            Intrinsics.checkNotNullParameter(this, "fragment");
            Intrinsics.checkNotNullParameter(intent, "intent");
            D.h.startActivity(v3.f3075b, intent, bundle);
            return;
        }
        throw new IllegalStateException(C.w.m("Fragment ", this, " not attached to Activity"));
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        if (this.mHost != null) {
            AbstractC0158l0 parentFragmentManager = getParentFragmentManager();
            if (parentFragmentManager.f3145C != null) {
                parentFragmentManager.f3148F.addLast(new C0148g0(this.mWho, i));
                if (bundle != null) {
                    intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
                }
                parentFragmentManager.f3145C.a(intent);
                return;
            }
            V v3 = parentFragmentManager.f3177w;
            v3.getClass();
            Intrinsics.checkNotNullParameter(this, "fragment");
            Intrinsics.checkNotNullParameter(intent, "intent");
            if (i == -1) {
                D.h.startActivity(v3.f3075b, intent, bundle);
                return;
            }
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        throw new IllegalStateException(C.w.m("Fragment ", this, " not attached to Activity"));
    }

    @Deprecated
    public LayoutInflater getLayoutInflater(Bundle bundle) {
        V v3 = this.mHost;
        if (v3 != null) {
            AbstractActivityC0364k abstractActivityC0364k = ((O) v3).f3060e;
            LayoutInflater cloneInContext = abstractActivityC0364k.getLayoutInflater().cloneInContext(abstractActivityC0364k);
            cloneInContext.setFactory2(this.mChildFragmentManager.f3163f);
            return cloneInContext;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    @Deprecated
    public void onAttach(Activity activity) {
        this.mCalled = true;
    }

    @Deprecated
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
    }

    public K(int i) {
        this();
        this.mContentLayoutId = i;
    }
}
