package program;

import java.util.Arrays;

public class CharacterProgram {

    public static void main(String[] args) {

        char x = 'a';
        char y = '爱';

        if (Character.isDigit(x))
            System.out.println("цифра");
        else
            System.out.println("не цифра");

        if (Character.isLetter(y))
            System.out.println("буква");
        else
            System.out.println("не буква");

        for (int i = 97; i <= 122; i++) {
            System.out.println(i + " " + (char)i);
        }
        for (int i = 48; i <= 57; i++) {
            System.out.println(i + " " + (char)i);
        }
        int q = Character.digit(x,10);
        System.out.println(q);


        // 1. toUpperCase/toLowerCase
        String string1 = "МАМА мыла РАМУ, 爱!";
        String toUpp = StringUtil.toUpperCase(string1);
        String toLow = StringUtil.toLowerCase(string1);
        System.out.println(toUpp);
        System.out.println(toLow);

        // 2. isDigit/isLetter/hasDigit/hasLetter
        String lineDigit = "35343! ";
        String lineLetter = "Hello!";
        String string = "Hello 333!";

        if (StringUtil.isDigit(lineDigit))
            System.out.println("число");
        else
            System.out.println("не число");

        if (StringUtil.isLetter(lineLetter))
            System.out.println("слово");
        else
            System.out.println("не слово");

        if (StringUtil.hasLetter(string))
            System.out.println("слово есть");
        else
            System.out.println("слова нет");

        if (StringUtil.hasDigit(string))
            System.out.println("число есть");
        else
            System.out.println("числа нет");

        // 3. hasUpperCase/hasLowerCase
        String lineHasUpp = "SDFSGSE3";
        String lineHasLow = "sdjfhsdf";

        if (StringUtil.hasUpperCase(lineHasUpp))
            System.out.println("Строка в верхнем регистре");
        else
            System.out.println("строка не в верхнем регистре");

        if (StringUtil.hasLowerCase(lineHasLow))
            System.out.println("Строка в нижнем регистре");
        else
            System.out.println("строка не в нижнем регистре");

        // 4. equals
        String lineEquals1 = "Мама мыла раму!";
        String lineEquals2 = "Мама мыла раму! ";

        if (StringUtil.equals(lineEquals1, lineEquals2))
            System.out.println("equals");
        else
            System.out.println("not equals");

        // 5. concat
        String concat1 = "Hello ";
        String concat2 = "World";

        String concat = StringUtil.concat(concat1, concat2);
        System.out.println(concat);

        // 6. substring
        String substring = "ыапвапвПаровозвапва";
        String resSubstring = StringUtil.substring(substring, 7, 7);
        System.out.println(resSubstring);

        // 7. substringV2
        String substringV2 = "ыапвапвПаровозвапва";
        String resSubstringV2 = StringUtil.substringV2(substring, 1, 3);
        System.out.println(resSubstringV2);

        // 8. erase
        String erase = "Карапоавдлаганда";
        String resErase = StringUtil.erase(erase, 4, 6);
        System.out.println(resErase);

        String eraseSB = StringUtil.eraseSB(erase, 4,6);
        System.out.println(eraseSB);

        String resEraseV2 = StringUtil.eraseV2(erase, 2, 14);
        System.out.println(resEraseV2 + "\n");

        // 9. insert
        String insert1 = "Мама  раму!";
        String insert2 = "мыла";
        String resInsert = StringUtil.insert(insert1, 5, insert2);
        System.out.println(resInsert);
        String resInsertSB = StringUtil.insertSB(insert1, 5, insert2);
        System.out.println(resInsertSB);
        String resInsertV2 = StringUtil.insertV2(insert1, 5, insert2);
        System.out.println(resInsertV2 + "\n");

        // 10. compareTo
        String cmt1 = "World";
        String cmt2 = "World1";
        int resCompareTo = StringUtil.compareTo(cmt1, cmt2);
        System.out.println(resCompareTo + "\n");

        String randomString1 = StringUtil.randomString(20, true, true);
        String randomString2 = StringUtil.randomString(20, false, true);
        String randomString3 = StringUtil.randomString(20, true, false);
        System.out.println(randomString1);
        System.out.println(randomString2);
        System.out.println(randomString3);

        // 11. getStringDigit
        String getStringDigit = "34fsd d sfhdsf7sd 787fsd ";
        String resGetStringDigit = StringUtil.getStringDigit(getStringDigit);
        System.out.println(resGetStringDigit + "\n");

        // 12. parseInt
        String parseInt = "dfgfgj779dah f fuhf f7";
        int resParseInt = StringUtil.parseInt(parseInt);
        System.out.println(resParseInt + "\n");

        // 13. parseIntegers
        String parseIntegers = "123kj456jhk78kjh9";
        Integer[] resParseIntegers = StringUtil.parseIntegers(parseIntegers);
        System.out.println(Arrays.toString(resParseIntegers) + "\n");

        // 14. isPalindrome
        String isPalindrome = "asdfgfdsA";
        boolean resIsPalindrome = StringUtil.isPalindrome(isPalindrome);
        System.out.println(resIsPalindrome + "\n");

        // 15. evaluate
        String evaluate = "1+2+3-4+5-6";
        int resEvaluate = StringUtil.evaluate(evaluate);
        System.out.println(resEvaluate + "\n");

        // 16. integerValueOf
        String integerValueOf = "12345";
        Integer resIntegerValueOf = StringUtil.integerValueOf(integerValueOf);
        System.out.println(resIntegerValueOf + "\n");

        // 17. stringValueOf
        int stringValueOf = 12345;
        String resStringValueOf = StringUtil.stringValueOf(stringValueOf);
        System.out.println(resStringValueOf);

        // 18. caesarСipher
        char c = 'w';
        System.out.println(StringUtil.caesarCipher(c));
        String caesarCipher = "Hello World! Aa Bb Cc Dd Ee Ff Gg Hh Ii Kk Ll Mm Nn Oo Pp Qq Rr Ss Tt Vv Ww Xx Yy Zz";
        String resCaesarCipher = StringUtil.caesarCipher(caesarCipher);
        System.out.println(resCaesarCipher);

        // 19. countWords
        String countWords = "Мама! мыла, 333 раны: в 33 домах.";
        int resCountWords = StringUtil.countWords(countWords);
        System.out.println(resCountWords);

        // 20. getLongestWord
        String getLongestWord = "qw qwe qwer qwert qwerty qwer qwe qw";
        String resGetLongestWord = StringUtil.getLongestWord(getLongestWord);
        System.out.println(resGetLongestWord);

        // 21. capitalizationWord
        String capitalizationWord = "пАрОвОз";
        String resCapitalizationWord = StringUtil.capitalizationWord(capitalizationWord);
        System.out.println(resCapitalizationWord);

        String capitalization = "тЕкСт в РаЗнЫх! РеГиСтРаХ, еСтЬ и цИфРы 1, 234.";
        String resCapitalization = StringUtil.capitalization(capitalization);
        System.out.println(resCapitalization);

        // 22. contains
        String contains1 = "DDD Bobr";
        String contains2 = "Bob";
        if (StringUtil.contains(contains1, contains2))
            System.out.println("Вторая строка входит в первую");
        else
            System.out.println("Вторая строка НЕ входит в первую");

        // 23. getSubstringIndexes
        String getSubstringIndexes1 = "мама мыла раму мыла";
        String getSubstringIndexes2 = "мыла";
        Integer[] resGetSubstringIndexes = StringUtil.getSubstringIndexes(getSubstringIndexes1, getSubstringIndexes2);
        System.out.println(Arrays.toString(resGetSubstringIndexes));

        // 24. replace
        String replace1 = "мама мыла раму";
        String replace2 = "мыла";
        String replace3 = "разбила";
        String resReplace = StringUtil.replace(replace1, replace2, replace3);
        System.out.println(resReplace);

        String resReplaseSB = StringUtil.replaceSB(replace1, replace2, replace3);
        System.out.println(resReplaseSB);

        // 25. pickUpPinCode
        String pickUpPinCode = "3698";

        String resPickUpPinCode1 = StringUtil.pickUpPinCodeVer2(pickUpPinCode);
        System.out.println(resPickUpPinCode1);

        String resPickUpPinCode2 = StringUtil.pickUpPinCode(pickUpPinCode);
        System.out.println(resPickUpPinCode2 + "\n");

        // 26. pickUpPassword
        String pickUpPassword = StringUtil.randomString(4, true, true);
        String resPickUpPassword = StringUtil.pickUpPassword(pickUpPassword);
        System.out.println(resPickUpPassword);
        String resPickUpPasswordVer2 = StringUtil.pickUpPasswordVer2(pickUpPassword);
        System.out.println(resPickUpPasswordVer2);




    }
}
