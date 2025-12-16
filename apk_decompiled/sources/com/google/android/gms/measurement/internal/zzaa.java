package com.google.android.gms.measurement.internal;

import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzaa extends zzku {
    private String zza;
    private Set zzb;
    private Map zzc;
    private Long zzd;
    private Long zze;

    public zzaa(zzlh zzlhVar) {
        super(zzlhVar);
    }

    private final zzu zzd(Integer num) {
        if (this.zzc.containsKey(num)) {
            return (zzu) this.zzc.get(num);
        }
        zzu zzuVar = new zzu(this, this.zza, null);
        this.zzc.put(num, zzuVar);
        return zzuVar;
    }

    private final boolean zzf(int i, int i4) {
        zzu zzuVar = (zzu) this.zzc.get(Integer.valueOf(i));
        if (zzuVar == null) {
            return false;
        }
        return zzu.zzb(zzuVar).get(i4);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(26:1|(2:2|(2:4|(2:6|7)(1:523))(2:524|525))|8|(3:10|11|12)|16|(7:19|20|21|22|23|(20:(7:25|26|27|28|(1:30)(3:498|(1:500)(1:502)|501)|31|(1:34)(1:33))|35|36|37|38|39|40|(2:42|43)(3:454|(6:455|456|457|458|459|(1:462)(1:461))|463)|44|(5:283|(12:285|286|287|288|289|(6:437|298|299|(3:393|(6:396|(2:432|433)(2:400|(8:406|407|(4:410|(2:412|413)(1:415)|414|408)|416|417|(4:420|(3:422|423|424)(1:426)|425|418)|427|428)(4:402|403|404|405))|429|430|405|394)|435)|301|302)|(4:291|(1:293)|294|295)|298|299|(0)|301|302)(1:453)|303|(11:306|(3:310|(4:313|(5:315|316|(1:318)(1:322)|319|320)(1:323)|321|311)|324)|325|326|(3:330|(4:333|(3:338|339|340)|341|331)|344)|345|(3:347|(6:350|(2:352|(3:354|355|356))(1:359)|357|358|356|348)|360)|361|(3:370|(8:373|(1:375)|376|(1:378)|379|(2:381|382)(1:384)|383|371)|385)|386|304)|392)|46|47|(3:183|(4:186|(10:188|189|(1:191)(1:280)|192|(11:194|195|196|197|198|199|200|201|202|203|(4:205|(10:206|207|208|209|210|211|212|(1:214)|215|216)|219|220)(4:259|260|258|220))(1:279)|221|(4:224|(3:242|243|244)(6:226|227|(2:228|(2:230|(1:232)(2:233|234))(2:240|241))|(1:236)|237|238)|239|222)|245|246|247)(1:281)|248|184)|282)|49|50|(3:52|(6:55|(6:57|58|59|60|61|(3:(9:63|64|65|66|67|(3:69|70|71)(1:131)|72|73|(1:76)(1:75))|77|78)(4:138|139|127|78))(1:156)|79|(2:80|(2:82|(3:118|119|120)(8:84|(2:85|(4:87|(3:89|(1:91)(1:114)|92)(1:115)|93|(1:1)(2:97|(1:99)(2:100|101)))(2:116|117))|108|(1:110)(1:112)|111|103|104|105))(0))|121|53)|157)|158|(10:161|162|163|164|165|166|168|(3:170|171|172)(1:174)|173|159)|181|182)|507)|522|36|37|38|39|40|(0)(0)|44|(0)|46|47|(0)|49|50|(0)|158|(1:159)|181|182|(5:(0)|(0)|(0)|(0)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x09ef, code lost:
    
        if (r11 != false) goto L482;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x08d3, code lost:
    
        if (r13 != null) goto L357;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x0730, code lost:
    
        if (r6 != null) goto L278;
     */
    /* JADX WARN: Code restructure failed: missing block: B:441:0x02e7, code lost:
    
        if (r6 == null) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:489:0x01b5, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:490:0x01b6, code lost:
    
        r17 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:491:0x01b8, code lost:
    
        r18 = com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:493:0x0226, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:494:0x0227, code lost:
    
        r17 = r2;
        r18 = com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE;
        r19 = "audience_id";
     */
    /* JADX WARN: Code restructure failed: missing block: B:495:0x0231, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:496:0x0224, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:497:0x022e, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:511:0x016a, code lost:
    
        if (r5 == null) goto L44;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0a14  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0598  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01a4 A[Catch: all -> 0x01b2, SQLiteException -> 0x01b5, TRY_LEAVE, TryCatch #10 {all -> 0x01b2, blocks: (B:40:0x019e, B:42:0x01a4, B:454:0x01be, B:455:0x01c3, B:457:0x01cd, B:458:0x01dd, B:459:0x0209, B:472:0x01ec, B:477:0x01fc, B:480:0x0202, B:466:0x0232), top: B:39:0x019e }] */
    /* JADX WARN: Removed duplicated region for block: B:447:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x01be A[Catch: all -> 0x01b2, SQLiteException -> 0x01b5, TRY_ENTER, TryCatch #10 {all -> 0x01b2, blocks: (B:40:0x019e, B:42:0x01a4, B:454:0x01be, B:455:0x01c3, B:457:0x01cd, B:458:0x01dd, B:459:0x0209, B:472:0x01ec, B:477:0x01fc, B:480:0x0202, B:466:0x0232), top: B:39:0x019e }] */
    /* JADX WARN: Removed duplicated region for block: B:468:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:516:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x07df  */
    /* JADX WARN: Type inference failed for: r0v51, types: [s.e, s.j] */
    /* JADX WARN: Type inference failed for: r0v57, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v73 */
    /* JADX WARN: Type inference failed for: r0v75, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v35, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v36, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List zza(java.lang.String r47, java.util.List r48, java.util.List r49, java.lang.Long r50, java.lang.Long r51) {
        /*
            Method dump skipped, instructions count: 2722
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzaa.zza(java.lang.String, java.util.List, java.util.List, java.lang.Long, java.lang.Long):java.util.List");
    }

    @Override // com.google.android.gms.measurement.internal.zzku
    public final boolean zzb() {
        return false;
    }
}
