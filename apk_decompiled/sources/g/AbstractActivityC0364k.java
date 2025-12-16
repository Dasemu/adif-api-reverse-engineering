package g;

import C.AbstractC0044h;
import a.AbstractC0106b;
import android.R;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.q0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import f0.C0338b;
import k.AbstractC0405b;
import k.C0407d;
import k.C0412i;
import k.InterfaceC0404a;
import kotlin.jvm.internal.Intrinsics;
import m.C0487t;
import m.E0;
import m.X0;

/* renamed from: g.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractActivityC0364k extends androidx.fragment.app.P implements InterfaceC0365l, C.L {
    private static final String DELEGATE_TAG = "androidx:appcompat";
    private r mDelegate;
    private Resources mResources;

    public AbstractActivityC0364k() {
        getSavedStateRegistry().c(DELEGATE_TAG, new C0363j(this));
        addOnContextAvailableListener(new com.adif.elcanomovil.main.q(this, 2));
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        f();
        LayoutInflaterFactory2C0351E layoutInflaterFactory2C0351E = (LayoutInflaterFactory2C0351E) getDelegate();
        layoutInflaterFactory2C0351E.x();
        ((ViewGroup) layoutInflaterFactory2C0351E.f6495A.findViewById(R.id.content)).addView(view, layoutParams);
        layoutInflaterFactory2C0351E.f6529m.a(layoutInflaterFactory2C0351E.f6528l.getCallback());
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        LayoutInflaterFactory2C0351E layoutInflaterFactory2C0351E = (LayoutInflaterFactory2C0351E) getDelegate();
        layoutInflaterFactory2C0351E.f6508O = true;
        int i = layoutInflaterFactory2C0351E.f6512S;
        if (i == -100) {
            i = r.f6659b;
        }
        int D3 = layoutInflaterFactory2C0351E.D(context, i);
        if (r.d(context) && r.d(context)) {
            if (Build.VERSION.SDK_INT < 33) {
                synchronized (r.i) {
                    try {
                        K.i iVar = r.f6660c;
                        if (iVar == null) {
                            if (r.f6661d == null) {
                                r.f6661d = K.i.a(AbstractC0044h.e(context));
                            }
                            if (!r.f6661d.f972a.f973a.isEmpty()) {
                                r.f6660c = r.f6661d;
                            }
                        } else if (!iVar.equals(r.f6661d)) {
                            K.i iVar2 = r.f6660c;
                            r.f6661d = iVar2;
                            AbstractC0044h.d(context, iVar2.f972a.f973a.toLanguageTags());
                        }
                    } finally {
                    }
                }
            } else if (!r.f6663f) {
                r.f6658a.execute(new RunnableC0366m(context, 0));
            }
        }
        K.i q4 = LayoutInflaterFactory2C0351E.q(context);
        Configuration configuration = null;
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(LayoutInflaterFactory2C0351E.u(context, D3, q4, null, false));
            } catch (IllegalStateException unused) {
            }
            super.attachBaseContext(context);
        }
        if (context instanceof C0407d) {
            try {
                ((C0407d) context).a(LayoutInflaterFactory2C0351E.u(context, D3, q4, null, false));
            } catch (IllegalStateException unused2) {
            }
            super.attachBaseContext(context);
        }
        if (LayoutInflaterFactory2C0351E.f6494j0) {
            Configuration configuration2 = new Configuration();
            configuration2.uiMode = -1;
            configuration2.fontScale = BitmapDescriptorFactory.HUE_RED;
            Configuration configuration3 = context.createConfigurationContext(configuration2).getResources().getConfiguration();
            Configuration configuration4 = context.getResources().getConfiguration();
            configuration3.uiMode = configuration4.uiMode;
            if (!configuration3.equals(configuration4)) {
                configuration = new Configuration();
                configuration.fontScale = BitmapDescriptorFactory.HUE_RED;
                if (configuration3.diff(configuration4) != 0) {
                    float f2 = configuration3.fontScale;
                    float f4 = configuration4.fontScale;
                    if (f2 != f4) {
                        configuration.fontScale = f4;
                    }
                    int i4 = configuration3.mcc;
                    int i5 = configuration4.mcc;
                    if (i4 != i5) {
                        configuration.mcc = i5;
                    }
                    int i6 = configuration3.mnc;
                    int i7 = configuration4.mnc;
                    if (i6 != i7) {
                        configuration.mnc = i7;
                    }
                    w.a(configuration3, configuration4, configuration);
                    int i8 = configuration3.touchscreen;
                    int i9 = configuration4.touchscreen;
                    if (i8 != i9) {
                        configuration.touchscreen = i9;
                    }
                    int i10 = configuration3.keyboard;
                    int i11 = configuration4.keyboard;
                    if (i10 != i11) {
                        configuration.keyboard = i11;
                    }
                    int i12 = configuration3.keyboardHidden;
                    int i13 = configuration4.keyboardHidden;
                    if (i12 != i13) {
                        configuration.keyboardHidden = i13;
                    }
                    int i14 = configuration3.navigation;
                    int i15 = configuration4.navigation;
                    if (i14 != i15) {
                        configuration.navigation = i15;
                    }
                    int i16 = configuration3.navigationHidden;
                    int i17 = configuration4.navigationHidden;
                    if (i16 != i17) {
                        configuration.navigationHidden = i17;
                    }
                    int i18 = configuration3.orientation;
                    int i19 = configuration4.orientation;
                    if (i18 != i19) {
                        configuration.orientation = i19;
                    }
                    int i20 = configuration3.screenLayout & 15;
                    int i21 = configuration4.screenLayout & 15;
                    if (i20 != i21) {
                        configuration.screenLayout |= i21;
                    }
                    int i22 = configuration3.screenLayout & 192;
                    int i23 = configuration4.screenLayout & 192;
                    if (i22 != i23) {
                        configuration.screenLayout |= i23;
                    }
                    int i24 = configuration3.screenLayout & 48;
                    int i25 = configuration4.screenLayout & 48;
                    if (i24 != i25) {
                        configuration.screenLayout |= i25;
                    }
                    int i26 = configuration3.screenLayout & 768;
                    int i27 = configuration4.screenLayout & 768;
                    if (i26 != i27) {
                        configuration.screenLayout |= i27;
                    }
                    int i28 = configuration3.colorMode & 3;
                    int i29 = configuration4.colorMode & 3;
                    if (i28 != i29) {
                        configuration.colorMode |= i29;
                    }
                    int i30 = configuration3.colorMode & 12;
                    int i31 = configuration4.colorMode & 12;
                    if (i30 != i31) {
                        configuration.colorMode |= i31;
                    }
                    int i32 = configuration3.uiMode & 15;
                    int i33 = configuration4.uiMode & 15;
                    if (i32 != i33) {
                        configuration.uiMode |= i33;
                    }
                    int i34 = configuration3.uiMode & 48;
                    int i35 = configuration4.uiMode & 48;
                    if (i34 != i35) {
                        configuration.uiMode |= i35;
                    }
                    int i36 = configuration3.screenWidthDp;
                    int i37 = configuration4.screenWidthDp;
                    if (i36 != i37) {
                        configuration.screenWidthDp = i37;
                    }
                    int i38 = configuration3.screenHeightDp;
                    int i39 = configuration4.screenHeightDp;
                    if (i38 != i39) {
                        configuration.screenHeightDp = i39;
                    }
                    int i40 = configuration3.smallestScreenWidthDp;
                    int i41 = configuration4.smallestScreenWidthDp;
                    if (i40 != i41) {
                        configuration.smallestScreenWidthDp = i41;
                    }
                    int i42 = configuration3.densityDpi;
                    int i43 = configuration4.densityDpi;
                    if (i42 != i43) {
                        configuration.densityDpi = i43;
                    }
                }
            }
            Configuration u3 = LayoutInflaterFactory2C0351E.u(context, D3, q4, configuration, true);
            C0407d c0407d = new C0407d(context, 2132017801);
            c0407d.a(u3);
            try {
                if (context.getTheme() != null) {
                    F.p.a(c0407d.getTheme());
                }
            } catch (NullPointerException unused3) {
            }
            context = c0407d;
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        AbstractC0354a supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.a()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // C.AbstractActivityC0048l, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        AbstractC0354a supportActionBar = getSupportActionBar();
        if (keyCode == 82 && supportActionBar != null && supportActionBar.j(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void f() {
        q0.m(getWindow().getDecorView(), this);
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullParameter(decorView, "<this>");
        decorView.setTag(com.adif.elcanomovil.R.id.view_tree_view_model_store_owner, this);
        m3.d.D(getWindow().getDecorView(), this);
        AbstractC0106b.H(getWindow().getDecorView(), this);
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i) {
        LayoutInflaterFactory2C0351E layoutInflaterFactory2C0351E = (LayoutInflaterFactory2C0351E) getDelegate();
        layoutInflaterFactory2C0351E.x();
        return (T) layoutInflaterFactory2C0351E.f6528l.findViewById(i);
    }

    public r getDelegate() {
        if (this.mDelegate == null) {
            ExecutorC0369p executorC0369p = r.f6658a;
            this.mDelegate = new LayoutInflaterFactory2C0351E(this, null, this, this);
        }
        return this.mDelegate;
    }

    public InterfaceC0355b getDrawerToggleDelegate() {
        ((LayoutInflaterFactory2C0351E) getDelegate()).getClass();
        return new C0338b(4);
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        LayoutInflaterFactory2C0351E layoutInflaterFactory2C0351E = (LayoutInflaterFactory2C0351E) getDelegate();
        if (layoutInflaterFactory2C0351E.p == null) {
            layoutInflaterFactory2C0351E.B();
            AbstractC0354a abstractC0354a = layoutInflaterFactory2C0351E.f6531o;
            layoutInflaterFactory2C0351E.p = new C0412i(abstractC0354a != null ? abstractC0354a.e() : layoutInflaterFactory2C0351E.f6527k);
        }
        return layoutInflaterFactory2C0351E.p;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        Resources resources = this.mResources;
        if (resources == null) {
            int i = X0.f7643a;
        }
        return resources == null ? super.getResources() : resources;
    }

    public AbstractC0354a getSupportActionBar() {
        LayoutInflaterFactory2C0351E layoutInflaterFactory2C0351E = (LayoutInflaterFactory2C0351E) getDelegate();
        layoutInflaterFactory2C0351E.B();
        return layoutInflaterFactory2C0351E.f6531o;
    }

    @Override // C.L
    public Intent getSupportParentActivityIntent() {
        return AbstractC0044h.b(this);
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        getDelegate().b();
    }

    @Override // b.o, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        LayoutInflaterFactory2C0351E layoutInflaterFactory2C0351E = (LayoutInflaterFactory2C0351E) getDelegate();
        if (layoutInflaterFactory2C0351E.f6500F && layoutInflaterFactory2C0351E.f6541z) {
            layoutInflaterFactory2C0351E.B();
            AbstractC0354a abstractC0354a = layoutInflaterFactory2C0351E.f6531o;
            if (abstractC0354a != null) {
                abstractC0354a.g();
            }
        }
        C0487t a2 = C0487t.a();
        Context context = layoutInflaterFactory2C0351E.f6527k;
        synchronized (a2) {
            E0 e02 = a2.f7745a;
            synchronized (e02) {
                s.g gVar = (s.g) e02.f7514b.get(context);
                if (gVar != null) {
                    gVar.a();
                }
            }
        }
        layoutInflaterFactory2C0351E.f6511R = new Configuration(layoutInflaterFactory2C0351E.f6527k.getResources().getConfiguration());
        layoutInflaterFactory2C0351E.o(false, false);
        if (this.mResources != null) {
            this.mResources.updateConfiguration(super.getResources().getConfiguration(), super.getResources().getDisplayMetrics());
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        onSupportContentChanged();
    }

    public void onCreateSupportNavigateUpTaskStack(C.M m4) {
        m4.getClass();
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            supportParentActivityIntent = AbstractC0044h.b(this);
        }
        if (supportParentActivityIntent != null) {
            ComponentName component = supportParentActivityIntent.getComponent();
            if (component == null) {
                component = supportParentActivityIntent.resolveActivity(m4.f234b.getPackageManager());
            }
            m4.a(component);
            m4.f233a.add(supportParentActivityIntent);
        }
    }

    @Override // androidx.fragment.app.P, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        getDelegate().f();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return super.onKeyDown(i, keyEvent);
    }

    public void onLocalesChanged(K.i iVar) {
    }

    @Override // androidx.fragment.app.P, b.o, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        AbstractC0354a supportActionBar = getSupportActionBar();
        if (menuItem.getItemId() != 16908332 || supportActionBar == null || (supportActionBar.d() & 4) == 0) {
            return false;
        }
        return onSupportNavigateUp();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    public void onNightModeChanged(int i) {
    }

    @Override // b.o, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((LayoutInflaterFactory2C0351E) getDelegate()).x();
    }

    @Override // androidx.fragment.app.P, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        LayoutInflaterFactory2C0351E layoutInflaterFactory2C0351E = (LayoutInflaterFactory2C0351E) getDelegate();
        layoutInflaterFactory2C0351E.B();
        AbstractC0354a abstractC0354a = layoutInflaterFactory2C0351E.f6531o;
        if (abstractC0354a != null) {
            abstractC0354a.m(true);
        }
    }

    public void onPrepareSupportNavigateUpTaskStack(C.M m4) {
    }

    @Override // androidx.fragment.app.P, android.app.Activity
    public void onStart() {
        super.onStart();
        ((LayoutInflaterFactory2C0351E) getDelegate()).o(true, false);
    }

    @Override // androidx.fragment.app.P, android.app.Activity
    public void onStop() {
        super.onStop();
        LayoutInflaterFactory2C0351E layoutInflaterFactory2C0351E = (LayoutInflaterFactory2C0351E) getDelegate();
        layoutInflaterFactory2C0351E.B();
        AbstractC0354a abstractC0354a = layoutInflaterFactory2C0351E.f6531o;
        if (abstractC0354a != null) {
            abstractC0354a.m(false);
        }
    }

    @Override // g.InterfaceC0365l
    public void onSupportActionModeFinished(AbstractC0405b abstractC0405b) {
    }

    @Override // g.InterfaceC0365l
    public void onSupportActionModeStarted(AbstractC0405b abstractC0405b) {
    }

    @Deprecated
    public void onSupportContentChanged() {
    }

    public boolean onSupportNavigateUp() {
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            return false;
        }
        if (!supportShouldUpRecreateTask(supportParentActivityIntent)) {
            supportNavigateUpTo(supportParentActivityIntent);
            return true;
        }
        C.M m4 = new C.M(this);
        onCreateSupportNavigateUpTaskStack(m4);
        onPrepareSupportNavigateUpTaskStack(m4);
        m4.b();
        try {
            finishAffinity();
            return true;
        } catch (IllegalStateException unused) {
            finish();
            return true;
        }
    }

    @Override // android.app.Activity
    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        getDelegate().m(charSequence);
    }

    @Override // g.InterfaceC0365l
    public AbstractC0405b onWindowStartingSupportActionMode(InterfaceC0404a interfaceC0404a) {
        return null;
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        AbstractC0354a supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.k()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // b.o, android.app.Activity
    public void setContentView(int i) {
        f();
        getDelegate().j(i);
    }

    public void setSupportActionBar(Toolbar toolbar) {
        LayoutInflaterFactory2C0351E layoutInflaterFactory2C0351E = (LayoutInflaterFactory2C0351E) getDelegate();
        if (layoutInflaterFactory2C0351E.f6526j instanceof Activity) {
            layoutInflaterFactory2C0351E.B();
            AbstractC0354a abstractC0354a = layoutInflaterFactory2C0351E.f6531o;
            if (abstractC0354a instanceof T) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            layoutInflaterFactory2C0351E.p = null;
            if (abstractC0354a != null) {
                abstractC0354a.h();
            }
            layoutInflaterFactory2C0351E.f6531o = null;
            if (toolbar != null) {
                Object obj = layoutInflaterFactory2C0351E.f6526j;
                N n4 = new N(toolbar, obj instanceof Activity ? ((Activity) obj).getTitle() : layoutInflaterFactory2C0351E.f6532q, layoutInflaterFactory2C0351E.f6529m);
                layoutInflaterFactory2C0351E.f6531o = n4;
                layoutInflaterFactory2C0351E.f6529m.f6672b = n4.f6558c;
                toolbar.setBackInvokedCallbackEnabled(true);
            } else {
                layoutInflaterFactory2C0351E.f6529m.f6672b = null;
            }
            layoutInflaterFactory2C0351E.b();
        }
    }

    @Deprecated
    public void setSupportProgress(int i) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminate(boolean z3) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminateVisibility(boolean z3) {
    }

    @Deprecated
    public void setSupportProgressBarVisibility(boolean z3) {
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        super.setTheme(i);
        ((LayoutInflaterFactory2C0351E) getDelegate()).f6513T = i;
    }

    public AbstractC0405b startSupportActionMode(InterfaceC0404a interfaceC0404a) {
        return getDelegate().n(interfaceC0404a);
    }

    public void supportInvalidateOptionsMenu() {
        getDelegate().b();
    }

    public void supportNavigateUpTo(Intent intent) {
        navigateUpTo(intent);
    }

    public boolean supportRequestWindowFeature(int i) {
        return getDelegate().h(i);
    }

    public boolean supportShouldUpRecreateTask(Intent intent) {
        return shouldUpRecreateTask(intent);
    }

    @Override // b.o, android.app.Activity
    public void setContentView(View view) {
        f();
        getDelegate().k(view);
    }

    public AbstractActivityC0364k(int i) {
        super(i);
        getSavedStateRegistry().c(DELEGATE_TAG, new C0363j(this));
        addOnContextAvailableListener(new com.adif.elcanomovil.main.q(this, 2));
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        f();
        getDelegate().l(view, layoutParams);
    }
}
