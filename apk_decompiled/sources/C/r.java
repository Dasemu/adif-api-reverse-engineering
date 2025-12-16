package C;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class r extends v {

    /* renamed from: b, reason: collision with root package name */
    public IconCompat f244b;

    /* renamed from: c, reason: collision with root package name */
    public IconCompat f245c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f246d;

    @Override // C.v
    public final void a(A.j jVar) {
        Bitmap bitmap;
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle((Notification.Builder) jVar.f28b).setBigContentTitle(null);
        IconCompat iconCompat = this.f244b;
        Context context = (Context) jVar.f27a;
        if (iconCompat != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                q.a(bigContentTitle, H.c.c(iconCompat, context));
            } else {
                int i = iconCompat.f2784a;
                if (i == -1) {
                    i = H.e.c(iconCompat.f2785b);
                }
                if (i == 1) {
                    IconCompat iconCompat2 = this.f244b;
                    int i4 = iconCompat2.f2784a;
                    if (i4 == -1) {
                        Object obj = iconCompat2.f2785b;
                        bitmap = obj instanceof Bitmap ? (Bitmap) obj : null;
                    } else if (i4 == 1) {
                        bitmap = (Bitmap) iconCompat2.f2785b;
                    } else {
                        if (i4 != 5) {
                            throw new IllegalStateException("called getBitmap() on " + iconCompat2);
                        }
                        Bitmap bitmap2 = (Bitmap) iconCompat2.f2785b;
                        int min = (int) (Math.min(bitmap2.getWidth(), bitmap2.getHeight()) * 0.6666667f);
                        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        Paint paint = new Paint(3);
                        float f2 = min;
                        float f4 = 0.5f * f2;
                        float f5 = 0.9166667f * f4;
                        float f6 = 0.010416667f * f2;
                        paint.setColor(0);
                        paint.setShadowLayer(f6, BitmapDescriptorFactory.HUE_RED, f2 * 0.020833334f, 1023410176);
                        canvas.drawCircle(f4, f4, f5, paint);
                        paint.setShadowLayer(f6, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 503316480);
                        canvas.drawCircle(f4, f4, f5, paint);
                        paint.clearShadowLayer();
                        paint.setColor(-16777216);
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                        Matrix matrix = new Matrix();
                        matrix.setTranslate((-(bitmap2.getWidth() - min)) / 2.0f, (-(bitmap2.getHeight() - min)) / 2.0f);
                        bitmapShader.setLocalMatrix(matrix);
                        paint.setShader(bitmapShader);
                        canvas.drawCircle(f4, f4, f5, paint);
                        canvas.setBitmap(null);
                        bitmap = createBitmap;
                    }
                    bigContentTitle = bigContentTitle.bigPicture(bitmap);
                }
            }
        }
        if (this.f246d) {
            IconCompat iconCompat3 = this.f245c;
            if (iconCompat3 == null) {
                bigContentTitle.bigLargeIcon((Bitmap) null);
            } else {
                p.a(bigContentTitle, H.c.c(iconCompat3, context));
            }
        }
        if (Build.VERSION.SDK_INT >= 31) {
            q.c(bigContentTitle, false);
            q.b(bigContentTitle, null);
        }
    }

    @Override // C.v
    public final String d() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }
}
