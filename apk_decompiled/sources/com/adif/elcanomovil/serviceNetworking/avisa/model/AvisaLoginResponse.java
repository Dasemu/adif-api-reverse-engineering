package com.adif.elcanomovil.serviceNetworking.avisa.model;

import C.w;
import Z2.InterfaceC0101i;
import com.google.android.gms.measurement.internal.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000bR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000b¨\u0006\u001e"}, d2 = {"Lcom/adif/elcanomovil/serviceNetworking/avisa/model/AvisaLoginResponse;", "", "accessToken", "", "tokenType", "refreshToken", "expiresIn", "", "scope", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "getAccessToken", "()Ljava/lang/String;", "buildAuthHeader", "getBuildAuthHeader", "getExpiresIn", "()I", "getRefreshToken", "getScope", "getTokenType", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "service-networking_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class AvisaLoginResponse {
    private final String accessToken;
    private final int expiresIn;
    private final String refreshToken;
    private final String scope;
    private final String tokenType;

    public AvisaLoginResponse(@InterfaceC0101i(name = "access_token") String accessToken, @InterfaceC0101i(name = "token_type") String tokenType, @InterfaceC0101i(name = "refresh_token") String refreshToken, @InterfaceC0101i(name = "expires_in") int i, @InterfaceC0101i(name = "scope") String scope) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(tokenType, "tokenType");
        Intrinsics.checkNotNullParameter(refreshToken, "refreshToken");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.accessToken = accessToken;
        this.tokenType = tokenType;
        this.refreshToken = refreshToken;
        this.expiresIn = i;
        this.scope = scope;
    }

    public static /* synthetic */ AvisaLoginResponse copy$default(AvisaLoginResponse avisaLoginResponse, String str, String str2, String str3, int i, String str4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = avisaLoginResponse.accessToken;
        }
        if ((i4 & 2) != 0) {
            str2 = avisaLoginResponse.tokenType;
        }
        if ((i4 & 4) != 0) {
            str3 = avisaLoginResponse.refreshToken;
        }
        if ((i4 & 8) != 0) {
            i = avisaLoginResponse.expiresIn;
        }
        if ((i4 & 16) != 0) {
            str4 = avisaLoginResponse.scope;
        }
        String str5 = str4;
        String str6 = str3;
        return avisaLoginResponse.copy(str, str2, str6, i, str5);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccessToken() {
        return this.accessToken;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTokenType() {
        return this.tokenType;
    }

    /* renamed from: component3, reason: from getter */
    public final String getRefreshToken() {
        return this.refreshToken;
    }

    /* renamed from: component4, reason: from getter */
    public final int getExpiresIn() {
        return this.expiresIn;
    }

    /* renamed from: component5, reason: from getter */
    public final String getScope() {
        return this.scope;
    }

    public final AvisaLoginResponse copy(@InterfaceC0101i(name = "access_token") String accessToken, @InterfaceC0101i(name = "token_type") String tokenType, @InterfaceC0101i(name = "refresh_token") String refreshToken, @InterfaceC0101i(name = "expires_in") int expiresIn, @InterfaceC0101i(name = "scope") String scope) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(tokenType, "tokenType");
        Intrinsics.checkNotNullParameter(refreshToken, "refreshToken");
        Intrinsics.checkNotNullParameter(scope, "scope");
        return new AvisaLoginResponse(accessToken, tokenType, refreshToken, expiresIn, scope);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AvisaLoginResponse)) {
            return false;
        }
        AvisaLoginResponse avisaLoginResponse = (AvisaLoginResponse) other;
        return Intrinsics.areEqual(this.accessToken, avisaLoginResponse.accessToken) && Intrinsics.areEqual(this.tokenType, avisaLoginResponse.tokenType) && Intrinsics.areEqual(this.refreshToken, avisaLoginResponse.refreshToken) && this.expiresIn == avisaLoginResponse.expiresIn && Intrinsics.areEqual(this.scope, avisaLoginResponse.scope);
    }

    public final String getAccessToken() {
        return this.accessToken;
    }

    public final String getBuildAuthHeader() {
        return this.tokenType + ' ' + this.accessToken;
    }

    public final int getExpiresIn() {
        return this.expiresIn;
    }

    public final String getRefreshToken() {
        return this.refreshToken;
    }

    public final String getScope() {
        return this.scope;
    }

    public final String getTokenType() {
        return this.tokenType;
    }

    public int hashCode() {
        return this.scope.hashCode() + w.x(this.expiresIn, a.d(this.refreshToken, a.d(this.tokenType, this.accessToken.hashCode() * 31, 31), 31), 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AvisaLoginResponse(accessToken=");
        sb.append(this.accessToken);
        sb.append(", tokenType=");
        sb.append(this.tokenType);
        sb.append(", refreshToken=");
        sb.append(this.refreshToken);
        sb.append(", expiresIn=");
        sb.append(this.expiresIn);
        sb.append(", scope=");
        return a.n(sb, this.scope, ')');
    }
}
