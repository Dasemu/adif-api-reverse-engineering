package androidx.fragment.app;

import C.AbstractC0037a;
import C.InterfaceC0042f;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import c.InterfaceC0274b;
import g.AbstractActivityC0364k;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import n0.AbstractC0511a;

/* loaded from: classes.dex */
public abstract class P extends b.o implements InterfaceC0042f {
    static final String LIFECYCLE_TAG = "android:support:lifecycle";
    boolean mCreated;
    final androidx.lifecycle.L mFragmentLifecycleRegistry;
    final U mFragments;
    boolean mResumed;
    boolean mStopped;

    public P() {
        this.mFragments = new U(new O((AbstractActivityC0364k) this));
        this.mFragmentLifecycleRegistry = new androidx.lifecycle.L(this);
        this.mStopped = true;
        d();
    }

    public static boolean e(AbstractC0158l0 abstractC0158l0) {
        androidx.lifecycle.B b4 = androidx.lifecycle.B.f3282c;
        boolean z3 = false;
        for (K k4 : abstractC0158l0.f3160c.f()) {
            if (k4 != null) {
                if (k4.getHost() != null) {
                    z3 |= e(k4.getChildFragmentManager());
                }
                F0 f02 = k4.mViewLifecycleOwner;
                androidx.lifecycle.B b5 = androidx.lifecycle.B.f3283d;
                if (f02 != null) {
                    f02.b();
                    if (f02.f3001e.f3298d.a(b5)) {
                        k4.mViewLifecycleOwner.f3001e.h(b4);
                        z3 = true;
                    }
                }
                if (k4.mLifecycleRegistry.f3298d.a(b5)) {
                    k4.mLifecycleRegistry.h(b4);
                    z3 = true;
                }
            }
        }
        return z3;
    }

    public final void d() {
        getSavedStateRegistry().c(LIFECYCLE_TAG, new L(this, 0));
        final int i = 0;
        addOnConfigurationChangedListener(new N.a(this) { // from class: androidx.fragment.app.M

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ P f3053b;

            {
                this.f3053b = this;
            }

            @Override // N.a
            public final void a(Object obj) {
                switch (i) {
                    case 0:
                        this.f3053b.mFragments.a();
                        return;
                    default:
                        this.f3053b.mFragments.a();
                        return;
                }
            }
        });
        final int i4 = 1;
        addOnNewIntentListener(new N.a(this) { // from class: androidx.fragment.app.M

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ P f3053b;

            {
                this.f3053b = this;
            }

            @Override // N.a
            public final void a(Object obj) {
                switch (i4) {
                    case 0:
                        this.f3053b.mFragments.a();
                        return;
                    default:
                        this.f3053b.mFragments.a();
                        return;
                }
            }
        });
        addOnContextAvailableListener(new InterfaceC0274b() { // from class: androidx.fragment.app.N
            @Override // c.InterfaceC0274b
            public final void a(b.o oVar) {
                O o4 = P.this.mFragments.f3073a;
                o4.f3077d.b(o4, o4, null);
            }
        });
    }

    public final View dispatchFragmentsOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return this.mFragments.f3073a.f3077d.f3163f.onCreateView(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (shouldDumpInternalState(strArr)) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            String str2 = str + "  ";
            printWriter.print(str2);
            printWriter.print("mCreated=");
            printWriter.print(this.mCreated);
            printWriter.print(" mResumed=");
            printWriter.print(this.mResumed);
            printWriter.print(" mStopped=");
            printWriter.print(this.mStopped);
            if (getApplication() != null) {
                AbstractC0511a.a(this).b(str2, printWriter);
            }
            this.mFragments.f3073a.f3077d.w(str, fileDescriptor, printWriter, strArr);
        }
    }

    public AbstractC0158l0 getSupportFragmentManager() {
        return this.mFragments.f3073a.f3077d;
    }

    @Deprecated
    public AbstractC0511a getSupportLoaderManager() {
        return AbstractC0511a.a(this);
    }

    public void markFragmentsCreated() {
        do {
        } while (e(getSupportFragmentManager()));
    }

    @Override // b.o, android.app.Activity
    public void onActivityResult(int i, int i4, Intent intent) {
        this.mFragments.a();
        super.onActivityResult(i, i4, intent);
    }

    @Deprecated
    public void onAttachFragment(K k4) {
    }

    @Override // b.o, C.AbstractActivityC0048l, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.f(androidx.lifecycle.A.ON_CREATE);
        C0160m0 c0160m0 = this.mFragments.f3073a.f3077d;
        c0160m0.f3150H = false;
        c0160m0.f3151I = false;
        c0160m0.f3156O.f3207f = false;
        c0160m0.u(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.mFragments.f3073a.f3077d.l();
        this.mFragmentLifecycleRegistry.f(androidx.lifecycle.A.ON_DESTROY);
    }

    @Override // b.o, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return this.mFragments.f3073a.f3077d.j(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.f3073a.f3077d.u(5);
        this.mFragmentLifecycleRegistry.f(androidx.lifecycle.A.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @Override // b.o, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.mFragments.a();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        this.mFragments.a();
        super.onResume();
        this.mResumed = true;
        this.mFragments.f3073a.f3077d.A(true);
    }

    public void onResumeFragments() {
        this.mFragmentLifecycleRegistry.f(androidx.lifecycle.A.ON_RESUME);
        C0160m0 c0160m0 = this.mFragments.f3073a.f3077d;
        c0160m0.f3150H = false;
        c0160m0.f3151I = false;
        c0160m0.f3156O.f3207f = false;
        c0160m0.u(7);
    }

    @Override // android.app.Activity
    public void onStart() {
        this.mFragments.a();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            C0160m0 c0160m0 = this.mFragments.f3073a.f3077d;
            c0160m0.f3150H = false;
            c0160m0.f3151I = false;
            c0160m0.f3156O.f3207f = false;
            c0160m0.u(4);
        }
        this.mFragments.f3073a.f3077d.A(true);
        this.mFragmentLifecycleRegistry.f(androidx.lifecycle.A.ON_START);
        C0160m0 c0160m02 = this.mFragments.f3073a.f3077d;
        c0160m02.f3150H = false;
        c0160m02.f3151I = false;
        c0160m02.f3156O.f3207f = false;
        c0160m02.u(5);
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.mFragments.a();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        C0160m0 c0160m0 = this.mFragments.f3073a.f3077d;
        c0160m0.f3151I = true;
        c0160m0.f3156O.f3207f = true;
        c0160m0.u(4);
        this.mFragmentLifecycleRegistry.f(androidx.lifecycle.A.ON_STOP);
    }

    public void setEnterSharedElementCallback(C.K k4) {
        AbstractC0037a.c(this, null);
    }

    public void setExitSharedElementCallback(C.K k4) {
        AbstractC0037a.d(this, null);
    }

    public void startActivityFromFragment(K k4, Intent intent, int i, Bundle bundle) {
        if (i == -1) {
            startActivityForResult(intent, -1, bundle);
        } else {
            k4.startActivityForResult(intent, i, bundle);
        }
    }

    @Deprecated
    public void startIntentSenderFromFragment(K k4, IntentSender intentSender, int i, Intent intent, int i4, int i5, int i6, Bundle bundle) throws IntentSender.SendIntentException {
        if (i == -1) {
            startIntentSenderForResult(intentSender, i, intent, i4, i5, i6, bundle);
        } else {
            k4.startIntentSenderForResult(intentSender, i, intent, i4, i5, i6, bundle);
        }
    }

    public void supportFinishAfterTransition() {
        AbstractC0037a.a(this);
    }

    public void supportPostponeEnterTransition() {
        AbstractC0037a.b(this);
    }

    public void supportStartPostponedEnterTransition() {
        AbstractC0037a.e(this);
    }

    @Override // C.InterfaceC0042f
    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i) {
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    public void startActivityFromFragment(K k4, Intent intent, int i) {
        startActivityFromFragment(k4, intent, i, (Bundle) null);
    }

    public P(int i) {
        super(i);
        this.mFragments = new U(new O((AbstractActivityC0364k) this));
        this.mFragmentLifecycleRegistry = new androidx.lifecycle.L(this);
        this.mStopped = true;
        d();
    }
}
