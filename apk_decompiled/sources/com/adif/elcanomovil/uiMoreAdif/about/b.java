package com.adif.elcanomovil.uiMoreAdif.about;

import com.adif.elcanomovil.commonViews.ButtonsEvents;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class b extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5157a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AboutFragment f5158b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(AboutFragment aboutFragment, int i) {
        super(1);
        this.f5157a = i;
        this.f5158b = aboutFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        AboutViewModel viewModel;
        switch (this.f5157a) {
            case 0:
                ButtonsEvents it = (ButtonsEvents) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                this.f5158b.requireActivity().onBackPressed();
                return Unit.INSTANCE;
            default:
                ButtonsEvents it2 = (ButtonsEvents) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                AboutFragment aboutFragment = this.f5158b;
                viewModel = aboutFragment.getViewModel();
                viewModel.wizardTapped(aboutFragment.getContext());
                return Unit.INSTANCE;
        }
    }
}
