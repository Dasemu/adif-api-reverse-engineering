package F;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final ColorStateList f492a;

    /* renamed from: b, reason: collision with root package name */
    public final Configuration f493b;

    /* renamed from: c, reason: collision with root package name */
    public final int f494c;

    public l(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.f492a = colorStateList;
        this.f493b = configuration;
        this.f494c = theme == null ? 0 : theme.hashCode();
    }
}
