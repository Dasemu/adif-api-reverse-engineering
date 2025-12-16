package com.google.firebase.crashlytics.internal.metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public interface FileLogStore {
    void closeLogFile();

    void deleteLogFile();

    byte[] getLogAsBytes();

    String getLogAsString();

    void writeToLog(long j4, String str);
}
