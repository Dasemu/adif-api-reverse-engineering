package k;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import f.AbstractC0336a;
import java.io.IOException;
import kotlin.io.ConstantsKt;
import l.p;
import m.AbstractC0463g0;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: k.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0412i extends MenuInflater {

    /* renamed from: e, reason: collision with root package name */
    public static final Class[] f7001e;

    /* renamed from: f, reason: collision with root package name */
    public static final Class[] f7002f;

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f7003a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f7004b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f7005c;

    /* renamed from: d, reason: collision with root package name */
    public Object f7006d;

    static {
        Class[] clsArr = {Context.class};
        f7001e = clsArr;
        f7002f = clsArr;
    }

    public C0412i(Context context) {
        super(context);
        this.f7005c = context;
        Object[] objArr = {context};
        this.f7003a = objArr;
        this.f7004b = objArr;
    }

    public static Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r4v60 */
    public final void b(XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Menu menu) {
        ?? r4;
        int i;
        XmlResourceParser xmlResourceParser2;
        boolean z3;
        ColorStateList colorStateList;
        int resourceId;
        C0411h c0411h = new C0411h(this, menu);
        int eventType = xmlResourceParser.getEventType();
        while (true) {
            r4 = 1;
            i = 2;
            if (eventType == 2) {
                String name = xmlResourceParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
                eventType = xmlResourceParser.next();
            } else {
                eventType = xmlResourceParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z4 = false;
        boolean z5 = false;
        String str = null;
        while (!z4) {
            if (eventType == r4) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != i) {
                if (eventType == 3) {
                    String name2 = xmlResourceParser.getName();
                    if (z5 && name2.equals(str)) {
                        xmlResourceParser2 = xmlResourceParser;
                        z3 = r4;
                        z5 = false;
                        str = null;
                        eventType = xmlResourceParser2.next();
                        r4 = z3;
                        i = 2;
                        z5 = z5;
                    } else if (name2.equals("group")) {
                        c0411h.f6979b = 0;
                        c0411h.f6980c = 0;
                        c0411h.f6981d = 0;
                        c0411h.f6982e = 0;
                        c0411h.f6983f = r4;
                        c0411h.f6984g = r4;
                    } else if (name2.equals("item")) {
                        if (!c0411h.h) {
                            p pVar = c0411h.f7000z;
                            if (pVar == null || !pVar.f7292b.hasSubMenu()) {
                                c0411h.h = r4;
                                c0411h.b(c0411h.f6978a.add(c0411h.f6979b, c0411h.i, c0411h.f6985j, c0411h.f6986k));
                            } else {
                                c0411h.h = r4;
                                c0411h.b(c0411h.f6978a.addSubMenu(c0411h.f6979b, c0411h.i, c0411h.f6985j, c0411h.f6986k).getItem());
                            }
                        }
                    } else if (name2.equals("menu")) {
                        xmlResourceParser2 = xmlResourceParser;
                        z3 = r4;
                        z4 = z3;
                    }
                }
                xmlResourceParser2 = xmlResourceParser;
                z3 = r4;
            } else {
                if (!z5) {
                    String name3 = xmlResourceParser.getName();
                    boolean equals = name3.equals("group");
                    C0412i c0412i = c0411h.f6977E;
                    if (equals) {
                        TypedArray obtainStyledAttributes = c0412i.f7005c.obtainStyledAttributes(attributeSet, AbstractC0336a.p);
                        c0411h.f6979b = obtainStyledAttributes.getResourceId(r4, 0);
                        c0411h.f6980c = obtainStyledAttributes.getInt(3, 0);
                        c0411h.f6981d = obtainStyledAttributes.getInt(4, 0);
                        c0411h.f6982e = obtainStyledAttributes.getInt(5, 0);
                        c0411h.f6983f = obtainStyledAttributes.getBoolean(2, r4);
                        c0411h.f6984g = obtainStyledAttributes.getBoolean(0, r4);
                        obtainStyledAttributes.recycle();
                    } else {
                        if (name3.equals("item")) {
                            Context context = c0412i.f7005c;
                            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC0336a.f6435q);
                            c0411h.i = obtainStyledAttributes2.getResourceId(2, 0);
                            c0411h.f6985j = (obtainStyledAttributes2.getInt(5, c0411h.f6980c) & (-65536)) | (obtainStyledAttributes2.getInt(6, c0411h.f6981d) & 65535);
                            c0411h.f6986k = obtainStyledAttributes2.getText(7);
                            c0411h.f6987l = obtainStyledAttributes2.getText(8);
                            c0411h.f6988m = obtainStyledAttributes2.getResourceId(0, 0);
                            String string = obtainStyledAttributes2.getString(9);
                            c0411h.f6989n = string == null ? (char) 0 : string.charAt(0);
                            c0411h.f6990o = obtainStyledAttributes2.getInt(16, ConstantsKt.DEFAULT_BLOCK_SIZE);
                            String string2 = obtainStyledAttributes2.getString(10);
                            c0411h.p = string2 == null ? (char) 0 : string2.charAt(0);
                            c0411h.f6991q = obtainStyledAttributes2.getInt(20, ConstantsKt.DEFAULT_BLOCK_SIZE);
                            if (obtainStyledAttributes2.hasValue(11)) {
                                c0411h.f6992r = obtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                            } else {
                                c0411h.f6992r = c0411h.f6982e;
                            }
                            c0411h.f6993s = obtainStyledAttributes2.getBoolean(3, false);
                            c0411h.f6994t = obtainStyledAttributes2.getBoolean(4, c0411h.f6983f);
                            c0411h.f6995u = obtainStyledAttributes2.getBoolean(1, c0411h.f6984g);
                            c0411h.f6996v = obtainStyledAttributes2.getInt(21, -1);
                            c0411h.f6999y = obtainStyledAttributes2.getString(12);
                            c0411h.f6997w = obtainStyledAttributes2.getResourceId(13, 0);
                            c0411h.f6998x = obtainStyledAttributes2.getString(15);
                            String string3 = obtainStyledAttributes2.getString(14);
                            boolean z6 = string3 != null;
                            if (z6 && c0411h.f6997w == 0 && c0411h.f6998x == null) {
                                c0411h.f7000z = (p) c0411h.a(string3, f7002f, c0412i.f7004b);
                            } else {
                                if (z6) {
                                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                                }
                                c0411h.f7000z = null;
                            }
                            c0411h.f6973A = obtainStyledAttributes2.getText(17);
                            c0411h.f6974B = obtainStyledAttributes2.getText(22);
                            if (obtainStyledAttributes2.hasValue(19)) {
                                c0411h.f6976D = AbstractC0463g0.c(obtainStyledAttributes2.getInt(19, -1), c0411h.f6976D);
                            } else {
                                c0411h.f6976D = null;
                            }
                            if (obtainStyledAttributes2.hasValue(18)) {
                                if (!obtainStyledAttributes2.hasValue(18) || (resourceId = obtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = D.h.getColorStateList(context, resourceId)) == null) {
                                    colorStateList = obtainStyledAttributes2.getColorStateList(18);
                                }
                                c0411h.f6975C = colorStateList;
                            } else {
                                c0411h.f6975C = null;
                            }
                            obtainStyledAttributes2.recycle();
                            c0411h.h = false;
                            xmlResourceParser2 = xmlResourceParser;
                            z3 = true;
                        } else if (name3.equals("menu")) {
                            z3 = true;
                            c0411h.h = true;
                            SubMenu addSubMenu = c0411h.f6978a.addSubMenu(c0411h.f6979b, c0411h.i, c0411h.f6985j, c0411h.f6986k);
                            c0411h.b(addSubMenu.getItem());
                            xmlResourceParser2 = xmlResourceParser;
                            b(xmlResourceParser2, attributeSet, addSubMenu);
                        } else {
                            xmlResourceParser2 = xmlResourceParser;
                            z3 = true;
                            str = name3;
                            z5 = true;
                        }
                        eventType = xmlResourceParser2.next();
                        r4 = z3;
                        i = 2;
                        z5 = z5;
                    }
                }
                xmlResourceParser2 = xmlResourceParser;
                z3 = r4;
            }
            eventType = xmlResourceParser2.next();
            r4 = z3;
            i = 2;
            z5 = z5;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof l.m)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        boolean z3 = false;
        try {
            try {
                xmlResourceParser = this.f7005c.getResources().getLayout(i);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
                if (menu instanceof l.m) {
                    l.m mVar = (l.m) menu;
                    if (!mVar.p) {
                        mVar.w();
                        z3 = true;
                    }
                }
                b(xmlResourceParser, asAttributeSet, menu);
                if (z3) {
                    ((l.m) menu).v();
                }
                xmlResourceParser.close();
            } catch (IOException e4) {
                throw new InflateException("Error inflating menu XML", e4);
            } catch (XmlPullParserException e5) {
                throw new InflateException("Error inflating menu XML", e5);
            }
        } catch (Throwable th) {
            if (z3) {
                ((l.m) menu).v();
            }
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
