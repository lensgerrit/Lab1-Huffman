/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gerrit_Lensink
 */
import java.util.*;
public class Huffman {
    String input; //takes user input form keyboard
    int maxSize = 28; //max size of the array- letters + [ + \
    String inputUpperCase; //String from user input with upper case values
    int freqTable[]; //array to hold characters and frequencies- use ascii code for index
    PriorityQ theQ; //queue to hold trees and prioritize by node frequency
    Tree huffTree;
    String encode; //take input and store 1s and 0s in this string
    String decode; //take 1s and 0s and store as text in this string
    String codeTable[]; //holds each binary huffman code
    int sizeCount;

    Huffman(String str) 
    {
        freqTable = new int[maxSize]; 
        input = str;
        for(int i = 0; i < maxSize; i++)
        {
            freqTable[i] = 0;
            makeFreqTable();
            queueTree();
            makeHuffmanTree(); //huffTree Variable will be initialized here
        }
    }

    void displayTree() 
    {
        huffTree.displayTree();
    }

    void code() 
    {
        
    }

    void decode() 
    {
        
    }
    
    void makeFreqTable()
    {
        input=input.toUpperCase(); 
        String space;
        String enter;
        space = input.replace(' ', '[');
        enter = space.replace('\n', '\\');
        int len=input.length();
        System.out.println("Frequency table for: " + enter);
        for(char ch='A';ch<=((char) (93)); ch++)
        {
            sizeCount = 0;
            
            for(int i=0; i<len; i++)
            {
                if(ch==enter.charAt(i))
                {
                    freqTable[(int) ch - 65]++;
                    sizeCount++;
                }
            } 
        }
        System.out.println("A B C D E F G H I J K L M N O P Q R S T U V W X Y Z [ \\ ");
        for(int j = 0; j < freqTable.length; j++)
        {
            System.out.print(freqTable[j] + " ");
        }
    }
    //hello world!
    void queueTree()
    {
        //insert array into priorityQ
       theQ = new PriorityQ(28);
       
       for(int i = 0; i < freqTable.length; i++)
       {
          Tree temp = new Tree();
          temp.insert(freqTable[i], i);
          theQ.insert(temp);
       }
        
    }
    
    void makeHuffmanTree()
    {
        while(theQ.getNItems() > 1)        
        {
            Tree a = theQ.remove();
            Tree b = theQ.remove();
            Tree n = new Tree(); // char = +, add frequency
            n.root.iData = a.root.iData + b.root.iData;
            n.root.dData = '+';
            n.leftChild = a;
            n.rightChild = b;
            theQ.insert(n);
        }
        
        huffTree = theQ.remove(); //if we remove the tree form the Q, it will be the only tree and our huff tree
    }
    
    void makeCodeTable()
    {
        
    }   
}
