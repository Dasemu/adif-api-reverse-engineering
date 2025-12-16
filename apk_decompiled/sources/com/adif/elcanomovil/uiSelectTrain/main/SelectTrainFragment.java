package com.adif.elcanomovil.uiSelectTrain.main;

import android.graphics.Rect;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.K;
import androidx.lifecycle.C0;
import androidx.lifecycle.D0;
import androidx.lifecycle.InterfaceC0200v;
import androidx.lifecycle.J;
import androidx.lifecycle.y0;
import androidx.recyclerview.widget.AbstractC0232n0;
import androidx.recyclerview.widget.E0;
import androidx.recyclerview.widget.RecyclerView;
import b1.InterfaceC0266a;
import com.adif.elcanomovil.commonNavGraph.arguments.NavArguments;
import com.adif.elcanomovil.commonNavGraph.navigation.NavigationHandler;
import com.adif.elcanomovil.commonViews.databinding.LoadingEmptyOrErrorCommonViewBinding;
import com.adif.elcanomovil.commonViews.includeViews.LoadingEmptyOrErrorView;
import com.adif.elcanomovil.uiSelectTrain.R;
import com.adif.elcanomovil.uiSelectTrain.databinding.FragmentSelectTrainBinding;
import com.adif.elcanomovil.uiSelectTrain.entities.TrainInfo;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.material.textfield.TextInputEditText;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import l0.C0435a;

@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0003J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0003JQ\u0010\u0013\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010\"\u001a\u00020\u00042\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0004H\u0002¢\u0006\u0004\b$\u0010\u0003J\u000f\u0010%\u001a\u00020\u0004H\u0002¢\u0006\u0004\b%\u0010\u0003J+\u0010-\u001a\u00020,2\u0006\u0010'\u001a\u00020&2\b\u0010)\u001a\u0004\u0018\u00010(2\b\u0010+\u001a\u0004\u0018\u00010*H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0004H\u0016¢\u0006\u0004\b/\u0010\u0003J\u000f\u00100\u001a\u00020\u0004H\u0016¢\u0006\u0004\b0\u0010\u0003R\u0016\u00102\u001a\u0002018\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b2\u00103R\u001b\u00109\u001a\u0002048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R3\u0010?\u001a!\u0012\u0013\u0012\u00110\u001e¢\u0006\f\b;\u0012\b\b<\u0012\u0004\b\b(=\u0012\u0004\u0012\u00020\u00040:j\u0002`>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010B\u001a\u00020A8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bB\u0010C¨\u0006D"}, d2 = {"Lcom/adif/elcanomovil/uiSelectTrain/main/SelectTrainFragment;", "Landroidx/fragment/app/K;", "<init>", "()V", "", "configureViews", "configureObservers", "configureViewListeners", "onBack", "", NavArguments.ARG_DYNAMIC_LINKS_OPERATOR, NavArguments.ARG_DYNAMIC_LINKS_COMMERCIAL_PRODUCT, NavArguments.ARG_DYNAMIC_LINKS_COMMERCIAL_NUMBER, NavArguments.ARG_DYNAMIC_LINKS_STATION_CODE, NavArguments.ARG_DYNAMIC_LINKS_STATION_TO_CODE, "", "date", NavArguments.ARG_DYNAMIC_LINKS_LAUNCHDATE, "observation", "onTapTrain", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;)V", "Lcom/adif/elcanomovil/commonViews/includeViews/LoadingEmptyOrErrorView$Status;", "status", "title", "message", "updateVisibility", "(Lcom/adif/elcanomovil/commonViews/includeViews/LoadingEmptyOrErrorView$Status;Ljava/lang/String;Ljava/lang/String;)V", "updateSearchResultTitle", "(Ljava/lang/String;)V", "", "Lcom/adif/elcanomovil/uiSelectTrain/entities/TrainInfo;", "trainList", "", "previousSearch", "updatedSelectedTrainViews", "(Ljava/util/List;Z)V", "hideKeyboard", "showKeyboard", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onResume", "onPause", "Lcom/adif/elcanomovil/uiSelectTrain/databinding/FragmentSelectTrainBinding;", "binding", "Lcom/adif/elcanomovil/uiSelectTrain/databinding/FragmentSelectTrainBinding;", "Lcom/adif/elcanomovil/uiSelectTrain/main/SelectTrainViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "getViewModel", "()Lcom/adif/elcanomovil/uiSelectTrain/main/SelectTrainViewModel;", "viewModel", "Lkotlin/Function1;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, NavArguments.ARG_DYNAMIC_TRAIN, "Lcom/adif/elcanomovil/uiSelectTrain/main/OnTrainSelected;", "onTapStation", "Lkotlin/jvm/functions/Function1;", "Lcom/adif/elcanomovil/uiSelectTrain/main/SelectTrainAdapter;", "adapter", "Lcom/adif/elcanomovil/uiSelectTrain/main/SelectTrainAdapter;", "ui-select-train_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension({"SMAP\nSelectTrainFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectTrainFragment.kt\ncom/adif/elcanomovil/uiSelectTrain/main/SelectTrainFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt\n*L\n1#1,246:1\n106#2,15:247\n49#3:262\n65#3,16:263\n93#3,3:279\n*S KotlinDebug\n*F\n+ 1 SelectTrainFragment.kt\ncom/adif/elcanomovil/uiSelectTrain/main/SelectTrainFragment\n*L\n29#1:247,15\n155#1:262\n155#1:263,16\n155#1:279,3\n*E\n"})
/* loaded from: classes2.dex */
public final class SelectTrainFragment extends Hilt_SelectTrainFragment {
    private SelectTrainAdapter adapter;
    private FragmentSelectTrainBinding binding;
    private final Function1<TrainInfo, Unit> onTapStation;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final Lazy viewModel;

    public SelectTrainFragment() {
        super(R.layout.fragment_select_train);
        final Function0<K> function0 = new Function0<K>() { // from class: com.adif.elcanomovil.uiSelectTrain.main.SelectTrainFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final K invoke() {
                return K.this;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<D0>() { // from class: com.adif.elcanomovil.uiSelectTrain.main.SelectTrainFragment$special$$inlined$viewModels$default$2
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
        this.viewModel = m3.d.n(this, Reflection.getOrCreateKotlinClass(SelectTrainViewModel.class), new Function0<C0>() { // from class: com.adif.elcanomovil.uiSelectTrain.main.SelectTrainFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final C0 invoke() {
                return ((D0) Lazy.this.getValue()).getViewModelStore();
            }
        }, new Function0<l0.c>() { // from class: com.adif.elcanomovil.uiSelectTrain.main.SelectTrainFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<y0>() { // from class: com.adif.elcanomovil.uiSelectTrain.main.SelectTrainFragment$special$$inlined$viewModels$default$5
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
        this.onTapStation = new I1.b(this, 12);
    }

    private final void configureObservers() {
        getViewModel().getViewData().e(getViewLifecycleOwner(), new com.adif.elcanomovil.uiAvisa.components.create.l(3, new b(this)));
        getViewModel().getSavedSearchData().e(getViewLifecycleOwner(), new com.adif.elcanomovil.uiAvisa.components.create.l(3, new c(this)));
        InterfaceC0266a navigation = getViewModel().getNavigation();
        J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        ((b1.f) navigation).a(viewLifecycleOwner, new NavigationHandler(this));
    }

    private final void configureViewListeners() {
        FragmentSelectTrainBinding fragmentSelectTrainBinding = this.binding;
        FragmentSelectTrainBinding fragmentSelectTrainBinding2 = null;
        if (fragmentSelectTrainBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentSelectTrainBinding = null;
        }
        fragmentSelectTrainBinding.btnBack.setOnClickListener(new D1.a(this, 15));
        FragmentSelectTrainBinding fragmentSelectTrainBinding3 = this.binding;
        if (fragmentSelectTrainBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentSelectTrainBinding3 = null;
        }
        RecyclerView recyclerView = fragmentSelectTrainBinding3.layoutSearchResultsView;
        SelectTrainAdapter selectTrainAdapter = this.adapter;
        if (selectTrainAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            selectTrainAdapter = null;
        }
        recyclerView.setAdapter(selectTrainAdapter);
        FragmentSelectTrainBinding fragmentSelectTrainBinding4 = this.binding;
        if (fragmentSelectTrainBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            fragmentSelectTrainBinding2 = fragmentSelectTrainBinding4;
        }
        TextInputEditText textInputEditText = fragmentSelectTrainBinding2.searchBox;
        Intrinsics.checkNotNull(textInputEditText);
        textInputEditText.addTextChangedListener(new TextWatcher() { // from class: com.adif.elcanomovil.uiSelectTrain.main.SelectTrainFragment$configureViewListeners$lambda$4$$inlined$doOnTextChanged$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s4) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence text, int start, int before, int count) {
                SelectTrainViewModel viewModel;
                viewModel = SelectTrainFragment.this.getViewModel();
                viewModel.handleSearchTextChange(String.valueOf(text));
            }
        });
        textInputEditText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.adif.elcanomovil.uiSelectTrain.main.a
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                boolean configureViewListeners$lambda$4$lambda$3;
                configureViewListeners$lambda$4$lambda$3 = SelectTrainFragment.configureViewListeners$lambda$4$lambda$3(SelectTrainFragment.this, textView, i, keyEvent);
                return configureViewListeners$lambda$4$lambda$3;
            }
        });
    }

    public static final void configureViewListeners$lambda$1(SelectTrainFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBack();
    }

    public static final boolean configureViewListeners$lambda$4$lambda$3(SelectTrainFragment this$0, TextView textView, int i, KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (i != 3 && i != 6) {
            return false;
        }
        FragmentSelectTrainBinding fragmentSelectTrainBinding = this$0.binding;
        if (fragmentSelectTrainBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentSelectTrainBinding = null;
        }
        Editable text = fragmentSelectTrainBinding.searchBox.getText();
        if (text != null && text.length() > 0) {
            this$0.hideKeyboard();
        }
        this$0.getViewModel().handleSearchTextIntroduced(String.valueOf(text));
        return true;
    }

    private final void configureViews() {
        FragmentSelectTrainBinding fragmentSelectTrainBinding = this.binding;
        if (fragmentSelectTrainBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentSelectTrainBinding = null;
        }
        fragmentSelectTrainBinding.inputLayout.setHintAnimationEnabled(false);
        this.adapter = new SelectTrainAdapter(this.onTapStation);
        FragmentSelectTrainBinding fragmentSelectTrainBinding2 = this.binding;
        if (fragmentSelectTrainBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentSelectTrainBinding2 = null;
        }
        fragmentSelectTrainBinding2.layoutSearchResultsView.i(new AbstractC0232n0() { // from class: com.adif.elcanomovil.uiSelectTrain.main.SelectTrainFragment$configureViews$1
            @Override // androidx.recyclerview.widget.AbstractC0232n0
            public void getItemOffsets(Rect outRect, View view, RecyclerView parent, E0 state) {
                Intrinsics.checkNotNullParameter(outRect, "outRect");
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(parent, "parent");
                Intrinsics.checkNotNullParameter(state, "state");
                super.getItemOffsets(outRect, view, parent, state);
                outRect.bottom = 16;
            }
        });
        updateVisibility(LoadingEmptyOrErrorView.Status.INIT, null, null);
    }

    public final SelectTrainViewModel getViewModel() {
        return (SelectTrainViewModel) this.viewModel.getValue();
    }

    private final void hideKeyboard() {
        Object systemService = requireActivity().getSystemService("input_method");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(requireView().getWindowToken(), 0);
    }

    private final void onBack() {
        hideKeyboard();
        getViewModel().handleBackPressed();
    }

    public final void onTapTrain(String r12, String r22, String r32, String r4, String r5, long date, long r8, String observation) {
        getViewModel().onTrainTapped(r12, r22, r32, r4, r5, date, r8, observation);
    }

    private final void showKeyboard() {
        Object systemService = requireActivity().getSystemService("input_method");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        inputMethodManager.toggleSoftInput(2, 1);
        FragmentSelectTrainBinding fragmentSelectTrainBinding = this.binding;
        if (fragmentSelectTrainBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentSelectTrainBinding = null;
        }
        inputMethodManager.showSoftInput(fragmentSelectTrainBinding.searchBox, 3);
    }

    private final void updateSearchResultTitle(String title) {
        FragmentSelectTrainBinding fragmentSelectTrainBinding = this.binding;
        if (fragmentSelectTrainBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentSelectTrainBinding = null;
        }
        fragmentSelectTrainBinding.layoutSearchResultsTitle.setText(title);
    }

    public final void updateVisibility(LoadingEmptyOrErrorView.Status status, String title, String message) {
        FragmentSelectTrainBinding fragmentSelectTrainBinding = this.binding;
        FragmentSelectTrainBinding fragmentSelectTrainBinding2 = null;
        if (fragmentSelectTrainBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentSelectTrainBinding = null;
        }
        fragmentSelectTrainBinding.layoutSearchResults.setVisibility(status != LoadingEmptyOrErrorView.Status.HIDDEN ? 8 : 0);
        LoadingEmptyOrErrorView loadingEmptyOrErrorView = LoadingEmptyOrErrorView.INSTANCE;
        FragmentSelectTrainBinding fragmentSelectTrainBinding3 = this.binding;
        if (fragmentSelectTrainBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            fragmentSelectTrainBinding2 = fragmentSelectTrainBinding3;
        }
        LoadingEmptyOrErrorCommonViewBinding loadingEmptyOrErrorView2 = fragmentSelectTrainBinding2.loadingEmptyOrErrorView;
        Intrinsics.checkNotNullExpressionValue(loadingEmptyOrErrorView2, "loadingEmptyOrErrorView");
        loadingEmptyOrErrorView.updateElementsVisibility(loadingEmptyOrErrorView2, status, title, message);
    }

    public final void updatedSelectedTrainViews(List<TrainInfo> trainList, boolean previousSearch) {
        if (previousSearch) {
            String string = getString(R.string.search_train_recent_title);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            updateSearchResultTitle(string);
        } else {
            String string2 = getString(R.string.search_train_title);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            updateSearchResultTitle(string2);
        }
        SelectTrainAdapter selectTrainAdapter = this.adapter;
        if (selectTrainAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            selectTrainAdapter = null;
        }
        selectTrainAdapter.update(trainList);
    }

    @Override // androidx.fragment.app.K
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        super.onCreateView(inflater, container, savedInstanceState);
        FragmentSelectTrainBinding inflate = FragmentSelectTrainBinding.inflate(inflater);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.binding = inflate;
        Bundle arguments = getArguments();
        FragmentSelectTrainBinding fragmentSelectTrainBinding = null;
        String string = arguments != null ? arguments.getString("commercial_number") : null;
        configureViews();
        configureObservers();
        configureViewListeners();
        getViewModel().onViewsLoaded(string);
        FragmentSelectTrainBinding fragmentSelectTrainBinding2 = this.binding;
        if (fragmentSelectTrainBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            fragmentSelectTrainBinding = fragmentSelectTrainBinding2;
        }
        ConstraintLayout root = fragmentSelectTrainBinding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.K
    public void onPause() {
        super.onPause();
        hideKeyboard();
    }

    @Override // androidx.fragment.app.K
    public void onResume() {
        super.onResume();
        FragmentSelectTrainBinding fragmentSelectTrainBinding = this.binding;
        if (fragmentSelectTrainBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentSelectTrainBinding = null;
        }
        fragmentSelectTrainBinding.searchBox.requestFocus();
        showKeyboard();
    }
}
