package A;

import N0.l;
import O.B0;
import O.C0064f;
import O.D0;
import O.InterfaceC0058c;
import O.InterfaceC0062e;
import O.InterfaceC0080v;
import O.X;
import S0.o;
import S0.r;
import S2.p;
import S2.u;
import a.AbstractC0106b;
import android.content.ClipData;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import android.view.GestureDetector;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.L;
import com.adif.elcanomovil.commonNavGraph.arguments.NavArguments;
import com.adif.elcanomovil.serviceNetworking.ServicePaths;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import f0.C0344h;
import i3.m;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import u0.C0632b;

/* loaded from: classes.dex */
public class a implements InterfaceC0080v, InterfaceC0058c, InterfaceC0062e, Q0.h, p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6a;

    /* renamed from: b, reason: collision with root package name */
    public Object f7b;

    public /* synthetic */ a(int i, boolean z3) {
        this.f6a = i;
    }

    public static void n(x0.c cVar) {
        cVar.i("CREATE TABLE IF NOT EXISTS `StationEntity` (`stationCode` TEXT NOT NULL, `stationType` TEXT NOT NULL, `longName` TEXT NOT NULL, `shortName` TEXT NOT NULL, `longNameToFind` TEXT NOT NULL, `shortNameToFind` TEXT NOT NULL, `latitude` REAL NOT NULL, `longitude` REAL NOT NULL, `trafficType` INTEGER NOT NULL, `commercialZoneType` TEXT, `commuterNetwork` TEXT NOT NULL, `akaName` TEXT NOT NULL, PRIMARY KEY(`stationCode`))");
        cVar.i("CREATE TABLE IF NOT EXISTS `FavouriteEntity` (`favouriteId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `identifierStation` TEXT, `stationName` TEXT, `identifierToStation` TEXT, `stationToName` TEXT, `type` TEXT NOT NULL, `isCercanias` INTEGER, `isRodalies` INTEGER)");
        cVar.i("CREATE TABLE IF NOT EXISTS `AvisaStation` (`stId` TEXT NOT NULL, `name` TEXT NOT NULL, `code` TEXT NOT NULL, `latitude` REAL, `longitude` REAL, PRIMARY KEY(`stId`))");
        cVar.i("CREATE TABLE IF NOT EXISTS `AvisaStationCategory` (`catId` TEXT NOT NULL, `title` TEXT NOT NULL, PRIMARY KEY(`catId`))");
        cVar.i("CREATE TABLE IF NOT EXISTS `IncidenceEntity` (`id` INTEGER NOT NULL, `incidenceCode` TEXT NOT NULL, `stationId` TEXT, `statusTypeId` INTEGER NOT NULL, `description` TEXT NOT NULL, `notificationTypeId` INTEGER NOT NULL, `createdTime` INTEGER NOT NULL, `estimatedDateTo` INTEGER, `solvedDate` INTEGER, `categoryId` TEXT, `photos` TEXT, `comments` TEXT, PRIMARY KEY(`id`), FOREIGN KEY(`stationId`) REFERENCES `AvisaStation`(`stId`) ON UPDATE NO ACTION ON DELETE CASCADE , FOREIGN KEY(`categoryId`) REFERENCES `AvisaStationCategory`(`catId`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        cVar.i("CREATE TABLE IF NOT EXISTS `IncidenceCommentEntity` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `createTime` INTEGER, `updatedTime` INTEGER, `type` TEXT, `statusTypeId` TEXT NOT NULL, `description` TEXT NOT NULL, `incidenceId` INTEGER, `fixPhotos` TEXT NOT NULL, FOREIGN KEY(`incidenceId`) REFERENCES `IncidenceEntity`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        cVar.i("CREATE TABLE IF NOT EXISTS `IncidencePictureEntity` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `type` TEXT NOT NULL, `content` TEXT NOT NULL, `thumbnail` INTEGER, `incidenceId` INTEGER, `path` TEXT, FOREIGN KEY(`incidenceId`) REFERENCES `IncidenceEntity`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        cVar.i("CREATE TABLE IF NOT EXISTS `FavouriteTrainEntity` (`commercialNumber` TEXT NOT NULL, `originStationCode` TEXT NOT NULL, `destinationStationCode` TEXT NOT NULL, `launchingDate` INTEGER NOT NULL, `operator` TEXT, `commercialProduct` TEXT, `timeStationFrom` TEXT, `timeStationTo` TEXT, PRIMARY KEY(`commercialNumber`, `originStationCode`, `destinationStationCode`))");
        cVar.i("CREATE TABLE IF NOT EXISTS `IncidenceStationEntity` (`station_id` INTEGER PRIMARY KEY AUTOINCREMENT, `id` INTEGER NOT NULL, `incidenceCode` TEXT NOT NULL, `stationId` TEXT, `statusTypeId` INTEGER NOT NULL, `description` TEXT NOT NULL, `notificationTypeId` INTEGER NOT NULL, `createdTime` INTEGER NOT NULL, `estimatedDateTo` INTEGER, `solvedDate` INTEGER, `categoryId` TEXT, `photos` TEXT, `comments` TEXT, `stId` TEXT NOT NULL, `name` TEXT NOT NULL, `code` TEXT NOT NULL, `latitude` REAL, `longitude` REAL, `catId` TEXT NOT NULL, `title` TEXT NOT NULL)");
        cVar.i("CREATE TABLE IF NOT EXISTS `SubscriptionEntity` (`subcriptionId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `destination` TEXT, `origin` TEXT NOT NULL, `repeats` TEXT NOT NULL, `subscriptionType` TEXT NOT NULL, `timeCenter` TEXT NOT NULL, `timeEnd` TEXT, `timeStart` TEXT, `active` INTEGER NOT NULL, `operator` TEXT, `commercialProduct` TEXT)");
        cVar.i("CREATE TABLE IF NOT EXISTS `SubscriptionAuxEntity` (`subcriptionAuxId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `subscriptionType` TEXT NOT NULL, `operator` TEXT, `commercialProduct` TEXT)");
        cVar.i("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        cVar.i("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '43f5c312adc2ca1d1a2a64bd71784e25')");
    }

    public static r r(l lVar, S0.j jVar, Q0.b bVar, Q0.c cVar) {
        BitmapDrawable bitmapDrawable = new BitmapDrawable(jVar.f1477a.getResources(), cVar.f1356a);
        J0.g gVar = J0.g.f933a;
        Map map = cVar.f1357b;
        Object obj = map.get("coil#disk_cache_key");
        String str = obj instanceof String ? (String) obj : null;
        Object obj2 = map.get("coil#is_sampled");
        Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
        boolean z3 = false;
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        Bitmap.Config[] configArr = W0.f.f1887a;
        if (lVar != null && lVar.f1197g) {
            z3 = true;
        }
        return new r(bitmapDrawable, jVar, gVar, bVar, str, booleanValue, z3);
    }

    public static a s(int i, int i4, int i5) {
        return new a(AccessibilityNodeInfo.CollectionInfo.obtain(i, i4, false, i5), 10);
    }

    public static M.g u(x0.c cVar) {
        HashMap hashMap = new HashMap(12);
        hashMap.put("stationCode", new C0632b("stationCode", "TEXT", true, 1, null, 1));
        hashMap.put("stationType", new C0632b("stationType", "TEXT", true, 0, null, 1));
        hashMap.put("longName", new C0632b("longName", "TEXT", true, 0, null, 1));
        hashMap.put("shortName", new C0632b("shortName", "TEXT", true, 0, null, 1));
        hashMap.put("longNameToFind", new C0632b("longNameToFind", "TEXT", true, 0, null, 1));
        hashMap.put("shortNameToFind", new C0632b("shortNameToFind", "TEXT", true, 0, null, 1));
        hashMap.put("latitude", new C0632b("latitude", "REAL", true, 0, null, 1));
        hashMap.put("longitude", new C0632b("longitude", "REAL", true, 0, null, 1));
        hashMap.put(NavArguments.ARG_DYNAMIC_LINKS_STATION_TRAFFIC, new C0632b(NavArguments.ARG_DYNAMIC_LINKS_STATION_TRAFFIC, "INTEGER", true, 0, null, 1));
        hashMap.put("commercialZoneType", new C0632b("commercialZoneType", "TEXT", false, 0, null, 1));
        hashMap.put("commuterNetwork", new C0632b("commuterNetwork", "TEXT", true, 0, null, 1));
        hashMap.put("akaName", new C0632b("akaName", "TEXT", true, 0, null, 1));
        u0.f fVar = new u0.f("StationEntity", hashMap, new HashSet(0), new HashSet(0));
        u0.f a2 = u0.f.a(cVar, "StationEntity");
        if (!fVar.equals(a2)) {
            return new M.g(false, "StationEntity(com.adif.elcanomovil.serviceStorage.model.StationEntity).\n Expected:\n" + fVar + "\n Found:\n" + a2);
        }
        HashMap hashMap2 = new HashMap(8);
        hashMap2.put("favouriteId", new C0632b("favouriteId", "INTEGER", true, 1, null, 1));
        hashMap2.put("identifierStation", new C0632b("identifierStation", "TEXT", false, 0, null, 1));
        hashMap2.put("stationName", new C0632b("stationName", "TEXT", false, 0, null, 1));
        hashMap2.put("identifierToStation", new C0632b("identifierToStation", "TEXT", false, 0, null, 1));
        hashMap2.put("stationToName", new C0632b("stationToName", "TEXT", false, 0, null, 1));
        hashMap2.put("type", new C0632b("type", "TEXT", true, 0, null, 1));
        hashMap2.put("isCercanias", new C0632b("isCercanias", "INTEGER", false, 0, null, 1));
        hashMap2.put("isRodalies", new C0632b("isRodalies", "INTEGER", false, 0, null, 1));
        u0.f fVar2 = new u0.f("FavouriteEntity", hashMap2, new HashSet(0), new HashSet(0));
        u0.f a4 = u0.f.a(cVar, "FavouriteEntity");
        if (!fVar2.equals(a4)) {
            return new M.g(false, "FavouriteEntity(com.adif.elcanomovil.serviceStorage.model.FavouriteEntity).\n Expected:\n" + fVar2 + "\n Found:\n" + a4);
        }
        HashMap hashMap3 = new HashMap(5);
        hashMap3.put("stId", new C0632b("stId", "TEXT", true, 1, null, 1));
        hashMap3.put(AppMeasurementSdk.ConditionalUserProperty.NAME, new C0632b(AppMeasurementSdk.ConditionalUserProperty.NAME, "TEXT", true, 0, null, 1));
        hashMap3.put("code", new C0632b("code", "TEXT", true, 0, null, 1));
        hashMap3.put("latitude", new C0632b("latitude", "REAL", false, 0, null, 1));
        hashMap3.put("longitude", new C0632b("longitude", "REAL", false, 0, null, 1));
        u0.f fVar3 = new u0.f("AvisaStation", hashMap3, new HashSet(0), new HashSet(0));
        u0.f a5 = u0.f.a(cVar, "AvisaStation");
        if (!fVar3.equals(a5)) {
            return new M.g(false, "AvisaStation(com.adif.elcanomovil.serviceStorage.model.avisa.AvisaStationEntity).\n Expected:\n" + fVar3 + "\n Found:\n" + a5);
        }
        HashMap hashMap4 = new HashMap(2);
        hashMap4.put("catId", new C0632b("catId", "TEXT", true, 1, null, 1));
        hashMap4.put("title", new C0632b("title", "TEXT", true, 0, null, 1));
        u0.f fVar4 = new u0.f("AvisaStationCategory", hashMap4, new HashSet(0), new HashSet(0));
        u0.f a6 = u0.f.a(cVar, "AvisaStationCategory");
        if (!fVar4.equals(a6)) {
            return new M.g(false, "AvisaStationCategory(com.adif.elcanomovil.serviceStorage.model.avisa.AvisaStationCategoryEntity).\n Expected:\n" + fVar4 + "\n Found:\n" + a6);
        }
        HashMap hashMap5 = new HashMap(12);
        hashMap5.put(NavArguments.ARG_TYPE_NOTIFICATION_JSON_MESSAGE_TRAIN, new C0632b(NavArguments.ARG_TYPE_NOTIFICATION_JSON_MESSAGE_TRAIN, "INTEGER", true, 1, null, 1));
        hashMap5.put("incidenceCode", new C0632b("incidenceCode", "TEXT", true, 0, null, 1));
        hashMap5.put("stationId", new C0632b("stationId", "TEXT", false, 0, null, 1));
        hashMap5.put("statusTypeId", new C0632b("statusTypeId", "INTEGER", true, 0, null, 1));
        hashMap5.put("description", new C0632b("description", "TEXT", true, 0, null, 1));
        hashMap5.put("notificationTypeId", new C0632b("notificationTypeId", "INTEGER", true, 0, null, 1));
        hashMap5.put("createdTime", new C0632b("createdTime", "INTEGER", true, 0, null, 1));
        hashMap5.put("estimatedDateTo", new C0632b("estimatedDateTo", "INTEGER", false, 0, null, 1));
        hashMap5.put("solvedDate", new C0632b("solvedDate", "INTEGER", false, 0, null, 1));
        hashMap5.put("categoryId", new C0632b("categoryId", "TEXT", false, 0, null, 1));
        hashMap5.put("photos", new C0632b("photos", "TEXT", false, 0, null, 1));
        hashMap5.put("comments", new C0632b("comments", "TEXT", false, 0, null, 1));
        HashSet hashSet = new HashSet(2);
        hashSet.add(new u0.c("AvisaStation", "CASCADE", "NO ACTION", Arrays.asList("stationId"), Arrays.asList("stId")));
        hashSet.add(new u0.c("AvisaStationCategory", "CASCADE", "NO ACTION", Arrays.asList("categoryId"), Arrays.asList("catId")));
        u0.f fVar5 = new u0.f("IncidenceEntity", hashMap5, hashSet, new HashSet(0));
        u0.f a7 = u0.f.a(cVar, "IncidenceEntity");
        if (!fVar5.equals(a7)) {
            return new M.g(false, "IncidenceEntity(com.adif.elcanomovil.serviceStorage.model.avisa.IncidenceEntity).\n Expected:\n" + fVar5 + "\n Found:\n" + a7);
        }
        HashMap hashMap6 = new HashMap(8);
        hashMap6.put(NavArguments.ARG_TYPE_NOTIFICATION_JSON_MESSAGE_TRAIN, new C0632b(NavArguments.ARG_TYPE_NOTIFICATION_JSON_MESSAGE_TRAIN, "INTEGER", true, 1, null, 1));
        hashMap6.put("createTime", new C0632b("createTime", "INTEGER", false, 0, null, 1));
        hashMap6.put("updatedTime", new C0632b("updatedTime", "INTEGER", false, 0, null, 1));
        hashMap6.put("type", new C0632b("type", "TEXT", false, 0, null, 1));
        hashMap6.put("statusTypeId", new C0632b("statusTypeId", "TEXT", true, 0, null, 1));
        hashMap6.put("description", new C0632b("description", "TEXT", true, 0, null, 1));
        hashMap6.put(ServicePaths.IncidenceService.pathIncidenceId, new C0632b(ServicePaths.IncidenceService.pathIncidenceId, "INTEGER", false, 0, null, 1));
        hashMap6.put("fixPhotos", new C0632b("fixPhotos", "TEXT", true, 0, null, 1));
        HashSet hashSet2 = new HashSet(1);
        hashSet2.add(new u0.c("IncidenceEntity", "CASCADE", "NO ACTION", Arrays.asList(ServicePaths.IncidenceService.pathIncidenceId), Arrays.asList(NavArguments.ARG_TYPE_NOTIFICATION_JSON_MESSAGE_TRAIN)));
        u0.f fVar6 = new u0.f("IncidenceCommentEntity", hashMap6, hashSet2, new HashSet(0));
        u0.f a8 = u0.f.a(cVar, "IncidenceCommentEntity");
        if (!fVar6.equals(a8)) {
            return new M.g(false, "IncidenceCommentEntity(com.adif.elcanomovil.serviceStorage.model.avisa.IncidenceCommentEntity).\n Expected:\n" + fVar6 + "\n Found:\n" + a8);
        }
        HashMap hashMap7 = new HashMap(6);
        hashMap7.put(NavArguments.ARG_TYPE_NOTIFICATION_JSON_MESSAGE_TRAIN, new C0632b(NavArguments.ARG_TYPE_NOTIFICATION_JSON_MESSAGE_TRAIN, "INTEGER", true, 1, null, 1));
        hashMap7.put("type", new C0632b("type", "TEXT", true, 0, null, 1));
        hashMap7.put(FirebaseAnalytics.Param.CONTENT, new C0632b(FirebaseAnalytics.Param.CONTENT, "TEXT", true, 0, null, 1));
        hashMap7.put("thumbnail", new C0632b("thumbnail", "INTEGER", false, 0, null, 1));
        hashMap7.put(ServicePaths.IncidenceService.pathIncidenceId, new C0632b(ServicePaths.IncidenceService.pathIncidenceId, "INTEGER", false, 0, null, 1));
        hashMap7.put(NavArguments.ARG_DYNAMIC_LINKS_TAB, new C0632b(NavArguments.ARG_DYNAMIC_LINKS_TAB, "TEXT", false, 0, null, 1));
        HashSet hashSet3 = new HashSet(1);
        hashSet3.add(new u0.c("IncidenceEntity", "CASCADE", "NO ACTION", Arrays.asList(ServicePaths.IncidenceService.pathIncidenceId), Arrays.asList(NavArguments.ARG_TYPE_NOTIFICATION_JSON_MESSAGE_TRAIN)));
        u0.f fVar7 = new u0.f("IncidencePictureEntity", hashMap7, hashSet3, new HashSet(0));
        u0.f a9 = u0.f.a(cVar, "IncidencePictureEntity");
        if (!fVar7.equals(a9)) {
            return new M.g(false, "IncidencePictureEntity(com.adif.elcanomovil.serviceStorage.model.avisa.IncidencePictureEntity).\n Expected:\n" + fVar7 + "\n Found:\n" + a9);
        }
        HashMap hashMap8 = new HashMap(8);
        hashMap8.put(NavArguments.ARG_DYNAMIC_LINKS_COMMERCIAL_NUMBER, new C0632b(NavArguments.ARG_DYNAMIC_LINKS_COMMERCIAL_NUMBER, "TEXT", true, 1, null, 1));
        hashMap8.put(NavArguments.ARG_DYNAMIC_LINKS_STATION_CODE, new C0632b(NavArguments.ARG_DYNAMIC_LINKS_STATION_CODE, "TEXT", true, 2, null, 1));
        hashMap8.put(NavArguments.ARG_DYNAMIC_LINKS_STATION_TO_CODE, new C0632b(NavArguments.ARG_DYNAMIC_LINKS_STATION_TO_CODE, "TEXT", true, 3, null, 1));
        hashMap8.put(NavArguments.ARG_DYNAMIC_LINKS_LAUNCHDATE, new C0632b(NavArguments.ARG_DYNAMIC_LINKS_LAUNCHDATE, "INTEGER", true, 0, null, 1));
        hashMap8.put(NavArguments.ARG_DYNAMIC_LINKS_OPERATOR, new C0632b(NavArguments.ARG_DYNAMIC_LINKS_OPERATOR, "TEXT", false, 0, null, 1));
        hashMap8.put(NavArguments.ARG_DYNAMIC_LINKS_COMMERCIAL_PRODUCT, new C0632b(NavArguments.ARG_DYNAMIC_LINKS_COMMERCIAL_PRODUCT, "TEXT", false, 0, null, 1));
        hashMap8.put("timeStationFrom", new C0632b("timeStationFrom", "TEXT", false, 0, null, 1));
        hashMap8.put("timeStationTo", new C0632b("timeStationTo", "TEXT", false, 0, null, 1));
        u0.f fVar8 = new u0.f("FavouriteTrainEntity", hashMap8, new HashSet(0), new HashSet(0));
        u0.f a10 = u0.f.a(cVar, "FavouriteTrainEntity");
        if (!fVar8.equals(a10)) {
            return new M.g(false, "FavouriteTrainEntity(com.adif.elcanomovil.serviceStorage.model.FavouriteTrainEntity).\n Expected:\n" + fVar8 + "\n Found:\n" + a10);
        }
        HashMap hashMap9 = new HashMap(20);
        hashMap9.put("station_id", new C0632b("station_id", "INTEGER", false, 1, null, 1));
        hashMap9.put(NavArguments.ARG_TYPE_NOTIFICATION_JSON_MESSAGE_TRAIN, new C0632b(NavArguments.ARG_TYPE_NOTIFICATION_JSON_MESSAGE_TRAIN, "INTEGER", true, 0, null, 1));
        hashMap9.put("incidenceCode", new C0632b("incidenceCode", "TEXT", true, 0, null, 1));
        hashMap9.put("stationId", new C0632b("stationId", "TEXT", false, 0, null, 1));
        hashMap9.put("statusTypeId", new C0632b("statusTypeId", "INTEGER", true, 0, null, 1));
        hashMap9.put("description", new C0632b("description", "TEXT", true, 0, null, 1));
        hashMap9.put("notificationTypeId", new C0632b("notificationTypeId", "INTEGER", true, 0, null, 1));
        hashMap9.put("createdTime", new C0632b("createdTime", "INTEGER", true, 0, null, 1));
        hashMap9.put("estimatedDateTo", new C0632b("estimatedDateTo", "INTEGER", false, 0, null, 1));
        hashMap9.put("solvedDate", new C0632b("solvedDate", "INTEGER", false, 0, null, 1));
        hashMap9.put("categoryId", new C0632b("categoryId", "TEXT", false, 0, null, 1));
        hashMap9.put("photos", new C0632b("photos", "TEXT", false, 0, null, 1));
        hashMap9.put("comments", new C0632b("comments", "TEXT", false, 0, null, 1));
        hashMap9.put("stId", new C0632b("stId", "TEXT", true, 0, null, 1));
        hashMap9.put(AppMeasurementSdk.ConditionalUserProperty.NAME, new C0632b(AppMeasurementSdk.ConditionalUserProperty.NAME, "TEXT", true, 0, null, 1));
        hashMap9.put("code", new C0632b("code", "TEXT", true, 0, null, 1));
        hashMap9.put("latitude", new C0632b("latitude", "REAL", false, 0, null, 1));
        hashMap9.put("longitude", new C0632b("longitude", "REAL", false, 0, null, 1));
        hashMap9.put("catId", new C0632b("catId", "TEXT", true, 0, null, 1));
        hashMap9.put("title", new C0632b("title", "TEXT", true, 0, null, 1));
        u0.f fVar9 = new u0.f("IncidenceStationEntity", hashMap9, new HashSet(0), new HashSet(0));
        u0.f a11 = u0.f.a(cVar, "IncidenceStationEntity");
        if (!fVar9.equals(a11)) {
            return new M.g(false, "IncidenceStationEntity(com.adif.elcanomovil.serviceStorage.model.avisa.IncidenceStationEntity).\n Expected:\n" + fVar9 + "\n Found:\n" + a11);
        }
        HashMap hashMap10 = new HashMap(11);
        hashMap10.put("subcriptionId", new C0632b("subcriptionId", "INTEGER", true, 1, null, 1));
        hashMap10.put(FirebaseAnalytics.Param.DESTINATION, new C0632b(FirebaseAnalytics.Param.DESTINATION, "TEXT", false, 0, null, 1));
        hashMap10.put("origin", new C0632b("origin", "TEXT", true, 0, null, 1));
        hashMap10.put("repeats", new C0632b("repeats", "TEXT", true, 0, null, 1));
        hashMap10.put("subscriptionType", new C0632b("subscriptionType", "TEXT", true, 0, null, 1));
        hashMap10.put("timeCenter", new C0632b("timeCenter", "TEXT", true, 0, null, 1));
        hashMap10.put("timeEnd", new C0632b("timeEnd", "TEXT", false, 0, null, 1));
        hashMap10.put("timeStart", new C0632b("timeStart", "TEXT", false, 0, null, 1));
        hashMap10.put(AppMeasurementSdk.ConditionalUserProperty.ACTIVE, new C0632b(AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "INTEGER", true, 0, null, 1));
        hashMap10.put(NavArguments.ARG_DYNAMIC_LINKS_OPERATOR, new C0632b(NavArguments.ARG_DYNAMIC_LINKS_OPERATOR, "TEXT", false, 0, null, 1));
        hashMap10.put(NavArguments.ARG_DYNAMIC_LINKS_COMMERCIAL_PRODUCT, new C0632b(NavArguments.ARG_DYNAMIC_LINKS_COMMERCIAL_PRODUCT, "TEXT", false, 0, null, 1));
        u0.f fVar10 = new u0.f("SubscriptionEntity", hashMap10, new HashSet(0), new HashSet(0));
        u0.f a12 = u0.f.a(cVar, "SubscriptionEntity");
        if (!fVar10.equals(a12)) {
            return new M.g(false, "SubscriptionEntity(com.adif.elcanomovil.serviceStorage.model.subscriptions.SubscriptionEntity).\n Expected:\n" + fVar10 + "\n Found:\n" + a12);
        }
        HashMap hashMap11 = new HashMap(4);
        hashMap11.put("subcriptionAuxId", new C0632b("subcriptionAuxId", "INTEGER", true, 1, null, 1));
        hashMap11.put("subscriptionType", new C0632b("subscriptionType", "TEXT", true, 0, null, 1));
        hashMap11.put(NavArguments.ARG_DYNAMIC_LINKS_OPERATOR, new C0632b(NavArguments.ARG_DYNAMIC_LINKS_OPERATOR, "TEXT", false, 0, null, 1));
        hashMap11.put(NavArguments.ARG_DYNAMIC_LINKS_COMMERCIAL_PRODUCT, new C0632b(NavArguments.ARG_DYNAMIC_LINKS_COMMERCIAL_PRODUCT, "TEXT", false, 0, null, 1));
        u0.f fVar11 = new u0.f("SubscriptionAuxEntity", hashMap11, new HashSet(0), new HashSet(0));
        u0.f a13 = u0.f.a(cVar, "SubscriptionAuxEntity");
        if (fVar11.equals(a13)) {
            return new M.g(true, (String) null);
        }
        return new M.g(false, "SubscriptionAuxEntity(com.adif.elcanomovil.serviceStorage.model.subscriptions.SubscriptionAuxEntity).\n Expected:\n" + fVar11 + "\n Found:\n" + a13);
    }

    @Override // Q0.h
    public boolean a(Q0.b bVar) {
        return false;
    }

    @Override // Q0.h
    public Q0.c b(Q0.b bVar) {
        return null;
    }

    @Override // O.InterfaceC0058c
    public C0064f build() {
        ContentInfo build;
        build = ((ContentInfo.Builder) this.f7b).build();
        return new C0064f(new a(build));
    }

    @Override // Q0.h
    public void c(int i) {
    }

    @Override // O.InterfaceC0062e
    public ClipData d() {
        ClipData clip;
        clip = ((ContentInfo) this.f7b).getClip();
        return clip;
    }

    @Override // O.InterfaceC0062e
    public int e() {
        int flags;
        flags = ((ContentInfo) this.f7b).getFlags();
        return flags;
    }

    @Override // O.InterfaceC0062e
    public ContentInfo f() {
        return (ContentInfo) this.f7b;
    }

    @Override // O.InterfaceC0080v
    public D0 g(View view, D0 d02) {
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f7b;
        if (!Objects.equals(coordinatorLayout.f2772n, d02)) {
            coordinatorLayout.f2772n = d02;
            boolean z3 = d02.d() > 0;
            coordinatorLayout.f2773o = z3;
            coordinatorLayout.setWillNotDraw(!z3 && coordinatorLayout.getBackground() == null);
            B0 b02 = d02.f1207a;
            if (!b02.m()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    WeakHashMap weakHashMap = X.f1226a;
                    if (childAt.getFitsSystemWindows() && ((e) childAt.getLayoutParams()).f9a != null && b02.m()) {
                        break;
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return d02;
    }

    @Override // O.InterfaceC0062e
    public int getSource() {
        int source;
        source = ((ContentInfo) this.f7b).getSource();
        return source;
    }

    @Override // Q0.h
    public void h(Q0.b bVar, Bitmap bitmap, Map map) {
        ((Q0.i) this.f7b).e(bVar, bitmap, map, m3.d.r(bitmap));
    }

    @Override // O.InterfaceC0058c
    public void i(Uri uri) {
        ((ContentInfo.Builder) this.f7b).setLinkUri(uri);
    }

    @Override // S2.p
    public Object j() {
        switch (this.f6a) {
            case 16:
                Class cls = (Class) this.f7b;
                try {
                    return u.f1629a.a(cls);
                } catch (Exception e4) {
                    throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e4);
                }
            default:
                Constructor constructor = (Constructor) this.f7b;
                try {
                    return constructor.newInstance(new Object[0]);
                } catch (IllegalAccessException e5) {
                    AbstractC0106b abstractC0106b = V2.c.f1878a;
                    throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e5);
                } catch (InstantiationException e6) {
                    throw new RuntimeException("Failed to invoke constructor '" + V2.c.b(constructor) + "' with no args", e6);
                } catch (InvocationTargetException e7) {
                    throw new RuntimeException("Failed to invoke constructor '" + V2.c.b(constructor) + "' with no args", e7.getCause());
                }
        }
    }

    @Override // O.InterfaceC0058c
    public void k(int i) {
        ((ContentInfo.Builder) this.f7b).setFlags(i);
    }

    public K0.i l() {
        K0.d x3;
        K0.b bVar = (K0.b) this.f7b;
        K0.g gVar = bVar.f983d;
        synchronized (gVar) {
            bVar.a(true);
            x3 = gVar.x(bVar.f980a.f984a);
        }
        if (x3 != null) {
            return new K0.i(x3);
        }
        return null;
    }

    public P.k m(int i) {
        return null;
    }

    public P.k o(int i) {
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x006e, code lost:
    
        if (r6 != false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0109, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d9, code lost:
    
        if (java.lang.Math.abs(r2 - (r10 * r3)) > 1.0d) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00fd, code lost:
    
        if (r12 != 1.0d) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0100, code lost:
    
        if (r0 != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0105, code lost:
    
        if (r12 <= 1.0d) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0107, code lost:
    
        if (r6 == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ec, code lost:
    
        if (java.lang.Math.abs(r8 - r1) > 1) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00f8, code lost:
    
        if (java.lang.Math.abs(r2 - r3) > 1) goto L62;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x010e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Q0.c p(S0.j r18, Q0.b r19, T0.h r20, T0.g r21) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A.a.p(S0.j, Q0.b, T0.h, T0.g):Q0.c");
    }

    public Q0.b q(S0.j jVar, Object obj, o oVar, I0.d dVar) {
        String str;
        Map map;
        Q0.b bVar = jVar.f1480d;
        if (bVar != null) {
            return bVar;
        }
        List list = ((I0.p) this.f7b).f789g.f746c;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                str = null;
                break;
            }
            Pair pair = (Pair) list.get(i);
            O0.b bVar2 = (O0.b) pair.component1();
            if (((Class) pair.component2()).isAssignableFrom(obj.getClass())) {
                Intrinsics.checkNotNull(bVar2, "null cannot be cast to non-null type coil.key.Keyer<kotlin.Any>");
                str = bVar2.a(obj, oVar);
                if (str != null) {
                    break;
                }
            }
            i++;
        }
        if (str == null) {
            return null;
        }
        Map map2 = jVar.f1499z.f1516a;
        if (map2.isEmpty()) {
            map = MapsKt.emptyMap();
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = map2.entrySet().iterator();
            if (it.hasNext()) {
                ((Map.Entry) it.next()).getValue().getClass();
                throw new ClassCastException();
            }
            map = linkedHashMap;
        }
        List list2 = jVar.h;
        if (list2.isEmpty() && map.isEmpty()) {
            return new Q0.b(str);
        }
        Map mutableMap = MapsKt.toMutableMap(map);
        if (!list2.isEmpty()) {
            if (list2.size() > 0) {
                list2.get(0).getClass();
                throw new ClassCastException();
            }
            mutableMap.put("coil#transformation_size", oVar.f1505d.toString());
        }
        return new Q0.b(str, mutableMap);
    }

    @Override // O.InterfaceC0058c
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.f7b).setExtras(bundle);
    }

    public void t(float f2, float f4, float f5) {
        S1.o oVar = (S1.o) this.f7b;
        if (oVar.d() < oVar.f1563e || f2 < 1.0f) {
            oVar.getClass();
            oVar.f1569m.postScale(f2, f2, f4, f5);
            oVar.a();
        }
    }

    public String toString() {
        switch (this.f6a) {
            case 8:
                return "ContentInfoCompat{" + ((ContentInfo) this.f7b) + "}";
            default:
                return super.toString();
        }
    }

    public boolean v(int i, int i4, Bundle bundle) {
        return false;
    }

    public /* synthetic */ a(Object obj, int i) {
        this.f6a = i;
        this.f7b = obj;
    }

    public a(I0.p pVar, F.i iVar) {
        this.f6a = 13;
        this.f7b = pVar;
    }

    public a(Context context, L l4) {
        this.f6a = 9;
        this.f7b = new GestureDetector(context, l4, null);
    }

    public a(TextView textView) {
        this.f6a = 28;
        this.f7b = new C0344h(textView);
    }

    public a(S0.p pVar) {
        this.f6a = 14;
        this.f7b = MapsKt.toMutableMap(pVar.f1516a);
    }

    public a(EditText editText) {
        this.f6a = 27;
        this.f7b = new F.i(editText);
    }

    public a(int i) {
        this.f6a = i;
        switch (i) {
            case 21:
                this.f7b = new LinkedHashMap();
                return;
            case 26:
                TimeUnit timeUnit = TimeUnit.MINUTES;
                Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
                m delegate = new m(h3.e.i);
                Intrinsics.checkNotNullParameter(delegate, "delegate");
                this.f7b = delegate;
                return;
            default:
                this.f7b = new P.l(this);
                return;
        }
    }

    public a(ContentInfo contentInfo) {
        this.f6a = 8;
        contentInfo.getClass();
        this.f7b = B2.e.h(contentInfo);
    }

    public a(ClipData clipData, int i) {
        this.f6a = 7;
        this.f7b = B2.e.f(clipData, i);
    }
}
