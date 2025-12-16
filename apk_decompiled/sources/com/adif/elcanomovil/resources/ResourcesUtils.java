package com.adif.elcanomovil.resources;

import F.j;
import F.q;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import com.adif.elcanomovil.commonNavGraph.arguments.NavArguments;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/adif/elcanomovil/resources/ResourcesUtils;", "", "()V", "vectorToBitmap", "Landroid/graphics/Bitmap;", "context", "Landroid/content/Context;", NavArguments.ARG_TYPE_NOTIFICATION_JSON_MESSAGE_TRAIN, "", "common-resources_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nResourcesUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResourcesUtils.kt\ncom/adif/elcanomovil/resources/ResourcesUtils\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,28:1\n1#2:29\n*E\n"})
/* loaded from: classes.dex */
public final class ResourcesUtils {
    public static final ResourcesUtils INSTANCE = new ResourcesUtils();

    private ResourcesUtils() {
    }

    public final Bitmap vectorToBitmap(Context context, int id) {
        Bitmap bitmap;
        if (context != null) {
            Resources resources = context.getResources();
            ThreadLocal threadLocal = q.f503a;
            Drawable a2 = j.a(resources, id, null);
            if (a2 != null) {
                bitmap = Bitmap.createBitmap(a2.getIntrinsicWidth(), a2.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                Intrinsics.checkNotNullExpressionValue(bitmap, "createBitmap(...)");
                Canvas canvas = new Canvas(bitmap);
                a2.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                a2.draw(canvas);
            } else {
                bitmap = null;
            }
            if (bitmap != null) {
                return bitmap;
            }
        }
        return null;
    }
}
