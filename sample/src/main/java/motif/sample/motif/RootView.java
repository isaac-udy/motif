package motif.sample.motif;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import motif.sample.R;

public class RootView extends FrameLayout {

    public RootView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public RootView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public static RootView create(ViewGroup parent) {
        return (RootView) LayoutInflater.from(parent.getContext()).inflate(R.layout.root, parent, false);
    }
}
