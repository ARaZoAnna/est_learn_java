import java.util.Objects;

public class Member {
    private String name;
    private int age;

    public Member(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o){
        if(o instanceof Member){
            Member member = (Member) o;
            return member.name.equals(this.name) && member.age == this.age;
        }else{
            return false;
        }
    }
    /*
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Member member = (Member) object;
        return age == member.age && Objects.equals(name, member.name);
    }*/

    @Override
    public int hashCode() {
        int i = name.hashCode() + age;
        System.out.println(i);
        return i;
        //return Objects.hash(name, age);
    }
}
