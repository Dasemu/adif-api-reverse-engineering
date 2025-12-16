package com.adif.elcanomovil.main;

import a.AbstractC0106b;
import androidx.fragment.app.FragmentContainerView;
import com.adif.elcanomovil.commonNavGraph.navigation.Navigation;
import com.adif.elcanomovil.databinding.ActivityMainBinding;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class r extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ActivityMainBinding f4564a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(ActivityMainBinding activityMainBinding) {
        super(1);
        this.f4564a = activityMainBinding;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Navigation navigation = (Navigation) obj;
        Intrinsics.checkNotNullParameter(navigation, "navigation");
        Navigation.Direction direction = navigation instanceof Navigation.Direction ? (Navigation.Direction) navigation : null;
        if (direction != null) {
            FragmentContainerView navHostFragment = this.f4564a.navHostFragment;
            Intrinsics.checkNotNullExpressionValue(navHostFragment, "navHostFragment");
            Intrinsics.checkNotNullParameter(navHostFragment, "<this>");
            AbstractC0106b.g(navHostFragment).p(direction.getNavDirections());
        }
        return Unit.INSTANCE;
    }
}
