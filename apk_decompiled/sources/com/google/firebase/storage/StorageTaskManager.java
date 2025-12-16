package com.google.firebase.storage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
class StorageTaskManager {
    private static final StorageTaskManager _instance = new StorageTaskManager();
    private final Map<String, WeakReference<StorageTask<?>>> inProgressTasks = new HashMap();
    private final Object syncObject = new Object();

    public static StorageTaskManager getInstance() {
        return _instance;
    }

    public void ensureRegistered(StorageTask<?> storageTask) {
        synchronized (this.syncObject) {
            this.inProgressTasks.put(storageTask.getStorage().toString(), new WeakReference<>(storageTask));
        }
    }

    public List<FileDownloadTask> getDownloadTasksUnder(StorageReference storageReference) {
        List<FileDownloadTask> unmodifiableList;
        synchronized (this.syncObject) {
            try {
                ArrayList arrayList = new ArrayList();
                String storageReference2 = storageReference.toString();
                for (Map.Entry<String, WeakReference<StorageTask<?>>> entry : this.inProgressTasks.entrySet()) {
                    if (entry.getKey().startsWith(storageReference2)) {
                        StorageTask<?> storageTask = entry.getValue().get();
                        if (storageTask instanceof FileDownloadTask) {
                            arrayList.add((FileDownloadTask) storageTask);
                        }
                    }
                }
                unmodifiableList = Collections.unmodifiableList(arrayList);
            } catch (Throwable th) {
                throw th;
            }
        }
        return unmodifiableList;
    }

    public List<UploadTask> getUploadTasksUnder(StorageReference storageReference) {
        List<UploadTask> unmodifiableList;
        synchronized (this.syncObject) {
            try {
                ArrayList arrayList = new ArrayList();
                String storageReference2 = storageReference.toString();
                for (Map.Entry<String, WeakReference<StorageTask<?>>> entry : this.inProgressTasks.entrySet()) {
                    if (entry.getKey().startsWith(storageReference2)) {
                        StorageTask<?> storageTask = entry.getValue().get();
                        if (storageTask instanceof UploadTask) {
                            arrayList.add((UploadTask) storageTask);
                        }
                    }
                }
                unmodifiableList = Collections.unmodifiableList(arrayList);
            } catch (Throwable th) {
                throw th;
            }
        }
        return unmodifiableList;
    }

    public void unRegister(StorageTask<?> storageTask) {
        synchronized (this.syncObject) {
            try {
                String storageReference = storageTask.getStorage().toString();
                WeakReference<StorageTask<?>> weakReference = this.inProgressTasks.get(storageReference);
                StorageTask<?> storageTask2 = weakReference != null ? weakReference.get() : null;
                if (storageTask2 == null || storageTask2 == storageTask) {
                    this.inProgressTasks.remove(storageReference);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
