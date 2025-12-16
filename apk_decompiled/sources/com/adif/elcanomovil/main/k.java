package com.adif.elcanomovil.main;

import com.adif.elcanomovil.commonNavGraph.navigation.Navigation;
import com.adif.elcanomovil.domain.entities.VersionUpdateStatus;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes.dex */
public final class k extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f4555a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BottomNavViewModel f4556b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(BottomNavViewModel bottomNavViewModel, Continuation continuation) {
        super(2, continuation);
        this.f4556b = bottomNavViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new k(this.f4556b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f4555a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final BottomNavViewModel bottomNavViewModel = this.f4556b;
            final Flow<VersionUpdateStatus> invoke = bottomNavViewModel.getGetVersionUpdateStatusUseCase().invoke();
            Flow<Navigation> flow = new Flow<Navigation>() { // from class: com.adif.elcanomovil.main.BottomNavViewModel$checkUpdateVersion$1$invokeSuspend$$inlined$mapNotNull$1

                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 BottomNavViewModel.kt\ncom/adif/elcanomovil/main/BottomNavViewModel$checkUpdateVersion$1\n*L\n1#1,222:1\n61#2:223\n62#2:225\n254#3:224\n*E\n"})
                /* renamed from: com.adif.elcanomovil.main.BottomNavViewModel$checkUpdateVersion$1$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;
                    final /* synthetic */ BottomNavViewModel this$0;

                    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                    @DebugMetadata(c = "com.adif.elcanomovil.main.BottomNavViewModel$checkUpdateVersion$1$invokeSuspend$$inlined$mapNotNull$1$2", f = "BottomNavViewModel.kt", i = {}, l = {225}, m = "emit", n = {}, s = {})
                    @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                    /* renamed from: com.adif.elcanomovil.main.BottomNavViewModel$checkUpdateVersion$1$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                    /* loaded from: classes.dex */
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= IntCompanionObject.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(FlowCollector flowCollector, BottomNavViewModel bottomNavViewModel) {
                        this.$this_unsafeFlow = flowCollector;
                        this.this$0 = bottomNavViewModel;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                        /*
                            r4 = this;
                            boolean r0 = r6 instanceof com.adif.elcanomovil.main.BottomNavViewModel$checkUpdateVersion$1$invokeSuspend$$inlined$mapNotNull$1.AnonymousClass2.AnonymousClass1
                            if (r0 == 0) goto L13
                            r0 = r6
                            com.adif.elcanomovil.main.BottomNavViewModel$checkUpdateVersion$1$invokeSuspend$$inlined$mapNotNull$1$2$1 r0 = (com.adif.elcanomovil.main.BottomNavViewModel$checkUpdateVersion$1$invokeSuspend$$inlined$mapNotNull$1.AnonymousClass2.AnonymousClass1) r0
                            int r1 = r0.label
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L13
                            int r1 = r1 - r2
                            r0.label = r1
                            goto L18
                        L13:
                            com.adif.elcanomovil.main.BottomNavViewModel$checkUpdateVersion$1$invokeSuspend$$inlined$mapNotNull$1$2$1 r0 = new com.adif.elcanomovil.main.BottomNavViewModel$checkUpdateVersion$1$invokeSuspend$$inlined$mapNotNull$1$2$1
                            r0.<init>(r6)
                        L18:
                            java.lang.Object r6 = r0.result
                            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                            int r2 = r0.label
                            r3 = 1
                            if (r2 == 0) goto L31
                            if (r2 != r3) goto L29
                            kotlin.ResultKt.throwOnFailure(r6)
                            goto L49
                        L29:
                            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                            r4.<init>(r5)
                            throw r4
                        L31:
                            kotlin.ResultKt.throwOnFailure(r6)
                            kotlinx.coroutines.flow.FlowCollector r6 = r4.$this_unsafeFlow
                            com.adif.elcanomovil.domain.entities.VersionUpdateStatus r5 = (com.adif.elcanomovil.domain.entities.VersionUpdateStatus) r5
                            com.adif.elcanomovil.main.BottomNavViewModel r4 = r4.this$0
                            com.adif.elcanomovil.commonNavGraph.navigation.Navigation r4 = com.adif.elcanomovil.main.BottomNavViewModel.access$createAlert(r4, r5)
                            if (r4 == 0) goto L49
                            r0.label = r3
                            java.lang.Object r4 = r6.emit(r4, r0)
                            if (r4 != r1) goto L49
                            return r1
                        L49:
                            kotlin.Unit r4 = kotlin.Unit.INSTANCE
                            return r4
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.main.BottomNavViewModel$checkUpdateVersion$1$invokeSuspend$$inlined$mapNotNull$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                    }
                }

                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super Navigation> flowCollector, Continuation continuation) {
                    Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, bottomNavViewModel), continuation);
                    return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
                }
            };
            C1.b bVar = new C1.b(bottomNavViewModel, 3);
            this.f4555a = 1;
            if (flow.collect(bVar, this) == coroutine_suspended) {
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
}
