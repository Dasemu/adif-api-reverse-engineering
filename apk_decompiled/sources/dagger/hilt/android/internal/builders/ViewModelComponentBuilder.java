package dagger.hilt.android.internal.builders;

import androidx.lifecycle.n0;
import dagger.BindsInstance;
import dagger.hilt.DefineComponent;
import dagger.hilt.android.ViewModelLifecycle;
import dagger.hilt.android.components.ViewModelComponent;

@DefineComponent.Builder
/* loaded from: classes3.dex */
public interface ViewModelComponentBuilder {
    ViewModelComponent build();

    ViewModelComponentBuilder savedStateHandle(@BindsInstance n0 n0Var);

    ViewModelComponentBuilder viewModelLifecycle(@BindsInstance ViewModelLifecycle viewModelLifecycle);
}
