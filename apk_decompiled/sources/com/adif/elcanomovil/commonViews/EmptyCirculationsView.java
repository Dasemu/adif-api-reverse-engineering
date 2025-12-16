package com.adif.elcanomovil.commonViews;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.adif.elcanomovil.commonViews.EmptyCirculationsState;
import com.adif.elcanomovil.commonViews.databinding.LoadingEmptyOrErrorCommonViewBinding;
import com.google.firebase.messaging.Constants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001d\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\fJ!\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\bJ'\u0010\u0012\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010\u001a\u001a\u00020\r2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\u001a\u0010\"R\u0016\u0010$\u001a\u00020#8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lcom/adif/elcanomovil/commonViews/EmptyCirculationsView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attr", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "attrs", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "initView", "title", "message", "icon", "setTitleMessageAndIcon", "(III)V", "Landroid/content/res/TypedArray;", "attributes", "configureView", "(Landroid/content/res/TypedArray;)V", "Lcom/adif/elcanomovil/commonViews/a;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "update", "(Lcom/adif/elcanomovil/commonViews/a;)V", "", "isLoading", "updateVisibility", "(Z)V", "Lcom/adif/elcanomovil/commonViews/EmptyCirculationsState;", RemoteConfigConstants.ResponseFieldKey.STATE, "(Lcom/adif/elcanomovil/commonViews/EmptyCirculationsState;)V", "Lcom/adif/elcanomovil/commonViews/databinding/LoadingEmptyOrErrorCommonViewBinding;", "binding", "Lcom/adif/elcanomovil/commonViews/databinding/LoadingEmptyOrErrorCommonViewBinding;", "common-views_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class EmptyCirculationsView extends LinearLayout {
    private LoadingEmptyOrErrorCommonViewBinding binding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmptyCirculationsView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        initView(context, null);
    }

    private final void configureView(TypedArray attributes) {
        boolean z3 = attributes.getBoolean(R.styleable.EmptyCirculationsView_isLoading, true);
        Drawable drawable = attributes.getDrawable(R.styleable.EmptyCirculationsView_icon);
        String string = attributes.getString(R.styleable.EmptyCirculationsView_header);
        if (string == null) {
            string = "";
        }
        String string2 = attributes.getString(R.styleable.EmptyCirculationsView_message);
        update(new a(z3, drawable, string, string2 != null ? string2 : ""));
    }

    private final void initView(Context context, AttributeSet attrs) {
        View.inflate(context, R.layout.loading_empty_or_error_common_view, this);
        LoadingEmptyOrErrorCommonViewBinding bind = LoadingEmptyOrErrorCommonViewBinding.bind(this);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attrs, R.styleable.EmptyCirculationsView, 0, 0);
        Intrinsics.checkNotNull(obtainStyledAttributes);
        configureView(obtainStyledAttributes);
    }

    private final void setTitleMessageAndIcon(int title, int message, int icon) {
        LoadingEmptyOrErrorCommonViewBinding loadingEmptyOrErrorCommonViewBinding = this.binding;
        LoadingEmptyOrErrorCommonViewBinding loadingEmptyOrErrorCommonViewBinding2 = null;
        if (loadingEmptyOrErrorCommonViewBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            loadingEmptyOrErrorCommonViewBinding = null;
        }
        loadingEmptyOrErrorCommonViewBinding.title.setText(getContext().getString(title));
        LoadingEmptyOrErrorCommonViewBinding loadingEmptyOrErrorCommonViewBinding3 = this.binding;
        if (loadingEmptyOrErrorCommonViewBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            loadingEmptyOrErrorCommonViewBinding3 = null;
        }
        loadingEmptyOrErrorCommonViewBinding3.message.setText(getContext().getString(message));
        LoadingEmptyOrErrorCommonViewBinding loadingEmptyOrErrorCommonViewBinding4 = this.binding;
        if (loadingEmptyOrErrorCommonViewBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            loadingEmptyOrErrorCommonViewBinding2 = loadingEmptyOrErrorCommonViewBinding4;
        }
        loadingEmptyOrErrorCommonViewBinding2.iconNoResults.setImageResource(icon);
        updateVisibility(false);
    }

    private final void updateVisibility(boolean isLoading) {
        LoadingEmptyOrErrorCommonViewBinding loadingEmptyOrErrorCommonViewBinding = null;
        if (isLoading) {
            LoadingEmptyOrErrorCommonViewBinding loadingEmptyOrErrorCommonViewBinding2 = this.binding;
            if (loadingEmptyOrErrorCommonViewBinding2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                loadingEmptyOrErrorCommonViewBinding2 = null;
            }
            loadingEmptyOrErrorCommonViewBinding2.loading.setVisibility(0);
            LoadingEmptyOrErrorCommonViewBinding loadingEmptyOrErrorCommonViewBinding3 = this.binding;
            if (loadingEmptyOrErrorCommonViewBinding3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                loadingEmptyOrErrorCommonViewBinding3 = null;
            }
            loadingEmptyOrErrorCommonViewBinding3.message.setVisibility(8);
            LoadingEmptyOrErrorCommonViewBinding loadingEmptyOrErrorCommonViewBinding4 = this.binding;
            if (loadingEmptyOrErrorCommonViewBinding4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                loadingEmptyOrErrorCommonViewBinding = loadingEmptyOrErrorCommonViewBinding4;
            }
            loadingEmptyOrErrorCommonViewBinding.iconNoResults.setVisibility(8);
            return;
        }
        LoadingEmptyOrErrorCommonViewBinding loadingEmptyOrErrorCommonViewBinding5 = this.binding;
        if (loadingEmptyOrErrorCommonViewBinding5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            loadingEmptyOrErrorCommonViewBinding5 = null;
        }
        loadingEmptyOrErrorCommonViewBinding5.loading.setVisibility(8);
        LoadingEmptyOrErrorCommonViewBinding loadingEmptyOrErrorCommonViewBinding6 = this.binding;
        if (loadingEmptyOrErrorCommonViewBinding6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            loadingEmptyOrErrorCommonViewBinding6 = null;
        }
        loadingEmptyOrErrorCommonViewBinding6.message.setVisibility(0);
        LoadingEmptyOrErrorCommonViewBinding loadingEmptyOrErrorCommonViewBinding7 = this.binding;
        if (loadingEmptyOrErrorCommonViewBinding7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            loadingEmptyOrErrorCommonViewBinding = loadingEmptyOrErrorCommonViewBinding7;
        }
        loadingEmptyOrErrorCommonViewBinding.iconNoResults.setVisibility(0);
    }

    public final void update(EmptyCirculationsState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (state instanceof EmptyCirculationsState.Loading) {
            LoadingEmptyOrErrorCommonViewBinding loadingEmptyOrErrorCommonViewBinding = this.binding;
            if (loadingEmptyOrErrorCommonViewBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                loadingEmptyOrErrorCommonViewBinding = null;
            }
            loadingEmptyOrErrorCommonViewBinding.title.setText(getContext().getString(R.string.common_loading));
            updateVisibility(true);
            return;
        }
        if (state instanceof EmptyCirculationsState.EmptyDefault) {
            setTitleMessageAndIcon(R.string.circulation_no_results_title, R.string.circulation_no_results_message, R.drawable.ic_no_results);
            return;
        }
        if (state instanceof EmptyCirculationsState.GenericError) {
            setTitleMessageAndIcon(R.string.stations_no_results_title_error, R.string.generic_error_message, R.drawable.ic_no_results);
            return;
        }
        if (state instanceof EmptyCirculationsState.NoResults) {
            EmptyCirculationsState.NoResults noResults = (EmptyCirculationsState.NoResults) state;
            setTitleMessageAndIcon(noResults.getTitle(), noResults.getMessage(), R.drawable.ic_no_results);
        } else if (state instanceof EmptyCirculationsState.Custom) {
            EmptyCirculationsState.Custom custom = (EmptyCirculationsState.Custom) state;
            setTitleMessageAndIcon(custom.getTitle(), custom.getMessage(), custom.getIcon());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmptyCirculationsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        initView(context, attributeSet);
    }

    public /* synthetic */ EmptyCirculationsView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmptyCirculationsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        initView(context, attributeSet);
    }

    private final void update(a data) {
        LoadingEmptyOrErrorCommonViewBinding loadingEmptyOrErrorCommonViewBinding = this.binding;
        LoadingEmptyOrErrorCommonViewBinding loadingEmptyOrErrorCommonViewBinding2 = null;
        if (loadingEmptyOrErrorCommonViewBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            loadingEmptyOrErrorCommonViewBinding = null;
        }
        loadingEmptyOrErrorCommonViewBinding.iconNoResults.setImageDrawable(data.f4439b);
        LoadingEmptyOrErrorCommonViewBinding loadingEmptyOrErrorCommonViewBinding3 = this.binding;
        if (loadingEmptyOrErrorCommonViewBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            loadingEmptyOrErrorCommonViewBinding3 = null;
        }
        loadingEmptyOrErrorCommonViewBinding3.title.setText(data.f4440c);
        LoadingEmptyOrErrorCommonViewBinding loadingEmptyOrErrorCommonViewBinding4 = this.binding;
        if (loadingEmptyOrErrorCommonViewBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            loadingEmptyOrErrorCommonViewBinding2 = loadingEmptyOrErrorCommonViewBinding4;
        }
        loadingEmptyOrErrorCommonViewBinding2.message.setText(data.f4441d);
        updateVisibility(data.f4438a);
    }
}
