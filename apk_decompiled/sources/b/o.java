package b;

import C.AbstractActivityC0048l;
import C.H;
import C.I;
import O.C0072m;
import O.C0073n;
import O.C0074o;
import O.InterfaceC0070k;
import O.InterfaceC0076q;
import a.AbstractC0105a;
import a.AbstractC0106b;
import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.C0140c0;
import androidx.lifecycle.C0;
import androidx.lifecycle.C0203y;
import androidx.lifecycle.D0;
import androidx.lifecycle.InterfaceC0200v;
import androidx.lifecycle.J;
import androidx.lifecycle.L;
import androidx.lifecycle.i0;
import androidx.lifecycle.k0;
import androidx.lifecycle.l0;
import androidx.lifecycle.q0;
import androidx.lifecycle.x0;
import androidx.lifecycle.y0;
import c.C0273a;
import c.InterfaceC0274b;
import com.adif.elcanomovil.R;
import d.AbstractC0294c;
import d.AbstractC0300i;
import d.InterfaceC0293b;
import d.InterfaceC0301j;
import e.AbstractC0311a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import v0.C0636a;
import v0.C0639d;
import v0.C0640e;

/* loaded from: classes.dex */
public abstract class o extends AbstractActivityC0048l implements D0, InterfaceC0200v, v0.f, D, InterfaceC0301j, D.l, D.m, H, I, InterfaceC0070k {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private static final h Companion = new Object();
    private C0 _viewModelStore;
    private final AbstractC0300i activityResultRegistry;
    private int contentLayoutId;
    private final C0273a contextAwareHelper;
    private final Lazy defaultViewModelProviderFactory$delegate;
    private boolean dispatchingOnMultiWindowModeChanged;
    private boolean dispatchingOnPictureInPictureModeChanged;
    private final Lazy fullyDrawnReporter$delegate;
    private final C0074o menuHostHelper;
    private final AtomicInteger nextLocalRequestCode;
    private final Lazy onBackPressedDispatcher$delegate;
    private final CopyOnWriteArrayList<N.a> onConfigurationChangedListeners;
    private final CopyOnWriteArrayList<N.a> onMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<N.a> onNewIntentListeners;
    private final CopyOnWriteArrayList<N.a> onPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<N.a> onTrimMemoryListeners;
    private final CopyOnWriteArrayList<Runnable> onUserLeaveHintListeners;
    private final j reportFullyDrawnExecutor;
    private final C0640e savedStateRegistryController;

    public o() {
        this.contextAwareHelper = new C0273a();
        this.menuHostHelper = new C0074o(new RunnableC0255d(this, 0));
        Intrinsics.checkNotNullParameter(this, "owner");
        C0640e c0640e = new C0640e(this);
        this.savedStateRegistryController = c0640e;
        this.reportFullyDrawnExecutor = new k(this);
        this.fullyDrawnReporter$delegate = LazyKt.lazy(new n(this, 2));
        this.nextLocalRequestCode = new AtomicInteger();
        this.activityResultRegistry = new m(this);
        this.onConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.onTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.onNewIntentListeners = new CopyOnWriteArrayList<>();
        this.onMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onUserLeaveHintListeners = new CopyOnWriteArrayList<>();
        if (getLifecycle() != null) {
            final int i = 0;
            getLifecycle().a(new androidx.lifecycle.H(this) { // from class: b.e

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ o f4113b;

                {
                    this.f4113b = owner;
                }

                @Override // androidx.lifecycle.H
                public final void onStateChanged(J j4, androidx.lifecycle.A event) {
                    Window window;
                    View peekDecorView;
                    switch (i) {
                        case 0:
                            o this$0 = this.f4113b;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(j4, "<anonymous parameter 0>");
                            Intrinsics.checkNotNullParameter(event, "event");
                            if (event != androidx.lifecycle.A.ON_STOP || (window = this$0.getWindow()) == null || (peekDecorView = window.peekDecorView()) == null) {
                                return;
                            }
                            peekDecorView.cancelPendingInputEvents();
                            return;
                        default:
                            o.b(this.f4113b, j4, event);
                            return;
                    }
                }
            });
            final int i4 = 1;
            getLifecycle().a(new androidx.lifecycle.H(this) { // from class: b.e

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ o f4113b;

                {
                    this.f4113b = owner;
                }

                @Override // androidx.lifecycle.H
                public final void onStateChanged(J j4, androidx.lifecycle.A event) {
                    Window window;
                    View peekDecorView;
                    switch (i4) {
                        case 0:
                            o this$0 = this.f4113b;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(j4, "<anonymous parameter 0>");
                            Intrinsics.checkNotNullParameter(event, "event");
                            if (event != androidx.lifecycle.A.ON_STOP || (window = this$0.getWindow()) == null || (peekDecorView = window.peekDecorView()) == null) {
                                return;
                            }
                            peekDecorView.cancelPendingInputEvents();
                            return;
                        default:
                            o.b(this.f4113b, j4, event);
                            return;
                    }
                }
            });
            getLifecycle().a(new C0636a(this));
            c0640e.a();
            q0.f(this);
            getSavedStateRegistry().c(ACTIVITY_RESULT_TAG, new l0(this, 1));
            addOnContextAvailableListener(new InterfaceC0274b() { // from class: b.f
                @Override // c.InterfaceC0274b
                public final void a(o oVar) {
                    o.a(o.this, oVar);
                }
            });
            this.defaultViewModelProviderFactory$delegate = LazyKt.lazy(new n(this, 0));
            this.onBackPressedDispatcher$delegate = LazyKt.lazy(new n(this, 3));
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    public static void a(o this$0, o it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        Bundle a2 = this$0.getSavedStateRegistry().a(ACTIVITY_RESULT_TAG);
        if (a2 != null) {
            AbstractC0300i abstractC0300i = this$0.activityResultRegistry;
            abstractC0300i.getClass();
            ArrayList<Integer> integerArrayList = a2.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = a2.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList == null || integerArrayList == null) {
                return;
            }
            ArrayList<String> stringArrayList2 = a2.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            if (stringArrayList2 != null) {
                abstractC0300i.f6107d.addAll(stringArrayList2);
            }
            Bundle bundle = a2.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
            Bundle bundle2 = abstractC0300i.f6110g;
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            int size = stringArrayList.size();
            for (int i = 0; i < size; i++) {
                String str = stringArrayList.get(i);
                LinkedHashMap linkedHashMap = abstractC0300i.f6105b;
                boolean containsKey = linkedHashMap.containsKey(str);
                LinkedHashMap linkedHashMap2 = abstractC0300i.f6104a;
                if (containsKey) {
                    Integer num = (Integer) linkedHashMap.remove(str);
                    if (!bundle2.containsKey(str)) {
                        TypeIntrinsics.asMutableMap(linkedHashMap2).remove(num);
                    }
                }
                Integer num2 = integerArrayList.get(i);
                Intrinsics.checkNotNullExpressionValue(num2, "rcs[i]");
                int intValue = num2.intValue();
                String str2 = stringArrayList.get(i);
                Intrinsics.checkNotNullExpressionValue(str2, "keys[i]");
                String str3 = str2;
                linkedHashMap2.put(Integer.valueOf(intValue), str3);
                linkedHashMap.put(str3, Integer.valueOf(intValue));
            }
        }
    }

    public static final void access$ensureViewModelStore(o oVar) {
        if (oVar._viewModelStore == null) {
            i iVar = (i) oVar.getLastNonConfigurationInstance();
            if (iVar != null) {
                oVar._viewModelStore = iVar.f4117b;
            }
            if (oVar._viewModelStore == null) {
                oVar._viewModelStore = new C0();
            }
        }
    }

    public static void b(o this$0, J j4, androidx.lifecycle.A event) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(j4, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == androidx.lifecycle.A.ON_DESTROY) {
            this$0.contextAwareHelper.f4198b = null;
            if (!this$0.isChangingConfigurations()) {
                this$0.getViewModelStore().a();
            }
            k kVar = (k) this$0.reportFullyDrawnExecutor;
            o oVar = kVar.f4121d;
            oVar.getWindow().getDecorView().removeCallbacks(kVar);
            oVar.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(kVar);
        }
    }

    public static Bundle c(o this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Bundle outState = new Bundle();
        AbstractC0300i abstractC0300i = this$0.activityResultRegistry;
        abstractC0300i.getClass();
        Intrinsics.checkNotNullParameter(outState, "outState");
        LinkedHashMap linkedHashMap = abstractC0300i.f6105b;
        outState.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
        outState.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
        outState.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(abstractC0300i.f6107d));
        outState.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(abstractC0300i.f6110g));
        return outState;
    }

    public static /* synthetic */ void getOnBackPressedDispatcher$annotations() {
    }

    @Override // O.InterfaceC0070k
    public void addMenuProvider(InterfaceC0076q provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        C0074o c0074o = this.menuHostHelper;
        c0074o.f1276b.add(provider);
        c0074o.f1275a.run();
    }

    @Override // D.l
    public final void addOnConfigurationChangedListener(N.a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onConfigurationChangedListeners.add(listener);
    }

    public final void addOnContextAvailableListener(InterfaceC0274b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        C0273a c0273a = this.contextAwareHelper;
        c0273a.getClass();
        Intrinsics.checkNotNullParameter(listener, "listener");
        o oVar = c0273a.f4198b;
        if (oVar != null) {
            listener.a(oVar);
        }
        c0273a.f4197a.add(listener);
    }

    @Override // C.H
    public final void addOnMultiWindowModeChangedListener(N.a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onMultiWindowModeChangedListeners.add(listener);
    }

    public final void addOnNewIntentListener(N.a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onNewIntentListeners.add(listener);
    }

    @Override // C.I
    public final void addOnPictureInPictureModeChangedListener(N.a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onPictureInPictureModeChangedListeners.add(listener);
    }

    @Override // D.m
    public final void addOnTrimMemoryListener(N.a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onTrimMemoryListeners.add(listener);
    }

    public final void addOnUserLeaveHintListener(Runnable listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onUserLeaveHintListeners.add(listener);
    }

    @Override // d.InterfaceC0301j
    public final AbstractC0300i getActivityResultRegistry() {
        return this.activityResultRegistry;
    }

    @Override // androidx.lifecycle.InterfaceC0200v
    public l0.c getDefaultViewModelCreationExtras() {
        l0.d dVar = new l0.d(0);
        if (getApplication() != null) {
            E2.e eVar = x0.f3440d;
            Application application = getApplication();
            Intrinsics.checkNotNullExpressionValue(application, "application");
            dVar.b(eVar, application);
        }
        dVar.b(q0.f3417a, this);
        dVar.b(q0.f3418b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            dVar.b(q0.f3419c, extras);
        }
        return dVar;
    }

    @Override // androidx.lifecycle.InterfaceC0200v
    public y0 getDefaultViewModelProviderFactory() {
        return (y0) this.defaultViewModelProviderFactory$delegate.getValue();
    }

    public q getFullyDrawnReporter() {
        return (q) this.fullyDrawnReporter$delegate.getValue();
    }

    @Deprecated(message = "Use a {@link androidx.lifecycle.ViewModel} to store non config state.")
    public Object getLastCustomNonConfigurationInstance() {
        i iVar = (i) getLastNonConfigurationInstance();
        if (iVar != null) {
            return iVar.f4116a;
        }
        return null;
    }

    @Override // C.AbstractActivityC0048l, androidx.lifecycle.J
    public androidx.lifecycle.C getLifecycle() {
        return super.getLifecycle();
    }

    @Override // b.D
    public final B getOnBackPressedDispatcher() {
        return (B) this.onBackPressedDispatcher$delegate.getValue();
    }

    @Override // v0.f
    public final C0639d getSavedStateRegistry() {
        return this.savedStateRegistryController.f8636b;
    }

    @Override // androidx.lifecycle.D0
    public C0 getViewModelStore() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this._viewModelStore == null) {
            i iVar = (i) getLastNonConfigurationInstance();
            if (iVar != null) {
                this._viewModelStore = iVar.f4117b;
            }
            if (this._viewModelStore == null) {
                this._viewModelStore = new C0();
            }
        }
        C0 c02 = this._viewModelStore;
        Intrinsics.checkNotNull(c02);
        return c02;
    }

    public void initializeViewTreeOwners() {
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
        q0.m(decorView, this);
        View decorView2 = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView2, "window.decorView");
        Intrinsics.checkNotNullParameter(decorView2, "<this>");
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView3, "window.decorView");
        m3.d.D(decorView3, this);
        View decorView4 = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView4, "window.decorView");
        AbstractC0106b.H(decorView4, this);
        View decorView5 = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView5, "window.decorView");
        Intrinsics.checkNotNullParameter(decorView5, "<this>");
        Intrinsics.checkNotNullParameter(this, "fullyDrawnReporterOwner");
        decorView5.setTag(R.id.report_drawn, this);
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i4, Intent intent) {
        if (this.activityResultRegistry.a(i, i4, intent)) {
            return;
        }
        super.onActivityResult(i, i4, intent);
    }

    @Override // android.app.Activity
    @Deprecated(message = "This method has been deprecated in favor of using the\n      {@link OnBackPressedDispatcher} via {@link #getOnBackPressedDispatcher()}.\n      The OnBackPressedDispatcher controls how back button events are dispatched\n      to one or more {@link OnBackPressedCallback} objects.")
    public void onBackPressed() {
        getOnBackPressedDispatcher().d();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        Iterator<N.a> it = this.onConfigurationChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().a(newConfig);
        }
    }

    @Override // C.AbstractActivityC0048l, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.savedStateRegistryController.b(bundle);
        C0273a c0273a = this.contextAwareHelper;
        c0273a.getClass();
        Intrinsics.checkNotNullParameter(this, "context");
        c0273a.f4198b = this;
        Iterator it = c0273a.f4197a.iterator();
        while (it.hasNext()) {
            ((InterfaceC0274b) it.next()).a(this);
        }
        super.onCreate(bundle);
        int i = k0.f3396a;
        i0.b(this);
        int i4 = this.contentLayoutId;
        if (i4 != 0) {
            setContentView(i4);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        C0074o c0074o = this.menuHostHelper;
        MenuInflater menuInflater = getMenuInflater();
        Iterator it = c0074o.f1276b.iterator();
        while (it.hasNext()) {
            ((C0140c0) ((InterfaceC0076q) it.next())).f3105a.k(menu, menuInflater);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (super.onMenuItemSelected(i, item)) {
            return true;
        }
        if (i == 0) {
            return this.menuHostHelper.a(item);
        }
        return false;
    }

    @Override // android.app.Activity
    @Deprecated(message = "Deprecated in android.app.Activity")
    public void onMultiWindowModeChanged(boolean z3) {
        if (this.dispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<N.a> it = this.onMultiWindowModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().a(new C.n(z3));
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        Iterator<N.a> it = this.onNewIntentListeners.iterator();
        while (it.hasNext()) {
            it.next().a(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        Iterator it = this.menuHostHelper.f1276b.iterator();
        while (it.hasNext()) {
            ((C0140c0) ((InterfaceC0076q) it.next())).f3105a.q(menu);
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    @Deprecated(message = "Deprecated in android.app.Activity")
    public void onPictureInPictureModeChanged(boolean z3) {
        if (this.dispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<N.a> it = this.onPictureInPictureModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().a(new C.J(z3));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        Iterator it = this.menuHostHelper.f1276b.iterator();
        while (it.hasNext()) {
            ((C0140c0) ((InterfaceC0076q) it.next())).f3105a.t(menu);
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        if (this.activityResultRegistry.a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", permissions).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", grantResults))) {
            return;
        }
        super.onRequestPermissionsResult(i, permissions, grantResults);
    }

    @Deprecated(message = "Use a {@link androidx.lifecycle.ViewModel} to store non config state.")
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, b.i] */
    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        i iVar;
        Object onRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        C0 c02 = this._viewModelStore;
        if (c02 == null && (iVar = (i) getLastNonConfigurationInstance()) != null) {
            c02 = iVar.f4117b;
        }
        if (c02 == null && onRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        ?? obj = new Object();
        obj.f4116a = onRetainCustomNonConfigurationInstance;
        obj.f4117b = c02;
        return obj;
    }

    @Override // C.AbstractActivityC0048l, android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        if (getLifecycle() instanceof L) {
            androidx.lifecycle.C lifecycle = getLifecycle();
            Intrinsics.checkNotNull(lifecycle, "null cannot be cast to non-null type androidx.lifecycle.LifecycleRegistry");
            ((L) lifecycle).h(androidx.lifecycle.B.f3282c);
        }
        super.onSaveInstanceState(outState);
        this.savedStateRegistryController.c(outState);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator<N.a> it = this.onTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            it.next().a(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator<Runnable> it = this.onUserLeaveHintListeners.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
    }

    public Context peekAvailableContext() {
        return this.contextAwareHelper.f4198b;
    }

    public final <I, O> AbstractC0294c registerForActivityResult(AbstractC0311a contract, AbstractC0300i registry, InterfaceC0293b callback) {
        Intrinsics.checkNotNullParameter(contract, "contract");
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(callback, "callback");
        return registry.c("activity_rq#" + this.nextLocalRequestCode.getAndIncrement(), this, contract, callback);
    }

    @Override // O.InterfaceC0070k
    public void removeMenuProvider(InterfaceC0076q provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.menuHostHelper.b(provider);
    }

    @Override // D.l
    public final void removeOnConfigurationChangedListener(N.a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onConfigurationChangedListeners.remove(listener);
    }

    public final void removeOnContextAvailableListener(InterfaceC0274b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        C0273a c0273a = this.contextAwareHelper;
        c0273a.getClass();
        Intrinsics.checkNotNullParameter(listener, "listener");
        c0273a.f4197a.remove(listener);
    }

    @Override // C.H
    public final void removeOnMultiWindowModeChangedListener(N.a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onMultiWindowModeChangedListeners.remove(listener);
    }

    public final void removeOnNewIntentListener(N.a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onNewIntentListeners.remove(listener);
    }

    @Override // C.I
    public final void removeOnPictureInPictureModeChangedListener(N.a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onPictureInPictureModeChangedListeners.remove(listener);
    }

    @Override // D.m
    public final void removeOnTrimMemoryListener(N.a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onTrimMemoryListeners.remove(listener);
    }

    public final void removeOnUserLeaveHintListener(Runnable listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onUserLeaveHintListeners.remove(listener);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (AbstractC0105a.F()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            getFullyDrawnReporter().a();
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.app.Activity
    public abstract void setContentView(int i);

    @Override // android.app.Activity
    public void setContentView(View view) {
        initializeViewTreeOwners();
        j jVar = this.reportFullyDrawnExecutor;
        View view2 = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(view2, "window.decorView");
        k kVar = (k) jVar;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(view2, "view");
        if (!kVar.f4120c) {
            kVar.f4120c = true;
            view2.getViewTreeObserver().addOnDrawListener(kVar);
        }
        super.setContentView(view);
    }

    @Override // android.app.Activity
    @Deprecated(message = "This method has been deprecated in favor of using the Activity Result API\n      which brings increased type safety via an {@link ActivityResultContract} and the prebuilt\n      contracts for common intents available in\n      {@link androidx.activity.result.contract.ActivityResultContracts}, provides hooks for\n      testing, and allow receiving results in separate, testable classes independent from your\n      activity. Use\n      {@link #registerForActivityResult(ActivityResultContract, ActivityResultCallback)}\n      passing in a {@link StartActivityForResult} object for the {@link ActivityResultContract}.")
    public void startActivityForResult(Intent intent, int i) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    @Deprecated(message = "This method has been deprecated in favor of using the Activity Result API\n      which brings increased type safety via an {@link ActivityResultContract} and the prebuilt\n      contracts for common intents available in\n      {@link androidx.activity.result.contract.ActivityResultContracts}, provides hooks for\n      testing, and allow receiving results in separate, testable classes independent from your\n      activity. Use\n      {@link #registerForActivityResult(ActivityResultContract, ActivityResultCallback)}\n      passing in a {@link StartIntentSenderForResult} object for the\n      {@link ActivityResultContract}.")
    public void startIntentSenderForResult(IntentSender intent, int i, Intent intent2, int i4, int i5, int i6) throws IntentSender.SendIntentException {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.startIntentSenderForResult(intent, i, intent2, i4, i5, i6);
    }

    @Override // android.app.Activity
    @Deprecated(message = "This method has been deprecated in favor of using the Activity Result API\n      which brings increased type safety via an {@link ActivityResultContract} and the prebuilt\n      contracts for common intents available in\n      {@link androidx.activity.result.contract.ActivityResultContracts}, provides hooks for\n      testing, and allow receiving results in separate, testable classes independent from your\n      activity. Use\n      {@link #registerForActivityResult(ActivityResultContract, ActivityResultCallback)}\n      passing in a {@link StartActivityForResult} object for the {@link ActivityResultContract}.")
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    @Deprecated(message = "This method has been deprecated in favor of using the Activity Result API\n      which brings increased type safety via an {@link ActivityResultContract} and the prebuilt\n      contracts for common intents available in\n      {@link androidx.activity.result.contract.ActivityResultContracts}, provides hooks for\n      testing, and allow receiving results in separate, testable classes independent from your\n      activity. Use\n      {@link #registerForActivityResult(ActivityResultContract, ActivityResultCallback)}\n      passing in a {@link StartIntentSenderForResult} object for the\n      {@link ActivityResultContract}.")
    public void startIntentSenderForResult(IntentSender intent, int i, Intent intent2, int i4, int i5, int i6, Bundle bundle) throws IntentSender.SendIntentException {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.startIntentSenderForResult(intent, i, intent2, i4, i5, i6, bundle);
    }

    public final <I, O> AbstractC0294c registerForActivityResult(AbstractC0311a contract, InterfaceC0293b callback) {
        Intrinsics.checkNotNullParameter(contract, "contract");
        Intrinsics.checkNotNullParameter(callback, "callback");
        return registerForActivityResult(contract, this.activityResultRegistry, callback);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z3, Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        this.dispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z3, newConfig);
            this.dispatchingOnMultiWindowModeChanged = false;
            Iterator<N.a> it = this.onMultiWindowModeChangedListeners.iterator();
            while (it.hasNext()) {
                N.a next = it.next();
                Intrinsics.checkNotNullParameter(newConfig, "newConfig");
                next.a(new C.n(z3));
            }
        } catch (Throwable th) {
            this.dispatchingOnMultiWindowModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z3, Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        this.dispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z3, newConfig);
            this.dispatchingOnPictureInPictureModeChanged = false;
            Iterator<N.a> it = this.onPictureInPictureModeChangedListeners.iterator();
            while (it.hasNext()) {
                N.a next = it.next();
                Intrinsics.checkNotNullParameter(newConfig, "newConfig");
                next.a(new C.J(z3));
            }
        } catch (Throwable th) {
            this.dispatchingOnPictureInPictureModeChanged = false;
            throw th;
        }
    }

    public void addMenuProvider(InterfaceC0076q provider, J owner) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(owner, "owner");
        C0074o c0074o = this.menuHostHelper;
        c0074o.f1276b.add(provider);
        c0074o.f1275a.run();
        androidx.lifecycle.C lifecycle = owner.getLifecycle();
        HashMap hashMap = c0074o.f1277c;
        C0073n c0073n = (C0073n) hashMap.remove(provider);
        if (c0073n != null) {
            c0073n.f1273a.c(c0073n.f1274b);
            c0073n.f1274b = null;
        }
        hashMap.put(provider, new C0073n(lifecycle, new C0072m(0, c0074o, provider)));
    }

    @SuppressLint({"LambdaLast"})
    public void addMenuProvider(final InterfaceC0076q provider, J owner, final androidx.lifecycle.B state) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(state, "state");
        final C0074o c0074o = this.menuHostHelper;
        c0074o.getClass();
        androidx.lifecycle.C lifecycle = owner.getLifecycle();
        HashMap hashMap = c0074o.f1277c;
        C0073n c0073n = (C0073n) hashMap.remove(provider);
        if (c0073n != null) {
            c0073n.f1273a.c(c0073n.f1274b);
            c0073n.f1274b = null;
        }
        hashMap.put(provider, new C0073n(lifecycle, new androidx.lifecycle.H() { // from class: O.l
            @Override // androidx.lifecycle.H
            public final void onStateChanged(androidx.lifecycle.J j4, androidx.lifecycle.A a2) {
                C0074o c0074o2 = C0074o.this;
                c0074o2.getClass();
                androidx.lifecycle.A.Companion.getClass();
                androidx.lifecycle.B b4 = state;
                androidx.lifecycle.A c4 = C0203y.c(b4);
                Runnable runnable = c0074o2.f1275a;
                CopyOnWriteArrayList copyOnWriteArrayList = c0074o2.f1276b;
                InterfaceC0076q interfaceC0076q = provider;
                if (a2 == c4) {
                    copyOnWriteArrayList.add(interfaceC0076q);
                    runnable.run();
                } else if (a2 == androidx.lifecycle.A.ON_DESTROY) {
                    c0074o2.b(interfaceC0076q);
                } else if (a2 == C0203y.a(b4)) {
                    copyOnWriteArrayList.remove(interfaceC0076q);
                    runnable.run();
                }
            }
        }));
    }

    public o(int i) {
        this();
        this.contentLayoutId = i;
    }
}
