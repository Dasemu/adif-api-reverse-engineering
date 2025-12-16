package dagger.hilt.android.internal.builders;

import android.view.View;
import dagger.BindsInstance;
import dagger.hilt.DefineComponent;
import dagger.hilt.android.components.ViewWithFragmentComponent;

@DefineComponent.Builder
/* loaded from: classes3.dex */
public interface ViewWithFragmentComponentBuilder {
    ViewWithFragmentComponent build();

    ViewWithFragmentComponentBuilder view(@BindsInstance View view);
}
