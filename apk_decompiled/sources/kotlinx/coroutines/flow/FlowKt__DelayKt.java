package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.OverloadResolutionByLambdaReturnType;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.time.Duration;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.FlowPreview;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.internal.FlowCoroutineKt;

@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u001a2\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00050\u0004H\u0007\u001a7\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00070\u0004H\u0007¢\u0006\u0002\b\b\u001a&\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0005H\u0007\u001a0\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a7\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0002\b\r\u001a$\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u0005H\u0000\u001a&\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u0005H\u0007\u001a0\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\n\u001a0\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\n\u001a0\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, d2 = {"debounce", "Lkotlinx/coroutines/flow/Flow;", "T", "timeoutMillis", "Lkotlin/Function1;", "", "timeout", "Lkotlin/time/Duration;", "debounceDuration", "debounce-HG0u8IE", "(Lkotlinx/coroutines/flow/Flow;J)Lkotlinx/coroutines/flow/Flow;", "debounceInternal", "timeoutMillisSelector", "debounceInternal$FlowKt__DelayKt", "fixedPeriodTicker", "Lkotlinx/coroutines/channels/ReceiveChannel;", "", "Lkotlinx/coroutines/CoroutineScope;", "delayMillis", "initialDelayMillis", "sample", "periodMillis", "period", "sample-HG0u8IE", "timeout-HG0u8IE", "timeoutInternal", "timeoutInternal-HG0u8IE$FlowKt__DelayKt", "kotlinx-coroutines-core"}, k = 5, mv = {1, 9, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
@SourceDebugExtension({"SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,415:1\n1#2:416\n*E\n"})
/* loaded from: classes3.dex */
public final /* synthetic */ class FlowKt__DelayKt {
    /* JADX WARN: Multi-variable type inference failed */
    @FlowPreview
    public static final <T> Flow<T> debounce(Flow<? extends T> flow, final long j4) {
        if (j4 >= 0) {
            return j4 == 0 ? flow : debounceInternal$FlowKt__DelayKt(flow, new Function1<T, Long>() { // from class: kotlinx.coroutines.flow.FlowKt__DelayKt$debounce$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function1
                public final Long invoke(T t2) {
                    return Long.valueOf(j4);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Long invoke(Object obj) {
                    return invoke((FlowKt__DelayKt$debounce$2<T>) obj);
                }
            });
        }
        throw new IllegalArgumentException("Debounce timeout should not be negative");
    }

    @FlowPreview
    /* renamed from: debounce-HG0u8IE */
    public static final <T> Flow<T> m1663debounceHG0u8IE(Flow<? extends T> flow, long j4) {
        return FlowKt.debounce(flow, DelayKt.m1620toDelayMillisLRDsOJo(j4));
    }

    @FlowPreview
    @OverloadResolutionByLambdaReturnType
    @JvmName(name = "debounceDuration")
    public static final <T> Flow<T> debounceDuration(Flow<? extends T> flow, final Function1<? super T, Duration> function1) {
        return debounceInternal$FlowKt__DelayKt(flow, new Function1<T, Long>() { // from class: kotlinx.coroutines.flow.FlowKt__DelayKt$debounce$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Long invoke(Object obj) {
                return invoke((FlowKt__DelayKt$debounce$3<T>) obj);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function1
            public final Long invoke(T t2) {
                return Long.valueOf(DelayKt.m1620toDelayMillisLRDsOJo(function1.invoke(t2).getRawValue()));
            }
        });
    }

    private static final <T> Flow<T> debounceInternal$FlowKt__DelayKt(Flow<? extends T> flow, Function1<? super T, Long> function1) {
        return FlowCoroutineKt.scopedFlow(new FlowKt__DelayKt$debounceInternal$1(function1, flow, null));
    }

    public static final ReceiveChannel<Unit> fixedPeriodTicker(CoroutineScope coroutineScope, long j4, long j5) {
        if (j4 < 0) {
            throw new IllegalArgumentException(("Expected non-negative delay, but has " + j4 + " ms").toString());
        }
        if (j5 >= 0) {
            return ProduceKt.produce$default(coroutineScope, null, 0, new FlowKt__DelayKt$fixedPeriodTicker$3(j5, j4, null), 1, null);
        }
        throw new IllegalArgumentException(("Expected non-negative initial delay, but has " + j5 + " ms").toString());
    }

    public static /* synthetic */ ReceiveChannel fixedPeriodTicker$default(CoroutineScope coroutineScope, long j4, long j5, int i, Object obj) {
        if ((i & 2) != 0) {
            j5 = j4;
        }
        return FlowKt.fixedPeriodTicker(coroutineScope, j4, j5);
    }

    @FlowPreview
    public static final <T> Flow<T> sample(Flow<? extends T> flow, long j4) {
        if (j4 > 0) {
            return FlowCoroutineKt.scopedFlow(new FlowKt__DelayKt$sample$2(j4, flow, null));
        }
        throw new IllegalArgumentException("Sample period should be positive");
    }

    @FlowPreview
    /* renamed from: sample-HG0u8IE */
    public static final <T> Flow<T> m1664sampleHG0u8IE(Flow<? extends T> flow, long j4) {
        return FlowKt.sample(flow, DelayKt.m1620toDelayMillisLRDsOJo(j4));
    }

    @FlowPreview
    /* renamed from: timeout-HG0u8IE */
    public static final <T> Flow<T> m1665timeoutHG0u8IE(Flow<? extends T> flow, long j4) {
        return m1666timeoutInternalHG0u8IE$FlowKt__DelayKt(flow, j4);
    }

    /* renamed from: timeoutInternal-HG0u8IE$FlowKt__DelayKt */
    private static final <T> Flow<T> m1666timeoutInternalHG0u8IE$FlowKt__DelayKt(Flow<? extends T> flow, long j4) {
        return FlowCoroutineKt.scopedFlow(new FlowKt__DelayKt$timeoutInternal$1(j4, flow, null));
    }

    @FlowPreview
    @OverloadResolutionByLambdaReturnType
    public static final <T> Flow<T> debounce(Flow<? extends T> flow, Function1<? super T, Long> function1) {
        return debounceInternal$FlowKt__DelayKt(flow, function1);
    }
}
