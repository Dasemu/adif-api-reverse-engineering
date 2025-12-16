package kotlinx.coroutines.test.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.internal.MainDispatcherFactory;
import kotlinx.coroutines.internal.MainDispatchersKt;
import kotlinx.coroutines.internal.MissingMainCoroutineDispatcherFactory;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\nH\u0016R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lkotlinx/coroutines/test/internal/TestMainDispatcherFactory;", "Lkotlinx/coroutines/internal/MainDispatcherFactory;", "()V", "loadPriority", "", "getLoadPriority", "()I", "createDispatcher", "Lkotlinx/coroutines/MainCoroutineDispatcher;", "allFactories", "", "kotlinx-coroutines-test"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTestMainDispatcherJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TestMainDispatcherJvm.kt\nkotlinx/coroutines/test/internal/TestMainDispatcherFactory\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,31:1\n766#2:32\n857#2,2:33\n1963#2,14:35\n*S KotlinDebug\n*F\n+ 1 TestMainDispatcherJvm.kt\nkotlinx/coroutines/test/internal/TestMainDispatcherFactory\n*L\n13#1:32\n13#1:33,2\n14#1:35,14\n*E\n"})
/* loaded from: classes3.dex */
public final class TestMainDispatcherFactory implements MainDispatcherFactory {
    @Override // kotlinx.coroutines.internal.MainDispatcherFactory
    public MainCoroutineDispatcher createDispatcher(List<? extends MainDispatcherFactory> allFactories) {
        Object obj;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : allFactories) {
            if (((MainDispatcherFactory) obj2) != this) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                int loadPriority = ((MainDispatcherFactory) next).getLoadPriority();
                do {
                    Object next2 = it.next();
                    int loadPriority2 = ((MainDispatcherFactory) next2).getLoadPriority();
                    if (loadPriority < loadPriority2) {
                        next = next2;
                        loadPriority = loadPriority2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        MainDispatcherFactory mainDispatcherFactory = (MainDispatcherFactory) obj;
        if (mainDispatcherFactory == null) {
            mainDispatcherFactory = MissingMainCoroutineDispatcherFactory.INSTANCE;
        }
        return new TestMainDispatcher(MainDispatchersKt.tryCreateDispatcher(mainDispatcherFactory, arrayList));
    }

    @Override // kotlinx.coroutines.internal.MainDispatcherFactory
    public int getLoadPriority() {
        return Integer.MAX_VALUE;
    }

    @Override // kotlinx.coroutines.internal.MainDispatcherFactory
    public String hintOnError() {
        return MainDispatcherFactory.DefaultImpls.hintOnError(this);
    }
}
