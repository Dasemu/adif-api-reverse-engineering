package Q2;

/* loaded from: classes3.dex */
public final class a extends l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1375a;

    @Override // Q2.l
    public final Object a(Y2.a aVar) {
        switch (this.f1375a) {
            case 0:
                if (aVar.o0() != 9) {
                    return Double.valueOf(aVar.f0());
                }
                aVar.k0();
                return null;
            default:
                if (aVar.o0() != 9) {
                    return Float.valueOf((float) aVar.f0());
                }
                aVar.k0();
                return null;
        }
    }

    @Override // Q2.l
    public final void b(Y2.b bVar, Object obj) {
        switch (this.f1375a) {
            case 0:
                Number number = (Number) obj;
                if (number == null) {
                    bVar.b0();
                    return;
                }
                double doubleValue = number.doubleValue();
                d.a(doubleValue);
                bVar.e0(doubleValue);
                return;
            default:
                Number number2 = (Number) obj;
                if (number2 == null) {
                    bVar.b0();
                    return;
                }
                float floatValue = number2.floatValue();
                d.a(floatValue);
                if (!(number2 instanceof Float)) {
                    number2 = Float.valueOf(floatValue);
                }
                bVar.g0(number2);
                return;
        }
    }
}
