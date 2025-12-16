package k2;

import a.AbstractC0105a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import com.adif.elcanomovil.R;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import h2.AbstractC0379a;
import java.io.IOException;
import java.util.Locale;
import kotlin.KotlinVersion;
import org.xmlpull.v1.XmlPullParserException;
import x2.m;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final b f7088a;

    /* renamed from: b, reason: collision with root package name */
    public final b f7089b = new b();

    /* renamed from: c, reason: collision with root package name */
    public final float f7090c;

    /* renamed from: d, reason: collision with root package name */
    public final float f7091d;

    /* renamed from: e, reason: collision with root package name */
    public final float f7092e;

    /* renamed from: f, reason: collision with root package name */
    public final float f7093f;

    /* renamed from: g, reason: collision with root package name */
    public final float f7094g;
    public final float h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final int f7095j;

    /* renamed from: k, reason: collision with root package name */
    public final int f7096k;

    public c(Context context, b bVar) {
        AttributeSet attributeSet;
        int i;
        int next;
        b bVar2 = bVar == null ? new b() : bVar;
        int i4 = bVar2.f7065a;
        if (i4 != 0) {
            try {
                XmlResourceParser xml = context.getResources().getXml(i4);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                if (!TextUtils.equals(xml.getName(), "badge")) {
                    throw new XmlPullParserException("Must have a <" + ((Object) "badge") + "> start tag");
                }
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                attributeSet = asAttributeSet;
                i = asAttributeSet.getStyleAttribute();
            } catch (IOException | XmlPullParserException e4) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load badge resource ID #0x" + Integer.toHexString(i4));
                notFoundException.initCause(e4);
                throw notFoundException;
            }
        } else {
            attributeSet = null;
            i = 0;
        }
        TypedArray h = m.h(context, attributeSet, AbstractC0379a.f6755a, R.attr.badgeStyle, i == 0 ? 2132018277 : i, new int[0]);
        Resources resources = context.getResources();
        this.f7090c = h.getDimensionPixelSize(4, -1);
        this.i = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_horizontal_edge_offset);
        this.f7095j = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_text_horizontal_edge_offset);
        this.f7091d = h.getDimensionPixelSize(14, -1);
        this.f7092e = h.getDimension(12, resources.getDimension(R.dimen.m3_badge_size));
        this.f7094g = h.getDimension(17, resources.getDimension(R.dimen.m3_badge_with_text_size));
        this.f7093f = h.getDimension(3, resources.getDimension(R.dimen.m3_badge_size));
        this.h = h.getDimension(13, resources.getDimension(R.dimen.m3_badge_with_text_size));
        this.f7096k = h.getInt(24, 1);
        b bVar3 = this.f7089b;
        int i5 = bVar2.i;
        bVar3.i = i5 == -2 ? KotlinVersion.MAX_COMPONENT_VALUE : i5;
        int i6 = bVar2.f7073k;
        if (i6 != -2) {
            bVar3.f7073k = i6;
        } else if (h.hasValue(23)) {
            this.f7089b.f7073k = h.getInt(23, 0);
        } else {
            this.f7089b.f7073k = -1;
        }
        String str = bVar2.f7072j;
        if (str != null) {
            this.f7089b.f7072j = str;
        } else if (h.hasValue(7)) {
            this.f7089b.f7072j = h.getString(7);
        }
        b bVar4 = this.f7089b;
        bVar4.f7077o = bVar2.f7077o;
        CharSequence charSequence = bVar2.p;
        bVar4.p = charSequence == null ? context.getString(R.string.mtrl_badge_numberless_content_description) : charSequence;
        b bVar5 = this.f7089b;
        int i7 = bVar2.f7078q;
        bVar5.f7078q = i7 == 0 ? R.plurals.mtrl_badge_content_description : i7;
        int i8 = bVar2.f7079r;
        bVar5.f7079r = i8 == 0 ? R.string.mtrl_exceed_max_badge_number_content_description : i8;
        Boolean bool = bVar2.f7081t;
        bVar5.f7081t = Boolean.valueOf(bool == null || bool.booleanValue());
        b bVar6 = this.f7089b;
        int i9 = bVar2.f7074l;
        bVar6.f7074l = i9 == -2 ? h.getInt(21, -2) : i9;
        b bVar7 = this.f7089b;
        int i10 = bVar2.f7075m;
        bVar7.f7075m = i10 == -2 ? h.getInt(22, -2) : i10;
        b bVar8 = this.f7089b;
        Integer num = bVar2.f7069e;
        bVar8.f7069e = Integer.valueOf(num == null ? h.getResourceId(5, 2132017548) : num.intValue());
        b bVar9 = this.f7089b;
        Integer num2 = bVar2.f7070f;
        bVar9.f7070f = Integer.valueOf(num2 == null ? h.getResourceId(6, 0) : num2.intValue());
        b bVar10 = this.f7089b;
        Integer num3 = bVar2.f7071g;
        bVar10.f7071g = Integer.valueOf(num3 == null ? h.getResourceId(15, 2132017548) : num3.intValue());
        b bVar11 = this.f7089b;
        Integer num4 = bVar2.h;
        bVar11.h = Integer.valueOf(num4 == null ? h.getResourceId(16, 0) : num4.intValue());
        b bVar12 = this.f7089b;
        Integer num5 = bVar2.f7066b;
        bVar12.f7066b = Integer.valueOf(num5 == null ? AbstractC0105a.w(context, h, 1).getDefaultColor() : num5.intValue());
        b bVar13 = this.f7089b;
        Integer num6 = bVar2.f7068d;
        bVar13.f7068d = Integer.valueOf(num6 == null ? h.getResourceId(8, 2132017711) : num6.intValue());
        Integer num7 = bVar2.f7067c;
        if (num7 != null) {
            this.f7089b.f7067c = num7;
        } else if (h.hasValue(9)) {
            this.f7089b.f7067c = Integer.valueOf(AbstractC0105a.w(context, h, 9).getDefaultColor());
        } else {
            int intValue = this.f7089b.f7068d.intValue();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(intValue, AbstractC0379a.f6751E);
            obtainStyledAttributes.getDimension(0, BitmapDescriptorFactory.HUE_RED);
            ColorStateList w3 = AbstractC0105a.w(context, obtainStyledAttributes, 3);
            AbstractC0105a.w(context, obtainStyledAttributes, 4);
            AbstractC0105a.w(context, obtainStyledAttributes, 5);
            obtainStyledAttributes.getInt(2, 0);
            obtainStyledAttributes.getInt(1, 1);
            int i11 = obtainStyledAttributes.hasValue(12) ? 12 : 10;
            obtainStyledAttributes.getResourceId(i11, 0);
            obtainStyledAttributes.getString(i11);
            obtainStyledAttributes.getBoolean(14, false);
            AbstractC0105a.w(context, obtainStyledAttributes, 6);
            obtainStyledAttributes.getFloat(7, BitmapDescriptorFactory.HUE_RED);
            obtainStyledAttributes.getFloat(8, BitmapDescriptorFactory.HUE_RED);
            obtainStyledAttributes.getFloat(9, BitmapDescriptorFactory.HUE_RED);
            obtainStyledAttributes.recycle();
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(intValue, AbstractC0379a.f6770s);
            obtainStyledAttributes2.hasValue(0);
            obtainStyledAttributes2.getFloat(0, BitmapDescriptorFactory.HUE_RED);
            obtainStyledAttributes2.recycle();
            this.f7089b.f7067c = Integer.valueOf(w3.getDefaultColor());
        }
        b bVar14 = this.f7089b;
        Integer num8 = bVar2.f7080s;
        bVar14.f7080s = Integer.valueOf(num8 == null ? h.getInt(2, 8388661) : num8.intValue());
        b bVar15 = this.f7089b;
        Integer num9 = bVar2.f7082u;
        bVar15.f7082u = Integer.valueOf(num9 == null ? h.getDimensionPixelSize(11, resources.getDimensionPixelSize(R.dimen.mtrl_badge_long_text_horizontal_padding)) : num9.intValue());
        b bVar16 = this.f7089b;
        Integer num10 = bVar2.f7083v;
        bVar16.f7083v = Integer.valueOf(num10 == null ? h.getDimensionPixelSize(10, resources.getDimensionPixelSize(R.dimen.m3_badge_with_text_vertical_padding)) : num10.intValue());
        b bVar17 = this.f7089b;
        Integer num11 = bVar2.f7084w;
        bVar17.f7084w = Integer.valueOf(num11 == null ? h.getDimensionPixelOffset(18, 0) : num11.intValue());
        b bVar18 = this.f7089b;
        Integer num12 = bVar2.f7085x;
        bVar18.f7085x = Integer.valueOf(num12 == null ? h.getDimensionPixelOffset(25, 0) : num12.intValue());
        b bVar19 = this.f7089b;
        Integer num13 = bVar2.f7086y;
        bVar19.f7086y = Integer.valueOf(num13 == null ? h.getDimensionPixelOffset(19, bVar19.f7084w.intValue()) : num13.intValue());
        b bVar20 = this.f7089b;
        Integer num14 = bVar2.f7087z;
        bVar20.f7087z = Integer.valueOf(num14 == null ? h.getDimensionPixelOffset(26, bVar20.f7085x.intValue()) : num14.intValue());
        b bVar21 = this.f7089b;
        Integer num15 = bVar2.f7063C;
        bVar21.f7063C = Integer.valueOf(num15 == null ? h.getDimensionPixelOffset(20, 0) : num15.intValue());
        b bVar22 = this.f7089b;
        Integer num16 = bVar2.f7061A;
        bVar22.f7061A = Integer.valueOf(num16 == null ? 0 : num16.intValue());
        b bVar23 = this.f7089b;
        Integer num17 = bVar2.f7062B;
        bVar23.f7062B = Integer.valueOf(num17 == null ? 0 : num17.intValue());
        b bVar24 = this.f7089b;
        Boolean bool2 = bVar2.f7064D;
        bVar24.f7064D = Boolean.valueOf(bool2 == null ? h.getBoolean(0, false) : bool2.booleanValue());
        h.recycle();
        Locale locale = bVar2.f7076n;
        if (locale == null) {
            this.f7089b.f7076n = Locale.getDefault(Locale.Category.FORMAT);
        } else {
            this.f7089b.f7076n = locale;
        }
        this.f7088a = bVar2;
    }
}
