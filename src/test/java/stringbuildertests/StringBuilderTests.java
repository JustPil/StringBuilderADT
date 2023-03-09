package stringbuildertests;

import org.junit.jupiter.api.Assertions;
import org.junit.Test;
import stringbuilders.StringBuilder;

public class StringBuilderTests {
    private final StringBuilder sb = new StringBuilder();

    @Test
    public void addInitialString() {
        sb.append("AAAAA");
        var result = sb.substring(0, 4);
        Assertions.assertEquals("AAAAA", result);
    }

    @Test
    public void addMultipleStrings() {
        sb.append("AAAAA");
        sb.append("BBBBB");
        var result = sb.substring(0, 9);
        Assertions.assertEquals("AAAAABBBBB", result);
    }

    @Test
    public void addInitialCharacter() {
        sb.append('A');
        var result = sb.substring(0, 0);
        Assertions.assertEquals("A", result);
    }

    @Test
    public void addMultipleCharacters() {
        sb.append('A');
        sb.append('B');
        var result = sb.substring(0, 1);
        Assertions.assertEquals("AB", result);
    }

    @Test
    public void addInitialInteger() {
        sb.append(0);
        var result = sb.substring(0, 0);
        Assertions.assertEquals("0", result);
    }

    @Test
    public void addMultipleIntegers() {
        sb.append(0);
        sb.append(1);
        var result = sb.substring(0, 1);
        Assertions.assertEquals("01", result);
    }

    @Test
    public void addNegativeInteger() {
        sb.append(-1);
        var result = sb.substring(0, 1);
        Assertions.assertEquals("-1", result);
    }

    @Test
    public void addMultipleNegativeIntegers() {
        sb.append(-1);
        sb.append(-2);
        var result = sb.substring(0, 3);
        Assertions.assertEquals("-1-2", result);
    }

    @Test
    public void addInitialBoolean() {
        sb.append(true);
        var result = sb.substring(0, 3);
        Assertions.assertEquals("true", result);
    }

    @Test
    public void addMultipleBooleans() {
        sb.append(true);
        sb.append(false);
        var result = sb.substring(0, 8);
        Assertions.assertEquals("truefalse", result);
    }

    @Test
    public void appendInitialDouble() {
        sb.append(0.0);
        var result = sb.substring(0, 2);
        Assertions.assertEquals("0.0", result);
    }

    @Test
    public void appendMultipleDoubles() {
        sb.append(0.0);
        sb.append(1.1);
        var result = sb.substring(0, 5);
        Assertions.assertEquals("0.01.1", result);
    }

    @Test
    public void appendNegativeDouble() {
        sb.append(-0.0);
        var result = sb.substring(0, 3);
        Assertions.assertEquals("-0.0", result);
    }

    @Test
    public void appendMultipleNegativeDoubles() {
        sb.append(-0.0);
        sb.append(-1.1);
        var result = sb.substring(0, 7);
        Assertions.assertEquals("-0.0-1.1", result);
    }

    @Test
    public void appendInitialFloat() {
        sb.append(5.75f);
        var result = sb.substring(0, 3);
        Assertions.assertEquals("5.75", result);
    }

    @Test
    public void appendMultipleFloats() {
        sb.append(5.75f);
        sb.append(1.23f);
        var result = sb.substring(0, 7);
        Assertions.assertEquals("5.751.23", result);
    }

    @Test
    public void appendNegativeFloat() {
        sb.append(-5.75f);
        var result = sb.substring(0, 4);
        Assertions.assertEquals("-5.75", result);
    }

    @Test
    public void appendMultipleNegativeFloats() {
        sb.append(-5.75f);
        sb.append(-1.23f);
        var result = sb.substring(0, 9);
        Assertions.assertEquals("-5.75-1.23", result);
    }

    @Test
    public void appendInitialLong() {
        sb.append(1000000000L);
        var result = sb.substring(0, 9);
        Assertions.assertEquals("1000000000", result);
    }

    @Test
    public void appendMultipleLongs() {
        sb.append(1000000000L);
        sb.append(9999999999L);
        var result = sb.substring(0, 19);
        Assertions.assertEquals("10000000009999999999", result);
    }

    @Test
    public void appendNegativeLong() {
        sb.append(-1000000000L);
        var result = sb.substring(0, 10);
        Assertions.assertEquals("-1000000000", result);
    }

    @Test
    public void appendMultipleNegativeLongs() {
        sb.append(-1000000000L);
        sb.append(-9999999999L);
        var result = sb.substring(0, 21);
        Assertions.assertEquals("-1000000000-9999999999", result);
    }

    @Test
    public void appendInitialShort() {
        short num = 5000;
        sb.append(num);
        var result = sb.substring(0, 3);
        Assertions.assertEquals("5000", result);
    }

    @Test
    public void appendMultipleShorts() {
        short num = 5000;
        sb.append(num);
        sb.append(num);
        var result = sb.substring(0, 7);
        Assertions.assertEquals("50005000", result);
    }

    @Test
    public void appendNegativeShort() {
        short num = -5000;
        sb.append(num);
        var result = sb.substring(0, 4);
        Assertions.assertEquals("-5000", result);
    }

    @Test
    public void appendMultipleNegativeShorts() {
        short num = -5000;
        sb.append(num);
        sb.append(num);
        var result = sb.substring(0, 9);
        Assertions.assertEquals("-5000-5000", result);
    }

    @Test
    public void appendInitialByte() {
        byte num = 100;
        sb.append(num);
        var result = sb.substring(0, 2);
        Assertions.assertEquals("100", result);
    }

    @Test
    public void appendMultipleBytes() {
        byte num = 100;
        sb.append(num);
        sb.append(num);
        var result = sb.substring(0, 5);
        Assertions.assertEquals("100100", result);
    }

    @Test
    public void appendNegativeByte() {
        byte num = -100;
        sb.append(num);
        var result = sb.substring(0, 3);
        Assertions.assertEquals("-100", result);
    }

    @Test
    public void appendMultipleNegativeBytes() {
        byte num = -100;
        sb.append(num);
        sb.append(num);
        var result = sb.substring(0, 7);
        Assertions.assertEquals("-100-100", result);
    }

    @Test
    public void appendInitialStringBuilder() {
        sb.append("AAAAA");
        sb.append(sb);
        var result = sb.substring(0, 9);
        Assertions.assertEquals("AAAAAAAAAA", result);
    }

    @Test
    public void getInitialCapacity() {
        var result = sb.capacity();
        Assertions.assertEquals(10, result);
    }

    @Test
    public void getCapacityAfterFirstResize() {
        sb.append("AAAAAAAAAA");
        var result = sb.capacity();
        Assertions.assertEquals(20, result);
    }

    @Test
    public void getFirstChar() {
        sb.append("ABC");
        var result = sb.charAt(0);
        Assertions.assertEquals('A', result);
    }

    @Test
    public void getMiddleChar() {
        sb.append("ABC");
        var result = sb.charAt(1);
        Assertions.assertEquals('B', result);
    }

    @Test
    public void getLastChar() {
        sb.append("ABC");
        var result = sb.charAt(2);
        Assertions.assertEquals('C', result);
    }

    @Test
    public void getCharAfterDeletion() {
        sb.append("ABCD");
        sb.deleteCharAt(1);
        var result = sb.charAt(1);
        Assertions.assertEquals('C', result);
    }

    @Test
    public void deleteSubstringResultingInEmptyStringBuilder() {
        sb.append("ABC");
        sb.deleteSubstring(0, 2);
        var result = sb.length();
        Assertions.assertEquals(0, result);
    }

    @Test
    public void deleteSubstringOfOneCharResultingInNonEmptyStringBuilder() {
        sb.append("ABC");
        sb.deleteSubstring(0, 0);
        var result = sb.substring(0, 1);
        Assertions.assertEquals("BC", result);
    }

    @Test
    public void deleteSubstringOfMultipleCharsResultingInNonEmptyStringBuilder() {
        sb.append("ABC");
        sb.deleteSubstring(0, 1);
        var result = sb.substring(0, 0);
        Assertions.assertEquals("C", result);
    }

    @Test
    public void deleteInvalidSubstring() {
        var result = sb.deleteSubstring(-1, 0);
        Assertions.assertFalse(result);
    }

    @Test
    public void deleteFirstChar() {
        sb.append("ABC");
        sb.deleteCharAt(0);
        var result = sb.charAt(0);
        Assertions.assertEquals('B', result);
    }

    @Test
    public void deleteMiddleChar() {
        sb.append("ABC");
        sb.deleteCharAt(1);
        var result = sb.charAt(1);
        Assertions.assertEquals('C', result);
    }

    @Test
    public void deleteLastChar() {
        sb.append("ABC");
        sb.deleteCharAt(2);
        var result = sb.charAt(2);
        Assertions.assertEquals('\u0000', result);
    }

    @Test
    public void deleteInvalidChar() {
        var result = sb.deleteCharAt(-1);
        Assertions.assertFalse(result);
    }

    @Test
    public void insertStringAtFront() {
        sb.append("ABC");
        sb.insert(0, "XYZ");
        var result = sb.substring(0, 5);
        Assertions.assertEquals("XYZABC", result);
    }

    @Test
    public void insertStringInMiddle() {
        sb.append("ABC");
        sb.insert(1, "XYZ");
        var result = sb.substring(0, 5);
        Assertions.assertEquals("AXYZBC", result);
    }

    @Test
    public void insertStringAtEnd() {
        sb.append("ABC");
        sb.insert(3, "XYZ");
        var result = sb.substring(0, 5);
        Assertions.assertEquals("ABCXYZ", result);
    }

    @Test
    public void insertStringAtInvalidIndex() {
        var result = sb.insert(-1, "AAA");
        Assertions.assertFalse(result);
    }

    @Test
    public void getLengthAfterMultipleAdditions() {
        sb.append(1);
        sb.append('a');
        sb.append("bbb");
        sb.append(1L);
        sb.append(2.2f);
        sb.append(3.3);
        sb.append(true);
        sb.append(sb);
        var result = sb.length();
        Assertions.assertEquals(32, result);
    }

    @Test
    public void getLengthAfterDeletingOneCharacter() {
        sb.append("ABC");
        sb.deleteCharAt(1);
        var result = sb.length();
        Assertions.assertEquals(2, result);
    }

    @Test
    public void getLengthAfterDeletingSubstring() {
        sb.append("ABC");
        sb.deleteSubstring(1, 2);
        var result = sb.length();
        Assertions.assertEquals(1, result);
    }

    @Test
    public void getLengthAfterInsertion() {
        sb.append("ABC");
        sb.insert(0, "XYZ");
        var result = sb.length();
        Assertions.assertEquals(6, result);
    }

    @Test
    public void replaceFirstCharacter() {
        sb.append("ABC");
        sb.replace(0, 'Z');
        var result = sb.charAt(0);
        Assertions.assertEquals('Z', result);
    }

    @Test
    public void replaceMiddleCharacter() {
        sb.append("ABC");
        sb.replace(1, 'Z');
        var result = sb.charAt(1);
        Assertions.assertEquals('Z', result);
    }

    @Test
    public void replaceLastCharacter() {
        sb.append("ABC");
        sb.replace(2, 'Z');
        var result = sb.charAt(2);
        Assertions.assertEquals('Z', result);
    }

    @Test
    public void replaceCharacterAtInvalidIndex() {
        var result = sb.replace(-1, 'Z');
        Assertions.assertFalse(result);
    }

    @Test
    public void findIndexOfCharAtFirst() {
        sb.append("ABC");
        var result = sb.indexOf('A');
        Assertions.assertEquals(0, result);
    }

    @Test
    public void findIndexOfCharAtMiddle() {
        sb.append("ABC");
        var result = sb.indexOf('B');
        Assertions.assertEquals(1, result);
    }

    @Test
    public void findIndexOfCharAtEnd() {
        sb.append("ABC");
        var result = sb.indexOf('C');
        Assertions.assertEquals(2, result);
    }

    @Test
    public void findIndexOfInvalidElement() {
        var result = sb.indexOf('Z');
        Assertions.assertEquals(-1, result);
    }

    @Test
    public void findLastIndex() {
        sb.append("AAA");
        var result = sb.lastIndexOf('A');
        Assertions.assertEquals(2, result);
    }

    @Test
    public void findLastIndexOfInvalidElement() {
        var result = sb.lastIndexOf('Z');
        Assertions.assertEquals(-1, result);
    }

    @Test
    public void reverseStringBuilder() {
        sb.append("ABC");
        sb.reverse();
        var result = sb.substring(0, 2);
        Assertions.assertEquals("CBA", result);
    }

    @Test
    public void setLargerCapacity() {
        sb.setCapacity(25);
        var result = sb.capacity();
        Assertions.assertEquals(25, result);
    }

    @Test
    public void setSmallerCapacity() {
        sb.setCapacity(5);
        var result = sb.capacity();
        Assertions.assertEquals(5, result);
    }

    @Test
    public void setInvalidCapacity() {
        sb.append("ABC");
        var result = sb.setCapacity(1);
        Assertions.assertFalse(result);
    }

    @Test
    public void getEntireString() {
        sb.append("ABC");
        var result = sb.toString();
        Assertions.assertEquals("ABC", result);
    }
}
