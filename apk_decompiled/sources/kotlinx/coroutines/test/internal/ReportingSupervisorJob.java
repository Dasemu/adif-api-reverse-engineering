package kotlinx.coroutines.test.internal;

import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineExceptionHandlerKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobImpl;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B%\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\u0010\bJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0006H\u0016R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/test/internal/ReportingSupervisorJob;", "Lkotlinx/coroutines/JobImpl;", "parent", "Lkotlinx/coroutines/Job;", "onChildCancellation", "Lkotlin/Function1;", "", "", "(Lkotlinx/coroutines/Job;Lkotlin/jvm/functions/Function1;)V", "getOnChildCancellation", "()Lkotlin/jvm/functions/Function1;", "childCancelled", "", "cause", "kotlinx-coroutines-test"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nReportingSupervisorJob.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReportingSupervisorJob.kt\nkotlinx/coroutines/test/internal/ReportingSupervisorJob\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,25:1\n1#2:26\n*E\n"})
/* loaded from: classes3.dex */
public final class ReportingSupervisorJob extends JobImpl {
    private final Function1<Throwable, Unit> onChildCancellation;

    public /* synthetic */ ReportingSupervisorJob(Job job, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : job, function1);
    }

    @Override // kotlinx.coroutines.JobSupport
    public boolean childCancelled(Throwable cause) {
        try {
            this.onChildCancellation.invoke(cause);
        } catch (Throwable th) {
            ExceptionsKt.addSuppressed(cause, th);
            CoroutineExceptionHandlerKt.handleCoroutineException(this, cause);
        }
        Unit unit = Unit.INSTANCE;
        return false;
    }

    public final Function1<Throwable, Unit> getOnChildCancellation() {
        return this.onChildCancellation;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ReportingSupervisorJob(Job job, Function1<? super Throwable, Unit> function1) {
        super(job);
        this.onChildCancellation = function1;
    }
}
