package com.google.firebase.remoteconfig;

import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;

/* loaded from: classes3.dex */
public class FirebaseRemoteConfigSettings {
    private final long fetchTimeoutInSeconds;
    private final long minimumFetchInterval;

    /* loaded from: classes3.dex */
    public static class Builder {
        private long fetchTimeoutInSeconds = 60;
        private long minimumFetchInterval = ConfigFetchHandler.DEFAULT_MINIMUM_FETCH_INTERVAL_IN_SECONDS;

        public FirebaseRemoteConfigSettings build() {
            return new FirebaseRemoteConfigSettings(this);
        }

        public long getFetchTimeoutInSeconds() {
            return this.fetchTimeoutInSeconds;
        }

        public long getMinimumFetchIntervalInSeconds() {
            return this.minimumFetchInterval;
        }

        public Builder setFetchTimeoutInSeconds(long j4) throws IllegalArgumentException {
            if (j4 < 0) {
                throw new IllegalArgumentException(String.format("Fetch connection timeout has to be a non-negative number. %d is an invalid argument", Long.valueOf(j4)));
            }
            this.fetchTimeoutInSeconds = j4;
            return this;
        }

        public Builder setMinimumFetchIntervalInSeconds(long j4) {
            if (j4 >= 0) {
                this.minimumFetchInterval = j4;
                return this;
            }
            throw new IllegalArgumentException("Minimum interval between fetches has to be a non-negative number. " + j4 + " is an invalid argument");
        }
    }

    public long getFetchTimeoutInSeconds() {
        return this.fetchTimeoutInSeconds;
    }

    public long getMinimumFetchIntervalInSeconds() {
        return this.minimumFetchInterval;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.setFetchTimeoutInSeconds(getFetchTimeoutInSeconds());
        builder.setMinimumFetchIntervalInSeconds(getMinimumFetchIntervalInSeconds());
        return builder;
    }

    private FirebaseRemoteConfigSettings(Builder builder) {
        this.fetchTimeoutInSeconds = builder.fetchTimeoutInSeconds;
        this.minimumFetchInterval = builder.minimumFetchInterval;
    }
}
