package com.adif.elcanomovil.uiMoreAdif.help;

import D.h;
import android.content.Context;
import android.content.Intent;
import androidx.lifecycle.w0;
import com.adif.elcanomovil.uiMoreAdif.HelpItem;
import com.adif.elcanomovil.uiMoreAdif.HelpItemsProvider;
import com.adif.elcanomovil.uiMoreAdif.wizard.WizardActivity;
import com.google.firebase.analytics.FirebaseAnalytics;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@HiltViewModel
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000bR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/adif/elcanomovil/uiMoreAdif/help/HelpViewModel;", "Landroidx/lifecycle/w0;", "Lcom/adif/elcanomovil/uiMoreAdif/HelpItemsProvider;", "provider", "<init>", "(Lcom/adif/elcanomovil/uiMoreAdif/HelpItemsProvider;)V", "Landroid/content/Context;", "context", "", "wizardTapped", "(Landroid/content/Context;)Z", "Lcom/adif/elcanomovil/uiMoreAdif/HelpItemsProvider;", "", "Lcom/adif/elcanomovil/uiMoreAdif/HelpItem;", "getItems", "()Ljava/util/List;", FirebaseAnalytics.Param.ITEMS, "ui-more-adif_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class HelpViewModel extends w0 {
    private final HelpItemsProvider provider;

    @Inject
    public HelpViewModel(HelpItemsProvider provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.provider = provider;
    }

    public final List<HelpItem> getItems() {
        return this.provider.getItems();
    }

    public final boolean wizardTapped(Context context) {
        if (context == null) {
            return false;
        }
        h.startActivity(context, new Intent(context, (Class<?>) WizardActivity.class), null);
        return true;
    }
}
