package com.google.firebase.components;

import com.google.firebase.inject.Provider;
import java.util.Collections;

/* loaded from: classes3.dex */
public final /* synthetic */ class g implements Provider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5933a;

    public /* synthetic */ g(int i) {
        this.f5933a = i;
    }

    @Override // com.google.firebase.inject.Provider
    public final Object get() {
        switch (this.f5933a) {
            case 0:
                return OptionalProvider.a();
            default:
                return Collections.EMPTY_SET;
        }
    }
}
