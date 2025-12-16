package kotlinx.coroutines.test;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.time.Duration;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class TestBuildersKt__TestBuildersKt$DEFAULT_TIMEOUT$1$1 extends FunctionReferenceImpl implements Function1<String, Duration> {
    public TestBuildersKt__TestBuildersKt$DEFAULT_TIMEOUT$1$1(Object obj) {
        super(1, obj, Duration.Companion.class, "parse", "parse-UwyO8pc(Ljava/lang/String;)J", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Duration invoke(String str) {
        return Duration.m1453boximpl(m1710invoke5sfh64U(str));
    }

    /* renamed from: invoke-5sfh64U, reason: not valid java name */
    public final long m1710invoke5sfh64U(String str) {
        return ((Duration.Companion) this.receiver).m1574parseUwyO8pc(str);
    }
}
