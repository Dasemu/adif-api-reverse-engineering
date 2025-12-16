package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Type;
import u.AbstractC0629f;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: androidx.datastore.preferences.protobuf.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0126q {

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC0126q f2954b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC0126q f2955c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC0126q[] f2956d;

    /* renamed from: e, reason: collision with root package name */
    public static final Type[] f2957e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ EnumC0126q[] f2958f;

    /* renamed from: a, reason: collision with root package name */
    public final int f2959a;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC0126q EF0;

    static {
        B b4 = B.DOUBLE;
        EnumC0126q enumC0126q = new EnumC0126q("DOUBLE", 0, 0, 1, b4);
        B b5 = B.FLOAT;
        EnumC0126q enumC0126q2 = new EnumC0126q("FLOAT", 1, 1, 1, b5);
        B b6 = B.LONG;
        EnumC0126q enumC0126q3 = new EnumC0126q("INT64", 2, 2, 1, b6);
        EnumC0126q enumC0126q4 = new EnumC0126q("UINT64", 3, 3, 1, b6);
        B b7 = B.INT;
        EnumC0126q enumC0126q5 = new EnumC0126q("INT32", 4, 4, 1, b7);
        EnumC0126q enumC0126q6 = new EnumC0126q("FIXED64", 5, 5, 1, b6);
        EnumC0126q enumC0126q7 = new EnumC0126q("FIXED32", 6, 6, 1, b7);
        B b8 = B.BOOLEAN;
        EnumC0126q enumC0126q8 = new EnumC0126q("BOOL", 7, 7, 1, b8);
        B b9 = B.STRING;
        EnumC0126q enumC0126q9 = new EnumC0126q("STRING", 8, 8, 1, b9);
        B b10 = B.MESSAGE;
        EnumC0126q enumC0126q10 = new EnumC0126q("MESSAGE", 9, 9, 1, b10);
        B b11 = B.BYTE_STRING;
        EnumC0126q enumC0126q11 = new EnumC0126q("BYTES", 10, 10, 1, b11);
        EnumC0126q enumC0126q12 = new EnumC0126q("UINT32", 11, 11, 1, b7);
        B b12 = B.ENUM;
        EnumC0126q enumC0126q13 = new EnumC0126q("ENUM", 12, 12, 1, b12);
        EnumC0126q enumC0126q14 = new EnumC0126q("SFIXED32", 13, 13, 1, b7);
        EnumC0126q enumC0126q15 = new EnumC0126q("SFIXED64", 14, 14, 1, b6);
        EnumC0126q enumC0126q16 = new EnumC0126q("SINT32", 15, 15, 1, b7);
        EnumC0126q enumC0126q17 = new EnumC0126q("SINT64", 16, 16, 1, b6);
        EnumC0126q enumC0126q18 = new EnumC0126q("GROUP", 17, 17, 1, b10);
        EnumC0126q enumC0126q19 = new EnumC0126q("DOUBLE_LIST", 18, 18, 2, b4);
        EnumC0126q enumC0126q20 = new EnumC0126q("FLOAT_LIST", 19, 19, 2, b5);
        EnumC0126q enumC0126q21 = new EnumC0126q("INT64_LIST", 20, 20, 2, b6);
        EnumC0126q enumC0126q22 = new EnumC0126q("UINT64_LIST", 21, 21, 2, b6);
        EnumC0126q enumC0126q23 = new EnumC0126q("INT32_LIST", 22, 22, 2, b7);
        EnumC0126q enumC0126q24 = new EnumC0126q("FIXED64_LIST", 23, 23, 2, b6);
        EnumC0126q enumC0126q25 = new EnumC0126q("FIXED32_LIST", 24, 24, 2, b7);
        EnumC0126q enumC0126q26 = new EnumC0126q("BOOL_LIST", 25, 25, 2, b8);
        EnumC0126q enumC0126q27 = new EnumC0126q("STRING_LIST", 26, 26, 2, b9);
        EnumC0126q enumC0126q28 = new EnumC0126q("MESSAGE_LIST", 27, 27, 2, b10);
        EnumC0126q enumC0126q29 = new EnumC0126q("BYTES_LIST", 28, 28, 2, b11);
        EnumC0126q enumC0126q30 = new EnumC0126q("UINT32_LIST", 29, 29, 2, b7);
        EnumC0126q enumC0126q31 = new EnumC0126q("ENUM_LIST", 30, 30, 2, b12);
        EnumC0126q enumC0126q32 = new EnumC0126q("SFIXED32_LIST", 31, 31, 2, b7);
        EnumC0126q enumC0126q33 = new EnumC0126q("SFIXED64_LIST", 32, 32, 2, b6);
        EnumC0126q enumC0126q34 = new EnumC0126q("SINT32_LIST", 33, 33, 2, b7);
        EnumC0126q enumC0126q35 = new EnumC0126q("SINT64_LIST", 34, 34, 2, b6);
        EnumC0126q enumC0126q36 = new EnumC0126q("DOUBLE_LIST_PACKED", 35, 35, 3, b4);
        f2954b = enumC0126q36;
        EnumC0126q enumC0126q37 = new EnumC0126q("FLOAT_LIST_PACKED", 36, 36, 3, b5);
        EnumC0126q enumC0126q38 = new EnumC0126q("INT64_LIST_PACKED", 37, 37, 3, b6);
        EnumC0126q enumC0126q39 = new EnumC0126q("UINT64_LIST_PACKED", 38, 38, 3, b6);
        EnumC0126q enumC0126q40 = new EnumC0126q("INT32_LIST_PACKED", 39, 39, 3, b7);
        EnumC0126q enumC0126q41 = new EnumC0126q("FIXED64_LIST_PACKED", 40, 40, 3, b6);
        EnumC0126q enumC0126q42 = new EnumC0126q("FIXED32_LIST_PACKED", 41, 41, 3, b7);
        EnumC0126q enumC0126q43 = new EnumC0126q("BOOL_LIST_PACKED", 42, 42, 3, b8);
        EnumC0126q enumC0126q44 = new EnumC0126q("UINT32_LIST_PACKED", 43, 43, 3, b7);
        EnumC0126q enumC0126q45 = new EnumC0126q("ENUM_LIST_PACKED", 44, 44, 3, b12);
        EnumC0126q enumC0126q46 = new EnumC0126q("SFIXED32_LIST_PACKED", 45, 45, 3, b7);
        EnumC0126q enumC0126q47 = new EnumC0126q("SFIXED64_LIST_PACKED", 46, 46, 3, b6);
        EnumC0126q enumC0126q48 = new EnumC0126q("SINT32_LIST_PACKED", 47, 47, 3, b7);
        EnumC0126q enumC0126q49 = new EnumC0126q("SINT64_LIST_PACKED", 48, 48, 3, b6);
        f2955c = enumC0126q49;
        f2958f = new EnumC0126q[]{enumC0126q, enumC0126q2, enumC0126q3, enumC0126q4, enumC0126q5, enumC0126q6, enumC0126q7, enumC0126q8, enumC0126q9, enumC0126q10, enumC0126q11, enumC0126q12, enumC0126q13, enumC0126q14, enumC0126q15, enumC0126q16, enumC0126q17, enumC0126q18, enumC0126q19, enumC0126q20, enumC0126q21, enumC0126q22, enumC0126q23, enumC0126q24, enumC0126q25, enumC0126q26, enumC0126q27, enumC0126q28, enumC0126q29, enumC0126q30, enumC0126q31, enumC0126q32, enumC0126q33, enumC0126q34, enumC0126q35, enumC0126q36, enumC0126q37, enumC0126q38, enumC0126q39, enumC0126q40, enumC0126q41, enumC0126q42, enumC0126q43, enumC0126q44, enumC0126q45, enumC0126q46, enumC0126q47, enumC0126q48, enumC0126q49, new EnumC0126q("GROUP_LIST", 49, 49, 2, b10), new EnumC0126q("MAP", 50, 50, 4, B.VOID)};
        f2957e = new Type[0];
        EnumC0126q[] values = values();
        f2956d = new EnumC0126q[values.length];
        for (EnumC0126q enumC0126q50 : values) {
            f2956d[enumC0126q50.f2959a] = enumC0126q50;
        }
    }

    public EnumC0126q(String str, int i, int i4, int i5, B b4) {
        this.f2959a = i4;
        int b5 = AbstractC0629f.b(i5);
        if (b5 == 1) {
            b4.getClass();
        } else if (b5 == 3) {
            b4.getClass();
        }
        if (i5 == 1) {
            b4.ordinal();
        }
    }

    public static EnumC0126q valueOf(String str) {
        return (EnumC0126q) Enum.valueOf(EnumC0126q.class, str);
    }

    public static EnumC0126q[] values() {
        return (EnumC0126q[]) f2958f.clone();
    }
}
