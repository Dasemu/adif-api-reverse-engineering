package androidx.profileinstaller;

import F.n;
import android.content.Context;
import f0.C0338b;
import java.util.Collections;
import java.util.List;
import s0.AbstractC0586e;
import z0.InterfaceC0666b;

/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements InterfaceC0666b {
    @Override // z0.InterfaceC0666b
    public final Object a(Context context) {
        AbstractC0586e.a(new n(9, this, context.getApplicationContext()));
        return new C0338b(16);
    }

    @Override // z0.InterfaceC0666b
    public final List dependencies() {
        return Collections.EMPTY_LIST;
    }
}
