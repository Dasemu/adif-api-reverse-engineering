package G1;

import android.view.View;
import androidx.recyclerview.widget.I0;
import com.adif.elcanomovil.commonViews.databinding.ViewStationOptionBinding;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class c extends I0 {

    /* renamed from: a, reason: collision with root package name */
    public final ViewStationOptionBinding f573a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        ViewStationOptionBinding bind = ViewStationOptionBinding.bind(itemView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.f573a = bind;
    }
}
