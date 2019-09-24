/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.datastructurewithjava;
import java.util.*;

/**
 *
 * @author kshitij
 */

class Node{
    
        int data = 0;
        Node next = null;
        
    
}
public class MyLinkedList {
    
    Node head = null;
    
    
    void insert(Node node1, int value){
        node1.data = value;
        if (head == null){
            head = node1;
            
        }
        else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
                
            }
            temp.next = node1;
        }
        
        
    }
    void deleteList(int value){
        Node temp1 = head;
        Node prev = null;
        while (temp1.data != value){
         prev = temp1;   
         temp1 = temp1.next;
         
        }
        prev.next = temp1.next;
        
        
    }
    int getLength(){
        Node temp = head;
        int count = 0;
        while(temp.next != null){
            temp = temp.next;
            count = count + 1;
        }
        
        return count;
    }
    int middleElement(){
        Node temp = head;
        int i=0;
        int length = getLength();
        System.out.println(length);
        while( i <= length/2){
            temp = temp.next;
            i = i + 1;
        
    }
        return temp.data;
    }
    void insertionAtPosition(Node n, int i){
        Node temp = head, prev = temp;
        int count = 0;
        while(count != i ){
            
            prev = temp;
            temp = temp.next;
            
        }
        prev.next = n;
        n.next = temp;
        
    }
    void reverseList(){
        Node prev = null,temp = head,next = temp;
        int flag = 0;
        while(true){
            if(next == null){
                head = temp;
                break;
            }
            else{
                if (flag == 0){
                    next = temp.next;
                    temp.next = null;
                    flag = 1;
                }
                else{
                    prev = temp;
                    temp = next;
                    next = temp.next;
                    temp.next = prev;
                }
            }
        }
        
    }
    
    void printList(){
        Node temp = head;
        while(true){
            if (temp.next == null){
                System.out.println(temp.data);
                break;
            }
            else{
            System.out.println(temp.data);
            temp = temp.next;}
        }
    }
    
    public static void main(String args[]){        
        MyLinkedList mll = new MyLinkedList();
        Scanner in = new Scanner(System.in);  
        char Flag = 'y';
        while (Flag == 'y'){
            System.out.println("1 for insertion"
                    + "\n2 for print"
                    + "\n3 for deletion"
                    + "\n4 for getting the length of list"
                    + "\n5 for finding the middle element"
                    + "\n6 for inserting the value at certain position"
                    + "\n7 for reversing the list");
            Node n = new Node(); 
            int choice = in.nextInt();    
            switch(choice){
                case 1:
                    
                    System.out.println("Enter the value for insertion");
                    int value = in.nextInt();
                    mll.insert(n, value);
                    break;
                case 2:
                    mll.printList();
                    break;
                case 3:
                    System.out.println("enter the value u want to delete");
                    int deleteData = in.nextInt();
                    mll.deleteList(deleteData);
                    break;
                case 4:
                    System.out.println("the length of the list is "+ mll.getLength());
                    break;
                case 5:
                    System.out.println("the middle element in the list is "+mll.middleElement());
                    break;
                case 6:
                    
                    System.out.println("enter the position for insertion");
                    int index = in.nextInt();
                    mll.insertionAtPosition(n, index);
                    break;
                case 7:
                    mll.reverseList();
                    break;
                

                    
               
                default:
                        System.out.println("Invalid case");
            }
       
        
        
      
        }
    }
    
}
