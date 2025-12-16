package O;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import android.view.View;
import i2.AbstractC0396a;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: O.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0060d implements InterfaceC0058c, InterfaceC0062e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1235a;

    /* renamed from: b, reason: collision with root package name */
    public Object f1236b;

    /* renamed from: c, reason: collision with root package name */
    public int f1237c;

    /* renamed from: d, reason: collision with root package name */
    public int f1238d;

    /* renamed from: e, reason: collision with root package name */
    public Object f1239e;

    /* renamed from: f, reason: collision with root package name */
    public Cloneable f1240f;

    public /* synthetic */ C0060d() {
        this.f1235a = 0;
    }

    public void a(D0 d02, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if ((((r0) it.next()).f1292a.c() & 8) != 0) {
                ((View) this.f1239e).setTranslationY(AbstractC0396a.c(r3.f1292a.b(), this.f1238d, 0));
                return;
            }
        }
    }

    @Override // O.InterfaceC0058c
    public C0064f build() {
        return new C0064f(new C0060d(this));
    }

    @Override // O.InterfaceC0062e
    public ClipData d() {
        return (ClipData) this.f1236b;
    }

    @Override // O.InterfaceC0062e
    public int e() {
        return this.f1238d;
    }

    @Override // O.InterfaceC0062e
    public ContentInfo f() {
        return null;
    }

    @Override // O.InterfaceC0062e
    public int getSource() {
        return this.f1237c;
    }

    @Override // O.InterfaceC0058c
    public void i(Uri uri) {
        this.f1239e = uri;
    }

    @Override // O.InterfaceC0058c
    public void k(int i) {
        this.f1238d = i;
    }

    @Override // O.InterfaceC0058c
    public void setExtras(Bundle bundle) {
        this.f1240f = bundle;
    }

    public String toString() {
        String str;
        switch (this.f1235a) {
            case 1:
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(((ClipData) this.f1236b).getDescription());
                sb.append(", source=");
                int i = this.f1237c;
                sb.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
                sb.append(", flags=");
                int i4 = this.f1238d;
                sb.append((i4 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i4));
                Uri uri = (Uri) this.f1239e;
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str);
                return C.w.r(sb, ((Bundle) this.f1240f) != null ? ", hasExtras" : "", "}");
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [int[], java.lang.Cloneable] */
    public C0060d(View view) {
        this.f1235a = 2;
        this.f1240f = new int[2];
        this.f1239e = view;
    }

    public C0060d(C0060d c0060d) {
        this.f1235a = 1;
        ClipData clipData = (ClipData) c0060d.f1236b;
        clipData.getClass();
        this.f1236b = clipData;
        int i = c0060d.f1237c;
        if (i < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too low)");
        }
        if (i <= 5) {
            this.f1237c = i;
            int i4 = c0060d.f1238d;
            if ((i4 & 1) == i4) {
                this.f1238d = i4;
                this.f1239e = (Uri) c0060d.f1239e;
                this.f1240f = (Bundle) c0060d.f1240f;
                return;
            } else {
                throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i4) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
            }
        }
        Locale locale2 = Locale.US;
        throw new IllegalArgumentException("source is out of range of [0, 5] (too high)");
    }
}
