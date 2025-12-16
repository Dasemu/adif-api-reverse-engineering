package com.adif.elcanomovil.observers;

import a1.C0107a;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import t3.a;
import t3.b;
import t3.c;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0002J\u000e\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0002\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/adif/elcanomovil/observers/LoggerObserver;", "Lcom/adif/elcanomovil/observers/ApplicationObserver;", "firebaseCrashlytics", "Lcom/google/firebase/crashlytics/FirebaseCrashlytics;", "(Lcom/google/firebase/crashlytics/FirebaseCrashlytics;)V", "configureLoggerInstance", "", "start", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LoggerObserver implements ApplicationObserver {
    private final FirebaseCrashlytics firebaseCrashlytics;

    public LoggerObserver(FirebaseCrashlytics firebaseCrashlytics) {
        Intrinsics.checkNotNullParameter(firebaseCrashlytics, "firebaseCrashlytics");
        this.firebaseCrashlytics = firebaseCrashlytics;
    }

    private final void configureLoggerInstance() {
        a aVar = c.f8551a;
        C0107a tree = new C0107a(this.firebaseCrashlytics);
        aVar.getClass();
        Intrinsics.checkNotNullParameter(tree, "tree");
        if (tree == aVar) {
            throw new IllegalArgumentException("Cannot plant Timber into itself.");
        }
        ArrayList arrayList = c.f8552b;
        synchronized (arrayList) {
            arrayList.add(tree);
            Object[] array = arrayList.toArray(new b[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            c.f8553c = (b[]) array;
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // com.adif.elcanomovil.observers.ApplicationObserver
    public Object start(Continuation<? super Unit> continuation) {
        configureLoggerInstance();
        return Unit.INSTANCE;
    }
}
