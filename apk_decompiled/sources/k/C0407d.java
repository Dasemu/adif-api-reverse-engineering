package k;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* renamed from: k.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0407d extends ContextWrapper {

    /* renamed from: f, reason: collision with root package name */
    public static Configuration f6957f;

    /* renamed from: a, reason: collision with root package name */
    public int f6958a;

    /* renamed from: b, reason: collision with root package name */
    public Resources.Theme f6959b;

    /* renamed from: c, reason: collision with root package name */
    public LayoutInflater f6960c;

    /* renamed from: d, reason: collision with root package name */
    public Configuration f6961d;

    /* renamed from: e, reason: collision with root package name */
    public Resources f6962e;

    public C0407d(Context context, int i) {
        super(context);
        this.f6958a = i;
    }

    public final void a(Configuration configuration) {
        if (this.f6962e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f6961d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f6961d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final void b() {
        if (this.f6959b == null) {
            this.f6959b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f6959b.setTo(theme);
            }
        }
        this.f6959b.applyStyle(this.f6958a, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        if (this.f6962e == null) {
            Configuration configuration = this.f6961d;
            if (configuration != null) {
                if (f6957f == null) {
                    Configuration configuration2 = new Configuration();
                    configuration2.fontScale = BitmapDescriptorFactory.HUE_RED;
                    f6957f = configuration2;
                }
                if (!configuration.equals(f6957f)) {
                    this.f6962e = createConfigurationContext(this.f6961d).getResources();
                }
            }
            this.f6962e = super.getResources();
        }
        return this.f6962e;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f6960c == null) {
            this.f6960c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f6960c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f6959b;
        if (theme != null) {
            return theme;
        }
        if (this.f6958a == 0) {
            this.f6958a = 2132017802;
        }
        b();
        return this.f6959b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        if (this.f6958a != i) {
            this.f6958a = i;
            b();
        }
    }
}
