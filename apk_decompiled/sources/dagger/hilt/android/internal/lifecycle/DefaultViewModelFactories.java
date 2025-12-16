package dagger.hilt.android.internal.lifecycle;

import androidx.fragment.app.K;
import androidx.lifecycle.y0;
import b.o;
import dagger.Module;
import dagger.hilt.EntryPoint;
import dagger.hilt.EntryPoints;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.components.FragmentComponent;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.internal.lifecycle.HiltViewModelMap;
import dagger.hilt.internal.Preconditions;
import dagger.multibindings.Multibinds;
import java.util.Set;
import javax.inject.Inject;

/* loaded from: classes3.dex */
public final class DefaultViewModelFactories {

    @EntryPoint
    @InstallIn({ActivityComponent.class})
    /* loaded from: classes3.dex */
    public interface ActivityEntryPoint {
        InternalFactoryFactory getHiltInternalFactoryFactory();
    }

    @Module
    @InstallIn({ActivityComponent.class})
    /* loaded from: classes3.dex */
    public interface ActivityModule {
        @HiltViewModelMap.KeySet
        @Multibinds
        Set<String> viewModelKeys();
    }

    @EntryPoint
    @InstallIn({FragmentComponent.class})
    /* loaded from: classes3.dex */
    public interface FragmentEntryPoint {
        InternalFactoryFactory getHiltInternalFactoryFactory();
    }

    /* loaded from: classes3.dex */
    public static final class InternalFactoryFactory {
        private final Set<String> keySet;
        private final ViewModelComponentBuilder viewModelComponentBuilder;

        @Inject
        public InternalFactoryFactory(@HiltViewModelMap.KeySet Set<String> set, ViewModelComponentBuilder viewModelComponentBuilder) {
            this.keySet = set;
            this.viewModelComponentBuilder = viewModelComponentBuilder;
        }

        private y0 getHiltViewModelFactory(y0 y0Var) {
            return new HiltViewModelFactory(this.keySet, (y0) Preconditions.checkNotNull(y0Var), this.viewModelComponentBuilder);
        }

        public y0 fromActivity(o oVar, y0 y0Var) {
            return getHiltViewModelFactory(y0Var);
        }

        public y0 fromFragment(K k4, y0 y0Var) {
            return getHiltViewModelFactory(y0Var);
        }
    }

    private DefaultViewModelFactories() {
    }

    public static y0 getActivityFactory(o oVar, y0 y0Var) {
        return ((ActivityEntryPoint) EntryPoints.get(oVar, ActivityEntryPoint.class)).getHiltInternalFactoryFactory().fromActivity(oVar, y0Var);
    }

    public static y0 getFragmentFactory(K k4, y0 y0Var) {
        return ((FragmentEntryPoint) EntryPoints.get(k4, FragmentEntryPoint.class)).getHiltInternalFactoryFactory().fromFragment(k4, y0Var);
    }
}
