package s0;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Objects;

/* renamed from: s0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0589h {

    /* renamed from: a, reason: collision with root package name */
    public final int f8381a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8382b;

    /* renamed from: c, reason: collision with root package name */
    public final long f8383c;

    /* renamed from: d, reason: collision with root package name */
    public final long f8384d;

    public C0589h(int i, int i4, long j4, long j5) {
        this.f8381a = i;
        this.f8382b = i4;
        this.f8383c = j4;
        this.f8384d = j5;
    }

    public static C0589h a(File file) {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            C0589h c0589h = new C0589h(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return c0589h;
        } finally {
        }
    }

    public final void b(File file) {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f8381a);
            dataOutputStream.writeInt(this.f8382b);
            dataOutputStream.writeLong(this.f8383c);
            dataOutputStream.writeLong(this.f8384d);
            dataOutputStream.close();
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof C0589h)) {
            C0589h c0589h = (C0589h) obj;
            if (this.f8382b == c0589h.f8382b && this.f8383c == c0589h.f8383c && this.f8381a == c0589h.f8381a && this.f8384d == c0589h.f8384d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f8382b), Long.valueOf(this.f8383c), Integer.valueOf(this.f8381a), Long.valueOf(this.f8384d));
    }
}
