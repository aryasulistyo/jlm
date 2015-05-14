package my.jlm.adapter;
 
import my.jlm.ProductUKMBenefitFragment;
import my.jlm.ProductUKMReqFragment;
import my.jlm.ProductUKMSummaryFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
 
public class UKMTabsPagerAdapter extends FragmentPagerAdapter {
 
    public UKMTabsPagerAdapter(FragmentManager fm) {
        super(fm);
    }
 
    @Override
    public Fragment getItem(int index) {
 
        switch (index) {
        case 0:
            // Top Rated fragment activity
            return new ProductUKMSummaryFragment();
        case 1:
            // Games fragment activity
            return new ProductUKMBenefitFragment();
        case 2:
            // Movies fragment activity
            return new ProductUKMReqFragment();
        }
 
        return null;
    }
 
    @Override
    public int getCount() {
        // get item count - equal to number of tabs
        return 3;
    }
 
}