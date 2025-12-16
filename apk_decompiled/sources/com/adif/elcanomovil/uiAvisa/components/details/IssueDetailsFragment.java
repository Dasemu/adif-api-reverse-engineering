package com.adif.elcanomovil.uiAvisa.components.details;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.K;
import androidx.lifecycle.C0;
import androidx.lifecycle.D0;
import androidx.lifecycle.InterfaceC0200v;
import androidx.lifecycle.Y;
import androidx.lifecycle.y0;
import com.adif.elcanomovil.commonViews.data.InfoHeaderData;
import com.adif.elcanomovil.commonViews.loading.LoadingDialogFragment;
import com.adif.elcanomovil.domain.entities.avisa.incidence.IncidenceStation;
import com.adif.elcanomovil.domain.entities.utils.AsyncResult;
import com.adif.elcanomovil.domain.entities.utils.Status;
import com.adif.elcanomovil.uiAvisa.R;
import com.adif.elcanomovil.uiAvisa.databinding.FragmentAvisaDetailsBinding;
import com.adif.elcanomovil.uiAvisa.databinding.PopupFullscreenPictureBinding;
import com.adif.elcanomovil.uiAvisa.utils.ui.FullScreenPicturePopupWindow;
import com.adif.elcanomovil.uiAvisa.utils.ui.PictureGridView;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import l0.C0435a;
import o0.C0531h;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\n\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0012\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010&\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0016\u0010'\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010)\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010(R\u0018\u0010+\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lcom/adif/elcanomovil/uiAvisa/components/details/IssueDetailsFragment;", "Landroidx/fragment/app/K;", "Lcom/adif/elcanomovil/uiAvisa/utils/ui/PictureGridView$OnPictureGridInteractionListener;", "<init>", "()V", "", "issueId", "Landroid/view/View;", "view", "", "bindViewModel", "(Ljava/lang/Integer;Landroid/view/View;)V", "", "isLoading", "loading", "(Z)V", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/graphics/Bitmap;", "bitmap", "onPictureInteraction", "(Landroid/graphics/Bitmap;)V", "Lcom/adif/elcanomovil/uiAvisa/databinding/FragmentAvisaDetailsBinding;", "binding", "Lcom/adif/elcanomovil/uiAvisa/databinding/FragmentAvisaDetailsBinding;", "Lcom/adif/elcanomovil/uiAvisa/components/details/IssueDetailsViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "getViewModel", "()Lcom/adif/elcanomovil/uiAvisa/components/details/IssueDetailsViewModel;", "viewModel", "Lcom/adif/elcanomovil/uiAvisa/components/details/IssueDetailsFragmentArgs;", "args$delegate", "Lo0/h;", "getArgs", "()Lcom/adif/elcanomovil/uiAvisa/components/details/IssueDetailsFragmentArgs;", "args", "initialDataAvailable", "Z", "commentsExpanded", "Lcom/adif/elcanomovil/commonViews/loading/LoadingDialogFragment;", "loadingDialogFragment", "Lcom/adif/elcanomovil/commonViews/loading/LoadingDialogFragment;", "ui-avisa_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension({"SMAP\nIssueDetailsFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IssueDetailsFragment.kt\ncom/adif/elcanomovil/uiAvisa/components/details/IssueDetailsFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n*L\n1#1,290:1\n106#2,15:291\n42#3,3:306\n*S KotlinDebug\n*F\n+ 1 IssueDetailsFragment.kt\ncom/adif/elcanomovil/uiAvisa/components/details/IssueDetailsFragment\n*L\n35#1:291,15\n36#1:306,3\n*E\n"})
@ExperimentalCoroutinesApi
/* loaded from: classes.dex */
public final class IssueDetailsFragment extends Hilt_IssueDetailsFragment implements PictureGridView.OnPictureGridInteractionListener {

    /* renamed from: args$delegate, reason: from kotlin metadata */
    private final C0531h args;
    private FragmentAvisaDetailsBinding binding;
    private boolean commentsExpanded;
    private boolean initialDataAvailable;
    private LoadingDialogFragment loadingDialogFragment;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final Lazy viewModel;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Status.values().length];
            try {
                iArr[Status.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Status.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Status.LOADING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public IssueDetailsFragment() {
        super(R.layout.fragment_avisa_details);
        final Function0<K> function0 = new Function0<K>() { // from class: com.adif.elcanomovil.uiAvisa.components.details.IssueDetailsFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final K invoke() {
                return K.this;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<D0>() { // from class: com.adif.elcanomovil.uiAvisa.components.details.IssueDetailsFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final D0 invoke() {
                return (D0) Function0.this.invoke();
            }
        });
        final Function0 function02 = null;
        this.viewModel = m3.d.n(this, Reflection.getOrCreateKotlinClass(IssueDetailsViewModel.class), new Function0<C0>() { // from class: com.adif.elcanomovil.uiAvisa.components.details.IssueDetailsFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final C0 invoke() {
                return ((D0) Lazy.this.getValue()).getViewModelStore();
            }
        }, new Function0<l0.c>() { // from class: com.adif.elcanomovil.uiAvisa.components.details.IssueDetailsFragment$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final l0.c invoke() {
                l0.c cVar;
                Function0 function03 = Function0.this;
                if (function03 != null && (cVar = (l0.c) function03.invoke()) != null) {
                    return cVar;
                }
                D0 d02 = (D0) lazy.getValue();
                InterfaceC0200v interfaceC0200v = d02 instanceof InterfaceC0200v ? (InterfaceC0200v) d02 : null;
                return interfaceC0200v != null ? interfaceC0200v.getDefaultViewModelCreationExtras() : C0435a.f7312b;
            }
        }, new Function0<y0>() { // from class: com.adif.elcanomovil.uiAvisa.components.details.IssueDetailsFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final y0 invoke() {
                y0 defaultViewModelProviderFactory;
                D0 d02 = (D0) lazy.getValue();
                InterfaceC0200v interfaceC0200v = d02 instanceof InterfaceC0200v ? (InterfaceC0200v) d02 : null;
                if (interfaceC0200v != null && (defaultViewModelProviderFactory = interfaceC0200v.getDefaultViewModelProviderFactory()) != null) {
                    return defaultViewModelProviderFactory;
                }
                y0 defaultViewModelProviderFactory2 = K.this.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory2;
            }
        });
        this.args = new C0531h(Reflection.getOrCreateKotlinClass(IssueDetailsFragmentArgs.class), new Function0<Bundle>() { // from class: com.adif.elcanomovil.uiAvisa.components.details.IssueDetailsFragment$special$$inlined$navArgs$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Bundle invoke() {
                Bundle arguments = K.this.getArguments();
                if (arguments != null) {
                    return arguments;
                }
                throw new IllegalStateException("Fragment " + K.this + " has null arguments");
            }
        });
    }

    private final void bindViewModel(Integer issueId, final View view) {
        if (issueId == null) {
            return;
        }
        getViewModel().getIssueDetail(issueId.intValue());
        final int i = 0;
        getViewModel().getUserDetailIncidences().e(getViewLifecycleOwner(), new Y(this) { // from class: com.adif.elcanomovil.uiAvisa.components.details.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IssueDetailsFragment f4878b;

            {
                this.f4878b = this;
            }

            @Override // androidx.lifecycle.Y
            public final void onChanged(Object obj) {
                int i4 = i;
                IssueDetailsFragment issueDetailsFragment = this.f4878b;
                switch (i4) {
                    case 0:
                        IssueDetailsFragment.bindViewModel$lambda$5(issueDetailsFragment, (AsyncResult) obj);
                        return;
                    case 1:
                        IssueDetailsFragment.bindViewModel$lambda$7(issueDetailsFragment, (List) obj);
                        return;
                    default:
                        IssueDetailsFragment.bindViewModel$lambda$9(issueDetailsFragment, (List) obj);
                        return;
                }
            }
        });
        final int i4 = 1;
        getViewModel().getUserPicturesLiveData().e(getViewLifecycleOwner(), new Y(this) { // from class: com.adif.elcanomovil.uiAvisa.components.details.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IssueDetailsFragment f4878b;

            {
                this.f4878b = this;
            }

            @Override // androidx.lifecycle.Y
            public final void onChanged(Object obj) {
                int i42 = i4;
                IssueDetailsFragment issueDetailsFragment = this.f4878b;
                switch (i42) {
                    case 0:
                        IssueDetailsFragment.bindViewModel$lambda$5(issueDetailsFragment, (AsyncResult) obj);
                        return;
                    case 1:
                        IssueDetailsFragment.bindViewModel$lambda$7(issueDetailsFragment, (List) obj);
                        return;
                    default:
                        IssueDetailsFragment.bindViewModel$lambda$9(issueDetailsFragment, (List) obj);
                        return;
                }
            }
        });
        final int i5 = 2;
        getViewModel().getSystemPicturesLiveData().e(getViewLifecycleOwner(), new Y(this) { // from class: com.adif.elcanomovil.uiAvisa.components.details.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IssueDetailsFragment f4878b;

            {
                this.f4878b = this;
            }

            @Override // androidx.lifecycle.Y
            public final void onChanged(Object obj) {
                int i42 = i5;
                IssueDetailsFragment issueDetailsFragment = this.f4878b;
                switch (i42) {
                    case 0:
                        IssueDetailsFragment.bindViewModel$lambda$5(issueDetailsFragment, (AsyncResult) obj);
                        return;
                    case 1:
                        IssueDetailsFragment.bindViewModel$lambda$7(issueDetailsFragment, (List) obj);
                        return;
                    default:
                        IssueDetailsFragment.bindViewModel$lambda$9(issueDetailsFragment, (List) obj);
                        return;
                }
            }
        });
        getViewModel().isDataLoaded().e(getViewLifecycleOwner(), new Y(this) { // from class: com.adif.elcanomovil.uiAvisa.components.details.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IssueDetailsFragment f4880b;

            {
                this.f4880b = this;
            }

            @Override // androidx.lifecycle.Y
            public final void onChanged(Object obj) {
                IssueDetailsFragment.bindViewModel$lambda$12(view, this.f4880b, (Boolean) obj);
            }
        });
    }

    public static final void bindViewModel$lambda$12(View view, IssueDetailsFragment this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(view, "$view");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (bool == null || !bool.booleanValue()) {
            return;
        }
        FragmentAvisaDetailsBinding fragmentAvisaDetailsBinding = this$0.binding;
        FragmentAvisaDetailsBinding fragmentAvisaDetailsBinding2 = null;
        if (fragmentAvisaDetailsBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentAvisaDetailsBinding = null;
        }
        TextView textView = fragmentAvisaDetailsBinding.issueDetailsStatus;
        SpannableStringBuilder estimatedFixingDate = this$0.getViewModel().getEstimatedFixingDate();
        TextView.BufferType bufferType = TextView.BufferType.SPANNABLE;
        textView.setText(estimatedFixingDate, bufferType);
        FragmentAvisaDetailsBinding fragmentAvisaDetailsBinding3 = this$0.binding;
        if (fragmentAvisaDetailsBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentAvisaDetailsBinding3 = null;
        }
        fragmentAvisaDetailsBinding3.issueDetailsLocation.setText(this$0.getViewModel().getStationName());
        FragmentAvisaDetailsBinding fragmentAvisaDetailsBinding4 = this$0.binding;
        if (fragmentAvisaDetailsBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentAvisaDetailsBinding4 = null;
        }
        fragmentAvisaDetailsBinding4.issueDetailsCategory.setText(this$0.getViewModel().getCategoryName());
        FragmentAvisaDetailsBinding fragmentAvisaDetailsBinding5 = this$0.binding;
        if (fragmentAvisaDetailsBinding5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentAvisaDetailsBinding5 = null;
        }
        fragmentAvisaDetailsBinding5.issueDetailsNotifications.setText(this$0.getViewModel().getNotificationStatusText());
        FragmentAvisaDetailsBinding fragmentAvisaDetailsBinding6 = this$0.binding;
        if (fragmentAvisaDetailsBinding6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentAvisaDetailsBinding6 = null;
        }
        fragmentAvisaDetailsBinding6.issueDetailsNotifications.setTextColor(this$0.getViewModel().getNotificationStatusTextColour());
        FragmentAvisaDetailsBinding fragmentAvisaDetailsBinding7 = this$0.binding;
        if (fragmentAvisaDetailsBinding7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentAvisaDetailsBinding7 = null;
        }
        fragmentAvisaDetailsBinding7.issueDetailsNotificationsIcon.setImageResource(this$0.getViewModel().getNotificationDrawable());
        if (this$0.getViewModel().getEstimatedFixingDateVisibility()) {
            FragmentAvisaDetailsBinding fragmentAvisaDetailsBinding8 = this$0.binding;
            if (fragmentAvisaDetailsBinding8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentAvisaDetailsBinding8 = null;
            }
            fragmentAvisaDetailsBinding8.issueDetailsFixingTitle.setVisibility(0);
        } else {
            FragmentAvisaDetailsBinding fragmentAvisaDetailsBinding9 = this$0.binding;
            if (fragmentAvisaDetailsBinding9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentAvisaDetailsBinding9 = null;
            }
            fragmentAvisaDetailsBinding9.issueDetailsFixingTitle.setVisibility(4);
        }
        FragmentAvisaDetailsBinding fragmentAvisaDetailsBinding10 = this$0.binding;
        if (fragmentAvisaDetailsBinding10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentAvisaDetailsBinding10 = null;
        }
        fragmentAvisaDetailsBinding10.issueDetailsDescription.setText(this$0.getViewModel().getDescriptionText(), bufferType);
        FragmentAvisaDetailsBinding fragmentAvisaDetailsBinding11 = this$0.binding;
        if (fragmentAvisaDetailsBinding11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentAvisaDetailsBinding11 = null;
        }
        fragmentAvisaDetailsBinding11.issueDetailsFixingTitle.setText(this$0.getViewModel().getStatusText(), bufferType);
        FragmentAvisaDetailsBinding fragmentAvisaDetailsBinding12 = this$0.binding;
        if (fragmentAvisaDetailsBinding12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentAvisaDetailsBinding12 = null;
        }
        fragmentAvisaDetailsBinding12.issueDetailsStatus.setBackgroundColor(D.h.getColor(view.getContext(), this$0.getViewModel().getStatusBackgroundColour()));
        FragmentAvisaDetailsBinding fragmentAvisaDetailsBinding13 = this$0.binding;
        if (fragmentAvisaDetailsBinding13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentAvisaDetailsBinding13 = null;
        }
        fragmentAvisaDetailsBinding13.issueDetailsStatus.setTextColor(D.h.getColor(view.getContext(), this$0.getViewModel().getStatusTextColour()));
        FragmentAvisaDetailsBinding fragmentAvisaDetailsBinding14 = this$0.binding;
        if (fragmentAvisaDetailsBinding14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentAvisaDetailsBinding14 = null;
        }
        fragmentAvisaDetailsBinding14.issueDetailsComments.setText(Html.fromHtml(this$0.getViewModel().getCommentsText(), 0));
        FragmentAvisaDetailsBinding fragmentAvisaDetailsBinding15 = this$0.binding;
        if (fragmentAvisaDetailsBinding15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentAvisaDetailsBinding15 = null;
        }
        fragmentAvisaDetailsBinding15.issueDetailsComments.setTextColor(this$0.getViewModel().getCommentsColour());
        FragmentAvisaDetailsBinding fragmentAvisaDetailsBinding16 = this$0.binding;
        if (fragmentAvisaDetailsBinding16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentAvisaDetailsBinding16 = null;
        }
        fragmentAvisaDetailsBinding16.issueDetailsCommentsTitle.setCompoundDrawablesWithIntrinsicBounds(0, 0, this$0.getViewModel().getCommentsDrawable(), 0);
        if (!this$0.getViewModel().getCommentsEmpty()) {
            FragmentAvisaDetailsBinding fragmentAvisaDetailsBinding17 = this$0.binding;
            if (fragmentAvisaDetailsBinding17 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentAvisaDetailsBinding17 = null;
            }
            fragmentAvisaDetailsBinding17.issueDetailsCommentsHolder.setOnClickListener(new D1.a(this$0, 11));
        }
        if (this$0.getViewModel().getFromDatabase() && this$0.getViewModel().getCommentsEmpty()) {
            FragmentAvisaDetailsBinding fragmentAvisaDetailsBinding18 = this$0.binding;
            if (fragmentAvisaDetailsBinding18 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentAvisaDetailsBinding18 = null;
            }
            fragmentAvisaDetailsBinding18.issueDetailsComments.setText(this$0.getString(R.string.issue_loading_comments));
        }
        FragmentAvisaDetailsBinding fragmentAvisaDetailsBinding19 = this$0.binding;
        if (fragmentAvisaDetailsBinding19 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentAvisaDetailsBinding19 = null;
        }
        fragmentAvisaDetailsBinding19.issueUserPictures.setCallback(this$0);
        FragmentAvisaDetailsBinding fragmentAvisaDetailsBinding20 = this$0.binding;
        if (fragmentAvisaDetailsBinding20 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            fragmentAvisaDetailsBinding2 = fragmentAvisaDetailsBinding20;
        }
        fragmentAvisaDetailsBinding2.issueSystemPictures.setCallback(this$0);
    }

    public static final void bindViewModel$lambda$12$lambda$11$lambda$10(IssueDetailsFragment this$0, View view) {
        ObjectAnimator ofInt;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FragmentAvisaDetailsBinding fragmentAvisaDetailsBinding = this$0.binding;
        if (fragmentAvisaDetailsBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentAvisaDetailsBinding = null;
        }
        TextView issueDetailsComments = fragmentAvisaDetailsBinding.issueDetailsComments;
        Intrinsics.checkNotNullExpressionValue(issueDetailsComments, "issueDetailsComments");
        if (this$0.commentsExpanded) {
            FragmentAvisaDetailsBinding fragmentAvisaDetailsBinding2 = this$0.binding;
            if (fragmentAvisaDetailsBinding2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentAvisaDetailsBinding2 = null;
            }
            fragmentAvisaDetailsBinding2.issueDetailsCommentsTitle.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, D.h.getDrawable(this$0.requireContext(), R.drawable.ic_dropdown_open), (Drawable) null);
            issueDetailsComments.setMaxLines(4);
            issueDetailsComments.setEllipsize(TextUtils.TruncateAt.END);
            ofInt = ObjectAnimator.ofInt(issueDetailsComments, "maxLines", 4);
            Intrinsics.checkNotNullExpressionValue(ofInt, "ofInt(...)");
        } else {
            FragmentAvisaDetailsBinding fragmentAvisaDetailsBinding3 = this$0.binding;
            if (fragmentAvisaDetailsBinding3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentAvisaDetailsBinding3 = null;
            }
            fragmentAvisaDetailsBinding3.issueDetailsCommentsTitle.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, D.h.getDrawable(this$0.requireContext(), R.drawable.ic_dropdown_closed), (Drawable) null);
            issueDetailsComments.setMaxLines(Integer.MAX_VALUE);
            issueDetailsComments.setEllipsize(null);
            ofInt = ObjectAnimator.ofInt(issueDetailsComments, "maxLines", Integer.MAX_VALUE);
            Intrinsics.checkNotNullExpressionValue(ofInt, "ofInt(...)");
        }
        this$0.commentsExpanded = !this$0.commentsExpanded;
        ofInt.setDuration(200L).start();
    }

    public static final void bindViewModel$lambda$5(IssueDetailsFragment this$0, AsyncResult asyncResult) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FragmentAvisaDetailsBinding fragmentAvisaDetailsBinding = null;
        Unit unit = null;
        FragmentAvisaDetailsBinding fragmentAvisaDetailsBinding2 = null;
        Status status = asyncResult != null ? asyncResult.getStatus() : null;
        int i = status == null ? -1 : WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
        if (i == 1) {
            this$0.loading(false);
            IncidenceStation incidenceStation = (IncidenceStation) asyncResult.getData();
            if (incidenceStation != null) {
                String string = this$0.getString(R.string.avisa_issue_screen_title, incidenceStation.getIncidence().getIncidenceCode());
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                FragmentAvisaDetailsBinding fragmentAvisaDetailsBinding3 = this$0.binding;
                if (fragmentAvisaDetailsBinding3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    fragmentAvisaDetailsBinding = fragmentAvisaDetailsBinding3;
                }
                fragmentAvisaDetailsBinding.headerAvisaDetailIssue.updateHeaderInfo(new InfoHeaderData(string, Integer.valueOf(R.drawable.ic_arrow_back), null, 4, null));
                this$0.getViewModel().populateView(incidenceStation, false);
                Unit unit2 = Unit.INSTANCE;
                return;
            }
            return;
        }
        if (i != 2) {
            if (i != 3) {
                return;
            }
            IncidenceStation incidenceStation2 = (IncidenceStation) asyncResult.getData();
            if (incidenceStation2 != null) {
                this$0.loading(false);
                this$0.initialDataAvailable = true;
                IssueDetailsViewModel.populateView$default(this$0.getViewModel(), incidenceStation2, false, 2, null);
                unit = Unit.INSTANCE;
            }
            if (unit == null) {
                this$0.loading(true);
                return;
            }
            return;
        }
        FragmentAvisaDetailsBinding fragmentAvisaDetailsBinding4 = this$0.binding;
        if (fragmentAvisaDetailsBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentAvisaDetailsBinding4 = null;
        }
        fragmentAvisaDetailsBinding4.issueSystemPictures.setLoading(false);
        FragmentAvisaDetailsBinding fragmentAvisaDetailsBinding5 = this$0.binding;
        if (fragmentAvisaDetailsBinding5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentAvisaDetailsBinding5 = null;
        }
        fragmentAvisaDetailsBinding5.issueUserPictures.setLoading(false);
        if (this$0.getViewModel().getCommentsEmpty()) {
            FragmentAvisaDetailsBinding fragmentAvisaDetailsBinding6 = this$0.binding;
            if (fragmentAvisaDetailsBinding6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                fragmentAvisaDetailsBinding2 = fragmentAvisaDetailsBinding6;
            }
            fragmentAvisaDetailsBinding2.issueDetailsComments.setText(this$0.getString(R.string.issue_no_comments));
        }
        if (this$0.getContext() != null) {
            this$0.getViewModel().showErrorDialog();
        }
    }

    public static final void bindViewModel$lambda$7(IssueDetailsFragment this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (list != null) {
            FragmentAvisaDetailsBinding fragmentAvisaDetailsBinding = null;
            if (!this$0.getViewModel().getFromDatabase() && list.isEmpty()) {
                FragmentAvisaDetailsBinding fragmentAvisaDetailsBinding2 = this$0.binding;
                if (fragmentAvisaDetailsBinding2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    fragmentAvisaDetailsBinding = fragmentAvisaDetailsBinding2;
                }
                fragmentAvisaDetailsBinding.issueUserPictures.setLoading(false);
                return;
            }
            FragmentAvisaDetailsBinding fragmentAvisaDetailsBinding3 = this$0.binding;
            if (fragmentAvisaDetailsBinding3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentAvisaDetailsBinding3 = null;
            }
            fragmentAvisaDetailsBinding3.issueUserPictures.setImages(list);
            FragmentAvisaDetailsBinding fragmentAvisaDetailsBinding4 = this$0.binding;
            if (fragmentAvisaDetailsBinding4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentAvisaDetailsBinding4 = null;
            }
            fragmentAvisaDetailsBinding4.issueUserPictures.invalidate();
            FragmentAvisaDetailsBinding fragmentAvisaDetailsBinding5 = this$0.binding;
            if (fragmentAvisaDetailsBinding5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentAvisaDetailsBinding5 = null;
            }
            fragmentAvisaDetailsBinding5.issueUserPictures.requestLayout();
            FragmentAvisaDetailsBinding fragmentAvisaDetailsBinding6 = this$0.binding;
            if (fragmentAvisaDetailsBinding6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentAvisaDetailsBinding6 = null;
            }
            fragmentAvisaDetailsBinding6.scrollView.invalidate();
            FragmentAvisaDetailsBinding fragmentAvisaDetailsBinding7 = this$0.binding;
            if (fragmentAvisaDetailsBinding7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                fragmentAvisaDetailsBinding = fragmentAvisaDetailsBinding7;
            }
            fragmentAvisaDetailsBinding.scrollView.requestLayout();
        }
    }

    public static final void bindViewModel$lambda$9(IssueDetailsFragment this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (list != null) {
            FragmentAvisaDetailsBinding fragmentAvisaDetailsBinding = null;
            if (!this$0.getViewModel().getFromDatabase() && list.isEmpty()) {
                FragmentAvisaDetailsBinding fragmentAvisaDetailsBinding2 = this$0.binding;
                if (fragmentAvisaDetailsBinding2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    fragmentAvisaDetailsBinding2 = null;
                }
                fragmentAvisaDetailsBinding2.issueSystemPictures.setLoading(false);
            }
            FragmentAvisaDetailsBinding fragmentAvisaDetailsBinding3 = this$0.binding;
            if (fragmentAvisaDetailsBinding3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentAvisaDetailsBinding3 = null;
            }
            fragmentAvisaDetailsBinding3.issueSystemPictures.setImages(list);
            FragmentAvisaDetailsBinding fragmentAvisaDetailsBinding4 = this$0.binding;
            if (fragmentAvisaDetailsBinding4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentAvisaDetailsBinding4 = null;
            }
            fragmentAvisaDetailsBinding4.issueSystemPictures.invalidate();
            FragmentAvisaDetailsBinding fragmentAvisaDetailsBinding5 = this$0.binding;
            if (fragmentAvisaDetailsBinding5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentAvisaDetailsBinding5 = null;
            }
            fragmentAvisaDetailsBinding5.issueSystemPictures.requestLayout();
            FragmentAvisaDetailsBinding fragmentAvisaDetailsBinding6 = this$0.binding;
            if (fragmentAvisaDetailsBinding6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentAvisaDetailsBinding6 = null;
            }
            fragmentAvisaDetailsBinding6.issueSystemPictures.invalidateViews();
            FragmentAvisaDetailsBinding fragmentAvisaDetailsBinding7 = this$0.binding;
            if (fragmentAvisaDetailsBinding7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentAvisaDetailsBinding7 = null;
            }
            fragmentAvisaDetailsBinding7.scrollView.invalidate();
            FragmentAvisaDetailsBinding fragmentAvisaDetailsBinding8 = this$0.binding;
            if (fragmentAvisaDetailsBinding8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                fragmentAvisaDetailsBinding = fragmentAvisaDetailsBinding8;
            }
            fragmentAvisaDetailsBinding.scrollView.requestLayout();
        }
    }

    private final IssueDetailsFragmentArgs getArgs() {
        return (IssueDetailsFragmentArgs) this.args.getValue();
    }

    private final IssueDetailsViewModel getViewModel() {
        return (IssueDetailsViewModel) this.viewModel.getValue();
    }

    private final void loading(boolean isLoading) {
        if (isLoading) {
            LoadingDialogFragment loadingDialogFragment = this.loadingDialogFragment;
            if (loadingDialogFragment != null) {
                loadingDialogFragment.show(getParentFragmentManager(), (String) null);
                return;
            }
            return;
        }
        LoadingDialogFragment loadingDialogFragment2 = this.loadingDialogFragment;
        if (loadingDialogFragment2 != null) {
            loadingDialogFragment2.dismiss();
        }
    }

    @Override // com.adif.elcanomovil.uiAvisa.utils.ui.PictureGridView.OnPictureGridInteractionListener
    public void onPictureInteraction(int i) {
        PictureGridView.OnPictureGridInteractionListener.DefaultImpls.onPictureInteraction(this, i);
    }

    @Override // androidx.fragment.app.K
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        FragmentAvisaDetailsBinding bind = FragmentAvisaDetailsBinding.bind(view);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        FragmentAvisaDetailsBinding fragmentAvisaDetailsBinding = null;
        if (bind == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bind = null;
        }
        bind.headerAvisaDetailIssue.updateHeaderInfo(new InfoHeaderData(getString(R.string.avisa_issue_screen_title, ""), Integer.valueOf(R.drawable.ic_arrow_back), null, 4, null));
        FragmentAvisaDetailsBinding fragmentAvisaDetailsBinding2 = this.binding;
        if (fragmentAvisaDetailsBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            fragmentAvisaDetailsBinding = fragmentAvisaDetailsBinding2;
        }
        fragmentAvisaDetailsBinding.headerAvisaDetailIssue.setOnBackActionListener(new I1.b(this, 6));
        this.loadingDialogFragment = new LoadingDialogFragment();
        bindViewModel(Integer.valueOf(getArgs().getArgIdIncidence()), view);
    }

    @Override // com.adif.elcanomovil.uiAvisa.utils.ui.PictureGridView.OnPictureGridInteractionListener
    public void onPictureInteraction(Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        PopupFullscreenPictureBinding inflate = PopupFullscreenPictureBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        new FullScreenPicturePopupWindow(requireContext, bitmap, -1, false, inflate, -1, -1, null, 128, null).showAtLocation(getView(), 17, 0, 0);
    }
}
