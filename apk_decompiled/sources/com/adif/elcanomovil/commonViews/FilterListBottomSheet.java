package com.adif.elcanomovil.commonViews;

import a.AbstractC0106b;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import androidx.fragment.app.K;
import com.adif.elcanomovil.commonNavGraph.arguments.Filter;
import com.adif.elcanomovil.commonNavGraph.extensions.NavigationExtensionsKt;
import com.adif.elcanomovil.commonViews.databinding.BottomSheetFiltersBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import m3.l;
import o0.C0531h;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ-\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/adif/elcanomovil/commonViews/FilterListBottomSheet;", "Lo2/f;", "<init>", "()V", "Landroid/widget/CheckBox;", "cb", "Lcom/adif/elcanomovil/commonNavGraph/arguments/Filter;", "filter", "", "configView", "(Landroid/widget/CheckBox;Lcom/adif/elcanomovil/commonNavGraph/arguments/Filter;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lcom/adif/elcanomovil/commonViews/FilterListBottomSheetArgs;", "args$delegate", "Lo0/h;", "getArgs", "()Lcom/adif/elcanomovil/commonViews/FilterListBottomSheetArgs;", "args", "common-views_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFilterListBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FilterListBottomSheet.kt\ncom/adif/elcanomovil/commonViews/FilterListBottomSheet\n+ 2 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,80:1\n42#2,3:81\n1855#3,2:84\n*S KotlinDebug\n*F\n+ 1 FilterListBottomSheet.kt\ncom/adif/elcanomovil/commonViews/FilterListBottomSheet\n*L\n18#1:81,3\n38#1:84,2\n*E\n"})
/* loaded from: classes.dex */
public final class FilterListBottomSheet extends o2.f {

    /* renamed from: args$delegate, reason: from kotlin metadata */
    private final C0531h args = new C0531h(Reflection.getOrCreateKotlinClass(FilterListBottomSheetArgs.class), new Function0<Bundle>() { // from class: com.adif.elcanomovil.commonViews.FilterListBottomSheet$special$$inlined$navArgs$1
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

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Filter.values().length];
            try {
                iArr[Filter.FULL_DATA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Filter.ALL_STATIONS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Filter.ALL_STOPS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final void configView(CheckBox cb, Filter filter) {
        cb.setCompoundDrawablesWithIntrinsicBounds(AbstractC0106b.m(requireContext(), filter.getResource()), cb.getCompoundDrawables()[1], filter.getEnable() ? AbstractC0106b.m(requireContext(), R.drawable.ic_baseline_check) : cb.getCompoundDrawables()[1], cb.getCompoundDrawables()[3]);
    }

    private final FilterListBottomSheetArgs getArgs() {
        return (FilterListBottomSheetArgs) this.args.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$4$lambda$1$lambda$0(Filter it, FilterListBottomSheet this$0, CheckBox this_apply, CompoundButton compoundButton, boolean z3) {
        Intrinsics.checkNotNullParameter(it, "$it");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
        it.setEnable(z3);
        this$0.configView(this_apply, it);
        NavigationExtensionsKt.setDestinationResult(l.n(this$0), this$0.getArgs().getKey(), it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$4$lambda$3$lambda$2(Filter it, FilterListBottomSheet this$0, CheckBox this_apply, CompoundButton compoundButton, boolean z3) {
        Intrinsics.checkNotNullParameter(it, "$it");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
        it.setEnable(z3);
        this$0.configView(this_apply, it);
        NavigationExtensionsKt.setDestinationResult(l.n(this$0), this$0.getArgs().getKey(), it);
    }

    @Override // androidx.fragment.app.K
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R.layout.bottom_sheet_filters, container, false);
    }

    @Override // androidx.fragment.app.K
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BottomSheetFiltersBinding bind = BottomSheetFiltersBinding.bind(view);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        bind.getRoot().setBackgroundColor(-16777216);
        for (final Filter filter : getArgs().getValues().getValues()) {
            int i = WhenMappings.$EnumSwitchMapping$0[filter.ordinal()];
            if (i == 1) {
                final CheckBox checkBox = bind.filterAllInfo;
                Intrinsics.checkNotNull(checkBox);
                configView(checkBox, filter);
                checkBox.setChecked(filter.getEnable());
                checkBox.setText(checkBox.getContext().getString(filter.getText()));
                final int i4 = 0;
                checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.adif.elcanomovil.commonViews.b
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z3) {
                        switch (i4) {
                            case 0:
                                FilterListBottomSheet.onViewCreated$lambda$4$lambda$1$lambda$0(filter, this, checkBox, compoundButton, z3);
                                return;
                            default:
                                FilterListBottomSheet.onViewCreated$lambda$4$lambda$3$lambda$2(filter, this, checkBox, compoundButton, z3);
                                return;
                        }
                    }
                });
            } else if (i == 2 || i == 3) {
                final CheckBox checkBox2 = bind.filterAllStations;
                Intrinsics.checkNotNull(checkBox2);
                configView(checkBox2, filter);
                checkBox2.setChecked(filter.getEnable());
                checkBox2.setText(checkBox2.getContext().getString(filter.getText()));
                final int i5 = 1;
                checkBox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.adif.elcanomovil.commonViews.b
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z3) {
                        switch (i5) {
                            case 0:
                                FilterListBottomSheet.onViewCreated$lambda$4$lambda$1$lambda$0(filter, this, checkBox2, compoundButton, z3);
                                return;
                            default:
                                FilterListBottomSheet.onViewCreated$lambda$4$lambda$3$lambda$2(filter, this, checkBox2, compoundButton, z3);
                                return;
                        }
                    }
                });
            }
        }
    }
}
