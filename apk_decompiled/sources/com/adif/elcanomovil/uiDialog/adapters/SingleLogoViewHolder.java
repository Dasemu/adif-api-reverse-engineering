package com.adif.elcanomovil.uiDialog.adapters;

import I0.a;
import I0.h;
import I0.p;
import S0.i;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.I0;
import com.adif.elcanomovil.uiDialog.databinding.ItemSingleLogoBinding;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/adif/elcanomovil/uiDialog/adapters/SingleLogoViewHolder;", "Landroidx/recyclerview/widget/I0;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "", "item", "", "bind", "(Ljava/lang/String;)V", "Lcom/adif/elcanomovil/uiDialog/databinding/ItemSingleLogoBinding;", "itemBinding", "Lcom/adif/elcanomovil/uiDialog/databinding/ItemSingleLogoBinding;", "ui-dialog_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSingleLogoAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SingleLogoAdapter.kt\ncom/adif/elcanomovil/uiDialog/adapters/SingleLogoViewHolder\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 Extensions.kt\ncoil/-SingletonExtensions$load$1\n*L\n1#1,51:1\n54#2,3:52\n24#2:55\n57#2,6:56\n63#2,2:63\n57#3:62\n*S KotlinDebug\n*F\n+ 1 SingleLogoAdapter.kt\ncom/adif/elcanomovil/uiDialog/adapters/SingleLogoViewHolder\n*L\n48#1:52,3\n48#1:55\n48#1:56,6\n48#1:63,2\n48#1:62\n*E\n"})
/* loaded from: classes2.dex */
public final class SingleLogoViewHolder extends I0 {
    private final ItemSingleLogoBinding itemBinding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleLogoViewHolder(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        ItemSingleLogoBinding bind = ItemSingleLogoBinding.bind(itemView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.itemBinding = bind;
    }

    public final void bind(String item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ImageView icon = this.itemBinding.icon;
        Intrinsics.checkNotNullExpressionValue(icon, "icon");
        h a2 = a.a(icon.getContext());
        i iVar = new i(icon.getContext());
        iVar.f1464c = item;
        iVar.c(icon);
        ((p) a2).b(iVar.a());
    }
}
