package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import C.w;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.Typography;

@SourceDebugExtension({"SMAP\nJvmNameResolverBase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmNameResolverBase.kt\norg/jetbrains/kotlin/metadata/jvm/deserialization/JvmNameResolverBase\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,106:1\n1208#2,2:107\n1238#2,4:109\n*S KotlinDebug\n*F\n+ 1 JvmNameResolverBase.kt\norg/jetbrains/kotlin/metadata/jvm/deserialization/JvmNameResolverBase\n*L\n101#1:107,2\n101#1:109,4\n*E\n"})
/* loaded from: classes3.dex */
public class JvmNameResolverBase implements NameResolver {
    public static final Companion Companion = new Companion(null);
    private static final List<String> PREDEFINED_STRINGS;
    private static final Map<String, Integer> PREDEFINED_STRINGS_MAP;

    /* renamed from: kotlin, reason: collision with root package name */
    private static final String f7136kotlin;
    private final Set<Integer> localNameIndices;
    private final List<JvmProtoBuf.StringTableTypes.Record> records;
    private final String[] strings;

    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* loaded from: classes3.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[JvmProtoBuf.StringTableTypes.Record.Operation.values().length];
            try {
                iArr[JvmProtoBuf.StringTableTypes.Record.Operation.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[JvmProtoBuf.StringTableTypes.Record.Operation.INTERNAL_TO_CLASS_ID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[JvmProtoBuf.StringTableTypes.Record.Operation.DESC_TO_CLASS_ID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        String joinToString$default;
        int collectionSizeOrDefault;
        joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(CollectionsKt.listOf((Object[]) new Character[]{'k', 'o', 't', 'l', 'i', 'n'}), "", null, null, 0, null, null, 62, null);
        f7136kotlin = joinToString$default;
        List<String> listOf = CollectionsKt.listOf((Object[]) new String[]{w.n(joinToString$default, "/Any"), w.n(joinToString$default, "/Nothing"), w.n(joinToString$default, "/Unit"), w.n(joinToString$default, "/Throwable"), w.n(joinToString$default, "/Number"), w.n(joinToString$default, "/Byte"), w.n(joinToString$default, "/Double"), w.n(joinToString$default, "/Float"), w.n(joinToString$default, "/Int"), w.n(joinToString$default, "/Long"), w.n(joinToString$default, "/Short"), w.n(joinToString$default, "/Boolean"), w.n(joinToString$default, "/Char"), w.n(joinToString$default, "/CharSequence"), w.n(joinToString$default, "/String"), w.n(joinToString$default, "/Comparable"), w.n(joinToString$default, "/Enum"), w.n(joinToString$default, "/Array"), w.n(joinToString$default, "/ByteArray"), w.n(joinToString$default, "/DoubleArray"), w.n(joinToString$default, "/FloatArray"), w.n(joinToString$default, "/IntArray"), w.n(joinToString$default, "/LongArray"), w.n(joinToString$default, "/ShortArray"), w.n(joinToString$default, "/BooleanArray"), w.n(joinToString$default, "/CharArray"), w.n(joinToString$default, "/Cloneable"), w.n(joinToString$default, "/Annotation"), w.n(joinToString$default, "/collections/Iterable"), w.n(joinToString$default, "/collections/MutableIterable"), w.n(joinToString$default, "/collections/Collection"), w.n(joinToString$default, "/collections/MutableCollection"), w.n(joinToString$default, "/collections/List"), w.n(joinToString$default, "/collections/MutableList"), w.n(joinToString$default, "/collections/Set"), w.n(joinToString$default, "/collections/MutableSet"), w.n(joinToString$default, "/collections/Map"), w.n(joinToString$default, "/collections/MutableMap"), w.n(joinToString$default, "/collections/Map.Entry"), w.n(joinToString$default, "/collections/MutableMap.MutableEntry"), w.n(joinToString$default, "/collections/Iterator"), w.n(joinToString$default, "/collections/MutableIterator"), w.n(joinToString$default, "/collections/ListIterator"), w.n(joinToString$default, "/collections/MutableListIterator")});
        PREDEFINED_STRINGS = listOf;
        Iterable<IndexedValue> withIndex = CollectionsKt.withIndex(listOf);
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(withIndex, 10);
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(collectionSizeOrDefault), 16));
        for (IndexedValue indexedValue : withIndex) {
            linkedHashMap.put((String) indexedValue.getValue(), Integer.valueOf(indexedValue.getIndex()));
        }
        PREDEFINED_STRINGS_MAP = linkedHashMap;
    }

    public JvmNameResolverBase(String[] strings, Set<Integer> localNameIndices, List<JvmProtoBuf.StringTableTypes.Record> records) {
        Intrinsics.checkNotNullParameter(strings, "strings");
        Intrinsics.checkNotNullParameter(localNameIndices, "localNameIndices");
        Intrinsics.checkNotNullParameter(records, "records");
        this.strings = strings;
        this.localNameIndices = localNameIndices;
        this.records = records;
    }

    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver
    public String getQualifiedClassName(int i) {
        return getString(i);
    }

    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver
    public String getString(int i) {
        String str;
        JvmProtoBuf.StringTableTypes.Record record = this.records.get(i);
        if (record.hasString()) {
            str = record.getString();
        } else {
            if (record.hasPredefinedIndex()) {
                List<String> list = PREDEFINED_STRINGS;
                int size = list.size();
                int predefinedIndex = record.getPredefinedIndex();
                if (predefinedIndex >= 0 && predefinedIndex < size) {
                    str = list.get(record.getPredefinedIndex());
                }
            }
            str = this.strings[i];
        }
        if (record.getSubstringIndexCount() >= 2) {
            List<Integer> substringIndexList = record.getSubstringIndexList();
            Intrinsics.checkNotNull(substringIndexList);
            Integer num = substringIndexList.get(0);
            Integer num2 = substringIndexList.get(1);
            Intrinsics.checkNotNull(num);
            if (num.intValue() >= 0) {
                int intValue = num.intValue();
                Intrinsics.checkNotNull(num2);
                if (intValue <= num2.intValue() && num2.intValue() <= str.length()) {
                    Intrinsics.checkNotNull(str);
                    str = str.substring(num.intValue(), num2.intValue());
                    Intrinsics.checkNotNullExpressionValue(str, "substring(...)");
                }
            }
        }
        if (record.getReplaceCharCount() >= 2) {
            List<Integer> replaceCharList = record.getReplaceCharList();
            Intrinsics.checkNotNull(replaceCharList);
            Integer num3 = replaceCharList.get(0);
            Integer num4 = replaceCharList.get(1);
            Intrinsics.checkNotNull(str);
            str = StringsKt__StringsJVMKt.replace$default(str, (char) num3.intValue(), (char) num4.intValue(), false, 4, (Object) null);
        }
        JvmProtoBuf.StringTableTypes.Record.Operation operation = record.getOperation();
        if (operation == null) {
            operation = JvmProtoBuf.StringTableTypes.Record.Operation.NONE;
        }
        int i4 = WhenMappings.$EnumSwitchMapping$0[operation.ordinal()];
        if (i4 == 2) {
            Intrinsics.checkNotNull(str);
            str = StringsKt__StringsJVMKt.replace$default(str, Typography.dollar, '.', false, 4, (Object) null);
        } else if (i4 == 3) {
            if (str.length() >= 2) {
                Intrinsics.checkNotNull(str);
                str = str.substring(1, str.length() - 1);
                Intrinsics.checkNotNullExpressionValue(str, "substring(...)");
            }
            Intrinsics.checkNotNull(str);
            str = StringsKt__StringsJVMKt.replace$default(str, Typography.dollar, '.', false, 4, (Object) null);
        }
        Intrinsics.checkNotNull(str);
        return str;
    }

    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver
    public boolean isLocalClassName(int i) {
        return this.localNameIndices.contains(Integer.valueOf(i));
    }
}
