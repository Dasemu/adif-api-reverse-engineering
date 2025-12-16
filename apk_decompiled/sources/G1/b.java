package G1;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.I0;
import com.adif.elcanomovil.commonViews.databinding.ViewTrainOptionBinding;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class b extends I0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f571a;

    /* renamed from: b, reason: collision with root package name */
    public final ViewTrainOptionBinding f572b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(View itemView, Context context) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f571a = context;
        ViewTrainOptionBinding bind = ViewTrainOptionBinding.bind(itemView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.f572b = bind;
    }
}
