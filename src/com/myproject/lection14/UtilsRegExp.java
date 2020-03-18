package com.myproject.lection14;

import com.myproject.utils.ApplicationLogger;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UtilsRegExp {

    /**
     * This class uses RegEx to validate email addresses from raw text. Email template should have digits, letters,
     * sign '_' but not start with '_'. It should have domen upper level org.com.by
     * It have restriction on domen length    - from 1 to 7 symbols/
     * Domen doesn't should end by '_'
     * RegExp   [^\W_0-9]\w+@\w+(\.[^W_ .]{3,5})+
     * Description:
     * [^\W_0-9]    Start any letter and number exclude '_' and digits from '0-9"
     * \w+@\w+  any symbol and digits from one to more, then '@' and then again symbol and digits from one to more
     * (\.[^W_ .]{1,7})+    group. Start any symbol, then any letter and digits, exclude '_', "Space", '.'
     * from 1 to 7 and repeat from one to more. It makes using higher level domens.
     *
     * @param rawTextToGetEmails raw text where to find correct emails;
     */
    public static String emailValidator(String rawTextToGetEmails) {

        Pattern pattern = Pattern.compile("[^\\W_0-9]\\w+@\\w+(\\.[^W_ .]{3,5})+", Pattern.MULTILINE);
        Matcher matcher = pattern.matcher(rawTextToGetEmails);

        StringBuilder stringbuilder = new StringBuilder();

        while (matcher.find()) {

            stringbuilder.append(matcher.group())
                    .append(" ");
        }

        ApplicationLogger.LOGGER.info("Before: " + rawTextToGetEmails);
        String result = stringbuilder.toString();
        return "After " + result;

    }

    /**
     * This class uses RegEx to find valid HEX numbers and get them.
     * RegExp   0x([0-9]|[a-fA-F])+
     * Description
     * 0x    - start from 0x
     * ([0-9]|[a-fA-F])+   group. Here we are looking for digits from ;0-9' or letters from 'A-F, a-f"
     * that use fox HEX. Group can be long because of big HEX number
     *
     * @param rawTextToGetHex raw text where to find correct HEX numbers;
     */
    public static String hexValidator(String rawTextToGetHex) {

        Pattern pattern = Pattern.compile("0x([0-9]|[a-fA-F])+", Pattern.MULTILINE);
        Matcher matcher = pattern.matcher(rawTextToGetHex);

        StringBuilder stringbuilder = new StringBuilder();

        while (matcher.find()) {
            stringbuilder.append(matcher.group())
                    .append(" ");
        }

        ApplicationLogger.LOGGER.info("Before:" + rawTextToGetHex);
        String result = stringbuilder.toString();
        return "After " + result;

    }


    /**
     * This class uses RegEx to find symbols between tegs <qwqwe 2SDASD> and replace
     * for <p>
     * RegExp   <(.|\n)*?>
     * Description
     * < start with '<'
     * (.|\n)*?    group that have any symbol "." or '\n' if tagged text finish at the next line
     * and repeat it many times or not and '?' means preveous action is not nessesarry.
     * Finish with > teg
     *
     * @param rawTextToReplaceTegs
     * @param replacementString
     */
    public static String tegReplacement(String rawTextToReplaceTegs, String replacementString) {

        Pattern pattern = Pattern.compile("<(.|\\n)*?>", Pattern.MULTILINE);
        Matcher matcher = pattern.matcher(rawTextToReplaceTegs);

        ApplicationLogger.LOGGER.info("Before: " + rawTextToReplaceTegs);

        String result = matcher.replaceAll(replacementString).toString();
        return "After " + result;
    }

}
