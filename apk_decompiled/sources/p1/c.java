package p1;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes.dex */
public final class c implements FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public static final c f8120a = new Object();

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        return Unit.INSTANCE;
    }
}
