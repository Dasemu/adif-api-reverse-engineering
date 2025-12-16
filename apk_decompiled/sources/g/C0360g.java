package g;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import com.adif.elcanomovil.R;
import f.AbstractC0336a;
import java.lang.ref.WeakReference;

/* renamed from: g.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0360g {

    /* renamed from: A, reason: collision with root package name */
    public final int f6618A;

    /* renamed from: B, reason: collision with root package name */
    public final int f6619B;

    /* renamed from: C, reason: collision with root package name */
    public final int f6620C;

    /* renamed from: D, reason: collision with root package name */
    public final boolean f6621D;

    /* renamed from: E, reason: collision with root package name */
    public final HandlerC0358e f6622E;

    /* renamed from: a, reason: collision with root package name */
    public final Context f6624a;

    /* renamed from: b, reason: collision with root package name */
    public final DialogInterfaceC0362i f6625b;

    /* renamed from: c, reason: collision with root package name */
    public final Window f6626c;

    /* renamed from: d, reason: collision with root package name */
    public CharSequence f6627d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f6628e;

    /* renamed from: f, reason: collision with root package name */
    public AlertController$RecycleListView f6629f;

    /* renamed from: g, reason: collision with root package name */
    public ConstraintLayout f6630g;
    public Button i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f6631j;

    /* renamed from: k, reason: collision with root package name */
    public Message f6632k;

    /* renamed from: l, reason: collision with root package name */
    public Button f6633l;

    /* renamed from: m, reason: collision with root package name */
    public CharSequence f6634m;

    /* renamed from: n, reason: collision with root package name */
    public Message f6635n;

    /* renamed from: o, reason: collision with root package name */
    public Button f6636o;
    public CharSequence p;

    /* renamed from: q, reason: collision with root package name */
    public Message f6637q;

    /* renamed from: r, reason: collision with root package name */
    public NestedScrollView f6638r;

    /* renamed from: s, reason: collision with root package name */
    public Drawable f6639s;

    /* renamed from: t, reason: collision with root package name */
    public ImageView f6640t;

    /* renamed from: u, reason: collision with root package name */
    public TextView f6641u;

    /* renamed from: v, reason: collision with root package name */
    public TextView f6642v;

    /* renamed from: w, reason: collision with root package name */
    public View f6643w;

    /* renamed from: x, reason: collision with root package name */
    public ListAdapter f6644x;

    /* renamed from: z, reason: collision with root package name */
    public final int f6646z;
    public boolean h = false;

    /* renamed from: y, reason: collision with root package name */
    public int f6645y = -1;

    /* renamed from: F, reason: collision with root package name */
    public final com.google.android.material.datepicker.j f6623F = new com.google.android.material.datepicker.j(this, 1);

    /* JADX WARN: Type inference failed for: r6v1, types: [android.os.Handler, g.e] */
    public C0360g(Context context, DialogInterfaceC0362i dialogInterfaceC0362i, Window window) {
        this.f6624a = context;
        this.f6625b = dialogInterfaceC0362i;
        this.f6626c = window;
        ?? handler = new Handler();
        handler.f6617a = new WeakReference(dialogInterfaceC0362i);
        this.f6622E = handler;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC0336a.f6426e, R.attr.alertDialogStyle, 0);
        this.f6646z = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.f6618A = obtainStyledAttributes.getResourceId(4, 0);
        obtainStyledAttributes.getResourceId(5, 0);
        this.f6619B = obtainStyledAttributes.getResourceId(7, 0);
        this.f6620C = obtainStyledAttributes.getResourceId(3, 0);
        this.f6621D = obtainStyledAttributes.getBoolean(6, true);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        dialogInterfaceC0362i.c().h(1);
    }

    public static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public static ViewGroup b(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    public final void c(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        Message obtainMessage = onClickListener != null ? this.f6622E.obtainMessage(i, onClickListener) : null;
        if (i == -3) {
            this.p = charSequence;
            this.f6637q = obtainMessage;
        } else if (i == -2) {
            this.f6634m = charSequence;
            this.f6635n = obtainMessage;
        } else {
            if (i != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f6631j = charSequence;
            this.f6632k = obtainMessage;
        }
    }
}
