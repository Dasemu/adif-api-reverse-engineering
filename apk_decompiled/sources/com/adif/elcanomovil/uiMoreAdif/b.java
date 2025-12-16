package com.adif.elcanomovil.uiMoreAdif;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class b extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final b f5167a = new Lambda(0);

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return CollectionsKt.listOf((Object[]) new MoreItem[]{new MoreItem(MoreActions.TRAIN, R.drawable.ic_train), new MoreItem(MoreActions.SUBSCRIPTIONS, R.drawable.ic_subscription_filled), new MoreItem(MoreActions.FAVOURITES, R.drawable.ic_favourite_on), new MoreItem(MoreActions.NETWORK_STATUS, R.drawable.ic_network_status), new MoreItem(MoreActions.ACCESSIBILITY, R.drawable.ic_accessibility), new MoreItem(MoreActions.LOST_OBJECTS, R.drawable.ic_lost_objects), new MoreItem(MoreActions.NOTICES, R.drawable.ic_notices), new MoreItem(MoreActions.HELP, R.drawable.ic_help), new MoreItem(MoreActions.CONTACT, R.drawable.ic_contact), new MoreItem(MoreActions.ABOUT, R.drawable.ic_about)});
    }
}
