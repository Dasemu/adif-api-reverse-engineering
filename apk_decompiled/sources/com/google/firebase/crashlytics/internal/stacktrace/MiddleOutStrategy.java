package com.google.firebase.crashlytics.internal.stacktrace;

/* loaded from: classes3.dex */
public class MiddleOutStrategy implements StackTraceTrimmingStrategy {
    private final int trimmedSize;

    public MiddleOutStrategy(int i) {
        this.trimmedSize = i;
    }

    @Override // com.google.firebase.crashlytics.internal.stacktrace.StackTraceTrimmingStrategy
    public StackTraceElement[] getTrimmedStackTrace(StackTraceElement[] stackTraceElementArr) {
        int length = stackTraceElementArr.length;
        int i = this.trimmedSize;
        if (length <= i) {
            return stackTraceElementArr;
        }
        int i4 = i / 2;
        int i5 = i - i4;
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[i];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, i5);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - i4, stackTraceElementArr2, i5, i4);
        return stackTraceElementArr2;
    }
}
