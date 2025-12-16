package com.google.firebase.installations;

import com.adif.elcanomovil.uiAvisa.components.create.y;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5990a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5991b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f5992c;

    public /* synthetic */ a(boolean z3, int i, Object obj) {
        this.f5990a = i;
        this.f5991b = obj;
        this.f5992c = z3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5990a) {
            case 0:
                ((FirebaseInstallations) this.f5991b).lambda$doRegistrationOrRefresh$3(this.f5992c);
                return;
            case 1:
                ((FirebaseInstallations) this.f5991b).lambda$getToken$2(this.f5992c);
                return;
            default:
                y yVar = (y) this.f5991b;
                if (yVar != null) {
                    yVar.invoke(Boolean.valueOf(this.f5992c));
                    return;
                }
                return;
        }
    }
}
