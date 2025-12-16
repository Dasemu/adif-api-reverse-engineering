package dagger.hilt.android.internal.lifecycle;

import android.app.Activity;
import android.os.Bundle;
import androidx.lifecycle.q0;
import androidx.lifecycle.w0;
import androidx.lifecycle.y0;
import dagger.Module;
import dagger.hilt.EntryPoint;
import dagger.hilt.EntryPoints;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.components.ViewModelComponent;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.internal.lifecycle.HiltViewModelMap;
import dagger.multibindings.Multibinds;
import java.io.Closeable;
import java.util.Map;
import java.util.Set;
import javax.inject.Provider;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KClass;
import l0.b;
import l0.c;
import v0.f;

/* loaded from: classes3.dex */
public final class HiltViewModelFactory implements y0 {
    public static final b CREATION_CALLBACK_KEY = new b() { // from class: dagger.hilt.android.internal.lifecycle.HiltViewModelFactory.1
    };
    private final y0 delegateFactory;
    private final y0 hiltViewModelFactory;
    private final Set<String> hiltViewModelKeys;

    @EntryPoint
    @InstallIn({ActivityComponent.class})
    /* loaded from: classes3.dex */
    public interface ActivityCreatorEntryPoint {
        ViewModelComponentBuilder getViewModelComponentBuilder();

        @HiltViewModelMap.KeySet
        Set<String> getViewModelKeys();
    }

    @EntryPoint
    @InstallIn({ViewModelComponent.class})
    /* loaded from: classes3.dex */
    public interface ViewModelFactoriesEntryPoint {
        @HiltViewModelAssistedMap
        Map<String, Object> getHiltViewModelAssistedMap();

        @HiltViewModelMap
        Map<String, Provider<w0>> getHiltViewModelMap();
    }

    @Module
    @InstallIn({ViewModelComponent.class})
    /* loaded from: classes3.dex */
    public interface ViewModelModule {
        @HiltViewModelAssistedMap
        @Multibinds
        Map<String, Object> hiltViewModelAssistedMap();

        @HiltViewModelMap
        @Multibinds
        Map<String, w0> hiltViewModelMap();
    }

    public HiltViewModelFactory(Set<String> set, y0 y0Var, final ViewModelComponentBuilder viewModelComponentBuilder) {
        this.hiltViewModelKeys = set;
        this.delegateFactory = y0Var;
        this.hiltViewModelFactory = new y0() { // from class: dagger.hilt.android.internal.lifecycle.HiltViewModelFactory.2
            private <T extends w0> T createViewModel(ViewModelComponent viewModelComponent, Class<T> cls, c cVar) {
                Provider<w0> provider = ((ViewModelFactoriesEntryPoint) EntryPoints.get(viewModelComponent, ViewModelFactoriesEntryPoint.class)).getHiltViewModelMap().get(cls.getName());
                Function1 function1 = (Function1) cVar.a(HiltViewModelFactory.CREATION_CALLBACK_KEY);
                Object obj = ((ViewModelFactoriesEntryPoint) EntryPoints.get(viewModelComponent, ViewModelFactoriesEntryPoint.class)).getHiltViewModelAssistedMap().get(cls.getName());
                if (obj == null) {
                    if (function1 != null) {
                        throw new IllegalStateException("Found creation callback but class " + cls.getName() + " does not have an assisted factory specified in @HiltViewModel.");
                    }
                    if (provider != null) {
                        return (T) provider.get();
                    }
                    throw new IllegalStateException("Expected the @HiltViewModel-annotated class " + cls.getName() + " to be available in the multi-binding of @HiltViewModelMap but none was found.");
                }
                if (provider != null) {
                    throw new AssertionError("Found the @HiltViewModel-annotated class " + cls.getName() + " in both the multi-bindings of @HiltViewModelMap and @HiltViewModelAssistedMap.");
                }
                if (function1 != null) {
                    return (T) function1.invoke(obj);
                }
                throw new IllegalStateException("Found @HiltViewModel-annotated class " + cls.getName() + " using @AssistedInject but no creation callback was provided in CreationExtras.");
            }

            @Override // androidx.lifecycle.y0
            public /* bridge */ /* synthetic */ w0 create(Class cls) {
                super.create(cls);
                throw null;
            }

            @Override // androidx.lifecycle.y0
            public /* bridge */ /* synthetic */ w0 create(KClass kClass, c cVar) {
                return super.create(kClass, cVar);
            }

            @Override // androidx.lifecycle.y0
            public <T extends w0> T create(Class<T> cls, c cVar) {
                final RetainedLifecycleImpl retainedLifecycleImpl = new RetainedLifecycleImpl();
                T t2 = (T) createViewModel(viewModelComponentBuilder.savedStateHandle(q0.e(cVar)).viewModelLifecycle(retainedLifecycleImpl).build(), cls, cVar);
                t2.addCloseable(new Closeable() { // from class: dagger.hilt.android.internal.lifecycle.a
                    @Override // java.io.Closeable, java.lang.AutoCloseable
                    public final void close() {
                        RetainedLifecycleImpl.this.dispatchOnCleared();
                    }
                });
                return t2;
            }
        };
    }

    public static y0 createInternal(Activity activity, f fVar, Bundle bundle, y0 y0Var) {
        return createInternal(activity, y0Var);
    }

    @Override // androidx.lifecycle.y0
    public /* bridge */ /* synthetic */ w0 create(KClass kClass, c cVar) {
        return super.create(kClass, cVar);
    }

    public static y0 createInternal(Activity activity, y0 y0Var) {
        ActivityCreatorEntryPoint activityCreatorEntryPoint = (ActivityCreatorEntryPoint) EntryPoints.get(activity, ActivityCreatorEntryPoint.class);
        return new HiltViewModelFactory(activityCreatorEntryPoint.getViewModelKeys(), y0Var, activityCreatorEntryPoint.getViewModelComponentBuilder());
    }

    @Override // androidx.lifecycle.y0
    public <T extends w0> T create(Class<T> cls, c cVar) {
        if (this.hiltViewModelKeys.contains(cls.getName())) {
            return (T) this.hiltViewModelFactory.create(cls, cVar);
        }
        return (T) this.delegateFactory.create(cls, cVar);
    }

    @Override // androidx.lifecycle.y0
    public <T extends w0> T create(Class<T> cls) {
        if (this.hiltViewModelKeys.contains(cls.getName())) {
            return (T) this.hiltViewModelFactory.create(cls);
        }
        return (T) this.delegateFactory.create(cls);
    }
}
