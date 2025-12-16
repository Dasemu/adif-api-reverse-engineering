package com.adif.elcanomovil.uiSubscriptions.create.views;

import M1.a;
import android.app.TimePickerDialog;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import android.widget.TimePicker;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.adif.elcanomovil.enums.TypeSubscriptionCreationView;
import com.adif.elcanomovil.uiSubscriptions.R;
import com.adif.elcanomovil.uiSubscriptions.create.views.JourneyView;
import com.adif.elcanomovil.uiSubscriptions.create.views.data.InfoDataJourney;
import com.adif.elcanomovil.uiSubscriptions.databinding.ViewSubscriptionJourneyBinding;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\u001c\u001a\u00020\u0015H\u0002J\u001a\u0010\u001d\u001a\u00020\u00152\b\u0010\u001e\u001a\u0004\u0018\u00010\u00112\b\u0010\u001f\u001a\u0004\u0018\u00010\u001bJ\u001a\u0010 \u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0002J\u0010\u0010!\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020#H\u0002J \u0010$\u001a\u00020\u00152\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0013j\u0002`\u0016J \u0010%\u001a\u00020\u00152\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0013j\u0002`\u0019J \u0010&\u001a\u00020\u00152\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0013j\u0002`(R\u000e\u0010\f\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\u0012\u001a\u0016\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0013j\u0004\u0018\u0001`\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0013j\u0004\u0018\u0001`\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/adif/elcanomovil/uiSubscriptions/create/views/JourneyView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attr", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "attrs", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/adif/elcanomovil/uiSubscriptions/databinding/ViewSubscriptionJourneyBinding;", "df", "Ljava/text/SimpleDateFormat;", "infoData", "Lcom/adif/elcanomovil/uiSubscriptions/create/views/data/InfoDataJourney;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Function1;", "Lcom/adif/elcanomovil/uiSubscriptions/create/views/JourneyAction;", "", "Lcom/adif/elcanomovil/uiSubscriptions/create/views/OnJourneyActionListener;", "listenerTimeFrom", "Ljava/util/Date;", "Lcom/adif/elcanomovil/uiSubscriptions/create/views/OnJourneyTimeFromListener;", "modeView", "Lcom/adif/elcanomovil/enums/TypeSubscriptionCreationView;", "configureListeners", "configureView", "info", "typeOfMode", "initView", "paintDate", "date", "", "setOnJourneyActionListener", "setOnJourneyTimeFromListener", "setOnTypeSelectionListener", "", "Lcom/adif/elcanomovil/commonViews/OnTypeSelectionListener;", "ui-subscriptions_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nJourneyView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JourneyView.kt\ncom/adif/elcanomovil/uiSubscriptions/create/views/JourneyView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,148:1\n1#2:149\n*E\n"})
/* loaded from: classes3.dex */
public final class JourneyView extends ConstraintLayout {
    private ViewSubscriptionJourneyBinding binding;
    private final SimpleDateFormat df;
    private InfoDataJourney infoData;
    private Function1<? super JourneyAction, Unit> listener;
    private Function1<? super Date, Unit> listenerTimeFrom;
    private TypeSubscriptionCreationView modeView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JourneyView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.df = new SimpleDateFormat("HH:mm", Locale.FRANCE);
        initView(context, null);
    }

    private final void configureListeners() {
        ViewSubscriptionJourneyBinding viewSubscriptionJourneyBinding = this.binding;
        ViewSubscriptionJourneyBinding viewSubscriptionJourneyBinding2 = null;
        if (viewSubscriptionJourneyBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            viewSubscriptionJourneyBinding = null;
        }
        viewSubscriptionJourneyBinding.station.setOnClickListener(new a(this, 0));
        ViewSubscriptionJourneyBinding viewSubscriptionJourneyBinding3 = this.binding;
        if (viewSubscriptionJourneyBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            viewSubscriptionJourneyBinding2 = viewSubscriptionJourneyBinding3;
        }
        viewSubscriptionJourneyBinding2.stationTo.setOnClickListener(new a(this, 1));
    }

    public static final void configureListeners$lambda$7(JourneyView this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Function1<? super JourneyAction, Unit> function1 = this$0.listener;
        if (function1 != null) {
            function1.invoke(JourneyAction.SEARCH);
        }
    }

    public static final void configureListeners$lambda$8(JourneyView this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Function1<? super JourneyAction, Unit> function1 = this$0.listener;
        if (function1 != null) {
            function1.invoke(JourneyAction.SEARCH_TO);
        }
    }

    public static final void configureView$lambda$4(final JourneyView this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        final Calendar calendar = Calendar.getInstance();
        new TimePickerDialog(this$0.getContext(), new TimePickerDialog.OnTimeSetListener() { // from class: M1.b
            @Override // android.app.TimePickerDialog.OnTimeSetListener
            public final void onTimeSet(TimePicker timePicker, int i, int i4) {
                JourneyView.configureView$lambda$4$lambda$3(calendar, this$0, timePicker, i, i4);
            }
        }, calendar.get(11), calendar.get(12), true).show();
    }

    public static final void configureView$lambda$4$lambda$3(Calendar calendar, JourneyView this$0, TimePicker timePicker, int i, int i4) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        calendar.set(11, i);
        calendar.set(12, i4);
        String format = this$0.df.format(calendar.getTime());
        Intrinsics.checkNotNull(format);
        this$0.paintDate(format);
        Function1<? super Date, Unit> function1 = this$0.listenerTimeFrom;
        if (function1 != null) {
            Date time = calendar.getTime();
            Intrinsics.checkNotNullExpressionValue(time, "getTime(...)");
            function1.invoke(time);
        }
    }

    private final void initView(Context context, AttributeSet attrs) {
        View.inflate(context, R.layout.view_subscription_journey, this);
        ViewSubscriptionJourneyBinding bind = ViewSubscriptionJourneyBinding.bind(this);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        configureListeners();
    }

    private final void paintDate(String date) {
        ViewSubscriptionJourneyBinding viewSubscriptionJourneyBinding = this.binding;
        ViewSubscriptionJourneyBinding viewSubscriptionJourneyBinding2 = null;
        if (viewSubscriptionJourneyBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            viewSubscriptionJourneyBinding = null;
        }
        viewSubscriptionJourneyBinding.textViewDateFrom.setVisibility(0);
        ViewSubscriptionJourneyBinding viewSubscriptionJourneyBinding3 = this.binding;
        if (viewSubscriptionJourneyBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            viewSubscriptionJourneyBinding2 = viewSubscriptionJourneyBinding3;
        }
        viewSubscriptionJourneyBinding2.textViewDateFrom.setText(date);
    }

    public final void configureView(InfoDataJourney info, TypeSubscriptionCreationView typeOfMode) {
        String stationFrom;
        String stationTo;
        Boolean isCercanias;
        String timeFrom;
        this.infoData = info;
        this.modeView = typeOfMode;
        ViewSubscriptionJourneyBinding viewSubscriptionJourneyBinding = this.binding;
        ViewSubscriptionJourneyBinding viewSubscriptionJourneyBinding2 = null;
        if (viewSubscriptionJourneyBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            viewSubscriptionJourneyBinding = null;
        }
        TextView textView = viewSubscriptionJourneyBinding.station;
        InfoDataJourney infoDataJourney = this.infoData;
        if ((infoDataJourney != null ? infoDataJourney.getStationFrom() : null) == null) {
            ViewSubscriptionJourneyBinding viewSubscriptionJourneyBinding3 = this.binding;
            if (viewSubscriptionJourneyBinding3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                viewSubscriptionJourneyBinding3 = null;
            }
            viewSubscriptionJourneyBinding3.station.setTextColor(getContext().getColor(R.color.colorTextSecondaryGrey));
            Context context = getContext();
            if (context != null) {
                stationFrom = context.getString(R.string.select_station);
            }
            stationFrom = null;
        } else {
            ViewSubscriptionJourneyBinding viewSubscriptionJourneyBinding4 = this.binding;
            if (viewSubscriptionJourneyBinding4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                viewSubscriptionJourneyBinding4 = null;
            }
            viewSubscriptionJourneyBinding4.station.setTextColor(getContext().getColor(R.color.white));
            InfoDataJourney infoDataJourney2 = this.infoData;
            if (infoDataJourney2 != null) {
                stationFrom = infoDataJourney2.getStationFrom();
            }
            stationFrom = null;
        }
        textView.setText(stationFrom);
        ViewSubscriptionJourneyBinding viewSubscriptionJourneyBinding5 = this.binding;
        if (viewSubscriptionJourneyBinding5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            viewSubscriptionJourneyBinding5 = null;
        }
        TextView textView2 = viewSubscriptionJourneyBinding5.stationTo;
        InfoDataJourney infoDataJourney3 = this.infoData;
        if ((infoDataJourney3 != null ? infoDataJourney3.getStationTo() : null) == null) {
            ViewSubscriptionJourneyBinding viewSubscriptionJourneyBinding6 = this.binding;
            if (viewSubscriptionJourneyBinding6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                viewSubscriptionJourneyBinding6 = null;
            }
            viewSubscriptionJourneyBinding6.stationTo.setTextColor(getContext().getColor(R.color.colorTextSecondaryGrey));
            Context context2 = getContext();
            if (context2 != null) {
                stationTo = context2.getString(R.string.select_station);
            }
            stationTo = null;
        } else {
            ViewSubscriptionJourneyBinding viewSubscriptionJourneyBinding7 = this.binding;
            if (viewSubscriptionJourneyBinding7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                viewSubscriptionJourneyBinding7 = null;
            }
            viewSubscriptionJourneyBinding7.stationTo.setTextColor(getContext().getColor(R.color.white));
            InfoDataJourney infoDataJourney4 = this.infoData;
            if (infoDataJourney4 != null) {
                stationTo = infoDataJourney4.getStationTo();
            }
            stationTo = null;
        }
        textView2.setText(stationTo);
        InfoDataJourney infoDataJourney5 = this.infoData;
        if (infoDataJourney5 == null || (timeFrom = infoDataJourney5.getTimeFrom()) == null) {
            ViewSubscriptionJourneyBinding viewSubscriptionJourneyBinding8 = this.binding;
            if (viewSubscriptionJourneyBinding8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                viewSubscriptionJourneyBinding8 = null;
            }
            String obj = viewSubscriptionJourneyBinding8.textViewDateFrom.getText().toString();
            paintDate(obj);
            Date parse = this.df.parse(obj);
            if (parse != null) {
                Intrinsics.checkNotNull(parse);
                Function1<? super Date, Unit> function1 = this.listenerTimeFrom;
                if (function1 != null) {
                    function1.invoke(parse);
                }
            }
        } else {
            paintDate(timeFrom);
        }
        ViewSubscriptionJourneyBinding viewSubscriptionJourneyBinding9 = this.binding;
        if (viewSubscriptionJourneyBinding9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            viewSubscriptionJourneyBinding9 = null;
        }
        viewSubscriptionJourneyBinding9.textViewDateFrom.setOnClickListener(new a(this, 2));
        InfoDataJourney infoDataJourney6 = this.infoData;
        if (infoDataJourney6 == null || (isCercanias = infoDataJourney6.isCercanias()) == null) {
            return;
        }
        boolean booleanValue = isCercanias.booleanValue();
        ViewSubscriptionJourneyBinding viewSubscriptionJourneyBinding10 = this.binding;
        if (viewSubscriptionJourneyBinding10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            viewSubscriptionJourneyBinding2 = viewSubscriptionJourneyBinding10;
        }
        viewSubscriptionJourneyBinding2.trainSelector.update(booleanValue);
    }

    public final void setOnJourneyActionListener(Function1<? super JourneyAction, Unit> r12) {
        this.listener = r12;
    }

    public final void setOnJourneyTimeFromListener(Function1<? super Date, Unit> r12) {
        this.listenerTimeFrom = r12;
    }

    public final void setOnTypeSelectionListener(Function1<? super Boolean, Unit> r12) {
        ViewSubscriptionJourneyBinding viewSubscriptionJourneyBinding = this.binding;
        if (viewSubscriptionJourneyBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            viewSubscriptionJourneyBinding = null;
        }
        viewSubscriptionJourneyBinding.trainSelector.setOnTypeSelectionListener(r12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JourneyView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.df = new SimpleDateFormat("HH:mm", Locale.FRANCE);
        initView(context, attributeSet);
    }

    public /* synthetic */ JourneyView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JourneyView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.df = new SimpleDateFormat("HH:mm", Locale.FRANCE);
        initView(context, attributeSet);
    }
}
