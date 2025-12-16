package o0;

import a.AbstractC0105a;
import android.content.Context;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.sequences.SequencesKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import p0.AbstractC0549a;

/* loaded from: classes.dex */
public class E {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f7919j = 0;

    /* renamed from: a, reason: collision with root package name */
    public final String f7920a;

    /* renamed from: b, reason: collision with root package name */
    public H f7921b;

    /* renamed from: c, reason: collision with root package name */
    public String f7922c;

    /* renamed from: d, reason: collision with root package name */
    public CharSequence f7923d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f7924e;

    /* renamed from: f, reason: collision with root package name */
    public final s.k f7925f;

    /* renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f7926g;
    public int h;
    public String i;

    static {
        new LinkedHashMap();
    }

    public E(String navigatorName) {
        Intrinsics.checkNotNullParameter(navigatorName, "navigatorName");
        this.f7920a = navigatorName;
        this.f7924e = new ArrayList();
        this.f7925f = new s.k();
        this.f7926g = new LinkedHashMap();
    }

    public final void a(C0521A navDeepLink) {
        Intrinsics.checkNotNullParameter(navDeepLink, "navDeepLink");
        Map map = MapsKt.toMap(this.f7926g);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            C0533j c0533j = (C0533j) entry.getValue();
            if (!c0533j.f7997b && !c0533j.f7998c) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Set keySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : keySet) {
            String str = (String) obj;
            ArrayList arrayList2 = navDeepLink.f7902d;
            Collection values = navDeepLink.f7903e.values();
            ArrayList arrayList3 = new ArrayList();
            Iterator it = values.iterator();
            while (it.hasNext()) {
                CollectionsKt__MutableCollectionsKt.addAll(arrayList3, ((C0547y) it.next()).f8076b);
            }
            if (!CollectionsKt.plus((Collection) arrayList2, (Iterable) arrayList3).contains(str)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            this.f7924e.add(navDeepLink);
            return;
        }
        throw new IllegalArgumentException(("Deep link " + navDeepLink.f7899a + " can't be used to open destination " + this + ".\nFollowing required arguments are missing: " + arrayList).toString());
    }

    public final Bundle b(Bundle bundle) {
        LinkedHashMap linkedHashMap = this.f7926g;
        if (bundle == null && (linkedHashMap == null || linkedHashMap.isEmpty())) {
            return null;
        }
        Bundle bundle2 = new Bundle();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String name = (String) entry.getKey();
            C0533j c0533j = (C0533j) entry.getValue();
            c0533j.getClass();
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(bundle2, "bundle");
            if (c0533j.f7998c) {
                c0533j.f7996a.d(bundle2, name, c0533j.f7999d);
            }
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                String name2 = (String) entry2.getKey();
                C0533j c0533j2 = (C0533j) entry2.getValue();
                c0533j2.getClass();
                Intrinsics.checkNotNullParameter(name2, "name");
                Intrinsics.checkNotNullParameter(bundle2, "bundle");
                T t2 = c0533j2.f7996a;
                if (c0533j2.f7997b || !bundle2.containsKey(name2) || bundle2.get(name2) != null) {
                    try {
                        t2.a(bundle2, name2);
                    } catch (ClassCastException unused) {
                    }
                }
                StringBuilder p = com.google.android.gms.measurement.internal.a.p("Wrong argument type for '", name2, "' in argument bundle. ");
                p.append(t2.b());
                p.append(" expected.");
                throw new IllegalArgumentException(p.toString().toString());
            }
        }
        return bundle2;
    }

    public final int[] c(E e4) {
        int collectionSizeOrDefault;
        int[] intArray;
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            Intrinsics.checkNotNull(this);
            H h = this.f7921b;
            if ((e4 != null ? e4.f7921b : null) != null) {
                H h4 = e4.f7921b;
                Intrinsics.checkNotNull(h4);
                if (h4.j(this.h, true) == this) {
                    arrayDeque.addFirst(this);
                    break;
                }
            }
            if (h == null || h.f7932l != this.h) {
                arrayDeque.addFirst(this);
            }
            if (Intrinsics.areEqual(h, e4) || h == null) {
                break;
            }
            this = h;
        }
        List list = CollectionsKt.toList(arrayDeque);
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((E) it.next()).h));
        }
        intArray = CollectionsKt___CollectionsKt.toIntArray(arrayList);
        return intArray;
    }

    public boolean equals(Object obj) {
        Set intersect;
        boolean z3;
        boolean z4;
        if (obj != null && (obj instanceof E)) {
            ArrayList arrayList = this.f7924e;
            E e4 = (E) obj;
            intersect = CollectionsKt___CollectionsKt.intersect(arrayList, e4.f7924e);
            boolean z5 = intersect.size() == arrayList.size();
            s.k kVar = this.f7925f;
            int f2 = kVar.f();
            s.k kVar2 = e4.f7925f;
            if (f2 == kVar2.f()) {
                Iterator it = SequencesKt.asSequence(s.h.d(kVar)).iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!kVar2.b((C0529f) it.next())) {
                            break;
                        }
                    } else {
                        Iterator it2 = SequencesKt.asSequence(s.h.d(kVar2)).iterator();
                        while (it2.hasNext()) {
                            if (!kVar.b((C0529f) it2.next())) {
                            }
                        }
                        z3 = true;
                    }
                }
            }
            z3 = false;
            LinkedHashMap linkedHashMap = this.f7926g;
            int size = MapsKt.toMap(linkedHashMap).size();
            LinkedHashMap linkedHashMap2 = e4.f7926g;
            if (size == MapsKt.toMap(linkedHashMap2).size()) {
                Iterator it3 = MapsKt.asSequence(MapsKt.toMap(linkedHashMap)).iterator();
                while (true) {
                    if (it3.hasNext()) {
                        Map.Entry entry = (Map.Entry) it3.next();
                        if (!MapsKt.toMap(linkedHashMap2).containsKey(entry.getKey()) || !Intrinsics.areEqual(MapsKt.toMap(linkedHashMap2).get(entry.getKey()), entry.getValue())) {
                            break;
                        }
                    } else {
                        for (Map.Entry entry2 : MapsKt.asSequence(MapsKt.toMap(linkedHashMap2))) {
                            if (MapsKt.toMap(linkedHashMap).containsKey(entry2.getKey()) && Intrinsics.areEqual(MapsKt.toMap(linkedHashMap).get(entry2.getKey()), entry2.getValue())) {
                            }
                        }
                        z4 = true;
                    }
                }
            }
            z4 = false;
            if (this.h == e4.h && Intrinsics.areEqual(this.i, e4.i) && z5 && z3 && z4) {
                return true;
            }
        }
        return false;
    }

    public final C0529f f(int i) {
        s.k kVar = this.f7925f;
        C0529f c0529f = kVar.f() == 0 ? null : (C0529f) kVar.c(i);
        if (c0529f != null) {
            return c0529f;
        }
        H h = this.f7921b;
        if (h != null) {
            return h.f(i);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [o0.x, java.lang.Object] */
    public D g(C0523C navDeepLinkRequest) {
        Bundle bundle;
        int i;
        int i4;
        List emptyList;
        List emptyList2;
        Bundle bundle2;
        Matcher matcher;
        Uri uri;
        LinkedHashMap linkedHashMap;
        Map map;
        String str;
        String substringAfter$default;
        E e4 = this;
        Intrinsics.checkNotNullParameter(navDeepLinkRequest, "navDeepLinkRequest");
        ArrayList arrayList = e4.f7924e;
        Bundle bundle3 = null;
        if (arrayList.isEmpty()) {
            return null;
        }
        Iterator it = arrayList.iterator();
        D d4 = null;
        while (it.hasNext()) {
            C0521A c0521a = (C0521A) it.next();
            Uri deepLink = navDeepLinkRequest.f7911a;
            if (deepLink != null) {
                Map arguments = MapsKt.toMap(e4.f7926g);
                c0521a.getClass();
                Intrinsics.checkNotNullParameter(deepLink, "deepLink");
                Intrinsics.checkNotNullParameter(arguments, "arguments");
                Pattern pattern = (Pattern) c0521a.f7905g.getValue();
                Matcher matcher2 = pattern != null ? pattern.matcher(deepLink.toString()) : bundle3;
                if (matcher2 != 0 && matcher2.matches()) {
                    bundle2 = new Bundle();
                    ArrayList arrayList2 = c0521a.f7902d;
                    int size = arrayList2.size();
                    int i5 = 0;
                    while (i5 < size) {
                        String str2 = (String) arrayList2.get(i5);
                        i5++;
                        String value = Uri.decode(matcher2.group(i5));
                        C0533j c0533j = (C0533j) arguments.get(str2);
                        try {
                            Intrinsics.checkNotNullExpressionValue(value, "value");
                            C0521A.b(bundle2, str2, value, c0533j);
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                    if (c0521a.h) {
                        LinkedHashMap linkedHashMap2 = c0521a.f7903e;
                        for (String str3 : linkedHashMap2.keySet()) {
                            C0547y c0547y = (C0547y) linkedHashMap2.get(str3);
                            String queryParameter = deepLink.getQueryParameter(str3);
                            if (c0521a.i) {
                                String uri2 = deepLink.toString();
                                Intrinsics.checkNotNullExpressionValue(uri2, "deepLink.toString()");
                                substringAfter$default = StringsKt__StringsKt.substringAfter$default(uri2, '?', (String) null, 2, (Object) null);
                                if (!Intrinsics.areEqual(substringAfter$default, uri2)) {
                                    queryParameter = substringAfter$default;
                                }
                            }
                            if (queryParameter != null) {
                                Intrinsics.checkNotNull(c0547y);
                                matcher = Pattern.compile(c0547y.f8075a, 32).matcher(queryParameter);
                                if (!matcher.matches()) {
                                    break;
                                }
                            } else {
                                matcher = null;
                            }
                            Bundle bundle4 = new Bundle();
                            try {
                                Intrinsics.checkNotNull(c0547y);
                                int size2 = c0547y.f8076b.size();
                                int i6 = 0;
                                while (i6 < size2) {
                                    if (matcher != null) {
                                        str = matcher.group(i6 + 1);
                                        if (str == null) {
                                            str = "";
                                        }
                                    } else {
                                        str = null;
                                    }
                                    String str4 = (String) c0547y.f8076b.get(i6);
                                    uri = deepLink;
                                    try {
                                        C0533j c0533j2 = (C0533j) arguments.get(str4);
                                        if (str != null) {
                                            linkedHashMap = linkedHashMap2;
                                            try {
                                                StringBuilder sb = new StringBuilder();
                                                map = arguments;
                                                try {
                                                    sb.append('{');
                                                    sb.append(str4);
                                                    sb.append('}');
                                                    if (!Intrinsics.areEqual(str, sb.toString())) {
                                                        C0521A.b(bundle4, str4, str, c0533j2);
                                                    }
                                                } catch (IllegalArgumentException unused2) {
                                                }
                                            } catch (IllegalArgumentException unused3) {
                                                map = arguments;
                                                linkedHashMap2 = linkedHashMap;
                                                deepLink = uri;
                                                arguments = map;
                                            }
                                        } else {
                                            linkedHashMap = linkedHashMap2;
                                            map = arguments;
                                        }
                                        i6++;
                                        linkedHashMap2 = linkedHashMap;
                                        deepLink = uri;
                                        arguments = map;
                                    } catch (IllegalArgumentException unused4) {
                                        linkedHashMap = linkedHashMap2;
                                        map = arguments;
                                        linkedHashMap2 = linkedHashMap;
                                        deepLink = uri;
                                        arguments = map;
                                    }
                                }
                                uri = deepLink;
                                linkedHashMap = linkedHashMap2;
                                map = arguments;
                                bundle2.putAll(bundle4);
                            } catch (IllegalArgumentException unused5) {
                                uri = deepLink;
                            }
                            linkedHashMap2 = linkedHashMap;
                            deepLink = uri;
                            arguments = map;
                        }
                    }
                    for (Map.Entry entry : arguments.entrySet()) {
                        String str5 = (String) entry.getKey();
                        C0533j c0533j3 = (C0533j) entry.getValue();
                        if (c0533j3 != null && !c0533j3.f7997b && !c0533j3.f7998c && !bundle2.containsKey(str5)) {
                            bundle2 = null;
                        }
                    }
                } else {
                    bundle2 = bundle3;
                }
                bundle = bundle2;
            } else {
                bundle = null;
            }
            String str6 = navDeepLinkRequest.f7912b;
            boolean z3 = str6 != null && Intrinsics.areEqual(str6, c0521a.f7900b);
            String mimeType = navDeepLinkRequest.f7913c;
            if (mimeType != null) {
                c0521a.getClass();
                Intrinsics.checkNotNullParameter(mimeType, "mimeType");
                String mimeType2 = c0521a.f7901c;
                if (mimeType2 != null) {
                    Pattern pattern2 = (Pattern) c0521a.f7907k.getValue();
                    Intrinsics.checkNotNull(pattern2);
                    if (pattern2.matcher(mimeType).matches()) {
                        Intrinsics.checkNotNullParameter(mimeType2, "mimeType");
                        List<String> split = new Regex(RemoteSettings.FORWARD_SLASH_STRING).split(mimeType2, 0);
                        if (!split.isEmpty()) {
                            ListIterator<String> listIterator = split.listIterator(split.size());
                            while (listIterator.hasPrevious()) {
                                if (listIterator.previous().length() != 0) {
                                    emptyList = CollectionsKt.take(split, listIterator.nextIndex() + 1);
                                    break;
                                }
                            }
                        }
                        emptyList = CollectionsKt.emptyList();
                        String str7 = (String) emptyList.get(0);
                        String str8 = (String) emptyList.get(1);
                        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
                        ?? other = new Object();
                        List<String> split2 = new Regex(RemoteSettings.FORWARD_SLASH_STRING).split(mimeType, 0);
                        if (!split2.isEmpty()) {
                            ListIterator<String> listIterator2 = split2.listIterator(split2.size());
                            while (listIterator2.hasPrevious()) {
                                if (listIterator2.previous().length() != 0) {
                                    emptyList2 = CollectionsKt.take(split2, listIterator2.nextIndex() + 1);
                                    break;
                                }
                            }
                        }
                        emptyList2 = CollectionsKt.emptyList();
                        other.f8073a = (String) emptyList2.get(0);
                        other.f8074b = (String) emptyList2.get(1);
                        Intrinsics.checkNotNullParameter(other, "other");
                        i4 = Intrinsics.areEqual(str7, other.f8073a) ? 2 : 0;
                        if (Intrinsics.areEqual(str8, other.f8074b)) {
                            i4++;
                        }
                        i = i4;
                    }
                }
                i4 = -1;
                i = i4;
            } else {
                i = -1;
            }
            if (bundle != null || z3 || i > -1) {
                D d5 = new D(this, bundle, c0521a.f7908l, z3, i);
                if (d4 == null || d5.compareTo(d4) > 0) {
                    bundle3 = null;
                    e4 = this;
                    d4 = d5;
                }
            }
            bundle3 = null;
            e4 = this;
        }
        return d4;
    }

    public void h(Context context, AttributeSet attrs) {
        Object obj;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attrs, AbstractC0549a.f8112e);
        Intrinsics.checkNotNullExpressionValue(obtainAttributes, "context.resources.obtain…s, R.styleable.Navigator)");
        String string = obtainAttributes.getString(2);
        if (string == null) {
            this.h = 0;
            this.f7922c = null;
        } else {
            if (StringsKt.isBlank(string)) {
                throw new IllegalArgumentException("Cannot have an empty route");
            }
            String uriPattern = "android-app://androidx.navigation/".concat(string);
            this.h = uriPattern.hashCode();
            this.f7922c = null;
            Intrinsics.checkNotNullParameter(uriPattern, "uriPattern");
            Intrinsics.checkNotNullParameter(uriPattern, "uriPattern");
            a(new C0521A(uriPattern, null, null));
        }
        ArrayList arrayList = this.f7924e;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            String str = ((C0521A) obj).f7899a;
            String str2 = this.i;
            if (Intrinsics.areEqual(str, str2 != null ? "android-app://androidx.navigation/".concat(str2) : "")) {
                break;
            }
        }
        TypeIntrinsics.asMutableCollection(arrayList).remove(obj);
        this.i = string;
        if (obtainAttributes.hasValue(1)) {
            int resourceId = obtainAttributes.getResourceId(1, 0);
            this.h = resourceId;
            this.f7922c = null;
            this.f7922c = AbstractC0105a.x(context, resourceId);
        }
        this.f7923d = obtainAttributes.getText(0);
        Unit unit = Unit.INSTANCE;
        obtainAttributes.recycle();
    }

    public int hashCode() {
        Set<String> keySet;
        int i = this.h * 31;
        String str = this.i;
        int hashCode = i + (str != null ? str.hashCode() : 0);
        Iterator it = this.f7924e.iterator();
        while (it.hasNext()) {
            C0521A c0521a = (C0521A) it.next();
            int i4 = hashCode * 31;
            String str2 = c0521a.f7899a;
            int hashCode2 = (i4 + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = c0521a.f7900b;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = c0521a.f7901c;
            hashCode = hashCode3 + (str4 != null ? str4.hashCode() : 0);
        }
        s.l d4 = s.h.d(this.f7925f);
        while (d4.hasNext()) {
            C0529f c0529f = (C0529f) d4.next();
            int i5 = ((hashCode * 31) + c0529f.f7988a) * 31;
            K k4 = c0529f.f7989b;
            hashCode = i5 + (k4 != null ? k4.hashCode() : 0);
            Bundle bundle = c0529f.f7990c;
            if (bundle != null && (keySet = bundle.keySet()) != null) {
                Intrinsics.checkNotNullExpressionValue(keySet, "keySet()");
                for (String str5 : keySet) {
                    int i6 = hashCode * 31;
                    Bundle bundle2 = c0529f.f7990c;
                    Intrinsics.checkNotNull(bundle2);
                    Object obj = bundle2.get(str5);
                    hashCode = i6 + (obj != null ? obj.hashCode() : 0);
                }
            }
        }
        LinkedHashMap linkedHashMap = this.f7926g;
        for (String str6 : MapsKt.toMap(linkedHashMap).keySet()) {
            int d5 = com.google.android.gms.measurement.internal.a.d(str6, hashCode * 31, 31);
            Object obj2 = MapsKt.toMap(linkedHashMap).get(str6);
            hashCode = d5 + (obj2 != null ? obj2.hashCode() : 0);
        }
        return hashCode;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(");
        String str = this.f7922c;
        if (str == null) {
            sb.append("0x");
            sb.append(Integer.toHexString(this.h));
        } else {
            sb.append(str);
        }
        sb.append(")");
        String str2 = this.i;
        if (str2 != null && !StringsKt.isBlank(str2)) {
            sb.append(" route=");
            sb.append(this.i);
        }
        if (this.f7923d != null) {
            sb.append(" label=");
            sb.append(this.f7923d);
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "sb.toString()");
        return sb2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public E(V navigator) {
        this(m3.d.u(navigator.getClass()));
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        LinkedHashMap linkedHashMap = W.f7966b;
    }
}
