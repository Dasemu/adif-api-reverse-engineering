package G2;

import O.X;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.ValueAnimator;
import android.os.Handler;
import android.os.Message;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.snackbar.BaseTransientBottomBar$Behavior;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public final class d implements Handler.Callback {
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        int i = 1;
        int i4 = 0;
        int i5 = message.what;
        if (i5 == 0) {
            k kVar = (k) message.obj;
            j jVar = kVar.i;
            if (jVar.getParent() == null) {
                ViewGroup.LayoutParams layoutParams = jVar.getLayoutParams();
                if (layoutParams instanceof A.e) {
                    A.e eVar = (A.e) layoutParams;
                    BaseTransientBottomBar$Behavior baseTransientBottomBar$Behavior = new BaseTransientBottomBar$Behavior();
                    A.a aVar = baseTransientBottomBar$Behavior.i;
                    aVar.getClass();
                    aVar.f7b = kVar.f619u;
                    baseTransientBottomBar$Behavior.f5531b = new f(kVar);
                    A.b bVar = eVar.f9a;
                    if (bVar != baseTransientBottomBar$Behavior) {
                        if (bVar != null) {
                            bVar.i();
                        }
                        eVar.f9a = baseTransientBottomBar$Behavior;
                        eVar.f10b = true;
                    }
                    eVar.f15g = 80;
                }
                jVar.f595k = true;
                kVar.f608g.addView(jVar);
                jVar.f595k = false;
                kVar.e();
                jVar.setVisibility(4);
            }
            WeakHashMap weakHashMap = X.f1226a;
            if (jVar.isLaidOut()) {
                kVar.d();
                return true;
            }
            kVar.f616r = true;
            return true;
        }
        if (i5 != 1) {
            return false;
        }
        k kVar2 = (k) message.obj;
        int i6 = message.arg1;
        AccessibilityManager accessibilityManager = kVar2.f618t;
        if (accessibilityManager == null || ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) != null && enabledAccessibilityServiceList.isEmpty())) {
            j jVar2 = kVar2.i;
            if (jVar2.getVisibility() == 0) {
                if (jVar2.getAnimationMode() == 1) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, BitmapDescriptorFactory.HUE_RED);
                    ofFloat.setInterpolator(kVar2.f605d);
                    ofFloat.addUpdateListener(new b(kVar2, 0, (byte) 0));
                    ofFloat.setDuration(kVar2.f603b);
                    ofFloat.addListener(new a(kVar2, i6, i4));
                    ofFloat.start();
                    return true;
                }
                ValueAnimator valueAnimator = new ValueAnimator();
                int height = jVar2.getHeight();
                ViewGroup.LayoutParams layoutParams2 = jVar2.getLayoutParams();
                if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                    height += ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                }
                valueAnimator.setIntValues(0, height);
                valueAnimator.setInterpolator(kVar2.f606e);
                valueAnimator.setDuration(kVar2.f604c);
                valueAnimator.addListener(new a(kVar2, i6, i));
                valueAnimator.addUpdateListener(new b(kVar2, 3, (byte) 0));
                valueAnimator.start();
                return true;
            }
        }
        kVar2.b(i6);
        return true;
    }
}
