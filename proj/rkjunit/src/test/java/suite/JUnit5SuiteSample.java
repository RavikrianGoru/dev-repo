package suite;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.ExcludePackages;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectPackages({ "rk.junit", "rk.junit.one" })
//@IncludePackages("rk.junit.one")
@ExcludePackages("rk.junit.two")
@IncludeTags({ "RK", "development" })
//@ExcludeTags("production")
@SelectClasses({ rk.junit.one.DummyTest.class, rk.junit.one.SampleOneATest.class })
//@IncludeClassNamePatterns({"^.*ATests?$"})
//@ExcludeClassNamePatterns({"^.*ATests?$"})
public class JUnit5SuiteSample {

}
