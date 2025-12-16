package d;

import e.AbstractC0311a;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* renamed from: d.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0299h extends AbstractC0294c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6100a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC0300i f6101b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f6102c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractC0311a f6103d;

    public /* synthetic */ C0299h(AbstractC0300i abstractC0300i, String str, AbstractC0311a abstractC0311a, int i) {
        this.f6100a = i;
        this.f6101b = abstractC0300i;
        this.f6102c = str;
        this.f6103d = abstractC0311a;
    }

    @Override // d.AbstractC0294c
    public final void a(Object obj) {
        switch (this.f6100a) {
            case 0:
                AbstractC0300i abstractC0300i = this.f6101b;
                LinkedHashMap linkedHashMap = abstractC0300i.f6105b;
                String str = this.f6102c;
                Object obj2 = linkedHashMap.get(str);
                AbstractC0311a abstractC0311a = this.f6103d;
                if (obj2 == null) {
                    throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + abstractC0311a + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
                }
                int intValue = ((Number) obj2).intValue();
                ArrayList arrayList = abstractC0300i.f6107d;
                arrayList.add(str);
                try {
                    abstractC0300i.b(intValue, abstractC0311a, obj);
                    return;
                } catch (Exception e4) {
                    arrayList.remove(str);
                    throw e4;
                }
            default:
                AbstractC0300i abstractC0300i2 = this.f6101b;
                LinkedHashMap linkedHashMap2 = abstractC0300i2.f6105b;
                String str2 = this.f6102c;
                Object obj3 = linkedHashMap2.get(str2);
                AbstractC0311a abstractC0311a2 = this.f6103d;
                if (obj3 == null) {
                    throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + abstractC0311a2 + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
                }
                int intValue2 = ((Number) obj3).intValue();
                ArrayList arrayList2 = abstractC0300i2.f6107d;
                arrayList2.add(str2);
                try {
                    abstractC0300i2.b(intValue2, abstractC0311a2, obj);
                    return;
                } catch (Exception e5) {
                    arrayList2.remove(str2);
                    throw e5;
                }
        }
    }

    public void b() {
        this.f6101b.f(this.f6102c);
    }
}
