/**
 * This class include RegExt tasks
 *
 * @author Kurlovich Alexander
 * @version Lection14 RegExp
 * @date 03/18/2020
 */


package com.myproject.lection14;

import com.myproject.utils.ApplicationLogger;

public class RegExpTesting {

    public static void main(String[] args) {
        String emailToValidate = "sdfsdf @aol.com abababab ab sdfsdfsd.com"
                + "sfsdf sdf s Lots of punctuation sadfasdf_sdfsd@aol.com.erf"
                + "asdfsdf edsasds@sd.cm.efdd as________21323123__sdfsdfdas df"
                + "as___3123__sdfsdf@dasdf ____21323123__sdfsdf@eu.com.org.gov";
        String hexToValidate =
                "0x00adas 0x11321 0x12 " +
                        "0x13 0x18 19asdas0x2ffffwdasd " +
                        "asdf0x1a asdf0x1bdfsa 0x1c 0x1d " +
                        "1e0x 0x1f280x29 0x2a 0x2b 0x2c 0x2dh" +
                        " 0x2edasd 0x2fasdfasdf sad";
        String tegsToReplace =
                "<blockquote><font color=\"#66cc66\">&gt;&gt;&gt;</font>&nbsp" +
                        ";<font color=\"#ff7700\">import</font>&nbsp;<font color" +
                        "=\"#dc143c\">re</font>   <br>\n" +
                        "<font color=\"#66cc66\">&gt;&gt;&gt;</font>&nbsp;p&nbs" +
                        "p;=&nbsp;<font color=\"#dc143c\">re</font>.<font col" +
                        "or=\"#008000\">compile</font><font>(</font><font color" +
                        "=\"#483d8b\">'ab*'</font><font>)</font><br>\n" +
                        "<font color=\"#66cc66\">&gt;&gt;&gt;</font>&nbsp;<font color" +
                        "=\"#ff7700\">print</font>&nbsp;p<br>";
        String replacementTemplate = "<p>";


        String resultRegExp;

        resultRegExp = UtilsRegExp.emailValidator(emailToValidate);
        ApplicationLogger.LOGGER.info(resultRegExp);

        resultRegExp = UtilsRegExp.hexValidator(hexToValidate);
        ApplicationLogger.LOGGER.info(resultRegExp);

        resultRegExp = UtilsRegExp.tegReplacement(tegsToReplace, replacementTemplate);
        ApplicationLogger.LOGGER.info(resultRegExp);

    }

}
