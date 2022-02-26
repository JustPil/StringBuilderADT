package SB;

public class StringBuilder implements StringBuilderInterface {
    private char[] array;
    private int capacity;
    private final int DEFAULT_CAP = 10;
    private int numElements = 0;
    private final double LOAD_THRESHOLD = .75;
    private final int ELEMENT_NOT_FOUND = -1;

    /**
     * Constructor initializes the StringBuilder's internal array to the default capacity of 10.
     */
    public StringBuilder() {
        array = new char[capacity = DEFAULT_CAP];
    }

    /**
     * Overloaded constructor initializes the StringBuilder's internal array to a capacity specified by the user.
     * @param cap The user-specified capacity.
     */
    public StringBuilder(int cap) {
        array = new char[capacity = cap >= 0 ? cap : DEFAULT_CAP];
    }

    /**
     * Overloaded constructor initializes the StringBuilder's internal array to a capacity of twice the length of the
     * input String, then inserts the characters of the input String into the StringBuilder.
     * @param s The String value to add.
     */
    public StringBuilder(String s) {
        array = new char[capacity = s.length() * 2];
        for(int i = 0; i < s.length(); i++) {
            array[numElements++] = s.charAt(i);
        }
    }

    /**
     * append Adds a character to the StringBuilder.
     * @param c The character value to add.
     */
    public void append(char c) {
        if((double)(numElements + 1 / capacity) >= LOAD_THRESHOLD) {
            resize();
        array[numElements++] = c;
        }
    }

    /**
     * append Overloaded append method adds an integer to the StringBuilder. The integer may be negative or positive,
     * one or many digits.
     * @param i The integer value to add.
     */
    public void append(int i) {
        String intStr = Integer.toString(i);
        if(((double)((numElements + intStr.length()) / capacity) >= LOAD_THRESHOLD)) {
            resize();
        }
        for(int j = 0; j < intStr.length(); j++) {
            array[numElements++] = intStr.charAt(j);
        }
    }

    /**
     * append Overloaded append method adds a boolean value to the StringBuilder.
     * @param b The boolean value to add.
     */
    public void append(boolean b) {
        String boolStr = Boolean.toString(b);
        if((double)(numElements + boolStr.length() / capacity) >= LOAD_THRESHOLD) {
            resize();
        }
        for(int i = 0; i < boolStr.length(); i++) {
            array[numElements++] = boolStr.charAt(i);
        }
    }

    /**
     * append Overloaded append method adds a double to the StringBuilder. The double may be negative or positive.
     * @param d The double value to add.
     */
    public void append(double d) {
        String doubleStr = Double.toString(d);
        if(((double)((numElements + doubleStr.length()) / capacity) >= LOAD_THRESHOLD)) {
            resize();
        }
        for(int i = 0; i < doubleStr.length(); i++) {
            array[numElements++] = doubleStr.charAt(i);
        }
    }

    /**
     * append Overloaded append method adds a float to the StringBuilder. The float may be negative or positive.
     * @param f The fload value to add.
     */
    public void append(float f) {
        String floatStr = Float.toString(f);
        if(((double)((numElements + floatStr.length()) / capacity) >= LOAD_THRESHOLD)) {
            resize();
        }
        for(int i = 0; i < floatStr.length(); i++) {
            array[numElements++] = floatStr.charAt(i);
        }
    }

    /**
     * append Overloaded append method adds a long to the StringBuilder. The long may be negative or positive, one or
     * many digits.
     * @param l The long value to add.
     */
    public void append(long l) {
        String longStr = Long.toString(l);
        if(((double)((numElements + longStr.length()) / capacity) >= LOAD_THRESHOLD)) {
            resize();
        }
        for(int i = 0; i < longStr.length(); i++) {
            array[numElements++] = longStr.charAt(i);
        }
    }

    /**
     * append Overloaded append method adds a byte to the StringBuilder.
     * @param b The byte value to add.
     */
    public void append(byte b) {
        String byteStr = Byte.toString(b);
        if(((double)((numElements + byteStr.length()) / capacity) >= LOAD_THRESHOLD)) {
            resize();
        }
        for(int i = 0; i < byteStr.length(); i++) {
            array[numElements++] = byteStr.charAt(i);
        }
    }

    /**
     * append Overloaded append method adds a String to the StringBuilder.
     * @param s The String value to add.
     */
    public void append(String s) {
        if(((double)((numElements + s.length()) / capacity) >= LOAD_THRESHOLD)) {
            resize();
        }
        for(int i = 0; i < s.length(); i++) {
            array[numElements++] = s.charAt(i);
        }
    }

    /**
     * append Overloaded append method adds a parameter StringBuilder to the current StringBuilder.
     * @param sb The StringBuilder to add.
     */
    public void append(StringBuilder sb) {
        if(((double)((numElements + sb.length()) / capacity) >= LOAD_THRESHOLD)) {
            resize();
        }
        String sbString = sb.toString();
        for(int i = 0; i < sb.length(); i++) {
            array[numElements++] = sbString.charAt(i);
        }
    }

    /**
     * capacity The capacity of the StringBuilder.
     * @return The capacity of the StringBuilder.
     */
    public int capacity() {
        return capacity;
    }

    /**
     * charAt Retrieves a character at a specified index, if valid. If the index is not valid, an exception is thrown.
     * @param i The index to check.
     * @return The character at the index.
     */
    public char charAt(int i) {
        if(i < 0 || i >= array.length) {
            throw new IndexOutOfBoundsException("The specified index is beyond the bounds of the array");
        }
        return array[i];
    }

    /**
     * deleteSubstring Deletes a substring between start and end parameters, inclusive.
     * @param start The start of the substring.
     * @param end The end of the substring.
     * @return True if the substring can be deleted, false otherwise.
     */
    public boolean deleteSubstring(int start, int end) {
        if(start == end) {
            deleteCharAt(start);
            return true;
        }
        if(start >= 0 && start < end && end < array.length) {
            int length = end - start + 1;
            numElements -= length;
            for(int i = start; i <= end; i++) {
                array[i] = '\u0000';
            }
            shift(start, length);
            return true;
        }
        return false;
    }

    /**
     * shift Shifts the characters left, beginning at the specified index where a character was removed.
     * @param index The index to begin shifting.
     */
    private void shift(int index) {
        for(int i = index; i < array.length - 2; i++) {
            if(array[i] == '\u0000' && i != index) {
                break;
            }
            array[i] = array[i + 1];
        }
    }

    /**
     * shift Overloaded shift method shifts the characters left, beginning at the specified index and replacing with the
     * incrementing index added to a predetermined length integer variable.
     * @param index The index to begin shifting.
     * @param len The length to be used in the replacement shifts.
     */
    private void shift(int index, int len) {
        for(int i = index; i < numElements; i++) {
            array[i] = array[i + len];
        }
        for(int i = numElements; i < numElements + len; i++) {
            array[i] = '\u0000';
        }
    }

    /**
     * deleteCharAt Deletes a character at a specified index if valid, then calls the shift method.
     * @param i The index to vacate.
     * @return True if the character at the specified index was deleted, false otherwise.
     */
    public boolean deleteCharAt(int i) {
        if(i >= 0 && i < array.length) {
            array[i] = '\u0000';
            numElements--;
            shift(i);
            return true;
        }
        return false;
    }

    /**
     * insert Inserts a String into an index starting at position, shifting any characters at or after that position to
     * the right.
     * @param position The index for String insertion.
     * @param s The String to insert.
     * @return True if the insertion was successful, false otherwise.
     */
    public boolean insert(int position, String s) {
        if(position > numElements) {
            return false;
        }
        if(((double)((numElements + s.length()) / capacity) >= LOAD_THRESHOLD)) {
            resize();
        }
        if(position == numElements) {
            for(int i = 0; i < s.length(); i++) {
                array[numElements++] = s.charAt(i);
            }
            return true;
        } else {
            for(int i = numElements - 1; i >= position; i--) {
                array[s.length() + i] = array[i];
            }
            int index = 0;
            for(int i = position; i < s.length() + position; i++) {
                array[i] = s.charAt(index++);
            }
            numElements += s.length();
            return true;
        }
    }

    /**
     * length Returns the total number of characters contained in the StringBuilder.
     * @return The total number of characters contained in the StringBuilder.
     */
    public int length() {
        return numElements;
    }

    /**
     * replace Replaces a character at the index of position.
     * @param position The index for replacement.
     * @param c The new character for replacement.
     * @return True if the repacement was successful, false otherwise.
     */
    public boolean replace(int position, char c) {
        if(position < 0 || position >= numElements) {
            return false;
        }
        array[position] = c;
        return true;
    }

    /**
     * indexOf Returns the index of the first occurrence of a specified character.
     * @param c The specified character.
     * @return The first index of the character if found, -1 if not found.
     */
    public int indexOf(char c) {
        for(int i = 0; i < numElements; i++) {
            if(array[i] == c) {
                return i;
            }
        }
        return ELEMENT_NOT_FOUND;
    }

    /**
     * lastIndexOf Returns the index of the last occurrence of a specified character.
     * @param c The specified character.
     * @return The last index of the character if found, -1 if not found.
     */
    public int lastIndexOf(char c) {
        for(int i = numElements; i >= 0; i--) {
            if(array[i] == c) {
                return i;
            }
        }
        return ELEMENT_NOT_FOUND;
    }

    /**
     * reverse Reverses the contents of the StringBuilder.
     */
    public void reverse() {
        int start = 0, end = numElements - 1;
        while(start <= end) {
            char temp = array[end];
            array[end--] = array[start];
            array[start++] = temp;
        }
    }

    /**
     * setLength Sets a new capacity for the StringBuilder by calling a resize method.
     * @param cap The new capacity.
     * @return True if the capacity was successfully set, false otherwise.
     */
    public boolean setCapacity(int cap) {
        if(numElements > cap) {
            return false;
        }
        resize(cap);
        return true;
    }

    /**
     * substring Returns a String containing a substring of characters from indices marked by a desired start and end.
     * @param start The start index of a substring.
     * @param end The end index of a substring.
     * @return The String representation of the desired substring, or null if no substring is possible.
     */
    public String substring(int start, int end) {
        if(start < 0 || end >= numElements) {
            return null;
        }
        char[] subArray = new char[end - start + 1];
        if(start == end) {
            subArray[0] = array[start];
            return new String(subArray);
        }
        while(start <= end) {
            if(array[start] == '\u0000') {
                return null;
            }
            subArray[start] = array[start++];
        }
        return new String(subArray);
    }

    /**
     * toString Returns a String of the characters contained in the StringBuilder.
     * @return A String of the characters contained in the StringBuilder.
     */
    public String toString() {
        char[] contents = new char[numElements];
        for(int i = 0; i < numElements; i++) {
            if(array[i] == '\u0000') {
                break;
            }
            contents[i] = array[i];
        }
        return new String(contents);
    }

    /**
     * resize Resizes the StringBuilder's internal array to doubled capacity.
     */
    private void resize() {
        char[] resizedArray = new char[capacity *= 2];
        for(int i = 0; i < array.length; i++) {
            if(array[i] == '\u0000') {
                break;
            }
            resizedArray[i] = array[i];
        }
        array = resizedArray;
    }

    /**
     * resize Overloaded resize method, resizes the StringBuilder's internal array to a specified capacity.
     * @param cap The new capacity for the StringBuilder.
     */
    private void resize(int cap) {
        char[] resizedArray = new char[capacity = cap];
        for(int i = 0; i < array.length; i++) {
            if(array[i] == '\u0000') {
                break;
            }
            resizedArray[i] = array[i];
        }
        array = resizedArray;
    }
}
