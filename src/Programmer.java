public class Programmer {

    int codingLevel;
    int projectLevel;
    Boolean isProgrammer;

    public Programmer(int codingLevel, int projectLevel){
        this.codingLevel = codingLevel;
        this.projectLevel = projectLevel;
        isProgrammer = false;
    }

    public Boolean codingLevelUP(int hour){
        codingLevel += hour;
        if (codingLevel <= 100){
      System.out.println("프로그래머가 되기 위해 코드 연습에 " + (100-codingLevel) + "시간을 더 투자하세요");
        }
        if (projectLevel <= 3){
      System.out.println("프로그래머가 되기 위해 프로젝트를 " + (3-projectLevel) + "개 더 하세요");
        }
        if(codingLevel > 100 && projectLevel >3){
            isProgrammer = true;
        }
        return isProgrammer;
    }

    public Boolean projectLevelUp(int number){
        projectLevel += number;
        if (codingLevel <= 100){
            System.out.println("프로그래머가 되기 위해 코드 연습에 " + (100-codingLevel) + "시간을 더 투자하세요");
        }
        if (projectLevel <= 3){
            System.out.println("프로그래머가 되기 위해 프로젝트를 " + (3-projectLevel) + "개 더 하세요");
        }
        if(projectLevel > 3 && codingLevel > 100){
            isProgrammer = true;
        }
        return isProgrammer;
    }
}
