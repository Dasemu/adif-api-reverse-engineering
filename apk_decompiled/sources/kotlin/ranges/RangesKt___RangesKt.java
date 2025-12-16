package kotlin.ranges;

import java.util.NoSuchElementException;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.random.Random;
import kotlin.random.RandomKt;
import kotlin.ranges.CharProgression;
import kotlin.ranges.IntProgression;
import kotlin.ranges.LongProgression;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000t\n\u0002\b\u0002\n\u0002\u0010\u000f\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\u0010\u0006\n\u0002\u0010\u0007\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\u0010\n\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\f\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u001d\u001a'\u0010\u0000\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002*\u0002H\u00012\u0006\u0010\u0003\u001a\u0002H\u0001¢\u0006\u0002\u0010\u0004\u001a\u0012\u0010\u0000\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0005\u001a\u0012\u0010\u0000\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006\u001a\u0012\u0010\u0000\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0007\u001a\u0012\u0010\u0000\u001a\u00020\b*\u00020\b2\u0006\u0010\u0003\u001a\u00020\b\u001a\u0012\u0010\u0000\u001a\u00020\t*\u00020\t2\u0006\u0010\u0003\u001a\u00020\t\u001a\u0012\u0010\u0000\u001a\u00020\n*\u00020\n2\u0006\u0010\u0003\u001a\u00020\n\u001a'\u0010\u000b\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002*\u0002H\u00012\u0006\u0010\f\u001a\u0002H\u0001¢\u0006\u0002\u0010\u0004\u001a\u0012\u0010\u000b\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005\u001a\u0012\u0010\u000b\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006\u001a\u0012\u0010\u000b\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007\u001a\u0012\u0010\u000b\u001a\u00020\b*\u00020\b2\u0006\u0010\f\u001a\u00020\b\u001a\u0012\u0010\u000b\u001a\u00020\t*\u00020\t2\u0006\u0010\f\u001a\u00020\t\u001a\u0012\u0010\u000b\u001a\u00020\n*\u00020\n2\u0006\u0010\f\u001a\u00020\n\u001a3\u0010\r\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002*\u0002H\u00012\b\u0010\u0003\u001a\u0004\u0018\u0001H\u00012\b\u0010\f\u001a\u0004\u0018\u0001H\u0001¢\u0006\u0002\u0010\u000e\u001a/\u0010\r\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002*\u0002H\u00012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0010H\u0007¢\u0006\u0002\u0010\u0011\u001a-\u0010\r\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002*\u0002H\u00012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0012¢\u0006\u0002\u0010\u0013\u001a\u001a\u0010\r\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005\u001a\u001a\u0010\r\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006\u001a\u001a\u0010\r\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007\u001a\u001a\u0010\r\u001a\u00020\b*\u00020\b2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b\u001a\u0018\u0010\r\u001a\u00020\b*\u00020\b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u0012\u001a\u001a\u0010\r\u001a\u00020\t*\u00020\t2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t\u001a\u0018\u0010\r\u001a\u00020\t*\u00020\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u0012\u001a\u001a\u0010\r\u001a\u00020\n*\u00020\n2\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n\u001a\u001c\u0010\u0014\u001a\u00020\u0015*\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0087\n¢\u0006\u0002\u0010\u0019\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00050\u00122\u0006\u0010\u001a\u001a\u00020\u0006H\u0087\u0002¢\u0006\u0002\b\u001b\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00050\u00122\u0006\u0010\u001a\u001a\u00020\u0007H\u0087\u0002¢\u0006\u0002\b\u001b\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00050\u00122\u0006\u0010\u001a\u001a\u00020\bH\u0087\u0002¢\u0006\u0002\b\u001b\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00050\u00122\u0006\u0010\u001a\u001a\u00020\tH\u0087\u0002¢\u0006\u0002\b\u001b\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00050\u00122\u0006\u0010\u001a\u001a\u00020\nH\u0087\u0002¢\u0006\u0002\b\u001b\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00060\u00122\u0006\u0010\u001a\u001a\u00020\u0005H\u0087\u0002¢\u0006\u0002\b\u001c\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00060\u00122\u0006\u0010\u001a\u001a\u00020\u0007H\u0087\u0002¢\u0006\u0002\b\u001c\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00060\u00122\u0006\u0010\u001a\u001a\u00020\bH\u0087\u0002¢\u0006\u0002\b\u001c\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00060\u00122\u0006\u0010\u001a\u001a\u00020\tH\u0087\u0002¢\u0006\u0002\b\u001c\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00060\u00122\u0006\u0010\u001a\u001a\u00020\nH\u0087\u0002¢\u0006\u0002\b\u001c\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00070\u00122\u0006\u0010\u001a\u001a\u00020\u0005H\u0087\u0002¢\u0006\u0002\b\u001d\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00070\u00122\u0006\u0010\u001a\u001a\u00020\u0006H\u0087\u0002¢\u0006\u0002\b\u001d\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00070\u00122\u0006\u0010\u001a\u001a\u00020\bH\u0087\u0002¢\u0006\u0002\b\u001d\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00070\u00122\u0006\u0010\u001a\u001a\u00020\tH\u0087\u0002¢\u0006\u0002\b\u001d\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00070\u00122\u0006\u0010\u001a\u001a\u00020\nH\u0087\u0002¢\u0006\u0002\b\u001d\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\b0\u00122\u0006\u0010\u001a\u001a\u00020\u0005H\u0087\u0002¢\u0006\u0002\b\u001e\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\b0\u00122\u0006\u0010\u001a\u001a\u00020\u0006H\u0087\u0002¢\u0006\u0002\b\u001e\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\b0\u00122\u0006\u0010\u001a\u001a\u00020\u0007H\u0087\u0002¢\u0006\u0002\b\u001e\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\b0\u00122\u0006\u0010\u001a\u001a\u00020\tH\u0087\u0002¢\u0006\u0002\b\u001e\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\b0\u00122\u0006\u0010\u001a\u001a\u00020\nH\u0087\u0002¢\u0006\u0002\b\u001e\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\t0\u00122\u0006\u0010\u001a\u001a\u00020\u0005H\u0087\u0002¢\u0006\u0002\b\u001f\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\t0\u00122\u0006\u0010\u001a\u001a\u00020\u0006H\u0087\u0002¢\u0006\u0002\b\u001f\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\t0\u00122\u0006\u0010\u001a\u001a\u00020\u0007H\u0087\u0002¢\u0006\u0002\b\u001f\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\t0\u00122\u0006\u0010\u001a\u001a\u00020\bH\u0087\u0002¢\u0006\u0002\b\u001f\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\t0\u00122\u0006\u0010\u001a\u001a\u00020\nH\u0087\u0002¢\u0006\u0002\b\u001f\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\n0\u00122\u0006\u0010\u001a\u001a\u00020\u0005H\u0087\u0002¢\u0006\u0002\b \u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\n0\u00122\u0006\u0010\u001a\u001a\u00020\u0006H\u0087\u0002¢\u0006\u0002\b \u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\n0\u00122\u0006\u0010\u001a\u001a\u00020\u0007H\u0087\u0002¢\u0006\u0002\b \u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\n0\u00122\u0006\u0010\u001a\u001a\u00020\bH\u0087\u0002¢\u0006\u0002\b \u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\n0\u00122\u0006\u0010\u001a\u001a\u00020\tH\u0087\u0002¢\u0006\u0002\b \u001a\u0015\u0010\u0014\u001a\u00020\u0015*\u00020!2\u0006\u0010\u001a\u001a\u00020\u0005H\u0087\n\u001a\u001c\u0010\u0014\u001a\u00020\u0015*\u00020!2\b\u0010\u0017\u001a\u0004\u0018\u00010\bH\u0087\n¢\u0006\u0002\u0010\"\u001a\u0015\u0010\u0014\u001a\u00020\u0015*\u00020!2\u0006\u0010\u001a\u001a\u00020\tH\u0087\n\u001a\u0015\u0010\u0014\u001a\u00020\u0015*\u00020!2\u0006\u0010\u001a\u001a\u00020\nH\u0087\n\u001a\u0015\u0010\u0014\u001a\u00020\u0015*\u00020#2\u0006\u0010\u001a\u001a\u00020\u0005H\u0087\n\u001a\u0015\u0010\u0014\u001a\u00020\u0015*\u00020#2\u0006\u0010\u001a\u001a\u00020\bH\u0087\n\u001a\u001c\u0010\u0014\u001a\u00020\u0015*\u00020#2\b\u0010\u0017\u001a\u0004\u0018\u00010\tH\u0087\n¢\u0006\u0002\u0010$\u001a\u0015\u0010\u0014\u001a\u00020\u0015*\u00020#2\u0006\u0010\u001a\u001a\u00020\nH\u0087\n\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00050%2\u0006\u0010\u001a\u001a\u00020\bH\u0087\u0002¢\u0006\u0002\b\u001b\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00050%2\u0006\u0010\u001a\u001a\u00020\tH\u0087\u0002¢\u0006\u0002\b\u001b\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00050%2\u0006\u0010\u001a\u001a\u00020\nH\u0087\u0002¢\u0006\u0002\b\u001b\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00060%2\u0006\u0010\u001a\u001a\u00020\u0007H\u0087\u0002¢\u0006\u0002\b\u001c\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\b0%2\u0006\u0010\u001a\u001a\u00020\u0005H\u0087\u0002¢\u0006\u0002\b\u001e\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\b0%2\u0006\u0010\u001a\u001a\u00020\tH\u0087\u0002¢\u0006\u0002\b\u001e\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\b0%2\u0006\u0010\u001a\u001a\u00020\nH\u0087\u0002¢\u0006\u0002\b\u001e\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\t0%2\u0006\u0010\u001a\u001a\u00020\u0005H\u0087\u0002¢\u0006\u0002\b\u001f\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\t0%2\u0006\u0010\u001a\u001a\u00020\bH\u0087\u0002¢\u0006\u0002\b\u001f\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\t0%2\u0006\u0010\u001a\u001a\u00020\nH\u0087\u0002¢\u0006\u0002\b\u001f\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\n0%2\u0006\u0010\u001a\u001a\u00020\u0005H\u0087\u0002¢\u0006\u0002\b \u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\n0%2\u0006\u0010\u001a\u001a\u00020\bH\u0087\u0002¢\u0006\u0002\b \u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\n0%2\u0006\u0010\u001a\u001a\u00020\tH\u0087\u0002¢\u0006\u0002\b \u001a\u0015\u0010&\u001a\u00020'*\u00020\u00052\u0006\u0010(\u001a\u00020\u0005H\u0086\u0004\u001a\u0015\u0010&\u001a\u00020'*\u00020\u00052\u0006\u0010(\u001a\u00020\bH\u0086\u0004\u001a\u0015\u0010&\u001a\u00020)*\u00020\u00052\u0006\u0010(\u001a\u00020\tH\u0086\u0004\u001a\u0015\u0010&\u001a\u00020'*\u00020\u00052\u0006\u0010(\u001a\u00020\nH\u0086\u0004\u001a\u0015\u0010&\u001a\u00020**\u00020\u00182\u0006\u0010(\u001a\u00020\u0018H\u0086\u0004\u001a\u0015\u0010&\u001a\u00020'*\u00020\b2\u0006\u0010(\u001a\u00020\u0005H\u0086\u0004\u001a\u0015\u0010&\u001a\u00020'*\u00020\b2\u0006\u0010(\u001a\u00020\bH\u0086\u0004\u001a\u0015\u0010&\u001a\u00020)*\u00020\b2\u0006\u0010(\u001a\u00020\tH\u0086\u0004\u001a\u0015\u0010&\u001a\u00020'*\u00020\b2\u0006\u0010(\u001a\u00020\nH\u0086\u0004\u001a\u0015\u0010&\u001a\u00020)*\u00020\t2\u0006\u0010(\u001a\u00020\u0005H\u0086\u0004\u001a\u0015\u0010&\u001a\u00020)*\u00020\t2\u0006\u0010(\u001a\u00020\bH\u0086\u0004\u001a\u0015\u0010&\u001a\u00020)*\u00020\t2\u0006\u0010(\u001a\u00020\tH\u0086\u0004\u001a\u0015\u0010&\u001a\u00020)*\u00020\t2\u0006\u0010(\u001a\u00020\nH\u0086\u0004\u001a\u0015\u0010&\u001a\u00020'*\u00020\n2\u0006\u0010(\u001a\u00020\u0005H\u0086\u0004\u001a\u0015\u0010&\u001a\u00020'*\u00020\n2\u0006\u0010(\u001a\u00020\bH\u0086\u0004\u001a\u0015\u0010&\u001a\u00020)*\u00020\n2\u0006\u0010(\u001a\u00020\tH\u0086\u0004\u001a\u0015\u0010&\u001a\u00020'*\u00020\n2\u0006\u0010(\u001a\u00020\nH\u0086\u0004\u001a\f\u0010+\u001a\u00020\u0018*\u00020*H\u0007\u001a\f\u0010+\u001a\u00020\b*\u00020'H\u0007\u001a\f\u0010+\u001a\u00020\t*\u00020)H\u0007\u001a\u0013\u0010,\u001a\u0004\u0018\u00010\u0018*\u00020*H\u0007¢\u0006\u0002\u0010-\u001a\u0013\u0010,\u001a\u0004\u0018\u00010\b*\u00020'H\u0007¢\u0006\u0002\u0010.\u001a\u0013\u0010,\u001a\u0004\u0018\u00010\t*\u00020)H\u0007¢\u0006\u0002\u0010/\u001a\f\u00100\u001a\u00020\u0018*\u00020*H\u0007\u001a\f\u00100\u001a\u00020\b*\u00020'H\u0007\u001a\f\u00100\u001a\u00020\t*\u00020)H\u0007\u001a\u0013\u00101\u001a\u0004\u0018\u00010\u0018*\u00020*H\u0007¢\u0006\u0002\u0010-\u001a\u0013\u00101\u001a\u0004\u0018\u00010\b*\u00020'H\u0007¢\u0006\u0002\u0010.\u001a\u0013\u00101\u001a\u0004\u0018\u00010\t*\u00020)H\u0007¢\u0006\u0002\u0010/\u001a\r\u00102\u001a\u00020\u0018*\u00020\u0016H\u0087\b\u001a\u0014\u00102\u001a\u00020\u0018*\u00020\u00162\u0006\u00102\u001a\u000203H\u0007\u001a\r\u00102\u001a\u00020\b*\u00020!H\u0087\b\u001a\u0014\u00102\u001a\u00020\b*\u00020!2\u0006\u00102\u001a\u000203H\u0007\u001a\r\u00102\u001a\u00020\t*\u00020#H\u0087\b\u001a\u0014\u00102\u001a\u00020\t*\u00020#2\u0006\u00102\u001a\u000203H\u0007\u001a\u0014\u00104\u001a\u0004\u0018\u00010\u0018*\u00020\u0016H\u0087\b¢\u0006\u0002\u00105\u001a\u001b\u00104\u001a\u0004\u0018\u00010\u0018*\u00020\u00162\u0006\u00102\u001a\u000203H\u0007¢\u0006\u0002\u00106\u001a\u0014\u00104\u001a\u0004\u0018\u00010\b*\u00020!H\u0087\b¢\u0006\u0002\u00107\u001a\u001b\u00104\u001a\u0004\u0018\u00010\b*\u00020!2\u0006\u00102\u001a\u000203H\u0007¢\u0006\u0002\u00108\u001a\u0014\u00104\u001a\u0004\u0018\u00010\t*\u00020#H\u0087\b¢\u0006\u0002\u00109\u001a\u001b\u00104\u001a\u0004\u0018\u00010\t*\u00020#2\u0006\u00102\u001a\u000203H\u0007¢\u0006\u0002\u0010:\u001a\n\u0010;\u001a\u00020**\u00020*\u001a\n\u0010;\u001a\u00020'*\u00020'\u001a\n\u0010;\u001a\u00020)*\u00020)\u001a\u0015\u0010<\u001a\u00020**\u00020*2\u0006\u0010<\u001a\u00020\bH\u0086\u0004\u001a\u0015\u0010<\u001a\u00020'*\u00020'2\u0006\u0010<\u001a\u00020\bH\u0086\u0004\u001a\u0015\u0010<\u001a\u00020)*\u00020)2\u0006\u0010<\u001a\u00020\tH\u0086\u0004\u001a\u0013\u0010=\u001a\u0004\u0018\u00010\u0005*\u00020\u0006H\u0000¢\u0006\u0002\u0010>\u001a\u0013\u0010=\u001a\u0004\u0018\u00010\u0005*\u00020\u0007H\u0000¢\u0006\u0002\u0010?\u001a\u0013\u0010=\u001a\u0004\u0018\u00010\u0005*\u00020\bH\u0000¢\u0006\u0002\u0010@\u001a\u0013\u0010=\u001a\u0004\u0018\u00010\u0005*\u00020\tH\u0000¢\u0006\u0002\u0010A\u001a\u0013\u0010=\u001a\u0004\u0018\u00010\u0005*\u00020\nH\u0000¢\u0006\u0002\u0010B\u001a\u0013\u0010C\u001a\u0004\u0018\u00010\b*\u00020\u0006H\u0000¢\u0006\u0002\u0010D\u001a\u0013\u0010C\u001a\u0004\u0018\u00010\b*\u00020\u0007H\u0000¢\u0006\u0002\u0010E\u001a\u0013\u0010C\u001a\u0004\u0018\u00010\b*\u00020\tH\u0000¢\u0006\u0002\u0010F\u001a\u0013\u0010G\u001a\u0004\u0018\u00010\t*\u00020\u0006H\u0000¢\u0006\u0002\u0010H\u001a\u0013\u0010G\u001a\u0004\u0018\u00010\t*\u00020\u0007H\u0000¢\u0006\u0002\u0010I\u001a\u0013\u0010J\u001a\u0004\u0018\u00010\n*\u00020\u0006H\u0000¢\u0006\u0002\u0010K\u001a\u0013\u0010J\u001a\u0004\u0018\u00010\n*\u00020\u0007H\u0000¢\u0006\u0002\u0010L\u001a\u0013\u0010J\u001a\u0004\u0018\u00010\n*\u00020\bH\u0000¢\u0006\u0002\u0010M\u001a\u0013\u0010J\u001a\u0004\u0018\u00010\n*\u00020\tH\u0000¢\u0006\u0002\u0010N\u001a\u0015\u0010O\u001a\u00020!*\u00020\u00052\u0006\u0010(\u001a\u00020\u0005H\u0086\u0004\u001a\u0015\u0010O\u001a\u00020!*\u00020\u00052\u0006\u0010(\u001a\u00020\bH\u0086\u0004\u001a\u0015\u0010O\u001a\u00020#*\u00020\u00052\u0006\u0010(\u001a\u00020\tH\u0086\u0004\u001a\u0015\u0010O\u001a\u00020!*\u00020\u00052\u0006\u0010(\u001a\u00020\nH\u0086\u0004\u001a\u0015\u0010O\u001a\u00020\u0016*\u00020\u00182\u0006\u0010(\u001a\u00020\u0018H\u0086\u0004\u001a\u0015\u0010O\u001a\u00020!*\u00020\b2\u0006\u0010(\u001a\u00020\u0005H\u0086\u0004\u001a\u0015\u0010O\u001a\u00020!*\u00020\b2\u0006\u0010(\u001a\u00020\bH\u0086\u0004\u001a\u0015\u0010O\u001a\u00020#*\u00020\b2\u0006\u0010(\u001a\u00020\tH\u0086\u0004\u001a\u0015\u0010O\u001a\u00020!*\u00020\b2\u0006\u0010(\u001a\u00020\nH\u0086\u0004\u001a\u0015\u0010O\u001a\u00020#*\u00020\t2\u0006\u0010(\u001a\u00020\u0005H\u0086\u0004\u001a\u0015\u0010O\u001a\u00020#*\u00020\t2\u0006\u0010(\u001a\u00020\bH\u0086\u0004\u001a\u0015\u0010O\u001a\u00020#*\u00020\t2\u0006\u0010(\u001a\u00020\tH\u0086\u0004\u001a\u0015\u0010O\u001a\u00020#*\u00020\t2\u0006\u0010(\u001a\u00020\nH\u0086\u0004\u001a\u0015\u0010O\u001a\u00020!*\u00020\n2\u0006\u0010(\u001a\u00020\u0005H\u0086\u0004\u001a\u0015\u0010O\u001a\u00020!*\u00020\n2\u0006\u0010(\u001a\u00020\bH\u0086\u0004\u001a\u0015\u0010O\u001a\u00020#*\u00020\n2\u0006\u0010(\u001a\u00020\tH\u0086\u0004\u001a\u0015\u0010O\u001a\u00020!*\u00020\n2\u0006\u0010(\u001a\u00020\nH\u0086\u0004¨\u0006P"}, d2 = {"coerceAtLeast", "T", "", "minimumValue", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;", "", "", "", "", "", "", "coerceAtMost", "maximumValue", "coerceIn", "(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;", "range", "Lkotlin/ranges/ClosedFloatingPointRange;", "(Ljava/lang/Comparable;Lkotlin/ranges/ClosedFloatingPointRange;)Ljava/lang/Comparable;", "Lkotlin/ranges/ClosedRange;", "(Ljava/lang/Comparable;Lkotlin/ranges/ClosedRange;)Ljava/lang/Comparable;", "contains", "", "Lkotlin/ranges/CharRange;", "element", "", "(Lkotlin/ranges/CharRange;Ljava/lang/Character;)Z", "value", "byteRangeContains", "doubleRangeContains", "floatRangeContains", "intRangeContains", "longRangeContains", "shortRangeContains", "Lkotlin/ranges/IntRange;", "(Lkotlin/ranges/IntRange;Ljava/lang/Integer;)Z", "Lkotlin/ranges/LongRange;", "(Lkotlin/ranges/LongRange;Ljava/lang/Long;)Z", "Lkotlin/ranges/OpenEndRange;", "downTo", "Lkotlin/ranges/IntProgression;", "to", "Lkotlin/ranges/LongProgression;", "Lkotlin/ranges/CharProgression;", "first", "firstOrNull", "(Lkotlin/ranges/CharProgression;)Ljava/lang/Character;", "(Lkotlin/ranges/IntProgression;)Ljava/lang/Integer;", "(Lkotlin/ranges/LongProgression;)Ljava/lang/Long;", "last", "lastOrNull", "random", "Lkotlin/random/Random;", "randomOrNull", "(Lkotlin/ranges/CharRange;)Ljava/lang/Character;", "(Lkotlin/ranges/CharRange;Lkotlin/random/Random;)Ljava/lang/Character;", "(Lkotlin/ranges/IntRange;)Ljava/lang/Integer;", "(Lkotlin/ranges/IntRange;Lkotlin/random/Random;)Ljava/lang/Integer;", "(Lkotlin/ranges/LongRange;)Ljava/lang/Long;", "(Lkotlin/ranges/LongRange;Lkotlin/random/Random;)Ljava/lang/Long;", "reversed", "step", "toByteExactOrNull", "(D)Ljava/lang/Byte;", "(F)Ljava/lang/Byte;", "(I)Ljava/lang/Byte;", "(J)Ljava/lang/Byte;", "(S)Ljava/lang/Byte;", "toIntExactOrNull", "(D)Ljava/lang/Integer;", "(F)Ljava/lang/Integer;", "(J)Ljava/lang/Integer;", "toLongExactOrNull", "(D)Ljava/lang/Long;", "(F)Ljava/lang/Long;", "toShortExactOrNull", "(D)Ljava/lang/Short;", "(F)Ljava/lang/Short;", "(I)Ljava/lang/Short;", "(J)Ljava/lang/Short;", "until", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/ranges/RangesKt")
@SourceDebugExtension({"SMAP\n_Ranges.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Ranges.kt\nkotlin/ranges/RangesKt___RangesKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1537:1\n1#2:1538\n*E\n"})
/* loaded from: classes3.dex */
public class RangesKt___RangesKt extends RangesKt__RangesKt {
    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @JvmName(name = "byteRangeContains")
    public static final /* synthetic */ boolean byteRangeContains(ClosedRange closedRange, double d4) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        Byte byteExactOrNull = toByteExactOrNull(d4);
        if (byteExactOrNull != null) {
            return closedRange.contains(byteExactOrNull);
        }
        return false;
    }

    public static final byte coerceAtLeast(byte b4, byte b5) {
        return b4 < b5 ? b5 : b4;
    }

    public static final byte coerceAtMost(byte b4, byte b5) {
        return b4 > b5 ? b5 : b4;
    }

    public static final <T extends Comparable<? super T>> T coerceIn(T t2, T t4, T t5) {
        Intrinsics.checkNotNullParameter(t2, "<this>");
        if (t4 != null && t5 != null) {
            if (t4.compareTo(t5) <= 0) {
                if (t2.compareTo(t4) < 0) {
                    return t4;
                }
                if (t2.compareTo(t5) > 0) {
                    return t5;
                }
            } else {
                throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + t5 + " is less than minimum " + t4 + '.');
            }
        } else {
            if (t4 != null && t2.compareTo(t4) < 0) {
                return t4;
            }
            if (t5 != null && t2.compareTo(t5) > 0) {
                return t5;
            }
        }
        return t2;
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final boolean contains(IntRange intRange, Integer num) {
        Intrinsics.checkNotNullParameter(intRange, "<this>");
        return num != null && intRange.contains(num.intValue());
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @JvmName(name = "doubleRangeContains")
    public static final /* synthetic */ boolean doubleRangeContains(ClosedRange closedRange, byte b4) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(Double.valueOf(b4));
    }

    public static final IntProgression downTo(int i, byte b4) {
        return IntProgression.INSTANCE.fromClosedRange(i, b4, -1);
    }

    @SinceKotlin(version = "1.7")
    public static final int first(IntProgression intProgression) {
        Intrinsics.checkNotNullParameter(intProgression, "<this>");
        if (!intProgression.isEmpty()) {
            return intProgression.getFirst();
        }
        throw new NoSuchElementException("Progression " + intProgression + " is empty.");
    }

    @SinceKotlin(version = "1.7")
    public static final Integer firstOrNull(IntProgression intProgression) {
        Intrinsics.checkNotNullParameter(intProgression, "<this>");
        if (intProgression.isEmpty()) {
            return null;
        }
        return Integer.valueOf(intProgression.getFirst());
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @JvmName(name = "floatRangeContains")
    public static final /* synthetic */ boolean floatRangeContains(ClosedRange closedRange, byte b4) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(Float.valueOf(b4));
    }

    @JvmName(name = "intRangeContains")
    public static final boolean intRangeContains(ClosedRange<Integer> closedRange, byte b4) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(Integer.valueOf(b4));
    }

    @SinceKotlin(version = "1.7")
    public static final int last(IntProgression intProgression) {
        Intrinsics.checkNotNullParameter(intProgression, "<this>");
        if (!intProgression.isEmpty()) {
            return intProgression.getLast();
        }
        throw new NoSuchElementException("Progression " + intProgression + " is empty.");
    }

    @SinceKotlin(version = "1.7")
    public static final Integer lastOrNull(IntProgression intProgression) {
        Intrinsics.checkNotNullParameter(intProgression, "<this>");
        if (intProgression.isEmpty()) {
            return null;
        }
        return Integer.valueOf(intProgression.getLast());
    }

    @JvmName(name = "longRangeContains")
    public static final boolean longRangeContains(ClosedRange<Long> closedRange, byte b4) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(Long.valueOf(b4));
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final int random(IntRange intRange) {
        Intrinsics.checkNotNullParameter(intRange, "<this>");
        return random(intRange, Random.INSTANCE);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final Integer randomOrNull(IntRange intRange) {
        Intrinsics.checkNotNullParameter(intRange, "<this>");
        return randomOrNull(intRange, Random.INSTANCE);
    }

    public static final IntProgression reversed(IntProgression intProgression) {
        Intrinsics.checkNotNullParameter(intProgression, "<this>");
        return IntProgression.INSTANCE.fromClosedRange(intProgression.getLast(), intProgression.getFirst(), -intProgression.getStep());
    }

    @JvmName(name = "shortRangeContains")
    public static final boolean shortRangeContains(ClosedRange<Short> closedRange, byte b4) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(Short.valueOf(b4));
    }

    public static IntProgression step(IntProgression intProgression, int i) {
        Intrinsics.checkNotNullParameter(intProgression, "<this>");
        RangesKt__RangesKt.checkStepIsPositive(i > 0, Integer.valueOf(i));
        IntProgression.Companion companion = IntProgression.INSTANCE;
        int first = intProgression.getFirst();
        int last = intProgression.getLast();
        if (intProgression.getStep() <= 0) {
            i = -i;
        }
        return companion.fromClosedRange(first, last, i);
    }

    public static final Byte toByteExactOrNull(int i) {
        if (new IntRange(-128, WorkQueueKt.MASK).contains(i)) {
            return Byte.valueOf((byte) i);
        }
        return null;
    }

    public static final Integer toIntExactOrNull(long j4) {
        if (new LongRange(-2147483648L, 2147483647L).contains(j4)) {
            return Integer.valueOf((int) j4);
        }
        return null;
    }

    public static final Long toLongExactOrNull(double d4) {
        if (-9.223372036854776E18d > d4 || d4 > 9.223372036854776E18d) {
            return null;
        }
        return Long.valueOf((long) d4);
    }

    public static final Short toShortExactOrNull(int i) {
        if (new IntRange(-32768, 32767).contains(i)) {
            return Short.valueOf((short) i);
        }
        return null;
    }

    public static final IntRange until(int i, byte b4) {
        return new IntRange(i, b4 - 1);
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @JvmName(name = "byteRangeContains")
    public static final /* synthetic */ boolean byteRangeContains(ClosedRange closedRange, float f2) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        Byte byteExactOrNull = toByteExactOrNull(f2);
        if (byteExactOrNull != null) {
            return closedRange.contains(byteExactOrNull);
        }
        return false;
    }

    public static final double coerceAtLeast(double d4, double d5) {
        return d4 < d5 ? d5 : d4;
    }

    public static double coerceAtMost(double d4, double d5) {
        return d4 > d5 ? d5 : d4;
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final boolean contains(LongRange longRange, Long l4) {
        Intrinsics.checkNotNullParameter(longRange, "<this>");
        return l4 != null && longRange.contains(l4.longValue());
    }

    @JvmName(name = "doubleRangeContains")
    public static final boolean doubleRangeContains(ClosedRange<Double> closedRange, float f2) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(Double.valueOf(f2));
    }

    public static final LongProgression downTo(long j4, byte b4) {
        return LongProgression.INSTANCE.fromClosedRange(j4, b4, -1L);
    }

    @SinceKotlin(version = "1.7")
    public static final Long firstOrNull(LongProgression longProgression) {
        Intrinsics.checkNotNullParameter(longProgression, "<this>");
        if (longProgression.isEmpty()) {
            return null;
        }
        return Long.valueOf(longProgression.getFirst());
    }

    @JvmName(name = "floatRangeContains")
    public static final boolean floatRangeContains(ClosedRange<Float> closedRange, double d4) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(Float.valueOf((float) d4));
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @JvmName(name = "intRangeContains")
    public static final boolean intRangeContains(OpenEndRange<Integer> openEndRange, byte b4) {
        Intrinsics.checkNotNullParameter(openEndRange, "<this>");
        return openEndRange.contains(Integer.valueOf(b4));
    }

    @SinceKotlin(version = "1.7")
    public static final Long lastOrNull(LongProgression longProgression) {
        Intrinsics.checkNotNullParameter(longProgression, "<this>");
        if (longProgression.isEmpty()) {
            return null;
        }
        return Long.valueOf(longProgression.getLast());
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @JvmName(name = "longRangeContains")
    public static final boolean longRangeContains(OpenEndRange<Long> openEndRange, byte b4) {
        Intrinsics.checkNotNullParameter(openEndRange, "<this>");
        return openEndRange.contains(Long.valueOf(b4));
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final long random(LongRange longRange) {
        Intrinsics.checkNotNullParameter(longRange, "<this>");
        return random(longRange, Random.INSTANCE);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final Long randomOrNull(LongRange longRange) {
        Intrinsics.checkNotNullParameter(longRange, "<this>");
        return randomOrNull(longRange, Random.INSTANCE);
    }

    public static final LongProgression reversed(LongProgression longProgression) {
        Intrinsics.checkNotNullParameter(longProgression, "<this>");
        return LongProgression.INSTANCE.fromClosedRange(longProgression.getLast(), longProgression.getFirst(), -longProgression.getStep());
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @JvmName(name = "shortRangeContains")
    public static final boolean shortRangeContains(OpenEndRange<Short> openEndRange, byte b4) {
        Intrinsics.checkNotNullParameter(openEndRange, "<this>");
        return openEndRange.contains(Short.valueOf(b4));
    }

    public static final Byte toByteExactOrNull(long j4) {
        if (new LongRange(-128L, 127L).contains(j4)) {
            return Byte.valueOf((byte) j4);
        }
        return null;
    }

    public static final Integer toIntExactOrNull(double d4) {
        if (-2.147483648E9d > d4 || d4 > 2.147483647E9d) {
            return null;
        }
        return Integer.valueOf((int) d4);
    }

    public static final Long toLongExactOrNull(float f2) {
        if (-9.223372E18f > f2 || f2 > 9.223372E18f) {
            return null;
        }
        return Long.valueOf(f2);
    }

    public static final Short toShortExactOrNull(long j4) {
        if (new LongRange(-32768L, 32767L).contains(j4)) {
            return Short.valueOf((short) j4);
        }
        return null;
    }

    public static final LongRange until(long j4, byte b4) {
        return new LongRange(j4, b4 - 1);
    }

    @JvmName(name = "byteRangeContains")
    public static final boolean byteRangeContains(ClosedRange<Byte> closedRange, int i) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        Byte byteExactOrNull = toByteExactOrNull(i);
        if (byteExactOrNull != null) {
            return closedRange.contains(byteExactOrNull);
        }
        return false;
    }

    public static final float coerceAtLeast(float f2, float f4) {
        return f2 < f4 ? f4 : f2;
    }

    public static final float coerceAtMost(float f2, float f4) {
        return f2 > f4 ? f4 : f2;
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final boolean contains(CharRange charRange, Character ch) {
        Intrinsics.checkNotNullParameter(charRange, "<this>");
        return ch != null && charRange.contains(ch.charValue());
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @JvmName(name = "doubleRangeContains")
    public static final boolean doubleRangeContains(OpenEndRange<Double> openEndRange, float f2) {
        Intrinsics.checkNotNullParameter(openEndRange, "<this>");
        return openEndRange.contains(Double.valueOf(f2));
    }

    public static final IntProgression downTo(byte b4, byte b5) {
        return IntProgression.INSTANCE.fromClosedRange(b4, b5, -1);
    }

    @SinceKotlin(version = "1.7")
    public static final Character firstOrNull(CharProgression charProgression) {
        Intrinsics.checkNotNullParameter(charProgression, "<this>");
        if (charProgression.isEmpty()) {
            return null;
        }
        return Character.valueOf(charProgression.getFirst());
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @JvmName(name = "floatRangeContains")
    public static final /* synthetic */ boolean floatRangeContains(ClosedRange closedRange, int i) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(Float.valueOf(i));
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @JvmName(name = "intRangeContains")
    public static final /* synthetic */ boolean intRangeContains(ClosedRange closedRange, double d4) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        Integer intExactOrNull = toIntExactOrNull(d4);
        if (intExactOrNull != null) {
            return closedRange.contains(intExactOrNull);
        }
        return false;
    }

    @SinceKotlin(version = "1.7")
    public static final Character lastOrNull(CharProgression charProgression) {
        Intrinsics.checkNotNullParameter(charProgression, "<this>");
        if (charProgression.isEmpty()) {
            return null;
        }
        return Character.valueOf(charProgression.getLast());
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @JvmName(name = "longRangeContains")
    public static final /* synthetic */ boolean longRangeContains(ClosedRange closedRange, double d4) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        Long longExactOrNull = toLongExactOrNull(d4);
        if (longExactOrNull != null) {
            return closedRange.contains(longExactOrNull);
        }
        return false;
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final char random(CharRange charRange) {
        Intrinsics.checkNotNullParameter(charRange, "<this>");
        return random(charRange, Random.INSTANCE);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final Character randomOrNull(CharRange charRange) {
        Intrinsics.checkNotNullParameter(charRange, "<this>");
        return randomOrNull(charRange, Random.INSTANCE);
    }

    public static final CharProgression reversed(CharProgression charProgression) {
        Intrinsics.checkNotNullParameter(charProgression, "<this>");
        return CharProgression.INSTANCE.fromClosedRange(charProgression.getLast(), charProgression.getFirst(), -charProgression.getStep());
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @JvmName(name = "shortRangeContains")
    public static final /* synthetic */ boolean shortRangeContains(ClosedRange closedRange, double d4) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        Short shortExactOrNull = toShortExactOrNull(d4);
        if (shortExactOrNull != null) {
            return closedRange.contains(shortExactOrNull);
        }
        return false;
    }

    public static final LongProgression step(LongProgression longProgression, long j4) {
        Intrinsics.checkNotNullParameter(longProgression, "<this>");
        RangesKt__RangesKt.checkStepIsPositive(j4 > 0, Long.valueOf(j4));
        LongProgression.Companion companion = LongProgression.INSTANCE;
        long first = longProgression.getFirst();
        long last = longProgression.getLast();
        if (longProgression.getStep() <= 0) {
            j4 = -j4;
        }
        return companion.fromClosedRange(first, last, j4);
    }

    public static final Byte toByteExactOrNull(short s4) {
        if (intRangeContains((ClosedRange<Integer>) new IntRange(-128, WorkQueueKt.MASK), s4)) {
            return Byte.valueOf((byte) s4);
        }
        return null;
    }

    public static final Integer toIntExactOrNull(float f2) {
        if (-2.1474836E9f > f2 || f2 > 2.1474836E9f) {
            return null;
        }
        return Integer.valueOf((int) f2);
    }

    public static final Short toShortExactOrNull(double d4) {
        if (-32768.0d > d4 || d4 > 32767.0d) {
            return null;
        }
        return Short.valueOf((short) d4);
    }

    public static final IntRange until(byte b4, byte b5) {
        return new IntRange(b4, b5 - 1);
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @JvmName(name = "byteRangeContains")
    public static final boolean byteRangeContains(OpenEndRange<Byte> openEndRange, int i) {
        Intrinsics.checkNotNullParameter(openEndRange, "<this>");
        Byte byteExactOrNull = toByteExactOrNull(i);
        if (byteExactOrNull != null) {
            return openEndRange.contains(byteExactOrNull);
        }
        return false;
    }

    public static int coerceAtLeast(int i, int i4) {
        return i < i4 ? i4 : i;
    }

    public static int coerceAtMost(int i, int i4) {
        return i > i4 ? i4 : i;
    }

    @InlineOnly
    private static final boolean contains(IntRange intRange, byte b4) {
        Intrinsics.checkNotNullParameter(intRange, "<this>");
        return intRangeContains((ClosedRange<Integer>) intRange, b4);
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @JvmName(name = "doubleRangeContains")
    public static final /* synthetic */ boolean doubleRangeContains(ClosedRange closedRange, int i) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(Double.valueOf(i));
    }

    public static final IntProgression downTo(short s4, byte b4) {
        return IntProgression.INSTANCE.fromClosedRange(s4, b4, -1);
    }

    @SinceKotlin(version = "1.7")
    public static final long first(LongProgression longProgression) {
        Intrinsics.checkNotNullParameter(longProgression, "<this>");
        if (!longProgression.isEmpty()) {
            return longProgression.getFirst();
        }
        throw new NoSuchElementException("Progression " + longProgression + " is empty.");
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @JvmName(name = "floatRangeContains")
    public static final /* synthetic */ boolean floatRangeContains(ClosedRange closedRange, long j4) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(Float.valueOf((float) j4));
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @JvmName(name = "intRangeContains")
    public static final /* synthetic */ boolean intRangeContains(ClosedRange closedRange, float f2) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        Integer intExactOrNull = toIntExactOrNull(f2);
        if (intExactOrNull != null) {
            return closedRange.contains(intExactOrNull);
        }
        return false;
    }

    @SinceKotlin(version = "1.7")
    public static final long last(LongProgression longProgression) {
        Intrinsics.checkNotNullParameter(longProgression, "<this>");
        if (!longProgression.isEmpty()) {
            return longProgression.getLast();
        }
        throw new NoSuchElementException("Progression " + longProgression + " is empty.");
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @JvmName(name = "longRangeContains")
    public static final /* synthetic */ boolean longRangeContains(ClosedRange closedRange, float f2) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        Long longExactOrNull = toLongExactOrNull(f2);
        if (longExactOrNull != null) {
            return closedRange.contains(longExactOrNull);
        }
        return false;
    }

    @SinceKotlin(version = "1.3")
    public static final int random(IntRange intRange, Random random) {
        Intrinsics.checkNotNullParameter(intRange, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        try {
            return RandomKt.nextInt(random, intRange);
        } catch (IllegalArgumentException e4) {
            throw new NoSuchElementException(e4.getMessage());
        }
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final Integer randomOrNull(IntRange intRange, Random random) {
        Intrinsics.checkNotNullParameter(intRange, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (intRange.isEmpty()) {
            return null;
        }
        return Integer.valueOf(RandomKt.nextInt(random, intRange));
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @JvmName(name = "shortRangeContains")
    public static final /* synthetic */ boolean shortRangeContains(ClosedRange closedRange, float f2) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        Short shortExactOrNull = toShortExactOrNull(f2);
        if (shortExactOrNull != null) {
            return closedRange.contains(shortExactOrNull);
        }
        return false;
    }

    public static final Byte toByteExactOrNull(double d4) {
        if (-128.0d > d4 || d4 > 127.0d) {
            return null;
        }
        return Byte.valueOf((byte) d4);
    }

    public static final Short toShortExactOrNull(float f2) {
        if (-32768.0f > f2 || f2 > 32767.0f) {
            return null;
        }
        return Short.valueOf((short) f2);
    }

    public static final IntRange until(short s4, byte b4) {
        return new IntRange(s4, b4 - 1);
    }

    @JvmName(name = "byteRangeContains")
    public static final boolean byteRangeContains(ClosedRange<Byte> closedRange, long j4) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        Byte byteExactOrNull = toByteExactOrNull(j4);
        if (byteExactOrNull != null) {
            return closedRange.contains(byteExactOrNull);
        }
        return false;
    }

    public static long coerceAtLeast(long j4, long j5) {
        return j4 < j5 ? j5 : j4;
    }

    public static long coerceAtMost(long j4, long j5) {
        return j4 > j5 ? j5 : j4;
    }

    @InlineOnly
    private static final boolean contains(LongRange longRange, byte b4) {
        Intrinsics.checkNotNullParameter(longRange, "<this>");
        return longRangeContains((ClosedRange<Long>) longRange, b4);
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @JvmName(name = "doubleRangeContains")
    public static final /* synthetic */ boolean doubleRangeContains(ClosedRange closedRange, long j4) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(Double.valueOf(j4));
    }

    public static final CharProgression downTo(char c4, char c5) {
        return CharProgression.INSTANCE.fromClosedRange(c4, c5, -1);
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @JvmName(name = "floatRangeContains")
    public static final /* synthetic */ boolean floatRangeContains(ClosedRange closedRange, short s4) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(Float.valueOf(s4));
    }

    @JvmName(name = "intRangeContains")
    public static boolean intRangeContains(ClosedRange<Integer> closedRange, long j4) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        Integer intExactOrNull = toIntExactOrNull(j4);
        if (intExactOrNull != null) {
            return closedRange.contains(intExactOrNull);
        }
        return false;
    }

    @JvmName(name = "longRangeContains")
    public static final boolean longRangeContains(ClosedRange<Long> closedRange, int i) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(Long.valueOf(i));
    }

    @JvmName(name = "shortRangeContains")
    public static final boolean shortRangeContains(ClosedRange<Short> closedRange, int i) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        Short shortExactOrNull = toShortExactOrNull(i);
        if (shortExactOrNull != null) {
            return closedRange.contains(shortExactOrNull);
        }
        return false;
    }

    public static final CharProgression step(CharProgression charProgression, int i) {
        Intrinsics.checkNotNullParameter(charProgression, "<this>");
        RangesKt__RangesKt.checkStepIsPositive(i > 0, Integer.valueOf(i));
        CharProgression.Companion companion = CharProgression.INSTANCE;
        char first = charProgression.getFirst();
        char last = charProgression.getLast();
        if (charProgression.getStep() <= 0) {
            i = -i;
        }
        return companion.fromClosedRange(first, last, i);
    }

    public static final Byte toByteExactOrNull(float f2) {
        if (-128.0f > f2 || f2 > 127.0f) {
            return null;
        }
        return Byte.valueOf((byte) f2);
    }

    public static final CharRange until(char c4, char c5) {
        return Intrinsics.compare((int) c5, 0) <= 0 ? CharRange.INSTANCE.getEMPTY() : new CharRange(c4, (char) (c5 - 1));
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @JvmName(name = "byteRangeContains")
    public static final boolean byteRangeContains(OpenEndRange<Byte> openEndRange, long j4) {
        Intrinsics.checkNotNullParameter(openEndRange, "<this>");
        Byte byteExactOrNull = toByteExactOrNull(j4);
        if (byteExactOrNull != null) {
            return openEndRange.contains(byteExactOrNull);
        }
        return false;
    }

    public static final short coerceAtLeast(short s4, short s5) {
        return s4 < s5 ? s5 : s4;
    }

    public static final short coerceAtMost(short s4, short s5) {
        return s4 > s5 ? s5 : s4;
    }

    @InlineOnly
    private static final boolean contains(LongRange longRange, int i) {
        Intrinsics.checkNotNullParameter(longRange, "<this>");
        return longRangeContains((ClosedRange<Long>) longRange, i);
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @JvmName(name = "doubleRangeContains")
    public static final /* synthetic */ boolean doubleRangeContains(ClosedRange closedRange, short s4) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(Double.valueOf(s4));
    }

    public static IntProgression downTo(int i, int i4) {
        return IntProgression.INSTANCE.fromClosedRange(i, i4, -1);
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @JvmName(name = "intRangeContains")
    public static final boolean intRangeContains(OpenEndRange<Integer> openEndRange, long j4) {
        Intrinsics.checkNotNullParameter(openEndRange, "<this>");
        Integer intExactOrNull = toIntExactOrNull(j4);
        if (intExactOrNull != null) {
            return openEndRange.contains(intExactOrNull);
        }
        return false;
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @JvmName(name = "longRangeContains")
    public static final boolean longRangeContains(OpenEndRange<Long> openEndRange, int i) {
        Intrinsics.checkNotNullParameter(openEndRange, "<this>");
        return openEndRange.contains(Long.valueOf(i));
    }

    @SinceKotlin(version = "1.3")
    public static final long random(LongRange longRange, Random random) {
        Intrinsics.checkNotNullParameter(longRange, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        try {
            return RandomKt.nextLong(random, longRange);
        } catch (IllegalArgumentException e4) {
            throw new NoSuchElementException(e4.getMessage());
        }
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final Long randomOrNull(LongRange longRange, Random random) {
        Intrinsics.checkNotNullParameter(longRange, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (longRange.isEmpty()) {
            return null;
        }
        return Long.valueOf(RandomKt.nextLong(random, longRange));
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @JvmName(name = "shortRangeContains")
    public static final boolean shortRangeContains(OpenEndRange<Short> openEndRange, int i) {
        Intrinsics.checkNotNullParameter(openEndRange, "<this>");
        Short shortExactOrNull = toShortExactOrNull(i);
        if (shortExactOrNull != null) {
            return openEndRange.contains(shortExactOrNull);
        }
        return false;
    }

    @JvmName(name = "byteRangeContains")
    public static final boolean byteRangeContains(ClosedRange<Byte> closedRange, short s4) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        Byte byteExactOrNull = toByteExactOrNull(s4);
        if (byteExactOrNull != null) {
            return closedRange.contains(byteExactOrNull);
        }
        return false;
    }

    public static final <T extends Comparable<? super T>> T coerceAtLeast(T t2, T minimumValue) {
        Intrinsics.checkNotNullParameter(t2, "<this>");
        Intrinsics.checkNotNullParameter(minimumValue, "minimumValue");
        return t2.compareTo(minimumValue) < 0 ? minimumValue : t2;
    }

    public static final <T extends Comparable<? super T>> T coerceAtMost(T t2, T maximumValue) {
        Intrinsics.checkNotNullParameter(t2, "<this>");
        Intrinsics.checkNotNullParameter(maximumValue, "maximumValue");
        return t2.compareTo(maximumValue) > 0 ? maximumValue : t2;
    }

    public static final byte coerceIn(byte b4, byte b5, byte b6) {
        if (b5 <= b6) {
            return b4 < b5 ? b5 : b4 > b6 ? b6 : b4;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((int) b6) + " is less than minimum " + ((int) b5) + '.');
    }

    @InlineOnly
    private static final boolean contains(IntRange intRange, long j4) {
        Intrinsics.checkNotNullParameter(intRange, "<this>");
        return intRangeContains((ClosedRange<Integer>) intRange, j4);
    }

    public static final LongProgression downTo(long j4, int i) {
        return LongProgression.INSTANCE.fromClosedRange(j4, i, -1L);
    }

    @SinceKotlin(version = "1.7")
    public static final char first(CharProgression charProgression) {
        Intrinsics.checkNotNullParameter(charProgression, "<this>");
        if (!charProgression.isEmpty()) {
            return charProgression.getFirst();
        }
        throw new NoSuchElementException("Progression " + charProgression + " is empty.");
    }

    @JvmName(name = "intRangeContains")
    public static final boolean intRangeContains(ClosedRange<Integer> closedRange, short s4) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(Integer.valueOf(s4));
    }

    @SinceKotlin(version = "1.7")
    public static final char last(CharProgression charProgression) {
        Intrinsics.checkNotNullParameter(charProgression, "<this>");
        if (!charProgression.isEmpty()) {
            return charProgression.getLast();
        }
        throw new NoSuchElementException("Progression " + charProgression + " is empty.");
    }

    @JvmName(name = "longRangeContains")
    public static final boolean longRangeContains(ClosedRange<Long> closedRange, short s4) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(Long.valueOf(s4));
    }

    @JvmName(name = "shortRangeContains")
    public static final boolean shortRangeContains(ClosedRange<Short> closedRange, long j4) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        Short shortExactOrNull = toShortExactOrNull(j4);
        if (shortExactOrNull != null) {
            return closedRange.contains(shortExactOrNull);
        }
        return false;
    }

    public static IntRange until(int i, int i4) {
        if (i4 <= Integer.MIN_VALUE) {
            return IntRange.INSTANCE.getEMPTY();
        }
        return new IntRange(i, i4 - 1);
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @JvmName(name = "byteRangeContains")
    public static final boolean byteRangeContains(OpenEndRange<Byte> openEndRange, short s4) {
        Intrinsics.checkNotNullParameter(openEndRange, "<this>");
        Byte byteExactOrNull = toByteExactOrNull(s4);
        if (byteExactOrNull != null) {
            return openEndRange.contains(byteExactOrNull);
        }
        return false;
    }

    public static final short coerceIn(short s4, short s5, short s6) {
        if (s5 <= s6) {
            return s4 < s5 ? s5 : s4 > s6 ? s6 : s4;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((int) s6) + " is less than minimum " + ((int) s5) + '.');
    }

    @InlineOnly
    private static final boolean contains(IntRange intRange, short s4) {
        Intrinsics.checkNotNullParameter(intRange, "<this>");
        return intRangeContains((ClosedRange<Integer>) intRange, s4);
    }

    public static final IntProgression downTo(byte b4, int i) {
        return IntProgression.INSTANCE.fromClosedRange(b4, i, -1);
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @JvmName(name = "intRangeContains")
    public static final boolean intRangeContains(OpenEndRange<Integer> openEndRange, short s4) {
        Intrinsics.checkNotNullParameter(openEndRange, "<this>");
        return openEndRange.contains(Integer.valueOf(s4));
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @JvmName(name = "longRangeContains")
    public static final boolean longRangeContains(OpenEndRange<Long> openEndRange, short s4) {
        Intrinsics.checkNotNullParameter(openEndRange, "<this>");
        return openEndRange.contains(Long.valueOf(s4));
    }

    @SinceKotlin(version = "1.3")
    public static final char random(CharRange charRange, Random random) {
        Intrinsics.checkNotNullParameter(charRange, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        try {
            return (char) random.nextInt(charRange.getFirst(), charRange.getLast() + 1);
        } catch (IllegalArgumentException e4) {
            throw new NoSuchElementException(e4.getMessage());
        }
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final Character randomOrNull(CharRange charRange, Random random) {
        Intrinsics.checkNotNullParameter(charRange, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (charRange.isEmpty()) {
            return null;
        }
        return Character.valueOf((char) random.nextInt(charRange.getFirst(), charRange.getLast() + 1));
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @JvmName(name = "shortRangeContains")
    public static final boolean shortRangeContains(OpenEndRange<Short> openEndRange, long j4) {
        Intrinsics.checkNotNullParameter(openEndRange, "<this>");
        Short shortExactOrNull = toShortExactOrNull(j4);
        if (shortExactOrNull != null) {
            return openEndRange.contains(shortExactOrNull);
        }
        return false;
    }

    public static int coerceIn(int i, int i4, int i5) {
        if (i4 <= i5) {
            return i < i4 ? i4 : i > i5 ? i5 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i5 + " is less than minimum " + i4 + '.');
    }

    @InlineOnly
    private static final boolean contains(LongRange longRange, short s4) {
        Intrinsics.checkNotNullParameter(longRange, "<this>");
        return longRangeContains((ClosedRange<Long>) longRange, s4);
    }

    public static final IntProgression downTo(short s4, int i) {
        return IntProgression.INSTANCE.fromClosedRange(s4, i, -1);
    }

    public static final LongRange until(long j4, int i) {
        return new LongRange(j4, i - 1);
    }

    public static long coerceIn(long j4, long j5, long j6) {
        if (j5 <= j6) {
            return j4 < j5 ? j5 : j4 > j6 ? j6 : j4;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j6 + " is less than minimum " + j5 + '.');
    }

    public static final LongProgression downTo(int i, long j4) {
        return LongProgression.INSTANCE.fromClosedRange(i, j4, -1L);
    }

    public static final IntRange until(byte b4, int i) {
        if (i <= Integer.MIN_VALUE) {
            return IntRange.INSTANCE.getEMPTY();
        }
        return new IntRange(b4, i - 1);
    }

    public static final float coerceIn(float f2, float f4, float f5) {
        if (f4 <= f5) {
            return f2 < f4 ? f4 : f2 > f5 ? f5 : f2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f5 + " is less than minimum " + f4 + '.');
    }

    public static final LongProgression downTo(long j4, long j5) {
        return LongProgression.INSTANCE.fromClosedRange(j4, j5, -1L);
    }

    public static double coerceIn(double d4, double d5, double d6) {
        if (d5 <= d6) {
            return d4 < d5 ? d5 : d4 > d6 ? d6 : d4;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d6 + " is less than minimum " + d5 + '.');
    }

    public static final LongProgression downTo(byte b4, long j4) {
        return LongProgression.INSTANCE.fromClosedRange(b4, j4, -1L);
    }

    public static final IntRange until(short s4, int i) {
        if (i <= Integer.MIN_VALUE) {
            return IntRange.INSTANCE.getEMPTY();
        }
        return new IntRange(s4, i - 1);
    }

    @SinceKotlin(version = "1.1")
    public static final <T extends Comparable<? super T>> T coerceIn(T t2, ClosedFloatingPointRange<T> range) {
        Intrinsics.checkNotNullParameter(t2, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        if (!range.isEmpty()) {
            return (!range.lessThanOrEquals(t2, range.getStart()) || range.lessThanOrEquals(range.getStart(), t2)) ? (!range.lessThanOrEquals(range.getEndInclusive(), t2) || range.lessThanOrEquals(t2, range.getEndInclusive())) ? t2 : range.getEndInclusive() : range.getStart();
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
    }

    public static final LongProgression downTo(short s4, long j4) {
        return LongProgression.INSTANCE.fromClosedRange(s4, j4, -1L);
    }

    public static final IntProgression downTo(int i, short s4) {
        return IntProgression.INSTANCE.fromClosedRange(i, s4, -1);
    }

    public static final LongRange until(int i, long j4) {
        if (j4 <= Long.MIN_VALUE) {
            return LongRange.INSTANCE.getEMPTY();
        }
        return new LongRange(i, j4 - 1);
    }

    public static final LongProgression downTo(long j4, short s4) {
        return LongProgression.INSTANCE.fromClosedRange(j4, s4, -1L);
    }

    public static final IntProgression downTo(byte b4, short s4) {
        return IntProgression.INSTANCE.fromClosedRange(b4, s4, -1);
    }

    public static final LongRange until(long j4, long j5) {
        if (j5 <= Long.MIN_VALUE) {
            return LongRange.INSTANCE.getEMPTY();
        }
        return new LongRange(j4, j5 - 1);
    }

    public static final <T extends Comparable<? super T>> T coerceIn(T t2, ClosedRange<T> range) {
        Intrinsics.checkNotNullParameter(t2, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        if (range instanceof ClosedFloatingPointRange) {
            return (T) coerceIn((Comparable) t2, (ClosedFloatingPointRange) range);
        }
        if (!range.isEmpty()) {
            return t2.compareTo(range.getStart()) < 0 ? range.getStart() : t2.compareTo(range.getEndInclusive()) > 0 ? range.getEndInclusive() : t2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
    }

    public static final IntProgression downTo(short s4, short s5) {
        return IntProgression.INSTANCE.fromClosedRange(s4, s5, -1);
    }

    public static final LongRange until(byte b4, long j4) {
        if (j4 <= Long.MIN_VALUE) {
            return LongRange.INSTANCE.getEMPTY();
        }
        return new LongRange(b4, j4 - 1);
    }

    public static final LongRange until(short s4, long j4) {
        if (j4 <= Long.MIN_VALUE) {
            return LongRange.INSTANCE.getEMPTY();
        }
        return new LongRange(s4, j4 - 1);
    }

    public static final IntRange until(int i, short s4) {
        return new IntRange(i, s4 - 1);
    }

    public static final int coerceIn(int i, ClosedRange<Integer> range) {
        Intrinsics.checkNotNullParameter(range, "range");
        if (range instanceof ClosedFloatingPointRange) {
            return ((Number) coerceIn(Integer.valueOf(i), (ClosedFloatingPointRange<Integer>) range)).intValue();
        }
        if (!range.isEmpty()) {
            return i < range.getStart().intValue() ? range.getStart().intValue() : i > range.getEndInclusive().intValue() ? range.getEndInclusive().intValue() : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
    }

    public static final LongRange until(long j4, short s4) {
        return new LongRange(j4, s4 - 1);
    }

    public static final IntRange until(byte b4, short s4) {
        return new IntRange(b4, s4 - 1);
    }

    public static final IntRange until(short s4, short s5) {
        return new IntRange(s4, s5 - 1);
    }

    public static long coerceIn(long j4, ClosedRange<Long> range) {
        Intrinsics.checkNotNullParameter(range, "range");
        if (range instanceof ClosedFloatingPointRange) {
            return ((Number) coerceIn(Long.valueOf(j4), (ClosedFloatingPointRange<Long>) range)).longValue();
        }
        if (!range.isEmpty()) {
            return j4 < range.getStart().longValue() ? range.getStart().longValue() : j4 > range.getEndInclusive().longValue() ? range.getEndInclusive().longValue() : j4;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
    }
}
