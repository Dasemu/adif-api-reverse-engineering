package com.adif.elcanomovil.widget;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.adif.elcanomovil.widget.DeparturesWidgetViewAction;
import dagger.hilt.android.AndroidEntryPoint;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0016"}, d2 = {"Lcom/adif/elcanomovil/widget/DeparturesWidget;", "Landroid/appwidget/AppWidgetProvider;", "()V", "viewModel", "Lcom/adif/elcanomovil/widget/DeparturesWidgetViewModel;", "getViewModel", "()Lcom/adif/elcanomovil/widget/DeparturesWidgetViewModel;", "setViewModel", "(Lcom/adif/elcanomovil/widget/DeparturesWidgetViewModel;)V", "widgetPayloadHandler", "Lcom/adif/elcanomovil/widget/WidgetPayloadHandler;", "getWidgetPayloadHandler", "()Lcom/adif/elcanomovil/widget/WidgetPayloadHandler;", "setWidgetPayloadHandler", "(Lcom/adif/elcanomovil/widget/WidgetPayloadHandler;)V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "Companion", "widget_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes3.dex */
public final class DeparturesWidget extends Hilt_DeparturesWidget {
    public static final String ACTION_APPWIDGET_CHANGE_WAY = "changeWays";

    @Inject
    public DeparturesWidgetViewModel viewModel;

    @Inject
    public WidgetPayloadHandler widgetPayloadHandler;

    public final DeparturesWidgetViewModel getViewModel() {
        DeparturesWidgetViewModel departuresWidgetViewModel = this.viewModel;
        if (departuresWidgetViewModel != null) {
            return departuresWidgetViewModel;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        return null;
    }

    public final WidgetPayloadHandler getWidgetPayloadHandler() {
        WidgetPayloadHandler widgetPayloadHandler = this.widgetPayloadHandler;
        if (widgetPayloadHandler != null) {
            return widgetPayloadHandler;
        }
        Intrinsics.throwUninitializedPropertyAccessException("widgetPayloadHandler");
        return null;
    }

    @Override // com.adif.elcanomovil.widget.Hilt_DeparturesWidget, android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Bundle extras;
        Intrinsics.checkNotNullParameter(context, "context");
        super.onReceive(context, intent);
        if (intent == null || (extras = intent.getExtras()) == null) {
            return;
        }
        int i = extras.getInt("appWidgetId", 0);
        if (i == 0) {
            getViewModel().onViewAction(DeparturesWidgetViewAction.UpdateAll.INSTANCE);
            return;
        }
        WidgetPayload handlePayload = getWidgetPayloadHandler().handlePayload(extras);
        String action = intent.getAction();
        if (action != null) {
            int hashCode = action.hashCode();
            if (hashCode == -2131836108) {
                if (action.equals(ACTION_APPWIDGET_CHANGE_WAY)) {
                    getViewModel().onViewAction(new DeparturesWidgetViewAction.ChangeWay(i, handlePayload));
                }
            } else if (hashCode == -689938766) {
                if (action.equals("android.appwidget.action.APPWIDGET_UPDATE_OPTIONS")) {
                    getViewModel().onViewAction(new DeparturesWidgetViewAction.Update(i, handlePayload));
                }
            } else if (hashCode == 452171151) {
                action.equals("android.appwidget.action.APPWIDGET_DELETED");
            } else if (hashCode == 1619576947 && action.equals("android.appwidget.action.APPWIDGET_UPDATE")) {
                getViewModel().onViewAction(new DeparturesWidgetViewAction.Update(i, handlePayload));
            }
        }
    }

    public final void setViewModel(DeparturesWidgetViewModel departuresWidgetViewModel) {
        Intrinsics.checkNotNullParameter(departuresWidgetViewModel, "<set-?>");
        this.viewModel = departuresWidgetViewModel;
    }

    public final void setWidgetPayloadHandler(WidgetPayloadHandler widgetPayloadHandler) {
        Intrinsics.checkNotNullParameter(widgetPayloadHandler, "<set-?>");
        this.widgetPayloadHandler = widgetPayloadHandler;
    }
}
