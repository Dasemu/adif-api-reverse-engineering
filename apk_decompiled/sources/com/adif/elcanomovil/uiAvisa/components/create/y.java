package com.adif.elcanomovil.uiAvisa.components.create;

import com.adif.elcanomovil.uiAvisa.components.create.NavigateTo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.channels.Channel;

/* loaded from: classes.dex */
public final class y extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NewIssueViewModel f4875a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(NewIssueViewModel newIssueViewModel) {
        super(1);
        this.f4875a = newIssueViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Channel channel;
        ((Boolean) obj).booleanValue();
        channel = this.f4875a._navigation;
        channel.mo1630trySendJP2dKIU(NavigateTo.NavigateUp.INSTANCE);
        return Unit.INSTANCE;
    }
}
