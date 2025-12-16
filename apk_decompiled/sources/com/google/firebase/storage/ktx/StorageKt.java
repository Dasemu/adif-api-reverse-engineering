package com.google.firebase.storage.ktx;

import android.net.Uri;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.firebase.FirebaseApp;
import com.google.firebase.ktx.Firebase;
import com.google.firebase.storage.FileDownloadTask;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.ListResult;
import com.google.firebase.storage.StorageMetadata;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.StorageTask;
import com.google.firebase.storage.StreamDownloadTask;
import com.google.firebase.storage.UploadTask;
import java.io.InputStream;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u000f\u001a\u00020\u00102\u0017\u0010\u0011\u001a\u0013\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012¢\u0006\u0002\b\u0015\u001a\u0011\u0010\u0016\u001a\u00020\u0017*\u00060\u0018R\u00020\u0019H\u0086\u0002\u001a\u0013\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a*\u00020\u001cH\u0086\u0002\u001a\u0011\u0010\u0016\u001a\u00020\u0017*\u00060\u001dR\u00020\u001eH\u0086\u0002\u001a\u0011\u0010\u0016\u001a\u00020\u0017*\u00060\u001fR\u00020 H\u0086\u0002\u001a\u0011\u0010!\u001a\u00020\u0017*\u00060\u0018R\u00020\u0019H\u0086\u0002\u001a\u0013\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a*\u00020\u001cH\u0086\u0002\u001a\u0011\u0010!\u001a\u00020\u0017*\u00060\u001dR\u00020\u001eH\u0086\u0002\u001a\u0011\u0010!\u001a\u00020\u0017*\u00060\u001fR\u00020 H\u0086\u0002\u001a\u000f\u0010\"\u001a\u0004\u0018\u00010\u0001*\u00020\u001cH\u0086\u0002\u001a\u0011\u0010\"\u001a\u00020#*\u00060\u001dR\u00020\u001eH\u0086\u0002\u001a\u0013\u0010\"\u001a\u0004\u0018\u00010\u0010*\u00060\u001fR\u00020 H\u0086\u0002\u001a\u0013\u0010$\u001a\u0004\u0018\u00010%*\u00060\u001fR\u00020 H\u0086\u0002\u001a\u0012\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\u0006\u0010&\u001a\u00020'\u001a\u001a\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u0001\u001a\u0012\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\u0006\u0010(\u001a\u00020\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0003*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\";\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\n0\t0\b\"\u0012\b\u0000\u0010\n*\f0\u000bR\b\u0012\u0004\u0012\u0002H\n0\f*\b\u0012\u0004\u0012\u0002H\n0\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006)"}, d2 = {"LIBRARY_NAME", "", "storage", "Lcom/google/firebase/storage/FirebaseStorage;", "Lcom/google/firebase/ktx/Firebase;", "getStorage", "(Lcom/google/firebase/ktx/Firebase;)Lcom/google/firebase/storage/FirebaseStorage;", "taskState", "Lkotlinx/coroutines/flow/Flow;", "Lcom/google/firebase/storage/ktx/TaskState;", "T", "Lcom/google/firebase/storage/StorageTask$SnapshotBase;", "Lcom/google/firebase/storage/StorageTask;", "getTaskState", "(Lcom/google/firebase/storage/StorageTask;)Lkotlinx/coroutines/flow/Flow;", "storageMetadata", "Lcom/google/firebase/storage/StorageMetadata;", "init", "Lkotlin/Function1;", "Lcom/google/firebase/storage/StorageMetadata$Builder;", "", "Lkotlin/ExtensionFunctionType;", "component1", "", "Lcom/google/firebase/storage/FileDownloadTask$TaskSnapshot;", "Lcom/google/firebase/storage/FileDownloadTask;", "", "Lcom/google/firebase/storage/StorageReference;", "Lcom/google/firebase/storage/ListResult;", "Lcom/google/firebase/storage/StreamDownloadTask$TaskSnapshot;", "Lcom/google/firebase/storage/StreamDownloadTask;", "Lcom/google/firebase/storage/UploadTask$TaskSnapshot;", "Lcom/google/firebase/storage/UploadTask;", "component2", "component3", "Ljava/io/InputStream;", "component4", "Landroid/net/Uri;", "app", "Lcom/google/firebase/FirebaseApp;", ImagesContract.URL, "com.google.firebase-firebase-storage-ktx"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class StorageKt {
    public static final String LIBRARY_NAME = "fire-stg-ktx";

    public static final long component1(UploadTask.TaskSnapshot taskSnapshot) {
        Intrinsics.checkNotNullParameter(taskSnapshot, "<this>");
        return taskSnapshot.getBytesTransferred();
    }

    public static final long component2(UploadTask.TaskSnapshot taskSnapshot) {
        Intrinsics.checkNotNullParameter(taskSnapshot, "<this>");
        return taskSnapshot.getTotalByteCount();
    }

    public static final StorageMetadata component3(UploadTask.TaskSnapshot taskSnapshot) {
        Intrinsics.checkNotNullParameter(taskSnapshot, "<this>");
        return taskSnapshot.getMetadata();
    }

    public static final Uri component4(UploadTask.TaskSnapshot taskSnapshot) {
        Intrinsics.checkNotNullParameter(taskSnapshot, "<this>");
        return taskSnapshot.getUploadSessionUri();
    }

    public static final FirebaseStorage getStorage(Firebase firebase) {
        Intrinsics.checkNotNullParameter(firebase, "<this>");
        FirebaseStorage firebaseStorage = FirebaseStorage.getInstance();
        Intrinsics.checkNotNullExpressionValue(firebaseStorage, "getInstance()");
        return firebaseStorage;
    }

    public static final <T extends StorageTask<T>.SnapshotBase> Flow<TaskState<T>> getTaskState(StorageTask<T> storageTask) {
        Intrinsics.checkNotNullParameter(storageTask, "<this>");
        return FlowKt.callbackFlow(new StorageKt$taskState$1(storageTask, null));
    }

    public static final FirebaseStorage storage(Firebase firebase, String url) {
        Intrinsics.checkNotNullParameter(firebase, "<this>");
        Intrinsics.checkNotNullParameter(url, "url");
        FirebaseStorage firebaseStorage = FirebaseStorage.getInstance(url);
        Intrinsics.checkNotNullExpressionValue(firebaseStorage, "getInstance(url)");
        return firebaseStorage;
    }

    public static final StorageMetadata storageMetadata(Function1<? super StorageMetadata.Builder, Unit> init) {
        Intrinsics.checkNotNullParameter(init, "init");
        StorageMetadata.Builder builder = new StorageMetadata.Builder();
        init.invoke(builder);
        StorageMetadata build = builder.build();
        Intrinsics.checkNotNullExpressionValue(build, "builder.build()");
        return build;
    }

    public static final long component1(StreamDownloadTask.TaskSnapshot taskSnapshot) {
        Intrinsics.checkNotNullParameter(taskSnapshot, "<this>");
        return taskSnapshot.getBytesTransferred();
    }

    public static final long component2(StreamDownloadTask.TaskSnapshot taskSnapshot) {
        Intrinsics.checkNotNullParameter(taskSnapshot, "<this>");
        return taskSnapshot.getTotalByteCount();
    }

    public static final InputStream component3(StreamDownloadTask.TaskSnapshot taskSnapshot) {
        Intrinsics.checkNotNullParameter(taskSnapshot, "<this>");
        InputStream stream = taskSnapshot.getStream();
        Intrinsics.checkNotNullExpressionValue(stream, "stream");
        return stream;
    }

    public static final FirebaseStorage storage(Firebase firebase, FirebaseApp app) {
        Intrinsics.checkNotNullParameter(firebase, "<this>");
        Intrinsics.checkNotNullParameter(app, "app");
        FirebaseStorage firebaseStorage = FirebaseStorage.getInstance(app);
        Intrinsics.checkNotNullExpressionValue(firebaseStorage, "getInstance(app)");
        return firebaseStorage;
    }

    public static final long component1(FileDownloadTask.TaskSnapshot taskSnapshot) {
        Intrinsics.checkNotNullParameter(taskSnapshot, "<this>");
        return taskSnapshot.getBytesTransferred();
    }

    public static final long component2(FileDownloadTask.TaskSnapshot taskSnapshot) {
        Intrinsics.checkNotNullParameter(taskSnapshot, "<this>");
        return taskSnapshot.getTotalByteCount();
    }

    public static final String component3(ListResult listResult) {
        Intrinsics.checkNotNullParameter(listResult, "<this>");
        return listResult.getPageToken();
    }

    public static final FirebaseStorage storage(Firebase firebase, FirebaseApp app, String url) {
        Intrinsics.checkNotNullParameter(firebase, "<this>");
        Intrinsics.checkNotNullParameter(app, "app");
        Intrinsics.checkNotNullParameter(url, "url");
        FirebaseStorage firebaseStorage = FirebaseStorage.getInstance(app, url);
        Intrinsics.checkNotNullExpressionValue(firebaseStorage, "getInstance(app, url)");
        return firebaseStorage;
    }

    public static final List<StorageReference> component1(ListResult listResult) {
        Intrinsics.checkNotNullParameter(listResult, "<this>");
        List<StorageReference> items = listResult.getItems();
        Intrinsics.checkNotNullExpressionValue(items, "items");
        return items;
    }

    public static final List<StorageReference> component2(ListResult listResult) {
        Intrinsics.checkNotNullParameter(listResult, "<this>");
        List<StorageReference> prefixes = listResult.getPrefixes();
        Intrinsics.checkNotNullExpressionValue(prefixes, "prefixes");
        return prefixes;
    }
}
