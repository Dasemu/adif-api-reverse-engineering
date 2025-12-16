package kotlin.reflect.jvm.internal;

import C.w;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.SortedMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.ClassBasedDeclarationContainer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.ReflectProperties;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectJavaClassFinderKt;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.RuntimeModuleData;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;

@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\n\b \u0018\u0000 <2\u00020\u0001:\u0003<=>B\u0005¢\u0006\u0002\u0010\u0002J*\u0010\f\u001a\u00020\r2\u0010\u0010\u000e\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0014\u0010\u0014\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00152\u0006\u0010\u0010\u001a\u00020\u0011J\u0014\u0010\u0016\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00152\u0006\u0010\u0010\u001a\u00020\u0011J \u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u0013J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u0011J\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u0011J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00042\u0006\u0010\u0019\u001a\u00020\"H&J\u0012\u0010#\u001a\u0004\u0018\u00010 2\u0006\u0010$\u001a\u00020%H&J\"\u0010&\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030'0\u00042\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0004J\u0016\u0010,\u001a\b\u0012\u0004\u0012\u00020 0\u00042\u0006\u0010\u0019\u001a\u00020\"H&J\u001a\u0010-\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0.2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0014\u0010/\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J$\u00100\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u00101\u001a\u00020%2\u0006\u00102\u001a\u00020%H\u0002JE\u00103\u001a\u0004\u0018\u00010\u0018*\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\u0019\u001a\u00020\u00112\u0010\u00104\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t052\n\u00106\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u00107\u001a\u00020\u0013H\u0002¢\u0006\u0002\u00108J(\u00109\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0015*\u0006\u0012\u0002\b\u00030\t2\u0010\u00104\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0.H\u0002J=\u0010:\u001a\u0004\u0018\u00010\u0018*\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\u0019\u001a\u00020\u00112\u0010\u00104\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t052\n\u00106\u001a\u0006\u0012\u0002\b\u00030\tH\u0002¢\u0006\u0002\u0010;R\u0018\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u0006\u0012\u0002\b\u00030\t8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006?"}, d2 = {"Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "Lkotlin/jvm/internal/ClassBasedDeclarationContainer;", "()V", "constructorDescriptors", "", "Lkotlin/reflect/jvm/internal/impl/descriptors/ConstructorDescriptor;", "getConstructorDescriptors", "()Ljava/util/Collection;", "methodOwner", "Ljava/lang/Class;", "getMethodOwner", "()Ljava/lang/Class;", "addParametersAndMasks", "", "result", "", "desc", "", "isConstructor", "", "findConstructorBySignature", "Ljava/lang/reflect/Constructor;", "findDefaultConstructor", "findDefaultMethod", "Ljava/lang/reflect/Method;", AppMeasurementSdk.ConditionalUserProperty.NAME, "isMember", "findFunctionDescriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "signature", "findMethodBySignature", "findPropertyDescriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "getFunctions", "Lkotlin/reflect/jvm/internal/impl/name/Name;", "getLocalProperty", FirebaseAnalytics.Param.INDEX, "", "getMembers", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "scope", "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/MemberScope;", "belonginess", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$MemberBelonginess;", "getProperties", "loadParameterTypes", "", "loadReturnType", "parseType", "begin", "end", "lookupMethod", "parameterTypes", "", "returnType", "isStaticDefault", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;Z)Ljava/lang/reflect/Method;", "tryGetConstructor", "tryGetMethod", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Method;", "Companion", "Data", "MemberBelonginess", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nKDeclarationContainerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KDeclarationContainerImpl.kt\nkotlin/reflect/jvm/internal/KDeclarationContainerImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 6 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,314:1\n1603#2,9:315\n1855#2:324\n1856#2:326\n1612#2:327\n766#2:328\n857#2,2:329\n1477#2:331\n1502#2,3:332\n1505#2,3:342\n766#2:345\n857#2,2:346\n766#2:348\n857#2,2:349\n1#3:325\n1#3:351\n372#4,7:335\n1282#5,2:352\n37#6,2:354\n37#6,2:356\n37#6,2:358\n*S KotlinDebug\n*F\n+ 1 KDeclarationContainerImpl.kt\nkotlin/reflect/jvm/internal/KDeclarationContainerImpl\n*L\n58#1:315,9\n58#1:324\n58#1:326\n58#1:327\n83#1:328\n83#1:329,2\n103#1:331\n103#1:332,3\n103#1:342,3\n128#1:345\n128#1:346,2\n142#1:348\n142#1:349,2\n58#1:325\n103#1:335,7\n197#1:352,2\n207#1:354,2\n215#1:356,2\n239#1:358,2\n*E\n"})
/* loaded from: classes3.dex */
public abstract class KDeclarationContainerImpl implements ClassBasedDeclarationContainer {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Class<?> DEFAULT_CONSTRUCTOR_MARKER = DefaultConstructorMarker.class;
    private static final Regex LOCAL_PROPERTY_SIGNATURE = new Regex("<v#(\\d+)>");

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u0012\u0012\u0002\b\u0003 \u0005*\b\u0012\u0002\b\u0003\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$Companion;", "", "()V", "DEFAULT_CONSTRUCTOR_MARKER", "Ljava/lang/Class;", "kotlin.jvm.PlatformType", "LOCAL_PROPERTY_SIGNATURE", "Lkotlin/text/Regex;", "getLOCAL_PROPERTY_SIGNATURE$kotlin_reflection", "()Lkotlin/text/Regex;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Regex getLOCAL_PROPERTY_SIGNATURE$kotlin_reflection() {
            return KDeclarationContainerImpl.LOCAL_PROPERTY_SIGNATURE;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b¦\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$Data;", "", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;)V", "moduleData", "Lkotlin/reflect/jvm/internal/impl/descriptors/runtime/components/RuntimeModuleData;", "getModuleData", "()Lorg/jetbrains/kotlin/descriptors/runtime/components/RuntimeModuleData;", "moduleData$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public abstract class Data {
        static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Data.class), "moduleData", "getModuleData()Lorg/jetbrains/kotlin/descriptors/runtime/components/RuntimeModuleData;"))};

        /* renamed from: moduleData$delegate, reason: from kotlin metadata */
        private final ReflectProperties.LazySoftVal moduleData;

        public Data() {
            this.moduleData = ReflectProperties.lazySoft(new Function0<RuntimeModuleData>() { // from class: kotlin.reflect.jvm.internal.KDeclarationContainerImpl$Data$moduleData$2
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final RuntimeModuleData invoke() {
                    return ModuleByClassLoaderKt.getOrCreateModule(KDeclarationContainerImpl.this.getJClass());
                }
            });
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final RuntimeModuleData getModuleData() {
            T value = this.moduleData.getValue(this, $$delegatedProperties[0]);
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            return (RuntimeModuleData) value;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0084\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$MemberBelonginess;", "", "(Ljava/lang/String;I)V", "accept", "", "member", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;", "DECLARED", "INHERITED", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class MemberBelonginess {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ MemberBelonginess[] $VALUES;
        public static final MemberBelonginess DECLARED = new MemberBelonginess("DECLARED", 0);
        public static final MemberBelonginess INHERITED = new MemberBelonginess("INHERITED", 1);

        private static final /* synthetic */ MemberBelonginess[] $values() {
            return new MemberBelonginess[]{DECLARED, INHERITED};
        }

        static {
            MemberBelonginess[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private MemberBelonginess(String str, int i) {
        }

        public static MemberBelonginess valueOf(String str) {
            return (MemberBelonginess) Enum.valueOf(MemberBelonginess.class, str);
        }

        public static MemberBelonginess[] values() {
            return (MemberBelonginess[]) $VALUES.clone();
        }

        public final boolean accept(CallableMemberDescriptor member) {
            Intrinsics.checkNotNullParameter(member, "member");
            return member.getKind().isReal() == (this == DECLARED);
        }
    }

    private final void addParametersAndMasks(List<Class<?>> result, String desc, boolean isConstructor) {
        List<Class<?>> loadParameterTypes = loadParameterTypes(desc);
        result.addAll(loadParameterTypes);
        int size = (loadParameterTypes.size() + 31) / 32;
        for (int i = 0; i < size; i++) {
            Class<?> TYPE = Integer.TYPE;
            Intrinsics.checkNotNullExpressionValue(TYPE, "TYPE");
            result.add(TYPE);
        }
        if (!isConstructor) {
            result.add(Object.class);
            return;
        }
        Class<?> DEFAULT_CONSTRUCTOR_MARKER2 = DEFAULT_CONSTRUCTOR_MARKER;
        result.remove(DEFAULT_CONSTRUCTOR_MARKER2);
        Intrinsics.checkNotNullExpressionValue(DEFAULT_CONSTRUCTOR_MARKER2, "DEFAULT_CONSTRUCTOR_MARKER");
        result.add(DEFAULT_CONSTRUCTOR_MARKER2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int findPropertyDescriptor$lambda$3(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Number) tmp0.invoke(obj, obj2)).intValue();
    }

    private final List<Class<?>> loadParameterTypes(String desc) {
        boolean contains$default;
        int indexOf$default;
        int i;
        ArrayList arrayList = new ArrayList();
        int i4 = 1;
        while (desc.charAt(i4) != ')') {
            int i5 = i4;
            while (desc.charAt(i5) == '[') {
                i5++;
            }
            char charAt = desc.charAt(i5);
            contains$default = StringsKt__StringsKt.contains$default("VZCBSIFJD", charAt, false, 2, (Object) null);
            if (contains$default) {
                i = i5 + 1;
            } else {
                if (charAt != 'L') {
                    throw new KotlinReflectionInternalError("Unknown type prefix in the method signature: ".concat(desc));
                }
                indexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) desc, ';', i4, false, 4, (Object) null);
                i = indexOf$default + 1;
            }
            arrayList.add(parseType(desc, i4, i));
            i4 = i;
        }
        return arrayList;
    }

    private final Class<?> loadReturnType(String desc) {
        int indexOf$default;
        indexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) desc, ')', 0, false, 6, (Object) null);
        return parseType(desc, indexOf$default + 1, desc.length());
    }

    private final Method lookupMethod(Class<?> cls, String str, Class<?>[] clsArr, Class<?> cls2, boolean z3) {
        KDeclarationContainerImpl kDeclarationContainerImpl;
        String str2;
        Class<?>[] clsArr2;
        Class<?> cls3;
        boolean z4;
        Class<?> tryLoadClass;
        if (z3) {
            clsArr[0] = cls;
        }
        Method tryGetMethod = tryGetMethod(cls, str, clsArr, cls2);
        if (tryGetMethod != null) {
            return tryGetMethod;
        }
        Class<? super Object> superclass = cls.getSuperclass();
        if (superclass != null) {
            Method lookupMethod = lookupMethod(superclass, str, clsArr, cls2, z3);
            kDeclarationContainerImpl = this;
            str2 = str;
            clsArr2 = clsArr;
            cls3 = cls2;
            z4 = z3;
            if (lookupMethod != null) {
                return lookupMethod;
            }
        } else {
            kDeclarationContainerImpl = this;
            str2 = str;
            clsArr2 = clsArr;
            cls3 = cls2;
            z4 = z3;
        }
        Class<?>[] interfaces = cls.getInterfaces();
        Intrinsics.checkNotNullExpressionValue(interfaces, "getInterfaces(...)");
        for (Class<?> cls4 : interfaces) {
            Intrinsics.checkNotNull(cls4);
            Method lookupMethod2 = kDeclarationContainerImpl.lookupMethod(cls4, str2, clsArr2, cls3, z4);
            if (lookupMethod2 != null) {
                return lookupMethod2;
            }
            if (z4 && (tryLoadClass = ReflectJavaClassFinderKt.tryLoadClass(ReflectClassUtilKt.getSafeClassLoader(cls4), cls4.getName().concat("$DefaultImpls"))) != null) {
                clsArr2[0] = cls4;
                Method tryGetMethod2 = kDeclarationContainerImpl.tryGetMethod(tryLoadClass, str2, clsArr2, cls3);
                if (tryGetMethod2 != null) {
                    return tryGetMethod2;
                }
            }
        }
        return null;
    }

    private final Class<?> parseType(String desc, int begin, int end) {
        String replace$default;
        char charAt = desc.charAt(begin);
        if (charAt == 'L') {
            ClassLoader safeClassLoader = ReflectClassUtilKt.getSafeClassLoader(getJClass());
            String substring = desc.substring(begin + 1, end - 1);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            replace$default = StringsKt__StringsJVMKt.replace$default(substring, '/', '.', false, 4, (Object) null);
            Class<?> loadClass = safeClassLoader.loadClass(replace$default);
            Intrinsics.checkNotNullExpressionValue(loadClass, "loadClass(...)");
            return loadClass;
        }
        if (charAt == '[') {
            return UtilKt.createArrayType(parseType(desc, begin + 1, end));
        }
        if (charAt == 'V') {
            Class<?> TYPE = Void.TYPE;
            Intrinsics.checkNotNullExpressionValue(TYPE, "TYPE");
            return TYPE;
        }
        if (charAt == 'Z') {
            return Boolean.TYPE;
        }
        if (charAt == 'C') {
            return Character.TYPE;
        }
        if (charAt == 'B') {
            return Byte.TYPE;
        }
        if (charAt == 'S') {
            return Short.TYPE;
        }
        if (charAt == 'I') {
            return Integer.TYPE;
        }
        if (charAt == 'F') {
            return Float.TYPE;
        }
        if (charAt == 'J') {
            return Long.TYPE;
        }
        if (charAt == 'D') {
            return Double.TYPE;
        }
        throw new KotlinReflectionInternalError("Unknown type prefix in the method signature: ".concat(desc));
    }

    private final Constructor<?> tryGetConstructor(Class<?> cls, List<? extends Class<?>> list) {
        try {
            Class[] clsArr = (Class[]) list.toArray(new Class[0]);
            return cls.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    private final Method tryGetMethod(Class<?> cls, String str, Class<?>[] clsArr, Class<?> cls2) {
        Method declaredMethod;
        try {
            declaredMethod = cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (NoSuchMethodException unused) {
        }
        if (Intrinsics.areEqual(declaredMethod.getReturnType(), cls2)) {
            return declaredMethod;
        }
        Method[] declaredMethods = cls.getDeclaredMethods();
        Intrinsics.checkNotNullExpressionValue(declaredMethods, "getDeclaredMethods(...)");
        for (Method method : declaredMethods) {
            if (Intrinsics.areEqual(method.getName(), str) && Intrinsics.areEqual(method.getReturnType(), cls2) && Arrays.equals(method.getParameterTypes(), clsArr)) {
                return method;
            }
        }
        return null;
    }

    public final Constructor<?> findConstructorBySignature(String desc) {
        Intrinsics.checkNotNullParameter(desc, "desc");
        return tryGetConstructor(getJClass(), loadParameterTypes(desc));
    }

    public final Constructor<?> findDefaultConstructor(String desc) {
        Intrinsics.checkNotNullParameter(desc, "desc");
        Class<?> jClass = getJClass();
        ArrayList arrayList = new ArrayList();
        addParametersAndMasks(arrayList, desc, true);
        Unit unit = Unit.INSTANCE;
        return tryGetConstructor(jClass, arrayList);
    }

    public final Method findDefaultMethod(String name, String desc, boolean isMember) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(desc, "desc");
        if (Intrinsics.areEqual(name, "<init>")) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (isMember) {
            arrayList.add(getJClass());
        }
        addParametersAndMasks(arrayList, desc, false);
        return lookupMethod(getMethodOwner(), w.n(name, "$default"), (Class[]) arrayList.toArray(new Class[0]), loadReturnType(desc), isMember);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00b7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor findFunctionDescriptor(java.lang.String r11, java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.KDeclarationContainerImpl.findFunctionDescriptor(java.lang.String, java.lang.String):kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor");
    }

    public final Method findMethodBySignature(String name, String desc) {
        Method lookupMethod;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(desc, "desc");
        if (Intrinsics.areEqual(name, "<init>")) {
            return null;
        }
        Class<?>[] clsArr = (Class[]) loadParameterTypes(desc).toArray(new Class[0]);
        Class<?> loadReturnType = loadReturnType(desc);
        Method lookupMethod2 = lookupMethod(getMethodOwner(), name, clsArr, loadReturnType, false);
        if (lookupMethod2 != null) {
            return lookupMethod2;
        }
        if (!getMethodOwner().isInterface() || (lookupMethod = lookupMethod(Object.class, name, clsArr, loadReturnType, false)) == null) {
            return null;
        }
        return lookupMethod;
    }

    public final PropertyDescriptor findPropertyDescriptor(String name, String signature) {
        SortedMap sortedMap;
        String joinToString$default;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(signature, "signature");
        MatchResult matchEntire = LOCAL_PROPERTY_SIGNATURE.matchEntire(signature);
        if (matchEntire != null) {
            String str = matchEntire.getDestructured().getMatch().getGroupValues().get(1);
            PropertyDescriptor localProperty = getLocalProperty(Integer.parseInt(str));
            if (localProperty != null) {
                return localProperty;
            }
            StringBuilder p = com.google.android.gms.measurement.internal.a.p("Local property #", str, " not found in ");
            p.append(getJClass());
            throw new KotlinReflectionInternalError(p.toString());
        }
        Name identifier = Name.identifier(name);
        Intrinsics.checkNotNullExpressionValue(identifier, "identifier(...)");
        Collection<PropertyDescriptor> properties = getProperties(identifier);
        ArrayList arrayList = new ArrayList();
        for (Object obj : properties) {
            if (Intrinsics.areEqual(RuntimeTypeMapper.INSTANCE.mapPropertySignature((PropertyDescriptor) obj).getString(), signature)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            throw new KotlinReflectionInternalError("Property '" + name + "' (JVM signature: " + signature + ") not resolved in " + this);
        }
        if (arrayList.size() == 1) {
            return (PropertyDescriptor) CollectionsKt.single((List) arrayList);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            DescriptorVisibility visibility = ((PropertyDescriptor) next).getVisibility();
            Object obj2 = linkedHashMap.get(visibility);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(visibility, obj2);
            }
            ((List) obj2).add(next);
        }
        final KDeclarationContainerImpl$findPropertyDescriptor$mostVisibleProperties$2 kDeclarationContainerImpl$findPropertyDescriptor$mostVisibleProperties$2 = new Function2<DescriptorVisibility, DescriptorVisibility, Integer>() { // from class: kotlin.reflect.jvm.internal.KDeclarationContainerImpl$findPropertyDescriptor$mostVisibleProperties$2
            @Override // kotlin.jvm.functions.Function2
            public final Integer invoke(DescriptorVisibility descriptorVisibility, DescriptorVisibility descriptorVisibility2) {
                Integer compare = DescriptorVisibilities.compare(descriptorVisibility, descriptorVisibility2);
                return Integer.valueOf(compare == null ? 0 : compare.intValue());
            }
        };
        sortedMap = MapsKt__MapsJVMKt.toSortedMap(linkedHashMap, new Comparator(kDeclarationContainerImpl$findPropertyDescriptor$mostVisibleProperties$2) { // from class: kotlin.reflect.jvm.internal.KDeclarationContainerImpl$$Lambda$0
            private final Function2 arg$0;

            {
                this.arg$0 = kDeclarationContainerImpl$findPropertyDescriptor$mostVisibleProperties$2;
            }

            @Override // java.util.Comparator
            public int compare(Object obj3, Object obj4) {
                int findPropertyDescriptor$lambda$3;
                findPropertyDescriptor$lambda$3 = KDeclarationContainerImpl.findPropertyDescriptor$lambda$3(this.arg$0, obj3, obj4);
                return findPropertyDescriptor$lambda$3;
            }
        });
        Collection values = sortedMap.values();
        Intrinsics.checkNotNullExpressionValue(values, "<get-values>(...)");
        List list = (List) CollectionsKt.last(values);
        if (list.size() == 1) {
            Intrinsics.checkNotNull(list);
            return (PropertyDescriptor) CollectionsKt.first(list);
        }
        Name identifier2 = Name.identifier(name);
        Intrinsics.checkNotNullExpressionValue(identifier2, "identifier(...)");
        joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(getProperties(identifier2), "\n", null, null, 0, null, new Function1<PropertyDescriptor, CharSequence>() { // from class: kotlin.reflect.jvm.internal.KDeclarationContainerImpl$findPropertyDescriptor$allMembers$1
            @Override // kotlin.jvm.functions.Function1
            public final CharSequence invoke(PropertyDescriptor descriptor) {
                Intrinsics.checkNotNullParameter(descriptor, "descriptor");
                return DescriptorRenderer.DEBUG_TEXT.render(descriptor) + " | " + RuntimeTypeMapper.INSTANCE.mapPropertySignature(descriptor).getString();
            }
        }, 30, null);
        StringBuilder sb = new StringBuilder("Property '");
        sb.append(name);
        sb.append("' (JVM signature: ");
        sb.append(signature);
        sb.append(") not resolved in ");
        sb.append(this);
        sb.append(':');
        sb.append(joinToString$default.length() == 0 ? " no members found" : "\n".concat(joinToString$default));
        throw new KotlinReflectionInternalError(sb.toString());
    }

    public abstract Collection<ConstructorDescriptor> getConstructorDescriptors();

    public abstract Collection<FunctionDescriptor> getFunctions(Name name);

    public abstract PropertyDescriptor getLocalProperty(int index);

    /* JADX WARN: Removed duplicated region for block: B:12:0x0051 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0020 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Collection<kotlin.reflect.jvm.internal.KCallableImpl<?>> getMembers(kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope r7, kotlin.reflect.jvm.internal.KDeclarationContainerImpl.MemberBelonginess r8) {
        /*
            r6 = this;
            java.lang.String r0 = "scope"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "belonginess"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            kotlin.reflect.jvm.internal.KDeclarationContainerImpl$getMembers$visitor$1 r0 = new kotlin.reflect.jvm.internal.KDeclarationContainerImpl$getMembers$visitor$1
            r0.<init>(r6)
            r6 = 3
            r1 = 0
            java.util.Collection r6 = kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope.DefaultImpls.getContributedDescriptors$default(r7, r1, r1, r6, r1)
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r6 = r6.iterator()
        L20:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L55
            java.lang.Object r2 = r6.next()
            kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor r2 = (kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor) r2
            boolean r3 = r2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
            if (r3 == 0) goto L4e
            r3 = r2
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r3 = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) r3
            kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility r4 = r3.getVisibility()
            kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility r5 = kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.INVISIBLE_FAKE
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r5)
            if (r4 != 0) goto L4e
            boolean r3 = r8.accept(r3)
            if (r3 == 0) goto L4e
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            java.lang.Object r2 = r2.accept(r0, r3)
            kotlin.reflect.jvm.internal.KCallableImpl r2 = (kotlin.reflect.jvm.internal.KCallableImpl) r2
            goto L4f
        L4e:
            r2 = r1
        L4f:
            if (r2 == 0) goto L20
            r7.add(r2)
            goto L20
        L55:
            java.util.List r6 = kotlin.collections.CollectionsKt.toList(r7)
            java.util.Collection r6 = (java.util.Collection) r6
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.KDeclarationContainerImpl.getMembers(kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, kotlin.reflect.jvm.internal.KDeclarationContainerImpl$MemberBelonginess):java.util.Collection");
    }

    public Class<?> getMethodOwner() {
        Class<?> wrapperByPrimitive = ReflectClassUtilKt.getWrapperByPrimitive(getJClass());
        return wrapperByPrimitive == null ? getJClass() : wrapperByPrimitive;
    }

    public abstract Collection<PropertyDescriptor> getProperties(Name name);
}
