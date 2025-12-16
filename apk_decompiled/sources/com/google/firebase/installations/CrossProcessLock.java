package com.google.firebase.installations;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;

/* loaded from: classes3.dex */
class CrossProcessLock {
    private static final String TAG = "CrossProcessLock";
    private final FileChannel channel;
    private final FileLock lock;

    private CrossProcessLock(FileChannel fileChannel, FileLock fileLock) {
        this.channel = fileChannel;
        this.lock = fileLock;
    }

    public static CrossProcessLock acquire(Context context, String str) {
        FileChannel fileChannel;
        FileLock fileLock;
        try {
            fileChannel = new RandomAccessFile(new File(context.getFilesDir(), str), "rw").getChannel();
            try {
                fileLock = fileChannel.lock();
            } catch (IOException | Error | OverlappingFileLockException e4) {
                e = e4;
                fileLock = null;
            }
        } catch (IOException | Error | OverlappingFileLockException e5) {
            e = e5;
            fileChannel = null;
            fileLock = null;
        }
        try {
            return new CrossProcessLock(fileChannel, fileLock);
        } catch (IOException | Error | OverlappingFileLockException e6) {
            e = e6;
            Log.e(TAG, "encountered error while creating and acquiring the lock, ignoring", e);
            if (fileLock != null) {
                try {
                    fileLock.release();
                } catch (IOException unused) {
                }
            }
            if (fileChannel != null) {
                try {
                    fileChannel.close();
                } catch (IOException unused2) {
                }
            }
            return null;
        }
    }

    public void releaseAndClose() {
        try {
            this.lock.release();
            this.channel.close();
        } catch (IOException e4) {
            Log.e(TAG, "encountered error while releasing, ignoring", e4);
        }
    }
}
