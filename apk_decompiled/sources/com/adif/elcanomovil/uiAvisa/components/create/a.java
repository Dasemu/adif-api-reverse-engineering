package com.adif.elcanomovil.uiAvisa.components.create;

import android.view.View;
import android.widget.AdapterView;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4825a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NewIssueFragment f4826b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f4827c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o2.e f4828d;

    public /* synthetic */ a(NewIssueFragment newIssueFragment, List list, o2.e eVar, int i) {
        this.f4825a = i;
        this.f4826b = newIssueFragment;
        this.f4827c = list;
        this.f4828d = eVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j4) {
        switch (this.f4825a) {
            case 0:
                NewIssueFragment.promptCategoriesDialog$lambda$7(this.f4826b, this.f4827c, this.f4828d, adapterView, view, i, j4);
                return;
            default:
                NewIssueFragment.promptStationsDialog$lambda$10(this.f4826b, this.f4827c, this.f4828d, adapterView, view, i, j4);
                return;
        }
    }
}
