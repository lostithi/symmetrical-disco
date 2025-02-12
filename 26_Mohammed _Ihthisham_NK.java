/*Create a class Person with attributes Id, name, designation, basicSalary, hra and ita. Write getters,setters and parameterized constructors in the above mentioned attribute sequence as required.
Create class Solution with main method:
Implement two static methodsfindMaxPF -This method will take an array of Person objects and returns the highest PF among the objects.PF should be 12% of basic salaryfindAveragePF -This method will take an array of Person objects and returns the average PF among the objects.PF should be 12% of basic salary
*/
class Person{
    Integer PId;        
    String name;
    String Designation;
    Long basicSalary;
    Integer hra;
    Integer ita;

    Person(Integer id,String n,String des,Long bsal,Integer h,Integer i){
        PId=id;
        name=n;
        Designation=des;
        basicSalary=bsal;
        hra=h;
        ita=i;
    }
    public Integer getPId(){
        return PId;
    }
    public String getName(){
        return name;
    }
    public String getDesignation(){
        return Designation;
    }
    public Long getBasicSalary(){
        return basicSalary;
    }
    public Integer getHra(){
        return hra;
    }
    public Integer getIta(){
        return ita;
    }
    public void setPId(Integer id){
        PId=id;
    }
    public void setName(String n){
        name=n;
    }
    public void setDesignation(String des){
        Designation=des;
    }
    public void setBasicSalary(Long bsal){
        basicSalary=bsal;
    }
    public void setHra(Integer h){
        hra=h;
    }
    public void setIta(Integer i){
        ita=i;
    }
}   //end of class Person
public class solution{
    public static void main(String[] args){
        Person p=new Person[3];
        p[0]=new Person(1,"Ashwin","Manager",10000,100,100);
        p[1]=new Person(2,"Basil","Manager",20000,200,200);
        p[2]=new Person(3,"Cinta","Manager",30000,300,300);
        System.out.println("Max PF is "+findMaxPF(p));
        System.out.println("Average PF is "+findAveragePF(p));
    }
    public static double findMaxPF(Person p){
        double max=0;
        for(int i=0;i<p.length;i++){
            if(p[i].getBasicSalary()*0.12>max){
                max=p[i].getBasicSalary()*0.12;
            }
        }
        return max;
    }
    public static double findAveragePF(Person[] p){
        double sum=0;
        for(int i=0;i<p.length;i++){
            sum+=p[i].getBasicSalary()*0.12;
        }
        return sum/p.length;
    }
}

