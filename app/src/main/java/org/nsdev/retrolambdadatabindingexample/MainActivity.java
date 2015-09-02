package org.nsdev.retrolambdadatabindingexample;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import org.nsdev.retrolambdadatabindingexample.databinding.PolicyBinding;
import org.nsdev.retrolambdadatabindingexample.model.ManagePolicyAction;
import org.nsdev.retrolambdadatabindingexample.model.Policy;
import org.nsdev.retrolambdadatabindingexample.model.PolicyViewModel;
import org.nsdev.retrolambdadatabindingexample.model.RepresentativeAction;

public class MainActivity extends AppCompatActivity {

    PolicyBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mBinding = DataBindingUtil.setContentView(this, R.layout.policy);

        ManagePolicyAction managePolicyAction = new ManagePolicyAction();
        managePolicyAction.setLinkText("Manage Policy");
        managePolicyAction.setUrl("http://www.nsdev.org");
        mBinding.setManagePolicyAction(managePolicyAction);

        RepresentativeAction representativeAction = new RepresentativeAction();
        representativeAction.setLinkText("Phone your representative");
        representativeAction.setPhoneNumber("403-555-1212");
        mBinding.setRepresentativeAction(representativeAction);

        Policy policy = new Policy();
        policy.setPolicynumber("A333");
        policy.setStartdate("2015-01-19T01:00");
        policy.setDuration(20);
        mBinding.setPolicy(new PolicyViewModel(this, policy));

        mBinding.setDescription("This is an example data binding and retrolambda app.");

        mBinding.setPhoneRepClickHandler(view -> Toast.makeText(this, "Phone Rep Clicked", Toast.LENGTH_SHORT).show());
        mBinding.setManagePolicyClickHandler(view -> Toast.makeText(this, "Manage Policy Clicked", Toast.LENGTH_SHORT).show());

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
