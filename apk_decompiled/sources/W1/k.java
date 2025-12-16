package W1;

import android.content.Context;
import androidx.fragment.app.RunnableC0143e;
import b2.C0270c;
import d0.ThreadFactoryC0303a;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.inject.Provider;

/* loaded from: classes3.dex */
public final class k implements d0.g {

    /* renamed from: a, reason: collision with root package name */
    public Context f1936a;

    @Override // d0.g
    public void a(m3.l lVar) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0303a("EmojiCompatInitializer"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new RunnableC0143e(this, lVar, threadPoolExecutor, 5));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [W1.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v7, types: [Y1.b, java.lang.Object] */
    public l b() {
        Context context = this.f1936a;
        if (context == null) {
            throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
        }
        ?? obj = new Object();
        obj.f1937a = Y1.a.a(n.f1946a);
        X1.e eVar = new X1.e(context, 3);
        obj.f1938b = eVar;
        obj.f1939c = Y1.a.a(new X1.g(eVar, new X1.e(eVar, 0), 0));
        X1.e eVar2 = obj.f1938b;
        obj.f1940d = new X1.e(eVar2, 2);
        Provider a2 = Y1.a.a(new X1.e(eVar2, 1));
        obj.f1941e = a2;
        Provider a4 = Y1.a.a(new X1.g(obj.f1940d, a2, 1));
        obj.f1942f = a4;
        ?? obj2 = new Object();
        X1.e eVar3 = obj.f1938b;
        u uVar = new u(eVar3, a4, obj2, 1);
        Provider provider = obj.f1937a;
        Provider provider2 = obj.f1939c;
        obj.f1943g = Y1.a.a(new u(new C0270c(provider, provider2, uVar, a4, a4), new c2.m(eVar3, provider2, a4, uVar, provider, a4, a4), new c2.o(provider, a4, uVar, a4), 0));
        return obj;
    }
}
