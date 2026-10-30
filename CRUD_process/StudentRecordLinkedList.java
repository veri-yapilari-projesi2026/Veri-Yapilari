package CRUD_process;

import java.util.Scanner;

public class StudentRecordLinkedList {
    public static void main(String[] args) {
        StudentRecordManagement hr = new StudentRecordManagement();

        Record record = new Record();

        record.setIdNumber(6862);
        record.setContactNumber(911);
        record.setName("Ankit");

        hr.add(record);

        Scanner input = new Scanner(System.in);
        
        int option = 0;

        do {
            menu();
            option = input.nextInt();

            switch(option){
                case 1:
                    System.out.println("What is the student id number?");
                    int idNumber = input.nextInt();

                    System.out.println("What is the student contact number?");

                    int contactNumber = input.nextInt();
                    input.nextLine();

                    System.out.println("What is the student name?");

                    String name = input.nextLine();

                    record = new Record(name, idNumber, contactNumber);

                    hr.add(record);
                    System.out.println(record.toString());

                    break;

                case 2:
                    System.out.println("What is the student id number?");
                    int rId = input.nextInt();

                    hr.delete(rId);

                    break;
                
                case 3:
                    System.out.println("What is the student id number?");

                    int rIdNo = input.nextInt();
                    hr.update(rIdNo, input);

                    break;

                case 4:
                    System.out.println("What is the student id?");
                    int bookId = input.nextInt();

                    if(!hr.find(bookId)){
                        System.out.println("Student id does not exist\n");
                    }
                    
                    break;
                
                case 5:
                    hr.display();
                    break;

                // case 6
                case 9:
                    System.out.println("\n Thank you for using the program. Goodbye! \n");
                    System.exit(0);

                    break;
                
                default:
                    System.out.println("\n Invalid input \n");
                    break;
            }
        }

        while (option != 9);
    }
    public static void menu(){
        System.out.println("MENU");
        System.out.println("1: Add Student");
        System.out.println("2: Delete Student");
        System.out.println("3: Update Student");
        System.out.println("4: Search Student");
        System.out.println("5: Display Student");
        System.out.println("9: Exit program");
        System.out.println("Enter your selection: ");
    }
}
