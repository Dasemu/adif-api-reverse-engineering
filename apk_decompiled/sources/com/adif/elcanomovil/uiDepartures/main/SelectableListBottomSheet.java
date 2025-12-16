package com.adif.elcanomovil.uiDepartures.main;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import androidx.fragment.app.K;
import com.adif.elcanomovil.commonNavGraph.extensions.NavigationExtensionsKt;
import com.adif.elcanomovil.commonViews.databinding.BottomSheetListBinding;
import com.adif.elcanomovil.uiDepartures.R;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import o0.C0531h;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/adif/elcanomovil/uiDepartures/main/SelectableListBottomSheet;", "Lo2/f;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lcom/adif/elcanomovil/commonViews/databinding/BottomSheetListBinding;", "binding", "Lcom/adif/elcanomovil/commonViews/databinding/BottomSheetListBinding;", "Lcom/adif/elcanomovil/uiDepartures/main/SelectableListBottomSheetArgs;", "args$delegate", "Lo0/h;", "getArgs", "()Lcom/adif/elcanomovil/uiDepartures/main/SelectableListBottomSheetArgs;", "args", "ui-departures_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSelectableListBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectableListBottomSheet.kt\ncom/adif/elcanomovil/uiDepartures/main/SelectableListBottomSheet\n+ 2 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,50:1\n42#2,3:51\n1#3:54\n*S KotlinDebug\n*F\n+ 1 SelectableListBottomSheet.kt\ncom/adif/elcanomovil/uiDepartures/main/SelectableListBottomSheet\n*L\n18#1:51,3\n*E\n"})
/* loaded from: classes2.dex */
public final class SelectableListBottomSheet extends o2.f {

    /* renamed from: args$delegate, reason: from kotlin metadata */
    private final C0531h args = new C0531h(Reflection.getOrCreateKotlinClass(SelectableListBottomSheetArgs.class), new Function0<Bundle>() { // from class: com.adif.elcanomovil.uiDepartures.main.SelectableListBottomSheet$special$$inlined$navArgs$1
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
    private BottomSheetListBinding binding;

    private final SelectableListBottomSheetArgs getArgs() {
        return (SelectableListBottomSheetArgs) this.args.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$1(SelectableListBottomSheet this$0, AdapterView adapterView, View view, int i, long j4) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dismiss();
        NavigationExtensionsKt.setDestinationResult(m3.l.n(this$0), this$0.getArgs().getKey(), Integer.valueOf(i));
    }

    @Override // androidx.fragment.app.K
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        super.onCreateView(inflater, container, savedInstanceState);
        BottomSheetListBinding inflate = BottomSheetListBinding.inflate(inflater, container, false);
        Intrinsics.checkNotNull(inflate);
        this.binding = inflate;
        LinearLayout root = inflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.K
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BottomSheetListBinding bottomSheetListBinding = this.binding;
        BottomSheetListBinding bottomSheetListBinding2 = null;
        if (bottomSheetListBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bottomSheetListBinding = null;
        }
        bottomSheetListBinding.listViewBtmSheet.setAdapter((ListAdapter) new ArrayAdapter(view.getContext(), R.layout.item_category_list, R.id.stationCategoryTitle, getArgs().getValues()));
        BottomSheetListBinding bottomSheetListBinding3 = this.binding;
        if (bottomSheetListBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            bottomSheetListBinding2 = bottomSheetListBinding3;
        }
        bottomSheetListBinding2.listViewBtmSheet.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.adif.elcanomovil.uiDepartures.main.l
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view2, int i, long j4) {
                SelectableListBottomSheet.onViewCreated$lambda$1(SelectableListBottomSheet.this, adapterView, view2, i, j4);
            }
        });
    }
}
