package CRUD_process;

import java.util.LinkedList;
import java.util.Scanner;

    public class StudentRecordManagement{

        LinkedList<Record> list; // Değişkenin oluşturulduğu yer.

        public StudentRecordManagement(){
            list = new LinkedList<>(); // Değişkenin gerçekten boş bir liste oluşturulduktan sonra kendisiyle bağlantısının kurulduğu yer.
        }

        public void add(Record record){
            if(!find(record.getIdNumber())){
                list.add(record);
            }
            else{
                System.out.println("Record already exists in the Record list");
            }
        }
        public boolean find(int idNumber){
            for(Record l: list){
                if(l.getIdNumber() == idNumber){
                    System.out.println(l);
                    return true;
                }
            }
            return false;
        }

        public void delete(int recIdNumber){
            Record recordDel = null;
            for(Record ll : list){
                if(ll.getIdNumber() == recIdNumber){
                recordDel = ll;
            }
        }
        if(recordDel == null){
            System.out.println("Invalid record ID!");
        }
        else{
            list.remove(recordDel);

            System.out.println("Succsessfully removed record from the list");
        }
    }
    public Record findRecord(int idNumber){
        for(Record l : list){
            if(l.getIdNumber() == idNumber){
                return l;
            }
        }
        return null;
    }
    public void update(int id, Scanner input){
        if(find(id)){
            Record rec = findRecord(id);

            System.out.println("What is the new student id number?");
            
            int idNumber = input.nextInt();

            System.out.println("What is the new student contact number?");
            int contactNumber = input.nextInt();
            input.nextLine();

            System.out.println("What is the new student name?");
            String name = input.nextLine();

            rec.setIdNumber(idNumber);
            rec.setName(name);
            rec.setContactNumber(contactNumber);
            System.out.println("Record updated successfully.");
        }
        else{
            System.out.println("Record not foun in the student list!");
        }
    }
    public void display(){
        if(list.isEmpty()){
            System.out.println("The list has no records\n");
        }
        for(Record record : list){
            System.out.println(record.toString());
        }
    }
}
