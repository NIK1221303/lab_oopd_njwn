public class Lab03_Q3 {
    public static void main(String[] args) {
        
        Person person1 = new Person("Ali");
        System.out.println(person1);
        Person person2 = new Person("Siti");
        System.out.println(person2);
        person1.setSpouse(person2);
        System.out.println(person1);
        System.out.println(person2);
        person1.setName("Abu");
        System.out.println(person1);
        System.out.println(person2);
    }
}
class Person {
    private String name;
    private Person spouse;

    Person(String name){
        this.name=name;
    }
    public void setName(String name){
        String oldname=this.name;
        this.name=name;
        System.err.println("Change "+oldname+"'s name to "+this.name+"." );
    }
    public void setSpouse(Person spouse){
        this.spouse=spouse;
        spouse.spouse=this;
        System.err.println(this.name +" and "+ spouse.name +" get married.");
        
    }
    public String toString(){

        if(spouse==null)
        {
            return "Name = "+name+","+" spouse = none";
        }
        else
        {
            return "Name = "+name+","+" spouse = "+spouse.name;
        }
       
    }
}