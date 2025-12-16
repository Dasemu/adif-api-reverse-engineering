package com.adif.elcanomovil.uiMoreAdif.accessibility;

import com.adif.elcanomovil.commonViews.ButtonsEvents;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class b extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5163a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AccessibilityFragment f5164b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(AccessibilityFragment accessibilityFragment, int i) {
        super(1);
        this.f5163a = i;
        this.f5164b = accessibilityFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        AccessibilityViewModel viewModel;
        switch (this.f5163a) {
            case 0:
                ButtonsEvents it = (ButtonsEvents) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                this.f5164b.requireActivity().onBackPressed();
                return Unit.INSTANCE;
            default:
                ButtonsEvents it2 = (ButtonsEvents) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                AccessibilityFragment accessibilityFragment = this.f5164b;
                viewModel = accessibilityFragment.getViewModel();
                viewModel.wizardTapped(accessibilityFragment.getContext());
                return Unit.INSTANCE;
        }
    }
}
