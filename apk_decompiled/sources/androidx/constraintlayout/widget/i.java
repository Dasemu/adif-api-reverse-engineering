package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.util.SparseArray;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f2634a;

    /* renamed from: b, reason: collision with root package name */
    public int f2635b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f2636c = -1;

    /* renamed from: d, reason: collision with root package name */
    public final SparseArray f2637d = new SparseArray();

    /* renamed from: e, reason: collision with root package name */
    public final SparseArray f2638e = new SparseArray();

    public i(Context context, ConstraintLayout constraintLayout, int i) {
        this.f2634a = constraintLayout;
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            int eventType = xml.getEventType();
            g gVar = null;
            while (true) {
                char c4 = 1;
                if (eventType == 1) {
                    return;
                }
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                c4 = 4;
                                break;
                            }
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                c4 = 2;
                                break;
                            }
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                break;
                            }
                            break;
                        case 1657696882:
                            if (name.equals("layoutDescription")) {
                                c4 = 0;
                                break;
                            }
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                c4 = 3;
                                break;
                            }
                            break;
                    }
                    c4 = 65535;
                    if (c4 == 2) {
                        gVar = new g(context, xml);
                        this.f2637d.put(gVar.f2624a, gVar);
                    } else if (c4 == 3) {
                        h hVar = new h(context, xml);
                        if (gVar != null) {
                            gVar.f2625b.add(hVar);
                        }
                    } else if (c4 == 4) {
                        a(context, xml);
                    }
                }
                eventType = xml.next();
            }
        } catch (IOException e4) {
            e4.printStackTrace();
        } catch (XmlPullParserException e5) {
            e5.printStackTrace();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:99:0x022b, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.content.Context r12, android.content.res.XmlResourceParser r13) {
        /*
            Method dump skipped, instructions count: 664
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.i.a(android.content.Context, android.content.res.XmlResourceParser):void");
    }
}
