package s0;

import android.content.res.AssetManager;
import android.os.Build;
import b.l;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* renamed from: s0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0582a {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f8359a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0584c f8360b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f8361c;

    /* renamed from: d, reason: collision with root package name */
    public final File f8362d;

    /* renamed from: e, reason: collision with root package name */
    public final String f8363e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f8364f = false;

    /* renamed from: g, reason: collision with root package name */
    public C0583b[] f8365g;
    public byte[] h;

    public C0582a(AssetManager assetManager, Executor executor, InterfaceC0584c interfaceC0584c, String str, File file) {
        this.f8359a = executor;
        this.f8360b = interfaceC0584c;
        this.f8363e = str;
        this.f8362d = file;
        int i = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i <= 34) {
            switch (i) {
                case 29:
                case 30:
                    bArr = AbstractC0585d.f8377e;
                    break;
                case 31:
                case 32:
                case 33:
                case 34:
                    bArr = AbstractC0585d.f8376d;
                    break;
            }
        }
        this.f8361c = bArr;
    }

    public final FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e4) {
            String message = e4.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            this.f8360b.h();
            return null;
        }
    }

    public final void b(int i, Serializable serializable) {
        this.f8359a.execute(new l(this, i, 2, serializable));
    }
}
