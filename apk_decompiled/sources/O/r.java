package O;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public ViewParent f1287a;

    /* renamed from: b, reason: collision with root package name */
    public ViewParent f1288b;

    /* renamed from: c, reason: collision with root package name */
    public final ViewGroup f1289c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1290d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f1291e;

    public r(ViewGroup viewGroup) {
        this.f1289c = viewGroup;
    }

    public final boolean a(float f2, float f4, boolean z3) {
        ViewParent e4;
        if (this.f1290d && (e4 = e(0)) != null) {
            try {
                return g0.a(e4, this.f1289c, f2, f4, z3);
            } catch (AbstractMethodError e5) {
                Log.e("ViewParentCompat", "ViewParent " + e4 + " does not implement interface method onNestedFling", e5);
            }
        }
        return false;
    }

    public final boolean b(float f2, float f4) {
        ViewParent e4;
        if (this.f1290d && (e4 = e(0)) != null) {
            try {
                return g0.b(e4, this.f1289c, f2, f4);
            } catch (AbstractMethodError e5) {
                Log.e("ViewParentCompat", "ViewParent " + e4 + " does not implement interface method onNestedPreFling", e5);
            }
        }
        return false;
    }

    public final boolean c(int[] iArr, int[] iArr2, int i, int i4, int i5) {
        ViewParent e4;
        int i6;
        int i7;
        ViewGroup viewGroup;
        if (!this.f1290d || (e4 = e(i5)) == null) {
            return false;
        }
        if (i == 0 && i4 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        ViewGroup viewGroup2 = this.f1289c;
        if (iArr2 != null) {
            viewGroup2.getLocationInWindow(iArr2);
            i6 = iArr2[0];
            i7 = iArr2[1];
        } else {
            i6 = 0;
            i7 = 0;
        }
        if (iArr == null) {
            if (this.f1291e == null) {
                this.f1291e = new int[2];
            }
            iArr = this.f1291e;
        }
        int[] iArr3 = iArr;
        iArr3[0] = 0;
        iArr3[1] = 0;
        if (e4 instanceof InterfaceC0077s) {
            ((InterfaceC0077s) e4).c(viewGroup2, i, i4, iArr3, i5);
            viewGroup = viewGroup2;
        } else {
            viewGroup = viewGroup2;
            if (i5 == 0) {
                try {
                    g0.c(e4, viewGroup, i, i4, iArr3);
                } catch (AbstractMethodError e5) {
                    Log.e("ViewParentCompat", "ViewParent " + e4 + " does not implement interface method onNestedPreScroll", e5);
                }
            }
        }
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i6;
            iArr2[1] = iArr2[1] - i7;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    public final boolean d(int i, int i4, int i5, int i6, int[] iArr, int i7, int[] iArr2) {
        ViewParent e4;
        int i8;
        int i9;
        int[] iArr3;
        if (this.f1290d && (e4 = e(i7)) != null) {
            if (i != 0 || i4 != 0 || i5 != 0 || i6 != 0) {
                ViewGroup viewGroup = this.f1289c;
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    i8 = iArr[0];
                    i9 = iArr[1];
                } else {
                    i8 = 0;
                    i9 = 0;
                }
                if (iArr2 == null) {
                    if (this.f1291e == null) {
                        this.f1291e = new int[2];
                    }
                    int[] iArr4 = this.f1291e;
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    iArr3 = iArr4;
                } else {
                    iArr3 = iArr2;
                }
                if (e4 instanceof InterfaceC0078t) {
                    ((InterfaceC0078t) e4).d(viewGroup, i, i4, i5, i6, i7, iArr3);
                } else {
                    iArr3[0] = iArr3[0] + i5;
                    iArr3[1] = iArr3[1] + i6;
                    if (e4 instanceof InterfaceC0077s) {
                        ((InterfaceC0077s) e4).e(viewGroup, i, i4, i5, i6, i7);
                    } else if (i7 == 0) {
                        try {
                            g0.d(e4, viewGroup, i, i4, i5, i6);
                        } catch (AbstractMethodError e5) {
                            Log.e("ViewParentCompat", "ViewParent " + e4 + " does not implement interface method onNestedScroll", e5);
                        }
                    }
                }
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    iArr[0] = iArr[0] - i8;
                    iArr[1] = iArr[1] - i9;
                }
                return true;
            }
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                return false;
            }
        }
        return false;
    }

    public final ViewParent e(int i) {
        if (i == 0) {
            return this.f1287a;
        }
        if (i != 1) {
            return null;
        }
        return this.f1288b;
    }

    public final boolean f(int i) {
        return e(i) != null;
    }

    public final boolean g(int i, int i4) {
        boolean f2;
        if (!f(i4)) {
            if (this.f1290d) {
                ViewGroup viewGroup = this.f1289c;
                View view = viewGroup;
                for (ViewParent parent = viewGroup.getParent(); parent != null; parent = parent.getParent()) {
                    boolean z3 = parent instanceof InterfaceC0077s;
                    if (z3) {
                        f2 = ((InterfaceC0077s) parent).f(view, viewGroup, i, i4);
                    } else {
                        if (i4 == 0) {
                            try {
                                f2 = g0.f(parent, view, viewGroup, i);
                            } catch (AbstractMethodError e4) {
                                Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e4);
                            }
                        }
                        f2 = false;
                    }
                    if (f2) {
                        if (i4 == 0) {
                            this.f1287a = parent;
                        } else if (i4 == 1) {
                            this.f1288b = parent;
                        }
                        if (z3) {
                            ((InterfaceC0077s) parent).a(view, viewGroup, i, i4);
                        } else if (i4 == 0) {
                            try {
                                g0.e(parent, view, viewGroup, i);
                            } catch (AbstractMethodError e5) {
                                Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e5);
                            }
                        }
                    } else {
                        if (parent instanceof View) {
                            view = (View) parent;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final void h(int i) {
        ViewParent e4 = e(i);
        if (e4 != null) {
            boolean z3 = e4 instanceof InterfaceC0077s;
            ViewGroup viewGroup = this.f1289c;
            if (z3) {
                ((InterfaceC0077s) e4).b(viewGroup, i);
            } else if (i == 0) {
                try {
                    g0.g(e4, viewGroup);
                } catch (AbstractMethodError e5) {
                    Log.e("ViewParentCompat", "ViewParent " + e4 + " does not implement interface method onStopNestedScroll", e5);
                }
            }
            if (i == 0) {
                this.f1287a = null;
            } else {
                if (i != 1) {
                    return;
                }
                this.f1288b = null;
            }
        }
    }
}
