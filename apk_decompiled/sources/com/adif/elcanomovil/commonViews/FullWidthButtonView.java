package com.adif.elcanomovil.commonViews;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"}, d2 = {"Lcom/adif/elcanomovil/commonViews/FullWidthButtonView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "setText", "", "text", "", "common-views_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FullWidthButtonView extends LinearLayout {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullWidthButtonView(Context context, AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        View.inflate(context, R.layout.button_full_width, this);
        View findViewById = findViewById(R.id.text);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        TextView textView = (TextView) findViewById;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, R.styleable.FullWidthButtonView);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        textView.setText(obtainStyledAttributes.getString(R.styleable.FullWidthButtonView_text));
        textView.setCompoundDrawables(obtainStyledAttributes.getDrawable(R.styleable.FullWidthButtonView_drawableLeft), null, null, null);
        obtainStyledAttributes.recycle();
    }

    public final void setText(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        View findViewById = findViewById(R.id.text);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        ((TextView) findViewById).setText(text);
    }
}
