package r3;

import f0.C0338b;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class v extends u {
    public static Long k(FileTime fileTime) {
        long millis = fileTime.toMillis();
        Long valueOf = Long.valueOf(millis);
        if (millis != 0) {
            return valueOf;
        }
        return null;
    }

    @Override // r3.u, r3.n
    public final m f(z path) {
        z zVar;
        Intrinsics.checkNotNullParameter(path, "path");
        Path nioPath = path.f();
        Intrinsics.checkNotNullParameter(nioPath, "nioPath");
        try {
            BasicFileAttributes readAttributes = Files.readAttributes(nioPath, (Class<BasicFileAttributes>) BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
            Path readSymbolicLink = readAttributes.isSymbolicLink() ? Files.readSymbolicLink(nioPath) : null;
            boolean isRegularFile = readAttributes.isRegularFile();
            boolean isDirectory = readAttributes.isDirectory();
            if (readSymbolicLink != null) {
                String str = z.f8321b;
                Intrinsics.checkNotNullParameter(readSymbolicLink, "<this>");
                zVar = C0338b.o(readSymbolicLink.toString());
            } else {
                zVar = null;
            }
            Long valueOf = Long.valueOf(readAttributes.size());
            FileTime creationTime = readAttributes.creationTime();
            Long k4 = creationTime != null ? k(creationTime) : null;
            FileTime lastModifiedTime = readAttributes.lastModifiedTime();
            Long k5 = lastModifiedTime != null ? k(lastModifiedTime) : null;
            FileTime lastAccessTime = readAttributes.lastAccessTime();
            return new m(isRegularFile, isDirectory, zVar, valueOf, k4, k5, lastAccessTime != null ? k(lastAccessTime) : null);
        } catch (NoSuchFileException | FileSystemException unused) {
            return null;
        }
    }

    @Override // r3.u
    public final void i(z source, z target) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        try {
            Files.move(source.f(), target.f(), StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
        } catch (UnsupportedOperationException unused) {
            throw new IOException("atomic move not supported");
        } catch (NoSuchFileException e4) {
            throw new FileNotFoundException(e4.getMessage());
        }
    }

    @Override // r3.u
    public final String toString() {
        return "NioSystemFileSystem";
    }
}
