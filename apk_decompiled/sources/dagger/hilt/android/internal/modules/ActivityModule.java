package dagger.hilt.android.internal.modules;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.P;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.Reusable;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.qualifiers.ActivityContext;

@Module
@InstallIn({ActivityComponent.class})
/* loaded from: classes3.dex */
abstract class ActivityModule {
    private ActivityModule() {
    }

    @Provides
    @Reusable
    public static P provideFragmentActivity(Activity activity) {
        try {
            return (P) activity;
        } catch (ClassCastException e4) {
            throw new IllegalStateException("Expected activity to be a FragmentActivity: " + activity, e4);
        }
    }

    @Binds
    @ActivityContext
    public abstract Context provideContext(Activity activity);
}
