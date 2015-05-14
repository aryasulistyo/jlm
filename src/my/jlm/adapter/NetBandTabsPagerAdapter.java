package my.jlm.adapter;
 
import my.jlm.ProductNetBandBenefitFragment;
import my.jlm.ProductNetBandReqFragment;
import my.jlm.ProductNetBandSummaryFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
 
public class NetBandTabsPagerAdapter extends FragmentPagerAdapter {
 
    public NetBandTabsPagerAdapter(FragmentManager fm) {
        super(fm);
    }
 
    @Override
    public Fragment getItem(int index) {
 
        switch (index) {
        case 0:
            // Top Rated fragment activity
            return new ProductNetBandSummaryFragment();
        case 1:
            // Games fragment activity
            return new ProductNetBandBenefitFragment();
        case 2:
            // Movies fragment activity
            return new ProductNetBandReqFragment();
        }
 
        return null;
    }
 
    @Override
    public int getCount() {
        // get item count - equal to number of tabs
        return 3;
    }
 
}