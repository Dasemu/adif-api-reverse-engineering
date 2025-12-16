package com.adif.elcanomovil.repositories.providers;

import com.adif.elcanomovil.domain.providers.DynamicLinkFacade;
import com.google.firebase.dynamiclinks.DynamicLink;
import com.google.firebase.dynamiclinks.FirebaseDynamicLinks;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004JH\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0096@¢\u0006\u0002\u0010\u0010J\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0012\u001a\u00020\u0013H\u0096@¢\u0006\u0002\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/adif/elcanomovil/repositories/providers/DefaultDynamicLinkFacade;", "Lcom/adif/elcanomovil/domain/providers/DynamicLinkFacade;", "firebaseDynamicLinks", "Lcom/google/firebase/dynamiclinks/FirebaseDynamicLinks;", "(Lcom/google/firebase/dynamiclinks/FirebaseDynamicLinks;)V", "create", "Landroid/net/Uri;", Constants.MessagePayloadKeys.FROM, "", "domainURIPrefix", "falloutLink", "appStoreId", "androidPackage", "bundleId", "metatag", "Lcom/adif/elcanomovil/domain/entities/deeplink/SocialMetaTag;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/adif/elcanomovil/domain/entities/deeplink/SocialMetaTag;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", DynamicLink.Builder.KEY_DYNAMIC_LINK, "intent", "Landroid/content/Intent;", "(Landroid/content/Intent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "repositories_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DefaultDynamicLinkFacade implements DynamicLinkFacade {
    private final FirebaseDynamicLinks firebaseDynamicLinks;

    public DefaultDynamicLinkFacade(FirebaseDynamicLinks firebaseDynamicLinks) {
        Intrinsics.checkNotNullParameter(firebaseDynamicLinks, "firebaseDynamicLinks");
        this.firebaseDynamicLinks = firebaseDynamicLinks;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.adif.elcanomovil.domain.providers.DynamicLinkFacade
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object create(java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, com.adif.elcanomovil.domain.entities.deeplink.SocialMetaTag r12, kotlin.coroutines.Continuation<? super android.net.Uri> r13) {
        /*
            r5 = this;
            boolean r0 = r13 instanceof com.adif.elcanomovil.repositories.providers.a
            if (r0 == 0) goto L13
            r0 = r13
            com.adif.elcanomovil.repositories.providers.a r0 = (com.adif.elcanomovil.repositories.providers.a) r0
            int r1 = r0.f4636c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4636c = r1
            goto L18
        L13:
            com.adif.elcanomovil.repositories.providers.a r0 = new com.adif.elcanomovil.repositories.providers.a
            r0.<init>(r5, r13)
        L18:
            java.lang.Object r13 = r0.f4634a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f4636c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.ResultKt.throwOnFailure(r13)
            goto L55
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.ResultKt.throwOnFailure(r13)
            java.lang.String r13 = "UTF-8"
            java.lang.String r6 = java.net.URLEncoder.encode(r6, r13)
            com.google.firebase.dynamiclinks.FirebaseDynamicLinks r13 = r5.firebaseDynamicLinks
            com.adif.elcanomovil.repositories.providers.e r5 = new com.adif.elcanomovil.repositories.providers.e
            r4 = r7
            r7 = r6
            r6 = r4
            r4 = r11
            r11 = r9
            r9 = r10
            r10 = r4
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            com.google.android.gms.tasks.Task r5 = com.google.firebase.dynamiclinks.ktx.FirebaseDynamicLinksKt.shortLinkAsync(r13, r5)
            r0.f4636c = r3
            java.lang.Object r13 = kotlinx.coroutines.tasks.TasksKt.await(r5, r0)
            if (r13 != r1) goto L55
            return r1
        L55:
            com.google.firebase.dynamiclinks.ShortDynamicLink r13 = (com.google.firebase.dynamiclinks.ShortDynamicLink) r13
            android.net.Uri r5 = r13.getShortLink()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.repositories.providers.DefaultDynamicLinkFacade.create(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.adif.elcanomovil.domain.entities.deeplink.SocialMetaTag, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.adif.elcanomovil.domain.providers.DynamicLinkFacade
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object dynamicLink(android.content.Intent r5, kotlin.coroutines.Continuation<? super android.net.Uri> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.adif.elcanomovil.repositories.providers.f
            if (r0 == 0) goto L13
            r0 = r6
            com.adif.elcanomovil.repositories.providers.f r0 = (com.adif.elcanomovil.repositories.providers.f) r0
            int r1 = r0.f4649c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4649c = r1
            goto L18
        L13:
            com.adif.elcanomovil.repositories.providers.f r0 = new com.adif.elcanomovil.repositories.providers.f
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f4647a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f4649c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.ResultKt.throwOnFailure(r6)
            goto L48
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.ResultKt.throwOnFailure(r6)
            com.google.firebase.dynamiclinks.FirebaseDynamicLinks r4 = r4.firebaseDynamicLinks
            com.google.android.gms.tasks.Task r4 = r4.getDynamicLink(r5)
            java.lang.String r5 = "getDynamicLink(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            r0.f4649c = r3
            java.lang.Object r6 = kotlinx.coroutines.tasks.TasksKt.await(r4, r0)
            if (r6 != r1) goto L48
            return r1
        L48:
            com.google.firebase.dynamiclinks.PendingDynamicLinkData r6 = (com.google.firebase.dynamiclinks.PendingDynamicLinkData) r6
            if (r6 != 0) goto L4e
            r4 = 0
            return r4
        L4e:
            android.net.Uri r4 = r6.getLink()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.repositories.providers.DefaultDynamicLinkFacade.dynamicLink(android.content.Intent, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
