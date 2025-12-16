package dagger.hilt.android.internal.builders;

import androidx.fragment.app.K;
import dagger.BindsInstance;
import dagger.hilt.DefineComponent;
import dagger.hilt.android.components.FragmentComponent;

@DefineComponent.Builder
/* loaded from: classes3.dex */
public interface FragmentComponentBuilder {
    FragmentComponent build();

    FragmentComponentBuilder fragment(@BindsInstance K k4);
}
