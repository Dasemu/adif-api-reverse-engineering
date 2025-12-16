package R1;

import C.v;
import android.content.res.TypedArray;

/* loaded from: classes3.dex */
public final class b extends v {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1417b;

    public b(int i) {
        this.f1417b = i;
        switch (i) {
            case 1:
                return;
            default:
                ((c) this.f267a).p = true;
                return;
        }
    }

    @Override // C.v
    public v c(TypedArray typedArray) {
        switch (this.f1417b) {
            case 1:
                super.c(typedArray);
                boolean hasValue = typedArray.hasValue(2);
                c cVar = (c) this.f267a;
                if (hasValue) {
                    cVar.f1422e = (typedArray.getColor(2, cVar.f1422e) & 16777215) | (cVar.f1422e & (-16777216));
                }
                if (typedArray.hasValue(12)) {
                    cVar.f1421d = typedArray.getColor(12, cVar.f1421d);
                }
                return this;
            default:
                return super.c(typedArray);
        }
    }

    @Override // C.v
    public final v e() {
        int i = this.f1417b;
        return this;
    }
}
