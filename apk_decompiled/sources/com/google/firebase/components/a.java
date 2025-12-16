package com.google.firebase.components;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements ComponentFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5922a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5923b;

    public /* synthetic */ a(Object obj, int i) {
        this.f5922a = i;
        this.f5923b = obj;
    }

    @Override // com.google.firebase.components.ComponentFactory
    public final Object create(ComponentContainer componentContainer) {
        Object lambda$of$2;
        Object lambda$intoSet$4;
        Object lambda$intoSet$3;
        Object lambda$of$0;
        Object lambda$of$1;
        int i = this.f5922a;
        Object obj = this.f5923b;
        switch (i) {
            case 0:
                lambda$of$2 = Component.lambda$of$2(obj, componentContainer);
                return lambda$of$2;
            case 1:
                lambda$intoSet$4 = Component.lambda$intoSet$4(obj, componentContainer);
                return lambda$intoSet$4;
            case 2:
                lambda$intoSet$3 = Component.lambda$intoSet$3(obj, componentContainer);
                return lambda$intoSet$3;
            case 3:
                lambda$of$0 = Component.lambda$of$0(obj, componentContainer);
                return lambda$of$0;
            default:
                lambda$of$1 = Component.lambda$of$1(obj, componentContainer);
                return lambda$of$1;
        }
    }
}
