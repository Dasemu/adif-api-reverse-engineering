package com.google.firebase.storage.ktx;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.storage.OnPausedListener;
import com.google.firebase.storage.OnProgressListener;
import com.google.firebase.storage.StorageTask;
import com.google.firebase.storage.StorageTaskScheduler;
import com.google.firebase.storage.ktx.TaskState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.channels.ChannelsKt;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.SendChannel;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lcom/google/firebase/storage/ktx/TaskState;"}, k = 3, mv = {1, 7, 1}, xi = 48)
@DebugMetadata(c = "com.google.firebase.storage.ktx.StorageKt$taskState$1", f = "Storage.kt", i = {}, l = {183}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class StorageKt$taskState$1<T> extends SuspendLambda implements Function2<ProducerScope<? super TaskState<T>>, Continuation<? super Unit>, Object> {
    final /* synthetic */ StorageTask<T> $this_taskState;
    private /* synthetic */ Object L$0;
    int label;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    /* renamed from: com.google.firebase.storage.ktx.StorageKt$taskState$1$1 */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends Lambda implements Function0<Unit> {
        final /* synthetic */ OnCompleteListener<T> $completionListener;
        final /* synthetic */ OnPausedListener<T> $pauseListener;
        final /* synthetic */ OnProgressListener<T> $progressListener;
        final /* synthetic */ StorageTask<T> $this_taskState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(StorageTask<T> storageTask, OnProgressListener<T> onProgressListener, OnPausedListener<T> onPausedListener, OnCompleteListener<T> onCompleteListener) {
            super(0);
            r1 = storageTask;
            r2 = onProgressListener;
            r3 = onPausedListener;
            r4 = onCompleteListener;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2() {
            r1.removeOnProgressListener(r2);
            r1.removeOnPausedListener(r3);
            r1.removeOnCompleteListener(r4);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StorageKt$taskState$1(StorageTask<T> storageTask, Continuation<? super StorageKt$taskState$1> continuation) {
        super(2, continuation);
        this.$this_taskState = storageTask;
    }

    /* renamed from: invokeSuspend$lambda-1 */
    public static final void m107invokeSuspend$lambda1(ProducerScope producerScope, StorageTask.SnapshotBase snapshotBase) {
        StorageTaskScheduler.getInstance().scheduleCallback(new d(producerScope, snapshotBase, 0));
    }

    /* renamed from: invokeSuspend$lambda-1$lambda-0 */
    public static final void m108invokeSuspend$lambda1$lambda0(ProducerScope producerScope, StorageTask.SnapshotBase snapshot) {
        Intrinsics.checkNotNullExpressionValue(snapshot, "snapshot");
        ChannelsKt.trySendBlocking(producerScope, new TaskState.InProgress(snapshot));
    }

    /* renamed from: invokeSuspend$lambda-3 */
    public static final void m109invokeSuspend$lambda3(ProducerScope producerScope, StorageTask.SnapshotBase snapshotBase) {
        StorageTaskScheduler.getInstance().scheduleCallback(new d(producerScope, snapshotBase, 1));
    }

    /* renamed from: invokeSuspend$lambda-3$lambda-2 */
    public static final void m110invokeSuspend$lambda3$lambda2(ProducerScope producerScope, StorageTask.SnapshotBase snapshot) {
        Intrinsics.checkNotNullExpressionValue(snapshot, "snapshot");
        ChannelsKt.trySendBlocking(producerScope, new TaskState.Paused(snapshot));
    }

    /* renamed from: invokeSuspend$lambda-4 */
    public static final void m111invokeSuspend$lambda4(ProducerScope producerScope, Task task) {
        if (task.isSuccessful()) {
            SendChannel.DefaultImpls.close$default(producerScope, null, 1, null);
        } else {
            CoroutineScopeKt.cancel(producerScope, "Error getting the TaskState", task.getException());
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        StorageKt$taskState$1 storageKt$taskState$1 = new StorageKt$taskState$1(this.$this_taskState, continuation);
        storageKt$taskState$1.L$0 = obj;
        return storageKt$taskState$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final ProducerScope producerScope = (ProducerScope) this.L$0;
            OnProgressListener<? super T> onProgressListener = new OnProgressListener() { // from class: com.google.firebase.storage.ktx.a
                @Override // com.google.firebase.storage.OnProgressListener
                public final void onProgress(Object obj2) {
                    StorageKt$taskState$1.m107invokeSuspend$lambda1(ProducerScope.this, (StorageTask.SnapshotBase) obj2);
                }
            };
            OnPausedListener<? super T> onPausedListener = new OnPausedListener() { // from class: com.google.firebase.storage.ktx.b
                @Override // com.google.firebase.storage.OnPausedListener
                public final void onPaused(Object obj2) {
                    StorageKt$taskState$1.m109invokeSuspend$lambda3(ProducerScope.this, (StorageTask.SnapshotBase) obj2);
                }
            };
            OnCompleteListener<T> onCompleteListener = new OnCompleteListener() { // from class: com.google.firebase.storage.ktx.c
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    StorageKt$taskState$1.m111invokeSuspend$lambda4(ProducerScope.this, task);
                }
            };
            this.$this_taskState.addOnProgressListener(onProgressListener);
            this.$this_taskState.addOnPausedListener(onPausedListener);
            this.$this_taskState.addOnCompleteListener(onCompleteListener);
            AnonymousClass1 anonymousClass1 = new Function0<Unit>() { // from class: com.google.firebase.storage.ktx.StorageKt$taskState$1.1
                final /* synthetic */ OnCompleteListener<T> $completionListener;
                final /* synthetic */ OnPausedListener<T> $pauseListener;
                final /* synthetic */ OnProgressListener<T> $progressListener;
                final /* synthetic */ StorageTask<T> $this_taskState;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(StorageTask<T> storageTask, OnProgressListener<T> onProgressListener2, OnPausedListener<T> onPausedListener2, OnCompleteListener<T> onCompleteListener2) {
                    super(0);
                    r1 = storageTask;
                    r2 = onProgressListener2;
                    r3 = onPausedListener2;
                    r4 = onCompleteListener2;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke */
                public final void invoke2() {
                    r1.removeOnProgressListener(r2);
                    r1.removeOnPausedListener(r3);
                    r1.removeOnCompleteListener(r4);
                }
            };
            this.label = 1;
            if (ProduceKt.awaitClose(producerScope, anonymousClass1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ProducerScope<? super TaskState<T>> producerScope, Continuation<? super Unit> continuation) {
        return ((StorageKt$taskState$1) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
