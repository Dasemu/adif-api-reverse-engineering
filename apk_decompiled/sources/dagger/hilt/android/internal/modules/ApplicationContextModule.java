package dagger.hilt.android.internal.modules;

import android.app.Application;
import android.content.Context;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.internal.Contexts;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.components.SingletonComponent;

@Module
@InstallIn({SingletonComponent.class})
/* loaded from: classes3.dex */
public final class ApplicationContextModule {
    private final Context applicationContext;

    public ApplicationContextModule(Context context) {
        this.applicationContext = context;
    }

    @Provides
    public Application provideApplication() {
        return Contexts.getApplication(this.applicationContext);
    }

    @Provides
    @ApplicationContext
    public Context provideContext() {
        return this.applicationContext;
    }
}
