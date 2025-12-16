package dagger.hilt.android.internal.managers;

import android.content.Context;
import androidx.lifecycle.B0;
import androidx.lifecycle.D0;
import androidx.lifecycle.w0;
import androidx.lifecycle.y0;
import b.o;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.EntryPoint;
import dagger.hilt.EntryPoints;
import dagger.hilt.InstallIn;
import dagger.hilt.android.ActivityRetainedLifecycle;
import dagger.hilt.android.EntryPointAccessors;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.lifecycle.RetainedLifecycleImpl;
import dagger.hilt.android.scopes.ActivityRetainedScoped;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedComponentManager;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import l0.c;

/* loaded from: classes3.dex */
final class ActivityRetainedComponentManager implements GeneratedComponentManager<ActivityRetainedComponent> {
    private volatile ActivityRetainedComponent component;
    private final Object componentLock = new Object();
    private final Context context;
    private final D0 viewModelStoreOwner;

    @EntryPoint
    @InstallIn({SingletonComponent.class})
    /* loaded from: classes3.dex */
    public interface ActivityRetainedComponentBuilderEntryPoint {
        ActivityRetainedComponentBuilder retainedComponentBuilder();
    }

    /* loaded from: classes3.dex */
    public static final class ActivityRetainedComponentViewModel extends w0 {
        private final ActivityRetainedComponent component;
        private final SavedStateHandleHolder savedStateHandleHolder;

        public ActivityRetainedComponentViewModel(ActivityRetainedComponent activityRetainedComponent, SavedStateHandleHolder savedStateHandleHolder) {
            this.component = activityRetainedComponent;
            this.savedStateHandleHolder = savedStateHandleHolder;
        }

        public ActivityRetainedComponent getComponent() {
            return this.component;
        }

        public SavedStateHandleHolder getSavedStateHandleHolder() {
            return this.savedStateHandleHolder;
        }

        @Override // androidx.lifecycle.w0
        public void onCleared() {
            super.onCleared();
            ((RetainedLifecycleImpl) ((ActivityRetainedLifecycleEntryPoint) EntryPoints.get(this.component, ActivityRetainedLifecycleEntryPoint.class)).getActivityRetainedLifecycle()).dispatchOnCleared();
        }
    }

    @EntryPoint
    @InstallIn({ActivityRetainedComponent.class})
    /* loaded from: classes3.dex */
    public interface ActivityRetainedLifecycleEntryPoint {
        ActivityRetainedLifecycle getActivityRetainedLifecycle();
    }

    @Module
    @InstallIn({ActivityRetainedComponent.class})
    /* loaded from: classes3.dex */
    public static abstract class LifecycleModule {
        @Provides
        @ActivityRetainedScoped
        public static ActivityRetainedLifecycle provideActivityRetainedLifecycle() {
            return new RetainedLifecycleImpl();
        }
    }

    public ActivityRetainedComponentManager(o oVar) {
        this.viewModelStoreOwner = oVar;
        this.context = oVar;
    }

    private ActivityRetainedComponent createComponent() {
        B0 viewModelProvider = getViewModelProvider(this.viewModelStoreOwner, this.context);
        viewModelProvider.getClass();
        Intrinsics.checkNotNullParameter(ActivityRetainedComponentViewModel.class, "modelClass");
        KClass modelClass = JvmClassMappingKt.getKotlinClass(ActivityRetainedComponentViewModel.class);
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(modelClass, "<this>");
        String qualifiedName = modelClass.getQualifiedName();
        if (qualifiedName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return ((ActivityRetainedComponentViewModel) viewModelProvider.f3286a.i(modelClass, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(qualifiedName))).getComponent();
    }

    private B0 getViewModelProvider(D0 d02, final Context context) {
        return new B0(d02, new y0() { // from class: dagger.hilt.android.internal.managers.ActivityRetainedComponentManager.1
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
                SavedStateHandleHolder savedStateHandleHolder = new SavedStateHandleHolder(cVar);
                return new ActivityRetainedComponentViewModel(((ActivityRetainedComponentBuilderEntryPoint) EntryPointAccessors.fromApplication(context, ActivityRetainedComponentBuilderEntryPoint.class)).retainedComponentBuilder().savedStateHandleHolder(savedStateHandleHolder).build(), savedStateHandleHolder);
            }
        });
    }

    public SavedStateHandleHolder getSavedStateHandleHolder() {
        B0 viewModelProvider = getViewModelProvider(this.viewModelStoreOwner, this.context);
        viewModelProvider.getClass();
        Intrinsics.checkNotNullParameter(ActivityRetainedComponentViewModel.class, "modelClass");
        KClass modelClass = JvmClassMappingKt.getKotlinClass(ActivityRetainedComponentViewModel.class);
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(modelClass, "<this>");
        String qualifiedName = modelClass.getQualifiedName();
        if (qualifiedName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return ((ActivityRetainedComponentViewModel) viewModelProvider.f3286a.i(modelClass, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(qualifiedName))).getSavedStateHandleHolder();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // dagger.hilt.internal.GeneratedComponentManager
    public ActivityRetainedComponent generatedComponent() {
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
}
