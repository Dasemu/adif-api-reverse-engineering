package I2;

import android.view.MotionEvent;
import android.view.View;
import com.adif.elcanomovil.uiMoreAdif.wizard.WizardActivity;

/* loaded from: classes3.dex */
public final /* synthetic */ class i implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f819a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f820b;

    public /* synthetic */ i(Object obj, int i) {
        this.f819a = i;
        this.f820b = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i = this.f819a;
        Object obj = this.f820b;
        switch (i) {
            case 0:
                l lVar = (l) obj;
                lVar.getClass();
                if (motionEvent.getAction() == 1) {
                    long currentTimeMillis = System.currentTimeMillis() - lVar.f832o;
                    if (currentTimeMillis < 0 || currentTimeMillis > 300) {
                        lVar.f830m = false;
                    }
                    lVar.u();
                    lVar.f830m = true;
                    lVar.f832o = System.currentTimeMillis();
                }
                return false;
            default:
                return WizardActivity.h((WizardActivity) obj, view, motionEvent);
        }
    }
}
