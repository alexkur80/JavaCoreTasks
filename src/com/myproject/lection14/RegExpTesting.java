/**
 * This class include RegExt tasks
 *
 * @author Kurlovich Alexander
 * @version Lection14 RegExp
 * @date 03/18/2020
 */


package com.myproject.lection14;

import com.myproject.utils.ApplicationLogger;
import jdk.jfr.SettingControl;

public class RegExpTesting {

    public static void main(String[] args) {
        String emailToValidate =
                "bill@aol.com 22bill@aol.com _bill@aol.com " +
                        "sfsdf sdf s Lots of punctuation sadfasdf_sdfsd@aol.com.erf" +
                        "asdfsdf edsasds@sd.cm.efdd.sd.sdsa" +
                        "_sdfsdf@eu.com.org.gov" +
                        "pupkin@ao.com1.com.org";
        String hexToValidate =
                "0x00adas 0x11321 0x12 " +
                        "0x13 0x18 19asdas0x2ffffwdasd " +
                        "asdf0x1a asdf0x1bdfsa 0x1c 0x1d " +
                        "1e0x 0x1f280x29 0x2a 0x2b 0x2c 0x2dh" +
                        " 0x2edasd 0x2fasdfasdf sad";
        String tegToReplace =
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

        String phoneToValidate =
                "+375123424525+37512312343322+3751234223323375123123433\n" +
                        "+3751222345232+375126782344212312312" +
                        "+375123442333434341234+375123242" +
                        "+3751222342332ddsa231212 +3752950808102" +
                        "+375122242234678+37512678234423123123";

        String ipv4ToValidate = "0.0.0.0  0.0.1.0 255.0.0.1 255.55.255.255 " +
                "192.168.0.1  001.0.0.0 256.1.1.1 1.1.1.1. \n" +
                "-1.0.-1.1 ";

        String resultRegExp;

        resultRegExp = UtilsRegExp.emailValidator(emailToValidate);
        ApplicationLogger.LOGGER.info(resultRegExp);

        resultRegExp = UtilsRegExp.hexValidator(hexToValidate);
        ApplicationLogger.LOGGER.info(resultRegExp);

        resultRegExp = UtilsRegExp.tegReplacement(tegToReplace, replacementTemplate);
        ApplicationLogger.LOGGER.info(resultRegExp);

        resultRegExp = UtilsRegExp.phoneValidator(phoneToValidate);
        ApplicationLogger.LOGGER.info(resultRegExp);

        resultRegExp = UtilsRegExp.ipV4Validator(ipv4ToValidate);
        ApplicationLogger.LOGGER.info(resultRegExp);
    }

}
