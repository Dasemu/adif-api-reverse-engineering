package com.google.android.gms.maps.model;

import com.google.android.gms.common.internal.Preconditions;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import kotlin.io.ConstantsKt;

/* loaded from: classes3.dex */
public abstract class UrlTileProvider implements TileProvider {
    private final int zza;
    private final int zzb;

    public UrlTileProvider(int i, int i4) {
        this.zza = i;
        this.zzb = i4;
    }

    @Override // com.google.android.gms.maps.model.TileProvider
    public final Tile getTile(int i, int i4, int i5) {
        URL tileUrl = getTileUrl(i, i4, i5);
        if (tileUrl == null) {
            return TileProvider.NO_TILE;
        }
        try {
            com.google.android.gms.internal.maps.zzf.zzb(4352);
            int i6 = this.zza;
            int i7 = this.zzb;
            InputStream inputStream = tileUrl.openConnection().getInputStream();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Preconditions.checkNotNull(inputStream, "from must not be null.");
            Preconditions.checkNotNull(byteArrayOutputStream, "to must not be null.");
            byte[] bArr = new byte[ConstantsKt.DEFAULT_BLOCK_SIZE];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    Tile tile = new Tile(i6, i7, byteArrayOutputStream.toByteArray());
                    com.google.android.gms.internal.maps.zzf.zza();
                    return tile;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } catch (IOException unused) {
            com.google.android.gms.internal.maps.zzf.zza();
            return null;
        } catch (Throwable th) {
            com.google.android.gms.internal.maps.zzf.zza();
            throw th;
        }
    }

    public abstract URL getTileUrl(int i, int i4, int i5);
}
