package m3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class i implements InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f7818a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f7819b;

    /* renamed from: c, reason: collision with root package name */
    public String f7820c;

    public i(ArrayList protocols) {
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        this.f7818a = protocols;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object proxy, Method method, Object[] objArr) {
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        Intrinsics.checkNotNullParameter(method, "method");
        if (objArr == null) {
            objArr = new Object[0];
        }
        String name = method.getName();
        Class<?> returnType = method.getReturnType();
        if (Intrinsics.areEqual(name, "supports") && Intrinsics.areEqual(Boolean.TYPE, returnType)) {
            return Boolean.TRUE;
        }
        if (Intrinsics.areEqual(name, "unsupported") && Intrinsics.areEqual(Void.TYPE, returnType)) {
            this.f7819b = true;
            return null;
        }
        boolean areEqual = Intrinsics.areEqual(name, "protocols");
        ArrayList arrayList = this.f7818a;
        if (areEqual && objArr.length == 0) {
            return arrayList;
        }
        if ((Intrinsics.areEqual(name, "selectProtocol") || Intrinsics.areEqual(name, "select")) && Intrinsics.areEqual(String.class, returnType) && objArr.length == 1) {
            Object obj = objArr[0];
            if (obj instanceof List) {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
                List list = (List) obj;
                int size = list.size();
                if (size >= 0) {
                    int i = 0;
                    while (true) {
                        Object obj2 = list.get(i);
                        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
                        String str = (String) obj2;
                        if (!arrayList.contains(str)) {
                            if (i == size) {
                                break;
                            }
                            i++;
                        } else {
                            this.f7820c = str;
                            return str;
                        }
                    }
                }
                String str2 = (String) arrayList.get(0);
                this.f7820c = str2;
                return str2;
            }
        }
        if ((!Intrinsics.areEqual(name, "protocolSelected") && !Intrinsics.areEqual(name, "selected")) || objArr.length != 1) {
            return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
        }
        Object obj3 = objArr[0];
        Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.String");
        this.f7820c = (String) obj3;
        return null;
    }
}
