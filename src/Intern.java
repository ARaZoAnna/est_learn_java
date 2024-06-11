public class Intern {

    String name;
    String department;
    int workingDays;

    public Intern(String name, String department, int workingDays){
        this.name = name;
        this.department = department;
        this.workingDays = workingDays;
    }

    public void coding(Programmer programmer, int hour){
        if(programmer.codingLevelUP(hour) == true){
      System.out.println("축하합니다! 개발자가 되셨습니다");
        }
        else {
      System.out.println("아직 인턴입니다. 조금만 더 노력합시다!");
        }
    }

    public void project(Programmer programmer, int number){
        if(programmer.projectLevelUp(number) == true){
            System.out.println("축하합니다! 개발자가 되셨습니다");
        }
        else {
            System.out.println("아직 인턴입니다. 조금만 더 노력합시다!");
        }
    }



}
