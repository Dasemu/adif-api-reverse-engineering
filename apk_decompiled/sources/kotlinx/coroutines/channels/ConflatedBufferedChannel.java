package kotlinx.coroutines.channels;

import C.w;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Waiter;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.internal.UndeliveredElementException;
import kotlinx.coroutines.selects.SelectInstance;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B9\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\"\b\u0002\u0010\u0007\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t\u0018\u00010\bj\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\n¢\u0006\u0002\u0010\u000bJ\u001e\u0010\u000f\u001a\u00020\t2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\u0016\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00028\u0000H\u0096@¢\u0006\u0002\u0010\u0015J\u0018\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00028\u0000H\u0090@¢\u0006\u0004\b\u0017\u0010\u0015J\r\u0010\u0018\u001a\u00020\rH\u0010¢\u0006\u0002\b\u0019J#\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\u001b2\u0006\u0010\u0012\u001a\u00028\u0000H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ+\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\u001b2\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u001f\u001a\u00020\rH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010!J#\u0010\"\u001a\b\u0012\u0004\u0012\u00020\t0\u001b2\u0006\u0010\u0012\u001a\u00028\u0000H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b#\u0010\u001dJ+\u0010$\u001a\b\u0012\u0004\u0012\u00020\t0\u001b2\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u001f\u001a\u00020\rH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b%\u0010!R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\r8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u000eR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006&"}, d2 = {"Lkotlinx/coroutines/channels/ConflatedBufferedChannel;", "E", "Lkotlinx/coroutines/channels/BufferedChannel;", "capacity", "", "onBufferOverflow", "Lkotlinx/coroutines/channels/BufferOverflow;", "onUndeliveredElement", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "(ILkotlinx/coroutines/channels/BufferOverflow;Lkotlin/jvm/functions/Function1;)V", "isConflatedDropOldest", "", "()Z", "registerSelectForSend", "select", "Lkotlinx/coroutines/selects/SelectInstance;", "element", "", "send", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendBroadcast", "sendBroadcast$kotlinx_coroutines_core", "shouldSendSuspend", "shouldSendSuspend$kotlinx_coroutines_core", "trySend", "Lkotlinx/coroutines/channels/ChannelResult;", "trySend-JP2dKIU", "(Ljava/lang/Object;)Ljava/lang/Object;", "trySendDropLatest", "isSendOp", "trySendDropLatest-Mj0NB7M", "(Ljava/lang/Object;Z)Ljava/lang/Object;", "trySendDropOldest", "trySendDropOldest-JP2dKIU", "trySendImpl", "trySendImpl-Mj0NB7M", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nConflatedBufferedChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConflatedBufferedChannel.kt\nkotlinx/coroutines/channels/ConflatedBufferedChannel\n+ 2 Channel.kt\nkotlinx/coroutines/channels/ChannelKt\n+ 3 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel\n+ 4 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannelKt\n+ 5 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel$sendImpl$1\n*L\n1#1,119:1\n548#2,5:120\n514#2,6:125\n514#2,6:212\n548#2,5:218\n244#3:131\n269#3,10:132\n280#3,68:143\n3046#4:142\n269#5:211\n*S KotlinDebug\n*F\n+ 1 ConflatedBufferedChannel.kt\nkotlinx/coroutines/channels/ConflatedBufferedChannel\n*L\n41#1:120,5\n53#1:125,6\n106#1:212,6\n109#1:218,5\n80#1:131\n80#1:132,10\n80#1:143,68\n80#1:142\n80#1:211\n*E\n"})
/* loaded from: classes3.dex */
public class ConflatedBufferedChannel<E> extends BufferedChannel<E> {
    private final int capacity;
    private final BufferOverflow onBufferOverflow;

    public /* synthetic */ ConflatedBufferedChannel(int i, BufferOverflow bufferOverflow, Function1 function1, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, bufferOverflow, (i4 & 4) != 0 ? null : function1);
    }

    public static /* synthetic */ <E> Object send$suspendImpl(ConflatedBufferedChannel<E> conflatedBufferedChannel, E e4, Continuation<? super Unit> continuation) {
        UndeliveredElementException callUndeliveredElementCatchingException$default;
        Object m1658trySendImplMj0NB7M = conflatedBufferedChannel.m1658trySendImplMj0NB7M(e4, true);
        if (!(m1658trySendImplMj0NB7M instanceof ChannelResult.Closed)) {
            return Unit.INSTANCE;
        }
        ChannelResult.m1644exceptionOrNullimpl(m1658trySendImplMj0NB7M);
        Function1<E, Unit> function1 = conflatedBufferedChannel.onUndeliveredElement;
        if (function1 == null || (callUndeliveredElementCatchingException$default = OnUndeliveredElementKt.callUndeliveredElementCatchingException$default(function1, e4, null, 2, null)) == null) {
            throw conflatedBufferedChannel.getSendException();
        }
        ExceptionsKt.addSuppressed(callUndeliveredElementCatchingException$default, conflatedBufferedChannel.getSendException());
        throw callUndeliveredElementCatchingException$default;
    }

    public static /* synthetic */ <E> Object sendBroadcast$suspendImpl(ConflatedBufferedChannel<E> conflatedBufferedChannel, E e4, Continuation<? super Boolean> continuation) {
        Object m1658trySendImplMj0NB7M = conflatedBufferedChannel.m1658trySendImplMj0NB7M(e4, true);
        if (m1658trySendImplMj0NB7M instanceof ChannelResult.Failed) {
            return Boxing.boxBoolean(false);
        }
        return Boxing.boxBoolean(true);
    }

    /* renamed from: trySendDropLatest-Mj0NB7M, reason: not valid java name */
    private final Object m1656trySendDropLatestMj0NB7M(E element, boolean isSendOp) {
        Function1<E, Unit> function1;
        UndeliveredElementException callUndeliveredElementCatchingException$default;
        Object mo1630trySendJP2dKIU = super.mo1630trySendJP2dKIU(element);
        if (ChannelResult.m1650isSuccessimpl(mo1630trySendJP2dKIU) || ChannelResult.m1648isClosedimpl(mo1630trySendJP2dKIU)) {
            return mo1630trySendJP2dKIU;
        }
        if (!isSendOp || (function1 = this.onUndeliveredElement) == null || (callUndeliveredElementCatchingException$default = OnUndeliveredElementKt.callUndeliveredElementCatchingException$default(function1, element, null, 2, null)) == null) {
            return ChannelResult.INSTANCE.m1655successJP2dKIU(Unit.INSTANCE);
        }
        throw callUndeliveredElementCatchingException$default;
    }

    /* renamed from: trySendDropOldest-JP2dKIU, reason: not valid java name */
    private final Object m1657trySendDropOldestJP2dKIU(E element) {
        ChannelSegment channelSegment;
        int i;
        ConflatedBufferedChannel<E> conflatedBufferedChannel;
        Object obj = BufferedChannelKt.BUFFERED;
        ChannelSegment channelSegment2 = (ChannelSegment) BufferedChannel.sendSegment$volatile$FU.get(this);
        while (true) {
            long andIncrement = BufferedChannel.sendersAndCloseStatus$volatile$FU.getAndIncrement(this);
            long j4 = andIncrement & 1152921504606846975L;
            boolean isClosedForSend0 = this.isClosedForSend0(andIncrement);
            int i4 = BufferedChannelKt.SEGMENT_SIZE;
            long j5 = j4 / i4;
            int i5 = (int) (j4 % i4);
            if (channelSegment2.id != j5) {
                channelSegment = this.findSegmentSend(j5, channelSegment2);
                if (channelSegment != null) {
                    conflatedBufferedChannel = this;
                    i = i5;
                } else if (isClosedForSend0) {
                    return ChannelResult.INSTANCE.m1653closedJP2dKIU(this.getSendException());
                }
            } else {
                channelSegment = channelSegment2;
                i = i5;
                conflatedBufferedChannel = this;
            }
            E e4 = element;
            int updateCellSend = conflatedBufferedChannel.updateCellSend(channelSegment, i, e4, j4, obj, isClosedForSend0);
            ConflatedBufferedChannel<E> conflatedBufferedChannel2 = conflatedBufferedChannel;
            channelSegment2 = channelSegment;
            if (updateCellSend == 0) {
                channelSegment2.cleanPrev();
                return ChannelResult.INSTANCE.m1655successJP2dKIU(Unit.INSTANCE);
            }
            if (updateCellSend == 1) {
                return ChannelResult.INSTANCE.m1655successJP2dKIU(Unit.INSTANCE);
            }
            if (updateCellSend == 2) {
                if (isClosedForSend0) {
                    channelSegment2.onSlotCleaned();
                    return ChannelResult.INSTANCE.m1653closedJP2dKIU(conflatedBufferedChannel2.getSendException());
                }
                Waiter waiter = obj instanceof Waiter ? (Waiter) obj : null;
                if (waiter != null) {
                    conflatedBufferedChannel2.prepareSenderForSuspension(waiter, channelSegment2, i);
                }
                conflatedBufferedChannel2.dropFirstElementUntilTheSpecifiedCellIsInTheBuffer((channelSegment2.id * i4) + i);
                return ChannelResult.INSTANCE.m1655successJP2dKIU(Unit.INSTANCE);
            }
            if (updateCellSend == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (updateCellSend == 4) {
                if (j4 < conflatedBufferedChannel2.getReceiversCounter$kotlinx_coroutines_core()) {
                    channelSegment2.cleanPrev();
                }
                return ChannelResult.INSTANCE.m1653closedJP2dKIU(conflatedBufferedChannel2.getSendException());
            }
            if (updateCellSend == 5) {
                channelSegment2.cleanPrev();
            }
            this = conflatedBufferedChannel2;
            element = e4;
        }
    }

    /* renamed from: trySendImpl-Mj0NB7M, reason: not valid java name */
    private final Object m1658trySendImplMj0NB7M(E element, boolean isSendOp) {
        return this.onBufferOverflow == BufferOverflow.DROP_LATEST ? m1656trySendDropLatestMj0NB7M(element, isSendOp) : m1657trySendDropOldestJP2dKIU(element);
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    public boolean isConflatedDropOldest() {
        return this.onBufferOverflow == BufferOverflow.DROP_OLDEST;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.channels.BufferedChannel
    public void registerSelectForSend(SelectInstance<?> select, Object element) {
        Object mo1630trySendJP2dKIU = mo1630trySendJP2dKIU(element);
        if (!(mo1630trySendJP2dKIU instanceof ChannelResult.Failed)) {
            select.selectInRegistrationPhase(Unit.INSTANCE);
        } else {
            if (!(mo1630trySendJP2dKIU instanceof ChannelResult.Closed)) {
                throw new IllegalStateException("unreachable");
            }
            ChannelResult.m1644exceptionOrNullimpl(mo1630trySendJP2dKIU);
            select.selectInRegistrationPhase(BufferedChannelKt.getCHANNEL_CLOSED());
        }
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.SendChannel
    public Object send(E e4, Continuation<? super Unit> continuation) {
        return send$suspendImpl((ConflatedBufferedChannel) this, (Object) e4, continuation);
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    public Object sendBroadcast$kotlinx_coroutines_core(E e4, Continuation<? super Boolean> continuation) {
        return sendBroadcast$suspendImpl((ConflatedBufferedChannel) this, (Object) e4, continuation);
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    public boolean shouldSendSuspend$kotlinx_coroutines_core() {
        return false;
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.SendChannel
    /* renamed from: trySend-JP2dKIU */
    public Object mo1630trySendJP2dKIU(E element) {
        return m1658trySendImplMj0NB7M(element, false);
    }

    public ConflatedBufferedChannel(int i, BufferOverflow bufferOverflow, Function1<? super E, Unit> function1) {
        super(i, function1);
        this.capacity = i;
        this.onBufferOverflow = bufferOverflow;
        if (bufferOverflow != BufferOverflow.SUSPEND) {
            if (i < 1) {
                throw new IllegalArgumentException(w.i(i, "Buffered channel capacity must be at least 1, but ", " was specified").toString());
            }
        } else {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + Reflection.getOrCreateKotlinClass(BufferedChannel.class).getSimpleName() + " instead").toString());
        }
    }
}
