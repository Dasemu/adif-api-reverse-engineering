package T2;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.security.PrivilegedAction;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class q implements PrivilegedAction {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Class f1708a;

    public q(Class cls) {
        this.f1708a = cls;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        Field[] declaredFields = this.f1708a.getDeclaredFields();
        ArrayList arrayList = new ArrayList(declaredFields.length);
        for (Field field : declaredFields) {
            if (field.isEnumConstant()) {
                arrayList.add(field);
            }
        }
        Field[] fieldArr = (Field[]) arrayList.toArray(new Field[0]);
        AccessibleObject.setAccessible(fieldArr, true);
        return fieldArr;
    }
}
