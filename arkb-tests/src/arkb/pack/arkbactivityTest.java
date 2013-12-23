package arkb.pack;

import android.test.ActivityInstrumentationTestCase2;

/**
 * This is a simple framework for a test of an Application.  See
 * {@link android.test.ApplicationTestCase ApplicationTestCase} for more information on
 * how to write and extend Application tests.
 * <p/>
 * To run this test, you can type:
 * adb shell am instrument -w \
 * -e class arkb.pack.arkbactivityTest \
 * arkb.pack.tests/android.test.InstrumentationTestRunner
 */
public class arkbactivityTest extends ActivityInstrumentationTestCase2<arkbactivity> {

    public arkbactivityTest() {
        super("arkb.pack", arkbactivity.class);
    }

    public void testName() throws Exception {

    }
}
