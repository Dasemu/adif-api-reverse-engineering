package com.adif.elcanomovil.uiTrain.main;

import android.net.Uri;
import com.adif.elcanomovil.commonNavGraph.navigation.IntentAction;
import com.adif.elcanomovil.commonNavGraph.navigation.Navigation;
import com.adif.elcanomovil.domain.entities.circulation.TrainCirculationInfo;
import com.adif.elcanomovil.domain.entities.deeplink.SocialMetaTag;
import com.adif.elcanomovil.domain.usecases.DynamicLinkUseCase;
import com.adif.elcanomovil.uiTrain.R;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes3.dex */
public final class r extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f5438a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TrainSituationViewModel f5439b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(TrainSituationViewModel trainSituationViewModel, Continuation continuation) {
        super(2, continuation);
        this.f5439b = trainSituationViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new r(this.f5439b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((r) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        DynamicLinkUseCase dynamicLinkUseCase;
        String str;
        String str2;
        Long l4;
        String str3;
        String str4;
        String str5;
        String str6;
        d1.g gVar;
        d1.g gVar2;
        d1.g gVar3;
        String str7;
        b1.f fVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f5438a;
        TrainSituationViewModel trainSituationViewModel = this.f5439b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            dynamicLinkUseCase = trainSituationViewModel.dynamicLinkUseCase;
            str = trainSituationViewModel.originStationCode;
            str2 = trainSituationViewModel.destinationStationCode;
            l4 = trainSituationViewModel.launchingDate;
            str3 = trainSituationViewModel.commercialNumber;
            String str8 = str3 == null ? "" : str3;
            str4 = trainSituationViewModel.commercialProduct;
            String str9 = str4 == null ? "" : str4;
            str5 = trainSituationViewModel.operator;
            String str10 = str5 == null ? "" : str5;
            str6 = trainSituationViewModel.observation;
            TrainCirculationInfo trainCirculationInfo = new TrainCirculationInfo(str, str2, l4, str8, str10, str6, str9);
            gVar = trainSituationViewModel.stringProvider;
            String a2 = ((d1.h) gVar).a(R.string.dynamic_link_metatag_title);
            gVar2 = trainSituationViewModel.stringProvider;
            SocialMetaTag socialMetaTag = new SocialMetaTag(a2, ((d1.h) gVar2).a(R.string.dynamic_link_metatag_message), "\"https://firebasestorage.googleapis.com/v0/b/glassy-droplet-734.appspot.com/o/Salidas_squared.jpg?alt=media&token=69d77a9c-70cc-467b-b84f-dbbd6c9de708\"");
            this.f5438a = 1;
            obj = dynamicLinkUseCase.linkFromTrain(trainCirculationInfo, socialMetaTag, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        Uri uri = (Uri) obj;
        if (uri == null) {
            return Unit.INSTANCE;
        }
        gVar3 = trainSituationViewModel.stringProvider;
        int i4 = R.string.dynamic_link_text_comercial;
        str7 = trainSituationViewModel.commercialNumber;
        String b4 = ((d1.h) gVar3).b(i4, str7 != null ? str7 : "", uri);
        fVar = trainSituationViewModel.navigationFlow;
        fVar.b(new Navigation.Intent(new IntentAction.Send(b4)));
        return Unit.INSTANCE;
    }
}
