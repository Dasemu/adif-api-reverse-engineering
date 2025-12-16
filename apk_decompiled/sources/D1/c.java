package D1;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.adif.elcanomovil.uiAvisa.utils.ui.PictureGridView;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public final class c extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PictureGridView f375a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f376b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Bitmap f377c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(PictureGridView pictureGridView, int i, Bitmap bitmap, Continuation continuation) {
        super(2, continuation);
        this.f375a = pictureGridView;
        this.f376b = i;
        this.f377c = bitmap;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new c(this.f375a, this.f376b, this.f377c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List list;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        list = this.f375a.imageViews;
        ((ImageView) list.get(this.f376b)).setImageBitmap(this.f377c);
        return Unit.INSTANCE;
    }
}
