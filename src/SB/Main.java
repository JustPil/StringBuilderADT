package SB;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner scn = new Scanner(System.in);
        testDriver(scn, sb);
        scn.close();
    }

    /**
     * menu A menu of choices for interacting with a StringBuilder ADT.
     */
    public static void menu() {
        System.out.println("Methods for StringBuilder ADT\n1 - APPEND CHARACTER - Appends a character to the " +
                "StringBuilder\n2 - APPEND INTEGER - Appends an integer to the StringBuilder\n3 - APPEND BOOLEAN - " +
                "Appends a boolean to the StringBuilder\n4 - APPEND DOUBLE - Appends a double to the StringBuilder\n" +
                "5 - APPEND FLOAT - Appends a float to the StringBuilder\n6 - APPEND LONG - Appends a long to the " +
                "StringBuilder\n7 - APPEND BYTE - Appends a byte to the StringBuilder\n8 - APPEND STRING - Appends " +
                "a String to the StringBuilder\n9 - APPEND STRINGBUILDER - Appends a StringBuilder to the " +
                "StringBuilder\n10 - CAPACITY - Returns the capacity of the StringBuilder\n11 - CHAR AT - Returns the" +
                " character at a specified index\n12 - DELETE SUBSTRING - Deletes a substring from the StringBuilder" +
                "\n13 - DELETE CHAR AT - Deletes a character at a specified index\n14 - INSERT - Inserts a String " +
                "into the StringBuilder\n15 - LENGTH - Returns the number of elements in the StringBuilder\n16 - " +
                "REPLACE - Replace a character at a specified index\n17 - INDEX OF - Returns the index of the first " +
                "occurrence of a specified character\n18 - LAST INDEX OF - Returns the index of the last occurrence " +
                "of a specified character\n19 - REVERSE - Reverses the StringBuilder\n20 - SET CAPACITY - Sets a new " +
                "capacity for the StringBuilder\n21 - SUBSTRING - Returns a substring at a specified start and end " +
                "index\n22 - TO STRING - Returns the contents of the StringBuilder as a String\nX - Terminate\n" +
                "Enter choice: ");
    }

    /**
     * testDriver A test driver for interacting with a StringBuilder ADT object.
     * @param scn A Scanner object for user input.
     * @param sb A StringBuilder object.
     */
    public static void testDriver(Scanner scn, StringBuilder sb) {
        String choice = "";
        while(!choice.equalsIgnoreCase("X")) {
            menu();
            choice = scn.nextLine();
            if(choice.equals("1")) {
                System.out.print("Enter a character to append: ");
                char c = scn.nextLine().charAt(0);
                sb.append(c);
                System.out.println(c + " was appended.");
            } else if(choice.equals("2")) {
                System.out.print("Enter an integer to append: ");
                int i = scn.nextInt();
                scn.nextLine();
                sb.append(i);
                System.out.println(i + " was appended.");
            } else if(choice.equals("3")) {
                System.out.print("Enter a boolean to append: ");
                boolean b = scn.nextBoolean();
                scn.nextLine();
                sb.append(b);
                System.out.println(b + " was appended.");
            } else if(choice.equals("4")) {
                System.out.print("Enter a double to append: ");
                double d = scn.nextDouble();
                scn.nextLine();
                sb.append(d);
                System.out.println(d + " was appended.");
            } else if(choice.equals("5")) {
                System.out.print("Enter a float to append: ");
                float f = scn.nextFloat();
                scn.nextLine();
                sb.append(f);
                System.out.println(f + " was appended.");
            } else if(choice.equals("6")) {
                System.out.print("Enter a long to append: ");
                long l = scn.nextLong();
                scn.nextLine();
                sb.append(l);
                System.out.println(l + " was appended.");
            } else if(choice.equals("7")) {
                System.out.print("Enter a byte to append: ");
                byte b = scn.nextByte();
                scn.nextLine();
                sb.append(b);
                System.out.println(b + " was appended.");
            } else if(choice.equals("8")) {
                System.out.print("Enter a String to append: ");
                String s = scn.nextLine();
                sb.append(s);
                System.out.println(s + " was appended.");
            } else if(choice.equals("9")) {
                StringBuilder sb2 = new StringBuilder();
                System.out.print("Creating new StringBuilder...\nEnter a String for the second StringBuilder: ");
                String word = scn.nextLine();
                sb2.append(word);
                sb.append(sb2);
                System.out.println("The second StringBuilder was appended to the primary StringBuilder.");
            } else if(choice.equals("10")) {
                System.out.println("The current capacity is " + sb.capacity());
            } else if(choice.equals("11")) {
                System.out.print("Enter an index for searching: ");
                int index = scn.nextInt();
                scn.nextLine();
                System.out.println("The character at index " + index + ": " + sb.charAt(index));
            } else if(choice.equals("12")) {
                System.out.print("Enter a start index for a deleted substring: ");
                int start = scn.nextInt();
                scn.nextLine();
                System.out.print("Enter an end index for a deleted substring: ");
                int end = scn.nextInt();
                scn.nextLine();
                System.out.println("substring deleted: " + sb.deleteSubstring(start, end));
            } else if(choice.equals("13")) {
                System.out.print("Enter an index to delete that index's character: ");
                int index = scn.nextInt();
                scn.nextLine();
                System.out.println("Character at index " + index + " deleted: " + sb.deleteCharAt(index));
            } else if(choice.equals("14")) {
                System.out.print("Enter an index where your String will be inserted: ");
                int index = scn.nextInt();
                scn.nextLine();
                System.out.print("Enter the String to insert: ");
                String str = scn.nextLine();
                System.out.println(str + " inserted at index " + index + ": " + sb.insert(index, str));
            } else if(choice.equals("15")) {
                System.out.println("Total elements in StringBuilder: " + sb.length());
            } else if(choice.equals("16")) {
                System.out.print("Enter an index to specify a location for replacement: ");
                int index = scn.nextInt();
                scn.nextLine();
                System.out.print("Enter a character to replace the character at that index: ");
                char c = scn.nextLine().charAt(0);
                System.out.println("Character at index " + index + " replaced: " + sb.replace(index, c));
            } else if(choice.equals("17")) {
                System.out.print("Enter a character to find the first index containing that character: ");
                char c = scn.nextLine().charAt(0);
                int index = sb.indexOf(c);
                if(index == -1) {
                    System.out.println("The character " + c + " was not found.");
                } else {
                    System.out.println("The character " + c + " was first found at index " + index + ".");
                }
            } else if(choice.equals("18")) {
                System.out.print("Enter a character to find the last index containing that character: ");
                char c = scn.nextLine().charAt(0);
                int index = sb.lastIndexOf(c);
                if(index == -1) {
                    System.out.println("The character " + c + " was not found.");
                } else {
                    System.out.println("The character " + c + " was last found at index " + index + ".");
                }
            } else if(choice.equals("19")) {
                sb.reverse();
                System.out.println("The StringBuilder contents have been reversed.");
            } else if(choice.equals("20")) {
                System.out.print("Enter a new capacity for the StringBuilder: ");
                int cap = scn.nextInt();
                scn.nextLine();
                System.out.println("Capacity set to " + cap + ": " + sb.setCapacity(cap));
            } else if(choice.equals("21")) {
                System.out.print("Enter a start index for your substring: ");
                int start = scn.nextInt();
                scn.nextLine();
                System.out.print("Enter an end index for your substring: ");
                int end = scn.nextInt();
                scn.nextLine();
                System.out.println("The substring from index " + start + " to index " + end + ": " +
                        sb.substring(start, end));
            } else if(choice.equals("22")) {
                System.out.println("The contents of the StringBuilder: " + sb);
            } else if(choice.equalsIgnoreCase("X")) {
                break;
            } else {
                System.out.println("Invalid choice");
            }
        }
    }
}
