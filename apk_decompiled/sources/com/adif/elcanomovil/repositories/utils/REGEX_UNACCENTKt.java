package com.adif.elcanomovil.repositories.utils;

import java.text.Normalizer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\r\n\u0000\u001a\n\u0010\u0002\u001a\u00020\u0003*\u00020\u0004\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"REGEX_UNACCENT", "Lkotlin/text/Regex;", "unaccent", "", "", "repositories_proNon_corporateRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class REGEX_UNACCENTKt {
    private static final Regex REGEX_UNACCENT = new Regex("\\p{InCombiningDiacriticalMarks}+");

    public static final String unaccent(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        String normalize = Normalizer.normalize(charSequence, Normalizer.Form.NFD);
        Regex regex = REGEX_UNACCENT;
        Intrinsics.checkNotNull(normalize);
        return regex.replace(normalize, "");
    }
}
