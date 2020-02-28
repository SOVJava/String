package program;

import java.util.ArrayList;

public class StringUtil {

    /**
     * toUpperCase/toLowerCase
     * Дана строка. Перевести строку в верхний/нижний регистр
     */

    public static String toUpperCase(String line) {
        String res = "";
        String[] buk = line.split("");
        for (int i = 0; i < buk.length; i++) {
            res += Character.toUpperCase(line.charAt(i));
        }
        return res;
    }

    public static String toLowerCase(String line) {
        String res = "";
        String[] buk = line.split("");
        for (int i = 0; i < buk.length; i++) {
            res += Character.toLowerCase(line.charAt(i));
        }
        return res;
    }

    /**
     * isDigit/isLetter/hasDigit/hasLetter
     * Дана строка. Проверить является ли она числом/словом/содержит хотя бы одно число/содержит хотя бы одно слово
     */
    public static boolean isDigit(String line) {
        for (int i = 0; i < line.length(); i++) {
            if (!Character.isDigit(line.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isLetter(String line) {
        for (int i = 0; i < line.length(); i++) {
            if (!Character.isLetter(line.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean hasDigit(String line) {
        for (int i = 0; i < line.length(); i++) {
            if (Character.isDigit(line.charAt(i)))
                return true;
        }
        return false;
    }

    public static boolean hasLetter(String line) {
        for (int i = 0; i < line.length(); i++) {
            if (Character.isLetter(line.charAt(i)))
                return true;
        }
        return false;
    }

    /**
     * hasUpperCase/hasLowerCase
     * Дана строка. Проверить содержит ли она только заглавные/строчные буквы
     */
    public static boolean hasUpperCase(String line) {
        for (int i = 0; i < line.length(); i++) {
            if (!Character.isUpperCase(line.charAt(i)))
                return false;
        }
        return true;
    }

    public static boolean hasLowerCase(String line) {
        for (int i = 0; i < line.length(); i++) {
            if (!Character.isLowerCase(line.charAt(i)))
                return false;
        }
        return true;
    }

    /**
     * equals
     * Даны две строки, сравнить их на равенство
     */
    public static boolean equals(String line1, String line2) {
        if (line1.length() != line2.length())
            return false;
        for (int i = 0; i < line1.length(); i++) {
            if (line1.charAt(i) != line2.charAt(i))
                return false;
        }
        return true;
    }

    /**
     * concat
     * Даны две строки, не содержащие пробелов. Выведите конкатенацию этих строк
     */
    public static String concat(String line1, String line2) {
        String res = "";
        for (int i = 0; i < line1.length(); i++) {
            res += line1.charAt(i);
        }
        for (int i = 0; i < line2.length(); i++) {
            res += line2.charAt(i);
        }
        return res;
    }

    /**
     * substring(String s, int i, int k)
     * Дана строка и параметры i, k. Получить подстроку, начиная с символа с индексом i и длиной k.
     * Если i<0, или i≥s.size() или k<0, то функция должна возвращать пустую строку.
     * Если i+k≥s.size(), то возвращается строка длиной s.size()−i, то есть до конца строки
     */
    public static String substring(String s, int i, int k) {
        String res = "";
        if (i < 0 || i >= s.length() || k < 0)
            return res;
        int size;
        if (i + k >= s.length())
            size = s.length();
        else
            size = i + k;
        for (int j = i; j < size; j++) {
            res += s.charAt(j);
        }
        return res;
    }

    /**
     * substring(String s, int i, int j)
     * Используя код предыдущей задачи, Получить подстроку, начиная с символа с индексом i по символ с индексом j
     */
    public static String substringV2(String s, int i, int j) {
        return substring(s, i, j - i);
    }

    /**
     * erase
     * Дана строка и параметры i, k. Напишите функцию, которая удаляет из данной строки подстроку начиная
     * с символа с индексом i и длиной k.
     * Если i<0, или i≥s.size() или k<0, то функция не модифицирует исходную строку.
     * Если i+k≥s.size(), то удаляются все символы начиная с i-го до конца строки.
     */
    public static String eraseV2(String line, int i, int k) {
        if (i < 0 || i >= line.length() || k < 0)
            return line;
        return substringV2(line, 0, i) + substringV2(line, i + k, line.length());
    }

    //посимвольно
    public static String erase(String line, int i, int k) {
        if (i < 0 || i >= line.length() || k < 0)
            return line;

        String res = "";
        for (int j = 0; j < i; j++) {
            res += line.charAt(j);
        }
        int size;
        if (i + k > line.length() - 1)
            return res;
        else
            size = i + k;
        for (int j = size; j < line.length(); j++) {
            res += line.charAt(j);
        }
        return res;
    }

    //через метод StringBuilder'a
    public static String eraseSB(String line, int i, int k) {
        if (i < 0 || i >= line.length() || k < 0)
            return line;
        return new StringBuffer(line).delete(i, i+k).toString();
    }

    /**
     * insert
     * Дана строка s, параметр i, другая строка t. Напишите функцию, которая вставляет
     * в данную строку s начиная с индекса i строку t.
     * Если i<0 или i>s.size(), функция не модифицирует исходную строку.
     */
    public static String insertV2(String s, int i, String t) {
        if (i < 0 || i > s.length())
            return s;
        return substringV2(s, 0, i) + substringV2(t, 0, t.length()) + substringV2(s, i, s.length());
    }

    // посимвольно
    public static String insert(String s, int i, String t) {
        if (i < 0 || i > s.length())
            return s;
        String res = "";
        for (int j = 0; j < i; j++) {
            res += s.charAt(j);
        }
        for (int j = 0; j < t.length(); j++) {
            res += t.charAt(j);
        }
        for (int j = i; j < s.length(); j++) {
            res += s.charAt(j);
        }
        return res;
    }

    // через метод StringBuilder'a
    public static String insertSB(String s, int i, String t) {
        if (i < 0 || i > s.length())
            return s;
        return new StringBuilder(s).insert(i, t).toString();
    }

    /**
     * compareTo
     * Даны две строки. Сравнить строки лексикографически
     */
    public static int compareTo(String s1, String s2) {
        int res = 0;
        int size = s1.length() <= s2.length() ? s1.length() : s2.length();
        for (int i = 0; i < size; i++) {
            if (s1.charAt(i) != s2.charAt(i))
                return (s1.charAt(i) - s2.charAt(i));
        }
        if (s1.length() > s2.length())
            return 1;
        if (s1.length() < s2.length())
            return -1;
        return res;
    }

    /**
     * randomString
     * Дано число n, и индикаторы f и k, написать метод, который сгенерирует случайную строку длиной n,
     * состоящую только из букв латинского алфавита и цифер, если индикатор f является истинным,
     * тогда в строке могут содержаться только буквы, если индикатор k инстинный - цифры
     */
    public static String randomString(int n, boolean f, boolean k) {
        if (n <= 0 || !f && !k)
            return null;
        String res = "";
        for (int i = 0; i < n; i++) {
            if (f && k)
                if ((int) (Math.random() * 2) == 0) {
                    res += randomChar();
                } else {
                    res += randomNum();
                }
            if (f && !k) {
                res += randomChar();
            }
            if (!f && k) {
                res += randomNum();
            }
        }
        return res;
    }

    private static char randomChar() {
        return (char) (97 + Math.random() * (122 - 97 + 1));
    }

    private static char randomNum() {
        return (char) (48 + Math.random() * (57 - 48 + 1));
    }

    /**
     * getStringDigit
     * Дана строка, возможно, содержащая пробелы. Извлеките из этой строки все символы,
     * являющиеся цифрами и составьте из них новую строку
     */
    public static String getStringDigit(String line) {
        String res = "";
        for (int i = 0; i < line.length(); i++) {
            if (Character.isDigit(line.charAt(i)))
                res += line.charAt(i);
        }
        return res;
    }

    /**
     * parseInt
     * Дана строка, содержащая любые символы и только одно числовое значение.
     * Используя код предыдущей задачи, преобразовать это числовое значение из строки в целое число,
     * не используя операторы if и цикла
     */
    public static int parseInt(String line) {
        return Integer.parseInt(getStringDigit(line));
    }

    /**
     * parseIntegers
     * Дана строка, содержащая любые символы. Извлечь в виде массива целых чисел все числа
     * Пример:    Входные данные: 125оyhgf12p8
     * Выходные данные: [125, 12, 8]
     */
    public static Integer[] parseIntegers(String line) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        String digital = "";
        boolean has = false;
        for (int i = 0; i < line.length(); i++) {
            if (Character.isDigit(line.charAt(i))) {
                digital += line.charAt(i);
                has = true;
            }
            if (has && !Character.isDigit(line.charAt(i)) || has && i == line.length() - 1) {
                res.add(Integer.parseInt(digital));
                has = false;
                digital = "";
            }
        }
        return res.toArray(new Integer[0]);
    }

    public static Integer[] parseIntegersOld(String line) {     //без булевского масива
        boolean[] boo = new boolean[line.length()];
        for (int i = 0; i < boo.length; i++) {
            if (Character.isDigit(line.charAt(i)))
                boo[i] = true;
        }
        ArrayList<Integer> result = new ArrayList<Integer>();
        String digit = "";
        int count = 0;
        for (int i = 0; i < boo.length; i++) {
            if (boo[i]) {
                count++;
                digit += line.charAt(i);
            }
            if (!boo[i] && count != 0 || i == line.length() - 1 && count != 0) {
                result.add(Integer.parseInt(digit));
                count = 0;
                digit = "";
            }
        }
        return result.toArray(new Integer[result.size()]);
    }

    /**
     * isPalindrome
     * Дано слово, состоящее только из заглавных и строчных латинских букв.
     * Проверьте, верно ли что это слово читается одинаково как справа налево, так и слева направо
     * (то есть является палиндромом), если считать заглавные и строчные буквы не различающимися
     */
    public static boolean isPalindrome(String line) {
        for (int i = 0, j = line.length() - 1; i < line.length() / 2; i++, j--) {
            if (Character.toLowerCase(line.charAt(i)) != Character.toLowerCase(line.charAt(j)))
                return false;
        }
        return true;
    }

    /**
     * evaluate
     * Дана строка, состоящая из цифер, между которыми стоят знак операции,
     * каждый из которых может быть либо +, либо -. Вычислите значение данного выражения
     */
    public static int evaluate(String line) {
        Integer[] arrDigital = parseIntegers(line);
        Character[] arrSimbol = charsSymbol(line);
        int res = arrDigital[0];
        for (int i = 1, j = 0; i < arrDigital.length; i++, j++) {
            if (arrSimbol[j] == '+')
                res += arrDigital[i];
            if (arrSimbol[j] == '-')
                res -= arrDigital[i];
        }
        return res;
    }

    private static Character[] charsSymbol(String line) {
        ArrayList<Character> simbol = new ArrayList<Character>();
        for (int i = 1, j = 0; i < line.length(); i++, j++) {
            if (line.charAt(i) == '+')
                simbol.add(line.charAt(i));
            if (line.charAt(i) == '-')
                simbol.add(line.charAt(i));
        }
        return simbol.toArray(new Character[0]);
    }

    /**
     * integerValueOf()
     * Дана строка, содержащая только символы-цифры. Преобразовать данную строку в целое число
     */
    public static Integer integerValueOf(String line) {
        int res = 0;
        for (int i = line.length() - 1, p = 1; i >= 0; i--, p *= 10) {
            res += Character.digit(line.charAt(i), 10) * p;
        }
        return res;
    }

    /**
     * stringValueOf()
     * Дано целое число, перевести его в строку
     */
    public static String stringValueOf(int x) {
        String res = "";
        while (x > 0) {
            int dig = x % 10;
            res += dig;
            x = x / 10;
        }
        /*String result = "";
        for (int i = res.length() - 1; i >= 0; i--) {
            result += res.charAt(i);
        }*/
        return new StringBuilder(res).reverse().toString();
    }

    /**
     * caesarСipher
     * В шифре Цезаря каждый символ заменяется на другой символ, третий по счету в алфавите после данного,
     * с цикличность. То есть символ A заменяется на D, символ B - на E, символ C - на F, ..., символ Z на C.
     * Аналогично строчные буквы заменяются на строчные буквы. Все остальные символы не меняются
     */
    public static char caesarCipher(char c) {
        if (!Character.isLetter(c))
            return c;
        c += 3;
        if (!Character.isLetter(c))
            c -= 26;
        return c;

        /*if (!Character.isLetter(c))
            return c;
        boolean has = false;
        if (Character.isUpperCase(c)){
            c = Character.toLowerCase(c);
            has = true;
        }
        char res = (char) (c+3);
        int buf = 0;
        if (res > 122) {
            buf = (int) res - 122;
            res = (char) (96 + buf);
        }
        if (has)
            res = Character.toUpperCase(res);
        return res;*/
    }

    public static String caesarCipher(String line) {
        String res = "";
        for (int i = 0; i < line.length(); i++) {
            res += caesarCipher(line.charAt(i));
        }
        return res;
    }

    /**
     * countWords
     * Дана строка, возможно, содержащая пробелы. Определите количество слов в этой строке.
     * Слово - это несколько подряд идущих букв (как заглавных, так и строчных)
     */
    public static String cleanWord(String line) {
        return line.replace(".", "").replace(",", "")
                .replace("!", "").replace("?", "")
                .replace(":", "");
    }

    public static int countWords(String line){
        String[] res = line.split(" ");
        int count = 0;
        for (int i = 0; i < res.length; i++) {
            if (isLetter(cleanWord(res[i])))
                count++;
        }
        return count;
    }

    /*public static int countWords(String line) {
        int res = 0;
        int buf = 0;
        for (int i = 0; i < line.length(); i++) {
            if (Character.isLetter(line.charAt(i))) {
                buf++;
            }
            if (Character.isWhitespace(line.charAt(i)) || i == line.length() - 1) {
                if (buf >= 2)
                    res++;
                buf = 0;
            }
        }
        return res;
    }*/

    /**
     * getLongestWord
     * Дана строка. Найдите в этой строке самое длинное слово и выведите его.
     * Если в строке несколько слов одинаковой максимальной длины, выведите первое из них
     */
    public static String getLongestWord(String line) {
        /*if (line == null)
            return null;*/
        String[] res = line.split(" ");
        int length = res[0].length();
        int index = 0;
        for (int i = 0; i < res.length; i++) {
            if (res[i].length() > length) {
                length = res[i].length();
                index = i;
            }
        }
        return res[index];
    }

    /**
     * capitalization
     * Дана строка. Измените регистр символов в этой строке так,
     * чтобы первая буква каждого слова была заглавной, а остальные буквы - строчными
     */
    public static String capitalizationWord(String line) {
        String res = "";
        for (int i = 0; i < line.length(); i++) {
            if (Character.isLetter(line.charAt(i))) {
                if (i == 0)
                    res += Character.toUpperCase(line.charAt(i));
                else
                    res += Character.toLowerCase(line.charAt(i));
            } else
                res += line.charAt(i);
        }
        return res;
    }

    public static String capitalization(String line) {
        String res = "";
        boolean has = false;
        String[] words = line.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (has)
                res += " ";
            res += capitalizationWord(words[i]);
            has = true;
        }
        return res;
    }

    /**
     * contains
     * Даны две строки, возможно, содержащие пробелы. Определить содержит ли первая строка в себе вторую строку
     */
    public static boolean contains(String line1, String line2) {
        if (line2.length() == 0)
            return false;
        int count = line2.length();
        for (int i = 0, j = 0; i < line1.length(); i++, j++) {
            if (line1.charAt(i) == line2.charAt(j)) {
                count--;
                if (count == 0)
                    return true;
            }
            if (line1.charAt(i) != line2.charAt(j)) {
                count = line2.length();
                j = -1;
            }
        }
        return false;
    }

    /**
     * getSubstringIndexes
     * Даны две строки, возможно, содержащие пробелы. В виде массива чисел выделить
     * все индексы вхождений подстроки в строку.
     * <p>
     * Для накопления индексов использовать ArrayList
     */
    public static Integer[] getSubstringIndexes(String line1, String line2) {
        if (!contains(line1, line2))
            return null;
        ArrayList<Integer> res = new ArrayList<Integer>();
        for (int i = 0, j = 0; i < line1.length(); i++, j++) {
            if (line1.charAt(i) == line2.charAt(j)) {
                res.add(i);
                if (line2.length() == res.size()){
                    return res.toArray(new Integer[0]);
                }
            }
            if (line1.charAt(i) != line2.charAt(j)) {
                res.clear();
                j = -1;
            }
        }
        return null;
    }

    /*public static Integer[] getSubstringIndexesAll(String line1, String line2) {
        if (!contains(line1, line2))
            return null;
        ArrayList<Integer> result = new ArrayList<Integer>();
        ArrayList<Integer> res = new ArrayList<Integer>();
        for (int i = 0, j = 0; i < line1.length(); i++, j++) {
            if (line1.charAt(i) == line2.charAt(j)) {
                res.add(i);
                if (line2.length() == res.size()){
                    result.addAll(res);
                    res.clear();
                    j = -1;
                    continue;
                }
            }
            if (line1.charAt(i) != line2.charAt(j)) {
                res.clear();
                j = -1;
            }
        }
        return result.toArray(new Integer[0]);
    }*/

    /**
     * replace
     * Дана строка s, и две других строки t, u. Напишите функцию, которая заменяет
     * в данной строке s подстроку t на строку u.
     */
    //посимвольно
    public static String replace(String line, String lineDel, String linePull){
        if (!contains(line, lineDel))
            return line;
        String res = "";
        Integer[] v = getSubstringIndexes(line, lineDel);
        for (int i = 0; i < line.length(); i++) {
            if (i == v[0]){
                for (int j = 0; j < linePull.length(); j++) {
                    res += linePull.charAt(j);
                }
                i += (v.length-1);
            }
            else{
                res += line.charAt(i);
            }
        }
        return res;
    }

    //через метод StringBuilder'a
    public static String replaceSB(String line, String lineDel, String linePull) {
        if (!contains(line, lineDel))
            return line;
        Integer[] v = getSubstringIndexes(line, lineDel);
        return new StringBuilder(line).delete(v[0], v[v.length-1]+1).insert(v[0], linePull).toString();
    }

    /**
     * pickUpPinCode
     * Дана строка s, содержащая четырехзначный пин-код, состоящий только из цифер от 0 до 9.
     * Напишите метод, который подбирает данный пароль и при успехе возвращает его же.
     * Указание:
     * - Необходимо замерить время работы программы как разницу вызовов метода System.currentTimeMillis()
     * - Протестировать данный метод на случайно сгенерированной строке методом из задачи 10.1,
     * применив индикатор k как истинный
     */
    public static String pickUpPinCode (String line){
        long start = System.currentTimeMillis();
        String res = "";
        boolean has = true;
        int count = 0;
        while (has) {
            res = randomString(4, false, true);
            count++;
            if (equals(line, res)) {
                has = false;
            }
        }
        System.out.println("Милисекунд: " + ((System.currentTimeMillis() - start)) +  ", попыток: " + count);
        return res;
    }

    public static String pickUpPinCodeVer2 (String line){
        long start = System.currentTimeMillis();
        String res = "";
        boolean has = true;
        boolean has2 = true;
        int count = 0;
        int digit = 0;
        while (has){
            res = String.valueOf(digit);
            if (equals(line, res)) {
                has = false;
                has2 = false;
            }
            if (has2) {
                res = "";
                digit++;
                count++;
            }
        }
        System.out.println("Милисекунд: " + ((System.currentTimeMillis() - start)) +  ", попыток: " + count);
        return res;
    }

    /**
     * pickUpPassword
     * Задача аналогична предыдущей, за исключением того, что пароль может состоять не только из цифер,
     * но и из букв латинского алфавита
     */
    public static String pickUpPassword (String line){
        long start = System.currentTimeMillis();
        String res = "";
        boolean has = true;
        int count = 0;
        while (has) {
            res = randomString(4, true, true);
            count++;
            if (equals(line, res)) {
                has = false;
            }
        }
        System.out.println("Милисекунд: " + ((System.currentTimeMillis() - start)) +  ", попыток: " + count);
        return res;
    }

    public static String pickUpPasswordVer2 (String line){
        long start = System.currentTimeMillis();
        int count = 0;
        String[] symbol = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "k", "l", "m", "n", "o",
                "p", "q", "r", "s", "t", "v", "w", "x", "y", "z", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String[] passwors = new String[4];
        for (int i = 0; i < symbol.length; i++) {
            passwors[0] = symbol[i];
            for (int j = 0; j < symbol.length; j++) {
                passwors[1] = symbol[j];
                for (int k = 0; k < symbol.length; k++) {
                    passwors[2] = symbol[k];
                    for (int l = 0; l < symbol.length; l++) {
                        passwors[3] = symbol[l];
                        String res = passwors[0].concat(passwors[1]).concat(passwors[2]).concat(passwors[3]);
                        count++;
                        if (res.equals(line)) {
                            System.out.println("Милисекунд: " + ((System.currentTimeMillis() - start)) +  ", попыток: " + count);
                            return res;
                        }
                    }
                }
            }
        }
        return null;
    }


}


