package m;

import android.content.res.Resources;
import android.widget.ThemedSpinnerAdapter;
import java.util.Objects;

/* renamed from: m.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0448G {
    public static void a(ThemedSpinnerAdapter themedSpinnerAdapter, Resources.Theme theme) {
        if (Objects.equals(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
            return;
        }
        themedSpinnerAdapter.setDropDownViewTheme(theme);
    }
}
