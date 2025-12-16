package com.adif.elcanomovil.uiDepartures.adapters;

import android.content.Context;
import android.widget.TextView;
import com.adif.elcanomovil.commonViews.extensions.ViewKt;
import com.adif.elcanomovil.domain.entities.PlatformProvider;
import com.adif.elcanomovil.domain.entities.circulation.AvldmdCirculation;
import com.adif.elcanomovil.domain.entities.circulation.CercaniasCirculation;
import com.adif.elcanomovil.domain.entities.circulation.OtherCirculation;
import com.adif.elcanomovil.domain.entities.circulation.TrainCirculation;
import com.adif.elcanomovil.uiDepartures.R;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;

@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0003\u001a\f\u0010\u0006\u001a\u00020\u0007*\u00020\bH\u0002\u001a\"\u0010\t\u001a\u00020\n*\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e¨\u0006\u0010"}, d2 = {"getPlatformText", "", "circulation", "Lcom/adif/elcanomovil/domain/entities/PlatformProvider;", "getPlatformTextAlpha", "", "isVisible", "", "Lcom/adif/elcanomovil/domain/entities/circulation/TrainCirculation;", "updatePlatformAndWarningTextViews", "", "context", "Landroid/content/Context;", "platformView", "Landroid/widget/TextView;", "warningView", "ui-departures_proNon_corporateRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTrainCirculationMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrainCirculationMapper.kt\ncom/adif/elcanomovil/uiDepartures/adapters/TrainCirculationMapperKt\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,56:1\n256#2,2:57\n*S KotlinDebug\n*F\n+ 1 TrainCirculationMapper.kt\ncom/adif/elcanomovil/uiDepartures/adapters/TrainCirculationMapperKt\n*L\n28#1:57,2\n*E\n"})
/* loaded from: classes2.dex */
public final class TrainCirculationMapperKt {
    public static final String getPlatformText(PlatformProvider circulation) {
        Intrinsics.checkNotNullParameter(circulation, "circulation");
        String preassignedPlatform = circulation.getPreassignedPlatform();
        return (preassignedPlatform == null || preassignedPlatform.length() == 0) ? circulation.getPlatform() : circulation.getPreassignedPlatform();
    }

    public static final float getPlatformTextAlpha(PlatformProvider circulation) {
        Intrinsics.checkNotNullParameter(circulation, "circulation");
        String preassignedPlatform = circulation.getPreassignedPlatform();
        return (preassignedPlatform == null || preassignedPlatform.length() == 0) ? 1.0f : 0.9f;
    }

    private static final boolean isVisible(TrainCirculation trainCirculation) {
        if (trainCirculation instanceof CercaniasCirculation) {
            return !trainCirculation.getPlatformMuted();
        }
        if (trainCirculation instanceof AvldmdCirculation) {
            return (((AvldmdCirculation) trainCirculation).getState() == AvldmdCirculation.State.SUPPRESSED || trainCirculation.getPlatformMuted()) ? false : true;
        }
        if (trainCirculation instanceof OtherCirculation) {
            return (((OtherCirculation) trainCirculation).getState() == OtherCirculation.State.SUPPRESSED || trainCirculation.getPlatformMuted()) ? false : true;
        }
        return true;
    }

    public static final void updatePlatformAndWarningTextViews(TrainCirculation trainCirculation, Context context, TextView platformView, TextView warningView) {
        Intrinsics.checkNotNullParameter(trainCirculation, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(platformView, "platformView");
        Intrinsics.checkNotNullParameter(warningView, "warningView");
        warningView.setVisibility(8);
        String platformText = getPlatformText(trainCirculation);
        platformView.setVisibility(isVisible(trainCirculation) ? 0 : 8);
        platformView.setText(platformText);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String string = context.getString(R.string.circulation_description_platform);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String format = String.format(string, Arrays.copyOf(new Object[]{platformText}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        platformView.setContentDescription(format);
        platformView.setAlpha(getPlatformTextAlpha(trainCirculation));
        if (trainCirculation.getImmediateDeparture()) {
            ViewKt.blink$default(platformView, 0, 0L, 0L, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0, 63, null);
        } else {
            platformView.clearAnimation();
        }
    }
}
