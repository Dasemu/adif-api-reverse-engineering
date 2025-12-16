package kotlinx.coroutines.debug.internal;

import a.AbstractC0106b;
import com.google.android.gms.measurement.internal.a;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.PublishedApi;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.concurrent.ThreadsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.ranges.RangesKt;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineId;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.debug.internal.DebugProbesImpl;
import kotlinx.coroutines.internal.ScopeCoroutine;
import m3.d;
import u.AbstractC0629f;

@Metadata(d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u0003\n\u0002\b\n\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÁ\u0002\u0018\u00002\u00020\u0001:\u0001}B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J,\u00101\u001a\b\u0012\u0004\u0012\u0002H302\"\u0004\b\u0000\u001032\f\u00104\u001a\b\u0012\u0004\u0012\u0002H3022\b\u00105\u001a\u0004\u0018\u000106H\u0002J\u0010\u00107\u001a\u00020\u00142\u0006\u00108\u001a\u000209H\u0001J\f\u0010:\u001a\b\u0012\u0004\u0012\u00020<0;J\u0011\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00010>¢\u0006\u0002\u0010?J9\u0010@\u001a\b\u0012\u0004\u0012\u0002HA0;\"\b\b\u0000\u0010A*\u00020\u00012\u001e\b\u0004\u0010B\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u0002HA0CH\u0082\bJ\u0010\u0010E\u001a\u00020\u00142\u0006\u00108\u001a\u000209H\u0002J\f\u0010F\u001a\b\u0012\u0004\u0012\u00020G0;J\"\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00040;2\u0006\u0010I\u001a\u00020<2\f\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00040;J\u000e\u0010K\u001a\u00020)2\u0006\u0010I\u001a\u00020<J.\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00040;2\u0006\u0010M\u001a\u00020)2\b\u0010N\u001a\u0004\u0018\u00010'2\f\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00040;H\u0002J=\u0010O\u001a\u000e\u0012\u0004\u0012\u00020Q\u0012\u0004\u0012\u00020Q0P2\u0006\u0010R\u001a\u00020Q2\f\u0010S\u001a\b\u0012\u0004\u0012\u00020\u00040>2\f\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00040;H\u0002¢\u0006\u0002\u0010TJ1\u0010U\u001a\u00020Q2\u0006\u0010V\u001a\u00020Q2\f\u0010S\u001a\b\u0012\u0004\u0012\u00020\u00040>2\f\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00040;H\u0002¢\u0006\u0002\u0010WJ\u0016\u0010X\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013H\u0002J\u0015\u0010Y\u001a\u00020)2\u0006\u0010Z\u001a\u00020*H\u0000¢\u0006\u0002\b[J\r\u0010\\\u001a\u00020\u0014H\u0000¢\u0006\u0002\b]J\u001e\u0010^\u001a\u00020\u00142\u0006\u00108\u001a\u0002092\f\u0010_\u001a\b\u0012\u0004\u0012\u00020\u00040;H\u0002J\u0014\u0010`\u001a\u00020\u00142\n\u0010a\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0002J'\u0010b\u001a\b\u0012\u0004\u0012\u0002H302\"\u0004\b\u0000\u001032\f\u00104\u001a\b\u0012\u0004\u0012\u0002H302H\u0000¢\u0006\u0002\bcJ\u0019\u0010d\u001a\u00020\u00142\n\u00105\u001a\u0006\u0012\u0002\b\u000302H\u0000¢\u0006\u0002\beJ\u0019\u0010f\u001a\u00020\u00142\n\u00105\u001a\u0006\u0012\u0002\b\u000302H\u0000¢\u0006\u0002\bgJ%\u0010h\u001a\b\u0012\u0004\u0012\u00020\u00040;\"\b\b\u0000\u00103*\u00020i2\u0006\u0010j\u001a\u0002H3H\u0002¢\u0006\u0002\u0010kJ\b\u0010l\u001a\u00020\u0014H\u0002J\b\u0010m\u001a\u00020\u0014H\u0002J\r\u0010n\u001a\u00020\u0014H\u0000¢\u0006\u0002\boJ\u0018\u0010p\u001a\u00020\u00142\u0006\u00105\u001a\u00020\u00072\u0006\u0010M\u001a\u00020)H\u0002J\u001c\u0010q\u001a\u00020\u00142\n\u00105\u001a\u0006\u0012\u0002\b\u0003022\u0006\u0010M\u001a\u00020)H\u0002J(\u0010q\u001a\u00020\u00142\n\u0010a\u001a\u0006\u0012\u0002\b\u00030\u000b2\n\u00105\u001a\u0006\u0012\u0002\b\u0003022\u0006\u0010M\u001a\u00020)H\u0002J4\u0010r\u001a\u00020\u0014*\u00020*2\u0012\u0010s\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\b0t2\n\u0010u\u001a\u00060vj\u0002`w2\u0006\u0010x\u001a\u00020)H\u0002J\u0010\u0010y\u001a\u00020\u000f*\u0006\u0012\u0002\b\u00030\u000bH\u0002J\u0016\u0010a\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000b*\u0006\u0012\u0002\b\u000302H\u0002J\u0013\u0010a\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000b*\u00020\u0007H\u0082\u0010J\u000f\u0010z\u001a\u0004\u0018\u00010\u0007*\u00020\u0007H\u0082\u0010J\u0012\u0010{\u001a\u000206*\b\u0012\u0004\u0012\u00020\u00040;H\u0002J\f\u0010|\u001a\u00020)*\u00020\u0001H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b\u0012\u0004\u0012\u00020\u000f0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u00020\u000fX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019R\t\u0010\u001d\u001a\u00020\u001eX\u0082\u0004R\u0011\u0010\u001f\u001a\u00020\u000f8G¢\u0006\u0006\u001a\u0004\b \u0010\u0017R\u001a\u0010!\u001a\u00020\u000fX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0017\"\u0004\b#\u0010\u0019R\t\u0010$\u001a\u00020%X\u0082\u0004R\u0010\u0010&\u001a\u0004\u0018\u00010'X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010(\u001a\u00020)*\u00020*8BX\u0082\u0004¢\u0006\f\u0012\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0018\u0010/\u001a\u00020\u000f*\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b/\u00100¨\u0006~"}, d2 = {"Lkotlinx/coroutines/debug/internal/DebugProbesImpl;", "", "()V", "ARTIFICIAL_FRAME", "Ljava/lang/StackTraceElement;", "callerInfoCache", "Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/debug/internal/DebugCoroutineInfoImpl;", "capturedCoroutines", "", "Lkotlinx/coroutines/debug/internal/DebugProbesImpl$CoroutineOwner;", "getCapturedCoroutines", "()Ljava/util/Set;", "capturedCoroutinesMap", "", "dateFormat", "Ljava/text/SimpleDateFormat;", "dynamicAttach", "Lkotlin/Function1;", "", "enableCreationStackTraces", "getEnableCreationStackTraces$kotlinx_coroutines_core", "()Z", "setEnableCreationStackTraces$kotlinx_coroutines_core", "(Z)V", "ignoreCoroutinesWithEmptyContext", "getIgnoreCoroutinesWithEmptyContext", "setIgnoreCoroutinesWithEmptyContext", "installations", "Lkotlinx/atomicfu/AtomicInt;", "isInstalled", "isInstalled$kotlinx_coroutines_debug", "sanitizeStackTraces", "getSanitizeStackTraces$kotlinx_coroutines_core", "setSanitizeStackTraces$kotlinx_coroutines_core", "sequenceNumber", "Lkotlinx/atomicfu/AtomicLong;", "weakRefCleanerThread", "Ljava/lang/Thread;", "debugString", "", "Lkotlinx/coroutines/Job;", "getDebugString$annotations", "(Lkotlinx/coroutines/Job;)V", "getDebugString", "(Lkotlinx/coroutines/Job;)Ljava/lang/String;", "isInternalMethod", "(Ljava/lang/StackTraceElement;)Z", "createOwner", "Lkotlin/coroutines/Continuation;", "T", "completion", "frame", "Lkotlinx/coroutines/debug/internal/StackTraceFrame;", "dumpCoroutines", "out", "Ljava/io/PrintStream;", "dumpCoroutinesInfo", "", "Lkotlinx/coroutines/debug/internal/DebugCoroutineInfo;", "dumpCoroutinesInfoAsJsonAndReferences", "", "()[Ljava/lang/Object;", "dumpCoroutinesInfoImpl", "R", "create", "Lkotlin/Function2;", "Lkotlin/coroutines/CoroutineContext;", "dumpCoroutinesSynchronized", "dumpDebuggerInfo", "Lkotlinx/coroutines/debug/internal/DebuggerInfo;", "enhanceStackTraceWithThreadDump", "info", "coroutineTrace", "enhanceStackTraceWithThreadDumpAsJson", "enhanceStackTraceWithThreadDumpImpl", RemoteConfigConstants.ResponseFieldKey.STATE, "thread", "findContinuationStartIndex", "Lkotlin/Pair;", "", "indexOfResumeWith", "actualTrace", "(I[Ljava/lang/StackTraceElement;Ljava/util/List;)Lkotlin/Pair;", "findIndexOfFrame", "frameIndex", "(I[Ljava/lang/StackTraceElement;Ljava/util/List;)I", "getDynamicAttach", "hierarchyToString", "job", "hierarchyToString$kotlinx_coroutines_core", "install", "install$kotlinx_coroutines_core", "printStackTrace", "frames", "probeCoroutineCompleted", "owner", "probeCoroutineCreated", "probeCoroutineCreated$kotlinx_coroutines_core", "probeCoroutineResumed", "probeCoroutineResumed$kotlinx_coroutines_core", "probeCoroutineSuspended", "probeCoroutineSuspended$kotlinx_coroutines_core", "sanitizeStackTrace", "", "throwable", "(Ljava/lang/Throwable;)Ljava/util/List;", "startWeakRefCleanerThread", "stopWeakRefCleanerThread", "uninstall", "uninstall$kotlinx_coroutines_core", "updateRunningState", "updateState", "build", "map", "", "builder", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "indent", "isFinished", "realCaller", "toStackTraceFrame", "toStringRepr", "CoroutineOwner", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@PublishedApi
@SourceDebugExtension({"SMAP\nDebugProbesImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugProbesImpl.kt\nkotlinx/coroutines/debug/internal/DebugProbesImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 6 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,620:1\n150#1:638\n151#1,4:640\n156#1,5:645\n150#1:650\n151#1,4:652\n156#1,5:657\n1#2:621\n1#2:639\n1#2:651\n766#3:622\n857#3,2:623\n1208#3,2:625\n1238#3,4:627\n1855#3,2:665\n350#3,7:673\n1819#3,8:680\n603#4:631\n603#4:644\n603#4:656\n603#4:662\n1313#4,2:663\n37#5,2:632\n37#5,2:634\n37#5,2:636\n1627#6,6:667\n1735#6,6:688\n*S KotlinDebug\n*F\n+ 1 DebugProbesImpl.kt\nkotlinx/coroutines/debug/internal/DebugProbesImpl\n*L\n245#1:638\n245#1:640,4\n245#1:645,5\n252#1:650\n252#1:652,4\n252#1:657,5\n245#1:639\n252#1:651\n110#1:622\n110#1:623,2\n111#1:625,2\n111#1:627,4\n307#1:665,2\n416#1:673,7\n506#1:680,8\n154#1:631\n245#1:644\n252#1:656\n287#1:662\n288#1:663,2\n211#1:632,2\n212#1:634,2\n213#1:636,2\n355#1:667,6\n558#1:688,6\n*E\n"})
/* loaded from: classes3.dex */
public final class DebugProbesImpl {
    private static final StackTraceElement ARTIFICIAL_FRAME;
    public static final DebugProbesImpl INSTANCE;
    private static final ConcurrentWeakMap<CoroutineStackFrame, DebugCoroutineInfoImpl> callerInfoCache;
    private static final ConcurrentWeakMap<CoroutineOwner<?>, Boolean> capturedCoroutinesMap;
    private static final SimpleDateFormat dateFormat;
    private static final /* synthetic */ DebugProbesImpl$DebugProbesImpl$VolatileWrapper$atomicfu$private debugProbesImpl$VolatileWrapper$atomicfu$private;
    private static final Function1<Boolean, Unit> dynamicAttach;
    private static boolean enableCreationStackTraces;
    private static boolean ignoreCoroutinesWithEmptyContext;
    private static boolean sanitizeStackTraces;
    private static Thread weakRefCleanerThread;

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u0003B\u001d\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\n\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u001b\u0010\u0015\u001a\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0016¢\u0006\u0002\u0010\u0019J\b\u0010\u001a\u001a\u00020\u001bH\u0016R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u00020\fX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0000X\u0081\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0010\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lkotlinx/coroutines/debug/internal/DebugProbesImpl$CoroutineOwner;", "T", "Lkotlin/coroutines/Continuation;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "delegate", "info", "Lkotlinx/coroutines/debug/internal/DebugCoroutineInfoImpl;", "(Lkotlin/coroutines/Continuation;Lkotlinx/coroutines/debug/internal/DebugCoroutineInfoImpl;)V", "callerFrame", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "context", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "frame", "Lkotlinx/coroutines/debug/internal/StackTraceFrame;", "getFrame", "()Lkotlinx/coroutines/debug/internal/StackTraceFrame;", "getStackTraceElement", "Ljava/lang/StackTraceElement;", "resumeWith", "", "result", "Lkotlin/Result;", "(Ljava/lang/Object;)V", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class CoroutineOwner<T> implements Continuation<T>, CoroutineStackFrame {

        @JvmField
        public final Continuation<T> delegate;

        @JvmField
        public final DebugCoroutineInfoImpl info;

        /* JADX WARN: Multi-variable type inference failed */
        public CoroutineOwner(Continuation<? super T> continuation, DebugCoroutineInfoImpl debugCoroutineInfoImpl) {
            this.delegate = continuation;
            this.info = debugCoroutineInfoImpl;
        }

        private final StackTraceFrame getFrame() {
            return this.info.getCreationStackBottom();
        }

        @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
        public CoroutineStackFrame getCallerFrame() {
            StackTraceFrame frame = getFrame();
            if (frame != null) {
                return frame.getCallerFrame();
            }
            return null;
        }

        @Override // kotlin.coroutines.Continuation
        public CoroutineContext getContext() {
            return this.delegate.getContext();
        }

        @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
        public StackTraceElement getStackTraceElement() {
            StackTraceFrame frame = getFrame();
            if (frame != null) {
                return frame.getStackTraceElement();
            }
            return null;
        }

        @Override // kotlin.coroutines.Continuation
        public void resumeWith(Object result) {
            DebugProbesImpl.INSTANCE.probeCoroutineCompleted(this);
            this.delegate.resumeWith(result);
        }

        public String toString() {
            return this.delegate.toString();
        }
    }

    static {
        DebugProbesImpl debugProbesImpl = new DebugProbesImpl();
        INSTANCE = debugProbesImpl;
        ARTIFICIAL_FRAME = d.a(AbstractC0106b.class.getSimpleName(), new Exception());
        dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        capturedCoroutinesMap = new ConcurrentWeakMap<>(false, 1, null);
        sanitizeStackTraces = true;
        enableCreationStackTraces = true;
        ignoreCoroutinesWithEmptyContext = true;
        dynamicAttach = debugProbesImpl.getDynamicAttach();
        callerInfoCache = new ConcurrentWeakMap<>(true);
        debugProbesImpl$VolatileWrapper$atomicfu$private = new DebugProbesImpl$DebugProbesImpl$VolatileWrapper$atomicfu$private(null);
    }

    private DebugProbesImpl() {
    }

    private final void build(Job job, Map<Job, DebugCoroutineInfoImpl> map, StringBuilder sb, String str) {
        DebugCoroutineInfoImpl debugCoroutineInfoImpl = map.get(job);
        if (debugCoroutineInfoImpl != null) {
            StackTraceElement stackTraceElement = (StackTraceElement) CollectionsKt.firstOrNull((List) debugCoroutineInfoImpl.lastObservedStackTrace$kotlinx_coroutines_core());
            String str2 = debugCoroutineInfoImpl.get_state();
            StringBuilder a2 = AbstractC0629f.a(str);
            a2.append(getDebugString(job));
            a2.append(", continuation is ");
            a2.append(str2);
            a2.append(" at line ");
            a2.append(stackTraceElement);
            a2.append('\n');
            sb.append(a2.toString());
            str = str + '\t';
        } else if (!(job instanceof ScopeCoroutine)) {
            StringBuilder a4 = AbstractC0629f.a(str);
            a4.append(getDebugString(job));
            a4.append('\n');
            sb.append(a4.toString());
            str = str + '\t';
        }
        Iterator<Job> it = job.getChildren().iterator();
        while (it.hasNext()) {
            build(it.next(), map, sb, str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <T> Continuation<T> createOwner(Continuation<? super T> completion, StackTraceFrame frame) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        if (!isInstalled$kotlinx_coroutines_debug()) {
            return completion;
        }
        CoroutineContext context = completion.getContext();
        atomicLongFieldUpdater = DebugProbesImpl$DebugProbesImpl$VolatileWrapper$atomicfu$private.sequenceNumber$volatile$FU;
        CoroutineOwner<?> coroutineOwner = new CoroutineOwner<>(completion, new DebugCoroutineInfoImpl(context, frame, atomicLongFieldUpdater.incrementAndGet(debugProbesImpl$VolatileWrapper$atomicfu$private)));
        ConcurrentWeakMap<CoroutineOwner<?>, Boolean> concurrentWeakMap = capturedCoroutinesMap;
        concurrentWeakMap.put(coroutineOwner, Boolean.TRUE);
        if (!isInstalled$kotlinx_coroutines_debug()) {
            concurrentWeakMap.clear();
        }
        return coroutineOwner;
    }

    private final <R> List<R> dumpCoroutinesInfoImpl(final Function2<? super CoroutineOwner<?>, ? super CoroutineContext, ? extends R> create) {
        if (isInstalled$kotlinx_coroutines_debug()) {
            return SequencesKt.toList(SequencesKt.mapNotNull(SequencesKt.sortedWith(CollectionsKt.asSequence(getCapturedCoroutines()), new DebugProbesImpl$dumpCoroutinesInfoImpl$$inlined$sortedBy$1()), new Function1<CoroutineOwner<?>, R>() { // from class: kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpCoroutinesInfoImpl$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final R invoke(DebugProbesImpl.CoroutineOwner<?> coroutineOwner) {
                    boolean isFinished;
                    CoroutineContext context;
                    isFinished = DebugProbesImpl.INSTANCE.isFinished(coroutineOwner);
                    if (isFinished || (context = coroutineOwner.info.getContext()) == null) {
                        return null;
                    }
                    return create.invoke(coroutineOwner, context);
                }
            }));
        }
        throw new IllegalStateException("Debug probes are not installed");
    }

    private final void dumpCoroutinesSynchronized(PrintStream out) {
        if (!isInstalled$kotlinx_coroutines_debug()) {
            throw new IllegalStateException("Debug probes are not installed");
        }
        out.print("Coroutines dump " + dateFormat.format(Long.valueOf(System.currentTimeMillis())));
        for (CoroutineOwner coroutineOwner : SequencesKt.sortedWith(SequencesKt.filter(CollectionsKt.asSequence(getCapturedCoroutines()), new Function1<CoroutineOwner<?>, Boolean>() { // from class: kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpCoroutinesSynchronized$2
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(DebugProbesImpl.CoroutineOwner<?> coroutineOwner2) {
                boolean isFinished;
                isFinished = DebugProbesImpl.INSTANCE.isFinished(coroutineOwner2);
                return Boolean.valueOf(!isFinished);
            }
        }), new Comparator() { // from class: kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpCoroutinesSynchronized$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t2, T t4) {
                return ComparisonsKt.compareValues(Long.valueOf(((DebugProbesImpl.CoroutineOwner) t2).info.sequenceNumber), Long.valueOf(((DebugProbesImpl.CoroutineOwner) t4).info.sequenceNumber));
            }
        })) {
            DebugCoroutineInfoImpl debugCoroutineInfoImpl = coroutineOwner.info;
            List<StackTraceElement> lastObservedStackTrace$kotlinx_coroutines_core = debugCoroutineInfoImpl.lastObservedStackTrace$kotlinx_coroutines_core();
            DebugProbesImpl debugProbesImpl = INSTANCE;
            List<StackTraceElement> enhanceStackTraceWithThreadDumpImpl = debugProbesImpl.enhanceStackTraceWithThreadDumpImpl(debugCoroutineInfoImpl.get_state(), debugCoroutineInfoImpl.lastObservedThread, lastObservedStackTrace$kotlinx_coroutines_core);
            out.print("\n\nCoroutine " + coroutineOwner.delegate + ", state: " + ((Intrinsics.areEqual(debugCoroutineInfoImpl.get_state(), DebugCoroutineInfoImplKt.RUNNING) && enhanceStackTraceWithThreadDumpImpl == lastObservedStackTrace$kotlinx_coroutines_core) ? debugCoroutineInfoImpl.get_state() + " (Last suspension stacktrace, not an actual stacktrace)" : debugCoroutineInfoImpl.get_state()));
            if (lastObservedStackTrace$kotlinx_coroutines_core.isEmpty()) {
                out.print("\n\tat " + ARTIFICIAL_FRAME);
                debugProbesImpl.printStackTrace(out, debugCoroutineInfoImpl.getCreationStackTrace());
            } else {
                debugProbesImpl.printStackTrace(out, enhanceStackTraceWithThreadDumpImpl);
            }
        }
    }

    private final List<StackTraceElement> enhanceStackTraceWithThreadDumpImpl(String state, Thread thread, List<StackTraceElement> coroutineTrace) {
        Object m116constructorimpl;
        if (Intrinsics.areEqual(state, DebugCoroutineInfoImplKt.RUNNING) && thread != null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                m116constructorimpl = Result.m116constructorimpl(thread.getStackTrace());
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m116constructorimpl = Result.m116constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m122isFailureimpl(m116constructorimpl)) {
                m116constructorimpl = null;
            }
            StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) m116constructorimpl;
            if (stackTraceElementArr != null) {
                int length = stackTraceElementArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        i = -1;
                        break;
                    }
                    StackTraceElement stackTraceElement = stackTraceElementArr[i];
                    if (Intrinsics.areEqual(stackTraceElement.getClassName(), "kotlin.coroutines.jvm.internal.BaseContinuationImpl") && Intrinsics.areEqual(stackTraceElement.getMethodName(), "resumeWith") && Intrinsics.areEqual(stackTraceElement.getFileName(), "ContinuationImpl.kt")) {
                        break;
                    }
                    i++;
                }
                Pair<Integer, Integer> findContinuationStartIndex = findContinuationStartIndex(i, stackTraceElementArr, coroutineTrace);
                int intValue = findContinuationStartIndex.component1().intValue();
                int intValue2 = findContinuationStartIndex.component2().intValue();
                if (intValue != -1) {
                    ArrayList arrayList = new ArrayList((((coroutineTrace.size() + i) - intValue) - 1) - intValue2);
                    int i4 = i - intValue2;
                    for (int i5 = 0; i5 < i4; i5++) {
                        arrayList.add(stackTraceElementArr[i5]);
                    }
                    int size = coroutineTrace.size();
                    for (int i6 = intValue + 1; i6 < size; i6++) {
                        arrayList.add(coroutineTrace.get(i6));
                    }
                    return arrayList;
                }
            }
        }
        return coroutineTrace;
    }

    private final Pair<Integer, Integer> findContinuationStartIndex(int indexOfResumeWith, StackTraceElement[] actualTrace, List<StackTraceElement> coroutineTrace) {
        for (int i = 0; i < 3; i++) {
            int findIndexOfFrame = INSTANCE.findIndexOfFrame((indexOfResumeWith - 1) - i, actualTrace, coroutineTrace);
            if (findIndexOfFrame != -1) {
                return TuplesKt.to(Integer.valueOf(findIndexOfFrame), Integer.valueOf(i));
            }
        }
        return TuplesKt.to(-1, 0);
    }

    private final int findIndexOfFrame(int frameIndex, StackTraceElement[] actualTrace, List<StackTraceElement> coroutineTrace) {
        StackTraceElement stackTraceElement = (StackTraceElement) ArraysKt.getOrNull(actualTrace, frameIndex);
        if (stackTraceElement == null) {
            return -1;
        }
        int i = 0;
        for (StackTraceElement stackTraceElement2 : coroutineTrace) {
            if (Intrinsics.areEqual(stackTraceElement2.getFileName(), stackTraceElement.getFileName()) && Intrinsics.areEqual(stackTraceElement2.getClassName(), stackTraceElement.getClassName()) && Intrinsics.areEqual(stackTraceElement2.getMethodName(), stackTraceElement.getMethodName())) {
                return i;
            }
            i++;
        }
        return -1;
    }

    private final Set<CoroutineOwner<?>> getCapturedCoroutines() {
        return capturedCoroutinesMap.keySet();
    }

    private final String getDebugString(Job job) {
        return job instanceof JobSupport ? ((JobSupport) job).toDebugString() : job.toString();
    }

    private static /* synthetic */ void getDebugString$annotations(Job job) {
    }

    private final Function1<Boolean, Unit> getDynamicAttach() {
        Object m116constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            Object newInstance = Class.forName("kotlinx.coroutines.debug.internal.ByteBuddyDynamicAttach").getConstructors()[0].newInstance(new Object[0]);
            Intrinsics.checkNotNull(newInstance, "null cannot be cast to non-null type kotlin.Function1<kotlin.Boolean, kotlin.Unit>");
            m116constructorimpl = Result.m116constructorimpl((Function1) TypeIntrinsics.beforeCheckcastToFunctionOfArity(newInstance, 1));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m116constructorimpl = Result.m116constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m122isFailureimpl(m116constructorimpl)) {
            m116constructorimpl = null;
        }
        return (Function1) m116constructorimpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isFinished(CoroutineOwner<?> coroutineOwner) {
        Job job;
        CoroutineContext context = coroutineOwner.info.getContext();
        if (context == null || (job = (Job) context.get(Job.INSTANCE)) == null || !job.isCompleted()) {
            return false;
        }
        capturedCoroutinesMap.remove(coroutineOwner);
        return true;
    }

    private final boolean isInternalMethod(StackTraceElement stackTraceElement) {
        boolean startsWith$default;
        startsWith$default = StringsKt__StringsJVMKt.startsWith$default(stackTraceElement.getClassName(), "kotlinx.coroutines", false, 2, null);
        return startsWith$default;
    }

    private final CoroutineOwner<?> owner(Continuation<?> continuation) {
        CoroutineStackFrame coroutineStackFrame = continuation instanceof CoroutineStackFrame ? (CoroutineStackFrame) continuation : null;
        if (coroutineStackFrame != null) {
            return owner(coroutineStackFrame);
        }
        return null;
    }

    private final void printStackTrace(PrintStream out, List<StackTraceElement> frames) {
        Iterator<T> it = frames.iterator();
        while (it.hasNext()) {
            out.print("\n\tat " + ((StackTraceElement) it.next()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void probeCoroutineCompleted(CoroutineOwner<?> owner) {
        CoroutineStackFrame realCaller;
        capturedCoroutinesMap.remove(owner);
        CoroutineStackFrame lastObservedFrame$kotlinx_coroutines_core = owner.info.getLastObservedFrame$kotlinx_coroutines_core();
        if (lastObservedFrame$kotlinx_coroutines_core == null || (realCaller = realCaller(lastObservedFrame$kotlinx_coroutines_core)) == null) {
            return;
        }
        callerInfoCache.remove(realCaller);
    }

    private final CoroutineStackFrame realCaller(CoroutineStackFrame coroutineStackFrame) {
        do {
            coroutineStackFrame = coroutineStackFrame.getCallerFrame();
            if (coroutineStackFrame == null) {
                return null;
            }
        } while (coroutineStackFrame.getStackTraceElement() == null);
        return coroutineStackFrame;
    }

    private final <T extends Throwable> List<StackTraceElement> sanitizeStackTrace(T throwable) {
        StackTraceElement[] stackTrace = throwable.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        int length2 = stackTrace.length - 1;
        if (length2 >= 0) {
            while (true) {
                int i4 = length2 - 1;
                if (Intrinsics.areEqual(stackTrace[length2].getClassName(), "kotlin.coroutines.jvm.internal.DebugProbesKt")) {
                    i = length2;
                    break;
                }
                if (i4 < 0) {
                    break;
                }
                length2 = i4;
            }
        }
        int i5 = i + 1;
        if (!sanitizeStackTraces) {
            int i6 = length - i5;
            ArrayList arrayList = new ArrayList(i6);
            for (int i7 = 0; i7 < i6; i7++) {
                arrayList.add(stackTrace[i7 + i5]);
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList((length - i5) + 1);
        while (i5 < length) {
            if (isInternalMethod(stackTrace[i5])) {
                arrayList2.add(stackTrace[i5]);
                int i8 = i5 + 1;
                while (i8 < length && isInternalMethod(stackTrace[i8])) {
                    i8++;
                }
                int i9 = i8 - 1;
                int i10 = i9;
                while (i10 > i5 && stackTrace[i10].getFileName() == null) {
                    i10--;
                }
                if (i10 > i5 && i10 < i9) {
                    arrayList2.add(stackTrace[i10]);
                }
                arrayList2.add(stackTrace[i9]);
                i5 = i8;
            } else {
                arrayList2.add(stackTrace[i5]);
                i5++;
            }
        }
        return arrayList2;
    }

    private final void startWeakRefCleanerThread() {
        weakRefCleanerThread = ThreadsKt.thread$default(false, true, null, "Coroutines Debugger Cleaner", 0, new Function0<Unit>() { // from class: kotlinx.coroutines.debug.internal.DebugProbesImpl$startWeakRefCleanerThread$1
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                ConcurrentWeakMap concurrentWeakMap;
                concurrentWeakMap = DebugProbesImpl.callerInfoCache;
                concurrentWeakMap.runWeakRefQueueCleaningLoopUntilInterrupted();
            }
        }, 21, null);
    }

    private final void stopWeakRefCleanerThread() {
        Thread thread = weakRefCleanerThread;
        if (thread == null) {
            return;
        }
        weakRefCleanerThread = null;
        thread.interrupt();
        thread.join();
    }

    private final StackTraceFrame toStackTraceFrame(List<StackTraceElement> list) {
        StackTraceFrame stackTraceFrame = null;
        if (!list.isEmpty()) {
            ListIterator<StackTraceElement> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                stackTraceFrame = new StackTraceFrame(stackTraceFrame, listIterator.previous());
            }
        }
        return new StackTraceFrame(stackTraceFrame, ARTIFICIAL_FRAME);
    }

    private final String toStringRepr(Object obj) {
        String repr;
        repr = DebugProbesImplKt.repr(obj.toString());
        return repr;
    }

    private final void updateRunningState(CoroutineStackFrame frame, String state) {
        boolean z3;
        if (isInstalled$kotlinx_coroutines_debug()) {
            ConcurrentWeakMap<CoroutineStackFrame, DebugCoroutineInfoImpl> concurrentWeakMap = callerInfoCache;
            DebugCoroutineInfoImpl remove = concurrentWeakMap.remove(frame);
            if (remove != null) {
                z3 = false;
            } else {
                CoroutineOwner<?> owner = owner(frame);
                if (owner == null || (remove = owner.info) == null) {
                    return;
                }
                CoroutineStackFrame lastObservedFrame$kotlinx_coroutines_core = remove.getLastObservedFrame$kotlinx_coroutines_core();
                CoroutineStackFrame realCaller = lastObservedFrame$kotlinx_coroutines_core != null ? realCaller(lastObservedFrame$kotlinx_coroutines_core) : null;
                if (realCaller != null) {
                    concurrentWeakMap.remove(realCaller);
                }
                z3 = true;
            }
            Intrinsics.checkNotNull(frame, "null cannot be cast to non-null type kotlin.coroutines.Continuation<*>");
            remove.updateState$kotlinx_coroutines_core(state, (Continuation) frame, z3);
            CoroutineStackFrame realCaller2 = realCaller(frame);
            if (realCaller2 == null) {
                return;
            }
            concurrentWeakMap.put(realCaller2, remove);
        }
    }

    private final void updateState(Continuation<?> frame, String state) {
        if (isInstalled$kotlinx_coroutines_debug()) {
            if (ignoreCoroutinesWithEmptyContext && frame.getContext() == EmptyCoroutineContext.INSTANCE) {
                return;
            }
            if (Intrinsics.areEqual(state, DebugCoroutineInfoImplKt.RUNNING)) {
                CoroutineStackFrame coroutineStackFrame = frame instanceof CoroutineStackFrame ? (CoroutineStackFrame) frame : null;
                if (coroutineStackFrame == null) {
                    return;
                }
                updateRunningState(coroutineStackFrame, state);
                return;
            }
            CoroutineOwner<?> owner = owner(frame);
            if (owner == null) {
                return;
            }
            updateState(owner, frame, state);
        }
    }

    @JvmName(name = "dumpCoroutines")
    public final void dumpCoroutines(PrintStream out) {
        synchronized (out) {
            INSTANCE.dumpCoroutinesSynchronized(out);
            Unit unit = Unit.INSTANCE;
        }
    }

    public final List<DebugCoroutineInfo> dumpCoroutinesInfo() {
        if (isInstalled$kotlinx_coroutines_debug()) {
            return SequencesKt.toList(SequencesKt.mapNotNull(SequencesKt.sortedWith(CollectionsKt.asSequence(getCapturedCoroutines()), new DebugProbesImpl$dumpCoroutinesInfoImpl$$inlined$sortedBy$1()), new Function1<CoroutineOwner<?>, DebugCoroutineInfo>() { // from class: kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpCoroutinesInfo$$inlined$dumpCoroutinesInfoImpl$1
                @Override // kotlin.jvm.functions.Function1
                public final DebugCoroutineInfo invoke(DebugProbesImpl.CoroutineOwner<?> coroutineOwner) {
                    boolean isFinished;
                    CoroutineContext context;
                    isFinished = DebugProbesImpl.INSTANCE.isFinished(coroutineOwner);
                    if (isFinished || (context = coroutineOwner.info.getContext()) == null) {
                        return null;
                    }
                    return new DebugCoroutineInfo(coroutineOwner.info, context);
                }
            }));
        }
        throw new IllegalStateException("Debug probes are not installed");
    }

    public final Object[] dumpCoroutinesInfoAsJsonAndReferences() {
        String name;
        List<DebugCoroutineInfo> dumpCoroutinesInfo = dumpCoroutinesInfo();
        int size = dumpCoroutinesInfo.size();
        ArrayList arrayList = new ArrayList(size);
        ArrayList arrayList2 = new ArrayList(size);
        ArrayList arrayList3 = new ArrayList(size);
        for (DebugCoroutineInfo debugCoroutineInfo : dumpCoroutinesInfo) {
            CoroutineContext context = debugCoroutineInfo.getContext();
            CoroutineName coroutineName = (CoroutineName) context.get(CoroutineName.INSTANCE);
            Long l4 = null;
            String stringRepr = (coroutineName == null || (name = coroutineName.getName()) == null) ? null : toStringRepr(name);
            CoroutineDispatcher coroutineDispatcher = (CoroutineDispatcher) context.get(CoroutineDispatcher.INSTANCE);
            String stringRepr2 = coroutineDispatcher != null ? toStringRepr(coroutineDispatcher) : null;
            StringBuilder p = a.p("\n                {\n                    \"name\": ", stringRepr, ",\n                    \"id\": ");
            CoroutineId coroutineId = (CoroutineId) context.get(CoroutineId.INSTANCE);
            if (coroutineId != null) {
                l4 = Long.valueOf(coroutineId.getId());
            }
            p.append(l4);
            p.append(",\n                    \"dispatcher\": ");
            p.append(stringRepr2);
            p.append(",\n                    \"sequenceNumber\": ");
            p.append(debugCoroutineInfo.getSequenceNumber());
            p.append(",\n                    \"state\": \"");
            p.append(debugCoroutineInfo.getState());
            p.append("\"\n                } \n                ");
            arrayList3.add(StringsKt.trimIndent(p.toString()));
            arrayList2.add(debugCoroutineInfo.getLastObservedFrame());
            arrayList.add(debugCoroutineInfo.getLastObservedThread());
        }
        return new Object[]{a.n(new StringBuilder("["), CollectionsKt.l(arrayList3, null, null, null, null, 63), ']'), arrayList.toArray(new Thread[0]), arrayList2.toArray(new CoroutineStackFrame[0]), dumpCoroutinesInfo.toArray(new DebugCoroutineInfo[0])};
    }

    public final List<DebuggerInfo> dumpDebuggerInfo() {
        if (isInstalled$kotlinx_coroutines_debug()) {
            return SequencesKt.toList(SequencesKt.mapNotNull(SequencesKt.sortedWith(CollectionsKt.asSequence(getCapturedCoroutines()), new DebugProbesImpl$dumpCoroutinesInfoImpl$$inlined$sortedBy$1()), new Function1<CoroutineOwner<?>, DebuggerInfo>() { // from class: kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpDebuggerInfo$$inlined$dumpCoroutinesInfoImpl$1
                @Override // kotlin.jvm.functions.Function1
                public final DebuggerInfo invoke(DebugProbesImpl.CoroutineOwner<?> coroutineOwner) {
                    boolean isFinished;
                    CoroutineContext context;
                    isFinished = DebugProbesImpl.INSTANCE.isFinished(coroutineOwner);
                    if (isFinished || (context = coroutineOwner.info.getContext()) == null) {
                        return null;
                    }
                    return new DebuggerInfo(coroutineOwner.info, context);
                }
            }));
        }
        throw new IllegalStateException("Debug probes are not installed");
    }

    public final List<StackTraceElement> enhanceStackTraceWithThreadDump(DebugCoroutineInfo info, List<StackTraceElement> coroutineTrace) {
        return enhanceStackTraceWithThreadDumpImpl(info.getState(), info.getLastObservedThread(), coroutineTrace);
    }

    public final String enhanceStackTraceWithThreadDumpAsJson(DebugCoroutineInfo info) {
        List<StackTraceElement> enhanceStackTraceWithThreadDump = enhanceStackTraceWithThreadDump(info, info.lastObservedStackTrace());
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : enhanceStackTraceWithThreadDump) {
            StringBuilder sb = new StringBuilder("\n                {\n                    \"declaringClass\": \"");
            sb.append(stackTraceElement.getClassName());
            sb.append("\",\n                    \"methodName\": \"");
            sb.append(stackTraceElement.getMethodName());
            sb.append("\",\n                    \"fileName\": ");
            String fileName = stackTraceElement.getFileName();
            sb.append(fileName != null ? toStringRepr(fileName) : null);
            sb.append(",\n                    \"lineNumber\": ");
            sb.append(stackTraceElement.getLineNumber());
            sb.append("\n                }\n                ");
            arrayList.add(StringsKt.trimIndent(sb.toString()));
        }
        return a.n(new StringBuilder("["), CollectionsKt.l(arrayList, null, null, null, null, 63), ']');
    }

    public final boolean getEnableCreationStackTraces$kotlinx_coroutines_core() {
        return enableCreationStackTraces;
    }

    public final boolean getIgnoreCoroutinesWithEmptyContext() {
        return ignoreCoroutinesWithEmptyContext;
    }

    public final boolean getSanitizeStackTraces$kotlinx_coroutines_core() {
        return sanitizeStackTraces;
    }

    public final String hierarchyToString$kotlinx_coroutines_core(Job job) {
        if (!isInstalled$kotlinx_coroutines_debug()) {
            throw new IllegalStateException("Debug probes are not installed");
        }
        Set<CoroutineOwner<?>> capturedCoroutines = getCapturedCoroutines();
        ArrayList arrayList = new ArrayList();
        for (Object obj : capturedCoroutines) {
            if (((CoroutineOwner) obj).delegate.getContext().get(Job.INSTANCE) != null) {
                arrayList.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.g(arrayList)), 16));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            CoroutineOwner coroutineOwner = (CoroutineOwner) it.next();
            linkedHashMap.put(JobKt.getJob(coroutineOwner.delegate.getContext()), coroutineOwner.info);
        }
        StringBuilder sb = new StringBuilder();
        INSTANCE.build(job, linkedHashMap, sb, "");
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    public final void install$kotlinx_coroutines_core() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        Function1<Boolean, Unit> function1;
        atomicIntegerFieldUpdater = DebugProbesImpl$DebugProbesImpl$VolatileWrapper$atomicfu$private.installations$volatile$FU;
        if (atomicIntegerFieldUpdater.incrementAndGet(debugProbesImpl$VolatileWrapper$atomicfu$private) > 1) {
            return;
        }
        startWeakRefCleanerThread();
        if (AgentInstallationType.INSTANCE.isInstalledStatically$kotlinx_coroutines_core() || (function1 = dynamicAttach) == null) {
            return;
        }
        function1.invoke(Boolean.TRUE);
    }

    @JvmName(name = "isInstalled$kotlinx_coroutines_debug")
    public final boolean isInstalled$kotlinx_coroutines_debug() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        atomicIntegerFieldUpdater = DebugProbesImpl$DebugProbesImpl$VolatileWrapper$atomicfu$private.installations$volatile$FU;
        return atomicIntegerFieldUpdater.get(debugProbesImpl$VolatileWrapper$atomicfu$private) > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> Continuation<T> probeCoroutineCreated$kotlinx_coroutines_core(Continuation<? super T> completion) {
        if (isInstalled$kotlinx_coroutines_debug() && (!(ignoreCoroutinesWithEmptyContext && completion.getContext() == EmptyCoroutineContext.INSTANCE) && owner(completion) == null)) {
            return createOwner(completion, enableCreationStackTraces ? toStackTraceFrame(sanitizeStackTrace(new Exception())) : null);
        }
        return completion;
    }

    public final void probeCoroutineResumed$kotlinx_coroutines_core(Continuation<?> frame) {
        updateState(frame, DebugCoroutineInfoImplKt.RUNNING);
    }

    public final void probeCoroutineSuspended$kotlinx_coroutines_core(Continuation<?> frame) {
        updateState(frame, DebugCoroutineInfoImplKt.SUSPENDED);
    }

    public final void setEnableCreationStackTraces$kotlinx_coroutines_core(boolean z3) {
        enableCreationStackTraces = z3;
    }

    public final void setIgnoreCoroutinesWithEmptyContext(boolean z3) {
        ignoreCoroutinesWithEmptyContext = z3;
    }

    public final void setSanitizeStackTraces$kotlinx_coroutines_core(boolean z3) {
        sanitizeStackTraces = z3;
    }

    public final void uninstall$kotlinx_coroutines_core() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        Function1<Boolean, Unit> function1;
        if (!isInstalled$kotlinx_coroutines_debug()) {
            throw new IllegalStateException("Agent was not installed");
        }
        atomicIntegerFieldUpdater = DebugProbesImpl$DebugProbesImpl$VolatileWrapper$atomicfu$private.installations$volatile$FU;
        if (atomicIntegerFieldUpdater.decrementAndGet(debugProbesImpl$VolatileWrapper$atomicfu$private) != 0) {
            return;
        }
        stopWeakRefCleanerThread();
        capturedCoroutinesMap.clear();
        callerInfoCache.clear();
        if (AgentInstallationType.INSTANCE.isInstalledStatically$kotlinx_coroutines_core() || (function1 = dynamicAttach) == null) {
            return;
        }
        function1.invoke(Boolean.FALSE);
    }

    private final CoroutineOwner<?> owner(CoroutineStackFrame coroutineStackFrame) {
        while (!(coroutineStackFrame instanceof CoroutineOwner)) {
            coroutineStackFrame = coroutineStackFrame.getCallerFrame();
            if (coroutineStackFrame == null) {
                return null;
            }
        }
        return (CoroutineOwner) coroutineStackFrame;
    }

    private final void updateState(CoroutineOwner<?> owner, Continuation<?> frame, String state) {
        if (isInstalled$kotlinx_coroutines_debug()) {
            owner.info.updateState$kotlinx_coroutines_core(state, frame, true);
        }
    }
}
