package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import l.InterfaceC0418A;
import l.m;

/* loaded from: classes3.dex */
public class NavigationMenuView extends RecyclerView implements InterfaceC0418A {
    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setLayoutManager(new LinearLayoutManager(1));
    }

    @Override // l.InterfaceC0418A
    public final void a(m mVar) {
    }

    public int getWindowAnimations() {
        return 0;
    }
}
