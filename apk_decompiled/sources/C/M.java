package C;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class M implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f233a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final Context f234b;

    public M(Context context) {
        this.f234b = context;
    }

    public final void a(ComponentName componentName) {
        Context context = this.f234b;
        ArrayList arrayList = this.f233a;
        int size = arrayList.size();
        try {
            for (Intent a2 = AbstractC0044h.a(context, componentName); a2 != null; a2 = AbstractC0044h.a(context, a2.getComponent())) {
                arrayList.add(size, a2);
            }
        } catch (PackageManager.NameNotFoundException e4) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e4);
        }
    }

    public final void b() {
        ArrayList arrayList = this.f233a;
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        Context context = this.f234b;
        if (D.h.startActivities(context, intentArr, null)) {
            return;
        }
        Intent intent = new Intent(intentArr[intentArr.length - 1]);
        intent.addFlags(268435456);
        context.startActivity(intent);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f233a.iterator();
    }
}
