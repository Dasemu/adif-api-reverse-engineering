package androidx.fragment.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.adif.elcanomovil.R;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.fragment.app.y */
/* loaded from: classes.dex */
public class DialogInterfaceOnCancelListenerC0174y extends K implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    private static final String SAVED_BACK_STACK_ID = "android:backStackId";
    private static final String SAVED_CANCELABLE = "android:cancelable";
    private static final String SAVED_DIALOG_STATE_TAG = "android:savedDialogState";
    private static final String SAVED_INTERNAL_DIALOG_SHOWING = "android:dialogShowing";
    private static final String SAVED_SHOWS_DIALOG = "android:showsDialog";
    private static final String SAVED_STYLE = "android:style";
    private static final String SAVED_THEME = "android:theme";
    public static final int STYLE_NORMAL = 0;
    public static final int STYLE_NO_FRAME = 2;
    public static final int STYLE_NO_INPUT = 3;
    public static final int STYLE_NO_TITLE = 1;
    private boolean mCreatingDialog;
    private Dialog mDialog;
    private boolean mDismissed;
    private Handler mHandler;
    private boolean mShownByMe;
    private boolean mViewDestroyed;
    private Runnable mDismissRunnable = new RunnableC0169t(this, 0);
    private DialogInterface.OnCancelListener mOnCancelListener = new DialogInterfaceOnCancelListenerC0170u(this);
    private DialogInterface.OnDismissListener mOnDismissListener = new DialogInterfaceOnDismissListenerC0171v(this);
    private int mStyle = 0;
    private int mTheme = 0;
    private boolean mCancelable = true;
    private boolean mShowsDialog = true;
    private int mBackStackId = -1;
    private androidx.lifecycle.Y mObserver = new C0172w(this);
    private boolean mDialogCreated = false;

    @Override // androidx.fragment.app.K
    public T createFragmentContainer() {
        return new C0173x(this, super.createFragmentContainer());
    }

    public void dismiss() {
        f(false, false, false);
    }

    public void dismissAllowingStateLoss() {
        f(true, false, false);
    }

    public void dismissNow() {
        f(false, false, true);
    }

    public final void f(boolean z3, boolean z4, boolean z5) {
        if (this.mDismissed) {
            return;
        }
        this.mDismissed = true;
        this.mShownByMe = false;
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.mDialog.dismiss();
            if (!z4) {
                if (Looper.myLooper() == this.mHandler.getLooper()) {
                    onDismiss(this.mDialog);
                } else {
                    this.mHandler.post(this.mDismissRunnable);
                }
            }
        }
        this.mViewDestroyed = true;
        if (this.mBackStackId >= 0) {
            if (z5) {
                AbstractC0158l0 parentFragmentManager = getParentFragmentManager();
                int i = this.mBackStackId;
                if (i < 0) {
                    parentFragmentManager.getClass();
                    throw new IllegalArgumentException(com.google.android.gms.measurement.internal.a.l(i, "Bad id: "));
                }
                parentFragmentManager.U(i, 1);
            } else {
                AbstractC0158l0 parentFragmentManager2 = getParentFragmentManager();
                int i4 = this.mBackStackId;
                parentFragmentManager2.getClass();
                if (i4 < 0) {
                    throw new IllegalArgumentException(com.google.android.gms.measurement.internal.a.l(i4, "Bad id: "));
                }
                parentFragmentManager2.y(new C0152i0(parentFragmentManager2, null, i4), z3);
            }
            this.mBackStackId = -1;
            return;
        }
        AbstractC0158l0 parentFragmentManager3 = getParentFragmentManager();
        parentFragmentManager3.getClass();
        C0135a c0135a = new C0135a(parentFragmentManager3);
        c0135a.p = true;
        c0135a.g(this);
        if (z5) {
            if (c0135a.f3263g) {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
            c0135a.h = false;
            c0135a.f3084q.B(c0135a, false);
            return;
        }
        if (z3) {
            c0135a.e(true);
        } else {
            c0135a.e(false);
        }
    }

    public Dialog getDialog() {
        return this.mDialog;
    }

    public boolean getShowsDialog() {
        return this.mShowsDialog;
    }

    public int getTheme() {
        return this.mTheme;
    }

    public boolean isCancelable() {
        return this.mCancelable;
    }

    @Override // androidx.fragment.app.K
    @Deprecated
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    @Override // androidx.fragment.app.K
    public void onAttach(Context context) {
        super.onAttach(context);
        getViewLifecycleOwnerLiveData().f(this.mObserver);
        if (this.mShownByMe) {
            return;
        }
        this.mDismissed = false;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // androidx.fragment.app.K
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mHandler = new Handler();
        this.mShowsDialog = this.mContainerId == 0;
        if (bundle != null) {
            this.mStyle = bundle.getInt(SAVED_STYLE, 0);
            this.mTheme = bundle.getInt(SAVED_THEME, 0);
            this.mCancelable = bundle.getBoolean(SAVED_CANCELABLE, true);
            this.mShowsDialog = bundle.getBoolean(SAVED_SHOWS_DIALOG, this.mShowsDialog);
            this.mBackStackId = bundle.getInt(SAVED_BACK_STACK_ID, -1);
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        if (AbstractC0158l0.M(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new b.p(requireContext(), getTheme());
    }

    @Override // androidx.fragment.app.K
    public void onDestroyView() {
        super.onDestroyView();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            this.mViewDestroyed = true;
            dialog.setOnDismissListener(null);
            this.mDialog.dismiss();
            if (!this.mDismissed) {
                onDismiss(this.mDialog);
            }
            this.mDialog = null;
            this.mDialogCreated = false;
        }
    }

    @Override // androidx.fragment.app.K
    public void onDetach() {
        super.onDetach();
        if (!this.mShownByMe && !this.mDismissed) {
            this.mDismissed = true;
        }
        getViewLifecycleOwnerLiveData().i(this.mObserver);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.mViewDestroyed) {
            return;
        }
        if (AbstractC0158l0.M(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        f(true, true, false);
    }

    public View onFindViewById(int i) {
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    @Override // androidx.fragment.app.K
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        boolean z3 = this.mShowsDialog;
        if (z3 && !this.mCreatingDialog) {
            if (z3 && !this.mDialogCreated) {
                try {
                    this.mCreatingDialog = true;
                    Dialog onCreateDialog = onCreateDialog(bundle);
                    this.mDialog = onCreateDialog;
                    if (this.mShowsDialog) {
                        setupDialog(onCreateDialog, this.mStyle);
                        Context context = getContext();
                        if (context instanceof Activity) {
                            this.mDialog.setOwnerActivity((Activity) context);
                        }
                        this.mDialog.setCancelable(this.mCancelable);
                        this.mDialog.setOnCancelListener(this.mOnCancelListener);
                        this.mDialog.setOnDismissListener(this.mOnDismissListener);
                        this.mDialogCreated = true;
                    } else {
                        this.mDialog = null;
                    }
                    this.mCreatingDialog = false;
                } catch (Throwable th) {
                    this.mCreatingDialog = false;
                    throw th;
                }
            }
            if (AbstractC0158l0.M(2)) {
                Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.mDialog;
            if (dialog != null) {
                return onGetLayoutInflater.cloneInContext(dialog.getContext());
            }
        } else if (AbstractC0158l0.M(2)) {
            String str = "getting layout inflater for DialogFragment " + this;
            if (!this.mShowsDialog) {
                Log.d("FragmentManager", "mShowsDialog = false: " + str);
                return onGetLayoutInflater;
            }
            Log.d("FragmentManager", "mCreatingDialog = true: " + str);
        }
        return onGetLayoutInflater;
    }

    public boolean onHasView() {
        return this.mDialogCreated;
    }

    @Override // androidx.fragment.app.K
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean(SAVED_INTERNAL_DIALOG_SHOWING, false);
            bundle.putBundle(SAVED_DIALOG_STATE_TAG, onSaveInstanceState);
        }
        int i = this.mStyle;
        if (i != 0) {
            bundle.putInt(SAVED_STYLE, i);
        }
        int i4 = this.mTheme;
        if (i4 != 0) {
            bundle.putInt(SAVED_THEME, i4);
        }
        boolean z3 = this.mCancelable;
        if (!z3) {
            bundle.putBoolean(SAVED_CANCELABLE, z3);
        }
        boolean z4 = this.mShowsDialog;
        if (!z4) {
            bundle.putBoolean(SAVED_SHOWS_DIALOG, z4);
        }
        int i5 = this.mBackStackId;
        if (i5 != -1) {
            bundle.putInt(SAVED_BACK_STACK_ID, i5);
        }
    }

    @Override // androidx.fragment.app.K
    public void onStart() {
        super.onStart();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            this.mViewDestroyed = false;
            dialog.show();
            View decorView = this.mDialog.getWindow().getDecorView();
            androidx.lifecycle.q0.m(decorView, this);
            Intrinsics.checkNotNullParameter(decorView, "<this>");
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            m3.d.D(decorView, this);
        }
    }

    @Override // androidx.fragment.app.K
    public void onStop() {
        super.onStop();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.K
    public void onViewStateRestored(Bundle bundle) {
        Bundle bundle2;
        super.onViewStateRestored(bundle);
        if (this.mDialog == null || bundle == null || (bundle2 = bundle.getBundle(SAVED_DIALOG_STATE_TAG)) == null) {
            return;
        }
        this.mDialog.onRestoreInstanceState(bundle2);
    }

    @Override // androidx.fragment.app.K
    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.performCreateView(layoutInflater, viewGroup, bundle);
        if (this.mView != null || this.mDialog == null || bundle == null || (bundle2 = bundle.getBundle(SAVED_DIALOG_STATE_TAG)) == null) {
            return;
        }
        this.mDialog.onRestoreInstanceState(bundle2);
    }

    public final b.p requireComponentDialog() {
        Dialog requireDialog = requireDialog();
        if (requireDialog instanceof b.p) {
            return (b.p) requireDialog;
        }
        throw new IllegalStateException("DialogFragment " + this + " did not return a ComponentDialog instance from requireDialog(). The actual Dialog is " + requireDialog);
    }

    public final Dialog requireDialog() {
        Dialog dialog = getDialog();
        if (dialog != null) {
            return dialog;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    public void setCancelable(boolean z3) {
        this.mCancelable = z3;
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.setCancelable(z3);
        }
    }

    public void setShowsDialog(boolean z3) {
        this.mShowsDialog = z3;
    }

    public void setStyle(int i, int i4) {
        if (AbstractC0158l0.M(2)) {
            Log.d("FragmentManager", "Setting style and theme for DialogFragment " + this + " to " + i + ", " + i4);
        }
        this.mStyle = i;
        if (i == 2 || i == 3) {
            this.mTheme = android.R.style.Theme.Panel;
        }
        if (i4 != 0) {
            this.mTheme = i4;
        }
    }

    public void setupDialog(Dialog dialog, int i) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    public void show(AbstractC0158l0 abstractC0158l0, String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        abstractC0158l0.getClass();
        C0135a c0135a = new C0135a(abstractC0158l0);
        c0135a.p = true;
        c0135a.c(0, this, str, 1);
        c0135a.e(false);
    }

    public void showNow(AbstractC0158l0 abstractC0158l0, String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        abstractC0158l0.getClass();
        C0135a c0135a = new C0135a(abstractC0158l0);
        c0135a.p = true;
        c0135a.c(0, this, str, 1);
        if (c0135a.f3263g) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        c0135a.h = false;
        c0135a.f3084q.B(c0135a, false);
    }

    public int show(w0 w0Var, String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        w0Var.c(0, this, str, 1);
        this.mViewDestroyed = false;
        int e4 = ((C0135a) w0Var).e(false);
        this.mBackStackId = e4;
        return e4;
    }
}
