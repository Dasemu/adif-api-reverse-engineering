package j3;

import a.AbstractC0105a;
import e3.A;
import e3.C0315a;
import e3.C0322h;
import e3.C0328n;
import e3.C0329o;
import e3.C0333t;
import e3.C0334u;
import e3.C0335v;
import e3.F;
import e3.H;
import e3.I;
import e3.M;
import e3.N;
import e3.O;
import e3.Q;
import e3.T;
import e3.U;
import e3.w;
import e3.x;
import e3.y;
import i3.j;
import i3.l;
import i3.m;
import i3.n;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocketFactory;
import kotlin.ExceptionsKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsJVMKt;
import l3.C0438a;
import r3.r;

/* loaded from: classes3.dex */
public final class a implements y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6943a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Object f6944b;

    public a(C0329o cookieJar) {
        Intrinsics.checkNotNullParameter(cookieJar, "cookieJar");
        this.f6944b = cookieJar;
    }

    public static int c(O o4, int i) {
        String d4 = O.d(o4, "Retry-After");
        if (d4 == null) {
            return i;
        }
        if (!new Regex("\\d+").matches(d4)) {
            return Integer.MAX_VALUE;
        }
        Integer valueOf = Integer.valueOf(d4);
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(header)");
        return valueOf.intValue();
    }

    public I a(O response, i3.e eVar) {
        String link;
        M m4;
        O o4;
        l lVar;
        U u3 = (eVar == null || (lVar = eVar.f6847f) == null) ? null : lVar.f6873b;
        int i = response.f6294d;
        I i4 = response.f6291a;
        String method = i4.f6268b;
        if (i != 307 && i != 308) {
            if (i == 401) {
                ((F) this.f6944b).f6239g.getClass();
                Intrinsics.checkNotNullParameter(response, "response");
                return null;
            }
            if (i == 421) {
                M m5 = i4.f6270d;
                if ((m5 == null || !m5.isOneShot()) && eVar != null && !Intrinsics.areEqual(eVar.f6843b.f6849b.h.f6416d, eVar.f6847f.f6873b.f6311a.h.f6416d)) {
                    l lVar2 = eVar.f6847f;
                    synchronized (lVar2) {
                        lVar2.f6880k = true;
                    }
                    return response.f6291a;
                }
            } else if (i == 503) {
                O o5 = response.f6298j;
                if ((o5 == null || o5.f6294d != 503) && c(response, Integer.MAX_VALUE) == 0) {
                    return response.f6291a;
                }
            } else {
                if (i == 407) {
                    Intrinsics.checkNotNull(u3);
                    if (u3.f6312b.type() != Proxy.Type.HTTP) {
                        throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                    }
                    ((F) this.f6944b).f6243m.getClass();
                    Intrinsics.checkNotNullParameter(response, "response");
                    return null;
                }
                if (i != 408) {
                    switch (i) {
                    }
                } else if (((F) this.f6944b).f6238f && (((m4 = i4.f6270d) == null || !m4.isOneShot()) && (((o4 = response.f6298j) == null || o4.f6294d != 408) && c(response, 0) <= 0))) {
                    return response.f6291a;
                }
            }
            return null;
        }
        F f2 = (F) this.f6944b;
        if (f2.h && (link = O.d(response, "Location")) != null) {
            I i5 = response.f6291a;
            w wVar = i5.f6267a;
            wVar.getClass();
            Intrinsics.checkNotNullParameter(link, "link");
            C0335v f4 = wVar.f(link);
            w url = f4 != null ? f4.a() : null;
            if (url != null) {
                if (Intrinsics.areEqual(url.f6413a, i5.f6267a.f6413a) || f2.i) {
                    H c4 = i5.c();
                    if (m3.l.R(method)) {
                        Intrinsics.checkNotNullParameter(method, "method");
                        boolean areEqual = Intrinsics.areEqual(method, "PROPFIND");
                        int i6 = response.f6294d;
                        boolean z3 = areEqual || i6 == 308 || i6 == 307;
                        Intrinsics.checkNotNullParameter(method, "method");
                        if (Intrinsics.areEqual(method, "PROPFIND") || i6 == 308 || i6 == 307) {
                            c4.d(method, z3 ? i5.f6270d : null);
                        } else {
                            c4.d("GET", null);
                        }
                        if (!z3) {
                            c4.e("Transfer-Encoding");
                            c4.e("Content-Length");
                            c4.e("Content-Type");
                        }
                    }
                    if (!f3.c.a(i5.f6267a, url)) {
                        c4.e("Authorization");
                    }
                    Intrinsics.checkNotNullParameter(url, "url");
                    c4.f6262a = url;
                    return c4.a();
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0029, code lost:
    
        if (r6 == false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean b(java.io.IOException r3, i3.j r4, e3.I r5, boolean r6) {
        /*
            r2 = this;
            java.lang.Object r2 = r2.f6944b
            e3.F r2 = (e3.F) r2
            boolean r2 = r2.f6238f
            r0 = 0
            if (r2 != 0) goto Lb
            goto La7
        Lb:
            if (r6 == 0) goto L1c
            e3.M r2 = r5.f6270d
            if (r2 == 0) goto L17
            boolean r2 = r2.isOneShot()
            if (r2 != 0) goto La7
        L17:
            boolean r2 = r3 instanceof java.io.FileNotFoundException
            if (r2 == 0) goto L1c
            return r0
        L1c:
            boolean r2 = r3 instanceof java.net.ProtocolException
            if (r2 == 0) goto L21
            return r0
        L21:
            boolean r2 = r3 instanceof java.io.InterruptedIOException
            if (r2 == 0) goto L2c
            boolean r2 = r3 instanceof java.net.SocketTimeoutException
            if (r2 == 0) goto La7
            if (r6 != 0) goto La7
            goto L3f
        L2c:
            boolean r2 = r3 instanceof javax.net.ssl.SSLHandshakeException
            if (r2 == 0) goto L3a
            java.lang.Throwable r2 = r3.getCause()
            boolean r2 = r2 instanceof java.security.cert.CertificateException
            if (r2 == 0) goto L3a
            goto La7
        L3a:
            boolean r2 = r3 instanceof javax.net.ssl.SSLPeerUnverifiedException
            if (r2 == 0) goto L3f
            return r0
        L3f:
            i3.f r2 = r4.f6866g
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            int r3 = r2.f6853f
            r4 = 1
            if (r3 != 0) goto L53
            int r5 = r2.f6854g
            if (r5 != 0) goto L53
            int r5 = r2.h
            if (r5 != 0) goto L53
            r2 = r0
            goto La5
        L53:
            e3.U r5 = r2.i
            if (r5 == 0) goto L58
            goto La0
        L58:
            r5 = 0
            if (r3 > r4) goto L8b
            int r3 = r2.f6854g
            if (r3 > r4) goto L8b
            int r3 = r2.h
            if (r3 <= 0) goto L64
            goto L8b
        L64:
            i3.j r3 = r2.f6850c
            i3.l r3 = r3.h
            if (r3 != 0) goto L6b
            goto L8b
        L6b:
            monitor-enter(r3)
            int r6 = r3.f6881l     // Catch: java.lang.Throwable -> L88
            if (r6 == 0) goto L72
            monitor-exit(r3)
            goto L8b
        L72:
            e3.U r6 = r3.f6873b     // Catch: java.lang.Throwable -> L88
            e3.a r6 = r6.f6311a     // Catch: java.lang.Throwable -> L88
            e3.w r6 = r6.h     // Catch: java.lang.Throwable -> L88
            e3.a r1 = r2.f6849b     // Catch: java.lang.Throwable -> L88
            e3.w r1 = r1.h     // Catch: java.lang.Throwable -> L88
            boolean r6 = f3.c.a(r6, r1)     // Catch: java.lang.Throwable -> L88
            if (r6 != 0) goto L84
            monitor-exit(r3)
            goto L8b
        L84:
            e3.U r5 = r3.f6873b     // Catch: java.lang.Throwable -> L88
            monitor-exit(r3)
            goto L8b
        L88:
            r2 = move-exception
            monitor-exit(r3)
            throw r2
        L8b:
            if (r5 == 0) goto L91
            r2.i = r5
        L8f:
            r2 = r4
            goto La5
        L91:
            Z2.D r3 = r2.f6851d
            if (r3 == 0) goto L9c
            boolean r3 = r3.b()
            if (r3 != r4) goto L9c
            goto La0
        L9c:
            i3.o r2 = r2.f6852e
            if (r2 != 0) goto La1
        La0:
            goto L8f
        La1:
            boolean r2 = r2.j()
        La5:
            if (r2 != 0) goto La8
        La7:
            return r0
        La8:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: j3.a.b(java.io.IOException, i3.j, e3.I, boolean):boolean");
    }

    @Override // e3.y
    public final O intercept(x chain) {
        int i;
        int i4;
        boolean equals;
        T t2;
        boolean z3;
        SSLSocketFactory sSLSocketFactory;
        q3.c cVar;
        C0322h c0322h;
        switch (this.f6943a) {
            case 0:
                Intrinsics.checkNotNullParameter(chain, "chain");
                g gVar = (g) chain;
                I request = gVar.f6952e;
                H c4 = request.c();
                M m4 = request.f6270d;
                if (m4 != null) {
                    A contentType = m4.contentType();
                    if (contentType != null) {
                        c4.c("Content-Type", contentType.f6199a);
                    }
                    long contentLength = m4.contentLength();
                    if (contentLength != -1) {
                        c4.c("Content-Length", String.valueOf(contentLength));
                        c4.e("Transfer-Encoding");
                    } else {
                        c4.c("Transfer-Encoding", "chunked");
                        c4.e("Content-Length");
                    }
                }
                String b4 = request.b("Host");
                w url = request.f6267a;
                if (b4 == null) {
                    i = 0;
                    c4.c("Host", f3.c.v(url, false));
                } else {
                    i = 0;
                }
                if (request.b("Connection") == null) {
                    c4.c("Connection", "Keep-Alive");
                }
                if (request.b("Accept-Encoding") == null && request.b("Range") == null) {
                    c4.c("Accept-Encoding", "gzip");
                    i4 = 1;
                } else {
                    i4 = i;
                }
                C0329o c0329o = (C0329o) this.f6944b;
                c0329o.getClass();
                Intrinsics.checkNotNullParameter(url, "url");
                List emptyList = CollectionsKt.emptyList();
                if (!emptyList.isEmpty()) {
                    StringBuilder sb = new StringBuilder();
                    for (Object obj : emptyList) {
                        int i5 = i + 1;
                        if (i < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        C0328n c0328n = (C0328n) obj;
                        if (i > 0) {
                            sb.append("; ");
                        }
                        sb.append(c0328n.f6380a);
                        sb.append('=');
                        sb.append(c0328n.f6381b);
                        i = i5;
                    }
                    String sb2 = sb.toString();
                    Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
                    c4.c("Cookie", sb2);
                }
                if (request.b("User-Agent") == null) {
                    c4.c("User-Agent", "okhttp/4.12.0");
                }
                O b5 = gVar.b(c4.a());
                C0334u c0334u = b5.f6296f;
                f.b(c0329o, url, c0334u);
                N s4 = b5.s();
                Intrinsics.checkNotNullParameter(request, "request");
                s4.f6280a = request;
                if (i4 != 0) {
                    equals = StringsKt__StringsJVMKt.equals("gzip", O.d(b5, "Content-Encoding"), true);
                    if (equals && f.a(b5) && (t2 = b5.f6297g) != null) {
                        r rVar = new r(t2.source());
                        C0333t c5 = c0334u.c();
                        c5.e("Content-Encoding");
                        c5.e("Content-Length");
                        s4.c(c5.d());
                        s4.f6286g = new Q(O.d(b5, "Content-Type"), -1L, AbstractC0105a.d(rVar));
                    }
                }
                return s4.a();
            default:
                Intrinsics.checkNotNullParameter(chain, "chain");
                g gVar2 = (g) chain;
                I i6 = gVar2.f6952e;
                j jVar = gVar2.f6948a;
                List suppressed = CollectionsKt.emptyList();
                O o4 = null;
                int i7 = 0;
                I request2 = i6;
                while (true) {
                    boolean z4 = true;
                    while (true) {
                        jVar.getClass();
                        Intrinsics.checkNotNullParameter(request2, "request");
                        if (jVar.f6867j != null) {
                            throw new IllegalStateException("Check failed.");
                        }
                        synchronized (jVar) {
                            if (jVar.f6869l) {
                                throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                            }
                            if (jVar.f6868k) {
                                throw new IllegalStateException("Check failed.");
                            }
                            Unit unit = Unit.INSTANCE;
                        }
                        if (z4) {
                            m mVar = jVar.f6862c;
                            w wVar = request2.f6267a;
                            boolean z5 = wVar.f6420j;
                            F f2 = jVar.f6860a;
                            if (z5) {
                                SSLSocketFactory sSLSocketFactory2 = f2.f6245o;
                                if (sSLSocketFactory2 == null) {
                                    throw new IllegalStateException("CLEARTEXT-only client");
                                }
                                q3.c cVar2 = f2.f6248s;
                                c0322h = f2.f6249t;
                                sSLSocketFactory = sSLSocketFactory2;
                                cVar = cVar2;
                            } else {
                                sSLSocketFactory = null;
                                cVar = null;
                                c0322h = null;
                            }
                            jVar.f6866g = new i3.f(mVar, new C0315a(wVar.f6416d, wVar.f6417e, f2.f6241k, f2.f6244n, sSLSocketFactory, cVar, c0322h, f2.f6243m, f2.f6247r, f2.f6246q, f2.f6242l), jVar);
                        }
                        try {
                            if (jVar.f6871n) {
                                throw new IOException("Canceled");
                            }
                            try {
                                O b6 = gVar2.b(request2);
                                if (o4 != null) {
                                    N s5 = b6.s();
                                    N s6 = o4.s();
                                    s6.f6286g = null;
                                    O a2 = s6.a();
                                    if (a2.f6297g != null) {
                                        throw new IllegalArgumentException("priorResponse.body != null");
                                    }
                                    s5.f6287j = a2;
                                    b6 = s5.a();
                                }
                                o4 = b6;
                                i3.e eVar = jVar.f6867j;
                                request2 = a(o4, eVar);
                                if (request2 == null) {
                                    if (eVar != null && eVar.f6845d) {
                                        if (jVar.i) {
                                            throw new IllegalStateException("Check failed.");
                                        }
                                        jVar.i = true;
                                        jVar.f6863d.i();
                                    }
                                    z3 = false;
                                } else {
                                    z3 = false;
                                    M m5 = request2.f6270d;
                                    if (m5 == null || !m5.isOneShot()) {
                                        T t4 = o4.f6297g;
                                        if (t4 != null) {
                                            f3.c.c(t4);
                                        }
                                        i7++;
                                        if (i7 > 20) {
                                            throw new ProtocolException("Too many follow-up requests: " + i7);
                                        }
                                        jVar.f(true);
                                    }
                                }
                            } catch (n e4) {
                                if (!b(e4.f6891b, jVar, request2, false)) {
                                    IOException iOException = e4.f6890a;
                                    Intrinsics.checkNotNullParameter(iOException, "<this>");
                                    Intrinsics.checkNotNullParameter(suppressed, "suppressed");
                                    Iterator it = suppressed.iterator();
                                    while (it.hasNext()) {
                                        ExceptionsKt.addSuppressed(iOException, (Exception) it.next());
                                    }
                                    throw iOException;
                                }
                                suppressed = CollectionsKt.plus((Collection<? extends IOException>) suppressed, e4.f6890a);
                                jVar.f(true);
                            } catch (IOException e5) {
                                if (!b(e5, jVar, request2, !(e5 instanceof C0438a))) {
                                    Intrinsics.checkNotNullParameter(e5, "<this>");
                                    Intrinsics.checkNotNullParameter(suppressed, "suppressed");
                                    Iterator it2 = suppressed.iterator();
                                    while (it2.hasNext()) {
                                        ExceptionsKt.addSuppressed(e5, (Exception) it2.next());
                                    }
                                    throw e5;
                                }
                                suppressed = CollectionsKt.plus((Collection<? extends IOException>) suppressed, e5);
                                jVar.f(true);
                            }
                        } catch (Throwable th) {
                            jVar.f(true);
                            throw th;
                        }
                        z4 = false;
                    }
                }
                jVar.f(z3);
                return o4;
        }
    }

    public a(F client) {
        Intrinsics.checkNotNullParameter(client, "client");
        this.f6944b = client;
    }
}
