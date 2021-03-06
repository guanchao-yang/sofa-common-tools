package com.alipay.sofa.common.utils;

import com.alipay.sofa.common.log.ReportUtil;
import org.junit.Test;

import static org.junit.Assert.assertFalse;

/**
 * ReportUtil Tester.
 *
 * @author <guanchao.ygc>
 * @version 1.0
 * @since 18/06/04
 */
public class ReportUtilTest {

    @Test
    public void testUtils() {
        String errMsg = "Some Error Msg";
        boolean isException = false;
        try {
            ReportUtil.reportError("RuntimeException", new RuntimeException());
        } catch (Exception ex) {
            isException = true;
        }
        assertFalse(isException);
    }
} 
