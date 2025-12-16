package androidx.recyclerview.widget;

/* loaded from: classes.dex */
public abstract class M extends K {
    private int mDefaultSwipeDirs = 4;
    private int mDefaultDragDirs = 0;

    public int getDragDirs(RecyclerView recyclerView, I0 i02) {
        return this.mDefaultDragDirs;
    }

    public int getSwipeDirs(RecyclerView recyclerView, I0 i02) {
        return this.mDefaultSwipeDirs;
    }

    public void setDefaultDragDirs(int i) {
        this.mDefaultDragDirs = i;
    }

    public void setDefaultSwipeDirs(int i) {
        this.mDefaultSwipeDirs = i;
    }
}
