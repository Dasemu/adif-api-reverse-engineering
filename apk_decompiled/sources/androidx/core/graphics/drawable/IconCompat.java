package androidx.core.graphics.drawable;

import H.c;
import H.e;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.os.Parcelable;
import androidx.versionedparcelable.CustomVersionedParcelable;

/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k, reason: collision with root package name */
    public static final PorterDuff.Mode f2783k = PorterDuff.Mode.SRC_IN;

    /* renamed from: a, reason: collision with root package name */
    public int f2784a;

    /* renamed from: b, reason: collision with root package name */
    public Object f2785b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f2786c;

    /* renamed from: d, reason: collision with root package name */
    public Parcelable f2787d;

    /* renamed from: e, reason: collision with root package name */
    public int f2788e;

    /* renamed from: f, reason: collision with root package name */
    public int f2789f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f2790g;
    public PorterDuff.Mode h;
    public String i;

    /* renamed from: j, reason: collision with root package name */
    public String f2791j;

    public IconCompat() {
        this.f2784a = -1;
        this.f2786c = null;
        this.f2787d = null;
        this.f2788e = 0;
        this.f2789f = 0;
        this.f2790g = null;
        this.h = f2783k;
        this.i = null;
    }

    public static IconCompat a(int i) {
        if (i == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f2788e = i;
        iconCompat.f2785b = "";
        iconCompat.f2791j = "";
        return iconCompat;
    }

    public final int b() {
        int i = this.f2784a;
        if (i == -1) {
            return e.a(this.f2785b);
        }
        if (i == 2) {
            return this.f2788e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    public final Uri c() {
        int i = this.f2784a;
        if (i == -1) {
            return c.a(this.f2785b);
        }
        if (i == 4 || i == 6) {
            return Uri.parse((String) this.f2785b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    public final String toString() {
        String str;
        if (this.f2784a == -1) {
            return String.valueOf(this.f2785b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f2784a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.f2784a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f2785b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f2785b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f2791j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(b())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f2788e);
                if (this.f2789f != 0) {
                    sb.append(" off=");
                    sb.append(this.f2789f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f2785b);
                break;
        }
        if (this.f2790g != null) {
            sb.append(" tint=");
            sb.append(this.f2790g);
        }
        if (this.h != f2783k) {
            sb.append(" mode=");
            sb.append(this.h);
        }
        sb.append(")");
        return sb.toString();
    }

    public IconCompat(int i) {
        this.f2786c = null;
        this.f2787d = null;
        this.f2788e = 0;
        this.f2789f = 0;
        this.f2790g = null;
        this.h = f2783k;
        this.i = null;
        this.f2784a = i;
    }
}
