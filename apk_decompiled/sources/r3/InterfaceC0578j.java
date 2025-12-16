package r3;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* renamed from: r3.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC0578j extends I, ReadableByteChannel {
    long A(C0579k c0579k);

    int C(x xVar);

    boolean H(C0579k c0579k);

    C M();

    void P(long j4);

    long U(InterfaceC0577i interfaceC0577i);

    String W(Charset charset);

    InputStream X();

    C0576h a();

    C0579k g();

    C0579k h(long j4);

    void l(long j4);

    boolean n(long j4);

    byte readByte();

    int readInt();

    short readShort();

    long u(C0579k c0579k);

    byte[] w();
}
