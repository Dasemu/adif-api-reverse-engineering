package com.adif.elcanomovil.uiAvisa.utils.ui;

import D1.c;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import com.adif.elcanomovil.uiAvisa.utils.ui.Utils;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;

/* loaded from: classes.dex */
public final class a extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f4920a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PictureGridView f4921b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f4922c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(PictureGridView pictureGridView, int i, Continuation continuation) {
        super(2, continuation);
        this.f4921b = pictureGridView;
        this.f4922c = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new a(this.f4921b, this.f4922c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List list;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f4920a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Utils.Companion companion = Utils.INSTANCE;
            PictureGridView pictureGridView = this.f4921b;
            Context context = pictureGridView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            int pxFromDp = companion.pxFromDp(context, 100);
            Context context2 = pictureGridView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            int pxFromDp2 = companion.pxFromDp(context2, 100);
            list = pictureGridView.images;
            int i4 = this.f4922c;
            Object obj2 = list.get(i4);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type android.graphics.Bitmap");
            Bitmap extractThumbnail = ThumbnailUtils.extractThumbnail((Bitmap) obj2, pxFromDp, pxFromDp2);
            MainCoroutineDispatcher main = Dispatchers.getMain();
            c cVar = new c(pictureGridView, i4, extractThumbnail, null);
            this.f4920a = 1;
            if (BuildersKt.withContext(main, cVar, this) == coroutine_suspended) {
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
