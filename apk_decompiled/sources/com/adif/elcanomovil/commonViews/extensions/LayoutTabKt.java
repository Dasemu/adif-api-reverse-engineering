package com.adif.elcanomovil.commonViews.extensions;

import H2.h;
import H2.k;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u0004\u0018\u00010\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LH2/h;", "", "style", "", "setTabTextStyle", "(LH2/h;I)V", "common-views_proNon_corporateRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLayoutTab.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutTab.kt\ncom/adif/elcanomovil/commonViews/extensions/LayoutTabKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,20:1\n1855#2,2:21\n*S KotlinDebug\n*F\n+ 1 LayoutTab.kt\ncom/adif/elcanomovil/commonViews/extensions/LayoutTabKt\n*L\n14#1:21,2\n*E\n"})
/* loaded from: classes.dex */
public final class LayoutTabKt {
    public static final void setTabTextStyle(h hVar, int i) {
        k kVar;
        ArrayList<View> arrayList = new ArrayList<>();
        if (hVar != null && (kVar = hVar.f708e) != null) {
            kVar.findViewsWithText(arrayList, hVar.f704a, 1);
        }
        for (View view : arrayList) {
            if (view instanceof TextView) {
                ((TextView) view).setTextAppearance(i);
            }
        }
    }
}
