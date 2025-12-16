package com.adif.elcanomovil.repositories.providers;

import android.content.Context;
import android.provider.Settings;
import com.adif.elcanomovil.domain.providers.CredentialsProvider;
import java.util.Date;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/adif/elcanomovil/repositories/providers/DefaultCredentialsProvider;", "Lcom/adif/elcanomovil/domain/providers/CredentialsProvider;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "generatePassword", "", "generateUserId", "getPersistentUserId", "repositories_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DefaultCredentialsProvider implements CredentialsProvider {
    private final Context context;

    public DefaultCredentialsProvider(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    @Override // com.adif.elcanomovil.domain.providers.CredentialsProvider
    public String generatePassword() {
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
        return uuid;
    }

    @Override // com.adif.elcanomovil.domain.providers.CredentialsProvider
    public String generateUserId() {
        return getPersistentUserId() + '_' + new Date().getTime();
    }

    @Override // com.adif.elcanomovil.domain.providers.CredentialsProvider
    public String getPersistentUserId() {
        String string = Settings.Secure.getString(this.context.getContentResolver(), "android_id");
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }
}
