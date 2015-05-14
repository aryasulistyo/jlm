package my.jlm.adapter;
 
import my.jlm.ProductNetSatBenefitFragment;
import my.jlm.ProductNetSatReqFragment;
import my.jlm.ProductNetSatSummaryFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
 
public class NetSatTabsPagerAdapter extends FragmentPagerAdapter {
 
    public NetSatTabsPagerAdapter(FragmentManager fm) {
        super(fm);
    }
 
    @Override
    public Fragment getItem(int index) {
 
        switch (index) {
        case 0:
            // Top Rated fragment activity
            return new ProductNetSatSummaryFragment();
        case 1:
            // Games fragment activity
            return new ProductNetSatBenefitFragment();
        case 2:
            // Movies fragment activity
            return new ProductNetSatReqFragment();
        }
 
        return null;
    }
 
    @Override
    public int getCount() {
        // get item count - equal to number of tabs
        return 3;
    }
 
}