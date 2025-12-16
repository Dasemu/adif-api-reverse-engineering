package com.adif.elcanomovil.widget.configuration;

import androidx.lifecycle.Y;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ConfigureWidgetFragment$sam$androidx_lifecycle_Observer$0 implements Y, FunctionAdapter {
    private final /* synthetic */ Function1 function;

    public ConfigureWidgetFragment$sam$androidx_lifecycle_Observer$0(Function1 function) {
        Intrinsics.checkNotNullParameter(function, "function");
        this.function = function;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof Y) && (obj instanceof FunctionAdapter)) {
            return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    public final Function<?> getFunctionDelegate() {
        return this.function;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // androidx.lifecycle.Y
    public final /* synthetic */ void onChanged(Object obj) {
        this.function.invoke(obj);
    }
}
