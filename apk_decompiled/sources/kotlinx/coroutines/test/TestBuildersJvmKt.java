package kotlinx.coroutines.test;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.debug.internal.DebugProbesImpl;

@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a6\u0010\u0000\u001a\u00020\u00012'\u0010\u0002\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003¢\u0006\u0002\b\u0007H\u0000¢\u0006\u0002\u0010\b\u001a\b\u0010\t\u001a\u00020\u0001H\u0000\u001a\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0000*\n\u0010\r\"\u00020\u00012\u00020\u0001¨\u0006\u000e"}, d2 = {"createTestResult", "", "testProcedure", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function2;)V", "dumpCoroutines", "systemPropertyImpl", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "TestResult", "kotlinx-coroutines-test"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TestBuildersJvmKt {
    public static /* synthetic */ void TestResult$annotations() {
    }

    public static final void createTestResult(Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2) {
        BuildersKt__BuildersKt.runBlocking$default(null, new TestBuildersJvmKt$createTestResult$1(function2, null), 1, null);
    }

    public static final void dumpCoroutines() {
        DebugProbesImpl debugProbesImpl = DebugProbesImpl.INSTANCE;
        if (debugProbesImpl.isInstalled$kotlinx_coroutines_debug()) {
            debugProbesImpl.install$kotlinx_coroutines_core();
            try {
                debugProbesImpl.dumpCoroutines(System.err);
                System.err.flush();
                debugProbesImpl.uninstall$kotlinx_coroutines_core();
            } catch (Throwable th) {
                DebugProbesImpl.INSTANCE.uninstall$kotlinx_coroutines_core();
                throw th;
            }
        }
    }

    public static final String systemPropertyImpl(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
