package com.adif.elcanomovil.serviceNetworking.interceptors.auth;

import java.util.Map;

/* loaded from: classes.dex */
public interface IElcanoClientAuth {
    String getHeaderAuthorization() throws ElcanoAuthException;

    Map<String, String> getHeaders() throws ElcanoAuthException;
}
