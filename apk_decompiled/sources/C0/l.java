package C0;

import a.AbstractC0105a;

/* loaded from: classes.dex */
public abstract class l extends k {

    /* renamed from: a, reason: collision with root package name */
    public G.f[] f305a;

    /* renamed from: b, reason: collision with root package name */
    public String f306b;

    /* renamed from: c, reason: collision with root package name */
    public int f307c;

    public l() {
        this.f305a = null;
        this.f307c = 0;
    }

    public G.f[] getPathData() {
        return this.f305a;
    }

    public String getPathName() {
        return this.f306b;
    }

    public void setPathData(G.f[] fVarArr) {
        G.f[] fVarArr2 = this.f305a;
        boolean z3 = false;
        if (fVarArr2 != null && fVarArr != null && fVarArr2.length == fVarArr.length) {
            int i = 0;
            while (true) {
                if (i >= fVarArr2.length) {
                    z3 = true;
                    break;
                }
                G.f fVar = fVarArr2[i];
                char c4 = fVar.f563a;
                G.f fVar2 = fVarArr[i];
                if (c4 != fVar2.f563a || fVar.f564b.length != fVar2.f564b.length) {
                    break;
                } else {
                    i++;
                }
            }
        }
        if (!z3) {
            this.f305a = AbstractC0105a.q(fVarArr);
            return;
        }
        G.f[] fVarArr3 = this.f305a;
        for (int i4 = 0; i4 < fVarArr.length; i4++) {
            fVarArr3[i4].f563a = fVarArr[i4].f563a;
            int i5 = 0;
            while (true) {
                float[] fArr = fVarArr[i4].f564b;
                if (i5 < fArr.length) {
                    fVarArr3[i4].f564b[i5] = fArr[i5];
                    i5++;
                }
            }
        }
    }

    public l(l lVar) {
        this.f305a = null;
        this.f307c = 0;
        this.f306b = lVar.f306b;
        this.f305a = AbstractC0105a.q(lVar.f305a);
    }
}
