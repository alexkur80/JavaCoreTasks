package com.myproject.lection14;

import org.apache.log4j.Logger;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class UtilsRegExp {
    public final static Logger LOGGER = Logger.getLogger(UtilsRegExp.class);

    /**
     * Validates correct email addresses from raw text. Email template should have digits, letters,
     * sign '_' but not start with '_'. It should have domen upper level org.com.by
     * It have restriction on domen length    - from 1 to 7 symbols/
     * Domen doesn't should end by '_'
     * RegExp   (?<=\s|^)([^\W_0-9]\w+)[@]([^\W_]+\.)+[^\W_]{2,4}(?=\s|$)
     * Description:
     * (?<=\s|^)  - positive look behind  - if starts with '\s' | '^' then we are looking next condition
     * ([^\W_0-9]\w+) - group 1, verify that starts from letter only, exclude '_' and 0-9'
     * and then any letter 'w\+' include digits and letters
     * [@] - then'@' every email has
     * ([^\W_]+\.)+    this group include letters, digits exclude '_' from one to many times and then
     * include '.'
     * [^\W_]{2,4}(?=\s) - this verify if include domen upper level inclide all letters and digits,
     * exclude '_' and have length {2,4}
     * (?=\s|$)   positive look ahead - see, if next symbol finishes with '\s' or this is last symbol of text
     * <p>
     * from 1 to 7 and repeat from one to more. It makes using higher level domens.
     *
     * @param emailToValidate raw text where to find correct emails;
     */
    public static String emailValidator(String emailToValidate) {
        Pattern pattern = Pattern.compile("(?<=\\s|^)([^\\W_0-9]\\w+)[@]([^\\W_]+\\.)+[^\\W_]{2,4}(?=\\s|$)", Pattern.MULTILINE);
        Matcher matcher = pattern.matcher(emailToValidate);
        StringBuilder stringbuilder = new StringBuilder();

        while (matcher.find()) {
            stringbuilder.append(matcher.group())
                    .append(" ");
        }

        LOGGER.info("Before: " + emailToValidate);

        String result = stringbuilder.toString();
        return "After " + result;
    }

    /**
     * Validates correct HEX numbers.
     * RegExp   0x([0-9]|[a-fA-F])+
     * Description
     * 0x    - start from 0x
     * ([0-9]|[a-fA-F])+   group. Here we are looking for digits from ;0-9' or letters from 'A-F, a-f"
     * that use fox HEX. Group can be long because of big HEX number
     *
     * @param hexToValidate raw text where to find correct HEX numbers;
     */
    public static String hexValidator(String hexToValidate) {
        Pattern pattern = Pattern.compile("0x([0-9]|[a-fA-F])+", Pattern.MULTILINE);
        Matcher matcher = pattern.matcher(hexToValidate);
        StringBuilder stringbuilder = new StringBuilder();

        while (matcher.find()) {
            stringbuilder.append(matcher.group())
                    .append(" ");
        }

        LOGGER.info("Before:" + hexToValidate);

        String result = stringbuilder.toString();
        return "After " + result;
    }


    /**
     * Finds symbols between tegs <qwqwe 2SDASD> and replace by
     * RegExp   <(.|\n)*?>
     * Description
     * < start with '<'
     * (.|\n)*?    group that have any symbol "." or '\n' if tagged text finish at the next line
     * and repeat it many times or not and '?' means preveous action is not nessesarry.
     * Finish with > teg
     *
     * @param tegToReplace        tegs which replace
     * @param replacementTemplate tegs which to be replaced
     */
    public static String tegReplacement(String tegToReplace, String replacementTemplate) {
        Pattern pattern = Pattern.compile("<(.|\\n)*?>", Pattern.MULTILINE);
        Matcher matcher = pattern.matcher(tegToReplace);

        LOGGER.info("Before: " + tegToReplace);

        String result = matcher.replaceAll(replacementTemplate);
        return "After " + result;
    }

    /**
     * Validates phoneNumbers from format +375000000000 and output to correct format
     * +375 (XX) YYY-YY-YY
     * RegEx    (\+375)(\d{2})(\d{3})(\d{2})(\d{2})
     * important: Since we need to output in some format - regex should be grouped to collect
     * easy using StringBuilder append method/
     * (\+375)  group start '+375' must start every phone number
     * \d{2})(\d{3})(\d{2})(\d{2})  four other groups devided number for group for 2, 3,2,2 digits
     * and after matcher finishes - every group keeps in matcher.group(n) so it it easy to
     * extract every group in while cycle and collect phone numbers in correct format.
     *
     * @param phoneNumToValidate raw text containing phone numbers
     * @return phone numbers in format +375 (XX) YYY-YY-YY
     */
    public static String phoneValidator(String phoneNumToValidate) {
        Pattern pattern = Pattern.compile("(\\+375)(\\d{2})(\\d{3})(\\d{2})(\\d{2})", Pattern.MULTILINE);
        Matcher matcher = pattern.matcher(phoneNumToValidate);
        StringBuilder stringBuilder = new StringBuilder();

        while (matcher.find()) {
            stringBuilder
                    .append(" ")
                    .append(matcher.group(1))
                    .append("(")
                    .append(matcher.group(2))
                    .append(")")
                    .append(matcher.group(3))
                    .append("-")
                    .append(matcher.group(4))
                    .append("-")
                    .append(matcher.group(5));
        }

        LOGGER.info("Before:" + phoneNumToValidate);

        String result = stringBuilder.toString();
        return "After " + result;
    }


    /**
     * Validates correct IP address
     * Example valid Ipv4:
     * 0.0.0.0
     * 0.0.1.0
     * 255.0.0.1
     * 255.55.255.255
     * 192.168.0.1
     * <p>
     * Example not valid Ipv4
     * 001.0.0.0
     * 256.1.1.1
     * 1.1.1.1.
     * -1.0.-1.1
     * <p>
     * Regexp
     * it has 4 equal group code so here is description.
     * To cover every legit digits it shouldb following rules
     * (25[0-5]|2[0-4][0-9]|[1]?[0-9][0-9]?)     - can start with '25' and be only max 255, so
     * 25[0-5]  means it can be 250-255. OR it cab ne max 249, so 2[0-4][0-9] cover from 200 to 249
     * [1]?[0-9][0-9]?  means [1]? can be 1 one time or not to be, then it must be [0-9] and [0-9]? means
     * from 0 to 9 can be one time or not to be.
     * There is some important. First - IP should start from word boundary '\b' and finish only digits,
     * so we use Positive look behind  (?=\s|$) -  means it finish with \s or at the end of line $
     *
     * @param ipv4ToValidate raw text containing phone numbers
     * @return valid IPv4
     */
    public static String ipV4Validator(String ipv4ToValidate) {
        Pattern pattern = Pattern.compile("\\b(25[0-5]|2[0-4][0-9]|[1]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[1]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)(?=\\s|$)", Pattern.MULTILINE);
        Matcher matcher = pattern.matcher(ipv4ToValidate);
        StringBuilder stringbuilder = new StringBuilder();

        while (matcher.find()) {
            stringbuilder
                    .append(" ")
                    .append(matcher.group());
        }

        LOGGER.info("Before: " + ipv4ToValidate);

        String result = stringbuilder.toString();
        return "After" + result;
    }
}