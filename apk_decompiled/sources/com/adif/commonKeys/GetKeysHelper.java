package com.adif.commonKeys;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0082 ¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0002H\u0082 ¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/adif/commonKeys/GetKeysHelper;", "", "", "getAccessKeyPro", "()Ljava/lang/String;", "getSecretKeyPro", "common-keys_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class GetKeysHelper {

    /* renamed from: a, reason: collision with root package name */
    public static final GetKeysHelper f4297a = new Object();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, com.adif.commonKeys.GetKeysHelper] */
    static {
        System.loadLibrary("api-keys");
    }

    private final native String getAccessKeyPro();

    private final native String getSecretKeyPro();

    public final String a() {
        return getAccessKeyPro();
    }

    public final String b() {
        return getSecretKeyPro();
    }
}
