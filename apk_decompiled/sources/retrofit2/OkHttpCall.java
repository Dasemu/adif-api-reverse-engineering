package retrofit2;

import a.AbstractC0105a;
import e3.A;
import e3.F;
import e3.I;
import e3.InterfaceC0318d;
import e3.InterfaceC0319e;
import e3.InterfaceC0320f;
import e3.N;
import e3.O;
import e3.T;
import i3.j;
import java.io.IOException;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import r3.C0576h;
import r3.InterfaceC0578j;
import r3.K;
import r3.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class OkHttpCall<T> implements Call<T> {
    private final Object[] args;
    private final InterfaceC0318d callFactory;
    private volatile boolean canceled;
    private Throwable creationFailure;
    private boolean executed;
    private InterfaceC0319e rawCall;
    private final RequestFactory requestFactory;
    private final Converter<T, T> responseConverter;

    /* loaded from: classes3.dex */
    public static final class ExceptionCatchingResponseBody extends T {
        private final T delegate;
        private final InterfaceC0578j delegateSource;
        IOException thrownException;

        public ExceptionCatchingResponseBody(T t2) {
            this.delegate = t2;
            this.delegateSource = AbstractC0105a.d(new p(t2.source()) { // from class: retrofit2.OkHttpCall.ExceptionCatchingResponseBody.1
                @Override // r3.p, r3.I
                public long read(C0576h c0576h, long j4) throws IOException {
                    try {
                        return super.read(c0576h, j4);
                    } catch (IOException e4) {
                        ExceptionCatchingResponseBody.this.thrownException = e4;
                        throw e4;
                    }
                }
            });
        }

        @Override // e3.T, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.delegate.close();
        }

        @Override // e3.T
        public long contentLength() {
            return this.delegate.contentLength();
        }

        @Override // e3.T
        public A contentType() {
            return this.delegate.contentType();
        }

        @Override // e3.T
        public InterfaceC0578j source() {
            return this.delegateSource;
        }

        public void throwIfCaught() throws IOException {
            IOException iOException = this.thrownException;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class NoContentResponseBody extends T {
        private final long contentLength;
        private final A contentType;

        public NoContentResponseBody(A a2, long j4) {
            this.contentType = a2;
            this.contentLength = j4;
        }

        @Override // e3.T
        public long contentLength() {
            return this.contentLength;
        }

        @Override // e3.T
        public A contentType() {
            return this.contentType;
        }

        @Override // e3.T
        public InterfaceC0578j source() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    public OkHttpCall(RequestFactory requestFactory, Object[] objArr, InterfaceC0318d interfaceC0318d, Converter<T, T> converter) {
        this.requestFactory = requestFactory;
        this.args = objArr;
        this.callFactory = interfaceC0318d;
        this.responseConverter = converter;
    }

    private InterfaceC0319e createRawCall() throws IOException {
        InterfaceC0318d interfaceC0318d = this.callFactory;
        I request = this.requestFactory.create(this.args);
        F f2 = (F) interfaceC0318d;
        f2.getClass();
        Intrinsics.checkNotNullParameter(request, "request");
        return new j(f2, request);
    }

    private InterfaceC0319e getRawCall() throws IOException {
        InterfaceC0319e interfaceC0319e = this.rawCall;
        if (interfaceC0319e != null) {
            return interfaceC0319e;
        }
        Throwable th = this.creationFailure;
        if (th != null) {
            if (th instanceof IOException) {
                throw ((IOException) th);
            }
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            throw ((Error) th);
        }
        try {
            InterfaceC0319e createRawCall = createRawCall();
            this.rawCall = createRawCall;
            return createRawCall;
        } catch (IOException | Error | RuntimeException e4) {
            Utils.throwIfFatal(e4);
            this.creationFailure = e4;
            throw e4;
        }
    }

    @Override // retrofit2.Call
    public void cancel() {
        InterfaceC0319e interfaceC0319e;
        this.canceled = true;
        synchronized (this) {
            interfaceC0319e = this.rawCall;
        }
        if (interfaceC0319e != null) {
            ((j) interfaceC0319e).cancel();
        }
    }

    @Override // retrofit2.Call
    public void enqueue(final Callback<T> callback) {
        InterfaceC0319e interfaceC0319e;
        Throwable th;
        Objects.requireNonNull(callback, "callback == null");
        synchronized (this) {
            try {
                if (this.executed) {
                    throw new IllegalStateException("Already executed.");
                }
                this.executed = true;
                interfaceC0319e = this.rawCall;
                th = this.creationFailure;
                if (interfaceC0319e == null && th == null) {
                    try {
                        InterfaceC0319e createRawCall = createRawCall();
                        this.rawCall = createRawCall;
                        interfaceC0319e = createRawCall;
                    } catch (Throwable th2) {
                        th = th2;
                        Utils.throwIfFatal(th);
                        this.creationFailure = th;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (th != null) {
            callback.onFailure(this, th);
            return;
        }
        if (this.canceled) {
            ((j) interfaceC0319e).cancel();
        }
        ((j) interfaceC0319e).d(new InterfaceC0320f() { // from class: retrofit2.OkHttpCall.1
            private void callFailure(Throwable th4) {
                try {
                    callback.onFailure(OkHttpCall.this, th4);
                } catch (Throwable th5) {
                    Utils.throwIfFatal(th5);
                    th5.printStackTrace();
                }
            }

            @Override // e3.InterfaceC0320f
            public void onFailure(InterfaceC0319e interfaceC0319e2, IOException iOException) {
                callFailure(iOException);
            }

            @Override // e3.InterfaceC0320f
            public void onResponse(InterfaceC0319e interfaceC0319e2, O o4) {
                try {
                    try {
                        callback.onResponse(OkHttpCall.this, OkHttpCall.this.parseResponse(o4));
                    } catch (Throwable th4) {
                        Utils.throwIfFatal(th4);
                        th4.printStackTrace();
                    }
                } catch (Throwable th5) {
                    Utils.throwIfFatal(th5);
                    callFailure(th5);
                }
            }
        });
    }

    @Override // retrofit2.Call
    public Response<T> execute() throws IOException {
        InterfaceC0319e rawCall;
        synchronized (this) {
            if (this.executed) {
                throw new IllegalStateException("Already executed.");
            }
            this.executed = true;
            rawCall = getRawCall();
        }
        if (this.canceled) {
            ((j) rawCall).cancel();
        }
        return parseResponse(((j) rawCall).e());
    }

    @Override // retrofit2.Call
    public boolean isCanceled() {
        boolean z3 = true;
        if (this.canceled) {
            return true;
        }
        synchronized (this) {
            InterfaceC0319e interfaceC0319e = this.rawCall;
            if (interfaceC0319e == null || !((j) interfaceC0319e).f6871n) {
                z3 = false;
            }
        }
        return z3;
    }

    @Override // retrofit2.Call
    public synchronized boolean isExecuted() {
        return this.executed;
    }

    public Response<T> parseResponse(O o4) throws IOException {
        T t2 = o4.f6297g;
        N s4 = o4.s();
        s4.f6286g = new NoContentResponseBody(t2.contentType(), t2.contentLength());
        O a2 = s4.a();
        int i = a2.f6294d;
        if (i < 200 || i >= 300) {
            try {
                return Response.error(Utils.buffer(t2), a2);
            } finally {
                t2.close();
            }
        }
        if (i == 204 || i == 205) {
            t2.close();
            return Response.success((Object) null, a2);
        }
        ExceptionCatchingResponseBody exceptionCatchingResponseBody = new ExceptionCatchingResponseBody(t2);
        try {
            return Response.success(this.responseConverter.convert(exceptionCatchingResponseBody), a2);
        } catch (RuntimeException e4) {
            exceptionCatchingResponseBody.throwIfCaught();
            throw e4;
        }
    }

    @Override // retrofit2.Call
    public synchronized I request() {
        try {
        } catch (IOException e4) {
            throw new RuntimeException("Unable to create request.", e4);
        }
        return ((j) getRawCall()).f6861b;
    }

    @Override // retrofit2.Call
    public synchronized K timeout() {
        try {
        } catch (IOException e4) {
            throw new RuntimeException("Unable to create call.", e4);
        }
        return ((j) getRawCall()).f6863d;
    }

    @Override // retrofit2.Call
    public OkHttpCall<T> clone() {
        return new OkHttpCall<>(this.requestFactory, this.args, this.callFactory, this.responseConverter);
    }
}
