# StringBuilderADT
Summary

A StringBuilder ADT supporting 'building' an ordering of character type variables for String outputs, thereby creating a level of mutability for an otherwise immutable String object.

Design

The StringBuilder uses an internal character array for storage of its elements. The overloaded append method allows for appending character representations of various data types: character, integer, double, float, long, String, boolean, byte, and other StringBuilder objects. In the case of numbers, decimal points and negatives are processed and added to the StringBuilder if present.

Automatic resizing occurs when characters added to the StringBuilder's internal character array reach a threshold capacity of 75%. A new internal array is declared with increased capacity, and the contents for the original array are written to the new array.

Deletions and insertions support automatic changes in element ordering, such as shifting elements left to replace a recently deleted character or shifting right to make space for an insertion at a particular index.

Various methods are implemented such as reversing the contents of the StringBuilder, determining first and last indices of a particular character, replacing characters at a particular index, outputting a String of all elements or a substring of elements at specified indices.
