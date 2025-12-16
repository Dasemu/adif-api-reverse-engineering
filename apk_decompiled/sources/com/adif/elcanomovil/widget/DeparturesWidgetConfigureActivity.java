package com.adif.elcanomovil.widget;

import B0.w;
import O.J;
import O.L;
import O.X;
import a.AbstractC0105a;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.adif.elcanomovil.widget.databinding.DeparturesWidgetConfigureBinding;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rR\"\u0010\u000f\u001a\u00020\u000e8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/adif/elcanomovil/widget/DeparturesWidgetConfigureActivity;", "Lg/k;", "Lcom/adif/elcanomovil/widget/ConfigActivityParent;", "<init>", "()V", "Landroid/os/Bundle;", "icicle", "", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/content/Context;", "context", "taskDone", "(Landroid/content/Context;)V", "", "appWidgetId", "I", "getAppWidgetId", "()I", "setAppWidgetId", "(I)V", "widget_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes3.dex */
public final class DeparturesWidgetConfigureActivity extends Hilt_DeparturesWidgetConfigureActivity implements ConfigActivityParent {
    private int appWidgetId;

    @Override // com.adif.elcanomovil.widget.ConfigActivityParent
    public int getAppWidgetId() {
        return this.appWidgetId;
    }

    @Override // com.adif.elcanomovil.widget.Hilt_DeparturesWidgetConfigureActivity, androidx.fragment.app.P, b.o, C.AbstractActivityC0048l, android.app.Activity
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setResult(0);
        Intrinsics.checkNotNullParameter(this, "activity");
        AbstractC0105a.O(getWindow(), false);
        DeparturesWidgetConfigureBinding inflate = DeparturesWidgetConfigureBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        setContentView(inflate.getRoot());
        View rootView = findViewById(android.R.id.content);
        Intrinsics.checkNotNullExpressionValue(rootView, "findViewById(...)");
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        w wVar = new w(20);
        WeakHashMap weakHashMap = X.f1226a;
        L.u(rootView, wVar);
        J.c(rootView);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            setAppWidgetId(extras.getInt("appWidgetId", 0));
        }
        if (getAppWidgetId() == 0) {
            finish();
        }
    }

    @Override // com.adif.elcanomovil.widget.ConfigActivityParent
    public void setAppWidgetId(int i) {
        this.appWidgetId = i;
    }

    @Override // com.adif.elcanomovil.widget.ConfigActivityParent
    public void taskDone(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intent intent = new Intent(context, (Class<?>) DeparturesWidget.class);
        intent.putExtra("appWidgetId", getAppWidgetId());
        intent.setAction("android.appwidget.action.APPWIDGET_UPDATE");
        sendBroadcast(intent);
        PendingIntent.getBroadcast(context, getAppWidgetId(), intent, 201326592);
        new Intent().putExtra("appWidgetId", getAppWidgetId());
        setResult(-1, intent);
        finish();
    }
}
