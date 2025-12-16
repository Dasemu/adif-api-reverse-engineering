package com.adif.elcanomovil.uiAvisa.components.create;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Base64;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.ListAdapter;
import androidx.fragment.app.C0146f0;
import androidx.fragment.app.K;
import androidx.lifecycle.C0;
import androidx.lifecycle.D0;
import androidx.lifecycle.InterfaceC0200v;
import androidx.lifecycle.J;
import androidx.lifecycle.q0;
import androidx.lifecycle.y0;
import com.adif.elcanomovil.commonNavGraph.arguments.AlertAction;
import com.adif.elcanomovil.commonNavGraph.extensions.NavigationExtensionsKt;
import com.adif.elcanomovil.commonViews.data.InfoHeaderData;
import com.adif.elcanomovil.domain.entities.avisa.AvisaStation;
import com.adif.elcanomovil.domain.entities.avisa.AvisaStationCategory;
import com.adif.elcanomovil.uiAvisa.R;
import com.adif.elcanomovil.uiAvisa.components.create.NewIssueViewAction;
import com.adif.elcanomovil.uiAvisa.databinding.BottomSheetCategoriesBinding;
import com.adif.elcanomovil.uiAvisa.databinding.FragmentAvisaNewBinding;
import com.adif.elcanomovil.uiAvisa.databinding.PictureBottomSheetBinding;
import com.adif.elcanomovil.uiAvisa.databinding.PopupFullscreenPictureBinding;
import com.adif.elcanomovil.uiAvisa.utils.ui.BottomSheetListView;
import com.adif.elcanomovil.uiAvisa.utils.ui.FullScreenPicturePopupWindow;
import com.adif.elcanomovil.uiAvisa.utils.ui.PictureGridView;
import com.google.firebase.messaging.Constants;
import d.AbstractC0294c;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import l0.C0435a;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0007\u0018\u0000 >2\u00020\u0001:\u0001>B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ)\u0010\u0010\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0017¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0012\u0010\u0003J\u001f\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0018\u0010\u0003J\u000f\u0010\u0019\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0019\u0010\u0003J\u0017\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\b2\u0006\u0010!\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\bH\u0002¢\u0006\u0004\b$\u0010\u0003J\u000f\u0010%\u001a\u00020\bH\u0002¢\u0006\u0004\b%\u0010\u0003J\u0017\u0010(\u001a\u00020\b2\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\u00020\b2\u0006\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020\b2\u0006\u0010.\u001a\u00020*H\u0002¢\u0006\u0004\b/\u0010-R\u0016\u00101\u001a\u0002008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b1\u00102R\u001b\u00108\u001a\u0002038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R.\u0010<\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0014 ;*\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010:0:098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=¨\u0006?"}, d2 = {"Lcom/adif/elcanomovil/uiAvisa/components/create/NewIssueFragment;", "Landroidx/fragment/app/K;", "<init>", "()V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "requestCode", "resultCode", "Landroid/content/Intent;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "onActivityResult", "(IILandroid/content/Intent;)V", "bindViewModel", "position", "", "pictureContent", "editPicture", "(ILjava/lang/String;)V", "promptCategoriesDialog", "promptStationsDialog", "stationId", "requestCategories", "(Ljava/lang/String;)V", "", "isChecked", "createIssue", "(Z)V", "value", "showProgress", "(I)V", "promptPickPictureDialog", "selectImageInAlbum", "Landroid/net/Uri;", "photoURI", "takePhoto", "(Landroid/net/Uri;)V", "Lcom/adif/elcanomovil/commonNavGraph/arguments/AlertAction$Style;", "_action", "creationInfoDialogDismissed", "(Lcom/adif/elcanomovil/commonNavGraph/arguments/AlertAction$Style;)V", "action", "handlePreMandatoryUpdateAlertResult", "Lcom/adif/elcanomovil/uiAvisa/databinding/FragmentAvisaNewBinding;", "binding", "Lcom/adif/elcanomovil/uiAvisa/databinding/FragmentAvisaNewBinding;", "Lcom/adif/elcanomovil/uiAvisa/components/create/NewIssueViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "getViewModel", "()Lcom/adif/elcanomovil/uiAvisa/components/create/NewIssueViewModel;", "viewModel", "Ld/c;", "", "kotlin.jvm.PlatformType", "requestCameraPermissions", "Ld/c;", "Companion", "ui-avisa_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension({"SMAP\nNewIssueFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NewIssueFragment.kt\ncom/adif/elcanomovil/uiAvisa/components/create/NewIssueFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,378:1\n106#2,15:379\n1045#3:394\n1549#3:395\n1620#3,3:396\n1045#3:399\n1549#3:400\n1620#3,3:401\n*S KotlinDebug\n*F\n+ 1 NewIssueFragment.kt\ncom/adif/elcanomovil/uiAvisa/components/create/NewIssueFragment\n*L\n45#1:379,15\n276#1:394\n280#1:395\n280#1:396,3\n298#1:399\n304#1:400\n304#1:401,3\n*E\n"})
/* loaded from: classes.dex */
public final class NewIssueFragment extends Hilt_NewIssueFragment {
    private static final int REQUEST_SELECT_IMAGE_IN_ALBUM = 101;
    private static final int REQUEST_TAKE_PHOTO = 100;
    private FragmentAvisaNewBinding binding;
    private final AbstractC0294c requestCameraPermissions;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final Lazy viewModel;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AlertAction.Style.values().length];
            try {
                iArr[AlertAction.Style.POSITIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AlertAction.Style.NEGATIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AlertAction.Style.NEUTRAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public NewIssueFragment() {
        super(R.layout.fragment_avisa_new);
        final Function0<K> function0 = new Function0<K>() { // from class: com.adif.elcanomovil.uiAvisa.components.create.NewIssueFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final K invoke() {
                return K.this;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<D0>() { // from class: com.adif.elcanomovil.uiAvisa.components.create.NewIssueFragment$special$$inlined$viewModels$default$2
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
        this.viewModel = m3.d.n(this, Reflection.getOrCreateKotlinClass(NewIssueViewModel.class), new Function0<C0>() { // from class: com.adif.elcanomovil.uiAvisa.components.create.NewIssueFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final C0 invoke() {
                return ((D0) Lazy.this.getValue()).getViewModelStore();
            }
        }, new Function0<l0.c>() { // from class: com.adif.elcanomovil.uiAvisa.components.create.NewIssueFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<y0>() { // from class: com.adif.elcanomovil.uiAvisa.components.create.NewIssueFragment$special$$inlined$viewModels$default$5
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
        AbstractC0294c registerForActivityResult = registerForActivityResult(new C0146f0(1), new I2.k(this, 9));
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "registerForActivityResult(...)");
        this.requestCameraPermissions = registerForActivityResult;
    }

    private final void bindViewModel() {
        FragmentAvisaNewBinding fragmentAvisaNewBinding = this.binding;
        if (fragmentAvisaNewBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentAvisaNewBinding = null;
        }
        final int i = 0;
        fragmentAvisaNewBinding.createIssueButton.setOnClickListener(new View.OnClickListener(this) { // from class: com.adif.elcanomovil.uiAvisa.components.create.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewIssueFragment f4833b;

            {
                this.f4833b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i4 = i;
                NewIssueFragment newIssueFragment = this.f4833b;
                switch (i4) {
                    case 0:
                        NewIssueFragment.bindViewModel$lambda$1(newIssueFragment, view);
                        return;
                    case 1:
                        NewIssueFragment.bindViewModel$lambda$2(newIssueFragment, view);
                        return;
                    default:
                        NewIssueFragment.bindViewModel$lambda$3(newIssueFragment, view);
                        return;
                }
            }
        });
        FragmentAvisaNewBinding fragmentAvisaNewBinding2 = this.binding;
        if (fragmentAvisaNewBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentAvisaNewBinding2 = null;
        }
        final int i4 = 1;
        fragmentAvisaNewBinding2.createIssueStation.setOnClickListener(new View.OnClickListener(this) { // from class: com.adif.elcanomovil.uiAvisa.components.create.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewIssueFragment f4833b;

            {
                this.f4833b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i42 = i4;
                NewIssueFragment newIssueFragment = this.f4833b;
                switch (i42) {
                    case 0:
                        NewIssueFragment.bindViewModel$lambda$1(newIssueFragment, view);
                        return;
                    case 1:
                        NewIssueFragment.bindViewModel$lambda$2(newIssueFragment, view);
                        return;
                    default:
                        NewIssueFragment.bindViewModel$lambda$3(newIssueFragment, view);
                        return;
                }
            }
        });
        FragmentAvisaNewBinding fragmentAvisaNewBinding3 = this.binding;
        if (fragmentAvisaNewBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentAvisaNewBinding3 = null;
        }
        final int i5 = 2;
        fragmentAvisaNewBinding3.createIssueCategory.setOnClickListener(new View.OnClickListener(this) { // from class: com.adif.elcanomovil.uiAvisa.components.create.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewIssueFragment f4833b;

            {
                this.f4833b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i42 = i5;
                NewIssueFragment newIssueFragment = this.f4833b;
                switch (i42) {
                    case 0:
                        NewIssueFragment.bindViewModel$lambda$1(newIssueFragment, view);
                        return;
                    case 1:
                        NewIssueFragment.bindViewModel$lambda$2(newIssueFragment, view);
                        return;
                    default:
                        NewIssueFragment.bindViewModel$lambda$3(newIssueFragment, view);
                        return;
                }
            }
        });
        FragmentAvisaNewBinding fragmentAvisaNewBinding4 = this.binding;
        if (fragmentAvisaNewBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentAvisaNewBinding4 = null;
        }
        fragmentAvisaNewBinding4.createIssueSwitch.setOnCheckedChangeListener(new O1.a(this, 1));
        FragmentAvisaNewBinding fragmentAvisaNewBinding5 = this.binding;
        if (fragmentAvisaNewBinding5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentAvisaNewBinding5 = null;
        }
        fragmentAvisaNewBinding5.createIssueDescription.addTextChangedListener(new TextWatcher() { // from class: com.adif.elcanomovil.uiAvisa.components.create.NewIssueFragment$bindViewModel$5
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable p02) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence p02, int p12, int p22, int p3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence p02, int p12, int p22, int p3) {
                NewIssueViewModel viewModel;
                viewModel = NewIssueFragment.this.getViewModel();
                viewModel.setIssueDescription(String.valueOf(p02));
            }
        });
        J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        BuildersKt__Builders_commonKt.launch$default(q0.h(viewLifecycleOwner), null, null, new i(this, null), 3, null);
        getViewModel().selectedCategory().e(getViewLifecycleOwner(), new l(0, new d(this, 4)));
        getViewModel().selectedStation().e(getViewLifecycleOwner(), new l(0, new d(this, 5)));
        getViewModel().canContinue().e(getViewLifecycleOwner(), new l(0, new d(this, 6)));
        getViewModel().getListCategories().e(getViewLifecycleOwner(), new l(0, new d(this, 0)));
        getViewModel().getAvisaStationList().e(getViewLifecycleOwner(), new l(0, new d(this, 1)));
        getViewModel().getResultCreateIncidence().e(getViewLifecycleOwner(), new l(0, new d(this, 2)));
        getViewModel().bitmap().e(getViewLifecycleOwner(), new l(0, new d(this, 3)));
        FragmentAvisaNewBinding fragmentAvisaNewBinding6 = this.binding;
        if (fragmentAvisaNewBinding6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentAvisaNewBinding6 = null;
        }
        fragmentAvisaNewBinding6.createIssueGrid.setCallback(new PictureGridView.OnPictureGridInteractionListener() { // from class: com.adif.elcanomovil.uiAvisa.components.create.NewIssueFragment$bindViewModel$14
            @Override // com.adif.elcanomovil.uiAvisa.utils.ui.PictureGridView.OnPictureGridInteractionListener
            public void onPictureInteraction(Bitmap bitmap) {
                PictureGridView.OnPictureGridInteractionListener.DefaultImpls.onPictureInteraction(this, bitmap);
            }

            @Override // com.adif.elcanomovil.uiAvisa.utils.ui.PictureGridView.OnPictureGridInteractionListener
            public void onPictureInteraction(int position) {
                NewIssueViewModel viewModel;
                viewModel = NewIssueFragment.this.getViewModel();
                viewModel.pictureGridInteraction(position);
            }
        });
        J viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        BuildersKt__Builders_commonKt.launch$default(q0.h(viewLifecycleOwner2), null, null, new f(this, null), 3, null);
    }

    public static final void bindViewModel$lambda$1(NewIssueFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getViewModel().onViewAction(NewIssueViewAction.CreateIncidence.INSTANCE);
    }

    public static final void bindViewModel$lambda$2(NewIssueFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.promptStationsDialog();
    }

    public static final void bindViewModel$lambda$3(NewIssueFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.promptCategoriesDialog();
    }

    public static final void bindViewModel$lambda$4(NewIssueFragment this$0, CompoundButton compoundButton, boolean z3) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getViewModel().onViewAction(new NewIssueViewAction.SetNotificationsEnabled(z3));
    }

    private final void createIssue(boolean isChecked) {
        showProgress(0);
        getViewModel().createIssue(isChecked);
    }

    public final void creationInfoDialogDismissed(AlertAction.Style _action) {
        getViewModel().onViewAction(NewIssueViewAction.CreationInfoDialogDismissed.INSTANCE);
    }

    public final void editPicture(int position, String pictureContent) {
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        Intrinsics.checkNotNullParameter(pictureContent, "base64String");
        byte[] decode = Base64.decode(pictureContent, 0);
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
        Intrinsics.checkNotNullExpressionValue(decodeByteArray, "decodeByteArray(...)");
        PopupFullscreenPictureBinding inflate = PopupFullscreenPictureBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        new FullScreenPicturePopupWindow(requireContext, decodeByteArray, position, true, inflate, -1, -1, new FullScreenPicturePopupWindow.OnFullScreenPicturePopupListener() { // from class: com.adif.elcanomovil.uiAvisa.components.create.NewIssueFragment$editPicture$pw$1
            @Override // com.adif.elcanomovil.uiAvisa.utils.ui.FullScreenPicturePopupWindow.OnFullScreenPicturePopupListener
            public void onDeleteEvent(int position2) {
                NewIssueViewModel viewModel;
                FragmentAvisaNewBinding fragmentAvisaNewBinding;
                viewModel = NewIssueFragment.this.getViewModel();
                viewModel.removePicture(position2);
                fragmentAvisaNewBinding = NewIssueFragment.this.binding;
                if (fragmentAvisaNewBinding == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    fragmentAvisaNewBinding = null;
                }
                fragmentAvisaNewBinding.createIssueGrid.deleteImage(position2);
            }
        }).showAtLocation(getView(), 17, 0, 0);
    }

    public final NewIssueViewModel getViewModel() {
        return (NewIssueViewModel) this.viewModel.getValue();
    }

    public final void handlePreMandatoryUpdateAlertResult(AlertAction.Style action) {
        if (WhenMappings.$EnumSwitchMapping$0[action.ordinal()] != 1) {
            return;
        }
        FragmentAvisaNewBinding fragmentAvisaNewBinding = this.binding;
        if (fragmentAvisaNewBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentAvisaNewBinding = null;
        }
        createIssue(fragmentAvisaNewBinding.createIssueSwitch.isChecked());
    }

    private final void promptCategoriesDialog() {
        int collectionSizeOrDefault;
        Context context = getContext();
        if (context == null) {
            return;
        }
        o2.e eVar = new o2.e(context);
        BottomSheetCategoriesBinding inflate = BottomSheetCategoriesBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        List sortedWith = CollectionsKt.sortedWith(getViewModel().categories(), new Comparator() { // from class: com.adif.elcanomovil.uiAvisa.components.create.NewIssueFragment$promptCategoriesDialog$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t2, T t4) {
                return ComparisonsKt.compareValues(((AvisaStationCategory) t2).getTitle(), ((AvisaStationCategory) t4).getTitle());
            }
        });
        BottomSheetListView bottomSheetListView = inflate.listViewBtmSheet;
        int i = R.layout.item_station_category_list;
        int i4 = R.id.stationCategoryTitle;
        List list = sortedWith;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((AvisaStationCategory) it.next()).getTitle());
        }
        bottomSheetListView.setAdapter((ListAdapter) new ArrayAdapter(context, i, i4, arrayList));
        inflate.listViewBtmSheet.setOnItemClickListener(new a(this, sortedWith, eVar, 0));
        eVar.setContentView(inflate.getRoot());
        eVar.show();
    }

    public static final void promptCategoriesDialog$lambda$7(NewIssueFragment this$0, List list, o2.e dialog, AdapterView adapterView, View view, int i, long j4) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(list, "$list");
        Intrinsics.checkNotNullParameter(dialog, "$dialog");
        this$0.getViewModel().setCategory((AvisaStationCategory) list.get(i));
        FragmentAvisaNewBinding fragmentAvisaNewBinding = this$0.binding;
        if (fragmentAvisaNewBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentAvisaNewBinding = null;
        }
        fragmentAvisaNewBinding.categoryButton.setTextColor(this$0.getResources().getColor(R.color.white));
        dialog.dismiss();
    }

    public final void promptPickPictureDialog() {
        Context context = getContext();
        if (context != null) {
            final o2.e eVar = new o2.e(context);
            PictureBottomSheetBinding inflate = PictureBottomSheetBinding.inflate(getLayoutInflater());
            Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
            final int i = 0;
            inflate.bottomSheetGallery.setOnClickListener(new View.OnClickListener(this) { // from class: com.adif.elcanomovil.uiAvisa.components.create.b

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ NewIssueFragment f4830b;

                {
                    this.f4830b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i) {
                        case 0:
                            NewIssueFragment.promptPickPictureDialog$lambda$13$lambda$11(this.f4830b, eVar, view);
                            return;
                        default:
                            NewIssueFragment.promptPickPictureDialog$lambda$13$lambda$12(this.f4830b, eVar, view);
                            return;
                    }
                }
            });
            final int i4 = 1;
            inflate.bottomSheetCamera.setOnClickListener(new View.OnClickListener(this) { // from class: com.adif.elcanomovil.uiAvisa.components.create.b

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ NewIssueFragment f4830b;

                {
                    this.f4830b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i4) {
                        case 0:
                            NewIssueFragment.promptPickPictureDialog$lambda$13$lambda$11(this.f4830b, eVar, view);
                            return;
                        default:
                            NewIssueFragment.promptPickPictureDialog$lambda$13$lambda$12(this.f4830b, eVar, view);
                            return;
                    }
                }
            });
            eVar.setContentView(inflate.getRoot());
            eVar.show();
        }
    }

    public static final void promptPickPictureDialog$lambda$13$lambda$11(NewIssueFragment this$0, o2.e dialog, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(dialog, "$dialog");
        this$0.getViewModel().onViewAction(NewIssueViewAction.PickImageFromGalleryViewAction.INSTANCE);
        dialog.dismiss();
    }

    public static final void promptPickPictureDialog$lambda$13$lambda$12(NewIssueFragment this$0, o2.e dialog, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(dialog, "$dialog");
        this$0.getViewModel().onViewAction(NewIssueViewAction.PickImageFromCameraViewAction.INSTANCE);
        dialog.dismiss();
    }

    private final void promptStationsDialog() {
        int collectionSizeOrDefault;
        Context context = getContext();
        if (context == null) {
            return;
        }
        o2.e eVar = new o2.e(context);
        BottomSheetCategoriesBinding inflate = BottomSheetCategoriesBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        List sortedWith = CollectionsKt.sortedWith(getViewModel().avisaStations(), new Comparator() { // from class: com.adif.elcanomovil.uiAvisa.components.create.NewIssueFragment$promptStationsDialog$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t2, T t4) {
                return ComparisonsKt.compareValues(((AvisaStation) t2).getName(), ((AvisaStation) t4).getName());
            }
        });
        BottomSheetListView bottomSheetListView = inflate.listViewBtmSheet;
        int i = R.layout.item_stations_list;
        int i4 = R.id.stationOptionTitle;
        List list = sortedWith;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((AvisaStation) it.next()).getName());
        }
        bottomSheetListView.setAdapter((ListAdapter) new ArrayAdapter(context, i, i4, arrayList));
        inflate.listViewBtmSheet.setOnItemClickListener(new a(this, sortedWith, eVar, 1));
        eVar.setContentView(inflate.getRoot());
        eVar.show();
    }

    public static final void promptStationsDialog$lambda$10(NewIssueFragment this$0, List list, o2.e dialog, AdapterView adapterView, View view, int i, long j4) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(list, "$list");
        Intrinsics.checkNotNullParameter(dialog, "$dialog");
        this$0.getViewModel().setStation((AvisaStation) list.get(i));
        dialog.dismiss();
    }

    public static final void requestCameraPermissions$lambda$0(NewIssueFragment this$0, Map permissions) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        if (Intrinsics.areEqual(permissions.get("android.permission.CAMERA"), Boolean.TRUE)) {
            this$0.getViewModel().onViewAction(NewIssueViewAction.CameraPermissionGranted.INSTANCE);
        }
    }

    public final void requestCategories(String stationId) {
        FragmentAvisaNewBinding fragmentAvisaNewBinding = this.binding;
        FragmentAvisaNewBinding fragmentAvisaNewBinding2 = null;
        if (fragmentAvisaNewBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentAvisaNewBinding = null;
        }
        fragmentAvisaNewBinding.createIssueCategory.setEnabled(false);
        FragmentAvisaNewBinding fragmentAvisaNewBinding3 = this.binding;
        if (fragmentAvisaNewBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            fragmentAvisaNewBinding2 = fragmentAvisaNewBinding3;
        }
        fragmentAvisaNewBinding2.categoryButton.setEnabled(false);
        getViewModel().fetchCategories(stationId);
    }

    public final void selectImageInAlbum() {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.setType("image/*");
        startActivityForResult(intent, 101);
    }

    public final void showProgress(int value) {
        FragmentAvisaNewBinding fragmentAvisaNewBinding = this.binding;
        if (fragmentAvisaNewBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentAvisaNewBinding = null;
        }
        fragmentAvisaNewBinding.loadingViewContainer.setVisibility(value);
    }

    public final void takePhoto(Uri photoURI) {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        intent.putExtra("output", photoURI);
        startActivityForResult(intent, 100);
    }

    @Override // androidx.fragment.app.K
    @Deprecated(message = "Deprecated in Java")
    public void onActivityResult(int requestCode, int resultCode, Intent r4) {
        if (resultCode == -1) {
            if (requestCode == 100) {
                getViewModel().onViewAction(NewIssueViewAction.CameraPictureTaken.INSTANCE);
            } else {
                if (requestCode != 101) {
                    return;
                }
                getViewModel().addBitmapFrom(r4);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [kotlin.jvm.internal.FunctionReferenceImpl, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r0v9, types: [kotlin.jvm.internal.FunctionReferenceImpl, kotlin.jvm.functions.Function1] */
    @Override // androidx.fragment.app.K
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        FragmentAvisaNewBinding bind = FragmentAvisaNewBinding.bind(view);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        FragmentAvisaNewBinding fragmentAvisaNewBinding = null;
        if (bind == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bind = null;
        }
        bind.headerAvisaIssue.updateHeaderInfo(new InfoHeaderData(getString(R.string.avisa_new_issue_screen_title), Integer.valueOf(R.drawable.ic_arrow_back), null, 4, null));
        FragmentAvisaNewBinding fragmentAvisaNewBinding2 = this.binding;
        if (fragmentAvisaNewBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentAvisaNewBinding2 = null;
        }
        fragmentAvisaNewBinding2.headerAvisaIssue.setOnBackActionListener(new d(this, 7));
        FragmentAvisaNewBinding fragmentAvisaNewBinding3 = this.binding;
        if (fragmentAvisaNewBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            fragmentAvisaNewBinding = fragmentAvisaNewBinding3;
        }
        fragmentAvisaNewBinding.headerAvisaIssue.setOnCloseActionListener(new d(this, 8));
        bindViewModel();
        NavigationExtensionsKt.onDestinationResult(NavigationExtensionsKt.findRootNavController(this), NewIssueViewModelKt.AVISA_CREATE_ISSUE, this, new FunctionReferenceImpl(1, this, NewIssueFragment.class, "creationInfoDialogDismissed", "creationInfoDialogDismissed(Lcom/adif/elcanomovil/commonNavGraph/arguments/AlertAction$Style;)V", 0));
        NavigationExtensionsKt.onDestinationResult(NavigationExtensionsKt.findRootNavController(this), NewIssueViewModelKt.AVISA_PRE_CREATE_ISSUE, this, new FunctionReferenceImpl(1, this, NewIssueFragment.class, "handlePreMandatoryUpdateAlertResult", "handlePreMandatoryUpdateAlertResult(Lcom/adif/elcanomovil/commonNavGraph/arguments/AlertAction$Style;)V", 0));
    }
}
