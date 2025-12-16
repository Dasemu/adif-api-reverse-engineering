package com.adif.elcanomovil.uiMoreAdif;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class a extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final a f5154a = new Lambda(0);

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return CollectionsKt.listOf((Object[]) new HelpItem[]{new HelpItem(HelpActions.HOME_DRAG, R.drawable.img_home_detail_controller), new HelpItem(HelpActions.HOME_MENU, R.drawable.ic_action_more), new HelpItem(HelpActions.DEPARTURES_SHARE, R.drawable.ic_share), new HelpItem(HelpActions.DEPARTURES_NOT_SELECTED_FAV, R.drawable.ic_favourite_off), new HelpItem(HelpActions.DEPARTURES_SELECTED_FAV, R.drawable.ic_favourite_on), new HelpItem(HelpActions.DEPARTURES_CREATE_SUSCRIPTION, R.drawable.ic_subscription), new HelpItem(HelpActions.DIRECTION_CHANGE, R.drawable.ic_between_stations_switch), new HelpItem(HelpActions.CIRCULATION_POSITION_BETWEEN_STATIONS, R.drawable.circle_train_yellow), new HelpItem(HelpActions.CIRCULATION_POSITION_IN_STATION, R.drawable.circle_train_green)});
    }
}
