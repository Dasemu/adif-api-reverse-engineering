package com.adif.elcanomovil.uiMoreAdif.contact;

import I1.b;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.K;
import com.adif.elcanomovil.commonNavGraph.navigation.IntentAction;
import com.adif.elcanomovil.commonNavGraph.navigation.Navigation;
import com.adif.elcanomovil.commonNavGraph.navigation.NavigationHandler;
import com.adif.elcanomovil.commonViews.data.InfoHeaderData;
import com.adif.elcanomovil.uiMoreAdif.R;
import com.adif.elcanomovil.uiMoreAdif.contact.ContactFragment;
import com.adif.elcanomovil.uiMoreAdif.databinding.FragmentContactBinding;
import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\u0003J\u0017\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u00020\u00048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/adif/elcanomovil/uiMoreAdif/contact/ContactFragment;", "Landroidx/fragment/app/K;", "<init>", "()V", "Lcom/adif/elcanomovil/uiMoreAdif/databinding/FragmentContactBinding;", "", "configureHeaderView", "(Lcom/adif/elcanomovil/uiMoreAdif/databinding/FragmentContactBinding;)V", "configListeners", "", ImagesContract.URL, "followLink", "(Ljava/lang/String;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "binding", "Lcom/adif/elcanomovil/uiMoreAdif/databinding/FragmentContactBinding;", "ui-more-adif_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ContactFragment extends K {
    private FragmentContactBinding binding;

    public ContactFragment() {
        super(R.layout.fragment_contact);
    }

    private final void configListeners() {
        FragmentContactBinding fragmentContactBinding = this.binding;
        FragmentContactBinding fragmentContactBinding2 = null;
        if (fragmentContactBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentContactBinding = null;
        }
        final int i = 0;
        fragmentContactBinding.tvWeb.setOnClickListener(new View.OnClickListener(this) { // from class: I1.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ContactFragment f791b;

            {
                this.f791b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i4 = i;
                ContactFragment contactFragment = this.f791b;
                switch (i4) {
                    case 0:
                        ContactFragment.configListeners$lambda$0(contactFragment, view);
                        return;
                    case 1:
                        ContactFragment.configListeners$lambda$1(contactFragment, view);
                        return;
                    case 2:
                        ContactFragment.configListeners$lambda$2(contactFragment, view);
                        return;
                    default:
                        ContactFragment.configListeners$lambda$3(contactFragment, view);
                        return;
                }
            }
        });
        FragmentContactBinding fragmentContactBinding3 = this.binding;
        if (fragmentContactBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentContactBinding3 = null;
        }
        final int i4 = 1;
        fragmentContactBinding3.ivFacebook.setOnClickListener(new View.OnClickListener(this) { // from class: I1.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ContactFragment f791b;

            {
                this.f791b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i42 = i4;
                ContactFragment contactFragment = this.f791b;
                switch (i42) {
                    case 0:
                        ContactFragment.configListeners$lambda$0(contactFragment, view);
                        return;
                    case 1:
                        ContactFragment.configListeners$lambda$1(contactFragment, view);
                        return;
                    case 2:
                        ContactFragment.configListeners$lambda$2(contactFragment, view);
                        return;
                    default:
                        ContactFragment.configListeners$lambda$3(contactFragment, view);
                        return;
                }
            }
        });
        FragmentContactBinding fragmentContactBinding4 = this.binding;
        if (fragmentContactBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentContactBinding4 = null;
        }
        final int i5 = 2;
        fragmentContactBinding4.ivInstagram.setOnClickListener(new View.OnClickListener(this) { // from class: I1.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ContactFragment f791b;

            {
                this.f791b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i42 = i5;
                ContactFragment contactFragment = this.f791b;
                switch (i42) {
                    case 0:
                        ContactFragment.configListeners$lambda$0(contactFragment, view);
                        return;
                    case 1:
                        ContactFragment.configListeners$lambda$1(contactFragment, view);
                        return;
                    case 2:
                        ContactFragment.configListeners$lambda$2(contactFragment, view);
                        return;
                    default:
                        ContactFragment.configListeners$lambda$3(contactFragment, view);
                        return;
                }
            }
        });
        FragmentContactBinding fragmentContactBinding5 = this.binding;
        if (fragmentContactBinding5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            fragmentContactBinding2 = fragmentContactBinding5;
        }
        final int i6 = 3;
        fragmentContactBinding2.ivTwitter.setOnClickListener(new View.OnClickListener(this) { // from class: I1.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ContactFragment f791b;

            {
                this.f791b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i42 = i6;
                ContactFragment contactFragment = this.f791b;
                switch (i42) {
                    case 0:
                        ContactFragment.configListeners$lambda$0(contactFragment, view);
                        return;
                    case 1:
                        ContactFragment.configListeners$lambda$1(contactFragment, view);
                        return;
                    case 2:
                        ContactFragment.configListeners$lambda$2(contactFragment, view);
                        return;
                    default:
                        ContactFragment.configListeners$lambda$3(contactFragment, view);
                        return;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void configListeners$lambda$0(ContactFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String string = this$0.getString(R.string.contact_info_website);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        this$0.followLink(string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void configListeners$lambda$1(ContactFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String string = this$0.getString(R.string.facebook_url);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        this$0.followLink(string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void configListeners$lambda$2(ContactFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String string = this$0.getString(R.string.instagram_url);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        this$0.followLink(string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void configListeners$lambda$3(ContactFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String string = this$0.getString(R.string.twitter_url);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        this$0.followLink(string);
    }

    private final void configureHeaderView(FragmentContactBinding fragmentContactBinding) {
        fragmentContactBinding.headerViewContact.updateHeaderInfo(new InfoHeaderData(getString(R.string.contact_info_title), Integer.valueOf(R.drawable.ic_arrow_back), null, 4, null));
        fragmentContactBinding.headerViewContact.setOnBackActionListener(new b(this, 0));
    }

    private final void followLink(String url) {
        Uri parse = Uri.parse(url);
        Intrinsics.checkNotNullExpressionValue(parse, "parse(...)");
        new NavigationHandler(this).invoke2((Navigation) new Navigation.Intent(new IntentAction.View(parse)));
    }

    @Override // androidx.fragment.app.K
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        FragmentContactBinding bind = FragmentContactBinding.bind(view);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        if (bind == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bind = null;
        }
        configureHeaderView(bind);
        configListeners();
    }
}
