package com.adif.elcanomovil.commonViews;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.adif.elcanomovil.commonViews.data.StationOptionViewEntity;
import com.adif.elcanomovil.commonViews.data.StationViewEntity;
import com.adif.elcanomovil.commonViews.databinding.ViewUserStationsBinding;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010/\u001a\u00020\u0017H\u0002J\u0006\u00100\u001a\u00020\u0017J\b\u00101\u001a\u00020\u0017H\u0002J\u0006\u00102\u001a\u00020\u0017J\u001a\u00103\u001a\u00020\u00172\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0002J\b\u00104\u001a\u00020\u0017H\u0002J\u0012\u00105\u001a\u00020\u00172\b\u00106\u001a\u0004\u0018\u000107H\u0002J\u0012\u00105\u001a\u00020\u00172\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002J\u0012\u00108\u001a\u00020\u00172\b\u00106\u001a\u0004\u0018\u000107H\u0002J\u0012\u00108\u001a\u00020\u00172\b\u0010,\u001a\u0004\u0018\u00010\u000fH\u0002R\u000e\u0010\f\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R(\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014RL\u0010\u0019\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0015j\u0002`\u00182\u001a\u0010\u000e\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0015j\u0002`\u0018@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR;\u0010\u001e\u001a#\u0012\u0013\u0012\u00110\u001f¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0015j\u0002`#X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001b\"\u0004\b%\u0010\u001dR$\u0010'\u001a\u00020&2\u0006\u0010\u000e\u001a\u00020&@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R(\u0010,\u001a\u0004\u0018\u00010\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0012\"\u0004\b.\u0010\u0014¨\u00069"}, d2 = {"Lcom/adif/elcanomovil/commonViews/UserStationsView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attr", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "attrs", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/adif/elcanomovil/commonViews/databinding/ViewUserStationsBinding;", "value", "Lcom/adif/elcanomovil/commonViews/data/StationViewEntity;", "homeStation", "getHomeStation", "()Lcom/adif/elcanomovil/commonViews/data/StationViewEntity;", "setHomeStation", "(Lcom/adif/elcanomovil/commonViews/data/StationViewEntity;)V", "Lkotlin/Function1;", "Lcom/adif/elcanomovil/commonViews/data/StationOptionViewEntity;", "", "Lcom/adif/elcanomovil/commonViews/StationOptionListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "getListener", "()Lkotlin/jvm/functions/Function1;", "setListener", "(Lkotlin/jvm/functions/Function1;)V", "listenerUserStationsEdit", "Lcom/adif/elcanomovil/commonViews/data/StationViewEntity$Type;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "option", "Lcom/adif/elcanomovil/commonViews/StationEditListener;", "getListenerUserStationsEdit", "setListenerUserStationsEdit", "", "showLayoutHeader", "getShowLayoutHeader", "()Z", "setShowLayoutHeader", "(Z)V", "workStation", "getWorkStation", "setWorkStation", "configureListeners", "hideHomeStation", "hideOptions", "hideWorkStation", "initView", "showOptions", "updateHomeStation", "values", "Landroid/content/res/TypedArray;", "updateWorkStation", "common-views_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class UserStationsView extends ConstraintLayout {
    private ViewUserStationsBinding binding;
    private StationViewEntity homeStation;
    private Function1<? super StationOptionViewEntity, Unit> listener;
    private Function1<? super StationViewEntity.Type, Unit> listenerUserStationsEdit;
    private boolean showLayoutHeader;
    private StationViewEntity workStation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserStationsView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.showLayoutHeader = true;
        initView(context, null);
    }

    private final void configureListeners() {
        Context context = getContext();
        ViewUserStationsBinding viewUserStationsBinding = this.binding;
        ViewUserStationsBinding viewUserStationsBinding2 = null;
        if (viewUserStationsBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            viewUserStationsBinding = null;
        }
        PopupMenu popupMenu = new PopupMenu(context, viewUserStationsBinding.userStationsActionMore);
        popupMenu.getMenuInflater().inflate(R.menu.menu_user_stations, popupMenu.getMenu());
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() { // from class: com.adif.elcanomovil.commonViews.h
            @Override // android.widget.PopupMenu.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                boolean configureListeners$lambda$1;
                configureListeners$lambda$1 = UserStationsView.configureListeners$lambda$1(UserStationsView.this, menuItem);
                return configureListeners$lambda$1;
            }
        });
        ViewUserStationsBinding viewUserStationsBinding3 = this.binding;
        if (viewUserStationsBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            viewUserStationsBinding2 = viewUserStationsBinding3;
        }
        viewUserStationsBinding2.userStationsActionMore.setOnClickListener(new D1.a(popupMenu, 9));
    }

    public static final boolean configureListeners$lambda$1(UserStationsView this$0, MenuItem menuItem) {
        Function1<? super StationViewEntity.Type, Unit> function1;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int itemId = menuItem.getItemId();
        if (itemId == R.id.menu_update_home) {
            Function1<? super StationViewEntity.Type, Unit> function12 = this$0.listenerUserStationsEdit;
            if (function12 == null) {
                return false;
            }
            function12.invoke(StationViewEntity.Type.HOME);
            return false;
        }
        if (itemId != R.id.menu_update_work || (function1 = this$0.listenerUserStationsEdit) == null) {
            return false;
        }
        function1.invoke(StationViewEntity.Type.WORK);
        return false;
    }

    public static final void configureListeners$lambda$2(PopupMenu popupMenu, View view) {
        Intrinsics.checkNotNullParameter(popupMenu, "$popupMenu");
        popupMenu.show();
    }

    private final void hideOptions() {
        ViewUserStationsBinding viewUserStationsBinding = this.binding;
        if (viewUserStationsBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            viewUserStationsBinding = null;
        }
        viewUserStationsBinding.userStationsActionMore.setVisibility(8);
    }

    private final void initView(Context context, AttributeSet attrs) {
        ViewUserStationsBinding inflate = ViewUserStationsBinding.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.binding = inflate;
        configureListeners();
        hideOptions();
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attrs, R.styleable.UserStationsView, 0, 0);
        try {
            updateHomeStation(obtainStyledAttributes);
            updateWorkStation(obtainStyledAttributes);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private final void showOptions() {
        ViewUserStationsBinding viewUserStationsBinding = this.binding;
        if (viewUserStationsBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            viewUserStationsBinding = null;
        }
        viewUserStationsBinding.userStationsActionMore.setVisibility(0);
    }

    private final void updateHomeStation(StationViewEntity homeStation) {
        Unit unit;
        ViewUserStationsBinding viewUserStationsBinding = null;
        if (homeStation != null) {
            showOptions();
            ViewUserStationsBinding viewUserStationsBinding2 = this.binding;
            if (viewUserStationsBinding2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                viewUserStationsBinding2 = null;
            }
            viewUserStationsBinding2.userStationHome.updateData(new StationOptionViewEntity(homeStation.getId(), null, homeStation.getAlias(), StationViewEntity.Type.HOME, false, null, null, 114, null));
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            ViewUserStationsBinding viewUserStationsBinding3 = this.binding;
            if (viewUserStationsBinding3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                viewUserStationsBinding = viewUserStationsBinding3;
            }
            viewUserStationsBinding.userStationHome.updateData(new StationOptionViewEntity(null, null, getRootView().getContext().getString(R.string.station_select), StationViewEntity.Type.HOME, false, null, null, 115, null));
        }
    }

    private final void updateWorkStation(StationViewEntity workStation) {
        Unit unit;
        ViewUserStationsBinding viewUserStationsBinding = null;
        if (workStation != null) {
            showOptions();
            ViewUserStationsBinding viewUserStationsBinding2 = this.binding;
            if (viewUserStationsBinding2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                viewUserStationsBinding2 = null;
            }
            viewUserStationsBinding2.userStationWork.updateData(new StationOptionViewEntity(workStation.getId(), null, workStation.getAlias(), StationViewEntity.Type.WORK, false, null, null, 114, null));
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            ViewUserStationsBinding viewUserStationsBinding3 = this.binding;
            if (viewUserStationsBinding3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                viewUserStationsBinding = viewUserStationsBinding3;
            }
            viewUserStationsBinding.userStationWork.updateData(new StationOptionViewEntity(null, null, getRootView().getContext().getString(R.string.station_select), StationViewEntity.Type.WORK, false, null, null, 115, null));
        }
    }

    public final StationViewEntity getHomeStation() {
        return this.homeStation;
    }

    public final Function1<StationOptionViewEntity, Unit> getListener() {
        return this.listener;
    }

    public final Function1<StationViewEntity.Type, Unit> getListenerUserStationsEdit() {
        return this.listenerUserStationsEdit;
    }

    public final boolean getShowLayoutHeader() {
        return this.showLayoutHeader;
    }

    public final StationViewEntity getWorkStation() {
        return this.workStation;
    }

    public final void hideHomeStation() {
        ViewUserStationsBinding viewUserStationsBinding = this.binding;
        if (viewUserStationsBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            viewUserStationsBinding = null;
        }
        viewUserStationsBinding.userStationHome.setVisibility(8);
    }

    public final void hideWorkStation() {
        ViewUserStationsBinding viewUserStationsBinding = this.binding;
        if (viewUserStationsBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            viewUserStationsBinding = null;
        }
        viewUserStationsBinding.userStationWork.setVisibility(8);
    }

    public final void setHomeStation(StationViewEntity stationViewEntity) {
        this.homeStation = stationViewEntity;
        updateHomeStation(stationViewEntity);
    }

    public final void setListener(Function1<? super StationOptionViewEntity, Unit> function1) {
        this.listener = function1;
        ViewUserStationsBinding viewUserStationsBinding = this.binding;
        ViewUserStationsBinding viewUserStationsBinding2 = null;
        if (viewUserStationsBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            viewUserStationsBinding = null;
        }
        viewUserStationsBinding.userStationHome.setListener(this.listener);
        ViewUserStationsBinding viewUserStationsBinding3 = this.binding;
        if (viewUserStationsBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            viewUserStationsBinding2 = viewUserStationsBinding3;
        }
        viewUserStationsBinding2.userStationWork.setListener(this.listener);
    }

    public final void setListenerUserStationsEdit(Function1<? super StationViewEntity.Type, Unit> function1) {
        this.listenerUserStationsEdit = function1;
    }

    public final void setShowLayoutHeader(boolean z3) {
        this.showLayoutHeader = z3;
        ViewUserStationsBinding viewUserStationsBinding = this.binding;
        if (viewUserStationsBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            viewUserStationsBinding = null;
        }
        viewUserStationsBinding.layoutHeader.setVisibility(this.showLayoutHeader ? 0 : 8);
    }

    public final void setWorkStation(StationViewEntity stationViewEntity) {
        this.workStation = stationViewEntity;
        updateWorkStation(stationViewEntity);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserStationsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.showLayoutHeader = true;
        initView(context, attributeSet);
    }

    public /* synthetic */ UserStationsView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserStationsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.showLayoutHeader = true;
        initView(context, attributeSet);
    }

    private final void updateHomeStation(TypedArray values) {
        if (values != null) {
            String string = values.getString(R.styleable.UserStationsView_homeTitleText);
            ViewUserStationsBinding viewUserStationsBinding = null;
            if (string != null) {
                showOptions();
                ViewUserStationsBinding viewUserStationsBinding2 = this.binding;
                if (viewUserStationsBinding2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    viewUserStationsBinding2 = null;
                }
                viewUserStationsBinding2.userStationHome.getStationOptionTitle().setText(string);
            }
            int color = values.getColor(R.styleable.UserStationsView_homeTitleTextColor, getContext().getColor(R.color.white));
            ViewUserStationsBinding viewUserStationsBinding3 = this.binding;
            if (viewUserStationsBinding3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                viewUserStationsBinding3 = null;
            }
            viewUserStationsBinding3.userStationHome.getStationOptionTitle().setTextColor(color);
            int dimensionPixelSize = values.getDimensionPixelSize(R.styleable.UserStationsView_homeTitleTextSize, (int) getContext().getResources().getDimension(R.dimen.big_text_size));
            ViewUserStationsBinding viewUserStationsBinding4 = this.binding;
            if (viewUserStationsBinding4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                viewUserStationsBinding4 = null;
            }
            viewUserStationsBinding4.userStationHome.getStationOptionTitle().setTextSize(0, dimensionPixelSize);
            String string2 = values.getString(R.styleable.UserStationsView_homeSubtitleText);
            if (string2 != null) {
                ViewUserStationsBinding viewUserStationsBinding5 = this.binding;
                if (viewUserStationsBinding5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    viewUserStationsBinding5 = null;
                }
                viewUserStationsBinding5.userStationHome.getStationOptionSubtitle().setText(string2);
            }
            int color2 = values.getColor(R.styleable.UserStationsView_homeSubtitleTextColor, getContext().getColor(R.color.yellow));
            ViewUserStationsBinding viewUserStationsBinding6 = this.binding;
            if (viewUserStationsBinding6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                viewUserStationsBinding6 = null;
            }
            viewUserStationsBinding6.userStationHome.getStationOptionSubtitle().setTextColor(color2);
            int dimensionPixelSize2 = values.getDimensionPixelSize(R.styleable.UserStationsView_homeSubtitleTextSize, (int) getContext().getResources().getDimension(R.dimen.medium_text_size));
            ViewUserStationsBinding viewUserStationsBinding7 = this.binding;
            if (viewUserStationsBinding7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                viewUserStationsBinding = viewUserStationsBinding7;
            }
            viewUserStationsBinding.userStationHome.getStationOptionSubtitle().setTextSize(0, dimensionPixelSize2);
        }
    }

    private final void updateWorkStation(TypedArray values) {
        if (values != null) {
            String string = values.getString(R.styleable.UserStationsView_workTitleText);
            ViewUserStationsBinding viewUserStationsBinding = null;
            if (string != null) {
                showOptions();
                ViewUserStationsBinding viewUserStationsBinding2 = this.binding;
                if (viewUserStationsBinding2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    viewUserStationsBinding2 = null;
                }
                viewUserStationsBinding2.userStationWork.getStationOptionTitle().setText(string);
            }
            int color = values.getColor(R.styleable.UserStationsView_workTitleTextColor, getContext().getColor(R.color.white));
            ViewUserStationsBinding viewUserStationsBinding3 = this.binding;
            if (viewUserStationsBinding3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                viewUserStationsBinding3 = null;
            }
            viewUserStationsBinding3.userStationWork.getStationOptionTitle().setTextColor(color);
            int dimensionPixelSize = values.getDimensionPixelSize(R.styleable.UserStationsView_workTitleTextSize, (int) getContext().getResources().getDimension(R.dimen.big_text_size));
            ViewUserStationsBinding viewUserStationsBinding4 = this.binding;
            if (viewUserStationsBinding4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                viewUserStationsBinding4 = null;
            }
            viewUserStationsBinding4.userStationWork.getStationOptionTitle().setTextSize(0, dimensionPixelSize);
            String string2 = values.getString(R.styleable.UserStationsView_workSubtitleText);
            if (string2 != null) {
                ViewUserStationsBinding viewUserStationsBinding5 = this.binding;
                if (viewUserStationsBinding5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    viewUserStationsBinding5 = null;
                }
                viewUserStationsBinding5.userStationWork.getStationOptionSubtitle().setText(string2);
            }
            int color2 = values.getColor(R.styleable.UserStationsView_workSubtitleTextColor, getContext().getColor(R.color.yellow));
            ViewUserStationsBinding viewUserStationsBinding6 = this.binding;
            if (viewUserStationsBinding6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                viewUserStationsBinding6 = null;
            }
            viewUserStationsBinding6.userStationWork.getStationOptionSubtitle().setTextColor(color2);
            int dimensionPixelSize2 = values.getDimensionPixelSize(R.styleable.UserStationsView_workSubtitleTextSize, (int) getContext().getResources().getDimension(R.dimen.medium_text_size));
            ViewUserStationsBinding viewUserStationsBinding7 = this.binding;
            if (viewUserStationsBinding7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                viewUserStationsBinding = viewUserStationsBinding7;
            }
            viewUserStationsBinding.userStationWork.getStationOptionSubtitle().setTextSize(0, dimensionPixelSize2);
        }
    }
}
