package W0;

import android.graphics.Bitmap;
import android.widget.ImageView;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final S0.c f1886a;

    static {
        MainCoroutineDispatcher immediate = Dispatchers.getMain().getImmediate();
        CoroutineDispatcher io = Dispatchers.getIO();
        CoroutineDispatcher io2 = Dispatchers.getIO();
        CoroutineDispatcher io3 = Dispatchers.getIO();
        V0.b bVar = V0.d.f1796a;
        T0.d dVar = T0.d.f1634a;
        Bitmap.Config config = f.f1888b;
        S0.b bVar2 = S0.b.f1443c;
        f1886a = new S0.c(immediate, io, io2, io3, bVar, dVar, config, bVar2, bVar2, bVar2);
    }

    public static final boolean a(S0.j jVar) {
        ImageView imageView;
        int ordinal = jVar.f1483g.ordinal();
        if (ordinal == 0) {
            return false;
        }
        if (ordinal != 1) {
            if (ordinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            T0.i iVar = jVar.f1497x;
            if (!(iVar instanceof T0.c)) {
                U0.b bVar = jVar.f1479c;
                if (!(bVar instanceof U0.a) || !(iVar instanceof T0.f) || (imageView = ((U0.a) bVar).f1775b) == null || imageView != ((T0.f) iVar).f1637a) {
                    return false;
                }
            }
        }
        return true;
    }
}
