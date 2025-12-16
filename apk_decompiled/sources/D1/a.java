package D1;

import I2.C0053d;
import I2.l;
import I2.y;
import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import android.widget.PopupMenu;
import com.adif.elcanomovil.commonViews.DayView;
import com.adif.elcanomovil.commonViews.StationOptionView;
import com.adif.elcanomovil.commonViews.UserStationsView;
import com.adif.elcanomovil.commonViews.extensions.ViewKt;
import com.adif.elcanomovil.uiAvisa.components.details.IssueDetailsFragment;
import com.adif.elcanomovil.uiAvisa.databinding.PopupFullscreenPictureBinding;
import com.adif.elcanomovil.uiAvisa.utils.ui.FullScreenPicturePopupWindow;
import com.adif.elcanomovil.uiAvisa.utils.ui.PictureGridView;
import com.adif.elcanomovil.uiHome.HomeFragment;
import com.adif.elcanomovil.uiMoreAdif.wizard.WizardActivity;
import com.adif.elcanomovil.uiSelectStation.main.SelectStationFragment;
import com.adif.elcanomovil.uiSelectTrain.main.SelectTrainFragment;
import com.adif.elcanomovil.uiStations.main.StationsFragment;
import com.adif.elcanomovil.uiSubscriptions.create.SubscriptionCreationFragment;
import com.adif.elcanomovil.uiSubscriptions.create.views.TrainView;
import com.adif.elcanomovil.widget.configuration.ConfigureWidgetFragment;
import com.google.android.material.datepicker.m;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f370a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f371b;

    public /* synthetic */ a(Object obj, int i) {
        this.f370a = i;
        this.f371b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f370a) {
            case 0:
                FullScreenPicturePopupWindow.a((FullScreenPicturePopupWindow) this.f371b, view);
                return;
            case 1:
                FullScreenPicturePopupWindow.b((PopupFullscreenPictureBinding) this.f371b, view);
                return;
            case 2:
                PictureGridView.a((PictureGridView) this.f371b, view);
                return;
            case 3:
                C0053d c0053d = (C0053d) this.f371b;
                EditText editText = c0053d.i;
                if (editText == null) {
                    return;
                }
                Editable text = editText.getText();
                if (text != null) {
                    text.clear();
                }
                c0053d.q();
                return;
            case 4:
                ((l) this.f371b).u();
                return;
            case 5:
                y yVar = (y) this.f371b;
                EditText editText2 = yVar.f909f;
                if (editText2 == null) {
                    return;
                }
                int selectionEnd = editText2.getSelectionEnd();
                EditText editText3 = yVar.f909f;
                if (editText3 == null || !(editText3.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                    yVar.f909f.setTransformationMethod(PasswordTransformationMethod.getInstance());
                } else {
                    yVar.f909f.setTransformationMethod(null);
                }
                if (selectionEnd >= 0) {
                    yVar.f909f.setSelection(selectionEnd);
                }
                yVar.q();
                return;
            case 6:
                TrainView.i((TrainView) this.f371b, view);
                return;
            case 7:
                DayView.i((DayView) this.f371b, view);
                return;
            case 8:
                StationOptionView.i((StationOptionView) this.f371b, view);
                return;
            case 9:
                UserStationsView.i((PopupMenu) this.f371b, view);
                return;
            case 10:
                ViewKt.a((Function1) this.f371b, view);
                return;
            case 11:
                IssueDetailsFragment.g((IssueDetailsFragment) this.f371b, view);
                return;
            case 12:
                HomeFragment.f((HomeFragment) this.f371b, view);
                return;
            case 13:
                ((WizardActivity) this.f371b).lambda$onCreate$0(view);
                return;
            case 14:
                SelectStationFragment.f((SelectStationFragment) this.f371b, view);
                return;
            case 15:
                SelectTrainFragment.f((SelectTrainFragment) this.f371b, view);
                return;
            case 16:
                StationsFragment.f((StationsFragment) this.f371b, view);
                return;
            case 17:
                SubscriptionCreationFragment.bindViewModel$lambda$19((SubscriptionCreationFragment) this.f371b, view);
                return;
            case 18:
                ConfigureWidgetFragment.f((ConfigureWidgetFragment) this.f371b, view);
                return;
            default:
                ((m) this.f371b).g();
                throw null;
        }
    }
}
