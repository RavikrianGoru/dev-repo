package suite;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.ExcludePackages;
import org.junit.platform.suite.api.IncludePackages;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectPackages("rk.junit")
@IncludePackages("rk.junit.one")
@ExcludePackages("rk.junit.two")
@IncludeTags({"RK","development"})
//@ExcludeTags("production")
public class JUnit5SuiteSample {

}
