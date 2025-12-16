package com.adif.elcanomovil.domain.usecases;

import android.content.Intent;
import android.net.Uri;
import com.adif.elcanomovil.commonNavGraph.arguments.NavArguments;
import com.adif.elcanomovil.domain.BuildConfig;
import com.adif.elcanomovil.domain.entities.CirculationType;
import com.adif.elcanomovil.domain.entities.circulation.TrainCirculationInfo;
import com.adif.elcanomovil.domain.entities.deeplink.DeepLinkResult;
import com.adif.elcanomovil.domain.entities.deeplink.SocialMetaTag;
import com.adif.elcanomovil.domain.providers.DynamicLinkFacade;
import com.google.firebase.analytics.FirebaseAnalytics;
import j1.C0401a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J<\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0082@¢\u0006\u0002\u0010\u0010J\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0086@¢\u0006\u0002\u0010\u0015J8\u0010\u0016\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0086@¢\u0006\u0002\u0010\u0010J \u0010\u0019\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0086@¢\u0006\u0002\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u001e\u001a\u00020\u0006H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/adif/elcanomovil/domain/usecases/DynamicLinkUseCase;", "", "dynamicLinkFacade", "Lcom/adif/elcanomovil/domain/providers/DynamicLinkFacade;", "(Lcom/adif/elcanomovil/domain/providers/DynamicLinkFacade;)V", "generateFromDeparturesTab", "Landroid/net/Uri;", NavArguments.ARG_DYNAMIC_LINKS_STATION_CODE, "", NavArguments.ARG_DYNAMIC_LINKS_STATION_TO_CODE, "isCercanias", "", "circulationType", "Lcom/adif/elcanomovil/domain/entities/CirculationType;", "metadataTag", "Lcom/adif/elcanomovil/domain/entities/deeplink/SocialMetaTag;", "(Ljava/lang/String;Ljava/lang/String;ZLcom/adif/elcanomovil/domain/entities/CirculationType;Lcom/adif/elcanomovil/domain/entities/deeplink/SocialMetaTag;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleLink", "Lcom/adif/elcanomovil/domain/entities/deeplink/DeepLinkResult;", "intent", "Landroid/content/Intent;", "(Landroid/content/Intent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "linkFromDeparture", "origin", FirebaseAnalytics.Param.DESTINATION, "linkFromTrain", "trainCirculationInfo", "Lcom/adif/elcanomovil/domain/entities/circulation/TrainCirculationInfo;", "(Lcom/adif/elcanomovil/domain/entities/circulation/TrainCirculationInfo;Lcom/adif/elcanomovil/domain/entities/deeplink/SocialMetaTag;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "linkResult", "uri", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DynamicLinkUseCase {
    private final DynamicLinkFacade dynamicLinkFacade;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CirculationType.values().length];
            try {
                iArr[CirculationType.DEPARTURE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CirculationType.ARRIVAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CirculationType.BETWEEN_STATIONS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public DynamicLinkUseCase(DynamicLinkFacade dynamicLinkFacade) {
        Intrinsics.checkNotNullParameter(dynamicLinkFacade, "dynamicLinkFacade");
        this.dynamicLinkFacade = dynamicLinkFacade;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object generateFromDeparturesTab(String str, String str2, boolean z3, CirculationType circulationType, SocialMetaTag socialMetaTag, Continuation<? super Uri> continuation) {
        String str3;
        Uri.Builder builder = new Uri.Builder();
        String str4 = z3 ? "cercanias" : "avldmd";
        Uri.Builder authority = builder.scheme("https").authority(NavArguments.ARG_DYNAMIC_PACKAGE);
        int i = WhenMappings.$EnumSwitchMapping$0[circulationType.ordinal()];
        if (i == 1) {
            str3 = "departure";
        } else if (i == 2) {
            str3 = NavArguments.ARG_DYNAMIC_ARRIVALS;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            str3 = NavArguments.ARG_DYNAMIC_JOURNEY;
        }
        authority.appendPath(str3).appendQueryParameter(NavArguments.ARG_DYNAMIC_LINKS_STATION_CODE, str).appendQueryParameter(NavArguments.ARG_DYNAMIC_LINKS_STATION_TRAFFIC, str4).appendQueryParameter(NavArguments.ARG_DYNAMIC_LINKS_COMMERCIAL_STOP_TYPE, "true").appendQueryParameter(NavArguments.ARG_DYNAMIC_LINKS_COMMERCIAL_SERVICE, "true");
        if (str2 != null) {
            builder.appendQueryParameter(NavArguments.ARG_DYNAMIC_LINKS_STATION_TO_CODE, str2);
        }
        DynamicLinkFacade dynamicLinkFacade = this.dynamicLinkFacade;
        String uri = builder.build().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        return dynamicLinkFacade.create(uri, BuildConfig.dynamicLinkUrl, "http://adif.es/es_ES/adif_movil.shtml", "960191892", com.adif.elcanomovil.BuildConfig.APPLICATION_ID, "es.adif.adifentumovil", socialMetaTag, continuation);
    }

    public static /* synthetic */ Object generateFromDeparturesTab$default(DynamicLinkUseCase dynamicLinkUseCase, String str, String str2, boolean z3, CirculationType circulationType, SocialMetaTag socialMetaTag, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return dynamicLinkUseCase.generateFromDeparturesTab(str, str2, z3, circulationType, socialMetaTag, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DeepLinkResult linkResult(Uri uri) {
        boolean contains$default;
        boolean contains$default2;
        boolean contains$default3;
        boolean contains$default4;
        String uri2 = uri.toString();
        Intrinsics.checkNotNullExpressionValue(uri2, "toString(...)");
        contains$default = StringsKt__StringsKt.contains$default(uri2, (CharSequence) "departure", false, 2, (Object) null);
        if (contains$default) {
            String queryParameter = uri.getQueryParameter(NavArguments.ARG_DYNAMIC_LINKS_STATION_CODE);
            return new DeepLinkResult.Departures(queryParameter != null ? queryParameter : "", null, CirculationType.DEPARTURE, Intrinsics.areEqual(uri.getQueryParameter(NavArguments.ARG_DYNAMIC_LINKS_STATION_TRAFFIC), "cercanias"));
        }
        String uri3 = uri.toString();
        Intrinsics.checkNotNullExpressionValue(uri3, "toString(...)");
        contains$default2 = StringsKt__StringsKt.contains$default(uri3, (CharSequence) NavArguments.ARG_DYNAMIC_ARRIVALS, false, 2, (Object) null);
        if (contains$default2) {
            String queryParameter2 = uri.getQueryParameter(NavArguments.ARG_DYNAMIC_LINKS_STATION_CODE);
            return new DeepLinkResult.Departures(queryParameter2 != null ? queryParameter2 : "", null, CirculationType.ARRIVAL, Intrinsics.areEqual(uri.getQueryParameter(NavArguments.ARG_DYNAMIC_LINKS_STATION_TRAFFIC), "cercanias"));
        }
        String uri4 = uri.toString();
        Intrinsics.checkNotNullExpressionValue(uri4, "toString(...)");
        contains$default3 = StringsKt__StringsKt.contains$default(uri4, (CharSequence) NavArguments.ARG_DYNAMIC_JOURNEY, false, 2, (Object) null);
        if (contains$default3) {
            String queryParameter3 = uri.getQueryParameter(NavArguments.ARG_DYNAMIC_LINKS_STATION_CODE);
            if (queryParameter3 == null) {
                queryParameter3 = "";
            }
            String queryParameter4 = uri.getQueryParameter(NavArguments.ARG_DYNAMIC_LINKS_STATION_TO_CODE);
            return new DeepLinkResult.Departures(queryParameter3, queryParameter4 != null ? queryParameter4 : "", CirculationType.BETWEEN_STATIONS, Intrinsics.areEqual(uri.getQueryParameter(NavArguments.ARG_DYNAMIC_LINKS_STATION_TRAFFIC), "cercanias"));
        }
        String uri5 = uri.toString();
        Intrinsics.checkNotNullExpressionValue(uri5, "toString(...)");
        contains$default4 = StringsKt__StringsKt.contains$default(uri5, (CharSequence) NavArguments.ARG_DYNAMIC_TRAIN, false, 2, (Object) null);
        if (!contains$default4) {
            return null;
        }
        String queryParameter5 = uri.getQueryParameter(NavArguments.ARG_DYNAMIC_LINKS_COMMERCIAL_NUMBER);
        String str = queryParameter5 == null ? "" : queryParameter5;
        String queryParameter6 = uri.getQueryParameter(NavArguments.ARG_DYNAMIC_LINKS_STATION_CODE);
        String str2 = queryParameter6 == null ? "" : queryParameter6;
        String queryParameter7 = uri.getQueryParameter(NavArguments.ARG_DYNAMIC_LINKS_STATION_TO_CODE);
        String str3 = queryParameter7 == null ? "" : queryParameter7;
        String queryParameter8 = uri.getQueryParameter(NavArguments.ARG_DYNAMIC_LINKS_LAUNCHDATE);
        return new DeepLinkResult.Train(new TrainCirculationInfo(str2, str3, Long.valueOf(queryParameter8 != null ? Long.parseLong(queryParameter8) : 0L), str, uri.getQueryParameter(NavArguments.ARG_DYNAMIC_LINKS_OPERATOR), null, uri.getQueryParameter(NavArguments.ARG_DYNAMIC_LINKS_COMMERCIAL_PRODUCT)));
    }

    public final Object handleLink(Intent intent, Continuation<? super DeepLinkResult> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new C0401a(this, intent, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object linkFromDeparture(java.lang.String r14, java.lang.String r15, boolean r16, com.adif.elcanomovil.domain.entities.CirculationType r17, com.adif.elcanomovil.domain.entities.deeplink.SocialMetaTag r18, kotlin.coroutines.Continuation<? super android.net.Uri> r19) {
        /*
            r13 = this;
            r0 = r19
            boolean r1 = r0 instanceof j1.C0402b
            if (r1 == 0) goto L15
            r1 = r0
            j1.b r1 = (j1.C0402b) r1
            int r2 = r1.f6911d
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f6911d = r2
            goto L1a
        L15:
            j1.b r1 = new j1.b
            r1.<init>(r13, r0)
        L1a:
            java.lang.Object r0 = r1.f6909b
            java.lang.Object r11 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r1.f6911d
            r12 = 1
            if (r2 == 0) goto L35
            if (r2 != r12) goto L2d
            kotlin.jvm.internal.Ref$ObjectRef r1 = r1.f6908a
            kotlin.ResultKt.throwOnFailure(r0)
            goto L58
        L2d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L35:
            kotlin.ResultKt.throwOnFailure(r0)
            kotlin.jvm.internal.Ref$ObjectRef r3 = new kotlin.jvm.internal.Ref$ObjectRef
            r3.<init>()
            j1.d r2 = new j1.d
            r10 = 0
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            r9 = r18
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r1.f6908a = r3
            r1.f6911d = r12
            java.lang.Object r0 = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(r2, r1)
            if (r0 != r11) goto L57
            return r11
        L57:
            r1 = r3
        L58:
            T r0 = r1.element
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.domain.usecases.DynamicLinkUseCase.linkFromDeparture(java.lang.String, java.lang.String, boolean, com.adif.elcanomovil.domain.entities.CirculationType, com.adif.elcanomovil.domain.entities.deeplink.SocialMetaTag, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object linkFromTrain(com.adif.elcanomovil.domain.entities.circulation.TrainCirculationInfo r11, com.adif.elcanomovil.domain.entities.deeplink.SocialMetaTag r12, kotlin.coroutines.Continuation<? super android.net.Uri> r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof j1.e
            if (r0 == 0) goto L13
            r0 = r13
            j1.e r0 = (j1.e) r0
            int r1 = r0.f6929d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6929d = r1
            goto L18
        L13:
            j1.e r0 = new j1.e
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.f6927b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f6929d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.jvm.internal.Ref$ObjectRef r10 = r0.f6926a
            kotlin.ResultKt.throwOnFailure(r13)
            goto L50
        L2b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L33:
            kotlin.ResultKt.throwOnFailure(r13)
            kotlin.jvm.internal.Ref$ObjectRef r5 = new kotlin.jvm.internal.Ref$ObjectRef
            r5.<init>()
            j1.g r4 = new j1.g
            r9 = 0
            r6 = r10
            r7 = r11
            r8 = r12
            r4.<init>(r5, r6, r7, r8, r9)
            r0.f6926a = r5
            r0.f6929d = r3
            java.lang.Object r10 = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(r4, r0)
            if (r10 != r1) goto L4f
            return r1
        L4f:
            r10 = r5
        L50:
            T r10 = r10.element
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.domain.usecases.DynamicLinkUseCase.linkFromTrain(com.adif.elcanomovil.domain.entities.circulation.TrainCirculationInfo, com.adif.elcanomovil.domain.entities.deeplink.SocialMetaTag, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
