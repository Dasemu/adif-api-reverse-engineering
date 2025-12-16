package f0;

import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import java.nio.ByteBuffer;

/* renamed from: f0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0339c extends InputConnectionWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final EditText f6449a;

    /* renamed from: b, reason: collision with root package name */
    public final C0338b f6450b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0339c(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        super(inputConnection, false);
        C0338b c0338b = new C0338b(0);
        this.f6449a = editText;
        this.f6450b = c0338b;
        if (d0.h.f6123k != null) {
            d0.h a2 = d0.h.a();
            if (a2.b() != 1 || editorInfo == null) {
                return;
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            d0.e eVar = a2.f6128e;
            eVar.getClass();
            Bundle bundle = editorInfo.extras;
            e0.b bVar = (e0.b) eVar.f6121c.f27a;
            int a4 = bVar.a(4);
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", a4 != 0 ? ((ByteBuffer) bVar.f1221d).getInt(a4 + bVar.f1218a) : 0);
            Bundle bundle2 = editorInfo.extras;
            eVar.f6119a.getClass();
            bundle2.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i4) {
        Editable editableText = this.f6449a.getEditableText();
        this.f6450b.getClass();
        return C0338b.r(this, editableText, i, i4, false) || super.deleteSurroundingText(i, i4);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i4) {
        Editable editableText = this.f6449a.getEditableText();
        this.f6450b.getClass();
        return C0338b.r(this, editableText, i, i4, true) || super.deleteSurroundingTextInCodePoints(i, i4);
    }
}
