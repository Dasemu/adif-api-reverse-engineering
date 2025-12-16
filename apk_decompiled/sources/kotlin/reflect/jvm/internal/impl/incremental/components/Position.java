package kotlin.reflect.jvm.internal.impl.incremental.components;

import C.w;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class Position implements Serializable {
    public static final Companion Companion = new Companion(null);
    private static final Position NO_POSITION = new Position(-1, -1);
    private final int column;
    private final int line;

    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Position getNO_POSITION() {
            return Position.NO_POSITION;
        }

        private Companion() {
        }
    }

    public Position(int i, int i4) {
        this.line = i;
        this.column = i4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Position)) {
            return false;
        }
        Position position = (Position) obj;
        return this.line == position.line && this.column == position.column;
    }

    public int hashCode() {
        return Integer.hashCode(this.column) + (Integer.hashCode(this.line) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Position(line=");
        sb.append(this.line);
        sb.append(", column=");
        return w.p(sb, this.column, ')');
    }
}
