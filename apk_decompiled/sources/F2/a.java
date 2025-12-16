package F2;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.firebase.messaging.ServiceStarter;
import m3.l;

/* loaded from: classes3.dex */
public final class a extends l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f538a;

    /* renamed from: b, reason: collision with root package name */
    public final SideSheetBehavior f539b;

    public /* synthetic */ a(SideSheetBehavior sideSheetBehavior, int i) {
        this.f538a = i;
        this.f539b = sideSheetBehavior;
    }

    @Override // m3.l
    public final int A(CoordinatorLayout coordinatorLayout) {
        switch (this.f538a) {
            case 0:
                return coordinatorLayout.getLeft();
            default:
                return coordinatorLayout.getRight();
        }
    }

    @Override // m3.l
    public final int B() {
        switch (this.f538a) {
            case 0:
                return 1;
            default:
                return 0;
        }
    }

    @Override // m3.l
    public final boolean G(float f2) {
        switch (this.f538a) {
            case 0:
                return f2 > BitmapDescriptorFactory.HUE_RED;
            default:
                return f2 < BitmapDescriptorFactory.HUE_RED;
        }
    }

    @Override // m3.l
    public final boolean H(View view) {
        switch (this.f538a) {
            case 0:
                return view.getRight() < (t() - v()) / 2;
            default:
                return view.getLeft() > (t() + this.f539b.f5744m) / 2;
        }
    }

    @Override // m3.l
    public final boolean I(float f2, float f4) {
        switch (this.f538a) {
            case 0:
                if (Math.abs(f2) > Math.abs(f4)) {
                    float abs = Math.abs(f2);
                    this.f539b.getClass();
                    if (abs > ServiceStarter.ERROR_UNKNOWN) {
                        return true;
                    }
                }
                return false;
            default:
                if (Math.abs(f2) > Math.abs(f4)) {
                    float abs2 = Math.abs(f2);
                    this.f539b.getClass();
                    if (abs2 > ServiceStarter.ERROR_UNKNOWN) {
                        return true;
                    }
                }
                return false;
        }
    }

    @Override // m3.l
    public final boolean Y(View view, float f2) {
        switch (this.f538a) {
            case 0:
                float left = view.getLeft();
                SideSheetBehavior sideSheetBehavior = this.f539b;
                float abs = Math.abs((f2 * sideSheetBehavior.f5742k) + left);
                sideSheetBehavior.getClass();
                return abs > 0.5f;
            default:
                float right = view.getRight();
                SideSheetBehavior sideSheetBehavior2 = this.f539b;
                float abs2 = Math.abs((f2 * sideSheetBehavior2.f5742k) + right);
                sideSheetBehavior2.getClass();
                return abs2 > 0.5f;
        }
    }

    @Override // m3.l
    public final void c0(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        switch (this.f538a) {
            case 0:
                marginLayoutParams.leftMargin = i;
                return;
            default:
                marginLayoutParams.rightMargin = i;
                return;
        }
    }

    @Override // m3.l
    public final void d0(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i4) {
        switch (this.f538a) {
            case 0:
                if (i <= this.f539b.f5744m) {
                    marginLayoutParams.leftMargin = i4;
                    return;
                }
                return;
            default:
                int i5 = this.f539b.f5744m;
                if (i <= i5) {
                    marginLayoutParams.rightMargin = i5 - i;
                    return;
                }
                return;
        }
    }

    @Override // m3.l
    public final int e(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.f538a) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    @Override // m3.l
    public final float f(int i) {
        switch (this.f538a) {
            case 0:
                float v3 = v();
                return (i - v3) / (t() - v3);
            default:
                float f2 = this.f539b.f5744m;
                return (f2 - i) / (f2 - t());
        }
    }

    @Override // m3.l
    public final int s(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.f538a) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    @Override // m3.l
    public final int t() {
        switch (this.f538a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f539b;
                return Math.max(0, sideSheetBehavior.f5745n + sideSheetBehavior.f5746o);
            default:
                SideSheetBehavior sideSheetBehavior2 = this.f539b;
                return Math.max(0, (sideSheetBehavior2.f5744m - sideSheetBehavior2.f5743l) - sideSheetBehavior2.f5746o);
        }
    }

    @Override // m3.l
    public final int v() {
        switch (this.f538a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f539b;
                return (-sideSheetBehavior.f5743l) - sideSheetBehavior.f5746o;
            default:
                return this.f539b.f5744m;
        }
    }

    @Override // m3.l
    public final int x() {
        switch (this.f538a) {
            case 0:
                return this.f539b.f5746o;
            default:
                return this.f539b.f5744m;
        }
    }

    @Override // m3.l
    public final int y() {
        switch (this.f538a) {
            case 0:
                return -this.f539b.f5743l;
            default:
                return t();
        }
    }

    @Override // m3.l
    public final int z(View view) {
        switch (this.f538a) {
            case 0:
                return view.getRight() + this.f539b.f5746o;
            default:
                return view.getLeft() - this.f539b.f5746o;
        }
    }
}
