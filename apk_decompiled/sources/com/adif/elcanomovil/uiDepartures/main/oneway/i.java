package com.adif.elcanomovil.uiDepartures.main.oneway;

import com.adif.elcanomovil.domain.entities.stationObservations.StationObservation;
import com.adif.elcanomovil.main.BottomNavFragmentDirections;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes2.dex */
public final class i extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public CirculationsViewModel f4984a;

    /* renamed from: b, reason: collision with root package name */
    public Collection f4985b;

    /* renamed from: c, reason: collision with root package name */
    public Iterator f4986c;

    /* renamed from: d, reason: collision with root package name */
    public StationObservation f4987d;

    /* renamed from: e, reason: collision with root package name */
    public BottomNavFragmentDirections.Companion f4988e;

    /* renamed from: f, reason: collision with root package name */
    public String f4989f;

    /* renamed from: g, reason: collision with root package name */
    public Collection f4990g;
    public int h;
    public final /* synthetic */ CirculationsViewModel i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(CirculationsViewModel circulationsViewModel, Continuation continuation) {
        super(2, continuation);
        this.i = circulationsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new i(this.i, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x010c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00e2 -> B:5:0x00e3). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.uiDepartures.main.oneway.i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
