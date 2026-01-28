package junit.performance;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import com.regexandjunit.junit.performance.PerformanceUtils;

class PerformanceUtilsTest {

	// Fails test if execution exceeds 2 seconds
	@Test
	@Timeout(2)
	void testLongRunningTaskTimeout() throws InterruptedException {
		PerformanceUtils utils = new PerformanceUtils();
		utils.longRunningTask();
	}
}
