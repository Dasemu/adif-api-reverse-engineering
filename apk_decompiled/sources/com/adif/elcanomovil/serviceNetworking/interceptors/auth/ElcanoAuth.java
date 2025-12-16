package com.adif.elcanomovil.serviceNetworking.interceptors.auth;

import C.w;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TimeZone;
import java.util.TreeMap;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.UByte;
import u.AbstractC0629f;

/* loaded from: classes.dex */
public abstract class ElcanoAuth {
    protected static final String ELCANO_REQUEST = "elcano_request";
    public static final String HEADER_AUTHORIZATION = "Authorization";
    public static final String HEADER_CONTENT_CONTENTTYPE = "Content-type";
    public static final String HEADER_X_ELCANO_CLIENT = "X-Elcano-Client";
    public static final String HEADER_X_ELCANO_DATE = "X-Elcano-Date";
    public static final String HEADER_X_ELCANO_HOST = "X-Elcano-Host";
    public static final String HEADER_X_ELCANO_USERID = "X-Elcano-UserId";
    protected static final String HMAC_ALGORITHM = "HMAC-SHA256";
    protected String contentType;
    protected String elcanoAccessKey;
    protected String elcanoSecretKey;
    protected TreeMap<String, String> headers;
    protected final char[] hexArray = "0123456789ABCDEF".toCharArray();
    protected String host;
    protected String httpMethodName;
    protected String params;
    protected String path;
    protected String payload;
    protected Date requestDate;
    protected String signedHeaders;
    protected String xElcanoClient;
    protected String xElcanoDate;
    protected String xElcanoDateSimple;
    protected String xElcanoUserId;

    private String calculateHeaderAuthorization() throws ElcanoAuthException {
        String calculateSignature = calculateSignature(prepareStringToSign(prepareCanonicalRequest()));
        if (calculateSignature != null) {
            return buildAuthorizationString(calculateSignature);
        }
        throw new ElcanoAuthException("Signature parameters missed");
    }

    public static String getDate(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat.format(date);
    }

    public String buildAuthorizationString(String str) {
        return "HMAC-SHA256 Credential=" + this.elcanoAccessKey + RemoteSettings.FORWARD_SLASH_STRING + this.xElcanoDateSimple + RemoteSettings.FORWARD_SLASH_STRING + this.xElcanoClient + RemoteSettings.FORWARD_SLASH_STRING + this.xElcanoUserId + "/elcano_request,SignedHeaders=" + this.signedHeaders + ",Signature=" + str;
    }

    public String bytesToHex(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i = 0; i < bArr.length; i++) {
            byte b4 = bArr[i];
            int i4 = b4 & UByte.MAX_VALUE;
            int i5 = i * 2;
            char[] cArr2 = this.hexArray;
            cArr[i5] = cArr2[i4 >>> 4];
            cArr[i5 + 1] = cArr2[b4 & 15];
        }
        return new String(cArr).toLowerCase();
    }

    public String calculateSignature(String str) throws ElcanoAuthException {
        try {
            return bytesToHex(hmacSha256(getSignatureKey(this.elcanoSecretKey, this.xElcanoDateSimple, this.xElcanoClient), str));
        } catch (Exception e4) {
            throw new ElcanoAuthException("The calculation of the signature throws an exception. Ex: " + e4.getMessage());
        }
    }

    public String formatPayload(String str) {
        if (str == null) {
            str = "";
        }
        return str.replace("\r", "").replace("\n", "").replace(" ", "");
    }

    public String getHeaderAuthorization() throws ElcanoAuthException {
        return calculateHeaderAuthorization();
    }

    public Map<String, String> getHeaders() throws ElcanoAuthException {
        TreeMap<String, String> treeMap = new TreeMap<>();
        this.headers = treeMap;
        treeMap.put(HEADER_X_ELCANO_HOST, this.host);
        this.headers.put(HEADER_CONTENT_CONTENTTYPE, this.contentType);
        this.headers.put(HEADER_X_ELCANO_CLIENT, this.xElcanoClient);
        this.headers.put(HEADER_X_ELCANO_DATE, getTimeStamp());
        this.headers.put(HEADER_X_ELCANO_USERID, this.xElcanoUserId);
        this.headers.put("Authorization", calculateHeaderAuthorization());
        return this.headers;
    }

    public byte[] getSignatureKey(String str, String str2, String str3) throws ElcanoAuthException {
        return hmacSha256(hmacSha256(hmacSha256(str.getBytes(StandardCharsets.UTF_8), str2), str3), ELCANO_REQUEST);
    }

    public String getTimeStamp() {
        return getTimeStamp(this.requestDate);
    }

    public byte[] hmacSha256(byte[] bArr, String str) throws ElcanoAuthException {
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(new SecretKeySpec(bArr, "HmacSHA256"));
            return mac.doFinal(str.getBytes(StandardCharsets.UTF_8));
        } catch (InvalidKeyException e4) {
            throw new ElcanoAuthException("The key is not valid. Ex: " + e4.getMessage());
        } catch (NoSuchAlgorithmException e5) {
            throw new ElcanoAuthException("The algorithm HmacSHA256 is not supported. Ex: " + e5.getMessage());
        }
    }

    public String prepareCanonicalRequest() throws ElcanoAuthException {
        StringBuilder sb = new StringBuilder();
        sb.append(this.httpMethodName);
        sb.append("\n");
        sb.append(this.path);
        sb.append("\n");
        sb.append(this.params);
        sb.append("\n");
        sb.append(HEADER_CONTENT_CONTENTTYPE.toLowerCase());
        sb.append(":");
        sb.append(this.contentType);
        sb.append("\n");
        sb.append(HEADER_X_ELCANO_HOST.toLowerCase());
        sb.append(":");
        sb.append(this.host);
        sb.append("\n");
        sb.append(HEADER_X_ELCANO_CLIENT.toLowerCase());
        sb.append(":");
        sb.append(this.xElcanoClient);
        sb.append("\n");
        sb.append(HEADER_X_ELCANO_DATE.toLowerCase());
        sb.append(":");
        sb.append(this.xElcanoDate);
        sb.append("\n");
        sb.append(HEADER_X_ELCANO_USERID.toLowerCase());
        sb.append(":");
        sb.append(this.xElcanoUserId);
        sb.append("\n");
        sb.append(HEADER_CONTENT_CONTENTTYPE.toLowerCase());
        sb.append(";");
        sb.append(HEADER_X_ELCANO_HOST.toLowerCase());
        sb.append(";");
        sb.append(HEADER_X_ELCANO_CLIENT.toLowerCase());
        sb.append(";");
        sb.append(HEADER_X_ELCANO_DATE.toLowerCase());
        sb.append(";");
        sb.append(HEADER_X_ELCANO_USERID.toLowerCase());
        sb.append("\n");
        this.signedHeaders = HEADER_CONTENT_CONTENTTYPE.toLowerCase() + ";" + HEADER_X_ELCANO_HOST.toLowerCase() + ";" + HEADER_X_ELCANO_CLIENT.toLowerCase() + ";" + HEADER_X_ELCANO_DATE.toLowerCase() + ";" + HEADER_X_ELCANO_USERID.toLowerCase();
        String formatPayload = formatPayload(this.payload);
        this.payload = formatPayload;
        sb.append(toHex(formatPayload));
        return sb.toString();
    }

    public String prepareStringToSign(String str) throws ElcanoAuthException {
        StringBuilder a2 = AbstractC0629f.a(w.r(new StringBuilder("HMAC-SHA256\n"), this.xElcanoDate, "\n"));
        a2.append(this.xElcanoDateSimple);
        a2.append(RemoteSettings.FORWARD_SLASH_STRING);
        a2.append(this.xElcanoClient);
        a2.append(RemoteSettings.FORWARD_SLASH_STRING);
        StringBuilder a4 = AbstractC0629f.a(w.r(a2, this.xElcanoUserId, "/elcano_request\n"));
        a4.append(toHex(str));
        return a4.toString();
    }

    public String toHex(String str) throws ElcanoAuthException {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str.getBytes(StandardCharsets.UTF_8));
            return String.format("%064x", new BigInteger(1, messageDigest.digest()));
        } catch (NoSuchAlgorithmException e4) {
            throw new ElcanoAuthException("The algorithm SHA-256 is not supported. Ex: " + e4.getMessage());
        }
    }

    public static String getTimeStamp(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd'T'HHmmss'Z'");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat.format(date);
    }
}
