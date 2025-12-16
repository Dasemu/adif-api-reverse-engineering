package w0;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.io.Closeable;

/* renamed from: w0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC0645a extends Closeable {
    boolean B();

    boolean G();

    void J();

    void K();

    Cursor V(String str);

    void b();

    void c();

    void i(String str);

    boolean isOpen();

    Cursor j(InterfaceC0648d interfaceC0648d, CancellationSignal cancellationSignal);

    Cursor p(InterfaceC0648d interfaceC0648d);

    InterfaceC0649e q(String str);
}
