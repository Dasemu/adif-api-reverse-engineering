package t1;

import com.adif.elcanomovil.domain.entities.DataType;
import com.adif.elcanomovil.repositories.favourites.DefaultFavoritesRepository;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* renamed from: t1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0616a extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f8510a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f8511b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DataType f8512c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f8513d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ DefaultFavoritesRepository f8514e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Boolean f8515f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0616a(String str, DataType dataType, String str2, DefaultFavoritesRepository defaultFavoritesRepository, Boolean bool, Continuation continuation) {
        super(2, continuation);
        this.f8511b = str;
        this.f8512c = dataType;
        this.f8513d = str2;
        this.f8514e = defaultFavoritesRepository;
        this.f8515f = bool;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C0616a(this.f8511b, this.f8512c, this.f8513d, this.f8514e, this.f8515f, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0616a) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0061, code lost:
    
        if (r8.deleteFavouriteRouteType(r9, r10, r11, r12, r14) == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007f, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007d, code lost:
    
        if (r14.deleteFavouriteStationType(r15, r3, r1, r14) == r0) goto L32;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r14.f8510a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1b
            if (r1 == r3) goto L17
            if (r1 != r2) goto Lf
            goto L17
        Lf:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L17:
            kotlin.ResultKt.throwOnFailure(r15)
            goto L80
        L1b:
            kotlin.ResultKt.throwOnFailure(r15)
            java.lang.String r15 = r14.f8511b
            boolean r1 = kotlin.text.StringsKt.isBlank(r15)
            if (r1 == 0) goto L29
            kotlin.Unit r14 = kotlin.Unit.INSTANCE
            return r14
        L29:
            com.adif.elcanomovil.domain.entities.DataType r1 = com.adif.elcanomovil.domain.entities.DataType.ROUTE
            com.adif.elcanomovil.domain.entities.DataType r4 = r14.f8512c
            boolean r1 = r4.equals(r1)
            com.adif.elcanomovil.repositories.favourites.DefaultFavoritesRepository r5 = r14.f8514e
            java.lang.Boolean r6 = r14.f8515f
            if (r1 == 0) goto L64
            java.lang.String r1 = r14.f8513d
            if (r1 == 0) goto L64
            int r7 = r1.length()
            if (r7 <= 0) goto L64
            com.adif.elcanomovil.serviceStorage.database.FavouritesDao r8 = com.adif.elcanomovil.repositories.favourites.DefaultFavoritesRepository.access$getFavouritesDao$p(r5)
            int r9 = java.lang.Integer.parseInt(r15)
            int r10 = java.lang.Integer.parseInt(r1)
            if (r6 == 0) goto L55
            boolean r15 = r6.booleanValue()
            r11 = r15
            goto L56
        L55:
            r11 = r3
        L56:
            java.lang.String r12 = r4.name()
            r14.f8510a = r3
            r13 = r14
            java.lang.Object r14 = r8.deleteFavouriteRouteType(r9, r10, r11, r12, r13)
            if (r14 != r0) goto L80
            goto L7f
        L64:
            r13 = r14
            com.adif.elcanomovil.serviceStorage.database.FavouritesDao r14 = com.adif.elcanomovil.repositories.favourites.DefaultFavoritesRepository.access$getFavouritesDao$p(r5)
            int r15 = java.lang.Integer.parseInt(r15)
            if (r6 == 0) goto L73
            boolean r3 = r6.booleanValue()
        L73:
            java.lang.String r1 = r4.name()
            r13.f8510a = r2
            java.lang.Object r14 = r14.deleteFavouriteStationType(r15, r3, r1, r13)
            if (r14 != r0) goto L80
        L7f:
            return r0
        L80:
            kotlin.Unit r14 = kotlin.Unit.INSTANCE
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.C0616a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
