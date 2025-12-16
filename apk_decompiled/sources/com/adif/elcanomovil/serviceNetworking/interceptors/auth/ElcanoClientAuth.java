package com.adif.elcanomovil.serviceNetworking.interceptors.auth;

import java.util.Date;

/* loaded from: classes.dex */
public class ElcanoClientAuth extends ElcanoAuth implements IElcanoClientAuth {

    /* loaded from: classes.dex */
    public static class Builder {
        private String contentType;
        private final String elcanoAccessKey;
        private final String elcanoSecretKey;
        private String host;
        private String httpMethodName;
        private String params;
        private String path;
        private String payload;
        private Date requestDate;
        private String xElcanoClient;
        private String xElcanoUserId;

        public Builder(String str, String str2) {
            this.elcanoAccessKey = str;
            this.elcanoSecretKey = str2;
        }

        public ElcanoClientAuth build() {
            return new ElcanoClientAuth(this);
        }

        public Builder contentType(String str) {
            this.contentType = str;
            return this;
        }

        public Builder host(String str) {
            this.host = str;
            return this;
        }

        public Builder httpMethodName(String str) {
            this.httpMethodName = str;
            return this;
        }

        public Builder params(String str) {
            this.params = str;
            return this;
        }

        public Builder path(String str) {
            this.path = str;
            return this;
        }

        public Builder payload(String str) {
            this.payload = str;
            return this;
        }

        public Builder requestDate(Date date) {
            this.requestDate = date;
            return this;
        }

        public Builder xElcanoClient(String str) {
            this.xElcanoClient = str;
            return this;
        }

        public Builder xElcanoUserId(String str) {
            this.xElcanoUserId = str;
            return this;
        }
    }

    private ElcanoClientAuth() {
    }

    public ElcanoClientAuth(Builder builder) {
        this.elcanoAccessKey = builder.elcanoAccessKey;
        this.elcanoSecretKey = builder.elcanoSecretKey;
        this.host = builder.host;
        this.path = builder.path;
        this.params = builder.params;
        this.httpMethodName = builder.httpMethodName;
        this.payload = builder.payload;
        this.contentType = builder.contentType;
        this.xElcanoClient = builder.xElcanoClient;
        Date date = builder.requestDate == null ? new Date() : builder.requestDate;
        this.requestDate = date;
        this.xElcanoDate = ElcanoAuth.getTimeStamp(date);
        this.xElcanoDateSimple = ElcanoAuth.getDate(this.requestDate);
        this.xElcanoUserId = builder.xElcanoUserId;
    }
}
