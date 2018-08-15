package motif.sample.dagger;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import motif.sample.R;

public class LoggedInView extends FrameLayout {

    public LoggedInView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public LoggedInView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public static LoggedInView create(ViewGroup parent) {
        return (LoggedInView) LayoutInflater.from(parent.getContext()).inflate(R.layout.root, parent, false);
    }
}
