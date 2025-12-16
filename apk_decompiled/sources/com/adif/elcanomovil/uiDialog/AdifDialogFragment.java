package com.adif.elcanomovil.uiDialog;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0174y;
import androidx.fragment.app.K;
import b.r;
import com.adif.elcanomovil.commonNavGraph.arguments.AlertAction;
import com.adif.elcanomovil.commonNavGraph.arguments.AlertType;
import com.adif.elcanomovil.uiDialog.databinding.DialogAdifBinding;
import g.C0357d;
import g.C0361h;
import g.DialogInterfaceC0362i;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import o0.C0531h;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J#\u0010\u000b\u001a\u00020\u0004*\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000f\u001a\u00020\u0004*\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u000f\u001a\u00020\u0004*\u00020\u00112\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u0012J!\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0019\u0010\u0003J\u0019\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0016\u0010$\u001a\u00020#8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lcom/adif/elcanomovil/uiDialog/AdifDialogFragment;", "Landroidx/fragment/app/y;", "<init>", "()V", "", "configureView", "Lg/h;", "", "key", "Lcom/adif/elcanomovil/commonNavGraph/arguments/AlertAction;", "alertAction", "addButton", "(Lg/h;Ljava/lang/String;Lcom/adif/elcanomovil/commonNavGraph/arguments/AlertAction;)V", "Landroid/widget/TextView;", "newText", "setTextAndVisible", "(Landroid/widget/TextView;Ljava/lang/String;)V", "Landroid/widget/Button;", "(Landroid/widget/Button;Ljava/lang/String;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onPause", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "Lcom/adif/elcanomovil/uiDialog/AdifDialogFragmentArgs;", "args$delegate", "Lo0/h;", "getArgs", "()Lcom/adif/elcanomovil/uiDialog/AdifDialogFragmentArgs;", "args", "Lcom/adif/elcanomovil/uiDialog/databinding/DialogAdifBinding;", "binding", "Lcom/adif/elcanomovil/uiDialog/databinding/DialogAdifBinding;", "ui-dialog_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAdifDialogFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdifDialogFragment.kt\ncom/adif/elcanomovil/uiDialog/AdifDialogFragment\n+ 2 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,145:1\n42#2,3:146\n1#3:149\n1855#4,2:150\n*S KotlinDebug\n*F\n+ 1 AdifDialogFragment.kt\ncom/adif/elcanomovil/uiDialog/AdifDialogFragment\n*L\n23#1:146,3\n94#1:150,2\n*E\n"})
/* loaded from: classes2.dex */
public final class AdifDialogFragment extends DialogInterfaceOnCancelListenerC0174y {

    /* renamed from: args$delegate, reason: from kotlin metadata */
    private final C0531h args = new C0531h(Reflection.getOrCreateKotlinClass(AdifDialogFragmentArgs.class), new Function0<Bundle>() { // from class: com.adif.elcanomovil.uiDialog.AdifDialogFragment$special$$inlined$navArgs$1
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
    private DialogAdifBinding binding;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[AlertType.values().length];
            try {
                iArr[AlertType.INFO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AlertType.WARNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AlertType.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[AlertAction.Style.values().length];
            try {
                iArr2[AlertAction.Style.NEGATIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[AlertAction.Style.POSITIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[AlertAction.Style.NEUTRAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final /* synthetic */ AdifDialogFragmentArgs access$getArgs(AdifDialogFragment adifDialogFragment) {
        return adifDialogFragment.getArgs();
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [com.adif.elcanomovil.uiDialog.a] */
    /* JADX WARN: Type inference failed for: r3v7, types: [com.adif.elcanomovil.uiDialog.a] */
    private final void addButton(C0361h c0361h, String str, AlertAction alertAction) {
        final d dVar = new d(this, str, alertAction);
        int i = WhenMappings.$EnumSwitchMapping$1[alertAction.getStyle().ordinal()];
        if (i == 1) {
            String title = alertAction.getTitle();
            final int i4 = 0;
            ?? r32 = new DialogInterface.OnClickListener() { // from class: com.adif.elcanomovil.uiDialog.a
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i5) {
                    int i6 = i4;
                    d dVar2 = dVar;
                    switch (i6) {
                        case 0:
                            AdifDialogFragment.g(dVar2, dialogInterface, i5);
                            return;
                        case 1:
                            AdifDialogFragment.i(dVar2, dialogInterface, i5);
                            return;
                        default:
                            AdifDialogFragment.k(dVar2, dialogInterface, i5);
                            return;
                    }
                }
            };
            C0357d c0357d = c0361h.f6647a;
            c0357d.i = title;
            c0357d.f6608j = r32;
            return;
        }
        if (i == 2) {
            String title2 = alertAction.getTitle();
            final int i5 = 1;
            DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: com.adif.elcanomovil.uiDialog.a
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i52) {
                    int i6 = i5;
                    d dVar2 = dVar;
                    switch (i6) {
                        case 0:
                            AdifDialogFragment.g(dVar2, dialogInterface, i52);
                            return;
                        case 1:
                            AdifDialogFragment.i(dVar2, dialogInterface, i52);
                            return;
                        default:
                            AdifDialogFragment.k(dVar2, dialogInterface, i52);
                            return;
                    }
                }
            };
            C0357d c0357d2 = c0361h.f6647a;
            c0357d2.f6607g = title2;
            c0357d2.h = onClickListener;
            return;
        }
        if (i != 3) {
            return;
        }
        String title3 = alertAction.getTitle();
        final int i6 = 2;
        ?? r33 = new DialogInterface.OnClickListener() { // from class: com.adif.elcanomovil.uiDialog.a
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i52) {
                int i62 = i6;
                d dVar2 = dVar;
                switch (i62) {
                    case 0:
                        AdifDialogFragment.g(dVar2, dialogInterface, i52);
                        return;
                    case 1:
                        AdifDialogFragment.i(dVar2, dialogInterface, i52);
                        return;
                    default:
                        AdifDialogFragment.k(dVar2, dialogInterface, i52);
                        return;
                }
            }
        };
        C0357d c0357d3 = c0361h.f6647a;
        c0357d3.f6609k = title3;
        c0357d3.f6610l = r33;
    }

    public static final void addButton$lambda$10(Function2 tmp0, DialogInterface dialogInterface, int i) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(dialogInterface, Integer.valueOf(i));
    }

    public static final void addButton$lambda$8(Function2 tmp0, DialogInterface dialogInterface, int i) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(dialogInterface, Integer.valueOf(i));
    }

    public static final void addButton$lambda$9(Function2 tmp0, DialogInterface dialogInterface, int i) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(dialogInterface, Integer.valueOf(i));
    }

    private final void configureView() {
        DialogAdifBinding dialogAdifBinding = this.binding;
        if (dialogAdifBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            dialogAdifBinding = null;
        }
        TextView title = dialogAdifBinding.title;
        Intrinsics.checkNotNullExpressionValue(title, "title");
        setTextAndVisible(title, getArgs().getTitle());
        DialogAdifBinding dialogAdifBinding2 = this.binding;
        if (dialogAdifBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            dialogAdifBinding2 = null;
        }
        TextView message = dialogAdifBinding2.message;
        Intrinsics.checkNotNullExpressionValue(message, "message");
        setTextAndVisible(message, getArgs().getMessage());
        int i = WhenMappings.$EnumSwitchMapping$0[getArgs().getType().ordinal()];
        if (i == 1) {
            DialogAdifBinding dialogAdifBinding3 = this.binding;
            if (dialogAdifBinding3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                dialogAdifBinding3 = null;
            }
            ConstraintLayout root = dialogAdifBinding3.getRoot();
            DialogAdifBinding dialogAdifBinding4 = this.binding;
            if (dialogAdifBinding4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                dialogAdifBinding4 = null;
            }
            root.setBackgroundColor(dialogAdifBinding4.getRoot().getContext().getColor(R.color.white));
        } else if (i == 2) {
            DialogAdifBinding dialogAdifBinding5 = this.binding;
            if (dialogAdifBinding5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                dialogAdifBinding5 = null;
            }
            ConstraintLayout root2 = dialogAdifBinding5.getRoot();
            DialogAdifBinding dialogAdifBinding6 = this.binding;
            if (dialogAdifBinding6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                dialogAdifBinding6 = null;
            }
            root2.setBackgroundColor(dialogAdifBinding6.getRoot().getContext().getColor(R.color.yellow));
            DialogAdifBinding dialogAdifBinding7 = this.binding;
            if (dialogAdifBinding7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                dialogAdifBinding7 = null;
            }
            dialogAdifBinding7.header.setVisibility(0);
        } else if (i == 3) {
            DialogAdifBinding dialogAdifBinding8 = this.binding;
            if (dialogAdifBinding8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                dialogAdifBinding8 = null;
            }
            dialogAdifBinding8.header.setText(getString(R.string.dialog_header_error));
            DialogAdifBinding dialogAdifBinding9 = this.binding;
            if (dialogAdifBinding9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                dialogAdifBinding9 = null;
            }
            ConstraintLayout root3 = dialogAdifBinding9.getRoot();
            DialogAdifBinding dialogAdifBinding10 = this.binding;
            if (dialogAdifBinding10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                dialogAdifBinding10 = null;
            }
            root3.setBackgroundColor(dialogAdifBinding10.getRoot().getContext().getColor(R.color.yellow));
            DialogAdifBinding dialogAdifBinding11 = this.binding;
            if (dialogAdifBinding11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                dialogAdifBinding11 = null;
            }
            dialogAdifBinding11.header.setVisibility(0);
        }
        Iterator<AlertAction> it = getArgs().getActions().iterator();
        while (it.hasNext()) {
            AlertAction next = it.next();
            final e eVar = new e(this, next);
            int i4 = WhenMappings.$EnumSwitchMapping$1[next.getStyle().ordinal()];
            if (i4 == 1) {
                DialogAdifBinding dialogAdifBinding12 = this.binding;
                if (dialogAdifBinding12 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    dialogAdifBinding12 = null;
                }
                AppCompatButton negative = dialogAdifBinding12.negative;
                Intrinsics.checkNotNullExpressionValue(negative, "negative");
                setTextAndVisible((Button) negative, next.getTitle());
                DialogAdifBinding dialogAdifBinding13 = this.binding;
                if (dialogAdifBinding13 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    dialogAdifBinding13 = null;
                }
                final int i5 = 0;
                dialogAdifBinding13.negative.setOnClickListener(new View.OnClickListener() { // from class: com.adif.elcanomovil.uiDialog.b
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i6 = i5;
                        e eVar2 = eVar;
                        switch (i6) {
                            case 0:
                                AdifDialogFragment.configureView$lambda$7$lambda$4(eVar2, view);
                                return;
                            case 1:
                                AdifDialogFragment.configureView$lambda$7$lambda$5(eVar2, view);
                                return;
                            default:
                                AdifDialogFragment.configureView$lambda$7$lambda$6(eVar2, view);
                                return;
                        }
                    }
                });
            } else if (i4 == 2) {
                DialogAdifBinding dialogAdifBinding14 = this.binding;
                if (dialogAdifBinding14 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    dialogAdifBinding14 = null;
                }
                AppCompatButton positive = dialogAdifBinding14.positive;
                Intrinsics.checkNotNullExpressionValue(positive, "positive");
                setTextAndVisible((Button) positive, next.getTitle());
                DialogAdifBinding dialogAdifBinding15 = this.binding;
                if (dialogAdifBinding15 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    dialogAdifBinding15 = null;
                }
                final int i6 = 1;
                dialogAdifBinding15.positive.setOnClickListener(new View.OnClickListener() { // from class: com.adif.elcanomovil.uiDialog.b
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i62 = i6;
                        e eVar2 = eVar;
                        switch (i62) {
                            case 0:
                                AdifDialogFragment.configureView$lambda$7$lambda$4(eVar2, view);
                                return;
                            case 1:
                                AdifDialogFragment.configureView$lambda$7$lambda$5(eVar2, view);
                                return;
                            default:
                                AdifDialogFragment.configureView$lambda$7$lambda$6(eVar2, view);
                                return;
                        }
                    }
                });
            } else if (i4 == 3) {
                DialogAdifBinding dialogAdifBinding16 = this.binding;
                if (dialogAdifBinding16 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    dialogAdifBinding16 = null;
                }
                AppCompatButton neutral = dialogAdifBinding16.neutral;
                Intrinsics.checkNotNullExpressionValue(neutral, "neutral");
                setTextAndVisible((Button) neutral, next.getTitle());
                DialogAdifBinding dialogAdifBinding17 = this.binding;
                if (dialogAdifBinding17 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    dialogAdifBinding17 = null;
                }
                final int i7 = 2;
                dialogAdifBinding17.neutral.setOnClickListener(new View.OnClickListener() { // from class: com.adif.elcanomovil.uiDialog.b
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i62 = i7;
                        e eVar2 = eVar;
                        switch (i62) {
                            case 0:
                                AdifDialogFragment.configureView$lambda$7$lambda$4(eVar2, view);
                                return;
                            case 1:
                                AdifDialogFragment.configureView$lambda$7$lambda$5(eVar2, view);
                                return;
                            default:
                                AdifDialogFragment.configureView$lambda$7$lambda$6(eVar2, view);
                                return;
                        }
                    }
                });
            }
        }
    }

    public static final void configureView$lambda$7$lambda$4(Function0 buttonAction, View view) {
        Intrinsics.checkNotNullParameter(buttonAction, "$buttonAction");
        buttonAction.invoke();
    }

    public static final void configureView$lambda$7$lambda$5(Function0 buttonAction, View view) {
        Intrinsics.checkNotNullParameter(buttonAction, "$buttonAction");
        buttonAction.invoke();
    }

    public static final void configureView$lambda$7$lambda$6(Function0 buttonAction, View view) {
        Intrinsics.checkNotNullParameter(buttonAction, "$buttonAction");
        buttonAction.invoke();
    }

    public static /* synthetic */ void g(d dVar, DialogInterface dialogInterface, int i) {
        addButton$lambda$8(dVar, dialogInterface, i);
    }

    public final AdifDialogFragmentArgs getArgs() {
        return (AdifDialogFragmentArgs) this.args.getValue();
    }

    public static /* synthetic */ void i(d dVar, DialogInterface dialogInterface, int i) {
        addButton$lambda$9(dVar, dialogInterface, i);
    }

    public static /* synthetic */ void k(d dVar, DialogInterface dialogInterface, int i) {
        addButton$lambda$10(dVar, dialogInterface, i);
    }

    public static final boolean onCreateDialog$lambda$3(AdifDialogFragment this$0, DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (i == 4 && keyEvent.getAction() == 1) {
            return this$0.getArgs().getBlockOnback();
        }
        return false;
    }

    private final void setTextAndVisible(TextView textView, String str) {
        if (str == null) {
            return;
        }
        textView.setText(str);
        textView.setVisibility(0);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0174y
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        C0361h c0361h = new C0361h(requireContext());
        C0357d c0357d = c0361h.f6647a;
        DialogAdifBinding inflate = DialogAdifBinding.inflate(LayoutInflater.from(c0357d.f6601a));
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.binding = inflate;
        if (inflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            inflate = null;
        }
        c0357d.f6614q = inflate.getRoot();
        DialogInterfaceC0362i a2 = c0361h.a();
        a2.setCancelable(getArgs().isCancelable());
        a2.setCanceledOnTouchOutside(getArgs().isCancelable());
        configureView();
        Intrinsics.checkNotNullExpressionValue(a2, "also(...)");
        a2.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: com.adif.elcanomovil.uiDialog.c
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                boolean onCreateDialog$lambda$3;
                onCreateDialog$lambda$3 = AdifDialogFragment.onCreateDialog$lambda$3(AdifDialogFragment.this, dialogInterface, i, keyEvent);
                return onCreateDialog$lambda$3;
            }
        });
        return a2;
    }

    @Override // androidx.fragment.app.K
    public void onPause() {
        super.onPause();
        dismiss();
    }

    @Override // androidx.fragment.app.K
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        requireActivity().getOnBackPressedDispatcher().a(this, new r() { // from class: com.adif.elcanomovil.uiDialog.AdifDialogFragment$onViewCreated$1
            {
                super(true);
            }

            @Override // b.r
            public void handleOnBackPressed() {
                AdifDialogFragmentArgs args;
                args = AdifDialogFragment.this.getArgs();
                if (args.getBlockOnback()) {
                    return;
                }
                AdifDialogFragment.this.requireActivity().onBackPressed();
            }
        });
    }

    private final void setTextAndVisible(Button button, String str) {
        if (str == null) {
            return;
        }
        button.setText(str);
        button.setVisibility(0);
    }
}
