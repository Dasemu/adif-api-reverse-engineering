package com.adif.elcanomovil.uiMoreAdif.help;

import com.adif.elcanomovil.commonViews.ButtonsEvents;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class b extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5168a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HelpFragment f5169b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(HelpFragment helpFragment, int i) {
        super(1);
        this.f5168a = i;
        this.f5169b = helpFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        HelpViewModel viewModel;
        switch (this.f5168a) {
            case 0:
                ButtonsEvents it = (ButtonsEvents) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                this.f5169b.requireActivity().onBackPressed();
                return Unit.INSTANCE;
            default:
                ButtonsEvents it2 = (ButtonsEvents) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                HelpFragment helpFragment = this.f5169b;
                viewModel = helpFragment.getViewModel();
                viewModel.wizardTapped(helpFragment.getContext());
                return Unit.INSTANCE;
        }
    }
}
