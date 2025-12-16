package com.adif.elcanomovil.uiMoreAdif.accessibility;

import D.h;
import android.content.Context;
import android.content.Intent;
import androidx.lifecycle.w0;
import b1.InterfaceC0266a;
import b1.f;
import com.adif.elcanomovil.commonNavGraph.arguments.AlertActions;
import com.adif.elcanomovil.commonNavGraph.arguments.AlertType;
import com.adif.elcanomovil.commonNavGraph.navigation.Navigation;
import com.adif.elcanomovil.domain.usecases.GetAppVersionUseCase;
import com.adif.elcanomovil.main.BottomNavFragmentDirections;
import com.adif.elcanomovil.uiMoreAdif.R;
import com.adif.elcanomovil.uiMoreAdif.wizard.WizardActivity;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@HiltViewModel
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\f\u001a\u00020\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00160\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010!\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006$²\u0006\f\u0010#\u001a\u00020\"8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/adif/elcanomovil/uiMoreAdif/accessibility/AccessibilityViewModel;", "Landroidx/lifecycle/w0;", "Lcom/adif/elcanomovil/domain/usecases/GetAppVersionUseCase;", "getAppVersionUseCase", "<init>", "(Lcom/adif/elcanomovil/domain/usecases/GetAppVersionUseCase;)V", "Landroid/content/Context;", "context", "", "title", "message", "", "showAlertMessage", "(Landroid/content/Context;II)V", "", "wizardTapped", "(Landroid/content/Context;)Z", "declarationButtonTapped", "(Landroid/content/Context;)V", "communicationButtonTapped", "Lcom/adif/elcanomovil/domain/usecases/GetAppVersionUseCase;", "Lb1/f;", "Lcom/adif/elcanomovil/commonNavGraph/navigation/Navigation;", "navigationFlow", "Lb1/f;", "Lb1/a;", "navigation", "Lb1/a;", "getNavigation", "()Lb1/a;", "", "getAppVersion", "()Ljava/lang/String;", RemoteConfigConstants.RequestFieldKey.APP_VERSION, "Lcom/adif/elcanomovil/commonNavGraph/arguments/AlertActions;", "observationActions", "ui-more-adif_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AccessibilityViewModel extends w0 {
    private final GetAppVersionUseCase getAppVersionUseCase;
    private final InterfaceC0266a navigation;
    private final f navigationFlow;

    @Inject
    public AccessibilityViewModel(GetAppVersionUseCase getAppVersionUseCase) {
        Intrinsics.checkNotNullParameter(getAppVersionUseCase, "getAppVersionUseCase");
        this.getAppVersionUseCase = getAppVersionUseCase;
        f fVar = new f();
        this.navigationFlow = fVar;
        this.navigation = fVar;
    }

    private final void showAlertMessage(Context context, int title, int message) {
        if (context != null) {
            Lazy lazy = LazyKt.lazy(new c(context));
            BottomNavFragmentDirections.Companion companion = BottomNavFragmentDirections.INSTANCE;
            String string = context.getString(title);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            String string2 = context.getString(message);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            this.navigationFlow.b(new Navigation.RootDirection(companion.toAlertDialog(false, true, string, string2, showAlertMessage$lambda$2$lambda$1(lazy), AlertType.INFO), null, 2, null));
        }
    }

    private static final AlertActions showAlertMessage$lambda$2$lambda$1(Lazy<AlertActions> lazy) {
        return lazy.getValue();
    }

    public final void communicationButtonTapped(Context context) {
        showAlertMessage(context, R.string.communications_dialog_title, R.string.communications_dialog_message);
    }

    public final void declarationButtonTapped(Context context) {
        showAlertMessage(context, R.string.declaration_dialog_title, R.string.declaration_dialog_message);
    }

    public final String getAppVersion() {
        return this.getAppVersionUseCase.invoke();
    }

    public final InterfaceC0266a getNavigation() {
        return this.navigation;
    }

    public final boolean wizardTapped(Context context) {
        if (context == null) {
            return false;
        }
        h.startActivity(context, new Intent(context, (Class<?>) WizardActivity.class), null);
        return true;
    }
}
