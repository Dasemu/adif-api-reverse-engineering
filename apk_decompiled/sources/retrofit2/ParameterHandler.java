package retrofit2;

import C.w;
import a.AbstractC0105a;
import e3.C;
import e3.C0334u;
import e3.M;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class ParameterHandler<T> {

    /* loaded from: classes3.dex */
    public static final class Body<T> extends ParameterHandler<T> {
        private final Converter<T, M> converter;
        private final Method method;
        private final int p;

        public Body(Method method, int i, Converter<T, M> converter) {
            this.method = method;
            this.p = i;
            this.converter = converter;
        }

        @Override // retrofit2.ParameterHandler
        public void apply(RequestBuilder requestBuilder, T t2) {
            if (t2 == null) {
                throw Utils.parameterError(this.method, this.p, "Body parameter value must not be null.", new Object[0]);
            }
            try {
                requestBuilder.setBody(this.converter.convert(t2));
            } catch (IOException e4) {
                throw Utils.parameterError(this.method, e4, this.p, "Unable to convert " + t2 + " to RequestBody", new Object[0]);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class Field<T> extends ParameterHandler<T> {
        private final boolean encoded;
        private final String name;
        private final Converter<T, String> valueConverter;

        public Field(String str, Converter<T, String> converter, boolean z3) {
            Objects.requireNonNull(str, "name == null");
            this.name = str;
            this.valueConverter = converter;
            this.encoded = z3;
        }

        @Override // retrofit2.ParameterHandler
        public void apply(RequestBuilder requestBuilder, T t2) throws IOException {
            String convert;
            if (t2 == null || (convert = this.valueConverter.convert(t2)) == null) {
                return;
            }
            requestBuilder.addFormField(this.name, convert, this.encoded);
        }
    }

    /* loaded from: classes3.dex */
    public static final class FieldMap<T> extends ParameterHandler<Map<String, T>> {
        private final boolean encoded;
        private final Method method;
        private final int p;
        private final Converter<T, String> valueConverter;

        public FieldMap(Method method, int i, Converter<T, String> converter, boolean z3) {
            this.method = method;
            this.p = i;
            this.valueConverter = converter;
            this.encoded = z3;
        }

        @Override // retrofit2.ParameterHandler
        public void apply(RequestBuilder requestBuilder, Map<String, T> map) throws IOException {
            if (map != null) {
                for (Map.Entry<String, T> entry : map.entrySet()) {
                    String key = entry.getKey();
                    if (key != null) {
                        T value = entry.getValue();
                        if (value != null) {
                            String convert = this.valueConverter.convert(value);
                            if (convert != null) {
                                requestBuilder.addFormField(key, convert, this.encoded);
                            } else {
                                throw Utils.parameterError(this.method, this.p, "Field map value '" + value + "' converted to null by " + this.valueConverter.getClass().getName() + " for key '" + key + "'.", new Object[0]);
                            }
                        } else {
                            throw Utils.parameterError(this.method, this.p, w.o("Field map contained null value for key '", key, "'."), new Object[0]);
                        }
                    } else {
                        throw Utils.parameterError(this.method, this.p, "Field map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw Utils.parameterError(this.method, this.p, "Field map was null.", new Object[0]);
        }
    }

    /* loaded from: classes3.dex */
    public static final class Header<T> extends ParameterHandler<T> {
        private final String name;
        private final Converter<T, String> valueConverter;

        public Header(String str, Converter<T, String> converter) {
            Objects.requireNonNull(str, "name == null");
            this.name = str;
            this.valueConverter = converter;
        }

        @Override // retrofit2.ParameterHandler
        public void apply(RequestBuilder requestBuilder, T t2) throws IOException {
            String convert;
            if (t2 == null || (convert = this.valueConverter.convert(t2)) == null) {
                return;
            }
            requestBuilder.addHeader(this.name, convert);
        }
    }

    /* loaded from: classes3.dex */
    public static final class HeaderMap<T> extends ParameterHandler<Map<String, T>> {
        private final Method method;
        private final int p;
        private final Converter<T, String> valueConverter;

        public HeaderMap(Method method, int i, Converter<T, String> converter) {
            this.method = method;
            this.p = i;
            this.valueConverter = converter;
        }

        @Override // retrofit2.ParameterHandler
        public void apply(RequestBuilder requestBuilder, Map<String, T> map) throws IOException {
            if (map != null) {
                for (Map.Entry<String, T> entry : map.entrySet()) {
                    String key = entry.getKey();
                    if (key != null) {
                        T value = entry.getValue();
                        if (value != null) {
                            requestBuilder.addHeader(key, this.valueConverter.convert(value));
                        } else {
                            throw Utils.parameterError(this.method, this.p, w.o("Header map contained null value for key '", key, "'."), new Object[0]);
                        }
                    } else {
                        throw Utils.parameterError(this.method, this.p, "Header map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw Utils.parameterError(this.method, this.p, "Header map was null.", new Object[0]);
        }
    }

    /* loaded from: classes3.dex */
    public static final class Headers extends ParameterHandler<C0334u> {
        private final Method method;
        private final int p;

        public Headers(Method method, int i) {
            this.method = method;
            this.p = i;
        }

        @Override // retrofit2.ParameterHandler
        public void apply(RequestBuilder requestBuilder, C0334u c0334u) {
            if (c0334u != null) {
                requestBuilder.addHeaders(c0334u);
                return;
            }
            throw Utils.parameterError(this.method, this.p, "Headers parameter must not be null.", new Object[0]);
        }
    }

    /* loaded from: classes3.dex */
    public static final class Part<T> extends ParameterHandler<T> {
        private final Converter<T, M> converter;
        private final C0334u headers;
        private final Method method;
        private final int p;

        public Part(Method method, int i, C0334u c0334u, Converter<T, M> converter) {
            this.method = method;
            this.p = i;
            this.headers = c0334u;
            this.converter = converter;
        }

        @Override // retrofit2.ParameterHandler
        public void apply(RequestBuilder requestBuilder, T t2) {
            if (t2 == null) {
                return;
            }
            try {
                requestBuilder.addPart(this.headers, this.converter.convert(t2));
            } catch (IOException e4) {
                throw Utils.parameterError(this.method, this.p, "Unable to convert " + t2 + " to RequestBody", e4);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class PartMap<T> extends ParameterHandler<Map<String, T>> {
        private final Method method;
        private final int p;
        private final String transferEncoding;
        private final Converter<T, M> valueConverter;

        public PartMap(Method method, int i, Converter<T, M> converter, String str) {
            this.method = method;
            this.p = i;
            this.valueConverter = converter;
            this.transferEncoding = str;
        }

        @Override // retrofit2.ParameterHandler
        public void apply(RequestBuilder requestBuilder, Map<String, T> map) throws IOException {
            if (map != null) {
                for (Map.Entry<String, T> entry : map.entrySet()) {
                    String key = entry.getKey();
                    if (key != null) {
                        T value = entry.getValue();
                        if (value != null) {
                            requestBuilder.addPart(AbstractC0105a.I("Content-Disposition", w.o("form-data; name=\"", key, "\""), "Content-Transfer-Encoding", this.transferEncoding), this.valueConverter.convert(value));
                        } else {
                            throw Utils.parameterError(this.method, this.p, w.o("Part map contained null value for key '", key, "'."), new Object[0]);
                        }
                    } else {
                        throw Utils.parameterError(this.method, this.p, "Part map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw Utils.parameterError(this.method, this.p, "Part map was null.", new Object[0]);
        }
    }

    /* loaded from: classes3.dex */
    public static final class Path<T> extends ParameterHandler<T> {
        private final boolean encoded;
        private final Method method;
        private final String name;
        private final int p;
        private final Converter<T, String> valueConverter;

        public Path(Method method, int i, String str, Converter<T, String> converter, boolean z3) {
            this.method = method;
            this.p = i;
            Objects.requireNonNull(str, "name == null");
            this.name = str;
            this.valueConverter = converter;
            this.encoded = z3;
        }

        @Override // retrofit2.ParameterHandler
        public void apply(RequestBuilder requestBuilder, T t2) throws IOException {
            if (t2 == null) {
                throw Utils.parameterError(this.method, this.p, w.r(new StringBuilder("Path parameter \""), this.name, "\" value must not be null."), new Object[0]);
            }
            requestBuilder.addPathParam(this.name, this.valueConverter.convert(t2), this.encoded);
        }
    }

    /* loaded from: classes3.dex */
    public static final class Query<T> extends ParameterHandler<T> {
        private final boolean encoded;
        private final String name;
        private final Converter<T, String> valueConverter;

        public Query(String str, Converter<T, String> converter, boolean z3) {
            Objects.requireNonNull(str, "name == null");
            this.name = str;
            this.valueConverter = converter;
            this.encoded = z3;
        }

        @Override // retrofit2.ParameterHandler
        public void apply(RequestBuilder requestBuilder, T t2) throws IOException {
            String convert;
            if (t2 == null || (convert = this.valueConverter.convert(t2)) == null) {
                return;
            }
            requestBuilder.addQueryParam(this.name, convert, this.encoded);
        }
    }

    /* loaded from: classes3.dex */
    public static final class QueryMap<T> extends ParameterHandler<Map<String, T>> {
        private final boolean encoded;
        private final Method method;
        private final int p;
        private final Converter<T, String> valueConverter;

        public QueryMap(Method method, int i, Converter<T, String> converter, boolean z3) {
            this.method = method;
            this.p = i;
            this.valueConverter = converter;
            this.encoded = z3;
        }

        @Override // retrofit2.ParameterHandler
        public void apply(RequestBuilder requestBuilder, Map<String, T> map) throws IOException {
            if (map != null) {
                for (Map.Entry<String, T> entry : map.entrySet()) {
                    String key = entry.getKey();
                    if (key != null) {
                        T value = entry.getValue();
                        if (value != null) {
                            String convert = this.valueConverter.convert(value);
                            if (convert != null) {
                                requestBuilder.addQueryParam(key, convert, this.encoded);
                            } else {
                                throw Utils.parameterError(this.method, this.p, "Query map value '" + value + "' converted to null by " + this.valueConverter.getClass().getName() + " for key '" + key + "'.", new Object[0]);
                            }
                        } else {
                            throw Utils.parameterError(this.method, this.p, w.o("Query map contained null value for key '", key, "'."), new Object[0]);
                        }
                    } else {
                        throw Utils.parameterError(this.method, this.p, "Query map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw Utils.parameterError(this.method, this.p, "Query map was null", new Object[0]);
        }
    }

    /* loaded from: classes3.dex */
    public static final class QueryName<T> extends ParameterHandler<T> {
        private final boolean encoded;
        private final Converter<T, String> nameConverter;

        public QueryName(Converter<T, String> converter, boolean z3) {
            this.nameConverter = converter;
            this.encoded = z3;
        }

        @Override // retrofit2.ParameterHandler
        public void apply(RequestBuilder requestBuilder, T t2) throws IOException {
            if (t2 == null) {
                return;
            }
            requestBuilder.addQueryParam(this.nameConverter.convert(t2), null, this.encoded);
        }
    }

    /* loaded from: classes3.dex */
    public static final class RawPart extends ParameterHandler<C> {
        static final RawPart INSTANCE = new RawPart();

        private RawPart() {
        }

        @Override // retrofit2.ParameterHandler
        public void apply(RequestBuilder requestBuilder, C c4) {
            if (c4 != null) {
                requestBuilder.addPart(c4);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class RelativeUrl extends ParameterHandler<Object> {
        private final Method method;
        private final int p;

        public RelativeUrl(Method method, int i) {
            this.method = method;
            this.p = i;
        }

        @Override // retrofit2.ParameterHandler
        public void apply(RequestBuilder requestBuilder, Object obj) {
            if (obj == null) {
                throw Utils.parameterError(this.method, this.p, "@Url parameter is null.", new Object[0]);
            }
            requestBuilder.setRelativeUrl(obj);
        }
    }

    /* loaded from: classes3.dex */
    public static final class Tag<T> extends ParameterHandler<T> {
        final Class<T> cls;

        public Tag(Class<T> cls) {
            this.cls = cls;
        }

        @Override // retrofit2.ParameterHandler
        public void apply(RequestBuilder requestBuilder, T t2) {
            requestBuilder.addTag(this.cls, t2);
        }
    }

    public abstract void apply(RequestBuilder requestBuilder, T t2) throws IOException;

    public final ParameterHandler<Object> array() {
        return new ParameterHandler<Object>() { // from class: retrofit2.ParameterHandler.2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // retrofit2.ParameterHandler
            public void apply(RequestBuilder requestBuilder, Object obj) throws IOException {
                if (obj == null) {
                    return;
                }
                int length = Array.getLength(obj);
                for (int i = 0; i < length; i++) {
                    ParameterHandler.this.apply(requestBuilder, Array.get(obj, i));
                }
            }
        };
    }

    public final ParameterHandler<Iterable<T>> iterable() {
        return new ParameterHandler<Iterable<T>>() { // from class: retrofit2.ParameterHandler.1
            @Override // retrofit2.ParameterHandler
            public void apply(RequestBuilder requestBuilder, Iterable<T> iterable) throws IOException {
                if (iterable == null) {
                    return;
                }
                Iterator<T> it = iterable.iterator();
                while (it.hasNext()) {
                    ParameterHandler.this.apply(requestBuilder, it.next());
                }
            }
        };
    }
}
