package com.adif.elcanomovil.repositories.providers;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.adif.elcanomovil.domain.providers.LogoProvider;
import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@¢\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/adif/elcanomovil/repositories/providers/DefaultLogoProvider;", "Lcom/adif/elcanomovil/domain/providers/LogoProvider;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "download", "Landroid/graphics/drawable/Drawable;", ImagesContract.URL, "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "repositories_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DefaultLogoProvider implements LogoProvider {
    private final Context context;

    public DefaultLogoProvider(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    @Override // com.adif.elcanomovil.domain.providers.LogoProvider
    public Object download(String str, Continuation<? super Drawable> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new i(this, str, null), continuation);
    }
}
