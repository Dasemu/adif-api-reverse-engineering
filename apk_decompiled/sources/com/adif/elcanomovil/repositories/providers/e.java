package com.adif.elcanomovil.repositories.providers;

import android.net.Uri;
import com.adif.elcanomovil.domain.entities.deeplink.SocialMetaTag;
import com.google.firebase.dynamiclinks.DynamicLink;
import com.google.firebase.dynamiclinks.ktx.FirebaseDynamicLinksKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class e extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f4640a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f4641b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f4642c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f4643d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f4644e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f4645f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ SocialMetaTag f4646g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(String str, String str2, String str3, String str4, String str5, String str6, SocialMetaTag socialMetaTag) {
        super(1);
        this.f4640a = str;
        this.f4641b = str2;
        this.f4642c = str3;
        this.f4643d = str4;
        this.f4644e = str5;
        this.f4645f = str6;
        this.f4646g = socialMetaTag;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        DynamicLink.Builder shortLinkAsync = (DynamicLink.Builder) obj;
        Intrinsics.checkNotNullParameter(shortLinkAsync, "$this$shortLinkAsync");
        StringBuilder sb = new StringBuilder();
        sb.append(this.f4640a);
        sb.append("/?link=");
        sb.append(this.f4641b);
        sb.append("&ofl=");
        sb.append(this.f4642c);
        sb.append("&apn=");
        String str = this.f4643d;
        sb.append(str);
        sb.append("&ibi=");
        String str2 = this.f4644e;
        sb.append(str2);
        sb.append("&isi=");
        String str3 = this.f4645f;
        sb.append(str3);
        shortLinkAsync.setLongLink(Uri.parse(sb.toString()));
        FirebaseDynamicLinksKt.androidParameters(shortLinkAsync, str, b.f4637a);
        FirebaseDynamicLinksKt.iosParameters(shortLinkAsync, str2, new c(str3));
        FirebaseDynamicLinksKt.socialMetaTagParameters(shortLinkAsync, new d(this.f4646g));
        return Unit.INSTANCE;
    }
}
