package F;

import B0.G;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import com.google.firebase.messaging.ServiceStarter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final float[][] f474a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* renamed from: b, reason: collision with root package name */
    public static final float[][] f475b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* renamed from: c, reason: collision with root package name */
    public static final float[] f476c = {95.047f, 100.0f, 108.883f};

    /* renamed from: d, reason: collision with root package name */
    public static final float[][] f477d = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    public static G b(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i) {
        G g4;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i4 = typedValue.type;
            if (i4 >= 28 && i4 <= 31) {
                return new G((Shader) null, (ColorStateList) null, typedValue.data);
            }
            try {
                g4 = G.c(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            } catch (Exception e4) {
                Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e4);
                g4 = null;
            }
            if (g4 != null) {
                return g4;
            }
        }
        return new G((Shader) null, (ColorStateList) null, 0);
    }

    public static boolean c(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static int d(float f2) {
        if (f2 < 1.0f) {
            return -16777216;
        }
        if (f2 > 99.0f) {
            return -1;
        }
        float f4 = (f2 + 16.0f) / 116.0f;
        float f5 = f2 > 8.0f ? f4 * f4 * f4 : f2 / 903.2963f;
        float f6 = f4 * f4 * f4;
        boolean z3 = f6 > 0.008856452f;
        float f7 = z3 ? f6 : ((f4 * 116.0f) - 16.0f) / 903.2963f;
        if (!z3) {
            f6 = ((f4 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = f476c;
        return G.a.a(f7 * fArr[0], f5 * fArr[1], f6 * fArr[2]);
    }

    public static float e(int i) {
        float f2 = i / 255.0f;
        return (f2 <= 0.04045f ? f2 / 12.92f : (float) Math.pow((f2 + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    public static TypedArray f(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static e i(XmlResourceParser xmlResourceParser, Resources resources) {
        int next;
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        xmlResourceParser.require(2, null, "font-family");
        if (!xmlResourceParser.getName().equals("font-family")) {
            k(xmlResourceParser);
            return null;
        }
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), B.a.f82b);
        String string = obtainAttributes.getString(0);
        String string2 = obtainAttributes.getString(4);
        String string3 = obtainAttributes.getString(5);
        int resourceId = obtainAttributes.getResourceId(1, 0);
        int integer = obtainAttributes.getInteger(2, 1);
        int integer2 = obtainAttributes.getInteger(3, ServiceStarter.ERROR_UNKNOWN);
        String string4 = obtainAttributes.getString(6);
        obtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlResourceParser.next() != 3) {
                k(xmlResourceParser);
            }
            return new h(new I0.b(string, string2, string3, j(resources, resourceId)), integer, integer2, string4);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlResourceParser.next() != 3) {
            if (xmlResourceParser.getEventType() == 2) {
                if (xmlResourceParser.getName().equals("font")) {
                    TypedArray obtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), B.a.f83c);
                    int i = obtainAttributes2.getInt(obtainAttributes2.hasValue(8) ? 8 : 1, 400);
                    boolean z3 = 1 == obtainAttributes2.getInt(obtainAttributes2.hasValue(6) ? 6 : 2, 0);
                    int i4 = obtainAttributes2.hasValue(9) ? 9 : 3;
                    String string5 = obtainAttributes2.getString(obtainAttributes2.hasValue(7) ? 7 : 4);
                    int i5 = obtainAttributes2.getInt(i4, 0);
                    int i6 = obtainAttributes2.hasValue(5) ? 5 : 0;
                    int resourceId2 = obtainAttributes2.getResourceId(i6, 0);
                    String string6 = obtainAttributes2.getString(i6);
                    obtainAttributes2.recycle();
                    while (xmlResourceParser.next() != 3) {
                        k(xmlResourceParser);
                    }
                    arrayList.add(new g(string6, i, string5, i5, resourceId2, z3));
                } else {
                    k(xmlResourceParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new f((g[]) arrayList.toArray(new g[0]));
    }

    public static List j(Resources resources, int i) {
        if (i == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (d.a(obtainTypedArray, 0) == 1) {
                for (int i4 = 0; i4 < obtainTypedArray.length(); i4++) {
                    int resourceId = obtainTypedArray.getResourceId(i4, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    public static void k(XmlResourceParser xmlResourceParser) {
        int i = 1;
        while (i > 0) {
            int next = xmlResourceParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    public static float l() {
        return ((float) Math.pow((50.0f + 16.0d) / 116.0d, 3.0d)) * 100.0f;
    }

    public void a(int i) {
        new Handler(Looper.getMainLooper()).post(new o(i, 0, this));
    }

    public abstract void g(int i);

    public abstract void h(Typeface typeface);
}
