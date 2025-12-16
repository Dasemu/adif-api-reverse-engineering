package com.adif.elcanomovil.commonViews.extensions;

import D1.a;
import G2.h;
import G2.l;
import G2.m;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.K;
import androidx.fragment.app.P;
import com.adif.elcanomovil.commonViews.R;
import com.adif.elcanomovil.commonViews.SnackBarEvents;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.snackbar.SnackbarContentLayout;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aM\u0010\u000b\u001a\u00020\n*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u0001¢\u0006\u0004\b\u000b\u0010\f\u001aG\u0010\u0016\u001a\u00020\n*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\u0018\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n\u0018\u00010\u0012j\u0002`\u0014H\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001a#\u0010\u0016\u001a\u00020\n*\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u0001¢\u0006\u0004\b\u0016\u0010\u0019\u001a\u0011\u0010\u001b\u001a\u00020\u001a*\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Landroid/view/View;", "", "times", "", "duration", "offset", "", "minAlpha", "maxAlpha", "repeatMode", "", "blink", "(Landroid/view/View;IJJFFI)V", "Landroid/app/Activity;", "", "snackbarText", "timeLength", "snackBarTextAction", "Lkotlin/Function1;", "Lcom/adif/elcanomovil/commonViews/SnackBarEvents;", "Lcom/adif/elcanomovil/commonViews/MyActionListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "showSnackbar", "(Landroid/app/Activity;Ljava/lang/String;ILjava/lang/String;Lkotlin/jvm/functions/Function1;)V", "Landroidx/fragment/app/K;", "(Landroidx/fragment/app/K;Ljava/lang/String;I)V", "LG2/m;", "allowInfiniteLines", "(LG2/m;)LG2/m;", "common-views_proNon_corporateRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ViewKt {
    public static final m allowInfiniteLines(m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        View findViewById = mVar.i.findViewById(R.id.snackbar_text);
        TextView textView = findViewById instanceof TextView ? (TextView) findViewById : null;
        if (textView == null) {
            return mVar;
        }
        textView.setSingleLine(false);
        return mVar;
    }

    public static final void blink(View view, int i, long j4, long j5, float f2, float f4, int i4) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        AlphaAnimation alphaAnimation = new AlphaAnimation(f4, f2);
        alphaAnimation.setDuration(j4);
        alphaAnimation.setStartOffset(j5);
        alphaAnimation.setRepeatMode(i4);
        alphaAnimation.setRepeatCount(i);
        view.startAnimation(alphaAnimation);
    }

    public static /* synthetic */ void blink$default(View view, int i, long j4, long j5, float f2, float f4, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = -1;
        }
        if ((i5 & 2) != 0) {
            j4 = 500;
        }
        if ((i5 & 4) != 0) {
            j5 = 2000;
        }
        if ((i5 & 8) != 0) {
            f2 = BitmapDescriptorFactory.HUE_RED;
        }
        if ((i5 & 16) != 0) {
            f4 = 1.0f;
        }
        if ((i5 & 32) != 0) {
            i4 = 1;
        }
        int i6 = i4;
        float f5 = f2;
        long j6 = j5;
        int i7 = i;
        blink(view, i7, j4, j6, f5, f4, i6);
    }

    @SuppressLint({"ShowToast"})
    public static final void showSnackbar(Activity activity, String snackbarText, int i, String str, final Function1<? super SnackBarEvents, Unit> function1) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(snackbarText, "snackbarText");
        m f2 = m.f(activity.findViewById(android.R.id.content), snackbarText, i);
        Intrinsics.checkNotNullExpressionValue(f2, "make(...)");
        m allowInfiniteLines = allowInfiniteLines(f2);
        if (str != null) {
            a aVar = new a(function1, 10);
            Button actionView = ((SnackbarContentLayout) allowInfiniteLines.i.getChildAt(0)).getActionView();
            if (!TextUtils.isEmpty(str)) {
                allowInfiniteLines.f625C = true;
                actionView.setVisibility(0);
                actionView.setText(str);
                actionView.setOnClickListener(new l(0, allowInfiniteLines, aVar));
            } else {
                actionView.setVisibility(8);
                actionView.setOnClickListener(null);
                allowInfiniteLines.f625C = false;
            }
            h hVar = new h() { // from class: com.adif.elcanomovil.commonViews.extensions.ViewKt$showSnackbar$1$1$2
                @Override // G2.h
                public void onDismissed(m transientBottomBar, int event) {
                    Function1<SnackBarEvents, Unit> function12 = function1;
                    if (function12 != null) {
                        function12.invoke(SnackBarEvents.EVENT_TYPE_DISMISS);
                    }
                }

                @Override // G2.h
                public void onShown(m transientBottomBar) {
                    Function1<SnackBarEvents, Unit> function12 = function1;
                    if (function12 != null) {
                        function12.invoke(SnackBarEvents.EVENT_TYPE_SHOW);
                    }
                }
            };
            if (allowInfiniteLines.f617s == null) {
                allowInfiniteLines.f617s = new ArrayList();
            }
            allowInfiniteLines.f617s.add(hVar);
        }
        allowInfiniteLines.g();
    }

    public static /* synthetic */ void showSnackbar$default(K k4, String str, int i, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        showSnackbar(k4, str, i);
    }

    public static final void showSnackbar$lambda$3$lambda$2$lambda$1(Function1 function1, View view) {
        if (function1 != null) {
            function1.invoke(SnackBarEvents.EVENT_TYPE_ONCLICK_ACTION);
        }
    }

    public static final void showSnackbar(K k4, String snackbarText, int i) {
        Intrinsics.checkNotNullParameter(k4, "<this>");
        Intrinsics.checkNotNullParameter(snackbarText, "snackbarText");
        P activity = k4.getActivity();
        if (activity != null) {
            m.f(activity.findViewById(android.R.id.content), snackbarText, i).g();
        }
    }
}
