package dagger.hilt.android.internal.modules;

import android.app.Activity;
import androidx.fragment.app.P;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata("dagger.Reusable")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class ActivityModule_ProvideFragmentActivityFactory implements Factory<P> {
    private final Provider<Activity> activityProvider;

    public ActivityModule_ProvideFragmentActivityFactory(Provider<Activity> provider) {
        this.activityProvider = provider;
    }

    public static ActivityModule_ProvideFragmentActivityFactory create(Provider<Activity> provider) {
        return new ActivityModule_ProvideFragmentActivityFactory(provider);
    }

    public static P provideFragmentActivity(Activity activity) {
        return (P) Preconditions.checkNotNullFromProvides(ActivityModule.provideFragmentActivity(activity));
    }

    @Override // javax.inject.Provider
    public P get() {
        return provideFragmentActivity(this.activityProvider.get());
    }
}
