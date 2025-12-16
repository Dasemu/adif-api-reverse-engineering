package com.adif.elcanomovil.uiDialog;

import C.w;
import G2.l;
import I0.h;
import I0.p;
import S0.i;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.util.Patterns;
import android.view.LayoutInflater;
import android.view.View;
import android.webkit.URLUtil;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0174y;
import androidx.fragment.app.K;
import com.adif.elcanomovil.commonNavGraph.navigation.IntentAction;
import com.adif.elcanomovil.commonNavGraph.navigation.Navigation;
import com.adif.elcanomovil.commonNavGraph.navigation.NavigationHandler;
import com.adif.elcanomovil.uiDialog.adapters.SingleLogoAdapter;
import com.adif.elcanomovil.uiDialog.databinding.DialogStationsBinding;
import com.adif.elcanomovil.uiStations.mappers.RequestedStationInfoMapperKt;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import o0.C0531h;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u001d\u0010\t\u001a\u00020\u0004*\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ%\u0010\t\u001a\u00020\u0004*\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\t\u0010\rJ\u001d\u0010\t\u001a\u00020\u0004*\u00020\u000e2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\t\u0010\u000fJ\u0019\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/adif/elcanomovil/uiDialog/StationsDialogFragment;", "Landroidx/fragment/app/y;", "<init>", "()V", "", "configureView", "Landroid/widget/TextView;", "", "newText", "setTextAndVisible", "(Landroid/widget/TextView;Ljava/lang/String;)V", "Landroid/widget/LinearLayout;", "linearLayout", "(Landroid/widget/TextView;Ljava/lang/String;Landroid/widget/LinearLayout;)V", "Landroid/widget/Button;", "(Landroid/widget/Button;Ljava/lang/String;)V", "Landroid/os/Bundle;", "savedInstanceState", "Lo2/e;", "onCreateDialog", "(Landroid/os/Bundle;)Lo2/e;", "Lcom/adif/elcanomovil/uiDialog/StationsDialogFragmentArgs;", "args$delegate", "Lo0/h;", "getArgs", "()Lcom/adif/elcanomovil/uiDialog/StationsDialogFragmentArgs;", "args", "Lcom/adif/elcanomovil/uiDialog/databinding/DialogStationsBinding;", "binding", "Lcom/adif/elcanomovil/uiDialog/databinding/DialogStationsBinding;", "ui-dialog_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nStationsDialogFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StationsDialogFragment.kt\ncom/adif/elcanomovil/uiDialog/StationsDialogFragment\n+ 2 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Extensions.kt\ncoil/-SingletonExtensions\n*L\n1#1,194:1\n42#2,3:195\n1#3:198\n54#4,3:199\n24#4:202\n59#4,6:203\n*S KotlinDebug\n*F\n+ 1 StationsDialogFragment.kt\ncom/adif/elcanomovil/uiDialog/StationsDialogFragment\n*L\n26#1:195,3\n38#1:199,3\n38#1:202\n38#1:203,6\n*E\n"})
/* loaded from: classes2.dex */
public final class StationsDialogFragment extends DialogInterfaceOnCancelListenerC0174y {

    /* renamed from: args$delegate, reason: from kotlin metadata */
    private final C0531h args = new C0531h(Reflection.getOrCreateKotlinClass(StationsDialogFragmentArgs.class), new Function0<Bundle>() { // from class: com.adif.elcanomovil.uiDialog.StationsDialogFragment$special$$inlined$navArgs$1
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Bundle invoke() {
            Bundle arguments = K.this.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + K.this + " has null arguments");
        }
    });
    private DialogStationsBinding binding;

    private final void configureView() {
        List split$default;
        DialogStationsBinding dialogStationsBinding = this.binding;
        DialogStationsBinding dialogStationsBinding2 = null;
        if (dialogStationsBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            dialogStationsBinding = null;
        }
        ImageView logo = dialogStationsBinding.logo;
        Intrinsics.checkNotNullExpressionValue(logo, "logo");
        String logo2 = getArgs().getLogo();
        h a2 = I0.a.a(logo.getContext());
        i iVar = new i(logo.getContext());
        iVar.f1464c = logo2;
        iVar.c(logo);
        ((p) a2).b(iVar.a());
        DialogStationsBinding dialogStationsBinding3 = this.binding;
        if (dialogStationsBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            dialogStationsBinding3 = null;
        }
        TextView name = dialogStationsBinding3.name;
        Intrinsics.checkNotNullExpressionValue(name, "name");
        setTextAndVisible(name, getArgs().getName());
        DialogStationsBinding dialogStationsBinding4 = this.binding;
        if (dialogStationsBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            dialogStationsBinding4 = null;
        }
        TextView description = dialogStationsBinding4.description;
        Intrinsics.checkNotNullExpressionValue(description, "description");
        setTextAndVisible(description, getArgs().getDescription());
        String[] paymentWay = getArgs().getPaymentWay();
        if (paymentWay != null && ArraysKt.contains(paymentWay, "APPLE_PAY")) {
            DialogStationsBinding dialogStationsBinding5 = this.binding;
            if (dialogStationsBinding5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                dialogStationsBinding5 = null;
            }
            dialogStationsBinding5.paymentWayApplePay.setVisibility(0);
        }
        if (paymentWay != null && ArraysKt.contains(paymentWay, "BIZUM")) {
            DialogStationsBinding dialogStationsBinding6 = this.binding;
            if (dialogStationsBinding6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                dialogStationsBinding6 = null;
            }
            dialogStationsBinding6.paymentWayBizum.setVisibility(0);
        }
        if (paymentWay != null && ArraysKt.contains(paymentWay, "CASH")) {
            DialogStationsBinding dialogStationsBinding7 = this.binding;
            if (dialogStationsBinding7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                dialogStationsBinding7 = null;
            }
            dialogStationsBinding7.paymentWayCash.setVisibility(0);
        }
        if (paymentWay != null && ArraysKt.contains(paymentWay, "CREDIT_CARD")) {
            DialogStationsBinding dialogStationsBinding8 = this.binding;
            if (dialogStationsBinding8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                dialogStationsBinding8 = null;
            }
            dialogStationsBinding8.paymentWayCreditCard.setVisibility(0);
        }
        if (paymentWay != null && ArraysKt.contains(paymentWay, "FOOD_VOUCHER")) {
            DialogStationsBinding dialogStationsBinding9 = this.binding;
            if (dialogStationsBinding9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                dialogStationsBinding9 = null;
            }
            dialogStationsBinding9.paymentWayFoodVoucher.setVisibility(0);
        }
        if (paymentWay != null && ArraysKt.contains(paymentWay, "GOOGLE_PAY")) {
            DialogStationsBinding dialogStationsBinding10 = this.binding;
            if (dialogStationsBinding10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                dialogStationsBinding10 = null;
            }
            dialogStationsBinding10.paymentWayGooglePay.setVisibility(0);
        }
        if (paymentWay != null && ArraysKt.contains(paymentWay, RequestedStationInfoMapperKt.OTHERS)) {
            DialogStationsBinding dialogStationsBinding11 = this.binding;
            if (dialogStationsBinding11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                dialogStationsBinding11 = null;
            }
            dialogStationsBinding11.paymentWayOthers.setVisibility(0);
        }
        if (paymentWay != null && ArraysKt.contains(paymentWay, "PAY_PAL")) {
            DialogStationsBinding dialogStationsBinding12 = this.binding;
            if (dialogStationsBinding12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                dialogStationsBinding12 = null;
            }
            dialogStationsBinding12.paymentWayPayPal.setVisibility(0);
        }
        if (paymentWay != null && ArraysKt.contains(paymentWay, "SAMSUNG_PAY")) {
            DialogStationsBinding dialogStationsBinding13 = this.binding;
            if (dialogStationsBinding13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                dialogStationsBinding13 = null;
            }
            dialogStationsBinding13.paymentWaySamsungPay.setVisibility(0);
        }
        SingleLogoAdapter singleLogoAdapter = new SingleLogoAdapter();
        DialogStationsBinding dialogStationsBinding14 = this.binding;
        if (dialogStationsBinding14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            dialogStationsBinding14 = null;
        }
        dialogStationsBinding14.rv.setAdapter(singleLogoAdapter);
        String[] correspondences = getArgs().getCorrespondences();
        singleLogoAdapter.update(correspondences != null ? ArraysKt.toList(correspondences) : null);
        String web = getArgs().getWeb();
        if (web != null) {
            DialogStationsBinding dialogStationsBinding15 = this.binding;
            if (dialogStationsBinding15 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                dialogStationsBinding15 = null;
            }
            LinearLayout linearLayout = dialogStationsBinding15.webLayout;
            linearLayout.setVisibility(0);
            linearLayout.setOnClickListener(new f(web, this));
        }
        String location = getArgs().getLocation();
        if (location != null) {
            DialogStationsBinding dialogStationsBinding16 = this.binding;
            if (dialogStationsBinding16 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                dialogStationsBinding16 = null;
            }
            LinearLayout linearLayout2 = dialogStationsBinding16.locationLayout;
            linearLayout2.setVisibility(0);
            split$default = StringsKt__StringsKt.split$default(location, new String[]{","}, false, 0, 6, (Object) null);
            linearLayout2.setOnClickListener(new l(5, split$default, this));
        }
        String phone = getArgs().getPhone();
        if (phone != null) {
            if (phone.length() > 0) {
                DialogStationsBinding dialogStationsBinding17 = this.binding;
                if (dialogStationsBinding17 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    dialogStationsBinding17 = null;
                }
                LinearLayout linearLayout3 = dialogStationsBinding17.telephoneLayout;
                linearLayout3.setVisibility(0);
                linearLayout3.setOnClickListener(new f(this, phone));
                Intrinsics.checkNotNull(linearLayout3);
            } else {
                DialogStationsBinding dialogStationsBinding18 = this.binding;
                if (dialogStationsBinding18 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    dialogStationsBinding18 = null;
                }
                dialogStationsBinding18.telephoneLayout.setVisibility(8);
            }
        }
        String openingHours = getArgs().getOpeningHours();
        if (openingHours != null && openingHours.length() != 0) {
            DialogStationsBinding dialogStationsBinding19 = this.binding;
            if (dialogStationsBinding19 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                dialogStationsBinding19 = null;
            }
            TextView openingHours2 = dialogStationsBinding19.openingHours;
            Intrinsics.checkNotNullExpressionValue(openingHours2, "openingHours");
            String openingHours3 = getArgs().getOpeningHours();
            DialogStationsBinding dialogStationsBinding20 = this.binding;
            if (dialogStationsBinding20 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                dialogStationsBinding20 = null;
            }
            LinearLayout openingHoursLayout = dialogStationsBinding20.openingHoursLayout;
            Intrinsics.checkNotNullExpressionValue(openingHoursLayout, "openingHoursLayout");
            setTextAndVisible(openingHours2, openingHours3, openingHoursLayout);
        }
        if (getArgs().getAccessible()) {
            DialogStationsBinding dialogStationsBinding21 = this.binding;
            if (dialogStationsBinding21 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                dialogStationsBinding21 = null;
            }
            TextView accessibility = dialogStationsBinding21.accessibility;
            Intrinsics.checkNotNullExpressionValue(accessibility, "accessibility");
            String accessibleLabel = getArgs().getAccessibleLabel();
            String string = (accessibleLabel == null || accessibleLabel.length() == 0) ? getString(R.string.station_accessibility_label) : getArgs().getAccessibleLabel();
            DialogStationsBinding dialogStationsBinding22 = this.binding;
            if (dialogStationsBinding22 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                dialogStationsBinding22 = null;
            }
            LinearLayout accessibilityLayout = dialogStationsBinding22.accessibilityLayout;
            Intrinsics.checkNotNullExpressionValue(accessibilityLayout, "accessibilityLayout");
            setTextAndVisible(accessibility, string, accessibilityLayout);
        }
        if (getArgs().getOffer() != null) {
            DialogStationsBinding dialogStationsBinding23 = this.binding;
            if (dialogStationsBinding23 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                dialogStationsBinding23 = null;
            }
            dialogStationsBinding23.offerDescription.setText(getArgs().getOffer());
            DialogStationsBinding dialogStationsBinding24 = this.binding;
            if (dialogStationsBinding24 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                dialogStationsBinding24 = null;
            }
            dialogStationsBinding24.offerLayout.setVisibility(0);
            DialogStationsBinding dialogStationsBinding25 = this.binding;
            if (dialogStationsBinding25 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                dialogStationsBinding25 = null;
            }
            dialogStationsBinding25.offerDescription.setMovementMethod(ScrollingMovementMethod.getInstance());
        }
        String playStore = getArgs().getPlayStore();
        if (playStore != null && playStore.length() != 0 && URLUtil.isValidUrl(getArgs().getPlayStore()) && Patterns.WEB_URL.matcher(getArgs().getPlayStore()).matches()) {
            DialogStationsBinding dialogStationsBinding26 = this.binding;
            if (dialogStationsBinding26 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                dialogStationsBinding26 = null;
            }
            dialogStationsBinding26.playSore.setVisibility(0);
            DialogStationsBinding dialogStationsBinding27 = this.binding;
            if (dialogStationsBinding27 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                dialogStationsBinding27 = null;
            }
            final int i = 0;
            dialogStationsBinding27.playSore.setOnClickListener(new View.OnClickListener(this) { // from class: com.adif.elcanomovil.uiDialog.g

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ StationsDialogFragment f5053b;

                {
                    this.f5053b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i4 = i;
                    StationsDialogFragment stationsDialogFragment = this.f5053b;
                    switch (i4) {
                        case 0:
                            StationsDialogFragment.configureView$lambda$15(stationsDialogFragment, view);
                            return;
                        default:
                            StationsDialogFragment.configureView$lambda$16(stationsDialogFragment, view);
                            return;
                    }
                }
            });
        }
        DialogStationsBinding dialogStationsBinding28 = this.binding;
        if (dialogStationsBinding28 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            dialogStationsBinding2 = dialogStationsBinding28;
        }
        ImageButton imageButton = dialogStationsBinding2.close;
        final int i4 = 1;
        imageButton.setOnClickListener(new View.OnClickListener(this) { // from class: com.adif.elcanomovil.uiDialog.g

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StationsDialogFragment f5053b;

            {
                this.f5053b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i42 = i4;
                StationsDialogFragment stationsDialogFragment = this.f5053b;
                switch (i42) {
                    case 0:
                        StationsDialogFragment.configureView$lambda$15(stationsDialogFragment, view);
                        return;
                    default:
                        StationsDialogFragment.configureView$lambda$16(stationsDialogFragment, view);
                        return;
                }
            }
        });
    }

    public static final void configureView$lambda$12$lambda$11$lambda$10(StationsDialogFragment this$0, String phoneNumber, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(phoneNumber, "$phoneNumber");
        Intent intent = new Intent("android.intent.action.DIAL");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format("%s:%s", Arrays.copyOf(new Object[]{"tel", phoneNumber}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        intent.setData(Uri.parse(format));
        this$0.startActivity(intent);
    }

    public static final void configureView$lambda$15(StationsDialogFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(this$0.getArgs().getPlayStore()));
        intent.setPackage("com.android.vending");
        try {
            this$0.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    public static final void configureView$lambda$16(StationsDialogFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dismiss();
    }

    public static final void configureView$lambda$5$lambda$4$lambda$3(String it, StationsDialogFragment this$0, View view) {
        boolean contains$default;
        Intrinsics.checkNotNullParameter(it, "$it");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        contains$default = StringsKt__StringsKt.contains$default(it, (CharSequence) "http", false, 2, (Object) null);
        if (!contains$default) {
            it = w.z("https://", it);
        }
        Uri parse = Uri.parse(it);
        Intrinsics.checkNotNullExpressionValue(parse, "parse(...)");
        new NavigationHandler(this$0).invoke2((Navigation) new Navigation.Intent(new IntentAction.View(parse)));
    }

    public static final void configureView$lambda$8$lambda$7$lambda$6(List coords, StationsDialogFragment this$0, View view) {
        String replace$default;
        String replace$default2;
        Intrinsics.checkNotNullParameter(coords, "$coords");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        StringBuilder sb = new StringBuilder("geo:");
        String format = new DecimalFormat("#.####").format(Double.parseDouble((String) coords.get(0)));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        replace$default = StringsKt__StringsJVMKt.replace$default(format, ",", ".", false, 4, (Object) null);
        sb.append(replace$default);
        sb.append(", ");
        String format2 = new DecimalFormat("#.####").format(Double.parseDouble((String) coords.get(1)));
        Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
        replace$default2 = StringsKt__StringsJVMKt.replace$default(format2, ",", ".", false, 4, (Object) null);
        sb.append(replace$default2);
        this$0.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(sb.toString())));
    }

    private final StationsDialogFragmentArgs getArgs() {
        return (StationsDialogFragmentArgs) this.args.getValue();
    }

    private final void setTextAndVisible(TextView textView, String str) {
        if (str == null) {
            return;
        }
        textView.setText(str);
        textView.setVisibility(0);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0174y
    public o2.e onCreateDialog(Bundle savedInstanceState) {
        o2.e eVar = new o2.e(requireContext());
        DialogStationsBinding inflate = DialogStationsBinding.inflate(LayoutInflater.from(eVar.getContext()));
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.binding = inflate;
        if (inflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            inflate = null;
        }
        eVar.setContentView(inflate.getRoot());
        configureView();
        return eVar;
    }

    private final void setTextAndVisible(TextView textView, String str, LinearLayout linearLayout) {
        if (str == null) {
            return;
        }
        textView.setText(str);
        textView.setVisibility(0);
        linearLayout.setVisibility(0);
    }

    private final void setTextAndVisible(Button button, String str) {
        if (str == null) {
            return;
        }
        button.setText(str);
        button.setVisibility(0);
    }
}
