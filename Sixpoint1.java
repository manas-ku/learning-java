public class Sixpoint1{
    public static void main(String[] args){
        Employee employee1 = new Employee("Madhav", 123, "IT", "Vice President");
        Employee employee2 = new Employee("Manas", 234, "Software", "Senior Architect");
        System.out.println(employee1.getName() + "  " + employee1.getIdnumber()+ "  "+employee1.getDepartment() + "  "+employee1.getPosition());
        System.out.println(employee2.getName()+ "  "+employee2.getIdnumber()+ "  "+employee2.getDepartment() + "  "+ employee2.getPosition());
        
    }
}