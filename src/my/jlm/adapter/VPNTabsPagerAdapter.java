package my.jlm.adapter;
 
import my.jlm.ProductVPNBenefitFragment;
import my.jlm.ProductVPNReqFragment;
import my.jlm.ProductVPNSummaryFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
 
public class VPNTabsPagerAdapter extends FragmentPagerAdapter {
 
    public VPNTabsPagerAdapter(FragmentManager fm) {
        super(fm);
    }
 
    @Override
    public Fragment getItem(int index) {
 
        switch (index) {
        case 0:
            // Top Rated fragment activity
            return new ProductVPNSummaryFragment();
        case 1:
            // Games fragment activity
            return new ProductVPNBenefitFragment();
        case 2:
            // Movies fragment activity
            return new ProductVPNReqFragment();
        }
 
        return null;
    }
 
    @Override
    public int getCount() {
        // get item count - equal to number of tabs
        return 3;
    }
 
}