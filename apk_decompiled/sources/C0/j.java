package C0;

import android.graphics.Matrix;
import android.graphics.Paint;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class j extends k {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f296a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f297b;

    /* renamed from: c, reason: collision with root package name */
    public float f298c;

    /* renamed from: d, reason: collision with root package name */
    public float f299d;

    /* renamed from: e, reason: collision with root package name */
    public float f300e;

    /* renamed from: f, reason: collision with root package name */
    public float f301f;

    /* renamed from: g, reason: collision with root package name */
    public float f302g;
    public float h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public final Matrix f303j;

    /* renamed from: k, reason: collision with root package name */
    public String f304k;

    public j() {
        this.f296a = new Matrix();
        this.f297b = new ArrayList();
        this.f298c = BitmapDescriptorFactory.HUE_RED;
        this.f299d = BitmapDescriptorFactory.HUE_RED;
        this.f300e = BitmapDescriptorFactory.HUE_RED;
        this.f301f = 1.0f;
        this.f302g = 1.0f;
        this.h = BitmapDescriptorFactory.HUE_RED;
        this.i = BitmapDescriptorFactory.HUE_RED;
        this.f303j = new Matrix();
        this.f304k = null;
    }

    @Override // C0.k
    public final boolean a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f297b;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((k) arrayList.get(i)).a()) {
                return true;
            }
            i++;
        }
    }

    @Override // C0.k
    public final boolean b(int[] iArr) {
        int i = 0;
        boolean z3 = false;
        while (true) {
            ArrayList arrayList = this.f297b;
            if (i >= arrayList.size()) {
                return z3;
            }
            z3 |= ((k) arrayList.get(i)).b(iArr);
            i++;
        }
    }

    public final void c() {
        Matrix matrix = this.f303j;
        matrix.reset();
        matrix.postTranslate(-this.f299d, -this.f300e);
        matrix.postScale(this.f301f, this.f302g);
        matrix.postRotate(this.f298c, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        matrix.postTranslate(this.h + this.f299d, this.i + this.f300e);
    }

    public String getGroupName() {
        return this.f304k;
    }

    public Matrix getLocalMatrix() {
        return this.f303j;
    }

    public float getPivotX() {
        return this.f299d;
    }

    public float getPivotY() {
        return this.f300e;
    }

    public float getRotation() {
        return this.f298c;
    }

    public float getScaleX() {
        return this.f301f;
    }

    public float getScaleY() {
        return this.f302g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.i;
    }

    public void setPivotX(float f2) {
        if (f2 != this.f299d) {
            this.f299d = f2;
            c();
        }
    }

    public void setPivotY(float f2) {
        if (f2 != this.f300e) {
            this.f300e = f2;
            c();
        }
    }

    public void setRotation(float f2) {
        if (f2 != this.f298c) {
            this.f298c = f2;
            c();
        }
    }

    public void setScaleX(float f2) {
        if (f2 != this.f301f) {
            this.f301f = f2;
            c();
        }
    }

    public void setScaleY(float f2) {
        if (f2 != this.f302g) {
            this.f302g = f2;
            c();
        }
    }

    public void setTranslateX(float f2) {
        if (f2 != this.h) {
            this.h = f2;
            c();
        }
    }

    public void setTranslateY(float f2) {
        if (f2 != this.i) {
            this.i = f2;
            c();
        }
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [C0.l, C0.i] */
    public j(j jVar, s.e eVar) {
        l lVar;
        this.f296a = new Matrix();
        this.f297b = new ArrayList();
        this.f298c = BitmapDescriptorFactory.HUE_RED;
        this.f299d = BitmapDescriptorFactory.HUE_RED;
        this.f300e = BitmapDescriptorFactory.HUE_RED;
        this.f301f = 1.0f;
        this.f302g = 1.0f;
        this.h = BitmapDescriptorFactory.HUE_RED;
        this.i = BitmapDescriptorFactory.HUE_RED;
        Matrix matrix = new Matrix();
        this.f303j = matrix;
        this.f304k = null;
        this.f298c = jVar.f298c;
        this.f299d = jVar.f299d;
        this.f300e = jVar.f300e;
        this.f301f = jVar.f301f;
        this.f302g = jVar.f302g;
        this.h = jVar.h;
        this.i = jVar.i;
        String str = jVar.f304k;
        this.f304k = str;
        if (str != null) {
            eVar.put(str, this);
        }
        matrix.set(jVar.f303j);
        ArrayList arrayList = jVar.f297b;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof j) {
                this.f297b.add(new j((j) obj, eVar));
            } else {
                if (obj instanceof i) {
                    i iVar = (i) obj;
                    ?? lVar2 = new l(iVar);
                    lVar2.f288e = BitmapDescriptorFactory.HUE_RED;
                    lVar2.f290g = 1.0f;
                    lVar2.h = 1.0f;
                    lVar2.i = BitmapDescriptorFactory.HUE_RED;
                    lVar2.f291j = 1.0f;
                    lVar2.f292k = BitmapDescriptorFactory.HUE_RED;
                    lVar2.f293l = Paint.Cap.BUTT;
                    lVar2.f294m = Paint.Join.MITER;
                    lVar2.f295n = 4.0f;
                    lVar2.f287d = iVar.f287d;
                    lVar2.f288e = iVar.f288e;
                    lVar2.f290g = iVar.f290g;
                    lVar2.f289f = iVar.f289f;
                    lVar2.f307c = iVar.f307c;
                    lVar2.h = iVar.h;
                    lVar2.i = iVar.i;
                    lVar2.f291j = iVar.f291j;
                    lVar2.f292k = iVar.f292k;
                    lVar2.f293l = iVar.f293l;
                    lVar2.f294m = iVar.f294m;
                    lVar2.f295n = iVar.f295n;
                    lVar = lVar2;
                } else if (obj instanceof h) {
                    lVar = new l((h) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f297b.add(lVar);
                Object obj2 = lVar.f306b;
                if (obj2 != null) {
                    eVar.put(obj2, lVar);
                }
            }
        }
    }
}
