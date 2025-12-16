package com.adif.elcanomovil.uiAvisa.components.home;

import androidx.lifecycle.Y;
import com.adif.elcanomovil.domain.entities.utils.AsyncResult;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4896a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AvisaHomeFragment f4897b;

    public /* synthetic */ a(AvisaHomeFragment avisaHomeFragment, int i) {
        this.f4896a = i;
        this.f4897b = avisaHomeFragment;
    }

    @Override // androidx.lifecycle.Y
    public final void onChanged(Object obj) {
        int i = this.f4896a;
        AvisaHomeFragment avisaHomeFragment = this.f4897b;
        switch (i) {
            case 0:
                AvisaHomeFragment.g(avisaHomeFragment, (AsyncResult) obj);
                return;
            case 1:
                AvisaHomeFragment.j(avisaHomeFragment, (List) obj);
                return;
            default:
                AvisaHomeFragment.h(avisaHomeFragment, (Boolean) obj);
                return;
        }
    }
}
