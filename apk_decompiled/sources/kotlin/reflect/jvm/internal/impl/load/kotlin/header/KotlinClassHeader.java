package kotlin.reflect.jvm.internal.impl.load.kotlin.header;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;

@SourceDebugExtension({"SMAP\nKotlinClassHeader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KotlinClassHeader.kt\norg/jetbrains/kotlin/load/kotlin/header/KotlinClassHeader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,78:1\n1#2:79\n*E\n"})
/* loaded from: classes3.dex */
public final class KotlinClassHeader {
    private final String[] data;
    private final int extraInt;
    private final String extraString;
    private final String[] incompatibleData;
    private final Kind kind;
    private final JvmMetadataVersion metadataVersion;
    private final String packageName;
    private final byte[] serializedIr;
    private final String[] strings;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @SourceDebugExtension({"SMAP\nKotlinClassHeader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KotlinClassHeader.kt\norg/jetbrains/kotlin/load/kotlin/header/KotlinClassHeader$Kind\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,78:1\n8541#2,2:79\n8801#2,4:81\n*S KotlinDebug\n*F\n+ 1 KotlinClassHeader.kt\norg/jetbrains/kotlin/load/kotlin/header/KotlinClassHeader$Kind\n*L\n34#1:79,2\n34#1:81,4\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class Kind {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Kind[] $VALUES;
        public static final Companion Companion;
        private static final Map<Integer, Kind> entryById;
        private final int id;
        public static final Kind UNKNOWN = new Kind("UNKNOWN", 0, 0);
        public static final Kind CLASS = new Kind("CLASS", 1, 1);
        public static final Kind FILE_FACADE = new Kind("FILE_FACADE", 2, 2);
        public static final Kind SYNTHETIC_CLASS = new Kind("SYNTHETIC_CLASS", 3, 3);
        public static final Kind MULTIFILE_CLASS = new Kind("MULTIFILE_CLASS", 4, 4);
        public static final Kind MULTIFILE_CLASS_PART = new Kind("MULTIFILE_CLASS_PART", 5, 5);

        /* loaded from: classes3.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            public final Kind getById(int i) {
                Kind kind = (Kind) Kind.entryById.get(Integer.valueOf(i));
                return kind == null ? Kind.UNKNOWN : kind;
            }

            private Companion() {
            }
        }

        private static final /* synthetic */ Kind[] $values() {
            return new Kind[]{UNKNOWN, CLASS, FILE_FACADE, SYNTHETIC_CLASS, MULTIFILE_CLASS, MULTIFILE_CLASS_PART};
        }

        static {
            Kind[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
            Companion = new Companion(null);
            Kind[] values = values();
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(values.length), 16));
            for (Kind kind : values) {
                linkedHashMap.put(Integer.valueOf(kind.id), kind);
            }
            entryById = linkedHashMap;
        }

        private Kind(String str, int i, int i4) {
            this.id = i4;
        }

        @JvmStatic
        public static final Kind getById(int i) {
            return Companion.getById(i);
        }

        public static Kind valueOf(String str) {
            return (Kind) Enum.valueOf(Kind.class, str);
        }

        public static Kind[] values() {
            return (Kind[]) $VALUES.clone();
        }
    }

    public KotlinClassHeader(Kind kind, JvmMetadataVersion metadataVersion, String[] strArr, String[] strArr2, String[] strArr3, String str, int i, String str2, byte[] bArr) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(metadataVersion, "metadataVersion");
        this.kind = kind;
        this.metadataVersion = metadataVersion;
        this.data = strArr;
        this.incompatibleData = strArr2;
        this.strings = strArr3;
        this.extraString = str;
        this.extraInt = i;
        this.packageName = str2;
        this.serializedIr = bArr;
    }

    private final boolean has(int i, int i4) {
        return (i & i4) != 0;
    }

    public final String[] getData() {
        return this.data;
    }

    public final String[] getIncompatibleData() {
        return this.incompatibleData;
    }

    public final Kind getKind() {
        return this.kind;
    }

    public final JvmMetadataVersion getMetadataVersion() {
        return this.metadataVersion;
    }

    public final String getMultifileClassName() {
        String str = this.extraString;
        if (this.kind == Kind.MULTIFILE_CLASS_PART) {
            return str;
        }
        return null;
    }

    public final List<String> getMultifilePartNames() {
        String[] strArr = this.data;
        if (this.kind != Kind.MULTIFILE_CLASS) {
            strArr = null;
        }
        List<String> asList = strArr != null ? ArraysKt.asList(strArr) : null;
        return asList == null ? CollectionsKt.emptyList() : asList;
    }

    public final String[] getStrings() {
        return this.strings;
    }

    public final boolean isPreRelease() {
        return has(this.extraInt, 2);
    }

    public final boolean isUnstableFirBinary() {
        return has(this.extraInt, 64) && !has(this.extraInt, 32);
    }

    public final boolean isUnstableJvmIrBinary() {
        return has(this.extraInt, 16) && !has(this.extraInt, 32);
    }

    public String toString() {
        return this.kind + " version=" + this.metadataVersion;
    }
}
