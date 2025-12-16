package g;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: g.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0361h {

    /* renamed from: a, reason: collision with root package name */
    public final C0357d f6647a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6648b;

    public C0361h(Context context) {
        int f2 = DialogInterfaceC0362i.f(context, 0);
        this.f6647a = new C0357d(new ContextThemeWrapper(context, DialogInterfaceC0362i.f(context, f2)));
        this.f6648b = f2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.widget.ListAdapter] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    public final DialogInterfaceC0362i a() {
        C0357d c0357d = this.f6647a;
        DialogInterfaceC0362i dialogInterfaceC0362i = new DialogInterfaceC0362i(c0357d.f6601a, this.f6648b);
        View view = c0357d.f6605e;
        C0360g c0360g = dialogInterfaceC0362i.f6649f;
        if (view != null) {
            c0360g.f6643w = view;
        } else {
            CharSequence charSequence = c0357d.f6604d;
            if (charSequence != null) {
                c0360g.f6627d = charSequence;
                TextView textView = c0360g.f6641u;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = c0357d.f6603c;
            if (drawable != null) {
                c0360g.f6639s = drawable;
                ImageView imageView = c0360g.f6640t;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    c0360g.f6640t.setImageDrawable(drawable);
                }
            }
        }
        CharSequence charSequence2 = c0357d.f6606f;
        if (charSequence2 != null) {
            c0360g.f6628e = charSequence2;
            TextView textView2 = c0360g.f6642v;
            if (textView2 != null) {
                textView2.setText(charSequence2);
            }
        }
        CharSequence charSequence3 = c0357d.f6607g;
        if (charSequence3 != null) {
            c0360g.c(-1, charSequence3, c0357d.h);
        }
        String str = c0357d.i;
        if (str != null) {
            c0360g.c(-2, str, c0357d.f6608j);
        }
        String str2 = c0357d.f6609k;
        if (str2 != null) {
            c0360g.c(-3, str2, c0357d.f6610l);
        }
        if (c0357d.f6613o != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) c0357d.f6602b.inflate(c0360g.f6618A, (ViewGroup) null);
            int i = c0357d.f6615r ? c0360g.f6619B : c0360g.f6620C;
            Object obj = c0357d.f6613o;
            ?? r7 = obj;
            if (obj == null) {
                r7 = new ArrayAdapter(c0357d.f6601a, i, R.id.text1, (Object[]) null);
            }
            c0360g.f6644x = r7;
            c0360g.f6645y = c0357d.f6616s;
            if (c0357d.p != null) {
                alertController$RecycleListView.setOnItemClickListener(new C0356c(c0357d, c0360g));
            }
            if (c0357d.f6615r) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            c0360g.f6629f = alertController$RecycleListView;
        }
        ConstraintLayout constraintLayout = c0357d.f6614q;
        if (constraintLayout != null) {
            c0360g.f6630g = constraintLayout;
            c0360g.h = false;
        }
        dialogInterfaceC0362i.setCancelable(true);
        dialogInterfaceC0362i.setCanceledOnTouchOutside(true);
        dialogInterfaceC0362i.setOnCancelListener(null);
        dialogInterfaceC0362i.setOnDismissListener(c0357d.f6611m);
        l.n nVar = c0357d.f6612n;
        if (nVar != null) {
            dialogInterfaceC0362i.setOnKeyListener(nVar);
        }
        return dialogInterfaceC0362i;
    }
}
