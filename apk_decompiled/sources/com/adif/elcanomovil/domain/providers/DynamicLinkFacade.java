package com.adif.elcanomovil.domain.providers;

import android.content.Intent;
import android.net.Uri;
import com.adif.elcanomovil.domain.entities.deeplink.SocialMetaTag;
import com.google.firebase.dynamiclinks.DynamicLink;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001JH\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH¦@¢\u0006\u0002\u0010\rJ\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000f\u001a\u00020\u0010H¦@¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/adif/elcanomovil/domain/providers/DynamicLinkFacade;", "", "create", "Landroid/net/Uri;", Constants.MessagePayloadKeys.FROM, "", "domainURIPrefix", "falloutLink", "appStoreId", "androidPackage", "bundleId", "metatag", "Lcom/adif/elcanomovil/domain/entities/deeplink/SocialMetaTag;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/adif/elcanomovil/domain/entities/deeplink/SocialMetaTag;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", DynamicLink.Builder.KEY_DYNAMIC_LINK, "intent", "Landroid/content/Intent;", "(Landroid/content/Intent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface DynamicLinkFacade {
    Object create(String str, String str2, String str3, String str4, String str5, String str6, SocialMetaTag socialMetaTag, Continuation<? super Uri> continuation);

    Object dynamicLink(Intent intent, Continuation<? super Uri> continuation);
}
