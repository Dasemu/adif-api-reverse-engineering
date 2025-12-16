package kotlin.io.path;

import com.adif.elcanomovil.commonNavGraph.arguments.NavArguments;
import java.nio.file.Path;
import java.nio.file.Paths;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lkotlin/io/path/PathRelativizer;", "", "()V", "emptyPath", "Ljava/nio/file/Path;", "kotlin.jvm.PlatformType", "parentPath", "tryRelativeTo", NavArguments.ARG_DYNAMIC_LINKS_TAB, "base", "kotlin-stdlib-jdk7"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class PathRelativizer {
    public static final PathRelativizer INSTANCE = new PathRelativizer();
    private static final Path emptyPath = Paths.get("", new String[0]);
    private static final Path parentPath = Paths.get("..", new String[0]);

    private PathRelativizer() {
    }

    public final Path tryRelativeTo(Path path, Path base) {
        boolean endsWith$default;
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(base, "base");
        Path normalize = base.normalize();
        Path normalize2 = path.normalize();
        Path relativize = normalize.relativize(normalize2);
        int min = Math.min(normalize.getNameCount(), normalize2.getNameCount());
        for (int i = 0; i < min; i++) {
            Path name = normalize.getName(i);
            Path path2 = parentPath;
            if (!Intrinsics.areEqual(name, path2)) {
                break;
            }
            if (!Intrinsics.areEqual(normalize2.getName(i), path2)) {
                throw new IllegalArgumentException("Unable to compute relative path");
            }
        }
        if (Intrinsics.areEqual(normalize2, normalize) || !Intrinsics.areEqual(normalize, emptyPath)) {
            String obj = relativize.toString();
            String separator = relativize.getFileSystem().getSeparator();
            Intrinsics.checkNotNullExpressionValue(separator, "getSeparator(...)");
            endsWith$default = StringsKt__StringsJVMKt.endsWith$default(obj, separator, false, 2, null);
            normalize2 = endsWith$default ? relativize.getFileSystem().getPath(StringsKt.dropLast(obj, relativize.getFileSystem().getSeparator().length()), new String[0]) : relativize;
        }
        Intrinsics.checkNotNull(normalize2);
        return normalize2;
    }
}
