package com.adif.elcanomovil.uiHome.mappers;

import android.content.Context;
import android.text.Spannable;
import com.adif.elcanomovil.commonViews.data.StationViewEntity;
import com.adif.elcanomovil.domain.entities.DataType;
import com.adif.elcanomovil.domain.entities.FavouriteStation;
import com.adif.elcanomovil.domain.entities.FavouriteTrain;
import com.adif.elcanomovil.domain.usecases.stations.GetStationByIdUseCase;
import com.adif.elcanomovil.resources.StringUtils;
import com.adif.elcanomovil.uiHome.R;
import com.google.firebase.messaging.Constants;
import dagger.hilt.android.qualifiers.ApplicationContext;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Singleton
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0082@¢\u0006\u0002\u0010\u000bJ\u0018\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\t\u001a\u00020\nH\u0082@¢\u0006\u0002\u0010\u000bJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0082@¢\u0006\u0002\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J&\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u001a2\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u001aH\u0086@¢\u0006\u0002\u0010\u001cJ&\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u001a2\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u001aH\u0086@¢\u0006\u0002\u0010\u001cR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/adif/elcanomovil/uiHome/mappers/UserFavoriteVOMapper;", "", "context", "Landroid/content/Context;", "getStationByIdUseCase", "Lcom/adif/elcanomovil/domain/usecases/stations/GetStationByIdUseCase;", "(Landroid/content/Context;Lcom/adif/elcanomovil/domain/usecases/stations/GetStationByIdUseCase;)V", "favouriteStationToStationVO", "Lcom/adif/elcanomovil/uiHome/data/UserFavoriteVO;", "stationFavourite", "Lcom/adif/elcanomovil/domain/entities/FavouriteStation;", "(Lcom/adif/elcanomovil/domain/entities/FavouriteStation;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSubtitle", "Landroid/text/Spannable;", "getTitle", "getTrainSubTitle", "", "favouriteTrain", "Lcom/adif/elcanomovil/domain/entities/FavouriteTrain;", "(Lcom/adif/elcanomovil/domain/entities/FavouriteTrain;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTrainTitle", "getTypeTraffic", "Lcom/adif/elcanomovil/commonViews/data/StationViewEntity$TypeTraffic;", "isCercanaias", "", "mapFavourites", "", Constants.MessagePayloadKeys.FROM, "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "mapTrainFavourites", "ui-home_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nUserFavoriteVOMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserFavoriteVOMapper.kt\ncom/adif/elcanomovil/uiHome/mappers/UserFavoriteVOMapper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,162:1\n1603#2,9:163\n1855#2:172\n1856#2:174\n1612#2:175\n1549#2:176\n1620#2,3:177\n1#3:173\n1#3:180\n*S KotlinDebug\n*F\n+ 1 UserFavoriteVOMapper.kt\ncom/adif/elcanomovil/uiHome/mappers/UserFavoriteVOMapper\n*L\n23#1:163,9\n23#1:172\n23#1:174\n23#1:175\n42#1:176\n42#1:177,3\n23#1:173\n*E\n"})
/* loaded from: classes2.dex */
public final class UserFavoriteVOMapper {
    private final Context context;
    private final GetStationByIdUseCase getStationByIdUseCase;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DataType.values().length];
            try {
                iArr[DataType.ARRIVALS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DataType.DEPARTURES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DataType.INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DataType.ROUTE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Inject
    public UserFavoriteVOMapper(@ApplicationContext Context context, GetStationByIdUseCase getStationByIdUseCase) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(getStationByIdUseCase, "getStationByIdUseCase");
        this.context = context;
        this.getStationByIdUseCase = getStationByIdUseCase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object favouriteStationToStationVO(com.adif.elcanomovil.domain.entities.FavouriteStation r13, kotlin.coroutines.Continuation<? super com.adif.elcanomovil.uiHome.data.UserFavoriteVO> r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof H1.a
            if (r0 == 0) goto L13
            r0 = r14
            H1.a r0 = (H1.a) r0
            int r1 = r0.f666f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f666f = r1
            goto L18
        L13:
            H1.a r0 = new H1.a
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.f664d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f666f
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            android.text.Spannable r12 = r0.f663c
            com.adif.elcanomovil.domain.entities.FavouriteStation r13 = r0.f662b
            com.adif.elcanomovil.uiHome.mappers.UserFavoriteVOMapper r0 = r0.f661a
            kotlin.ResultKt.throwOnFailure(r14)
            r6 = r12
            r12 = r0
            goto L53
        L31:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L39:
            kotlin.ResultKt.throwOnFailure(r14)
            android.text.Spannable r14 = r12.getTitle(r13)
            if (r14 == 0) goto L84
            r0.f661a = r12
            r0.f662b = r13
            r0.f663c = r14
            r0.f666f = r3
            java.lang.Object r0 = r12.getSubtitle(r13, r0)
            if (r0 != r1) goto L51
            return r1
        L51:
            r6 = r14
            r14 = r0
        L53:
            r8 = r14
            android.text.Spannable r8 = (android.text.Spannable) r8
            if (r8 == 0) goto L84
            com.adif.elcanomovil.uiHome.data.UserFavoriteVO r4 = new com.adif.elcanomovil.uiHome.data.UserFavoriteVO
            int r14 = r13.getId()
            java.lang.String r5 = java.lang.String.valueOf(r14)
            java.lang.String r7 = r13.getIdentifierStation()
            java.lang.String r9 = r13.getIdentifierToStation()
            java.lang.String r14 = r13.getType()
            com.adif.elcanomovil.domain.entities.DataType r10 = com.adif.elcanomovil.domain.entities.DataType.valueOf(r14)
            java.lang.Boolean r13 = r13.isCercanias()
            if (r13 == 0) goto L7c
            boolean r3 = r13.booleanValue()
        L7c:
            com.adif.elcanomovil.commonViews.data.StationViewEntity$TypeTraffic r11 = r12.getTypeTraffic(r3)
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            return r4
        L84:
            r12 = 0
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.uiHome.mappers.UserFavoriteVOMapper.favouriteStationToStationVO(com.adif.elcanomovil.domain.entities.FavouriteStation, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getSubtitle(com.adif.elcanomovil.domain.entities.FavouriteStation r11, kotlin.coroutines.Continuation<? super android.text.Spannable> r12) {
        /*
            Method dump skipped, instructions count: 546
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.uiHome.mappers.UserFavoriteVOMapper.getSubtitle(com.adif.elcanomovil.domain.entities.FavouriteStation, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final Spannable getTitle(FavouriteStation stationFavourite) {
        int i = WhenMappings.$EnumSwitchMapping$0[DataType.valueOf(stationFavourite.getType()).ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            StringUtils.Companion companion = StringUtils.INSTANCE;
            Context context = this.context;
            String stationName = stationFavourite.getStationName();
            if (stationName == null) {
                stationName = "";
            }
            return companion.textSemiBold(context, 0, 0, null, stationName);
        }
        if (i != 4) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Context context2 = this.context;
        int i4 = R.string.from_route;
        sb.append(context2.getString(i4));
        sb.append(' ');
        sb.append(stationFavourite.getStationName());
        String sb2 = sb.toString();
        StringUtils.Companion companion2 = StringUtils.INSTANCE;
        Context context3 = this.context;
        return companion2.textSemiBold(context3, 0, context3.getString(i4).length(), Integer.valueOf(this.context.getResources().getColor(R.color.colorPrimary)), sb2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.lang.Object[], java.io.Serializable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getTrainSubTitle(com.adif.elcanomovil.domain.entities.FavouriteTrain r11, kotlin.coroutines.Continuation<? super java.lang.String> r12) {
        /*
            Method dump skipped, instructions count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.uiHome.mappers.UserFavoriteVOMapper.getTrainSubTitle(com.adif.elcanomovil.domain.entities.FavouriteTrain, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final Spannable getTrainTitle(FavouriteTrain favouriteTrain) {
        return StringUtils.INSTANCE.textSemiBold(this.context, 0, 0, null, favouriteTrain.getOperator() + ' ' + favouriteTrain.getCommercialProduct() + '#' + favouriteTrain.getCommercialNumber());
    }

    private final StationViewEntity.TypeTraffic getTypeTraffic(boolean isCercanaias) {
        return isCercanaias ? StationViewEntity.TypeTraffic.CERCANIAS : StationViewEntity.TypeTraffic.AVLDMD;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x006e -> B:10:0x0033). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mapFavourites(java.util.List<com.adif.elcanomovil.domain.entities.FavouriteStation> r7, kotlin.coroutines.Continuation<? super java.util.List<com.adif.elcanomovil.uiHome.data.UserFavoriteVO>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof H1.d
            if (r0 == 0) goto L13
            r0 = r8
            H1.d r0 = (H1.d) r0
            int r1 = r0.f684f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f684f = r1
            goto L18
        L13:
            H1.d r0 = new H1.d
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f682d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f684f
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            java.util.Iterator r6 = r0.f681c
            java.util.Collection r7 = r0.f680b
            java.util.Collection r7 = (java.util.Collection) r7
            com.adif.elcanomovil.uiHome.mappers.UserFavoriteVOMapper r2 = r0.f679a
            kotlin.ResultKt.throwOnFailure(r8)
            r5 = r0
            r0 = r7
            r7 = r2
        L33:
            r2 = r5
            goto L72
        L35:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3d:
            kotlin.ResultKt.throwOnFailure(r8)
            if (r7 == 0) goto L7f
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r7 = r7.iterator()
            r5 = r7
            r7 = r6
            r6 = r5
        L50:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L7c
            java.lang.Object r2 = r6.next()
            com.adif.elcanomovil.domain.entities.FavouriteStation r2 = (com.adif.elcanomovil.domain.entities.FavouriteStation) r2
            r0.f679a = r7
            r4 = r8
            java.util.Collection r4 = (java.util.Collection) r4
            r0.f680b = r4
            r0.f681c = r6
            r0.f684f = r3
            java.lang.Object r2 = r7.favouriteStationToStationVO(r2, r0)
            if (r2 != r1) goto L6e
            return r1
        L6e:
            r5 = r0
            r0 = r8
            r8 = r2
            goto L33
        L72:
            com.adif.elcanomovil.uiHome.data.UserFavoriteVO r8 = (com.adif.elcanomovil.uiHome.data.UserFavoriteVO) r8
            if (r8 == 0) goto L79
            r0.add(r8)
        L79:
            r8 = r0
            r0 = r2
            goto L50
        L7c:
            java.util.List r8 = (java.util.List) r8
            return r8
        L7f:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.uiHome.mappers.UserFavoriteVOMapper.mapFavourites(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x009d -> B:10:0x00a1). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mapTrainFavourites(java.util.List<com.adif.elcanomovil.domain.entities.FavouriteTrain> r17, kotlin.coroutines.Continuation<? super java.util.List<com.adif.elcanomovil.uiHome.data.UserFavoriteVO>> r18) {
        /*
            r16 = this;
            r0 = r18
            boolean r1 = r0 instanceof H1.e
            if (r1 == 0) goto L17
            r1 = r0
            H1.e r1 = (H1.e) r1
            int r2 = r1.f692j
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f692j = r2
            r2 = r16
            goto L1e
        L17:
            H1.e r1 = new H1.e
            r2 = r16
            r1.<init>(r2, r0)
        L1e:
            java.lang.Object r0 = r1.h
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r1.f692j
            r5 = 1
            if (r4 == 0) goto L50
            if (r4 != r5) goto L48
            java.util.Collection r2 = r1.f691g
            java.util.Collection r2 = (java.util.Collection) r2
            java.lang.String r4 = r1.f690f
            android.text.Spannable r6 = r1.f689e
            java.lang.String r7 = r1.f688d
            java.util.Iterator r8 = r1.f687c
            java.util.Collection r9 = r1.f686b
            java.util.Collection r9 = (java.util.Collection) r9
            com.adif.elcanomovil.uiHome.mappers.UserFavoriteVOMapper r10 = r1.f685a
            kotlin.ResultKt.throwOnFailure(r0)
            r15 = r8
            r14 = r9
            r8 = r6
            r9 = r7
            r7 = r4
            r4 = r2
            r2 = r10
            goto La1
        L48:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L50:
            kotlin.ResultKt.throwOnFailure(r0)
            if (r17 == 0) goto Lbb
            r0 = r17
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r4 = new java.util.ArrayList
            int r6 = kotlin.collections.CollectionsKt.g(r0)
            r4.<init>(r6)
            java.util.Iterator r0 = r0.iterator()
            r8 = r0
        L67:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto Lb8
            java.lang.Object r0 = r8.next()
            com.adif.elcanomovil.domain.entities.FavouriteTrain r0 = (com.adif.elcanomovil.domain.entities.FavouriteTrain) r0
            long r6 = r0.getLaunchingDate()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            android.text.Spannable r7 = r2.getTrainTitle(r0)
            java.lang.String r9 = r0.getCommercialNumber()
            r1.f685a = r2
            r10 = r4
            java.util.Collection r10 = (java.util.Collection) r10
            r1.f686b = r10
            r1.f687c = r8
            r1.f688d = r9
            r1.f689e = r7
            r1.f690f = r6
            r1.f691g = r10
            r1.f692j = r5
            java.lang.Object r0 = r2.getTrainSubTitle(r0, r1)
            if (r0 != r3) goto L9d
            return r3
        L9d:
            r14 = r4
            r15 = r8
            r8 = r7
            r7 = r6
        La1:
            r10 = r0
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10
            com.adif.elcanomovil.domain.entities.DataType r12 = com.adif.elcanomovil.domain.entities.DataType.COMMERCIAL
            r0 = 0
            com.adif.elcanomovil.commonViews.data.StationViewEntity$TypeTraffic r13 = r2.getTypeTraffic(r0)
            com.adif.elcanomovil.uiHome.data.UserFavoriteVO r6 = new com.adif.elcanomovil.uiHome.data.UserFavoriteVO
            java.lang.String r11 = ""
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            r4.add(r6)
            r4 = r14
            r8 = r15
            goto L67
        Lb8:
            java.util.List r4 = (java.util.List) r4
            return r4
        Lbb:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.uiHome.mappers.UserFavoriteVOMapper.mapTrainFavourites(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
