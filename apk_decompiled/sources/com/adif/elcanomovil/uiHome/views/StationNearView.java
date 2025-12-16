package com.adif.elcanomovil.uiHome.views;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.adif.elcanomovil.commonViews.data.StationOptionViewEntity;
import com.adif.elcanomovil.commonViews.data.StationViewEntity;
import com.adif.elcanomovil.extensions.FloatExtensionsKt;
import com.adif.elcanomovil.resources.StringUtils;
import com.adif.elcanomovil.uiHome.HomeFragmentBottomSheetViewState;
import com.adif.elcanomovil.uiHome.LocationStatus;
import com.adif.elcanomovil.uiHome.R;
import com.adif.elcanomovil.uiHome.databinding.ViewStationNearBinding;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\u001e\u001a\u00020\u0011H\u0002J\u001a\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0002J\u0018\u0010 \u001a\u00020\u00112\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0002J\u0010\u0010%\u001a\u00020\u00112\u0006\u0010&\u001a\u00020'H\u0002J\u0012\u0010(\u001a\u00020\u00112\b\b\u0001\u0010)\u001a\u00020\nH\u0002J\u0016\u0010*\u001a\u00020\u00112\u0006\u0010+\u001a\u00020,2\u0006\u0010#\u001a\u00020$J\u0012\u0010-\u001a\u00020\u00112\b\u0010.\u001a\u0004\u0018\u00010/H\u0002J\u0012\u00100\u001a\u00020\u00112\b\u0010.\u001a\u0004\u0018\u00010/H\u0002J\u0012\u00101\u001a\u00020\u00112\b\u0010.\u001a\u0004\u0018\u00010/H\u0002J!\u00102\u001a\u00020\u00112\b\u00103\u001a\u0004\u0018\u0001042\b\u00105\u001a\u0004\u0018\u000104H\u0003¢\u0006\u0002\u00106J\u0012\u00107\u001a\u00020\u00112\b\u0010.\u001a\u0004\u0018\u00010/H\u0002J\u0010\u00108\u001a\u00020\u00112\u0006\u00109\u001a\u00020\nH\u0002J\u0012\u0010:\u001a\u00020\u00112\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002J\u0012\u0010;\u001a\u00020\u00112\b\u0010.\u001a\u0004\u0018\u00010/H\u0002J\u0012\u0010;\u001a\u00020\u00112\b\u0010<\u001a\u0004\u0018\u00010=H\u0002J\u0012\u0010>\u001a\u00020\u00112\b\u0010<\u001a\u0004\u0018\u00010=H\u0002R\u000e\u0010\f\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000RL\u0010\u0013\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000fj\u0002`\u00122\u001a\u0010\u000e\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000fj\u0002`\u0012@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u000e\u001a\u0004\u0018\u00010\u001a@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b\u001c\u0010\u001d¨\u0006?"}, d2 = {"Lcom/adif/elcanomovil/uiHome/views/StationNearView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attr", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "attrs", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/adif/elcanomovil/uiHome/databinding/ViewStationNearBinding;", "value", "Lkotlin/Function1;", "Lcom/adif/elcanomovil/commonViews/data/StationOptionViewEntity;", "", "Lcom/adif/elcanomovil/commonViews/StationOptionListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "getListener", "()Lkotlin/jvm/functions/Function1;", "setListener", "(Lkotlin/jvm/functions/Function1;)V", "showLoadingJob", "Lkotlinx/coroutines/Job;", "Lcom/adif/elcanomovil/commonViews/data/StationViewEntity;", "station", "setStation", "(Lcom/adif/elcanomovil/commonViews/data/StationViewEntity;)V", "hideLocationPermissionStatusMessage", "initView", "showLoading", "show", "", "scope", "Lkotlinx/coroutines/CoroutineScope;", "showLocationPermissionStatus", "status", "Lcom/adif/elcanomovil/uiHome/LocationStatus;", "showPermissionStatusMessage", "message", "update", RemoteConfigConstants.ResponseFieldKey.STATE, "Lcom/adif/elcanomovil/uiHome/HomeFragmentBottomSheetViewState;", "updateArrivalsOption", "values", "Landroid/content/res/TypedArray;", "updateCommercialOption", "updateDeparturesOption", "updateDistanceTime", "distance", "", "time", "(Ljava/lang/Float;Ljava/lang/Float;)V", "updateInfoOption", "updateShowStationOption", "visibility", "updateShowStationOptions", "updateStationTitle", "title", "", "updateTitle", "ui-home_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class StationNearView extends ConstraintLayout {
    private ViewStationNearBinding binding;
    private Function1<? super StationOptionViewEntity, Unit> listener;
    private Job showLoadingJob;
    private StationViewEntity station;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[StationViewEntity.Type.values().length];
            try {
                iArr[StationViewEntity.Type.NEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StationViewEntity.Type.HOME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StationViewEntity.Type.WORK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[LocationStatus.values().length];
            try {
                iArr2[LocationStatus.ENABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[LocationStatus.DISABLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[LocationStatus.PERMISSION_DENIED.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StationNearView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        initView(context, null);
    }

    private final void hideLocationPermissionStatusMessage() {
        ViewStationNearBinding viewStationNearBinding = this.binding;
        ViewStationNearBinding viewStationNearBinding2 = null;
        if (viewStationNearBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            viewStationNearBinding = null;
        }
        viewStationNearBinding.permissionStatusTextView.setVisibility(8);
        ViewStationNearBinding viewStationNearBinding3 = this.binding;
        if (viewStationNearBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            viewStationNearBinding2 = viewStationNearBinding3;
        }
        viewStationNearBinding2.nearStationSubtitle.setVisibility(0);
    }

    private final void initView(Context context, AttributeSet attrs) {
        ViewStationNearBinding inflate = ViewStationNearBinding.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.binding = inflate;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attrs, R.styleable.StationNearView, 0, 0);
        try {
            updateStationTitle(obtainStyledAttributes);
            updateDeparturesOption(obtainStyledAttributes);
            updateArrivalsOption(obtainStyledAttributes);
            updateInfoOption(obtainStyledAttributes);
            updateCommercialOption(obtainStyledAttributes);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private final void setStation(StationViewEntity stationViewEntity) {
        this.station = stationViewEntity;
        Unit unit = null;
        ViewStationNearBinding viewStationNearBinding = null;
        if (stationViewEntity != null) {
            ViewStationNearBinding viewStationNearBinding2 = this.binding;
            if (viewStationNearBinding2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                viewStationNearBinding2 = null;
            }
            viewStationNearBinding2.stationInfoDepartures.updateData(new StationOptionViewEntity(null, null, null, StationViewEntity.Type.DEPARTURES, stationViewEntity.isDeparturesAvailable(), null, null, 103, null));
            ViewStationNearBinding viewStationNearBinding3 = this.binding;
            if (viewStationNearBinding3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                viewStationNearBinding3 = null;
            }
            viewStationNearBinding3.stationInfoArrivals.updateData(new StationOptionViewEntity(null, null, null, StationViewEntity.Type.ARRIVALS, stationViewEntity.isArrivalsAvailable(), null, null, 103, null));
            ViewStationNearBinding viewStationNearBinding4 = this.binding;
            if (viewStationNearBinding4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                viewStationNearBinding4 = null;
            }
            viewStationNearBinding4.stationInfoDetails.updateData(new StationOptionViewEntity(null, null, null, StationViewEntity.Type.INFO, stationViewEntity.isInfoDetailAvailable(), null, null, 103, null));
            ViewStationNearBinding viewStationNearBinding5 = this.binding;
            if (viewStationNearBinding5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                viewStationNearBinding = viewStationNearBinding5;
            }
            viewStationNearBinding.stationInfoComercial.updateData(new StationOptionViewEntity(null, null, null, StationViewEntity.Type.COMMERCIAL, stationViewEntity.isCommercialAreaAvailable(), null, stationViewEntity.getCommercialZoneType(), 39, null));
            int i = WhenMappings.$EnumSwitchMapping$0[stationViewEntity.getType().ordinal()];
            String string = i != 1 ? i != 2 ? i != 3 ? getContext().getString(R.string.near_station_selected_title) : getContext().getString(R.string.near_work_selected_title) : getContext().getString(R.string.near_home_selected_title) : getContext().getString(R.string.near_station_title);
            Intrinsics.checkNotNull(string);
            updateTitle(string);
            updateStationTitle(stationViewEntity.getName());
            updateDistanceTime(stationViewEntity.getDistance(), stationViewEntity.getDuration());
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            updateTitle(getContext().getString(R.string.near_station_title));
            updateStationTitle(getRootView().getContext().getString(R.string.near_station_loading_title));
        }
    }

    private final void showLoading(boolean show, CoroutineScope scope) {
        Job launch$default;
        ViewStationNearBinding viewStationNearBinding = null;
        if (show) {
            Job job = this.showLoadingJob;
            if (job == null || !job.isActive()) {
                launch$default = BuildersKt__Builders_commonKt.launch$default(scope, null, null, new j(this, null), 3, null);
                this.showLoadingJob = launch$default;
                return;
            }
            return;
        }
        Job job2 = this.showLoadingJob;
        if (job2 != null) {
            Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
        }
        this.showLoadingJob = null;
        ViewStationNearBinding viewStationNearBinding2 = this.binding;
        if (viewStationNearBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            viewStationNearBinding = viewStationNearBinding2;
        }
        viewStationNearBinding.stationOptionsLoading.setVisibility(8);
        updateShowStationOptions(this.station);
    }

    private final void showLocationPermissionStatus(LocationStatus status) {
        int i = WhenMappings.$EnumSwitchMapping$1[status.ordinal()];
        if (i == 1) {
            hideLocationPermissionStatusMessage();
        } else if (i == 2) {
            showPermissionStatusMessage(R.string.near_station_no_location_available_info);
        } else {
            if (i != 3) {
                return;
            }
            showPermissionStatusMessage(R.string.near_station_no_location_permission_info);
        }
    }

    private final void showPermissionStatusMessage(int message) {
        ViewStationNearBinding viewStationNearBinding = this.binding;
        ViewStationNearBinding viewStationNearBinding2 = null;
        if (viewStationNearBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            viewStationNearBinding = null;
        }
        viewStationNearBinding.permissionStatusTextView.setText(message);
        ViewStationNearBinding viewStationNearBinding3 = this.binding;
        if (viewStationNearBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            viewStationNearBinding3 = null;
        }
        viewStationNearBinding3.permissionStatusTextView.setVisibility(0);
        ViewStationNearBinding viewStationNearBinding4 = this.binding;
        if (viewStationNearBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            viewStationNearBinding4 = null;
        }
        viewStationNearBinding4.nearStationSubtitle.setVisibility(8);
        updateShowStationOption(8);
        ViewStationNearBinding viewStationNearBinding5 = this.binding;
        if (viewStationNearBinding5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            viewStationNearBinding2 = viewStationNearBinding5;
        }
        viewStationNearBinding2.nearStationInfo.setVisibility(8);
    }

    private final void updateArrivalsOption(TypedArray values) {
        if (values != null) {
            String string = values.getString(R.styleable.StationNearView_arrivalsTitleText);
            ViewStationNearBinding viewStationNearBinding = null;
            if (string != null) {
                StringUtils.Companion companion = StringUtils.INSTANCE;
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                Intrinsics.checkNotNull(string);
                SpannableString textStyle = companion.textStyle(context, string, string, R.font.open_sans_semi_bold, getContext().getColor(R.color.white));
                ViewStationNearBinding viewStationNearBinding2 = this.binding;
                if (viewStationNearBinding2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    viewStationNearBinding2 = null;
                }
                viewStationNearBinding2.stationInfoArrivals.getStationOptionTitle().setText(textStyle);
            }
            int i = R.styleable.StationNearView_arrivalsTitleTextColor;
            Context context2 = getContext();
            int i4 = R.color.white;
            int color = values.getColor(i, context2.getColor(i4));
            ViewStationNearBinding viewStationNearBinding3 = this.binding;
            if (viewStationNearBinding3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                viewStationNearBinding3 = null;
            }
            viewStationNearBinding3.stationInfoArrivals.getStationOptionTitle().setTextColor(color);
            int dimensionPixelSize = values.getDimensionPixelSize(R.styleable.StationNearView_arrivalsTitleTextSize, (int) getContext().getResources().getDimension(R.dimen.medium_text_size));
            ViewStationNearBinding viewStationNearBinding4 = this.binding;
            if (viewStationNearBinding4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                viewStationNearBinding4 = null;
            }
            viewStationNearBinding4.stationInfoArrivals.getStationOptionTitle().setTextSize(0, dimensionPixelSize);
            String string2 = values.getString(R.styleable.StationNearView_arrivalsSubtitleText);
            if (string2 != null) {
                StringUtils.Companion companion2 = StringUtils.INSTANCE;
                Context context3 = getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                Intrinsics.checkNotNull(string2);
                SpannableString textStyle2 = companion2.textStyle(context3, string2, string2, R.font.open_sans_bold, getContext().getColor(i4));
                ViewStationNearBinding viewStationNearBinding5 = this.binding;
                if (viewStationNearBinding5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    viewStationNearBinding5 = null;
                }
                viewStationNearBinding5.stationInfoArrivals.getStationOptionSubtitle().setText(textStyle2);
            }
            int color2 = values.getColor(R.styleable.StationNearView_arrivalsSubtitleTextColor, getContext().getColor(i4));
            ViewStationNearBinding viewStationNearBinding6 = this.binding;
            if (viewStationNearBinding6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                viewStationNearBinding6 = null;
            }
            viewStationNearBinding6.stationInfoArrivals.getStationOptionSubtitle().setTextColor(color2);
            int dimensionPixelSize2 = values.getDimensionPixelSize(R.styleable.StationNearView_arrivalsSubtitleTextSize, (int) getContext().getResources().getDimension(R.dimen.big_text_size));
            ViewStationNearBinding viewStationNearBinding7 = this.binding;
            if (viewStationNearBinding7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                viewStationNearBinding7 = null;
            }
            viewStationNearBinding7.stationInfoArrivals.getStationOptionSubtitle().setTextSize(0, dimensionPixelSize2);
            ViewStationNearBinding viewStationNearBinding8 = this.binding;
            if (viewStationNearBinding8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                viewStationNearBinding = viewStationNearBinding8;
            }
            viewStationNearBinding.stationInfoArrivals.setEnabled(values.getBoolean(R.styleable.StationNearView_arrivalsAvailable, false));
        }
    }

    private final void updateCommercialOption(TypedArray values) {
        if (values != null) {
            String string = values.getString(R.styleable.StationNearView_commercialTitleText);
            ViewStationNearBinding viewStationNearBinding = null;
            if (string != null) {
                StringUtils.Companion companion = StringUtils.INSTANCE;
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                Intrinsics.checkNotNull(string);
                SpannableString textStyle = companion.textStyle(context, string, string, R.font.open_sans_semi_bold, getContext().getColor(R.color.white));
                ViewStationNearBinding viewStationNearBinding2 = this.binding;
                if (viewStationNearBinding2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    viewStationNearBinding2 = null;
                }
                viewStationNearBinding2.stationInfoComercial.getStationOptionTitle().setText(textStyle);
            }
            int i = R.styleable.StationNearView_commercialTitleTextColor;
            Context context2 = getContext();
            int i4 = R.color.white;
            int color = values.getColor(i, context2.getColor(i4));
            ViewStationNearBinding viewStationNearBinding3 = this.binding;
            if (viewStationNearBinding3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                viewStationNearBinding3 = null;
            }
            viewStationNearBinding3.stationInfoComercial.getStationOptionTitle().setTextColor(color);
            int dimensionPixelSize = values.getDimensionPixelSize(R.styleable.StationNearView_commercialTitleTextSize, (int) getContext().getResources().getDimension(R.dimen.medium_text_size));
            ViewStationNearBinding viewStationNearBinding4 = this.binding;
            if (viewStationNearBinding4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                viewStationNearBinding4 = null;
            }
            viewStationNearBinding4.stationInfoComercial.getStationOptionTitle().setTextSize(0, dimensionPixelSize);
            String string2 = values.getString(R.styleable.StationNearView_commercialSubtitleText);
            if (string2 != null) {
                StringUtils.Companion companion2 = StringUtils.INSTANCE;
                Context context3 = getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                Intrinsics.checkNotNull(string2);
                SpannableString textStyle2 = companion2.textStyle(context3, string2, string2, R.font.open_sans_bold, getContext().getColor(i4));
                ViewStationNearBinding viewStationNearBinding5 = this.binding;
                if (viewStationNearBinding5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    viewStationNearBinding5 = null;
                }
                viewStationNearBinding5.stationInfoComercial.getStationOptionSubtitle().setText(textStyle2);
            }
            int color2 = values.getColor(R.styleable.StationNearView_commercialSubtitleTextColor, getContext().getColor(i4));
            ViewStationNearBinding viewStationNearBinding6 = this.binding;
            if (viewStationNearBinding6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                viewStationNearBinding6 = null;
            }
            viewStationNearBinding6.stationInfoComercial.getStationOptionSubtitle().setTextColor(color2);
            int dimensionPixelSize2 = values.getDimensionPixelSize(R.styleable.StationNearView_commercialSubtitleTextSize, (int) getContext().getResources().getDimension(R.dimen.big_text_size));
            ViewStationNearBinding viewStationNearBinding7 = this.binding;
            if (viewStationNearBinding7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                viewStationNearBinding7 = null;
            }
            viewStationNearBinding7.stationInfoComercial.getStationOptionSubtitle().setTextSize(0, dimensionPixelSize2);
            ViewStationNearBinding viewStationNearBinding8 = this.binding;
            if (viewStationNearBinding8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                viewStationNearBinding = viewStationNearBinding8;
            }
            viewStationNearBinding.stationInfoComercial.setEnabled(values.getBoolean(R.styleable.StationNearView_commercialAvailable, false));
        }
    }

    private final void updateDeparturesOption(TypedArray values) {
        if (values != null) {
            String string = values.getString(R.styleable.StationNearView_departuresTitleText);
            ViewStationNearBinding viewStationNearBinding = null;
            if (string != null) {
                StringUtils.Companion companion = StringUtils.INSTANCE;
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                Intrinsics.checkNotNull(string);
                SpannableString textStyle = companion.textStyle(context, string, string, R.font.open_sans_semi_bold, getContext().getColor(R.color.white));
                ViewStationNearBinding viewStationNearBinding2 = this.binding;
                if (viewStationNearBinding2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    viewStationNearBinding2 = null;
                }
                viewStationNearBinding2.stationInfoDepartures.getStationOptionTitle().setText(textStyle);
            }
            int i = R.styleable.StationNearView_departuresTitleTextColor;
            Context context2 = getContext();
            int i4 = R.color.white;
            int color = values.getColor(i, context2.getColor(i4));
            ViewStationNearBinding viewStationNearBinding3 = this.binding;
            if (viewStationNearBinding3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                viewStationNearBinding3 = null;
            }
            viewStationNearBinding3.stationInfoDepartures.getStationOptionTitle().setTextColor(color);
            int dimensionPixelSize = values.getDimensionPixelSize(R.styleable.StationNearView_departuresTitleTextSize, (int) getContext().getResources().getDimension(R.dimen.medium_text_size));
            ViewStationNearBinding viewStationNearBinding4 = this.binding;
            if (viewStationNearBinding4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                viewStationNearBinding4 = null;
            }
            viewStationNearBinding4.stationInfoDepartures.getStationOptionTitle().setTextSize(0, dimensionPixelSize);
            String string2 = values.getString(R.styleable.StationNearView_departuresSubtitleText);
            if (string2 != null) {
                StringUtils.Companion companion2 = StringUtils.INSTANCE;
                Context context3 = getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                Intrinsics.checkNotNull(string2);
                SpannableString textStyle2 = companion2.textStyle(context3, string2, string2, R.font.open_sans_bold, getContext().getColor(i4));
                ViewStationNearBinding viewStationNearBinding5 = this.binding;
                if (viewStationNearBinding5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    viewStationNearBinding5 = null;
                }
                viewStationNearBinding5.stationInfoDepartures.getStationOptionSubtitle().setText(textStyle2);
            }
            int color2 = values.getColor(R.styleable.StationNearView_departuresSubtitleTextColor, getContext().getColor(i4));
            ViewStationNearBinding viewStationNearBinding6 = this.binding;
            if (viewStationNearBinding6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                viewStationNearBinding6 = null;
            }
            viewStationNearBinding6.stationInfoDepartures.getStationOptionSubtitle().setTextColor(color2);
            int dimensionPixelSize2 = values.getDimensionPixelSize(R.styleable.StationNearView_departuresSubtitleTextSize, (int) getContext().getResources().getDimension(R.dimen.big_text_size));
            ViewStationNearBinding viewStationNearBinding7 = this.binding;
            if (viewStationNearBinding7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                viewStationNearBinding7 = null;
            }
            viewStationNearBinding7.stationInfoDepartures.getStationOptionSubtitle().setTextSize(0, dimensionPixelSize2);
            ViewStationNearBinding viewStationNearBinding8 = this.binding;
            if (viewStationNearBinding8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                viewStationNearBinding = viewStationNearBinding8;
            }
            viewStationNearBinding.stationInfoDepartures.setEnabled(values.getBoolean(R.styleable.StationNearView_departuresAvailable, false));
        }
    }

    @SuppressLint({"SetTextI18n"})
    private final void updateDistanceTime(Float distance, Float time) {
        int i;
        ViewStationNearBinding viewStationNearBinding = this.binding;
        if (viewStationNearBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            viewStationNearBinding = null;
        }
        TextView textView = viewStationNearBinding.nearStationInfo;
        if (distance == null || time == null) {
            i = 8;
        } else {
            textView.setText(FloatExtensionsKt.toDistance(distance.floatValue()) + " - " + FloatExtensionsKt.toDuration(time.floatValue()));
            i = 0;
        }
        textView.setVisibility(i);
    }

    private final void updateInfoOption(TypedArray values) {
        if (values != null) {
            String string = values.getString(R.styleable.StationNearView_infoTitleText);
            ViewStationNearBinding viewStationNearBinding = null;
            if (string != null) {
                ViewStationNearBinding viewStationNearBinding2 = this.binding;
                if (viewStationNearBinding2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    viewStationNearBinding2 = null;
                }
                viewStationNearBinding2.stationInfoDetails.getStationOptionTitle().setText(string);
            }
            int i = R.styleable.StationNearView_infoTitleTextColor;
            Context context = getContext();
            int i4 = R.color.white;
            int color = values.getColor(i, context.getColor(i4));
            ViewStationNearBinding viewStationNearBinding3 = this.binding;
            if (viewStationNearBinding3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                viewStationNearBinding3 = null;
            }
            viewStationNearBinding3.stationInfoDetails.getStationOptionTitle().setTextColor(color);
            int dimensionPixelSize = values.getDimensionPixelSize(R.styleable.StationNearView_infoTitleTextSize, (int) getContext().getResources().getDimension(R.dimen.big_text_size));
            ViewStationNearBinding viewStationNearBinding4 = this.binding;
            if (viewStationNearBinding4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                viewStationNearBinding4 = null;
            }
            viewStationNearBinding4.stationInfoDetails.getStationOptionTitle().setTextSize(0, dimensionPixelSize);
            String string2 = values.getString(R.styleable.StationNearView_infoSubtitleText);
            if (string2 != null) {
                ViewStationNearBinding viewStationNearBinding5 = this.binding;
                if (viewStationNearBinding5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    viewStationNearBinding5 = null;
                }
                viewStationNearBinding5.stationInfoDetails.getStationOptionSubtitle().setText(string2);
            }
            int color2 = values.getColor(R.styleable.StationNearView_infoSubtitleTextColor, getContext().getColor(i4));
            ViewStationNearBinding viewStationNearBinding6 = this.binding;
            if (viewStationNearBinding6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                viewStationNearBinding6 = null;
            }
            viewStationNearBinding6.stationInfoDetails.getStationOptionSubtitle().setTextColor(color2);
            int dimensionPixelSize2 = values.getDimensionPixelSize(R.styleable.StationNearView_infoSubtitleTextSize, (int) getContext().getResources().getDimension(R.dimen.medium_text_size));
            ViewStationNearBinding viewStationNearBinding7 = this.binding;
            if (viewStationNearBinding7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                viewStationNearBinding7 = null;
            }
            viewStationNearBinding7.stationInfoDetails.getStationOptionSubtitle().setTextSize(0, dimensionPixelSize2);
            ViewStationNearBinding viewStationNearBinding8 = this.binding;
            if (viewStationNearBinding8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                viewStationNearBinding = viewStationNearBinding8;
            }
            viewStationNearBinding.stationInfoDetails.setEnabled(values.getBoolean(R.styleable.StationNearView_infoAvailable, false));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateShowStationOption(int visibility) {
        ViewStationNearBinding viewStationNearBinding = this.binding;
        ViewStationNearBinding viewStationNearBinding2 = null;
        if (viewStationNearBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            viewStationNearBinding = null;
        }
        viewStationNearBinding.stationInfoArrivals.setVisibility(visibility);
        ViewStationNearBinding viewStationNearBinding3 = this.binding;
        if (viewStationNearBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            viewStationNearBinding3 = null;
        }
        viewStationNearBinding3.stationInfoDepartures.setVisibility(visibility);
        ViewStationNearBinding viewStationNearBinding4 = this.binding;
        if (viewStationNearBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            viewStationNearBinding4 = null;
        }
        viewStationNearBinding4.stationInfoComercial.setVisibility(visibility);
        ViewStationNearBinding viewStationNearBinding5 = this.binding;
        if (viewStationNearBinding5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            viewStationNearBinding2 = viewStationNearBinding5;
        }
        viewStationNearBinding2.stationInfoDetails.setVisibility(visibility);
    }

    private final void updateShowStationOptions(StationViewEntity station) {
        ViewStationNearBinding viewStationNearBinding = this.binding;
        ViewStationNearBinding viewStationNearBinding2 = null;
        if (viewStationNearBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            viewStationNearBinding = null;
        }
        viewStationNearBinding.nearStationInfo.setVisibility(station != null ? 0 : 8);
        ViewStationNearBinding viewStationNearBinding3 = this.binding;
        if (viewStationNearBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            viewStationNearBinding2 = viewStationNearBinding3;
        }
        viewStationNearBinding2.permissionStatusTextView.setVisibility(station != null ? 8 : 0);
        updateShowStationOption(station != null ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateStationTitle(String title) {
        ViewStationNearBinding viewStationNearBinding = this.binding;
        if (viewStationNearBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            viewStationNearBinding = null;
        }
        viewStationNearBinding.nearStationSubtitle.setText(title);
    }

    private final void updateTitle(String title) {
        ViewStationNearBinding viewStationNearBinding = this.binding;
        if (viewStationNearBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            viewStationNearBinding = null;
        }
        viewStationNearBinding.nearStationTitle.setText(title);
    }

    public final Function1<StationOptionViewEntity, Unit> getListener() {
        return this.listener;
    }

    public final void setListener(Function1<? super StationOptionViewEntity, Unit> function1) {
        this.listener = function1;
        ViewStationNearBinding viewStationNearBinding = this.binding;
        ViewStationNearBinding viewStationNearBinding2 = null;
        if (viewStationNearBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            viewStationNearBinding = null;
        }
        viewStationNearBinding.stationInfoDepartures.setListener(this.listener);
        ViewStationNearBinding viewStationNearBinding3 = this.binding;
        if (viewStationNearBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            viewStationNearBinding3 = null;
        }
        viewStationNearBinding3.stationInfoArrivals.setListener(this.listener);
        ViewStationNearBinding viewStationNearBinding4 = this.binding;
        if (viewStationNearBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            viewStationNearBinding4 = null;
        }
        viewStationNearBinding4.stationInfoDetails.setListener(this.listener);
        ViewStationNearBinding viewStationNearBinding5 = this.binding;
        if (viewStationNearBinding5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            viewStationNearBinding2 = viewStationNearBinding5;
        }
        viewStationNearBinding2.stationInfoComercial.setListener(this.listener);
    }

    public final void update(HomeFragmentBottomSheetViewState state, CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(scope, "scope");
        if (state instanceof HomeFragmentBottomSheetViewState.NearestStationShown) {
            HomeFragmentBottomSheetViewState.NearestStationShown nearestStationShown = (HomeFragmentBottomSheetViewState.NearestStationShown) state;
            setStation(nearestStationShown.getNearestStation());
            showLoading(nearestStationShown.getShowLoading(), scope);
            showLocationPermissionStatus(nearestStationShown.getLocationStatus());
            return;
        }
        if (!(state instanceof HomeFragmentBottomSheetViewState.StationSelected)) {
            boolean z3 = state instanceof HomeFragmentBottomSheetViewState.Hidden;
        } else {
            setStation(((HomeFragmentBottomSheetViewState.StationSelected) state).getSelectedStation());
            hideLocationPermissionStatusMessage();
        }
    }

    private final void updateStationTitle(TypedArray values) {
        String string;
        if (values == null || (string = values.getString(R.styleable.StationNearView_stationTitleText)) == null) {
            return;
        }
        updateStationTitle(string);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StationNearView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        initView(context, attributeSet);
    }

    public /* synthetic */ StationNearView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StationNearView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        initView(context, attributeSet);
    }
}
