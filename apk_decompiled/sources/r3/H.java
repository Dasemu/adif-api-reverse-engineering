package r3;

import a.AbstractC0105a;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class H extends C0573e {

    /* renamed from: m, reason: collision with root package name */
    public final Socket f8260m;

    public H(Socket socket) {
        Intrinsics.checkNotNullParameter(socket, "socket");
        this.f8260m = socket;
    }

    @Override // r3.C0573e
    public final void j() {
        Socket socket = this.f8260m;
        try {
            socket.close();
        } catch (AssertionError e4) {
            if (!AbstractC0105a.E(e4)) {
                throw e4;
            }
            w.f8315a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e4);
        } catch (Exception e5) {
            w.f8315a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e5);
        }
    }

    public final IOException k(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }
}
