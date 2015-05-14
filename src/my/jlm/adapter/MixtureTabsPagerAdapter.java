package my.jlm.adapter;
 
import my.jlm.ProductMixtureBenefitFragment;
import my.jlm.ProductMixtureReqFragment;
import my.jlm.ProductMixtureSummaryFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
 
public class MixtureTabsPagerAdapter extends FragmentPagerAdapter {
 
    public MixtureTabsPagerAdapter(FragmentManager fm) {
        super(fm);
    }
 
    @Override
    public Fragment getItem(int index) {
 
        switch (index) {
        case 0:
            // Top Rated fragment activity
            return new ProductMixtureSummaryFragment();
        case 1:
            // Games fragment activity
            return new ProductMixtureBenefitFragment();
        case 2:
            // Movies fragment activity
            return new ProductMixtureReqFragment();
        }
 
        return null;
    }
 
    @Override
    public int getCount() {
        // get item count - equal to number of tabs
        return 3;
    }
 
}