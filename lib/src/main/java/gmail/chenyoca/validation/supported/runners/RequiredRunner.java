package gmail.chenyoca.validation.supported.runners;

import android.content.Context;
import android.text.TextUtils;

import gmail.chenyoca.validation.R;
import gmail.chenyoca.validation.supported.TestRunner;

/**
 * AUTH: chenyoca (chenyoca@gmail.com)
 * DATE: 2014-06-25
 * Required runner.
 */
public class RequiredRunner extends TestRunner{

    public RequiredRunner(Context c){
        super(c, R.string.required);
    }

    @Override
    public boolean test(CharSequence inputValue) {
        return ! TextUtils.isEmpty(inputValue);
    }
}