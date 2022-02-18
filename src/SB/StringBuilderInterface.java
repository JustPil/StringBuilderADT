package SB;

public interface StringBuilderInterface {
    void append(char c);
    void append(int i);
    void append(boolean b);
    void append(double d);
    void append(float f);
    void append(long l);
    void append(byte b);
    void append(String s);
    void append(StringBuilder sb);
    int capacity();
    char charAt(int i);
    boolean deleteSubstring(int start, int end);
    boolean deleteCharAt(int i);
    boolean insert(int position, String s);
    int length();
    boolean replace(int position, char c);
    int indexOf(char c);
    int lastIndexOf(char c);
    void reverse();
    boolean setCapacity(int cap);
    String substring(int start, int end);
    String toString();
}