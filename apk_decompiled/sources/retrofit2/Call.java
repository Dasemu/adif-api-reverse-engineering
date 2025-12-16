package retrofit2;

import e3.I;
import java.io.IOException;
import r3.K;

/* loaded from: classes3.dex */
public interface Call<T> extends Cloneable {
    void cancel();

    Call<T> clone();

    void enqueue(Callback<T> callback);

    Response<T> execute() throws IOException;

    boolean isCanceled();

    boolean isExecuted();

    I request();

    K timeout();
}
