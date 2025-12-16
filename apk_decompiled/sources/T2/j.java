package T2;

import C.w;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final String f1681a;

    /* renamed from: b, reason: collision with root package name */
    public final Field f1682b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1683c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f1684d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f1685e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Method f1686f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f1687g;
    public final /* synthetic */ Q2.l h;
    public final /* synthetic */ Q2.d i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ X2.a f1688j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f1689k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f1690l;

    public j(String str, Field field, boolean z3, boolean z4, Method method, boolean z5, Q2.l lVar, Q2.d dVar, X2.a aVar, boolean z6, boolean z7) {
        this.f1686f = method;
        this.f1687g = z5;
        this.h = lVar;
        this.i = dVar;
        this.f1688j = aVar;
        this.f1689k = z6;
        this.f1690l = z7;
        this.f1681a = str;
        this.f1682b = field;
        this.f1683c = field.getName();
        this.f1684d = z3;
        this.f1685e = z4;
    }

    public final void a(Y2.b bVar, Object obj) {
        Object obj2;
        if (this.f1684d) {
            Field field = this.f1682b;
            Method method = this.f1686f;
            if (method != null) {
                try {
                    obj2 = method.invoke(obj, new Object[0]);
                } catch (InvocationTargetException e4) {
                    throw new RuntimeException(w.o("Accessor ", V2.c.d(method, false), " threw exception"), e4.getCause());
                }
            } else {
                obj2 = field.get(obj);
            }
            if (obj2 == obj) {
                return;
            }
            bVar.Z(this.f1681a);
            boolean z3 = this.f1687g;
            Q2.l lVar = this.h;
            if (!z3) {
                lVar = new o(this.i, lVar, this.f1688j.getType());
            }
            lVar.b(bVar, obj2);
        }
    }
}
