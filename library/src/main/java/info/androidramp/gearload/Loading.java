package info.androidramp.gearload;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;

/**
 * Created by Thanvandh on 06/05/2016.
 */
public class Loading extends LinearLayout {

    View loadingView;

    View vGearGreen;
    View vGearBlue;
    View vGearRed;

    Animation animGreen;
    Animation animBlue;
    Animation animRed;

    Context context;


    public Loading(Context context) {
        super(context);
        init(context);
    }

    public Loading(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public Loading(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        init(context);
    }

    public void Cancel() {
        vGearGreen.setAnimation(null);
        vGearBlue.setAnimation(null);
        vGearRed.setAnimation(null);
        loadingView.setVisibility(View.GONE);
        Animation fadeOutAnimation = AnimationUtils.loadAnimation(context, R.anim.loading_fade_out);
        loadingView.startAnimation(fadeOutAnimation);
    }

    public void Start() {
        loadingView.setVisibility(View.VISIBLE);
        vGearGreen.setAnimation(animGreen);
        vGearBlue.setAnimation(animBlue);
        vGearRed.setAnimation(animRed);
    }

    private void init(Context context) {
        this.context = context;
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (inflater != null) {
            loadingView = inflater.inflate(R.layout.loading, this);
        }
        vGearGreen = loadingView.findViewById(R.id.gear_green);
        vGearBlue = loadingView.findViewById(R.id.gear_blue);
        vGearRed = loadingView.findViewById(R.id.gear_red);

        animGreen = AnimationUtils.loadAnimation(context, R.anim.loading_rotate_clock);
        animBlue = AnimationUtils.loadAnimation(context, R.anim.loading_rotate_anti_clock);
        animRed = AnimationUtils.loadAnimation(context, R.anim.loading_rotate_clock);


        if (!isInEditMode()) {
            loadingView.setVisibility(GONE);
        }
    }
}
