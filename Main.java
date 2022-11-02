/*
 *  Created on: 21.10.2022
 *  Author:     Tim Fürstenau
 *  Task:       PROG_Kap3_Uebung1
 */

/**
 * This program shows every possible type conversion of primitive data types in Java.
 * Both extending and restricting transformation.
 */
public class Main
{
    //Start of the program - main method
    public static void main(String[] args)
    {
        /*Example for extending transformations
        * byte -> short -> int -> long -> float -> double
        */
        byte    newByte     =  10;
        short   newShort    = newByte;   //implicit conversion
        int     newInt      = newShort;  //implicit conversion
        long    newLong     = newInt;    //implicit conversion
        float   newFloat    = newLong;   //implicit conversion
        double  newDouble   = newFloat;  //implicit conversion

        /* System output of the transformed data types with implicit conversion */
        System.out.println("First example of extending transformation of Data Types");
        System.out.println("Byte Value: " + newByte);
        System.out.println("Short Value: " + newShort);
        System.out.println("Integer Value: " + newInt);
        System.out.println("Long Value: " + newLong);
        System.out.println("Float Value: " + newFloat);
        System.out.println("Double Value: " + newDouble);

        /* Another example for extending transformations
        * char -> int -> long -> float -> double
        */
        char    newChar    = 'o';
        int     newInt2    = newChar;    //implicit conversion
        long    newLong2   = newInt2;    //implicit conversion
        float   newFloat2  = newLong2;   //implicit conversion
        double  newDouble2 = newFloat2;  //implicit conversion

        /* parting line for better overview */
        System.out.println("________________________________________________________");

        /* Next System Output of the transformed data types with implicit coversion*/
        System.out.println("Second example of extending transformation of data types");
        System.out.println("Char Value: " + newChar);
        System.out.println("Integer Value: " + newInt2);
        System.out.println("Long Value: " + newLong2);
        System.out.println("Float Value: " + newFloat2);
        System.out.println("Double Value: " + newDouble2);

        /* Example for restricting transformations
         * double -> float -> long -> int -> short -> byte
         */
        double newDouble3   =          20.0;                 //implicit conversion
        float  newFloat3    =          (float) newDouble3;   //explicit conversion
        long   newLong3     =          (long)  newFloat3;    //explicit conversion
        int    newInt3      =          (int)   newLong3;     //explicit conversion
        short  newShort3    =          (short) newInt3;      //explicit conversion
        byte   newByte3     =          (byte)  newShort3;    //explicit conversion

        /* parting line for better overview */
        System.out.println("________________________________________________________");

        /* System Output of the transformed data types with explicit conversion */
        System.out.println("First example of restricting transformation of data types");
        System.out.println("Double Value: " + newDouble3);
        System.out.println("Float Value: " + newFloat3);
        System.out.println("Long Value: " + newLong3);
        System.out.println("Integer Value: " + newInt3);
        System.out.println("Short Value: " + newShort3);
        System.out.println("Byte Value: " + newByte3);


        double newDouble4   =          69.0;                 //implicit conversion
        float  newFloat4    =          (float) newDouble4;   //explicit conversion
        long   newLong4     =          (long)  newFloat4;    //explicit conversion
        int    newInt4      =          (int)   newLong4;     //explicit conversion
        char   newChar4     =          (char)  newInt4;      //explicit conversion

        /* parting line for better overview */
        System.out.println("________________________________________________________");

        /* System Output of the transformed data types with explicit conversion */
        System.out.println("Second example of restricting transformation of data types");
        System.out.println("Double Value: " + newDouble3);
        System.out.println("Float Value: " + newFloat3);
        System.out.println("Long Value: " + newLong3);
        System.out.println("Integer Value: " + newInt3);
        System.out.println("Character Value: " + newShort3);

    }
}