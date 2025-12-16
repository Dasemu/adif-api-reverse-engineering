package g0;

import C.w;
import a.AbstractC0105a;
import android.content.res.AssetManager;
import android.media.MediaMetadataRetriever;
import android.util.Log;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: D, reason: collision with root package name */
    public static final String[] f6701D;

    /* renamed from: E, reason: collision with root package name */
    public static final int[] f6702E;

    /* renamed from: F, reason: collision with root package name */
    public static final byte[] f6703F;

    /* renamed from: G, reason: collision with root package name */
    public static final d f6704G;

    /* renamed from: H, reason: collision with root package name */
    public static final d[][] f6705H;

    /* renamed from: I, reason: collision with root package name */
    public static final d[] f6706I;
    public static final HashMap[] J;

    /* renamed from: K, reason: collision with root package name */
    public static final HashMap[] f6707K;

    /* renamed from: L, reason: collision with root package name */
    public static final HashSet f6708L;

    /* renamed from: M, reason: collision with root package name */
    public static final HashMap f6709M;

    /* renamed from: N, reason: collision with root package name */
    public static final Charset f6710N;

    /* renamed from: O, reason: collision with root package name */
    public static final byte[] f6711O;

    /* renamed from: P, reason: collision with root package name */
    public static final byte[] f6712P;

    /* renamed from: a, reason: collision with root package name */
    public final FileDescriptor f6727a;

    /* renamed from: b, reason: collision with root package name */
    public final AssetManager.AssetInputStream f6728b;

    /* renamed from: c, reason: collision with root package name */
    public int f6729c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap[] f6730d;

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f6731e;

    /* renamed from: f, reason: collision with root package name */
    public ByteOrder f6732f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f6733g;
    public int h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f6734j;

    /* renamed from: k, reason: collision with root package name */
    public int f6735k;

    /* renamed from: l, reason: collision with root package name */
    public static final boolean f6713l = Log.isLoggable("ExifInterface", 3);

    /* renamed from: m, reason: collision with root package name */
    public static final List f6714m = Arrays.asList(1, 6, 3, 8);

    /* renamed from: n, reason: collision with root package name */
    public static final List f6715n = Arrays.asList(2, 7, 4, 5);

    /* renamed from: o, reason: collision with root package name */
    public static final int[] f6716o = {8, 8, 8};
    public static final int[] p = {8};

    /* renamed from: q, reason: collision with root package name */
    public static final byte[] f6717q = {-1, -40, -1};

    /* renamed from: r, reason: collision with root package name */
    public static final byte[] f6718r = {102, 116, 121, 112};

    /* renamed from: s, reason: collision with root package name */
    public static final byte[] f6719s = {109, 105, 102, 49};

    /* renamed from: t, reason: collision with root package name */
    public static final byte[] f6720t = {104, 101, 105, 99};

    /* renamed from: u, reason: collision with root package name */
    public static final byte[] f6721u = {79, 76, 89, 77, 80, 0};

    /* renamed from: v, reason: collision with root package name */
    public static final byte[] f6722v = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    /* renamed from: w, reason: collision with root package name */
    public static final byte[] f6723w = {-119, 80, 78, 71, 13, 10, 26, 10};

    /* renamed from: x, reason: collision with root package name */
    public static final byte[] f6724x = {101, 88, 73, 102};

    /* renamed from: y, reason: collision with root package name */
    public static final byte[] f6725y = {73, 72, 68, 82};

    /* renamed from: z, reason: collision with root package name */
    public static final byte[] f6726z = {73, 69, 78, 68};

    /* renamed from: A, reason: collision with root package name */
    public static final byte[] f6698A = {82, 73, 70, 70};

    /* renamed from: B, reason: collision with root package name */
    public static final byte[] f6699B = {87, 69, 66, 80};

    /* renamed from: C, reason: collision with root package name */
    public static final byte[] f6700C = {69, 88, 73, 70};

    static {
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        f6701D = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        f6702E = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        f6703F = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        d[] dVarArr = {new d("NewSubfileType", 254, 4), new d("SubfileType", KotlinVersion.MAX_COMPONENT_VALUE, 4), new d("ImageWidth", 256, 3, 4), new d("ImageLength", 257, 3, 4), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d("StripOffsets", 273, 3, 4), new d("Orientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d("RowsPerStrip", 278, 3, 4), new d("StripByteCounts", 279, 3, 4), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("SensorTopBorder", 4, 4), new d("SensorLeftBorder", 5, 4), new d("SensorBottomBorder", 6, 4), new d("SensorRightBorder", 7, 4), new d("ISO", 23, 3), new d("JpgFromRaw", 46, 7), new d("Xmp", 700, 1)};
        d[] dVarArr2 = {new d("ExposureTime", 33434, 5), new d("FNumber", 33437, 5), new d("ExposureProgram", 34850, 3), new d("SpectralSensitivity", 34852, 2), new d("PhotographicSensitivity", 34855, 3), new d("OECF", 34856, 7), new d("SensitivityType", 34864, 3), new d("StandardOutputSensitivity", 34865, 4), new d("RecommendedExposureIndex", 34866, 4), new d("ISOSpeed", 34867, 4), new d("ISOSpeedLatitudeyyy", 34868, 4), new d("ISOSpeedLatitudezzz", 34869, 4), new d("ExifVersion", 36864, 2), new d("DateTimeOriginal", 36867, 2), new d("DateTimeDigitized", 36868, 2), new d("OffsetTime", 36880, 2), new d("OffsetTimeOriginal", 36881, 2), new d("OffsetTimeDigitized", 36882, 2), new d("ComponentsConfiguration", 37121, 7), new d("CompressedBitsPerPixel", 37122, 5), new d("ShutterSpeedValue", 37377, 10), new d("ApertureValue", 37378, 5), new d("BrightnessValue", 37379, 10), new d("ExposureBiasValue", 37380, 10), new d("MaxApertureValue", 37381, 5), new d("SubjectDistance", 37382, 5), new d("MeteringMode", 37383, 3), new d("LightSource", 37384, 3), new d("Flash", 37385, 3), new d("FocalLength", 37386, 5), new d("SubjectArea", 37396, 3), new d("MakerNote", 37500, 7), new d("UserComment", 37510, 7), new d("SubSecTime", 37520, 2), new d("SubSecTimeOriginal", 37521, 2), new d("SubSecTimeDigitized", 37522, 2), new d("FlashpixVersion", 40960, 7), new d("ColorSpace", 40961, 3), new d("PixelXDimension", 40962, 3, 4), new d("PixelYDimension", 40963, 3, 4), new d("RelatedSoundFile", 40964, 2), new d("InteroperabilityIFDPointer", 40965, 4), new d("FlashEnergy", 41483, 5), new d("SpatialFrequencyResponse", 41484, 7), new d("FocalPlaneXResolution", 41486, 5), new d("FocalPlaneYResolution", 41487, 5), new d("FocalPlaneResolutionUnit", 41488, 3), new d("SubjectLocation", 41492, 3), new d("ExposureIndex", 41493, 5), new d("SensingMethod", 41495, 3), new d("FileSource", 41728, 7), new d("SceneType", 41729, 7), new d("CFAPattern", 41730, 7), new d("CustomRendered", 41985, 3), new d("ExposureMode", 41986, 3), new d("WhiteBalance", 41987, 3), new d("DigitalZoomRatio", 41988, 5), new d("FocalLengthIn35mmFilm", 41989, 3), new d("SceneCaptureType", 41990, 3), new d("GainControl", 41991, 3), new d("Contrast", 41992, 3), new d("Saturation", 41993, 3), new d("Sharpness", 41994, 3), new d("DeviceSettingDescription", 41995, 7), new d("SubjectDistanceRange", 41996, 3), new d("ImageUniqueID", 42016, 2), new d("CameraOwnerName", 42032, 2), new d("BodySerialNumber", 42033, 2), new d("LensSpecification", 42034, 5), new d("LensMake", 42035, 2), new d("LensModel", 42036, 2), new d("Gamma", 42240, 5), new d("DNGVersion", 50706, 1), new d("DefaultCropSize", 50720, 3, 4)};
        d[] dVarArr3 = {new d("GPSVersionID", 0, 1), new d("GPSLatitudeRef", 1, 2), new d("GPSLatitude", 2, 5, 10), new d("GPSLongitudeRef", 3, 2), new d("GPSLongitude", 4, 5, 10), new d("GPSAltitudeRef", 5, 1), new d("GPSAltitude", 6, 5), new d("GPSTimeStamp", 7, 5), new d("GPSSatellites", 8, 2), new d("GPSStatus", 9, 2), new d("GPSMeasureMode", 10, 2), new d("GPSDOP", 11, 5), new d("GPSSpeedRef", 12, 2), new d("GPSSpeed", 13, 5), new d("GPSTrackRef", 14, 2), new d("GPSTrack", 15, 5), new d("GPSImgDirectionRef", 16, 2), new d("GPSImgDirection", 17, 5), new d("GPSMapDatum", 18, 2), new d("GPSDestLatitudeRef", 19, 2), new d("GPSDestLatitude", 20, 5), new d("GPSDestLongitudeRef", 21, 2), new d("GPSDestLongitude", 22, 5), new d("GPSDestBearingRef", 23, 2), new d("GPSDestBearing", 24, 5), new d("GPSDestDistanceRef", 25, 2), new d("GPSDestDistance", 26, 5), new d("GPSProcessingMethod", 27, 7), new d("GPSAreaInformation", 28, 7), new d("GPSDateStamp", 29, 2), new d("GPSDifferential", 30, 3), new d("GPSHPositioningError", 31, 5)};
        d[] dVarArr4 = {new d("InteroperabilityIndex", 1, 2)};
        d[] dVarArr5 = {new d("NewSubfileType", 254, 4), new d("SubfileType", KotlinVersion.MAX_COMPONENT_VALUE, 4), new d("ThumbnailImageWidth", 256, 3, 4), new d("ThumbnailImageLength", 257, 3, 4), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d("StripOffsets", 273, 3, 4), new d("ThumbnailOrientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d("RowsPerStrip", 278, 3, 4), new d("StripByteCounts", 279, 3, 4), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("DNGVersion", 50706, 1), new d("DefaultCropSize", 50720, 3, 4)};
        f6704G = new d("StripOffsets", 273, 3);
        f6705H = new d[][]{dVarArr, dVarArr2, dVarArr3, dVarArr4, dVarArr5, dVarArr, new d[]{new d("ThumbnailImage", 256, 7), new d("CameraSettingsIFDPointer", 8224, 4), new d("ImageProcessingIFDPointer", 8256, 4)}, new d[]{new d("PreviewImageStart", 257, 4), new d("PreviewImageLength", 258, 4)}, new d[]{new d("AspectFrame", 4371, 3)}, new d[]{new d("ColorSpace", 55, 3)}};
        f6706I = new d[]{new d("SubIFDPointer", 330, 4), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("InteroperabilityIFDPointer", 40965, 4), new d("CameraSettingsIFDPointer", 8224, 1), new d("ImageProcessingIFDPointer", 8256, 1)};
        J = new HashMap[10];
        f6707K = new HashMap[10];
        f6708L = new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        f6709M = new HashMap();
        Charset forName = Charset.forName("US-ASCII");
        f6710N = forName;
        f6711O = "Exif\u0000\u0000".getBytes(forName);
        f6712P = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            d[][] dVarArr6 = f6705H;
            if (i >= dVarArr6.length) {
                HashMap hashMap = f6709M;
                d[] dVarArr7 = f6706I;
                hashMap.put(Integer.valueOf(dVarArr7[0].f6692a), 5);
                hashMap.put(Integer.valueOf(dVarArr7[1].f6692a), 1);
                hashMap.put(Integer.valueOf(dVarArr7[2].f6692a), 2);
                hashMap.put(Integer.valueOf(dVarArr7[3].f6692a), 3);
                hashMap.put(Integer.valueOf(dVarArr7[4].f6692a), 7);
                hashMap.put(Integer.valueOf(dVarArr7[5].f6692a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            J[i] = new HashMap();
            f6707K[i] = new HashMap();
            for (d dVar : dVarArr6[i]) {
                J[i].put(Integer.valueOf(dVar.f6692a), dVar);
                f6707K[i].put(dVar.f6693b, dVar);
            }
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00bc A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public g(J0.k r9) {
        /*
            r8 = this;
            r8.<init>()
            g0.d[][] r0 = g0.g.f6705H
            int r1 = r0.length
            java.util.HashMap[] r1 = new java.util.HashMap[r1]
            r8.f6730d = r1
            java.util.HashSet r1 = new java.util.HashSet
            int r2 = r0.length
            r1.<init>(r2)
            r8.f6731e = r1
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            r8.f6732f = r1
            r1 = 0
            boolean r2 = g0.g.f6713l
            java.lang.String r3 = "ExifInterface"
            r8.f6728b = r1
            r8.f6727a = r1
            r1 = 0
            r4 = r1
        L21:
            int r5 = r0.length     // Catch: java.lang.Throwable -> L30 java.lang.Throwable -> L33
            if (r4 >= r5) goto L36
            java.util.HashMap[] r5 = r8.f6730d     // Catch: java.lang.Throwable -> L30 java.lang.Throwable -> L33
            java.util.HashMap r6 = new java.util.HashMap     // Catch: java.lang.Throwable -> L30 java.lang.Throwable -> L33
            r6.<init>()     // Catch: java.lang.Throwable -> L30 java.lang.Throwable -> L33
            r5[r4] = r6     // Catch: java.lang.Throwable -> L30 java.lang.Throwable -> L33
            int r4 = r4 + 1
            goto L21
        L30:
            r9 = move-exception
            goto Lad
        L33:
            r9 = move-exception
            goto La5
        L36:
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L30 java.lang.Throwable -> L33
            r4 = 5000(0x1388, float:7.006E-42)
            r0.<init>(r9, r4)     // Catch: java.lang.Throwable -> L30 java.lang.Throwable -> L33
            int r9 = r8.f(r0)     // Catch: java.lang.Throwable -> L30 java.lang.Throwable -> L33
            r8.f6729c = r9     // Catch: java.lang.Throwable -> L30 java.lang.Throwable -> L33
            r4 = 14
            r5 = 13
            r6 = 9
            r7 = 4
            if (r9 == r7) goto L7e
            if (r9 == r6) goto L7e
            if (r9 == r5) goto L7e
            if (r9 != r4) goto L53
            goto L7e
        L53:
            g0.f r9 = new g0.f     // Catch: java.lang.Throwable -> L30 java.lang.Throwable -> L33
            r9.<init>(r0)     // Catch: java.lang.Throwable -> L30 java.lang.Throwable -> L33
            int r0 = r8.f6729c     // Catch: java.lang.Throwable -> L30 java.lang.Throwable -> L33
            r1 = 12
            if (r0 != r1) goto L62
            r8.d(r9)     // Catch: java.lang.Throwable -> L30 java.lang.Throwable -> L33
            goto L74
        L62:
            r1 = 7
            if (r0 != r1) goto L69
            r8.g(r9)     // Catch: java.lang.Throwable -> L30 java.lang.Throwable -> L33
            goto L74
        L69:
            r1 = 10
            if (r0 != r1) goto L71
            r8.k(r9)     // Catch: java.lang.Throwable -> L30 java.lang.Throwable -> L33
            goto L74
        L71:
            r8.j(r9)     // Catch: java.lang.Throwable -> L30 java.lang.Throwable -> L33
        L74:
            int r0 = r8.h     // Catch: java.lang.Throwable -> L30 java.lang.Throwable -> L33
            long r0 = (long) r0     // Catch: java.lang.Throwable -> L30 java.lang.Throwable -> L33
            r9.e(r0)     // Catch: java.lang.Throwable -> L30 java.lang.Throwable -> L33
            r8.u(r9)     // Catch: java.lang.Throwable -> L30 java.lang.Throwable -> L33
            goto L9c
        L7e:
            g0.b r9 = new g0.b     // Catch: java.lang.Throwable -> L30 java.lang.Throwable -> L33
            r9.<init>(r0)     // Catch: java.lang.Throwable -> L30 java.lang.Throwable -> L33
            int r0 = r8.f6729c     // Catch: java.lang.Throwable -> L30 java.lang.Throwable -> L33
            if (r0 != r7) goto L8b
            r8.e(r9, r1, r1)     // Catch: java.lang.Throwable -> L30 java.lang.Throwable -> L33
            goto L9c
        L8b:
            if (r0 != r5) goto L91
            r8.h(r9)     // Catch: java.lang.Throwable -> L30 java.lang.Throwable -> L33
            goto L9c
        L91:
            if (r0 != r6) goto L97
            r8.i(r9)     // Catch: java.lang.Throwable -> L30 java.lang.Throwable -> L33
            goto L9c
        L97:
            if (r0 != r4) goto L9c
            r8.l(r9)     // Catch: java.lang.Throwable -> L30 java.lang.Throwable -> L33
        L9c:
            r8.a()
            if (r2 == 0) goto Lbc
        La1:
            r8.p()
            goto Lbc
        La5:
            if (r2 == 0) goto Lb6
            java.lang.String r0 = "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface."
            android.util.Log.w(r3, r0, r9)     // Catch: java.lang.Throwable -> L30
            goto Lb6
        Lad:
            r8.a()
            if (r2 == 0) goto Lb5
            r8.p()
        Lb5:
            throw r9
        Lb6:
            r8.a()
            if (r2 == 0) goto Lbc
            goto La1
        Lbc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.g.<init>(J0.k):void");
    }

    public static ByteOrder q(b bVar) {
        short readShort = bVar.readShort();
        boolean z3 = f6713l;
        if (readShort == 18761) {
            if (z3) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (readShort == 19789) {
            if (z3) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
    }

    public final void a() {
        String b4 = b("DateTimeOriginal");
        HashMap[] hashMapArr = this.f6730d;
        if (b4 != null && b("DateTime") == null) {
            HashMap hashMap = hashMapArr[0];
            byte[] bytes = b4.concat("\u0000").getBytes(f6710N);
            hashMap.put("DateTime", new c(2, bytes.length, bytes));
        }
        if (b("ImageWidth") == null) {
            hashMapArr[0].put("ImageWidth", c.a(0L, this.f6732f));
        }
        if (b("ImageLength") == null) {
            hashMapArr[0].put("ImageLength", c.a(0L, this.f6732f));
        }
        if (b("Orientation") == null) {
            hashMapArr[0].put("Orientation", c.a(0L, this.f6732f));
        }
        if (b("LightSource") == null) {
            hashMapArr[1].put("LightSource", c.a(0L, this.f6732f));
        }
    }

    public final String b(String str) {
        c c4 = c(str);
        if (c4 != null) {
            if (!f6708L.contains(str)) {
                return c4.f(this.f6732f);
            }
            if (str.equals("GPSTimeStamp")) {
                int i = c4.f6688a;
                if (i != 5 && i != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + i);
                    return null;
                }
                e[] eVarArr = (e[]) c4.g(this.f6732f);
                if (eVarArr == null || eVarArr.length != 3) {
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(eVarArr));
                    return null;
                }
                e eVar = eVarArr[0];
                Integer valueOf = Integer.valueOf((int) (((float) eVar.f6696a) / ((float) eVar.f6697b)));
                e eVar2 = eVarArr[1];
                Integer valueOf2 = Integer.valueOf((int) (((float) eVar2.f6696a) / ((float) eVar2.f6697b)));
                e eVar3 = eVarArr[2];
                return String.format("%02d:%02d:%02d", valueOf, valueOf2, Integer.valueOf((int) (((float) eVar3.f6696a) / ((float) eVar3.f6697b))));
            }
            try {
                return Double.toString(c4.d(this.f6732f));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final c c(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            if (f6713l) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i = 0; i < f6705H.length; i++) {
            c cVar = (c) this.f6730d[i].get(str);
            if (cVar != null) {
                return cVar;
            }
        }
        return null;
    }

    public final void d(f fVar) {
        String str;
        String str2;
        String str3;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                i.a(mediaMetadataRetriever, new C0373a(fVar));
                String extractMetadata = mediaMetadataRetriever.extractMetadata(33);
                String extractMetadata2 = mediaMetadataRetriever.extractMetadata(34);
                String extractMetadata3 = mediaMetadataRetriever.extractMetadata(26);
                String extractMetadata4 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(extractMetadata3)) {
                    str = mediaMetadataRetriever.extractMetadata(29);
                    str2 = mediaMetadataRetriever.extractMetadata(30);
                    str3 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(extractMetadata4)) {
                    str = mediaMetadataRetriever.extractMetadata(18);
                    str2 = mediaMetadataRetriever.extractMetadata(19);
                    str3 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    str = null;
                    str2 = null;
                    str3 = null;
                }
                HashMap[] hashMapArr = this.f6730d;
                if (str != null) {
                    hashMapArr[0].put("ImageWidth", c.c(Integer.parseInt(str), this.f6732f));
                }
                if (str2 != null) {
                    hashMapArr[0].put("ImageLength", c.c(Integer.parseInt(str2), this.f6732f));
                }
                if (str3 != null) {
                    int parseInt = Integer.parseInt(str3);
                    hashMapArr[0].put("Orientation", c.c(parseInt != 90 ? parseInt != 180 ? parseInt != 270 ? 1 : 8 : 3 : 6, this.f6732f));
                }
                if (extractMetadata != null && extractMetadata2 != null) {
                    int parseInt2 = Integer.parseInt(extractMetadata);
                    int parseInt3 = Integer.parseInt(extractMetadata2);
                    if (parseInt3 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    fVar.e(parseInt2);
                    byte[] bArr = new byte[6];
                    if (fVar.read(bArr) != 6) {
                        throw new IOException("Can't read identifier");
                    }
                    int i = parseInt2 + 6;
                    int i4 = parseInt3 - 6;
                    if (!Arrays.equals(bArr, f6711O)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i4];
                    if (fVar.read(bArr2) != i4) {
                        throw new IOException("Can't read exif");
                    }
                    this.h = i;
                    r(0, bArr2);
                }
                if (f6713l) {
                    Log.d("ExifInterface", "Heif meta: " + str + "x" + str2 + ", rotation " + str3);
                }
                mediaMetadataRetriever.release();
            } catch (RuntimeException unused) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
            }
        } catch (Throwable th) {
            mediaMetadataRetriever.release();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x01a2, code lost:
    
        r23.f6685b = r22.f6732f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01a6, code lost:
    
        return;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:30:0x00a7. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(g0.b r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 540
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.g.e(g0.b, int, int):void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:14|15|(4:16|17|18|19)|(16:106|(2:108|109)(1:152)|111|112|(1:114)|115|(3:118|119|(4:124|(3:129|(1:131)(2:139|(1:141))|(3:134|135|136))(2:126|127)|128|120))|117|22|23|25|26|27|(1:93)(1:31)|32|(1:34)(8:36|37|38|39|40|(1:42)(1:79)|43|(1:45)(3:46|(2:47|(2:49|(2:52|53)(1:51))(2:77|78))|(1:55)(3:56|(2:57|(2:59|(1:62)(1:61))(3:67|68|(2:69|(2:71|(1:74)(1:73))(2:75|76))))|(1:65)(1:66)))))|21|22|23|25|26|27|(1:29)|93|32|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x00f4, code lost:
    
        r6 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x00fa, code lost:
    
        if (r6 != null) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x00fc, code lost:
    
        r6.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x00ff, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x00f8, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x00f6, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0061, code lost:
    
        if (r9 < 16) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x00ce, code lost:
    
        if (r8 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0166, code lost:
    
        r5 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0100, code lost:
    
        if (r2 != null) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0102, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0105, code lost:
    
        r0 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x00f3, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0109 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x013d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0140  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int f(java.io.BufferedInputStream r18) {
        /*
            Method dump skipped, instructions count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.g.f(java.io.BufferedInputStream):int");
    }

    public final void g(f fVar) {
        int i;
        int i4;
        j(fVar);
        HashMap[] hashMapArr = this.f6730d;
        c cVar = (c) hashMapArr[1].get("MakerNote");
        if (cVar != null) {
            f fVar2 = new f(cVar.f6691d);
            fVar2.f6685b = this.f6732f;
            byte[] bArr = f6721u;
            byte[] bArr2 = new byte[bArr.length];
            fVar2.readFully(bArr2);
            fVar2.e(0L);
            byte[] bArr3 = f6722v;
            byte[] bArr4 = new byte[bArr3.length];
            fVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                fVar2.e(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                fVar2.e(12L);
            }
            s(fVar2, 6);
            c cVar2 = (c) hashMapArr[7].get("PreviewImageStart");
            c cVar3 = (c) hashMapArr[7].get("PreviewImageLength");
            if (cVar2 != null && cVar3 != null) {
                hashMapArr[5].put("JPEGInterchangeFormat", cVar2);
                hashMapArr[5].put("JPEGInterchangeFormatLength", cVar3);
            }
            c cVar4 = (c) hashMapArr[8].get("AspectFrame");
            if (cVar4 != null) {
                int[] iArr = (int[]) cVar4.g(this.f6732f);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i5 = iArr[2];
                int i6 = iArr[0];
                if (i5 <= i6 || (i = iArr[3]) <= (i4 = iArr[1])) {
                    return;
                }
                int i7 = (i5 - i6) + 1;
                int i8 = (i - i4) + 1;
                if (i7 < i8) {
                    int i9 = i7 + i8;
                    i8 = i9 - i8;
                    i7 = i9 - i8;
                }
                c c4 = c.c(i7, this.f6732f);
                c c5 = c.c(i8, this.f6732f);
                hashMapArr[0].put("ImageWidth", c4);
                hashMapArr[0].put("ImageLength", c5);
            }
        }
    }

    public final void h(b bVar) {
        if (f6713l) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + bVar);
        }
        bVar.f6685b = ByteOrder.BIG_ENDIAN;
        byte[] bArr = f6723w;
        bVar.d(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int readInt = bVar.readInt();
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
                int i = length + 8;
                if (i == 16 && !Arrays.equals(bArr2, f6725y)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, f6726z)) {
                    return;
                }
                if (Arrays.equals(bArr2, f6724x)) {
                    byte[] bArr3 = new byte[readInt];
                    if (bVar.read(bArr3) != readInt) {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + AbstractC0105a.e(bArr2));
                    }
                    int readInt2 = bVar.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == readInt2) {
                        this.h = i;
                        r(0, bArr3);
                        x();
                        u(new b(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt2 + ", calculated CRC value: " + crc32.getValue());
                }
                int i4 = readInt + 4;
                bVar.d(i4);
                length = i + i4;
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    public final void i(b bVar) {
        boolean z3 = f6713l;
        if (z3) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + bVar);
        }
        bVar.d(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.read(bArr);
        bVar.read(bArr2);
        bVar.read(bArr3);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i4 = ByteBuffer.wrap(bArr2).getInt();
        int i5 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i4];
        bVar.d(i - bVar.f6686c);
        bVar.read(bArr4);
        e(new b(bArr4), i, 5);
        bVar.d(i5 - bVar.f6686c);
        bVar.f6685b = ByteOrder.BIG_ENDIAN;
        int readInt = bVar.readInt();
        if (z3) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + readInt);
        }
        for (int i6 = 0; i6 < readInt; i6++) {
            int readUnsignedShort = bVar.readUnsignedShort();
            int readUnsignedShort2 = bVar.readUnsignedShort();
            if (readUnsignedShort == f6704G.f6692a) {
                short readShort = bVar.readShort();
                short readShort2 = bVar.readShort();
                c c4 = c.c(readShort, this.f6732f);
                c c5 = c.c(readShort2, this.f6732f);
                HashMap[] hashMapArr = this.f6730d;
                hashMapArr[0].put("ImageLength", c4);
                hashMapArr[0].put("ImageWidth", c5);
                if (z3) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) readShort) + ", width: " + ((int) readShort2));
                    return;
                }
                return;
            }
            bVar.d(readUnsignedShort2);
        }
    }

    public final void j(f fVar) {
        o(fVar);
        s(fVar, 0);
        w(fVar, 0);
        w(fVar, 5);
        w(fVar, 4);
        x();
        if (this.f6729c == 8) {
            HashMap[] hashMapArr = this.f6730d;
            c cVar = (c) hashMapArr[1].get("MakerNote");
            if (cVar != null) {
                f fVar2 = new f(cVar.f6691d);
                fVar2.f6685b = this.f6732f;
                fVar2.d(6);
                s(fVar2, 9);
                c cVar2 = (c) hashMapArr[9].get("ColorSpace");
                if (cVar2 != null) {
                    hashMapArr[1].put("ColorSpace", cVar2);
                }
            }
        }
    }

    public final void k(f fVar) {
        if (f6713l) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + fVar);
        }
        j(fVar);
        HashMap[] hashMapArr = this.f6730d;
        c cVar = (c) hashMapArr[0].get("JpgFromRaw");
        if (cVar != null) {
            e(new b(cVar.f6691d), (int) cVar.f6690c, 5);
        }
        c cVar2 = (c) hashMapArr[0].get("ISO");
        c cVar3 = (c) hashMapArr[1].get("PhotographicSensitivity");
        if (cVar2 == null || cVar3 != null) {
            return;
        }
        hashMapArr[1].put("PhotographicSensitivity", cVar2);
    }

    public final void l(b bVar) {
        if (f6713l) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + bVar);
        }
        bVar.f6685b = ByteOrder.LITTLE_ENDIAN;
        bVar.d(f6698A.length);
        int readInt = bVar.readInt() + 8;
        byte[] bArr = f6699B;
        bVar.d(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
                int readInt2 = bVar.readInt();
                int i = length + 8;
                if (Arrays.equals(f6700C, bArr2)) {
                    byte[] bArr3 = new byte[readInt2];
                    if (bVar.read(bArr3) == readInt2) {
                        this.h = i;
                        r(0, bArr3);
                        u(new b(bArr3));
                        return;
                    } else {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + AbstractC0105a.e(bArr2));
                    }
                }
                if (readInt2 % 2 == 1) {
                    readInt2++;
                }
                length = i + readInt2;
                if (length == readInt) {
                    return;
                }
                if (length > readInt) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                bVar.d(readInt2);
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    public final void m(b bVar, HashMap hashMap) {
        c cVar = (c) hashMap.get("JPEGInterchangeFormat");
        c cVar2 = (c) hashMap.get("JPEGInterchangeFormatLength");
        if (cVar == null || cVar2 == null) {
            return;
        }
        int e4 = cVar.e(this.f6732f);
        int e5 = cVar2.e(this.f6732f);
        if (this.f6729c == 7) {
            e4 += this.i;
        }
        if (e4 > 0 && e5 > 0 && this.f6728b == null && this.f6727a == null) {
            bVar.skip(e4);
            bVar.read(new byte[e5]);
        }
        if (f6713l) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + e4 + ", length: " + e5);
        }
    }

    public final boolean n(HashMap hashMap) {
        c cVar = (c) hashMap.get("ImageLength");
        c cVar2 = (c) hashMap.get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            return false;
        }
        return cVar.e(this.f6732f) <= 512 && cVar2.e(this.f6732f) <= 512;
    }

    public final void o(f fVar) {
        ByteOrder q4 = q(fVar);
        this.f6732f = q4;
        fVar.f6685b = q4;
        int readUnsignedShort = fVar.readUnsignedShort();
        int i = this.f6729c;
        if (i != 7 && i != 10 && readUnsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
        }
        int readInt = fVar.readInt();
        if (readInt < 8) {
            throw new IOException(com.google.android.gms.measurement.internal.a.l(readInt, "Invalid first Ifd offset: "));
        }
        int i4 = readInt - 8;
        if (i4 > 0) {
            fVar.d(i4);
        }
    }

    public final void p() {
        int i = 0;
        while (true) {
            HashMap[] hashMapArr = this.f6730d;
            if (i >= hashMapArr.length) {
                return;
            }
            StringBuilder t2 = w.t(i, "The size of tag group[", "]: ");
            t2.append(hashMapArr[i].size());
            Log.d("ExifInterface", t2.toString());
            for (Map.Entry entry : hashMapArr[i].entrySet()) {
                c cVar = (c) entry.getValue();
                Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + cVar.toString() + ", tagValue: '" + cVar.f(this.f6732f) + "'");
            }
            i++;
        }
    }

    public final void r(int i, byte[] bArr) {
        f fVar = new f(bArr);
        o(fVar);
        s(fVar, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x027f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s(g0.f r27, int r28) {
        /*
            Method dump skipped, instructions count: 898
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.g.s(g0.f, int):void");
    }

    public final void t(int i, String str, String str2) {
        HashMap[] hashMapArr = this.f6730d;
        if (hashMapArr[i].isEmpty() || hashMapArr[i].get(str) == null) {
            return;
        }
        HashMap hashMap = hashMapArr[i];
        hashMap.put(str2, hashMap.get(str));
        hashMapArr[i].remove(str);
    }

    public final void u(b bVar) {
        c cVar;
        int e4;
        HashMap hashMap = this.f6730d[4];
        c cVar2 = (c) hashMap.get("Compression");
        if (cVar2 == null) {
            m(bVar, hashMap);
            return;
        }
        int e5 = cVar2.e(this.f6732f);
        if (e5 != 1) {
            if (e5 == 6) {
                m(bVar, hashMap);
                return;
            } else if (e5 != 7) {
                return;
            }
        }
        c cVar3 = (c) hashMap.get("BitsPerSample");
        if (cVar3 != null) {
            int[] iArr = (int[]) cVar3.g(this.f6732f);
            int[] iArr2 = f6716o;
            if (Arrays.equals(iArr2, iArr) || (this.f6729c == 3 && (cVar = (c) hashMap.get("PhotometricInterpretation")) != null && (((e4 = cVar.e(this.f6732f)) == 1 && Arrays.equals(iArr, p)) || (e4 == 6 && Arrays.equals(iArr, iArr2))))) {
                c cVar4 = (c) hashMap.get("StripOffsets");
                c cVar5 = (c) hashMap.get("StripByteCounts");
                if (cVar4 == null || cVar5 == null) {
                    return;
                }
                long[] m4 = AbstractC0105a.m(cVar4.g(this.f6732f));
                long[] m5 = AbstractC0105a.m(cVar5.g(this.f6732f));
                if (m4 == null || m4.length == 0) {
                    Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
                    return;
                }
                if (m5 == null || m5.length == 0) {
                    Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                    return;
                }
                if (m4.length != m5.length) {
                    Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                    return;
                }
                long j4 = 0;
                for (long j5 : m5) {
                    j4 += j5;
                }
                byte[] bArr = new byte[(int) j4];
                this.f6733g = true;
                int i = 0;
                int i4 = 0;
                for (int i5 = 0; i5 < m4.length; i5++) {
                    int i6 = (int) m4[i5];
                    int i7 = (int) m5[i5];
                    if (i5 < m4.length - 1 && i6 + i7 != m4[i5 + 1]) {
                        this.f6733g = false;
                    }
                    int i8 = i6 - i;
                    if (i8 < 0) {
                        Log.d("ExifInterface", "Invalid strip offset value");
                        return;
                    }
                    long j6 = i8;
                    if (bVar.skip(j6) != j6) {
                        Log.d("ExifInterface", "Failed to skip " + i8 + " bytes.");
                        return;
                    }
                    int i9 = i + i8;
                    byte[] bArr2 = new byte[i7];
                    if (bVar.read(bArr2) != i7) {
                        Log.d("ExifInterface", "Failed to read " + i7 + " bytes.");
                        return;
                    }
                    i = i9 + i7;
                    System.arraycopy(bArr2, 0, bArr, i4, i7);
                    i4 += i7;
                }
                if (this.f6733g) {
                    long j7 = m4[0];
                    return;
                }
                return;
            }
        }
        if (f6713l) {
            Log.d("ExifInterface", "Unsupported data type value");
        }
    }

    public final void v(int i, int i4) {
        HashMap[] hashMapArr = this.f6730d;
        boolean isEmpty = hashMapArr[i].isEmpty();
        boolean z3 = f6713l;
        if (isEmpty || hashMapArr[i4].isEmpty()) {
            if (z3) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        c cVar = (c) hashMapArr[i].get("ImageLength");
        c cVar2 = (c) hashMapArr[i].get("ImageWidth");
        c cVar3 = (c) hashMapArr[i4].get("ImageLength");
        c cVar4 = (c) hashMapArr[i4].get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            if (z3) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (cVar3 == null || cVar4 == null) {
            if (z3) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int e4 = cVar.e(this.f6732f);
        int e5 = cVar2.e(this.f6732f);
        int e6 = cVar3.e(this.f6732f);
        int e7 = cVar4.e(this.f6732f);
        if (e4 >= e6 || e5 >= e7) {
            return;
        }
        HashMap hashMap = hashMapArr[i];
        hashMapArr[i] = hashMapArr[i4];
        hashMapArr[i4] = hashMap;
    }

    public final void w(f fVar, int i) {
        c c4;
        c c5;
        HashMap[] hashMapArr = this.f6730d;
        c cVar = (c) hashMapArr[i].get("DefaultCropSize");
        c cVar2 = (c) hashMapArr[i].get("SensorTopBorder");
        c cVar3 = (c) hashMapArr[i].get("SensorLeftBorder");
        c cVar4 = (c) hashMapArr[i].get("SensorBottomBorder");
        c cVar5 = (c) hashMapArr[i].get("SensorRightBorder");
        if (cVar != null) {
            if (cVar.f6688a == 5) {
                e[] eVarArr = (e[]) cVar.g(this.f6732f);
                if (eVarArr == null || eVarArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(eVarArr));
                    return;
                }
                c4 = c.b(eVarArr[0], this.f6732f);
                c5 = c.b(eVarArr[1], this.f6732f);
            } else {
                int[] iArr = (int[]) cVar.g(this.f6732f);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                c4 = c.c(iArr[0], this.f6732f);
                c5 = c.c(iArr[1], this.f6732f);
            }
            hashMapArr[i].put("ImageWidth", c4);
            hashMapArr[i].put("ImageLength", c5);
            return;
        }
        if (cVar2 != null && cVar3 != null && cVar4 != null && cVar5 != null) {
            int e4 = cVar2.e(this.f6732f);
            int e5 = cVar4.e(this.f6732f);
            int e6 = cVar5.e(this.f6732f);
            int e7 = cVar3.e(this.f6732f);
            if (e5 <= e4 || e6 <= e7) {
                return;
            }
            c c6 = c.c(e5 - e4, this.f6732f);
            c c7 = c.c(e6 - e7, this.f6732f);
            hashMapArr[i].put("ImageLength", c6);
            hashMapArr[i].put("ImageWidth", c7);
            return;
        }
        c cVar6 = (c) hashMapArr[i].get("ImageLength");
        c cVar7 = (c) hashMapArr[i].get("ImageWidth");
        if (cVar6 == null || cVar7 == null) {
            c cVar8 = (c) hashMapArr[i].get("JPEGInterchangeFormat");
            c cVar9 = (c) hashMapArr[i].get("JPEGInterchangeFormatLength");
            if (cVar8 == null || cVar9 == null) {
                return;
            }
            int e8 = cVar8.e(this.f6732f);
            int e9 = cVar8.e(this.f6732f);
            fVar.e(e8);
            byte[] bArr = new byte[e9];
            fVar.read(bArr);
            e(new b(bArr), e8, i);
        }
    }

    public final void x() {
        v(0, 5);
        v(0, 4);
        v(5, 4);
        HashMap[] hashMapArr = this.f6730d;
        c cVar = (c) hashMapArr[1].get("PixelXDimension");
        c cVar2 = (c) hashMapArr[1].get("PixelYDimension");
        if (cVar != null && cVar2 != null) {
            hashMapArr[0].put("ImageWidth", cVar);
            hashMapArr[0].put("ImageLength", cVar2);
        }
        if (hashMapArr[4].isEmpty() && n(hashMapArr[5])) {
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap();
        }
        if (!n(hashMapArr[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        t(0, "ThumbnailOrientation", "Orientation");
        t(0, "ThumbnailImageLength", "ImageLength");
        t(0, "ThumbnailImageWidth", "ImageWidth");
        t(5, "ThumbnailOrientation", "Orientation");
        t(5, "ThumbnailImageLength", "ImageLength");
        t(5, "ThumbnailImageWidth", "ImageWidth");
        t(4, "Orientation", "ThumbnailOrientation");
        t(4, "ImageLength", "ThumbnailImageLength");
        t(4, "ImageWidth", "ThumbnailImageWidth");
    }
}
