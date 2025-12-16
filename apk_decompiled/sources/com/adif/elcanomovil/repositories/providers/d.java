package com.adif.elcanomovil.repositories.providers;

import android.net.Uri;
import com.adif.elcanomovil.domain.entities.deeplink.SocialMetaTag;
import com.google.firebase.dynamiclinks.DynamicLink;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class d extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SocialMetaTag f4639a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(SocialMetaTag socialMetaTag) {
        super(1);
        this.f4639a = socialMetaTag;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        DynamicLink.SocialMetaTagParameters.Builder socialMetaTagParameters = (DynamicLink.SocialMetaTagParameters.Builder) obj;
        Intrinsics.checkNotNullParameter(socialMetaTagParameters, "$this$socialMetaTagParameters");
        SocialMetaTag socialMetaTag = this.f4639a;
        socialMetaTagParameters.setTitle(socialMetaTag.getTitle());
        socialMetaTagParameters.setDescription(socialMetaTag.getMessage());
        socialMetaTagParameters.setImageUrl(Uri.parse(socialMetaTag.getImageUrl()));
        return Unit.INSTANCE;
    }
}
