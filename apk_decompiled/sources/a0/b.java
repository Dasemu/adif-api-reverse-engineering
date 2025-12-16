package a0;

import android.content.Context;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.fragment.app.AbstractC0158l0;
import androidx.fragment.app.C0167q;
import androidx.fragment.app.E0;
import androidx.fragment.app.RunnableC0141d;
import com.adif.elcanomovil.uiSelectStation.main.TextChangesKt$textChanges$1$listener$1;
import com.adif.elcanomovil.uiSelectStation.main.TextFlowKt$textFlow$1$invokeSuspend$$inlined$doAfterTextChanged$1;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o0.C0537n;
import o0.C0540q;

/* loaded from: classes.dex */
public final class b extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2320a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2321b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2322c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i, Object obj, Object obj2) {
        super(0);
        this.f2320a = i;
        this.f2321b = obj;
        this.f2322c = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f2320a) {
            case 0:
                Context applicationContext = (Context) this.f2321b;
                Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
                String name = ((c) this.f2322c).f2323a;
                Intrinsics.checkNotNullParameter(applicationContext, "<this>");
                Intrinsics.checkNotNullParameter(name, "name");
                String fileName = Intrinsics.stringPlus(name, ".preferences_pb");
                Intrinsics.checkNotNullParameter(applicationContext, "<this>");
                Intrinsics.checkNotNullParameter(fileName, "fileName");
                return new File(applicationContext.getApplicationContext().getFilesDir(), Intrinsics.stringPlus("datastore/", fileName));
            case 1:
                if (AbstractC0158l0.M(2)) {
                    Log.v("FragmentManager", "Animating to start");
                }
                C0167q c0167q = (C0167q) this.f2321b;
                E0 e02 = c0167q.f3211f;
                Object obj = c0167q.f3219q;
                Intrinsics.checkNotNull(obj);
                e02.d(obj, new RunnableC0141d(1, c0167q, (ViewGroup) this.f2322c));
                return Unit.INSTANCE;
            case 2:
                ((EditText) this.f2321b).removeTextChangedListener((TextChangesKt$textChanges$1$listener$1) this.f2322c);
                return Unit.INSTANCE;
            case 3:
                ((EditText) this.f2321b).removeTextChangedListener((TextFlowKt$textFlow$1$invokeSuspend$$inlined$doAfterTextChanged$1) this.f2322c);
                return Unit.INSTANCE;
            default:
                ((C0540q) this.f2321b).d((C0537n) this.f2322c);
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(C0540q c0540q, C0537n c0537n, boolean z3) {
        super(0);
        this.f2320a = 4;
        this.f2321b = c0540q;
        this.f2322c = c0537n;
    }
}
