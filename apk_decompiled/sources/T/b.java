package T;

import I2.k;
import O.C0060d;
import O.InterfaceC0058c;
import O.X;
import android.content.ClipData;
import android.content.ClipDescription;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import androidx.appcompat.widget.AppCompatEditText;

/* loaded from: classes.dex */
public final class b extends InputConnectionWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f1630a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(InputConnection inputConnection, k kVar) {
        super(inputConnection, false);
        this.f1630a = kVar;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        Bundle bundle2;
        InterfaceC0058c interfaceC0058c;
        A.a aVar = inputContentInfo == null ? null : new A.a(new A.a(inputContentInfo, 18), 19);
        k kVar = this.f1630a;
        if ((i & 1) != 0) {
            try {
                ((InputContentInfo) ((A.a) aVar.f7b).f7b).requestPermission();
                InputContentInfo inputContentInfo2 = (InputContentInfo) ((A.a) aVar.f7b).f7b;
                bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle2.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo2);
            } catch (Exception e4) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e4);
            }
        } else {
            bundle2 = bundle;
        }
        ClipDescription description = ((InputContentInfo) ((A.a) aVar.f7b).f7b).getDescription();
        A.a aVar2 = (A.a) aVar.f7b;
        ClipData clipData = new ClipData(description, new ClipData.Item(((InputContentInfo) aVar2.f7b).getContentUri()));
        if (Build.VERSION.SDK_INT >= 31) {
            interfaceC0058c = new A.a(clipData, 2);
        } else {
            C0060d c0060d = new C0060d();
            c0060d.f1236b = clipData;
            c0060d.f1237c = 2;
            interfaceC0058c = c0060d;
        }
        interfaceC0058c.i(((InputContentInfo) aVar2.f7b).getLinkUri());
        interfaceC0058c.setExtras(bundle2);
        if (X.g((AppCompatEditText) kVar.f823b, interfaceC0058c.build()) == null) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
