package dagger.hilt.android.internal.managers;

import android.os.Bundle;
import androidx.lifecycle.n0;
import androidx.lifecycle.q0;
import dagger.hilt.android.internal.ThreadUtil;
import dagger.hilt.internal.Preconditions;
import l0.c;
import l0.d;

/* loaded from: classes3.dex */
public final class SavedStateHandleHolder {
    private c extras;
    private n0 handle;
    private final boolean nonComponentActivity;

    public SavedStateHandleHolder(c cVar) {
        this.nonComponentActivity = cVar == null;
        this.extras = cVar;
    }

    public void clear() {
        this.extras = null;
    }

    public n0 getSavedStateHandle() {
        ThreadUtil.ensureMainThread();
        Preconditions.checkState(!this.nonComponentActivity, "Activity that does not extend ComponentActivity cannot use SavedStateHandle", new Object[0]);
        n0 n0Var = this.handle;
        if (n0Var != null) {
            return n0Var;
        }
        Preconditions.checkNotNull(this.extras, "The first access to SavedStateHandle should happen between super.onCreate() and super.onDestroy()");
        d dVar = new d(this.extras);
        dVar.b(q0.f3419c, Bundle.EMPTY);
        this.extras = dVar;
        n0 e4 = q0.e(dVar);
        this.handle = e4;
        this.extras = null;
        return e4;
    }

    public boolean isInvalid() {
        return this.handle == null && this.extras == null;
    }

    public void setExtras(c cVar) {
        if (this.handle != null) {
            return;
        }
        this.extras = cVar;
    }
}
