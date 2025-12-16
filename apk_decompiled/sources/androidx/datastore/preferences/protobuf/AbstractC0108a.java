package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0108a {
    protected int memoizedHashCode;

    public abstract int a();

    public final int b(InterfaceC0111b0 interfaceC0111b0) {
        AbstractC0130v abstractC0130v = (AbstractC0130v) this;
        int i = abstractC0130v.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int e4 = interfaceC0111b0.e(this);
        abstractC0130v.memoizedSerializedSize = e4;
        return e4;
    }

    public abstract void c(C0119j c0119j);
}
