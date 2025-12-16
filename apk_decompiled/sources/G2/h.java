package G2;

/* loaded from: classes3.dex */
public abstract class h {
    public static final int DISMISS_EVENT_ACTION = 1;
    public static final int DISMISS_EVENT_CONSECUTIVE = 4;
    public static final int DISMISS_EVENT_MANUAL = 3;
    public static final int DISMISS_EVENT_SWIPE = 0;
    public static final int DISMISS_EVENT_TIMEOUT = 2;

    public abstract void onDismissed(Object obj, int i);

    public abstract void onShown(Object obj);
}
