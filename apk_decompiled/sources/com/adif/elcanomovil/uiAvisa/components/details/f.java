package com.adif.elcanomovil.uiAvisa.components.details;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import androidx.lifecycle.X;
import com.adif.elcanomovil.domain.entities.avisa.incidence.IncidencePicture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public final class f extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f4888a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f4889b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ IssueDetailsViewModel f4890c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(List list, boolean z3, IssueDetailsViewModel issueDetailsViewModel, Continuation continuation) {
        super(2, continuation);
        this.f4888a = list;
        this.f4889b = z3;
        this.f4890c = issueDetailsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new f(this.f4888a, this.f4889b, this.f4890c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        X x3;
        X x4;
        X x5;
        int collectionSizeOrDefault;
        Bitmap bitmap;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        ArrayList arrayList = null;
        List list = this.f4888a;
        if (list != null) {
            List list2 = list;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
            ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                String base64String = ((IncidencePicture) it.next()).getContent();
                if (base64String != null) {
                    Intrinsics.checkNotNullParameter(base64String, "base64String");
                    byte[] decode = Base64.decode(base64String, 0);
                    bitmap = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                    Intrinsics.checkNotNullExpressionValue(bitmap, "decodeByteArray(...)");
                } else {
                    bitmap = null;
                }
                arrayList2.add(bitmap);
            }
            arrayList = arrayList2;
        }
        IssueDetailsViewModel issueDetailsViewModel = this.f4890c;
        if (this.f4889b) {
            if (arrayList == null || arrayList.isEmpty()) {
                x4 = issueDetailsViewModel.systemPicturesLiveData;
                x4.k(CollectionsKt.emptyList());
            } else {
                x5 = issueDetailsViewModel.systemPicturesLiveData;
                x5.k(arrayList);
            }
        } else if (arrayList != null && !arrayList.isEmpty()) {
            x3 = issueDetailsViewModel.userPicturesLiveData;
            x3.k(arrayList);
        }
        return Unit.INSTANCE;
    }
}
