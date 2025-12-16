package r3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public class u extends n {
    @Override // r3.n
    public final void a(z path) {
        Intrinsics.checkNotNullParameter(path, "path");
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        File e4 = path.e();
        if (e4.delete() || !e4.exists()) {
            return;
        }
        throw new IOException("failed to delete " + path);
    }

    @Override // r3.n
    public final List d(z dir) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        File e4 = dir.e();
        String[] list = e4.list();
        if (list == null) {
            if (e4.exists()) {
                throw new IOException("failed to list " + dir);
            }
            throw new FileNotFoundException("no such file: " + dir);
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            Intrinsics.checkNotNull(str);
            arrayList.add(dir.d(str));
        }
        CollectionsKt.sort(arrayList);
        Intrinsics.checkNotNull(arrayList);
        return arrayList;
    }

    @Override // r3.n
    public m f(z path) {
        Intrinsics.checkNotNullParameter(path, "path");
        File e4 = path.e();
        boolean isFile = e4.isFile();
        boolean isDirectory = e4.isDirectory();
        long lastModified = e4.lastModified();
        long length = e4.length();
        if (!isFile && !isDirectory && lastModified == 0 && length == 0 && !e4.exists()) {
            return null;
        }
        return new m(isFile, isDirectory, null, Long.valueOf(length), null, Long.valueOf(lastModified), null);
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, r3.K] */
    @Override // r3.n
    public final G g(z file) {
        Intrinsics.checkNotNullParameter(file, "file");
        File e4 = file.e();
        Logger logger = w.f8315a;
        Intrinsics.checkNotNullParameter(e4, "<this>");
        FileOutputStream fileOutputStream = new FileOutputStream(e4, false);
        Intrinsics.checkNotNullParameter(fileOutputStream, "<this>");
        return new y(fileOutputStream, new Object());
    }

    @Override // r3.n
    public final I h(z file) {
        Intrinsics.checkNotNullParameter(file, "file");
        File e4 = file.e();
        Logger logger = w.f8315a;
        Intrinsics.checkNotNullParameter(e4, "<this>");
        return new C0572d(new FileInputStream(e4), K.f8261d);
    }

    public void i(z source, z target) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        if (source.e().renameTo(target.e())) {
            return;
        }
        throw new IOException("failed to move " + source + " to " + target);
    }

    public final t j(z file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return new t(new RandomAccessFile(file.e(), "r"));
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }
}
