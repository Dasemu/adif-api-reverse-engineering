package com.adif.elcanomovil.main;

import O.J;
import O.L;
import O.X;
import a.AbstractC0105a;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.C0146f0;
import androidx.lifecycle.C0;
import androidx.lifecycle.q0;
import androidx.lifecycle.y0;
import c1.C0283c;
import com.adif.elcanomovil.R;
import com.adif.elcanomovil.commonViews.extensions.ViewKt;
import com.adif.elcanomovil.databinding.ActivityMainBinding;
import com.adif.elcanomovil.domain.entities.notifications.NotificationPayload;
import dagger.hilt.android.AndroidEntryPoint;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0011\u0010\u0003R\u001b\u0010\u0017\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\u0019\u001a\u00020\u00188\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/adif/elcanomovil/main/MainActivity;", "Lg/k;", "<init>", "()V", "Lcom/adif/elcanomovil/domain/entities/notifications/NotificationPayload;", "notificationPayload", "", "showSnackBar", "(Lcom/adif/elcanomovil/domain/entities/notifications/NotificationPayload;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/content/Intent;", "intent", "onNewIntent", "(Landroid/content/Intent;)V", "onResume", "Lcom/adif/elcanomovil/main/MainViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "getViewModel", "()Lcom/adif/elcanomovil/main/MainViewModel;", "viewModel", "Lc1/c;", "notificationsPermissionRequester", "Lc1/c;", "getNotificationsPermissionRequester", "()Lc1/c;", "setNotificationsPermissionRequester", "(Lc1/c;)V", "app_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension({"SMAP\nMainActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainActivity.kt\ncom/adif/elcanomovil/main/MainActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,101:1\n75#2,13:102\n*S KotlinDebug\n*F\n+ 1 MainActivity.kt\ncom/adif/elcanomovil/main/MainActivity\n*L\n29#1:102,13\n*E\n"})
/* loaded from: classes.dex */
public final class MainActivity extends Hilt_MainActivity {

    @Inject
    public C0283c notificationsPermissionRequester;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final Lazy viewModel;

    public MainActivity() {
        final Function0 function0 = null;
        this.viewModel = new I0.b(Reflection.getOrCreateKotlinClass(MainViewModel.class), new Function0<C0>() { // from class: com.adif.elcanomovil.main.MainActivity$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final C0 invoke() {
                return b.o.this.getViewModelStore();
            }
        }, new Function0<y0>() { // from class: com.adif.elcanomovil.main.MainActivity$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final y0 invoke() {
                return b.o.this.getDefaultViewModelProviderFactory();
            }
        }, new Function0<l0.c>() { // from class: com.adif.elcanomovil.main.MainActivity$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final l0.c invoke() {
                l0.c cVar;
                Function0 function02 = Function0.this;
                return (function02 == null || (cVar = (l0.c) function02.invoke()) == null) ? this.getDefaultViewModelCreationExtras() : cVar;
            }
        });
    }

    public static final /* synthetic */ MainViewModel access$getViewModel(MainActivity mainActivity) {
        return mainActivity.getViewModel();
    }

    public static final /* synthetic */ void access$showSnackBar(MainActivity mainActivity, NotificationPayload notificationPayload) {
        mainActivity.showSnackBar(notificationPayload);
    }

    public final MainViewModel getViewModel() {
        return (MainViewModel) this.viewModel.getValue();
    }

    public final void showSnackBar(NotificationPayload notificationPayload) {
        ViewKt.showSnackbar(this, notificationPayload.getMessage(), 0, notificationPayload instanceof NotificationPayload.Avisa ? getString(R.string.snackbar_action) : null, new b1.e(1, this, notificationPayload));
    }

    public final C0283c getNotificationsPermissionRequester() {
        C0283c c0283c = this.notificationsPermissionRequester;
        if (c0283c != null) {
            return c0283c;
        }
        Intrinsics.throwUninitializedPropertyAccessException("notificationsPermissionRequester");
        return null;
    }

    @Override // com.adif.elcanomovil.main.Hilt_MainActivity, androidx.fragment.app.P, b.o, C.AbstractActivityC0048l, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.ElcanoTheme);
        super.onCreate(savedInstanceState);
        Intrinsics.checkNotNullParameter(this, "activity");
        AbstractC0105a.O(getWindow(), false);
        C0283c notificationsPermissionRequester = getNotificationsPermissionRequester();
        notificationsPermissionRequester.getClass();
        Intrinsics.checkNotNullParameter(this, "activity");
        notificationsPermissionRequester.f4232b = new WeakReference(this);
        notificationsPermissionRequester.f4231a = registerForActivityResult(new C0146f0(2), new I2.k(notificationsPermissionRequester, 3));
        ActivityMainBinding inflate = ActivityMainBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        setContentView(inflate.getRoot());
        View rootView = findViewById(android.R.id.content);
        Intrinsics.checkNotNullExpressionValue(rootView, "findViewById(...)");
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        B0.w wVar = new B0.w(20);
        WeakHashMap weakHashMap = X.f1226a;
        L.u(rootView, wVar);
        J.c(rootView);
        setRequestedOrientation(1);
        MainViewModel viewModel = getViewModel();
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        viewModel.handleOnCreate(intent);
        ((b1.f) getViewModel().getNavigation()).a(this, new r(inflate));
        BuildersKt__Builders_commonKt.launch$default(q0.h(this), null, null, new t(this, null), 3, null);
        ((b1.f) getViewModel().getSnackBarEvent()).a(this, new I1.b(this, 5));
    }

    @Override // b.o, android.app.Activity
    public void onNewIntent(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        getViewModel().onNewIntent(intent);
    }

    @Override // androidx.fragment.app.P, android.app.Activity
    public void onResume() {
        super.onResume();
        getViewModel().onNewIntent(getIntent());
        setIntent(null);
    }

    public final void setNotificationsPermissionRequester(C0283c c0283c) {
        Intrinsics.checkNotNullParameter(c0283c, "<set-?>");
        this.notificationsPermissionRequester = c0283c;
    }
}
