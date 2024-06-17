public class ProfileService {
    //인터페이스 객체 생성
    ProfileRepository repository;

    public void saveProfile(){
        //DBRepository로 구현할지
        repository = new ProfileDBRepository();
        //MemoryRepository로 구현할지
        //repository = new ProfileMemoryRepository();
        repository.save();
    }
}
