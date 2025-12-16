package dagger.hilt.android.internal.managers;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.K;
import androidx.lifecycle.A;
import androidx.lifecycle.H;
import androidx.lifecycle.J;
import dagger.hilt.EntryPoint;
import dagger.hilt.EntryPoints;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.components.FragmentComponent;
import dagger.hilt.android.internal.Contexts;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.internal.GeneratedComponentManager;
import dagger.hilt.internal.Preconditions;

/* loaded from: classes3.dex */
public final class ViewComponentManager implements GeneratedComponentManager<Object> {
    private volatile Object component;
    private final Object componentLock = new Object();
    private final boolean hasFragmentBindings;
    private final View view;

    @EntryPoint
    @InstallIn({ActivityComponent.class})
    /* loaded from: classes3.dex */
    public interface ViewComponentBuilderEntryPoint {
        ViewComponentBuilder viewComponentBuilder();
    }

    @EntryPoint
    @InstallIn({FragmentComponent.class})
    /* loaded from: classes3.dex */
    public interface ViewWithFragmentComponentBuilderEntryPoint {
        ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder();
    }

    public ViewComponentManager(View view, boolean z3) {
        this.view = view;
        this.hasFragmentBindings = z3;
    }

    private Object createComponent() {
        GeneratedComponentManager<?> parentComponentManager = getParentComponentManager(false);
        return this.hasFragmentBindings ? ((ViewWithFragmentComponentBuilderEntryPoint) EntryPoints.get(parentComponentManager, ViewWithFragmentComponentBuilderEntryPoint.class)).viewWithFragmentComponentBuilder().view(this.view).build() : ((ViewComponentBuilderEntryPoint) EntryPoints.get(parentComponentManager, ViewComponentBuilderEntryPoint.class)).viewComponentBuilder().view(this.view).build();
    }

    private GeneratedComponentManager<?> getParentComponentManager(boolean z3) {
        if (this.hasFragmentBindings) {
            Context parentContext = getParentContext(FragmentContextWrapper.class, z3);
            if (parentContext instanceof FragmentContextWrapper) {
                return (GeneratedComponentManager) ((FragmentContextWrapper) parentContext).getFragment();
            }
            if (z3) {
                return null;
            }
            Preconditions.checkState(!(r5 instanceof GeneratedComponentManager), "%s, @WithFragmentBindings Hilt view must be attached to an @AndroidEntryPoint Fragment. Was attached to context %s", this.view.getClass(), getParentContext(GeneratedComponentManager.class, z3).getClass().getName());
        } else {
            Object parentContext2 = getParentContext(GeneratedComponentManager.class, z3);
            if (parentContext2 instanceof GeneratedComponentManager) {
                return (GeneratedComponentManager) parentContext2;
            }
            if (z3) {
                return null;
            }
        }
        throw new IllegalStateException(this.view.getClass() + ", Hilt view must be attached to an @AndroidEntryPoint Fragment or Activity.");
    }

    private Context getParentContext(Class<?> cls, boolean z3) {
        Context unwrap = unwrap(this.view.getContext(), cls);
        if (unwrap != Contexts.getApplication(unwrap.getApplicationContext())) {
            return unwrap;
        }
        Preconditions.checkState(z3, "%s, Hilt view cannot be created using the application context. Use a Hilt Fragment or Activity context.", this.view.getClass());
        return null;
    }

    private static Context unwrap(Context context, Class<?> cls) {
        while ((context instanceof ContextWrapper) && !cls.isInstance(context)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return context;
    }

    @Override // dagger.hilt.internal.GeneratedComponentManager
    public Object generatedComponent() {
        if (this.component == null) {
            synchronized (this.componentLock) {
                try {
                    if (this.component == null) {
                        this.component = createComponent();
                    }
                } finally {
                }
            }
        }
        return this.component;
    }

    public GeneratedComponentManager<?> maybeGetParentComponentManager() {
        return getParentComponentManager(true);
    }

    /* loaded from: classes3.dex */
    public static final class FragmentContextWrapper extends ContextWrapper {
        private LayoutInflater baseInflater;
        private K fragment;
        private final H fragmentLifecycleObserver;
        private LayoutInflater inflater;

        public FragmentContextWrapper(Context context, K k4) {
            super((Context) Preconditions.checkNotNull(context));
            H h = new H() { // from class: dagger.hilt.android.internal.managers.ViewComponentManager.FragmentContextWrapper.1
                @Override // androidx.lifecycle.H
                public void onStateChanged(J j4, A a2) {
                    if (a2 == A.ON_DESTROY) {
                        FragmentContextWrapper.this.fragment = null;
                        FragmentContextWrapper.this.baseInflater = null;
                        FragmentContextWrapper.this.inflater = null;
                    }
                }
            };
            this.fragmentLifecycleObserver = h;
            this.baseInflater = null;
            K k5 = (K) Preconditions.checkNotNull(k4);
            this.fragment = k5;
            k5.getLifecycle().a(h);
        }

        public K getFragment() {
            Preconditions.checkNotNull(this.fragment, "The fragment has already been destroyed.");
            return this.fragment;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public Object getSystemService(String str) {
            if (!"layout_inflater".equals(str)) {
                return getBaseContext().getSystemService(str);
            }
            if (this.inflater == null) {
                if (this.baseInflater == null) {
                    this.baseInflater = (LayoutInflater) getBaseContext().getSystemService("layout_inflater");
                }
                this.inflater = this.baseInflater.cloneInContext(this);
            }
            return this.inflater;
        }

        public FragmentContextWrapper(LayoutInflater layoutInflater, K k4) {
            super((Context) Preconditions.checkNotNull(((LayoutInflater) Preconditions.checkNotNull(layoutInflater)).getContext()));
            H h = new H() { // from class: dagger.hilt.android.internal.managers.ViewComponentManager.FragmentContextWrapper.1
                @Override // androidx.lifecycle.H
                public void onStateChanged(J j4, A a2) {
                    if (a2 == A.ON_DESTROY) {
                        FragmentContextWrapper.this.fragment = null;
                        FragmentContextWrapper.this.baseInflater = null;
                        FragmentContextWrapper.this.inflater = null;
                    }
                }
            };
            this.fragmentLifecycleObserver = h;
            this.baseInflater = layoutInflater;
            K k5 = (K) Preconditions.checkNotNull(k4);
            this.fragment = k5;
            k5.getLifecycle().a(h);
        }
    }
}
