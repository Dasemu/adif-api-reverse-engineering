package kotlin.reflect.jvm.internal.impl.util;

import java.util.Map;
import java.util.Set;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.text.Regex;

/* loaded from: classes3.dex */
public final class OperatorNameConventions {

    @JvmField
    public static final Set<Name> ALL_BINARY_OPERATION_NAMES;

    @JvmField
    public static final Name AND;

    @JvmField
    public static final Set<Name> ASSIGNMENT_OPERATIONS;

    @JvmField
    public static final Set<Name> BINARY_OPERATION_NAMES;

    @JvmField
    public static final Set<Name> BITWISE_OPERATION_NAMES;

    @JvmField
    public static final Name COMPARE_TO;

    @JvmField
    public static final Regex COMPONENT_REGEX;

    @JvmField
    public static final Name CONTAINS;

    @JvmField
    public static final Name DEC;

    @JvmField
    public static final Set<Name> DELEGATED_PROPERTY_OPERATORS;

    @JvmField
    public static final Name DIV;

    @JvmField
    public static final Name DIV_ASSIGN;

    @JvmField
    public static final Name EQUALS;

    @JvmField
    public static final Name GET;

    @JvmField
    public static final Name GET_VALUE;

    @JvmField
    public static final Name HASH_CODE;

    @JvmField
    public static final Name HAS_NEXT;

    @JvmField
    public static final Name INC;
    public static final OperatorNameConventions INSTANCE = new OperatorNameConventions();

    @JvmField
    public static final Name INV;

    @JvmField
    public static final Name INVOKE;

    @JvmField
    public static final Name ITERATOR;

    @JvmField
    public static final Name MINUS;

    @JvmField
    public static final Name MINUS_ASSIGN;

    @JvmField
    public static final Name MOD;

    @JvmField
    public static final Name MOD_ASSIGN;

    @JvmField
    public static final Map<Name, Name> MOD_OPERATORS_REPLACEMENT;

    @JvmField
    public static final Name NEXT;

    @JvmField
    public static final Name NOT;

    @JvmField
    public static final Name OR;

    @JvmField
    public static final Name PLUS;

    @JvmField
    public static final Name PLUS_ASSIGN;

    @JvmField
    public static final Name PROVIDE_DELEGATE;

    @JvmField
    public static final Name RANGE_TO;

    @JvmField
    public static final Name RANGE_UNTIL;

    @JvmField
    public static final Name REM;

    @JvmField
    public static final Name REM_ASSIGN;

    @JvmField
    public static final Name SET;

    @JvmField
    public static final Name SET_VALUE;

    @JvmField
    public static final Name SHL;

    @JvmField
    public static final Name SHR;

    @JvmField
    public static final Set<Name> SIMPLE_UNARY_OPERATION_NAMES;

    @JvmField
    public static final Set<Name> STATEMENT_LIKE_OPERATORS;

    @JvmField
    public static final Name TIMES;

    @JvmField
    public static final Name TIMES_ASSIGN;

    @JvmField
    public static final Name TO_STRING;

    @JvmField
    public static final Name UNARY_MINUS;

    @JvmField
    public static final Set<Name> UNARY_OPERATION_NAMES;

    @JvmField
    public static final Name UNARY_PLUS;

    @JvmField
    public static final Name USHR;

    @JvmField
    public static final Name XOR;

    static {
        Name identifier = Name.identifier("getValue");
        Intrinsics.checkNotNullExpressionValue(identifier, "identifier(...)");
        GET_VALUE = identifier;
        Name identifier2 = Name.identifier("setValue");
        Intrinsics.checkNotNullExpressionValue(identifier2, "identifier(...)");
        SET_VALUE = identifier2;
        Name identifier3 = Name.identifier("provideDelegate");
        Intrinsics.checkNotNullExpressionValue(identifier3, "identifier(...)");
        PROVIDE_DELEGATE = identifier3;
        Name identifier4 = Name.identifier("equals");
        Intrinsics.checkNotNullExpressionValue(identifier4, "identifier(...)");
        EQUALS = identifier4;
        Name identifier5 = Name.identifier("hashCode");
        Intrinsics.checkNotNullExpressionValue(identifier5, "identifier(...)");
        HASH_CODE = identifier5;
        Name identifier6 = Name.identifier("compareTo");
        Intrinsics.checkNotNullExpressionValue(identifier6, "identifier(...)");
        COMPARE_TO = identifier6;
        Name identifier7 = Name.identifier("contains");
        Intrinsics.checkNotNullExpressionValue(identifier7, "identifier(...)");
        CONTAINS = identifier7;
        Name identifier8 = Name.identifier("invoke");
        Intrinsics.checkNotNullExpressionValue(identifier8, "identifier(...)");
        INVOKE = identifier8;
        Name identifier9 = Name.identifier("iterator");
        Intrinsics.checkNotNullExpressionValue(identifier9, "identifier(...)");
        ITERATOR = identifier9;
        Name identifier10 = Name.identifier("get");
        Intrinsics.checkNotNullExpressionValue(identifier10, "identifier(...)");
        GET = identifier10;
        Name identifier11 = Name.identifier("set");
        Intrinsics.checkNotNullExpressionValue(identifier11, "identifier(...)");
        SET = identifier11;
        Name identifier12 = Name.identifier("next");
        Intrinsics.checkNotNullExpressionValue(identifier12, "identifier(...)");
        NEXT = identifier12;
        Name identifier13 = Name.identifier("hasNext");
        Intrinsics.checkNotNullExpressionValue(identifier13, "identifier(...)");
        HAS_NEXT = identifier13;
        Name identifier14 = Name.identifier("toString");
        Intrinsics.checkNotNullExpressionValue(identifier14, "identifier(...)");
        TO_STRING = identifier14;
        COMPONENT_REGEX = new Regex("component\\d+");
        Name identifier15 = Name.identifier("and");
        Intrinsics.checkNotNullExpressionValue(identifier15, "identifier(...)");
        AND = identifier15;
        Name identifier16 = Name.identifier("or");
        Intrinsics.checkNotNullExpressionValue(identifier16, "identifier(...)");
        OR = identifier16;
        Name identifier17 = Name.identifier("xor");
        Intrinsics.checkNotNullExpressionValue(identifier17, "identifier(...)");
        XOR = identifier17;
        Name identifier18 = Name.identifier("inv");
        Intrinsics.checkNotNullExpressionValue(identifier18, "identifier(...)");
        INV = identifier18;
        Name identifier19 = Name.identifier("shl");
        Intrinsics.checkNotNullExpressionValue(identifier19, "identifier(...)");
        SHL = identifier19;
        Name identifier20 = Name.identifier("shr");
        Intrinsics.checkNotNullExpressionValue(identifier20, "identifier(...)");
        SHR = identifier20;
        Name identifier21 = Name.identifier("ushr");
        Intrinsics.checkNotNullExpressionValue(identifier21, "identifier(...)");
        USHR = identifier21;
        Name identifier22 = Name.identifier("inc");
        Intrinsics.checkNotNullExpressionValue(identifier22, "identifier(...)");
        INC = identifier22;
        Name identifier23 = Name.identifier("dec");
        Intrinsics.checkNotNullExpressionValue(identifier23, "identifier(...)");
        DEC = identifier23;
        Name identifier24 = Name.identifier("plus");
        Intrinsics.checkNotNullExpressionValue(identifier24, "identifier(...)");
        PLUS = identifier24;
        Name identifier25 = Name.identifier("minus");
        Intrinsics.checkNotNullExpressionValue(identifier25, "identifier(...)");
        MINUS = identifier25;
        Name identifier26 = Name.identifier("not");
        Intrinsics.checkNotNullExpressionValue(identifier26, "identifier(...)");
        NOT = identifier26;
        Name identifier27 = Name.identifier("unaryMinus");
        Intrinsics.checkNotNullExpressionValue(identifier27, "identifier(...)");
        UNARY_MINUS = identifier27;
        Name identifier28 = Name.identifier("unaryPlus");
        Intrinsics.checkNotNullExpressionValue(identifier28, "identifier(...)");
        UNARY_PLUS = identifier28;
        Name identifier29 = Name.identifier("times");
        Intrinsics.checkNotNullExpressionValue(identifier29, "identifier(...)");
        TIMES = identifier29;
        Name identifier30 = Name.identifier("div");
        Intrinsics.checkNotNullExpressionValue(identifier30, "identifier(...)");
        DIV = identifier30;
        Name identifier31 = Name.identifier("mod");
        Intrinsics.checkNotNullExpressionValue(identifier31, "identifier(...)");
        MOD = identifier31;
        Name identifier32 = Name.identifier("rem");
        Intrinsics.checkNotNullExpressionValue(identifier32, "identifier(...)");
        REM = identifier32;
        Name identifier33 = Name.identifier("rangeTo");
        Intrinsics.checkNotNullExpressionValue(identifier33, "identifier(...)");
        RANGE_TO = identifier33;
        Name identifier34 = Name.identifier("rangeUntil");
        Intrinsics.checkNotNullExpressionValue(identifier34, "identifier(...)");
        RANGE_UNTIL = identifier34;
        Name identifier35 = Name.identifier("timesAssign");
        Intrinsics.checkNotNullExpressionValue(identifier35, "identifier(...)");
        TIMES_ASSIGN = identifier35;
        Name identifier36 = Name.identifier("divAssign");
        Intrinsics.checkNotNullExpressionValue(identifier36, "identifier(...)");
        DIV_ASSIGN = identifier36;
        Name identifier37 = Name.identifier("modAssign");
        Intrinsics.checkNotNullExpressionValue(identifier37, "identifier(...)");
        MOD_ASSIGN = identifier37;
        Name identifier38 = Name.identifier("remAssign");
        Intrinsics.checkNotNullExpressionValue(identifier38, "identifier(...)");
        REM_ASSIGN = identifier38;
        Name identifier39 = Name.identifier("plusAssign");
        Intrinsics.checkNotNullExpressionValue(identifier39, "identifier(...)");
        PLUS_ASSIGN = identifier39;
        Name identifier40 = Name.identifier("minusAssign");
        Intrinsics.checkNotNullExpressionValue(identifier40, "identifier(...)");
        MINUS_ASSIGN = identifier40;
        UNARY_OPERATION_NAMES = SetsKt.setOf((Object[]) new Name[]{identifier22, identifier23, identifier28, identifier27, identifier26, identifier18});
        SIMPLE_UNARY_OPERATION_NAMES = SetsKt.setOf((Object[]) new Name[]{identifier28, identifier27, identifier26, identifier18});
        Set<Name> of = SetsKt.setOf((Object[]) new Name[]{identifier29, identifier24, identifier25, identifier30, identifier31, identifier32, identifier33, identifier34});
        BINARY_OPERATION_NAMES = of;
        Set<Name> of2 = SetsKt.setOf((Object[]) new Name[]{identifier15, identifier16, identifier17, identifier18, identifier19, identifier20, identifier21});
        BITWISE_OPERATION_NAMES = of2;
        ALL_BINARY_OPERATION_NAMES = SetsKt.plus(SetsKt.plus((Set) of, (Iterable) of2), (Iterable) SetsKt.setOf((Object[]) new Name[]{identifier4, identifier7, identifier6}));
        Set<Name> of3 = SetsKt.setOf((Object[]) new Name[]{identifier35, identifier36, identifier37, identifier38, identifier39, identifier40});
        ASSIGNMENT_OPERATIONS = of3;
        DELEGATED_PROPERTY_OPERATORS = SetsKt.setOf((Object[]) new Name[]{identifier, identifier2, identifier3});
        MOD_OPERATORS_REPLACEMENT = MapsKt.mapOf(TuplesKt.to(identifier31, identifier32), TuplesKt.to(identifier37, identifier38));
        STATEMENT_LIKE_OPERATORS = SetsKt.plus(SetsKt.setOf(identifier11), (Iterable) of3);
    }

    private OperatorNameConventions() {
    }
}
