package e3;

import java.net.InetSocketAddress;
import java.net.Proxy;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class U {

    /* renamed from: a, reason: collision with root package name */
    public final C0315a f6311a;

    /* renamed from: b, reason: collision with root package name */
    public final Proxy f6312b;

    /* renamed from: c, reason: collision with root package name */
    public final InetSocketAddress f6313c;

    public U(C0315a address, Proxy proxy, InetSocketAddress socketAddress) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        Intrinsics.checkNotNullParameter(socketAddress, "socketAddress");
        this.f6311a = address;
        this.f6312b = proxy;
        this.f6313c = socketAddress;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof U)) {
            return false;
        }
        U u3 = (U) obj;
        return Intrinsics.areEqual(u3.f6311a, this.f6311a) && Intrinsics.areEqual(u3.f6312b, this.f6312b) && Intrinsics.areEqual(u3.f6313c, this.f6313c);
    }

    public final int hashCode() {
        return this.f6313c.hashCode() + ((this.f6312b.hashCode() + ((this.f6311a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.f6313c + '}';
    }
}
