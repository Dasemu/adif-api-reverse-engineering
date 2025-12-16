package A1;

import a.AbstractC0105a;
import android.database.Cursor;
import androidx.room.u;
import androidx.room.w;
import com.adif.elcanomovil.commonNavGraph.arguments.NavArguments;
import com.adif.elcanomovil.serviceStorage.database.IncidenceDao_Impl;
import com.adif.elcanomovil.serviceStorage.model.avisa.AvisaStationCategoryEntity;
import com.adif.elcanomovil.serviceStorage.model.avisa.AvisaStationEntity;
import com.adif.elcanomovil.serviceStorage.model.avisa.IncidenceEntity;
import com.adif.elcanomovil.serviceStorage.model.avisa.IncidencePictureEntity;
import com.adif.elcanomovil.serviceStorage.model.avisa.IncidenceStationEntity;
import com.adif.elcanomovil.serviceStorage.utils.CommentTypeConverter;
import com.adif.elcanomovil.serviceStorage.utils.DateConverter;
import com.adif.elcanomovil.serviceStorage.utils.PictureTypeConverter;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class p implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f71a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f72b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ IncidenceDao_Impl f73c;

    public /* synthetic */ p(IncidenceDao_Impl incidenceDao_Impl, w wVar, int i) {
        this.f71a = i;
        this.f73c = incidenceDao_Impl;
        this.f72b = wVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        u uVar;
        Cursor cursor;
        int r4;
        int r5;
        int r6;
        int r7;
        int r8;
        int r9;
        int r10;
        int r11;
        int r12;
        int r13;
        int r14;
        int r15;
        int r16;
        int r17;
        int r18;
        int r19;
        int r20;
        int r21;
        ArrayList arrayList;
        int i;
        PictureTypeConverter pictureTypeConverter;
        CommentTypeConverter commentTypeConverter;
        u uVar2;
        PictureTypeConverter pictureTypeConverter2;
        CommentTypeConverter commentTypeConverter2;
        switch (this.f71a) {
            case 0:
                IncidenceDao_Impl incidenceDao_Impl = this.f73c;
                uVar = incidenceDao_Impl.__db;
                Cursor M3 = AbstractC0105a.M(uVar, this.f72b, false);
                try {
                    r4 = m3.l.r(M3, NavArguments.ARG_TYPE_NOTIFICATION_JSON_MESSAGE_TRAIN);
                    r5 = m3.l.r(M3, "incidenceCode");
                    r6 = m3.l.r(M3, "stationId");
                    r7 = m3.l.r(M3, "statusTypeId");
                    r8 = m3.l.r(M3, "description");
                    r9 = m3.l.r(M3, "notificationTypeId");
                    r10 = m3.l.r(M3, "createdTime");
                    r11 = m3.l.r(M3, "estimatedDateTo");
                    r12 = m3.l.r(M3, "solvedDate");
                    r13 = m3.l.r(M3, "categoryId");
                    r14 = m3.l.r(M3, "photos");
                    r15 = m3.l.r(M3, "comments");
                    r16 = m3.l.r(M3, "stId");
                    int r22 = m3.l.r(M3, AppMeasurementSdk.ConditionalUserProperty.NAME);
                    r17 = m3.l.r(M3, "code");
                    r18 = m3.l.r(M3, "latitude");
                    r19 = m3.l.r(M3, "longitude");
                    r20 = m3.l.r(M3, "catId");
                    r21 = m3.l.r(M3, "title");
                    i = r22;
                    arrayList = new ArrayList(M3.getCount());
                } catch (Throwable th) {
                    th = th;
                    cursor = M3;
                }
                while (M3.moveToNext()) {
                    int i4 = M3.getInt(r4);
                    String string = M3.getString(r5);
                    int i5 = r4;
                    String string2 = M3.isNull(r6) ? null : M3.getString(r6);
                    int i6 = M3.getInt(r7);
                    String string3 = M3.getString(r8);
                    int i7 = M3.getInt(r9);
                    Date date = DateConverter.toDate(M3.isNull(r10) ? null : Long.valueOf(M3.getLong(r10)));
                    if (date == null) {
                        cursor = M3;
                        throw new IllegalStateException("Expected NON-NULL 'java.util.Date', but it was NULL.");
                    }
                    Date date2 = DateConverter.toDate(M3.isNull(r11) ? null : Long.valueOf(M3.getLong(r11)));
                    Date date3 = DateConverter.toDate(M3.isNull(r12) ? null : Long.valueOf(M3.getLong(r12)));
                    String string4 = M3.isNull(r13) ? null : M3.getString(r13);
                    String string5 = M3.isNull(r14) ? null : M3.getString(r14);
                    pictureTypeConverter = incidenceDao_Impl.__pictureTypeConverter;
                    List<IncidencePictureEntity> stringToList = pictureTypeConverter.stringToList(string5);
                    String string6 = M3.isNull(r15) ? null : M3.getString(r15);
                    commentTypeConverter = incidenceDao_Impl.__commentTypeConverter;
                    IncidenceEntity incidenceEntity = new IncidenceEntity(i4, string, string2, i6, string3, i7, date, date2, date3, string4, stringToList, commentTypeConverter.stringToList(string6));
                    String string7 = M3.getString(r16);
                    int i8 = i;
                    String string8 = M3.getString(i8);
                    int i9 = r5;
                    int i10 = r17;
                    String string9 = M3.getString(i10);
                    r17 = i10;
                    int i11 = r18;
                    Double valueOf = M3.isNull(i11) ? null : Double.valueOf(M3.getDouble(i11));
                    r18 = i11;
                    int i12 = r19;
                    AvisaStationEntity avisaStationEntity = new AvisaStationEntity(string7, string8, string9, valueOf, M3.isNull(i12) ? null : Double.valueOf(M3.getDouble(i12)));
                    r19 = i12;
                    int i13 = r6;
                    int i14 = r20;
                    int i15 = r7;
                    String string10 = M3.getString(i14);
                    int i16 = r21;
                    int i17 = r8;
                    cursor = M3;
                    try {
                        arrayList.add(new IncidenceStationEntity(null, incidenceEntity, avisaStationEntity, new AvisaStationCategoryEntity(string10, M3.getString(i16))));
                        r7 = i15;
                        r8 = i17;
                        r5 = i9;
                        r20 = i14;
                        M3 = cursor;
                        r4 = i5;
                        r21 = i16;
                        i = i8;
                        r6 = i13;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    th = th2;
                    cursor.close();
                    throw th;
                    break;
                }
                M3.close();
                return arrayList;
            default:
                IncidenceDao_Impl incidenceDao_Impl2 = this.f73c;
                uVar2 = incidenceDao_Impl2.__db;
                Cursor M4 = AbstractC0105a.M(uVar2, this.f72b, false);
                try {
                    int r23 = m3.l.r(M4, NavArguments.ARG_TYPE_NOTIFICATION_JSON_MESSAGE_TRAIN);
                    int r24 = m3.l.r(M4, "incidenceCode");
                    int r25 = m3.l.r(M4, "stationId");
                    int r26 = m3.l.r(M4, "statusTypeId");
                    int r27 = m3.l.r(M4, "description");
                    int r28 = m3.l.r(M4, "notificationTypeId");
                    int r29 = m3.l.r(M4, "createdTime");
                    int r30 = m3.l.r(M4, "estimatedDateTo");
                    int r31 = m3.l.r(M4, "solvedDate");
                    int r32 = m3.l.r(M4, "categoryId");
                    int r33 = m3.l.r(M4, "photos");
                    int r34 = m3.l.r(M4, "comments");
                    int r35 = m3.l.r(M4, "stId");
                    int r36 = m3.l.r(M4, AppMeasurementSdk.ConditionalUserProperty.NAME);
                    int r37 = m3.l.r(M4, "code");
                    int r38 = m3.l.r(M4, "latitude");
                    int r39 = m3.l.r(M4, "longitude");
                    int r40 = m3.l.r(M4, "catId");
                    int r41 = m3.l.r(M4, "title");
                    IncidenceStationEntity incidenceStationEntity = null;
                    if (M4.moveToFirst()) {
                        int i18 = M4.getInt(r23);
                        String string11 = M4.getString(r24);
                        String string12 = M4.isNull(r25) ? null : M4.getString(r25);
                        int i19 = M4.getInt(r26);
                        String string13 = M4.getString(r27);
                        int i20 = M4.getInt(r28);
                        Date date4 = DateConverter.toDate(M4.isNull(r29) ? null : Long.valueOf(M4.getLong(r29)));
                        if (date4 == null) {
                            throw new IllegalStateException("Expected NON-NULL 'java.util.Date', but it was NULL.");
                        }
                        Date date5 = DateConverter.toDate(M4.isNull(r30) ? null : Long.valueOf(M4.getLong(r30)));
                        Date date6 = DateConverter.toDate(M4.isNull(r31) ? null : Long.valueOf(M4.getLong(r31)));
                        String string14 = M4.isNull(r32) ? null : M4.getString(r32);
                        String string15 = M4.isNull(r33) ? null : M4.getString(r33);
                        pictureTypeConverter2 = incidenceDao_Impl2.__pictureTypeConverter;
                        List<IncidencePictureEntity> stringToList2 = pictureTypeConverter2.stringToList(string15);
                        String string16 = M4.isNull(r34) ? null : M4.getString(r34);
                        commentTypeConverter2 = incidenceDao_Impl2.__commentTypeConverter;
                        incidenceStationEntity = new IncidenceStationEntity(null, new IncidenceEntity(i18, string11, string12, i19, string13, i20, date4, date5, date6, string14, stringToList2, commentTypeConverter2.stringToList(string16)), new AvisaStationEntity(M4.getString(r35), M4.getString(r36), M4.getString(r37), M4.isNull(r38) ? null : Double.valueOf(M4.getDouble(r38)), M4.isNull(r39) ? null : Double.valueOf(M4.getDouble(r39))), new AvisaStationCategoryEntity(M4.getString(r40), M4.getString(r41)));
                    }
                    M4.close();
                    return incidenceStationEntity;
                } finally {
                    M4.close();
                }
        }
    }

    public final void finalize() {
        switch (this.f71a) {
            case 0:
                this.f72b.release();
                return;
            default:
                this.f72b.release();
                return;
        }
    }
}
